package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij3 extends cx3 {
    public final TextView u;
    public final TextView v;
    public final ImageView w;
    public final /* synthetic */ PlayerControlView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(PlayerControlView playerControlView, View view) {
        super(view);
        this.x = playerControlView;
        int i = 1;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_main_text);
        this.v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new bj3(i, this));
    }
}
