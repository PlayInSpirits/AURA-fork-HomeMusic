package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class yd4 {
    public int[] n;
    public Object[] o;
    public int p;

    public yd4(int i) {
        this.n = i == 0 ? su3.a : new int[i];
        this.o = i == 0 ? su3.c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.p * 2;
        Object[] objArr = this.o;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.p;
        int[] iArr = this.n;
        if (iArr.length < i) {
            this.n = Arrays.copyOf(iArr, i);
            this.o = Arrays.copyOf(this.o, i * 2);
        }
        if (this.p == i2) {
            return;
        }
        kf2.c();
    }

    public final int c(int i, Object obj) {
        int i2 = this.p;
        if (i2 == 0) {
            return -1;
        }
        int iH = su3.h(i2, i, this.n);
        if (iH < 0 || h12.c(obj, this.o[iH << 1])) {
            return iH;
        }
        int i3 = iH + 1;
        while (i3 < i2 && this.n[i3] == i) {
            if (h12.c(obj, this.o[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iH - 1; i4 >= 0 && this.n[i4] == i; i4--) {
            if (h12.c(obj, this.o[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.p > 0) {
            this.n = su3.a;
            this.o = su3.c;
            this.p = 0;
        }
        if (this.p <= 0) {
            return;
        }
        kf2.c();
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.p;
        if (i == 0) {
            return -1;
        }
        int iH = su3.h(i, 0, this.n);
        if (iH < 0 || this.o[iH << 1] == null) {
            return iH;
        }
        int i2 = iH + 1;
        while (i2 < i && this.n[i2] == 0) {
            if (this.o[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iH - 1; i3 >= 0 && this.n[i3] == 0; i3--) {
            if (this.o[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof yd4) {
                int i = this.p;
                if (i != ((yd4) obj).p) {
                    return false;
                }
                yd4 yd4Var = (yd4) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objJ = j(i2);
                    Object obj2 = yd4Var.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !yd4Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.p != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.p;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objJ2 = j(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.p) {
            z = true;
        }
        if (z) {
            return this.o[i << 1];
        }
        kf2.n(f34.f(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public void g(oi oiVar) {
        int i = oiVar.p;
        b(this.p + i);
        if (this.p != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(oiVar.f(i2), oiVar.j(i2));
            }
        } else if (i > 0) {
            ti.Y(0, 0, i, oiVar.n, this.n);
            ti.Z(0, 0, i << 1, oiVar.o, this.o);
            this.p = i;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.o[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.o[(iD << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.p)) {
            kf2.n(f34.f(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.o;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.n;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ti.Y(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.o;
                ti.Z(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.o;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.n = Arrays.copyOf(iArr, i7);
            this.o = Arrays.copyOf(this.o, i7 << 1);
            if (i2 != this.p) {
                kf2.c();
                return null;
            }
            if (i > 0) {
                ti.Y(0, 0, i, iArr, this.n);
                ti.Z(0, 0, i3, objArr, this.o);
            }
            if (i < i4) {
                int i8 = i + 1;
                ti.Y(i, i8, i2, iArr, this.n);
                ti.Z(i3, i8 << 1, i2 << 1, objArr, this.o);
            }
        }
        if (i2 == this.p) {
            this.p = i4;
            return obj;
        }
        kf2.c();
        return null;
    }

    public int hashCode() {
        int[] iArr = this.n;
        Object[] objArr = this.o;
        int i = this.p;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public Object i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.p) {
            z = true;
        }
        if (!z) {
            kf2.n(f34.f(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.o;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.p <= 0;
    }

    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.p) {
            z = true;
        }
        if (z) {
            return this.o[(i << 1) + 1];
        }
        kf2.n(f34.f(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.p;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.o;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.n;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.n = Arrays.copyOf(iArr, i4);
            this.o = Arrays.copyOf(this.o, i4 << 1);
            if (i != this.p) {
                kf2.c();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.n;
            int i5 = i3 + 1;
            ti.Y(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.o;
            ti.Z(i5 << 1, i3 << 1, this.p << 1, objArr2, objArr2);
        }
        int i6 = this.p;
        if (i == i6) {
            int[] iArr3 = this.n;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.o;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.p = i6 + 1;
                return null;
            }
        }
        kf2.c();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !h12.c(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !h12.c(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public final int size() {
        return this.p;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 28);
        sb.append('{');
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }
}
