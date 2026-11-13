package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ wh2(int i, kc1 kc1Var) {
        this.a = i;
        this.b = kc1Var;
    }

    public final void a() {
        int i = this.a;
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                ((xh2) kc1Var).W0.setEnabled(false);
                break;
            default:
                Iterator it = ((ii2) kc1Var).l0.iterator();
                while (it.hasNext()) {
                    ((wh2) it.next()).a();
                }
                break;
        }
    }

    public final void b(Object obj) {
        int i = this.a;
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                xh2 xh2Var = (xh2) kc1Var;
                xh2Var.s0(xh2Var.o0());
                xh2Var.W0.setEnabled(xh2Var.n0().n != null);
                break;
            default:
                Iterator it = ((ii2) kc1Var).l0.iterator();
                while (it.hasNext()) {
                    ((wh2) it.next()).b(obj);
                }
                break;
        }
    }
}
