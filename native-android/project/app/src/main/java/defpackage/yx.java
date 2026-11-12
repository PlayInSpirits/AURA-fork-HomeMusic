package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yx extends oi {
    public int t;

    @Override // defpackage.yd4, java.util.Map
    public final void clear() {
        this.t = 0;
        super.clear();
    }

    @Override // defpackage.yd4
    public final void g(oi r2) {
        this.t = 0;
        super.g(r2);
    }

    @Override // defpackage.yd4
    public final Object h(int r2) {
        this.t = 0;
        return super.h(r2);
    }

    @Override // defpackage.yd4, java.util.Map
    public final int hashCode() {
        if (this.t != 0) goto L6;
        this.t = super.hashCode();
    L6:
        return this.t;
    }

    @Override // defpackage.yd4
    public final Object i(int r2, Object r3) {
        this.t = 0;
        return super.i(r2, r3);
    }

    @Override // defpackage.yd4, java.util.Map
    public final Object put(Object r2, Object r3) {
        this.t = 0;
        return super.put(r2, r3);
    }
}
