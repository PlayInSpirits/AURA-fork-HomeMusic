package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fy2 extends ep4 implements wf1 {
    public fx3 o;
    public fx3 p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gx3 t;
    public final /* synthetic */ jx3 u;
    public final /* synthetic */ jx3 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ hy2 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ g74 z;

    public fy2(gx3 r1, jx3 r2, jx3 r3, float r4, hy2 r5, float r6, g74 r7, vd0 r8) {
        this.t = r1;
        this.u = r2;
        this.v = r3;
        this.w = r4;
        this.x = r5;
        this.y = r6;
        this.z = r7;
        super(2, r8);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r10, vd0 r11) {
        float r6 = this.y;
        g74 r7 = this.z;
        fy2 r0 = new fy2(this.t, this.u, this.v, this.w, this.x, r6, r7, r11);
        r0.s = r10;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((fy2) create((e74) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0163 -> B:36:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0174 -> B:37:0x0171). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r19) {
        fy2 r7 = this;
        int r0 = r7.r;
        jx3 r1 = r7.v;
        hy2 r2 = r7.x;
        gx3 r4 = r7.t;
        char r9 = 3;
        jx3 r12 = r7.u;
        xe0 r13 = xe0.n;
        if (r0 == 0) goto L12;
        if (r0 == 1) goto L11;
        if (r0 == 2) goto L10;
        if (r0 != 3) goto L8;
        fx3 r3 = r7.p;
        fx3 r5 = r7.o;
        e74 r6 = (e74) r7.s;
        kb4.X(r19);
        fx3 r8 = r5;
        gx3 r17 = r4;
        e74 r14 = r6;
        char r11 = 3;
        jx3 r10 = r12;
        Object r15 = r19;
    L36:
        r3.n = ((Boolean) r15).booleanValue();
        r12 = r10;
        r9 = r11;
        r4 = r17;
    L13:
        boolean r16 = r8.n;
        Object r18 = j15.a;
        if (r16 == false) goto L44;
        r8.n = false;
        float r20 = r4.n - ((Number) ((xd) r12.n).n.getValue()).floatValue();
        if (((cy2) r1.n).c == true) goto L19;
        float r21 = Math.abs(r20);
        float r22 = r7.w;
        if (r21 < r22) goto L19;
        float r23 = Math.signum(r20) * r22;
        r2.G(r14, r23);
        xd r24 = (xd) r12.n;
        xd r25 = j51.p(r24, ((Number) r24.n.getValue()).floatValue() + r23, 0.0f, 30);
        r12.n = r25;
        int r26 = ji2.L(Math.abs(r4.n - ((Number) r25.n.getValue()).floatValue()) / r7.y);
        if (r26 <= 100) goto L23;
        int r110 = 100;
    L24:
        xd r27 = (xd) r12.n;
        float r28 = r4.n;
        jx3 r29 = r1;
        ey2 r30 = new ey2(r2, r29, r4, r7.z, r8);
        jx3 r111 = r29;
        r17 = r4;
        r7.s = r14;
        r7.o = r8;
        r7.p = null;
        r7.q = r110;
        r7.r = 2;
        gx3 r31 = new gx3();
        r31.n = ((Number) r27.n.getValue()).floatValue();
        Float r32 = new Float(r28);
        yy4 r33 = au0.T(r110, sy0.b, 2);
        ry1 r34 = new ry1(r31, r2, r14, r30);
        fy2 r35 = r7;
        hy2 r36 = r2;
        fy2 r37 = r35;
        Object r38 = j51.h(r27, r32, r33, true, r34, r37);
        if (r38 != r13) goto L27;
        r18 = r38;
    L27:
        if (r18 == r13) goto L41;
        fx3 r39 = r8;
        int r40 = r110;
    L31:
        if (r39.n == true) goto L38;
        long r41 = 50 - ((long) r40);
        r37.s = r14;
        r37.o = r39;
        r37.p = r39;
        r11 = 3;
        r37.r = 3;
        hy2 r42 = r36;
        r10 = r12;
        r7 = r37;
        r1 = r111;
        r15 = hy2.F(r42, r1, r17, r37.z, r10, r41, r7);
        r2 = r42;
        if (r15 == r13) goto L41;
        r3 = r39;
        r8 = r3;
        goto L36
    L38:
        r2 = r36;
        r7 = r37;
        r8 = r39;
        r1 = r111;
        r4 = r17;
        r9 = 3;
    L41:
        return r13;
    L23:
        r110 = r26;
    L19:
        gx3 r112 = r4;
        char r113 = r9;
        jx3 r43 = r12;
        r2.G(r14, r20);
        r7.s = r14;
        r7.o = r8;
        r7.p = r8;
        r7.r = 1;
        fx3 r44 = r8;
        hy2 r45 = r2;
        Object r46 = hy2.F(r45, r1, r112, r7.z, r43, 50, r7);
        r2 = r45;
        if (r46 == r13) goto L41;
        r8 = r44;
        r44.n = ((Boolean) r46).booleanValue();
        r9 = r113;
        r7 = this;
        r12 = r43;
        r4 = r112;
        goto L13
    L44:
        return r18;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        r40 = r7.q;
        fx3 r47 = r7.o;
        e74 r48 = (e74) r7.s;
        kb4.X(r19);
        r111 = r1;
        r39 = r47;
        r17 = r4;
        r14 = r48;
        r37 = r7;
        r36 = r2;
        goto L31
    L11:
        fx3 r49 = r7.p;
        fx3 r50 = r7.o;
        e74 r51 = (e74) r7.s;
        kb4.X(r19);
        r8 = r50;
        r14 = r51;
        r49.n = ((Boolean) r19).booleanValue();
        r9 = 3;
        r7 = this;
        r12 = r12;
        r4 = r4;
        goto L13
    L12:
        kb4.X(r19);
        e74 r52 = (e74) r7.s;
        fx3 r53 = new fx3();
        r53.n = true;
        r14 = r52;
        r8 = r53;
        goto L13
    }
}
