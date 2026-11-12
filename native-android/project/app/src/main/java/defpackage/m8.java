package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m8 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ AlbumID3 o;
    public final /* synthetic */ n8 p;

    public /* synthetic */ m8(n8 r1, AlbumID3 r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int r0 = this.n;
        AlbumID3 r1 = this.o;
        n8 r3 = this.p;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.e.J(null, r1.getId(), true, null);
        return;
    L6:
        r3.e.J(null, r1.getId(), false, null);
    }
}
