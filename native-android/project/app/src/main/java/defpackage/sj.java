package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sj implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArtistPageFragment b;

    public /* synthetic */ sj(ArtistPageFragment r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r7) {
        int r0 = this.a;
        ArtistPageFragment r5 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        List r8 = (List) r7;
        if (r8 != null) goto L7;
        return;
    L7:
        if (r8.isEmpty() == true) goto L17;
        bo2.q(r5.t0, r8, 0, "artist");
        ((au) r5.m0.V.n).d(true);
        wj r9 = r5.n0;
        pa r1 = r9.c;
        ArtistID3 r10 = r9.e;
        r1.getClass();
        new xi4(2).o(r10.getId(), fb0.n, 30).j(this);
        return;
    L17:
        return;
    L10:
        List r11 = (List) r7;
        if (r11 != null) goto L13;
        return;
    L13:
        if (r11.isEmpty() == true) goto L19;
        bo2.q(r5.t0, r11, 0, "artist");
        ((au) r5.m0.V.n).d(true);
        wj r12 = r5.n0;
        pa r2 = r12.c;
        ArtistID3 r13 = r12.e;
        r2.getClass();
        k03 r3 = new k03();
        App.f(false).c().i(r13.getId()).enqueue(new r20(r2, r13, r3, 2));
        r3.j(this);
        return;
    }
}
