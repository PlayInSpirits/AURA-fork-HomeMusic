package defpackage;

import android.content.Context;
import android.content.Intent;
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
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kz {
    public static /* bridge */ /* synthetic */ void A(RenderNode r1) {
        r1.setElevation(0.0f);
    }

    public static /* bridge */ /* synthetic */ int B(Insets r0) {
        return r0.bottom;
    }

    public static /* bridge */ /* synthetic */ void C(Canvas r0) {
        r0.disableZ();
    }

    public static /* bridge */ /* synthetic */ void D(RenderNode r1) {
        r1.setTranslationX(0.0f);
    }

    public static /* bridge */ /* synthetic */ int a(Insets r0) {
        return r0.left;
    }

    public static /* bridge */ /* synthetic */ int b(MediaFormat r0, String r1) {
        return r0.getValueTypeForKey(r1);
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode("graphicsLayer");
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession d(Object r0) {
        return (ContentCaptureSession) r0;
    }

    public static /* bridge */ /* synthetic */ String e(Context r0) {
        return r0.getOpPackageName();
    }

    public static /* bridge */ /* synthetic */ void f(Canvas r0) {
        r0.disableZ();
    }

    public static /* bridge */ /* synthetic */ void g(Canvas r0, long r1) {
        r0.drawColor(r1);
    }

    public static /* bridge */ /* synthetic */ void h(Canvas r0, long r1, BlendMode r3) {
        r0.drawColor(r1, r3);
    }

    public static /* bridge */ /* synthetic */ void i(Canvas r0, RectF r1, float r2, float r3, RectF r4, float r5, float r6, Paint r7) {
        r0.drawDoubleRoundRect(r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* bridge */ /* synthetic */ void j(Canvas r0, RectF r1, float[] r2, RectF r3, float[] r4, Paint r5) {
        r0.drawDoubleRoundRect(r1, r2, r3, r4, r5);
    }

    public static /* bridge */ /* synthetic */ void k(Canvas r0, RenderNode r1) {
        r0.drawRenderNode(r1);
    }

    public static /* bridge */ /* synthetic */ void l(Canvas r0, MeasuredText r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, Paint r9) {
        r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    public static /* bridge */ /* synthetic */ void m(RenderNode r0) {
        r0.discardDisplayList();
    }

    public static /* bridge */ /* synthetic */ void n(RenderNode r0, float r1) {
        r0.setScaleY(r1);
    }

    public static /* bridge */ /* synthetic */ void o(RenderNode r0, int r1) {
        r0.setAmbientShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void p(Window r1) {
        r1.setStatusBarContrastEnforced(false);
    }

    public static /* bridge */ /* synthetic */ void q(DefaultTimeBar r0, List r1) {
        r0.setSystemGestureExclusionRects(r1);
    }

    public static /* bridge */ /* synthetic */ boolean r(Context r1, Intent r2, Executor r3, pk5 r4) {
        return r1.bindService(r2, 4225, r3, r4);
    }

    public static /* bridge */ /* synthetic */ boolean s(AudioFormat r0, AudioAttributes r1) {
        return AudioManager.isOffloadedPlaybackSupported(r0, r1);
    }

    public static /* bridge */ /* synthetic */ int t(Insets r0) {
        return r0.top;
    }

    public static /* bridge */ /* synthetic */ void u(Canvas r0) {
        r0.enableZ();
    }

    public static /* bridge */ /* synthetic */ void v(Canvas r0, RenderNode r1) {
        r0.drawRenderNode(r1);
    }

    public static /* bridge */ /* synthetic */ void w(RenderNode r1) {
        r1.setClipToBounds(false);
    }

    public static /* bridge */ /* synthetic */ void x(Window r1) {
        r1.setNavigationBarContrastEnforced(true);
    }

    public static /* bridge */ /* synthetic */ int y(Insets r0) {
        return r0.right;
    }

    public static /* bridge */ /* synthetic */ void z(Canvas r0) {
        r0.enableZ();
    }
}
