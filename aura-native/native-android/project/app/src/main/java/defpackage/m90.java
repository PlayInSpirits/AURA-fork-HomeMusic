package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m90 implements j35 {
    public final if1 a;

    public m90(if1 if1Var) {
        this.a = if1Var;
    }

    @Override // defpackage.j35
    public final Object a(mf3 mf3Var) {
        return this.a.invoke(mf3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m90) && h12.c(this.a, ((m90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
