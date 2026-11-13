package defpackage;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r60 extends AbstractSet implements Serializable {
    public r60() {
        super();
    }

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
        int min;
        char c = 31;
        if (d()) {
            rr2.v("Arrays already allocated", d());
            int i = this.q;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.n = bu.g(max2);
            this.q = bu.s(this.q, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.o = new int[i];
            this.p = new Object[i];
        }
        Set b = b();
        if (b != null) {
            return b.add(obj);
        }
        int[] f = f();
        Object[] e = e();
        int i2 = this.r;
        int i3 = i2 + 1;
        int U = g12.U(obj);
        int i4 = (1 << (this.q & 31)) - 1;
        int i5 = U & i4;
        Object obj2 = this.n;
        Objects.requireNonNull(obj2);
        int B = bu.B(i5, obj2);
        if (B != 0) {
            int i6 = ~i4;
            int i7 = U & i6;
            int i8 = 0;
            while (true) {
                int i9 = B - 1;
                int i10 = f[i9];
                char c2 = c;
                if ((i10 & i6) == i7 && si0.s(obj, e[i9])) {
                    return false;
                }
                int i11 = i10 & i4;
                i8++;
                if (i11 != 0) {
                    B = i11;
                    c = c2;
                } else {
                    if (i8 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.q & 31), 1.0f);
                        int i12 = isEmpty() ? -1 : 0;
                        while (i12 >= 0) {
                            linkedHashSet.add(e()[i12]);
                            i12++;
                            if (i12 >= this.r) {
                                i12 = -1;
                            }
                        }
                        this.n = linkedHashSet;
                        this.o = null;
                        this.p = null;
                        this.q += 32;
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > i4) {
                        i4 = g(i4, bu.t(i4), U, i2);
                    } else {
                        f[i9] = bu.s(i10, i3, i4);
                    }
                }
            }
        } else if (i3 > i4) {
            i4 = g(i4, bu.t(i4), U, i2);
        } else {
            Object obj3 = this.n;
            Objects.requireNonNull(obj3);
            bu.C(i5, i3, obj3);
        }
        int length = f().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.o = Arrays.copyOf(f(), min);
            this.p = Arrays.copyOf(e(), min);
        }
        f()[i2] = bu.s(U, 0, i4);
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
        Set b = b();
        if (b != null) {
            this.q = jz4.o(size(), 3);
            b.clear();
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
        Set b = b();
        if (b != null) {
            return b.contains(obj);
        }
        int U = g12.U(obj);
        int i = (1 << (this.q & 31)) - 1;
        Object obj2 = this.n;
        Objects.requireNonNull(obj2);
        int B = bu.B(U & i, obj2);
        if (B == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = U & i2;
        do {
            int i4 = B - 1;
            int i5 = f()[i4];
            if ((i5 & i2) == i3 && si0.s(obj, e()[i4])) {
                return true;
            }
            B = i5 & i;
        } while (B != 0);
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
        Object g = bu.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            bu.C(i3 & i5, i4 + 1, g);
        }
        Object obj = this.n;
        Objects.requireNonNull(obj);
        int[] f = f();
        for (int i6 = 0; i6 <= i; i6++) {
            int B = bu.B(i6, obj);
            while (B != 0) {
                int i7 = B - 1;
                int i8 = f[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int B2 = bu.B(i10, g);
                bu.C(i10, B, g);
                f[i7] = bu.s(i9, B2, i5);
                B = i8 & i;
            }
        }
        this.n = g;
        this.q = bu.s(this.q, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set b = b();
        return b != null ? b.iterator() : new q60(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!d()) {
            Set b = b();
            if (b != null) {
                return b.remove(obj);
            }
            int i3 = (1 << (this.q & 31)) - 1;
            Object obj2 = this.n;
            Objects.requireNonNull(obj2);
            int A = bu.A(obj, null, i3, obj2, f(), e(), null);
            if (A != -1) {
                Object obj3 = this.n;
                Objects.requireNonNull(obj3);
                int[] f = f();
                Object[] e = e();
                int size = size();
                int i4 = size - 1;
                if (A < i4) {
                    Object obj4 = e[i4];
                    e[A] = obj4;
                    e[i4] = null;
                    f[A] = f[i4];
                    f[i4] = 0;
                    int U = g12.U(obj4) & i3;
                    int B = bu.B(U, obj3);
                    if (B == size) {
                        bu.C(U, A + 1, obj3);
                    } else {
                        while (true) {
                            i = B - 1;
                            i2 = f[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            B = i5;
                        }
                        f[i] = bu.s(i2, A + 1, i3);
                    }
                } else {
                    e[A] = null;
                    f[A] = 0;
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
        Set b = b();
        return b != null ? b.size() : this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (d()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set b = b();
        if (b != null) {
            return b.toArray(objArr);
        }
        Object[] e = e();
        int i = this.r;
        rr2.u(0, i, e.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(e, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (d()) {
            return new Object[0];
        }
        Set b = b();
        return b != null ? b.toArray() : Arrays.copyOf(e(), this.r);
    }
}
