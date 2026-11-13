package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rf4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
