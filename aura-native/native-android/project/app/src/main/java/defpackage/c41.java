package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c41 implements qc2, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;

    public /* synthetic */ c41(List list, int i) {
        this.n = i;
        this.o = list;
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        int i2 = this.n;
        List list = this.o;
        switch (i2) {
            case 1:
                break;
        }
        return tn2Var.o(fr2Var, list);
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        ((oi3) obj).K(this.o);
    }
}
