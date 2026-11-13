/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.view.Window;
import android.view.contentcapture.ContentCaptureSession;
import androidx.media3.ui.DefaultTimeBar;
import defpackage.pk5;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class kz {
    public static void A(RenderNode renderNode) {
        renderNode.setElevation(0.0f);
    }

    public static int B(Insets insets) {
        return insets.bottom;
    }

    public static void C(Canvas canvas) {
        canvas.disableZ();
    }

    public static void D(RenderNode renderNode) {
        renderNode.setTranslationX(0.0f);
    }

    public static int a(Insets insets) {
        return insets.left;
    }

    public static int b(MediaFormat mediaFormat, String string) {
        return mediaFormat.getValueTypeForKey(string);
    }

    public static RenderNode c() {
        return new RenderNode("graphicsLayer");
    }

    public static ContentCaptureSession d(Object object) {
        return (ContentCaptureSession)object;
    }

    public static String e(Context context) {
        return context.getOpPackageName();
    }

    public static void f(Canvas canvas) {
        canvas.disableZ();
    }

    public static void g(Canvas canvas, long l16) {
        canvas.drawColor(l16);
    }

    public static void h(Canvas canvas, long l16, BlendMode blendMode) {
        canvas.drawColor(l16, blendMode);
    }

    public static void i(Canvas canvas, RectF rectF, float f16, float f17, RectF rectF2, float f18, float f19, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f16, f17, rectF2, f18, f19, paint);
    }

    public static void j(Canvas canvas, RectF rectF, float[] fArray, RectF rectF2, float[] fArray2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArray, rectF2, fArray2, paint);
    }

    public static void k(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void l(Canvas canvas, MeasuredText measuredText, int n16, int n17, int n18, int n19, float f16, float f17, boolean bl5, Paint paint) {
        canvas.drawTextRun(measuredText, n16, n17, n18, n19, f16, f17, bl5, paint);
    }

    public static void m(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }

    public static void n(RenderNode renderNode, float f16) {
        renderNode.setScaleY(f16);
    }

    public static void o(RenderNode renderNode, int n16) {
        renderNode.setAmbientShadowColor(n16);
    }

    public static void p(Window window) {
        window.setStatusBarContrastEnforced(false);
    }

    public static void q(DefaultTimeBar defaultTimeBar, List list) {
        defaultTimeBar.setSystemGestureExclusionRects(list);
    }

    public static boolean r(Context context, Intent intent, Executor executor, pk5 pk52) {
        return context.bindService(intent, 4225, executor, (ServiceConnection)pk52);
    }

    public static boolean s(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
    }

    public static int t(Insets insets) {
        return insets.top;
    }

    public static void u(Canvas canvas) {
        canvas.enableZ();
    }

    public static void v(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void w(RenderNode renderNode) {
        renderNode.setClipToBounds(false);
    }

    public static void x(Window window) {
        window.setNavigationBarContrastEnforced(true);
    }

    public static int y(Insets insets) {
        return insets.right;
    }

    public static void z(Canvas canvas) {
        canvas.enableZ();
    }
}

