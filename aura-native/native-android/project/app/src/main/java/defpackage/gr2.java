package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 {
    public final yw1 a;
    public final int b;
    public final long c;

    public gr2(List list, int i, long j) {
        this.a = yw1.k(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr2)) {
            return false;
        }
        gr2 gr2Var = (gr2) obj;
        return this.a.equals(gr2Var.a) && this.b == gr2Var.b && this.c == gr2Var.c;
    }

    public final int hashCode() {
        return si0.z(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
