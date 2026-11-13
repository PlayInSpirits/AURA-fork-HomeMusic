/*
 * Decompiled with CFR 0.152.
 */
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

public abstract class fo2 {
    public static void A(PlaybackMetrics.Builder builder, int n16) {
        builder.setVideoFramesPlayed(n16);
    }

    public static void B(PlaybackMetrics.Builder builder, int n16) {
        builder.setStreamSource(n16);
    }

    public static void C(PlaybackMetrics.Builder builder, int n16) {
        builder.setStreamType(n16);
    }

    public static void D(PlaybackMetrics.Builder builder, int n16) {
        builder.setPlaybackType(n16);
    }

    public static LogSessionId a(PlaybackSession playbackSession) {
        return playbackSession.getSessionId();
    }

    public static MediaMetricsManager b(Object object) {
        return (MediaMetricsManager)object;
    }

    public static PlaybackErrorEvent.Builder c(PlaybackErrorEvent.Builder builder, int n16) {
        return builder.setErrorCode(n16);
    }

    public static PlaybackErrorEvent.Builder d(PlaybackErrorEvent.Builder builder, long l16) {
        return builder.setTimeSinceCreatedMillis(l16);
    }

    public static PlaybackErrorEvent.Builder e(PlaybackErrorEvent.Builder builder, PlaybackException playbackException) {
        return builder.setException(playbackException);
    }

    public static PlaybackErrorEvent f(PlaybackErrorEvent.Builder builder) {
        return builder.build();
    }

    public static PlaybackMetrics.Builder g(PlaybackMetrics.Builder builder) {
        return builder.setPlayerName("AndroidXMedia3");
    }

    public static PlaybackMetrics.Builder h(Object object) {
        return (PlaybackMetrics.Builder)object;
    }

    public static PlaybackMetrics i(PlaybackMetrics.Builder builder) {
        return builder.build();
    }

    public static PlaybackSession j(MediaMetricsManager mediaMetricsManager) {
        return mediaMetricsManager.createPlaybackSession();
    }

    public static PlaybackStateEvent.Builder k(PlaybackStateEvent.Builder builder, int n16) {
        return builder.setState(n16);
    }

    public static PlaybackStateEvent.Builder l(PlaybackStateEvent.Builder builder, long l16) {
        return builder.setTimeSinceCreatedMillis(l16);
    }

    public static PlaybackStateEvent m(PlaybackStateEvent.Builder builder) {
        return builder.build();
    }

    public static TrackChangeEvent.Builder n(TrackChangeEvent.Builder builder, long l16) {
        return builder.setTimeSinceCreatedMillis(l16);
    }

    public static void o(PlaybackMetrics.Builder builder, int n16) {
        builder.setDrmType(n16);
    }

    public static void p(PlaybackMetrics.Builder builder, long l16) {
        builder.setNetworkTransferDurationMillis(l16);
    }

    public static void q(PlaybackSession playbackSession, NetworkEvent networkEvent) {
        playbackSession.reportNetworkEvent(networkEvent);
    }

    public static void r(PlaybackSession playbackSession, PlaybackErrorEvent playbackErrorEvent) {
        playbackSession.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public static void s(PlaybackSession playbackSession, PlaybackMetrics playbackMetrics) {
        playbackSession.reportPlaybackMetrics(playbackMetrics);
    }

    public static void t(PlaybackSession playbackSession, PlaybackStateEvent playbackStateEvent) {
        playbackSession.reportPlaybackStateEvent(playbackStateEvent);
    }

    public static PlaybackErrorEvent.Builder u(PlaybackErrorEvent.Builder builder, int n16) {
        return builder.setSubErrorCode(n16);
    }

    public static PlaybackMetrics.Builder v(PlaybackMetrics.Builder builder) {
        return builder.setPlayerVersion("1.9.2");
    }

    public static void w(PlaybackMetrics.Builder builder, int n16) {
        builder.setAudioUnderrunCount(n16);
    }

    public static void x(PlaybackMetrics.Builder builder, long l16) {
        builder.setNetworkBytesRead(l16);
    }

    public static void y(PlaybackMetrics.Builder builder, int n16) {
        builder.setVideoFramesDropped(n16);
    }

    public static void z(PlaybackMetrics.Builder builder, long l16) {
        builder.setMediaDurationMillis(l16);
    }
}

