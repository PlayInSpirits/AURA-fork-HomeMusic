package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hx1 extends rw1 implements Collection {
    public static final /* synthetic */ int q = 0;
    public transient gy3 o;
    public transient jx1 p;

    @Override // defpackage.rw1
    public final yw1 a() {
        gy3 r0 = this.o;
        if (r0 != null) goto L6;
        yw1 r1 = super.a();
        this.o = (gy3) r1;
        return r1;
    L6:
        return r0;
    }

    @Override // defpackage.rw1
    public final int b(int r4, Object[] r5) {
        o15 r3 = j().h();
    L4:
        if (r3.hasNext() == false) goto L6;
        p73 r0 = (p73) r3.next();
        Arrays.fill(r5, r4, r0.a() + r4, r0.a);
        r4 = r4 + r0.a();
        goto L4
    L6:
        return r4;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r1) {
        if (((my3) this).r.b(r1) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object r4) {
        if (r4 != this) goto L5;
        return true;
    L5:
        if ((r4 instanceof hx1) == false) goto L19;
        hx1 r5 = (hx1) r4;
        my3 r0 = (my3) this;
        if (r0.size() == r5.size()) goto L9;
        return false;
    L9:
        if (j().size() != r5.j().size()) goto L26;
        Iterator r3 = r5.j().iterator();
    L13:
        if (r3.hasNext() == false) goto L24;
        p73 r6 = (p73) r3.next();
        Object r1 = r6.a;
        if (r0.r.b(r1) == r6.a()) goto L13;
        return false;
    L24:
        return true;
    L26:
        return false;
    L19:
        return false;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        return new ex1(j().h());
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j51.x(j());
    }

    public abstract jx1 i();

    public final jx1 j() {
        jx1 r0 = this.p;
        if (r0 == null) goto L5;
    L9:
        return r0;
    L5:
        if (isEmpty() == false) goto L7;
        r0 = ny3.w;
    L8:
        this.p = r0;
        goto L9
    L7:
        r0 = new gx1(this, 0);
        goto L8
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}
