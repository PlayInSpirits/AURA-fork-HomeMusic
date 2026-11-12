package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ rq1 o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq1(rq1 rq1Var, int i, Object obj, int i2) {
        super(0);
        this.n = i2;
        this.o = rq1Var;
        this.p = i;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch (this.n) {
            case 0:
                this.o.x.getClass();
                rq1 rq1Var = this.o;
                int i = this.p;
                try {
                    rq1Var.J.u(i, b21.CANCEL);
                    synchronized (rq1Var) {
                        rq1Var.L.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return j15.a;
            case 1:
                this.o.x.getClass();
                rq1 rq1Var2 = this.o;
                int i2 = this.p;
                try {
                    rq1Var2.J.u(i2, b21.CANCEL);
                    synchronized (rq1Var2) {
                        rq1Var2.L.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return j15.a;
            default:
                this.o.x.getClass();
                rq1 rq1Var3 = this.o;
                int i3 = this.p;
                synchronized (rq1Var3) {
                    rq1Var3.L.remove(Integer.valueOf(i3));
                }
                return j15.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq1(rq1 rq1Var, int i, List list, boolean z) {
        super(0);
        this.n = 0;
        this.o = rq1Var;
        this.p = i;
    }
}
