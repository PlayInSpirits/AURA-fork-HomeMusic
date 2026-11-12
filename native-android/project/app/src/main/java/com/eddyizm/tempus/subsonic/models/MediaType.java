package com.eddyizm.tempus.subsonic.models;

import defpackage.gu2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaType {
    public static final int $stable = 8;
    private static String AUDIOBOOK = "audiobook";
    public static final gu2 Companion = null;
    private static String MUSIC = "music";
    private static String PODCAST = "podcast";
    private static String VIDEO = "video";
    private String value;

    static {
        Companion = new gu2();
    }

    public MediaType() {
    }

    public static final /* synthetic */ String access$getAUDIOBOOK$cp() {
        return AUDIOBOOK;
    }

    public static final /* synthetic */ String access$getMUSIC$cp() {
        return MUSIC;
    }

    public static final /* synthetic */ String access$getPODCAST$cp() {
        return PODCAST;
    }

    public static final /* synthetic */ String access$getVIDEO$cp() {
        return VIDEO;
    }

    public static final /* synthetic */ void access$setAUDIOBOOK$cp(String r0) {
        AUDIOBOOK = r0;
    }

    public static final /* synthetic */ void access$setMUSIC$cp(String r0) {
        MUSIC = r0;
    }

    public static final /* synthetic */ void access$setPODCAST$cp(String r0) {
        PODCAST = r0;
    }

    public static final /* synthetic */ void access$setVIDEO$cp(String r0) {
        VIDEO = r0;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String r1) {
        this.value = r1;
    }
}
