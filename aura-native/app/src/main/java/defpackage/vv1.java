package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class vv1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
