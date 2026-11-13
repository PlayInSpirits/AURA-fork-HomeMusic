package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class my2 implements pv2 {
    public final float a;
    public final ly2 b;
    public final ly2 c;

    public my2(float f, ly2 ly2Var, ly2 ly2Var2) {
        this.a = f;
        this.b = ly2Var;
        this.c = ly2Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof my2)) {
            return false;
        }
        my2 my2Var = (my2) obj;
        return Float.compare(this.a, my2Var.a) == 0 && Objects.equals(this.b, my2Var.b) && Objects.equals(this.c, my2Var.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        ly2 ly2Var = this.b;
        int hashCode2 = (hashCode + (ly2Var != null ? ly2Var.hashCode() : 0)) * 31;
        ly2 ly2Var2 = this.c;
        return hashCode2 + (ly2Var2 != null ? ly2Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
