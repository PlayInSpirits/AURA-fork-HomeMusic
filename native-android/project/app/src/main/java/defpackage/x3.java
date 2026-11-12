package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends w3 {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r2, AccessibilityNodeInfo r3, String r4, Bundle r5) {
        v3 r0 = new v3(r3);
        this.a.y(r2, r0, r4, r5);
    }
}
