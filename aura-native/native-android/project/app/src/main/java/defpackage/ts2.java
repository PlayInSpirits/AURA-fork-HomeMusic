package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts2 implements it2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ts2(Object obj, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.o = z;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ((al3) obj).k0((il) this.p, this.o);
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        int i2 = this.n;
        boolean z = this.o;
        Object obj = this.p;
        switch (i2) {
            case 0:
                return tn2Var.x(fr2Var, yw1.o((gn2) obj), z ? -1 : tn2Var.s.o0(), z ? -9223372036854775807L : tn2Var.s.M0());
            default:
                return tn2Var.x(fr2Var, (List) obj, z ? -1 : tn2Var.s.o0(), z ? -9223372036854775807L : tn2Var.s.M0());
        }
    }
}
