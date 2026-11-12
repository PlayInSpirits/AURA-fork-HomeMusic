package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends ya4 {
    public final wv3 f;

    public nb3(wv3 r1) {
        this.f = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof nb3) == false) goto L13;
        wv3 r3 = ((nb3) r2).f;
        if (this.f.equals(r3) == true) goto L11;
        return false;
    L11:
        return true;
    L13:
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
