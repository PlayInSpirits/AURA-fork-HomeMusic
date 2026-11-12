package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.w4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Download extends Child {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Download> CREATOR = null;
    private int downloadState;
    private String downloadUri;
    private final String id;
    private String playlistId;
    private String playlistName;

    static {
        CREATOR = new w4(24);
    }

    public Download(Child r9) {
        r9.getClass();
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        String r5 = null;
        this(r9.getId(), r2, r3, r4, r5, 30, null);
        setParentId(r9.getParentId());
        setDir(r9.isDir());
        setTitle(r9.getTitle());
        setAlbum(r9.getAlbum());
        setArtist(r9.getArtist());
        setTrack(r9.getTrack());
        setYear(r9.getYear());
        setGenre(r9.getGenre());
        setCoverArtId(r9.getCoverArtId());
        setSize(r9.getSize());
        setContentType(r9.getContentType());
        setSuffix(r9.getSuffix());
        setTranscodedContentType(r9.getTranscodedContentType());
        setTranscodedSuffix(r9.getTranscodedSuffix());
        setDuration(r9.getDuration());
        setBitrate(r9.getBitrate());
        setSamplingRate(r9.getSamplingRate());
        setBitDepth(r9.getBitDepth());
        setPath(r9.getPath());
        setVideo(r9.isVideo());
        setUserRating(r9.getUserRating());
        setAverageRating(r9.getAverageRating());
        setPlayCount(r9.getPlayCount());
        setDiscNumber(r9.getDiscNumber());
        setCreated(r9.getCreated());
        setStarred(r9.getStarred());
        setAlbumId(r9.getAlbumId());
        setArtistId(r9.getArtistId());
        setType(r9.getType());
        setBookmarkPosition(r9.getBookmarkPosition());
        setOriginalWidth(r9.getOriginalWidth());
        setOriginalHeight(r9.getOriginalHeight());
        setReplayGain(r9.getReplayGain());
        setAlbumArtist(r9.getAlbumArtist());
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getDownloadState() {
        return this.downloadState;
    }

    public final String getDownloadUri() {
        return this.downloadUri;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child
    public String getId() {
        return this.id;
    }

    public final String getPlaylistId() {
        return this.playlistId;
    }

    public final String getPlaylistName() {
        return this.playlistName;
    }

    public final void setDownloadState(int r1) {
        this.downloadState = r1;
    }

    public final void setDownloadUri(String r1) {
        this.downloadUri = r1;
    }

    public final void setPlaylistId(String r1) {
        this.playlistId = r1;
    }

    public final void setPlaylistName(String r1) {
        this.playlistName = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.id);
        r1.writeString(this.playlistId);
        r1.writeString(this.playlistName);
        r1.writeInt(this.downloadState);
        r1.writeString(this.downloadUri);
    }

    public /* synthetic */ Download(String r2, String r3, String r4, int r5, String r6, int r7, xj0 r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r7 & 16) == 0) goto L14;
        r6 = null;
    L14:
        this(r2, r3, r4, r5, r6);
    }

    public Download(String r40, String r41, String r42, int r43, String r44) {
        r40.getClass();
        super(r40, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        this.id = r40;
        this.playlistId = r41;
        this.playlistName = r42;
        this.downloadState = r43;
        this.downloadUri = r44;
    }
}
