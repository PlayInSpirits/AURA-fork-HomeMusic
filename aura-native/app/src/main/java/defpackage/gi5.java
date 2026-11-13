package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class gi5 extends wh5 implements Set {
    public static final /* synthetic */ int p = 0;
    public transient ei5 o;

    public static gi5 g(int i, Object... objArr) {
        if (i == 0) {
            return qi5.w;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new ti5(obj);
        }
        int h = h(i);
        Object[] objArr2 = new Object[h];
        int i2 = h - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                nz2.n(f34.f(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i6 = rotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ti5(obj4);
        }
        if (h(i4) < h / 2) {
            return g(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new qi5(i3, i2, i4, objArr, objArr2);
    }

    public static int h(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        kf2.n("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof gi5) && (this instanceof qi5) && (((gi5) obj) instanceof qi5) && ((qi5) this).r != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return gh0.M(this);
    }

    public ei5 i() {
        ei5 ei5Var = this.o;
        if (ei5Var != null) {
            return ei5Var;
        }
        ei5 j = j();
        this.o = j;
        return j;
    }

    public ei5 j() {
        Object[] array = toArray(wh5.n);
        xh5 xh5Var = ei5.o;
        return ei5.i(array.length, array);
    }
}
