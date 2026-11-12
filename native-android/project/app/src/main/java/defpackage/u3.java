package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 {
    public final Object a;

    public /* synthetic */ u3(Object r1) {
        this.a = r1;
    }

    public static u3 a(int r1, int r2, int r3, int r4, boolean r5, boolean r6) {
        return new u3(AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6));
    }

    public Object b() {
        if (au0.F != null) goto L5;
        au0.F = new jh5();
    L5:
        Object r1 = au0.E;
        monitor-enter(r1);
        monitor-exit(r1);     // Catch: Throwable -> L10
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    L10:
        th = move-exception;
        throw th;
    }
}
