/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.view.View;
import android.view.WindowInsets;
import android.widget.TextView;
import defpackage.ra;
import defpackage.ym;
import defpackage.zm;

public abstract class z9 {
    public static BlendMode A() {
        return BlendMode.OVERLAY;
    }

    public static BlendMode B() {
        return BlendMode.DARKEN;
    }

    public static BlendMode C() {
        return BlendMode.LIGHTEN;
    }

    public static BlendMode D() {
        return BlendMode.COLOR_DODGE;
    }

    public static int a(AudioAttributes audioAttributes) {
        return audioAttributes.getAllowedCapturePolicy();
    }

    public static long b(ra ra6) {
        return ra6.getUniqueDrawingId();
    }

    public static ColorStateList c(ColorStateListDrawable colorStateListDrawable) {
        return colorStateListDrawable.getColorStateList();
    }

    public static BlendMode d() {
        return BlendMode.MODULATE;
    }

    public static BlendModeColorFilter e(int n16, BlendMode blendMode) {
        return new BlendModeColorFilter(n16, blendMode);
    }

    public static Insets f(WindowInsets windowInsets) {
        return windowInsets.getMandatorySystemGestureInsets();
    }

    public static ColorStateListDrawable g(Drawable drawable) {
        return (ColorStateListDrawable)drawable;
    }

    public static TextDirectionHeuristic h(TextView textView) {
        return textView.getTextDirectionHeuristic();
    }

    public static void i() {
    }

    public static void j(Canvas canvas, int n16, BlendMode blendMode) {
        canvas.drawColor(n16, blendMode);
    }

    public static void k(AudioAttributes.Builder builder, int n16) {
        builder.setAllowedCapturePolicy(n16);
    }

    public static void l(AudioAttributes.Builder builder, boolean bl5) {
        builder.setHapticChannelsMuted(bl5);
    }

    public static void m(AudioTrack.Builder builder, boolean bl5) {
        builder.setOffloadedPlayback(bl5);
    }

    public static void n(AudioTrack audioTrack) {
        audioTrack.setOffloadEndOfStream();
    }

    public static void o(AudioTrack audioTrack, int n16, int n17) {
        audioTrack.setOffloadDelayPadding(n16, n17);
    }

    public static void p(AudioTrack audioTrack, ym ym5, zm zm5) {
        audioTrack.registerStreamEventCallback(ym5, zm5);
    }

    public static void q(AudioTrack audioTrack, zm zm5) {
        audioTrack.unregisterStreamEventCallback(zm5);
    }

    public static void r(View view) {
        view.setForceDarkAllowed(false);
    }

    public static void s(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void t(String string, long l16) {
        Trace.setCounter(string, l16);
    }

    public static boolean u(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static boolean v(AudioAttributes audioAttributes) {
        return audioAttributes.areHapticChannelsMuted();
    }

    public static boolean w(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioTrack.isDirectPlaybackSupported(audioFormat, audioAttributes);
    }

    public static boolean x(AudioTrack audioTrack) {
        return audioTrack.isOffloadedPlayback();
    }

    public static boolean y(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    public static BlendMode z() {
        return BlendMode.SCREEN;
    }
}

