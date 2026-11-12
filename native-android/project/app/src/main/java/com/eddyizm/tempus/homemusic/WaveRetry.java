package com.eddyizm.tempus.homemusic;

import defpackage.gb;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveRetry {
    public static final int MAX_FAILURES = 16;
    private static final int MAX_POLLS = 15;
    public static final long POLL_MS = 4000;
    public static final WaveRetry INSTANCE = new WaveRetry();
    private static final long[] BACKOFF_MS = {5000, 15000, 30000, 60000, 120000, 300000};
    public static final int $stable = 8;

    private WaveRetry() {
    }

    public final Long afterFailure(int i) {
        if (i > 16) {
            return null;
        }
        long[] jArr = BACKOFF_MS;
        return Long.valueOf(jArr[gb.m(i - 1, 0, jArr.length - 1)]);
    }

    public final Long afterPending(int i) {
        return i <= MAX_POLLS ? Long.valueOf(POLL_MS) : afterFailure(i - MAX_POLLS);
    }
}
