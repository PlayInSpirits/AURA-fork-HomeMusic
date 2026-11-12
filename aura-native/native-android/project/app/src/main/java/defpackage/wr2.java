package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wr2 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ tn2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr2(tn2 tn2Var, Looper looper) {
        super(looper);
        this.c = tn2Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fr2 fr2Var;
        int iS;
        tn2 tn2Var = this.c;
        kt2 kt2Var = tn2Var.g;
        if (message.what != 1) {
            zr2.c(message.what, "Invalid message what=");
            return;
        }
        lk3 lk3VarN = tn2Var.r.n(tn2Var.s.Z0(), tn2Var.s.X0(), tn2Var.r.k);
        tn2Var.r = lk3VarN;
        boolean z = this.a;
        boolean z2 = this.b;
        lk3 lk3VarX = kt2Var.X(lk3VarN);
        na4 na4Var = kt2Var.f;
        yw1 yw1VarU = na4Var.u();
        for (int i = 0; i < yw1VarU.size(); i++) {
            fr2 fr2Var2 = (fr2) yw1VarU.get(i);
            try {
                yk ykVarC = na4Var.C(fr2Var2);
                if (ykVarC != null) {
                    iS = ykVarC.s();
                } else if (!tn2Var.j(fr2Var2)) {
                    break;
                } else {
                    iS = 0;
                }
                lk3 lk3VarB = na4Var.B(fr2Var2);
                if (lk3VarB == null) {
                    na4Var.A(fr2Var2);
                    mi3 mi3VarD = ju2.d(na4Var.t(fr2Var2), tn2Var.s.o());
                    fr2Var = fr2Var2;
                    try {
                        er2 er2Var = fr2Var.d;
                        er2Var.getClass();
                        try {
                            er2Var.A(iS, lk3VarB == null ? lk3VarX : lk3VarB, mi3VarD, z, z2);
                        } catch (DeadObjectException unused) {
                            kt2Var.f.N(fr2Var);
                        } catch (RemoteException e) {
                            e = e;
                            l93.r0("MediaSessionImpl", "Exception in " + fr2Var, e);
                        }
                    } catch (DeadObjectException unused2) {
                        fr2Var = fr2Var;
                    } catch (RemoteException e2) {
                        e = e2;
                        fr2Var = fr2Var;
                    }
                }
            } catch (DeadObjectException unused3) {
                fr2Var = fr2Var2;
            } catch (RemoteException e3) {
                e = e3;
                fr2Var = fr2Var2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
