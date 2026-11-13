package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class w3 extends AccessibilityNodeProvider {
    public final zh0 a;

    public w3(zh0 zh0Var) {
        this.a = zh0Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        v3 z = this.a.z(i);
        if (z == null) {
            return null;
        }
        return z.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        v3 C = this.a.C(i);
        if (C == null) {
            return null;
        }
        return C.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.F(i, i2, bundle);
    }
}
