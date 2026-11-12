package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s34 {
    public final f6 a;
    public final rm2 b;
    public final hy c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public s34(f6 f6Var, rm2 rm2Var, hy hyVar, boolean z) {
        List listF;
        f6Var.getClass();
        rm2Var.getClass();
        hyVar.getClass();
        this.a = f6Var;
        this.b = rm2Var;
        this.c = hyVar;
        this.d = z;
        u01 u01Var = u01.n;
        this.e = u01Var;
        this.g = u01Var;
        this.h = new ArrayList();
        gr1 gr1Var = f6Var.h;
        gr1Var.getClass();
        URI uriJ = gr1Var.j();
        if (uriJ.getHost() == null) {
            listF = ze5.f(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = f6Var.g.select(uriJ);
            listF = (listSelect == null || listSelect.isEmpty()) ? ze5.f(Proxy.NO_PROXY) : ze5.k(listSelect);
        }
        this.e = listF;
        this.f = 0;
        gr1Var.getClass();
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
