package com.eddyizm.tempus.subsonic.models;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ScanStatus {
    public static final int $stable = 8;
    private Long count;
    private boolean isScanning;

    public ScanStatus() {
    }

    public final Long getCount() {
        return this.count;
    }

    public final boolean isScanning() {
        return this.isScanning;
    }

    public final void setCount(Long r1) {
        this.count = r1;
    }

    public final void setScanning(boolean r1) {
        this.isScanning = r1;
    }
}
