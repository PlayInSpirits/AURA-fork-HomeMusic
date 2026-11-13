package defpackage;

import com.eddyizm.tempus.interfaces.DialogClickCallback;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qq0 implements DialogClickCallback {
    public final /* synthetic */ DirectoryFragment n;

    public qq0(DirectoryFragment directoryFragment) {
        this.n = directoryFragment;
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public final void onPositiveClick() {
        DirectoryFragment directoryFragment = this.n;
        rq0 rq0Var = directoryFragment.n0;
        String string = directoryFragment.s.getString("MUSIC_DIRECTORY_ID");
        rq0Var.c.getClass();
        om0.W(string).e(directoryFragment.v(), new d8(8, this));
    }
}
