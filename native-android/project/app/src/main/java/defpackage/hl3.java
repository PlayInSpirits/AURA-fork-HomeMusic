package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ml3 o;
    public final /* synthetic */ Playlist p;

    public /* synthetic */ hl3(ml3 r1, Playlist r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        int r0 = this.n;
        Playlist r2 = this.p;
        ml3 r3 = this.o;
        x34 r5 = (x34) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((h61) r3.f).y(r5, r2);
        return null;
    L6:
        ((ll3) r3.e).I(r5, r2);
        return null;
    }
}
