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

    public im3(Application application) {
        super(application);
        this.j = new k03();
        this.k = new k03();
        this.c = new mm3();
        d8 d8Var = new d8(21, this);
        this.d = d8Var;
        mm3.e.f(d8Var);
    }

    public static void c(im3 im3Var, String str, boolean z) {
        k03 k03VarC = im3Var.c.c(str, false, new em3(im3Var, str, 1));
        k03VarC.f(new hm3(im3Var, k03VarC, z, str, im3Var.h));
    }

    @Override // defpackage.x65
    public final void b() {
        this.c.getClass();
        mm3.e.j(this.d);
    }

    public final ad2 d() {
        k03 k03Var = this.j;
        if (k03Var.d() == null && this.e != null) {
            h();
        }
        return k03Var;
    }

    public final boolean e(String str) {
        Playlist playlist = this.e;
        if (playlist == null || !playlist.getId().equals(str)) {
            return false;
        }
        this.h++;
        return true;
    }

    public final ad2 f() {
        Playlist playlist = this.e;
        if (playlist == null) {
            return new k03(Boolean.FALSE);
        }
        String id = playlist.getId();
        mm3 mm3Var = this.c;
        mm3Var.getClass();
        String strD = ud3.D();
        return strD == null ? new k03(Boolean.FALSE) : ((s24) mm3Var.d.a).i().a(new String[]{"synced_playlist"}, new ps0(2, id, strD));
    }

    public final void g(String str) {
        Playlist playlist = this.e;
        if (playlist == null || !playlist.getId().equals(str) || str.equals(this.g)) {
            return;
        }
        this.g = str;
        this.k.k(Boolean.TRUE);
    }

    public final void h() {
        Playlist playlist = this.e;
        if (playlist == null) {
            return;
        }
        int i = this.h + 1;
        this.h = i;
        String id = playlist.getId();
        k03 k03VarC = this.c.c(id, true, new em3(this, id, 0));
        k03VarC.f(new fm3(this, k03VarC, id, i));
    }
}
