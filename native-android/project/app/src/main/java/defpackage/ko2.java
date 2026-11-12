package defpackage;

import androidx.media3.session.MediaLibraryService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements qk2, oi3 {
    public final MediaLibraryService n;
    public final kn2 o;
    public final /* synthetic */ lo2 p;

    public ko2(lo2 lo2Var, MediaLibraryService mediaLibraryService, kn2 kn2Var) {
        this.p = lo2Var;
        this.n = mediaLibraryService;
        this.o = kn2Var;
    }

    @Override // defpackage.oi3
    public final void B(qi3 qi3Var, ni3 ni3Var) {
        if (ni3Var.a.a(4, 5, 14, 0)) {
            this.n.k(this.o, false);
        }
    }

    @Override // defpackage.qk2
    public final void c() {
        MediaLibraryService mediaLibraryService = this.n;
        kn2 kn2Var = this.o;
        if (mediaLibraryService.f(kn2Var)) {
            mediaLibraryService.l(kn2Var);
        }
        mediaLibraryService.k(kn2Var, false);
    }

    @Override // defpackage.qk2
    public final void l() {
        this.n.k(this.o, false);
    }

    @Override // defpackage.qk2
    public final void u() {
        this.n.k(this.o, false);
    }

    @Override // defpackage.qk2
    public final mw1 y(va4 va4Var) {
        int i;
        if (va4Var.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            jo2 jo2Var = (jo2) this.p.t.get(this.o);
            if (jo2Var != null) {
                jo2Var.b = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return new mw1(new ab4(i));
    }
}
