package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sr3 {
    public final /* synthetic */ int a;
    public final iu4 b;
    public final be3 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public sr3(int r3) {
        this.a = r3;
        switch(r3) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new iu4(0);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.c = new be3();
        return;
    L6:
        this.b = new iu4(0);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.c = new be3();
    }

    public static int b(int r2, byte[] r3) {
        int r0 = (((r3[r2] & 255) << 24) | ((r3[r2 + 1] & 255) << 16)) | ((r3[r2 + 2] & 255) << 8);
        return (r3[r2 + 3] & 255) | r0;
    }

    public static long c(be3 r17) {
        int r1 = r17.b;
        if (r17.a() >= 9) goto L5;
        return -9223372036854775807L;
    L5:
        byte[] r2 = new byte[9];
        r17.k(r2, 0, 9);
        r17.N(r1);
        byte r0 = r2[0];
        if ((r0 & 196) != 68) goto L21;
        byte r3 = r2[2];
        if ((r3 & 4) != 4) goto L21;
        byte r5 = r2[4];
        if ((r5 & 4) != 4) goto L21;
        if ((r2[5] & 1) != 1) goto L21;
        if ((r2[8] & 3) != 3) goto L21;
        long r4 = r0;
        long r6 = r3;
        return ((((r6 & 3) << 13) | (((((r4 & 3) << 28) | (((56 & r4) >> 3) << 30)) | ((((long) r2[1]) & 255) << 20)) | (((r6 & 248) >> 3) << 15))) | ((((long) r2[3]) & 255) << 5)) | ((((long) r5) & 248) >> 3);
    L21:
        return -9223372036854775807L;
    }

    public final void a(l51 r5) {
        int r0 = this.a;
        be3 r2 = this.c;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        byte[] r1 = f35.b;
        r2.getClass();
        r2.L(r1.length, r1);
        this.d = true;
        r5.k();
        return;
    L6:
        byte[] r3 = f35.b;
        r2.getClass();
        r2.L(r3.length, r3);
        this.d = true;
        r5.k();
    }
}
