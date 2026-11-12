package defpackage;

import android.graphics.ColorSpace;
import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class no {
    public static /* bridge */ /* synthetic */ int a() {
        return Build.VERSION.SDK_INT_FULL;
    }

    public static /* bridge */ /* synthetic */ long b(BackEvent r2) {
        return r2.getFrameTimeMillis();
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Named c() {
        return ColorSpace.Named.OK_LAB;
    }

    public static /* bridge */ /* synthetic */ long d(BackEvent r2) {
        return r2.getFrameTimeMillis();
    }
}
