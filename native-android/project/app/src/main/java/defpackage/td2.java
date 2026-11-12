package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class td2 {
    public static final qr3 a = null;

    static {
        Object r0 = null;
        ClassLoader r1 = j54.class.getClassLoader();     // Catch: Throwable -> L9
        r1.getClass();     // Catch: Throwable -> L9
        Method r2 = r1.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);     // Catch: Throwable -> L9
        Annotation[] r3 = r2.getAnnotations();     // Catch: Throwable -> L9
        r3.getClass();     // Catch: Throwable -> L9
        int r4 = r3.length;     // Catch: Throwable -> L9
        int r5 = 0;
    L4:
        if (r5 >= r4) goto L11;
        if ((r3[r5] instanceof zo0) == true) goto L7;
        r5 = r5 + 1;     // Catch: Throwable -> L9
    L7:
        Object r6 = null;
    L17:
        if ((r6 instanceof s14) == true) goto L20;
        r0 = r6;
    L20:
        qr3 r7 = (qr3) r0;
        if (r7 != null) goto L23;
        r7 = new wl4(new rd2(1));
    L23:
        a = r7;
        return;
    L11:
        Object r8 = r2.invoke(null, null);     // Catch: Throwable -> L9
        if ((r8 instanceof qr3) == false) goto L7;
        r6 = (qr3) r8;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r6 = new s14(th);
        goto L17
    }
}
