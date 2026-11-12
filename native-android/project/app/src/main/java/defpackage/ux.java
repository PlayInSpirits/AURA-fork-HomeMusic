package defpackage;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux {
    public final lx a;
    public final se4 b;
    public final ii0 c;
    public final String d;
    public final byte[] e;
    public final tx f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public ux(lx lxVar, ii0 ii0Var, byte[] bArr, tx txVar) {
        this.a = lxVar;
        this.b = lxVar.n;
        this.c = ii0Var;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = txVar;
        this.d = lxVar.r.d(ii0Var);
        this.g = ii0Var.f;
    }

    public final void a() throws Exception {
        long jB;
        long j;
        long j2;
        long j3;
        if (this.j) {
            throw new InterruptedIOException();
        }
        se4 se4Var = this.b;
        String str = this.d;
        ii0 ii0Var = this.c;
        this.i = se4Var.g(ii0Var.f, ii0Var.g, str);
        long j4 = ii0Var.g;
        long j5 = -1;
        if (j4 != -1) {
            this.h = ii0Var.f + j4;
        } else {
            long jA = nd0.a(this.b.i(this.d));
            if (jA == -1) {
                jA = -1;
            }
            this.h = jA;
        }
        tx txVar = this.f;
        if (txVar != null) {
            long j6 = this.h;
            txVar.b(j6 == -1 ? -1L : j6 - this.c.f, this.i, 0L);
        }
        while (true) {
            long j7 = this.h;
            if (j7 != j5 && this.g >= j7) {
                return;
            }
            if (this.j) {
                throw new InterruptedIOException();
            }
            long j8 = this.h;
            long jH = this.b.h(this.g, j8 == j5 ? Long.MAX_VALUE : j8 - this.g, this.d);
            if (jH > 0) {
                this.g += jH;
                j = j5;
            } else {
                long j9 = -jH;
                if (j9 == Long.MAX_VALUE) {
                    j9 = j5;
                }
                long j10 = this.g;
                lx lxVar = this.a;
                boolean z = true;
                int i = 0;
                boolean z2 = j10 + j9 == this.h || j9 == j5;
                if (j9 != j5) {
                    hi0 hi0VarA = ii0Var.a();
                    hi0VarA.f = j10;
                    hi0VarA.g = j9;
                    try {
                        jB = lxVar.b(hi0VarA.a());
                    } catch (Exception unused) {
                        fu.k(lxVar);
                        jB = j5;
                        z = false;
                    }
                } else {
                    jB = j5;
                    z = false;
                }
                if (!z) {
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    hi0 hi0VarA2 = ii0Var.a();
                    hi0VarA2.f = j10;
                    hi0VarA2.g = j5;
                    try {
                        jB = lxVar.b(hi0VarA2.a());
                    } catch (Exception e) {
                        fu.k(lxVar);
                        throw e;
                    }
                }
                if (z2 && jB != j5) {
                    long j11 = jB + j10;
                    try {
                        if (this.h != j11) {
                            this.h = j11;
                            tx txVar2 = this.f;
                            if (txVar2 != null) {
                                txVar2.b(j11 == j5 ? j5 : j11 - this.c.f, this.i, 0L);
                            }
                        }
                    } catch (Exception e2) {
                        fu.k(lxVar);
                        throw e2;
                    }
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 != -1) {
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.e;
                    i2 = lxVar.read(bArr, i, bArr.length);
                    if (i2 != -1) {
                        long j12 = i2;
                        long j13 = this.i + j12;
                        this.i = j13;
                        tx txVar3 = this.f;
                        if (txVar3 != null) {
                            j2 = j5;
                            long j14 = this.h;
                            if (j14 == j2) {
                                j3 = j2;
                            } else {
                                txVar3 = txVar3;
                                j3 = j14 - this.c.f;
                            }
                            txVar3.b(j3, j13, j12);
                        } else {
                            j2 = j5;
                        }
                        i3 += i2;
                        j5 = j2;
                        i = 0;
                    }
                }
                j = j5;
                if (z2) {
                    long j15 = ((long) i3) + j10;
                    if (this.h != j15) {
                        this.h = j15;
                        tx txVar4 = this.f;
                        if (txVar4 != null) {
                            txVar4.b(j15 == j ? j : j15 - this.c.f, this.i, 0L);
                        }
                    }
                }
                lxVar.close();
                this.g = j10 + ((long) i3);
            }
            j5 = j;
        }
    }
}
