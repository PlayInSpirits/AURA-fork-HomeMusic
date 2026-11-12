package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd implements Choreographer.FrameCallback {
    public final /* synthetic */ yc5 n;

    public sd(yc5 yc5Var) {
        this.n = yc5Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x011b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0132  */
    /* JADX WARN: Code duplicated, block: B:38:0x013f  */
    /* JADX WARN: Code duplicated, block: B:41:0x015a  */
    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0175 A[LOOP:1: B:43:0x0169->B:47:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0193  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196 A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        long j3;
        boolean z;
        float f;
        ak4 ak4Var;
        float f2;
        float f3;
        float f4;
        ak4 ak4Var2;
        boolean z2;
        ArrayList arrayList;
        ThreadLocal threadLocal;
        td tdVar;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        td tdVar2 = (td) ((zg5) this.n.n).n;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList3 = tdVar2.b;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            zj4 zj4Var = (zj4) arrayList3.get(i2);
            if (zj4Var == null) {
                i2 = i2;
            } else {
                yd4 yd4Var = tdVar2.a;
                Long l = (Long) yd4Var.get(zj4Var);
                if (l == null) {
                    j2 = zj4Var.g;
                    if (j2 == 0) {
                        zj4Var.g = jUptimeMillis;
                        zj4Var.a(zj4Var.b);
                        i2 = i2;
                    } else {
                        j3 = jUptimeMillis - j2;
                        zj4Var.g = jUptimeMillis;
                        z = zj4Var.m;
                        f = zj4Var.l;
                        if (z) {
                            if (f != Float.MAX_VALUE) {
                                zj4Var.k.i = f;
                                zj4Var.l = Float.MAX_VALUE;
                            }
                            zj4Var.b = (float) zj4Var.k.i;
                            zj4Var.a = 0.0f;
                            zj4Var.m = false;
                            z2 = true;
                            f3 = -3.4028235E38f;
                        } else {
                            i2 = i2;
                            ak4Var = zj4Var.k;
                            if (f != Float.MAX_VALUE) {
                                double d = ak4Var.i;
                                long j4 = j3 / 2;
                                yx0 yx0VarA = ak4Var.a(zj4Var.b, zj4Var.a, j4);
                                ak4 ak4Var3 = zj4Var.k;
                                ak4Var3.i = zj4Var.l;
                                zj4Var.l = Float.MAX_VALUE;
                                yx0 yx0VarA2 = ak4Var3.a(yx0VarA.a, yx0VarA.b, j4);
                                zj4Var.b = yx0VarA2.a;
                                zj4Var.a = yx0VarA2.b;
                                f2 = Float.MAX_VALUE;
                                f3 = -3.4028235E38f;
                            } else {
                                f2 = Float.MAX_VALUE;
                                f3 = -3.4028235E38f;
                                yx0 yx0VarA3 = ak4Var.a(zj4Var.b, zj4Var.a, j3);
                                zj4Var.b = yx0VarA3.a;
                                zj4Var.a = yx0VarA3.b;
                            }
                            float fMax = Math.max(zj4Var.b, f3);
                            zj4Var.b = fMax;
                            float fMin = Math.min(fMax, f2);
                            zj4Var.b = fMin;
                            f4 = zj4Var.a;
                            ak4Var2 = zj4Var.k;
                            ak4Var2.getClass();
                            if (Math.abs(f4) < ak4Var2.e) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                        }
                        float fMin2 = Math.min(zj4Var.b, Float.MAX_VALUE);
                        zj4Var.b = fMin2;
                        float fMax2 = Math.max(fMin2, f3);
                        zj4Var.b = fMax2;
                        zj4Var.a(fMax2);
                        if (z2) {
                            arrayList = zj4Var.i;
                            zj4Var.f = false;
                            threadLocal = td.f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new td());
                            }
                            tdVar = (td) threadLocal.get();
                            tdVar.a.remove(zj4Var);
                            arrayList2 = tdVar.b;
                            iIndexOf = arrayList2.indexOf(zj4Var);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                tdVar.e = true;
                            }
                            zj4Var.g = 0L;
                            zj4Var.c = false;
                            for (i = 0; i < arrayList.size(); i++) {
                                if (arrayList.get(i) == null) {
                                    arrayList.get(i).getClass();
                                    kf2.k();
                                    return;
                                }
                            }
                            for (size = arrayList.size() - 1; size >= 0; size--) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (l.longValue() < jUptimeMillis2) {
                    yd4Var.remove(zj4Var);
                    j2 = zj4Var.g;
                    if (j2 == 0) {
                        zj4Var.g = jUptimeMillis;
                        zj4Var.a(zj4Var.b);
                        i2 = i2;
                    } else {
                        j3 = jUptimeMillis - j2;
                        zj4Var.g = jUptimeMillis;
                        z = zj4Var.m;
                        f = zj4Var.l;
                        if (z) {
                            if (f != Float.MAX_VALUE) {
                                zj4Var.k.i = f;
                                zj4Var.l = Float.MAX_VALUE;
                            }
                            zj4Var.b = (float) zj4Var.k.i;
                            zj4Var.a = 0.0f;
                            zj4Var.m = false;
                            z2 = true;
                            f3 = -3.4028235E38f;
                        } else {
                            i2 = i2;
                            ak4Var = zj4Var.k;
                            if (f != Float.MAX_VALUE) {
                                double d2 = ak4Var.i;
                                long j5 = j3 / 2;
                                yx0 yx0VarA4 = ak4Var.a(zj4Var.b, zj4Var.a, j5);
                                ak4 ak4Var4 = zj4Var.k;
                                ak4Var4.i = zj4Var.l;
                                zj4Var.l = Float.MAX_VALUE;
                                yx0 yx0VarA5 = ak4Var4.a(yx0VarA4.a, yx0VarA4.b, j5);
                                zj4Var.b = yx0VarA5.a;
                                zj4Var.a = yx0VarA5.b;
                                f2 = Float.MAX_VALUE;
                                f3 = -3.4028235E38f;
                            } else {
                                f2 = Float.MAX_VALUE;
                                f3 = -3.4028235E38f;
                                yx0 yx0VarA6 = ak4Var.a(zj4Var.b, zj4Var.a, j3);
                                zj4Var.b = yx0VarA6.a;
                                zj4Var.a = yx0VarA6.b;
                            }
                            float fMax3 = Math.max(zj4Var.b, f3);
                            zj4Var.b = fMax3;
                            float fMin3 = Math.min(fMax3, f2);
                            zj4Var.b = fMin3;
                            f4 = zj4Var.a;
                            ak4Var2 = zj4Var.k;
                            ak4Var2.getClass();
                            if (Math.abs(f4) < ak4Var2.e || Math.abs(fMin3 - ((float) ak4Var2.i)) >= ak4Var2.d) {
                                z2 = false;
                            } else {
                                zj4Var.b = (float) zj4Var.k.i;
                                zj4Var.a = 0.0f;
                                z2 = true;
                            }
                        }
                        float fMin4 = Math.min(zj4Var.b, Float.MAX_VALUE);
                        zj4Var.b = fMin4;
                        float fMax4 = Math.max(fMin4, f3);
                        zj4Var.b = fMax4;
                        zj4Var.a(fMax4);
                        if (z2) {
                            arrayList = zj4Var.i;
                            zj4Var.f = false;
                            threadLocal = td.f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new td());
                            }
                            tdVar = (td) threadLocal.get();
                            tdVar.a.remove(zj4Var);
                            arrayList2 = tdVar.b;
                            iIndexOf = arrayList2.indexOf(zj4Var);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                tdVar.e = true;
                            }
                            zj4Var.g = 0L;
                            zj4Var.c = false;
                            while (i < arrayList.size()) {
                                if (arrayList.get(i) == null) {
                                    arrayList.get(i).getClass();
                                    kf2.k();
                                    return;
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    i2 = i2;
                }
            }
            i2++;
        }
        if (tdVar2.e) {
            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                if (arrayList3.get(size2) == null) {
                    arrayList3.remove(size2);
                }
            }
            tdVar2.e = false;
        }
        if (arrayList3.size() > 0) {
            if (tdVar2.d == null) {
                tdVar2.d = new yc5(tdVar2.c);
            }
            yc5 yc5Var = tdVar2.d;
            ((Choreographer) yc5Var.o).postFrameCallback((sd) yc5Var.p);
        }
    }
}
