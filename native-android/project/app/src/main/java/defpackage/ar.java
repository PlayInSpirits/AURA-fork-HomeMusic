package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ar extends z2 {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public ar(DrawerLayout drawerLayout) {
        this.q = 3;
        this.r = drawerLayout;
        new Rect();
    }

    @Override // defpackage.z2
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.q) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                DrawerLayout drawerLayout = (DrawerLayout) this.r;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.n.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View viewG = drawerLayout.g();
                if (viewG != null) {
                    int iJ = drawerLayout.j(viewG);
                    WeakHashMap weakHashMap = j65.a;
                    Gravity.getAbsoluteGravity(iJ, drawerLayout.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z2
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.q) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.r).q);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        int i;
        int i2 = this.q;
        Object obj = this.r;
        View.AccessibilityDelegate accessibilityDelegate = this.n;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                v3Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = v3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((yt) obj).x) {
                    v3Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                }
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = v3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.r);
                accessibilityNodeInfo3.setChecked(checkableImageButton.q);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int[] iArr = DrawerLayout.P;
                AccessibilityNodeInfo accessibilityNodeInfo4 = v3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                v3Var.i("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo4.setFocusable(false);
                accessibilityNodeInfo4.setFocused(false);
                accessibilityNodeInfo4.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.e.a);
                accessibilityNodeInfo4.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.f.a);
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v3Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.x;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                v3Var.k(u3.a(0, 1, i, 1, false, ((MaterialButton) view).B));
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v3Var.a);
                nh2 nh2Var = (nh2) obj;
                v3Var.l(nh2Var.x0.getVisibility() == 0 ? nh2Var.s(R.string.mtrl_picker_toggle_to_year_selection) : nh2Var.s(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 6:
                AccessibilityNodeInfo accessibilityNodeInfo5 = v3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setCheckable(((NavigationMenuItemView) obj).K);
                break;
            default:
                qp3 qp3Var = (qp3) obj;
                qp3Var.t.d(view, v3Var);
                RecyclerView recyclerView = qp3Var.s;
                recyclerView.getClass();
                cx3 cx3VarN = RecyclerView.N(view);
                int iB = cx3VarN != null ? cx3VarN.b() : -1;
                dw3 adapter = recyclerView.getAdapter();
                if (adapter instanceof np3) {
                    ((np3) adapter).r(iB);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z2
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.q) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int[] iArr = DrawerLayout.P;
                return this.n.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    @Override // defpackage.z2
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.q;
        Object obj = this.r;
        switch (i2) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((qg4) ((fr) obj)).a(3);
                return true;
            case 1:
                if (i == 1048576) {
                    yt ytVar = (yt) obj;
                    if (ytVar.x) {
                        ytVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 7:
                return ((qp3) obj).t.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }

    public /* synthetic */ ar(int i, Object obj) {
        this.q = i;
        this.r = obj;
    }
}
