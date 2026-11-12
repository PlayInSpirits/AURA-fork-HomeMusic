package retrofit2;

import defpackage.tn;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class DefaultMethodSupport {

    @Nullable
    private static Constructor<MethodHandles.Lookup> lookupConstructor;

    private DefaultMethodSupport() {
    }

    @Nullable
    public static Object invoke(Method r3, Class<?> r4, Object r5, @Nullable Object[] r6) {
        Constructor<MethodHandles.Lookup> r0 = lookupConstructor;
        if (r0 != null) goto L6;
        r0 = tn.j().getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
        r0.setAccessible(true);
        lookupConstructor = r0;
    L6:
        return tn.k(tn.l(tn.m(tn.n(r0.newInstance(new Object[]{r4, -1})), r3, r4), r5), r6);
    }
}
