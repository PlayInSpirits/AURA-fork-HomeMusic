package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m12 extends AbstractList implements RandomAccess, Serializable {
    public final int[] n;
    public final int o;
    public final int p;

    public m12(int i, int i2, int[] iArr) {
        this.n = iArr;
        this.o = i;
        this.p = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return jz4.y(this.n, ((Integer) obj).intValue(), this.o, this.p) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m12)) {
            return super.equals(obj);
        }
        m12 m12Var = (m12) obj;
        int size = size();
        if (m12Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.n[this.o + i] != m12Var.n[m12Var.o + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        rr2.q(i, size());
        return Integer.valueOf(this.n[this.o + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.o; i2 < this.p; i2++) {
            i = (i * 31) + this.n[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.p;
        int[] iArr = this.n;
        int i2 = this.o;
        int y = jz4.y(iArr, intValue, i2, i);
        if (y >= 0) {
            return y - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.p;
            while (true) {
                i2--;
                i = this.o;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.n[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        rr2.q(i, size());
        int i2 = this.o + i;
        int[] iArr = this.n;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p - this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        rr2.u(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.o;
        return new m12(i + i3, i3 + i2, this.n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.n;
        int i = this.o;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.p) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
