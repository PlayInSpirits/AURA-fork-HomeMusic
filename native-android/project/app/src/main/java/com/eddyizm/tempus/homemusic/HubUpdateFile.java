package com.eddyizm.tempus.homemusic;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class HubUpdateFile {
    public static final int $stable = 8;
    private String sha256;
    private long size;
    private String url;

    public HubUpdateFile() {
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setSha256(String r1) {
        this.sha256 = r1;
    }

    public final void setSize(long r1) {
        this.size = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }
}
