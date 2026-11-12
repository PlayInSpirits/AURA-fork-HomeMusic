package com.eddyizm.tempus.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.do2;
import defpackage.gn2;
import defpackage.si0;
import defpackage.ud3;
import defpackage.w4;
import defpackage.xj0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Chronology extends Child {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Chronology> CREATOR = new w4(14);
    private final String id;
    private String server;
    private long timestamp;

    /* JADX WARN: Illegal instructions before constructor call */
    public Chronology(gn2 gn2Var) {
        gn2Var.getClass();
        do2 do2Var = gn2Var.d;
        Bundle bundle = do2Var.I;
        bundle.getClass();
        String string = bundle.getString("id");
        string.getClass();
        this(string, 0L, null, 6, null);
        Bundle bundle2 = do2Var.I;
        bundle2.getClass();
        setParentId(bundle2.getString("parentId"));
        bundle2.getClass();
        setDir(bundle2.getBoolean("isDir"));
        bundle2.getClass();
        setTitle(bundle2.getString("title"));
        bundle2.getClass();
        setAlbum(bundle2.getString("album"));
        bundle2.getClass();
        setArtist(bundle2.getString("artist"));
        bundle2.getClass();
        setTrack(Integer.valueOf(bundle2.getInt("track")));
        bundle2.getClass();
        setYear(Integer.valueOf(bundle2.getInt("year")));
        bundle2.getClass();
        setGenre(bundle2.getString("genre"));
        bundle2.getClass();
        setCoverArtId(bundle2.getString("coverArtId"));
        bundle2.getClass();
        setSize(Long.valueOf(bundle2.getLong("size")));
        bundle2.getClass();
        setContentType(bundle2.getString("contentType"));
        bundle2.getClass();
        setSuffix(bundle2.getString("suffix"));
        bundle2.getClass();
        setTranscodedContentType(bundle2.getString("transcodedContentType"));
        bundle2.getClass();
        setTranscodedSuffix(bundle2.getString("transcodedSuffix"));
        bundle2.getClass();
        setDuration(Integer.valueOf(bundle2.getInt("duration")));
        bundle2.getClass();
        setBitrate(Integer.valueOf(bundle2.getInt("bitrate")));
        bundle2.getClass();
        setSamplingRate(Integer.valueOf(bundle2.getInt("samplingRate")));
        bundle2.getClass();
        setBitDepth(Integer.valueOf(bundle2.getInt("bitDepth")));
        bundle2.getClass();
        setPath(bundle2.getString("path"));
        bundle2.getClass();
        setVideo(bundle2.getBoolean("isVideo"));
        bundle2.getClass();
        setUserRating(Integer.valueOf(bundle2.getInt("userRating")));
        bundle2.getClass();
        setAverageRating(Double.valueOf(bundle2.getDouble("averageRating")));
        bundle2.getClass();
        setPlayCount(Long.valueOf(bundle2.getLong("playCount")));
        bundle2.getClass();
        setDiscNumber(Integer.valueOf(bundle2.getInt("discNumber")));
        bundle2.getClass();
        long j = bundle2.getLong("created");
        setCreated(j > 0 ? new Date(j) : null);
        bundle2.getClass();
        long j2 = bundle2.getLong("starred");
        setStarred(j2 > 0 ? new Date(j2) : null);
        bundle2.getClass();
        setAlbumId(bundle2.getString("albumId"));
        bundle2.getClass();
        setArtistId(bundle2.getString("artistId"));
        bundle2.getClass();
        setAlbumArtist(bundle2.getString("albumArtist"));
        bundle2.getClass();
        setType(bundle2.getString("type"));
        bundle2.getClass();
        setBookmarkPosition(Long.valueOf(bundle2.getLong("bookmarkPosition")));
        bundle2.getClass();
        setOriginalWidth(Integer.valueOf(bundle2.getInt("originalWidth")));
        bundle2.getClass();
        setOriginalHeight(Integer.valueOf(bundle2.getInt("originalHeight")));
        setReplayGain(si0.v(bundle2));
        this.server = ud3.E();
        this.timestamp = new Date().getTime();
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child
    public String getId() {
        return this.id;
    }

    public final String getServer() {
        return this.server;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setServer(String str) {
        this.server = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.server);
    }

    public /* synthetic */ Chronology(String str, long j, String str2, int i, xj0 xj0Var) {
        this(str, (i & 2) != 0 ? System.currentTimeMillis() : j, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Chronology(String str, long j, String str2) {
        super(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        str.getClass();
        this.id = str;
        this.timestamp = j;
        this.server = str2;
    }
}
