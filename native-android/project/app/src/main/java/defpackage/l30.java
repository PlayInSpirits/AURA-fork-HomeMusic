package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l30 {
    public static final l30 c = new l30();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, k30 k30Var, q92 q92Var, Class cls) {
        q92 q92Var2 = (q92) map.get(k30Var);
        if (q92Var2 == null || q92Var == q92Var2) {
            if (q92Var2 == null) {
                map.put(k30Var, q92Var);
                return;
            }
            return;
        }
        String name = k30Var.b.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(q92Var2);
        String strValueOf2 = String.valueOf(q92Var);
        StringBuilder sbU = b11.u("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbU.append(strValueOf);
        sbU.append(", new value ");
        sbU.append(strValueOf2);
        throw new IllegalArgumentException(sbU.toString());
    }

    public final j30 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            j30 j30VarA = (j30) map2.get(superclass);
            if (j30VarA == null) {
                j30VarA = a(superclass, null);
            }
            map.putAll(j30VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            j30 j30VarA2 = (j30) map2.get(cls2);
            if (j30VarA2 == null) {
                j30VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : j30VarA2.b.entrySet()) {
                b(map, (k30) entry.getKey(), (q92) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            f93 f93Var = (f93) method.getAnnotation(f93.class);
            if (f93Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ba2.class.isAssignableFrom(parameterTypes[0])) {
                        kf2.n("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                q92 q92VarValue = f93Var.value();
                if (parameterTypes.length > 1) {
                    if (!q92.class.isAssignableFrom(parameterTypes[1])) {
                        kf2.n("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (q92VarValue != q92.ON_ANY) {
                        kf2.n("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    kf2.n("cannot have more than 2 params");
                    return null;
                }
                b(map, new k30(method, i), q92VarValue, cls);
                z = true;
            }
        }
        j30 j30Var = new j30(map);
        map2.put(cls, j30Var);
        this.b.put(cls, Boolean.valueOf(z));
        return j30Var;
    }
}
