package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c35 {
    public static final /* synthetic */ int[] a = null;

    static {
        int[] r0 = new int[Bitmap.Config.values().length];
        a = r0;
        r0[Bitmap.Config.ALPHA_8.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
    L14:
        a[Bitmap.Config.RGB_565.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
    L16:
        a[Bitmap.Config.ARGB_4444.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
    L18:
        a[j3.d().ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
    L20:
        a[Bitmap.Config.ARGB_8888.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
        return;
    }
}
