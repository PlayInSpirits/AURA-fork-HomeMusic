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
    public static final Parcelable.Creator<PodcastEpisode> CREATOR = new b23(17);
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

    public /* synthetic */ PodcastEpisode(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, String str6, String str7, Long l, String str8, String str9, Integer num2, Integer num3, String str10, boolean z2, Date date, String str11, String str12, String str13, String str14, String str15, String str16, Date date2, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? null : date, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? null : str13, (i & 1048576) != 0 ? null : str14, (i & 2097152) != 0 ? null : str15, (i & 4194304) != 0 ? null : str16, (i & 8388608) != 0 ? null : date2);
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

    public final void setAlbum(String str) {
        this.album = str;
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setArtistId(String str) {
        this.artistId = str;
    }

    public final void setBitrate(Integer num) {
        this.bitrate = num;
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setCoverArtId(String str) {
        this.coverArtId = str;
    }

    public final void setCreated(Date date) {
        this.created = date;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDir(boolean z) {
        this.isDir = z;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setGenre(String str) {
        this.genre = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPublishDate(Date date) {
        this.publishDate = date;
    }

    public final void setSize(Long l) {
        this.size = l;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStreamId(String str) {
        this.streamId = str;
    }

    public final void setSuffix(String str) {
        this.suffix = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    public final void setYear(Integer num) {
        this.year = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.parentId);
        parcel.writeInt(this.isDir ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.album);
        parcel.writeString(this.artist);
        Integer num = this.year;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num);
        }
        parcel.writeString(this.genre);
        parcel.writeString(this.coverArtId);
        Long l = this.size;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.contentType);
        parcel.writeString(this.suffix);
        Integer num2 = this.duration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num2);
        }
        Integer num3 = this.bitrate;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num3);
        }
        parcel.writeString(this.path);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeSerializable(this.created);
        parcel.writeString(this.artistId);
        parcel.writeString(this.type);
        parcel.writeString(this.streamId);
        parcel.writeString(this.channelId);
        parcel.writeString(this.description);
        parcel.writeString(this.status);
        parcel.writeSerializable(this.publishDate);
    }

    public PodcastEpisode(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, String str6, String str7, Long l, String str8, String str9, Integer num2, Integer num3, String str10, boolean z2, Date date, String str11, String str12, String str13, String str14, String str15, String str16, Date date2) {
        this.id = str;
        this.parentId = str2;
        this.isDir = z;
        this.title = str3;
        this.album = str4;
        this.artist = str5;
        this.year = num;
        this.genre = str6;
        this.coverArtId = str7;
        this.size = l;
        this.contentType = str8;
        this.suffix = str9;
        this.duration = num2;
        this.bitrate = num3;
        this.path = str10;
        this.isVideo = z2;
        this.created = date;
        this.artistId = str11;
        this.type = str12;
        this.streamId = str13;
        this.channelId = str14;
        this.description = str15;
        this.status = str16;
        this.publishDate = date2;
    }

    public PodcastEpisode() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 16777215, null);
    }
}
