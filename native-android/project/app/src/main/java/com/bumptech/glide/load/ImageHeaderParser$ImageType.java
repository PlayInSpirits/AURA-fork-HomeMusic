package com.bumptech.glide.load;

import defpackage.vv1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ImageHeaderParser$ImageType extends Enum<ImageHeaderParser$ImageType> {
    private static final /* synthetic */ ImageHeaderParser$ImageType[] $VALUES = null;
    public static final ImageHeaderParser$ImageType ANIMATED_AVIF = null;
    public static final ImageHeaderParser$ImageType ANIMATED_WEBP = null;
    public static final ImageHeaderParser$ImageType AVIF = null;
    public static final ImageHeaderParser$ImageType GIF = null;
    public static final ImageHeaderParser$ImageType JPEG = null;
    public static final ImageHeaderParser$ImageType PNG = null;
    public static final ImageHeaderParser$ImageType PNG_A = null;
    public static final ImageHeaderParser$ImageType RAW = null;
    public static final ImageHeaderParser$ImageType UNKNOWN = null;
    public static final ImageHeaderParser$ImageType WEBP = null;
    public static final ImageHeaderParser$ImageType WEBP_A = null;
    public final boolean n;

    static {
        ImageHeaderParser$ImageType r0 = new ImageHeaderParser$ImageType(0, "GIF", true);
        GIF = r0;
        ImageHeaderParser$ImageType r1 = new ImageHeaderParser$ImageType(1, "JPEG", false);
        JPEG = r1;
        ImageHeaderParser$ImageType r2 = new ImageHeaderParser$ImageType(2, "RAW", false);
        RAW = r2;
        ImageHeaderParser$ImageType r3 = new ImageHeaderParser$ImageType(3, "PNG_A", true);
        PNG_A = r3;
        ImageHeaderParser$ImageType r4 = new ImageHeaderParser$ImageType(4, "PNG", false);
        PNG = r4;
        ImageHeaderParser$ImageType r5 = new ImageHeaderParser$ImageType(5, "WEBP_A", true);
        WEBP_A = r5;
        ImageHeaderParser$ImageType r6 = new ImageHeaderParser$ImageType(6, "WEBP", false);
        WEBP = r6;
        ImageHeaderParser$ImageType r7 = new ImageHeaderParser$ImageType(7, "ANIMATED_WEBP", true);
        ANIMATED_WEBP = r7;
        ImageHeaderParser$ImageType r8 = new ImageHeaderParser$ImageType(8, "AVIF", true);
        AVIF = r8;
        ImageHeaderParser$ImageType r9 = new ImageHeaderParser$ImageType(9, "ANIMATED_AVIF", true);
        ANIMATED_AVIF = r9;
        ImageHeaderParser$ImageType r10 = new ImageHeaderParser$ImageType(10, "UNKNOWN", false);
        UNKNOWN = r10;
        $VALUES = new ImageHeaderParser$ImageType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
    }

    public ImageHeaderParser$ImageType(int r1, String r2, boolean r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static ImageHeaderParser$ImageType valueOf(String r1) {
        return (ImageHeaderParser$ImageType) Enum.valueOf(ImageHeaderParser$ImageType.class, r1);
    }

    public static ImageHeaderParser$ImageType[] values() {
        return (ImageHeaderParser$ImageType[]) $VALUES.clone();
    }

    public boolean hasAlpha() {
        return this.n;
    }

    public boolean isWebp() {
        int r2 = vv1.a[ordinal()];
        if (r2 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r2 == 2) goto L10;
        if (r2 == 3) goto L10;
        return false;
    }
}
