package defpackage;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ja5 {
    public final WindowId a;

    public ja5(ViewGroup r1) {
        this.a = r1.getWindowId();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ja5) == true) goto L5;
        return false;
    L5:
        if (((ja5) r2).a.equals(this.a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
