package com.eddyizm.tempus.subsonic.models;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Error {
    public static final int $stable = 8;
    private Integer code;
    private String message;

    public Error() {
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(Integer r1) {
        this.code = r1;
    }

    public final void setMessage(String r1) {
        this.message = r1;
    }
}
