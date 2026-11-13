package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qi implements Collection, Set, y32, b42 {
    public int[] n;
    public Object[] o;
    public int p;

    public qi(int i) {
        this.n = su3.a;
        this.o = su3.c;
        if (i > 0) {
            this.n = new int[i];
            this.o = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.p;
        Object[] objArr = this.o;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.n;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                ti.Y(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.o;
                ti.Z(i, i4, i2, objArr2, objArr2);
            }
            this.o[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.n = iArr2;
            this.o = new Object[i5];
            if (i > 0) {
                ti.b0(0, i, 6, iArr, iArr2);
                ti.c0(0, i, 6, objArr, this.o);
            }
            if (i < i3) {
                int i6 = i + 1;
                ti.Y(i, i6, i2, iArr, this.n);
                ti.Z(i, i6, i2, objArr, this.o);
            }
        }
        if (i2 == this.p) {
            this.p = i3;
            return obj;
        }
        kf2.c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int w;
        int i2 = this.p;
        if (obj == null) {
            w = h12.w(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            w = h12.w(this, obj, hashCode);
        }
        if (w >= 0) {
            return false;
        }
        int i3 = ~w;
        int[] iArr = this.n;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.o;
            int[] iArr2 = new int[i4];
            this.n = iArr2;
            this.o = new Object[i4];
            if (i2 != this.p) {
                kf2.c();
                return false;
            }
            if (iArr2.length != 0) {
                ti.b0(0, iArr.length, 6, iArr, iArr2);
                ti.c0(0, objArr.length, 6, objArr, this.o);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.n;
            int i5 = i3 + 1;
            ti.Y(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.o;
            ti.Z(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.p;
        if (i2 == i6) {
            int[] iArr4 = this.n;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.o[i3] = obj;
                this.p = i6 + 1;
                return true;
            }
        }
        kf2.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.p;
        int i = this.p;
        int[] iArr = this.n;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.o;
            int[] iArr2 = new int[size];
            this.n = iArr2;
            this.o = new Object[size];
            if (i > 0) {
                ti.b0(0, i, 6, iArr, iArr2);
                ti.c0(0, this.p, 6, objArr, this.o);
            }
        }
        if (this.p != i) {
            kf2.c();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.p != 0) {
            this.n = su3.a;
            this.o = su3.c;
            this.p = 0;
        }
        if (this.p == 0) {
            return;
        }
        kf2.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h12.w(this, null, 0) : h12.w(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.p != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.p;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.o[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.n;
        int i = this.p;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.p <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ki(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int w = obj == null ? h12.w(this, null, 0) : h12.w(this, obj, obj.hashCode());
        if (w < 0) {
            return false;
        }
        a(w);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.p - 1; -1 < i; i--) {
            if (!q40.s0(collection, this.o[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.p;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.p;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ti.Z(0, 0, this.p, this.o, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 14);
        sb.append('{');
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.o[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ti.e0(this.o, 0, this.p);
    }
}
