package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw0 extends z2 {
    public final /* synthetic */ int q;

    public /* synthetic */ fw0(int r1) {
        this.q = r1;
    }

    @Override // defpackage.z2
    public void c(View r2, AccessibilityEvent r3) {
        switch(this.q) {
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        super.c(r2, r3);
        return;
    L6:
        super.c(r2, r3);
        NestedScrollView r4 = (NestedScrollView) r2;
        r3.setClassName(ScrollView.class.getName());
        if (r4.getScrollRange() <= 0) goto L9;
        boolean r1 = true;
    L10:
        r3.setScrollable(r1);
        r3.setScrollX(r4.getScrollX());
        r3.setScrollY(r4.getScrollY());
        r3.setMaxScrollX(r4.getScrollX());
        r3.setMaxScrollY(r4.getScrollRange());
        return;
    L9:
        r1 = false;
        goto L10
    }

    @Override // defpackage.z2
    public final void d(View r4, v3 r5) {
        int r0 = this.q;
        View.AccessibilityDelegate r3 = this.n;
        switch(r0) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            default: goto L4;
        };
    L4:
        r3.onInitializeAccessibilityNodeInfo(r4, r5.a);
        NestedScrollView r6 = (NestedScrollView) r4;
        r5.i(ScrollView.class.getName());
        if (r6.isEnabled() == false) goto L28;
        int r7 = r6.getScrollRange();
        if (r7 <= 0) goto L29;
        r5.m(true);
        if (r6.getScrollY() <= 0) goto L12;
        r5.b(o3.k);
        r5.b(o3.p);
    L12:
        if (r6.getScrollY() >= r7) goto L30;
        r5.b(o3.j);
        r5.b(o3.r);
        return;
    L30:
        return;
    L29:
        return;
    L28:
        return;
    L15:
        r3.onInitializeAccessibilityNodeInfo(r4, r5.a);
        r5.j(null);
        return;
    L17:
        r3.onInitializeAccessibilityNodeInfo(r4, r5.a);
        r5.m(false);
        return;
    L19:
        r3.onInitializeAccessibilityNodeInfo(r4, r5.a);
        r5.j(null);
        return;
    L21:
        AccessibilityNodeInfo r1 = r5.a;
        r3.onInitializeAccessibilityNodeInfo(r4, r1);
        int[] r8 = DrawerLayout.P;
        WeakHashMap r9 = j65.a;
        if (r4.getImportantForAccessibility() != 4) goto L24;
    L26:
        r5.b = -1;
        r1.setParent(null);
        return;
    L24:
        if (r4.getImportantForAccessibility() == 2) goto L26;
    }

    @Override // defpackage.z2
    public boolean g(View r4, int r5, Bundle r6) {
        switch(this.q) {
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return super.g(r4, r5, r6);
    L7:
        if (super.g(r4, r5, r6) == true) goto L36;
        NestedScrollView r7 = (NestedScrollView) r4;
        if (r7.isEnabled() == false) goto L33;
        int r3 = r7.getHeight();
        Rect r1 = new Rect();
        if (r7.getMatrix().isIdentity() == false) goto L18;
        if (r7.getGlobalVisibleRect(r1) == false) goto L18;
        r3 = r1.height();
    L18:
        if (r5 != 4096) goto L20;
    L29:
        int r8 = (r3 - r7.getPaddingBottom()) - r7.getPaddingTop();
        int r9 = Math.min(r7.getScrollY() + r8, r7.getScrollRange());
        if (r9 == r7.getScrollY()) goto L33;
        r7.u(0 - r7.getScrollX(), r9 - r7.getScrollY(), true);
        return true;
    L20:
        if (r5 != 8192) goto L22;
    L26:
        int r10 = (r3 - r7.getPaddingBottom()) - r7.getPaddingTop();
        int r11 = Math.max(r7.getScrollY() - r10, 0);
        if (r11 == r7.getScrollY()) goto L33;
        r7.u(0 - r7.getScrollX(), r11 - r7.getScrollY(), true);
        return true;
    L22:
        if (r5 == 16908344) goto L26;
        if (r5 == 16908346) goto L29;
    L33:
        return false;
    L36:
        return true;
    }
}
