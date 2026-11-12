package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 implements m84 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public t20(int[] r3, long[] r4, long[] r5, long[] r6) {
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        int r7 = r3.length;
        this.a = r7;
        if (r7 <= 0) goto L6;
        int r8 = r7 - 1;
        this.f = r5[r8] + r6[r8];
        return;
    L6:
        this.f = 0;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long r10) {
        long[] r0 = this.e;
        int r2 = f35.f(r0, r10, true);
        long r4 = r0[r2];
        long[] r6 = this.c;
        o84 r3 = new o84(r4, r6[r2]);
        if (r4 >= r10) goto L10;
        if (r2 == (this.a - 1)) goto L10;
        int r5 = r2 + 1;
        return new l84(r3, new o84(r0[r5], r6[r5]));
    L10:
        return new l84(r3, r3);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
