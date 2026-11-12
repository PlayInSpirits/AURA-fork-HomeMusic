package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
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

    public dw1(vj vjVar) {
        super(4);
        this.F = vjVar;
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
    public final void A(long j, long j2) throws ExoPlaybackException {
        if (this.J) {
            return;
        }
        if (this.P == null) {
            gp3 gp3Var = this.p;
            gp3Var.d();
            cj0 cj0Var = this.G;
            cj0Var.r();
            int iZ = z(gp3Var, cj0Var, 2);
            if (iZ != -5) {
                if (iZ == -4) {
                    rr2.w(cj0Var.d(4));
                    this.I = true;
                    this.J = true;
                    return;
                }
                return;
            }
            tb1 tb1Var = (tb1) gp3Var.p;
            tb1Var.getClass();
            this.P = tb1Var;
            this.Y = true;
        }
        if (this.Q == null) {
            J();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (H(j)) {
            }
            while (I(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw b(e, null, false, 4003);
        }
    }

    @Override // defpackage.kq
    public final int E(tb1 tb1Var) {
        this.F.getClass();
        return vj.b(tb1Var);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    public final boolean H(long j) throws ExoPlaybackException {
        boolean z;
        cw1 cw1Var;
        boolean z2;
        int i;
        int i2;
        int i3;
        tb1 tb1Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.T;
        if ((bitmap == null || this.V != null) && (this.O != 0 || this.u == 2)) {
            ArrayDeque arrayDeque = this.H;
            if (bitmap == null) {
                this.Q.getClass();
                ts tsVar = (ts) this.Q.d();
                if (tsVar != null) {
                    if (!tsVar.d(4)) {
                        rr2.s(tsVar.s, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.T = tsVar.s;
                        tsVar.s();
                        if (this.U && this.T != null && this.V != null) {
                            this.P.getClass();
                            tb1 tb1Var2 = this.P;
                            int i4 = tb1Var2.M;
                            int i5 = tb1Var2.N;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            cw1Var = this.V;
                            if (((Bitmap) cw1Var.c) == null) {
                                if (z) {
                                    int i6 = cw1Var.a;
                                    this.T.getClass();
                                    int width = this.T.getWidth();
                                    tb1 tb1Var3 = this.P;
                                    tb1Var3.getClass();
                                    int i7 = width / tb1Var3.M;
                                    int height = this.T.getHeight();
                                    tb1 tb1Var4 = this.P;
                                    tb1Var4.getClass();
                                    int i8 = height / tb1Var4.N;
                                    int i9 = this.P.M;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.T, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.T;
                                    bitmapCreateBitmap.getClass();
                                }
                                cw1Var.c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = (Bitmap) this.V.c;
                            bitmap2.getClass();
                            long j2 = this.V.b;
                            long j3 = j2 - j;
                            if (this.u == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.O;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        tb4.a();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < 30000) {
                                this.S.onImageAvailable(j2 - this.K.b, bitmap2);
                                cw1 cw1Var2 = this.V;
                                cw1Var2.getClass();
                                long j4 = cw1Var2.b;
                                this.L = j4;
                                while (!arrayDeque.isEmpty() && j4 >= ((bw1) arrayDeque.peek()).a) {
                                    this.K = (bw1) arrayDeque.removeFirst();
                                }
                                this.O = 3;
                                if (z) {
                                    cw1 cw1Var3 = this.V;
                                    cw1Var3.getClass();
                                    i2 = cw1Var3.a;
                                    tb1 tb1Var5 = this.P;
                                    tb1Var5.getClass();
                                    i3 = tb1Var5.N;
                                    tb1Var = this.P;
                                    tb1Var.getClass();
                                    if (i2 == (i3 * tb1Var.M) - 1) {
                                        this.T = null;
                                    }
                                } else {
                                    this.T = null;
                                }
                                this.V = this.W;
                                this.W = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.N == 3) {
                            K();
                            this.P.getClass();
                            J();
                            return false;
                        }
                        tsVar.s();
                        if (arrayDeque.isEmpty()) {
                            this.J = true;
                            return false;
                        }
                    }
                }
            } else if (this.U) {
                this.P.getClass();
                tb1 tb1Var6 = this.P;
                int i10 = tb1Var6.M;
                int i11 = tb1Var6.N;
                if (i10 != 1) {
                }
                cw1Var = this.V;
                if (((Bitmap) cw1Var.c) == null) {
                    if (z) {
                        int i12 = cw1Var.a;
                        this.T.getClass();
                        int width2 = this.T.getWidth();
                        tb1 tb1Var7 = this.P;
                        tb1Var7.getClass();
                        int i13 = width2 / tb1Var7.M;
                        int height2 = this.T.getHeight();
                        tb1 tb1Var8 = this.P;
                        tb1Var8.getClass();
                        int i14 = height2 / tb1Var8.N;
                        int i15 = this.P.M;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.T, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.T;
                        bitmapCreateBitmap.getClass();
                    }
                    cw1Var.c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.V.c;
                bitmap3.getClass();
                long j5 = this.V.b;
                long j6 = j5 - j;
                if (this.u == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.O;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            tb4.a();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                this.S.onImageAvailable(j5 - this.K.b, bitmap3);
                cw1 cw1Var4 = this.V;
                cw1Var4.getClass();
                long j7 = cw1Var4.b;
                this.L = j7;
                while (!arrayDeque.isEmpty()) {
                    this.K = (bw1) arrayDeque.removeFirst();
                }
                this.O = 3;
                if (z) {
                    cw1 cw1Var5 = this.V;
                    cw1Var5.getClass();
                    i2 = cw1Var5.a;
                    tb1 tb1Var9 = this.P;
                    tb1Var9.getClass();
                    i3 = tb1Var9.N;
                    tb1Var = this.P;
                    tb1Var.getClass();
                    if (i2 == (i3 * tb1Var.M) - 1) {
                        this.T = null;
                    }
                } else {
                    this.T = null;
                }
                this.V = this.W;
                this.W = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    public final boolean I(long j) {
        int i;
        cj0 cj0Var;
        int iZ;
        ByteBuffer byteBuffer;
        cj0 cj0Var2;
        boolean z;
        cj0 cj0Var3;
        long j2;
        boolean z2;
        cw1 cw1Var;
        boolean z3;
        tb1 tb1Var;
        boolean z4;
        boolean z5;
        tb1 tb1Var2;
        int i2;
        cj0 cj0Var4;
        if (!this.U || this.V == null) {
            gp3 gp3Var = this.p;
            gp3Var.d();
            us usVar = this.Q;
            if (usVar != null && this.N != 3 && !this.I) {
                if (this.R == null) {
                    cj0 cj0Var5 = (cj0) usVar.e();
                    this.R = cj0Var5;
                    if (cj0Var5 != null) {
                        i = this.N;
                        cj0Var = this.R;
                        if (i == 2) {
                            cj0Var.getClass();
                            this.R.o = 4;
                            us usVar2 = this.Q;
                            usVar2.getClass();
                            usVar2.f(this.R);
                            this.R = null;
                            this.N = 3;
                            return false;
                        }
                        iZ = z(gp3Var, cj0Var, 0);
                        if (iZ != -5) {
                            tb1 tb1Var3 = (tb1) gp3Var.p;
                            tb1Var3.getClass();
                            this.P = tb1Var3;
                            this.Y = true;
                            this.N = 2;
                            return true;
                        }
                        if (iZ != -4) {
                            this.R.u();
                            byteBuffer = this.R.r;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                cj0Var2 = this.R;
                                cj0Var2.getClass();
                                if (cj0Var2.d(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                cj0 cj0Var6 = this.R;
                                cj0Var6.getClass();
                                cj0Var6.p = this.P;
                                us usVar3 = this.Q;
                                usVar3.getClass();
                                cj0 cj0Var7 = this.R;
                                cj0Var7.getClass();
                                usVar3.f(cj0Var7);
                                this.X = 0;
                            }
                            cj0Var3 = this.R;
                            cj0Var3.getClass();
                            if (cj0Var3.d(4)) {
                                this.U = true;
                            } else {
                                int i3 = this.X;
                                j2 = cj0Var3.t;
                                cw1 cw1Var2 = new cw1();
                                cw1Var2.a = i3;
                                cw1Var2.b = j2;
                                this.W = cw1Var2;
                                this.X = i3 + 1;
                                if (this.U) {
                                    this.V = this.W;
                                    this.W = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    cw1Var = this.V;
                                    if (cw1Var != null || cw1Var.b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    tb1Var = this.P;
                                    tb1Var.getClass();
                                    if (tb1Var.M != -1 || (i2 = (tb1Var2 = this.P).N) == -1 || i3 == (i2 * tb1Var2.M) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.U = z5;
                                    if (z3 || z2) {
                                        this.V = this.W;
                                        this.W = null;
                                    }
                                }
                            }
                            cj0Var4 = this.R;
                            cj0Var4.getClass();
                            if (cj0Var4.d(4)) {
                                this.I = true;
                                this.R = null;
                                return false;
                            }
                            long j3 = this.M;
                            cj0 cj0Var8 = this.R;
                            cj0Var8.getClass();
                            this.M = Math.max(j3, cj0Var8.t);
                            if (z) {
                                this.R = null;
                            } else {
                                cj0 cj0Var9 = this.R;
                                cj0Var9.getClass();
                                cj0Var9.r();
                            }
                            return !this.U;
                        }
                        if (iZ != -3) {
                            tb4.a();
                            return false;
                        }
                    }
                } else {
                    i = this.N;
                    cj0Var = this.R;
                    if (i == 2) {
                        cj0Var.getClass();
                        this.R.o = 4;
                        us usVar4 = this.Q;
                        usVar4.getClass();
                        usVar4.f(this.R);
                        this.R = null;
                        this.N = 3;
                        return false;
                    }
                    iZ = z(gp3Var, cj0Var, 0);
                    if (iZ != -5) {
                        tb1 tb1Var4 = (tb1) gp3Var.p;
                        tb1Var4.getClass();
                        this.P = tb1Var4;
                        this.Y = true;
                        this.N = 2;
                        return true;
                    }
                    if (iZ != -4) {
                        this.R.u();
                        byteBuffer = this.R.r;
                        if (byteBuffer != null) {
                            cj0Var2 = this.R;
                            cj0Var2.getClass();
                            if (cj0Var2.d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            cj0Var2 = this.R;
                            cj0Var2.getClass();
                            if (cj0Var2.d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            cj0 cj0Var10 = this.R;
                            cj0Var10.getClass();
                            cj0Var10.p = this.P;
                            us usVar5 = this.Q;
                            usVar5.getClass();
                            cj0 cj0Var11 = this.R;
                            cj0Var11.getClass();
                            usVar5.f(cj0Var11);
                            this.X = 0;
                        }
                        cj0Var3 = this.R;
                        cj0Var3.getClass();
                        if (cj0Var3.d(4)) {
                            this.U = true;
                        } else {
                            int i4 = this.X;
                            j2 = cj0Var3.t;
                            cw1 cw1Var3 = new cw1();
                            cw1Var3.a = i4;
                            cw1Var3.b = j2;
                            this.W = cw1Var3;
                            this.X = i4 + 1;
                            if (this.U) {
                                this.V = this.W;
                                this.W = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                cw1Var = this.V;
                                if (cw1Var != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                tb1Var = this.P;
                                tb1Var.getClass();
                                if (tb1Var.M != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.U = z5;
                                if (z3) {
                                    this.V = this.W;
                                    this.W = null;
                                } else {
                                    this.V = this.W;
                                    this.W = null;
                                }
                            }
                        }
                        cj0Var4 = this.R;
                        cj0Var4.getClass();
                        if (cj0Var4.d(4)) {
                            this.I = true;
                            this.R = null;
                            return false;
                        }
                        long j4 = this.M;
                        cj0 cj0Var12 = this.R;
                        cj0Var12.getClass();
                        this.M = Math.max(j4, cj0Var12.t);
                        if (z) {
                            this.R = null;
                        } else {
                            cj0 cj0Var13 = this.R;
                            cj0Var13.getClass();
                            cj0Var13.r();
                        }
                        return !this.U;
                    }
                    if (iZ != -3) {
                        tb4.a();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void J() throws ExoPlaybackException {
        if (this.Y) {
            tb1 tb1Var = this.P;
            tb1Var.getClass();
            vj vjVar = this.F;
            vjVar.getClass();
            int iB = vj.b(tb1Var);
            if (iB != kq.a(4, 0, 0, 0) && iB != kq.a(3, 0, 0, 0)) {
                throw b(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.P, false, 4005);
            }
            us usVar = this.Q;
            if (usVar != null) {
                usVar.a();
            }
            this.Q = new us(vjVar.n);
            this.Y = false;
        }
    }

    public final void K() {
        this.R = null;
        this.N = 0;
        this.M = -9223372036854775807L;
        us usVar = this.Q;
        if (usVar != null) {
            usVar.a();
            this.Q = null;
        }
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.S = imageOutput;
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
        int i = this.O;
        if (i != 3) {
            return i == 0 && this.U;
        }
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
    public final void q(boolean z, boolean z2) {
        this.O = z2 ? 1 : 0;
    }

    @Override // defpackage.kq
    public final void r(long j, boolean z, boolean z2) {
        this.O = Math.min(this.O, 1);
        this.J = false;
        this.I = false;
        this.T = null;
        this.V = null;
        this.W = null;
        this.U = false;
        this.R = null;
        us usVar = this.Q;
        if (usVar != null) {
            usVar.flush();
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
        if (this.K.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.H;
            if (arrayDeque.isEmpty()) {
                long j3 = this.M;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.L;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new bw1(this.M, j2));
            return;
        }
        this.K = new bw1(-9223372036854775807L, j2);
    }
}
