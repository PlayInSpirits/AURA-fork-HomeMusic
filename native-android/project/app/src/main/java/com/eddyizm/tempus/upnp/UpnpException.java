package com.eddyizm.tempus.upnp;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class UpnpException extends Exception {
    public final int n;

    public UpnpException(int r3, String r4) {
        super("UPnP error " + r3 + ": " + r4);
        this.n = r3;
    }
}
