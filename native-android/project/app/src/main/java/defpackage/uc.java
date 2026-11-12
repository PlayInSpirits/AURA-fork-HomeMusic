package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class uc implements uh4 {
    public static final pa e = null;
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    static {
        e = new pa(3);
    }

    public uc(Class r3) {
        this.a = r3;
        Method r0 = r3.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        r0.getClass();
        this.b = r0;
        r3.getMethod("setHostname", new Class[]{String.class});
        this.c = r3.getMethod("getAlpnSelectedProtocol", null);
        this.d = r3.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    @Override // defpackage.uh4
    public final boolean a() {
        boolean r0 = rc.d;
        return rc.d;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket r1) {
        return this.a.isInstance(r1);
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket r3) {
        if (this.a.isInstance(r3) == true) goto L20;
    L14:
        return null;
    L20:
        byte[] r2 = (byte[]) this.c.invoke(r3, null);     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L17
        if (r2 == null) goto L14;
        return new String(r2, w10.a);
    L17:
        e = move-exception;
        throw new AssertionError(e);
    L9:
        e = move-exception;
        Throwable r4 = e.getCause();
        if ((r4 instanceof NullPointerException) == false) goto L16;
        if (h12.c(((NullPointerException) r4).getMessage(), "ssl == null") == true) goto L14;
    L16:
        throw new AssertionError(e);
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket r2, String r3, List r4) {
        r4.getClass();
        if (this.a.isInstance(r2) == true) goto L13;
        return;
    L13:
        this.b.invoke(r2, new Object[]{Boolean.TRUE});     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L9
        Method r1 = this.d;     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L9
        qg3 r5 = qg3.a;     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L9
        r1.invoke(r2, new Object[]{au0.g(r4)});     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L9
        return;
    L9:
        e = move-exception;
        throw new AssertionError(e);
    L6:
        e = move-exception;
        throw new AssertionError(e);
    }
}
