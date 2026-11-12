package com.eddyizm.tempus.subsonic.models;

import defpackage.in3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PodcastStatus {
    public static final int $stable = 8;
    private static String COMPLETED = "completed";
    public static final in3 Companion = null;
    private static String DELETED = "deleted";
    private static String DOWNLOADING = "downloading";
    private static String ERROR = "error";
    private static String NEW = "new";
    private static String SKIPPED = "skipped";
    private String value;

    static {
        Companion = new in3();
    }

    public PodcastStatus() {
    }

    public static final /* synthetic */ String access$getCOMPLETED$cp() {
        return COMPLETED;
    }

    public static final /* synthetic */ String access$getDELETED$cp() {
        return DELETED;
    }

    public static final /* synthetic */ String access$getDOWNLOADING$cp() {
        return DOWNLOADING;
    }

    public static final /* synthetic */ String access$getERROR$cp() {
        return ERROR;
    }

    public static final /* synthetic */ String access$getNEW$cp() {
        return NEW;
    }

    public static final /* synthetic */ String access$getSKIPPED$cp() {
        return SKIPPED;
    }

    public static final /* synthetic */ void access$setCOMPLETED$cp(String r0) {
        COMPLETED = r0;
    }

    public static final /* synthetic */ void access$setDELETED$cp(String r0) {
        DELETED = r0;
    }

    public static final /* synthetic */ void access$setDOWNLOADING$cp(String r0) {
        DOWNLOADING = r0;
    }

    public static final /* synthetic */ void access$setERROR$cp(String r0) {
        ERROR = r0;
    }

    public static final /* synthetic */ void access$setNEW$cp(String r0) {
        NEW = r0;
    }

    public static final /* synthetic */ void access$setSKIPPED$cp(String r0) {
        SKIPPED = r0;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String r1) {
        this.value = r1;
    }
}
