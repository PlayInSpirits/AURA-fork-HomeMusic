package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r94 {
    public static final Comparator[] a;
    public static final m94 b;

    static {
        int i = 2;
        Comparator[] comparatorArr = new Comparator[2];
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new hh2(i, new hh2(1, i2 == 0 ? ca1.u : ca1.p));
            i2++;
        }
        a = comparatorArr;
        b = new m94(9);
    }

    public static final void a(i94 i94Var, ArrayList arrayList, x xVar, x xVar2, i03 i03Var) {
        e94 e94Var = i94Var.d;
        Object objG = e94Var.n.g(n94.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) xVar2.invoke(i94Var)).booleanValue()) && ((Boolean) xVar.invoke(i94Var)).booleanValue()) {
            arrayList.add(i94Var);
        }
        if (zBooleanValue) {
            i03Var.i(i94Var.f, b(i94Var, xVar, xVar2, i94Var.i((4 & 1) != 0 ? !i94Var.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = i94Var.i((4 & 1) != 0 ? !i94Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((i94) listI.get(i), arrayList, xVar, xVar2, i03Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(i94 i94Var, x xVar, x xVar2, List list) {
        int i;
        i03 i03Var = f02.a;
        i03 i03Var2 = new i03();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((i94) list.get(i2), arrayList, xVar, xVar2, i03Var2);
        }
        int i3 = 1;
        char c = i94Var.c.K == r62.o ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                i94 i94Var2 = (i94) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new kd3(i94Var2.h(), gb.Q(i94Var2)));
                    break;
                }
                float f = i94Var2.h().b;
                float f2 = i94Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        wv3 wv3Var = (wv3) ((kd3) arrayList2.get(i6)).n;
                        float f3 = wv3Var.b;
                        i = i3;
                        float f4 = wv3Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new kd3(new wv3(Math.max(wv3Var.a, 0.0f), Math.max(wv3Var.b, f), Math.min(wv3Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((kd3) arrayList2.get(i6)).o));
                            ((List) ((kd3) arrayList2.get(i6)).o).add(i94Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new kd3(i94Var2.h(), gb.Q(i94Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        u40.m0(arrayList2, ca1.v);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            kd3 kd3Var = (kd3) arrayList2.get(i8);
            u40.m0((List) kd3Var.o, comparator);
            arrayList3.addAll((Collection) kd3Var.o);
        }
        u40.m0(arrayList3, new n7(19));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) i03Var2.b(((i94) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) xVar2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
