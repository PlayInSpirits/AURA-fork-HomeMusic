package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends gx2 {
    public final /* synthetic */ ra a;

    public qa(ra r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new ma(this.a);
    }

    @Override // defpackage.gx2
    public final /* bridge */ /* synthetic */ void e(cx2 r1) {
        ma r2 = (ma) r1;
    }

    public final boolean equals(Object r1) {
        if (r1 != this) goto L5;
        return true;
    L5:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
