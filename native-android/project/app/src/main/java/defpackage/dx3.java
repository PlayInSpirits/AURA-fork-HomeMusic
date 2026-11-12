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
    public final WeakHashMap r = new WeakHashMap();

    public dx3(ex3 ex3Var) {
        this.q = ex3Var;
    }

    @Override // defpackage.z2
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        z2 z2Var = (z2) this.r.get(view);
        return z2Var != null ? z2Var.a(view, accessibilityEvent) : this.n.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.z2
    public final zh0 b(View view) {
        z2 z2Var = (z2) this.r.get(view);
        return z2Var != null ? z2Var.b(view) : super.b(view);
    }

    @Override // defpackage.z2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        z2 z2Var = (z2) this.r.get(view);
        if (z2Var != null) {
            z2Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
        ex3 ex3Var = this.q;
        RecyclerView recyclerView = ex3Var.q;
        RecyclerView recyclerView2 = ex3Var.q;
        boolean zQ = recyclerView.Q();
        View.AccessibilityDelegate accessibilityDelegate = this.n;
        if (zQ || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().Y(view, v3Var);
        z2 z2Var = (z2) this.r.get(view);
        if (z2Var != null) {
            z2Var.d(view, v3Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.z2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        z2 z2Var = (z2) this.r.get(view);
        if (z2Var != null) {
            z2Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z2
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        z2 z2Var = (z2) this.r.get(viewGroup);
        return z2Var != null ? z2Var.f(viewGroup, view, accessibilityEvent) : this.n.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.z2
    public final boolean g(View view, int i, Bundle bundle) {
        ex3 ex3Var = this.q;
        RecyclerView recyclerView = ex3Var.q;
        RecyclerView recyclerView2 = ex3Var.q;
        if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        z2 z2Var = (z2) this.r.get(view);
        if (z2Var != null) {
            if (z2Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        hm2 hm2Var = recyclerView2.getLayoutManager().b.p;
        return false;
    }

    @Override // defpackage.z2
    public final void h(View view, int i) {
        z2 z2Var = (z2) this.r.get(view);
        if (z2Var != null) {
            z2Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.z2
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        z2 z2Var = (z2) this.r.get(view);
        if (z2Var != null) {
            z2Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
