package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ma0 {
    public static final ma0 e;
    public static final ma0 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        v20 v20Var = v20.r;
        v20 v20Var2 = v20.s;
        v20 v20Var3 = v20.t;
        v20 v20Var4 = v20.l;
        v20 v20Var5 = v20.n;
        v20 v20Var6 = v20.m;
        v20 v20Var7 = v20.o;
        v20 v20Var8 = v20.q;
        v20 v20Var9 = v20.p;
        List P = gb.P(v20Var, v20Var2, v20Var3, v20Var4, v20Var5, v20Var6, v20Var7, v20Var8, v20Var9);
        List P2 = gb.P(v20Var, v20Var2, v20Var3, v20Var4, v20Var5, v20Var6, v20Var7, v20Var8, v20Var9, v20.j, v20.k, v20.h, v20.i, v20.f, v20.g, v20.e);
        la0 la0Var = new la0();
        v20[] v20VarArr = (v20[]) P.toArray(new v20[0]);
        la0Var.b((v20[]) Arrays.copyOf(v20VarArr, v20VarArr.length));
        mu4 mu4Var = mu4.p;
        mu4 mu4Var2 = mu4.q;
        la0Var.c(mu4Var, mu4Var2);
        la0Var.o = true;
        la0Var.a();
        la0 la0Var2 = new la0();
        v20[] v20VarArr2 = (v20[]) P2.toArray(new v20[0]);
        la0Var2.b((v20[]) Arrays.copyOf(v20VarArr2, v20VarArr2.length));
        la0Var2.c(mu4Var, mu4Var2);
        la0Var2.o = true;
        e = la0Var2.a();
        la0 la0Var3 = new la0();
        v20[] v20VarArr3 = (v20[]) P2.toArray(new v20[0]);
        la0Var3.b((v20[]) Arrays.copyOf(v20VarArr3, v20VarArr3.length));
        la0Var3.c(mu4Var, mu4Var2, mu4.r, mu4.s);
        la0Var3.o = true;
        la0Var3.a();
        f = new ma0(false, false, null, null);
    }

    public ma0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = xe5.k(strArr, enabledCipherSuites, v20.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = xe5.k(enabledProtocols2, strArr2, w13.o);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        ca1 ca1Var = v20.c;
        byte[] bArr = xe5.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (ca1Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            kf2.n("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            kf2.n("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        enabledProtocols.getClass();
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            kf2.n("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            kf2.n("At least one TLS version is required");
            return;
        }
        ma0 ma0Var = new ma0(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (ma0Var.c() != null) {
            sSLSocket.setEnabledProtocols(ma0Var.d);
        }
        if (ma0Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(ma0Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(v20.b.u(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            mu4.o.getClass();
            arrayList.add(xi4.m(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ma0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ma0 ma0Var = (ma0) obj;
        boolean z = ma0Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, ma0Var.c) && Arrays.equals(this.d, ma0Var.d) && this.b == ma0Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
