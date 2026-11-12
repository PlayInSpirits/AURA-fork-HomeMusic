package defpackage;

import com.eddyizm.tempus.lan.LanReceiverService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g52 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ LanReceiverService o;
    public final /* synthetic */ String p;

    public /* synthetic */ g52(LanReceiverService r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch(this.n) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        LanReceiverService r0 = this.o;
        String r4 = this.p;
        if (r0.o == false) goto L11;
        boolean r3 = LanReceiverService.y;
        if (kb4.a0(r0).contains(r4) == false) goto L11;
        if (h12.c(ud3.D(), r0.w) == false) goto L11;
        return j15.a;
    L11:
        kf2.n("Failed requirement.");
        return null;
    L13:
        LanReceiverService r1 = this.o;
        String r5 = this.p;
        if (r1.o == false) goto L24;
        boolean r6 = LanReceiverService.y;
        if (kb4.a0(r1).contains(r5) == false) goto L24;
        if (h12.c(ud3.D(), r1.w) == false) goto L24;
        bl2 r7 = r1.v;
        if (r7 == null) goto L22;
        Object r8 = r7.get();
        r8.getClass();
        return r1.f((qi3) r8);
    L22:
        h12.Q("browserFuture");
        throw null;
    L24:
        kf2.n("Failed requirement.");
        return null;
    }
}
