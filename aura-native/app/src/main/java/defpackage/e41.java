package defpackage;

import android.media.MediaFormat;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e41 implements c55, uy, rk3 {
    public e41() {
        super();
    }

    public c55 n;
    public uy o;
    public c55 p;
    public uy q;

    @Override // defpackage.uy
    public final void a(long j, float[] fArr) {
        uy uyVar = this.q;
        if (uyVar != null) {
            uyVar.a(j, fArr);
        }
        uy uyVar2 = this.o;
        if (uyVar2 != null) {
            uyVar2.a(j, fArr);
        }
    }

    @Override // defpackage.uy
    public final void b() {
        uy uyVar = this.q;
        if (uyVar != null) {
            uyVar.b();
        }
        uy uyVar2 = this.o;
        if (uyVar2 != null) {
            uyVar2.b();
        }
    }

    @Override // defpackage.rk3
    public final void c(int i, Object obj) {
        if (i == 7) {
            this.n = (c55) obj;
            return;
        }
        if (i == 8) {
            this.o = (uy) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        sj4 sj4Var = (sj4) obj;
        if (sj4Var == null) {
            this.p = null;
            this.q = null;
        } else {
            this.p = sj4Var.getVideoFrameMetadataListener();
            this.q = sj4Var.getCameraMotionListener();
        }
    }

    @Override // defpackage.c55
    public final void d(long j, long j2, tb1 tb1Var, MediaFormat mediaFormat) {
        c55 c55Var = this.p;
        if (c55Var != null) {
            c55Var.d(j, j2, tb1Var, mediaFormat);
        }
        c55 c55Var2 = this.n;
        if (c55Var2 != null) {
            c55Var2.d(j, j2, tb1Var, mediaFormat);
        }
    }
}
