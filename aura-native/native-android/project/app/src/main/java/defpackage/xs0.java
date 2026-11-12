package defpackage;

import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends v83 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DownloadFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(DownloadFragment downloadFragment, int i) {
        super(true);
        this.e = downloadFragment;
        this.d = i;
    }

    @Override // defpackage.v83
    public final void a() throws Exception {
        int i = this.d;
        DownloadFragment downloadFragment = this.e;
        if (i > 1) {
            k03 k03Var = downloadFragment.o0.e;
            ArrayList arrayList = (ArrayList) k03Var.d();
            arrayList.remove(arrayList.size() - 1);
            k03Var.k(arrayList);
        } else {
            downloadFragment.m0.T.o();
        }
        b();
    }
}
