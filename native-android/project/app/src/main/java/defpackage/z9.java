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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z9 {
    public static /* bridge */ /* synthetic */ BlendMode A() {
        return BlendMode.OVERLAY;
    }

    public static /* bridge */ /* synthetic */ BlendMode B() {
        return BlendMode.DARKEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode C() {
        return BlendMode.LIGHTEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode D() {
        return BlendMode.COLOR_DODGE;
    }

    public static /* bridge */ /* synthetic */ int a(AudioAttributes r0) {
        return r0.getAllowedCapturePolicy();
    }

    public static /* bridge */ /* synthetic */ long b(ra r2) {
        return r2.getUniqueDrawingId();
    }

    public static /* bridge */ /* synthetic */ ColorStateList c(ColorStateListDrawable r0) {
        return r0.getColorStateList();
    }

    public static /* bridge */ /* synthetic */ BlendMode d() {
        return BlendMode.MODULATE;
    }

    public static /* synthetic */ BlendModeColorFilter e(int r1, BlendMode r2) {
        return new BlendModeColorFilter(r1, r2);
    }

    public static /* bridge */ /* synthetic */ Insets f(WindowInsets r0) {
        return r0.getMandatorySystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable g(Drawable r0) {
        return (ColorStateListDrawable) r0;
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic h(TextView r0) {
        return r0.getTextDirectionHeuristic();
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ void j(Canvas r0, int r1, BlendMode r2) {
        r0.drawColor(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void k(AudioAttributes.Builder r0, int r1) {
        r0.setAllowedCapturePolicy(r1);
    }

    public static /* bridge */ /* synthetic */ void l(AudioAttributes.Builder r0, boolean r1) {
        r0.setHapticChannelsMuted(r1);
    }

    public static /* bridge */ /* synthetic */ void m(AudioTrack.Builder r0, boolean r1) {
        r0.setOffloadedPlayback(r1);
    }

    public static /* bridge */ /* synthetic */ void n(AudioTrack r0) {
        r0.setOffloadEndOfStream();
    }

    public static /* bridge */ /* synthetic */ void o(AudioTrack r0, int r1, int r2) {
        r0.setOffloadDelayPadding(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void p(AudioTrack r0, ym r1, zm r2) {
        r0.registerStreamEventCallback(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void q(AudioTrack r0, zm r1) {
        r0.unregisterStreamEventCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void r(View r1) {
        r1.setForceDarkAllowed(false);
    }

    public static /* bridge */ /* synthetic */ void s(View r0, Matrix r1) {
        r0.transformMatrixToGlobal(r1);
    }

    public static /* bridge */ /* synthetic */ void t(String r0, long r1) {
        Trace.setCounter(r0, r1);
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable r0) {
        return r0 instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean v(AudioAttributes r0) {
        return r0.areHapticChannelsMuted();
    }

    public static /* bridge */ /* synthetic */ boolean w(AudioFormat r0, AudioAttributes r1) {
        return AudioTrack.isDirectPlaybackSupported(r0, r1);
    }

    public static /* bridge */ /* synthetic */ boolean x(AudioTrack r0) {
        return r0.isOffloadedPlayback();
    }

    public static /* bridge */ /* synthetic */ boolean y(TextView r0) {
        return r0.isHorizontallyScrollable();
    }

    public static /* bridge */ /* synthetic */ BlendMode z() {
        return BlendMode.SCREEN;
    }
}
