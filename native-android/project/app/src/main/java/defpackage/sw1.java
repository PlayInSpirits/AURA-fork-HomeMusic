package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends r1 implements Serializable {
    public final Object n;
    public final Object o;

    public sw1(Object r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.o;
    }

    @Override // defpackage.r1, java.util.Map.Entry
    public final Object setValue(Object r1) {
        throw new UnsupportedOperationException();
    }
}
