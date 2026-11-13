package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class hl3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ml3 o;
    public final /* synthetic */ Playlist p;

    public /* synthetic */ hl3(ml3 ml3Var, Playlist playlist, int i) {
        this.n = i;
        this.o = ml3Var;
        this.p = playlist;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        Playlist playlist = this.p;
        ml3 ml3Var = this.o;
        x34 x34Var = (x34) obj;
        switch (i) {
            case 0:
                ((ll3) ml3Var.e).I(x34Var, playlist);
                break;
            default:
                ((h61) ml3Var.f).y(x34Var, playlist);
                break;
        }
        return null;
    }
}
