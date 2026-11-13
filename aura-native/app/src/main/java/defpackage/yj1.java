/*
 * Decompiled with CFR 0.152.
 */
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

public abstract class yj1 {
    public static void A(RenderNode renderNode) {
        renderNode.setHasOverlappingRendering(false);
    }

    public static void B(RenderNode renderNode, float f16) {
        renderNode.setPivotY(f16);
    }

    public static void C(RenderNode renderNode) {
        renderNode.setRotationX(0.0f);
    }

    public static void D(RenderNode renderNode) {
        renderNode.endRecording();
    }

    public static int a(Insets insets) {
        return insets.top;
    }

    public static RecordingCanvas b(RenderNode renderNode) {
        return renderNode.beginRecording();
    }

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object object) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint)object;
    }

    public static String d(SSLSocket sSLSocket) {
        return sSLSocket.getApplicationProtocol();
    }

    public static List e(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        return videoCapabilities.getSupportedPerformancePoints();
    }

    public static void f(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }

    public static void g(RenderNode renderNode) {
        renderNode.setRotationY(0.0f);
    }

    public static void h(RenderNode renderNode, float f16) {
        renderNode.setAlpha(f16);
    }

    public static void i(RenderNode renderNode, int n16) {
        renderNode.setSpotShadowColor(n16);
    }

    public static void j(RenderNode renderNode, int n16, int n17, int n18, int n19) {
        renderNode.setPosition(n16, n17, n18, n19);
    }

    public static void k(RenderNode renderNode, Matrix matrix) {
        renderNode.getMatrix(matrix);
    }

    public static void l(RenderNode renderNode, Outline outline) {
        renderNode.setOutline(outline);
    }

    public static void m(RenderNode renderNode, Paint paint) {
        renderNode.setUseCompositingLayer(true, paint);
    }

    public static void n(RenderNode renderNode, boolean bl5) {
        renderNode.setClipToBounds(bl5);
    }

    public static void o(SSLParameters sSLParameters, String[] stringArray) {
        sSLParameters.setApplicationProtocols(stringArray);
    }

    public static boolean p(RenderNode renderNode) {
        return renderNode.hasDisplayList();
    }

    public static int q(Insets insets) {
        return insets.right;
    }

    public static void r(RenderNode renderNode) {
        renderNode.setRotationZ(0.0f);
    }

    public static void s(RenderNode renderNode, float f16) {
        renderNode.setScaleX(f16);
    }

    public static void t(RenderNode renderNode, Paint paint) {
        renderNode.setUseCompositingLayer(false, paint);
    }

    public static void u(RenderNode renderNode, boolean bl5) {
        renderNode.setClipToOutline(bl5);
    }

    public static int v(Insets insets) {
        return insets.bottom;
    }

    public static void w(RenderNode renderNode) {
        renderNode.setTranslationY(0.0f);
    }

    public static void x(RenderNode renderNode, float f16) {
        renderNode.setCameraDistance(f16);
    }

    public static void y(RenderNode renderNode) {
        renderNode.setHasOverlappingRendering(true);
    }

    public static void z(RenderNode renderNode, float f16) {
        renderNode.setPivotX(f16);
    }
}

