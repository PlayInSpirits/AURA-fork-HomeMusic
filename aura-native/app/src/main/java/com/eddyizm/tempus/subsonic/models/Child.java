package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h12;
import defpackage.ka4;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class Child implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Child> CREATOR = new w4(13);
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

    public /* synthetic */ Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15, Long l3, Integer num9, Integer num10, ReplayGainInfo replayGainInfo, String str16, int i, int i2, xj0 xj0Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : num3, (i & 65536) != 0 ? null : num4, (i & 131072) != 0 ? null : num5, (i & 262144) != 0 ? null : num6, (i & 524288) != 0 ? null : str12, (i & 1048576) == 0 ? z2 : false, (i & 2097152) != 0 ? null : num7, (i & 4194304) != 0 ? null : d, (i & 8388608) != 0 ? null : l2, (i & 16777216) != 0 ? null : num8, (i & 33554432) != 0 ? null : date, (i & 67108864) != 0 ? null : date2, (i & 134217728) != 0 ? null : str13, (i & 268435456) != 0 ? null : str14, (i & 536870912) != 0 ? null : str15, (i & 1073741824) != 0 ? null : l3, (i & Integer.MIN_VALUE) != 0 ? null : num9, (i2 & 1) != 0 ? null : num10, (i2 & 2) != 0 ? null : replayGainInfo, (i2 & 4) != 0 ? null : str16);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Child)) {
            return false;
        }
        Child child = (Child) obj;
        if (!h12.c(getId(), child.getId()) || !h12.c(this.parentId, child.parentId) || this.isDir != child.isDir || !h12.c(this.title, child.title) || !h12.c(this.album, child.album) || !h12.c(this.artist, child.artist) || !h12.c(this.track, child.track) || !h12.c(this.year, child.year) || !h12.c(this.genre, child.genre) || !h12.c(this.coverArtId, child.coverArtId) || !h12.c(this.size, child.size) || !h12.c(this.contentType, child.contentType) || !h12.c(this.suffix, child.suffix) || !h12.c(this.transcodedContentType, child.transcodedContentType) || !h12.c(this.transcodedSuffix, child.transcodedSuffix) || !h12.c(this.duration, child.duration) || !h12.c(this.bitrate, child.bitrate) || !h12.c(this.samplingRate, child.samplingRate) || !h12.c(this.bitDepth, child.bitDepth) || !h12.c(this.path, child.path) || this.isVideo != child.isVideo || !h12.c(this.userRating, child.userRating)) {
            return false;
        }
        Double d = this.averageRating;
        Double d2 = child.averageRating;
        if (d != null ? d2 == null || d.doubleValue() != d2.doubleValue() : d2 != null) {
            return false;
        }
        return h12.c(this.playCount, child.playCount) && h12.c(this.discNumber, child.discNumber) && h12.c(this.created, child.created) && h12.c(this.starred, child.starred) && h12.c(this.albumId, child.albumId) && h12.c(this.artistId, child.artistId) && h12.c(this.type, child.type) && h12.c(this.bookmarkPosition, child.bookmarkPosition) && h12.c(this.originalWidth, child.originalWidth) && h12.c(this.originalHeight, child.originalHeight) && h12.c(this.replayGain, child.replayGain) && h12.c(this.albumArtist, child.albumArtist);
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
        int hashCode = getId().hashCode() * 31;
        String str = this.parentId;
        int c = xa3.c((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.isDir);
        String str2 = this.title;
        int hashCode2 = (c + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.album;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.artist;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.track;
        int intValue = (hashCode4 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.year;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        String str5 = this.genre;
        int hashCode5 = (intValue2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.coverArtId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Long l = this.size;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31;
        String str7 = this.contentType;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.suffix;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.transcodedContentType;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.transcodedSuffix;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Integer num3 = this.duration;
        int intValue3 = (hashCode11 + (num3 != null ? num3.intValue() : 0)) * 31;
        Integer num4 = this.bitrate;
        int intValue4 = (intValue3 + (num4 != null ? num4.intValue() : 0)) * 31;
        Integer num5 = this.samplingRate;
        int intValue5 = (intValue4 + (num5 != null ? num5.intValue() : 0)) * 31;
        Integer num6 = this.bitDepth;
        int intValue6 = (intValue5 + (num6 != null ? num6.intValue() : 0)) * 31;
        String str11 = this.path;
        int c2 = xa3.c((intValue6 + (str11 != null ? str11.hashCode() : 0)) * 31, 31, this.isVideo);
        Integer num7 = this.userRating;
        int intValue7 = (c2 + (num7 != null ? num7.intValue() : 0)) * 31;
        Double d = this.averageRating;
        int hashCode12 = (intValue7 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 31;
        Long l2 = this.playCount;
        int hashCode13 = (hashCode12 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        Integer num8 = this.discNumber;
        int intValue8 = (hashCode13 + (num8 != null ? num8.intValue() : 0)) * 31;
        Date date = this.created;
        int hashCode14 = (intValue8 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.starred;
        int hashCode15 = (hashCode14 + (date2 != null ? date2.hashCode() : 0)) * 31;
        String str12 = this.albumId;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.artistId;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.type;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Long l3 = this.bookmarkPosition;
        int hashCode19 = (hashCode18 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 31;
        Integer num9 = this.originalWidth;
        int intValue9 = (hashCode19 + (num9 != null ? num9.intValue() : 0)) * 31;
        Integer num10 = this.originalHeight;
        int intValue10 = (intValue9 + (num10 != null ? num10.intValue() : 0)) * 31;
        ReplayGainInfo replayGainInfo = this.replayGain;
        int hashCode20 = (intValue10 + (replayGainInfo != null ? replayGainInfo.hashCode() : 0)) * 31;
        String str15 = this.albumArtist;
        return hashCode20 + (str15 != null ? str15.hashCode() : 0);
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

    public final void setAlbumArtist(String str) {
        this.albumArtist = str;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setArtistId(String str) {
        this.artistId = str;
    }

    public final void setAverageRating(Double d) {
        this.averageRating = d;
    }

    public final void setBitDepth(Integer num) {
        this.bitDepth = num;
    }

    public final void setBitrate(Integer num) {
        this.bitrate = num;
    }

    public final void setBookmarkPosition(Long l) {
        this.bookmarkPosition = l;
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

    public final void setDir(boolean z) {
        this.isDir = z;
    }

    public final void setDiscNumber(Integer num) {
        this.discNumber = num;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setGenre(String str) {
        this.genre = str;
    }

    public final void setOriginalHeight(Integer num) {
        this.originalHeight = num;
    }

    public final void setOriginalWidth(Integer num) {
        this.originalWidth = num;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setReplayGain(ReplayGainInfo replayGainInfo) {
        this.replayGain = replayGainInfo;
    }

    public final void setSamplingRate(Integer num) {
        this.samplingRate = num;
    }

    public final void setSize(Long l) {
        this.size = l;
    }

    public final void setStarred(Date date) {
        this.starred = date;
    }

    public final void setSuffix(String str) {
        this.suffix = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrack(Integer num) {
        this.track = num;
    }

    public final void setTranscodedContentType(String str) {
        this.transcodedContentType = str;
    }

    public final void setTranscodedSuffix(String str) {
        this.transcodedSuffix = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUserRating(Integer num) {
        this.userRating = num;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    public final void setYear(Integer num) {
        this.year = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.parentId);
        parcel.writeInt(this.isDir ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.album);
        parcel.writeString(this.artist);
        Integer num = this.track;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num);
        }
        Integer num2 = this.year;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num2);
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
        parcel.writeString(this.transcodedContentType);
        parcel.writeString(this.transcodedSuffix);
        Integer num3 = this.duration;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num3);
        }
        Integer num4 = this.bitrate;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num4);
        }
        Integer num5 = this.samplingRate;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num5);
        }
        Integer num6 = this.bitDepth;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num6);
        }
        parcel.writeString(this.path);
        parcel.writeInt(this.isVideo ? 1 : 0);
        Integer num7 = this.userRating;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num7);
        }
        Double d = this.averageRating;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Long l2 = this.playCount;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num8 = this.discNumber;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num8);
        }
        parcel.writeSerializable(this.created);
        parcel.writeSerializable(this.starred);
        parcel.writeString(this.albumId);
        parcel.writeString(this.artistId);
        parcel.writeString(this.type);
        Long l3 = this.bookmarkPosition;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Integer num9 = this.originalWidth;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num9);
        }
        Integer num10 = this.originalHeight;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num10);
        }
        ReplayGainInfo replayGainInfo = this.replayGain;
        if (replayGainInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            replayGainInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.albumArtist);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2) {
        this(str, str2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z) {
        this(str, str2, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3) {
        this(str, str2, z, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4) {
        this(str, str2, z, str3, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5) {
        this(str, str2, z, str3, str4, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num) {
        this(str, str2, z, str3, str4, str5, num, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -128, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2) {
        this(str, str2, z, str3, str4, str5, num, num2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -256, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -512, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1024, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2048, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4096, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8192, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16384, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32768, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65536, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131072, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262144, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524288, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048576, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097152, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194304, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, null, null, null, null, null, null, null, null, null, null, null, null, -8388608, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, null, null, null, null, null, null, null, null, null, null, null, -16777216, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, null, null, null, null, null, null, null, null, null, null, -33554432, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, null, null, null, null, null, null, null, null, null, -67108864, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, null, null, null, null, null, null, null, null, -134217728, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, null, null, null, null, null, null, null, -268435456, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, str14, null, null, null, null, null, null, -536870912, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, str14, str15, null, null, null, null, null, -1073741824, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15, Long l3) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, str14, str15, l3, null, null, null, null, Integer.MIN_VALUE, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15, Long l3, Integer num9) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, str14, str15, l3, num9, null, null, null, 0, 7, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15, Long l3, Integer num9, Integer num10) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, str14, str15, l3, num9, num10, null, null, 0, 6, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15, Long l3, Integer num9, Integer num10, ReplayGainInfo replayGainInfo) {
        this(str, str2, z, str3, str4, str5, num, num2, str6, str7, l, str8, str9, str10, str11, num3, num4, num5, num6, str12, z2, num7, d, l2, num8, date, date2, str13, str14, str15, l3, num9, num10, replayGainInfo, null, 0, 4, null);
        str.getClass();
    }

    public Child(String str, String str2, boolean z, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Long l, String str8, String str9, String str10, String str11, Integer num3, Integer num4, Integer num5, Integer num6, String str12, boolean z2, Integer num7, Double d, Long l2, Integer num8, Date date, Date date2, String str13, String str14, String str15, Long l3, Integer num9, Integer num10, ReplayGainInfo replayGainInfo, String str16) {
        str.getClass();
        this.id = str;
        this.parentId = str2;
        this.isDir = z;
        this.title = str3;
        this.album = str4;
        this.artist = str5;
        this.track = num;
        this.year = num2;
        this.genre = str6;
        this.coverArtId = str7;
        this.size = l;
        this.contentType = str8;
        this.suffix = str9;
        this.transcodedContentType = str10;
        this.transcodedSuffix = str11;
        this.duration = num3;
        this.bitrate = num4;
        this.samplingRate = num5;
        this.bitDepth = num6;
        this.path = str12;
        this.isVideo = z2;
        this.userRating = num7;
        this.averageRating = d;
        this.playCount = l2;
        this.discNumber = num8;
        this.created = date;
        this.starred = date2;
        this.albumId = str13;
        this.artistId = str14;
        this.type = str15;
        this.bookmarkPosition = l3;
        this.originalWidth = num9;
        this.originalHeight = num10;
        this.replayGain = replayGainInfo;
        this.albumArtist = str16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Child(String str) {
        this(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        str.getClass();
    }
}
