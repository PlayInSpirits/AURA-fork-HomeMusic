package defpackage;

import android.app.Activity;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;

    public /* synthetic */ pm(Object r1, boolean r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        HubUpdater.j((Activity) this.p, this.o);
        return;
    L6:
        MediaService r0 = (MediaService) this.p;
        boolean r2 = this.o;
        if (r0.D == true) goto L15;
        if (r2 == false) goto L11;
        qi3 r3 = r0.p().a();
        r3.getClass();
        r0.v(r3);
    L11:
        rs3 r4 = rs3.a;
        qi3 r1 = r0.p().a();
        r1.getClass();
        r4.c(r0, r1);
        return;
    L15:
        return;
    L13:
        xc5 r5 = (xc5) this.p;
        boolean r6 = this.o;
        qm r7 = (qm) r5.p;
        String r8 = f35.a;
        r7.d(r6);
    }
}
