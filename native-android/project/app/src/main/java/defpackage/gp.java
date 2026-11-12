package defpackage;

import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.UUID;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(a23 a23Var, d23 d23Var, rd1 rd1Var, kc1 kc1Var) {
        super(0);
        this.n = 3;
        this.o = d23Var;
        this.p = kc1Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i;
        long jA;
        yq1[] yq1VarArr;
        int i2 = 4;
        switch (this.n) {
            case 0:
                xb0 xb0Var = ((ip) this.o).a;
                hp hpVar = (hp) this.p;
                xb0Var.getClass();
                synchronized (xb0Var.c) {
                    if (xb0Var.d.remove(hpVar) && xb0Var.d.isEmpty()) {
                        xb0Var.d();
                    }
                    break;
                }
                return j15.a;
            case 1:
                sc5 sc5Var = (sc5) this.o;
                WorkDatabase workDatabase = sc5Var.c;
                workDatabase.getClass();
                workDatabase.s(new k6(13, sc5Var, (UUID) this.p));
                c64.b(sc5Var.b, sc5Var.c, sc5Var.e);
                return j15.a;
            case 2:
                String str = (String) this.o;
                sc5 sc5Var2 = (sc5) this.p;
                WorkDatabase workDatabase2 = sc5Var2.c;
                workDatabase2.getClass();
                workDatabase2.s(new v6(workDatabase2, str, sc5Var2, i2));
                c64.b(sc5Var2.b, workDatabase2, sc5Var2.e);
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                d23 d23Var = (d23) this.o;
                kc1 kc1Var = (kc1) this.p;
                for (a23 a23Var : (Iterable) d23Var.f.n.getValue()) {
                    if (rd1.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + a23Var + " due to fragment " + kc1Var + " viewmodel being cleared");
                    }
                    d23Var.b(a23Var);
                }
                return j15.a;
            case 4:
                rq1 rq1Var = (rq1) this.o;
                rq1Var.n.c(rq1Var, (pb4) ((jx3) this.p).n);
                return j15.a;
            case 5:
                try {
                    ((rq1) this.o).n.d((yq1) this.p);
                    break;
                } catch (IOException e) {
                    qg3 qg3Var = qg3.a;
                    qg3 qg3Var2 = qg3.a;
                    String str2 = "Http2Connection.Listener failure for " + ((rq1) this.o).p;
                    qg3Var2.getClass();
                    qg3.i(str2, 4, e);
                    try {
                        ((yq1) this.p).c(b21.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return j15.a;
            case 6:
                mq1 mq1Var = (mq1) this.o;
                pb4 pb4Var = (pb4) this.p;
                jx3 jx3Var = new jx3();
                rq1 rq1Var2 = mq1Var.o;
                synchronized (rq1Var2.J) {
                    synchronized (rq1Var2) {
                        try {
                            pb4 pb4Var2 = rq1Var2.E;
                            pb4 pb4Var3 = new pb4();
                            pb4Var2.getClass();
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & pb4Var2.a) != 0) {
                                    pb4Var3.b(i3, pb4Var2.b[i3]);
                                }
                            }
                            for (int i4 = 0; i4 < 10; i4++) {
                                if (((1 << i4) & pb4Var.a) != 0) {
                                    pb4Var3.b(i4, pb4Var.b[i4]);
                                }
                            }
                            jx3Var.n = pb4Var3;
                            jA = ((long) pb4Var3.a()) - ((long) pb4Var2.a());
                            yq1VarArr = (jA == 0 || rq1Var2.o.isEmpty()) ? null : (yq1[]) rq1Var2.o.values().toArray(new yq1[0]);
                            pb4 pb4Var4 = (pb4) jx3Var.n;
                            pb4Var4.getClass();
                            rq1Var2.E = pb4Var4;
                            fr4.c(rq1Var2.w, rq1Var2.p + " onSettings", new gp(i2, rq1Var2, jx3Var));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rq1Var2.J.b((pb4) jx3Var.n);
                    } catch (IOException e2) {
                        rq1Var2.f(e2);
                    }
                    break;
                }
                if (yq1VarArr != null) {
                    for (yq1 yq1Var : yq1VarArr) {
                        synchronized (yq1Var) {
                            yq1Var.e += jA;
                            if (jA > 0) {
                                yq1Var.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return j15.a;
            default:
                ((d23) this.o).e((a23) this.p);
                return j15.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp(int i, Object obj, Object obj2) {
        super(0);
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(d23 d23Var, a23 a23Var, boolean z) {
        super(0);
        this.n = 7;
        this.o = d23Var;
        this.p = a23Var;
    }
}
