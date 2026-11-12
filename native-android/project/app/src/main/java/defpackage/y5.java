package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 {
    public static final String d;
    public static final String e;
    public static final String f;
    public final long a;
    public final long b;
    public final String c;

    static {
        String str = f35.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public y5(long j, long j2, String str) {
        rr2.l((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.a = j == -9223372036854775807L ? 0L : j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y5.class == obj.getClass()) {
            y5 y5Var = (y5) obj;
            if (this.a == y5Var.a && this.b == y5Var.b && Objects.equals(this.c, y5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), this.c);
    }
}
