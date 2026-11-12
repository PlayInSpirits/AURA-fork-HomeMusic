package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jj3 extends dw3 {
    public final String[] q;
    public final String[] r;
    public final Drawable[] s;
    public final /* synthetic */ PlayerControlView t;

    public jj3(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.t = playerControlView;
        this.q = strArr;
        this.r = new String[strArr.length];
        this.s = drawableArr;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.length;
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        ij3 ij3Var = (ij3) cx3Var;
        boolean zP = p(i);
        View view = ij3Var.a;
        if (zP) {
            view.setLayoutParams(new nw3(-1, -2));
        } else {
            view.setLayoutParams(new nw3(0, 0));
        }
        ij3Var.u.setText(this.q[i]);
        String str = this.r[i];
        TextView textView = ij3Var.v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.s[i];
        ImageView imageView = ij3Var.w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        PlayerControlView playerControlView = this.t;
        return new ij3(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean p(int i) {
        PlayerControlView playerControlView = this.t;
        qi3 qi3Var = playerControlView.D0;
        if (qi3Var == null) {
            return false;
        }
        if (i != 0) {
            return i != 1 || (qi3Var.S0(30) && playerControlView.D0.S0(29));
        }
        return qi3Var.S0(13);
    }
}
