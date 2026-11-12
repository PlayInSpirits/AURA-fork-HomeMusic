package defpackage;

import com.eddyizm.tempus.homemusic.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ qi3 o;

    public /* synthetic */ at1(qi3 qi3Var, int i) {
        this.n = i;
        this.o = qi3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        qi3 qi3Var = this.o;
        switch (i) {
            case 0:
                a.g(qi3Var);
                qi3Var.s(false);
                ud3.y0(false);
                a.c();
                break;
            default:
                qi3Var.R(1.0f);
                break;
        }
    }
}
