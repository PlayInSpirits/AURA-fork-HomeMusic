package defpackage;

import android.view.Surface;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class hl2 implements xl2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ hl2(Object obj, Object obj2, int i, int i2, int i3) {
        this.n = i3;
        this.o = obj;
        this.r = obj2;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        kt2 kt2Var = (kt2) this.o;
        Surface surface = (Surface) this.r;
        al3 al3Var = (al3) obj;
        ((tn2) kt2Var.e.get()).getClass();
        if (surface == null) {
            al3Var.Q(null);
            kt2Var.j = null;
        } else {
            jt2 jt2Var = new jt2(surface, this.p, this.q);
            kt2Var.j = jt2Var;
            al3Var.Q(jt2Var);
        }
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        Object obj = this.r;
        Object obj2 = this.o;
        switch (i2) {
            case 0:
                bm2 bm2Var = (bm2) obj2;
                List list = (List) obj;
                uw1 j = yw1.j();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    j.c(((gn2) list.get(i3)).c(true));
                }
                iw iwVar = new iw(j.f());
                cb4 cb4Var = bm2Var.n;
                cb4Var.getClass();
                int f = cb4Var.a.f();
                mm2 mm2Var = bm2Var.c;
                int i4 = this.p;
                int i5 = this.q;
                if (f >= 2) {
                    pu1Var.P(mm2Var, i, i4, i5, iwVar);
                    break;
                } else {
                    pu1Var.Z(mm2Var, i, i5, iwVar);
                    pu1Var.M(bm2Var.c, i, i4, i5);
                    break;
                }
            default:
                int i6 = this.q;
                pu1Var.z0(((bm2) obj2).c, i, (Surface) obj, this.p, i6);
                break;
        }
    }
}
