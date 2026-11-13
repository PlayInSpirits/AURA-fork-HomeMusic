package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i74 {
    public static final i74 b;
    public final jx1 a;

    static {
        si1 si1Var = new si1(22, false);
        si1Var.o = jx1.j(2, 1, 5);
        b = new i74(si1Var);
    }

    public i74(si1 si1Var) {
        this.a = (jx1) si1Var.o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i74) && this.a.equals(((i74) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
