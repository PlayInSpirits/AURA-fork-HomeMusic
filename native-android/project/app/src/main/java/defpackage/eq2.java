package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eq2 extends cx3 {
    public final /* synthetic */ jq2 A;
    public final View u;
    public final ImageView v;
    public final ProgressBar w;
    public final TextView x;
    public final float y;
    public wq2 z;

    public eq2(jq2 r3, View r4) {
        this.A = r3;
        super(r4);
        this.u = r4;
        this.v = (ImageView) r4.findViewById(R.id.mr_cast_group_icon);
        ProgressBar r0 = (ProgressBar) r4.findViewById(R.id.mr_cast_group_progress_bar);
        this.w = r0;
        this.x = (TextView) r4.findViewById(R.id.mr_cast_group_name);
        lq2 r5 = r3.z;
        this.y = fu.v(r5.B);
        fu.M(r5.B, r0);
    }
}
