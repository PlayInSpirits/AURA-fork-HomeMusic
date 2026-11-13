package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e6 extends vq {
    public final cp g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final yw1 o;
    public final vp4 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public nm1 u;

    public e6(sv4 sv4Var, int[] iArr, cp cpVar, yw1 yw1Var) {
        super(0, sv4Var, iArr);
        this.g = cpVar;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = yw1.k(yw1Var);
        this.p = vp4.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void u(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            uw1 uw1Var = (uw1) arrayList.get(i);
            if (uw1Var != null) {
                uw1Var.c(new d6(j, jArr[i]));
            }
        }
    }

    public static long w(List list) {
        if (!list.isEmpty()) {
            nm1 nm1Var = (nm1) te5.w(list);
            long j = nm1Var.g;
            if (j != -9223372036854775807L) {
                long j2 = nm1Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.t41
    public final void b(long j, long j2, long j3, List list, xj2[] xj2VarArr) {
        long w;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        int i2 = 0;
        if (i >= xj2VarArr.length || !xj2VarArr[i].next()) {
            int length = xj2VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    w = w(list);
                    break;
                }
                xj2 xj2Var = xj2VarArr[i3];
                if (xj2Var.next()) {
                    w = xj2Var.n() - xj2Var.j();
                    break;
                }
                i3++;
            }
        } else {
            xj2 xj2Var2 = xj2VarArr[this.r];
            w = xj2Var2.n() - xj2Var2.j();
        }
        int i4 = this.s;
        if (i4 == 0) {
            this.s = 1;
            this.r = v(elapsedRealtime);
            return;
        }
        int i5 = this.r;
        boolean isEmpty = list.isEmpty();
        tb1[] tb1VarArr = this.d;
        if (!isEmpty) {
            tb1 tb1Var = ((nm1) te5.w(list)).d;
            while (i2 < this.b) {
                if (tb1VarArr[i2] == tb1Var) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            i4 = ((nm1) te5.w(list)).e;
            i5 = i2;
        }
        int v = v(elapsedRealtime);
        if (v != i5 && !a(i5, elapsedRealtime)) {
            tb1 tb1Var2 = tb1VarArr[i5];
            tb1 tb1Var3 = tb1VarArr[v];
            long j4 = this.h;
            if (j3 != -9223372036854775807L) {
                j4 = Math.min((long) ((w != -9223372036854775807L ? j3 - w : j3) * this.n), j4);
            }
            int i6 = tb1Var3.j;
            int i7 = tb1Var2.j;
            if ((i6 > i7 && j2 < j4) || (i6 < i7 && j2 >= this.i)) {
                v = i5;
            }
        }
        if (v != i5) {
            i4 = 3;
        }
        this.s = i4;
        this.r = v;
    }

    @Override // defpackage.t41
    public final int d() {
        return this.r;
    }

    @Override // defpackage.vq, defpackage.t41
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.vq, defpackage.t41
    public final int j(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((nm1) te5.w(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (nm1) te5.w(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long E = f35.E(((nm1) list.get(size - 1)).g - j, this.q);
        long j3 = this.j;
        if (E >= j3) {
            w(list);
            tb1 tb1Var = this.d[v(elapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                nm1 nm1Var = (nm1) list.get(i3);
                tb1 tb1Var2 = nm1Var.d;
                if (f35.E(nm1Var.g - j, this.q) >= j3 && tb1Var2.j < tb1Var.j && (i = tb1Var2.v) != -1 && i <= this.l && (i2 = tb1Var2.u) != -1 && i2 <= this.k && i < tb1Var.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.vq, defpackage.t41
    public final void k() {
        this.u = null;
    }

    @Override // defpackage.t41
    public final int n() {
        return this.s;
    }

    @Override // defpackage.vq, defpackage.t41
    public final void p(float f) {
        this.q = f;
    }

    @Override // defpackage.t41
    public final Object q() {
        return null;
    }

    public final int v(long j) {
        long J = (long) (((long) (this.g.J() * this.m)) / this.q);
        yw1 yw1Var = this.o;
        if (!yw1Var.isEmpty()) {
            int i = 1;
            while (i < yw1Var.size() - 1 && ((d6) yw1Var.get(i)).a < J) {
                i++;
            }
            d6 d6Var = (d6) yw1Var.get(i - 1);
            d6 d6Var2 = (d6) yw1Var.get(i);
            long j2 = d6Var.a;
            long j3 = d6Var.b;
            J = ((long) (((J - j2) / (d6Var2.a - j2)) * (d6Var2.b - j3))) + j3;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= J) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
