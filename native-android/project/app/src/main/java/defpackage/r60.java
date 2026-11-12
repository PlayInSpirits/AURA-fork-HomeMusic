package defpackage;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r60 extends AbstractSet implements Serializable {
    public transient Object n;
    public transient int[] o;
    public transient Object[] p;
    public transient int q;
    public transient int r;

    public static r60 a(int i) {
        r60 r60Var = new r60();
        rr2.k("Expected size must be >= 0", i >= 0);
        r60Var.q = jz4.o(i, 1);
        return r60Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        char c = 31;
        if (d()) {
            rr2.v("Arrays already allocated", d());
            int i = this.q;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.n = bu.g(iMax2);
            this.q = bu.s(this.q, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.o = new int[i];
            this.p = new Object[i];
        }
        Set setB = b();
        if (setB != null) {
            return setB.add(obj);
        }
        int[] iArrF = f();
        Object[] objArrE = e();
        int i2 = this.r;
        int i3 = i2 + 1;
        int iU = g12.U(obj);
        int iG = (1 << (this.q & 31)) - 1;
        int i4 = iU & iG;
        Object obj2 = this.n;
        Objects.requireNonNull(obj2);
        int iB = bu.B(i4, obj2);
        if (iB != 0) {
            int i5 = ~iG;
            int i6 = iU & i5;
            int i7 = 0;
            while (true) {
                int i8 = iB - 1;
                int i9 = iArrF[i8];
                char c2 = c;
                if ((i9 & i5) == i6 && si0.s(obj, objArrE[i8])) {
                    return false;
                }
                int i10 = i9 & iG;
                i7++;
                if (i10 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iG) {
                            iArrF[i8] = bu.s(i9, i3, iG);
                            break;
                        }
                        iG = g(iG, bu.t(iG), iU, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.q & 31), 1.0f);
                    int i11 = isEmpty() ? -1 : 0;
                    while (i11 >= 0) {
                        linkedHashSet.add(e()[i11]);
                        i11++;
                        if (i11 >= this.r) {
                            i11 = -1;
                        }
                    }
                    this.n = linkedHashSet;
                    this.o = null;
                    this.p = null;
                    this.q += 32;
                    return linkedHashSet.add(obj);
                }
                iB = i10;
                c = c2;
            }
        } else if (i3 > iG) {
            iG = g(iG, bu.t(iG), iU, i2);
        } else {
            Object obj3 = this.n;
            Objects.requireNonNull(obj3);
            bu.C(i4, i3, obj3);
        }
        int length = f().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.o = Arrays.copyOf(f(), iMin);
            this.p = Arrays.copyOf(e(), iMin);
        }
        f()[i2] = bu.s(iU, 0, iG);
        e()[i2] = obj;
        this.r = i3;
        this.q += 32;
        return true;
    }

    public final Set b() {
        Object obj = this.n;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (d()) {
            return;
        }
        this.q += 32;
        Set setB = b();
        if (setB != null) {
            this.q = jz4.o(size(), 3);
            setB.clear();
            this.n = null;
            this.r = 0;
            return;
        }
        Arrays.fill(e(), 0, this.r, (Object) null);
        Object obj = this.n;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(f(), 0, this.r, 0);
        this.r = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (d()) {
            return false;
        }
        Set setB = b();
        if (setB != null) {
            return setB.contains(obj);
        }
        int iU = g12.U(obj);
        int i = (1 << (this.q & 31)) - 1;
        Object obj2 = this.n;
        Objects.requireNonNull(obj2);
        int iB = bu.B(iU & i, obj2);
        if (iB == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iU & i2;
        do {
            int i4 = iB - 1;
            int i5 = f()[i4];
            if ((i5 & i2) == i3 && si0.s(obj, e()[i4])) {
                return true;
            }
            iB = i5 & i;
        } while (iB != 0);
        return false;
    }

    public final boolean d() {
        return this.n == null;
    }

    public final Object[] e() {
        Object[] objArr = this.p;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] f() {
        int[] iArr = this.o;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int g(int i, int i2, int i3, int i4) {
        Object objG = bu.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            bu.C(i3 & i5, i4 + 1, objG);
        }
        Object obj = this.n;
        Objects.requireNonNull(obj);
        int[] iArrF = f();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB = bu.B(i6, obj);
            while (iB != 0) {
                int i7 = iB - 1;
                int i8 = iArrF[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iB2 = bu.B(i10, objG);
                bu.C(i10, iB, objG);
                iArrF[i7] = bu.s(i9, iB2, i5);
                iB = i8 & i;
            }
        }
        this.n = objG;
        this.q = bu.s(this.q, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setB = b();
        return setB != null ? setB.iterator() : new q60(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!d()) {
            Set setB = b();
            if (setB != null) {
                return setB.remove(obj);
            }
            int i3 = (1 << (this.q & 31)) - 1;
            Object obj2 = this.n;
            Objects.requireNonNull(obj2);
            int iA = bu.A(obj, null, i3, obj2, f(), e(), null);
            if (iA != -1) {
                Object obj3 = this.n;
                Objects.requireNonNull(obj3);
                int[] iArrF = f();
                Object[] objArrE = e();
                int size = size();
                int i4 = size - 1;
                if (iA < i4) {
                    Object obj4 = objArrE[i4];
                    objArrE[iA] = obj4;
                    objArrE[i4] = null;
                    iArrF[iA] = iArrF[i4];
                    iArrF[i4] = 0;
                    int iU = g12.U(obj4) & i3;
                    int iB = bu.B(iU, obj3);
                    if (iB == size) {
                        bu.C(iU, iA + 1, obj3);
                    } else {
                        while (true) {
                            i = iB - 1;
                            i2 = iArrF[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            iB = i5;
                        }
                        iArrF[i] = bu.s(i2, iA + 1, i3);
                    }
                } else {
                    objArrE[iA] = null;
                    iArrF[iA] = 0;
                }
                this.r--;
                this.q += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setB = b();
        return setB != null ? setB.size() : this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (d()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setB = b();
        if (setB != null) {
            return setB.toArray(objArr);
        }
        Object[] objArrE = e();
        int i = this.r;
        rr2.u(0, i, objArrE.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrE, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (d()) {
            return new Object[0];
        }
        Set setB = b();
        return setB != null ? setB.toArray() : Arrays.copyOf(e(), this.r);
    }
}
