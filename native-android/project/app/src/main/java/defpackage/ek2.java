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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ek2 {
    public static /* bridge */ /* synthetic */ float A(MotionEvent r0, int r1) {
        return r0.getRawY(r1);
    }

    public static /* bridge */ /* synthetic */ boolean B(MediaCodecInfo r0) {
        return r0.isVendor();
    }

    public static /* bridge */ /* synthetic */ float C(MotionEvent r1) {
        return r1.getRawX(1);
    }

    public static /* bridge */ /* synthetic */ boolean D(MediaCodecInfo r0) {
        return r0.isAlias();
    }

    public static /* bridge */ /* synthetic */ float a(MotionEvent r1) {
        return r1.getRawY(0);
    }

    public static /* bridge */ /* synthetic */ float b(MotionEvent r0, int r1) {
        return r0.getRawX(r1);
    }

    public static /* bridge */ /* synthetic */ int c(MotionEvent r0) {
        return r0.getClassification();
    }

    public static /* bridge */ /* synthetic */ int d(AccessibilityManager r0, int r1, int r2) {
        return r0.getRecommendedTimeoutMillis(r1, r2);
    }

    public static /* bridge */ /* synthetic */ RecordingCanvas e(RenderNode r0) {
        return r0.beginRecording();
    }

    public static /* synthetic */ RenderNode f() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(int r1, int r2, int r3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(r1, r2, r3);
    }

    public static /* synthetic */ MediaSession i(Context r1, String r2, Bundle r3) {
        return new MediaSession(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ Uri j(Uri r0) {
        return MediaStore.setRequireOriginal(r0);
    }

    public static /* synthetic */ WindowInsets.Builder k() {
        return new WindowInsets.Builder();
    }

    public static /* bridge */ /* synthetic */ WindowInsets l(WindowInsets.Builder r0) {
        return r0.build();
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ void n(Activity r0, mz3.a r1) {
        r0.registerActivityLifecycleCallbacks(r1);
    }

    public static /* bridge */ /* synthetic */ void o(Paint r0, CharSequence r1, int r2, int r3, Rect r4) {
        r0.getTextBounds(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ void p(RenderNode r0) {
        r0.endRecording();
    }

    public static /* bridge */ /* synthetic */ void q(RenderNode r1, int r2, int r3) {
        r1.setPosition(0, 0, r2, r3);
    }

    public static /* bridge */ /* synthetic */ void r(MediaController.TransportControls r0, float r1) {
        r0.setPlaybackSpeed(r1);
    }

    public static /* bridge */ /* synthetic */ boolean s() {
        return Environment.isExternalStorageLegacy();
    }

    public static /* bridge */ /* synthetic */ boolean t(MediaCodecInfo.VideoCapabilities.PerformancePoint r0, MediaCodecInfo.VideoCapabilities.PerformancePoint r1) {
        return r0.covers(r1);
    }

    public static /* bridge */ /* synthetic */ boolean u(MediaCodecInfo r0) {
        return r0.isSoftwareOnly();
    }

    public static /* bridge */ /* synthetic */ float v(MotionEvent r1) {
        return r1.getRawY(1);
    }

    public static /* bridge */ /* synthetic */ float w(MotionEvent r0, int r1) {
        return r0.getRawY(r1);
    }

    public static /* bridge */ /* synthetic */ int x(MotionEvent r0) {
        return r0.getClassification();
    }

    public static /* bridge */ /* synthetic */ boolean y(MediaCodecInfo r0) {
        return r0.isHardwareAccelerated();
    }

    public static /* bridge */ /* synthetic */ float z(MotionEvent r1) {
        return r1.getRawX(0);
    }
}
