package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iy4 extends ep4 implements wf1 {
    public y73[] o;
    public jy4 p;
    public mw4 q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final /* synthetic */ y73[] v;
    public final /* synthetic */ jy4 w;
    public final /* synthetic */ mw4 x;

    public iy4(y73[] r1, jy4 r2, mw4 r3, vd0 r4) {
        this.v = r1;
        this.w = r2;
        this.x = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        jy4 r0 = this.w;
        mw4 r1 = this.x;
        return new iy4(this.v, r0, r1, r4);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((iy4) create((ao3) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r12) {
        int r0 = this.u;
        if (r0 == 0) goto L9;
        if (r0 == 1) goto L6;
        if (r0 == 2) goto L6;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L6:
        int r1 = this.t;
        int r4 = this.s;
        int r5 = this.r;
        mw4 r6 = this.q;
        jy4 r7 = this.p;
        y73[] r8 = this.o;
        kb4.X(r12);
    L20:
        int r13 = r5;
    L27:
        r4 = r4 + 1;
    L10:
        if (r4 >= r1) goto L29;
        int r9 = r13 + 1;
        int r10 = r8[r4].ordinal();
        if (r10 == 0) goto L26;
        xe0 r11 = xe0.n;
        if (r10 == 1) goto L23;
        if (r10 != 2) goto L21;
        this.o = r8;
        this.p = r7;
        this.q = r6;
        this.r = r9;
        this.s = r4;
        this.t = r1;
        this.u = 2;
        if (jy4.d(r7, r6, r13, this) == r11) goto L25;
    L19:
        r5 = r9;
    L25:
        return r11;
    L21:
        er1.n();
        return null;
    L23:
        this.o = r8;
        this.p = r7;
        this.q = r6;
        this.r = r9;
        this.s = r4;
        this.t = r1;
        this.u = 1;
        if (jy4.c(r7, r6, r13, this) != r11) goto L19;
        r5 = r9;
        goto L20
    L26:
        r13 = r9;
        goto L27
    L29:
        return j15.a;
    L9:
        kb4.X(r12);
        y73[] r14 = this.v;
        r1 = r14.length;
        r4 = 0;
        jy4 r15 = this.w;
        r6 = this.x;
        r8 = r14;
        r13 = 0;
        r7 = r15;
        goto L10
    }
}
