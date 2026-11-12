package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd extends Animatable2.AnimationCallback {
    public final /* synthetic */ hq a;

    public jd(hq r1) {
        this.a = r1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable r1) {
        this.a.a(r1);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable r1) {
        this.a.b(r1);
    }
}
