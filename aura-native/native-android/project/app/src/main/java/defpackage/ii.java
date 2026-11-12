package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ii extends v1 {
    public static final Object[] q = new Object[0];
    public int n;
    public Object[] o;
    public int p;

    public ii(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = q;
        } else {
            if (i <= 0) {
                kf2.n(f34.f(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.o = objArr;
    }

    @Override // defpackage.v1
    public final int a() {
        return this.p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.p;
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        k();
        e(this.p + 1);
        int iJ = j(this.n + i);
        int i3 = this.p;
        if (i < ((i3 + 1) >> 1)) {
            if (iJ == 0) {
                Object[] objArr = this.o;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iJ - 1;
            }
            int length2 = this.n;
            if (length2 == 0) {
                Object[] objArr2 = this.o;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.n;
            Object[] objArr3 = this.o;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                ti.Z(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                ti.Z(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.o;
                objArr4[objArr4.length - 1] = objArr4[0];
                ti.Z(0, 1, length + 1, objArr4, objArr4);
            }
            this.o[length] = obj;
            this.n = i4;
        } else {
            int iJ2 = j(i3 + this.n);
            Object[] objArr5 = this.o;
            if (iJ < iJ2) {
                ti.Z(iJ + 1, iJ, iJ2, objArr5, objArr5);
            } else {
                ti.Z(1, 0, iJ2, objArr5, objArr5);
                Object[] objArr6 = this.o;
                objArr6[0] = objArr6[objArr6.length - 1];
                ti.Z(iJ + 1, iJ, objArr6.length - 1, objArr6, objArr6);
            }
            this.o[iJ] = obj;
        }
        this.p++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.p;
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.p) {
            return addAll(collection);
        }
        k();
        e(collection.size() + this.p);
        int iJ = j(this.p + this.n);
        int iJ2 = j(this.n + i);
        int size = collection.size();
        if (i >= ((this.p + 1) >> 1)) {
            int i3 = iJ2 + size;
            Object[] objArr = this.o;
            if (iJ2 < iJ) {
                int i4 = size + iJ;
                if (i4 <= objArr.length) {
                    ti.Z(i3, iJ2, iJ, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    ti.Z(i3 - objArr.length, iJ2, iJ, objArr, objArr);
                } else {
                    int length = iJ - (i4 - objArr.length);
                    ti.Z(0, length, iJ, objArr, objArr);
                    Object[] objArr2 = this.o;
                    ti.Z(i3, iJ2, length, objArr2, objArr2);
                }
            } else {
                ti.Z(size, 0, iJ, objArr, objArr);
                Object[] objArr3 = this.o;
                if (i3 >= objArr3.length) {
                    ti.Z(i3 - objArr3.length, iJ2, objArr3.length, objArr3, objArr3);
                } else {
                    ti.Z(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.o;
                    ti.Z(i3, iJ2, objArr4.length - size, objArr4, objArr4);
                }
            }
            d(iJ2, collection);
            return true;
        }
        int i5 = this.n;
        int length2 = i5 - size;
        Object[] objArr5 = this.o;
        if (iJ2 < i5) {
            ti.Z(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.o;
            if (size >= iJ2) {
                ti.Z(objArr6.length - size, 0, iJ2, objArr6, objArr6);
            } else {
                ti.Z(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.o;
                ti.Z(0, size, iJ2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            ti.Z(length2, i5, iJ2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iJ2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                ti.Z(length2, i5, iJ2, objArr5, objArr5);
            } else {
                ti.Z(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.o;
                ti.Z(0, this.n + length3, iJ2, objArr8, objArr8);
            }
        }
        this.n = length2;
        d(h(iJ2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        e(this.p + 1);
        int length = this.n;
        if (length == 0) {
            Object[] objArr = this.o;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.n = i;
        this.o[i] = obj;
        this.p++;
    }

    public final void addLast(Object obj) {
        k();
        e(a() + 1);
        this.o[j(a() + this.n)] = obj;
        this.p = a() + 1;
    }

    @Override // defpackage.v1
    public final Object b(int i) {
        int i2 = this.p;
        if (i < 0 || i >= i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int iJ = j(this.n + i);
        Object[] objArr = this.o;
        Object obj = objArr[iJ];
        int i3 = this.p >> 1;
        int i4 = this.n;
        if (i < i3) {
            if (iJ >= i4) {
                ti.Z(i4 + 1, i4, iJ, objArr, objArr);
            } else {
                ti.Z(1, 0, iJ, objArr, objArr);
                Object[] objArr2 = this.o;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.n;
                ti.Z(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.o;
            int i6 = this.n;
            objArr3[i6] = null;
            this.n = f(i6);
        } else {
            int iJ2 = j((a() - 1) + i4);
            Object[] objArr4 = this.o;
            if (iJ <= iJ2) {
                ti.Z(iJ, iJ + 1, iJ2 + 1, objArr4, objArr4);
            } else {
                ti.Z(iJ, iJ + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.o;
                objArr5[objArr5.length - 1] = objArr5[0];
                ti.Z(0, 1, iJ2 + 1, objArr5, objArr5);
            }
            this.o[iJ2] = null;
        }
        this.p--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.n, j(a() + this.n));
        }
        this.n = 0;
        this.p = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.o.length;
        while (i < length && it.hasNext()) {
            this.o[i] = it.next();
            i++;
        }
        int i2 = this.n;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.o[i3] = it.next();
        }
        this.p = collection.size() + this.p;
    }

    public final void e(int i) {
        if (i < 0) {
            kf2.o("Deque is too big.");
            return;
        }
        Object[] objArr = this.o;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == q) {
            if (i < 10) {
                i = 10;
            }
            this.o = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ti.Z(0, this.n, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.o;
        int length2 = objArr3.length;
        int i3 = this.n;
        ti.Z(length2 - i3, 0, i3, objArr3, objArr2);
        this.n = 0;
        this.o = objArr2;
    }

    public final int f(int i) {
        Object[] objArr = this.o;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.o[this.n];
        }
        kf2.m("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.o[j((size() - 1) + this.n)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i >= 0 && i < iA) {
            return this.o[j(this.n + i)];
        }
        kf2.h(xa3.e(i, iA, "index: ", ", size: "));
        return null;
    }

    public final int h(int i) {
        return i < 0 ? i + this.o.length : i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.o;
        if (i < i2) {
            ti.f0(i, i2, null, objArr);
        } else {
            ti.f0(i, objArr.length, null, objArr);
            ti.f0(0, i2, null, this.o);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iJ = j(a() + this.n);
        int length = this.n;
        if (length < iJ) {
            while (length < iJ) {
                if (h12.c(obj, this.o[length])) {
                    i = this.n;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.n) < iJ) {
            return -1;
        }
        int length2 = this.o.length;
        while (length < length2) {
            if (h12.c(obj, this.o[length])) {
                i = this.n;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iJ; i2++) {
            if (h12.c(obj, this.o[i2])) {
                length = i2 + this.o.length;
                i = this.n;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.o;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            kf2.m("ArrayDeque is empty.");
            return null;
        }
        return this.o[j((size() - 1) + this.n)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iJ = j(this.p + this.n);
        int i2 = this.n;
        if (i2 < iJ) {
            length = iJ - 1;
            if (i2 <= length) {
                while (!h12.c(obj, this.o[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.n;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.n >= iJ) {
            do {
                iJ--;
                objArr = this.o;
                if (-1 >= iJ) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.n;
                    if (i3 <= length) {
                        while (!h12.c(obj, this.o[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.n;
                    }
                }
                return length - i;
            } while (!h12.c(obj, objArr[iJ]));
            length = iJ + this.o.length;
            i = this.n;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.o.length != 0) {
            int iJ2 = j(a() + this.n);
            int i = this.n;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.o;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.o[iJ] = obj;
                        iJ++;
                    }
                    i++;
                }
                ti.f0(iJ, iJ2, null, objArr);
            } else {
                int length = this.o.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.o;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.o[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.o;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.o[iJ] = obj3;
                        iJ = f(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.p = h(iJ - this.n);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            kf2.m("ArrayDeque is empty.");
            return null;
        }
        k();
        Object[] objArr = this.o;
        int i = this.n;
        Object obj = objArr[i];
        objArr[i] = null;
        this.n = f(i);
        this.p = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            kf2.m("ArrayDeque is empty.");
            return null;
        }
        k();
        int iJ = j((size() - 1) + this.n);
        Object[] objArr = this.o;
        Object obj = objArr[iJ];
        objArr[iJ] = null;
        this.p = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        h12.g(i, i2, this.p);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.p) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        k();
        int i4 = this.p - i2;
        int i5 = this.n;
        if (i < i4) {
            int iJ = j((i - 1) + i5);
            int iJ2 = j(this.n + (i2 - 1));
            while (i > 0) {
                int i6 = iJ + 1;
                int iMin = Math.min(i, Math.min(i6, iJ2 + 1));
                Object[] objArr = this.o;
                int i7 = iJ2 - iMin;
                int i8 = iJ - iMin;
                ti.Z(i7 + 1, i8 + 1, i6, objArr, objArr);
                iJ = h(i8);
                iJ2 = h(i7);
                i -= iMin;
            }
            int iJ3 = j(this.n + i3);
            i(this.n, iJ3);
            this.n = iJ3;
        } else {
            int iJ4 = j(i5 + i2);
            int iJ5 = j(this.n + i);
            int i9 = this.p;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.o;
                i2 = Math.min(i9, Math.min(objArr2.length - iJ4, objArr2.length - iJ5));
                Object[] objArr3 = this.o;
                int i10 = iJ4 + i2;
                ti.Z(iJ5, iJ4, i10, objArr3, objArr3);
                iJ4 = j(i10);
                iJ5 = j(iJ5 + i2);
            }
            int iJ6 = j(this.p + this.n);
            i(h(iJ6 - i3), iJ6);
        }
        this.p -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.o.length != 0) {
            int iJ2 = j(a() + this.n);
            int i = this.n;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.o;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.o[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ti.f0(iJ, iJ2, null, objArr);
            } else {
                int length = this.o.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.o;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.o[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.o;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.o[iJ] = obj3;
                        iJ = f(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.p = h(iJ - this.n);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            kf2.h(xa3.e(i, iA, "index: ", ", size: "));
            return null;
        }
        int iJ = j(this.n + i);
        Object[] objArr = this.o;
        Object obj2 = objArr[iJ];
        objArr[iJ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.p;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iJ = j(this.p + this.n);
        int i2 = this.n;
        if (i2 < iJ) {
            ti.c0(i2, iJ, 2, this.o, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.o;
            ti.Z(0, this.n, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.o;
            ti.Z(objArr3.length - this.n, 0, iJ, objArr3, objArr);
        }
        int i3 = this.p;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public ii() {
        this.o = q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        e(collection.size() + a());
        d(j(a() + this.n), collection);
        return true;
    }
}
