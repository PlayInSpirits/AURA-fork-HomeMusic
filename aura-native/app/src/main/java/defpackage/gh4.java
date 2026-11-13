package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gh4 implements Iterable, x32 {
    public static final gh4 r = new gh4(0, 0, 0, null);
    public final long n;
    public final long o;
    public final long p;
    public final long[] q;

    public gh4(long j, long j2, long j3, long[] jArr) {
        this.n = j;
        this.o = j2;
        this.p = j3;
        this.q = jArr;
    }

    public final gh4 a(gh4 gh4Var) {
        long[] jArr;
        gh4 gh4Var2 = this;
        gh4 gh4Var3 = r;
        if (gh4Var == gh4Var3) {
            return gh4Var2;
        }
        if (gh4Var2 == gh4Var3) {
            return gh4Var3;
        }
        long j = gh4Var.p;
        long j2 = gh4Var.p;
        long[] jArr2 = gh4Var.q;
        long j3 = gh4Var.o;
        long j4 = gh4Var.n;
        long j5 = gh4Var2.p;
        if (j == j5 && jArr2 == (jArr = gh4Var2.q)) {
            return new gh4(gh4Var2.n & (~j4), gh4Var2.o & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                gh4Var2 = gh4Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    gh4Var2 = gh4Var2.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    gh4Var2 = gh4Var2.b(i2 + j2 + 64);
                }
            }
        }
        return gh4Var2;
    }

    public final gh4 b(long j) {
        long[] jArr;
        int f;
        long[] jArr2;
        long j2 = j - this.p;
        if (h12.k(j2, 0L) >= 0 && h12.k(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.o;
            if ((j4 & j3) != 0) {
                return new gh4(this.n, j4 & (~j3), this.p, this.q);
            }
        } else if (h12.k(j2, 64L) >= 0 && h12.k(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.n;
            if ((j6 & j5) != 0) {
                return new gh4(j6 & (~j5), this.o, this.p, this.q);
            }
        } else if (h12.k(j2, 0L) < 0 && (jArr = this.q) != null && (f = q05.f(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (f > 0) {
                    ti.a0(jArr, jArr3, 0, 0, f);
                }
                if (f < i) {
                    ti.a0(jArr, jArr3, f, f + 1, length);
                }
                jArr2 = jArr3;
            }
            return new gh4(this.n, this.o, this.p, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.p;
        return (h12.k(j2, 0L) < 0 || h12.k(j2, 64L) >= 0) ? (h12.k(j2, 64L) < 0 || h12.k(j2, 128L) >= 0) ? h12.k(j2, 0L) <= 0 && (jArr = this.q) != null && q05.f(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.n) != 0 : ((1 << ((int) j2)) & this.o) != 0;
    }

    public final gh4 e(gh4 gh4Var) {
        gh4 gh4Var2;
        long[] jArr;
        gh4 gh4Var3 = this;
        gh4 gh4Var4 = r;
        if (gh4Var == gh4Var4) {
            return gh4Var3;
        }
        if (gh4Var3 == gh4Var4) {
            return gh4Var;
        }
        long j = gh4Var.p;
        long j2 = gh4Var.p;
        long[] jArr2 = gh4Var.q;
        long j3 = gh4Var.o;
        long j4 = gh4Var.n;
        long j5 = gh4Var3.p;
        long j6 = gh4Var3.o;
        long j7 = gh4Var3.n;
        if (j == j5 && jArr2 == (jArr = gh4Var3.q)) {
            return new gh4(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = gh4Var3.q;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    gh4Var3 = gh4Var3.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        gh4Var3 = gh4Var3.f(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        gh4Var3 = gh4Var3.f(i + j2 + 64);
                    }
                    i++;
                }
            }
            return gh4Var3;
        }
        if (jArr3 != null) {
            gh4Var2 = gh4Var;
            for (long j9 : jArr3) {
                gh4Var2 = gh4Var2.f(j9);
            }
        } else {
            gh4Var2 = gh4Var;
        }
        long j10 = gh4Var3.p;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    gh4Var2 = gh4Var2.f(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    gh4Var2 = gh4Var2.f(i + j10 + 64);
                }
                i++;
            }
        }
        return gh4Var2;
    }

    public final gh4 f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.p;
        long j6 = j - j5;
        long j7 = 0;
        int k = h12.k(j6, 0L);
        long j8 = this.o;
        if (k < 0 || h12.k(j6, 64L) >= 0) {
            int k2 = h12.k(j6, 64L);
            long j9 = this.n;
            int i2 = 64;
            if (k2 < 0 || h12.k(j6, 128L) >= 0) {
                int k3 = h12.k(j6, 128L);
                long[] jArr3 = this.q;
                if (k3 < 0) {
                    if (jArr3 == null) {
                        return new gh4(this.n, this.o, this.p, new long[]{j});
                    }
                    int f = q05.f(jArr3, j);
                    if (f < 0) {
                        int i3 = -(f + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        ti.a0(jArr3, jArr4, 0, 0, i3);
                        ti.a0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new gh4(this.n, this.o, this.p, jArr4);
                    }
                } else if (!d(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (h12.k(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    rm2 rm2Var = null;
                    while (true) {
                        if (h12.k(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (rm2Var == null) {
                                rm2Var = new rm2(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((l03) rm2Var.o).a(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (rm2Var != null) {
                        l03 l03Var = (l03) rm2Var.o;
                        int i5 = l03Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = l03Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new gh4(j11, j3, j2, jArr).f(j);
                        }
                    }
                    jArr = jArr3;
                    return new gh4(j11, j3, j2, jArr).f(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new gh4(j9 | j13, this.o, this.p, this.q);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new gh4(this.n, j8 | j14, this.p, this.q);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return si0.C(new fh4(this, null));
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(r40.k0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null ? obj2 instanceof CharSequence : true) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append((CharSequence) obj2.toString());
            }
        }
        sb.append((CharSequence) "");
        return obj + " [" + sb.toString() + "]";
    }
}
