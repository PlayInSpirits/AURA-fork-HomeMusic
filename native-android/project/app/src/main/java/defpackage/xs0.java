package defpackage;

import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends v83 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DownloadFragment e;

    public xs0(DownloadFragment r1, int r2) {
        this.e = r1;
        this.d = r2;
        super(true);
    }

    @Override // defpackage.v83
    public final void a() {
        int r0 = this.d;
        DownloadFragment r2 = this.e;
        if (r0 <= 1) goto L5;
        k03 r1 = r2.o0.e;
        ArrayList r3 = (ArrayList) r1.d();
        r3.remove(r3.size() - 1);
        r1.k(r3);
    L6:
        b();
        return;
    L5:
        r2.m0.T.o();
        goto L6
    }
}
