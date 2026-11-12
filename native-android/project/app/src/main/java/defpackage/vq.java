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

    public vq(int r5, sv4 r6, int[] r7) {
        int r0 = 0;
        if (r7.length <= 0) goto L5;
        boolean r8 = true;
    L6:
        rr2.w(r8);
        r6.getClass();
        this.a = r6;
        int r9 = r7.length;
        this.b = r9;
        this.d = new tb1[r9];
        int r10 = 0;
    L7:
        int r1 = r7.length;
        tb1[] r2 = this.d;
        if (r10 >= r1) goto L10;
        r2[r10] = r6.d[r7[r10]];
        r10 = r10 + 1;
        goto L7
    L10:
        Arrays.sort(r2, new n7(2));
        this.c = new int[this.b];
    L11:
        int r11 = this.b;
        if (r0 >= r11) goto L14;
        this.c[r0] = r6.b(this.d[r0]);
        r0 = r0 + 1;
        goto L11
    L14:
        this.e = new long[r11];
        return;
    L5:
        r8 = false;
        goto L6
    }

    @Override // defpackage.t41
    public final boolean a(int r3, long r4) {
        if (this.e[r3] <= r4) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.t41
    public final sv4 c() {
        return this.a;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L15;
        vq r6 = (vq) r5;
        if (this.a.equals(r6.a) == false) goto L15;
        if (Arrays.equals(this.c, r6.c) == false) goto L15;
        return true;
    }

    @Override // defpackage.t41
    public final void f(boolean r1) {
    }

    @Override // defpackage.t41
    public final tb1 g(int r1) {
        return this.d[r1];
    }

    @Override // defpackage.t41
    public void h() {
    }

    public final int hashCode() {
        if (this.f != 0) goto L6;
        int r0 = System.identityHashCode(this.a) * 31;
        this.f = Arrays.hashCode(this.c) + r0;
    L6:
        return this.f;
    }

    @Override // defpackage.t41
    public final int i(int r1) {
        return this.c[r1];
    }

    @Override // defpackage.t41
    public int j(long r1, List r3) {
        return r3.size();
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
    public final boolean o(int r8, long r9) {
        long r0 = SystemClock.elapsedRealtime();
        boolean r2 = a(r8, r0);
        int r4 = 0;
    L4:
        if (r4 >= this.b) goto L12;
        if (r2 == true) goto L12;
        if (r4 != r8) goto L8;
    L10:
        r2 = false;
    L11:
        r4 = r4 + 1;
        goto L4
    L8:
        if (a(r4, r0) == true) goto L10;
        r2 = true;
    L12:
        if (r2 == true) goto L14;
        return false;
    L14:
        long[] r7 = this.e;
        r7[r8] = Math.max(r7[r8], f35.a(r0, r9));
        return true;
    }

    @Override // defpackage.t41
    public void p(float r1) {
    }

    @Override // defpackage.t41
    public final int t(int r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.b) goto L9;
        if (this.c[r0] == r3) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }
}
