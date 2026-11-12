package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ma0 {
    public static final ma0 e = null;
    public static final ma0 f = null;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        v20 r0 = v20.r;
        v20 r1 = v20.s;
        v20 r2 = v20.t;
        v20 r3 = v20.l;
        v20 r4 = v20.n;
        v20 r5 = v20.m;
        v20 r6 = v20.o;
        v20 r7 = v20.q;
        v20 r8 = v20.p;
        List r9 = gb.P(new v20[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
        List r10 = gb.P(new v20[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, v20.j, v20.k, v20.h, v20.i, v20.f, v20.g, v20.e});
        la0 r11 = new la0();
        v20[] r12 = (v20[]) r9.toArray(new v20[0]);
        r11.b((v20[]) Arrays.copyOf(r12, r12.length));
        mu4 r13 = mu4.p;
        mu4 r14 = mu4.q;
        r11.c(new mu4[]{r13, r14});
        r11.o = true;
        r11.a();
        la0 r15 = new la0();
        v20[] r16 = (v20[]) r10.toArray(new v20[0]);
        r15.b((v20[]) Arrays.copyOf(r16, r16.length));
        r15.c(new mu4[]{r13, r14});
        r15.o = true;
        e = r15.a();
        la0 r17 = new la0();
        v20[] r18 = (v20[]) r10.toArray(new v20[0]);
        r17.b((v20[]) Arrays.copyOf(r18, r18.length));
        r17.c(new mu4[]{r13, r14, mu4.r, mu4.s});
        r17.o = true;
        r17.a();
        f = new ma0(false, false, null, null);
    }

    public ma0(boolean r1, boolean r2, String[] r3, String[] r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final void a(SSLSocket r10, boolean r11) {
        String[] r0 = r10.getEnabledCipherSuites();
        r0.getClass();
        String[] r1 = this.c;
        if (r1 == null) goto L5;
        r0 = xe5.k(r1, r0, v20.c);
    L5:
        String[] r2 = this.d;
        if (r2 == null) goto L8;
        String[] r3 = r10.getEnabledProtocols();
        r3.getClass();
        String[] r4 = xe5.k(r3, r2, w13.o);
    L9:
        String[] r5 = r10.getSupportedCipherSuites();
        r5.getClass();
        ca1 r6 = v20.c;
        byte[] r7 = xe5.a;
        int r8 = r5.length;
        int r9 = 0;
    L11:
        if (r9 >= r8) goto L16;
        if (r6.compare(r5[r9], "TLS_FALLBACK_SCSV") == 0) goto L17;
        r9 = r9 + 1;
    L17:
        if (r11 == false) goto L20;
        if (r9 == (-1)) goto L20;
        String r12 = r5[r9];
        r12.getClass();
        r0.getClass();
        r0 = (String[]) Arrays.copyOf(r0, r0.length + 1);
        r0[r0.length - 1] = r12;
    L20:
        String[] r13 = (String[]) Arrays.copyOf(r0, r0.length);
        boolean r14 = this.a;
        if (r14 == true) goto L23;
        kf2.n("no cipher suites for cleartext connections");
        return;
    L23:
        if (r13.length == 0) goto L39;
        String[] r15 = (String[]) Arrays.copyOf(r13, r13.length);
        r4.getClass();
        String[] r16 = (String[]) Arrays.copyOf(r4, r4.length);
        if (r14 == true) goto L27;
        kf2.n("no TLS versions for cleartext connections");
        return;
    L27:
        if (r16.length == 0) goto L35;
        ma0 r17 = new ma0(r14, this.b, r15, (String[]) Arrays.copyOf(r16, r16.length));
        if (r17.c() == null) goto L32;
        r10.setEnabledProtocols(r17.d);
    L32:
        if (r17.b() == null) goto L45;
        r10.setEnabledCipherSuites(r17.c);
        return;
    L45:
        return;
    L35:
        kf2.n("At least one TLS version is required");
        return;
    L39:
        kf2.n("At least one cipher suite is required");
        return;
    L16:
        r9 = -1;
        goto L17
    L8:
        r4 = r10.getEnabledProtocols();
        goto L9
    }

    public final ArrayList b() {
        String[] r5 = this.c;
        if (r5 == null) goto L8;
        ArrayList r0 = new ArrayList(r5.length);
        int r1 = r5.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        String r3 = r5[r2];
        r0.add(v20.b.u(r3));
        r2 = r2 + 1;
        goto L5
    L7:
        return r0;
    L8:
        return null;
    }

    public final ArrayList c() {
        String[] r5 = this.d;
        if (r5 == null) goto L8;
        ArrayList r0 = new ArrayList(r5.length);
        int r1 = r5.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        String r3 = r5[r2];
        mu4.o.getClass();
        r0.add(xi4.m(r3));
        r2 = r2 + 1;
        goto L5
    L7:
        return r0;
    L8:
        return null;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof ma0) == false) goto L23;
        if (r3 == this) goto L28;
        ma0 r4 = (ma0) r3;
        boolean r0 = r4.a;
        boolean r1 = this.a;
        if (r1 != r0) goto L24;
        if (r1 == true) goto L12;
        return true;
    L12:
        if (Arrays.equals(this.c, r4.c) == true) goto L15;
        return false;
    L15:
        if (Arrays.equals(this.d, r4.d) == true) goto L18;
        return false;
    L18:
        if (this.b == r4.b) goto L27;
        return false;
    L27:
        return true;
    L24:
        return false;
    L28:
        return true;
    L23:
        return false;
    }

    public final int hashCode() {
        if (this.a == false) goto L13;
        int r0 = 0;
        String[] r1 = this.c;
        if (r1 == null) goto L7;
        int r2 = Arrays.hashCode(r1);
    L8:
        int r3 = (527 + r2) * 31;
        String[] r4 = this.d;
        if (r4 == null) goto L12;
        r0 = Arrays.hashCode(r4);
    L12:
        return ((r3 + r0) * 31) + (!this.b ? 1 : 0);
    L7:
        r2 = 0;
        goto L8
    L13:
        return 17;
    }

    public final String toString() {
        if (this.a == true) goto L7;
        return "ConnectionSpec()";
    L7:
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
