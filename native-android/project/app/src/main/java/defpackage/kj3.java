package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kj3 extends cx3 {
    public final TextView u;
    public final View v;

    public kj3(View r3) {
        super(r3);
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        r3.setFocusable(true);
    L5:
        this.u = (TextView) r3.findViewById(R.id.exo_text);
        this.v = r3.findViewById(R.id.exo_check);
    }
}
