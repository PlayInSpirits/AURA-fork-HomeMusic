package com.eddyizm.tempus.homemusic;

import defpackage.gb;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveRetry {
    public static final int $stable = 0;
    private static final long[] BACKOFF_MS = null;
    public static final WaveRetry INSTANCE = null;
    public static final int MAX_FAILURES = 16;
    private static final int MAX_POLLS = 15;
    public static final long POLL_MS = 4000;

    static {
        INSTANCE = new WaveRetry();
        BACKOFF_MS = new long[]{5000, 15000, 30000, 60000, 120000, 300000};
        $stable = 8;
    }

    private WaveRetry() {
    }

    public final Long afterFailure(int r3) {
        if (r3 <= 16) goto L6;
        return null;
    L6:
        long[] r2 = BACKOFF_MS;
        return Long.valueOf(r2[gb.m(r3 - 1, 0, r2.length - 1)]);
    }

    public final Long afterPending(int r2) {
        if (r2 > MAX_POLLS) goto L7;
        return Long.valueOf(POLL_MS);
    L7:
        return afterFailure(r2 - MAX_POLLS);
    }
}
