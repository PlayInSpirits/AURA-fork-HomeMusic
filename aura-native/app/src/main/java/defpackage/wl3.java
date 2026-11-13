package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public wl3(Application application) {
        super(application);
        this.g = new k03();
        this.h = new k03();
        this.c = new mm3();
        this.d = new hh3(27);
    }

    @Override // defpackage.x65
    public final void b() {
        d8 d8Var = this.k;
        if (d8Var == null) {
            return;
        }
        this.g.j(d8Var);
        this.k = null;
    }

    public final void c(Playlist playlist) {
        this.f = playlist;
        d8 d8Var = this.k;
        if (d8Var != null) {
            this.g.j(d8Var);
            this.k = null;
        }
        this.j = null;
        if (playlist == null) {
            this.g = new k03();
            return;
        }
        k03 c = this.c.c(this.f.getId(), false, null);
        this.g = c;
        d8 d8Var2 = new d8(20, this);
        this.k = d8Var2;
        c.f(d8Var2);
    }
}
