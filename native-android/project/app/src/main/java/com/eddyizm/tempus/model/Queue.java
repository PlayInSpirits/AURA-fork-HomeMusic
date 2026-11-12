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
    public static final Parcelable.Creator<Queue> CREATOR = null;
    private final String id;
    private long lastPlay;
    private long playingChanged;
    private String streamId;
    private int trackOrder;

    static {
        CREATOR = new b23(20);
    }

    public Queue(Child r11) {
        r11.getClass();
        int r2 = 0;
        long r3 = 0;
        long r5 = 0;
        String r7 = null;
        this(r11.getId(), r2, r3, r5, r7, 30, null);
        setParentId(r11.getParentId());
        setDir(r11.isDir());
        setTitle(r11.getTitle());
        setAlbum(r11.getAlbum());
        setArtist(r11.getArtist());
        setTrack(r11.getTrack());
        setYear(r11.getYear());
        setGenre(r11.getGenre());
        setCoverArtId(r11.getCoverArtId());
        setSize(r11.getSize());
        setContentType(r11.getContentType());
        setSuffix(r11.getSuffix());
        setTranscodedContentType(r11.getTranscodedContentType());
        setTranscodedSuffix(r11.getTranscodedSuffix());
        setDuration(r11.getDuration());
        setBitrate(r11.getBitrate());
        setSamplingRate(r11.getSamplingRate());
        setBitDepth(r11.getBitDepth());
        setPath(r11.getPath());
        setVideo(r11.isVideo());
        setUserRating(r11.getUserRating());
        setAverageRating(r11.getAverageRating());
        setPlayCount(r11.getPlayCount());
        setDiscNumber(r11.getDiscNumber());
        setCreated(r11.getCreated());
        setStarred(r11.getStarred());
        setAlbumId(r11.getAlbumId());
        setArtistId(r11.getArtistId());
        setType(r11.getType());
        setBookmarkPosition(r11.getBookmarkPosition());
        setOriginalWidth(r11.getOriginalWidth());
        setOriginalHeight(r11.getOriginalHeight());
        setReplayGain(r11.getReplayGain());
        setAlbumArtist(r11.getAlbumArtist());
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

    public final void setLastPlay(long r1) {
        this.lastPlay = r1;
    }

    public final void setPlayingChanged(long r1) {
        this.playingChanged = r1;
    }

    public final void setStreamId(String r1) {
        this.streamId = r1;
    }

    public final void setTrackOrder(int r1) {
        this.trackOrder = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeString(this.id);
        r3.writeInt(this.trackOrder);
        r3.writeLong(this.lastPlay);
        r3.writeLong(this.playingChanged);
        r3.writeString(this.streamId);
    }

    public /* synthetic */ Queue(String r7, int r8, long r9, long r11, String r13, int r14, xj0 r15) {
        if ((r14 & 2) == 0) goto L5;
        int r0 = 0;
    L6:
        long r2 = 0;
        if ((r14 & 4) == 0) goto L9;
        long r4 = 0;
    L11:
        if ((r14 & 8) != 0) goto L15;
        r2 = r11;
    L15:
        if ((r14 & 16) == 0) goto L18;
        String r16 = null;
    L19:
        this(r7, r0, r4, r2, r16);
        return;
    L18:
        r16 = r13;
        goto L19
    L9:
        r4 = r9;
        goto L11
    L5:
        r0 = r8;
        goto L6
    }

    public Queue(String r40, int r41, long r42, long r44, String r46) {
        r40.getClass();
        super(r40, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        this.id = r40;
        this.trackOrder = r41;
        this.lastPlay = r42;
        this.playingChanged = r44;
        this.streamId = r46;
    }
}
