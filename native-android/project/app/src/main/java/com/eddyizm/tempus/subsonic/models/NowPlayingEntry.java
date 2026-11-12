package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class NowPlayingEntry extends Child {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NowPlayingEntry> CREATOR = null;

    @ka4("_id")
    private final String id;
    private int minutesAgo;
    private int playerId;
    private String playerName;
    private String username;

    static {
        CREATOR = new b23(3);
    }

    public NowPlayingEntry(String r40, String r41, int r42, int r43, String r44) {
        r40.getClass();
        super(r40, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        this.id = r40;
        this.username = r41;
        this.minutesAgo = r42;
        this.playerId = r43;
        this.playerName = r44;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child
    public String getId() {
        return this.id;
    }

    public final int getMinutesAgo() {
        return this.minutesAgo;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setMinutesAgo(int r1) {
        this.minutesAgo = r1;
    }

    public final void setPlayerId(int r1) {
        this.playerId = r1;
    }

    public final void setPlayerName(String r1) {
        this.playerName = r1;
    }

    public final void setUsername(String r1) {
        this.username = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.id);
        r1.writeString(this.username);
        r1.writeInt(this.minutesAgo);
        r1.writeInt(this.playerId);
        r1.writeString(this.playerName);
    }

    public /* synthetic */ NowPlayingEntry(String r3, String r4, int r5, int r6, String r7, int r8, xj0 r9) {
        if ((r8 & 2) == 0) goto L6;
        r4 = null;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r5 = 0;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r6 = 0;
    L12:
        if ((r8 & 16) == 0) goto L14;
        r7 = null;
    L14:
        this(r3, r4, r5, r6, r7);
    }
}
