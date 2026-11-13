package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public sr3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new iu4(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new be3();
                break;
            default:
                this.b = new iu4(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new be3();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(be3 be3Var) {
        int i = be3Var.b;
        if (be3Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        be3Var.k(bArr, 0, 9);
        be3Var.N(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(l51 l51Var) {
        int i = this.a;
        be3 be3Var = this.c;
        switch (i) {
            case 0:
                byte[] bArr = f35.b;
                be3Var.getClass();
                be3Var.L(bArr.length, bArr);
                this.d = true;
                l51Var.k();
                break;
            default:
                byte[] bArr2 = f35.b;
                be3Var.getClass();
                be3Var.L(bArr2.length, bArr2);
                this.d = true;
                l51Var.k();
                break;
        }
    }
}
