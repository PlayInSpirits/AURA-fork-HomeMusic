package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PodcastEpisode implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PodcastEpisode> CREATOR = null;
    private String album;
    private String artist;
    private String artistId;

    @ka4("bitRate")
    private Integer bitrate;
    private String channelId;
    private String contentType;

    @ka4("coverArt")
    private String coverArtId;
    private Date created;
    private String description;
    private Integer duration;
    private String genre;
    private String id;
    private boolean isDir;
    private boolean isVideo;

    @ka4("parent")
    private String parentId;
    private String path;
    private Date publishDate;
    private Long size;
    private String status;
    private String streamId;
    private String suffix;
    private String title;
    private String type;
    private Integer year;

    static {
        CREATOR = new b23(17);
    }

    public /* synthetic */ PodcastEpisode(String r26, String r27, boolean r28, String r29, String r30, String r31, Integer r32, String r33, String r34, Long r35, String r36, String r37, Integer r38, Integer r39, String r40, boolean r41, Date r42, String r43, String r44, String r45, String r46, String r47, String r48, Date r49, int r50, xj0 r51) {
        if ((r50 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r50 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r50 & 4) == 0) goto L13;
        boolean r4 = false;
    L15:
        if ((r50 & 8) == 0) goto L17;
        String r6 = null;
    L19:
        if ((r50 & 16) == 0) goto L21;
        String r7 = null;
    L23:
        if ((r50 & 32) == 0) goto L25;
        String r8 = null;
    L27:
        if ((r50 & 64) == 0) goto L29;
        Integer r9 = null;
    L31:
        if ((r50 & 128) == 0) goto L33;
        String r10 = null;
    L35:
        if ((r50 & 256) == 0) goto L37;
        String r11 = null;
    L39:
        if ((r50 & 512) == 0) goto L41;
        Long r12 = null;
    L43:
        if ((r50 & 1024) == 0) goto L45;
        String r13 = null;
    L47:
        if ((r50 & 2048) == 0) goto L49;
        String r14 = null;
    L51:
        if ((r50 & 4096) == 0) goto L53;
        Integer r15 = null;
    L55:
        if ((r50 & 8192) == 0) goto L57;
        Integer r2 = null;
    L59:
        if ((r50 & 16384) == 0) goto L61;
        String r5 = null;
    L63:
        if ((r50 & 32768) == 0) goto L65;
        boolean r16 = false;
    L67:
        if ((r50 & 65536) == 0) goto L69;
        Date r17 = null;
    L71:
        if ((r50 & 131072) == 0) goto L73;
        String r18 = null;
    L75:
        if ((r50 & 262144) == 0) goto L77;
        String r19 = null;
    L79:
        if ((r50 & 524288) == 0) goto L81;
        String r20 = null;
    L83:
        if ((r50 & 1048576) == 0) goto L85;
        String r21 = null;
    L87:
        if ((r50 & 2097152) == 0) goto L89;
        String r22 = null;
    L91:
        if ((r50 & 4194304) == 0) goto L93;
        String r23 = null;
    L95:
        if ((r50 & 8388608) == 0) goto L98;
        Date r52 = null;
    L99:
        this(r1, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r5, r16, r17, r18, r19, r20, r21, r22, r23, r52);
        return;
    L98:
        r52 = r49;
        goto L99
    L93:
        r23 = r48;
        goto L95
    L89:
        r22 = r47;
        goto L91
    L85:
        r21 = r46;
        goto L87
    L81:
        r20 = r45;
        goto L83
    L77:
        r19 = r44;
        goto L79
    L73:
        r18 = r43;
        goto L75
    L69:
        r17 = r42;
        goto L71
    L65:
        r16 = r41;
        goto L67
    L61:
        r5 = r40;
        goto L63
    L57:
        r2 = r39;
        goto L59
    L53:
        r15 = r38;
        goto L55
    L49:
        r14 = r37;
        goto L51
    L45:
        r13 = r36;
        goto L47
    L41:
        r12 = r35;
        goto L43
    L37:
        r11 = r34;
        goto L39
    L33:
        r10 = r33;
        goto L35
    L29:
        r9 = r32;
        goto L31
    L25:
        r8 = r31;
        goto L27
    L21:
        r7 = r30;
        goto L23
    L17:
        r6 = r29;
        goto L19
    L13:
        r4 = r28;
        goto L15
    L9:
        r3 = r27;
        goto L11
    L5:
        r1 = r26;
        goto L7
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getArtistId() {
        return this.artistId;
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final String getChannelId() {
        return this.channelId;
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

    public final String getDescription() {
        return this.description;
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

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPath() {
        return this.path;
    }

    public final Date getPublishDate() {
        return this.publishDate;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
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

    public final void setArtist(String r1) {
        this.artist = r1;
    }

    public final void setArtistId(String r1) {
        this.artistId = r1;
    }

    public final void setBitrate(Integer r1) {
        this.bitrate = r1;
    }

    public final void setChannelId(String r1) {
        this.channelId = r1;
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

    public final void setDescription(String r1) {
        this.description = r1;
    }

    public final void setDir(boolean r1) {
        this.isDir = r1;
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

    public final void setParentId(String r1) {
        this.parentId = r1;
    }

    public final void setPath(String r1) {
        this.path = r1;
    }

    public final void setPublishDate(Date r1) {
        this.publishDate = r1;
    }

    public final void setSize(Long r1) {
        this.size = r1;
    }

    public final void setStatus(String r1) {
        this.status = r1;
    }

    public final void setStreamId(String r1) {
        this.streamId = r1;
    }

    public final void setSuffix(String r1) {
        this.suffix = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    public final void setType(String r1) {
        this.type = r1;
    }

    public final void setVideo(boolean r1) {
        this.isVideo = r1;
    }

    public final void setYear(Integer r1) {
        this.year = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        r5.getClass();
        r5.writeString(this.id);
        r5.writeString(this.parentId);
        r5.writeInt(this.isDir ? 1 : 0);
        r5.writeString(this.title);
        r5.writeString(this.album);
        r5.writeString(this.artist);
        Integer r7 = this.year;
        if (r7 != null) goto L5;
        r5.writeInt(0);
    L6:
        r5.writeString(this.genre);
        r5.writeString(this.coverArtId);
        Long r8 = this.size;
        if (r8 != null) goto L9;
        r5.writeInt(0);
    L10:
        r5.writeString(this.contentType);
        r5.writeString(this.suffix);
        Integer r9 = this.duration;
        if (r9 != null) goto L13;
        r5.writeInt(0);
    L14:
        Integer r10 = this.bitrate;
        if (r10 != null) goto L17;
        r5.writeInt(0);
    L18:
        r5.writeString(this.path);
        r5.writeInt(this.isVideo ? 1 : 0);
        r5.writeSerializable(this.created);
        r5.writeString(this.artistId);
        r5.writeString(this.type);
        r5.writeString(this.streamId);
        r5.writeString(this.channelId);
        r5.writeString(this.description);
        r5.writeString(this.status);
        r5.writeSerializable(this.publishDate);
        return;
    L17:
        xa3.q(r5, 1, r10);
        goto L18
    L13:
        xa3.q(r5, 1, r9);
        goto L14
    L9:
        r5.writeInt(1);
        r5.writeLong(r8.longValue());
        goto L10
    L5:
        xa3.q(r5, 1, r7);
        goto L6
    }

    public PodcastEpisode(String r1, String r2, boolean r3, String r4, String r5, String r6, Integer r7, String r8, String r9, Long r10, String r11, String r12, Integer r13, Integer r14, String r15, boolean r16, Date r17, String r18, String r19, String r20, String r21, String r22, String r23, Date r24) {
        this.id = r1;
        this.parentId = r2;
        this.isDir = r3;
        this.title = r4;
        this.album = r5;
        this.artist = r6;
        this.year = r7;
        this.genre = r8;
        this.coverArtId = r9;
        this.size = r10;
        this.contentType = r11;
        this.suffix = r12;
        this.duration = r13;
        this.bitrate = r14;
        this.path = r15;
        this.isVideo = r16;
        this.created = r17;
        this.artistId = r18;
        this.type = r19;
        this.streamId = r20;
        this.channelId = r21;
        this.description = r22;
        this.status = r23;
        this.publishDate = r24;
    }

    public PodcastEpisode() {
        String r1 = null;
        String r2 = null;
        boolean r3 = false;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        String r8 = null;
        String r9 = null;
        Long r10 = null;
        String r11 = null;
        String r12 = null;
        Integer r13 = null;
        Integer r14 = null;
        String r15 = null;
        boolean r16 = false;
        Date r17 = null;
        String r18 = null;
        String r19 = null;
        String r20 = null;
        String r21 = null;
        String r22 = null;
        String r23 = null;
        Date r24 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, 16777215, null);
    }
}
