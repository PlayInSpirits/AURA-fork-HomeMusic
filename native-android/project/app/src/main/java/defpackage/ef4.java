package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ef4 implements q44 {
    public int n;
    public boolean o;
    public final /* synthetic */ gf4 p;

    public ef4(gf4 gf4Var) {
        this.p = gf4Var;
    }

    public final void a() {
        if (this.o) {
            return;
        }
        gf4 gf4Var = this.p;
        ue1 ue1Var = gf4Var.r;
        ue1Var.i(new bt2(ue1Var, new un2(1, lw2.h(gf4Var.w.n), gf4Var.w, 0, null, f35.i0(0L), -9223372036854775807L)));
        this.o = true;
    }

    @Override // defpackage.q44
    public final boolean c() {
        return this.p.y;
    }

    @Override // defpackage.q44
    public final void s() throws IOException {
        gf4 gf4Var = this.p;
        if (gf4Var.x) {
            return;
        }
        i61 i61Var = gf4Var.v;
        IOException iOException = (IOException) i61Var.q;
        if (iOException != null) {
            throw iOException;
        }
        id2 id2Var = (id2) i61Var.p;
        if (id2Var != null) {
            int i = id2Var.n;
            IOException iOException2 = id2Var.r;
            if (iOException2 != null && id2Var.s > i) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.q44
    public final int t(gp3 gp3Var, cj0 cj0Var, int i) {
        a();
        gf4 gf4Var = this.p;
        boolean z = gf4Var.y;
        if (z && gf4Var.z == null) {
            this.n = 2;
        }
        int i2 = this.n;
        if (i2 == 2) {
            cj0Var.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            gp3Var.p = gf4Var.w;
            this.n = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        gf4Var.z.getClass();
        cj0Var.a(1);
        cj0Var.t = 0L;
        if ((i & 4) == 0) {
            cj0Var.t(gf4Var.A);
            cj0Var.r.put(gf4Var.z, 0, gf4Var.A);
        }
        if ((i & 1) == 0) {
            this.n = 2;
        }
        return -4;
    }

    @Override // defpackage.q44
    public final int u(long j) {
        a();
        if (j <= 0 || this.n == 2) {
            return 0;
        }
        this.n = 2;
        return 1;
    }
}
