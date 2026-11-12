package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class f85 extends wr1 {
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;

    public void V(View r1, int r2, int r3, int r4, int r5) {
        if (l == false) goto L10;
        lm4.t(r1, r2, r3, r4, r5);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        l = false;
        return;
    }

    public void W(View r3, int r4) {
        if (Build.VERSION.SDK_INT != 28) goto L16;
        if (wr1.h == false) goto L22;
    L11:
        Field r2 = wr1.g;
        if (r2 == null) goto L28;
        int r5 = r2.getInt(r3);     // Catch: IllegalAccessException -> L21
        wr1.g.setInt(r3, (r5 & (-13)) | r4);     // Catch: IllegalAccessException -> L21
        return;
    L31:
        return;
    L28:
        return;
    L22:
        Field r0 = View.class.getDeclaredField("mViewFlags");     // Catch: NoSuchFieldException -> L9
        wr1.g = r0;     // Catch: NoSuchFieldException -> L9
        r0.setAccessible(true);     // Catch: NoSuchFieldException -> L9
    L10:
        wr1.h = true;
    L9:
        Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
        goto L10
    L16:
        if (m == false) goto L29;
        lm4.s(r3, r4);     // Catch: NoSuchMethodError -> L19
        return;
    L19:
        m = false;
        return;
    }

    public void X(View r1, Matrix r2) {
        if (j == false) goto L10;
        z9.s(r1, r2);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        j = false;
        return;
    }

    public void Y(ViewGroup r1, Matrix r2) {
        if (k == false) goto L10;
        lm4.u(r1, r2);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        k = false;
        return;
    }
}
