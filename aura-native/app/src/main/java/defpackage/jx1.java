package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class jx1 extends rw1 implements Set {
    public static final /* synthetic */ int p = 0;
    public transient yw1 o;

    public static int i(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            rr2.k("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static jx1 j(int i, Object... objArr) {
        if (i == 0) {
            return ny3.w;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new nf4(obj);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                nz2.n(f34.f(i6, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int T = g12.T(hashCode);
            while (true) {
                int i7 = T & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += hashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                T++;
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new nf4(obj4);
        }
        if (i(i5) < i2 / 2) {
            return j(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new ny3(i4, i3, i5, objArr, objArr2);
    }

    public static jx1 k(Collection collection) {
        if ((collection instanceof jx1) && !(collection instanceof SortedSet)) {
            jx1 jx1Var = (jx1) collection;
            if (!jx1Var.g()) {
                return jx1Var;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    @Override // defpackage.rw1
    public yw1 a() {
        yw1 yw1Var = this.o;
        if (yw1Var != null) {
            return yw1Var;
        }
        yw1 l = l();
        this.o = l;
        return l;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jx1) && (this instanceof ny3) && (((jx1) obj) instanceof ny3) && ((ny3) this).r != obj.hashCode()) {
            return false;
        }
        return j51.r(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return j51.x(this);
    }

    public yw1 l() {
        Object[] array = toArray(rw1.n);
        vw1 vw1Var = yw1.o;
        return yw1.i(array.length, array);
    }
}
