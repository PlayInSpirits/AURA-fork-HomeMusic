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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hd0 {
    public static /* bridge */ /* synthetic */ void A(TrackChangeEvent.Builder r0, int r1) {
        r0.setWidth(r1);
    }

    public static /* bridge */ /* synthetic */ void B(TrackChangeEvent.Builder r0, String r1) {
        r0.setCodecName(r1);
    }

    public static /* bridge */ /* synthetic */ void C(TrackChangeEvent.Builder r0, int r1) {
        r0.setHeight(r1);
    }

    public static /* bridge */ /* synthetic */ void D(TrackChangeEvent.Builder r0, int r1) {
        r0.setChannelCount(r1);
    }

    public static /* bridge */ /* synthetic */ int a(Configuration r0) {
        return r0.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ int b(AudioFormat r0, AudioAttributes r1) {
        return AudioManager.getPlaybackOffloadSupport(r0, r1);
    }

    public static /* bridge */ /* synthetic */ int c(ContentInfo r0) {
        return r0.getFlags();
    }

    public static /* bridge */ /* synthetic */ ClipData d(ContentInfo r0) {
        return r0.getClip();
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(MediaDrm r0, byte[] r1) {
        return r0.getPlaybackComponent(r1);
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent f(Object r0) {
        return (MediaDrm.PlaybackComponent) r0;
    }

    public static /* bridge */ /* synthetic */ NetworkEvent.Builder g(NetworkEvent.Builder r0, int r1) {
        return r0.setNetworkType(r1);
    }

    public static /* bridge */ /* synthetic */ NetworkEvent.Builder h(NetworkEvent.Builder r0, long r1) {
        return r0.setTimeSinceCreatedMillis(r1);
    }

    public static /* bridge */ /* synthetic */ NetworkEvent i(NetworkEvent.Builder r0) {
        return r0.build();
    }

    public static /* synthetic */ PlaybackMetrics.Builder j() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent l(TrackChangeEvent.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object r0) {
        return (ContentInfo) r0;
    }

    public static /* bridge */ /* synthetic */ RoundedCorner n(Display r0, int r1) {
        return r0.getRoundedCorner(r1);
    }

    public static /* bridge */ /* synthetic */ RoundedCorner o(WindowInsets r0, int r1) {
        return r0.getRoundedCorner(r1);
    }

    public static /* bridge */ /* synthetic */ String p(LogSessionId r0) {
        return r0.getStringId();
    }

    public static /* bridge */ /* synthetic */ void q(MediaDrm.PlaybackComponent r0, LogSessionId r1) {
        r0.setLogSessionId(r1);
    }

    public static /* bridge */ /* synthetic */ void r(TrackChangeEvent.Builder r1) {
        r1.setTrackState(1);
    }

    public static /* bridge */ /* synthetic */ void s(TrackChangeEvent.Builder r0, int r1) {
        r0.setTrackChangeReason(r1);
    }

    public static /* bridge */ /* synthetic */ void t(TrackChangeEvent.Builder r0, String r1) {
        r0.setContainerMimeType(r1);
    }

    public static /* bridge */ /* synthetic */ void u(ContentInfo.Builder r0, Uri r1) {
        r0.setLinkUri(r1);
    }

    public static /* bridge */ /* synthetic */ void v(ContentInfo.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }

    public static /* bridge */ /* synthetic */ boolean w(MediaDrm r0, String r1, int r2) {
        return r0.requiresSecureDecoder(r1, r2);
    }

    public static /* bridge */ /* synthetic */ int x(ContentInfo r0) {
        return r0.getSource();
    }

    public static /* bridge */ /* synthetic */ void y(TrackChangeEvent.Builder r0, int r1) {
        r0.setBitrate(r1);
    }

    public static /* bridge */ /* synthetic */ void z(TrackChangeEvent.Builder r0, String r1) {
        r0.setSampleMimeType(r1);
    }
}
