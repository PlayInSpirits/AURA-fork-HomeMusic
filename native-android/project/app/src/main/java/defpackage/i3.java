package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.DisplayCutout;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i3 {
    public static /* bridge */ /* synthetic */ void A(ImageDecoder r1) {
        r1.setAllocator(1);
    }

    public static /* bridge */ /* synthetic */ void B(AnimatedImageDrawable r0) {
        r0.clearAnimationCallbacks();
    }

    public static /* bridge */ /* synthetic */ void C(AccessibilityNodeInfo r0, boolean r1) {
        r0.setHeading(r1);
    }

    public static /* bridge */ /* synthetic */ void D(ImageDecoder r1) {
        r1.setMemorySizePolicy(0);
    }

    public static /* bridge */ /* synthetic */ int a(AnimatedImageDrawable r0) {
        return r0.getIntrinsicWidth();
    }

    public static /* bridge */ /* synthetic */ Bitmap b(ImageDecoder.Source r0, im0 r1) {
        return ImageDecoder.decodeBitmap(r0, r1);
    }

    public static /* bridge */ /* synthetic */ ColorSpace c(ImageDecoder.ImageInfo r0) {
        return r0.getColorSpace();
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source d(Object r0) {
        return (ImageDecoder.Source) r0;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source e(ByteBuffer r0) {
        return ImageDecoder.createSource(r0);
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable f(Drawable r0) {
        return (AnimatedImageDrawable) r0;
    }

    public static /* bridge */ /* synthetic */ Drawable g(ImageDecoder.Source r0, im0 r1) {
        return ImageDecoder.decodeDrawable(r0, r1);
    }

    public static /* bridge */ /* synthetic */ Handler h(Looper r0) {
        return Handler.createAsync(r0);
    }

    public static /* bridge */ /* synthetic */ Size i(ImageDecoder.ImageInfo r0) {
        return r0.getSize();
    }

    public static /* bridge */ /* synthetic */ DisplayCutout j(Object r0) {
        return (DisplayCutout) r0;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction k() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ CharSequence l(AccessibilityNodeInfo r0) {
        return r0.getTooltipText();
    }

    public static /* bridge */ /* synthetic */ ClassLoader m() {
        return WebView.getWebViewClassLoader();
    }

    public static /* bridge */ /* synthetic */ void n(ImageDecoder r1) {
        r1.setAllocator(3);
    }

    public static /* bridge */ /* synthetic */ void o(ImageDecoder r0, int r1, int r2) {
        r0.setTargetSize(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void p(ImageDecoder r0, hm0 r1) {
        r0.setOnPartialImageListener(r1);
    }

    public static /* bridge */ /* synthetic */ void q(ImageDecoder r0, ColorSpace r1) {
        r0.setTargetColorSpace(r1);
    }

    public static /* bridge */ /* synthetic */ void r(AnimatedImageDrawable r0) {
        r0.stop();
    }

    public static /* bridge */ /* synthetic */ void s(ViewStructure r0, int r1) {
        r0.setMaxTextLength(r1);
    }

    public static /* bridge */ /* synthetic */ void t(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setPaneTitle(r1);
    }

    public static /* bridge */ /* synthetic */ void u(AccessibilityNodeInfo r0, boolean r1) {
        r0.setScreenReaderFocusable(r1);
    }

    public static /* bridge */ /* synthetic */ void v(Object r0) {
        ImageDecoder.Source r1 = (ImageDecoder.Source) r0;
    }

    public static /* bridge */ /* synthetic */ boolean w(Drawable r0) {
        return r0 instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object r0) {
        return r0 instanceof DisplayCutout;
    }

    public static /* bridge */ /* synthetic */ int y(AnimatedImageDrawable r0) {
        return r0.getIntrinsicHeight();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction z() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }
}
