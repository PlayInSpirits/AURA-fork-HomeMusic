package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k35 {
    public static final long[] d = null;
    public int a;
    public int b;
    public final byte[] c;

    static {
        d = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public k35() {
        this.c = new byte[8];
    }

    public static long a(int r7, boolean r8, byte[] r9) {
        long r0 = ((long) r9[0]) & 255;
        if (r8 == false) goto L5;
        r0 = r0 & (~d[r7 - 1]);
    L5:
        int r10 = 1;
    L6:
        if (r10 >= r7) goto L8;
        r0 = (r0 << 8) | (((long) r9[r10]) & 255);
        r10 = r10 + 1;
        goto L6
    L8:
        return r0;
    }

    public long b(l51 r15, boolean r16, boolean r17, int r18) {
        int r1 = this.a;
        byte[] r3 = this.c;
        if (r1 == 0) goto L5;
    L21:
        int r2 = this.b;
        if (r2 <= r18) goto L25;
        this.a = 0;
        return -2;
    L25:
        if (r2 == 1) goto L27;
        r15.readFully(r3, 1, r2 - 1);
    L27:
        this.a = 0;
        return a(this.b, r17, r3);
    L5:
        if (r15.a(r3, 0, 1, r16) == true) goto L8;
        return -1;
    L8:
        int r4 = r3[0] & 255;
        int r5 = 0;
    L10:
        if (r5 >= 8) goto L15;
        if ((d[r5] & ((long) r4)) != 0) goto L13;
        r5 = r5 + 1;
        goto L10
    L13:
        int r6 = r5 + 1;
    L16:
        this.b = r6;
        if (r6 == (-1)) goto L19;
        this.a = 1;
        goto L21
    L19:
        kf2.o("No valid varint length mask found");
        return 0;
    L15:
        r6 = -1;
        goto L16
    }

    public k35(byte[] r1, int r2, int r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }
}
