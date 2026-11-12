package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends ya4 {
    public final wv3 f;

    public nb3(wv3 wv3Var) {
        this.f = wv3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nb3) {
            return this.f.equals(((nb3) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.ya4
    public final wv3 s() {
        return this.f;
    }
}
