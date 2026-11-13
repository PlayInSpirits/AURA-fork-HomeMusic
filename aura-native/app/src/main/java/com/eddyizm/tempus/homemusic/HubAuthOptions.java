package com.eddyizm.tempus.homemusic;

import defpackage.ka4;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class HubAuthOptions {
    public static final int $stable = 8;

    @ka4("email_signup")
    private boolean emailSignup;

    @ka4("google_client_id")
    private String googleClientId;
    private boolean invites;

    @ka4("music_url")
    private String musicUrl;

    public final boolean getEmailSignup() {
        return this.emailSignup;
    }

    public final String getGoogleClientId() {
        return this.googleClientId;
    }

    public final boolean getInvites() {
        return this.invites;
    }

    public final String getMusicUrl() {
        return this.musicUrl;
    }

    public final void setEmailSignup(boolean z) {
        this.emailSignup = z;
    }

    public final void setGoogleClientId(String str) {
        this.googleClientId = str;
    }

    public final void setInvites(boolean z) {
        this.invites = z;
    }

    public final void setMusicUrl(String str) {
        this.musicUrl = str;
    }
}
