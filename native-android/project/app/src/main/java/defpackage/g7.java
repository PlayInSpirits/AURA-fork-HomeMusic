package defpackage;

import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k03 b;

    public /* synthetic */ g7(k03 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r2) {
        int r0 = this.a;
        k03 r1 = this.b;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        Object r3 = (ArtistID3) r2;
    L5:
        r1.i(r3);
        return;
    L7:
        r3 = (AlbumID3) r2;
        goto L5
    L8:
        r3 = (List) r2;
        goto L5
    }
}
