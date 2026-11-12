package defpackage;

import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yj1 {
    public static /* bridge */ /* synthetic */ void A(RenderNode r1) {
        r1.setHasOverlappingRendering(false);
    }

    public static /* bridge */ /* synthetic */ void B(RenderNode r0, float r1) {
        r0.setPivotY(r1);
    }

    public static /* bridge */ /* synthetic */ void C(RenderNode r1) {
        r1.setRotationX(0.0f);
    }

    public static /* bridge */ /* synthetic */ void D(RenderNode r0) {
        r0.endRecording();
    }

    public static /* bridge */ /* synthetic */ int a(Insets r0) {
        return r0.top;
    }

    public static /* bridge */ /* synthetic */ RecordingCanvas b(RenderNode r0) {
        return r0.beginRecording();
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object r0) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) r0;
    }

    public static /* bridge */ /* synthetic */ String d(SSLSocket r0) {
        return r0.getApplicationProtocol();
    }

    public static /* bridge */ /* synthetic */ List e(MediaCodecInfo.VideoCapabilities r0) {
        return r0.getSupportedPerformancePoints();
    }

    public static /* bridge */ /* synthetic */ void f(Paint r0, BlendMode r1) {
        r0.setBlendMode(r1);
    }

    public static /* bridge */ /* synthetic */ void g(RenderNode r1) {
        r1.setRotationY(0.0f);
    }

    public static /* bridge */ /* synthetic */ void h(RenderNode r0, float r1) {
        r0.setAlpha(r1);
    }

    public static /* bridge */ /* synthetic */ void i(RenderNode r0, int r1) {
        r0.setSpotShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void j(RenderNode r0, int r1, int r2, int r3, int r4) {
        r0.setPosition(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ void k(RenderNode r0, Matrix r1) {
        r0.getMatrix(r1);
    }

    public static /* bridge */ /* synthetic */ void l(RenderNode r0, Outline r1) {
        r0.setOutline(r1);
    }

    public static /* bridge */ /* synthetic */ void m(RenderNode r1, Paint r2) {
        r1.setUseCompositingLayer(true, r2);
    }

    public static /* bridge */ /* synthetic */ void n(RenderNode r0, boolean r1) {
        r0.setClipToBounds(r1);
    }

    public static /* bridge */ /* synthetic */ void o(SSLParameters r0, String[] r1) {
        r0.setApplicationProtocols(r1);
    }

    public static /* bridge */ /* synthetic */ boolean p(RenderNode r0) {
        return r0.hasDisplayList();
    }

    public static /* bridge */ /* synthetic */ int q(Insets r0) {
        return r0.right;
    }

    public static /* bridge */ /* synthetic */ void r(RenderNode r1) {
        r1.setRotationZ(0.0f);
    }

    public static /* bridge */ /* synthetic */ void s(RenderNode r0, float r1) {
        r0.setScaleX(r1);
    }

    public static /* bridge */ /* synthetic */ void t(RenderNode r1, Paint r2) {
        r1.setUseCompositingLayer(false, r2);
    }

    public static /* bridge */ /* synthetic */ void u(RenderNode r0, boolean r1) {
        r0.setClipToOutline(r1);
    }

    public static /* bridge */ /* synthetic */ int v(Insets r0) {
        return r0.bottom;
    }

    public static /* bridge */ /* synthetic */ void w(RenderNode r1) {
        r1.setTranslationY(0.0f);
    }

    public static /* bridge */ /* synthetic */ void x(RenderNode r0, float r1) {
        r0.setCameraDistance(r1);
    }

    public static /* bridge */ /* synthetic */ void y(RenderNode r1) {
        r1.setHasOverlappingRendering(true);
    }

    public static /* bridge */ /* synthetic */ void z(RenderNode r0, float r1) {
        r0.setPivotX(r1);
    }
}
