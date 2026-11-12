package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ jx3 o;

    public /* synthetic */ ea(int i, jx3 jx3Var) {
        this.n = i;
        this.o = jx3Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.n;
        jx3 jx3Var = this.o;
        switch (i) {
            case 0:
                jx3Var.n = (ba1) obj;
                return Boolean.TRUE;
            case 1:
                eo0 eo0Var = (rx4) obj;
                if (((cx2) eo0Var).n.A) {
                    jx3Var.n = eo0Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                rx4 rx4Var = (rx4) obj;
                rx4Var.getClass();
                q82 q82Var = ((tx4) rx4Var).B;
                List listQ = (List) jx3Var.n;
                if (listQ != null) {
                    listQ.add(q82Var);
                } else {
                    listQ = gb.Q(q82Var);
                }
                jx3Var.n = listQ;
                return qx4.o;
        }
    }
}
