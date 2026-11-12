package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y33 extends e35 {
    public final t33 p;

    public y33(t33 t33Var) {
        t33Var.getClass();
        this.p = t33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y33.class == obj.getClass() && h12.c(this.p, ((y33) obj).p);
    }

    public final int hashCode() {
        return this.p.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.p + ", direction=-1)";
    }
}
