package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yy4 implements wd {
    public final int a;
    public final ry0 b;

    public yy4(int i, ry0 ry0Var) {
        this.a = i;
        this.b = ry0Var;
    }

    @Override // defpackage.wd
    public final g45 a() {
        return new x7(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yy4)) {
            return false;
        }
        yy4 yy4Var = (yy4) obj;
        return yy4Var.a == this.a && h12.c(yy4Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a * 31)) * 31;
    }
}
