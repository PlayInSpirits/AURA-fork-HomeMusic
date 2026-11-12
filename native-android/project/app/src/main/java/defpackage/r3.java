package defpackage;

import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r3 {
    public static int a(AccessibilityNodeInfo r0) {
        return r0.getChecked();
    }

    public static int b(AccessibilityNodeInfo r0) {
        return r0.getExpandedState();
    }

    public static CharSequence c(AccessibilityNodeInfo r0) {
        return r0.getSupplementalDescription();
    }

    public static boolean d(AccessibilityNodeInfo r0) {
        return r0.isFieldRequired();
    }

    public static void e(Notification.Builder r1) {
        r1.setShortCriticalText(null);
    }
}
