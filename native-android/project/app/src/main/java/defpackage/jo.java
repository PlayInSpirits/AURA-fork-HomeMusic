package defpackage;

import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ jo(rg1 r1, w00 r2, hg4 r3, jy2 r4) {
        this.n = 3;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        int r1 = 0;
        j15 r4 = j15.a;
        Object r5 = this.q;
        Object r6 = this.p;
        Object r14 = this.o;
        switch(r0) {
            case 0: goto L112;
            case 1: goto L105;
            case 2: goto L84;
            case 3: goto L70;
            case 4: goto L57;
            case 5: goto L56;
            case 6: goto L47;
            case 7: goto L21;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        b0 r15 = (b0) r14;
        r15.removeOnAttachStateChangeListener((bc) r6);
        wr1.A(r15).a.remove((k65) r5);
        return r4;
    L6:
        mg1 r16 = (mg1) r14;
        lg4 r7 = (lg4) r6;
        wa3 r8 = (wa3) r5;
        if (r16 == null) goto L9;
        r7.a(r7.c(r16) - r7.t);
    L9:
        List r17 = gh0.d(r7, null, r7.t, null);
        d80 r2 = (d80) q40.D0(r17);
        if (r2 == null) goto L12;
        Integer r3 = r2.b;
    L13:
        List r9 = r8.c(r3);
        if (r3 == null) goto L20;
        if (r9.isEmpty() == true) goto L20;
        d80 r10 = (d80) q40.w0(r9);
        r9 = q40.G0(gb.O(new d80(r10.a, null, r3)), q40.u0(r9, 1));
    L20:
        return new c80(q40.G0(r17, r9), r8.g());
    L12:
        r3 = null;
        goto L13
    L21:
        f63 r11 = (f63) r6;
        fx3 r12 = (fx3) r5;
        b24 r13 = f63.j0;
        ((if1) r14).invoke(r13);
        boolean r18 = h12.c(r11.W, r13.v);
        if (r11.Z == r13.w) goto L24;
        r1 = 1;
    L24:
        ya4 r19 = r13.v.a(r13.x, r13.A, r13.z);
        r13.C = r19;
        boolean r20 = h12.c(r11.Y, r19.s());
        r12.n = !r20;
        if (r18 == false) goto L28;
        if (r1 != 0) goto L28;
        if (r20 == false) goto L28;
    L45:
        r11.a0 = true;
        return r4;
    L28:
        r11.W = r13.v;
        r11.Z = r13.w;
        ya4 r21 = r13.C;
        wv3 r22 = wv3.e;
        if (r21 == null) goto L32;
        wv3 r23 = r21.s();
        if (r23 == null) goto L32;
    L33:
        r11.Y = r23;
        ya4 r24 = r13.C;
        if (r24 == null) goto L38;
        wv3 r25 = r24.s();
        if (r25 == null) goto L38;
        k02 r26 = rr2.Q(r25);
        r22 = new wv3(r26.a, r26.b, r26.c, r26.d);
    L38:
        r11.X = r22;
        if (r11.a0 == false) goto L45;
        if (r1 == 0) goto L42;
    L44:
        r11.H.E();
        goto L45
    L42:
        if (r11.Z == false) goto L45;
        if (r18 == true) goto L45;
    L32:
        r23 = r22;
        goto L33
    L47:
        wf1 r110 = (wf1) r14;
        rp1 r27 = (rp1) r5;
        cf2 r28 = (cf2) ((jx3) r6).n;
        w03 r29 = r28.z;
        if (r29 != null) goto L50;
        long[] r30 = v54.a;
        r29 = new w03();
        r28.z = r29;
    L50:
        Object r31 = r29.g(r27);
        if (r31 != null) goto L53;
        r31 = new af2(r28);
        r29.l(r27, r31);
    L53:
        af2 r32 = (af2) r31;
        r32.n = false;
        r110.invoke(r32, r27);
        return r4;
    L57:
        fo1 r111 = (fo1) r14;
        String r33 = (String) r5;
        r111.f = (String) r6;
        r111.g = r33;
        TextInputEditText r34 = ((uc1) r111.c).z;
        if (r33 != null) goto L60;
        r33 = "";
    L60:
        String r35 = qm4.H0(r33, '@').toLowerCase(Locale.ROOT);
        r35.getClass();
        StringBuilder r36 = new StringBuilder();
        int r37 = r35.length();
    L61:
        if (r1 >= r37) goto L68;
        char r38 = r35.charAt(r1);
        if (Character.isLetterOrDigit(r38) == false) goto L65;
    L66:
        r36.append(r38);
    L67:
        r1 = r1 + 1;
        goto L61
    L65:
        if (qm4.n0("._-", r38) == false) goto L67;
    L68:
        r34.setText(qm4.J0(32, r36.toString()));
        r111.s(co1.p);
        return r4;
    L70:
        rg1 r112 = (rg1) r14;
        w00 r39 = (w00) r6;
        hg4 r40 = (hg4) r5;
        k80 r41 = r112.M;
        w00 r42 = r41.b;
        r41.b = r39;     // Catch: Throwable -> L81
        hg4 r43 = r112.G;     // Catch: Throwable -> L81
        int[] r44 = r112.o;     // Catch: Throwable -> L81
        i03 r45 = r112.v;     // Catch: Throwable -> L81
        r112.o = null;     // Catch: Throwable -> L81
        r112.v = null;     // Catch: Throwable -> L81
        r112.G = r40;     // Catch: Throwable -> L78
        boolean r46 = r41.e;     // Catch: Throwable -> L78
        r41.e = false;     // Catch: Throwable -> L75
        throw null;     // Catch: Throwable -> L75
    L75:
        th = move-exception;
        r41.e = r46;     // Catch: Throwable -> L78
        throw th;     // Catch: Throwable -> L78
    L78:
        th = move-exception;
        r112.G = r43;     // Catch: Throwable -> L81
        r112.o = r44;     // Catch: Throwable -> L81
        r112.v = r45;     // Catch: Throwable -> L81
        throw th;     // Catch: Throwable -> L81
    L81:
        th = move-exception;
        r41.b = r42;
        throw th;
    L84:
        gd0 r113 = (gd0) r14;
        b25 r47 = (b25) r6;
        fv r114 = (fv) r5;
        zg5 r115 = r113.G;
    L85:
        f13 r48 = (f13) r115.n;
        int r49 = r48.p;
        if (r49 == 0) goto L95;
        if (r49 == 0) goto L94;
        wv3 r50 = (wv3) ((cd0) r48.n[r49 - 1]).a.invoke();
        if (r50 != null) goto L91;
        gd0 r51 = r113;
        boolean r116 = true;
    L92:
        if (r116 == false) goto L97;
        f13 r117 = (f13) r115.n;
        ((cd0) r117.k(r117.p - 1)).b.resumeWith(r4);
        r113 = r51;
    L97:
        if (r51.H == false) goto L103;
        wv3 r52 = (wv3) r51.F.invoke();
        if (r52 == null) goto L103;
        if (gd0.s0(r51, r52, 0, 0, 3) != true) goto L103;
        r51.H = false;
    L103:
        r47.e = gd0.q0(r51, r114, 0);
        return r4;
    L91:
        r51 = r113;
        r116 = gd0.s0(r51, r50, 0, 0, 3);
        goto L92
    L94:
        kf2.m("MutableVector is empty.");
        return null;
    L95:
        r51 = r113;
        goto L97
    L105:
        cv r118 = (cv) r14;
        wv3 r53 = cv.q0(r118, (f63) r6, (fa) r5);
        if (r53 == null) goto L134;
        gd0 r54 = r118.B;
        if (n02.a(r54.I, -1) == false) goto L111;
        fz1.c("Expected BringIntoViewRequester to not be used before parents are placed.");
    L111:
        return r53.f(r54.u0(r53, r54.r0(), 0) ^ (-9223372034707292160L));
    L134:
        return null;
    L112:
        ((ko) r14).a();
        fl r119 = (fl) ((z40) r6).p;
        int r55 = ((hx3) r5).n;
    L113:
        int r56 = r119.get();
        if (((r56 >>> 27) & 15) != r55) goto L116;
        int r57 = r56 - 1;
    L118:
        if (r119.compareAndSet(r56, r57) == false) goto L113;
        return r4;
    L116:
        r57 = r56;
        goto L118
    L56:
        return new lc3((yf1) ((b13) r14).getValue(), (if1) ((b13) r6).getValue(), ((Number) ((gf1) r5).invoke()).intValue());
    }

    public /* synthetic */ jo(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
