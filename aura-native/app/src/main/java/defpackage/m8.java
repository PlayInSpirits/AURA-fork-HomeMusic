package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m8 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ AlbumID3 o;
    public final /* synthetic */ n8 p;

    public /* synthetic */ m8(n8 n8Var, AlbumID3 albumID3, int i) {
        this.n = i;
        this.p = n8Var;
        this.o = albumID3;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int i = this.n;
        AlbumID3 albumID3 = this.o;
        n8 n8Var = this.p;
        switch (i) {
            case 0:
                n8Var.e.J(null, albumID3.getId(), false, null);
                break;
            default:
                n8Var.e.J(null, albumID3.getId(), true, null);
                break;
        }
    }
}
