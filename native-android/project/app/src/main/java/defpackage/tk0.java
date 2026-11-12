package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public gx3 p;
    public int q;
    public final /* synthetic */ float r;
    public Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ q64 u;

    public tk0(wg4 r2, float r3, if1 r4, q64 r5, vd0 r6) {
        this.o = 1;
        this.s = r2;
        this.r = r3;
        this.t = r4;
        this.u = r5;
        super(2, r6);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r8, vd0 r9) {
        int r10 = this.o;
        Object r0 = this.t;
        switch(r10) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        q64 r5 = this.u;
        float r3 = this.r;
        return new tk0((wg4) this.s, r3, (if1) r0, r5, r9);
    L6:
        c74 r11 = (c74) this.u;
        float r7 = this.r;
        return new tk0(r7, (uk0) r0, r11, r9);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((tk0) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((tk0) create(r5, r6)).invokeSuspend(r1);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [tg4] */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r24) {
        int r0 = this.o;
        xe0 r7 = xe0.n;
        float r2 = this.r;
        Object r3 = this.t;
        final int r10 = 0;
        switch(r0) {
            case 0: goto L92;
            default: goto L4;
        };
    L4:
        final if1 r11 = (if1) r3;
        wg4 r1 = (wg4) this.s;
        rf2 r12 = r1.a;
        int r4 = this.q;
        if (r4 == 0) goto L11;
        if (r4 == 1) goto L10;
        if (r4 != 2) goto L9;
        kb4.X(r24);
        return r24;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        gx3 r5 = this.p;
        kb4.X(r24);
        float r16 = 0.0f;
        xe0 r14 = r7;
        final gx3 r6 = r5;
        Object r8 = r24;
    L36:
        xd r9 = (xd) r8;
        float r13 = ((Number) r9.a()).floatValue();
        lm0 r15 = (lm0) r12.n;
        rv2 r17 = r15.m().n;
        List r18 = r15.m().a;
        int r19 = r18.size();
        float r110 = Float.NEGATIVE_INFINITY;
        float r111 = Float.POSITIVE_INFINITY;
    L37:
        if (r10 >= r19) goto L50;
        xi2 r20 = (xi2) r18.get(r10);
        te5.x(r15.m());
        int r112 = r15.m().f;
        int r113 = r15.m().d;
        int r114 = r15.m().b;
        int r21 = r20.l;
        r15.n();
        r17.getClass();
        float r22 = r21 - r16;
        if (r22 > r16) goto L44;
        if (r22 <= r110) goto L44;
        r110 = r22;
    L44:
        if (r22 < r16) goto L48;
        if (r22 >= r111) goto L48;
        r111 = r22;
    L48:
        r10 = r10 + 1;
        goto L37
    L50:
        if (r110 != Float.NEGATIVE_INFINITY) goto L53;
        r110 = r111;
    L53:
        if (r111 != Float.POSITIVE_INFINITY) goto L56;
        r111 = r110;
    L56:
        if (r15.c() == true) goto L62;
        if (xl.A(r15, r13) == false) goto L60;
        r110 = r16;
        r111 = r110;
        goto L62
    L60:
        r111 = r16;
    L62:
        if (r15.b() == false) goto L64;
    L67:
        float r23 = r111;
    L68:
        float r25 = ((Number) ((gc3) r12.o).a(Float.valueOf(r13), Float.valueOf(r110), Float.valueOf(r23))).floatValue();
        if (r25 == r110) goto L79;
        if (r25 == r23) goto L79;
        if (r25 == r16) goto L79;
        fz1.c("Final Snapping Offset Should Be one of " + r110 + ", " + r23 + " or 0.0");
    L79:
        if (r25 != Float.POSITIVE_INFINITY) goto L82;
    L83:
        r25 = r16;
    L85:
        if (Float.isNaN(r25) == false) goto L87;
        fz1.c("calculateSnapOffset returned NaN. Please use a valid value.");
    L87:
        r6.n = r25;
        float r26 = r16;
        xd r27 = j51.p(r9, r26, r26, 30);
        ck4 r28 = r1.c;
        final int r29 = 1;
        if1 r30 = new tg4(r6, r11, r29);
        this.p = null;
        this.q = 2;
        Object r31 = su3.d(this.u, r25, r25, r27, r28, r30, this);
        if (r31 != r14) goto L91;
        return r14;
    L91:
        return r31;
    L82:
        if (r25 != Float.NEGATIVE_INFINITY) goto L85;
    L64:
        if (xl.A(r15, r13) == true) goto L66;
        r23 = r16;
        r110 = r23;
        goto L68
    L66:
        r110 = r16;
        goto L67
    L11:
        kb4.X(r24);
        float r32 = ((zd) new na4(r1.b.a).D(new zd(0.0f), new zd(r2))).a;
        lm0 r33 = (lm0) r12.n;
        zd3 r34 = r33.m;
        int r115 = ((qc3) r34.getValue()).c + r33.o();
        if (r115 != 0) goto L14;
        float r35 = 0.0f;
        r16 = 0.0f;
        r14 = r7;
    L31:
        if (Float.isNaN(r35) == false) goto L33;
        fz1.c("calculateApproachOffset returned NaN. Please use a valid value.");
    L33:
        r6 = new gx3();
        float r36 = Math.signum(r2) * Math.abs(r35);
        r6.n = r36;
        r11.invoke(new Float(r36));
        float r37 = r6.n;
        ?? r38 = new tg4(r6, r11, r10);
        this.p = r6;
        this.q = 1;
        r8 = wg4.b(r1, this.u, r37, this.r, r38, this);
        if (r8 != r14) goto L36;
        return r14;
    L14:
        int r116 = r33.e;
        if (r2 >= 0.0f) goto L17;
        r116 = r116 + 1;
    L17:
        int r39 = gb.m(((int) (r32 / r115)) + r116, 0, r33.n());
        r33.o();
        int r40 = ((qc3) r34.getValue()).c;
        r16 = 0.0f;
        r14 = r7;
        long r41 = r116;
        long r117 = r41 - 1;
        if (r117 >= 0) goto L20;
        long r42 = 0;
    L21:
        int r43 = (int) r42;
        long r44 = r41 + 1;
        if (r44 <= 2147483647L) goto L24;
        r44 = 2147483647L;
    L24:
        int r45 = Math.abs((gb.m(gb.m(r39, r43, (int) r44), 0, r33.n()) - r116) * r115) - r115;
        if (r45 >= 0) goto L27;
        r45 = 0;
    L27:
        if (r45 != 0) goto L29;
        r35 = r45;
        goto L31
    L29:
        r35 = Math.signum(r2) * r45;
        goto L31
    L20:
        r42 = r117;
        goto L21
    L92:
        int r46 = this.q;
        if (r46 != 0) goto L95;
        kb4.X(r24);
        if (Math.abs(r2) <= 1.0f) goto L110;
        gx3 r47 = new gx3();
        r47.n = r2;
        gx3 r48 = new gx3();
        xd r49 = j51.a(0.0f, r2, 28);
        uk0 r50 = (uk0) r3;     // Catch: CancellationException -> L106
        ui0 r51 = r50.a;     // Catch: CancellationException -> L106
        dd0 r52 = new dd0(r48, (c74) this.u, r47, r50);     // Catch: CancellationException -> L106
        this.p = r47;     // Catch: CancellationException -> L106
        this.s = r49;     // Catch: CancellationException -> L106
        this.q = 1;     // Catch: CancellationException -> L106
        if (j51.g(r49, r51, false, r52, this) == r7) goto L125;
    L108:
        r2 = r47.n;
        goto L110
    L125:
        return r7;
    L106:
        xd r53 = r49;
    L107:
        r47.n = ((Number) r53.a()).floatValue();
    L110:
        return new Float(r2);
    L95:
        if (r46 != 1) goto L99;
        r53 = (xd) this.s;
        r47 = this.p;
        kb4.X(r24);     // Catch: CancellationException -> L111
    L99:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public tk0(float r2, uk0 r3, c74 r4, vd0 r5) {
        this.o = 0;
        this.r = r2;
        this.t = r3;
        this.u = r4;
        super(2, r5);
    }
}
