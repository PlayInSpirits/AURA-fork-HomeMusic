package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h23 extends q42 implements if1 {
    public final /* synthetic */ fx3 n;
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ hx3 p;
    public final /* synthetic */ v23 q;
    public final /* synthetic */ Bundle r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h23(fx3 fx3Var, ArrayList arrayList, hx3 hx3Var, v23 v23Var, Bundle bundle) {
        super(1);
        this.n = fx3Var;
        this.o = arrayList;
        this.p = hx3Var;
        this.q = v23Var;
        this.r = bundle;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        List listSubList;
        a23 a23Var = (a23) obj;
        a23Var.getClass();
        this.n.n = true;
        ArrayList arrayList = this.o;
        int iIndexOf = arrayList.indexOf(a23Var);
        if (iIndexOf != -1) {
            hx3 hx3Var = this.p;
            int i = iIndexOf + 1;
            listSubList = arrayList.subList(hx3Var.n, i);
            hx3Var.n = i;
        } else {
            listSubList = u01.n;
        }
        this.q.a(a23Var.o, this.r, a23Var, listSubList);
        return j15.a;
    }
}
