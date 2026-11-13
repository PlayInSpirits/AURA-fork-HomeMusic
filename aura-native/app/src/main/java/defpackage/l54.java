package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class l54 {
    public static final List a = gb.P(Application.class, b54.class);
    public static final List b = gb.O(b54.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List r0 = ti.r0(parameterTypes);
            if (list.equals(r0)) {
                return constructor;
            }
            if (list.size() == r0.size() && r0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final x65 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (x65) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            nz2.r("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            nz2.s("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
