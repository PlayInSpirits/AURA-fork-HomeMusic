package com.eddyizm.tempus.homemusic;

import defpackage.ka4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubMe {
    public static final int $stable = 8;
    private String email;

    @ka4("google_email")
    private String googleEmail;
    private int id;

    @ka4("is_admin")
    private boolean isAdmin;
    private String username;

    public HubMe() {
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getGoogleEmail() {
        return this.googleEmail;
    }

    public final int getId() {
        return this.id;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isAdmin() {
        return this.isAdmin;
    }

    public final void setAdmin(boolean r1) {
        this.isAdmin = r1;
    }

    public final void setEmail(String r1) {
        this.email = r1;
    }

    public final void setGoogleEmail(String r1) {
        this.googleEmail = r1;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setUsername(String r1) {
        this.username = r1;
    }
}
