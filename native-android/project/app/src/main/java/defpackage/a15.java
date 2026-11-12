package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a15 implements InvocationHandler {
    public static final ly3 b = null;
    public final z05 a;

    static {
        ue1 r0 = bx1.a();
        Method[] r2 = z05.class.getMethods();
        int r3 = r2.length;
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L10;
        Method r6 = r2[r5];
        if (r6.getDeclaringClass().equals(z05.class) == false) goto L9;
        r6.setAccessible(true);     // Catch: AccessControlException -> L12
    L8:
        r0.x(r6.getName(), r6);
    L9:
        r5 = r5 + 1;
        goto L3
    L10:
        b = r0.d(false);
    }

    public a15(z05 r1) {
        this.a = r1;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object r1, Method r2, Object[] r3) {
        String r4 = r2.getName();
        Method r5 = (Method) b.get(r4);
        if (r5 != null) goto L11;
        er1.l(r4);
        return null;
    L11:
        return r5.invoke(this.a, r3);
    L6:
        e = move-exception;
        throw e.getCause();
    }
}
