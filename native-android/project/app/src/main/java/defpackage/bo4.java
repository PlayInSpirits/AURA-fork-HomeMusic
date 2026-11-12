package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bo4 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public bo4(View r2) {
        this.a = (TextView) r2.findViewById(R.id.text1);
        this.b = (TextView) r2.findViewById(R.id.text2);
        this.c = (ImageView) r2.findViewById(R.id.icon1);
        this.d = (ImageView) r2.findViewById(R.id.icon2);
        this.e = (ImageView) r2.findViewById(app.homemusic.R.id.edit_query);
    }
}
