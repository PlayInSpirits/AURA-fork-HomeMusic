package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fm3 implements a83 {
    public final /* synthetic */ k03 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ im3 d;

    public fm3(im3 r1, k03 r2, String r3, int r4) {
        this.d = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.a83
    public final void b(Object r5) {
        List r6 = (List) r5;
        this.a.j(this);
        im3 r0 = this.d;
        Playlist r1 = r0.e;
        k03 r2 = r0.j;
        if (r1 == null) goto L26;
        String r3 = r1.getId();
        String r4 = this.b;
        if (r4.equals(r3) == false) goto L29;
        boolean r7 = r4.equals(r0.f);
        int r8 = this.c;
        if (r7 == false) goto L10;
    L13:
        boolean r9 = true;
    L14:
        if (r6 != null) goto L20;
        if (r9 == false) goto L17;
        return;
    L17:
        if (r2.d() != null) goto L28;
        r0.g(r4);
        return;
    L28:
        return;
    L20:
        if (r9 == true) goto L22;
    L24:
        r0.i = r8;
        r2.k(r6);
        return;
    L22:
        if (r2.d() == null) goto L24;
        return;
    L10:
        if (r8 != r0.h) goto L13;
        r9 = false;
        goto L14
    L29:
        return;
    }
}
