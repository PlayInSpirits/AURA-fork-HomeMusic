package defpackage;

import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nf5 implements b93 {
    public final ij1 n;
    public final int o;
    public final ve p;
    public final long q;
    public final long r;

    public nf5(ij1 ij1Var, int i, ve veVar, long j, long j2) {
        this.n = ij1Var;
        this.o = i;
        this.p = veVar;
        this.q = j;
        this.r = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static pa0 b(gf5 gf5Var, a aVar, int i) {
        jk5 jk5Var = aVar.H;
        pa0 pa0Var = jk5Var == null ? null : jk5Var.q;
        if (pa0Var != null && pa0Var.o) {
            int[] iArr = pa0Var.q;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = pa0Var.s;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (gf5Var.p < pa0Var.r) {
                        return pa0Var;
                    }
                } else if (gf5Var.p < pa0Var.r) {
                    return pa0Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (gf5Var.p < pa0Var.r) {
                        return pa0Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.b93
    public final void a(jw jwVar) {
        int i;
        int i2;
        int i3;
        Exception exc;
        int i4;
        long j;
        long j2;
        long j3 = this.q;
        ij1 ij1Var = this.n;
        if (ij1Var.b()) {
            e34 e34Var = (e34) d34.E().o;
            if (e34Var == null || e34Var.o) {
                gf5 gf5Var = (gf5) ij1Var.w.get(this.p);
                if (gf5Var != null) {
                    me meVar = gf5Var.f;
                    if (meVar instanceof a) {
                        a aVar = (a) meVar;
                        int i5 = 0;
                        boolean z = j3 > 0;
                        int i6 = aVar.C;
                        if (e34Var != null) {
                            z &= e34Var.p;
                            i = e34Var.q;
                            i2 = e34Var.r;
                            i3 = e34Var.n;
                            if (aVar.H != null && !aVar.c0()) {
                                pa0 pa0VarB = b(gf5Var, aVar, this.o);
                                if (pa0VarB == null) {
                                    return;
                                }
                                boolean z2 = pa0VarB.p && j3 > 0;
                                i2 = pa0VarB.r;
                                z = z2;
                            }
                        } else {
                            i = SmartSession.MAX_SONGS;
                            i2 = 100;
                            i3 = 0;
                        }
                        int i7 = i;
                        int iElapsedRealtime = -1;
                        if (jwVar.p()) {
                            i4 = 0;
                        } else {
                            synchronized (jwVar.o) {
                                exc = (Exception) jwVar.r;
                            }
                            if (exc instanceof ApiException) {
                                Status status = ((ApiException) exc).n;
                                i5 = status.n;
                                ka0 ka0Var = status.q;
                                if (ka0Var != null) {
                                    i4 = ka0Var.o;
                                }
                            } else {
                                i5 = 101;
                            }
                            i4 = -1;
                        }
                        if (z) {
                            long j4 = this.r;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        of5 of5Var = new of5(new iw2(this.o, i5, i4, j, j2, null, null, i6, iElapsedRealtime), i3, i7, i2);
                        zw2 zw2Var = ij1Var.A;
                        zw2Var.sendMessage(zw2Var.obtainMessage(18, of5Var));
                    }
                }
            }
        }
    }
}
