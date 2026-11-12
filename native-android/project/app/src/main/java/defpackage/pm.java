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

    public /* synthetic */ pm(Object obj, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                xc5 xc5Var = (xc5) this.p;
                boolean z = this.o;
                qm qmVar = (qm) xc5Var.p;
                String str = f35.a;
                qmVar.d(z);
                break;
            case 1:
                MediaService mediaService = (MediaService) this.p;
                boolean z2 = this.o;
                if (!mediaService.D) {
                    if (z2) {
                        qi3 qi3VarA = mediaService.p().a();
                        qi3VarA.getClass();
                        mediaService.v(qi3VarA);
                    }
                    rs3 rs3Var = rs3.a;
                    qi3 qi3VarA2 = mediaService.p().a();
                    qi3VarA2.getClass();
                    rs3Var.c(mediaService, qi3VarA2);
                    break;
                }
                break;
            default:
                HubUpdater.check$lambda$0((Activity) this.p, this.o);
                break;
        }
    }
}
