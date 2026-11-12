package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y44 implements x44 {
    public final if1 n;
    public final w03 o;
    public w03 p;

    public y44(Map map, if1 if1Var) {
        w03 w03Var;
        this.n = if1Var;
        if (map == null || map.isEmpty()) {
            w03Var = null;
        } else {
            w03Var = new w03(map.size());
            for (Map.Entry entry : map.entrySet()) {
                w03Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.o = w03Var;
    }

    @Override // defpackage.x44
    public final c12 a(String str, gf1 gf1Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ya4.y(str.charAt(i))) {
                w03 w03Var = this.p;
                if (w03Var == null) {
                    long[] jArr = v54.a;
                    w03Var = new w03();
                    this.p = w03Var;
                }
                Object objG = w03Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    w03Var.l(str, objG);
                }
                ((List) objG).add(gf1Var);
                return new c12(w03Var, str, gf1Var, 9);
            }
        }
        kf2.n("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.x44
    public final boolean b(Object obj) {
        return ((Boolean) this.n.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.x44
    public final Map c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        w03 w03Var = this.o;
        if (w03Var == null && this.p == null) {
            return v01.n;
        }
        int i3 = 0;
        int i4 = w03Var != null ? w03Var.e : 0;
        w03 w03Var2 = this.p;
        HashMap map = new HashMap(i4 + (w03Var2 != null ? w03Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (w03Var != null) {
            Object[] objArr = w03Var.b;
            Object[] objArr2 = w03Var.c;
            long[] jArr3 = w03Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        w03 w03Var3 = this.p;
        if (w03Var3 != null) {
            Object[] objArr3 = w03Var3.b;
            Object[] objArr4 = w03Var3.c;
            long[] jArr4 = w03Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((gf1) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!b(objInvoke)) {
                                            nz2.f(gh0.o(objInvoke));
                                            return null;
                                        }
                                        map.put(str, gb.d(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((gf1) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !b(objInvoke2)) {
                                            nz2.f(gh0.o(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.x44
    public final Object d(String str) {
        w03 w03Var = this.o;
        List list = w03Var != null ? (List) w03Var.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && w03Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = w03Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = w03Var.c;
            Object obj = objArr[iF];
            w03Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
