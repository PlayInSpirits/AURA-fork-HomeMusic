package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 {
    public Object a;

    public /* synthetic */ t3(Object r1) {
        this.a = r1;
    }

    public static t3 a(int r2, int r3, int r4) {
        return new t3(AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, false, r4));
    }
}
