package com.eddyizm.tempus.homemusic;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class HubAppRelease {
    public static final int $stable = 8;
    private HubUpdateFile full;
    private String notes;
    private List<HubUpdatePatch> patches;
    private String sha256;
    private long size;
    private String url;
    private long versionCode;
    private String versionName;

    public final HubUpdateFile getFull() {
        return this.full;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<HubUpdatePatch> getPatches() {
        return this.patches;
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

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final void setFull(HubUpdateFile hubUpdateFile) {
        this.full = hubUpdateFile;
    }

    public final void setNotes(String str) {
        this.notes = str;
    }

    public final void setPatches(List<HubUpdatePatch> list) {
        this.patches = list;
    }

    public final void setSha256(String str) {
        this.sha256 = str;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVersionCode(long j) {
        this.versionCode = j;
    }

    public final void setVersionName(String str) {
        this.versionName = str;
    }
}
