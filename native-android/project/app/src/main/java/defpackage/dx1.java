package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends rw1 {
    public final zw1 o;

    public dx1(zw1 zw1Var) {
        this.o = zw1Var;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.o.c(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        zw1 zw1Var = this.o;
        zw1Var.getClass();
        return new cx1(zw1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.o.s;
    }
}
