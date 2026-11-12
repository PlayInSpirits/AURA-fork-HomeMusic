package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends rw1 {
    public final zw1 o;

    public dx1(zw1 r1) {
        this.o = r1;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r2) {
        if ((r2 instanceof Map.Entry) == false) goto L6;
        Map.Entry r3 = (Map.Entry) r2;
        Object r0 = r3.getKey();
        Object r4 = r3.getValue();
        return this.o.c(r0, r4);
    L6:
        return false;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        zw1 r1 = this.o;
        r1.getClass();
        return new cx1(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.o.s;
    }
}
