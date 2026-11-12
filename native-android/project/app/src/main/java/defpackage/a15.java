package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a15 implements InvocationHandler {
    public static final ly3 b;
    public final z05 a;

    static {
        ue1 ue1VarA = bx1.a();
        for (Method method : z05.class.getMethods()) {
            if (method.getDeclaringClass().equals(z05.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                ue1VarA.x(method.getName(), method);
            }
        }
        b = ue1VarA.d(false);
    }

    public a15(z05 z05Var) {
        this.a = z05Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Method method2 = (Method) b.get(name);
        if (method2 == null) {
            er1.l(name);
            return null;
        }
        try {
            return method2.invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
