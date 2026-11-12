package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nk implements Runnable {
    public final /* synthetic */ List n;
    public final /* synthetic */ List o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Runnable q;
    public final /* synthetic */ pk r;

    public nk(pk pkVar, List list, List list2, int i, Runnable runnable) {
        this.r = pkVar;
        this.n = list;
        this.o = list2;
        this.p = i;
        this.q = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0125 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        aq0 aq0Var;
        int i2;
        zp0 zp0Var;
        wp0 wp0Var;
        int i3;
        aq0 aq0Var2;
        aq0 aq0Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        zg5 zg5Var = new zg5(this);
        int iU = zg5Var.u();
        int iT = zg5Var.t();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zp0 zp0Var2 = new zp0();
        int i18 = 0;
        zp0Var2.a = 0;
        zp0Var2.b = iU;
        zp0Var2.c = 0;
        zp0Var2.d = iT;
        arrayList2.add(zp0Var2);
        int i19 = iU + iT;
        int i20 = 1;
        int i21 = (((i19 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i21];
        int i22 = i21 / 2;
        int[] iArr2 = new int[i21];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            zp0 zp0Var3 = (zp0) arrayList2.remove(arrayList2.size() - i20);
            if (zp0Var3.b() >= i20 && zp0Var3.a() >= i20) {
                int iA = ((zp0Var3.a() + zp0Var3.b()) + i20) / 2;
                int i23 = i20 + i22;
                iArr[i23] = zp0Var3.a;
                iArr2[i23] = zp0Var3.b;
                int i24 = i18;
                while (true) {
                    if (i24 >= iA) {
                        i = i22;
                        aq0Var = null;
                        break;
                    }
                    int i25 = Math.abs(zp0Var3.b() - zp0Var3.a()) % 2 == i20 ? i20 : i18;
                    int iB = zp0Var3.b() - zp0Var3.a();
                    int i26 = -i24;
                    int i27 = i26;
                    while (true) {
                        if (i27 > i24) {
                            i = i22;
                            i3 = iA;
                            aq0Var2 = null;
                            break;
                        }
                        if (i27 != i26) {
                            if (i27 != i24) {
                                i8 = i27;
                                if (iArr[i27 + 1 + i22] > iArr[(i27 - 1) + i22]) {
                                }
                                i = i22;
                                i11 = ((i10 - zp0Var3.a) + zp0Var3.c) - i8;
                                if (i24 == 0 && i10 == i9) {
                                    i12 = i11 - 1;
                                } else {
                                    i12 = i11;
                                }
                                int i28 = iA;
                                i13 = i11;
                                i14 = i10;
                                i3 = i28;
                                i15 = i25;
                                while (i14 < zp0Var3.b && i13 < zp0Var3.d && zg5Var.m(i14, i13)) {
                                    i14++;
                                    i13++;
                                }
                                iArr[i8 + i] = i14;
                                if (i15 != 0) {
                                    i17 = iB - i8;
                                    i16 = iB;
                                    if (i17 < i26 + 1 && i17 <= i24 - 1 && iArr2[i17 + i] <= i14) {
                                        aq0Var2 = new aq0();
                                        aq0Var2.a = i9;
                                        aq0Var2.b = i12;
                                        aq0Var2.c = i14;
                                        aq0Var2.d = i13;
                                        aq0Var2.e = false;
                                        break;
                                    }
                                } else {
                                    i16 = iB;
                                }
                                i27 = i8 + 2;
                                i22 = i;
                                iA = i3;
                                i25 = i15;
                                iB = i16;
                            } else {
                                i8 = i27;
                            }
                            i9 = iArr[(i8 - 1) + i22];
                            i10 = i9 + 1;
                            i = i22;
                            i11 = ((i10 - zp0Var3.a) + zp0Var3.c) - i8;
                            if (i24 == 0) {
                                i12 = i11;
                            } else {
                                i12 = i11;
                            }
                            int i29 = iA;
                            i13 = i11;
                            i14 = i10;
                            i3 = i29;
                            i15 = i25;
                            while (i14 < zp0Var3.b) {
                                i14++;
                                i13++;
                            }
                            iArr[i8 + i] = i14;
                            if (i15 != 0) {
                                i17 = iB - i8;
                                i16 = iB;
                                if (i17 < i26 + 1) {
                                    continue;
                                }
                            } else {
                                i16 = iB;
                            }
                            i27 = i8 + 2;
                            i22 = i;
                            iA = i3;
                            i25 = i15;
                            iB = i16;
                        } else {
                            i8 = i27;
                        }
                        i9 = iArr[i8 + 1 + i22];
                        i10 = i9;
                        i = i22;
                        i11 = ((i10 - zp0Var3.a) + zp0Var3.c) - i8;
                        if (i24 == 0) {
                            i12 = i11;
                        } else {
                            i12 = i11;
                        }
                        int i210 = iA;
                        i13 = i11;
                        i14 = i10;
                        i3 = i210;
                        i15 = i25;
                        while (i14 < zp0Var3.b) {
                            i14++;
                            i13++;
                        }
                        iArr[i8 + i] = i14;
                        if (i15 != 0) {
                            i17 = iB - i8;
                            i16 = iB;
                            if (i17 < i26 + 1) {
                                continue;
                            }
                        } else {
                            i16 = iB;
                        }
                        i27 = i8 + 2;
                        i22 = i;
                        iA = i3;
                        i25 = i15;
                        iB = i16;
                    }
                    if (aq0Var2 != null) {
                        aq0Var = aq0Var2;
                        break;
                    }
                    boolean z = (zp0Var3.b() - zp0Var3.a()) % 2 == 0;
                    int iB2 = zp0Var3.b() - zp0Var3.a();
                    int i30 = i26;
                    while (true) {
                        if (i30 > i24) {
                            aq0Var3 = null;
                            break;
                        }
                        if (i30 == i26 || (i30 != i24 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                            i4 = iArr2[i30 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i30 - 1) + i];
                            i5 = i4 - 1;
                        }
                        boolean z2 = z;
                        int i31 = zp0Var3.d - ((zp0Var3.b - i5) - i30);
                        int i32 = (i24 == 0 || i5 != i4) ? i31 : i31 + 1;
                        int i33 = iB2;
                        while (true) {
                            if (i5 > zp0Var3.a && i31 > zp0Var3.c) {
                                i6 = i30;
                                if (!zg5Var.m(i5 - 1, i31 - 1)) {
                                    break;
                                }
                                i5--;
                                i31--;
                                i30 = i6;
                            } else {
                                i6 = i30;
                                break;
                            }
                        }
                        iArr2[i6 + i] = i5;
                        if (z2 && (i7 = i33 - i6) >= i26 && i7 <= i24 && iArr[i7 + i] >= i5) {
                            aq0Var3 = new aq0();
                            aq0Var3.a = i5;
                            aq0Var3.b = i31;
                            aq0Var3.c = i4;
                            aq0Var3.d = i32;
                            aq0Var3.e = true;
                            break;
                        }
                        i30 = i6 + 2;
                        z = z2;
                        iB2 = i33;
                    }
                    if (aq0Var3 != null) {
                        aq0Var = aq0Var3;
                        break;
                    }
                    i24++;
                    i22 = i;
                    iA = i3;
                    i20 = 1;
                    i18 = 0;
                }
            } else {
                i = i22;
                aq0Var = null;
                break;
            }
            if (aq0Var != null) {
                if (aq0Var.a() > 0) {
                    int i34 = aq0Var.d;
                    int i35 = aq0Var.b;
                    int i36 = i34 - i35;
                    int i37 = aq0Var.c;
                    int i38 = aq0Var.a;
                    int i39 = i37 - i38;
                    if (i36 == i39) {
                        wp0Var = new wp0(i38, i35, i39);
                    } else if (aq0Var.e) {
                        wp0Var = new wp0(i38, i35, aq0Var.a());
                    } else {
                        wp0Var = i36 > i39 ? new wp0(i38, i35 + 1, aq0Var.a()) : new wp0(i38 + 1, i35, aq0Var.a());
                    }
                    arrayList.add(wp0Var);
                }
                if (arrayList3.isEmpty()) {
                    zp0Var = new zp0();
                    i2 = 1;
                } else {
                    i2 = 1;
                    zp0Var = (zp0) arrayList3.remove(arrayList3.size() - 1);
                }
                zp0Var.a = zp0Var3.a;
                zp0Var.c = zp0Var3.c;
                zp0Var.b = aq0Var.a;
                zp0Var.d = aq0Var.b;
                arrayList2.add(zp0Var);
                zp0Var3.b = zp0Var3.b;
                zp0Var3.d = zp0Var3.d;
                zp0Var3.a = aq0Var.c;
                zp0Var3.c = aq0Var.d;
                arrayList2.add(zp0Var3);
            } else {
                i2 = 1;
                arrayList3.add(zp0Var3);
            }
            i20 = i2;
            i22 = i;
            i18 = 0;
        }
        Collections.sort(arrayList, jz4.a);
        this.r.c.execute(new lg1(this, new xp0(zg5Var, arrayList, iArr, iArr2), false, 5));
    }
}
