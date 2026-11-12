package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Shares {
    public static final int $stable = 8;

    @ka4("share")
    private List<Share> shares;

    public final List<Share> getShares() {
        return this.shares;
    }

    public final void setShares(List<Share> list) {
        this.shares = list;
    }
}
