package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gg3 {
    public final String a;

    public gg3(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg3) && h12.c(this.a, ((gg3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("PinnedPlaylist(playlistId=", this.a, ")");
    }
}
