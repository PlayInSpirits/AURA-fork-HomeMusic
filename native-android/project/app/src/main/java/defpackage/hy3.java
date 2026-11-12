package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hy3 extends yw1 {
    public final /* synthetic */ iy3 p;

    public hy3(iy3 iy3Var) {
        this.p = iy3Var;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        iy3 iy3Var = this.p;
        rr2.q(i, iy3Var.t);
        Object[] objArr = iy3Var.r;
        int i2 = i * 2;
        int i3 = iy3Var.s;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.t;
    }
}
