package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ w(Object r1, vd0 r2, int r3) {
        this.o = r3;
        this.p = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        int r4 = this.o;
        Object r1 = this.p;
        switch(r4) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new w((dd5) r1, r3, 2);
    L7:
        return new w((u30) r1, r3, 1);
    L9:
        return new w((u30) r1, r3, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((w) create((tc0) r3, (vd0) r4)).invokeSuspend(r1);
        return r1;
    L6:
        ((w) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
        return r1;
    L8:
        ((w) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
        return r1;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r8) {
        int r0 = this.o;
        vd0 r2 = null;
        j15 r3 = j15.a;
        Object r7 = this.p;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        kb4.X(r8);
        String r9 = ic0.a;
        cx.f().b(r9, "Constraints changed for " + ((dd5) r7));
        return r3;
    L6:
        kb4.X(r8);
        u30 r10 = (u30) r7;
        if (r10.N == null) goto L12;
        xp1 r11 = new xp1();
        rm2 r1 = r10.D;
        if (r1 == null) goto L11;
        fu.G(r10.e0(), null, null, new p(r1, r11, r2, 1), 3);
    L11:
        r10.N = null;
    L12:
        return r3;
    L13:
        kb4.X(r8);
        u30 r12 = (u30) r7;
        if (r12.N != null) goto L19;
        wp1 r13 = new wp1();
        rm2 r4 = r12.D;
        if (r4 == null) goto L18;
        fu.G(r12.e0(), null, null, new p(r4, r13, r2, 0), 3);
    L18:
        r12.N = r13;
    L19:
        return r3;
    }
}
