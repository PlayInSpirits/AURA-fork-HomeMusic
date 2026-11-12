package com.eddyizm.tempus.homemusic;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubDownloadItem {
    public static final int $stable = 8;
    private long id;
    private boolean star;
    private String status;

    public HubDownloadItem() {
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getStar() {
        return this.star;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setId(long r1) {
        this.id = r1;
    }

    public final void setStar(boolean r1) {
        this.star = r1;
    }

    public final void setStatus(String r1) {
        this.status = r1;
    }
}
