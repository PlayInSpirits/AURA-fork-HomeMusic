package com.eddyizm.tempus.subsonic.models;

import defpackage.gu2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaType {
    public static final int $stable = 8;
    private static String AUDIOBOOK = "audiobook";
    public static final gu2 Companion = new gu2();
    private static String MUSIC = "music";
    private static String PODCAST = "podcast";
    private static String VIDEO = "video";
    private String value;

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
