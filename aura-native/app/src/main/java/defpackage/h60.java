package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h60 implements dx2 {
    public final dx2 a;
    public final dx2 b;

    public h60(dx2 dx2Var, dx2 dx2Var2) {
        this.a = dx2Var;
        this.b = dx2Var2;
    }

    @Override // defpackage.dx2
    public final boolean a(if1 if1Var) {
        return this.a.a(if1Var) && this.b.a(if1Var);
    }

    @Override // defpackage.dx2
    public final Object b(wf1 wf1Var, Object obj) {
        return this.b.b(wf1Var, this.a.b(wf1Var, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h60)) {
            return false;
        }
        h60 h60Var = (h60) obj;
        return this.a.equals(h60Var.a) && h12.c(this.b, h60Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) b(new d60(1, (byte) 0), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
