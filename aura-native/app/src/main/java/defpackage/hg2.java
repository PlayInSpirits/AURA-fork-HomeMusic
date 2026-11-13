package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hg2 extends r1 {
    public final /* synthetic */ Map.Entry n;
    public final /* synthetic */ jg2 o;

    public hg2(Map.Entry entry, jg2 jg2Var) {
        this.n = entry;
        this.o = jg2Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.n.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.n;
        return this.o.g(entry.getKey(), entry.getValue());
    }
}
