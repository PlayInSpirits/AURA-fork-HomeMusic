package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hg2 extends r1 {
    public final /* synthetic */ Map.Entry n;
    public final /* synthetic */ jg2 o;

    public hg2(Map.Entry r1, jg2 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.n.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry r0 = this.n;
        Object r1 = r0.getKey();
        Object r2 = r0.getValue();
        return this.o.g(r1, r2);
    }
}
