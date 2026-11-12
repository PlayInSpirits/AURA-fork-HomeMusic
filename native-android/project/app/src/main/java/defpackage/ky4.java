package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ky4 extends fp {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.fp
    public final gm a(gm r2) {
        if (f35.L(r2.c) == false) goto L13;
        this.k = true;
        if (this.i == 0) goto L7;
    L11:
        return r2;
    L7:
        if (this.j != 0) goto L11;
        return gm.e;
    L13:
        throw new AudioProcessor$UnhandledAudioFormatException(r2);
    }

    @Override // defpackage.fp, defpackage.im
    public final boolean c() {
        if (super.c() == true) goto L5;
        return false;
    L5:
        if (this.n != 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.fp, defpackage.im
    public final ByteBuffer d() {
        if (super.c() == false) goto L8;
        int r0 = this.n;
        if (r0 <= 0) goto L8;
        l(r0).put(this.m, 0, this.n).flip();
        this.n = 0;
    L8:
        return super.d();
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r9) {
        int r0 = r9.position();
        int r1 = r9.limit();
        int r2 = r1 - r0;
        if (r2 == 0) goto L10;
        int r3 = Math.min(r2, this.l);
        this.o += (long) (r3 / this.b.d);
        this.l -= r3;
        r9.position(r0 + r3);
        if (this.l <= 0) goto L8;
        return;
    L8:
        int r4 = r2 - r3;
        int r5 = (this.n + r4) - this.m.length;
        ByteBuffer r6 = l(r5);
        int r7 = f35.j(r5, 0, this.n);
        r6.put(this.m, 0, r7);
        int r8 = f35.j(r5 - r7, 0, r4);
        r9.limit(r9.position() + r8);
        r6.put(r9);
        r9.limit(r1);
        int r10 = r4 - r8;
        int r11 = this.n - r7;
        this.n = r11;
        byte[] r12 = this.m;
        System.arraycopy(r12, r7, r12, 0, r11);
        r9.get(this.m, this.n, r10);
        this.n += r10;
        r6.flip();
        return;
    }

    @Override // defpackage.im
    public final long h(long r3) {
        return Math.max(0, r3 - f35.Y(this.b.a, this.j + this.i));
    }

    @Override // defpackage.fp
    public final void i() {
        if (this.k == false) goto L5;
        this.k = false;
        int r0 = this.j;
        int r2 = this.b.d;
        this.m = new byte[r0 * r2];
        this.l = this.i * r2;
    L5:
        this.n = 0;
    }

    @Override // defpackage.fp
    public final void j() {
        if (this.k == false) goto L9;
        int r0 = this.n;
        if (r0 <= 0) goto L7;
        this.o += (long) (r0 / this.b.d);
    L7:
        this.n = 0;
        return;
    }

    @Override // defpackage.fp
    public final void k() {
        this.m = f35.b;
    }
}
