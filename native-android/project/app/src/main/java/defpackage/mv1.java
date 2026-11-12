package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 extends zz1 {
    public static final er1 o = new er1(4);
    public final kv1 n;

    public mv1(kv1 kv1Var) {
        this.n = kv1Var;
    }

    public static we P(be3 be3Var, int i, int i2) {
        int iH0;
        String strConcat;
        int iA = be3Var.A();
        Charset charsetE0 = e0(iA);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        be3Var.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + rr2.U(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iH0 = 2;
        } else {
            iH0 = h0(0, bArr);
            String strU = rr2.U(new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1));
            strConcat = strU.indexOf(47) == -1 ? "image/".concat(strU) : strU;
        }
        int i4 = bArr[iH0 + 1] & 255;
        int i5 = iH0 + 2;
        int iG0 = g0(bArr, i5, iA);
        String str = new String(bArr, i5, iG0 - i5, charsetE0);
        int iD0 = d0(iA) + iG0;
        return new we(strConcat, str, i4, i3 <= iD0 ? f35.b : Arrays.copyOfRange(bArr, iD0, i3));
    }

    public static l10 Q(be3 be3Var, int i, int i2, boolean z, int i3, kv1 kv1Var) throws Throwable {
        int i4 = be3Var.b;
        int iH0 = h0(i4, be3Var.a);
        String str = new String(be3Var.a, i4, iH0 - i4, StandardCharsets.ISO_8859_1);
        be3Var.N(iH0 + 1);
        int iM = be3Var.m();
        int iM2 = be3Var.m();
        long jC = be3Var.C();
        if (jC == 4294967295L) {
            jC = -1;
        }
        long jC2 = be3Var.C();
        long j = jC2 == 4294967295L ? -1L : jC2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (be3Var.b < i5) {
            nv1 nv1VarT = T(i2, be3Var, z, i3, kv1Var);
            if (nv1VarT != null) {
                arrayList.add(nv1VarT);
            }
        }
        return new l10(str, iM, iM2, jC, j, (nv1[]) arrayList.toArray(new nv1[0]));
    }

    public static m10 R(be3 be3Var, int i, int i2, boolean z, int i3, kv1 kv1Var) throws Throwable {
        int i4 = be3Var.b;
        int iH0 = h0(i4, be3Var.a);
        String str = new String(be3Var.a, i4, iH0 - i4, StandardCharsets.ISO_8859_1);
        be3Var.N(iH0 + 1);
        int iA = be3Var.A();
        boolean z2 = (iA & 2) != 0;
        boolean z3 = (iA & 1) != 0;
        int iA2 = be3Var.A();
        String[] strArr = new String[iA2];
        for (int i5 = 0; i5 < iA2; i5++) {
            int i6 = be3Var.b;
            int iH1 = h0(i6, be3Var.a);
            strArr[i5] = new String(be3Var.a, i6, iH1 - i6, StandardCharsets.ISO_8859_1);
            be3Var.N(iH1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (be3Var.b < i7) {
            nv1 nv1VarT = T(i2, be3Var, z, i3, kv1Var);
            if (nv1VarT != null) {
                arrayList.add(nv1VarT);
            }
        }
        return new m10(str, z2, z3, strArr, (nv1[]) arrayList.toArray(new nv1[0]));
    }

    public static l60 S(int i, be3 be3Var) {
        if (i < 4) {
            return null;
        }
        int iA = be3Var.A();
        Charset charsetE0 = e0(iA);
        byte[] bArr = new byte[3];
        be3Var.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        be3Var.k(bArr2, 0, i2);
        int iG0 = g0(bArr2, 0, iA);
        String str2 = new String(bArr2, 0, iG0, charsetE0);
        int iD0 = d0(iA) + iG0;
        return new l60(str, str2, X(bArr2, iD0, g0(bArr2, iD0, iA), charsetE0));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [nv1] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [be3] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [be3] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [be3] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static nv1 T(int i, be3 be3Var, boolean z, int i2, kv1 kv1Var) throws Throwable {
        int iE;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        be3 be3Var2;
        Object ksVar;
        int i6 = i;
        int iA = be3Var.A();
        int iA2 = be3Var.A();
        int iA3 = be3Var.A();
        int iA4 = i6 >= 3 ? be3Var.A() : 0;
        if (i6 == 4) {
            iE = be3Var.E();
            if (!z) {
                iE = (((iE >> 24) & 255) << 21) | (iE & 255) | (((iE >> 8) & 255) << 7) | (((iE >> 16) & 255) << 14);
            }
        } else {
            iE = i6 == 3 ? be3Var.E() : be3Var.D();
        }
        int iI0 = iE;
        int iH = i6 >= 3 ? be3Var.H() : 0;
        if (iA == 0 && iA2 == 0 && iA3 == 0 && iA4 == 0 && iI0 == 0 && iH == 0) {
            be3Var.N(be3Var.c);
            return null;
        }
        int i7 = be3Var.b + iI0;
        if (i7 > be3Var.c) {
            l93.q0("Id3Decoder", "Frame size exceeds remaining tag data");
            be3Var.N(be3Var.c);
            return null;
        }
        if (kv1Var != null) {
            boolean zD = kv1Var.d(i6, iA, iA2, iA3, iA4);
            r1 = iA;
            i3 = iA2;
            if (!zD) {
                i6 = i6;
                be3Var.N(i7);
                return null;
            }
        } else {
            i3 = iA2;
            r1 = iA;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iH & 128) != 0;
            z5 = (iH & 64) != 0;
            z6 = false;
            z4 = (iH & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iH & 64) != 0;
            boolean z8 = (iH & 8) != 0;
            z5 = (iH & 4) != 0;
            z6 = (iH & 2) != 0;
            z3 = (iH & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            l93.q0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            be3Var.N(i7);
            return null;
        }
        if (z4) {
            iI0--;
            be3Var.O(1);
        }
        if (z3) {
            iI0 -= 4;
            be3Var.O(4);
        }
        if (z6) {
            iI0 = i0(iI0, be3Var);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iA3 == 88 && (i6 == 2 || iA4 == 88)) {
                    ksVar = a0(iI0, be3Var);
                } else if (r1 == 84) {
                    ksVar = Y(iI0, be3Var, f0(i6, r1, i3, iA3, iA4));
                } else if (r1 == 87 && i3 == 88 && iA3 == 88 && (i6 == 2 || iA4 == 88)) {
                    ksVar = c0(iI0, be3Var);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iA3 == 73 && iA4 == 86) {
                            ksVar = W(iI0, be3Var);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iA3 != 79 || (iA4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iA3 == 67) {
                                            ksVar = P(be3Var, iI0, i6);
                                        } else if (r1 != 67 && i3 == 79 && iA3 == 77 && (iA4 == 77 || i6 == 2)) {
                                            ksVar = S(iI0, be3Var);
                                        } else if (r1 != 67 && i3 == 72 && iA3 == 65 && iA4 == 80) {
                                            int i8 = iI0;
                                            iI0 = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            try {
                                                ksVar = Q(be3Var, i3, i6, z, i2, kv1Var);
                                                i6 = i;
                                                r1 = be3Var;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = be3Var;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = be3Var;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = be3Var;
                                                r3.N(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iI0;
                                            iI0 = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            try {
                                                if (r11 != 67 && iI0 == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    be3 be3Var3 = be3Var;
                                                    ksVar = R(be3Var3, i3, i6, z, i2, kv1Var);
                                                    r1 = be3Var3;
                                                } else {
                                                    i6 = i;
                                                    be3Var2 = be3Var;
                                                    if (r11 != 77 && iI0 == 76 && i4 == 76 && i5 == 84) {
                                                        ksVar = V(i3, be3Var2);
                                                        r1 = be3Var2;
                                                    } else {
                                                        String strF0 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        be3Var2.k(bArr, 0, i3);
                                                        ksVar = new ks(strF0, bArr);
                                                        r1 = be3Var2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.N(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iA3 == 73 && iA4 == 67) {
                                        ksVar = P(be3Var, iI0, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iI0;
                                            iI0 = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                be3Var2 = be3Var;
                                                if (r11 != 77) {
                                                    String strF1 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    be3Var2.k(bArr2, 0, i3);
                                                    ksVar = new ks(strF1, bArr2);
                                                    r1 = be3Var2;
                                                } else {
                                                    String strF2 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    be3Var2.k(bArr3, 0, i3);
                                                    ksVar = new ks(strF2, bArr3);
                                                    r1 = be3Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                be3Var2 = be3Var;
                                                if (r11 != 77) {
                                                    String strF3 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    be3Var2.k(bArr4, 0, i3);
                                                    ksVar = new ks(strF3, bArr4);
                                                    r1 = be3Var2;
                                                } else {
                                                    String strF4 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    be3Var2.k(bArr5, 0, i3);
                                                    ksVar = new ks(strF4, bArr5);
                                                    r1 = be3Var2;
                                                }
                                            }
                                        } else {
                                            int i11 = iI0;
                                            iI0 = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                be3Var2 = be3Var;
                                                if (r11 != 77) {
                                                    String strF5 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    be3Var2.k(bArr6, 0, i3);
                                                    ksVar = new ks(strF5, bArr6);
                                                    r1 = be3Var2;
                                                } else {
                                                    String strF6 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    be3Var2.k(bArr7, 0, i3);
                                                    ksVar = new ks(strF6, bArr7);
                                                    r1 = be3Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                be3Var2 = be3Var;
                                                if (r11 != 77) {
                                                    String strF7 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    be3Var2.k(bArr8, 0, i3);
                                                    ksVar = new ks(strF7, bArr8);
                                                    r1 = be3Var2;
                                                } else {
                                                    String strF8 = f0(i6, r11 == true ? 1 : 0, iI0, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    be3Var2.k(bArr9, 0, i3);
                                                    ksVar = new ks(strF8, bArr9);
                                                    r1 = be3Var2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                ksVar = U(iI0, be3Var);
                                int i12 = iI0;
                                iI0 = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iA3;
                                i5 = iA4;
                                r1 = be3Var;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = iI0;
                                iI0 = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iA3;
                                i5 = iA4;
                                r2 = be3Var;
                                r2.N(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = iI0;
                                iI0 = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iA3;
                                i5 = iA4;
                                r2 = be3Var;
                                r2.N(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.N(i7);
                        r12 = ksVar;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    ksVar = b0(iI0, be3Var, f0(i6, r1, i3, iA3, iA4));
                }
                int i15 = iI0;
                iI0 = i3;
                i3 = i15;
                r11 = r1;
                i4 = iA3;
                i5 = iA4;
                r1 = be3Var;
                th = null;
                r1.N(i7);
                r12 = ksVar;
                e = th;
                r10 = r11;
            } catch (Throwable th4) {
                th = th4;
                r3 = be3Var;
            }
        } catch (Exception e7) {
            e = e7;
            int i16 = iI0;
            iI0 = i3;
            i3 = i16;
            r9 = r1;
            i4 = iA3;
            i5 = iA4;
            r2 = be3Var;
            th = null;
            r2.N(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (OutOfMemoryError e8) {
            e = e8;
            int i17 = iI0;
            iI0 = i3;
            i3 = i17;
            r9 = r1;
            i4 = iA3;
            i5 = iA4;
            r2 = be3Var;
            th = null;
            r2.N(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        }
        if (r12 == 0) {
            l93.r0("Id3Decoder", "Failed to decode frame: id=" + f0(i6, r10, iI0, i4, i5) + ", frameSize=" + i3, e);
        }
        return r12;
    }

    public static hh1 U(int i, be3 be3Var) {
        int iA = be3Var.A();
        Charset charsetE0 = e0(iA);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        be3Var.k(bArr, 0, i2);
        int iH0 = h0(0, bArr);
        String strM = lw2.m(new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1));
        int i3 = iH0 + 1;
        int iG0 = g0(bArr, i3, iA);
        String strX = X(bArr, i3, iG0, charsetE0);
        int iD0 = d0(iA) + iG0;
        int iG1 = g0(bArr, iD0, iA);
        String strX2 = X(bArr, iD0, iG1, charsetE0);
        int iD1 = d0(iA) + iG1;
        return new hh1(strM, strX, strX2, i2 <= iD1 ? f35.b : Arrays.copyOfRange(bArr, iD1, i2));
    }

    public static pw2 V(int i, be3 be3Var) {
        int iH = be3Var.H();
        int iD = be3Var.D();
        int iD2 = be3Var.D();
        int iA = be3Var.A();
        int iA2 = be3Var.A();
        h00 h00Var = new h00();
        h00Var.p(be3Var);
        int i2 = ((i - 10) * 8) / (iA + iA2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = h00Var.i(iA);
            int i5 = h00Var.i(iA2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new pw2(iH, iD, iD2, iArr, iArr2);
    }

    public static hq3 W(int i, be3 be3Var) {
        byte[] bArr = new byte[i];
        be3Var.k(bArr, 0, i);
        int iH0 = h0(0, bArr);
        String str = new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1);
        int i2 = iH0 + 1;
        return new hq3(str, i <= i2 ? f35.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String X(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static ds4 Y(int i, be3 be3Var, String str) {
        if (i < 1) {
            return null;
        }
        int iA = be3Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        be3Var.k(bArr, 0, i2);
        return new ds4(str, null, Z(bArr, iA, 0));
    }

    public static gy3 Z(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return yw1.o("");
        }
        uw1 uw1VarJ = yw1.j();
        int iG0 = g0(bArr, i2, i);
        while (i2 < iG0) {
            uw1VarJ.c(new String(bArr, i2, iG0 - i2, e0(i)));
            i2 = d0(i) + iG0;
            iG0 = g0(bArr, i2, i);
        }
        gy3 gy3VarF = uw1VarJ.f();
        return gy3VarF.isEmpty() ? yw1.o("") : gy3VarF;
    }

    public static ds4 a0(int i, be3 be3Var) {
        if (i < 1) {
            return null;
        }
        int iA = be3Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        be3Var.k(bArr, 0, i2);
        int iG0 = g0(bArr, 0, iA);
        return new ds4("TXXX", new String(bArr, 0, iG0, e0(iA)), Z(bArr, iA, d0(iA) + iG0));
    }

    public static w25 b0(int i, be3 be3Var, String str) {
        byte[] bArr = new byte[i];
        be3Var.k(bArr, 0, i);
        return new w25(str, null, new String(bArr, 0, h0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static w25 c0(int i, be3 be3Var) {
        if (i < 1) {
            return null;
        }
        int iA = be3Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        be3Var.k(bArr, 0, i2);
        int iG0 = g0(bArr, 0, iA);
        String str = new String(bArr, 0, iG0, e0(iA));
        int iD0 = d0(iA) + iG0;
        return new w25("WXXX", str, X(bArr, iD0, h0(iD0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int d0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset e0(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String f0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int g0(byte[] bArr, int i, int i2) {
        int iH0 = h0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iH0;
        }
        while (iH0 < bArr.length - 1) {
            if ((iH0 - i) % 2 == 0 && bArr[iH0 + 1] == 0) {
                return iH0;
            }
            iH0 = h0(iH0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int h0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int i0(int i, be3 be3Var) {
        byte[] bArr = be3Var.a;
        int i2 = be3Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean j0(be3 be3Var, int i, int i2, boolean z) {
        int iD;
        long jD;
        int iH;
        int i3;
        int i4 = be3Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (be3Var.a() < i2) {
                    be3Var.N(i4);
                    return true;
                }
                if (i >= 3) {
                    iD = be3Var.m();
                    jD = be3Var.C();
                    iH = be3Var.H();
                } else {
                    iD = be3Var.D();
                    jD = be3Var.D();
                    iH = 0;
                }
                if (iD == 0 && jD == 0 && iH == 0) {
                    be3Var.N(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jD) != 0) {
                        be3Var.N(i4);
                        return false;
                    }
                    jD = (((jD >> 24) & 255) << 21) | (jD & 255) | (((jD >> 8) & 255) << 7) | (((jD >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iH & 64) != 0 ? 1 : 0;
                    if ((iH & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iH & 32) != 0 ? 1 : 0;
                    if ((iH & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jD < i3) {
                    be3Var.N(i4);
                    return false;
                }
                if (be3Var.a() < jD) {
                    be3Var.N(i4);
                    return false;
                }
                be3Var.O((int) jD);
            } catch (Throwable th) {
                be3Var.N(i4);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final qv2 O(int i, byte[] bArr) {
        boolean z;
        lv1 lv1Var;
        int i2;
        int i3;
        int iI0;
        nv1 nv1VarT;
        ArrayList arrayList = new ArrayList();
        be3 be3Var = new be3(i, bArr);
        boolean z2 = false;
        if (be3Var.a() < 10) {
            l93.q0("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iD = be3Var.D();
            if (iD == 4801587) {
                int iA = be3Var.A();
                be3Var.O(1);
                int iA2 = be3Var.A();
                int iZ = be3Var.z();
                if (iA != 2) {
                    if (iA == 3) {
                        if ((iA2 & 64) != 0) {
                            int iM = be3Var.m();
                            be3Var.O(iM);
                            iZ -= iM + 4;
                        }
                    } else if (iA == 4) {
                        if ((iA2 & 64) != 0) {
                            int iZ2 = be3Var.z();
                            be3Var.O(iZ2 - 4);
                            iZ -= iZ2;
                        }
                        if ((iA2 & 16) != 0) {
                            iZ -= 10;
                        }
                    } else {
                        xa3.m(iA, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iA < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    lv1Var = new lv1(iA, iZ, z);
                } else if ((iA2 & 64) != 0) {
                    l93.q0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iA < 4 || (iA2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    lv1Var = new lv1(iA, iZ, z);
                }
                if (lv1Var == null) {
                    return null;
                }
                i2 = lv1Var.a;
                int i4 = be3Var.b;
                i3 = i2 == 2 ? 6 : 10;
                iI0 = lv1Var.c;
                if (lv1Var.b) {
                    iI0 = i0(iI0, be3Var);
                }
                be3Var.M(i4 + iI0);
                if (!j0(be3Var, i2, i3, false)) {
                    if (i2 == 4 || !j0(be3Var, 4, i3, true)) {
                        xa3.m(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (be3Var.a() >= i3) {
                    nv1VarT = T(i2, be3Var, z2, i3, this.n);
                    if (nv1VarT != null) {
                        arrayList.add(nv1VarT);
                    }
                }
                return new qv2(arrayList);
            }
            l93.q0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iD))));
        }
        lv1Var = null;
        if (lv1Var == null) {
            return null;
        }
        i2 = lv1Var.a;
        int i5 = be3Var.b;
        if (i2 == 2) {
        }
        iI0 = lv1Var.c;
        if (lv1Var.b) {
            iI0 = i0(iI0, be3Var);
        }
        be3Var.M(i5 + iI0);
        if (!j0(be3Var, i2, i3, false)) {
            if (i2 == 4) {
            }
            xa3.m(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (be3Var.a() >= i3) {
            nv1VarT = T(i2, be3Var, z2, i3, this.n);
            if (nv1VarT != null) {
                arrayList.add(nv1VarT);
            }
        }
        return new qv2(arrayList);
    }

    @Override // defpackage.zz1
    public final qv2 k(uv2 uv2Var, ByteBuffer byteBuffer) {
        return O(byteBuffer.limit(), byteBuffer.array());
    }
}
