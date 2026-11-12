package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vl3 extends e22 {
    public final /* synthetic */ PlaylistEditorFragment f;

    public vl3(PlaylistEditorFragment r1) {
        this.f = r1;
        super(0);
    }

    @Override // defpackage.e22
    public final boolean h(RecyclerView r2, cx3 r3, cx3 r4) {
        PlaylistEditorFragment r1 = this.f;
        if (r1.m0.i == false) goto L6;
        return false;
    L6:
        int r5 = r3.c();
        int r6 = r4.c();
        List r7 = r1.n0.r;
        r7.add(r6, (Child) r7.remove(r5));
        r1.n0.n.c(r5, r6);
        return true;
    }

    @Override // defpackage.e22
    public final void i(cx3 r1) {
    }
}
