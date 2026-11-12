package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 extends fh0 {
    public final long n;
    public long o;
    public final /* synthetic */ cu1 p;

    public bu1(cu1 cu1Var, long j) {
        this.p = cu1Var;
        this.n = j;
    }

    @Override // defpackage.fh0
    public final int e() {
        long j = this.n - this.o;
        qs qsVar = this.p.p;
        return (int) Math.min(j, ((((long) qsVar.n.available()) * 8) + ((long) qsVar.q)) / 8);
    }

    @Override // defpackage.fh0
    public final boolean o() {
        return this.o < this.n;
    }

    @Override // defpackage.fh0
    public final int r(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.n - this.o, i2);
        while (i3 < iMin) {
            cu1 cu1Var = this.p;
            qs qsVar = cu1Var.p;
            i iVar = cu1Var.r;
            int i4 = 1;
            if (qsVar.q > 0) {
                byte bJ = (byte) cu1.j(qsVar, 8);
                int i5 = i + i3;
                byte[] bArr2 = (byte[]) iVar.c;
                int i6 = iVar.a;
                bArr2[i6] = bJ;
                int i7 = (i6 + 1) & 65535;
                if (!iVar.b && i7 < i6) {
                    iVar.b = true;
                }
                iVar.a = i7;
                bArr[i5] = bJ;
            } else {
                int i8 = i + i3;
                int i9 = cu1Var.q.read(bArr, i8, iMin - i3);
                if (i9 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                for (int i10 = i8; i10 < i8 + i9; i10++) {
                    byte b = bArr[i10];
                    byte[] bArr3 = (byte[]) iVar.c;
                    int i11 = iVar.a;
                    bArr3[i11] = b;
                    int i12 = (i11 + 1) & 65535;
                    if (!iVar.b && i12 < i11) {
                        iVar.b = true;
                    }
                    iVar.a = i12;
                }
                i4 = i9;
            }
            this.o += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // defpackage.fh0
    public final int x() {
        return this.o < this.n ? 2 : 1;
    }
}
