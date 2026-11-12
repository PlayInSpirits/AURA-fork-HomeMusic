package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lu2 extends k03 {
    public i44 l = new i44();

    @Override // defpackage.ad2
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            e44 e44Var = (e44) it;
            if (!e44Var.hasNext()) {
                return;
            }
            ku2 ku2Var = (ku2) ((Map.Entry) e44Var.next()).getValue();
            ku2Var.a.f(ku2Var);
        }
    }

    @Override // defpackage.ad2
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            e44 e44Var = (e44) it;
            if (!e44Var.hasNext()) {
                return;
            }
            ku2 ku2Var = (ku2) ((Map.Entry) e44Var.next()).getValue();
            ku2Var.a.j(ku2Var);
        }
    }

    public final void l(ad2 ad2Var, ht1 ht1Var) {
        if (ad2Var == null) {
            nz2.n("source cannot be null");
            return;
        }
        ku2 ku2Var = new ku2(ad2Var, ht1Var);
        ku2 ku2Var2 = (ku2) this.l.a(ad2Var, ku2Var);
        if (ku2Var2 != null && ku2Var2.b != ht1Var) {
            kf2.n("This source was already added with the different observer");
        } else if (ku2Var2 == null && this.c > 0) {
            ad2Var.f(ku2Var);
        }
    }
}
