package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(w10.a);
        bytes.getClass();
        a = bytes;
    }

    public static final String a(tv tvVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (tvVar.q(j2) == 13) {
                String strK = tvVar.K(j2, w10.a);
                tvVar.skip(2L);
                return strK;
            }
        }
        String strK2 = tvVar.K(j, w10.a);
        tvVar.skip(1L);
        return strK2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int b(tv tvVar, cb3 cb3Var, boolean z) {
        int i;
        int i2;
        int i3;
        t84 t84Var;
        int i4;
        cb3Var.getClass();
        t84 t84Var2 = tvVar.n;
        if (t84Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = t84Var2.a;
        int i5 = t84Var2.b;
        int i6 = t84Var2.c;
        int[] iArr = cb3Var.o;
        t84 t84Var3 = t84Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (t84Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            t84Var3 = t84Var3.f;
                            t84Var3.getClass();
                            int i16 = t84Var3.b;
                            byte[] bArr2 = t84Var3.a;
                            i2 = t84Var3.c;
                            if (t84Var3 == t84Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                t84Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        t84Var3.getClass();
                        t84 t84Var4 = t84Var3.f;
                        t84Var4.getClass();
                        i3 = t84Var4.b;
                        byte[] bArr3 = t84Var4.a;
                        i4 = t84Var4.c;
                        if (t84Var4 != t84Var2) {
                            t84Var = t84Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            t84Var = null;
                        }
                    } else {
                        t84Var = t84Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        t84Var3 = t84Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    t84Var3 = t84Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
