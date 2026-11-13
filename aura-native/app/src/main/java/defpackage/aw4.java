package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class aw4 {
    public static final aw4 d = new aw4(new zv4());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = f35.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public aw4(zv4 zv4Var) {
        this.a = zv4Var.a;
        this.b = zv4Var.b;
        this.c = zv4Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aw4.class == obj.getClass()) {
            aw4 aw4Var = (aw4) obj;
            if (this.a == aw4Var.a && this.b == aw4Var.b && this.c == aw4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
