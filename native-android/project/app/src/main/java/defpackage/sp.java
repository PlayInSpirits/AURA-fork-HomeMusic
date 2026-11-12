package defpackage;

import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ MediaService o;

    public /* synthetic */ sp(MediaService r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        MediaService r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        rs3 r1 = rs3.a;
        qi3 r3 = r2.p().a();
        r3.getClass();
        r1.c(r2, r3);
        return;
    L6:
        r2.n();
    }
}
