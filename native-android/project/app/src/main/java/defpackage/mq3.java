package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mq3 {
    public static final HashMap e = null;
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    static {
        e = new HashMap();
    }

    public mq3(String r2, File r3, boolean r4) {
        this.a = r4;
        if (r3 == null) goto L5;
        File r5 = new File(r3, r2.concat(".lck"));
    L6:
        this.b = r5;
        HashMap r6 = e;
        monitor-enter(r6);
        Object r7 = r6.get(r2);     // Catch: Throwable -> L11
        if (r7 != null) goto L13;
        r7 = new ReentrantLock();     // Catch: Throwable -> L11
        r6.put(r2, r7);     // Catch: Throwable -> L11
    L13:
        Lock r8 = (Lock) r7;     // Catch: Throwable -> L11
        monitor-exit(r6);
        this.c = r8;
        return;
    L11:
        th = move-exception;
        throw th;
    L5:
        r5 = null;
        goto L6
    }

    public final void a(boolean r2) {
        this.c.lock();
        if (r2 == false) goto L18;
        File r3 = this.b;
        if (r3 == null) goto L14;
        File r0 = r3.getParentFile();     // Catch: IOException -> L9
        if (r0 == null) goto L11;
        r0.mkdirs();     // Catch: IOException -> L9
    L11:
        FileChannel r4 = new FileOutputStream(r3).getChannel();     // Catch: IOException -> L9
        r4.lock();     // Catch: IOException -> L9
        this.d = r4;     // Catch: IOException -> L9
        return;
    L14:
        throw new IOException("No lock directory was provided.");     // Catch: IOException -> L9
    L9:
        e = move-exception;
        this.d = null;
        Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
        return;
    }

    public final void b() {
        FileChannel r0 = this.d;     // Catch: IOException -> L7
        if (r0 == null) goto L5;
        r0.close();     // Catch: IOException -> L7
    L5:
        this.c.unlock();
    }
}
