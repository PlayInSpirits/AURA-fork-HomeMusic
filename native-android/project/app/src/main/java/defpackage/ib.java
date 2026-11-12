package defpackage;

import android.net.Uri;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ib(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r9v3, types: [wf1] */
    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int iMin;
        h03 h03Var;
        f82 f82Var;
        lm0 lm0Var;
        hb3 hb3Var;
        int i4;
        long j;
        int i5;
        f82 f82Var2;
        hb3 hb3Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        hb3 hb3Var3;
        List arrayList;
        List list;
        int i11;
        ArrayList arrayList2;
        ln4 ln4Var;
        long j2;
        int i12;
        ArrayList arrayList3;
        List list2;
        ?? arrayList4;
        Object obj3;
        qc3 qc3Var;
        f82 f82Var3;
        int i13;
        int i14 = this.n;
        j15 j15Var = j15.a;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (i14) {
            case 0:
                lb lbVar = (lb) obj4;
                int iIntValue = ((Integer) obj).intValue();
                i94 i94Var = (i94) obj2;
                if (!((j94) obj5).b.c(i94Var.f)) {
                    lbVar.i(iIntValue, i94Var);
                    lbVar.u.d(j15Var);
                }
                return j15Var;
            case 1:
                uy3 uy3Var = (uy3) obj5;
                lg4 lg4Var = (lg4) obj4;
                int iIntValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof u70) {
                    uy3Var.f.b((u70) obj2);
                } else if (!(obj2 instanceof a24)) {
                    if (obj2 instanceof wg1) {
                        si0.O(lg4Var, iIntValue2, obj2);
                        uy3Var.e((wg1) obj2);
                    } else if (obj2 instanceof lv3) {
                        si0.O(lg4Var, iIntValue2, obj2);
                        ((lv3) obj2).c();
                    }
                }
                return j15Var;
            case 2:
                h72 h72Var = (h72) obj5;
                ?? r9 = (wf1) obj4;
                rg1 rg1Var = (rg1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rg1Var.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Boolean bool = (Boolean) h72Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    rg1Var.T(bool);
                    boolean zF = rg1Var.f(zBooleanValue);
                    if (zBooleanValue) {
                        r9.invoke(rg1Var, 0);
                    } else {
                        if (rg1Var.l != 0) {
                            l80.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!rg1Var.S) {
                            if (zF) {
                                hg4 hg4Var = rg1Var.G;
                                int i15 = hg4Var.g;
                                int i16 = hg4Var.h;
                                k80 k80Var = rg1Var.M;
                                k80Var.getClass();
                                k80Var.d(false);
                                k80Var.b.n.x0(t93.f);
                                si0.i(i15, i16, rg1Var.s);
                                rg1Var.G.t();
                            } else {
                                rg1Var.M();
                            }
                        }
                    }
                    if (rg1Var.y && rg1Var.G.i == rg1Var.z) {
                        rg1Var.z = -1;
                        z = false;
                        rg1Var.y = false;
                    } else {
                        z = false;
                    }
                    rg1Var.o(z);
                } else {
                    rg1Var.N();
                }
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                c82 c82Var = (c82) obj5;
                b82 b82Var = (b82) obj4;
                Object obj6 = b82Var.a;
                rg1 rg1Var2 = (rg1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rg1Var2.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nc3 nc3Var = (nc3) c82Var.b.invoke();
                    int i17 = b82Var.b;
                    if (i17 >= nc3Var.b() || !nc3Var.c(i17).equals(obj6)) {
                        p03 p03Var = (p03) nc3Var.c.p;
                        int iD = p03Var.d(obj6);
                        if (iD >= 0) {
                            i17 = p03Var.c[iD];
                            i = -1;
                        } else {
                            i17 = -1;
                            i = -1;
                        }
                        if (i17 != i) {
                            b82Var.b = i17;
                        }
                    } else {
                        i = -1;
                    }
                    int i18 = i17;
                    if (i18 != i) {
                        rg1Var2.R(-1664741271);
                        l93.b(nc3Var, c82Var.a, i18, obj6, rg1Var2, 0);
                        rg1Var2.o(false);
                    } else {
                        rg1Var2.R(-1664505826);
                        rg1Var2.o(false);
                    }
                    boolean zG = rg1Var2.g(b82Var);
                    Object objH = rg1Var2.H();
                    if (zG || objH == j80.a) {
                        objH = new x(21, b82Var);
                        rg1Var2.b0(objH);
                    }
                    bu.b(obj6, (if1) objH, rg1Var2);
                } else {
                    rg1Var2.N();
                }
                return j15Var;
            case 4:
                pc3 pc3Var = (pc3) obj4;
                ln4 ln4Var2 = (ln4) obj;
                f82 f82Var4 = new f82((c82) obj5, ln4Var2);
                long j3 = ((nc0) obj2).a;
                pc3Var.getClass();
                ac3 ac3Var = pc3Var.b;
                float f = ac3Var.b;
                float f2 = ac3Var.a;
                lm0 lm0Var2 = pc3Var.a;
                lm0Var2.B.getValue();
                if (nc0.h(j3) == Integer.MAX_VALUE) {
                    fz1.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
                }
                r62 layoutDirection = ln4Var2.getLayoutDirection();
                r62 r62Var = r62.n;
                int iV = ln4Var2.V((layoutDirection != r62Var ? layoutDirection != r62Var : layoutDirection == r62Var) ? f2 : f);
                r62 layoutDirection2 = ln4Var2.getLayoutDirection();
                if (layoutDirection2 != r62Var ? layoutDirection2 == r62Var : layoutDirection2 != r62Var) {
                    f = f2;
                }
                int iV2 = ln4Var2.V(f);
                int iV3 = ln4Var2.V(0.0f);
                int iV4 = ln4Var2.V(0.0f) + iV3;
                int i19 = iV2 + iV;
                int i20 = i19 - iV;
                int i21 = -i19;
                int i22 = -iV4;
                int iJ = nc0.j(j3) + i21;
                int i23 = iJ < 0 ? 0 : iJ;
                int iH = nc0.h(j3);
                if (iH != Integer.MAX_VALUE && (iH = iH + i21) < 0) {
                    iH = 0;
                }
                int i24 = nc0.i(j3) + i22;
                if (i24 < 0) {
                    i24 = 0;
                }
                int iG = nc0.g(j3);
                if (iG == Integer.MAX_VALUE) {
                    i2 = iG;
                } else {
                    i2 = i22 + iG;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                }
                long jA = qc0.a(i23, iH, i24, i2);
                lm0Var2.n = f82Var4;
                int iV5 = ln4Var2.V(pc3Var.c);
                int iH2 = nc0.h(j3) - i19;
                long j4 = (((long) iV3) & 4294967295L) | (((long) iV) << 32);
                pc3Var.d.getClass();
                int i25 = iH2 < 0 ? 0 : iH2;
                qc0.b(i25, nc0.g(jA), 5);
                nc3 nc3Var2 = (nc3) pc3Var.e.invoke();
                rv2 rv2Var = pc3Var.h;
                long j5 = j4;
                ch4 ch4VarT = ya4.t();
                if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
                ch4 ch4VarZ = ya4.z(ch4VarT);
                try {
                    int iK = lm0Var2.k();
                    nq nqVar = lm0Var2.d;
                    int i26 = ud3.i(iK, nc3Var2, nqVar.r);
                    if (iK != i26) {
                        ((wd3) nqVar.p).h(i26);
                        g82 g82Var = (g82) nqVar.s;
                        if (iK != g82Var.o) {
                            g82Var.o = iK;
                            int i27 = (iK / 30) * 30;
                            g82Var.n.setValue(gb.g0(Math.max(i27 - 100, 0), i27 + 130));
                        }
                    }
                    lm0Var2.k();
                    float fL = lm0Var2.l();
                    lm0Var2.n();
                    rv2Var.getClass();
                    int i28 = i25 + iV5;
                    int iL = ji2.L(0.0f - (fL * i28));
                    ya4.H(ch4VarT, ch4VarZ, if1VarE);
                    n82 n82Var = lm0Var2.z;
                    hg3 hg3Var = lm0Var2.v;
                    rh4 rh4Var = n82Var.n;
                    rh4Var.getClass();
                    y1 y1Var = rr2.F(rh4Var).c;
                    f13 f13Var = (f13) hg3Var.o;
                    if ((f13Var.p != 0) || !y1Var.isEmpty()) {
                        h03 h03Var2 = new h03();
                        if (((f13) hg3Var.o).p != 0) {
                            int i29 = f13Var.p;
                            if (i29 != 0) {
                                Object[] objArr = f13Var.n;
                                int i30 = ((v72) objArr[0]).a;
                                int i31 = 0;
                                while (i31 < i29) {
                                    int i32 = i31;
                                    int i33 = ((v72) objArr[i31]).a;
                                    if (i33 < i30) {
                                        i30 = i33;
                                    }
                                    i31 = i32 + 1;
                                }
                                if (i30 < 0) {
                                    fz1.a("negative minIndex");
                                }
                                int i34 = f13Var.p;
                                if (i34 != 0) {
                                    Object[] objArr2 = f13Var.n;
                                    int i35 = ((v72) objArr2[0]).b;
                                    int i36 = 0;
                                    while (i36 < i34) {
                                        int i37 = i30;
                                        int i38 = ((v72) objArr2[i36]).b;
                                        if (i38 > i35) {
                                            i35 = i38;
                                        }
                                        i36++;
                                        i30 = i37;
                                    }
                                    iMin = Math.min(i35, nc3Var2.b() - 1);
                                    i3 = i30;
                                } else {
                                    kf2.m("MutableVector is empty.");
                                }
                            } else {
                                kf2.m("MutableVector is empty.");
                            }
                            return null;
                        }
                        i3 = 1;
                        iMin = 0;
                        int iA = y1Var.a();
                        int i39 = 0;
                        while (i39 < iA) {
                            l82 l82Var = (l82) y1Var.get(i39);
                            y1 y1Var2 = y1Var;
                            int i40 = ud3.i(l82Var.c, nc3Var2, l82Var.a);
                            if ((i3 > i40 || i40 > iMin) && i40 >= 0 && i40 < nc3Var2.b()) {
                                h03Var2.a(i40);
                            }
                            i39++;
                            y1Var = y1Var2;
                        }
                        if (i3 <= iMin) {
                            while (true) {
                                h03Var2.a(i3);
                                if (i3 != iMin) {
                                    i3++;
                                }
                            }
                        }
                        int i41 = h03Var2.b;
                        if (i41 != 0) {
                            int[] iArr = h03Var2.a;
                            iArr.getClass();
                            Arrays.sort(iArr, 0, i41);
                        }
                        h03Var = h03Var2;
                    } else {
                        h03Var = c02.a;
                        iL = iL;
                        i28 = i28;
                    }
                    int i42 = iV4;
                    i03 i03Var = new i03();
                    int iIntValue5 = ((Number) pc3Var.f.invoke()).intValue();
                    b13 b13Var = lm0Var2.A;
                    gs gsVar = pc3Var.g;
                    fs fsVar = fz0.z;
                    rv2 rv2Var2 = pc3Var.h;
                    we0 we0Var = pc3Var.i;
                    if (iV < 0) {
                        fz1.a("negative beforeContentPadding");
                    }
                    if (i20 < 0) {
                        fz1.a("negative afterContentPadding");
                    }
                    gs gsVar2 = gsVar;
                    int i43 = i28 < 0 ? 0 : i28;
                    int i44 = iIntValue5 < 0 ? iIntValue5 : 0;
                    long jB = qc0.b(i25, nc0.g(jA), 5);
                    int i45 = i25;
                    v01 v01Var = v01.n;
                    if (iIntValue5 <= 0) {
                        qc3Var = new qc3(i45, iV5, i20, -iV, iH2 + i20, i44, rv2Var2, ln4Var2.v(qc0.f(nc0.j(jA) + i19, j3), qc0.e(nc0.i(jA) + i42, j3), v01Var, new or1(24)), we0Var, f82Var4, jB);
                        ln4Var = ln4Var2;
                        lm0Var = lm0Var2;
                        f82Var3 = f82Var4;
                    } else {
                        int i46 = iV5;
                        long j6 = jB;
                        int i47 = 21;
                        int i48 = i26;
                        while (true) {
                            if (i48 <= 0) {
                                f82Var = f82Var4;
                            } else if (iL > 0) {
                                i48--;
                                iL -= i43;
                            }
                        }
                        int i49 = iL * (-1);
                        if (i48 >= iIntValue5) {
                            i48 = iIntValue5 - 1;
                            i49 = 0;
                        }
                        lm0Var = lm0Var2;
                        ii iiVar = new ii();
                        int i50 = -iV;
                        int i51 = i50 + (i46 < 0 ? i46 : 0);
                        int i52 = i49 + i51;
                        int iMax = 0;
                        while (true) {
                            hb3Var = hb3.o;
                            i4 = i44;
                            j = j5;
                            i5 = i42;
                            if (i52 < 0 && i48 > 0) {
                                i48--;
                                int i53 = i45;
                                gs gsVar3 = gsVar2;
                                ln4 ln4Var3 = ln4Var2;
                                long j7 = j6;
                                xi2 xi2VarZ = gb.z(f82Var, i48, j7, nc3Var2, j, hb3Var, fsVar, gsVar3, ln4Var2.getLayoutDirection(), false, i53, i03Var);
                                iiVar.add(0, xi2VarZ);
                                iMax = Math.max(iMax, xi2VarZ.j);
                                i52 += i43;
                                i46 = i46;
                                j6 = j7;
                                ln4Var2 = ln4Var3;
                                iV = iV;
                                f82Var = f82Var;
                                b13Var = b13Var;
                                j5 = j;
                                i44 = i4;
                                i42 = i5;
                                gsVar2 = gsVar3;
                                i45 = i53;
                            }
                        }
                        int i54 = i45;
                        gs gsVar4 = gsVar2;
                        ln4 ln4Var4 = ln4Var2;
                        b13 b13Var2 = b13Var;
                        int i55 = iV;
                        f82 f82Var5 = f82Var;
                        long j8 = j6;
                        int i56 = i46;
                        if (i52 < i51) {
                            i52 = i51;
                        }
                        int i57 = i52 - i51;
                        int i58 = iH2 + i20;
                        int i59 = i58 < 0 ? 0 : i58;
                        int i60 = iMax;
                        int i61 = -i57;
                        int i62 = i57;
                        int i63 = i48;
                        int i64 = 0;
                        boolean z2 = false;
                        while (i64 < iiVar.p) {
                            if (i61 >= i59) {
                                iiVar.b(i64);
                                z2 = true;
                            } else {
                                i63++;
                                i61 += i43;
                                i64++;
                            }
                        }
                        int i65 = i48;
                        int iMax2 = i60;
                        int i66 = i63;
                        while (i66 < iIntValue5 && (i61 < i59 || i61 <= 0 || iiVar.isEmpty())) {
                            int i67 = i59;
                            f82 f82Var6 = f82Var5;
                            int i68 = i65;
                            xi2 xi2VarZ2 = gb.z(f82Var6, i66, j8, nc3Var2, j, hb3Var, fsVar, gsVar4, ln4Var4.getLayoutDirection(), false, i54, i03Var);
                            f82Var5 = f82Var6;
                            int i69 = iIntValue5 - 1;
                            i61 += i66 == i69 ? i54 : i43;
                            if (i61 > i51 || i66 == i69) {
                                iMax2 = Math.max(iMax2, xi2VarZ2.j);
                                iiVar.addLast(xi2VarZ2);
                                i65 = i68;
                            } else {
                                i65 = i66 + 1;
                                i62 -= i43;
                                z2 = true;
                            }
                            i66++;
                            i59 = i67;
                        }
                        int i70 = i65;
                        if (i61 < iH2) {
                            int i71 = iH2 - i61;
                            int i72 = i61 + i71;
                            i6 = i62 - i71;
                            i7 = i70;
                            while (i6 < i55 && i7 > 0) {
                                int i73 = i7 - 1;
                                f82 f82Var7 = f82Var5;
                                xi2 xi2VarZ3 = gb.z(f82Var7, i73, j8, nc3Var2, j, hb3Var, fsVar, gsVar4, ln4Var4.getLayoutDirection(), false, i54, i03Var);
                                iiVar.add(0, xi2VarZ3);
                                iMax2 = Math.max(iMax2, xi2VarZ3.j);
                                i6 += i43;
                                i7 = i73;
                                i72 = i72;
                                hb3Var = hb3Var;
                                i66 = i66;
                                f82Var5 = f82Var7;
                            }
                            f82Var2 = f82Var5;
                            hb3Var2 = hb3Var;
                            int i74 = i72;
                            if (i6 < 0) {
                                i61 = i74 + i6;
                                i6 = 0;
                            } else {
                                i61 = i74;
                            }
                        } else {
                            f82Var2 = f82Var5;
                            hb3Var2 = hb3Var;
                            i6 = i62;
                            i7 = i70;
                        }
                        if (i6 < 0) {
                            fz1.a("invalid currentFirstPageScrollOffset");
                        }
                        int i75 = iMax2;
                        int i76 = -i6;
                        xi2 xi2Var = (xi2) iiVar.first();
                        if (i55 > 0 || i56 < 0) {
                            int iA2 = iiVar.a();
                            i8 = i7;
                            int i77 = 0;
                            while (i77 < iA2 && i6 != 0 && i43 <= i6) {
                                int i78 = iA2;
                                if (i77 != iiVar.a() - 1) {
                                    i6 -= i43;
                                    i77++;
                                    xi2Var = (xi2) iiVar.get(i77);
                                    iA2 = i78;
                                }
                            }
                        } else {
                            i8 = i7;
                        }
                        xi2 xi2Var2 = xi2Var;
                        int i79 = i6;
                        int iMax3 = Math.max(0, i8 - i4);
                        int i80 = i8 - 1;
                        if (iMax3 <= i80) {
                            List arrayList5 = null;
                            while (true) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                int i81 = i80;
                                arrayList = arrayList5;
                                hb3Var3 = hb3Var2;
                                i10 = i66;
                                i9 = i43;
                                arrayList.add(gb.z(f82Var2, i81, j8, nc3Var2, j, hb3Var3, fsVar, gsVar4, ln4Var4.getLayoutDirection(), false, i54, i03Var));
                                if (i81 != iMax3) {
                                    hb3Var2 = hb3Var3;
                                    i66 = i10;
                                    arrayList5 = arrayList;
                                    i80 = i81 - 1;
                                    i43 = i9;
                                }
                            }
                        } else {
                            i9 = i43;
                            i10 = i66;
                            hb3Var3 = hb3Var2;
                            arrayList = null;
                        }
                        int[] iArr2 = h03Var.a;
                        int i82 = h03Var.b;
                        int i83 = 0;
                        while (i83 < i82) {
                            int i84 = i82;
                            int i85 = iArr2[i83];
                            if (i85 < iMax3) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(gb.z(f82Var2, i85, j8, nc3Var2, j, hb3Var3, fsVar, gsVar4, ln4Var4.getLayoutDirection(), false, i54, i03Var));
                            }
                            i83++;
                            i82 = i84;
                        }
                        u01 u01Var = u01.n;
                        if (arrayList == null) {
                            arrayList = u01Var;
                        }
                        int size = arrayList.size();
                        int iMax4 = i75;
                        for (int i86 = 0; i86 < size; i86++) {
                            iMax4 = Math.max(iMax4, ((xi2) arrayList.get(i86)).j);
                        }
                        int i87 = ((xi2) iiVar.last()).a;
                        int iMin2 = Math.min(i4, (iIntValue5 - i87) - 1) + i87;
                        int i88 = i87 + 1;
                        if (i88 <= iMin2) {
                            ArrayList arrayList6 = null;
                            while (true) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                int i89 = i88;
                                arrayList2 = arrayList6;
                                i11 = iMax4;
                                list = arrayList;
                                arrayList2.add(gb.z(f82Var2, i89, j8, nc3Var2, j, hb3Var3, fsVar, gsVar4, ln4Var4.getLayoutDirection(), false, i54, i03Var));
                                if (i89 != iMin2) {
                                    arrayList6 = arrayList2;
                                    i88 = i89 + 1;
                                    iMax4 = i11;
                                    arrayList = list;
                                }
                            }
                        } else {
                            list = arrayList;
                            i11 = iMax4;
                            arrayList2 = null;
                        }
                        int[] iArr3 = h03Var.a;
                        int i90 = h03Var.b;
                        int i91 = 0;
                        while (i91 < i90) {
                            int i92 = i91;
                            int i93 = iArr3[i92];
                            ArrayList arrayList7 = arrayList2;
                            if (iMin2 + 1 > i93 || i93 >= iIntValue5) {
                                i13 = i92;
                                arrayList2 = arrayList7;
                            } else {
                                arrayList2 = arrayList7 == null ? new ArrayList() : arrayList7;
                                i13 = i92;
                                arrayList2.add(gb.z(f82Var2, i93, j8, nc3Var2, j, hb3Var3, fsVar, gsVar4, ln4Var4.getLayoutDirection(), false, i54, i03Var));
                            }
                            i91 = i13 + 1;
                        }
                        ArrayList arrayList8 = arrayList2;
                        List list3 = arrayList8 == null ? u01Var : arrayList8;
                        int size2 = list3.size();
                        int iMax5 = i11;
                        for (int i94 = 0; i94 < size2; i94++) {
                            iMax5 = Math.max(iMax5, ((xi2) list3.get(i94)).j);
                        }
                        boolean z3 = h12.c(xi2Var2, iiVar.first()) && list.isEmpty() && list3.isEmpty();
                        int iF = qc0.f(i61, jA);
                        int iE = qc0.e(iMax5, jA);
                        boolean z4 = i61 < Math.min(iF, iH2);
                        if (z4 && i76 != 0) {
                            fz1.c("non-zero pagesScrollOffset=" + i76);
                        }
                        ArrayList arrayList9 = new ArrayList(list3.size() + list.size() + iiVar.a());
                        if (z4) {
                            if (!list.isEmpty() || !list3.isEmpty()) {
                                fz1.a("No extra pages");
                            }
                            int iA3 = iiVar.a();
                            int[] iArr4 = new int[iA3];
                            for (int i95 = 0; i95 < iA3; i95++) {
                                iArr4[i95] = i54;
                            }
                            int[] iArr5 = new int[iA3];
                            ln4Var = ln4Var4;
                            j2 = j8;
                            i12 = i56;
                            float fB = ln4Var.B(i12);
                            if (iArr4.length != 0) {
                                int iV6 = f82Var2.V(fB);
                                int length = iArr4.length;
                                int i96 = 0;
                                int iMin3 = 0;
                                int i97 = 0;
                                while (i96 < length) {
                                    int i98 = iArr4[i96];
                                    int i99 = length;
                                    int iMin4 = Math.min(iMin3, iF - i98);
                                    iArr5[i97] = iMin4;
                                    iMin3 = iArr5[i97] + i98 + Math.min(iV6, (iF - iMin4) - i98);
                                    i96++;
                                    i97++;
                                    length = i99;
                                }
                            }
                            j02 j02Var = new j02(0, iA3 - 1, 1);
                            int i100 = j02Var.o;
                            int i101 = j02Var.p;
                            if ((i101 > 0 && i100 >= 0) || (i101 < 0 && i100 <= 0)) {
                                int i102 = 0;
                                while (true) {
                                    int i103 = iArr5[i102];
                                    int i104 = i101;
                                    xi2 xi2Var3 = (xi2) iiVar.get(i102);
                                    xi2Var3.b(i103, iF, iE);
                                    arrayList9.add(xi2Var3);
                                    if (i102 != i100) {
                                        i102 += i104;
                                        i101 = i104;
                                    }
                                }
                            }
                        } else {
                            f82Var2 = f82Var2;
                            int i105 = i76;
                            ln4Var = ln4Var4;
                            j2 = j8;
                            i12 = i56;
                            int size3 = list.size();
                            int i106 = i105;
                            int i107 = 0;
                            while (i107 < size3) {
                                int i108 = i105;
                                xi2 xi2Var4 = (xi2) list.get(i107);
                                i106 -= i28;
                                xi2Var4.b(i106, iF, iE);
                                arrayList9.add(xi2Var4);
                                i107++;
                                i105 = i108;
                            }
                            int i109 = i105;
                            int iA4 = iiVar.a();
                            int i110 = i109;
                            for (int i111 = 0; i111 < iA4; i111++) {
                                xi2 xi2Var5 = (xi2) iiVar.get(i111);
                                xi2Var5.b(i110, iF, iE);
                                arrayList9.add(xi2Var5);
                                i110 += i28;
                            }
                            int size4 = list3.size();
                            for (int i112 = 0; i112 < size4; i112++) {
                                xi2 xi2Var6 = (xi2) list3.get(i112);
                                xi2Var6.b(i110, iF, iE);
                                arrayList9.add(xi2Var6);
                                i110 += i28;
                            }
                        }
                        if (z3) {
                            arrayList3 = arrayList9;
                        } else {
                            ArrayList arrayList10 = new ArrayList(arrayList9.size());
                            int size5 = arrayList9.size();
                            int i113 = 0;
                            while (i113 < size5) {
                                Object obj7 = arrayList9.get(i113);
                                List list4 = list3;
                                xi2 xi2Var7 = (xi2) obj7;
                                int i114 = size5;
                                int i115 = iF;
                                if (xi2Var7.a >= ((xi2) iiVar.first()).a && xi2Var7.a <= ((xi2) iiVar.last()).a) {
                                    arrayList10.add(obj7);
                                }
                                i113++;
                                list3 = list4;
                                size5 = i114;
                                iF = i115;
                            }
                            arrayList3 = arrayList10;
                        }
                        List list5 = list3;
                        int i116 = iF;
                        if (list.isEmpty()) {
                            list2 = u01Var;
                        } else {
                            ArrayList arrayList11 = new ArrayList(arrayList9.size());
                            int size6 = arrayList9.size();
                            for (int i117 = 0; i117 < size6; i117++) {
                                Object obj8 = arrayList9.get(i117);
                                if (((xi2) obj8).a < ((xi2) iiVar.first()).a) {
                                    arrayList11.add(obj8);
                                }
                            }
                            list2 = arrayList11;
                        }
                        if (list5.isEmpty()) {
                            arrayList4 = u01Var;
                        } else {
                            arrayList4 = new ArrayList(arrayList9.size());
                            int size7 = arrayList9.size();
                            for (int i118 = 0; i118 < size7; i118++) {
                                Object obj9 = arrayList9.get(i118);
                                if (((xi2) obj9).a > ((xi2) iiVar.last()).a) {
                                    arrayList4.add(obj9);
                                }
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            obj3 = null;
                        } else {
                            Object obj10 = arrayList3.get(0);
                            int i119 = ((xi2) obj10).l;
                            rv2Var2.getClass();
                            float f3 = -Math.abs(i119 - 0.0f);
                            int size8 = arrayList3.size() - 1;
                            if (1 <= size8) {
                                int i120 = 1;
                                while (true) {
                                    Object obj11 = arrayList3.get(i120);
                                    float f4 = -Math.abs(((xi2) obj11).l - 0.0f);
                                    if (Float.compare(f3, f4) < 0) {
                                        obj10 = obj11;
                                        f3 = f4;
                                    }
                                    if (i120 != size8) {
                                        i120++;
                                    }
                                }
                            }
                            obj3 = obj10;
                        }
                        xi2 xi2Var8 = (xi2) obj3;
                        rv2Var2.getClass();
                        f82 f82Var8 = f82Var2;
                        qc3Var = new qc3(arrayList3, i54, i12, i20, hb3Var3, i50, i58, i4, xi2Var2, xi2Var8, i9 == 0 ? 0.0f : gb.l((0 - (xi2Var8 != null ? xi2Var8.l : 0)) / i9, -0.5f, 0.5f), i79, i10 < iIntValue5 || i61 > iH2, rv2Var2, ln4Var.v(qc0.f(i116 + i19, j3), qc0.e(iE + i5, j3), v01Var, new o(i47, b13Var2, arrayList9)), z2, list2, arrayList4, we0Var, f82Var8, j2);
                        f82Var3 = f82Var8;
                    }
                    qc3 qc3Var2 = qc3Var;
                    lm0 lm0Var3 = lm0Var;
                    lm0Var3.h(qc3Var2, ln4Var.K(), false);
                    fc3 fc3Var = lm0Var3.u;
                    List list6 = qc3Var2.a;
                    Trace.beginSection("compose:pager:cache_window:keepAroundItems");
                    try {
                        if (fc3Var.h != Integer.MAX_VALUE && fc3Var.i != Integer.MIN_VALUE && !list6.isEmpty()) {
                            int i121 = ((xi2) q40.w0(list6)).a;
                            int i122 = ((xi2) q40.C0(list6)).a;
                            for (int i123 = fc3Var.h; i123 < i121; i123++) {
                                f82Var3.a(i123);
                            }
                            int i124 = i122 + 1;
                            int i125 = fc3Var.i;
                            if (i124 <= i125) {
                                while (true) {
                                    f82Var3.a(i124);
                                    if (i124 != i125) {
                                        i124++;
                                    }
                                }
                            }
                        }
                        return qc3Var2;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    ya4.H(ch4VarT, ch4VarZ, if1VarE);
                    throw th;
                }
            case 5:
                r70 r70Var = (r70) obj5;
                z82 z82Var = (z82) obj4;
                rg1 rg1Var3 = (rg1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (rg1Var3.K(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r70Var.a(z82Var, rg1Var3, 0);
                } else {
                    rg1Var3.N();
                }
                return j15Var;
            case 6:
                f63 f63Var = (f63) obj5;
                c63 c63Var = (c63) obj4;
                jz jzVar = (jz) obj;
                sj1 sj1Var = (sj1) obj2;
                c72 c72Var = f63Var.H;
                if (c72Var.H()) {
                    f63Var.c0 = jzVar;
                    f63Var.b0 = sj1Var;
                    ((ra) h12.L(c72Var)).getSnapshotObserver().a.e(f63Var, f63.i0, c63Var);
                    f63Var.f0 = false;
                } else {
                    f63Var.f0 = true;
                }
                return j15Var;
            case 7:
                ((Integer) obj2).getClass();
                e35.f((Uri) obj5, (String) obj4, (rg1) obj, xl.O(1));
                return j15Var;
            case 8:
                ((Integer) obj2).getClass();
                e35.g((String) obj5, (String) obj4, (rg1) obj, xl.O(1));
                return j15Var;
            default:
                gx3 gx3Var = (gx3) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                gx3Var.n += ((q64) ((sm0) obj4).b).a(fFloatValue - gx3Var.n);
                return j15Var;
        }
    }

    public /* synthetic */ ib(Comparable comparable, String str, int i, int i2) {
        this.n = i2;
        this.o = comparable;
        this.p = str;
    }
}
