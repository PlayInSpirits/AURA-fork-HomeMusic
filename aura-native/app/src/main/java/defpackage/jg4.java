package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jg4 implements w80, Iterable, x32 {
    public final ig4 n;
    public final int o;
    public final int p;

    public jg4(ig4 ig4Var, int i, int i2) {
        this.n = ig4Var;
        this.o = i;
        this.p = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jg4)) {
            return false;
        }
        jg4 jg4Var = (jg4) obj;
        return jg4Var.o == this.o && jg4Var.p == this.p && jg4Var.n == this.n;
    }

    public final int hashCode() {
        return (this.n.hashCode() * 31) + this.o;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ig4 ig4Var = this.n;
        if (ig4Var.u != this.p) {
            kg4.f();
        }
        int i = this.o;
        ig4Var.g(i);
        return new ik1(ig4Var, i + 1, ig4Var.n[(i * 5) + 3] + i);
    }
}
