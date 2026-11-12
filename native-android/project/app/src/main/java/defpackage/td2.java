package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class td2 {
    public static final qr3 a;

    static {
        Object s14Var;
        try {
            ClassLoader classLoader = j54.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof qr3) {
                        s14Var = (qr3) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof zo0)) {
                    i++;
                }
                s14Var = null;
                break;
            }
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        qr3 wl4Var = (qr3) (s14Var instanceof s14 ? null : s14Var);
        if (wl4Var == null) {
            wl4Var = new wl4(new rd2(1));
        }
        a = wl4Var;
    }
}
