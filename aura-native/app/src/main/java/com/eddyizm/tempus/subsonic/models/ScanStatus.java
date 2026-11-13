package com.eddyizm.tempus.subsonic.models;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ScanStatus {
    public static final int $stable = 8;
    private Long count;
    private boolean isScanning;

    public final Long getCount() {
        return this.count;
    }

    public final boolean isScanning() {
        return this.isScanning;
    }

    public final void setCount(Long l) {
        this.count = l;
    }

    public final void setScanning(boolean z) {
        this.isScanning = z;
    }
}
