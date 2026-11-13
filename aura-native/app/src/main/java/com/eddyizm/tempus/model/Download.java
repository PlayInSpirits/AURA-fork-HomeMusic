package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.w4;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Download extends Child {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Download> CREATOR = new w4(24);
    private int downloadState;
    private String downloadUri;
    private final String id;
    private String playlistId;
    private String playlistName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Download(Child child) {
        this(child.getId(), null, null, 0, null, 30, null);
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

    public final void setDownloadState(int i) {
        this.downloadState = i;
    }

    public final void setDownloadUri(String str) {
        this.downloadUri = str;
    }

    public final void setPlaylistId(String str) {
        this.playlistId = str;
    }

    public final void setPlaylistName(String str) {
        this.playlistName = str;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.playlistId);
        parcel.writeString(this.playlistName);
        parcel.writeInt(this.downloadState);
        parcel.writeString(this.downloadUri);
    }

    public /* synthetic */ Download(String str, String str2, String str3, int i, String str4, int i2, xj0 xj0Var) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Download(String str, String str2, String str3, int i, String str4) {
        super(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        str.getClass();
        this.id = str;
        this.playlistId = str2;
        this.playlistName = str3;
        this.downloadState = i;
        this.downloadUri = str4;
    }
}
