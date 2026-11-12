package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr3 implements q44 {
    public final int n;
    public final /* synthetic */ hr3 o;

    public fr3(hr3 hr3Var, int i) {
        this.o = hr3Var;
        this.n = i;
    }

    @Override // defpackage.q44
    public final boolean c() {
        hr3 hr3Var = this.o;
        return !hr3Var.G() && hr3Var.I[this.n].s(hr3Var.c0);
    }

    @Override // defpackage.q44
    public final void s() throws IOException {
        int i = this.n;
        hr3 hr3Var = this.o;
        p44 p44Var = hr3Var.I[i];
        pw0 pw0Var = p44Var.h;
        if (pw0Var != null && pw0Var.getState() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionG = p44Var.h.g();
            drmSession$DrmSessionExceptionG.getClass();
            throw drmSession$DrmSessionExceptionG;
        }
        i61 i61Var = hr3Var.z;
        int iD = hr3Var.q.D(hr3Var.S);
        IOException iOException = (IOException) i61Var.q;
        if (iOException != null) {
            throw iOException;
        }
        id2 id2Var = (id2) i61Var.p;
        if (id2Var != null) {
            if (iD == Integer.MIN_VALUE) {
                iD = id2Var.n;
            }
            IOException iOException2 = id2Var.r;
            if (iOException2 != null && id2Var.s > iD) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.q44
    public final int t(gp3 gp3Var, cj0 cj0Var, int i) {
        hr3 hr3Var = this.o;
        if (hr3Var.G()) {
            return -3;
        }
        int i2 = this.n;
        hr3Var.B(i2);
        int iW = hr3Var.I[i2].w(gp3Var, cj0Var, i, hr3Var.c0);
        if (iW == -3) {
            hr3Var.C(i2);
        }
        return iW;
    }

    @Override // defpackage.q44
    public final int u(long j) {
        hr3 hr3Var = this.o;
        if (hr3Var.G()) {
            return 0;
        }
        int i = this.n;
        hr3Var.B(i);
        p44 p44Var = hr3Var.I[i];
        int iQ = p44Var.q(hr3Var.c0, j);
        p44Var.A(iQ);
        if (iQ == 0) {
            hr3Var.C(i);
        }
        return iQ;
    }
}
