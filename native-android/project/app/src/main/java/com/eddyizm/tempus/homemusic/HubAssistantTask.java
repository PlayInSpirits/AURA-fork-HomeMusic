package com.eddyizm.tempus.homemusic;

import defpackage.ka4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubAssistantTask {
    public static final int $stable = 8;

    @ka4("batch_id")
    private Long batchId;
    private String error;
    private long id;
    private String status;

    public HubAssistantTask() {
    }

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

    public final void setBatchId(Long r1) {
        this.batchId = r1;
    }

    public final void setError(String r1) {
        this.error = r1;
    }

    public final void setId(long r1) {
        this.id = r1;
    }

    public final void setStatus(String r1) {
        this.status = r1;
    }
}
