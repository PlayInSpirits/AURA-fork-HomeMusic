package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ol1 {
    public final double a;
    public final double b;
    public final double c;
    public final int d;

    public ol1(int i) {
        this.d = i;
        sy syVarA = sy.a(i);
        this.a = syVarA.a;
        this.b = syVarA.b;
        this.c = (h12.B(ud3.a0(new double[]{h12.E((i >> 16) & 255), h12.E((i >> 8) & 255), h12.E(i & 255)}, h12.a)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:102:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:104:0x0314  */
    /* JADX WARN: Code duplicated, block: B:113:0x0391  */
    /* JADX WARN: Code duplicated, block: B:114:0x0396  */
    /* JADX WARN: Code duplicated, block: B:136:0x039f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207  */
    /* JADX WARN: Code duplicated, block: B:55:0x0215  */
    /* JADX WARN: Code duplicated, block: B:56:0x0218  */
    /* JADX WARN: Code duplicated, block: B:59:0x021e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0222  */
    /* JADX WARN: Code duplicated, block: B:63:0x0227  */
    /* JADX WARN: Code duplicated, block: B:65:0x0235  */
    /* JADX WARN: Code duplicated, block: B:67:0x0242  */
    /* JADX WARN: Code duplicated, block: B:68:0x0249  */
    /* JADX WARN: Code duplicated, block: B:70:0x024f  */
    /* JADX WARN: Code duplicated, block: B:72:0x025f  */
    /* JADX WARN: Code duplicated, block: B:73:0x026a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0270  */
    /* JADX WARN: Code duplicated, block: B:76:0x0280  */
    /* JADX WARN: Code duplicated, block: B:77:0x028b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0298  */
    /* JADX WARN: Code duplicated, block: B:83:0x029e  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ef  */
    public static ol1 a(double d, double d2, double d3) {
        int iL;
        int iL2;
        int iL3;
        double[] dArr;
        double d4;
        int i;
        int i2;
        double[] dArr2;
        double[] dArr3;
        double d5;
        double d6;
        boolean z;
        int i3;
        int i4;
        double d7;
        double[] dArr4;
        double dY;
        double[] dArr5;
        int i5;
        double d8;
        double d9;
        int iCeil;
        double dFloor;
        int i6;
        int i7;
        int iFloor;
        double[] dArr6;
        double dY2;
        double d10;
        double d11;
        double d12;
        double d13;
        boolean z2;
        double d14;
        double d15;
        double d16;
        double[] dArr7;
        double[] dArr8;
        double d17;
        double d18;
        double dY3;
        double d19;
        double d20;
        double d21;
        double[] dArr9 = j51.e;
        if (d2 >= 1.0E-4d && d3 >= 1.0E-4d && d3 <= 99.9999d) {
            double d22 = d % 360.0d;
            if (d22 < 0.0d) {
                d22 += 360.0d;
            }
            double dR = h12.R(d3);
            double dSqrt = Math.sqrt(dR) * 11.0d;
            h85 h85Var = h85.k;
            double d23 = (d22 / 180.0d) * 3.141592653589793d;
            int i8 = -16777216;
            double d24 = 1.0d;
            double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, h85Var.f), 0.73d);
            double dCos = (Math.cos(d23 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * h85Var.e * h85Var.c;
            double dSin = Math.sin(d23);
            double dCos2 = Math.cos(d23);
            int i9 = 0;
            while (true) {
                double d25 = d24;
                int i10 = i8;
                if (i9 < 5) {
                    double d26 = dSqrt / 100.0d;
                    i2 = 8;
                    dArr = dArr9;
                    d4 = dR;
                    double dPow2 = Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / Math.sqrt(d26)) * dPow, 1.1111111111111112d);
                    double dPow3 = (Math.pow(d26, (d25 / h85Var.d) / h85Var.j) * h85Var.a) / h85Var.b;
                    double d27 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((108.0d * dPow2) * dSin) + (((dPow2 * 11.0d) * dCos2) + (23.0d * dCos)));
                    double d28 = d27 * dCos2;
                    double d29 = d27 * dSin;
                    double d30 = dPow3 * 460.0d;
                    i = 1;
                    double[] dArrA0 = ud3.a0(new double[]{j51.A(((288.0d * d29) + ((451.0d * d28) + d30)) / 1403.0d), j51.A(((d30 - (891.0d * d28)) - (261.0d * d29)) / 1403.0d), j51.A(((d30 - (d28 * 220.0d)) - (d29 * 6300.0d)) / 1403.0d)}, j51.d);
                    double d31 = dArrA0[0];
                    if (d31 >= 0.0d) {
                        double d32 = dArrA0[1];
                        if (d32 >= 0.0d) {
                            double d33 = dArrA0[2];
                            if (d33 >= 0.0d) {
                                double d34 = (dArr[2] * d33) + (dArr[1] * d32) + (dArr[0] * d31);
                                if (d34 > 0.0d) {
                                    if (i9 != 4) {
                                        double d35 = d34 - d4;
                                        if (Math.abs(d35) >= 0.002d) {
                                            dSqrt -= (d35 * dSqrt) / (d34 * 2.0d);
                                            i9++;
                                            d24 = d25;
                                            i8 = i10;
                                            dArr9 = dArr;
                                            dR = d4;
                                        }
                                    }
                                    double d36 = dArrA0[0];
                                    if (d36 <= 100.01d && dArrA0[1] <= 100.01d && dArrA0[2] <= 100.01d) {
                                        iL3 = (h12.l(dArrA0[2]) & 255) | ((h12.l(d36) & 255) << 16) | i10 | ((h12.l(dArrA0[1]) & 255) << 8);
                                    }
                                    if (iL3 == 0) {
                                        dArr2 = new double[3];
                                        dArr2[0] = -1.0d;
                                        dArr2[i] = -1.0d;
                                        dArr2[2] = -1.0d;
                                        dArr3 = dArr2;
                                        d5 = 0.0d;
                                        d6 = 0.0d;
                                        z = false;
                                        i3 = 0;
                                        i4 = i;
                                        while (i3 < 12) {
                                            d11 = dArr[0];
                                            d12 = dArr[i];
                                            d13 = dArr[2];
                                            z2 = z;
                                            if (i3 % 4 <= i) {
                                                d14 = 0.0d;
                                            } else {
                                                d14 = 100.0d;
                                            }
                                            if (i3 % 2 == 0) {
                                                d15 = 0.0d;
                                            } else {
                                                d15 = 100.0d;
                                            }
                                            if (i3 < 4) {
                                                d21 = ((d4 - (d12 * d14)) - (d13 * d15)) / d11;
                                                if (j51.B(d21)) {
                                                    dArr7 = new double[]{d21, d14, d15};
                                                } else {
                                                    dArr7 = new double[]{-1.0d, -1.0d, -1.0d};
                                                }
                                            } else {
                                                if (i3 < i2) {
                                                    d17 = ((d4 - (d11 * d15)) - (d13 * d14)) / d12;
                                                    if (j51.B(d17)) {
                                                        dArr8 = new double[]{d15, d17, d14};
                                                    } else {
                                                        dArr7 = new double[]{-1.0d, -1.0d, -1.0d};
                                                    }
                                                } else {
                                                    d16 = ((d4 - (d11 * d14)) - (d12 * d15)) / d13;
                                                    if (j51.B(d16)) {
                                                        dArr8 = new double[]{d14, d15, d16};
                                                    } else {
                                                        dArr7 = new double[]{-1.0d, -1.0d, -1.0d};
                                                    }
                                                }
                                                if (dArr8[0] < 0.0d) {
                                                    d18 = d23;
                                                    z = z2;
                                                } else {
                                                    dY3 = j51.y(dArr8);
                                                    if (!z2) {
                                                        d18 = d23;
                                                        d5 = dY3;
                                                        d6 = d5;
                                                        dArr2 = dArr8;
                                                        dArr3 = dArr2;
                                                        z = true;
                                                    } else if (i4 == 0 || j51.i(d5, dY3, d6)) {
                                                        d19 = d23;
                                                        d20 = d5;
                                                        d5 = d20;
                                                        d18 = d19;
                                                        if (j51.i(d20, d19, dY3)) {
                                                            d6 = dY3;
                                                            dArr3 = dArr8;
                                                        } else {
                                                            d5 = dY3;
                                                            dArr2 = dArr8;
                                                        }
                                                        z = z2;
                                                        i4 = 0;
                                                    } else {
                                                        d18 = d23;
                                                        z = z2;
                                                    }
                                                }
                                                i3++;
                                                d23 = d18;
                                                i = 1;
                                                i2 = 8;
                                            }
                                            dArr8 = dArr7;
                                            if (dArr8[0] < 0.0d) {
                                                d18 = d23;
                                                z = z2;
                                            } else {
                                                dY3 = j51.y(dArr8);
                                                if (!z2) {
                                                    d18 = d23;
                                                    d5 = dY3;
                                                    d6 = d5;
                                                    dArr2 = dArr8;
                                                    dArr3 = dArr2;
                                                    z = true;
                                                } else {
                                                    if (i4 == 0) {
                                                    }
                                                    d19 = d23;
                                                    d20 = d5;
                                                    d5 = d20;
                                                    d18 = d19;
                                                    if (j51.i(d20, d19, dY3)) {
                                                        d6 = dY3;
                                                        dArr3 = dArr8;
                                                    } else {
                                                        d5 = dY3;
                                                        dArr2 = dArr8;
                                                    }
                                                    z = z2;
                                                    i4 = 0;
                                                }
                                            }
                                            i3++;
                                            d23 = d18;
                                            i = 1;
                                            i2 = 8;
                                        }
                                        d7 = d23;
                                        double[][] dArr10 = {dArr2, dArr3};
                                        dArr4 = dArr10[0];
                                        dY = j51.y(dArr4);
                                        dArr5 = dArr10[1];
                                        for (i5 = 0; i5 < 3; i5++) {
                                            d8 = dArr4[i5];
                                            d9 = dArr5[i5];
                                            if (d8 == d9) {
                                                if (d8 < d9) {
                                                    iCeil = (int) Math.floor(j51.S(d8) - 0.5d);
                                                    dFloor = Math.ceil(j51.S(dArr5[i5]) - 0.5d);
                                                } else {
                                                    iCeil = (int) Math.ceil(j51.S(d8) - 0.5d);
                                                    dFloor = Math.floor(j51.S(dArr5[i5]) - 0.5d);
                                                }
                                                i6 = (int) dFloor;
                                                for (i7 = 0; i7 < 8 && Math.abs(i6 - iCeil) > 1; i7++) {
                                                    iFloor = (int) Math.floor(((double) (iCeil + i6)) / 2.0d);
                                                    double d37 = j51.f[iFloor];
                                                    double d38 = dArr4[i5];
                                                    double d39 = (d37 - d38) / (dArr5[i5] - d38);
                                                    double d40 = dArr4[0];
                                                    double d41 = ((dArr5[0] - d40) * d39) + d40;
                                                    double d42 = dArr4[1];
                                                    double d43 = ((dArr5[1] - d42) * d39) + d42;
                                                    double d44 = dArr4[2];
                                                    dArr6 = new double[]{d41, d43, ((dArr5[2] - d44) * d39) + d44};
                                                    dY2 = j51.y(dArr6);
                                                    d10 = dY;
                                                    if (j51.i(d10, d7, dY2)) {
                                                        i6 = iFloor;
                                                        dArr5 = dArr6;
                                                        dY = d10;
                                                    } else {
                                                        iCeil = iFloor;
                                                        dArr4 = dArr6;
                                                        dY = dY2;
                                                    }
                                                }
                                                dY = dY;
                                            }
                                        }
                                        double[] dArr11 = {(dArr4[0] + dArr5[0]) / 2.0d, (dArr4[1] + dArr5[1]) / 2.0d, (dArr4[2] + dArr5[2]) / 2.0d};
                                        iL2 = ((h12.l(dArr11[0]) & 255) << 16) | i10 | ((h12.l(dArr11[1]) & 255) << 8);
                                        iL = h12.l(dArr11[2]) & 255;
                                    }
                                    return new ol1(iL3);
                                }
                            }
                        }
                    }
                } else {
                    dArr = dArr9;
                    d4 = dR;
                    i = 1;
                    i2 = 8;
                }
                iL3 = 0;
                if (iL3 == 0) {
                    dArr2 = new double[3];
                    dArr2[0] = -1.0d;
                    dArr2[i] = -1.0d;
                    dArr2[2] = -1.0d;
                    dArr3 = dArr2;
                    d5 = 0.0d;
                    d6 = 0.0d;
                    z = false;
                    i3 = 0;
                    i4 = i;
                    while (i3 < 12) {
                        d11 = dArr[0];
                        d12 = dArr[i];
                        d13 = dArr[2];
                        z2 = z;
                        if (i3 % 4 <= i) {
                            d14 = 0.0d;
                        } else {
                            d14 = 100.0d;
                        }
                        if (i3 % 2 == 0) {
                            d15 = 0.0d;
                        } else {
                            d15 = 100.0d;
                        }
                        if (i3 < 4) {
                            d21 = ((d4 - (d12 * d14)) - (d13 * d15)) / d11;
                            if (j51.B(d21)) {
                                dArr7 = new double[]{d21, d14, d15};
                            } else {
                                dArr7 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        } else {
                            if (i3 < i2) {
                                d17 = ((d4 - (d11 * d15)) - (d13 * d14)) / d12;
                                if (j51.B(d17)) {
                                    dArr8 = new double[]{d15, d17, d14};
                                } else {
                                    dArr7 = new double[]{-1.0d, -1.0d, -1.0d};
                                }
                            } else {
                                d16 = ((d4 - (d11 * d14)) - (d12 * d15)) / d13;
                                if (j51.B(d16)) {
                                    dArr8 = new double[]{d14, d15, d16};
                                } else {
                                    dArr7 = new double[]{-1.0d, -1.0d, -1.0d};
                                }
                            }
                            if (dArr8[0] < 0.0d) {
                                d18 = d23;
                                z = z2;
                            } else {
                                dY3 = j51.y(dArr8);
                                if (!z2) {
                                    d18 = d23;
                                    d5 = dY3;
                                    d6 = d5;
                                    dArr2 = dArr8;
                                    dArr3 = dArr2;
                                    z = true;
                                } else {
                                    if (i4 == 0) {
                                    }
                                    d19 = d23;
                                    d20 = d5;
                                    d5 = d20;
                                    d18 = d19;
                                    if (j51.i(d20, d19, dY3)) {
                                        d6 = dY3;
                                        dArr3 = dArr8;
                                    } else {
                                        d5 = dY3;
                                        dArr2 = dArr8;
                                    }
                                    z = z2;
                                    i4 = 0;
                                }
                            }
                            i3++;
                            d23 = d18;
                            i = 1;
                            i2 = 8;
                        }
                        dArr8 = dArr7;
                        if (dArr8[0] < 0.0d) {
                            d18 = d23;
                            z = z2;
                        } else {
                            dY3 = j51.y(dArr8);
                            if (!z2) {
                                d18 = d23;
                                d5 = dY3;
                                d6 = d5;
                                dArr2 = dArr8;
                                dArr3 = dArr2;
                                z = true;
                            } else {
                                if (i4 == 0) {
                                }
                                d19 = d23;
                                d20 = d5;
                                d5 = d20;
                                d18 = d19;
                                if (j51.i(d20, d19, dY3)) {
                                    d6 = dY3;
                                    dArr3 = dArr8;
                                } else {
                                    d5 = dY3;
                                    dArr2 = dArr8;
                                }
                                z = z2;
                                i4 = 0;
                            }
                        }
                        i3++;
                        d23 = d18;
                        i = 1;
                        i2 = 8;
                    }
                    d7 = d23;
                    double[][] dArr12 = {dArr2, dArr3};
                    dArr4 = dArr12[0];
                    dY = j51.y(dArr4);
                    dArr5 = dArr12[1];
                    while (i5 < 3) {
                        d8 = dArr4[i5];
                        d9 = dArr5[i5];
                        if (d8 == d9) {
                            if (d8 < d9) {
                                iCeil = (int) Math.floor(j51.S(d8) - 0.5d);
                                dFloor = Math.ceil(j51.S(dArr5[i5]) - 0.5d);
                            } else {
                                iCeil = (int) Math.ceil(j51.S(d8) - 0.5d);
                                dFloor = Math.floor(j51.S(dArr5[i5]) - 0.5d);
                            }
                            i6 = (int) dFloor;
                            while (i7 < 8) {
                                iFloor = (int) Math.floor(((double) (iCeil + i6)) / 2.0d);
                                double d310 = j51.f[iFloor];
                                double d311 = dArr4[i5];
                                double d312 = (d310 - d311) / (dArr5[i5] - d311);
                                double d45 = dArr4[0];
                                double d46 = ((dArr5[0] - d45) * d312) + d45;
                                double d47 = dArr4[1];
                                double d48 = ((dArr5[1] - d47) * d312) + d47;
                                double d49 = dArr4[2];
                                dArr6 = new double[]{d46, d48, ((dArr5[2] - d49) * d312) + d49};
                                dY2 = j51.y(dArr6);
                                d10 = dY;
                                if (j51.i(d10, d7, dY2)) {
                                    i6 = iFloor;
                                    dArr5 = dArr6;
                                    dY = d10;
                                } else {
                                    iCeil = iFloor;
                                    dArr4 = dArr6;
                                    dY = dY2;
                                }
                            }
                            dY = dY;
                        }
                    }
                    double[] dArr13 = {(dArr4[0] + dArr5[0]) / 2.0d, (dArr4[1] + dArr5[1]) / 2.0d, (dArr4[2] + dArr5[2]) / 2.0d};
                    iL2 = ((h12.l(dArr13[0]) & 255) << 16) | i10 | ((h12.l(dArr13[1]) & 255) << 8);
                    iL = h12.l(dArr13[2]) & 255;
                }
                return new ol1(iL3);
            }
        }
        iL = h12.l(h12.R(d3)) & 255;
        iL2 = (iL << 16) | (-16777216) | (iL << 8);
        iL3 = iL | iL2;
        return new ol1(iL3);
    }
}
