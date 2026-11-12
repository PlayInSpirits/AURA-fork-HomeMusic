package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public jx3 p;
    public jx3 q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ z64 t;

    public hv0(jx3 r2, z64 r3, vd0 r4) {
        this.o = 0;
        this.q = r2;
        this.t = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        z64 r1 = this.t;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        hv0 r2 = new hv0(r1, r4);
        r2.s = r3;
        return r2;
    L6:
        hv0 r5 = new hv0(this.q, r1, r4);
        r5.s = r3;
        return r5;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((hv0) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((hv0) create((if1) r3, (vd0) r4)).invokeSuspend(r1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009a -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e5 -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00ec -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f9 -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0107 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0153 -> B:83:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0157 -> B:85:0x0159). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r12) {
        int r0 = this.o;
        xe0 r2 = xe0.n;
        z64 r3 = this.t;
        j15 r4 = j15.a;
        vd0 r6 = null;
        switch(r0) {
            case 0: goto L61;
            default: goto L5;
        };
    L61:
        jx3 r1 = this.q;
        int r7 = this.r;
        if (r7 == 0) goto L66;
        if (r7 != 1) goto L65;
        jx3 r5 = this.p;
        if1 r8 = (if1) this.s;
        kb4.X(r12);
    L83:
        av0 r13 = (av0) r12;
    L85:
        r5.n = r13;
    L67:
        Object r14 = r1.n;
        if ((r14 instanceof zu0) == true) goto L87;
        if ((r14 instanceof wu0) == true) goto L87;
        if ((r14 instanceof xu0) == false) goto L74;
        xu0 r15 = (xu0) r14;
    L75:
        if (r15 == null) goto L77;
        r8.invoke(r15);
    L77:
        aw r16 = r3.H;
        if (r16 == null) goto L84;
        this.s = r8;
        this.p = r1;
        this.r = 1;
        r12 = aw.H(r16, this);
        if (r12 == r2) goto L103;
        r5 = r1;
        goto L83
    L103:
        return r2;
    L84:
        r5 = r1;
        r13 = null;
        goto L85
    L74:
        r15 = null;
    L87:
        return r4;
    L65:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L66:
        kb4.X(r12);
        r8 = (if1) this.s;
        goto L67
    L5:
        switch(this.r) {
            case 0: goto L19;
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L6;
        };
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L7:
        we0 r9 = (we0) this.s;
        kb4.X(r12);
    L12:
        we0 r10 = r9;
    L20:
        s22 r17 = (s22) r10.e().K(fz0.h0);
        if (r17 == null) goto L23;
        boolean r18 = r17.b();
    L24:
        if (r18 == false) goto L60;
        jx3 r11 = new jx3();
        aw r19 = r3.H;
        if (r19 == null) goto L32;
        this.s = r10;
        this.p = r11;
        this.q = r11;
        this.r = 1;
        r12 = aw.H(r19, this);
        if (r12 == r2) goto L97;
        jx3 r20 = r11;
    L31:
        av0 r110 = (av0) r12;
    L33:
        r11.n = r110;
        Object r111 = r20.n;
        if ((r111 instanceof yu0) == false) goto L20;
        this.s = r10;
        this.p = r20;
        this.q = null;
        this.r = 2;
        if (z64.u0(r3, (yu0) r111, this) == r2) goto L98;
        jx3 r21 = r20;
        we0 r22 = r10;
    L39:
        hv0 r112 = new hv0(r21, r3, null);     // Catch: CancellationException -> L16
        this.s = r22;     // Catch: CancellationException -> L16
        this.p = r21;     // Catch: CancellationException -> L16
        this.r = 3;     // Catch: CancellationException -> L16
        g74 r23 = r3.e0;     // Catch: CancellationException -> L16
        Object r113 = r23.g(h13.o, new r(r112, r23, r6, 12), this);     // Catch: CancellationException -> L16
        if (r113 == r2) goto L43;
        r113 = r4;
    L43:
        if (r113 == r2) goto L99;
    L15:
        r10 = r22;
        Object r114 = r21.n;     // Catch: CancellationException -> L50
        if ((r114 instanceof zu0) == false) goto L52;
        this.s = r10;     // Catch: CancellationException -> L50
        this.p = null;     // Catch: CancellationException -> L50
        this.r = 4;     // Catch: CancellationException -> L50
        if (z64.v0(r3, (zu0) r114, this) != r2) goto L20;
        return r2;
    L52:
        if ((r114 instanceof wu0) == false) goto L20;
        this.s = r10;     // Catch: CancellationException -> L50
        this.p = null;     // Catch: CancellationException -> L50
        this.r = 5;     // Catch: CancellationException -> L50
        if (z64.t0(r3, this) != r2) goto L20;
        return r2;
    L50:
        r9 = r10;
    L56:
        this.s = r9;
        this.p = null;
        this.r = 6;
        if (z64.t0(r3, this) != r2) goto L12;
        return r2;
    L99:
        return r2;
    L16:
        r9 = r22;
        goto L56
    L98:
        return r2;
    L97:
        return r2;
    L32:
        r20 = r11;
        r110 = null;
        goto L33
    L60:
        return r4;
    L23:
        r18 = true;
        goto L24
    L8:
        r9 = (we0) this.s;
    L89:
        kb4.X(r12);     // Catch: CancellationException -> L88
    L11:
        r9 = (we0) this.s;
        goto L89
    L13:
        r21 = this.p;
        r22 = (we0) this.s;
        kb4.X(r12);     // Catch: CancellationException -> L16
        goto L15
    L17:
        r21 = this.p;
        r22 = (we0) this.s;
        kb4.X(r12);
        goto L39
    L18:
        r11 = this.q;
        r20 = this.p;
        r10 = (we0) this.s;
        kb4.X(r12);
        goto L31
    L19:
        kb4.X(r12);
        r10 = (we0) this.s;
        goto L20
    }

    public hv0(z64 r2, vd0 r3) {
        this.o = 1;
        this.t = r2;
        super(2, r3);
    }
}
