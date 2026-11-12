package defpackage;

import androidx.media3.session.MediaLibraryService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;

    public /* synthetic */ sr2(tn2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        tn2 r2 = this.o;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r2.C();
        return;
    L6:
        tn2.a(r2);
        return;
    L8:
        rm2 r1 = r2.v;
        if (r1 == null) goto L16;
        kn2 r3 = r2.k;
        ((MediaLibraryService) r1.o).k(r3, false);
        return;
    L16:
        return;
    L12:
        xr2 r4 = r2.u;
        if (r4 == null) goto L17;
        r2.s.r0(r4);
        return;
    }
}
