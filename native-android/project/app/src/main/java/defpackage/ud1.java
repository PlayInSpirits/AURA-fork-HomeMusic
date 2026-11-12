package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 extends q42 implements if1 {
    public final /* synthetic */ rd1 n;
    public final /* synthetic */ kc1 o;
    public final /* synthetic */ a23 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(rd1 rd1Var, kc1 kc1Var, a23 a23Var) {
        super(1);
        this.n = rd1Var;
        this.o = kc1Var;
        this.p = a23Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        ba2 ba2Var = (ba2) obj;
        rd1 rd1Var = this.n;
        ArrayList arrayList = rd1Var.g;
        boolean z = false;
        kc1 kc1Var = this.o;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (h12.c(((kd3) obj2).n, kc1Var.L)) {
                    z = true;
                    break;
                }
            }
        }
        if (ba2Var != null && !z) {
            le1 le1VarV = kc1Var.v();
            le1VarV.e();
            ea2 ea2Var = le1VarV.r;
            if (ea2Var.h.compareTo(r92.p) >= 0) {
                ea2Var.a((aa2) rd1Var.i.invoke(this.p));
            }
        }
        return j15.a;
    }
}
