package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cj3 extends dw3 {
    public List q = new ArrayList();
    public final /* synthetic */ PlayerControlView r;
    public final /* synthetic */ int s;
    public final /* synthetic */ PlayerControlView t;

    public cj3(PlayerControlView playerControlView, int i) {
        this.s = i;
        this.t = playerControlView;
        this.r = playerControlView;
    }

    private final void t(String str) {
    }

    @Override // defpackage.dw3
    public final int a() {
        if (this.q.isEmpty()) {
            return 0;
        }
        return this.q.size() + 1;
    }

    @Override // defpackage.dw3
    public /* bridge */ /* synthetic */ void g(cx3 cx3Var, int i) {
        switch (this.s) {
            case 1:
                r((kj3) cx3Var, i);
                break;
            default:
                r((kj3) cx3Var, i);
                break;
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        return new kj3(LayoutInflater.from(this.r.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean p(cw4 cw4Var) {
        for (int i = 0; i < this.q.size(); i++) {
            if (cw4Var.H.containsKey(((lj3) this.q.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void q(List list) {
        PlayerControlView playerControlView = this.t;
        ImageView imageView = playerControlView.Q;
        boolean z = false;
        for (int i = 0; i < ((gy3) list).q; i++) {
            lj3 lj3Var = (lj3) ((gy3) list).get(i);
            if (lj3Var.a.e[lj3Var.b]) {
                z = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? playerControlView.v0 : playerControlView.w0);
            imageView.setContentDescription(z ? playerControlView.x0 : playerControlView.y0);
        }
        this.q = list;
    }

    public void r(kj3 kj3Var, int i) {
        switch (this.s) {
            case 1:
                s(kj3Var, i);
                if (i > 0) {
                    lj3 lj3Var = (lj3) this.q.get(i - 1);
                    kj3Var.v.setVisibility(lj3Var.a.e[lj3Var.b] ? 0 : 4);
                }
                break;
            default:
                s(kj3Var, i);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public final void s(kj3 kj3Var, int i) {
        qi3 qi3Var = this.r.D0;
        if (qi3Var == null) {
        }
        int i2 = 0;
        boolean z = true;
        if (i != 0) {
            lj3 lj3Var = (lj3) this.q.get(i - 1);
            sv4 sv4Var = lj3Var.a.b;
            if (qi3Var.E0().H.get(sv4Var) != null) {
                z = lj3Var.a.e[lj3Var.b];
            }
            kj3Var.u.setText(lj3Var.c);
            kj3Var.v.setVisibility(z ? 0 : 4);
            kj3Var.a.setOnClickListener(new a7(this, qi3Var, sv4Var, lj3Var, 1));
            return;
        }
        switch (this.s) {
            case 0:
                kj3Var.u.setText(R.string.exo_track_selection_auto);
                qi3 qi3Var2 = this.t.D0;
                qi3Var2.getClass();
                kj3Var.v.setVisibility(p(qi3Var2.E0()) ? 4 : 0);
                kj3Var.a.setOnClickListener(new bj3(i2, this));
                break;
            default:
                kj3Var.u.setText(R.string.exo_track_selection_none);
                for (int i3 = 0; i3 < this.q.size(); i3++) {
                    lj3 lj3Var2 = (lj3) this.q.get(i3);
                    if (lj3Var2.a.e[lj3Var2.b]) {
                        z = false;
                        kj3Var.v.setVisibility(z ? 0 : 4);
                        kj3Var.a.setOnClickListener(new bj3(2, this));
                    }
                    break;
                }
                kj3Var.v.setVisibility(z ? 0 : 4);
                kj3Var.a.setOnClickListener(new bj3(2, this));
                break;
        }
    }
}
