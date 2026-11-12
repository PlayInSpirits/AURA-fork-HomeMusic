package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nx3 extends hw {
    public final Method j = Class.class.getMethod("isRecord", null);
    public final Method k;
    public final Method l;
    public final Method m;

    public nx3() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.k = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.l = componentType.getMethod("getName", null);
        this.m = componentType.getMethod("getType", null);
    }

    @Override // defpackage.hw
    public final Method h(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.hw
    public final Constructor i(Class cls) {
        try {
            Object[] objArr = (Object[]) this.k.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.m.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.hw
    public final String[] m(Class cls) {
        try {
            Object[] objArr = (Object[]) this.k.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.l.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.hw
    public final boolean u(Class cls) {
        try {
            return ((Boolean) this.j.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            nz2.s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
