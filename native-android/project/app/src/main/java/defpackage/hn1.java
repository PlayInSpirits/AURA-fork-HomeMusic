package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 implements q44 {
    public final int n;
    public final ln1 o;
    public int p = -1;

    public hn1(ln1 ln1Var, int i) {
        this.o = ln1Var;
        this.n = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void a() {
        rr2.l(this.p == -1);
        ln1 ln1Var = this.o;
        ln1Var.v();
        ln1Var.X.getClass();
        int[] iArr = ln1Var.X;
        int i = this.n;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = ln1Var.a0;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (ln1Var.W.contains(ln1Var.V.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.p = i2;
    }

    public final boolean b() {
        int i = this.p;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.q44
    public final boolean c() {
        if (this.p == -3) {
            return true;
        }
        if (!b()) {
            return false;
        }
        int i = this.p;
        ln1 ln1Var = this.o;
        return !ln1Var.E() && ln1Var.I[i].s(ln1Var.g0);
    }

    @Override // defpackage.q44
    public final void s() throws IOException {
        int i = this.p;
        ln1 ln1Var = this.o;
        if (i == -2) {
            ln1Var.v();
            throw new SampleQueueMappingException(xa3.h("Unable to bind a sample queue to TrackGroup with MIME type ", ln1Var.V.a(this.n).d[0].n, "."));
        }
        if (i == -1) {
            ln1Var.G();
            return;
        }
        if (i != -3) {
            ln1Var.G();
            kn1 kn1Var = ln1Var.I[i];
            pw0 pw0Var = kn1Var.h;
            if (pw0Var == null || pw0Var.getState() != 1) {
                return;
            }
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionG = kn1Var.h.g();
            drmSession$DrmSessionExceptionG.getClass();
            throw drmSession$DrmSessionExceptionG;
        }
    }

    @Override // defpackage.q44
    public final int t(gp3 gp3Var, cj0 cj0Var, int i) {
        tb1 tb1Var;
        if (this.p == -3) {
            cj0Var.a(4);
            return -4;
        }
        if (b()) {
            int i2 = this.p;
            ln1 ln1Var = this.o;
            ArrayList arrayList = ln1Var.A;
            if (!ln1Var.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((nm1) arrayList.get(i4)).k;
                        int length = ln1Var.I.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (ln1Var.a0[i6] && ln1Var.I[i6].v() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    f35.X(arrayList, 0, i4);
                    nm1 nm1Var = (nm1) arrayList.get(0);
                    tb1 tb1Var2 = nm1Var.d;
                    if (!tb1Var2.equals(ln1Var.T)) {
                        ue1 ue1Var = ln1Var.x;
                        ue1Var.i(new bt2(ue1Var, new un2(1, ln1Var.o, tb1Var2, nm1Var.e, nm1Var.f, f35.i0(nm1Var.g), -9223372036854775807L)));
                    }
                    ln1Var.T = tb1Var2;
                }
                if (arrayList.isEmpty() || ((nm1) arrayList.get(0)).f()) {
                    int iW = ln1Var.I[i2].w(gp3Var, cj0Var, i, ln1Var.g0);
                    if (iW == -5) {
                        tb1 tb1VarD = (tb1) gp3Var.p;
                        tb1VarD.getClass();
                        if (i2 == ln1Var.O) {
                            int iM = jz4.m(ln1Var.I[i2].v());
                            while (i3 < arrayList.size() && ((nm1) arrayList.get(i3)).k != iM) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                tb1Var = ((nm1) arrayList.get(i3)).d;
                            } else {
                                tb1Var = ln1Var.S;
                                tb1Var.getClass();
                            }
                            tb1VarD = tb1VarD.d(tb1Var);
                        }
                        gp3Var.p = tb1VarD;
                    }
                    return iW;
                }
            }
        }
        return -3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    @Override // defpackage.q44
    public final int u(long j) {
        Object next;
        Object obj;
        if (!b()) {
            return 0;
        }
        int i = this.p;
        ln1 ln1Var = this.o;
        if (ln1Var.E()) {
            return 0;
        }
        kn1 kn1Var = ln1Var.I[i];
        int iQ = kn1Var.q(ln1Var.g0, j);
        ArrayList arrayList = ln1Var.A;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            } else {
                obj = null;
            }
        } else if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        nm1 nm1Var = (nm1) obj;
        if (nm1Var != null && !nm1Var.f()) {
            iQ = Math.min(iQ, nm1Var.e(i) - kn1Var.o());
        }
        kn1Var.A(iQ);
        return iQ;
    }
}
