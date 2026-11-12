package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n65 {
    public static final Method a = null;

    static {
        if (Build.VERSION.SDK_INT != 25) goto L10;
        a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);     // Catch: Exception -> L6
        return;
    L6:
        Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
        return;
    }

    public static float a(ViewConfiguration r3, Context r4) {
        if (Build.VERSION.SDK_INT < 25) goto L11;
        Method r0 = a;
        if (r0 == null) goto L11;
        return ((Integer) r0.invoke(r3, null)).intValue();
    L10:
        Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
    L11:
        TypedValue r5 = new TypedValue();
        if (r4.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, r5, true) == true) goto L14;
        return 0.0f;
    L14:
        return r5.getDimension(r4.getResources().getDisplayMetrics());
    }
}
