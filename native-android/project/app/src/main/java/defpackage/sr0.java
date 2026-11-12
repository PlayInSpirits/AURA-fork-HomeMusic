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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class sr0 {
    public static /* bridge */ /* synthetic */ boolean A(NetworkRequest r0, int r1) {
        return r0.hasCapability(r1);
    }

    public static /* bridge */ /* synthetic */ int B(DisplayCutout r0) {
        return r0.getSafeInsetBottom();
    }

    public static /* bridge */ /* synthetic */ int C(DisplayCutout r0) {
        return r0.getSafeInsetRight();
    }

    public static /* bridge */ /* synthetic */ int D(DisplayCutout r0) {
        return r0.hashCode();
    }

    public static /* bridge */ /* synthetic */ int a(MediaDrm r0, byte[] r1) {
        return r0.getSecurityLevel(r1);
    }

    public static /* bridge */ /* synthetic */ int b(MediaSessionManager.RemoteUserInfo r0) {
        return r0.getPid();
    }

    public static /* bridge */ /* synthetic */ int c(PrecomputedText.Params r0) {
        return r0.getBreakStrategy();
    }

    public static /* bridge */ /* synthetic */ int d(DisplayCutout r0) {
        return r0.getSafeInsetTop();
    }

    public static /* bridge */ /* synthetic */ long e(PackageInfo r2) {
        return r2.getLongVersionCode();
    }

    public static /* bridge */ /* synthetic */ SigningInfo f(PackageInfo r0) {
        return r0.signingInfo;
    }

    public static /* bridge */ /* synthetic */ Typeface g(Typeface r0, int r1, boolean r2) {
        return Typeface.create(r0, r1, r2);
    }

    public static /* bridge */ /* synthetic */ MediaSessionManager.RemoteUserInfo h(qj2 r0) {
        return r0.getCurrentBrowserInfo();
    }

    public static /* bridge */ /* synthetic */ MediaSessionManager.RemoteUserInfo i(MediaSession r0) {
        return r0.getCurrentControllerInfo();
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder j(PrecomputedText.Params.Builder r0, int r1) {
        return r0.setBreakStrategy(r1);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder k(PrecomputedText.Params.Builder r0, TextDirectionHeuristic r1) {
        return r0.setTextDirection(r1);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder l(TextPaint r1) {
        return new PrecomputedText.Params.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m(PrecomputedText.Params r0) {
        return r0.getTextDirection();
    }

    public static /* bridge */ /* synthetic */ TextPaint n(PrecomputedText.Params r0) {
        return r0.getTextPaint();
    }

    public static /* bridge */ /* synthetic */ String o(MediaSessionManager.RemoteUserInfo r0) {
        return r0.getPackageName();
    }

    public static /* bridge */ /* synthetic */ void p(PrecomputedText.Params.Builder r0) {
        r0.build();
    }

    public static /* bridge */ /* synthetic */ void q(View r1) {
        r1.setAccessibilityHeading(true);
    }

    public static /* bridge */ /* synthetic */ void r(WindowManager.LayoutParams r1) {
        r1.layoutInDisplayCutoutMode = 1;
    }

    public static /* bridge */ /* synthetic */ boolean s(NetworkRequest r0, int r1) {
        return r0.hasTransport(r1);
    }

    public static /* bridge */ /* synthetic */ Signature[] t(SigningInfo r0) {
        return r0.getApkContentsSigners();
    }

    public static /* bridge */ /* synthetic */ int u(MediaSessionManager.RemoteUserInfo r0) {
        return r0.getUid();
    }

    public static /* bridge */ /* synthetic */ int v(PrecomputedText.Params r0) {
        return r0.getHyphenationFrequency();
    }

    public static /* bridge */ /* synthetic */ int w(DisplayCutout r0) {
        return r0.getSafeInsetLeft();
    }

    public static /* bridge */ /* synthetic */ SigningInfo x(PackageInfo r0) {
        return r0.signingInfo;
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder y(PrecomputedText.Params.Builder r0, int r1) {
        return r0.setHyphenationFrequency(r1);
    }

    public static /* bridge */ /* synthetic */ void z(WindowManager.LayoutParams r1) {
        r1.layoutInDisplayCutoutMode = 3;
    }
}
