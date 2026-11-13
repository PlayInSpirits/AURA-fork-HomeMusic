package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bo4 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public bo4(View view) {
        this.a = (TextView) view.findViewById(R.id.text1);
        this.b = (TextView) view.findViewById(R.id.text2);
        this.c = (ImageView) view.findViewById(R.id.icon1);
        this.d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(app.homemusic.R.id.edit_query);
    }
}
