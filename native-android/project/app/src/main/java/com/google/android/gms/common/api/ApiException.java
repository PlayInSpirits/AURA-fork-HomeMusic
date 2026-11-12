package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {
    public final Status n;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i = status.n;
        String str = status.o;
        super(i + ": " + (str == null ? "" : str));
        this.n = status;
    }
}
