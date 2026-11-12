package com.eddyizm.tempus.subsonic.models;

import defpackage.in3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PodcastStatus {
    public static final int $stable = 8;
    private static String COMPLETED = "completed";
    public static final in3 Companion = new in3();
    private static String DELETED = "deleted";
    private static String DOWNLOADING = "downloading";
    private static String ERROR = "error";
    private static String NEW = "new";
    private static String SKIPPED = "skipped";
    private String value;

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
