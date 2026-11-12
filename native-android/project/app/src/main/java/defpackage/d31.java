package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d31 {
    public final long a;
    public final long b;

    public d31(long r4, long r6) {
        if (r6 != 0) goto L6;
        this.a = 0;
        this.b = 1;
        return;
    L6:
        this.a = r4;
        this.b = r6;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
