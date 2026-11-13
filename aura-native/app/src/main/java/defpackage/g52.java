package defpackage;

import com.eddyizm.tempus.lan.LanReceiverService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class g52 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ LanReceiverService o;
    public final /* synthetic */ String p;

    public /* synthetic */ g52(LanReceiverService lanReceiverService, String str, int i) {
        this.n = i;
        this.o = lanReceiverService;
        this.p = str;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch (this.n) {
            case 0:
                LanReceiverService lanReceiverService = this.o;
                String str = this.p;
                if (lanReceiverService.o) {
                    boolean z = LanReceiverService.y;
                    if (kb4.a0(lanReceiverService).contains(str) && h12.c(ud3.D(), lanReceiverService.w)) {
                        bl2 bl2Var = lanReceiverService.v;
                        if (bl2Var == null) {
                            h12.Q("browserFuture");
                            throw null;
                        }
                        Object obj = bl2Var.get();
                        obj.getClass();
                        return lanReceiverService.f((qi3) obj);
                    }
                }
                kf2.n("Failed requirement.");
                return null;
            default:
                LanReceiverService lanReceiverService2 = this.o;
                String str2 = this.p;
                if (lanReceiverService2.o) {
                    boolean z2 = LanReceiverService.y;
                    if (kb4.a0(lanReceiverService2).contains(str2) && h12.c(ud3.D(), lanReceiverService2.w)) {
                        return j15.a;
                    }
                }
                kf2.n("Failed requirement.");
                return null;
        }
    }
}
