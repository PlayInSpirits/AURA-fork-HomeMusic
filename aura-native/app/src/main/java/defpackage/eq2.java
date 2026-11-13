package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class eq2 extends cx3 {
    public final /* synthetic */ jq2 A;
    public final View u;
    public final ImageView v;
    public final ProgressBar w;
    public final TextView x;
    public final float y;
    public wq2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq2(jq2 jq2Var, View view) {
        super(view);
        this.A = jq2Var;
        this.u = view;
        this.v = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.w = progressBar;
        this.x = (TextView) view.findViewById(R.id.mr_cast_group_name);
        lq2 lq2Var = jq2Var.z;
        this.y = fu.v(lq2Var.B);
        fu.M(lq2Var.B, progressBar);
    }
}
