package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y40 {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ z40 j;

    public y40(z40 r1, int r2, int r3) {
        this.j = r1;
        this.a = r2;
        this.b = r3;
        a();
    }

    public final void a() {
        z40 r0 = this.j;
        int[] r1 = (int[]) r0.n;
        int[] r2 = (int[]) r0.o;
        int r3 = Integer.MAX_VALUE;
        int r6 = Integer.MIN_VALUE;
        int r7 = Integer.MIN_VALUE;
        int r8 = 0;
        int r9 = this.a;
        int r4 = Integer.MAX_VALUE;
        int r5 = Integer.MAX_VALUE;
        int r10 = Integer.MIN_VALUE;
    L4:
        if (r9 > this.b) goto L19;
        int r11 = r1[r9];
        r8 = r8 + r2[r11];
        int r12 = (r11 >> 10) & 31;
        int r13 = (r11 >> 5) & 31;
        int r14 = r11 & 31;
        if (r12 <= r10) goto L8;
        r10 = r12;
    L8:
        if (r12 >= r3) goto L10;
        r3 = r12;
    L10:
        if (r13 <= r6) goto L12;
        r6 = r13;
    L12:
        if (r13 >= r4) goto L14;
        r4 = r13;
    L14:
        if (r14 <= r7) goto L16;
        r7 = r14;
    L16:
        if (r14 >= r5) goto L18;
        r5 = r14;
    L18:
        r9 = r9 + 1;
        goto L4
    L19:
        this.d = r3;
        this.e = r10;
        this.f = r4;
        this.g = r6;
        this.h = r5;
        this.i = r7;
        this.c = r8;
    }

    public final int b() {
        int r0 = (this.e - this.d) + 1;
        int r1 = ((this.g - this.f) + 1) * r0;
        return ((this.i - this.h) + 1) * r1;
    }
}
