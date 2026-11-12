package defpackage;

import android.os.Handler;
import androidx.media3.decoder.ffmpeg.b;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements rm {
    public final /* synthetic */ b n;

    public aj0(b r1) {
        this.n = r1;
    }

    @Override // defpackage.rm
    public final void a(long r4) {
        b r3 = this.n;
        r3.d0 = true;
        xc5 r5 = r3.F;
        Handler r0 = (Handler) r5.o;
        if (r0 == null) goto L6;
        r0.post(new mm(r5, r4, 0));
        return;
    }

    @Override // defpackage.rm
    public final void b(int r4) {
        xc5 r3 = this.n.F;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new ul(r4, 1, r3));
        return;
    }

    @Override // defpackage.rm
    public final void d(boolean r4) {
        xc5 r3 = this.n.F;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new pm(r3, r4, 0));
        return;
    }

    @Override // defpackage.rm
    public final void f(pa r4) {
        xc5 r3 = this.n.F;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new nm(r3, r4, 0));
        return;
    }

    @Override // defpackage.rm
    public final void g(Exception r4) {
        l93.G("DecoderAudioRenderer", "Audio sink error", r4);
        xc5 r3 = this.n.F;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new jm(r3, r4, 1));
        return;
    }

    @Override // defpackage.rm
    public final void j(pa r4) {
        xc5 r3 = this.n.F;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new nm(r3, r4, 1));
        return;
    }

    @Override // defpackage.rm
    public final void n() {
        this.n.c0 = true;
    }

    @Override // defpackage.rm
    public final void q(int r9, long r10, long r12) {
        xc5 r1 = this.n.F;
        Handler r8 = (Handler) r1.o;
        if (r8 == null) goto L6;
        r8.post(new lm(r1, r9, r10, r12, 0));
        return;
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
