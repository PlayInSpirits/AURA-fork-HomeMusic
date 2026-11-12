package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final g3 n;

    public h3(g3 g3Var) {
        this.n = g3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3) {
            return this.n.equals(((h3) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.n.onTouchExplorationStateChanged(z);
    }
}
