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

    public gj3(PlayerControlView r1, String[] r2, float[] r3) {
        this.t = r1;
        this.q = r2;
        this.r = r3;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.length;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r5, final int r6) {
        kj3 r7 = (kj3) r5;
        View r0 = r7.v;
        View r1 = r7.a;
        String[] r2 = this.q;
        if (r6 >= r2.length) goto L6;
        r7.u.setText(r2[r6]);
    L6:
        if (r6 != this.s) goto L8;
        r1.setSelected(true);
        r0.setVisibility(0);
    L9:
        r1.setOnClickListener(new fj3(this, r6));
        return;
    L8:
        r1.setSelected(false);
        r0.setVisibility(4);
        goto L9
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r2, int r3) {
        return new kj3(LayoutInflater.from(this.t.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, r2, false));
    }
}
