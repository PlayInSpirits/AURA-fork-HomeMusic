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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionMediaItem(Child child) {
        this();
        child.getClass();
        this.id = child.getId();
        this.parentId = child.getParentId();
        this.isDir = child.isDir();
        this.title = child.getTitle();
        this.album = child.getAlbum();
        this.artist = child.getArtist();
        this.track = child.getTrack();
        this.year = child.getYear();
        this.genre = child.getGenre();
        this.coverArtId = child.getCoverArtId();
        this.size = child.getSize();
        this.contentType = child.getContentType();
        this.suffix = child.getSuffix();
        this.transcodedContentType = child.getTranscodedContentType();
        this.transcodedSuffix = child.getTranscodedSuffix();
        this.duration = child.getDuration();
        this.bitrate = child.getBitrate();
        this.path = child.getPath();
        this.isVideo = child.isVideo();
        this.userRating = child.getUserRating();
        this.averageRating = child.getAverageRating();
        this.playCount = child.getPlayCount();
        this.discNumber = child.getDiscNumber();
        this.created = child.getCreated();
        this.starred = child.getStarred();
        this.albumId = child.getAlbumId();
        this.artistId = child.getArtistId();
        this.type = "music";
        this.bookmarkPosition = child.getBookmarkPosition();
        this.originalWidth = child.getOriginalWidth();
        this.originalHeight = child.getOriginalHeight();
        this.replayGain = child.getReplayGain();
    }

    private final Uri getStreamUri() {
        String str = this.type;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -405568764) {
                if (iHashCode != 104263205) {
                    if (iHashCode == 108270587 && str.equals(WaveOrigin.RADIO)) {
                        Uri uri = Uri.parse(this.streamUrl);
                        uri.getClass();
                        return uri;
                    }
                } else if (str.equals("music")) {
                    Uri uriJ = e03.j(0, this.id);
                    uriJ.getClass();
                    return uriJ;
                }
            } else if (str.equals("podcast")) {
                Uri uriJ2 = e03.j(0, this.streamId);
                uriJ2.getClass();
                return uriJ2;
            }
        }
        Uri uriJ3 = e03.j(0, this.id);
        uriJ3.getClass();
        return uriJ3;
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
        boolean zF;
        Uri streamUri = getStreamUri();
        String str = this.coverArtId;
        Uri uriA = str != null ? AlbumArtContentProvider.a(str) : null;
        Bundle bundle = new Bundle();
        bundle.putString("id", this.id);
        bundle.putString("parentId", this.parentId);
        bundle.putBoolean("isDir", this.isDir);
        bundle.putString("title", this.title);
        bundle.putString("album", this.album);
        bundle.putString("artist", this.artist);
        Integer num = this.track;
        bundle.putInt("track", num != null ? num.intValue() : 0);
        Integer num2 = this.year;
        bundle.putInt("year", num2 != null ? num2.intValue() : 0);
        bundle.putString("genre", this.genre);
        bundle.putString("coverArtId", this.coverArtId);
        Long l = this.size;
        bundle.putLong("size", l != null ? l.longValue() : 0L);
        bundle.putString("contentType", this.contentType);
        bundle.putString("suffix", this.suffix);
        bundle.putString("transcodedContentType", this.transcodedContentType);
        bundle.putString("transcodedSuffix", this.transcodedSuffix);
        Integer num3 = this.duration;
        bundle.putInt("duration", num3 != null ? num3.intValue() : 0);
        Integer num4 = this.bitrate;
        bundle.putInt("bitrate", num4 != null ? num4.intValue() : 0);
        bundle.putString("path", this.path);
        bundle.putBoolean("isVideo", this.isVideo);
        Integer num5 = this.userRating;
        bundle.putInt("userRating", num5 != null ? num5.intValue() : 0);
        Double d = this.averageRating;
        bundle.putDouble("averageRating", d != null ? d.doubleValue() : 0.0d);
        Long l2 = this.playCount;
        bundle.putLong("playCount", l2 != null ? l2.longValue() : 0L);
        Integer num6 = this.discNumber;
        bundle.putInt("discNumber", num6 != null ? num6.intValue() : 0);
        Date date = this.created;
        bundle.putLong("created", date != null ? date.getTime() : 0L);
        Date date2 = this.starred;
        bundle.putLong("starred", date2 != null ? date2.getTime() : 0L);
        bundle.putString("albumId", this.albumId);
        bundle.putString("artistId", this.artistId);
        bundle.putString("type", this.type);
        Long l3 = this.bookmarkPosition;
        bundle.putLong("bookmarkPosition", l3 != null ? l3.longValue() : 0L);
        Integer num7 = this.originalWidth;
        bundle.putInt("originalWidth", num7 != null ? num7.intValue() : 0);
        Integer num8 = this.originalHeight;
        bundle.putInt("originalHeight", num8 != null ? num8.intValue() : 0);
        bundle.putString("uri", streamUri.toString());
        si0.Z(bundle, this.replayGain);
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        String str2 = this.id;
        str2.getClass();
        co2 co2Var = new co2();
        co2Var.a = this.title;
        Integer num9 = this.track;
        co2Var.n = Integer.valueOf(num9 != null ? num9.intValue() : 0);
        Integer num10 = this.discNumber;
        co2Var.B = Integer.valueOf(num10 != null ? num10.intValue() : 0);
        Integer num11 = this.year;
        co2Var.v = Integer.valueOf(num11 != null ? num11.intValue() : 0);
        co2Var.c = this.album;
        co2Var.b = this.artist;
        co2Var.m = uriA;
        if (h12.c(this.type, "music")) {
            zF = n61.f(1, this.id, this.starred != null);
        } else {
            zF = this.starred != null;
        }
        co2Var.i = new vl1(zF);
        co2Var.I = yw1.k(gb.P("android.media3.session.demo.HEART_ON", "android.media3.session.demo.HEART_OFF"));
        co2Var.H = bundle;
        co2Var.q = Boolean.FALSE;
        co2Var.r = Boolean.TRUE;
        do2 do2Var = new do2(co2Var);
        yc5 yc5Var = new yc5();
        yc5Var.n = streamUri;
        yc5Var.p = bundle;
        cn2 cn2Var2 = new cn2(yc5Var);
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        return new gn2(str2, new wm2(um2Var), new bn2(streamUri, "audio", ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L), new an2(zm2Var), do2Var, cn2Var2);
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

    public final void setAlbum(String str) {
        this.album = str;
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

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIndex(int i) {
        this.index = i;
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

    public final void setSize(Long l) {
        this.size = l;
    }

    public final void setStarred(Date date) {
        this.starred = date;
    }

    public final void setStreamId(String str) {
        this.streamId = str;
    }

    public final void setStreamUrl(String str) {
        this.streamUrl = str;
    }

    public final void setSuffix(String str) {
        this.suffix = str;
    }

    public final void setTimestamp(Long l) {
        this.timestamp = l;
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

    public SessionMediaItem() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionMediaItem(PodcastEpisode podcastEpisode) {
        this();
        podcastEpisode.getClass();
        this.id = podcastEpisode.getId();
        this.parentId = podcastEpisode.getParentId();
        this.isDir = podcastEpisode.isDir();
        this.title = podcastEpisode.getTitle();
        this.album = podcastEpisode.getAlbum();
        this.artist = podcastEpisode.getArtist();
        this.year = podcastEpisode.getYear();
        this.genre = podcastEpisode.getGenre();
        this.coverArtId = podcastEpisode.getCoverArtId();
        this.size = podcastEpisode.getSize();
        this.contentType = podcastEpisode.getContentType();
        this.suffix = podcastEpisode.getSuffix();
        this.duration = podcastEpisode.getDuration();
        this.bitrate = podcastEpisode.getBitrate();
        this.path = podcastEpisode.getPath();
        this.isVideo = podcastEpisode.isVideo();
        this.created = podcastEpisode.getCreated();
        this.artistId = podcastEpisode.getArtistId();
        this.streamId = podcastEpisode.getStreamId();
        this.type = "podcast";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionMediaItem(InternetRadioStation internetRadioStation) {
        this();
        internetRadioStation.getClass();
        this.id = internetRadioStation.getId();
        this.title = internetRadioStation.getName();
        this.streamUrl = internetRadioStation.getStreamUrl();
        this.type = WaveOrigin.RADIO;
        String homePageUrl = internetRadioStation.getHomePageUrl();
        if (homePageUrl == null || homePageUrl.length() <= 0 || !e03.n(homePageUrl)) {
            return;
        }
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = homePageUrl.getBytes(charset);
        bytes.getClass();
        this.coverArtId = xa3.g("ir_", Base64.encodeToString(bytes, 10));
    }
}
