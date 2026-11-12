package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PodcastChannel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PodcastChannel> CREATOR = null;

    @ka4("coverArt")
    private String coverArtId;
    private String description;

    @ka4("episode")
    private List<PodcastEpisode> episodes;
    private String errorMessage;
    private String id;
    private String originalImageUrl;
    private String status;
    private String title;
    private String url;

    static {
        CREATOR = new b23(16);
    }

    public /* synthetic */ PodcastChannel(List r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, xj0 r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = null;
    L29:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCoverArtId() {
        return this.coverArtId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<PodcastEpisode> getEpisodes() {
        return this.episodes;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setCoverArtId(String r1) {
        this.coverArtId = r1;
    }

    public final void setDescription(String r1) {
        this.description = r1;
    }

    public final void setEpisodes(List<PodcastEpisode> r1) {
        this.episodes = r1;
    }

    public final void setErrorMessage(String r1) {
        this.errorMessage = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setOriginalImageUrl(String r1) {
        this.originalImageUrl = r1;
    }

    public final void setStatus(String r1) {
        this.status = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        List<PodcastEpisode> r0 = this.episodes;
        if (r0 != null) goto L5;
        r3.writeInt(0);
    L9:
        r3.writeString(this.id);
        r3.writeString(this.url);
        r3.writeString(this.title);
        r3.writeString(this.description);
        r3.writeString(this.coverArtId);
        r3.writeString(this.originalImageUrl);
        r3.writeString(this.status);
        r3.writeString(this.errorMessage);
        return;
    L5:
        r3.writeInt(1);
        r3.writeInt(r0.size());
        Iterator<PodcastEpisode> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        r1.next().writeToParcel(r3, r4);
        goto L7
    }

    public PodcastChannel(List<PodcastEpisode> r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.episodes = r1;
        this.id = r2;
        this.url = r3;
        this.title = r4;
        this.description = r5;
        this.coverArtId = r6;
        this.originalImageUrl = r7;
        this.status = r8;
        this.errorMessage = r9;
    }

    public PodcastChannel() {
        List r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }
}
