package com.eddyizm.tempus.model;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.provider.AlbumArtContentProvider;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import defpackage.an2;
import defpackage.bn2;
import defpackage.cn2;
import defpackage.co2;
import defpackage.do2;
import defpackage.e03;
import defpackage.gb;
import defpackage.gn2;
import defpackage.gy3;
import defpackage.h12;
import defpackage.n61;
import defpackage.rr2;
import defpackage.si0;
import defpackage.um2;
import defpackage.vl1;
import defpackage.wm2;
import defpackage.xa3;
import defpackage.xm2;
import defpackage.yc5;
import defpackage.ym2;
import defpackage.yw1;
import defpackage.zm2;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SessionMediaItem {
    public static final int $stable = 8;
    private String album;
    private String albumId;
    private String artist;
    private String artistId;
    private Double averageRating;
    private Integer bitrate;
    private Long bookmarkPosition;
    private String contentType;
    private String coverArtId;
    private Date created;
    private Integer discNumber;
    private Integer duration;
    private String genre;
    private String id;
    private int index;
    private boolean isDir;
    private boolean isVideo;
    private Integer originalHeight;
    private Integer originalWidth;
    private String parentId;
    private String path;
    private Long playCount;
    private ReplayGainInfo replayGain;
    private Long size;
    private Date starred;
    private String streamId;
    private String streamUrl;
    private String suffix;
    private Long timestamp;
    private String title;
    private Integer track;
    private String transcodedContentType;
    private String transcodedSuffix;
    private String type;
    private Integer userRating;
    private Integer year;

    public SessionMediaItem(Child r2) {
        r2.getClass();
        this();
        this.id = r2.getId();
        this.parentId = r2.getParentId();
        this.isDir = r2.isDir();
        this.title = r2.getTitle();
        this.album = r2.getAlbum();
        this.artist = r2.getArtist();
        this.track = r2.getTrack();
        this.year = r2.getYear();
        this.genre = r2.getGenre();
        this.coverArtId = r2.getCoverArtId();
        this.size = r2.getSize();
        this.contentType = r2.getContentType();
        this.suffix = r2.getSuffix();
        this.transcodedContentType = r2.getTranscodedContentType();
        this.transcodedSuffix = r2.getTranscodedSuffix();
        this.duration = r2.getDuration();
        this.bitrate = r2.getBitrate();
        this.path = r2.getPath();
        this.isVideo = r2.isVideo();
        this.userRating = r2.getUserRating();
        this.averageRating = r2.getAverageRating();
        this.playCount = r2.getPlayCount();
        this.discNumber = r2.getDiscNumber();
        this.created = r2.getCreated();
        this.starred = r2.getStarred();
        this.albumId = r2.getAlbumId();
        this.artistId = r2.getArtistId();
        this.type = "music";
        this.bookmarkPosition = r2.getBookmarkPosition();
        this.originalWidth = r2.getOriginalWidth();
        this.originalHeight = r2.getOriginalHeight();
        this.replayGain = r2.getReplayGain();
    }

    private final Uri getStreamUri() {
        String r0 = this.type;
        if (r0 == null) goto L26;
        int r2 = r0.hashCode();
        if (r2 == (-405568764)) goto L22;
        if (r2 == 104263205) goto L17;
        if (r2 != 108270587) goto L26;
        if (r0.equals(WaveOrigin.RADIO) == false) goto L26;
        Uri r4 = Uri.parse(this.streamUrl);
        r4.getClass();
        return r4;
    L17:
        if (r0.equals("music") == false) goto L26;
        Uri r5 = e03.j(0, this.id);
        r5.getClass();
        return r5;
    L22:
        if (r0.equals("podcast") == false) goto L26;
        Uri r6 = e03.j(0, this.streamId);
        r6.getClass();
        return r6;
    L26:
        Uri r7 = e03.j(0, this.id);
        r7.getClass();
        return r7;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getArtistId() {
        return this.artistId;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final Long getBookmarkPosition() {
        return this.bookmarkPosition;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCoverArtId() {
        return this.coverArtId;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final Integer getDiscNumber() {
        return this.discNumber;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final gn2 getMediaItem() {
        Uri r1 = getStreamUri();
        String r2 = this.coverArtId;
        ym2 r3 = null;
        if (r2 == null) goto L5;
        Uri r4 = AlbumArtContentProvider.a(r2);
    L6:
        Bundle r5 = new Bundle();
        r5.putString("id", this.id);
        r5.putString("parentId", this.parentId);
        r5.putBoolean("isDir", this.isDir);
        r5.putString("title", this.title);
        r5.putString("album", this.album);
        r5.putString("artist", this.artist);
        Integer r6 = this.track;
        boolean r7 = false;
        if (r6 == null) goto L9;
        int r8 = r6.intValue();
    L10:
        r5.putInt("track", r8);
        Integer r9 = this.year;
        if (r9 == null) goto L13;
        int r10 = r9.intValue();
    L14:
        r5.putInt("year", r10);
        r5.putString("genre", this.genre);
        r5.putString("coverArtId", this.coverArtId);
        Long r11 = this.size;
        long r12 = 0;
        if (r11 == null) goto L17;
        long r13 = r11.longValue();
    L18:
        r5.putLong("size", r13);
        r5.putString("contentType", this.contentType);
        r5.putString("suffix", this.suffix);
        r5.putString("transcodedContentType", this.transcodedContentType);
        r5.putString("transcodedSuffix", this.transcodedSuffix);
        Integer r14 = this.duration;
        if (r14 == null) goto L21;
        int r15 = r14.intValue();
    L22:
        r5.putInt("duration", r15);
        Integer r16 = this.bitrate;
        if (r16 == null) goto L25;
        int r17 = r16.intValue();
    L26:
        r5.putInt("bitrate", r17);
        r5.putString("path", this.path);
        r5.putBoolean("isVideo", this.isVideo);
        Integer r18 = this.userRating;
        if (r18 == null) goto L29;
        int r19 = r18.intValue();
    L30:
        r5.putInt("userRating", r19);
        Double r20 = this.averageRating;
        if (r20 == null) goto L33;
        double r21 = r20.doubleValue();
    L34:
        r5.putDouble("averageRating", r21);
        Long r22 = this.playCount;
        if (r22 == null) goto L37;
        long r23 = r22.longValue();
    L38:
        r5.putLong("playCount", r23);
        Integer r24 = this.discNumber;
        if (r24 == null) goto L41;
        int r25 = r24.intValue();
    L42:
        r5.putInt("discNumber", r25);
        Date r26 = this.created;
        if (r26 == null) goto L45;
        long r27 = r26.getTime();
    L46:
        r5.putLong("created", r27);
        Date r28 = this.starred;
        if (r28 == null) goto L49;
        long r29 = r28.getTime();
    L50:
        r5.putLong("starred", r29);
        r5.putString("albumId", this.albumId);
        r5.putString("artistId", this.artistId);
        r5.putString("type", this.type);
        Long r30 = this.bookmarkPosition;
        if (r30 == null) goto L53;
        r12 = r30.longValue();
    L53:
        r5.putLong("bookmarkPosition", r12);
        Integer r31 = this.originalWidth;
        if (r31 == null) goto L56;
        int r32 = r31.intValue();
    L57:
        r5.putInt("originalWidth", r32);
        Integer r33 = this.originalHeight;
        if (r33 == null) goto L60;
        int r34 = r33.intValue();
    L61:
        r5.putInt("originalHeight", r34);
        r5.putString("uri", r1.toString());
        si0.Z(r5, this.replayGain);
        um2 r110 = new um2();
        xm2 r35 = new xm2();
        List r36 = Collections.EMPTY_LIST;
        gy3 r37 = gy3.r;
        zm2 r111 = new zm2();
        cn2 r38 = cn2.d;
        String r112 = this.id;
        r112.getClass();
        co2 r39 = new co2();
        r39.a = this.title;
        Integer r113 = this.track;
        if (r113 == null) goto L64;
        int r114 = r113.intValue();
    L65:
        r39.n = Integer.valueOf(r114);
        Integer r115 = this.discNumber;
        if (r115 == null) goto L68;
        int r116 = r115.intValue();
    L69:
        r39.B = Integer.valueOf(r116);
        Integer r117 = this.year;
        if (r117 == null) goto L72;
        int r118 = r117.intValue();
    L73:
        r39.v = Integer.valueOf(r118);
        r39.c = this.album;
        r39.b = this.artist;
        r39.m = r4;
        if (h12.c(this.type, "music") == false) goto L81;
        String r119 = this.id;
        if (this.starred == null) goto L78;
        boolean r0 = true;
    L79:
        boolean r40 = n61.f(1, r119, r0);
    L84:
        r39.i = new vl1(r40);
        r39.I = yw1.k(gb.P(new String[]{"android.media3.session.demo.HEART_ON", "android.media3.session.demo.HEART_OFF"}));
        r39.H = r5;
        r39.q = Boolean.FALSE;
        r39.r = Boolean.TRUE;
        do2 r120 = new do2(r39);
        yc5 r41 = new yc5();
        r41.n = r1;
        r41.p = r5;
        cn2 r121 = new cn2(r41);
        if (((Uri) r35.e) != null) goto L87;
    L88:
        r7 = true;
    L89:
        rr2.w(r7);
        if (((UUID) r35.d) == null) goto L93;
        r3 = new ym2(r35);
    L93:
        return new gn2(r112, new wm2(r110), new bn2(r1, "audio", r3, null, r36, null, r37, -9223372036854775807L), new an2(r111), r120, r121);
    L87:
        if (((UUID) r35.d) == null) goto L89;
    L78:
        r0 = false;
        goto L79
    L81:
        if (this.starred == null) goto L83;
        r40 = true;
        goto L84
    L83:
        r40 = false;
        goto L84
    L72:
        r118 = 0;
        goto L73
    L68:
        r116 = 0;
        goto L69
    L64:
        r114 = 0;
        goto L65
    L60:
        r34 = 0;
        goto L61
    L56:
        r32 = 0;
        goto L57
    L49:
        r29 = 0;
        goto L50
    L45:
        r27 = 0;
        goto L46
    L41:
        r25 = 0;
        goto L42
    L37:
        r23 = 0;
        goto L38
    L33:
        r21 = 0.0d;
        goto L34
    L29:
        r19 = 0;
        goto L30
    L25:
        r17 = 0;
        goto L26
    L21:
        r15 = 0;
        goto L22
    L17:
        r13 = 0;
        goto L18
    L13:
        r10 = 0;
        goto L14
    L9:
        r8 = 0;
        goto L10
    L5:
        r4 = null;
        goto L6
    }

    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPath() {
        return this.path;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final ReplayGainInfo getReplayGain() {
        return this.replayGain;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Date getStarred() {
        return this.starred;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTrack() {
        return this.track;
    }

    public final String getTranscodedContentType() {
        return this.transcodedContentType;
    }

    public final String getTranscodedSuffix() {
        return this.transcodedSuffix;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getUserRating() {
        return this.userRating;
    }

    public final Integer getYear() {
        return this.year;
    }

    public final boolean isDir() {
        return this.isDir;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setAlbum(String r1) {
        this.album = r1;
    }

    public final void setAlbumId(String r1) {
        this.albumId = r1;
    }

    public final void setArtist(String r1) {
        this.artist = r1;
    }

    public final void setArtistId(String r1) {
        this.artistId = r1;
    }

    public final void setAverageRating(Double r1) {
        this.averageRating = r1;
    }

    public final void setBitrate(Integer r1) {
        this.bitrate = r1;
    }

    public final void setBookmarkPosition(Long r1) {
        this.bookmarkPosition = r1;
    }

    public final void setContentType(String r1) {
        this.contentType = r1;
    }

    public final void setCoverArtId(String r1) {
        this.coverArtId = r1;
    }

    public final void setCreated(Date r1) {
        this.created = r1;
    }

    public final void setDir(boolean r1) {
        this.isDir = r1;
    }

    public final void setDiscNumber(Integer r1) {
        this.discNumber = r1;
    }

    public final void setDuration(Integer r1) {
        this.duration = r1;
    }

    public final void setGenre(String r1) {
        this.genre = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setIndex(int r1) {
        this.index = r1;
    }

    public final void setOriginalHeight(Integer r1) {
        this.originalHeight = r1;
    }

    public final void setOriginalWidth(Integer r1) {
        this.originalWidth = r1;
    }

    public final void setParentId(String r1) {
        this.parentId = r1;
    }

    public final void setPath(String r1) {
        this.path = r1;
    }

    public final void setPlayCount(Long r1) {
        this.playCount = r1;
    }

    public final void setReplayGain(ReplayGainInfo r1) {
        this.replayGain = r1;
    }

    public final void setSize(Long r1) {
        this.size = r1;
    }

    public final void setStarred(Date r1) {
        this.starred = r1;
    }

    public final void setStreamId(String r1) {
        this.streamId = r1;
    }

    public final void setStreamUrl(String r1) {
        this.streamUrl = r1;
    }

    public final void setSuffix(String r1) {
        this.suffix = r1;
    }

    public final void setTimestamp(Long r1) {
        this.timestamp = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    public final void setTrack(Integer r1) {
        this.track = r1;
    }

    public final void setTranscodedContentType(String r1) {
        this.transcodedContentType = r1;
    }

    public final void setTranscodedSuffix(String r1) {
        this.transcodedSuffix = r1;
    }

    public final void setType(String r1) {
        this.type = r1;
    }

    public final void setUserRating(Integer r1) {
        this.userRating = r1;
    }

    public final void setVideo(boolean r1) {
        this.isVideo = r1;
    }

    public final void setYear(Integer r1) {
        this.year = r1;
    }

    public SessionMediaItem() {
    }

    public SessionMediaItem(PodcastEpisode r2) {
        r2.getClass();
        this();
        this.id = r2.getId();
        this.parentId = r2.getParentId();
        this.isDir = r2.isDir();
        this.title = r2.getTitle();
        this.album = r2.getAlbum();
        this.artist = r2.getArtist();
        this.year = r2.getYear();
        this.genre = r2.getGenre();
        this.coverArtId = r2.getCoverArtId();
        this.size = r2.getSize();
        this.contentType = r2.getContentType();
        this.suffix = r2.getSuffix();
        this.duration = r2.getDuration();
        this.bitrate = r2.getBitrate();
        this.path = r2.getPath();
        this.isVideo = r2.isVideo();
        this.created = r2.getCreated();
        this.artistId = r2.getArtistId();
        this.streamId = r2.getStreamId();
        this.type = "podcast";
    }

    public SessionMediaItem(InternetRadioStation r2) {
        r2.getClass();
        this();
        this.id = r2.getId();
        this.title = r2.getName();
        this.streamUrl = r2.getStreamUrl();
        this.type = WaveOrigin.RADIO;
        String r3 = r2.getHomePageUrl();
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.length() > 0) goto L7;
        return;
    L7:
        if (e03.n(r3) == false) goto L12;
        Charset r0 = StandardCharsets.UTF_8;
        r0.getClass();
        byte[] r4 = r3.getBytes(r0);
        r4.getClass();
        this.coverArtId = xa3.g("ir_", Base64.encodeToString(r4, 10));
        return;
    }
}
