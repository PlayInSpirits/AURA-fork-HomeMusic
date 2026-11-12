package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nj4 extends b02 {
    public int n;
    public final /* synthetic */ mj4 o;

    public nj4(mj4 r1) {
        this.o = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n >= this.o.e()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.b02
    public final int nextInt() {
        int r0 = this.n;
        this.n = r0 + 1;
        return this.o.c(r0);
    }
}
