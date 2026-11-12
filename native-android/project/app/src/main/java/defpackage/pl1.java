package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pl1 {
    public static final yw d;
    public static final yw e;
    public static final yw f;
    public static final yw g;
    public static final yw h;
    public static final yw i;
    public final yw a;
    public final yw b;
    public final int c;

    static {
        yw ywVar = yw.q;
        d = pa.t(":");
        e = pa.t(":status");
        f = pa.t(":method");
        g = pa.t(":path");
        h = pa.t(":scheme");
        i = pa.t(":authority");
    }

    public pl1(yw ywVar, yw ywVar2) {
        ywVar.getClass();
        ywVar2.getClass();
        this.a = ywVar;
        this.b = ywVar2;
        this.c = ywVar2.d() + ywVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl1)) {
            return false;
        }
        pl1 pl1Var = (pl1) obj;
        return h12.c(this.a, pl1Var.a) && h12.c(this.b, pl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.q() + ": " + this.b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pl1(String str, String str2) {
        this(pa.t(str), pa.t(str2));
        yw ywVar = yw.q;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pl1(yw ywVar, String str) {
        this(ywVar, pa.t(str));
        ywVar.getClass();
        str.getClass();
        yw ywVar2 = yw.q;
    }
}
