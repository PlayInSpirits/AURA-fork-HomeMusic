package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dx3 extends z2 {
    public final ex3 q;
    public final WeakHashMap r;

    public dx3(ex3 r2) {
        this.r = new WeakHashMap();
        this.q = r2;
    }

    @Override // defpackage.z2
    public final boolean a(View r2, AccessibilityEvent r3) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L7;
        return r0.a(r2, r3);
    L7:
        return this.n.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    @Override // defpackage.z2
    public final zh0 b(View r2) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L7;
        return r0.b(r2);
    L7:
        return super.b(r2);
    }

    @Override // defpackage.z2
    public final void c(View r2, AccessibilityEvent r3) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L6;
        r0.c(r2, r3);
        return;
    L6:
        super.c(r2, r3);
    }

    @Override // defpackage.z2
    public final void d(View r5, v3 r6) {
        AccessibilityNodeInfo r0 = r6.a;
        ex3 r1 = this.q;
        RecyclerView r2 = r1.q;
        RecyclerView r3 = r1.q;
        boolean r4 = r2.Q();
        View.AccessibilityDelegate r7 = this.n;
        if (r4 == false) goto L5;
    L12:
        r7.onInitializeAccessibilityNodeInfo(r5, r0);
        return;
    L5:
        if (r3.getLayoutManager() == null) goto L12;
        r3.getLayoutManager().Y(r5, r6);
        z2 r8 = (z2) this.r.get(r5);
        if (r8 == null) goto L10;
        r8.d(r5, r6);
        return;
    L10:
        r7.onInitializeAccessibilityNodeInfo(r5, r0);
    }

    @Override // defpackage.z2
    public final void e(View r2, AccessibilityEvent r3) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L6;
        r0.e(r2, r3);
        return;
    L6:
        super.e(r2, r3);
    }

    @Override // defpackage.z2
    public final boolean f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L7;
        return r0.f(r2, r3, r4);
    L7:
        return this.n.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    @Override // defpackage.z2
    public final boolean g(View r3, int r4, Bundle r5) {
        ex3 r0 = this.q;
        RecyclerView r1 = r0.q;
        RecyclerView r2 = r0.q;
        if (r1.Q() == true) goto L18;
        if (r2.getLayoutManager() == null) goto L18;
        z2 r6 = (z2) this.r.get(r3);
        if (r6 == null) goto L12;
        if (r6.g(r3, r4, r5) == true) goto L19;
    L15:
        hm2 r7 = r2.getLayoutManager().b.p;
        return false;
    L19:
        return true;
    L12:
        if (super.g(r3, r4, r5) == false) goto L15;
        return true;
    L18:
        return super.g(r3, r4, r5);
    }

    @Override // defpackage.z2
    public final void h(View r2, int r3) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L6;
        r0.h(r2, r3);
        return;
    L6:
        super.h(r2, r3);
    }

    @Override // defpackage.z2
    public final void i(View r2, AccessibilityEvent r3) {
        z2 r0 = (z2) this.r.get(r2);
        if (r0 == null) goto L6;
        r0.i(r2, r3);
        return;
    L6:
        super.i(r2, r3);
    }
}
