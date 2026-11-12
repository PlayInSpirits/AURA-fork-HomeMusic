package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q22 extends qg3 {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public q22(Method r1, Method r2, Method r3, Class r4, Class r5) {
        this.c = r1;
        this.d = r2;
        this.e = r3;
        this.f = r4;
        this.g = r5;
    }

    @Override // defpackage.qg3
    public final void a(SSLSocket r3) {
        this.e.invoke(null, new Object[]{r3});     // Catch: InvocationTargetException -> L5 IllegalAccessException -> L7
        return;
    L7:
        e = move-exception;
        throw new AssertionError("failed to remove ALPN", e);
    L5:
        e = move-exception;
        throw new AssertionError("failed to remove ALPN", e);
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket r5, String r6, List r7) {
        r7.getClass();
        ArrayList r0 = new ArrayList();
        Iterator r8 = r7.iterator();
    L4:
        if (r8.hasNext() == false) goto L8;
        Object r1 = r8.next();
        if (((pr3) r1) == pr3.p) goto L4;
        r0.add(r1);
        goto L4
    L8:
        ArrayList r9 = new ArrayList(r40.k0(r0, 10));
        int r2 = r0.size();
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L21;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        r9.add(((pr3) r4).n);
        goto L9
    L21:
        Object r10 = Proxy.newProxyInstance(qg3.class.getClassLoader(), new Class[]{this.f, this.g}, new p22(r9));     // Catch: IllegalAccessException -> L13 InvocationTargetException -> L15
        this.c.invoke(null, new Object[]{r5, r10});     // Catch: IllegalAccessException -> L13 InvocationTargetException -> L15
        return;
    L13:
        e = move-exception;
        throw new AssertionError("failed to set ALPN", e);
    L15:
        e = move-exception;
        throw new AssertionError("failed to set ALPN", e);
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket r4) {
        InvocationHandler r3 = Proxy.getInvocationHandler(this.d.invoke(null, new Object[]{r4}));     // Catch: IllegalAccessException -> L9 InvocationTargetException -> L11
        r3.getClass();     // Catch: IllegalAccessException -> L9 InvocationTargetException -> L11
        p22 r5 = (p22) r3;     // Catch: IllegalAccessException -> L9 InvocationTargetException -> L11
        boolean r6 = r5.b;     // Catch: IllegalAccessException -> L9 InvocationTargetException -> L11
        if (r6 == false) goto L6;
    L13:
        if (r6 == false) goto L16;
        return null;
    L16:
        return r5.c;
    L6:
        if (r5.c != null) goto L13;
        qg3.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);     // Catch: IllegalAccessException -> L9 InvocationTargetException -> L11
        return null;
    L9:
        e = move-exception;
        throw new AssertionError("failed to get ALPN selected protocol", e);
    L11:
        e = move-exception;
        throw new AssertionError("failed to get ALPN selected protocol", e);
    }
}
