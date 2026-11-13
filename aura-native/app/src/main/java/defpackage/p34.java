package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p34 {
    public final q34 a;
    public final q34 b;
    public final Throwable c;

    public p34(q34 q34Var, x90 x90Var, Throwable th) {
        this.a = q34Var;
        this.b = x90Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p34)) {
            return false;
        }
        p34 p34Var = (p34) obj;
        return h12.c(this.a, p34Var.a) && h12.c(this.b, p34Var.b) && h12.c(this.c, p34Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q34 q34Var = this.b;
        int hashCode2 = (hashCode + (q34Var == null ? 0 : q34Var.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ p34(q34 q34Var, Throwable th, int i) {
        this(q34Var, (x90) null, (i & 4) != 0 ? null : th);
    }
}
