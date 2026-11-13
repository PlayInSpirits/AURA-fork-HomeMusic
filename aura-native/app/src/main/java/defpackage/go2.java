/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.media.session.MediaSession;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import android.view.RoundedCorner;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;
import defpackage.ra;
import defpackage.t53;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public abstract class go2 {
    public static int A(RoundedCorner roundedCorner) {
        return roundedCorner.getRadius();
    }

    public static void B(MediaCodec mediaCodec, ArrayList arrayList) {
        mediaCodec.subscribeToVendorParameters(arrayList);
    }

    public static void C(TrackChangeEvent.Builder builder, String string) {
        builder.setLanguageRegion(string);
    }

    public static int[] D(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }

    public static int a(RoundedCorner roundedCorner) {
        return roundedCorner.getPosition();
    }

    public static Point b(RoundedCorner roundedCorner) {
        return roundedCorner.getCenter();
    }

    public static PositionedGlyphs c(Paint paint) {
        return TextRunShaper.shapeTextRun(" ", 0, 1, 0, 1, 0.0f, 0.0f, false, paint);
    }

    public static LogSessionId d() {
        return LogSessionId.LOG_SESSION_ID_NONE;
    }

    public static NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static TrackChangeEvent.Builder g(int n16) {
        return new TrackChangeEvent.Builder(n16);
    }

    public static ScrollCaptureTarget h(ra ra6, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(ra6, rect, point, scrollCaptureCallback);
    }

    public static View i(SplashScreenView splashScreenView) {
        return splashScreenView.getRootView();
    }

    public static SplashScreenView j(View view) {
        return (SplashScreenView)view;
    }

    public static void k(JobInfo.Builder builder) {
        builder.setExpedited(true);
    }

    public static void l(MediaCodec mediaCodec, ArrayList arrayList) {
        mediaCodec.unsubscribeFromVendorParameters(arrayList);
    }

    public static void m(PlaybackSession playbackSession, TrackChangeEvent trackChangeEvent) {
        playbackSession.reportTrackChangeEvent(trackChangeEvent);
    }

    public static void n(TrackChangeEvent.Builder builder) {
        builder.setTrackState(0);
    }

    public static void o(TrackChangeEvent.Builder builder, float f16) {
        builder.setVideoFrameRate(f16);
    }

    public static void p(TrackChangeEvent.Builder builder, int n16) {
        builder.setAudioSampleRate(n16);
    }

    public static void q(TrackChangeEvent.Builder builder, String string) {
        builder.setLanguage(string);
    }

    public static void r(MediaSession mediaSession, ComponentName componentName) {
        mediaSession.setMediaButtonBroadcastReceiver(componentName);
    }

    public static void s(TelephonyManager telephonyManager, t53 t532) {
        telephonyManager.unregisterTelephonyCallback(t532);
    }

    public static void t(TelephonyManager telephonyManager, Executor executor, t53 t532) {
        telephonyManager.registerTelephonyCallback(executor, t532);
    }

    public static void u(ScrollCaptureTarget scrollCaptureTarget, Rect rect) {
        scrollCaptureTarget.setScrollBounds(rect);
    }

    public static boolean v(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    public static boolean w(LogSessionId logSessionId) {
        return logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
    }

    public static boolean x(View view) {
        return view instanceof SplashScreenView;
    }

    public static boolean y(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }

    public static int[] z(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }
}

