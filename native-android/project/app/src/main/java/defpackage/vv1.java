package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vv1 {
    public static final /* synthetic */ int[] a = null;

    static {
        int[] r0 = new int[ImageHeaderParser$ImageType.values().length];
        a = r0;
        r0[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L10:
        a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L12:
        a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
        return;
    }
}
