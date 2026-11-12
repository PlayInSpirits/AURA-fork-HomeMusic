package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kd {
    public static final ViewGroup.MarginLayoutParams a = null;

    static {
        ViewGroup.MarginLayoutParams r0 = new ViewGroup.MarginLayoutParams(-1, -1);
        a = r0;
        r0.setMargins(0, 0, 0, 0);
    }

    public static boolean a(View r5) {
        if ((r5 instanceof ViewGroup) == false) goto L15;
        ViewGroup r6 = (ViewGroup) r5;
        LayoutTransition r0 = r6.getLayoutTransition();
        if (r0 != null) goto L7;
    L9:
        int r1 = r6.getChildCount();
        int r3 = 0;
    L10:
        if (r3 >= r1) goto L15;
        if (a(r6.getChildAt(r3)) == true) goto L13;
        r3 = r3 + 1;
        goto L10
    L13:
        return true;
    L7:
        if (r0.isChangingLayout() == false) goto L9;
        return true;
    L15:
        return false;
    }
}
