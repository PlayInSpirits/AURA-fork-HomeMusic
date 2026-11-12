package defpackage;

import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import androidx.media3.common.PlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fo2 {
    public static /* bridge */ /* synthetic */ void A(PlaybackMetrics.Builder r0, int r1) {
        r0.setVideoFramesPlayed(r1);
    }

    public static /* bridge */ /* synthetic */ void B(PlaybackMetrics.Builder r0, int r1) {
        r0.setStreamSource(r1);
    }

    public static /* bridge */ /* synthetic */ void C(PlaybackMetrics.Builder r0, int r1) {
        r0.setStreamType(r1);
    }

    public static /* bridge */ /* synthetic */ void D(PlaybackMetrics.Builder r0, int r1) {
        r0.setPlaybackType(r1);
    }

    public static /* bridge */ /* synthetic */ LogSessionId a(PlaybackSession r0) {
        return r0.getSessionId();
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object r0) {
        return (MediaMetricsManager) r0;
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder c(PlaybackErrorEvent.Builder r0, int r1) {
        return r0.setErrorCode(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder d(PlaybackErrorEvent.Builder r0, long r1) {
        return r0.setTimeSinceCreatedMillis(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder e(PlaybackErrorEvent.Builder r0, PlaybackException r1) {
        return r0.setException(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent f(PlaybackErrorEvent.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder g(PlaybackMetrics.Builder r1) {
        return r1.setPlayerName("AndroidXMedia3");
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder h(Object r0) {
        return (PlaybackMetrics.Builder) r0;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics i(PlaybackMetrics.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ PlaybackSession j(MediaMetricsManager r0) {
        return r0.createPlaybackSession();
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder k(PlaybackStateEvent.Builder r0, int r1) {
        return r0.setState(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder l(PlaybackStateEvent.Builder r0, long r1) {
        return r0.setTimeSinceCreatedMillis(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent m(PlaybackStateEvent.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder n(TrackChangeEvent.Builder r0, long r1) {
        return r0.setTimeSinceCreatedMillis(r1);
    }

    public static /* bridge */ /* synthetic */ void o(PlaybackMetrics.Builder r0, int r1) {
        r0.setDrmType(r1);
    }

    public static /* bridge */ /* synthetic */ void p(PlaybackMetrics.Builder r0, long r1) {
        r0.setNetworkTransferDurationMillis(r1);
    }

    public static /* bridge */ /* synthetic */ void q(PlaybackSession r0, NetworkEvent r1) {
        r0.reportNetworkEvent(r1);
    }

    public static /* bridge */ /* synthetic */ void r(PlaybackSession r0, PlaybackErrorEvent r1) {
        r0.reportPlaybackErrorEvent(r1);
    }

    public static /* bridge */ /* synthetic */ void s(PlaybackSession r0, PlaybackMetrics r1) {
        r0.reportPlaybackMetrics(r1);
    }

    public static /* bridge */ /* synthetic */ void t(PlaybackSession r0, PlaybackStateEvent r1) {
        r0.reportPlaybackStateEvent(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder u(PlaybackErrorEvent.Builder r0, int r1) {
        return r0.setSubErrorCode(r1);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder v(PlaybackMetrics.Builder r1) {
        return r1.setPlayerVersion("1.9.2");
    }

    public static /* bridge */ /* synthetic */ void w(PlaybackMetrics.Builder r0, int r1) {
        r0.setAudioUnderrunCount(r1);
    }

    public static /* bridge */ /* synthetic */ void x(PlaybackMetrics.Builder r0, long r1) {
        r0.setNetworkBytesRead(r1);
    }

    public static /* bridge */ /* synthetic */ void y(PlaybackMetrics.Builder r0, int r1) {
        r0.setVideoFramesDropped(r1);
    }

    public static /* bridge */ /* synthetic */ void z(PlaybackMetrics.Builder r0, long r1) {
        r0.setMediaDurationMillis(r1);
    }
}
