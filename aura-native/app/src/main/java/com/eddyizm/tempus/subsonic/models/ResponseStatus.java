package com.eddyizm.tempus.subsonic.models;

import defpackage.o14;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ResponseStatus {
    public static final int $stable = 0;
    public static final o14 Companion = new o14();
    public static String FAILED = "failed";
    public static String OK = "ok";
    private final String value;

    public ResponseStatus(String str) {
        str.getClass();
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
