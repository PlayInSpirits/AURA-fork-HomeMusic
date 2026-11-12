package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.Playlist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class im3 extends hd {
    public final mm3 c;
    public final d8 d;
    public Playlist e;
    public String f;
    public String g;
    public int h;
    public int i;
    public final k03 j;
    public final k03 k;

    public im3(Application r2) {
        super(r2);
        this.j = new k03();
        this.k = new k03();
        this.c = new mm3();
        d8 r3 = new d8(21, this);
        this.d = r3;
        mm3.e.f(r3);
    }

    public static void c(im3 r9, String r10, boolean r11) {
        k03 r5 = r9.c.c(r10, false, new em3(r9, r10, 1));
        r5.f(new hm3(r9, r5, r11, r10, r9.h));
    }

    @Override // defpackage.x65
    public final void b() {
        this.c.getClass();
        mm3.e.j(this.d);
    }

    public final ad2 d() {
        k03 r0 = this.j;
        if (r0.d() == null) goto L5;
    L7:
        return r0;
    L5:
        if (this.e == null) goto L7;
        h();
        goto L7
    }

    public final boolean e(String r2) {
        Playlist r0 = this.e;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.getId().equals(r2) == false) goto L11;
        this.h++;
        return true;
    L11:
        return false;
    }

    public final ad2 f() {
        Playlist r0 = this.e;
        if (r0 == null) goto L5;
        String r1 = r0.getId();
        mm3 r5 = this.c;
        r5.getClass();
        String r2 = ud3.D();
        if (r2 != null) goto L11;
        return new k03(Boolean.FALSE);
    L11:
        return ((s24) r5.d.a).i().a(new String[]{"synced_playlist"}, new ps0(2, r1, r2));
    L5:
        return new k03(Boolean.FALSE);
    }

    public final void g(String r2) {
        Playlist r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId().equals(r2) == true) goto L7;
        return;
    L7:
        if (r2.equals(this.g) == true) goto L12;
        this.g = r2;
        this.k.k(Boolean.TRUE);
        return;
    }

    public final void h() {
        Playlist r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        int r1 = this.h + 1;
        this.h = r1;
        String r2 = r0.getId();
        em3 r3 = new em3(this, r2, 0);
        k03 r4 = this.c.c(r2, true, r3);
        r4.f(new fm3(this, r4, r2, r1));
    }
}
