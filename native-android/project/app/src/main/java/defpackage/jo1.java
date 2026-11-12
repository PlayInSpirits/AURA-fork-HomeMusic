package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jo1 {
    public final String a;
    public final List b;
    public final Child c;
    public final String d;
    public final String e;

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public jo1(String str, List list) {
        this.a = str;
        this.b = list;
        Child child = (Child) q40.w0(list);
        this.c = child;
        this.d = child.getArtistId();
        String albumArtist = child.getAlbumArtist();
        if (albumArtist != null) {
            albumArtist = qm4.u0(albumArtist) ? null : albumArtist;
            albumArtist = albumArtist == null ? child.getArtist() : albumArtist;
        }
        this.e = albumArtist;
    }
}
