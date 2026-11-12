package com.bumptech.glide.load;

import defpackage.vv1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    public final boolean n;

    ImageHeaderParser$ImageType(boolean z) {
        this.n = z;
    }

    public boolean hasAlpha() {
        return this.n;
    }

    public boolean isWebp() {
        int i = vv1.a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
