package com.eddyizm.tempus.lan;

import defpackage.r42;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LanConnectionFailure extends Exception {
    public final r42 n;

    public LanConnectionFailure(r42 r1, Exception r2) {
        super(r2);
        this.n = r1;
    }
}
