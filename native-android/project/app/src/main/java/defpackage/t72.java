package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t72 {
    public final String a;

    public t72(String r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof t72) == true) goto L5;
        return false;
    L5:
        return this.a.equals(((t72) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b11.q(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
