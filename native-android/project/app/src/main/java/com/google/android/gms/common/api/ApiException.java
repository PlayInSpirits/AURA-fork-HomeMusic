package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {
    public final Status n;

    public ApiException(Status r4) {
        int r0 = r4.n;
        String r1 = r4.o;
        if (r1 != null) goto L6;
        r1 = "";
    L6:
        super(r0 + ": " + r1);
        this.n = r4;
    }
}
