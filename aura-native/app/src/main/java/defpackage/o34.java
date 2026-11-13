package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o34 {
    public final f6 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public o34(f6 f6Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        f6Var.getClass();
        inetSocketAddress.getClass();
        this.a = f6Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o34)) {
            return false;
        }
        o34 o34Var = (o34) obj;
        return h12.c(o34Var.a, this.a) && o34Var.b.equals(this.b) && h12.c(o34Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        f6 f6Var = this.a;
        gr1 gr1Var = f6Var.h;
        gr1 gr1Var2 = f6Var.h;
        String str = gr1Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : ue5.b(hostAddress);
        if (qm4.n0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (gr1Var2.e != inetSocketAddress.getPort() || str.equals(b)) {
            sb.append(":");
            sb.append(gr1Var2.e);
        }
        if (!str.equals(b)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b == null) {
                sb.append("<unresolved>");
            } else if (qm4.n0(b, ':')) {
                sb.append("[");
                sb.append(b);
                sb.append("]");
            } else {
                sb.append(b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
