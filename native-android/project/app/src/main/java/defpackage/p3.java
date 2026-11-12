package defpackage;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p3 {
    public static Icon a(Uri r0) {
        return Icon.createWithAdaptiveBitmapContentUri(r0);
    }

    public static void b(int r0) {
        SdkExtensions.getExtensionVersion(r0);
    }

    public static CharSequence c(AccessibilityNodeInfo r0) {
        return r0.getStateDescription();
    }

    public static Insets d(DisplayCutout r0) {
        return r0.getWaterfallInsets();
    }

    public static void e(Window r2, boolean r3) {
        View r0 = r2.getDecorView();
        int r1 = r0.getSystemUiVisibility();
        if (r3 == false) goto L5;
        int r4 = r1 & (-257);
    L6:
        r0.setSystemUiVisibility(r4);
        r2.setDecorFitsSystemWindows(r3);
        return;
    L5:
        r4 = r1 | 256;
        goto L6
    }

    public static void f(Window r0, boolean r1) {
        r0.setDecorFitsSystemWindows(r1);
    }

    public static void g(View r1) {
        r1.setImportantForContentCapture(1);
    }

    public static void h(EditorInfo r1, CharSequence r2) {
        r1.setInitialSurroundingSubText(r2, 0);
    }

    public static void i(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }
}
