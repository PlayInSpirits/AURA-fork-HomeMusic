package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hp0 {
    public static final hp0 e = new x20(0).b();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        String str = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public hp0(x20 x20Var) {
        this.a = x20Var.a;
        this.b = x20Var.b;
        this.c = x20Var.c;
        this.d = (String) x20Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp0)) {
            return false;
        }
        hp0 hp0Var = (hp0) obj;
        return this.a == hp0Var.a && this.b == hp0Var.b && this.c == hp0Var.c && Objects.equals(this.d, hp0Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
