package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dw1 extends kq {
    public final vj F;
    public final cj0 G;
    public final ArrayDeque H;
    public boolean I;
    public boolean J;
    public bw1 K;
    public long L;
    public long M;
    public int N;
    public int O;
    public tb1 P;
    public us Q;
    public cj0 R;
    public ImageOutput S;
    public Bitmap T;
    public boolean U;
    public cw1 V;
    public cw1 W;
    public int X;
    public boolean Y;

    public dw1(vj r4) {
        super(4);
        this.F = r4;
        this.S = ImageOutput.a;
        this.G = new cj0(0, 0);
        this.K = bw1.c;
        this.H = new ArrayDeque();
        this.M = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.N = 0;
        this.O = 1;
    }

    @Override // defpackage.kq
    public final void A(long r4, long r6) {
        if (this.J == false) goto L6;
        return;
    L6:
        if (this.P != null) goto L15;
        gp3 r7 = this.p;
        r7.d();
        cj0 r8 = this.G;
        r8.r();
        int r0 = z(r7, r8, 2);
        if (r0 != (-5)) goto L11;
        tb1 r9 = (tb1) r7.p;
        r9.getClass();
        this.P = r9;
        this.Y = true;
        goto L15
    L11:
        if (r0 != (-4)) goto L33;
        rr2.w(r8.d(4));
        this.I = true;
        this.J = true;
        return;
    L33:
        return;
    L15:
        if (this.Q != null) goto L29;
        J();
    L29:
        Trace.beginSection("drainAndFeedDecoder");     // Catch: ImageDecoderException -> L26
    L19:
        if (H(r4) == true) goto L19;
    L22:
        if (I(r4) == true) goto L22;
        Trace.endSection();     // Catch: ImageDecoderException -> L26
        return;
    L26:
        e = move-exception;
        throw b(e, null, false, 4003);
    }

    @Override // defpackage.kq
    public final int E(tb1 r1) {
        this.F.getClass();
        return vj.b(r1);
    }

    public final boolean H(long r13) {
        Bitmap r0 = this.T;
        if (r0 == null) goto L8;
        if (this.V != null) goto L8;
    L77:
        return false;
    L8:
        if (this.O == 0) goto L10;
    L12:
        ArrayDeque r2 = this.H;
        if (r0 != null) goto L29;
        this.Q.getClass();
        ts r1 = (ts) this.Q.l();
        if (r1 == null) goto L77;
        if (r1.d(4) == true) goto L20;
        rr2.s(r1.s, "Non-EOS buffer came back from the decoder without bitmap.");
        this.T = r1.s;
        r1.s();
        goto L29
    L20:
        if (this.N != 3) goto L23;
        K();
        this.P.getClass();
        J();
        return false;
    L23:
        r1.s();
        if (r2.isEmpty() == false) goto L77;
        this.J = true;
        return false;
    L29:
        if (this.U == false) goto L77;
        if (this.T == null) goto L77;
        if (this.V == null) goto L77;
        this.P.getClass();
        tb1 r3 = this.P;
        int r6 = r3.M;
        int r4 = r3.N;
        if (r6 != 1) goto L38;
        if (r4 != 1) goto L38;
    L41:
        boolean r5 = false;
    L42:
        cw1 r7 = this.V;
        if (((Bitmap) r7.c) != null) goto L49;
        if (r5 == false) goto L47;
        int r8 = r7.a;
        this.T.getClass();
        int r9 = this.T.getWidth();
        tb1 r10 = this.P;
        r10.getClass();
        int r11 = r9 / r10.M;
        int r12 = this.T.getHeight();
        tb1 r14 = this.P;
        r14.getClass();
        int r15 = r12 / r14.N;
        int r16 = this.P.M;
        Bitmap r17 = Bitmap.createBitmap(this.T, (r8 % r16) * r11, (r8 / r16) * r15, r11, r15);
    L48:
        r7.c = r17;
        goto L49
    L47:
        r17 = this.T;
        r17.getClass();
    L49:
        Bitmap r18 = (Bitmap) this.V.c;
        r18.getClass();
        long r19 = this.V.b;
        long r110 = r19 - r13;
        if (this.u != 2) goto L52;
        boolean r20 = true;
    L53:
        int r21 = this.O;
        if (r21 == 0) goto L61;
        if (r21 == 1) goto L60;
        if (r21 != 3) goto L58;
        r20 = false;
        goto L61
    L58:
        tb4.a();
        return false;
    L60:
        r20 = true;
    L61:
        if (r20 == false) goto L63;
    L64:
        this.S.onImageAvailable(r19 - this.K.b, r18);
        cw1 r111 = this.V;
        r111.getClass();
        long r112 = r111.b;
        this.L = r112;
    L66:
        if (r2.isEmpty() == true) goto L70;
        if (r112 < ((bw1) r2.peek()).a) goto L70;
        this.K = (bw1) r2.removeFirst();
    L70:
        this.O = 3;
        if (r5 == false) goto L74;
        cw1 r113 = this.V;
        r113.getClass();
        int r114 = r113.a;
        tb1 r22 = this.P;
        r22.getClass();
        int r23 = r22.N;
        tb1 r24 = this.P;
        r24.getClass();
        if (r114 == ((r23 * r24.M) - 1)) goto L74;
    L75:
        this.V = this.W;
        this.W = null;
        return true;
    L74:
        this.T = null;
        goto L75
    L63:
        if (r110 >= 30000) goto L77;
    L52:
        r20 = false;
    L38:
        if (r6 == (-1)) goto L41;
        if (r4 == (-1)) goto L41;
        r5 = true;
        goto L42
    L10:
        if (this.u == 2) goto L12;
        goto L12
    }

    public final boolean I(long r13) {
        if (this.U == true) goto L5;
    L7:
        gp3 r0 = this.p;
        r0.d();
        us r2 = this.Q;
        if (r2 != null) goto L10;
    L93:
        return false;
    L10:
        if (this.N == 3) goto L93;
        if (this.I == true) goto L93;
        if (this.R != null) goto L19;
        cj0 r3 = (cj0) r2.e();
        this.R = r3;
        if (r3 == null) goto L93;
    L19:
        int r4 = this.N;
        cj0 r5 = this.R;
        if (r4 != 2) goto L23;
        r5.getClass();
        this.R.o = 4;
        us r14 = this.Q;
        r14.getClass();
        r14.m(this.R);
        this.R = null;
        this.N = 3;
        return false;
    L23:
        int r6 = z(r0, r5, 0);
        if (r6 != (-5)) goto L26;
        tb1 r15 = (tb1) r0.p;
        r15.getClass();
        this.P = r15;
        this.Y = true;
        this.N = 2;
        return true;
    L26:
        if (r6 != (-4)) goto L28;
        this.R.u();
        ByteBuffer r1 = this.R.r;
        if (r1 != null) goto L35;
    L36:
        cj0 r7 = this.R;
        r7.getClass();
        if (r7.d(4) == false) goto L39;
    L38:
        boolean r8 = true;
    L40:
        if (r8 == false) goto L42;
        cj0 r9 = this.R;
        r9.getClass();
        r9.p = this.P;
        us r10 = this.Q;
        r10.getClass();
        cj0 r11 = this.R;
        r11.getClass();
        r10.m(r11);
        this.X = 0;
    L42:
        cj0 r12 = this.R;
        r12.getClass();
        if (r12.d(4) == false) goto L45;
        this.U = true;
    L81:
        cj0 r16 = this.R;
        r16.getClass();
        if (r16.d(4) == false) goto L85;
        this.I = true;
        this.R = null;
        return false;
    L85:
        long r17 = this.M;
        cj0 r18 = this.R;
        r18.getClass();
        this.M = Math.max(r17, r18.t);
        if (r8 == false) goto L88;
        this.R = null;
    L90:
        return !this.U;
    L88:
        cj0 r19 = this.R;
        r19.getClass();
        r19.r();
        goto L90
    L45:
        int r20 = this.X;
        long r21 = r12.t;
        cw1 r22 = new cw1();
        r22.a = r20;
        r22.b = r21;
        this.W = r22;
        this.X = r20 + 1;
        if (this.U == false) goto L48;
    L80:
        this.V = this.W;
        this.W = null;
        goto L81
    L48:
        if ((r21 - 30000) <= r13) goto L50;
    L52:
        boolean r23 = false;
    L53:
        cw1 r24 = this.V;
        if (r24 != null) goto L56;
    L60:
        boolean r110 = false;
    L61:
        tb1 r111 = this.P;
        r111.getClass();
        if (r111.M == (-1)) goto L69;
        tb1 r112 = this.P;
        int r25 = r112.N;
        if (r25 == (-1)) goto L69;
        if (r20 == ((r25 * r112.M) - 1)) goto L69;
        boolean r113 = false;
    L70:
        if (r23 == true) goto L75;
        if (r110 == true) goto L75;
        if (r113 == true) goto L75;
        boolean r114 = false;
    L76:
        this.U = r114;
        if (r110 == false) goto L80;
        if (r23 == true) goto L80;
    L75:
        r114 = true;
    L69:
        r113 = true;
        goto L70
    L56:
        if (r24.b > r13) goto L60;
        if (r13 >= r21) goto L60;
        r110 = true;
        goto L61
    L50:
        if (r13 > (30000 + r21)) goto L52;
        r23 = true;
        goto L53
    L39:
        r8 = false;
        goto L40
    L35:
        if (r1.remaining() > 0) goto L38;
    L28:
        if (r6 == (-3)) goto L93;
        tb4.a();
        return false;
    L5:
        if (this.V == null) goto L7;
        goto L7
    }

    public final void J() {
        if (this.Y == true) goto L5;
        return;
    L5:
        tb1 r0 = this.P;
        r0.getClass();
        vj r1 = this.F;
        r1.getClass();
        int r2 = vj.b(r0);
        if (r2 != kq.a(4, 0, 0, 0)) goto L8;
    L12:
        us r3 = this.Q;
        if (r3 == null) goto L15;
        r3.a();
    L15:
        this.Q = new us(r1.n);
        this.Y = false;
        return;
    L8:
        if (r2 == kq.a(3, 0, 0, 0)) goto L12;
        throw b(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.P, false, 4005);
    }

    public final void K() {
        this.R = null;
        this.N = 0;
        this.M = -9223372036854775807L;
        us r1 = this.Q;
        if (r1 == null) goto L6;
        r1.a();
        this.Q = null;
        return;
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int r2, Object r3) {
        if (r2 == 15) goto L6;
        return;
    L6:
        if ((r3 instanceof ImageOutput) == false) goto L8;
        ImageOutput r4 = (ImageOutput) r3;
    L9:
        if (r4 != null) goto L11;
        r4 = ImageOutput.a;
    L11:
        this.S = r4;
        return;
    L8:
        r4 = null;
        goto L9
    }

    @Override // defpackage.kq
    public final String h() {
        return "ImageRenderer";
    }

    @Override // defpackage.kq
    public final boolean m() {
        return this.J;
    }

    @Override // defpackage.kq
    public final boolean o() {
        int r0 = this.O;
        if (r0 == 3) goto L10;
        if (r0 == 0) goto L6;
        return false;
    L6:
        if (this.U == true) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }

    @Override // defpackage.kq
    public final void p() {
        this.P = null;
        this.K = bw1.c;
        this.H.clear();
        K();
        this.S.getClass();
    }

    @Override // defpackage.kq
    public final void q(boolean r1, boolean r2) {
        this.O = r2 ? 1 : 0;
    }

    @Override // defpackage.kq
    public final void r(long r1, boolean r3, boolean r4) {
        this.O = Math.min(this.O, 1);
        this.J = false;
        this.I = false;
        this.T = null;
        this.V = null;
        this.W = null;
        this.U = false;
        this.R = null;
        us r2 = this.Q;
        if (r2 == null) goto L5;
        r2.flush();
    L5:
        this.H.clear();
    }

    @Override // defpackage.kq
    public final void s() {
        K();
    }

    @Override // defpackage.kq
    public final void u() {
        K();
        this.O = Math.min(this.O, 1);
    }

    @Override // defpackage.kq
    public final void x(tb1[] r5, long r6, long r8, mt2 r10) {
        if (this.K.b == (-9223372036854775807L)) goto L15;
        ArrayDeque r7 = this.H;
        if (r7.isEmpty() == false) goto L13;
        long r9 = this.M;
        if (r9 == (-9223372036854775807L)) goto L15;
        long r2 = this.L;
        if (r2 == (-9223372036854775807L)) goto L13;
        if (r2 >= r9) goto L15;
    L13:
        r7.add(new bw1(this.M, r8));
        return;
    L15:
        this.K = new bw1(-9223372036854775807L, r8);
    }
}
