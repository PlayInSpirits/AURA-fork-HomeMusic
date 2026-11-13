package defpackage;

import android.view.ViewGroup;
import android.view.WindowId;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ja5 {
    public final WindowId a;

    public ja5(ViewGroup viewGroup) {
        this.a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ja5) && ((ja5) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
