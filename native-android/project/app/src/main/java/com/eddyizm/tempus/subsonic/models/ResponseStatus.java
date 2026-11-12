package com.eddyizm.tempus.subsonic.models;

import defpackage.o14;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ResponseStatus {
    public static final int $stable = 0;
    public static final o14 Companion = null;
    public static String FAILED = "failed";
    public static String OK = "ok";
    private final String value;

    static {
        Companion = new o14();
    }

    public ResponseStatus(String r1) {
        r1.getClass();
        this.value = r1;
    }

    public final String getValue() {
        return this.value;
    }
}
