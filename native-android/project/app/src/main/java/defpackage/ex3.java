package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ex3 extends z2 {
    public final RecyclerView q;
    public final dx3 r;

    public ex3(RecyclerView r2) {
        this.q = r2;
        z2 r3 = j();
        if (r3 != null) goto L5;
    L8:
        this.r = new dx3(this);
        return;
    L5:
        if ((r3 instanceof dx3) == false) goto L8;
        this.r = (dx3) r3;
    }

    @Override // defpackage.z2
    public final void c(View r2, AccessibilityEvent r3) {
        super.c(r2, r3);
        if ((r2 instanceof RecyclerView) == true) goto L5;
        return;
    L5:
        if (this.q.Q() == true) goto L11;
        RecyclerView r4 = (RecyclerView) r2;
        if (r4.getLayoutManager() == null) goto L12;
        r4.getLayoutManager().V(r3);
        return;
    L12:
        return;
    }

    @Override // defpackage.z2
    public void d(View r3, v3 r4) {
        this.n.onInitializeAccessibilityNodeInfo(r3, r4.a);
        RecyclerView r2 = this.q;
        if (r2.Q() == false) goto L5;
        return;
    L5:
        if (r2.getLayoutManager() == null) goto L9;
        mw3 r5 = r2.getLayoutManager();
        RecyclerView r6 = r5.b;
        r5.W(r6.p, r6.u0, r4);
        return;
    }

    @Override // defpackage.z2
    public final boolean g(View r1, int r2, Bundle r3) {
        if (super.g(r1, r2, r3) == false) goto L6;
        return true;
    L6:
        RecyclerView r0 = this.q;
        if (r0.Q() == false) goto L9;
        return false;
    L9:
        if (r0.getLayoutManager() != null) goto L11;
        return false;
    L11:
        return r0.getLayoutManager().j0(r2, r3);
    }

    public z2 j() {
        return this.r;
    }
}
