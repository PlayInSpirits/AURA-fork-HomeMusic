package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x12 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;

    public x12(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.d = frameLayout;
        this.b = imageView;
        this.c = textView;
        this.e = textView2;
    }

    public x12(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.d = frameLayout;
        this.c = textView;
        this.e = textView2;
    }

    public x12(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, FrameLayout frameLayout, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = frameLayout;
        this.e = textView2;
    }

    public x12(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, FrameLayout frameLayout, TextView textView2) {
        this.a = constraintLayout;
        this.c = textView;
        this.b = imageView;
        this.d = frameLayout;
        this.e = textView2;
    }
}
