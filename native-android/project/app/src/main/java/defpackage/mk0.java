package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mk0 {
    public final byte[] a;
    public final ArrayDeque b;
    public final k35 c;
    public hg3 d;
    public int e;
    public int f;
    public long g;

    public mk0() {
        this.a = new byte[8];
        this.b = new ArrayDeque();
        this.c = new k35();
    }

    public final long a(l51 r6, int r7) {
        byte[] r5 = this.a;
        int r0 = 0;
        r6.readFully(r5, 0, r7);
        long r1 = 0;
    L3:
        if (r0 >= r7) goto L5;
        r1 = (r1 << 8) | ((long) (r5[r0] & 255));
        r0 = r0 + 1;
        goto L3
    L5:
        return r1;
    }
}
