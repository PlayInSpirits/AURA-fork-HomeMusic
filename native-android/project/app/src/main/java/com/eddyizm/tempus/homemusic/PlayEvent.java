package com.eddyizm.tempus.homemusic;

import defpackage.h12;
import defpackage.ih3;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PlayEvent {
    public static final int $stable = 8;
    public static final ih3 Companion = new ih3();
    public static final String DISLIKE = "dislike";
    public static final String FINISH = "finish";
    public static final String LIKE = "like";
    public static final String SKIP = "skip";
    public static final String START = "start";
    public static final String UNDISLIKE = "undislike";
    public static final String UNLIKE = "unlike";

    @ka4("_account")
    private final String account;
    private final String client;

    @ka4("_compensation_chain")
    private final boolean compensationChain;
    private final String context;

    @ka4("device_id")
    private final String deviceId;

    @ka4("duration_s")
    private final Double durationS;

    @ka4("event_id")
    private final String eventId;
    private final String kind;

    @ka4("launch_id")
    private final String launchId;

    @ka4("launch_origin")
    private final String launchOrigin;

    @ka4("listened_ms")
    private final Long listenedMs;

    @ka4("nd_album_id")
    private final String ndAlbumId;

    @ka4("nd_artist_id")
    private final String ndArtistId;

    @ka4("nd_song_id")
    private final String ndSongId;

    @ka4("playback_id")
    private final String playbackId;

    @ka4("position_s")
    private final Double positionS;
    private final String ref;

    @ka4("_rejected")
    private String rejected;

    @ka4("reverts_event_id")
    private final String revertsEventId;

    @ka4("target_data")
    private final Map<String, String> targetData;

    @ka4("target_type")
    private final String targetType;

    @ka4("track_metadata")
    private final Map<String, Object> trackMetadata;
    private final String ts;

    public /* synthetic */ PlayEvent(String str, String str2, String str3, String str4, String str5, Double d, Double d2, String str6, String str7, String str8, String str9, String str10, Map map, String str11, boolean z, String str12, String str13, String str14, Long l, Map map2, String str15, String str16, String str17, int i, xj0 xj0Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : str6, str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : map, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? false : z, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (131072 & i) != 0 ? null : str14, (262144 & i) != 0 ? null : l, (524288 & i) != 0 ? null : map2, (1048576 & i) != 0 ? null : str15, (2097152 & i) != 0 ? null : str16, (i & 4194304) != 0 ? null : str17);
    }

    public static /* synthetic */ boolean supported$default(PlayEvent playEvent, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = z;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return playEvent.supported(z, z2, z3);
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getClient() {
        return this.client;
    }

    public final boolean getCompensationChain() {
        return this.compensationChain;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Double getDurationS() {
        return this.durationS;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLaunchId() {
        return this.launchId;
    }

    public final String getLaunchOrigin() {
        return this.launchOrigin;
    }

    public final Long getListenedMs() {
        return this.listenedMs;
    }

    public final String getNdAlbumId() {
        return this.ndAlbumId;
    }

    public final String getNdArtistId() {
        return this.ndArtistId;
    }

    public final String getNdSongId() {
        return this.ndSongId;
    }

    public final String getPlaybackId() {
        return this.playbackId;
    }

    public final Double getPositionS() {
        return this.positionS;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getRejected() {
        return this.rejected;
    }

    public final String getRevertsEventId() {
        return this.revertsEventId;
    }

    public final Map<String, String> getTargetData() {
        return this.targetData;
    }

    public final String getTargetType() {
        return this.targetType;
    }

    public final Map<String, Object> getTrackMetadata() {
        return this.trackMetadata;
    }

    public final String getTs() {
        return this.ts;
    }

    public final void setRejected(String str) {
        this.rejected = str;
    }

    public final boolean supported(boolean z, boolean z2, boolean z3) {
        if ((h12.c(this.kind, "progress") || h12.c(this.kind, "interrupted") || h12.c(this.kind, "error")) && !z3) {
            return false;
        }
        if (this.compensationChain && !z2) {
            return false;
        }
        if (z) {
            return true;
        }
        String str = this.targetType;
        return (str == null || h12.c(str, "track")) && this.revertsEventId == null;
    }

    public PlayEvent(String str, String str2, String str3, String str4, String str5, Double d, Double d2, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, boolean z, String str12, String str13, String str14, Long l, Map<String, ? extends Object> map2, String str15, String str16, String str17) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str7.getClass();
        this.eventId = str;
        this.ts = str2;
        this.kind = str3;
        this.ref = str4;
        this.ndSongId = str5;
        this.positionS = d;
        this.durationS = d2;
        this.context = str6;
        this.client = str7;
        this.targetType = str8;
        this.ndAlbumId = str9;
        this.ndArtistId = str10;
        this.targetData = map;
        this.revertsEventId = str11;
        this.compensationChain = z;
        this.account = str12;
        this.playbackId = str13;
        this.deviceId = str14;
        this.listenedMs = l;
        this.trackMetadata = map2;
        this.rejected = str15;
        this.launchId = str16;
        this.launchOrigin = str17;
    }
}
