package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n01 implements mx1 {
    public final boolean n;

    public n01(boolean z) {
        this.n = z;
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
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.n ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
