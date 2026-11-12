package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 {
    public final Object a;
    public final int b;

    public wp2(Object r2) {
        this.a = r2;
        if ((r2 instanceof String) == false) goto L7;
        this.b = 1;
        return;
    L7:
        if ((r2 instanceof wq2) == false) goto L10;
        this.b = 2;
        return;
    L10:
        nz2.c();
        throw null;
    }
}
