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

    public pg3(og3 og3Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.o = og3Var;
        this.n = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (((i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? j51.D("EGL_EXT_protected_content") : false) {
                return j51.D("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (GlUtil$GlException e) {
            l93.F("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!r) {
                q = a(context);
                r = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return q != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.o) {
            try {
                if (!this.p) {
                    og3 og3Var = this.o;
                    og3Var.o.getClass();
                    og3Var.o.sendEmptyMessage(2);
                    this.p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
