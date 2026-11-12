package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.ArtistID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bj extends hd {
    public final pa c;
    public final d34 d;
    public final k03 e;
    public k03 f;
    public ArtistID3 g;

    public bj(Application r2) {
        super(r2);
        this.e = new k03(null);
        this.c = new pa(12);
        this.d = new d34(25);
    }

    public final ad2 c() {
        if (this.f != null) goto L6;
        String r0 = this.g.getId();
        pa r1 = this.c;
        r1.getClass();
        k03 r2 = new k03();
        r1.w(r0, new xj(r2, 0));
        this.f = r2;
    L6:
        return this.f;
    }
}
