package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gg3 {
    public final String a;

    public gg3(String r1) {
        r1.getClass();
        this.a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof gg3) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.a, ((gg3) r4).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("PinnedPlaylist(playlistId=", this.a, ")");
    }
}
