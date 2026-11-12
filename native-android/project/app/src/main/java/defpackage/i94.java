package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i94 {
    public final cx2 a;
    public final boolean b;
    public final c72 c;
    public final e94 d;
    public i94 e;
    public final int f;

    public i94(cx2 r1, boolean r2, c72 r3, e94 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.f = r3.o;
    }

    public static /* synthetic */ List j(int r3, i94 r4) {
        boolean r1 = false;
        if ((r3 & 1) == 0) goto L5;
        boolean r0 = !r4.b;
    L7:
        if ((r3 & 2) != 0) goto L11;
        r1 = true;
    L11:
        return r4.i(r0, r1);
    L5:
        r0 = false;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final wv3 a(f63 r10) {
        i94 r9 = l();
        if (r9 == null) goto L5;
        cx2 r0 = (cx2) r9.c.Q.g;
        f63 r4 = null;
        if ((r0.q & 8) == 0) goto L41;
    L8:
        if (r0 == null) goto L41;
        if ((r0.p & 8) == 0) goto L39;
        ?? r1 = r0;
        ?? r5 = 0;
    L12:
        if (r1 == 0) goto L39;
        if ((r1 instanceof g94) == true) goto L16;
        if ((r1.p & 8) == 0) goto L37;
        if ((r1 instanceof fo0) == false) goto L37;
        cx2 r6 = ((fo0) r1).C;
        int r7 = 0;
        r1 = r1;
        r5 = r5;
    L23:
        if (r6 == null) goto L35;
        if ((r6.p & 8) == 0) goto L34;
        r7 = r7 + 1;
        r5 = r5;
        if (r7 != 1) goto L29;
        r1 = r6;
        goto L34
    L29:
        if (r5 != 0) goto L31;
        r5 = new f13(new cx2[16]);
    L31:
        if (r1 == 0) goto L33;
        r5.b(r1);
        r1 = 0;
    L33:
        r5.b(r6);
    L34:
        r6 = r6.s;
        r1 = r1;
        r5 = r5;
        goto L23
    L35:
        if (r7 == 1) goto L12;
    L37:
        r1 = j51.c(r5);
        goto L12
    L16:
        if (((g94) r1).c() == false) goto L37;
    L42:
        g94 r2 = (g94) r1;
        if (r2 == null) goto L45;
        r4 = j51.M(r2, 8);
    L45:
        if (r4 != null) goto L49;
        return r9.a(r10);
    L49:
        return r4.C(r10, true);
    L39:
        if ((r0.q & 8) == 0) goto L41;
        r0 = r0.s;
    L41:
        r1 = 0;
        goto L42
    L5:
        return wv3.e;
    }

    public final i94 b(m24 r6, if1 r7) {
        e94 r0 = new e94();
        r0.p = false;
        r0.q = false;
        r7.invoke(r0);
        h94 r3 = new h94(r7);
        int r4 = this.f;
        if (r6 == null) goto L6;
        int r8 = 1000000000;
    L7:
        i94 r2 = new i94(r3, false, new c72(r4 + r8, true), r0);
        r2.e = this;
        return r2;
    L6:
        r8 = 2000000000;
        goto L7
    }

    public final void c(c72 r6, ArrayList r7) {
        f13 r8 = r6.x();
        Object[] r0 = r8.n;
        int r9 = r8.p;
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L13;
        c72 r2 = (c72) r0[r1];
        if (r2.G() == false) goto L12;
        if (r2.Z == true) goto L12;
        if (r2.Q.d(8) == false) goto L11;
        r7.add(hw.a(r2, this.b));
        goto L12
    L11:
        c(r2, r7);
    L12:
        r1 = r1 + 1;
        goto L3
    }

    public final f63 d() {
        if (o() == false) goto L10;
        i94 r1 = l();
        if (r1 != null) goto L7;
        return null;
    L7:
        return r1.d();
    L10:
        g94 r0 = f();
        if (r0 == null) goto L15;
        return j51.M(r0, 8);
    L15:
        return (iz1) this.c.Q.d;
    }

    public final void e(ArrayList r4, ArrayList r5) {
        int r0 = r4.size();
        r(r4, false);
        int r3 = r4.size();
    L3:
        if (r0 >= r3) goto L11;
        i94 r1 = (i94) r4.get(r0);
        if (r1.p() == false) goto L8;
        r5.add(r1);
    L10:
        r0 = r0 + 1;
        goto L3
    L8:
        if (r1.d.q == true) goto L10;
        r1.e(r4, r5);
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final g94 f() {
        boolean r0 = this.d.p;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        c72 r10 = this.c;
        if (r0 == false) goto L48;
        cx2 r11 = (cx2) r10.Q.g;
        if ((r11.q & 8) == 0) goto L84;
        ?? r1 = 0;
    L7:
        if (r11 == null) goto L47;
        if ((r11.p & 8) == 0) goto L45;
        cx2 r5 = r11;
        f13 r6 = null;
    L11:
        if (r5 == null) goto L45;
        if ((r5 instanceof g94) == false) goto L22;
        g94 r7 = (g94) r5;
        ?? r2 = r1;
        if (r7.c() == false) goto L21;
        r2 = r1;
        if (r7.d0() == true) goto L18;
        if (r1 != 0) goto L21;
        r2 = r7;
        goto L21
    L18:
        return r7;
    L21:
        boolean r8 = false;
        r1 = r2;
    L23:
        if (r8 == false) goto L43;
        if ((r5.p & 8) == 0) goto L43;
        if ((r5 instanceof fo0) == false) goto L43;
        cx2 r9 = ((fo0) r5).C;
        int r12 = 0;
    L29:
        if (r9 == null) goto L41;
        if ((r9.p & 8) == 0) goto L40;
        r12 = r12 + 1;
        if (r12 != 1) goto L35;
        r5 = r9;
        goto L40
    L35:
        if (r6 != null) goto L37;
        r6 = new f13(new cx2[16]);
    L37:
        if (r5 == null) goto L39;
        r6.b(r5);
        r5 = null;
    L39:
        r6.b(r9);
    L40:
        r9 = r9.s;
        goto L29
    L41:
        if (r12 == 1) goto L11;
    L43:
        r5 = j51.c(r6);
        goto L11
    L22:
        r8 = true;
        r1 = r1;
    L45:
        if ((r11.q & 8) == 0) goto L47;
        r11 = r11.s;
        r1 = r1;
    L47:
        r4 = r1;
    L84:
        return (g94) r4;
    L48:
        cx2 r13 = (cx2) r10.Q.g;
        if ((r13.q & 8) == 0) goto L84;
    L50:
        if (r13 == null) goto L84;
        if ((r13.p & 8) == 0) goto L81;
        r1 = r13;
        ?? r14 = 0;
    L54:
        if (r1 == 0) goto L81;
        if ((r1 instanceof g94) == true) goto L58;
        if ((r1.p & 8) == 0) goto L79;
        if ((r1 instanceof fo0) == false) goto L79;
        cx2 r15 = ((fo0) r1).C;
        int r16 = 0;
        r1 = r1;
        r14 = r14;
    L65:
        if (r15 == null) goto L77;
        if ((r15.p & 8) == 0) goto L76;
        r16 = r16 + 1;
        r14 = r14;
        if (r16 != 1) goto L71;
        r1 = r15;
        goto L76
    L71:
        if (r14 != 0) goto L73;
        r14 = new f13(new cx2[16]);
    L73:
        if (r1 == 0) goto L75;
        r14.b(r1);
        r1 = 0;
    L75:
        r14.b(r15);
    L76:
        r15 = r15.s;
        r1 = r1;
        r14 = r14;
        goto L65
    L77:
        if (r16 == 1) goto L54;
    L79:
        r1 = j51.c(r14);
        goto L54
    L58:
        if (((g94) r1).c() == false) goto L79;
    L81:
        if ((r13.q & 8) == 0) goto L84;
        r13 = r13.s;
        goto L50
    }

    public final wv3 g() {
        f63 r2 = d();
        if (r2 == null) goto L12;
        if (r2.A0().A == true) goto L8;
        r2 = null;
    L8:
        if (r2 == null) goto L12;
        return wr1.n(r2).C(r2, true);
    L12:
        return wv3.e;
    }

    public final wv3 h() {
        f63 r1 = d();
        if (r1 == null) goto L12;
        if (r1.A0().A == true) goto L8;
        r1 = null;
    L8:
        if (r1 == null) goto L12;
        return wr1.d(r1, true);
    L12:
        return wv3.e;
    }

    public final List i(boolean r2, boolean r3) {
        if (r2 == false) goto L4;
    L7:
        ArrayList r4 = new ArrayList();
        if (p() == false) goto L12;
        ArrayList r5 = new ArrayList();
        e(r4, r5);
        return r5;
    L12:
        return r(r4, r3);
    L4:
        if (this.d.q == false) goto L7;
        return u01.n;
    }

    public final e94 k() {
        boolean r0 = p();
        e94 r1 = this.d;
        if (r0 == false) goto L6;
        e94 r2 = r1.b();
        q(new ArrayList(), r2);
        return r2;
    L6:
        return r1;
    }

    public final i94 l() {
        i94 r0 = this.e;
        if (r0 == null) goto L5;
        return r0;
    L5:
        c72 r1 = this.c;
        boolean r5 = this.b;
        if (r5 == false) goto L15;
        c72 r2 = r1.t();
    L8:
        if (r2 == null) goto L15;
        e94 r3 = r2.v();
        if (r3 == null) goto L14;
        if (r3.p != true) goto L14;
    L16:
        if (r2 != null) goto L24;
        c72 r4 = r1.t();
    L18:
        if (r4 == null) goto L23;
        if (r4.Q.d(8) == true) goto L21;
        r4 = r4.t();
        goto L18
    L21:
        r2 = r4;
        goto L24
    L23:
        r2 = null;
    L24:
        if (r2 != null) goto L27;
        return null;
    L27:
        return hw.a(r2, r5);
    L14:
        r2 = r2.t();
    L15:
        r2 = null;
        goto L16
    }

    public final wv3 m() {
        eo0 r0 = f();
        if (r0 == null) goto L5;
        cx2 r1 = ((cx2) r0).n;
        Object r2 = this.d.n.g(d94.b);
        if (r2 != null) goto L10;
        r2 = null;
    L10:
        if (r2 == null) goto L12;
        boolean r3 = true;
    L14:
        return fu.s(r1, r3, true);
    L12:
        r3 = false;
        goto L14
    L5:
        return ((iz1) this.c.Q.d).X0();
    }

    public final e94 n() {
        return this.d;
    }

    public final boolean o() {
        if (this.e == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean p() {
        if (this.b == true) goto L5;
        return false;
    L5:
        if (this.d.p == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void q(ArrayList r4, e94 r5) {
        if (this.d.q == true) goto L10;
        int r0 = r4.size();
        r(r4, false);
        int r3 = r4.size();
    L5:
        if (r0 >= r3) goto L14;
        i94 r1 = (i94) r4.get(r0);
        if (r1.p() == true) goto L9;
        r5.e(r1.d);
        r1.q(r4, r5);
    L9:
        r0 = r0 + 1;
        goto L5
    L14:
        return;
    }

    public final List r(ArrayList r5, boolean r6) {
        if (o() == true) goto L5;
        c(this.c, r5);
        if (r6 == false) goto L33;
        e94 r7 = this.d;
        w03 r0 = r7.n;
        Object r1 = r0.g(n94.w);
        if (r1 != null) goto L11;
        r1 = null;
    L11:
        m24 r2 = (m24) r1;
        if (r2 != null) goto L14;
    L18:
        p94 r3 = n94.a;
        if (r0.c(r3) == false) goto L33;
        if (r5.isEmpty() == true) goto L33;
        if (r7.p == false) goto L33;
        Object r8 = r0.g(r3);
        if (r8 != null) goto L27;
        r8 = null;
    L27:
        List r9 = (List) r8;
        if (r9 == null) goto L30;
        String r10 = (String) q40.x0(r9);
    L31:
        if (r10 == null) goto L33;
        r5.add(0, b(null, new rs0(18, r10)));
        goto L33
    L30:
        r10 = null;
        goto L31
    L14:
        if (r7.p == false) goto L18;
        if (r5.isEmpty() == true) goto L18;
        r5.add(b(r2, new o54(r2)));
    L33:
        return r5;
    L5:
        return u01.n;
    }
}
