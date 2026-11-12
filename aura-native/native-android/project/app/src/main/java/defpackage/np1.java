package defpackage;

import android.content.Context;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.viewmodel.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np1 implements a83 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k03 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public np1(b bVar, k03 k03Var, ArtistID3 artistID3) {
        this.d = bVar;
        this.b = k03Var;
        this.c = artistID3;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                Object arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                this.b.k(arrayList);
                pa paVar = ((b) this.d).e;
                String name = ((ArtistID3) this.c).getName();
                paVar.getClass();
                pa.z(10, name).j(this);
                break;
            default:
                List list = (List) obj;
                this.b.j(this);
                if (list != null) {
                    au0.l((Context) this.c, list, ((Playlist) this.d).getId(), ((Playlist) this.d).getName(), true, new km3());
                } else {
                    mm3.g = null;
                }
                break;
        }
    }

    public np1(k03 k03Var, Context context, Playlist playlist) {
        this.b = k03Var;
        this.c = context;
        this.d = playlist;
    }
}
