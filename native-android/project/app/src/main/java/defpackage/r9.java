package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends e35 {
    public final int p;

    public r9(int i) {
        this.p = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r9) && ((r9) obj).p == this.p;
    }

    public final int hashCode() {
        return this.p * 31;
    }
}
