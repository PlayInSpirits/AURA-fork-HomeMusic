package retrofit2;

import android.os.Build;
import defpackage.er1;
import defpackage.rg3;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
class Reflection {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Android24 extends Reflection {
        public Android24() {
        }

        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method r2, Class<?> r3, Object r4, @Nullable Object[] r5) {
            if (Build.VERSION.SDK_INT >= 26) goto L5;
            er1.l("Calling default methods on API 24 and 25 is not supported");
            return null;
        L5:
            return DefaultMethodSupport.invoke(r2, r3, r4, r5);
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method r1) {
            return r1.isDefault();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class Java8 extends Reflection {
        public Java8() {
        }

        @Override // retrofit2.Reflection
        public String describeMethodParameter(Method r3, int r4) {
            Parameter r0 = rg3.p(r3)[r4];
            if (rg3.o(r0) == false) goto L7;
            return "parameter '" + rg3.e(r0) + '\'';
        L7:
            return super.describeMethodParameter(r3, r4);
        }

        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method r1, Class<?> r2, Object r3, @Nullable Object[] r4) {
            return DefaultMethodSupport.invoke(r1, r2, r3, r4);
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method r1) {
            return r1.isDefault();
        }
    }

    public Reflection() {
    }

    public String describeMethodParameter(Method r1, int r2) {
        return "parameter #" + (r2 + 1);
    }

    @Nullable
    public Object invokeDefaultMethod(Method r1, Class<?> r2, Object r3, @Nullable Object[] r4) {
        throw new AssertionError();
    }

    public boolean isDefaultMethod(Method r1) {
        return false;
    }
}
