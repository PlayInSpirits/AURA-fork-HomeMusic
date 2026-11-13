package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cq1 implements of4 {
    public final cc1 n;
    public boolean o;
    public final /* synthetic */ hq1 p;

    public cq1(hq1 hq1Var) {
        this.p = hq1Var;
        this.n = new cc1(((ew) hq1Var.e).timeout());
    }

    @Override // defpackage.of4
    public final void L(tv tvVar, long j) {
        ew ewVar = (ew) this.p.e;
        if (this.o) {
            kf2.o("closed");
        } else {
            if (j == 0) {
                return;
            }
            ewVar.C(j);
            ewVar.y("\r\n");
            ewVar.L(tvVar, j);
            ewVar.y("\r\n");
        }
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.o) {
            return;
        }
        this.o = true;
        ((ew) this.p.e).y("0\r\n\r\n");
        cc1 cc1Var = this.n;
        fu4 fu4Var = cc1Var.e;
        cc1Var.e = fu4.d;
        fu4Var.a();
        fu4Var.b();
        this.p.a = 3;
    }

    @Override // defpackage.of4, java.io.Flushable
    public final synchronized void flush() {
        if (this.o) {
            return;
        }
        ((ew) this.p.e).flush();
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n;
    }
}
