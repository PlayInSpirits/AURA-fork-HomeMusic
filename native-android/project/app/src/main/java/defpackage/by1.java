package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 extends View.AccessibilityDelegate {
    public final /* synthetic */ cy1 a;

    public by1(cy1 r1) {
        this.a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r1, AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r1, r2);
        EditText r0 = this.a.h.getEditText();
        if (r0 == null) goto L6;
        r2.setLabeledBy(r0);
        return;
    }
}
