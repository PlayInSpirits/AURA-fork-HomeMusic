package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ls3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ns3 o;
    public final /* synthetic */ List p;

    public /* synthetic */ ls3(ns3 ns3Var, List list, int i) {
        this.n = i;
        this.o = ns3Var;
        this.p = list;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        List list = this.p;
        ns3 ns3Var = this.o;
        x34 x34Var = (x34) obj;
        switch (i) {
            case 0:
                s24 s24Var = (s24) ns3Var.o;
                xl.E(s24Var, false, true, new k52(29));
                xl.E(s24Var, false, true, new ls3(ns3Var, list, 1));
                return j15.a;
            default:
                ((q20) ns3Var.p).H(x34Var, list);
                return null;
        }
    }
}
