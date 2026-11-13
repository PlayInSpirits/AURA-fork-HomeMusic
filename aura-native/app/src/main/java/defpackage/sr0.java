/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Typeface;
import android.media.MediaDrm;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.net.NetworkRequest;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowManager;
import defpackage.qj2;

public abstract class sr0 {
    public static boolean A(NetworkRequest networkRequest, int n16) {
        return networkRequest.hasCapability(n16);
    }

    public static int B(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int C(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int D(DisplayCutout displayCutout) {
        return displayCutout.hashCode();
    }

    public static int a(MediaDrm mediaDrm, byte[] byArray) {
        return mediaDrm.getSecurityLevel(byArray);
    }

    public static int b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPid();
    }

    public static int c(PrecomputedText.Params params) {
        return params.getBreakStrategy();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static long e(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static SigningInfo f(PackageInfo packageInfo) {
        return packageInfo.signingInfo;
    }

    public static Typeface g(Typeface typeface, int n16, boolean bl5) {
        return Typeface.create(typeface, n16, bl5);
    }

    public static MediaSessionManager.RemoteUserInfo h(qj2 qj22) {
        return qj22.getCurrentBrowserInfo();
    }

    public static MediaSessionManager.RemoteUserInfo i(MediaSession mediaSession) {
        return mediaSession.getCurrentControllerInfo();
    }

    public static PrecomputedText.Params.Builder j(PrecomputedText.Params.Builder builder, int n16) {
        return builder.setBreakStrategy(n16);
    }

    public static PrecomputedText.Params.Builder k(PrecomputedText.Params.Builder builder, TextDirectionHeuristic textDirectionHeuristic) {
        return builder.setTextDirection(textDirectionHeuristic);
    }

    public static PrecomputedText.Params.Builder l(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static TextDirectionHeuristic m(PrecomputedText.Params params) {
        return params.getTextDirection();
    }

    public static TextPaint n(PrecomputedText.Params params) {
        return params.getTextPaint();
    }

    public static String o(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    public static void p(PrecomputedText.Params.Builder builder) {
        builder.build();
    }

    public static void q(View view) {
        view.setAccessibilityHeading(true);
    }

    public static void r(WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 1;
    }

    public static boolean s(NetworkRequest networkRequest, int n16) {
        return networkRequest.hasTransport(n16);
    }

    public static Signature[] t(SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }

    public static int u(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getUid();
    }

    public static int v(PrecomputedText.Params params) {
        return params.getHyphenationFrequency();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static SigningInfo x(PackageInfo packageInfo) {
        return packageInfo.signingInfo;
    }

    public static PrecomputedText.Params.Builder y(PrecomputedText.Params.Builder builder, int n16) {
        return builder.setHyphenationFrequency(n16);
    }

    public static void z(WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 3;
    }
}

