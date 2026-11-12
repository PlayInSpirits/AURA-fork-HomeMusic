package defpackage;

import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.media.MediaRoute2Info;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.telephony.TelephonyDisplayInfo;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xq2 {
    public static /* bridge */ /* synthetic */ Insets A(WindowInsetsAnimation.Bounds r0) {
        return r0.getLowerBound();
    }

    public static /* bridge */ /* synthetic */ void B(WindowInsetsController r0, int r1) {
        r0.hide(r1);
    }

    public static /* bridge */ /* synthetic */ void C(WindowInsetsController r0, xh4 r1) {
        r0.removeOnControllableInsetsChangedListener(r1);
    }

    public static /* bridge */ /* synthetic */ float D(WindowInsetsAnimation r0) {
        return r0.getFraction();
    }

    public static /* bridge */ /* synthetic */ float a(WindowInsetsAnimation r0) {
        return r0.getAlpha();
    }

    public static /* bridge */ /* synthetic */ int b() {
        return WindowInsets.Type.ime();
    }

    public static /* bridge */ /* synthetic */ int c(MediaRoute2Info r0) {
        return r0.getVolumeMax();
    }

    public static /* bridge */ /* synthetic */ int d(TelephonyDisplayInfo r0) {
        return r0.getOverrideNetworkType();
    }

    public static /* bridge */ /* synthetic */ int e(WindowInsetsAnimation r0) {
        return r0.getTypeMask();
    }

    public static /* bridge */ /* synthetic */ long f(WindowInsetsAnimation r2) {
        return r2.getDurationMillis();
    }

    public static /* bridge */ /* synthetic */ Insets g(WindowInsets r0, int r1) {
        return r0.getInsetsIgnoringVisibility(r1);
    }

    public static /* bridge */ /* synthetic */ Insets h(WindowInsetsAnimation.Bounds r0) {
        return r0.getUpperBound();
    }

    public static /* bridge */ /* synthetic */ Uri i(MediaRoute2Info r0) {
        return r0.getIconUri();
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets r1, Insets r2) {
        return new WindowInsetsAnimation.Bounds(r1, r2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int r1, Interpolator r2, long r3) {
        return new WindowInsetsAnimation(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object r0) {
        return (WindowInsetsAnimation) r0;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController m(View r0) {
        return r0.getWindowInsetsController();
    }

    public static /* bridge */ /* synthetic */ CharSequence n(MediaRoute2Info r0) {
        return r0.getDescription();
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ void p(Resources r0, ResourcesLoader[] r1) {
        r0.addLoaders(r1);
    }

    public static /* bridge */ /* synthetic */ void q(Outline r0, Path r1) {
        r0.setPath(r1);
    }

    public static /* bridge */ /* synthetic */ void r(Surface r0, float r1, int r2) {
        r0.setFrameRate(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void s(View r0, qa5 r1) {
        r0.setWindowInsetsAnimationCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void t(WindowInsets.Builder r0, int r1, Insets r2) {
        r0.setInsets(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void u(WindowInsetsAnimation r0, float r1) {
        r0.setFraction(r1);
    }

    public static /* bridge */ /* synthetic */ void v(WindowInsetsController r0, int r1) {
        r0.show(r1);
    }

    public static /* bridge */ /* synthetic */ void w(WindowInsetsController r0, xh4 r1) {
        r0.addOnControllableInsetsChangedListener(r1);
    }

    public static /* bridge */ /* synthetic */ boolean x(NetworkRequest r0, NetworkCapabilities r1) {
        return r0.canBeSatisfiedBy(r1);
    }

    public static /* bridge */ /* synthetic */ float y(WindowInsetsAnimation r0) {
        return r0.getInterpolatedFraction();
    }

    public static /* bridge */ /* synthetic */ int z(MediaRoute2Info r0) {
        return r0.getVolume();
    }
}
