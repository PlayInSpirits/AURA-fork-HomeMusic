package com.eddyizm.tempus.homemusic;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    public HubAppRelease() {
    }

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

    public final void setFull(HubUpdateFile r1) {
        this.full = r1;
    }

    public final void setNotes(String r1) {
        this.notes = r1;
    }

    public final void setPatches(List<HubUpdatePatch> r1) {
        this.patches = r1;
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

    public final void setVersionCode(long r1) {
        this.versionCode = r1;
    }

    public final void setVersionName(String r1) {
        this.versionName = r1;
    }
}
