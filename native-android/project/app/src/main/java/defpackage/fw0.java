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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw0 extends z2 {
    public final /* synthetic */ int q;

    public /* synthetic */ fw0(int i) {
        this.q = i;
    }

    @Override // defpackage.z2
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.q) {
            case 4:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        int scrollRange;
        int i = this.q;
        View.AccessibilityDelegate accessibilityDelegate = this.n;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int[] iArr = DrawerLayout.P;
                WeakHashMap weakHashMap = j65.a;
                if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                    v3Var.b = -1;
                    accessibilityNodeInfo.setParent(null);
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v3Var.a);
                v3Var.j(null);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v3Var.a);
                v3Var.m(false);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v3Var.a);
                v3Var.j(null);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v3Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                v3Var.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    v3Var.m(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        v3Var.b(o3.k);
                        v3Var.b(o3.p);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        v3Var.b(o3.j);
                        v3Var.b(o3.r);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // defpackage.z2
    public boolean g(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.q) {
            case 4:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
