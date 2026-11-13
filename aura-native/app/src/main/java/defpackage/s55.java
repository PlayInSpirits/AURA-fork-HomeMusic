package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s55 {
    public static final s55 d = new s55(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public s55(int i, float f2, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s55) {
            s55 s55Var = (s55) obj;
            if (this.a == s55Var.a && this.b == s55Var.b && this.c == s55Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public s55(int i, int i2) {
        this(i, 1.0f, i2);
    }
}
