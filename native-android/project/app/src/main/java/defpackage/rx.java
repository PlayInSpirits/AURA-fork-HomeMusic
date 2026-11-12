package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx implements r02 {
    public final /* synthetic */ cx a;

    public /* synthetic */ rx(cx r1) {
        this.a = r1;
    }

    @Override // defpackage.r02
    public final k14 a(ev3 r4) {
        oz3 r0 = r4.e;
        if (cx.h() == true) goto L6;
        nz3 r1 = r0.a();
        r1.a("Cache-Control", "public, only-if-cached, max-stale=" + this.a.a);
        r1.c.e("Pragma");
        r0 = new oz3(r1);
    L6:
        return r4.b(r0);
    }
}
