package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ if1 q;

    public /* synthetic */ hh0(vd0 r1, if1 r2, int r3) {
        this.o = r3;
        this.q = r2;
        super(2, r1);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        if1 r2 = this.q;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        hh0 r1 = new hh0(r4, r2, 1);
        r1.p = r3;
        return r1;
    L6:
        hh0 r5 = new hh0(r4, r2, 0);
        r5.p = r3;
        return r5;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        ao3 r5 = (ao3) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((hh0) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((hh0) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r3) {
        int r0 = this.o;
        if1 r1 = this.q;
        kb4.X(r3);
        ao3 r2 = (ao3) this.p;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.getClass();
        return r1.invoke(r2.c());
    L6:
        r2.getClass();
        return r1.invoke(r2.c());
    }
}
