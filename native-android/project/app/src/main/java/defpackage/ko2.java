package defpackage;

import androidx.media3.session.MediaLibraryService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements qk2, oi3 {
    public final MediaLibraryService n;
    public final kn2 o;
    public final /* synthetic */ lo2 p;

    public ko2(lo2 r1, MediaLibraryService r2, kn2 r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    @Override // defpackage.oi3
    public final void B(qi3 r4, ni3 r5) {
        w71 r6 = r5.a;
        if (r6.a(new int[]{4, 5, 14, 0}) == false) goto L6;
        this.n.k(this.o, false);
        return;
    }

    @Override // defpackage.qk2
    public final void c() {
        MediaLibraryService r0 = this.n;
        kn2 r2 = this.o;
        if (r0.f(r2) == false) goto L5;
        r0.l(r2);
    L5:
        r0.k(r2, false);
    }

    @Override // defpackage.qk2
    public final void l() {
        kn2 r0 = this.o;
        this.n.k(r0, false);
    }

    @Override // defpackage.qk2
    public final void u() {
        kn2 r0 = this.o;
        this.n.k(r0, false);
    }

    @Override // defpackage.qk2
    public final mw1 y(va4 r2) {
        if (r2.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY") == false) goto L8;
        kn2 r3 = this.o;
        jo2 r1 = (jo2) this.p.t.get(r3);
        if (r1 == null) goto L7;
        r1.b = true;
    L7:
        int r4 = 0;
    L10:
        return new mw1(new ab4(r4));
    L8:
        r4 = -6;
        goto L10
    }
}
