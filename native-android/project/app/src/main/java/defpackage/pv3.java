package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pv3 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public /* synthetic */ Object p;

    public /* synthetic */ pv3(int r1, vd0 r2, int r3) {
        this.o = r3;
        super(r1, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        switch(this.o) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        pv3 r2 = new pv3(2, r4, 1);
        r2.p = r3;
        return r2;
    L6:
        pv3 r5 = new pv3(2, r4, 0);
        r5.p = r3;
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
        return ((pv3) create((gd4) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((pv3) create((ov3) r3, (vd0) r4)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r4) {
        boolean r1 = false;
        switch(this.o) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        kb4.X(r4);
        if (((gd4) this.p) == gd4.n) goto L8;
        r1 = true;
    L8:
        return Boolean.valueOf(r1);
    L9:
        kb4.X(r4);
        if (((ov3) this.p) != ov3.n) goto L13;
        r1 = true;
    L13:
        return Boolean.valueOf(r1);
    }
}
