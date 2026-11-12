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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo1(q7 q7Var, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        super(constraintLayout);
        constraintLayout.getClass();
        this.x = q7Var;
        this.u = imageView;
        this.v = textView;
        this.w = textView2;
        textView.setSelected(true);
        constraintLayout.setOnClickListener(new j8(10, q7Var, this));
        constraintLayout.setOnLongClickListener(new i8(2, q7Var, this));
    }
}
