package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class w3 extends AccessibilityNodeProvider {
    public final zh0 a;

    public w3(zh0 r1) {
        this.a = r1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r1) {
        v3 r0 = this.a.z(r1);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String r1, int r2) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r1) {
        v3 r0 = this.a.C(r1);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r1, int r2, Bundle r3) {
        return this.a.F(r1, r2, r3);
    }
}
