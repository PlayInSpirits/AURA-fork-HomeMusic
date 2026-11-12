package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 extends ep4 implements wf1 {
    public y00 o;
    public byte[] p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ p81[] u;
    public final /* synthetic */ zf0 v;
    public final /* synthetic */ kc5 w;
    public final /* synthetic */ q81 x;

    public c60(p81[] r1, zf0 r2, kc5 r3, q81 r4, vd0 r5) {
        this.u = r1;
        this.v = r2;
        this.w = r3;
        this.x = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        kc5 r3 = this.w;
        q81 r4 = this.x;
        c60 r0 = new c60(this.u, this.v, r3, r4, r8);
        r0.t = r7;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((c60) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00dc -> B:20:0x0075). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r19) {
        f01 r1 = xl.f;
        int r2 = this.s;
        xe0 r7 = xe0.n;
        if (r2 == 0) goto L13;
        if (r2 != 1) goto L6;
        int r3 = this.r;
        int r8 = this.q;
        byte[] r9 = this.p;
        y00 r10 = this.o;
        Object[] r11 = (Object[]) this.t;
        kb4.X(r19);
        Object r12 = ((j10) r19).a;
    L24:
        if ((r12 instanceof i10) == false) goto L27;
        r12 = null;
    L27:
        yx1 r13 = (yx1) r12;
        if (r13 == null) goto L30;
    L31:
        int r14 = r13.a;
        Object r15 = r11[r14];
        r11[r14] = r13.b;
        if (r15 != r1) goto L35;
        r8 = r8 - 1;
    L35:
        if (r9[r14] == r3) goto L42;
        r9[r14] = (byte) r3;
        Object r16 = r10.g();
        if ((r16 instanceof i10) == false) goto L40;
        r16 = null;
    L40:
        r13 = (yx1) r16;
        if (r13 != null) goto L31;
    L42:
        if (r8 == 0) goto L43;
    L20:
        r3 = (byte) (r3 + 1);
        this.t = r11;
        this.o = r10;
        this.p = r9;
        this.q = r8;
        this.r = r3;
        this.s = 1;
        r12 = r10.i(this);
        if (r12 != r7) goto L24;
    L45:
        return r7;
    L43:
        tc0[] r17 = new tc0[((p81[]) this.v.o).length];
        ti.c0(0, 0, 14, r11, r17);
        this.t = r11;
        this.o = r10;
        this.p = r9;
        this.q = r8;
        this.r = r3;
        this.s = 3;
        if (this.w.a(this.x, r17, this) != r7) goto L20;
    L46:
        if (r8 != 0) goto L20;
    L30:
        return j15.a;
    L6:
        if (r2 == 2) goto L11;
        if (r2 == 3) goto L11;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L11:
        r3 = this.r;
        r8 = this.q;
        r9 = this.p;
        r10 = this.o;
        r11 = (Object[]) this.t;
        kb4.X(r19);
        goto L20
    L13:
        kb4.X(r19);
        we0 r4 = (we0) this.t;
        r8 = this.u.length;
        if (r8 == 0) goto L30;
        r11 = new Object[r8];
        ti.f0(0, r8, r1, r11);
        aw r18 = su3.a(r8, 6, null);
        AtomicInteger r110 = new AtomicInteger(r8);
        int r111 = 0;
    L17:
        if (r111 >= r8) goto L19;
        fu.G(r4, null, null, new b60(this.u, r111, r110, r18, null), 3);
        r111 = r111 + 1;
        goto L17
    L19:
        r9 = new byte[r8];
        r3 = 0;
        r10 = r18;
        goto L20
    }
}
