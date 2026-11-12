package defpackage;

import android.view.View;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ PlayerControllerFragment o;
    public final /* synthetic */ ik p;

    public /* synthetic */ tj3(PlayerControllerFragment playerControllerFragment, ik ikVar, int i) {
        this.n = i;
        this.o = playerControllerFragment;
        this.p = ikVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        ik ikVar = this.p;
        PlayerControllerFragment playerControllerFragment = this.o;
        switch (i) {
            case 0:
                playerControllerFragment.K0.F(ikVar, !"song".equals(ikVar.c));
                break;
            default:
                playerControllerFragment.K0.F(ikVar, true);
                break;
        }
    }
}
