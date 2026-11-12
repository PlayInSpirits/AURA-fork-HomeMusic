package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 {
    public final long a;
    public final cu4 b;
    public final int c;
    public final mt2 d;
    public final long e;
    public final cu4 f;
    public final int g;
    public final mt2 h;
    public final long i;
    public final long j;

    public q9(long j, cu4 cu4Var, int i, mt2 mt2Var, long j2, cu4 cu4Var2, int i2, mt2 mt2Var2, long j3, long j4) {
        this.a = j;
        this.b = cu4Var;
        this.c = i;
        this.d = mt2Var;
        this.e = j2;
        this.f = cu4Var2;
        this.g = i2;
        this.h = mt2Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q9.class != obj.getClass()) {
            return false;
        }
        q9 q9Var = (q9) obj;
        return this.a == q9Var.a && this.c == q9Var.c && this.e == q9Var.e && this.g == q9Var.g && this.i == q9Var.i && this.j == q9Var.j && this.b.equals(q9Var.b) && Objects.equals(this.d, q9Var.d) && Objects.equals(this.f, q9Var.f) && Objects.equals(this.h, q9Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
