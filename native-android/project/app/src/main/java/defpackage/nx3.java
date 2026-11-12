package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nx3 extends hw {
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public nx3() {
        this.j = Class.class.getMethod("isRecord", null);
        Method r0 = Class.class.getMethod("getRecordComponents", null);
        this.k = r0;
        Class<?> r1 = r0.getReturnType().getComponentType();
        this.l = r1.getMethod("getName", null);
        this.m = r1.getMethod("getType", null);
    }

    @Override // defpackage.hw
    public final Method h(Class r1, Field r2) {
        return r1.getMethod(r2.getName(), null);
    L5:
        e = move-exception;
        nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        return null;
    }

    @Override // defpackage.hw
    public final Constructor i(Class r7) {
        Object[] r1 = (Object[]) this.k.invoke(r7, null);     // Catch: ReflectiveOperationException -> L7
        Class<?>[] r2 = new Class[r1.length];     // Catch: ReflectiveOperationException -> L7
        int r3 = 0;
    L5:
        if (r3 >= r1.length) goto L9;
        r2[r3] = (Class) this.m.invoke(r1[r3], null);     // Catch: ReflectiveOperationException -> L7
        r3 = r3 + 1;     // Catch: ReflectiveOperationException -> L7
        goto L5
    L9:
        return r7.getDeclaredConstructor(r2);
    L7:
        e = move-exception;
        nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        return null;
    }

    @Override // defpackage.hw
    public final String[] m(Class r6) {
        Object[] r7 = (Object[]) this.k.invoke(r6, null);     // Catch: ReflectiveOperationException -> L8
        String[] r1 = new String[r7.length];     // Catch: ReflectiveOperationException -> L8
        int r2 = 0;
    L5:
        if (r2 >= r7.length) goto L10;
        r1[r2] = (String) this.l.invoke(r7[r2], null);     // Catch: ReflectiveOperationException -> L8
        r2 = r2 + 1;
        goto L5
    L10:
        return r1;
    L8:
        e = move-exception;
        nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        return null;
    }

    @Override // defpackage.hw
    public final boolean u(Class r2) {
        return ((Boolean) this.j.invoke(r2, null)).booleanValue();
    L4:
        e = move-exception;
        nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        return false;
    }
}
