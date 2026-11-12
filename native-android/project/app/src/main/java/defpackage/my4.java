package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my4 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(wv4 wv4Var, vv4 vv4Var) {
        if (this.c > 0) {
            wv4Var.a(this.d, this.e, this.f, this.g, vv4Var);
            this.c = 0;
        }
    }

    public final void b(wv4 wv4Var, long j, int i, int i2, int i3, vv4 vv4Var) {
        rr2.v("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(wv4Var, vv4Var);
            }
        }
    }

    public final void c(l51 l51Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        l51Var.n(bArr, 0, 10);
        l51Var.k();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
