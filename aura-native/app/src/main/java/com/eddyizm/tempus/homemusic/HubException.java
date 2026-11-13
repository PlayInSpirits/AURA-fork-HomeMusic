package com.eddyizm.tempus.homemusic;

import java.io.IOException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class HubException extends IOException {
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubException(int i, String str) {
        super(str);
        str.getClass();
        this.n = i;
    }

    public HubException(String str) {
        super(str);
        this.n = 0;
    }
}
