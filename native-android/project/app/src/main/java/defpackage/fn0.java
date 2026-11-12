package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends nn0 implements Comparable {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final int r;
    public final boolean s;
    public final String t;
    public final jn0 u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public fn0(int r8, sv4 r9, int r10, jn0 r11, int r12, boolean r13, en0 r14, int r15) {
        super(r8, r9, r10);
        this.u = r11;
        boolean r16 = r11.z0;
        yw1 r17 = r11.v;
        yw1 r18 = r11.q;
        if (r16 == false) goto L5;
        int r19 = 24;
    L6:
        int r110 = 0;
        this.A = false;
        this.t = pn0.f(this.q.d);
        this.v = kq.n(r12, false);
        int r0 = 0;
    L7:
        int r2 = Integer.MAX_VALUE;
        if (r0 >= r18.size()) goto L13;
        int r1 = pn0.c(this.q, (String) r18.get(r0), false);
        if (r1 > 0) goto L14;
        r0 = r0 + 1;
    L14:
        this.x = r0;
        this.w = r1;
        int r111 = this.q.f;
        int r3 = r11.s;
        if (r111 == 0) goto L18;
        if (r111 != r3) goto L18;
        int r112 = Integer.MAX_VALUE;
    L19:
        this.y = r112;
        this.z = pn0.a(this.q, r11.r);
        tb1 r113 = this.q;
        int r4 = r113.f;
        if (r4 != 0) goto L22;
    L25:
        boolean r5 = true;
    L26:
        this.B = r5;
        if ((r113.e & 1) == 0) goto L29;
        boolean r6 = true;
    L30:
        this.E = r6;
        String r7 = r113.n;
        if (r7 != null) goto L34;
    L49:
        boolean r20 = false;
    L51:
        this.L = r20;
        int r21 = r113.F;
        this.F = r21;
        this.G = r113.G;
        int r22 = r113.j;
        this.H = r22;
        if (r22 != (-1)) goto L54;
    L55:
        if (r21 == (-1)) goto L59;
        if (r21 <= r11.t) goto L59;
    L61:
        boolean r114 = false;
    L62:
        this.s = r114;
        String[] r115 = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        int r116 = 0;
    L64:
        if (r116 >= r115.length) goto L66;
        r115[r116] = f35.R(r115[r116]);
        r116 = r116 + 1;
        goto L64
    L66:
        int r117 = 0;
    L68:
        if (r117 >= r115.length) goto L73;
        int r118 = pn0.c(this.q, r115[r117], false);
        if (r118 > 0) goto L74;
        r117 = r117 + 1;
    L74:
        this.C = r117;
        this.D = r118;
        int r119 = 0;
    L76:
        if (r119 >= r17.size()) goto L83;
        String r120 = this.q.n;
        if (r120 == null) goto L82;
        if (r120.equals(r17.get(r119)) == false) goto L82;
        r2 = r119;
    L82:
        r119 = r119 + 1;
    L83:
        this.I = r2;
        if ((r12 & 384) != 128) goto L86;
        boolean r23 = true;
    L87:
        this.J = r23;
        if ((r12 & 64) != 64) goto L90;
        boolean r24 = true;
    L91:
        this.K = r24;
        tb1 r25 = this.q;
        boolean r121 = this.s;
        jn0 r122 = this.u;
        boolean r123 = r122.B0;
        aw4 r26 = r122.w;
        if (kq.n(r12, r123) == false) goto L121;
        if (r121 == true) goto L99;
        if (r122.y0 == false) goto L121;
    L99:
        if (r26.a != 2) goto L104;
        if (pn0.h(r122, r12, r25) == false) goto L121;
    L104:
        if (kq.n(r12, false) == false) goto L120;
        if (r121 == false) goto L120;
        if (r25.j == (-1)) goto L120;
        if (r122.G == true) goto L120;
        if (r122.F == true) goto L120;
        if (r122.C0 == true) goto L116;
        if (r13 == true) goto L120;
    L116:
        if (r26.a == 2) goto L120;
        if ((r19 & r12) == 0) goto L120;
        r110 = 2;
    L120:
        r110 = 1;
    L121:
        this.r = r110;
        return;
    L90:
        r24 = false;
        goto L91
    L86:
        r23 = false;
        goto L87
    L73:
        r118 = 0;
        r117 = Integer.MAX_VALUE;
    L59:
        if (r14.apply(r113) == false) goto L61;
        r114 = true;
        goto L62
    L54:
        if (r22 > r11.u) goto L61;
    L34:
        switch(r7.hashCode()) {
            case -2123537834: goto L45;
            case 187078297: goto L41;
            case 1504698186: goto L37;
            default: goto L35;
        };
    L35:
        byte r27 = -1;
    L48:
        switch(r27) {
            case 0: goto L50;
            case 1: goto L50;
            case 2: goto L50;
            default: goto L49;
        };
    L50:
        r20 = true;
        goto L51
    L37:
        if (r7.equals("audio/iamf") == false) goto L132;
        r27 = 2;
        goto L48
    L132:
        r27 = -1;
        goto L48
    L41:
        if (r7.equals("audio/ac4") == false) goto L133;
        r27 = 1;
        goto L48
    L133:
        r27 = -1;
        goto L48
    L45:
        if (r7.equals("audio/eac3-joc") == false) goto L134;
        r27 = 0;
        goto L48
    L134:
        r27 = -1;
        goto L48
    L29:
        r6 = false;
        goto L30
    L22:
        if ((r4 & 1) != 0) goto L25;
        r5 = false;
    L18:
        r112 = Integer.bitCount(r111 & r3);
        goto L19
    L13:
        r1 = 0;
        r0 = Integer.MAX_VALUE;
        goto L14
    L5:
        r19 = 16;
        goto L6
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.r;
    }

    @Override // defpackage.nn0
    public final boolean b(nn0 r6) {
        fn0 r7 = (fn0) r6;
        tb1 r0 = r7.q;
        this.u.getClass();
        tb1 r1 = this.q;
        int r2 = r1.F;
        if (r2 != (-1)) goto L5;
        return false;
    L5:
        if (r2 == r0.F) goto L7;
        return false;
    L7:
        if (this.A == true) goto L12;
        String r3 = r1.n;
        if (r3 != null) goto L11;
        return false;
    L11:
        if (TextUtils.equals(r3, r0.n) == true) goto L12;
        return false;
    L12:
        int r4 = r1.G;
        if (r4 != (-1)) goto L15;
        return false;
    L15:
        if (r4 == r0.G) goto L17;
        return false;
    L17:
        if (this.J == r7.J) goto L19;
        return false;
    L19:
        if (this.K != r7.K) goto L30;
        return true;
    L30:
        return false;
    }

    public final int c(fn0 r8) {
        boolean r0 = this.v;
        boolean r1 = this.s;
        if (r1 == false) goto L6;
        if (r0 == false) goto L6;
        gb3 r2 = pn0.k;
    L7:
        boolean r3 = r8.v;
        int r4 = r8.H;
        v60 r5 = v60.a.c(r0, r3);
        Integer r6 = Integer.valueOf(this.x);
        Integer r7 = Integer.valueOf(r8.x);
        x13 r9 = x13.p;
        v60 r10 = r5.b(r6, r7, r9).a(this.w, r8.w).a(this.y, r8.y).b(Integer.valueOf(this.z), Integer.valueOf(r8.z), r9).c(this.E, r8.E).c(this.B, r8.B).b(Integer.valueOf(this.C), Integer.valueOf(r8.C), r9).a(this.D, r8.D).c(r1, r8.s).b(Integer.valueOf(this.I), Integer.valueOf(r8.I), r9);
        boolean r11 = this.u.F;
        int r12 = this.H;
        if (r11 == false) goto L10;
        r10 = r10.b(Integer.valueOf(r12), Integer.valueOf(r4), pn0.k.a());
    L10:
        v60 r13 = r10.c(this.J, r8.J).c(this.K, r8.K).c(this.L, r8.L).b(Integer.valueOf(this.F), Integer.valueOf(r8.F), r2).b(Integer.valueOf(this.G), Integer.valueOf(r8.G), r2);
        if (Objects.equals(this.t, r8.t) == false) goto L14;
        r13 = r13.b(Integer.valueOf(r12), Integer.valueOf(r4), r2);
    L14:
        return r13.e();
    L6:
        r2 = pn0.k.a();
        goto L7
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return c((fn0) r1);
    }
}
