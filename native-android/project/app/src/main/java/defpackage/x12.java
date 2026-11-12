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

    public x12(ConstraintLayout r1, FrameLayout r2, ImageView r3, TextView r4, TextView r5) {
        this.a = r1;
        this.d = r2;
        this.b = r3;
        this.c = r4;
        this.e = r5;
    }

    public x12(ConstraintLayout r1, ImageView r2, FrameLayout r3, TextView r4, TextView r5) {
        this.a = r1;
        this.b = r2;
        this.d = r3;
        this.c = r4;
        this.e = r5;
    }

    public x12(ConstraintLayout r1, ImageView r2, TextView r3, FrameLayout r4, TextView r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public x12(ConstraintLayout r1, TextView r2, ImageView r3, FrameLayout r4, TextView r5) {
        this.a = r1;
        this.c = r2;
        this.b = r3;
        this.d = r4;
        this.e = r5;
    }
}
