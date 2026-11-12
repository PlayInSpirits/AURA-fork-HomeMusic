package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w90 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ w90(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch(this.n) {
            case 0: goto L22;
            case 1: goto L18;
            default: goto L4;
        };
    L4:
        Object r0 = ed4.b;
        NetworkRequest r1 = (NetworkRequest) this.o;
        ConnectivityManager r2 = (ConnectivityManager) this.p;
        ed4 r5 = (ed4) this.q;
        monitor-enter(r0);
        LinkedHashMap r3 = ed4.c;     // Catch: Throwable -> L10
        r3.remove(r1);     // Catch: Throwable -> L10
        if (r3.isEmpty() == false) goto L12;
        cx.f().b(lc5.a, "NetworkRequestConstraintController unregister shared callback");     // Catch: Throwable -> L10
        r2.unregisterNetworkCallback(r5);     // Catch: Throwable -> L10
    L12:
        monitor-exit(r0);
        return j15.a;
    L10:
        th = move-exception;
        throw th;
    L22:
        rr2 r4 = ((o00) this.o).b;
        r4.getClass();
        List r6 = ((jl1) this.p).a();
        return r4.x(((f6) this.q).h.d, r6);
    L18:
        if (((fx3) this.o).n == false) goto L21;
        cx.f().b(lc5.a, "NetworkRequestConstraintController unregister callback");
        ((ConnectivityManager) this.p).unregisterNetworkCallback((oy1) this.q);
    L21:
        return j15.a;
    }
}
