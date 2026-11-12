package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w90 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w90(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch (this.n) {
            case 0:
                rr2 rr2Var = ((o00) this.o).b;
                rr2Var.getClass();
                return rr2Var.x(((f6) this.q).h.d, ((jl1) this.p).a());
            case 1:
                if (((fx3) this.o).n) {
                    cx.f().b(lc5.a, "NetworkRequestConstraintController unregister callback");
                    ((ConnectivityManager) this.p).unregisterNetworkCallback((oy1) this.q);
                }
                return j15.a;
            default:
                Object obj = ed4.b;
                NetworkRequest networkRequest = (NetworkRequest) this.o;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.p;
                ed4 ed4Var = (ed4) this.q;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = ed4.c;
                    linkedHashMap.remove(networkRequest);
                    if (linkedHashMap.isEmpty()) {
                        cx.f().b(lc5.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(ed4Var);
                    }
                    break;
                }
                return j15.a;
        }
    }
}
