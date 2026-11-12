package com.eddyizm.tempus.subsonic.models;

import defpackage.h12;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Line {
    public static final int $stable = 8;
    private Integer start;
    public String value;

    public final Integer getStart() {
        return this.start;
    }

    public final String getValue() {
        String str = this.value;
        if (str != null) {
            return str;
        }
        h12.Q("value");
        throw null;
    }

    public final void setStart(Integer num) {
        this.start = num;
    }

    public final void setValue(String str) {
        str.getClass();
        this.value = str;
    }
}
