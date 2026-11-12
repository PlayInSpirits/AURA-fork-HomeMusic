package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class OpenSubsonicExtension {
    public static final int $stable = 8;
    private String name;
    private List<Integer> versions;

    public OpenSubsonicExtension() {
    }

    public final String getName() {
        return this.name;
    }

    public final List<Integer> getVersions() {
        return this.versions;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setVersions(List<Integer> r1) {
        this.versions = r1;
    }
}
