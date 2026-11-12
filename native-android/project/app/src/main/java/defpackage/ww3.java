package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ww3 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView r7) {
        int r0 = this.d;
        if (r0 < 0) goto L7;
        this.d = -1;
        r7.S(r0);
        this.f = false;
        return;
    L7:
        if (this.f == false) goto L24;
        Interpolator r1 = this.e;
        if (r1 != null) goto L11;
    L15:
        int r3 = this.c;
        if (r3 < 1) goto L22;
        r7.r0.c(this.a, this.b, r3, r1);
        int r8 = this.g + 1;
        this.g = r8;
        if (r8 <= 10) goto L20;
        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
    L20:
        this.f = false;
        return;
    L22:
        kf2.o("Scroll duration must be a positive number");
        return;
    L11:
        if (this.c >= 1) goto L15;
        kf2.o("If you provide an interpolator, you must set a positive duration");
        return;
    L24:
        this.g = 0;
    }
}
