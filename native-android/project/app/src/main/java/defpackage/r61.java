package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r61 extends dj1 {
    public static final rf2 k = null;
    public static final rf2 l = null;
    public static final rf2 m = null;
    public static int n = 1;

    static {
        pa r0 = new pa(6);
        k = new rf2("Fido.FIDO2_API", new u02(9), r0);
        pa r1 = new pa(6);
        l = new rf2("RestoreCredential.API", new u02(1), r1);
        pa r2 = new pa(6);
        m = new rf2("ClientTelemetry.API", new u02(4), r2);
    }

    public synchronized int c() {
        monitor-enter(this);
        int r0 = n;     // Catch: Throwable -> L8
        if (r0 != 1) goto L16;
        Context r1 = this.a;     // Catch: Throwable -> L8
        ej1 r2 = ej1.c;     // Catch: Throwable -> L8
        int r3 = r2.b(r1, 12451000);     // Catch: Throwable -> L8
        if (r3 != 0) goto L11;
        r0 = 4;
        n = 4;     // Catch: Throwable -> L8
        goto L16
    L11:
        if (r2.a(r3, r1, null) == null) goto L13;
    L15:
        r0 = 2;
        n = 2;     // Catch: Throwable -> L8
        goto L16
    L13:
        if (oy0.a(r1) == 0) goto L15;
        r0 = 3;
        n = 3;     // Catch: Throwable -> L8
    L16:
        monitor-exit(this);
        return r0;
    L8:
        th = move-exception;
        throw th;
    }
}
