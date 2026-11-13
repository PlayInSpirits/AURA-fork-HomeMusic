package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yp2 extends cx3 {
    public final View u;
    public final ImageView v;
    public final ProgressBar w;
    public final TextView x;
    public final /* synthetic */ zp2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp2(zp2 zp2Var, View view) {
        super(view);
        this.y = zp2Var;
        this.u = view;
        this.v = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.w = progressBar;
        this.x = (TextView) view.findViewById(R.id.mr_picker_route_name);
        fu.M(zp2Var.w.v, progressBar);
    }
}
