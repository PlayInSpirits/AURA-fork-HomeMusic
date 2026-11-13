package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sg1 implements w80 {
    public final t80 n;

    public sg1(t80 t80Var) {
        this.n = t80Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sg1) {
            return this.n.equals(((sg1) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() * 31;
    }
}
