package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mo1 extends cx3 {
    public final ImageView u;
    public final TextView v;
    public final TextView w;
    public final /* synthetic */ q7 x;

    public mo1(q7 r1, ConstraintLayout r2, ImageView r3, TextView r4, TextView r5) {
        r2.getClass();
        this.x = r1;
        super(r2);
        this.u = r3;
        this.v = r4;
        this.w = r5;
        r4.setSelected(true);
        r2.setOnClickListener(new j8(10, r1, this));
        r2.setOnLongClickListener(new i8(2, r1, this));
    }
}
