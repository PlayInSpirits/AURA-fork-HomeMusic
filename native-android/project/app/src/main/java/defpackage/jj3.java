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

    public jj3(PlayerControlView r1, String[] r2, Drawable[] r3) {
        this.t = r1;
        this.q = r2;
        this.r = new String[r2.length];
        this.s = r3;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.length;
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r5, int r6) {
        ij3 r7 = (ij3) r5;
        boolean r0 = p(r6);
        View r1 = r7.a;
        if (r0 == false) goto L5;
        r1.setLayoutParams(new nw3(-1, -2));
    L6:
        r7.u.setText(this.q[r6]);
        String r2 = this.r[r6];
        TextView r3 = r7.v;
        if (r2 != null) goto L9;
        r3.setVisibility(8);
    L10:
        Drawable r4 = this.s[r6];
        ImageView r8 = r7.w;
        if (r4 != null) goto L14;
        r8.setVisibility(8);
        return;
    L14:
        r8.setImageDrawable(r4);
        return;
    L9:
        r3.setText(r2);
        goto L10
    L5:
        r1.setLayoutParams(new nw3(0, 0));
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r3, int r4) {
        PlayerControlView r2 = this.t;
        return new ij3(r2, LayoutInflater.from(r2.getContext()).inflate(R.layout.exo_styled_settings_list_item, r3, false));
    }

    public final boolean p(int r3) {
        PlayerControlView r2 = this.t;
        qi3 r0 = r2.D0;
        if (r0 == null) goto L19;
        if (r3 == 0) goto L17;
        if (r3 == 1) goto L10;
    L13:
        return true;
    L10:
        if (r0.S0(30) == true) goto L12;
        return false;
    L12:
        if (r2.D0.S0(29) == true) goto L13;
        return false;
    L17:
        return r0.S0(13);
    L19:
        return false;
    }
}
