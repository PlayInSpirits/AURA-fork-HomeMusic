package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h12;
import defpackage.ka4;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Child implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Child> CREATOR = null;
    private String album;

    @ka4(alternate = {"albumArtist"}, value = "displayAlbumArtist")
    private String albumArtist;
    private String albumId;
    private String artist;
    private String artistId;
    private Double averageRating;

    @ka4("bitDepth")
    private Integer bitDepth;

    @ka4("bitRate")
    private Integer bitrate;
    private Long bookmarkPosition;
    private String contentType;

    @ka4("coverArt")
    private String coverArtId;
    private Date created;
    private Integer discNumber;
    private Integer duration;

    @ka4("genre")
    private String genre;
    private final String id;
    private boolean isDir;

    @ka4("isVideo")
    private boolean isVideo;
    private Integer originalHeight;
    private Integer originalWidth;

    @ka4("parent")
    private String parentId;
    private String path;
    private Long playCount;

    @ka4("replayGain")
    private ReplayGainInfo replayGain;

    @ka4("samplingRate")
    private Integer samplingRate;
    private Long size;
    private Date starred;
    private String suffix;
    private String title;
    private Integer track;
    private String transcodedContentType;
    private String transcodedSuffix;
    private String type;
    private Integer userRating;
    private Integer year;

    static {
        CREATOR = new w4(13);
    }

    public /* synthetic */ Child(String r35, String r36, boolean r37, String r38, String r39, String r40, Integer r41, Integer r42, String r43, String r44, Long r45, String r46, String r47, String r48, String r49, Integer r50, Integer r51, Integer r52, Integer r53, String r54, boolean r55, Integer r56, Double r57, Long r58, Integer r59, Date r60, Date r61, String r62, String r63, String r64, Long r65, Integer r66, Integer r67, ReplayGainInfo r68, String r69, int r70, int r71, xj0 r72) {
        if ((r70 & 2) == 0) goto L5;
        String r1 = null;
    L6:
        boolean r4 = false;
        if ((r70 & 4) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r70 & 8) == 0) goto L13;
        String r5 = null;
    L15:
        if ((r70 & 16) == 0) goto L17;
        String r6 = null;
    L19:
        if ((r70 & 32) == 0) goto L21;
        String r7 = null;
    L23:
        if ((r70 & 64) == 0) goto L25;
        Integer r8 = null;
    L27:
        if ((r70 & 128) == 0) goto L29;
        Integer r9 = null;
    L31:
        if ((r70 & 256) == 0) goto L33;
        String r10 = null;
    L35:
        if ((r70 & 512) == 0) goto L37;
        String r11 = null;
    L39:
        if ((r70 & 1024) == 0) goto L41;
        Long r12 = null;
    L43:
        if ((r70 & 2048) == 0) goto L45;
        String r13 = null;
    L47:
        if ((r70 & 4096) == 0) goto L49;
        String r14 = null;
    L51:
        if ((r70 & 8192) == 0) goto L53;
        String r15 = null;
    L55:
        if ((r70 & 16384) == 0) goto L57;
        String r2 = null;
    L59:
        if ((r70 & 32768) == 0) goto L61;
        Integer r16 = null;
    L63:
        if ((r70 & 65536) == 0) goto L65;
        Integer r17 = null;
    L67:
        if ((r70 & 131072) == 0) goto L69;
        Integer r18 = null;
    L71:
        if ((r70 & 262144) == 0) goto L73;
        Integer r19 = null;
    L75:
        if ((r70 & 524288) == 0) goto L77;
        String r20 = null;
    L79:
        if ((r70 & 1048576) != 0) goto L83;
        r4 = r55;
    L83:
        if ((r70 & 2097152) == 0) goto L85;
        Integer r21 = null;
    L87:
        if ((r70 & 4194304) == 0) goto L89;
        Double r22 = null;
    L91:
        if ((r70 & 8388608) == 0) goto L93;
        Long r23 = null;
    L95:
        if ((r70 & 16777216) == 0) goto L97;
        Integer r24 = null;
    L99:
        if ((r70 & 33554432) == 0) goto L101;
        Date r25 = null;
    L103:
        if ((r70 & 67108864) == 0) goto L105;
        Date r26 = null;
    L107:
        if ((r70 & 134217728) == 0) goto L109;
        String r27 = null;
    L111:
        if ((r70 & 268435456) == 0) goto L113;
        String r28 = null;
    L115:
        if ((r70 & 536870912) == 0) goto L117;
        String r29 = null;
    L119:
        if ((r70 & 1073741824) == 0) goto L121;
        Long r30 = null;
    L123:
        if ((r70 & Integer.MIN_VALUE) == 0) goto L125;
        Integer r0 = null;
    L127:
        if ((r71 & 1) == 0) goto L129;
        Integer r31 = null;
    L131:
        if ((r71 & 2) == 0) goto L133;
        ReplayGainInfo r32 = null;
    L135:
        if ((r71 & 4) == 0) goto L138;
        String r73 = null;
    L139:
        this(r35, r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r4, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r0, r31, r32, r73);
        return;
    L138:
        r73 = r69;
        goto L139
    L133:
        r32 = r68;
        goto L135
    L129:
        r31 = r67;
        goto L131
    L125:
        r0 = r66;
        goto L127
    L121:
        r30 = r65;
        goto L123
    L117:
        r29 = r64;
        goto L119
    L113:
        r28 = r63;
        goto L115
    L109:
        r27 = r62;
        goto L111
    L105:
        r26 = r61;
        goto L107
    L101:
        r25 = r60;
        goto L103
    L97:
        r24 = r59;
        goto L99
    L93:
        r23 = r58;
        goto L95
    L89:
        r22 = r57;
        goto L91
    L85:
        r21 = r56;
        goto L87
    L77:
        r20 = r54;
        goto L79
    L73:
        r19 = r53;
        goto L75
    L69:
        r18 = r52;
        goto L71
    L65:
        r17 = r51;
        goto L67
    L61:
        r16 = r50;
        goto L63
    L57:
        r2 = r49;
        goto L59
    L53:
        r15 = r48;
        goto L55
    L49:
        r14 = r47;
        goto L51
    L45:
        r13 = r46;
        goto L47
    L41:
        r12 = r45;
        goto L43
    L37:
        r11 = r44;
        goto L39
    L33:
        r10 = r43;
        goto L35
    L29:
        r9 = r42;
        goto L31
    L25:
        r8 = r41;
        goto L27
    L21:
        r7 = r40;
        goto L23
    L17:
        r6 = r39;
        goto L19
    L13:
        r5 = r38;
        goto L15
    L9:
        r3 = r37;
        goto L11
    L5:
        r1 = r36;
        goto L6
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if ((r9 instanceof Child) == true) goto L8;
        return false;
    L8:
        Child r10 = (Child) r9;
        if (h12.c(getId(), r10.getId()) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.parentId, r10.parentId) == true) goto L15;
        return false;
    L15:
        if (this.isDir == r10.isDir) goto L18;
        return false;
    L18:
        if (h12.c(this.title, r10.title) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.album, r10.album) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.artist, r10.artist) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.track, r10.track) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.year, r10.year) == true) goto L33;
        return false;
    L33:
        if (h12.c(this.genre, r10.genre) == true) goto L36;
        return false;
    L36:
        if (h12.c(this.coverArtId, r10.coverArtId) == true) goto L39;
        return false;
    L39:
        if (h12.c(this.size, r10.size) == true) goto L42;
        return false;
    L42:
        if (h12.c(this.contentType, r10.contentType) == true) goto L45;
        return false;
    L45:
        if (h12.c(this.suffix, r10.suffix) == true) goto L48;
        return false;
    L48:
        if (h12.c(this.transcodedContentType, r10.transcodedContentType) == true) goto L51;
        return false;
    L51:
        if (h12.c(this.transcodedSuffix, r10.transcodedSuffix) == true) goto L54;
        return false;
    L54:
        if (h12.c(this.duration, r10.duration) == true) goto L57;
        return false;
    L57:
        if (h12.c(this.bitrate, r10.bitrate) == true) goto L60;
        return false;
    L60:
        if (h12.c(this.samplingRate, r10.samplingRate) == true) goto L63;
        return false;
    L63:
        if (h12.c(this.bitDepth, r10.bitDepth) == true) goto L66;
        return false;
    L66:
        if (h12.c(this.path, r10.path) == true) goto L69;
        return false;
    L69:
        if (this.isVideo == r10.isVideo) goto L72;
        return false;
    L72:
        if (h12.c(this.userRating, r10.userRating) == true) goto L74;
        return false;
    L74:
        Double r1 = this.averageRating;
        Double r3 = r10.averageRating;
        if (r1 != null) goto L78;
        if (r3 == null) goto L82;
    L118:
        return false;
    L82:
        if (h12.c(this.playCount, r10.playCount) == true) goto L85;
        return false;
    L85:
        if (h12.c(this.discNumber, r10.discNumber) == true) goto L88;
        return false;
    L88:
        if (h12.c(this.created, r10.created) == true) goto L91;
        return false;
    L91:
        if (h12.c(this.starred, r10.starred) == true) goto L94;
        return false;
    L94:
        if (h12.c(this.albumId, r10.albumId) == true) goto L97;
        return false;
    L97:
        if (h12.c(this.artistId, r10.artistId) == true) goto L100;
        return false;
    L100:
        if (h12.c(this.type, r10.type) == true) goto L103;
        return false;
    L103:
        if (h12.c(this.bookmarkPosition, r10.bookmarkPosition) == true) goto L106;
        return false;
    L106:
        if (h12.c(this.originalWidth, r10.originalWidth) == true) goto L109;
        return false;
    L109:
        if (h12.c(this.originalHeight, r10.originalHeight) == true) goto L112;
        return false;
    L112:
        if (h12.c(this.replayGain, r10.replayGain) == true) goto L115;
        return false;
    L115:
        if (h12.c(this.albumArtist, r10.albumArtist) == true) goto L117;
        return false;
    L117:
        return true;
    L78:
        if (r3 == null) goto L118;
        if (r1.doubleValue() != r3.doubleValue()) goto L118;
        goto L118
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getAlbumArtist() {
        return this.albumArtist;
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

    public final Integer getBitDepth() {
        return this.bitDepth;
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

    public String getId() {
        return this.id;
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

    public final Integer getSamplingRate() {
        return this.samplingRate;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Date getStarred() {
        return this.starred;
    }

    public final String getSuffix() {
        return this.suffix;
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

    public int hashCode() {
        int r0 = getId().hashCode() * 31;
        String r2 = this.parentId;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int r1 = xa3.c((r0 + r4) * 31, 31, this.isDir);
        String r5 = this.title;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int r7 = (r1 + r6) * 31;
        String r8 = this.album;
        if (r8 == null) goto L13;
        int r9 = r8.hashCode();
    L14:
        int r10 = (r7 + r9) * 31;
        String r11 = this.artist;
        if (r11 == null) goto L17;
        int r12 = r11.hashCode();
    L18:
        int r13 = (r10 + r12) * 31;
        Integer r14 = this.track;
        if (r14 == null) goto L21;
        int r15 = r14.intValue();
    L22:
        int r16 = (r13 + r15) * 31;
        Integer r17 = this.year;
        if (r17 == null) goto L25;
        int r18 = r17.intValue();
    L26:
        int r19 = (r16 + r18) * 31;
        String r20 = this.genre;
        if (r20 == null) goto L29;
        int r21 = r20.hashCode();
    L30:
        int r22 = (r19 + r21) * 31;
        String r23 = this.coverArtId;
        if (r23 == null) goto L33;
        int r24 = r23.hashCode();
    L34:
        int r25 = (r22 + r24) * 31;
        Long r26 = this.size;
        if (r26 == null) goto L37;
        int r27 = Long.hashCode(r26.longValue());
    L38:
        int r28 = (r25 + r27) * 31;
        String r29 = this.contentType;
        if (r29 == null) goto L41;
        int r30 = r29.hashCode();
    L42:
        int r31 = (r28 + r30) * 31;
        String r32 = this.suffix;
        if (r32 == null) goto L45;
        int r33 = r32.hashCode();
    L46:
        int r34 = (r31 + r33) * 31;
        String r35 = this.transcodedContentType;
        if (r35 == null) goto L49;
        int r36 = r35.hashCode();
    L50:
        int r37 = (r34 + r36) * 31;
        String r38 = this.transcodedSuffix;
        if (r38 == null) goto L53;
        int r39 = r38.hashCode();
    L54:
        int r40 = (r37 + r39) * 31;
        Integer r41 = this.duration;
        if (r41 == null) goto L57;
        int r42 = r41.intValue();
    L58:
        int r43 = (r40 + r42) * 31;
        Integer r44 = this.bitrate;
        if (r44 == null) goto L61;
        int r45 = r44.intValue();
    L62:
        int r46 = (r43 + r45) * 31;
        Integer r47 = this.samplingRate;
        if (r47 == null) goto L65;
        int r48 = r47.intValue();
    L66:
        int r49 = (r46 + r48) * 31;
        Integer r50 = this.bitDepth;
        if (r50 == null) goto L69;
        int r51 = r50.intValue();
    L70:
        int r52 = (r49 + r51) * 31;
        String r53 = this.path;
        if (r53 == null) goto L73;
        int r54 = r53.hashCode();
    L74:
        int r55 = xa3.c((r52 + r54) * 31, 31, this.isVideo);
        Integer r56 = this.userRating;
        if (r56 == null) goto L77;
        int r57 = r56.intValue();
    L78:
        int r58 = (r55 + r57) * 31;
        Double r59 = this.averageRating;
        if (r59 == null) goto L81;
        int r60 = Double.hashCode(r59.doubleValue());
    L82:
        int r61 = (r58 + r60) * 31;
        Long r62 = this.playCount;
        if (r62 == null) goto L85;
        int r63 = Long.hashCode(r62.longValue());
    L86:
        int r64 = (r61 + r63) * 31;
        Integer r65 = this.discNumber;
        if (r65 == null) goto L89;
        int r66 = r65.intValue();
    L90:
        int r67 = (r64 + r66) * 31;
        Date r68 = this.created;
        if (r68 == null) goto L93;
        int r69 = r68.hashCode();
    L94:
        int r70 = (r67 + r69) * 31;
        Date r71 = this.starred;
        if (r71 == null) goto L97;
        int r72 = r71.hashCode();
    L98:
        int r73 = (r70 + r72) * 31;
        String r74 = this.albumId;
        if (r74 == null) goto L101;
        int r75 = r74.hashCode();
    L102:
        int r76 = (r73 + r75) * 31;
        String r77 = this.artistId;
        if (r77 == null) goto L105;
        int r78 = r77.hashCode();
    L106:
        int r79 = (r76 + r78) * 31;
        String r80 = this.type;
        if (r80 == null) goto L109;
        int r81 = r80.hashCode();
    L110:
        int r82 = (r79 + r81) * 31;
        Long r83 = this.bookmarkPosition;
        if (r83 == null) goto L113;
        int r84 = Long.hashCode(r83.longValue());
    L114:
        int r85 = (r82 + r84) * 31;
        Integer r86 = this.originalWidth;
        if (r86 == null) goto L117;
        int r87 = r86.intValue();
    L118:
        int r88 = (r85 + r87) * 31;
        Integer r89 = this.originalHeight;
        if (r89 == null) goto L121;
        int r90 = r89.intValue();
    L122:
        int r91 = (r88 + r90) * 31;
        ReplayGainInfo r92 = this.replayGain;
        if (r92 == null) goto L125;
        int r93 = r92.hashCode();
    L126:
        int r94 = (r91 + r93) * 31;
        String r95 = this.albumArtist;
        if (r95 == null) goto L130;
        r3 = r95.hashCode();
    L130:
        return r94 + r3;
    L125:
        r93 = 0;
        goto L126
    L121:
        r90 = 0;
        goto L122
    L117:
        r87 = 0;
        goto L118
    L113:
        r84 = 0;
        goto L114
    L109:
        r81 = 0;
        goto L110
    L105:
        r78 = 0;
        goto L106
    L101:
        r75 = 0;
        goto L102
    L97:
        r72 = 0;
        goto L98
    L93:
        r69 = 0;
        goto L94
    L89:
        r66 = 0;
        goto L90
    L85:
        r63 = 0;
        goto L86
    L81:
        r60 = 0;
        goto L82
    L77:
        r57 = 0;
        goto L78
    L73:
        r54 = 0;
        goto L74
    L69:
        r51 = 0;
        goto L70
    L65:
        r48 = 0;
        goto L66
    L61:
        r45 = 0;
        goto L62
    L57:
        r42 = 0;
        goto L58
    L53:
        r39 = 0;
        goto L54
    L49:
        r36 = 0;
        goto L50
    L45:
        r33 = 0;
        goto L46
    L41:
        r30 = 0;
        goto L42
    L37:
        r27 = 0;
        goto L38
    L33:
        r24 = 0;
        goto L34
    L29:
        r21 = 0;
        goto L30
    L25:
        r18 = 0;
        goto L26
    L21:
        r15 = 0;
        goto L22
    L17:
        r12 = 0;
        goto L18
    L13:
        r9 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
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

    public final void setAlbumArtist(String r1) {
        this.albumArtist = r1;
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

    public final void setBitDepth(Integer r1) {
        this.bitDepth = r1;
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

    public final void setSamplingRate(Integer r1) {
        this.samplingRate = r1;
    }

    public final void setSize(Long r1) {
        this.size = r1;
    }

    public final void setStarred(Date r1) {
        this.starred = r1;
    }

    public final void setSuffix(String r1) {
        this.suffix = r1;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r6, int r7) {
        r6.getClass();
        r6.writeString(this.id);
        r6.writeString(this.parentId);
        r6.writeInt(this.isDir ? 1 : 0);
        r6.writeString(this.title);
        r6.writeString(this.album);
        r6.writeString(this.artist);
        Integer r0 = this.track;
        if (r0 != null) goto L5;
        r6.writeInt(0);
    L6:
        Integer r1 = this.year;
        if (r1 != null) goto L9;
        r6.writeInt(0);
    L10:
        r6.writeString(this.genre);
        r6.writeString(this.coverArtId);
        Long r2 = this.size;
        if (r2 != null) goto L13;
        r6.writeInt(0);
    L14:
        r6.writeString(this.contentType);
        r6.writeString(this.suffix);
        r6.writeString(this.transcodedContentType);
        r6.writeString(this.transcodedSuffix);
        Integer r3 = this.duration;
        if (r3 != null) goto L17;
        r6.writeInt(0);
    L18:
        Integer r4 = this.bitrate;
        if (r4 != null) goto L21;
        r6.writeInt(0);
    L22:
        Integer r5 = this.samplingRate;
        if (r5 != null) goto L25;
        r6.writeInt(0);
    L26:
        Integer r8 = this.bitDepth;
        if (r8 != null) goto L29;
        r6.writeInt(0);
    L30:
        r6.writeString(this.path);
        r6.writeInt(this.isVideo ? 1 : 0);
        Integer r9 = this.userRating;
        if (r9 != null) goto L33;
        r6.writeInt(0);
    L34:
        Double r10 = this.averageRating;
        if (r10 != null) goto L37;
        r6.writeInt(0);
    L38:
        Long r11 = this.playCount;
        if (r11 != null) goto L41;
        r6.writeInt(0);
    L42:
        Integer r12 = this.discNumber;
        if (r12 != null) goto L45;
        r6.writeInt(0);
    L46:
        r6.writeSerializable(this.created);
        r6.writeSerializable(this.starred);
        r6.writeString(this.albumId);
        r6.writeString(this.artistId);
        r6.writeString(this.type);
        Long r13 = this.bookmarkPosition;
        if (r13 != null) goto L49;
        r6.writeInt(0);
    L50:
        Integer r14 = this.originalWidth;
        if (r14 != null) goto L53;
        r6.writeInt(0);
    L54:
        Integer r15 = this.originalHeight;
        if (r15 != null) goto L57;
        r6.writeInt(0);
    L58:
        ReplayGainInfo r16 = this.replayGain;
        if (r16 != null) goto L61;
        r6.writeInt(0);
    L62:
        r6.writeString(this.albumArtist);
        return;
    L61:
        r6.writeInt(1);
        r16.writeToParcel(r6, r7);
        goto L62
    L57:
        xa3.q(r6, 1, r15);
        goto L58
    L53:
        xa3.q(r6, 1, r14);
        goto L54
    L49:
        r6.writeInt(1);
        r6.writeLong(r13.longValue());
        goto L50
    L45:
        xa3.q(r6, 1, r12);
        goto L46
    L41:
        r6.writeInt(1);
        r6.writeLong(r11.longValue());
        goto L42
    L37:
        r6.writeInt(1);
        r6.writeDouble(r10.doubleValue());
        goto L38
    L33:
        xa3.q(r6, 1, r9);
        goto L34
    L29:
        xa3.q(r6, 1, r8);
        goto L30
    L25:
        xa3.q(r6, 1, r5);
        goto L26
    L21:
        xa3.q(r6, 1, r4);
        goto L22
    L17:
        xa3.q(r6, 1, r3);
        goto L18
    L13:
        r6.writeInt(1);
        r6.writeLong(r2.longValue());
        goto L14
    L9:
        xa3.q(r6, 1, r1);
        goto L10
    L5:
        xa3.q(r6, 1, r0);
        goto L6
    }

    public Child(String r40, String r41) {
        r40.getClass();
        boolean r3 = false;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -4;
        this(r40, r41, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42) {
        r40.getClass();
        String r4 = null;
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -8;
        this(r40, r41, r42, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43) {
        r40.getClass();
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -16;
        this(r40, r41, r42, r43, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44) {
        r40.getClass();
        String r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -32;
        this(r40, r41, r42, r43, r44, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45) {
        r40.getClass();
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -64;
        this(r40, r41, r42, r43, r44, r45, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46) {
        r40.getClass();
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -128;
        this(r40, r41, r42, r43, r44, r45, r46, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47) {
        r40.getClass();
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -256;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48) {
        r40.getClass();
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -512;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49) {
        r40.getClass();
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -1024;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50) {
        r40.getClass();
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -2048;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51) {
        r40.getClass();
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -4096;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52) {
        r40.getClass();
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -8192;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53) {
        r40.getClass();
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -16384;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54) {
        r40.getClass();
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -32768;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55) {
        r40.getClass();
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -65536;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56) {
        r40.getClass();
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -131072;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57) {
        r40.getClass();
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -262144;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58) {
        r40.getClass();
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -524288;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59) {
        r40.getClass();
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -1048576;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60) {
        r40.getClass();
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -2097152;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61) {
        r40.getClass();
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -4194304;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62) {
        r40.getClass();
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -8388608;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63) {
        r40.getClass();
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -16777216;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64) {
        r40.getClass();
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -33554432;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65) {
        r40.getClass();
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -67108864;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66) {
        r40.getClass();
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -134217728;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67) {
        r40.getClass();
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -268435456;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67, String r68) {
        r40.getClass();
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -536870912;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67, String r68, String r69) {
        r40.getClass();
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -1073741824;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r31, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67, String r68, String r69, Long r70) {
        r40.getClass();
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = Integer.MIN_VALUE;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r32, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67, String r68, String r69, Long r70, Integer r71) {
        r40.getClass();
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = 0;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r33, r34, r35, r36, 7, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67, String r68, String r69, Long r70, Integer r71, Integer r72) {
        r40.getClass();
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = 0;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r34, r35, r36, 6, null);
    }

    public Child(String r40, String r41, boolean r42, String r43, String r44, String r45, Integer r46, Integer r47, String r48, String r49, Long r50, String r51, String r52, String r53, String r54, Integer r55, Integer r56, Integer r57, Integer r58, String r59, boolean r60, Integer r61, Double r62, Long r63, Integer r64, Date r65, Date r66, String r67, String r68, String r69, Long r70, Integer r71, Integer r72, ReplayGainInfo r73) {
        r40.getClass();
        String r35 = null;
        int r36 = 0;
        this(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r35, r36, 4, null);
    }

    public Child(String r1, String r2, boolean r3, String r4, String r5, String r6, Integer r7, Integer r8, String r9, String r10, Long r11, String r12, String r13, String r14, String r15, Integer r16, Integer r17, Integer r18, Integer r19, String r20, boolean r21, Integer r22, Double r23, Long r24, Integer r25, Date r26, Date r27, String r28, String r29, String r30, Long r31, Integer r32, Integer r33, ReplayGainInfo r34, String r35) {
        r1.getClass();
        this.id = r1;
        this.parentId = r2;
        this.isDir = r3;
        this.title = r4;
        this.album = r5;
        this.artist = r6;
        this.track = r7;
        this.year = r8;
        this.genre = r9;
        this.coverArtId = r10;
        this.size = r11;
        this.contentType = r12;
        this.suffix = r13;
        this.transcodedContentType = r14;
        this.transcodedSuffix = r15;
        this.duration = r16;
        this.bitrate = r17;
        this.samplingRate = r18;
        this.bitDepth = r19;
        this.path = r20;
        this.isVideo = r21;
        this.userRating = r22;
        this.averageRating = r23;
        this.playCount = r24;
        this.discNumber = r25;
        this.created = r26;
        this.starred = r27;
        this.albumId = r28;
        this.artistId = r29;
        this.type = r30;
        this.bookmarkPosition = r31;
        this.originalWidth = r32;
        this.originalHeight = r33;
        this.replayGain = r34;
        this.albumArtist = r35;
    }

    public Child(String r40) {
        r40.getClass();
        String r2 = null;
        boolean r3 = false;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        Long r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        Integer r17 = null;
        Integer r18 = null;
        Integer r19 = null;
        String r20 = null;
        boolean r21 = false;
        Integer r22 = null;
        Double r23 = null;
        Long r24 = null;
        Integer r25 = null;
        Date r26 = null;
        Date r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        Long r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        ReplayGainInfo r34 = null;
        String r35 = null;
        int r36 = -2;
        this(r40, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 7, null);
    }
}
