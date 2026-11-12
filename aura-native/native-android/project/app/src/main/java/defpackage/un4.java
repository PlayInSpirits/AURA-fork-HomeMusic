package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class un4 implements k51 {
    public final zn4 a;
    public wv4 f;
    public int g;
    public byte[] e = f35.b;
    public final be3 d = new be3();
    public final tb1 b = null;
    public final ArrayList c = new ArrayList();
    public int h = 0;
    public long[] i = f35.c;
    public long j = -9223372036854775807L;

    public un4(zn4 zn4Var) {
        this.a = zn4Var;
    }

    @Override // defpackage.k51
    public final void a() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00ce, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00ce, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: RuntimeException -> 0x00ce, LOOP:1: B:39:0x00b2->B:41:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        int i;
        long j;
        yn4 yn4Var;
        int i2;
        int i3 = this.h;
        rr2.w((i3 == 0 || i3 == 5) ? false : true);
        if (this.h == 1) {
            int iM = l51Var.getLength() != -1 ? jz4.m(l51Var.getLength()) : 1024;
            if (iM > this.e.length) {
                this.e = new byte[iM];
            }
            this.g = 0;
            this.h = 2;
        }
        int i4 = this.h;
        ArrayList arrayList = this.c;
        if (i4 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i5 = this.g;
            int i6 = l51Var.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.g += i6;
            }
            long length = l51Var.getLength();
            if (length != -1) {
                i = 0;
                if (this.g == length) {
                    try {
                        j = this.j;
                        if (j != -9223372036854775807L) {
                            yn4Var = new yn4(true, j);
                        } else {
                            yn4Var = yn4.c;
                        }
                        this.a.c(this.e, 0, this.g, yn4Var, new ss2(21, this));
                        Collections.sort(arrayList);
                        this.i = new long[arrayList.size()];
                        for (i2 = i; i2 < arrayList.size(); i2++) {
                            this.i[i2] = ((tn4) arrayList.get(i2)).n;
                        }
                        this.e = f35.b;
                        this.h = 4;
                    } catch (RuntimeException e) {
                        throw ParserException.a(e, "SubtitleParser failed.");
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.j;
                if (j != -9223372036854775807L) {
                    yn4Var = new yn4(true, j);
                } else {
                    yn4Var = yn4.c;
                }
                this.a.c(this.e, 0, this.g, yn4Var, new ss2(21, this));
                Collections.sort(arrayList);
                this.i = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.i[i2] = ((tn4) arrayList.get(i2)).n;
                }
                this.e = f35.b;
                this.h = 4;
            }
        } else {
            i = 0;
        }
        if (this.h == 3) {
            if (l51Var.h(l51Var.getLength() != -1 ? jz4.m(l51Var.getLength()) : 1024) == -1) {
                long j2 = this.j;
                for (int iF = j2 == -9223372036854775807L ? i : f35.f(this.i, j2, true); iF < arrayList.size(); iF++) {
                    g((tn4) arrayList.get(iF));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        return true;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        int i = this.h;
        rr2.w((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        rr2.w(this.h == 0);
        wv4 wv4VarT = m51Var.t(0, 3);
        this.f = wv4VarT;
        tb1 tb1Var = this.b;
        if (tb1Var != null) {
            wv4VarT.g(tb1Var);
            m51Var.p();
            m51Var.w(new ux1(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    public final void g(tn4 tn4Var) {
        this.f.getClass();
        byte[] bArr = tn4Var.o;
        int length = bArr.length;
        be3 be3Var = this.d;
        be3Var.getClass();
        be3Var.L(bArr.length, bArr);
        this.f.e(length, be3Var);
        this.f.a(tn4Var.n, 1, length, 0, null);
    }
}
