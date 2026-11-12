package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yv2 extends kq implements Handler.Callback {
    public final rv2 F;
    public final xv2 G;
    public final Handler H;
    public final uv2 I;
    public zz1 J;
    public boolean K;
    public boolean L;
    public long M;
    public qv2 N;
    public long O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv2(xv2 xv2Var, Looper looper) {
        Handler handler;
        super(5);
        rv2 rv2Var = rv2.o;
        this.G = xv2Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = f35.a;
            handler = new Handler(looper, this);
        }
        this.H = handler;
        this.F = rv2Var;
        this.I = new uv2(1, 0);
        this.O = -9223372036854775807L;
    }

    @Override // defpackage.kq
    public final void A(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.K && this.N == null) {
                uv2 uv2Var = this.I;
                uv2Var.r();
                gp3 gp3Var = this.p;
                gp3Var.d();
                int iZ = z(gp3Var, uv2Var, 0);
                if (iZ == -4) {
                    if (uv2Var.d(4)) {
                        this.K = true;
                    } else if (uv2Var.t >= this.y) {
                        uv2Var.x = this.M;
                        uv2Var.u();
                        zz1 zz1Var = this.J;
                        String str = f35.a;
                        qv2 qv2VarJ = zz1Var.j(uv2Var);
                        if (qv2VarJ != null) {
                            ArrayList arrayList = new ArrayList(qv2VarJ.a.length);
                            H(qv2VarJ, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.N = new qv2(I(uv2Var.t), (pv2[]) arrayList.toArray(new pv2[0]));
                            }
                        }
                    }
                } else if (iZ == -5) {
                    tb1 tb1Var = (tb1) gp3Var.p;
                    tb1Var.getClass();
                    this.M = tb1Var.s;
                }
            }
            qv2 qv2Var = this.N;
            if (qv2Var == null || qv2Var.b > I(j)) {
                z = false;
            } else {
                qv2 qv2Var2 = this.N;
                Handler handler = this.H;
                if (handler != null) {
                    handler.obtainMessage(1, qv2Var2).sendToTarget();
                } else {
                    this.G.h(qv2Var2);
                }
                this.N = null;
                z = true;
            }
            if (this.K && this.N == null) {
                this.L = true;
            }
        }
    }

    @Override // defpackage.kq
    public final int E(tb1 tb1Var) {
        if (this.F.p(tb1Var)) {
            return kq.a(tb1Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return kq.a(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void H(qv2 qv2Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            pv2[] pv2VarArr = qv2Var.a;
            if (i >= pv2VarArr.length) {
                return;
            }
            tb1 tb1VarA = pv2VarArr[i].a();
            if (tb1VarA != null) {
                rv2 rv2Var = this.F;
                if (rv2Var.p(tb1VarA)) {
                    zz1 zz1VarH = rv2Var.h(tb1VarA);
                    byte[] bArrC = pv2VarArr[i].c();
                    bArrC.getClass();
                    uv2 uv2Var = this.I;
                    uv2Var.r();
                    uv2Var.t(bArrC.length);
                    uv2Var.r.put(bArrC);
                    uv2Var.u();
                    qv2 qv2VarJ = zz1VarH.j(uv2Var);
                    if (qv2VarJ != null) {
                        H(qv2VarJ, arrayList);
                    }
                } else {
                    arrayList.add(pv2VarArr[i]);
                }
            } else {
                arrayList.add(pv2VarArr[i]);
            }
            i++;
        }
    }

    public final long I(long j) {
        rr2.w(j != -9223372036854775807L);
        rr2.w(this.O != -9223372036854775807L);
        return j - this.O;
    }

    @Override // defpackage.kq
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            tb4.a();
            return false;
        }
        this.G.h((qv2) message.obj);
        return true;
    }

    @Override // defpackage.kq
    public final boolean m() {
        return this.L;
    }

    @Override // defpackage.kq
    public final boolean o() {
        return true;
    }

    @Override // defpackage.kq
    public final void p() {
        this.N = null;
        this.J = null;
        this.O = -9223372036854775807L;
    }

    @Override // defpackage.kq
    public final void r(long j, boolean z, boolean z2) {
        this.N = null;
        this.K = false;
        this.L = false;
    }

    @Override // defpackage.kq
    public final void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
        this.J = this.F.h(tb1VarArr[0]);
        qv2 qv2Var = this.N;
        if (qv2Var != null) {
            long j3 = qv2Var.b;
            long j4 = (this.O + j3) - j2;
            if (j3 != j4) {
                qv2Var = new qv2(j4, qv2Var.a);
            }
            this.N = qv2Var;
        }
        this.O = j2;
    }
}
