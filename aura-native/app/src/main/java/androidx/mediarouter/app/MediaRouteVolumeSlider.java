package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.fu;
import defpackage.pg;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends pg {
    public final float o;
    public boolean p;
    public Drawable q;
    public int r;
    public int s;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = fu.v(context);
    }

    public final void a(int i, int i2) {
        if (this.r != i) {
            if (Color.alpha(i) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i));
            }
            this.r = i;
        }
        if (this.s != i2) {
            if (Color.alpha(i2) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i2));
            }
            this.s = i2;
        }
    }

    public final void b(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        super.setThumb(z ? null : this.q);
    }

    @Override // defpackage.pg, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.o * 255.0f);
        Drawable drawable = this.q;
        int i2 = this.r;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i2, mode);
        this.q.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.s, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.r, mode);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.q = drawable;
        if (this.p) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }
}
