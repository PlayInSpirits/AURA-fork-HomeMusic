package com.eddyizm.tempus.homemusic;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubUpdatePatch extends HubUpdateFile {
    public static final int $stable = 8;
    private String baseSha256;
    private long baseVersionCode;
    private String format;

    public HubUpdatePatch() {
    }

    public final String getBaseSha256() {
        return this.baseSha256;
    }

    public final long getBaseVersionCode() {
        return this.baseVersionCode;
    }

    public final String getFormat() {
        return this.format;
    }

    public final void setBaseSha256(String r1) {
        this.baseSha256 = r1;
    }

    public final void setBaseVersionCode(long r1) {
        this.baseVersionCode = r1;
    }

    public final void setFormat(String r1) {
        this.format = r1;
    }
}
