package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o42 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = f35.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public o42(String str, String str2) {
        this.a = f35.R(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o42.class == obj.getClass()) {
            o42 o42Var = (o42) obj;
            if (Objects.equals(this.a, o42Var.a) && Objects.equals(this.b, o42Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
