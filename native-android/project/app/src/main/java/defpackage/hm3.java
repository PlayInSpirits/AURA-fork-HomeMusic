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

    public hm3(im3 r1, k03 r2, boolean r3, String r4, int r5) {
        this.e = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    @Override // defpackage.a83
    public final void b(Object r4) {
        List r5 = (List) r4;
        this.a.j(this);
        String r0 = this.c;
        im3 r1 = this.e;
        if (r5 == null) goto L5;
    L12:
        r1.f = null;
        if (r5 != null) goto L15;
        return;
    L15:
        if (r1.i <= this.d) goto L17;
        return;
    L17:
        if (r1.e(r0) == false) goto L22;
        r1.i = r1.h;
        r1.j.k(r5);
        return;
    L22:
        return;
    L5:
        if (this.b == false) goto L12;
        Playlist r2 = r1.e;
        if (r2 == null) goto L12;
        if (r2.getId().equals(r0) == false) goto L12;
        im3.c(r1, r0, false);
    }
}
