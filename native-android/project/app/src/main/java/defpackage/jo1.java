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

    public jo1(String r2, List r3) {
        this.a = r2;
        this.b = r3;
        Child r4 = (Child) q40.w0(r3);
        this.c = r4;
        this.d = r4.getArtistId();
        String r5 = r4.getAlbumArtist();
        if (r5 != null) goto L5;
    L9:
        r5 = r4.getArtist();
    L10:
        this.e = r5;
        return;
    L5:
        if (qm4.u0(r5) == false) goto L8;
        r5 = null;
    L8:
        if (r5 != null) goto L10;
        goto L9
    }
}
