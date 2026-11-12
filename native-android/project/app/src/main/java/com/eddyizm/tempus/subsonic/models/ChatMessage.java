package com.eddyizm.tempus.subsonic.models;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ChatMessage {
    public static final int $stable = 8;
    private String message;
    private long time;
    private String username;

    public final String getMessage() {
        return this.message;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUsername(String str) {
        this.username = str;
    }
}
