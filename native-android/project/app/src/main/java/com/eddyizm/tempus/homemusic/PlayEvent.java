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
    public static final ih3 Companion = null;
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

    static {
        Companion = new ih3();
    }

    public /* synthetic */ PlayEvent(String r28, String r29, String r30, String r31, String r32, Double r33, Double r34, String r35, String r36, String r37, String r38, String r39, Map r40, String r41, boolean r42, String r43, String r44, String r45, Long r46, Map r47, String r48, String r49, String r50, int r51, xj0 r52) {
        if ((r51 & 8) == 0) goto L5;
        String r7 = null;
    L7:
        if ((r51 & 16) == 0) goto L9;
        String r8 = null;
    L11:
        if ((r51 & 32) == 0) goto L13;
        Double r9 = null;
    L15:
        if ((r51 & 64) == 0) goto L17;
        Double r10 = null;
    L19:
        if ((r51 & 128) == 0) goto L21;
        String r11 = null;
    L23:
        if ((r51 & 512) == 0) goto L25;
        String r13 = null;
    L27:
        if ((r51 & 1024) == 0) goto L29;
        String r14 = null;
    L31:
        if ((r51 & 2048) == 0) goto L33;
        String r15 = null;
    L35:
        if ((r51 & 4096) == 0) goto L37;
        Map r16 = null;
    L39:
        if ((r51 & 8192) == 0) goto L41;
        String r17 = null;
    L43:
        if ((r51 & 16384) == 0) goto L45;
        boolean r18 = false;
    L47:
        if ((32768 & r51) == 0) goto L49;
        String r19 = null;
    L51:
        if ((65536 & r51) == 0) goto L53;
        String r20 = null;
    L55:
        if ((131072 & r51) == 0) goto L57;
        String r21 = null;
    L59:
        if ((262144 & r51) == 0) goto L61;
        Long r22 = null;
    L63:
        if ((524288 & r51) == 0) goto L65;
        Map r23 = null;
    L67:
        if ((1048576 & r51) == 0) goto L69;
        String r24 = null;
    L71:
        if ((2097152 & r51) == 0) goto L73;
        String r25 = null;
    L75:
        if ((r51 & 4194304) == 0) goto L78;
        String r26 = null;
    L79:
        this(r28, r29, r30, r7, r8, r9, r10, r11, r36, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        return;
    L78:
        r26 = r50;
        goto L79
    L73:
        r25 = r49;
        goto L75
    L69:
        r24 = r48;
        goto L71
    L65:
        r23 = r47;
        goto L67
    L61:
        r22 = r46;
        goto L63
    L57:
        r21 = r45;
        goto L59
    L53:
        r20 = r44;
        goto L55
    L49:
        r19 = r43;
        goto L51
    L45:
        r18 = r42;
        goto L47
    L41:
        r17 = r41;
        goto L43
    L37:
        r16 = r40;
        goto L39
    L33:
        r15 = r39;
        goto L35
    L29:
        r14 = r38;
        goto L31
    L25:
        r13 = r37;
        goto L27
    L21:
        r11 = r35;
        goto L23
    L17:
        r10 = r34;
        goto L19
    L13:
        r9 = r33;
        goto L15
    L9:
        r8 = r32;
        goto L11
    L5:
        r7 = r31;
        goto L7
    }

    public static /* synthetic */ boolean supported$default(PlayEvent r0, boolean r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r1;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = true;
    L9:
        return r0.supported(r1, r2, r3);
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

    public final void setRejected(String r1) {
        this.rejected = r1;
    }

    public final boolean supported(boolean r3, boolean r4, boolean r5) {
        if (h12.c(this.kind, "progress") == false) goto L5;
    L8:
        if (r5 == true) goto L10;
        return false;
    L10:
        if (this.compensationChain == false) goto L12;
        if (r4 == true) goto L12;
        return false;
    L12:
        if (r3 == true) goto L19;
        String r6 = this.targetType;
        if (r6 == null) goto L18;
        if (h12.c(r6, "track") == true) goto L18;
        return false;
    L18:
        if (this.revertsEventId != null) goto L26;
        return true;
    L26:
        return false;
    L19:
        return true;
    L5:
        if (h12.c(this.kind, "interrupted") == true) goto L8;
        if (h12.c(this.kind, "error") == false) goto L10;
        goto L8
    }

    public PlayEvent(String r1, String r2, String r3, String r4, String r5, Double r6, Double r7, String r8, String r9, String r10, String r11, String r12, Map<String, String> r13, String r14, boolean r15, String r16, String r17, String r18, Long r19, Map<String, ? extends Object> r20, String r21, String r22, String r23) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r9.getClass();
        this.eventId = r1;
        this.ts = r2;
        this.kind = r3;
        this.ref = r4;
        this.ndSongId = r5;
        this.positionS = r6;
        this.durationS = r7;
        this.context = r8;
        this.client = r9;
        this.targetType = r10;
        this.ndAlbumId = r11;
        this.ndArtistId = r12;
        this.targetData = r13;
        this.revertsEventId = r14;
        this.compensationChain = r15;
        this.account = r16;
        this.playbackId = r17;
        this.deviceId = r18;
        this.listenedMs = r19;
        this.trackMetadata = r20;
        this.rejected = r21;
        this.launchId = r22;
        this.launchOrigin = r23;
    }
}
