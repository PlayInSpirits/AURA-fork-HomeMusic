package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o00 {
    public static final o00 c = new o00(q40.T0(new ArrayList()), null);
    public final Set a;
    public final rr2 b;

    public o00(Set set, rr2 rr2Var) {
        this.a = set;
        this.b = rr2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return o00Var.a.equals(this.a) && h12.c(o00Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        rr2 rr2Var = this.b;
        return hashCode + (rr2Var != null ? rr2Var.hashCode() : 0);
    }
}
