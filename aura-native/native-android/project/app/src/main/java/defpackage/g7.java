package defpackage;

import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k03 b;

    public /* synthetic */ g7(k03 k03Var, int i) {
        this.a = i;
        this.b = k03Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        Object obj2;
        int i = this.a;
        k03 k03Var = this.b;
        switch (i) {
            case 0:
                obj2 = (List) obj;
                break;
            case 1:
                obj2 = (AlbumID3) obj;
                break;
            default:
                obj2 = (ArtistID3) obj;
                break;
        }
        k03Var.i(obj2);
    }
}
