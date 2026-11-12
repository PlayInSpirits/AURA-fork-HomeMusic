package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p9 implements k51 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final tq0 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public m51 j;
    public wv4 k;
    public wv4 l;
    public m84 m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = f35.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public p9() {
        tq0 tq0Var = new tq0();
        this.b = tq0Var;
        this.l = tq0Var;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[PHI: r4
  0x00eb: PHI (r4v1 l51) = (r4v0 l51), (r4v6 l51) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        l51 l51Var2;
        int iF;
        int i;
        this.k.getClass();
        String str = f35.a;
        if (l51Var.getPosition() == 0 && !h(l51Var)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? r[8] : q[7];
            wv4 wv4Var = this.k;
            sb1 sb1Var = new sb1();
            sb1Var.l = lw2.m(str2);
            sb1Var.m = lw2.m(str3);
            sb1Var.n = i3;
            sb1Var.E = 1;
            sb1Var.F = i2;
            f34.l(sb1Var, wv4Var);
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int iG = g(l51Var);
                this.e = iG;
                this.f = iG;
                if (this.g == -1) {
                    l51Var.getPosition();
                    this.g = this.e;
                }
                if (this.g == this.e) {
                    this.h++;
                }
                m84 m84Var = this.m;
                if (m84Var instanceof ux1) {
                    ux1 ux1Var = (ux1) m84Var;
                    long j = this.i + this.d + 20000;
                    long position = l51Var.getPosition() + ((long) this.e);
                    te2 te2Var = ux1Var.b;
                    int i5 = te2Var.b;
                    if (i5 == 0 || j - te2Var.d(i5 - 1) >= 100000) {
                        te2 te2Var2 = ux1Var.a;
                        te2 te2Var3 = ux1Var.b;
                        if (te2Var3.b == 0 && j > 0) {
                            te2Var2.a(0L);
                            te2Var3.a(0L);
                        }
                        te2Var2.a(position);
                        te2Var3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
                l51Var2 = l51Var;
                iF = this.l.f(l51Var2, this.f, true);
                if (iF == -1) {
                    i4 = -1;
                } else {
                    i = this.f - iF;
                    this.f = i;
                    if (i <= 0) {
                        this.l.a(this.d + this.i, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
                l51Var2 = l51Var;
            }
        } else {
            l51Var2 = l51Var;
            iF = this.l.f(l51Var2, this.f, true);
            if (iF == -1) {
                i4 = -1;
            } else {
                i = this.f - iF;
                this.f = i;
                if (i <= 0) {
                    this.l.a(this.d + this.i, 1, this.e, 0, null);
                    this.d += 20000;
                }
            }
        }
        l51Var2.getLength();
        if (this.m == null) {
            bo boVar = new bo(-9223372036854775807L);
            this.m = boVar;
            this.j.w(boVar);
        }
        if (i4 == -1) {
            m84 m84Var2 = this.m;
            if (m84Var2 instanceof ux1) {
                long j2 = this.i + this.d;
                ((ux1) m84Var2).c = j2;
                this.j.w(m84Var2);
                this.k.d(j2);
            }
        }
        return i4;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        return h(l51Var);
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        m84 m84Var = this.m;
        if (!(m84Var instanceof ux1)) {
            if (j == 0 || !(m84Var instanceof eb0)) {
                this.i = 0L;
                return;
            } else {
                eb0 eb0Var = (eb0) m84Var;
                this.i = (Math.max(0L, j - eb0Var.b) * 8000000) / ((long) eb0Var.e);
                return;
            }
        }
        ux1 ux1Var = (ux1) m84Var;
        te2 te2Var = ux1Var.b;
        long jD = te2Var.b == 0 ? -9223372036854775807L : te2Var.d(f35.c(ux1Var.a, j));
        this.i = jD;
        if (Math.abs(this.o - jD) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.j = m51Var;
        wv4 wv4VarT = m51Var.t(0, 1);
        this.k = wv4VarT;
        this.l = wv4VarT;
        m51Var.p();
    }

    public final int g(l51 l51Var) throws ParserException {
        boolean z;
        l51Var.k();
        byte[] bArr = this.a;
        l51Var.n(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean h(l51 l51Var) {
        l51Var.k();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        l51Var.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            l51Var.l(bArr.length);
            return true;
        }
        l51Var.k();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        l51Var.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        l51Var.l(bArr3.length);
        return true;
    }
}
