package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vb extends d0 implements qe0 {
    private volatile Object _preHandler;

    public vb() {
        super(fz0.S);
        this._preHandler = this;
    }

    @Override // defpackage.qe0
    public final void n(ne0 r3, Throwable r4) {
        int r5 = Build.VERSION.SDK_INT;
        if (26 <= r5) goto L5;
        return;
    L5:
        if (r5 >= 28) goto L29;
        Object r6 = this._preHandler;
        Thread.UncaughtExceptionHandler r0 = null;
        if (r6 == this) goto L26;
        Method r7 = (Method) r6;
    L16:
        if (r7 == null) goto L18;
        Object r2 = r7.invoke(null, null);
    L20:
        if ((r2 instanceof Thread.UncaughtExceptionHandler) == false) goto L22;
        r0 = (Thread.UncaughtExceptionHandler) r2;
    L22:
        if (r0 == null) goto L30;
        r0.uncaughtException(Thread.currentThread(), r4);
        return;
    L30:
        return;
    L18:
        r2 = null;
        goto L20
    L26:
        r7 = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);     // Catch: Throwable -> L25
        if (Modifier.isPublic(r7.getModifiers()) == false) goto L14;
        if (Modifier.isStatic(r7.getModifiers()) == false) goto L14;
    L15:
        this._preHandler = r7;
    L14:
        r7 = null;
        goto L15
    }
}
