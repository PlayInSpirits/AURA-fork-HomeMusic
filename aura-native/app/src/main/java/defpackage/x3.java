package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x3 extends w3 {
    public x3(defpackage.zh0 a0) {
        super(a0);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.y(i, new v3(accessibilityNodeInfo), str, bundle);
    }
}
