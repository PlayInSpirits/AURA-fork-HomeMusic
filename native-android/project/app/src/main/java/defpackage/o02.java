package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o02 {
    public int[] a;
    public int b;

    public o02() {
        this.a = new int[10];
    }

    public int a(int r2) {
        int r0 = this.b - 1;
        if (r0 >= 0) goto L5;
        return r2;
    L5:
        return this.a[r0];
    }

    public int b() {
        int[] r0 = this.a;
        int r1 = this.b - 1;
        this.b = r1;
        return r0[r1];
    }

    public void c(int r4) {
        int[] r0 = this.a;
        if (this.b < r0.length) goto L5;
        r0 = Arrays.copyOf(r0, r0.length * 2);
        this.a = r0;
    L5:
        int r1 = this.b;
        this.b = r1 + 1;
        r0[r1] = r4;
    }

    public void d(int r5, int r6, int r7) {
        int r0 = this.b;
        int[] r1 = this.a;
        int r2 = r0 + 3;
        if (r2 < r1.length) goto L5;
        r1 = Arrays.copyOf(r1, r1.length * 2);
        this.a = r1;
    L5:
        r1[r0] = r5 + r7;
        r1[r0 + 1] = r6 + r7;
        r1[r0 + 2] = r7;
        this.b = r2;
    }

    public void e(int r5, int r6, int r7, int r8) {
        int r0 = this.b;
        int[] r1 = this.a;
        int r2 = r0 + 4;
        if (r2 < r1.length) goto L5;
        r1 = Arrays.copyOf(r1, r1.length * 2);
        this.a = r1;
    L5:
        r1[r0] = r5;
        r1[r0 + 1] = r6;
        r1[r0 + 2] = r7;
        r1[r0 + 3] = r8;
        this.b = r2;
    }

    public void f(int r6, int r7) {
        if (r6 >= r7) goto L18;
        int r0 = r6 - 3;
        int r1 = r6;
    L4:
        if (r1 >= r7) goto L12;
        int[] r2 = this.a;
        int r3 = r2[r1];
        int r4 = r2[r7];
        if (r3 < r4) goto L10;
        if (r3 != r4) goto L11;
        if (r2[r1 + 1] <= r2[r7 + 1]) goto L10;
    L11:
        r1 = r1 + 3;
    L10:
        r0 = r0 + 3;
        g(r0, r1);
        goto L11
    L12:
        g(r0 + 3, r7);
        f(r6, r0);
        f(r0 + 6, r7);
        return;
    }

    public void g(int r5, int r6) {
        int[] r4 = this.a;
        int r0 = r4[r5];
        r4[r5] = r4[r6];
        r4[r6] = r0;
        int r1 = r5 + 1;
        int r2 = r6 + 1;
        int r3 = r4[r1];
        r4[r1] = r4[r2];
        r4[r2] = r3;
        int r7 = r5 + 2;
        int r8 = r6 + 2;
        int r9 = r4[r7];
        r4[r7] = r4[r8];
        r4[r8] = r9;
    }

    public o02(int r1) {
        this.a = new int[r1];
    }
}
