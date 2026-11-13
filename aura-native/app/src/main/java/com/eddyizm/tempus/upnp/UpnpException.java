package com.eddyizm.tempus.upnp;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class UpnpException extends Exception {
    public final int n;

    public UpnpException(int i, String str) {
        super("UPnP error " + i + ": " + str);
        this.n = i;
    }
}
