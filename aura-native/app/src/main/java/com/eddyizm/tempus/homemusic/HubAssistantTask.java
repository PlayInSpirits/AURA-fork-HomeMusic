package com.eddyizm.tempus.homemusic;

import defpackage.ka4;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class HubAssistantTask {
    public static final int $stable = 8;

    @ka4("batch_id")
    private Long batchId;
    private String error;
    private long id;
    private String status;

    public final Long getBatchId() {
        return this.batchId;
    }

    public final String getError() {
        return this.error;
    }

    public final long getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setBatchId(Long l) {
        this.batchId = l;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setStatus(String str) {
        this.status = str;
    }
}
