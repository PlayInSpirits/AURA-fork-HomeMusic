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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ar extends z2 {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public ar(DrawerLayout r2) {
        this.q = 3;
        this.r = r2;
        new Rect();
    }

    @Override // defpackage.z2
    public boolean a(View r4, AccessibilityEvent r5) {
        switch(this.q) {
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        DrawerLayout r0 = (DrawerLayout) this.r;
        if (r5.getEventType() != 32) goto L13;
        r5.getText();
        View r3 = r0.g();
        if (r3 == null) goto L11;
        int r6 = r0.j(r3);
        WeakHashMap r7 = j65.a;
        Gravity.getAbsoluteGravity(r6, r0.getLayoutDirection());
    L11:
        return true;
    L13:
        return this.n.dispatchPopulateAccessibilityEvent(r4, r5);
    L5:
        return super.a(r4, r5);
    }

    @Override // defpackage.z2
    public void c(View r2, AccessibilityEvent r3) {
        switch(this.q) {
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        super.c(r2, r3);
        return;
    L6:
        super.c(r2, r3);
        r3.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        return;
    L8:
        super.c(r2, r3);
        r3.setChecked(((CheckableImageButton) this.r).q);
    }

    @Override // defpackage.z2
    public final void d(View r13, v3 r14) {
        int r0 = this.q;
        int r2 = -1;
        int r3 = 0;
        Object r5 = this.r;
        View.AccessibilityDelegate r12 = this.n;
        switch(r0) {
            case 0: goto L46;
            case 1: goto L41;
            case 2: goto L39;
            case 3: goto L37;
            case 4: goto L20;
            case 5: goto L14;
            case 6: goto L12;
            default: goto L4;
        };
    L4:
        qp3 r6 = (qp3) r5;
        r6.t.d(r13, r14);
        RecyclerView r15 = r6.s;
        r15.getClass();
        cx3 r16 = RecyclerView.N(r13);
        if (r16 == null) goto L7;
        r2 = r16.b();
    L7:
        dw3 r17 = r15.getAdapter();
        if ((r17 instanceof np3) == false) goto L53;
        ((np3) r17).r(r2);
        return;
    L53:
        return;
    L12:
        AccessibilityNodeInfo r18 = r14.a;
        r12.onInitializeAccessibilityNodeInfo(r13, r18);
        r18.setCheckable(((NavigationMenuItemView) r5).K);
        return;
    L14:
        r12.onInitializeAccessibilityNodeInfo(r13, r14.a);
        nh2 r7 = (nh2) r5;
        if (r7.x0.getVisibility() != 0) goto L17;
        String r19 = r7.s(R.string.mtrl_picker_toggle_to_year_selection);
    L18:
        r14.l(r19);
        return;
    L17:
        r19 = r7.s(R.string.mtrl_picker_toggle_to_day_selection);
        goto L18
    L20:
        r12.onInitializeAccessibilityNodeInfo(r13, r14.a);
        MaterialButtonToggleGroup r8 = (MaterialButtonToggleGroup) r5;
        int r110 = MaterialButtonToggleGroup.x;
        if ((r13 instanceof MaterialButton) == true) goto L23;
    L22:
        int r9 = -1;
    L35:
        r14.k(u3.a(0, 1, r9, 1, false, ((MaterialButton) r13).B));
        return;
    L23:
        int r111 = 0;
    L25:
        if (r3 >= r8.getChildCount()) goto L22;
        if (r8.getChildAt(r3) == r13) goto L28;
        if ((r8.getChildAt(r3) instanceof MaterialButton) == false) goto L34;
        if (r8.c(r3) == false) goto L34;
        r111 = r111 + 1;
    L34:
        r3 = r3 + 1;
        goto L25
    L28:
        r9 = r111;
        goto L35
    L37:
        int[] r1 = DrawerLayout.P;
        AccessibilityNodeInfo r4 = r14.a;
        r12.onInitializeAccessibilityNodeInfo(r13, r4);
        r14.i("androidx.drawerlayout.widget.DrawerLayout");
        r4.setFocusable(false);
        r4.setFocused(false);
        r4.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.e.a);
        r4.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.f.a);
        return;
    L39:
        AccessibilityNodeInfo r112 = r14.a;
        r12.onInitializeAccessibilityNodeInfo(r13, r112);
        CheckableImageButton r10 = (CheckableImageButton) r5;
        r112.setCheckable(r10.r);
        r112.setChecked(r10.q);
        return;
    L41:
        AccessibilityNodeInfo r11 = r14.a;
        r12.onInitializeAccessibilityNodeInfo(r13, r11);
        if (((yt) r5).x == false) goto L44;
        r14.a(1048576);
        r11.setDismissable(true);
        return;
    L44:
        r11.setDismissable(false);
        return;
    L46:
        AccessibilityNodeInfo r20 = r14.a;
        r12.onInitializeAccessibilityNodeInfo(r13, r20);
        r14.a(1048576);
        r20.setDismissable(true);
    }

    @Override // defpackage.z2
    public boolean f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        switch(this.q) {
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        int[] r0 = DrawerLayout.P;
        return this.n.onRequestSendAccessibilityEvent(r2, r3, r4);
    L5:
        return super.f(r2, r3, r4);
    }

    @Override // defpackage.z2
    public boolean g(View r5, int r6, Bundle r7) {
        int r0 = this.q;
        Object r3 = this.r;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L8;
            case 7: goto L7;
            default: goto L5;
        };
    L8:
        if (r6 != 1048576) goto L13;
        yt r4 = (yt) r3;
        if (r4.x == false) goto L13;
        r4.cancel();
        return true;
    L13:
        return super.g(r5, r6, r7);
    L14:
        if (r6 != 1048576) goto L17;
        ((qg4) ((fr) r3)).a(3);
        return true;
    L17:
        return super.g(r5, r6, r7);
    L5:
        return super.g(r5, r6, r7);
    L7:
        return ((qp3) r3).t.g(r5, r6, r7);
    }

    public /* synthetic */ ar(int r1, Object r2) {
        this.q = r1;
        this.r = r2;
    }
}
