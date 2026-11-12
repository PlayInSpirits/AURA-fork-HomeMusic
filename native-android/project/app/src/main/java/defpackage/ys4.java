package defpackage;

import android.os.Trace;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ys4 extends cx2 implements u62, rv0, g94 {
    public String B;
    public zs4 C;
    public ha1 D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public HashMap I;
    public rd3 J;
    public ws4 K;
    public xs4 L;

    @Override // defpackage.rv0
    public final void S(e72 r11) {
        if (this.A == false) goto L53;
        xs4 r0 = this.L;
        if (r0 != null) goto L8;
    L14:
        rd3 r1 = q0();
    L15:
        ic r2 = r1.j;
        if (r2 == null) goto L49;
        jz r3 = r11.n.o.g();
        boolean r12 = r1.k;
        if (r12 == false) goto L51;
        long r4 = r1.l;
        r3.e();
        r3.m(0.0f, 0.0f, (int) (r4 >> 32), (int) (r4 & 4294967295L));
    L51:
        zs4 r10 = this.C;     // Catch: Throwable -> L24
        ij4 r5 = r10.a;     // Catch: Throwable -> L24
        ij4 r13 = r10.a;     // Catch: Throwable -> L24
        sr4 r6 = r5.m;     // Catch: Throwable -> L24
        if (r6 != null) goto L23;
        r6 = sr4.b;     // Catch: Throwable -> L24
    L23:
        sr4 r7 = r6;
        xb4 r8 = r5.n;     // Catch: Throwable -> L24
        if (r8 != null) goto L29;
        r8 = xb4.d;     // Catch: Throwable -> L24
    L29:
        xb4 r9 = r8;
        q05 r14 = r5.o;     // Catch: Throwable -> L24
        if (r14 != null) goto L32;
        r14 = c71.d;     // Catch: Throwable -> L24
    L32:
        q05 r15 = r14;
        uo r16 = r5.a.f();     // Catch: Throwable -> L24
        if (r16 == null) goto L35;
        r2.e(r3, r16, r13.a.b(), r9, r7, r15);     // Catch: Throwable -> L24
    L43:
        if (r12 == false) goto L52;
        r3.k();
        return;
    L52:
        return;
    L35:
        long r17 = x40.g;     // Catch: Throwable -> L24
        if (r17 == 16) goto L39;
    L42:
        r2.d(r3, r17, r9, r7, r15);     // Catch: Throwable -> L24
        goto L43
    L39:
        if (r13.a.c() == 16) goto L41;
        r17 = r13.a.c();     // Catch: Throwable -> L24
        goto L42
    L41:
        r17 = x40.b;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        if (r12 == false) goto L54;
        r3.k();
        throw th;
    L54:
        throw th;
    L49:
        fz1.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.J + ", textSubstitution=" + this.L + ")");
        er1.a();
        return;
    L8:
        if (r0.c == true) goto L11;
        r0 = null;
    L11:
        if (r0 == null) goto L14;
        r1 = r0.d;
        if (r1 != null) goto L15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [sf1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ws4] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.g94
    public final void c0(q94 r7) {
        ws4 r0 = this.K;
        ?? r1 = r0;
        if (r0 != null) goto L5;
        final int r2 = 0;
        ?? r3 = new ws4(this, r2);
        this.K = r3;
        r1 = r3;
    L5:
        he r4 = new he(this.B);
        c42[] r5 = o94.a;
        r7.a(n94.z, gb.O(r4));
        xs4 r6 = this.L;
        if (r6 == null) goto L8;
        boolean r8 = r6.c;
        p94 r9 = n94.B;
        c42[] r10 = o94.a;
        c42 r11 = r10[17];
        Boolean r12 = Boolean.valueOf(r8);
        r9.getClass();
        r7.a(r9, r12);
        he r13 = new he(r6.b);
        p94 r14 = n94.A;
        c42 r15 = r10[16];
        r14.getClass();
        r7.a(r14, r13);
    L8:
        final int r16 = 1;
        if1 r17 = new ws4(this, r16);
        r7.a(d94.l, new w2(null, r17));
        final int r18 = 2;
        if1 r19 = new ws4(this, r18);
        r7.a(d94.m, new w2(null, r19));
        wc r20 = new wc(29, this);
        r7.a(d94.n, new w2(null, r20));
        r7.a(d94.a, new w2(null, r1));
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    public final rd3 q0() {
        zs4 r2 = this.C;
        if (this.J != null) goto L5;
        this.J = new rd3(this.B, r2, this.D, this.E, this.F, this.G, this.H);
    L5:
        rd3 r8 = this.J;
        r8.getClass();
        return r8;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r9, pi2 r10, long r11) {
        Trace.beginSection("TextStringSimpleNode::measure");
        xs4 r0 = this.L;     // Catch: Throwable -> L25
        if (r0 != null) goto L6;
    L12:
        rd3 r1 = q0();     // Catch: Throwable -> L25
    L13:
        r1.c(r9);     // Catch: Throwable -> L25
        boolean r12 = r1.a(r11, r9.getLayoutDirection());     // Catch: Throwable -> L25
        qd3 r13 = r1.n;     // Catch: Throwable -> L25
        if (r13 == null) goto L16;
        r13.a();     // Catch: Throwable -> L25
    L16:
        ic r14 = r1.j;     // Catch: Throwable -> L25
        r14.getClass();     // Catch: Throwable -> L25
        ks4 r15 = r14.d;     // Catch: Throwable -> L25
        long r2 = r1.l;     // Catch: Throwable -> L25
        if (r12 == false) goto L22;
        j51.M(this, 2).I0();     // Catch: Throwable -> L25
        HashMap r3 = this.I;     // Catch: Throwable -> L25
        if (r3 != null) goto L21;
        r3 = new HashMap(2);     // Catch: Throwable -> L25
        this.I = r3;     // Catch: Throwable -> L25
    L21:
        r3.put(j9.a, Integer.valueOf(Math.round(r15.c(0) + 0.0f)));     // Catch: Throwable -> L25
        r3.put(j9.b, Integer.valueOf(Math.round(r15.c(r15.f - 1) + 0.0f)));     // Catch: Throwable -> L25
    L22:
        int r4 = (int) (r2 >> 32);     // Catch: Throwable -> L25
        int r5 = (int) (4294967295L & r2);     // Catch: Throwable -> L25
        jg3 r16 = r10.r(zz1.m(r4, r4, r5, r5));     // Catch: Throwable -> L25
        HashMap r6 = this.I;     // Catch: Throwable -> L25
        r6.getClass();     // Catch: Throwable -> L25
        vi2 r8 = r9.T(r4, r5, r6, null, new la(r16, 6));     // Catch: Throwable -> L25
        Trace.endSection();
        return r8;
    L6:
        if (r0.c == true) goto L9;
        r0 = null;
    L9:
        if (r0 == null) goto L12;
        r1 = r0.d;     // Catch: Throwable -> L25
        if (r1 != null) goto L13;
    L25:
        th = move-exception;
        Trace.endSection();
        throw th;
    }
}
