package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fm3 implements a83 {
    public final /* synthetic */ k03 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ im3 d;

    public fm3(im3 im3Var, k03 k03Var, String str, int i) {
        this.d = im3Var;
        this.a = k03Var;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        List list = (List) obj;
        this.a.j(this);
        im3 im3Var = this.d;
        Playlist playlist = im3Var.e;
        k03 k03Var = im3Var.j;
        if (playlist != null) {
            String id = playlist.getId();
            String str = this.b;
            if (str.equals(id)) {
                boolean equals = str.equals(im3Var.f);
                int i = this.c;
                boolean z = equals || i != im3Var.h;
                if (list == null) {
                    if (z || k03Var.d() != null) {
                        return;
                    }
                    im3Var.g(str);
                    return;
                }
                if (!z || k03Var.d() == null) {
                    im3Var.i = i;
                    k03Var.k(list);
                }
            }
        }
    }
}
