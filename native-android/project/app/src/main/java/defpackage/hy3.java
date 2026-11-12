package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hy3 extends yw1 {
    public final /* synthetic */ iy3 p;

    public hy3(iy3 r1) {
        this.p = r1;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        iy3 r2 = this.p;
        rr2.q(r3, r2.t);
        Object[] r0 = r2.r;
        int r4 = r3 * 2;
        int r5 = r2.s;
        Object r1 = r0[r4 + r5];
        Objects.requireNonNull(r1);
        Object r6 = r0[r4 + (r5 ^ 1)];
        Objects.requireNonNull(r6);
        return new AbstractMap.SimpleImmutableEntry(r1, r6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.t;
    }
}
