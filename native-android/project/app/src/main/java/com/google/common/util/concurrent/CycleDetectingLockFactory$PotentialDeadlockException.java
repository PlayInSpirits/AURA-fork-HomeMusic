package com.google.common.util.concurrent;

import defpackage.fh0;
import defpackage.gh0;
import defpackage.jx1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        jx1.j(3, new Object[]{gh0.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", fh0.class.getName()});
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String r2 = super.getMessage();
        Objects.requireNonNull(r2);
        StringBuilder r0 = new StringBuilder(r2);
        Throwable r3 = null;
    L3:
        if (r3 == null) goto L6;
        r0.append(", ");
        r0.append(r3.getMessage());
        r3 = r3.getCause();
        goto L3
    L6:
        return r0.toString();
    }
}
