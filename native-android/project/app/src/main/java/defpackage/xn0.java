package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 extends i90 {
    public ByteArrayInputStream o;
    public cu1 p;
    public final byte[] q;

    public xn0(ByteArrayInputStream byteArrayInputStream) {
        cu1 cu1Var = new cu1(byteArrayInputStream);
        this.q = new byte[1];
        this.p = cu1Var;
        this.o = byteArrayInputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        cu1 cu1Var = this.p;
        if (cu1Var != null) {
            return cu1Var.o.e();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            cu1 cu1Var = this.p;
            if (cu1Var != null) {
                try {
                    cu1Var.close();
                } catch (IOException unused) {
                }
            }
            this.p = null;
        } finally {
            ByteArrayInputStream byteArrayInputStream = this.o;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                this.o = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        int iJ;
        int iR;
        if (i2 == 0) {
            return 0;
        }
        cu1 cu1Var = this.p;
        if (cu1Var == null) {
            return -1;
        }
        while (true) {
            if (cu1Var.n && !cu1Var.o.o()) {
                iR = -1;
                break;
            }
            boolean z = true;
            if (cu1Var.o.x() == 1) {
                cu1Var.n = cu1.j(cu1Var.p, 1) == 1;
                int i3 = 2;
                int iJ2 = (int) cu1.j(cu1Var.p, 2);
                int i4 = 16;
                if (iJ2 == 0) {
                    qs qsVar = cu1Var.p;
                    int i5 = qsVar.q % 8;
                    if (i5 > 0) {
                        qsVar.f(i5);
                    }
                    long j2 = cu1.j(cu1Var.p, 16);
                    if ((65535 & (j2 ^ 65535)) != cu1.j(cu1Var.p, 16)) {
                        kf2.o("Illegal LEN / NLEN values");
                        return 0;
                    }
                    cu1Var.o = new bu1(cu1Var, j2);
                } else if (iJ2 == 1) {
                    cu1Var.o = new zt1(cu1Var, 4, cu1.v, cu1.w);
                } else {
                    if (iJ2 != 2) {
                        kf2.o(f34.f(iJ2, "Unsupported compression: "));
                        return 0;
                    }
                    int[][] iArr = {new int[(int) (cu1.j(cu1Var.p, 5) + 257)], new int[(int) (cu1.j(cu1Var.p, 5) + 1)]};
                    qs qsVar2 = cu1Var.p;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iJ3 = (int) (cu1.j(qsVar2, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i6 = 0;
                    while (i6 < iJ3) {
                        iArr4[cu1.u[i6]] = (int) cu1.j(qsVar2, 3);
                        i6++;
                        iArr = iArr;
                    }
                    int[][] iArr5 = iArr;
                    tu tuVarB = cu1.b(iArr4);
                    int length = iArr2.length + iArr3.length;
                    int[] iArr6 = new int[length];
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = -1;
                    while (i7 < length) {
                        if (i8 > 0) {
                            iArr6[i7] = i9;
                            i8--;
                            i7++;
                        } else {
                            boolean z2 = z;
                            int iF = cu1.f(qsVar2, tuVarB);
                            if (iF < i4) {
                                iArr6[i7] = iF;
                                i7++;
                                i9 = iF;
                            } else {
                                long j3 = 3;
                                if (iF == i4) {
                                    iJ = (int) (cu1.j(qsVar2, i3) + 3);
                                } else {
                                    if (iF == 17) {
                                        j = cu1.j(qsVar2, 3);
                                    } else if (iF == 18) {
                                        j = cu1.j(qsVar2, 7);
                                        j3 = 11;
                                    }
                                    iJ = (int) (j + j3);
                                    i9 = 0;
                                }
                                i8 = iJ;
                            }
                            z = z2;
                            i3 = 2;
                            i4 = 16;
                        }
                    }
                    System.arraycopy(iArr6, 0, iArr2, 0, iArr2.length);
                    System.arraycopy(iArr6, iArr2.length, iArr3, 0, iArr3.length);
                    cu1Var.o = new zt1(cu1Var, 3, iArr5[0], iArr5[z ? 1 : 0]);
                }
            } else {
                iR = cu1Var.o.r(bArr, i, i2);
                if (iR != 0) {
                    break;
                }
            }
        }
        long j4 = this.p.p.n.n;
        b(iR);
        if (iR == -1) {
            cu1 cu1Var2 = this.p;
            if (cu1Var2 != null) {
                try {
                    cu1Var2.close();
                } catch (IOException unused) {
                }
            }
            this.p = null;
        }
        return iR;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.q;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & 255;
        }
        kf2.o(f34.f(i, "Invalid return value from read: "));
        return 0;
    }
}
