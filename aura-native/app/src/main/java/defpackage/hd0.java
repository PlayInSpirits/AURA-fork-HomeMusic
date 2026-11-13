/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.ClipData;
import android.content.res.Configuration;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;

public abstract class hd0 {
    public static void A(TrackChangeEvent.Builder builder, int n16) {
        builder.setWidth(n16);
    }

    public static void B(TrackChangeEvent.Builder builder, String string) {
        builder.setCodecName(string);
    }

    public static void C(TrackChangeEvent.Builder builder, int n16) {
        builder.setHeight(n16);
    }

    public static void D(TrackChangeEvent.Builder builder, int n16) {
        builder.setChannelCount(n16);
    }

    public static int a(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static int b(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
    }

    public static int c(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static ClipData d(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static MediaDrm.PlaybackComponent e(MediaDrm mediaDrm, byte[] byArray) {
        return mediaDrm.getPlaybackComponent(byArray);
    }

    public static MediaDrm.PlaybackComponent f(Object object) {
        return (MediaDrm.PlaybackComponent)object;
    }

    public static NetworkEvent.Builder g(NetworkEvent.Builder builder, int n16) {
        return builder.setNetworkType(n16);
    }

    public static NetworkEvent.Builder h(NetworkEvent.Builder builder, long l16) {
        return builder.setTimeSinceCreatedMillis(l16);
    }

    public static NetworkEvent i(NetworkEvent.Builder builder) {
        return builder.build();
    }

    public static PlaybackMetrics.Builder j() {
        return new PlaybackMetrics.Builder();
    }

    public static PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }

    public static TrackChangeEvent l(TrackChangeEvent.Builder builder) {
        return builder.build();
    }

    public static ContentInfo m(Object object) {
        return (ContentInfo)object;
    }

    public static RoundedCorner n(Display display, int n16) {
        return display.getRoundedCorner(n16);
    }

    public static RoundedCorner o(WindowInsets windowInsets, int n16) {
        return windowInsets.getRoundedCorner(n16);
    }

    public static String p(LogSessionId logSessionId) {
        return logSessionId.getStringId();
    }

    public static void q(MediaDrm.PlaybackComponent playbackComponent, LogSessionId logSessionId) {
        playbackComponent.setLogSessionId(logSessionId);
    }

    public static void r(TrackChangeEvent.Builder builder) {
        builder.setTrackState(1);
    }

    public static void s(TrackChangeEvent.Builder builder, int n16) {
        builder.setTrackChangeReason(n16);
    }

    public static void t(TrackChangeEvent.Builder builder, String string) {
        builder.setContainerMimeType(string);
    }

    public static void u(ContentInfo.Builder builder, Uri uri) {
        builder.setLinkUri(uri);
    }

    public static void v(ContentInfo.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static boolean w(MediaDrm mediaDrm, String string, int n16) {
        return mediaDrm.requiresSecureDecoder(string, n16);
    }

    public static int x(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static void y(TrackChangeEvent.Builder builder, int n16) {
        builder.setBitrate(n16);
    }

    public static void z(TrackChangeEvent.Builder builder, String string) {
        builder.setSampleMimeType(string);
    }
}

