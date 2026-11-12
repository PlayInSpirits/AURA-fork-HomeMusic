package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bj4 implements im {
    public int b;
    public float c;
    public float d;
    public gm e;
    public gm f;
    public gm g;
    public gm h;
    public boolean i;
    public aj4 j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.im
    public final boolean b() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.im
    public final boolean c() {
        if (this.o) {
            aj4 aj4Var = this.j;
            if (aj4Var != null) {
                rr2.w(aj4Var.k >= 0);
                if (aj4Var.i.o() * aj4Var.k * aj4Var.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.im
    public final ByteBuffer d() {
        aj4 aj4Var = this.j;
        if (aj4Var != null) {
            zi4 zi4Var = aj4Var.i;
            int i = aj4Var.b;
            rr2.w(aj4Var.k >= 0);
            int iO = zi4Var.o() * aj4Var.k * i;
            if (iO > 0) {
                if (this.k.capacity() < iO) {
                    this.k = ByteBuffer.allocateDirect(iO).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                rr2.w(aj4Var.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (zi4Var.o() * i), aj4Var.k);
                zi4Var.b(iMin, byteBuffer);
                aj4Var.k -= iMin;
                System.arraycopy(zi4Var.i(), iMin * i, zi4Var.i(), 0, aj4Var.k * i);
                this.k.flip();
                this.n += (long) iO;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = im.a;
        return byteBuffer2;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            aj4 aj4Var = this.j;
            aj4Var.getClass();
            this.m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = aj4Var.b;
            zi4 zi4Var = aj4Var.i;
            int iO = iRemaining / (zi4Var.o() * i);
            zi4Var.p(iO);
            zi4Var.a(iRemaining, byteBuffer);
            aj4Var.j += iO;
            aj4Var.b();
        }
    }

    @Override // defpackage.im
    public final gm f(gm gmVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i = gmVar.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(gmVar);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = gmVar.a;
        }
        this.e = gmVar;
        gm gmVar2 = new gm(i2, gmVar.b, i);
        this.f = gmVar2;
        this.i = true;
        return gmVar2;
    }

    @Override // defpackage.im
    public final void flush() {
        if (b()) {
            gm gmVar = this.e;
            this.g = gmVar;
            gm gmVar2 = this.f;
            this.h = gmVar2;
            if (this.i) {
                this.j = new aj4(gmVar.a, gmVar.b, this.c, this.d, gmVar2.a, gmVar.c == 4);
            } else {
                aj4 aj4Var = this.j;
                if (aj4Var != null) {
                    aj4Var.j = 0;
                    aj4Var.k = 0;
                    aj4Var.l = 0;
                    aj4Var.m = 0;
                    aj4Var.n = 0;
                    aj4Var.o = 0;
                    aj4Var.p = 0;
                    aj4Var.q = 0.0d;
                    aj4Var.i.flush();
                }
            }
        }
        this.l = im.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // defpackage.im
    public final void g() {
        aj4 aj4Var = this.j;
        if (aj4Var != null) {
            int i = aj4Var.j;
            float f = aj4Var.c;
            float f2 = aj4Var.d;
            double d = f / f2;
            double d2 = aj4Var.e * f2;
            int i2 = aj4Var.o;
            int i3 = aj4Var.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + aj4Var.q) + ((double) aj4Var.l)) / d2) + 0.5d));
            aj4Var.q = 0.0d;
            zi4 zi4Var = aj4Var.i;
            int i4 = aj4Var.h * 2;
            zi4Var.p(i4 + i);
            zi4Var.d(i * aj4Var.b, i4);
            aj4Var.j = i4 + aj4Var.j;
            aj4Var.b();
            if (aj4Var.k > i3) {
                aj4Var.k = Math.max(i3, 0);
            }
            aj4Var.j = 0;
            aj4Var.o = 0;
            aj4Var.l = 0;
        }
        this.o = true;
    }

    @Override // defpackage.im
    public final long h(long j) {
        if (this.n < 1024) {
            return (long) (j / ((double) this.c));
        }
        long j2 = this.m;
        aj4 aj4Var = this.j;
        aj4Var.getClass();
        long jO = j2 - ((long) (aj4Var.i.o() * (aj4Var.j * aj4Var.b)));
        int i = this.h.a;
        int i2 = this.g.a;
        long j3 = this.n;
        return i == i2 ? f35.a0(j, j3, jO, RoundingMode.DOWN) : f35.a0(j, j3 * ((long) i2), jO * ((long) i), RoundingMode.DOWN);
    }

    @Override // defpackage.im
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        gm gmVar = gm.e;
        this.e = gmVar;
        this.f = gmVar;
        this.g = gmVar;
        this.h = gmVar;
        ByteBuffer byteBuffer = im.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
