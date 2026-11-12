package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz {
    public oo0 a;
    public r62 b;
    public jz c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz)) {
            return false;
        }
        lz lzVar = (lz) obj;
        return h12.c(this.a, lzVar.a) && this.b == lzVar.b && h12.c(this.c, lzVar.c) && qf4.a(this.d, lzVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + qf4.c(this.d) + ")";
    }
}
