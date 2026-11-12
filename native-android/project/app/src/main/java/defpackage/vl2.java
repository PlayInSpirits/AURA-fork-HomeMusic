package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl2 implements xl2, ks2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ vl2(Object obj, int i, Object obj2, int i2) {
        this.n = i2;
        this.o = obj;
        this.p = i;
        this.q = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    @Override // defpackage.wc0
    public void accept(Object obj) {
        ab4 ab4Var;
        int i;
        tn2 tn2Var = (tn2) this.o;
        fr2 fr2Var = (fr2) this.q;
        try {
            ab4Var = (ab4) ((ic2) obj).get();
            rr2.s(ab4Var, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            l93.r0("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            ab4Var = new ab4(i);
        } catch (CancellationException e2) {
            l93.r0("MediaSessionStub", "Session operation cancelled", e2);
            ab4Var = new ab4(1);
        } catch (ExecutionException e3) {
            e = e3;
            l93.r0("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            ab4Var = new ab4(i);
        }
        kt2.P0(tn2Var, fr2Var, this.p, ab4Var);
    }

    @Override // defpackage.ks2
    public void b(fr2 fr2Var) {
        ls2 ls2Var = (ls2) this.o;
        pm2 pm2Var = (pm2) this.q;
        if (TextUtils.isEmpty(pm2Var.n)) {
            l93.q0("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        mw1 mw1VarO = ls2Var.g.o(fr2Var, yw1.o(f92.j(pm2Var)));
        mw1VarO.f(new lg1(0, mw1VarO, new ue1(ls2Var, fr2Var, this.p)), gq0.n);
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        Object obj = this.q;
        int i3 = this.p;
        bm2 bm2Var = (bm2) this.o;
        switch (i2) {
            case 0:
                List list = (List) obj;
                mm2 mm2Var = bm2Var.c;
                uw1 uw1VarJ = yw1.j();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    uw1VarJ.c(((gn2) list.get(i4)).c(true));
                }
                pu1Var.Z(mm2Var, i, i3, new iw(uw1VarJ.f()));
                break;
            default:
                gn2 gn2Var = (gn2) obj;
                cb4 cb4Var = bm2Var.n;
                cb4Var.getClass();
                int iF = cb4Var.a.f();
                mm2 mm2Var2 = bm2Var.c;
                if (iF >= 2) {
                    pu1Var.G0(mm2Var2, i, i3, gn2Var.c(true));
                } else {
                    pu1Var.D(mm2Var2, i, i3 + 1, gn2Var.c(true));
                    pu1Var.N(mm2Var2, i, i3);
                }
                break;
        }
    }

    public /* synthetic */ vl2(Object obj, Object obj2, int i, int i2) {
        this.n = i2;
        this.o = obj;
        this.q = obj2;
        this.p = i;
    }
}
