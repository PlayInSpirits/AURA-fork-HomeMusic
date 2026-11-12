package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ta5 {
    public sa5 a;

    public ta5(int r3, Interpolator r4, long r5) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        this.a = new ra5(xq2.k(r3, r4, r5));
        return;
    L6:
        this.a = new pa5(r3, r4, r5);
    }
}
