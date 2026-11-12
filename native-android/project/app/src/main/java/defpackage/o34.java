package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o34 {
    public final f6 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public o34(f6 r1, Proxy r2, InetSocketAddress r3) {
        r1.getClass();
        r3.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof o34) == false) goto L12;
        o34 r4 = (o34) r3;
        if (h12.c(r4.a, this.a) == true) goto L7;
        return false;
    L7:
        if (r4.b.equals(this.b) == true) goto L9;
        return false;
    L9:
        if (h12.c(r4.c, this.c) == false) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.a.hashCode() + 527) * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        return this.c.hashCode() + r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        f6 r1 = this.a;
        gr1 r2 = r1.h;
        gr1 r3 = r1.h;
        String r4 = r2.d;
        InetSocketAddress r5 = this.c;
        InetAddress r6 = r5.getAddress();
        if (r6 == null) goto L7;
        String r7 = r6.getHostAddress();
        if (r7 == null) goto L7;
        String r8 = ue5.b(r7);
    L9:
        if (qm4.n0(r4, ':') == false) goto L11;
        r0.append("[");
        r0.append(r4);
        r0.append("]");
    L13:
        if (r3.e == r5.getPort()) goto L15;
    L16:
        r0.append(":");
        r0.append(r3.e);
    L18:
        if (r4.equals(r8) == true) goto L31;
        if (this.b.equals(Proxy.NO_PROXY) == false) goto L22;
        r0.append(" at ");
    L23:
        if (r8 != null) goto L26;
        r0.append("<unresolved>");
    L29:
        r0.append(":");
        r0.append(r5.getPort());
        goto L31
    L26:
        if (qm4.n0(r8, ':') == false) goto L28;
        r0.append("[");
        r0.append(r8);
        r0.append("]");
        goto L29
    L28:
        r0.append(r8);
        goto L29
    L22:
        r0.append(" via proxy ");
    L31:
        return r0.toString();
    L15:
        if (r4.equals(r8) == false) goto L18;
    L11:
        r0.append(r4);
    L7:
        r8 = null;
        goto L9
    }
}
