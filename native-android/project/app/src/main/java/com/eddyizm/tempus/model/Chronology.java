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
    public static final Parcelable.Creator<Chronology> CREATOR = null;
    private final String id;
    private String server;
    private long timestamp;

    static {
        CREATOR = new w4(14);
    }

    public Chronology(gn2 r10) {
        r10.getClass();
        do2 r11 = r10.d;
        Bundle r0 = r11.I;
        r0.getClass();
        String r3 = r0.getString("id");
        r3.getClass();
        this(r3, 0, null, 6, null);
        Bundle r9 = r11.I;
        r9.getClass();
        setParentId(r9.getString("parentId"));
        r9.getClass();
        setDir(r9.getBoolean("isDir"));
        r9.getClass();
        setTitle(r9.getString("title"));
        r9.getClass();
        setAlbum(r9.getString("album"));
        r9.getClass();
        setArtist(r9.getString("artist"));
        r9.getClass();
        setTrack(Integer.valueOf(r9.getInt("track")));
        r9.getClass();
        setYear(Integer.valueOf(r9.getInt("year")));
        r9.getClass();
        setGenre(r9.getString("genre"));
        r9.getClass();
        setCoverArtId(r9.getString("coverArtId"));
        r9.getClass();
        setSize(Long.valueOf(r9.getLong("size")));
        r9.getClass();
        setContentType(r9.getString("contentType"));
        r9.getClass();
        setSuffix(r9.getString("suffix"));
        r9.getClass();
        setTranscodedContentType(r9.getString("transcodedContentType"));
        r9.getClass();
        setTranscodedSuffix(r9.getString("transcodedSuffix"));
        r9.getClass();
        setDuration(Integer.valueOf(r9.getInt("duration")));
        r9.getClass();
        setBitrate(Integer.valueOf(r9.getInt("bitrate")));
        r9.getClass();
        setSamplingRate(Integer.valueOf(r9.getInt("samplingRate")));
        r9.getClass();
        setBitDepth(Integer.valueOf(r9.getInt("bitDepth")));
        r9.getClass();
        setPath(r9.getString("path"));
        r9.getClass();
        setVideo(r9.getBoolean("isVideo"));
        r9.getClass();
        setUserRating(Integer.valueOf(r9.getInt("userRating")));
        r9.getClass();
        setAverageRating(Double.valueOf(r9.getDouble("averageRating")));
        r9.getClass();
        setPlayCount(Long.valueOf(r9.getLong("playCount")));
        r9.getClass();
        setDiscNumber(Integer.valueOf(r9.getInt("discNumber")));
        r9.getClass();
        long r1 = r9.getLong("created");
        Date r5 = null;
        if (r1 <= 0) goto L5;
        Date r12 = new Date(r1);
    L6:
        setCreated(r12);
        r9.getClass();
        long r2 = r9.getLong("starred");
        if (r2 <= 0) goto L9;
        r5 = new Date(r2);
    L9:
        setStarred(r5);
        r9.getClass();
        setAlbumId(r9.getString("albumId"));
        r9.getClass();
        setArtistId(r9.getString("artistId"));
        r9.getClass();
        setAlbumArtist(r9.getString("albumArtist"));
        r9.getClass();
        setType(r9.getString("type"));
        r9.getClass();
        setBookmarkPosition(Long.valueOf(r9.getLong("bookmarkPosition")));
        r9.getClass();
        setOriginalWidth(Integer.valueOf(r9.getInt("originalWidth")));
        r9.getClass();
        setOriginalHeight(Integer.valueOf(r9.getInt("originalHeight")));
        setReplayGain(si0.v(r9));
        this.server = ud3.E();
        this.timestamp = new Date().getTime();
        return;
    L5:
        r12 = null;
        goto L6
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

    public final void setServer(String r1) {
        this.server = r1;
    }

    public final void setTimestamp(long r1) {
        this.timestamp = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeString(this.id);
        r3.writeLong(this.timestamp);
        r3.writeString(this.server);
    }

    public /* synthetic */ Chronology(String r1, long r2, String r4, int r5, xj0 r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = System.currentTimeMillis();
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = null;
    L8:
        this(r1, r2, r4);
    }

    public Chronology(String r40, long r41, String r43) {
        r40.getClass();
        super(r40, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        this.id = r40;
        this.timestamp = r41;
        this.server = r43;
    }
}
