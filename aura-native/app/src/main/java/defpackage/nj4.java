package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nj4 extends b02 {
    public int n;
    public final /* synthetic */ mj4 o;

    public nj4(mj4 mj4Var) {
        this.o = mj4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.o.e();
    }

    @Override // defpackage.b02
    public final int nextInt() {
        int i = this.n;
        this.n = i + 1;
        return this.o.c(i);
    }
}
