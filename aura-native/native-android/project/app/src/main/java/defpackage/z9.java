package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z9 {
    public static /* synthetic */ BlendModeColorFilter e(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable g(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ void n(AudioTrack audioTrack) {
        audioTrack.setOffloadEndOfStream();
    }

    public static /* bridge */ /* synthetic */ void o(AudioTrack audioTrack, int i, int i2) {
        audioTrack.setOffloadDelayPadding(i, i2);
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
