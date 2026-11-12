package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx4 {
    public static final xx4 e = new xx4(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final tv1 c;
    public Object[] d;

    public xx4(int i, int i2, Object[] objArr, tv1 tv1Var) {
        this.a = i;
        this.b = i2;
        this.c = tv1Var;
        this.d = objArr;
    }

    public static xx4 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, tv1 tv1Var) {
        if (i3 > 30) {
            return new xx4(0, 0, new Object[]{obj, obj2, obj3, obj4}, tv1Var);
        }
        int iA = si0.A(i, i3);
        int iA2 = si0.A(i2, i3);
        if (iA != iA2) {
            return new xx4((1 << iA) | (1 << iA2), 0, iA < iA2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, tv1Var);
        }
        return new xx4(0, 1 << iA, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, tv1Var)}, tv1Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, tv1 tv1Var) {
        Object obj3 = this.d[i];
        xx4 xx4VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, tv1Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ti.c0(0, i, 6, objArr, objArr2);
        ti.Z(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = xx4VarJ;
        ti.Z(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        h02 h02VarB0 = gb.b0(gb.g0(0, this.d.length), 2);
        int i = h02VarB0.n;
        int i2 = h02VarB0.o;
        int i3 = h02VarB0.p;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!h12.c(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iA = 1 << si0.A(i, i2);
        if (h(iA)) {
            return h12.c(obj, this.d[f(iA)]);
        }
        if (!i(iA)) {
            return false;
        }
        xx4 xx4VarS = s(t(iA));
        return i2 == 30 ? xx4VarS.c(obj) : xx4VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(xx4 xx4Var) {
        if (this == xx4Var) {
            return true;
        }
        if (this.b == xx4Var.b && this.a == xx4Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == xx4Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iA = 1 << si0.A(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            if (h12.c(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iA)) {
            return null;
        }
        xx4 xx4VarS = s(t(iA));
        if (i2 != 30) {
            return xx4VarS.g(i, i2 + 5, obj);
        }
        h02 h02VarB0 = gb.b0(gb.g0(0, xx4VarS.d.length), 2);
        int i3 = h02VarB0.n;
        int i4 = h02VarB0.o;
        int i5 = h02VarB0.p;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!h12.c(obj, xx4VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return xx4VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final xx4 k(int i, lf3 lf3Var) {
        lf3Var.e(lf3Var.r - 1);
        lf3Var.p = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != lf3Var.n) {
            return new xx4(0, 0, si0.g(i, objArr), lf3Var.n);
        }
        this.d = si0.g(i, objArr);
        return this;
    }

    public final xx4 l(int i, Object obj, Object obj2, int i2, lf3 lf3Var) {
        lf3 lf3Var2;
        xx4 xx4VarL;
        int iA = 1 << si0.A(i, i2);
        boolean zH = h(iA);
        tv1 tv1Var = this.c;
        if (zH) {
            int iF = f(iA);
            if (!h12.c(obj, this.d[iF])) {
                lf3Var.e(lf3Var.r + 1);
                tv1 tv1Var2 = lf3Var.n;
                if (tv1Var != tv1Var2) {
                    return new xx4(this.a ^ iA, this.b | iA, a(iF, iA, i, obj, obj2, i2, tv1Var2), tv1Var2);
                }
                this.d = a(iF, iA, i, obj, obj2, i2, tv1Var2);
                this.a ^= iA;
                this.b |= iA;
                return this;
            }
            lf3Var.p = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (tv1Var == lf3Var.n) {
                this.d[iF + 1] = obj2;
                return this;
            }
            lf3Var.q++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new xx4(this.a, this.b, objArrCopyOf, lf3Var.n);
        }
        if (!i(iA)) {
            lf3Var.e(lf3Var.r + 1);
            tv1 tv1Var3 = lf3Var.n;
            int iF2 = f(iA);
            Object[] objArr2 = this.d;
            if (tv1Var != tv1Var3) {
                return new xx4(this.a | iA, this.b, si0.f(objArr2, iF2, obj, obj2), tv1Var3);
            }
            this.d = si0.f(objArr2, iF2, obj, obj2);
            this.a |= iA;
            return this;
        }
        int iT = t(iA);
        xx4 xx4VarS = s(iT);
        if (i2 == 30) {
            h02 h02VarB0 = gb.b0(gb.g0(0, xx4VarS.d.length), 2);
            int i3 = h02VarB0.n;
            int i4 = h02VarB0.o;
            int i5 = h02VarB0.p;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!h12.c(obj, xx4VarS.d[i3])) {
                        if (i3 == i4) {
                            lf3Var.e(lf3Var.r + 1);
                            xx4VarL = new xx4(0, 0, si0.f(xx4VarS.d, 0, obj, obj2), lf3Var.n);
                            break;
                        }
                        i3 += i5;
                    } else {
                        lf3Var.p = xx4VarS.x(i3);
                        if (xx4VarS.c != lf3Var.n) {
                            lf3Var.q++;
                            Object[] objArr3 = xx4VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            xx4VarL = new xx4(0, 0, objArrCopyOf2, lf3Var.n);
                            break;
                        }
                        xx4VarS.d[i3 + 1] = obj2;
                        xx4VarL = xx4VarS;
                        break;
                    }
                }
            } else {
                lf3Var.e(lf3Var.r + 1);
                xx4VarL = new xx4(0, 0, si0.f(xx4VarS.d, 0, obj, obj2), lf3Var.n);
                break;
            }
            lf3Var2 = lf3Var;
        } else {
            lf3Var2 = lf3Var;
            xx4VarL = xx4VarS.l(i, obj, obj2, i2 + 5, lf3Var2);
        }
        return xx4VarS == xx4VarL ? this : r(iT, xx4VarL, lf3Var2.n);
    }

    public final xx4 m(xx4 xx4Var, int i, no0 no0Var, lf3 lf3Var) {
        xx4 xx4Var2;
        Object[] objArr;
        xx4 xx4VarJ;
        if (this == xx4Var) {
            no0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            tv1 tv1Var = lf3Var.n;
            int i3 = xx4Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + xx4Var.d.length);
            int length = this.d.length;
            h02 h02VarB0 = gb.b0(gb.g0(0, xx4Var.d.length), 2);
            int i4 = h02VarB0.n;
            int i5 = h02VarB0.o;
            int i6 = h02VarB0.p;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(xx4Var.d[i4])) {
                        no0Var.a++;
                    } else {
                        Object[] objArr3 = xx4Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == xx4Var.d.length) {
                    return xx4Var;
                }
                return length == objArrCopyOf.length ? new xx4(0, 0, objArrCopyOf, tv1Var) : new xx4(0, 0, Arrays.copyOf(objArrCopyOf, length), tv1Var);
            }
        } else {
            int i7 = this.b | xx4Var.b;
            int i8 = this.a;
            int i9 = xx4Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (h12.c(this.d[f(iLowestOneBit)], xx4Var.d[xx4Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                oo3.b("Check failed.");
            }
            if (h12.c(this.c, lf3Var.n) && this.a == i12 && this.b == i7) {
                xx4Var2 = this;
            } else {
                xx4Var2 = new xx4(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = xx4Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    xx4VarJ = s(t(iLowestOneBit2));
                    if (xx4Var.i(iLowestOneBit2)) {
                        xx4VarJ = xx4VarJ.m(xx4Var.s(xx4Var.t(iLowestOneBit2)), i + 5, no0Var, lf3Var);
                        objArr = objArr4;
                    } else if (xx4Var.h(iLowestOneBit2)) {
                        int iF = xx4Var.f(iLowestOneBit2);
                        Object obj = xx4Var.d[iF];
                        Object objX = xx4Var.x(iF);
                        int i15 = lf3Var.r;
                        objArr = objArr4;
                        xx4VarJ = xx4VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, lf3Var);
                        if (lf3Var.r == i15) {
                            no0Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (xx4Var.i(iLowestOneBit2)) {
                        xx4 xx4VarS = xx4Var.s(xx4Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (xx4VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                no0Var.a++;
                                xx4VarJ = xx4VarS;
                            } else {
                                xx4VarJ = xx4VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, lf3Var);
                            }
                        } else {
                            xx4VarJ = xx4VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = xx4Var.f(iLowestOneBit2);
                        Object obj4 = xx4Var.d[iF4];
                        xx4VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, xx4Var.x(iF4), i + 5, lf3Var.n);
                    }
                }
                objArr[length2] = xx4VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (xx4Var.h(iLowestOneBit3)) {
                    int iF5 = xx4Var.f(iLowestOneBit3);
                    Object[] objArr5 = xx4Var2.d;
                    objArr5[i18] = xx4Var.d[iF5];
                    objArr5[i18 + 1] = xx4Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        no0Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = xx4Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(xx4Var2)) {
                return xx4Var.e(xx4Var2) ? xx4Var : xx4Var2;
            }
        }
        return this;
    }

    public final xx4 n(int i, Object obj, int i2, lf3 lf3Var) {
        xx4 xx4VarN;
        int iA = 1 << si0.A(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            if (h12.c(obj, this.d[iF])) {
                return p(iF, iA, lf3Var);
            }
        } else if (i(iA)) {
            int iT = t(iA);
            xx4 xx4VarS = s(iT);
            if (i2 == 30) {
                h02 h02VarB0 = gb.b0(gb.g0(0, xx4VarS.d.length), 2);
                int i3 = h02VarB0.n;
                int i4 = h02VarB0.o;
                int i5 = h02VarB0.p;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!h12.c(obj, xx4VarS.d[i3])) {
                            if (i3 == i4) {
                                xx4VarN = xx4VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            xx4VarN = xx4VarS.k(i3, lf3Var);
                            break;
                        }
                    }
                } else {
                    xx4VarN = xx4VarS;
                    break;
                }
            } else {
                xx4VarN = xx4VarS.n(i, obj, i2 + 5, lf3Var);
            }
            return q(xx4VarS, xx4VarN, iT, iA, lf3Var.n);
        }
        return this;
    }

    public final xx4 o(int i, Object obj, Object obj2, int i2, lf3 lf3Var) {
        lf3 lf3Var2;
        xx4 xx4VarO;
        int iA = 1 << si0.A(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            return (h12.c(obj, this.d[iF]) && h12.c(obj2, x(iF))) ? p(iF, iA, lf3Var) : this;
        }
        if (!i(iA)) {
            return this;
        }
        int iT = t(iA);
        xx4 xx4VarS = s(iT);
        if (i2 == 30) {
            h02 h02VarB0 = gb.b0(gb.g0(0, xx4VarS.d.length), 2);
            int i3 = h02VarB0.n;
            int i4 = h02VarB0.o;
            int i5 = h02VarB0.p;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!h12.c(obj, xx4VarS.d[i3]) || !h12.c(obj2, xx4VarS.x(i3))) {
                        if (i3 == i4) {
                            xx4VarO = xx4VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        xx4VarO = xx4VarS.k(i3, lf3Var);
                        break;
                    }
                }
            } else {
                xx4VarO = xx4VarS;
                break;
            }
            lf3Var2 = lf3Var;
        } else {
            lf3Var2 = lf3Var;
            xx4VarO = xx4VarS.o(i, obj, obj2, i2 + 5, lf3Var2);
        }
        return q(xx4VarS, xx4VarO, iT, iA, lf3Var2.n);
    }

    public final xx4 p(int i, int i2, lf3 lf3Var) {
        lf3Var.e(lf3Var.r - 1);
        lf3Var.p = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != lf3Var.n) {
            return new xx4(i2 ^ this.a, this.b, si0.g(i, objArr), lf3Var.n);
        }
        this.d = si0.g(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final xx4 q(xx4 xx4Var, xx4 xx4Var2, int i, int i2, tv1 tv1Var) {
        tv1 tv1Var2 = this.c;
        if (xx4Var2 != null) {
            return (tv1Var2 == tv1Var || xx4Var != xx4Var2) ? r(i, xx4Var2, tv1Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (tv1Var2 != tv1Var) {
            return new xx4(this.a, this.b ^ i2, si0.h(i, objArr), tv1Var);
        }
        this.d = si0.h(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final xx4 r(int i, xx4 xx4Var, tv1 tv1Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && xx4Var.d.length == 2 && xx4Var.b == 0) {
            xx4Var.a = this.b;
            return xx4Var;
        }
        if (this.c == tv1Var) {
            objArr[i] = xx4Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = xx4Var;
        return new xx4(this.a, this.b, objArrCopyOf, tv1Var);
    }

    public final xx4 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (xx4) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r15.p = w(r7, r2, (defpackage.xx4) r15.p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x7 u(Object obj, int i, Object obj2, int i2) {
        x7 x7VarU;
        int i3 = 1;
        int iA = 1 << si0.A(i, i2);
        int i4 = 15;
        int i5 = 0;
        if (h(iA)) {
            int iF = f(iA);
            if (!h12.c(obj, this.d[iF])) {
                return new x7(i3, i4, new xx4(this.a ^ iA, this.b | iA, a(iF, iA, i, obj, obj2, i2, null), null));
            }
            if (x(iF) != obj2) {
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new x7(i5, i4, new xx4(this.a, this.b, objArrCopyOf, null));
            }
        } else {
            if (!i(iA)) {
                return new x7(i3, i4, new xx4(iA | this.a, this.b, si0.f(this.d, f(iA), obj, obj2), null));
            }
            int iT = t(iA);
            xx4 xx4VarS = s(iT);
            if (i2 == 30) {
                h02 h02VarB0 = gb.b0(gb.g0(0, xx4VarS.d.length), 2);
                int i6 = h02VarB0.n;
                int i7 = h02VarB0.o;
                int i8 = h02VarB0.p;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        if (!h12.c(obj, xx4VarS.d[i6])) {
                            if (i6 == i7) {
                                x7VarU = new x7(i3, i4, new xx4(0, 0, si0.f(xx4VarS.d, 0, obj, obj2), null));
                                break;
                            }
                            i6 += i8;
                        } else {
                            if (obj2 != xx4VarS.x(i6)) {
                                Object[] objArr2 = xx4VarS.d;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                objArrCopyOf2[i6 + 1] = obj2;
                                x7VarU = new x7(i5, i4, new xx4(0, 0, objArrCopyOf2, null));
                                break;
                            }
                            x7VarU = null;
                            break;
                        }
                    }
                } else {
                    x7VarU = new x7(i3, i4, new xx4(0, 0, si0.f(xx4VarS.d, 0, obj, obj2), null));
                    break;
                }
            } else {
                x7VarU = xx4VarS.u(obj, i, obj2, i2 + 5);
            }
        }
        return null;
    }

    public final xx4 v(int i, int i2, Object obj) {
        xx4 xx4VarV;
        int iA = 1 << si0.A(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            if (!h12.c(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new xx4(this.a ^ iA, this.b, si0.g(iF, objArr), null);
            }
        } else {
            if (!i(iA)) {
                return this;
            }
            int iT = t(iA);
            xx4 xx4VarS = s(iT);
            if (i2 == 30) {
                h02 h02VarB0 = gb.b0(gb.g0(0, xx4VarS.d.length), 2);
                int i3 = h02VarB0.n;
                int i4 = h02VarB0.o;
                int i5 = h02VarB0.p;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!h12.c(obj, xx4VarS.d[i3])) {
                            if (i3 == i4) {
                                xx4VarV = xx4VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = xx4VarS.d;
                            if (objArr2.length != 2) {
                                xx4VarV = new xx4(0, 0, si0.g(i3, objArr2), null);
                                break;
                            }
                            xx4VarV = null;
                            break;
                        }
                    }
                } else {
                    xx4VarV = xx4VarS;
                    break;
                }
            } else {
                xx4VarV = xx4VarS.v(i, i2 + 5, obj);
            }
            if (xx4VarV != null) {
                return xx4VarS != xx4VarV ? w(iT, iA, xx4VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new xx4(this.a, this.b ^ iA, si0.h(iT, objArr3), null);
            }
        }
        return null;
    }

    public final xx4 w(int i, int i2, xx4 xx4Var) {
        Object[] objArr = xx4Var.d;
        if (objArr.length != 2 || xx4Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = xx4Var;
            return new xx4(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            xx4Var.a = this.b;
            return xx4Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        ti.Z(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        ti.Z(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new xx4(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
