package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq implements t41 {
    public final sv4 a;
    public final int b;
    public final int[] c;
    public final tb1[] d;
    public final long[] e;
    public int f;

    public vq(int i, sv4 sv4Var, int[] iArr) {
        tb1[] tb1VarArr;
        int i2 = 0;
        rr2.w(iArr.length > 0);
        sv4Var.getClass();
        this.a = sv4Var;
        int length = iArr.length;
        this.b = length;
        this.d = new tb1[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            tb1VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            tb1VarArr[i3] = sv4Var.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(tb1VarArr, new n7(2));
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = sv4Var.b(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // defpackage.t41
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.t41
    public final sv4 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vq vqVar = (vq) obj;
            if (this.a.equals(vqVar.a) && Arrays.equals(this.c, vqVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.t41
    public final void f(boolean z) {
    }

    @Override // defpackage.t41
    public final tb1 g(int i) {
        return this.d[i];
    }

    @Override // defpackage.t41
    public void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.t41
    public final int i(int i) {
        return this.c[i];
    }

    @Override // defpackage.t41
    public int j(long j, List list) {
        return list.size();
    }

    @Override // defpackage.t41
    public void k() {
    }

    @Override // defpackage.t41
    public final int l() {
        return this.c[d()];
    }

    @Override // defpackage.t41
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.t41
    public final tb1 m() {
        return this.d[d()];
    }

    @Override // defpackage.t41
    public final boolean o(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], f35.a(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.t41
    public void p(float f) {
    }

    @Override // defpackage.t41
    public final int t(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
