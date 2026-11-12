package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy extends kq {
    public final cj0 F;
    public final be3 G;
    public uy H;
    public long I;

    public vy() {
        super(6);
        this.F = new cj0(1, 0);
        this.G = new be3();
    }

    @Override // defpackage.kq
    public final void A(long j, long j2) {
        float[] fArr;
        while (!l() && this.I < 100000 + j) {
            cj0 cj0Var = this.F;
            cj0Var.r();
            gp3 gp3Var = this.p;
            gp3Var.d();
            if (z(gp3Var, cj0Var, 0) != -4 || cj0Var.d(4)) {
                return;
            }
            long j3 = cj0Var.t;
            this.I = j3;
            boolean z = j3 < this.y;
            if (this.H != null && !z) {
                cj0Var.u();
                ByteBuffer byteBuffer = cj0Var.r;
                String str = f35.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    be3 be3Var = this.G;
                    be3Var.L(iLimit, bArrArray);
                    be3Var.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(be3Var.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.H.a(this.I - this.x, fArr);
                }
            }
        }
    }

    @Override // defpackage.kq
    public final int E(tb1 tb1Var) {
        return "application/x-camera-motion".equals(tb1Var.n) ? kq.a(4, 0, 0, 0) : kq.a(0, 0, 0, 0);
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int i, Object obj) {
        if (i == 8) {
            this.H = (uy) obj;
        }
    }

    @Override // defpackage.kq
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.kq
    public final boolean m() {
        return l();
    }

    @Override // defpackage.kq
    public final boolean o() {
        return true;
    }

    @Override // defpackage.kq
    public final void p() {
        uy uyVar = this.H;
        if (uyVar != null) {
            uyVar.b();
        }
    }

    @Override // defpackage.kq
    public final void r(long j, boolean z, boolean z2) {
        this.I = Long.MIN_VALUE;
        uy uyVar = this.H;
        if (uyVar != null) {
            uyVar.b();
        }
    }
}
