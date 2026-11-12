package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq implements Runnable {
    public final /* synthetic */ int n;
    public int o;
    public final Object p;

    public rq(List list, int i, Throwable th) {
        this.n = 2;
        l93.m(list, "initCallbacks cannot be null");
        this.p = new ArrayList(list);
        this.o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = 0;
        Object obj = this.p;
        switch (i) {
            case 0:
                ((uq) obj).t.x(this.o, 4);
                break;
            case 1:
                int i3 = this.o;
                au0 au0Var = (au0) ((c05) obj).n;
                if (au0Var != null) {
                    au0Var.M(i3);
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                if (this.o == 1) {
                    while (i2 < size) {
                        ((rz0) arrayList.get(i2)).b();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((rz0) arrayList.get(i2)).a();
                        i2++;
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((nh2) obj).t0.m0(this.o);
                break;
            case 4:
                ((k33) obj).i(this.o);
                break;
            case 5:
                this.o = ((Integer) xl.E((s24) ((ns3) obj).o, true, false, new k52(28))).intValue();
                break;
            case 6:
                ((RecyclerView) obj).m0(this.o);
                break;
            default:
                ((gf5) obj).f(this.o);
                break;
        }
    }

    public rq(ns3 ns3Var) {
        this.n = 5;
        this.o = 0;
        this.p = ns3Var;
    }

    public rq(int i, p75 p75Var) {
        this.n = 6;
        this.o = i;
        this.p = p75Var;
    }

    public /* synthetic */ rq(int i, int i2, Object obj) {
        this.n = i2;
        this.p = obj;
        this.o = i;
    }

    public rq(uq uqVar) {
        this.n = 0;
        this.p = uqVar;
        this.o = -1;
    }
}
