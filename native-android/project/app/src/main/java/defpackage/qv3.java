package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qv3 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public Object p;
    public int q;
    public Object r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ qv3(Object r1, Object r2, Object r3, vd0 r4, int r5) {
        this.o = r5;
        this.s = r1;
        this.t = r2;
        this.u = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r10, vd0 r11) {
        int r0 = this.o;
        Object r1 = this.u;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        qv3 r2 = new qv3((hw4) this.s, (g74) this.t, (jx3) r1, r11, 2);
        r2.p = r10;
        return r2;
    L6:
        qv3 r9 = new qv3((gf1) r1, r11);
        r9.t = r10;
        return r9;
    L8:
        qv3 r3 = new qv3((tv3) this.s, (sv3) this.t, (ed) r1, r11, 0);
        r3.p = r10;
        return r3;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ((qv3) create((q81) r3, (vd0) r4)).invokeSuspend(r1);
        return xe0.n;
    L5:
        return ((qv3) create((e74) r3, (vd0) r4)).invokeSuspend(r1);
    L9:
        return ((qv3) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [rp] */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [y00] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, y00] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, y00] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r7v12, types: [pz1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, pz1] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, pz1] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:16:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ad -> B:42:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01c1 -> B:42:0x0194). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r20) {
        boolean r2 = false;
        int r3 = 1;
        vd0 r4 = null;
        switch(this.o) {
            case 0: goto L63;
            case 1: goto L22;
            default: goto L4;
        };
    L4:
        g74 r0 = (g74) this.t;
        jx3 r5 = (jx3) this.u;
        hw4 r6 = (hw4) this.s;
        xe0 r7 = xe0.n;
        int r8 = this.q;
        if (r8 == 0) goto L9;
        if (r8 != 1) goto L8;
        jx3 r9 = (jx3) this.r;
        e74 r10 = (e74) this.p;
        kb4.X(r20);
        e74 r11 = r10;
        jx3 r12 = r9;
        Object r13 = r20;
    L16:
        r12.n = r13;
        fw4 r14 = (fw4) r5.n;
        rf2 r15 = (rf2) r6.e;
        long r16 = r14.b;
        long r17 = r14.a;
        ((m45) r15.n).a(r16, Float.intBitsToFloat((int) (r17 >> 32)));
        ((m45) r15.o).a(r16, Float.intBitsToFloat((int) (r17 & 4294967295L)));
        fw4 r18 = hw4.G(r6.f);
        if (r18 == null) goto L19;
        rf2 r19 = (rf2) r6.e;
        long r110 = r18.b;
        long r111 = r18.a;
        ((m45) r19.n).a(r110, Float.intBitsToFloat((int) (r111 >> 32)));
        ((m45) r19.o).a(r110, Float.intBitsToFloat((int) (r111 & 4294967295L)));
        r5.n = ((fw4) r5.n).a(r18);
    L19:
        float r21 = r0.j(r0.f(((fw4) r5.n).a));
        g74 r22 = (g74) r6.b;
        r22.h(r22.f(r11.a(1, r22.i(r22.e(r21)))));
        e74 r23 = r11;
        r3 = 1;
        r4 = null;
    L11:
        if (((fw4) r5.n).c == true) goto L21;
        aw r24 = r6.f;
        this.p = r23;
        this.r = r5;
        this.q = r3;
        r13 = te5.j(new p(r24, r4, 15), this);
        if (r13 == r7) goto L194;
        r11 = r23;
        r12 = r5;
        goto L16
    L194:
        return r7;
    L21:
        return j15.a;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r20);
        e74 r25 = (e74) this.p;
        float r26 = r0.j(r0.f(((fw4) r5.n).a));
        g74 r27 = (g74) r6.b;
        r27.h(r27.f(r25.a(1, r27.i(r27.e(r26)))));
        r23 = r25;
        goto L11
    L22:
        gf1 r1 = (gf1) this.u;
        xe0 r28 = xe0.n;
        ?? r29 = this.q;
        if (r29 != 0) goto L25;
        kb4.X(r20);
        q81 r30 = (q81) this.t;
        ?? r31 = new pz1(22, r2);
        r31.o = new jf4();
        aw r32 = su3.a(1, 6, null);
        Object r33 = r31.H(r32, r1);     // Catch: Throwable -> L52
        this.t = r30;     // Catch: Throwable -> L52
        this.r = r31;     // Catch: Throwable -> L52
        this.s = r32;     // Catch: Throwable -> L52
        this.p = r33;     // Catch: Throwable -> L52
        this.q = 1;     // Catch: Throwable -> L52
        if (r30.b(r33, this) == r28) goto L50;
        ?? r34 = r32;
        Object r35 = r33;
        ?? r36 = r31;
    L42:
        this.t = r30;     // Catch: Throwable -> L31
        this.r = r36;     // Catch: Throwable -> L31
        this.s = r34;     // Catch: Throwable -> L31
        this.p = r35;     // Catch: Throwable -> L31
        this.q = 2;     // Catch: Throwable -> L31
        Object r37 = r34.h(this);     // Catch: Throwable -> L31
        r29 = r34;
        r31 = r36;
        if (r37 == r28) goto L50;
    L45:
        Object r38 = r31.H(r29, r1);     // Catch: Throwable -> L31
        r34 = r29;
        r36 = r31;
        if (h12.c(r38, r35) == true) goto L42;
        this.t = r30;     // Catch: Throwable -> L31
        this.r = r31;     // Catch: Throwable -> L31
        this.s = r29;     // Catch: Throwable -> L31
        this.p = r38;     // Catch: Throwable -> L31
        this.q = 3;     // Catch: Throwable -> L31
        if (r30.b(r38, this) == r28) goto L50;
        r35 = r38;
        r34 = r29;
        r36 = r31;
    L50:
        return r28;
    L52:
        th = th;
        r29 = r32;
    L54:
        ?? r39 = (rp) r31.o;
        if (r39 == 0) goto L57;
        r39.n(r29);
    L57:
        rp r40 = (rp) r31.o;
        if (r40 != null) goto L61;
        oo3.b("Called dispose on a manager that has been disposed of");
    L61:
        r40.h();
        r31.o = null;
        throw th;
    L25:
        if (r29 == 1) goto L28;
        if (r29 == 2) goto L34;
        if (r29 == 3) goto L28;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L34:
        r35 = this.p;
        y00 r41 = (y00) this.s;
        pz1 r42 = (pz1) this.r;
        r30 = (q81) this.t;
        kb4.X(r20);     // Catch: Throwable -> L31
        r29 = r41;
        r31 = r42;
    L28:
        r35 = this.p;
        y00 r43 = (y00) this.s;
        pz1 r44 = (pz1) this.r;
        r30 = (q81) this.t;
        kb4.X(r20);     // Catch: Throwable -> L31
        r34 = r43;
        r36 = r44;
    L31:
        th = th;
        goto L54
    L63:
        xe0 r45 = xe0.n;
        int r46 = this.q;
        if (r46 != 0) goto L66;
        kb4.X(r20);
        s22 r47 = gb.D(((we0) this.p).e());
        tv3 r48 = (tv3) this.s;
        Object r49 = r48.c;
        monitor-enter(r49);
        Throwable r50 = r48.e;     // Catch: Throwable -> L85
        if (r50 == null) goto L78;
        throw r50;     // Catch: Throwable -> L85
    L78:
        if (((ov3) r48.u.getValue()).compareTo(ov3.o) <= 0) goto L167;
        if (r48.d != null) goto L165;
        r48.d = r47;     // Catch: Throwable -> L85
        if (r48.y() == null) goto L87;
        l80.a("called outside of runRecomposeAndApplyChanges");     // Catch: Throwable -> L85
    L87:
        monitor-exit(r49);
        int r51 = 10;
        z r52 = new z(r51, (tv3) this.s);
        jh4.e(jh4.a);
        Object r53 = jh4.c;
        monitor-enter(r53);
        jh4.h = q40.F0(r52, jh4.h);     // Catch: Throwable -> L161
        monitor-exit(r53);
        ss2 r54 = new ss2(18, r52);
        nl4 r55 = tv3.z;
        hh3 r56 = ((tv3) this.s).y;
    L93:
        nl4 r57 = tv3.z;
        vf3 r58 = (vf3) r57.getValue();
        fz0 r59 = fz0.Z;
        nf3 r112 = r58.p;
        if (r112.containsKey(r56) == false) goto L97;
        vf3 r113 = r58;
    L100:
        if (r58 != r113) goto L102;
    L174:
        tv3 r60 = (tv3) this.s;     // Catch: Throwable -> L122
        Object r61 = r60.c;     // Catch: Throwable -> L122
        monitor-enter(r61);     // Catch: Throwable -> L122
        List r62 = r60.D();     // Catch: Throwable -> L143
        monitor-exit(r61);     // Catch: Throwable -> L122
        int r63 = r62.size();     // Catch: Throwable -> L122
        int r64 = 0;
    L108:
        if (r64 >= r63) goto L124;
        Object[] r65 = ((z80) r62.get(r64)).s.p;     // Catch: Throwable -> L122
        int r114 = r65.length;     // Catch: Throwable -> L122
        int r115 = 0;
    L110:
        if (r115 >= r114) goto L120;
        Object r116 = r65[r115];     // Catch: Throwable -> L122
        if ((r116 instanceof lv3) == false) goto L114;
        lv3 r117 = (lv3) r116;     // Catch: Throwable -> L122
    L115:
        if (r117 == null) goto L119;
        z80 r118 = r117.a;     // Catch: Throwable -> L122
        if (r118 == null) goto L119;
        r118.s(r117, null);     // Catch: Throwable -> L122
    L119:
        r115 = r115 + 1;     // Catch: Throwable -> L122
        goto L110
    L114:
        r117 = null;
        goto L115
    L120:
        r64 = r64 + 1;     // Catch: Throwable -> L122
        goto L108
    L124:
        r r66 = new r((sv3) this.t, (ed) this.u, null, r51);     // Catch: Throwable -> L122
        this.p = r47;     // Catch: Throwable -> L122
        this.r = r54;     // Catch: Throwable -> L122
        this.q = 1;     // Catch: Throwable -> L122
        if (te5.j(r66, this) == r45) goto L197;
        ss2 r67 = r54;
    L128:
        r67.d();
        tv3 r68 = (tv3) this.s;
        Object r69 = r68.c;
        monitor-enter(r69);
    L133:
        th = move-exception;
        throw th;
    L131:
        if (r68.d != r47) goto L136;
        r68.d = null;     // Catch: Throwable -> L133
    L136:
        if (r68.y() == null) goto L138;
        l80.a("called outside of runRecomposeAndApplyChanges");     // Catch: Throwable -> L133
    L138:
        monitor-exit(r69);
        nl4 r70 = tv3.z;
        hh3.f(((tv3) this.s).y);
        return j15.a;
    L197:
        return r45;
    L143:
        th = move-exception;
        throw th;     // Catch: Throwable -> L122
    L122:
        th = th;
        r67 = r54;
    L146:
        r67.d();
        tv3 r71 = (tv3) this.s;
        Object r72 = r71.c;
        monitor-enter(r72);
    L151:
        th = move-exception;
        throw th;
    L149:
        if (r71.d != r47) goto L154;
        r71.d = null;     // Catch: Throwable -> L151
    L154:
        if (r71.y() == null) goto L156;
        l80.a("called outside of runRecomposeAndApplyChanges");     // Catch: Throwable -> L151
    L156:
        monitor-exit(r72);
        nl4 r73 = tv3.z;
        hh3.f(((tv3) this.s).y);
        throw th;
    L102:
        if (r57.j(r58, r113) == false) goto L93;
    L97:
        if (r58.isEmpty() == false) goto L99;
        r113 = new vf3(r56, r56, r112.a(r56, new ob2(r59, r59)));
        goto L100
    L99:
        Object r119 = r58.o;
        Object r120 = r112.get(r119);
        r120.getClass();
        r113 = new vf3(r58.n, r56, r112.a(r119, new ob2(((ob2) r120).a, r56)).a(r56, new ob2(r119, r59)));
    L161:
        th = move-exception;
        throw th;
    L165:
        throw new IllegalStateException("Recomposer already running");     // Catch: Throwable -> L85
    L167:
        throw new IllegalStateException("Recomposer shut down");     // Catch: Throwable -> L85
    L85:
        th = move-exception;
        throw th;
    L66:
        if (r46 != 1) goto L72;
        r67 = (ss2) this.r;
        r47 = (s22) this.p;
        kb4.X(r20);     // Catch: Throwable -> L70
    L70:
        th = th;
        goto L146
    L72:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public qv3(gf1 r2, vd0 r3) {
        this.o = 1;
        this.u = r2;
        super(2, r3);
    }
}
