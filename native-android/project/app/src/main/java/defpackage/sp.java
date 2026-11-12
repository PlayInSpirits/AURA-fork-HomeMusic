package defpackage;

import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ MediaService o;

    public /* synthetic */ sp(MediaService mediaService, int i) {
        this.n = i;
        this.o = mediaService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        MediaService mediaService = this.o;
        switch (i) {
            case 0:
                mediaService.n();
                break;
            default:
                rs3 rs3Var = rs3.a;
                qi3 qi3VarA = mediaService.p().a();
                qi3VarA.getClass();
                rs3Var.c(mediaService, qi3VarA);
                break;
        }
    }
}
