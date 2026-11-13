/*
 * Decompiled with CFR 0.152.
 */
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
import defpackage.qa5;
import defpackage.xh4;

public abstract class xq2 {
    public static Insets A(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getLowerBound();
    }

    public static void B(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.hide(n16);
    }

    public static void C(WindowInsetsController windowInsetsController, xh4 xh42) {
        windowInsetsController.removeOnControllableInsetsChangedListener(xh42);
    }

    public static float D(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getFraction();
    }

    public static float a(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getAlpha();
    }

    public static int b() {
        return WindowInsets.Type.ime();
    }

    public static int c(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getVolumeMax();
    }

    public static int d(TelephonyDisplayInfo telephonyDisplayInfo) {
        return telephonyDisplayInfo.getOverrideNetworkType();
    }

    public static int e(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getTypeMask();
    }

    public static long f(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getDurationMillis();
    }

    public static Insets g(WindowInsets windowInsets, int n16) {
        return windowInsets.getInsetsIgnoringVisibility(n16);
    }

    public static Insets h(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getUpperBound();
    }

    public static Uri i(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getIconUri();
    }

    public static WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static WindowInsetsAnimation k(int n16, Interpolator interpolator, long l16) {
        return new WindowInsetsAnimation(n16, interpolator, l16);
    }

    public static WindowInsetsAnimation l(Object object) {
        return (WindowInsetsAnimation)object;
    }

    public static WindowInsetsController m(View view) {
        return view.getWindowInsetsController();
    }

    public static CharSequence n(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDescription();
    }

    public static void o() {
    }

    public static void p(Resources resources, ResourcesLoader[] resourcesLoaderArray) {
        resources.addLoaders(resourcesLoaderArray);
    }

    public static void q(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static void r(Surface surface, float f16, int n16) {
        surface.setFrameRate(f16, n16);
    }

    public static void s(View view, qa5 qa52) {
        view.setWindowInsetsAnimationCallback(qa52);
    }

    public static void t(WindowInsets.Builder builder, int n16, Insets insets) {
        builder.setInsets(n16, insets);
    }

    public static void u(WindowInsetsAnimation windowInsetsAnimation, float f16) {
        windowInsetsAnimation.setFraction(f16);
    }

    public static void v(WindowInsetsController windowInsetsController, int n16) {
        windowInsetsController.show(n16);
    }

    public static void w(WindowInsetsController windowInsetsController, xh4 xh42) {
        windowInsetsController.addOnControllableInsetsChangedListener(xh42);
    }

    public static boolean x(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        return networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static float y(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getInterpolatedFraction();
    }

    public static int z(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getVolume();
    }
}

