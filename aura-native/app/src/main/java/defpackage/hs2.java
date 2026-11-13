package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class hs2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ al3 o;
    public final /* synthetic */ int p;

    public /* synthetic */ hs2(al3 al3Var, int i, int i2) {
        this.n = i2;
        this.o = al3Var;
        this.p = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = this.p;
        al3 al3Var = this.o;
        switch (i) {
            case 0:
                if (al3Var.S0(25) || al3Var.S0(33)) {
                    if (!al3Var.S0(33)) {
                        al3Var.G0(i2);
                        break;
                    } else {
                        al3Var.H(i2, 1);
                        break;
                    }
                }
                break;
            default:
                if (al3Var.S0(26) || al3Var.S0(34)) {
                    if (i2 == -100) {
                        if (!al3Var.S0(34)) {
                            al3Var.q0(true);
                            break;
                        } else {
                            al3Var.E(1, true);
                            break;
                        }
                    } else if (i2 == -1) {
                        if (!al3Var.S0(34)) {
                            al3Var.G();
                            break;
                        } else {
                            al3Var.d0(1);
                            break;
                        }
                    } else if (i2 == 1) {
                        if (!al3Var.S0(34)) {
                            al3Var.C0();
                            break;
                        } else {
                            al3Var.J(1);
                            break;
                        }
                    } else if (i2 == 100) {
                        if (!al3Var.S0(34)) {
                            al3Var.q0(false);
                            break;
                        } else {
                            al3Var.E(1, false);
                            break;
                        }
                    } else if (i2 == 101) {
                        if (!al3Var.S0(34)) {
                            al3Var.q0(!al3Var.b1());
                            break;
                        } else {
                            al3Var.E(1, !al3Var.b1());
                            break;
                        }
                    } else {
                        xa3.m(i2, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                        break;
                    }
                }
                break;
        }
    }
}
