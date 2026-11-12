package defpackage;

import android.os.Handler;
import androidx.media3.decoder.ffmpeg.b;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements rm {
    public final /* synthetic */ b n;

    public aj0(b bVar) {
        this.n = bVar;
    }

    @Override // defpackage.rm
    public final void a(long j) {
        b bVar = this.n;
        bVar.d0 = true;
        xc5 xc5Var = bVar.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new mm(xc5Var, j, 0));
        }
    }

    @Override // defpackage.rm
    public final void b(int i) {
        xc5 xc5Var = this.n.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new ul(i, 1, xc5Var));
        }
    }

    @Override // defpackage.rm
    public final void d(boolean z) {
        xc5 xc5Var = this.n.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new pm(xc5Var, z, 0));
        }
    }

    @Override // defpackage.rm
    public final void f(pa paVar) {
        xc5 xc5Var = this.n.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new nm(xc5Var, paVar, 0));
        }
    }

    @Override // defpackage.rm
    public final void g(Exception exc) {
        l93.G("DecoderAudioRenderer", "Audio sink error", exc);
        xc5 xc5Var = this.n.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new jm(xc5Var, exc, 1));
        }
    }

    @Override // defpackage.rm
    public final void j(pa paVar) {
        xc5 xc5Var = this.n.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new nm(xc5Var, paVar, 1));
        }
    }

    @Override // defpackage.rm
    public final void n() {
        this.n.c0 = true;
    }

    @Override // defpackage.rm
    public final void q(int i, long j, long j2) {
        xc5 xc5Var = this.n.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new lm(xc5Var, i, j, j2, 0));
        }
    }

    @Override // defpackage.rm
    public final void s() {
        this.n.t();
    }

    @Override // defpackage.rm
    public final void u() {
        this.n.W = true;
    }
}
