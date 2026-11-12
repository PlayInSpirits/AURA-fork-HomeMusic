package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy extends g2 {
    public final /* synthetic */ ry u;

    public qy(ry r1) {
        this.u = r1;
    }

    @Override // defpackage.g2
    public final String g() {
        oy r2 = (oy) this.u.n.get();
        if (r2 != null) goto L7;
        return "Completer object has been garbage collected, future will fail soon";
    L7:
        return "tag=[" + r2.a + "]";
    }
}
