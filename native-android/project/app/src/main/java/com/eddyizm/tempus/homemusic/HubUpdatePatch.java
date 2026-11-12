package com.eddyizm.tempus.homemusic;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubUpdatePatch extends HubUpdateFile {
    public static final int $stable = 8;
    private String baseSha256;
    private long baseVersionCode;
    private String format;

    public final String getBaseSha256() {
        return this.baseSha256;
    }

    public final long getBaseVersionCode() {
        return this.baseVersionCode;
    }

    public final String getFormat() {
        return this.format;
    }

    public final void setBaseSha256(String str) {
        this.baseSha256 = str;
    }

    public final void setBaseVersionCode(long j) {
        this.baseVersionCode = j;
    }

    public final void setFormat(String str) {
        this.format = str;
    }
}
