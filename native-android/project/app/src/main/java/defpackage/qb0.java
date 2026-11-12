package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qb0 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int r4, float r5) {
        int r0 = this.f;
        int[] r1 = this.d;
        if (r0 < r1.length) goto L5;
        this.d = Arrays.copyOf(r1, r1.length * 2);
        float[] r2 = this.e;
        this.e = Arrays.copyOf(r2, r2.length * 2);
    L5:
        int[] r3 = this.d;
        int r6 = this.f;
        r3[r6] = r4;
        float[] r7 = this.e;
        this.f = r6 + 1;
        r7[r6] = r5;
    }

    public final void b(int r4, int r5) {
        int r0 = this.c;
        int[] r1 = this.a;
        if (r0 < r1.length) goto L5;
        this.a = Arrays.copyOf(r1, r1.length * 2);
        int[] r2 = this.b;
        this.b = Arrays.copyOf(r2, r2.length * 2);
    L5:
        int[] r3 = this.a;
        int r6 = this.c;
        r3[r6] = r4;
        int[] r7 = this.b;
        this.c = r6 + 1;
        r7[r6] = r5;
    }

    public final void c(int r4, String r5) {
        int r0 = this.i;
        int[] r1 = this.g;
        if (r0 < r1.length) goto L5;
        this.g = Arrays.copyOf(r1, r1.length * 2);
        String[] r2 = this.h;
        this.h = (String[]) Arrays.copyOf(r2, r2.length * 2);
    L5:
        int[] r3 = this.g;
        int r6 = this.i;
        r3[r6] = r4;
        String[] r7 = this.h;
        this.i = r6 + 1;
        r7[r6] = r5;
    }

    public final void d(int r4, boolean r5) {
        int r0 = this.l;
        int[] r1 = this.j;
        if (r0 < r1.length) goto L5;
        this.j = Arrays.copyOf(r1, r1.length * 2);
        boolean[] r2 = this.k;
        this.k = Arrays.copyOf(r2, r2.length * 2);
    L5:
        int[] r3 = this.j;
        int r6 = this.l;
        r3[r6] = r4;
        boolean[] r7 = this.k;
        this.l = r6 + 1;
        r7[r6] = r5;
    }
}
