package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 implements Map, Serializable, a42 {
    public static final ag2 A;
    public Object[] n;
    public Object[] o;
    public int[] p;
    public int[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public bg2 w;
    public cg2 x;
    public bg2 y;
    public boolean z;

    static {
        ag2 ag2Var = new ag2(0);
        ag2Var.z = true;
        A = ag2Var;
    }

    public ag2(int i) {
        if (i < 0) {
            kf2.n("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.n = objArr;
        this.o = null;
        this.p = iArr;
        this.q = new int[iHighestOneBit];
        this.r = 2;
        this.s = 0;
        this.t = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.r * 2;
            int length = this.q.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.q;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.s;
                    Object[] objArr = this.n;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.s = i6;
                    objArr[i5] = obj;
                    this.p[i5] = i;
                    iArr[i] = i6;
                    this.v++;
                    this.u++;
                    if (i3 > this.r) {
                        this.r = i3;
                    }
                    return i5;
                }
                if (h12.c(this.n[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.q.length * 2);
                    break;
                }
                i = i == 0 ? this.q.length - 1 : i - 1;
            }
        }
    }

    public final ag2 b() {
        c();
        this.z = true;
        if (this.v > 0) {
            return this;
        }
        ag2 ag2Var = A;
        ag2Var.getClass();
        return ag2Var;
    }

    public final void c() {
        if (this.z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.s - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.p;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.q[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        xl.I(this.n, 0, this.s);
        Object[] objArr = this.o;
        if (objArr != null) {
            xl.I(objArr, 0, this.s);
        }
        this.v = 0;
        this.s = 0;
        this.u++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.o;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.s;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.p;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.n;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.q[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        xl.I(this.n, i3, i);
        if (objArr != null) {
            xl.I(objArr, i3, this.s);
        }
        this.s = i3;
    }

    public final boolean e(Collection collection) {
        boolean zC;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zC = false;
                    } else {
                        Object[] objArr = this.o;
                        objArr.getClass();
                        zC = h12.c(objArr[iG], entry.getValue());
                    }
                    if (!zC) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        bg2 bg2Var = this.y;
        if (bg2Var != null) {
            return bg2Var;
        }
        bg2 bg2Var2 = new bg2(this, 0);
        this.y = bg2Var2;
        return bg2Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.v == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.n;
        int length = objArr.length;
        int i2 = this.s;
        int i3 = length - i2;
        int i4 = i2 - this.v;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.n = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.o;
            this.o = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.p = Arrays.copyOf(this.p, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.q.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.r;
        while (true) {
            int i3 = this.q[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (h12.c(this.n[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.q.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.o;
        objArr.getClass();
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.s;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.p[i] >= 0) {
                Object[] objArr = this.o;
                objArr.getClass();
                if (h12.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        xf2 xf2Var = new xf2(this, 0);
        int i = 0;
        while (xf2Var.hasNext()) {
            int i2 = xf2Var.n;
            ag2 ag2Var = (ag2) xf2Var.q;
            if (i2 >= ag2Var.s) {
                tb4.k();
                return 0;
            }
            xf2Var.n = i2 + 1;
            xf2Var.o = i2;
            Object obj = ag2Var.n[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ag2Var.o;
            objArr.getClass();
            Object obj2 = objArr[xf2Var.o];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            xf2Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.t;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.v == 0;
    }

    public final void j(int i) {
        int[] iArr;
        this.u++;
        int i2 = 0;
        if (this.s > this.v) {
            d(false);
        }
        this.q = new int[i];
        this.t = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.s) {
            int i3 = i2 + 1;
            int i4 = i(this.n[i2]);
            int i5 = this.r;
            while (true) {
                iArr = this.q;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    kf2.o("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
            iArr[i4] = i3;
            this.p[i2] = i4;
            i2 = i3;
        }
    }

    public final void k(int i) {
        Object[] objArr = this.n;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.o;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.p[i];
        int i2 = this.r * 2;
        int length2 = this.q.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.q.length - 1 : length - 1;
            i4++;
            int i6 = this.r;
            int[] iArr = this.q;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int i9 = i(this.n[i8]) - length;
                        int[] iArr2 = this.q;
                        if ((i9 & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.p[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.p[i] = -1;
            this.v--;
            this.u++;
        } while (i3 >= 0);
        this.q[i5] = -1;
        this.p[i] = -1;
        this.v--;
        this.u++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        bg2 bg2Var = this.w;
        if (bg2Var != null) {
            return bg2Var;
        }
        bg2 bg2Var2 = new bg2(this, 1);
        this.w = bg2Var2;
        return bg2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.o;
        if (objArr == null) {
            int length = this.n.length;
            if (length < 0) {
                kf2.n("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.o = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.o;
            if (objArr == null) {
                int length = this.n.length;
                if (length < 0) {
                    kf2.n("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.o = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!h12.c(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.o;
        objArr.getClass();
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.v * 3) + 2);
        sb.append("{");
        int i = 0;
        xf2 xf2Var = new xf2(this, 0);
        while (xf2Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = xf2Var.n;
            ag2 ag2Var = (ag2) xf2Var.q;
            if (i2 >= ag2Var.s) {
                tb4.k();
                return null;
            }
            xf2Var.n = i2 + 1;
            xf2Var.o = i2;
            Object obj = ag2Var.n[i2];
            if (obj == ag2Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ag2Var.o;
            objArr.getClass();
            Object obj2 = objArr[xf2Var.o];
            if (obj2 == ag2Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            xf2Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        cg2 cg2Var = this.x;
        if (cg2Var != null) {
            return cg2Var;
        }
        cg2 cg2Var2 = new cg2(0, this);
        this.x = cg2Var2;
        return cg2Var2;
    }

    public ag2() {
        this(8);
    }
}
