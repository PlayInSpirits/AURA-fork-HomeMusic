package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends a1 implements t11, RandomAccess, Serializable {
    public final Enum[] n;

    public u11(Enum[] enumArr) {
        this.n = enumArr;
    }

    @Override // defpackage.y
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) ti.k0(r2.ordinal(), this.n)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.n;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        kf2.h(xa3.e(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.a1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ti.k0(iOrdinal, this.n)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.a1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ti.k0(iOrdinal, this.n)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
