package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ws3 {
    public final gn2 a;
    public final long b;
    public final long c;

    public ws3(gn2 gn2Var, long j, long j2) {
        this.a = gn2Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws3)) {
            return false;
        }
        ws3 ws3Var = (ws3) obj;
        return this.b == ws3Var.b && this.a.equals(ws3Var.a) && this.c == ws3Var.c;
    }

    public final int hashCode() {
        long j = this.b;
        int iHashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.c;
        return iHashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
