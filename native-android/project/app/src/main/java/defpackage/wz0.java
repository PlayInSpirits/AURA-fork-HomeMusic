package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements Runnable {
    public final /* synthetic */ int n;

    public /* synthetic */ wz0(int r1) {
        this.n = r1;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        return;
    L13:
        Method r0 = ov4.b;     // Catch: Throwable -> L10
        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");     // Catch: Throwable -> L10
        if (tz0.c() == false) goto L8;
        tz0.a().d();     // Catch: Throwable -> L10
    L8:
        Trace.endSection();
        return;
    L10:
        th = move-exception;
        Method r1 = ov4.b;
        Trace.endSection();
        throw th;
    }
}
