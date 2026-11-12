package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n01 implements mx1 {
    public final boolean n;

    public n01(boolean r1) {
        this.n = r1;
    }

    @Override // defpackage.mx1
    public final boolean b() {
        return this.n;
    }

    @Override // defpackage.mx1
    public final h63 d() {
        return null;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Empty{");
        if (this.n == false) goto L5;
        String r2 = "Active";
    L6:
        r0.append(r2);
        r0.append('}');
        return r0.toString();
    L5:
        r2 = "New";
        goto L6
    }
}
