package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d60 implements wf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ d60(int i) {
        this.n = 15;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x01b7 A[LOOP:1: B:33:0x0170->B:46:0x01b7, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r7v10, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        e60 e60Var;
        int i = this.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                le0 le0Var = (le0) obj2;
                str.getClass();
                le0Var.getClass();
                if (str.length() == 0) {
                    return le0Var.toString();
                }
                return str + ", " + le0Var;
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                bx2 bx2Var = (bx2) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(bx2Var);
                return sb;
            case 2:
                rg1 rg1Var = (rg1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!rg1Var.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rg1Var.N();
                }
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                rg1 rg1Var2 = (rg1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!rg1Var2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rg1Var2.N();
                }
                return j15Var;
            case 4:
                ((c72) ((e80) obj)).d0((dx2) obj2);
                return j15Var;
            case 5:
                c90 c90Var = (c90) obj2;
                c72 c72Var = (c72) ((e80) obj);
                c72Var.M = c90Var;
                w12 w12Var = c72Var.Q;
                wl4 wl4Var = g90.h;
                mf3 mf3Var = (mf3) c90Var;
                mf3Var.getClass();
                c72Var.a0((oo0) vr1.C(mf3Var, wl4Var));
                mf3 mf3Var2 = (mf3) c90Var;
                r62 r62Var = (r62) vr1.C(mf3Var2, g90.n);
                if (c72Var.K != r62Var) {
                    c72Var.K = r62Var;
                    c72Var.D();
                    c72 c72VarT = c72Var.t();
                    if (c72VarT != null) {
                        c72VarT.B();
                    } else {
                        ub3 ub3Var = c72Var.A;
                        if (ub3Var != null) {
                            ((ra) ub3Var).invalidate();
                        }
                    }
                    c72Var.C();
                    for (cx2 cx2Var = (cx2) w12Var.g; cx2Var != null; cx2Var = cx2Var.s) {
                        cx2Var.C();
                    }
                }
                c72Var.e0((m65) vr1.C(mf3Var2, g90.t));
                cx2 cx2Var2 = (cx2) w12Var.g;
                if ((cx2Var2.q & 32768) != 0) {
                    while (cx2Var2 != null) {
                        if ((cx2Var2.p & 32768) != 0) {
                            ?? C = cx2Var2;
                            ?? f13Var = 0;
                            while (C != 0) {
                                if (C instanceof a90) {
                                    cx2 cx2Var3 = ((cx2) ((a90) C)).n;
                                    if (cx2Var3.A) {
                                        g63.c(cx2Var3);
                                    } else {
                                        cx2Var3.w = true;
                                    }
                                } else if ((C.p & 32768) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var4 = ((fo0) C).C;
                                    int i2 = 0;
                                    while (cx2Var4 != null) {
                                        if ((cx2Var4.p & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                C = C;
                                                f13Var = f13Var;
                                                f13Var = f13Var;
                                                C = cx2Var4;
                                            } else {
                                                if (f13Var == 0) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (C != 0) {
                                                    f13Var.b(C);
                                                    C = 0;
                                                }
                                                f13Var.b(cx2Var4);
                                            }
                                        } else {
                                            C = C;
                                            f13Var = f13Var;
                                        }
                                        cx2Var4 = cx2Var4.s;
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                    if (i2 == 1) {
                                        C = C;
                                        f13Var = f13Var;
                                    } else {
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                }
                                C = j51.c(f13Var);
                            }
                        }
                        if ((cx2Var2.q & 32768) != 0) {
                            cx2Var2 = cx2Var2.s;
                        }
                    }
                }
                return j15Var;
            case 6:
                ui2 ui2Var = (ui2) obj2;
                c72 c72Var2 = (c72) ((e80) obj);
                if (!h12.c(c72Var2.I, ui2Var)) {
                    c72Var2.I = ui2Var;
                    c72Var2.D();
                }
                return j15Var;
            case 7:
                ((Integer) obj2).getClass();
                ((c72) ((e80) obj)).getClass();
                return j15Var;
            case 8:
                return ((dx2) obj).c((bx2) obj2);
            case 9:
                ne0 ne0Var = (ne0) obj;
                le0 le0Var2 = (le0) obj2;
                ne0Var.getClass();
                le0Var2.getClass();
                ne0 ne0VarU = ne0Var.u(le0Var2.getKey());
                q01 q01Var = q01.n;
                if (ne0VarU == q01Var) {
                    return le0Var2;
                }
                fz0 fz0Var = fz0.R;
                pe0 pe0Var = (pe0) ne0VarU.K(fz0Var);
                if (pe0Var == null) {
                    e60Var = new e60(le0Var2, ne0VarU);
                } else {
                    ne0 ne0VarU2 = ne0VarU.u(fz0Var);
                    if (ne0VarU2 == q01Var) {
                        return new e60(pe0Var, le0Var2);
                    }
                    e60Var = new e60(pe0Var, new e60(le0Var2, ne0VarU2));
                }
                return e60Var;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 11:
                return ((ne0) obj).J((le0) obj2);
            case 12:
                return ((ne0) obj).J((le0) obj2);
            case 13:
                lm0 lm0Var = (lm0) obj2;
                return gb.P(Integer.valueOf(lm0Var.k()), Float.valueOf(gb.l(lm0Var.l(), -0.5f, 0.5f)), Integer.valueOf(lm0Var.n()));
            case 14:
                Map mapC = ((z82) obj2).c();
                if (mapC.isEmpty()) {
                    return null;
                }
                return mapC;
            case 15:
                ((Integer) obj2).getClass();
                e35.d(xl.O(1), (rg1) obj);
                return j15Var;
            case WaveRetry.MAX_FAILURES /* 16 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 17:
                w44 w44Var = (w44) obj2;
                Map map = w44Var.n;
                w03 w03Var = w44Var.o;
                Object[] objArr = w03Var.b;
                Object[] objArr2 = w03Var.c;
                long[] jArr = w03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj3 = objArr[i6];
                                    Map mapC2 = ((x44) objArr2[i6]).c();
                                    if (mapC2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapC2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 18:
                he heVar = (he) obj2;
                return gb.d(heVar.o, s54.a(heVar.n, s54.a, (t44) obj));
            case 19:
                return Integer.valueOf(((sr4) obj2).a);
            case 20:
                bs4 bs4Var = (bs4) obj2;
                return gb.d(Float.valueOf(bs4Var.a), Float.valueOf(bs4Var.b));
            case 21:
                t44 t44Var = (t44) obj;
                cs4 cs4Var = (cs4) obj2;
                bt4 bt4Var = new bt4(cs4Var.a);
                r54 r54Var = s54.v;
                return gb.d(s54.a(bt4Var, r54Var, t44Var), s54.a(new bt4(cs4Var.b), r54Var, t44Var));
            case 22:
                return Integer.valueOf(((gb1) obj2).n);
            case 23:
                hb2 hb2Var = (hb2) obj2;
                return gb.d(hb2Var.a, s54.a(hb2Var.b, s54.i, (t44) obj));
            case 24:
                return Float.valueOf(((hr) obj2).a);
            case 25:
                t44 t44Var2 = (t44) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(s54.a((ge) list.get(i7), s54.b, t44Var2));
                }
                return arrayList;
            case 26:
                ss4 ss4Var = (ss4) obj2;
                return gb.d(Integer.valueOf((int) (ss4Var.a >> 32)), Integer.valueOf((int) (ss4Var.a & 4294967295L)));
            case 27:
                t44 t44Var3 = (t44) obj;
                xb4 xb4Var = (xb4) obj2;
                return gb.d(s54.a(new x40(xb4Var.a), s54.p, t44Var3), s54.a(new g83(xb4Var.b), s54.x, t44Var3), Float.valueOf(xb4Var.c));
            case 28:
                return Integer.valueOf(((mr4) obj2).a);
            default:
                return Integer.valueOf(((ur4) obj2).a);
        }
    }

    public /* synthetic */ d60(int i, byte b) {
        this.n = i;
    }
}
