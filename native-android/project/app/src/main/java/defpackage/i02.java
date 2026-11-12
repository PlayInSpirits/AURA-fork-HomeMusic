package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i02 extends b02 {
    public final int n;
    public final int o;
    public boolean p;
    public int q;

    public i02(int i, int i2, int i3) {
        this.n = i3;
        this.o = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.p = z;
        this.q = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p;
    }

    @Override // defpackage.b02
    public final int nextInt() {
        int i = this.q;
        if (i != this.o) {
            this.q = this.n + i;
            return i;
        }
        if (this.p) {
            this.p = false;
            return i;
        }
        tb4.k();
        return 0;
    }
}
