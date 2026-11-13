/*
 * Decompiled with CFR 0.152.
 */
package com.eddyizm.tempus.homemusic;

import defpackage.gb;

public final class WaveRetry {
    public static final int $stable;
    private static final long[] BACKOFF_MS;
    public static final WaveRetry INSTANCE;
    public static final int MAX_FAILURES = 16;
    private static final int MAX_POLLS = 15;
    public static final long POLL_MS = 4000L;

    static {
        INSTANCE = new WaveRetry();
        BACKOFF_MS = new long[]{5000L, 15000L, 30000L, 60000L, 120000L, 300000L};
        $stable = 8;
    }

    private WaveRetry() {
    }

    public final Long afterFailure(int n16) {
        if (n16 > 16) {
            return null;
        }
        long[] lArray = BACKOFF_MS;
        return lArray[gb.m(n16 - 1, 0, lArray.length - 1)];
    }

    public final Long afterPending(int n16) {
        if (n16 <= 15) {
            return 4000L;
        }
        return this.afterFailure(n16 - 15);
    }
}

