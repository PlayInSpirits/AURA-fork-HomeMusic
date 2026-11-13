package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u3 {
    public final Object a;

    public /* synthetic */ u3(Object obj) {
        this.a = obj;
    }

    public static u3 a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new u3(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    public Object b() {
        if (au0.F == null) {
            au0.F = new jh5();
        }
        synchronized (au0.E) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
