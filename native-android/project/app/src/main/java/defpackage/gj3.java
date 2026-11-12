package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gj3 extends dw3 {
    public final String[] q;
    public final float[] r;
    public int s;
    public final /* synthetic */ PlayerControlView t;

    public gj3(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.t = playerControlView;
        this.q = strArr;
        this.r = fArr;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.length;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, final int i) {
        kj3 kj3Var = (kj3) cx3Var;
        View view = kj3Var.v;
        View view2 = kj3Var.a;
        String[] strArr = this.q;
        if (i < strArr.length) {
            kj3Var.u.setText(strArr[i]);
        }
        if (i == this.s) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: fj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                gj3 gj3Var = this.n;
                PlayerControlView playerControlView = gj3Var.t;
                int i2 = gj3Var.s;
                int i3 = i;
                if (i3 != i2) {
                    playerControlView.setPlaybackSpeed(gj3Var.r[i3]);
                }
                playerControlView.E.dismiss();
            }
        });
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        return new kj3(LayoutInflater.from(this.t.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
