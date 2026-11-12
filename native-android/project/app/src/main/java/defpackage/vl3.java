package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vl3 extends e22 {
    public final /* synthetic */ PlaylistEditorFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl3(PlaylistEditorFragment playlistEditorFragment) {
        super(0);
        this.f = playlistEditorFragment;
    }

    @Override // defpackage.e22
    public final boolean h(RecyclerView recyclerView, cx3 cx3Var, cx3 cx3Var2) {
        PlaylistEditorFragment playlistEditorFragment = this.f;
        if (playlistEditorFragment.m0.i) {
            return false;
        }
        int iC = cx3Var.c();
        int iC2 = cx3Var2.c();
        List list = playlistEditorFragment.n0.r;
        list.add(iC2, (Child) list.remove(iC));
        playlistEditorFragment.n0.n.c(iC, iC2);
        return true;
    }

    @Override // defpackage.e22
    public final void i(cx3 cx3Var) {
    }
}
