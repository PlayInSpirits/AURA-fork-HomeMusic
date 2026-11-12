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
    public final /* synthetic */ int a;
    public final /* synthetic */ k03 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public np1(b r2, k03 r3, ArtistID3 r4) {
        this.a = 0;
        this.d = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.a83
    public final void b(Object r8) {
        switch(this.a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        List r2 = (List) r8;
        this.b.j(this);
        if (r2 != null) goto L7;
        mm3.g = null;
        return;
    L7:
        au0.l((Context) this.c, r2, ((Playlist) this.d).getId(), ((Playlist) this.d).getName(), true, new km3());
        return;
    L9:
        Object r9 = (List) r8;
        if (r9 != null) goto L13;
        r9 = new ArrayList();
    L13:
        this.b.k(r9);
        pa r10 = ((b) this.d).e;
        String r0 = ((ArtistID3) this.c).getName();
        r10.getClass();
        pa.z(10, r0).j(this);
    }

    public np1(k03 r2, Context r3, Playlist r4) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }
}
