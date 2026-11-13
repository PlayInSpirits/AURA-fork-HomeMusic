/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import defpackage.mz3;

public abstract class ek2 {
    public static float A(MotionEvent motionEvent, int n16) {
        return motionEvent.getRawY(n16);
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static float C(MotionEvent motionEvent) {
        return motionEvent.getRawX(1);
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static float a(MotionEvent motionEvent) {
        return motionEvent.getRawY(0);
    }

    public static float b(MotionEvent motionEvent, int n16) {
        return motionEvent.getRawX(n16);
    }

    public static int c(MotionEvent motionEvent) {
        return motionEvent.getClassification();
    }

    public static int d(AccessibilityManager accessibilityManager, int n16, int n17) {
        return accessibilityManager.getRecommendedTimeoutMillis(n16, n17);
    }

    public static RecordingCanvas e(RenderNode renderNode) {
        return renderNode.beginRecording();
    }

    public static RenderNode f() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint g() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint h(int n16, int n17, int n18) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(n16, n17, n18);
    }

    public static MediaSession i(Context context, String string, Bundle bundle) {
        return new MediaSession(context, string, bundle);
    }

    public static Uri j(Uri uri) {
        return MediaStore.setRequireOriginal(uri);
    }

    public static WindowInsets.Builder k() {
        return new WindowInsets.Builder();
    }

    public static WindowInsets l(WindowInsets.Builder builder) {
        return builder.build();
    }

    public static void m() {
    }

    public static void n(Activity activity, mz3.a a16) {
        activity.registerActivityLifecycleCallbacks(a16);
    }

    public static void o(Paint paint, CharSequence charSequence, int n16, int n17, Rect rect) {
        paint.getTextBounds(charSequence, n16, n17, rect);
    }

    public static void p(RenderNode renderNode) {
        renderNode.endRecording();
    }

    public static void q(RenderNode renderNode, int n16, int n17) {
        renderNode.setPosition(0, 0, n16, n17);
    }

    public static void r(MediaController.TransportControls transportControls, float f16) {
        transportControls.setPlaybackSpeed(f16);
    }

    public static boolean s() {
        return Environment.isExternalStorageLegacy();
    }

    public static boolean t(MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint2) {
        return performancePoint.covers(performancePoint2);
    }

    public static boolean u(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static float v(MotionEvent motionEvent) {
        return motionEvent.getRawY(1);
    }

    public static float w(MotionEvent motionEvent, int n16) {
        return motionEvent.getRawY(n16);
    }

    public static int x(MotionEvent motionEvent) {
        return motionEvent.getClassification();
    }

    public static boolean y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static float z(MotionEvent motionEvent) {
        return motionEvent.getRawX(0);
    }
}

