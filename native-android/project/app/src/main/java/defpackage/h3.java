package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final g3 n;

    public h3(g3 r1) {
        this.n = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof h3) == true) goto L10;
        return false;
    L10:
        return this.n.equals(((h3) r2).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r1) {
        this.n.onTouchExplorationStateChanged(r1);
    }
}
