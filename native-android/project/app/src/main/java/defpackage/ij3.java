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

    public ij3(PlayerControlView r3, View r4) {
        this.x = r3;
        super(r4);
        int r1 = 1;
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        r4.setFocusable(true);
    L5:
        this.u = (TextView) r4.findViewById(R.id.exo_main_text);
        this.v = (TextView) r4.findViewById(R.id.exo_sub_text);
        this.w = (ImageView) r4.findViewById(R.id.exo_icon);
        r4.setOnClickListener(new bj3(r1, this));
    }
}
