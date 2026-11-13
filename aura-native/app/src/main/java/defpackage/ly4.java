package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ly4 implements Serializable {
    public final String n;
    public final Object o;
    public final Serializable p;

    public ly4(String str, Object obj, Serializable serializable) {
        this.n = str;
        this.o = obj;
        this.p = serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly4)) {
            return false;
        }
        ly4 ly4Var = (ly4) obj;
        return this.n.equals(ly4Var.n) && this.o.equals(ly4Var.o) && this.p.equals(ly4Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.o.hashCode() + (this.n.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + ((Object) this.n) + ", " + this.o + ", " + this.p + ')';
    }
}
