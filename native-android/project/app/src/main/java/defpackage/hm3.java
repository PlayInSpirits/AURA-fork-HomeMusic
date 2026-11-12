package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hm3 implements a83 {
    public final /* synthetic */ k03 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ im3 e;

    public hm3(im3 im3Var, k03 k03Var, boolean z, String str, int i) {
        this.e = im3Var;
        this.a = k03Var;
        this.b = z;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        Playlist playlist;
        List list = (List) obj;
        this.a.j(this);
        String str = this.c;
        im3 im3Var = this.e;
        if (list == null && this.b && (playlist = im3Var.e) != null && playlist.getId().equals(str)) {
            im3.c(im3Var, str, false);
            return;
        }
        im3Var.f = null;
        if (list == null || im3Var.i > this.d || !im3Var.e(str)) {
            return;
        }
        im3Var.i = im3Var.h;
        im3Var.j.k(list);
    }
}
