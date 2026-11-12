package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int r2, IOException r3, String r4) {
        super(r4 + ", status code: " + r2, r3);
    }
}
