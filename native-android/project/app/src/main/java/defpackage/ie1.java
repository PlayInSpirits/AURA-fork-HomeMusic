package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 {
    public final LinearLayout a;
    public final TextView b;

    public ie1(LinearLayout linearLayout, TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    public ie1(AppBarLayout appBarLayout, TextView textView, LinearLayout linearLayout) {
        this.b = textView;
        this.a = linearLayout;
    }
}
