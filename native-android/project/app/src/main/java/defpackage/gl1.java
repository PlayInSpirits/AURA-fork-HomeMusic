package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gl1 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object r0 = new fl1(a(Looper.getMainLooper()));     // Catch: Throwable -> L4
    L7:
        if ((r0 instanceof s14) == false) goto L9;
        r0 = null;
    L9:
        fl1 r1 = (fl1) r0;
        return;
    L4:
        th = move-exception;
        r0 = new s14(th);
        goto L7
    }

    public static final Handler a(Looper r5) {
        if (Build.VERSION.SDK_INT < 28) goto L12;
        Object r6 = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{r5});
        r6.getClass();
        return (Handler) r6;
    L12:
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{r5, null, Boolean.TRUE});
    L11:
        return new Handler(r5);
    }
}
