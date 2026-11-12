package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 {
    public final Object a;
    public final int b;

    public wp2(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else if (obj instanceof wq2) {
            this.b = 2;
        } else {
            nz2.c();
            throw null;
        }
    }
}
