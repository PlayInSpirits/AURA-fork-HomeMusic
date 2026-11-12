package com.eddyizm.tempus.subsonic.base;

import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import defpackage.ka4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ApiResponse {
    public static final int $stable = 8;

    @ka4("subsonic-response")
    private SubsonicResponse subsonicResponse;

    public ApiResponse() {
        SubsonicResponse subsonicResponse = new SubsonicResponse();
        subsonicResponse.setStatus(ResponseStatus.FAILED);
        this.subsonicResponse = subsonicResponse;
    }

    public final SubsonicResponse getSubsonicResponse() {
        return this.subsonicResponse;
    }

    public final void setSubsonicResponse(SubsonicResponse subsonicResponse) {
        subsonicResponse.getClass();
        this.subsonicResponse = subsonicResponse;
    }
}
