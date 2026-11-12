package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wl3 extends hd {
    public final mm3 c;
    public final hh3 d;
    public ArrayList e;
    public Playlist f;
    public k03 g;
    public final k03 h;
    public boolean i;
    public Integer j;
    public d8 k;

    public wl3(Application r2) {
        super(r2);
        this.g = new k03();
        this.h = new k03();
        this.c = new mm3();
        this.d = new hh3(27);
    }

    @Override // defpackage.x65
    public final void b() {
        d8 r0 = this.k;
        if (r0 != null) goto L5;
        return;
    L5:
        this.g.j(r0);
        this.k = null;
    }

    public final void c(Playlist r4) {
        this.f = r4;
        d8 r0 = this.k;
        if (r0 == null) goto L6;
        this.g.j(r0);
        this.k = null;
    L6:
        this.j = null;
        if (r4 == null) goto L10;
        String r5 = this.f.getId();
        k03 r6 = this.c.c(r5, false, null);
        this.g = r6;
        d8 r1 = new d8(20, this);
        this.k = r1;
        r6.f(r1);
        return;
    L10:
        this.g = new k03();
    }
}
