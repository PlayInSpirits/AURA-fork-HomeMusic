package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.eddyizm.tempus.service.MediaService;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 {
    public static final Uri g = null;
    public final Context a;
    public final es2 b;
    public final Executor c;
    public final v9 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    static {
        g = Uri.parse("content://androidx.car.app.connection");
    }

    public w9(MediaService r2, es2 r3) {
        this.a = r2.getApplicationContext();
        this.b = r3;
        Executor r4 = uo.t();
        this.c = r4;
        this.d = new v9(0, this);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        r4.execute(new u9(this, 1));
    }

    public final void a() {
        AtomicBoolean r1 = this.e;
        boolean r2 = r1.get();
        boolean r3 = false;
        Cursor r4 = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);     // Catch: Exception -> L33
        if (r4 != null) goto L34;
        if (r4 == null) goto L27;
    L6:
        r4.close();     // Catch: Exception -> L33
        goto L27
    L34:
        int r0 = r4.getColumnIndex("CarConnectionState");     // Catch: Throwable -> L20
        if (r0 == (-1)) goto L6;
        if (r4.moveToNext() == false) goto L6;
        if (r4.getInt(r0) == 0) goto L17;
        boolean r5 = true;
    L18:
        r4.close();     // Catch: Exception -> L33
        r3 = r5;
        goto L27
    L17:
        r5 = false;
        goto L18
    L20:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L24
        goto L27
    L39:
        throw th;     // Catch: Exception -> L33
    L24:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L33
        throw th;     // Catch: Exception -> L33
    L27:
        r1.set(r3);
        if (r2 != r3) goto L30;
        return;
    L30:
        if (this.f.get() == true) goto L41;
        this.b.run();
        return;
    }
}
