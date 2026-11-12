package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg2 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public oo f;

    public yg2(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = g12.O(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = g12.N(context, R.attr.motionDurationMedium2, 300);
        this.d = g12.N(context, R.attr.motionDurationShort3, 150);
        this.e = g12.N(context, R.attr.motionDurationShort2, 100);
    }

    public final oo a() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        oo ooVar = this.f;
        this.f = null;
        return ooVar;
    }
}
