package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends jq {
    public int g;
    public int h;
    public boolean i;

    @Override // defpackage.jq
    public final void a() {
        if (this.g == 0) {
            if (this.b > 0) {
                kf2.n("Rounded corners are not supported in contiguous indeterminate animation.");
            } else {
                if (this.c.length >= 3) {
                    return;
                }
                kf2.n("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
