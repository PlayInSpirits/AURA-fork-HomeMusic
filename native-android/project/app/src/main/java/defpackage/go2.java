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
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class go2 {
    public static /* bridge */ /* synthetic */ int A(RoundedCorner r0) {
        return r0.getRadius();
    }

    public static /* bridge */ /* synthetic */ void B(MediaCodec r0, ArrayList r1) {
        r0.subscribeToVendorParameters(r1);
    }

    public static /* bridge */ /* synthetic */ void C(TrackChangeEvent.Builder r0, String r1) {
        r0.setLanguageRegion(r1);
    }

    public static /* bridge */ /* synthetic */ int[] D(NetworkRequest r0) {
        return r0.getCapabilities();
    }

    public static /* bridge */ /* synthetic */ int a(RoundedCorner r0) {
        return r0.getPosition();
    }

    public static /* bridge */ /* synthetic */ Point b(RoundedCorner r0) {
        return r0.getCenter();
    }

    public static /* bridge */ /* synthetic */ PositionedGlyphs c(Paint r9) {
        return TextRunShaper.shapeTextRun(" ", 0, 1, 0, 1, 0.0f, 0.0f, false, r9);
    }

    public static /* bridge */ /* synthetic */ LogSessionId d() {
        return LogSessionId.LOG_SESSION_ID_NONE;
    }

    public static /* synthetic */ NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder g(int r1) {
        return new TrackChangeEvent.Builder(r1);
    }

    public static /* synthetic */ ScrollCaptureTarget h(ra r1, Rect r2, Point r3, ScrollCaptureCallback r4) {
        return new ScrollCaptureTarget(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ View i(SplashScreenView r0) {
        return r0.getRootView();
    }

    public static /* bridge */ /* synthetic */ SplashScreenView j(View r0) {
        return (SplashScreenView) r0;
    }

    public static /* bridge */ /* synthetic */ void k(JobInfo.Builder r1) {
        r1.setExpedited(true);
    }

    public static /* bridge */ /* synthetic */ void l(MediaCodec r0, ArrayList r1) {
        r0.unsubscribeFromVendorParameters(r1);
    }

    public static /* bridge */ /* synthetic */ void m(PlaybackSession r0, TrackChangeEvent r1) {
        r0.reportTrackChangeEvent(r1);
    }

    public static /* bridge */ /* synthetic */ void n(TrackChangeEvent.Builder r1) {
        r1.setTrackState(0);
    }

    public static /* bridge */ /* synthetic */ void o(TrackChangeEvent.Builder r0, float r1) {
        r0.setVideoFrameRate(r1);
    }

    public static /* bridge */ /* synthetic */ void p(TrackChangeEvent.Builder r0, int r1) {
        r0.setAudioSampleRate(r1);
    }

    public static /* bridge */ /* synthetic */ void q(TrackChangeEvent.Builder r0, String r1) {
        r0.setLanguage(r1);
    }

    public static /* bridge */ /* synthetic */ void r(MediaSession r0, ComponentName r1) {
        r0.setMediaButtonBroadcastReceiver(r1);
    }

    public static /* bridge */ /* synthetic */ void s(TelephonyManager r0, t53 r1) {
        r0.unregisterTelephonyCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void t(TelephonyManager r0, Executor r1, t53 r2) {
        r0.registerTelephonyCallback(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void u(ScrollCaptureTarget r0, Rect r1) {
        r0.setScrollBounds(r1);
    }

    public static /* bridge */ /* synthetic */ boolean v(PendingIntent r0) {
        return r0.isActivity();
    }

    public static /* bridge */ /* synthetic */ boolean w(LogSessionId r1) {
        return r1.equals(LogSessionId.LOG_SESSION_ID_NONE);
    }

    public static /* bridge */ /* synthetic */ boolean x(View r0) {
        return r0 instanceof SplashScreenView;
    }

    public static /* bridge */ /* synthetic */ boolean y(IllegalStateException r0) {
        return r0 instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ int[] z(NetworkRequest r0) {
        return r0.getTransportTypes();
    }
}
