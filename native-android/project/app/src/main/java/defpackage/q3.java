package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q3 {
    public static PackageInfo a(PackageManager r2, Context r3) {
        return r2.getPackageInfo(r3.getPackageName(), PackageManager.PackageInfoFlags.of(0));
    }

    public static Object b(String r1, Bundle r2) {
        return r2.getParcelable(r1, o5.class);
    }

    public static String c(AccessibilityNodeInfo r0) {
        return r0.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo r0) {
        return r0.isTextSelectable();
    }
}
