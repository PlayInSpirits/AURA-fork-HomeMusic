package com.eddyizm.tempus.homemusic;

import defpackage.ka4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubAuthOptions {
    public static final int $stable = 8;

    @ka4("email_signup")
    private boolean emailSignup;

    @ka4("google_client_id")
    private String googleClientId;
    private boolean invites;

    @ka4("music_url")
    private String musicUrl;

    public HubAuthOptions() {
    }

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

    public final void setEmailSignup(boolean r1) {
        this.emailSignup = r1;
    }

    public final void setGoogleClientId(String r1) {
        this.googleClientId = r1;
    }

    public final void setInvites(boolean r1) {
        this.invites = r1;
    }

    public final void setMusicUrl(String r1) {
        this.musicUrl = r1;
    }
}
