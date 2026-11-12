package com.eddyizm.tempus.subsonic.models;

import defpackage.h12;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Line {
    public static final int $stable = 8;
    private Integer start;
    public String value;

    public Line() {
    }

    public final Integer getStart() {
        return this.start;
    }

    public final String getValue() {
        String r0 = this.value;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("value");
        throw null;
    }

    public final void setStart(Integer r1) {
        this.start = r1;
    }

    public final void setValue(String r1) {
        r1.getClass();
        this.value = r1;
    }
}
