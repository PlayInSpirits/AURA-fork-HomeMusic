package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.b23;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Queue extends Child {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Queue> CREATOR = new b23(20);
    private final String id;
    private long lastPlay;
    private long playingChanged;
    private String streamId;
    private int trackOrder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Queue(Child child) {
        this(child.getId(), 0, 0L, 0L, null, 30, null);
        child.getClass();
        setParentId(child.getParentId());
        setDir(child.isDir());
        setTitle(child.getTitle());
        setAlbum(child.getAlbum());
        setArtist(child.getArtist());
        setTrack(child.getTrack());
        setYear(child.getYear());
        setGenre(child.getGenre());
        setCoverArtId(child.getCoverArtId());
        setSize(child.getSize());
        setContentType(child.getContentType());
        setSuffix(child.getSuffix());
        setTranscodedContentType(child.getTranscodedContentType());
        setTranscodedSuffix(child.getTranscodedSuffix());
        setDuration(child.getDuration());
        setBitrate(child.getBitrate());
        setSamplingRate(child.getSamplingRate());
        setBitDepth(child.getBitDepth());
        setPath(child.getPath());
        setVideo(child.isVideo());
        setUserRating(child.getUserRating());
        setAverageRating(child.getAverageRating());
        setPlayCount(child.getPlayCount());
        setDiscNumber(child.getDiscNumber());
        setCreated(child.getCreated());
        setStarred(child.getStarred());
        setAlbumId(child.getAlbumId());
        setArtistId(child.getArtistId());
        setType(child.getType());
        setBookmarkPosition(child.getBookmarkPosition());
        setOriginalWidth(child.getOriginalWidth());
        setOriginalHeight(child.getOriginalHeight());
        setReplayGain(child.getReplayGain());
        setAlbumArtist(child.getAlbumArtist());
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child
    public String getId() {
        return this.id;
    }

    public final long getLastPlay() {
        return this.lastPlay;
    }

    public final long getPlayingChanged() {
        return this.playingChanged;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public final int getTrackOrder() {
        return this.trackOrder;
    }

    public final void setLastPlay(long j) {
        this.lastPlay = j;
    }

    public final void setPlayingChanged(long j) {
        this.playingChanged = j;
    }

    public final void setStreamId(String str) {
        this.streamId = str;
    }

    public final void setTrackOrder(int i) {
        this.trackOrder = i;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeInt(this.trackOrder);
        parcel.writeLong(this.lastPlay);
        parcel.writeLong(this.playingChanged);
        parcel.writeString(this.streamId);
    }

    public /* synthetic */ Queue(String str, int i, long j, long j2, String str2, int i2, xj0 xj0Var) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) == 0 ? j2 : 0L, (i2 & 16) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Queue(String str, int i, long j, long j2, String str2) {
        super(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        str.getClass();
        this.id = str;
        this.trackOrder = i;
        this.lastPlay = j;
        this.playingChanged = j2;
        this.streamId = str2;
    }
}
