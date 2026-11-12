package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zt1 extends fh0 {
    public final int o;
    public final tu p;
    public final tu q;
    public final /* synthetic */ cu1 u;
    public boolean n = false;
    public int r = 0;
    public byte[] s = new byte[0];
    public int t = 0;

    public zt1(cu1 cu1Var, int i, int[] iArr, int[] iArr2) {
        this.u = cu1Var;
        this.o = i;
        this.p = cu1.b(iArr);
        this.q = cu1.b(iArr2);
    }

    @Override // defpackage.fh0
    public final int e() {
        return this.t - this.r;
    }

    @Override // defpackage.fh0
    public final boolean o() {
        return !this.n;
    }

    @Override // defpackage.fh0
    public final int r(byte[] bArr, int i, int i2) {
        int iMin;
        int i3;
        int iMin2;
        int i4;
        int i5 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.n) {
            return -1;
        }
        int i6 = this.t - this.r;
        if (i6 > 0) {
            iMin = Math.min(i2, i6);
            System.arraycopy(this.s, this.r, bArr, i, iMin);
            this.r += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            cu1 cu1Var = this.u;
            qs qsVar = cu1Var.p;
            i iVar = cu1Var.r;
            byte[] bArr2 = (byte[]) iVar.c;
            int iF = cu1.f(qsVar, this.p);
            int i7 = 65535;
            if (iF >= 256) {
                if (iF <= 256) {
                    this.n = true;
                    break;
                }
                short s = cu1.s[iF - 257];
                int iJ = (int) (cu1.j(cu1Var.p, s & 31) + ((long) (s >>> 5)));
                int i8 = cu1.t[cu1.f(cu1Var.p, this.q)];
                int iJ2 = (int) (cu1.j(cu1Var.p, i8 & 15) + ((long) (i8 >>> 4)));
                if (this.s.length < iJ) {
                    this.s = new byte[iJ];
                }
                this.t = iJ;
                this.r = i5;
                byte[] bArr3 = this.s;
                if (iJ2 > bArr2.length) {
                    int i9 = i5;
                    kf2.o(f34.f(iJ2, "Illegal distance parameter: "));
                    return i9;
                }
                int i10 = iVar.a;
                int i11 = (i10 - iJ2) & 65535;
                if (!iVar.b && i11 >= i10) {
                    kf2.o(f34.f(iJ2, "Attempt to read beyond memory: dist="));
                    return i5;
                }
                int i12 = i5;
                while (i12 < iJ) {
                    byte b = bArr2[i11];
                    int i13 = iVar.a;
                    bArr2[i13] = b;
                    int i14 = i5;
                    int i15 = (i13 + 1) & i7;
                    int i16 = i7;
                    if (!iVar.b && i15 < i13) {
                        iVar.b = true;
                    }
                    iVar.a = i15;
                    bArr3[i12] = b;
                    i12++;
                    int i17 = (i11 + 1) & i16;
                    if (!iVar.b && i17 < i11) {
                        iVar.b = true;
                    }
                    i11 = i17;
                    i7 = i16;
                    i5 = i14;
                }
                i3 = i5;
                int i18 = i + iMin;
                int i19 = i2 - iMin;
                int i20 = this.t - this.r;
                if (i20 > 0) {
                    iMin2 = Math.min(i19, i20);
                    System.arraycopy(this.s, this.r, bArr, i18, iMin2);
                    this.r += iMin2;
                } else {
                    iMin2 = i3;
                }
                i4 = iMin2 + iMin;
            } else {
                i4 = iMin + 1;
                int i21 = iMin + i;
                byte b2 = (byte) iF;
                int i22 = iVar.a;
                bArr2[i22] = b2;
                int i23 = (i22 + 1) & 65535;
                if (!iVar.b && i23 < i22) {
                    iVar.b = true;
                }
                iVar.a = i23;
                bArr[i21] = b2;
                i3 = i5;
            }
            iMin = i4;
            i5 = i3;
        }
        return iMin;
    }

    @Override // defpackage.fh0
    public final int x() {
        if (this.n) {
            return 1;
        }
        return this.o;
    }
}
