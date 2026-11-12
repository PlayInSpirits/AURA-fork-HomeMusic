package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pg3 extends Surface {
    public static int q;
    public static boolean r;
    public final boolean n;
    public final og3 o;
    public boolean p;

    public pg3(og3 r1, SurfaceTexture r2, boolean r3) {
        super(r2);
        this.o = r1;
        this.n = r3;
    }

    public static int a(Context r5) {
        int r1 = Build.VERSION.SDK_INT;     // Catch: GlUtil$GlException -> L22
        if (r1 < 26) goto L6;
    L10:
        if (r1 < 26) goto L12;
    L14:
        boolean r6 = j51.D("EGL_EXT_protected_content");     // Catch: GlUtil$GlException -> L22
    L15:
        if (r6 == false) goto L24;
        if (j51.D("EGL_KHR_surfaceless_context") == false) goto L20;
        return 1;
    L20:
        return 2;
    L24:
        return 0;
    L12:
        if (r5.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance") == true) goto L14;
    L9:
        r6 = false;
        goto L15
    L6:
        if ("samsung".equals(Build.MANUFACTURER) == true) goto L9;
        if ("XT1650".equals(Build.MODEL) == false) goto L10;
    L22:
        e = move-exception;
        l93.F("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
        return 0;
    }

    public static synchronized boolean b(Context r3) {
        monitor-enter(pg3.class);
        boolean r2 = true;
        if (r == true) goto L9;
        q = a(r3);     // Catch: Throwable -> L7
        r = true;     // Catch: Throwable -> L7
    L9:
        if (q != 0) goto L13;
        r2 = false;
    L13:
        monitor-exit(pg3.class);
        return r2;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        og3 r0 = this.o;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.p == true) goto L9;
        og3 r1 = this.o;     // Catch: Throwable -> L7
        r1.o.getClass();     // Catch: Throwable -> L7
        r1.o.sendEmptyMessage(2);     // Catch: Throwable -> L7
        this.p = true;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }
}
