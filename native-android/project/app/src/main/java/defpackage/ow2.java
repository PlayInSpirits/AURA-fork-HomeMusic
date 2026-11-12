package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ow2 {
    public final long a;
    public final Set b;
    public final Set c;

    public ow2(long j, Set set, Set set2) {
        set2.getClass();
        this.a = j;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow2)) {
            return false;
        }
        ow2 ow2Var = (ow2) obj;
        return this.a == ow2Var.a && h12.c(this.b, ow2Var.b) && h12.c(this.c, ow2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "State(mixId=" + this.a + ", owned=" + this.b + ", tried=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ow2() {
        z01 z01Var = z01.n;
        this(0L, z01Var, z01Var);
    }
}
