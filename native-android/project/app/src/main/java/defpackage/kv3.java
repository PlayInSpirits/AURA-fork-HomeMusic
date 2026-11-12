package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv3 implements if1 {
    public final /* synthetic */ int n = 1;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ kv3(int i, List list, q25 q25Var) {
        this.o = i;
        this.p = list;
        this.q = q25Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i;
        t80 t80Var;
        int i2;
        t80 t80Var2;
        int i3;
        int i4 = this.n;
        j15 j15Var = j15.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        int i5 = this.o;
        switch (i4) {
            case 0:
                lv3 lv3Var = (lv3) obj3;
                p03 p03Var = (p03) obj2;
                t80 t80Var3 = (t80) obj;
                if (lv3Var.e == i5 && h12.c(p03Var, lv3Var.f) && (t80Var3 instanceof z80)) {
                    long[] jArr = p03Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8;
                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((255 & j) < 128) {
                                        int i10 = (i6 << 3) + i9;
                                        Object obj4 = p03Var.b[i10];
                                        boolean z = p03Var.c[i10] != i5;
                                        if (z) {
                                            i3 = i7;
                                            z80 z80Var = (z80) t80Var3;
                                            i2 = i5;
                                            w03 w03Var = z80Var.t;
                                            te5.I(w03Var, obj4, lv3Var);
                                            t80Var2 = t80Var3;
                                            if (obj4 instanceof dp0) {
                                                dp0 dp0Var = (dp0) obj4;
                                                if (!w03Var.c(dp0Var)) {
                                                    te5.J(z80Var.w, dp0Var);
                                                }
                                                w03 w03Var2 = lv3Var.g;
                                                if (w03Var2 != null) {
                                                    w03Var2.j(obj4);
                                                }
                                            }
                                        } else {
                                            i2 = i5;
                                            t80Var2 = t80Var3;
                                            i3 = i7;
                                        }
                                        if (z) {
                                            p03Var.f(i10);
                                        }
                                    } else {
                                        i2 = i5;
                                        t80Var2 = t80Var3;
                                        i3 = i7;
                                    }
                                    j >>= i3;
                                    i9++;
                                    i7 = i3;
                                    i5 = i2;
                                    t80Var3 = t80Var2;
                                }
                                i = i5;
                                t80Var = t80Var3;
                                if (i8 != i7) {
                                    break;
                                }
                            } else {
                                i = i5;
                                t80Var = t80Var3;
                            }
                            if (i6 != length) {
                                i6++;
                                i5 = i;
                                t80Var3 = t80Var;
                            }
                        }
                    }
                }
                break;
            default:
                List<gn2> list = (List) obj3;
                q25 q25Var = (q25) obj2;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList = new ArrayList(r40.k0(list, 10));
                for (gn2 gn2Var : list) {
                    long j2 = q25Var.N;
                    q25Var.N = 1 + j2;
                    arrayList.add(new p25(j2, gn2Var, (String) q25Var.m.invoke(gn2Var)));
                }
                list2.addAll(i5, arrayList);
                break;
        }
        return j15Var;
    }

    public /* synthetic */ kv3(lv3 lv3Var, int i, p03 p03Var) {
        this.p = lv3Var;
        this.o = i;
        this.q = p03Var;
    }
}
