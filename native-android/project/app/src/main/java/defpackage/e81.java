package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 implements c81 {
    public final int a;
    public final ry0 b;
    public final long c;
    public final long d;

    public e81(int r3, ry0 r4) {
        this.a = r3;
        this.b = r4;
        this.c = ((long) r3) * 1000000;
        this.d = 0;
    }

    @Override // defpackage.c81
    public final float b(long r10, float r12, float r13, float r14) {
        long r1 = r10 - this.d;
        if (r1 >= 0) goto L5;
        r1 = 0;
    L5:
        long r5 = this.c;
        if (r1 <= r5) goto L8;
        long r6 = r5;
    L10:
        if (r6 != 0) goto L13;
        return r14;
    L13:
        return (e(r6, r12, r13, r14) - e(r6 - 1000000, r12, r13, r14)) * 1000.0f;
    L8:
        r6 = r1;
        goto L10
    }

    @Override // defpackage.c81
    public final long c(float r3, float r4, float r5) {
        return this.d + this.c;
    }

    @Override // defpackage.c81
    public final float e(long r4, float r6, float r7, float r8) {
        long r5 = r4 - this.d;
        if (r5 >= 0) goto L5;
        r5 = 0;
    L5:
        long r0 = this.c;
        if (r5 <= r0) goto L9;
        r5 = r0;
    L9:
        if (this.a != 0) goto L11;
        float r9 = 1.0f;
    L12:
        float r3 = this.b.b(r9);
        return (r7 * r3) + ((1.0f - r3) * r6);
    L11:
        r9 = r5 / r0;
        goto L12
    }
}
