package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bq1 implements ej4 {
    public final cc1 n;
    public boolean o;
    public final /* synthetic */ hq1 p;

    public bq1(hq1 hq1Var) {
        this.p = hq1Var;
        this.n = new cc1(((fw) hq1Var.d).timeout());
    }

    public final void b() {
        hq1 hq1Var = this.p;
        int i = hq1Var.a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            zr2.c(hq1Var.a, "state: ");
            return;
        }
        cc1 cc1Var = this.n;
        fu4 fu4Var = cc1Var.e;
        cc1Var.e = fu4.d;
        fu4Var.a();
        fu4Var.b();
        hq1Var.a = 6;
    }

    @Override // defpackage.ej4
    public long read(tv tvVar, long j) throws IOException {
        hq1 hq1Var = this.p;
        tvVar.getClass();
        try {
            return ((fw) hq1Var.d).read(tvVar, j);
        } catch (IOException e) {
            ((q21) hq1Var.c).a();
            b();
            throw e;
        }
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n;
    }
}
