package defpackage;

import com.eddyizm.tempus.interfaces.DialogClickCallback;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 implements DialogClickCallback {
    public final /* synthetic */ DirectoryFragment n;

    public qq0(DirectoryFragment r1) {
        this.n = r1;
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public final void onPositiveClick() {
        DirectoryFragment r0 = this.n;
        rq0 r1 = r0.n0;
        String r2 = r0.s.getString("MUSIC_DIRECTORY_ID");
        r1.c.getClass();
        om0.W(r2).e(r0.v(), new d8(8, this));
    }
}
