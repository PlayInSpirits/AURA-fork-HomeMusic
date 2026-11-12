package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends a1 implements t11, RandomAccess, Serializable {
    public final Enum[] n;

    public u11(Enum[] r1) {
        this.n = r1;
    }

    @Override // defpackage.y
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        if ((r2 instanceof Enum) == false) goto L11;
        Enum r3 = (Enum) r2;
        Enum[] r1 = this.n;
        if (((Enum) ti.k0(r3.ordinal(), r1)) != r3) goto L9;
        return true;
    L9:
        return false;
    L11:
        return false;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        Enum[] r2 = this.n;
        int r0 = r2.length;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        return r2[r3];
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.a1, java.util.List
    public final int indexOf(Object r3) {
        if ((r3 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r4 = (Enum) r3;
        int r0 = r4.ordinal();
        if (((Enum) ti.k0(r0, this.n)) != r4) goto L8;
        return r0;
    L8:
        return -1;
    }

    @Override // defpackage.a1, java.util.List
    public final int lastIndexOf(Object r3) {
        if ((r3 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r4 = (Enum) r3;
        int r0 = r4.ordinal();
        if (((Enum) ti.k0(r0, this.n)) != r4) goto L8;
        return r0;
    L8:
        return -1;
    }
}
