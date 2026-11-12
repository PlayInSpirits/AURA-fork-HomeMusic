package defpackage;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p43 implements ou2, r83 {
    public final /* synthetic */ NavigationView n;

    public /* synthetic */ p43(NavigationView r1) {
        this.n = r1;
    }

    @Override // defpackage.ou2
    public boolean m(qu2 r1, MenuItem r2) {
        q43 r0 = this.n.w;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.a(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.r83
    public pb5 x(View r6, pb5 r7) {
        NavigationView r5 = this.n;
        if (r5.o != null) goto L5;
        r5.o = new Rect();
    L5:
        Rect r8 = r5.o;
        int r0 = r7.b();
        mb5 r1 = r7.a;
        r8.set(r0, r7.d(), r7.c(), r7.a());
        l43 r9 = r5.v;
        r9.getClass();
        int r2 = r7.d();
        boolean r3 = false;
        if (r9.M == r2) goto L15;
        r9.M = r2;
        if (r9.o.getChildCount() <= 0) goto L11;
    L13:
        int r4 = 0;
    L14:
        NavigationMenuView r10 = r9.n;
        r10.setPadding(0, r4, 0, r10.getPaddingBottom());
        goto L15
    L11:
        if (r9.K == false) goto L13;
        r4 = r9.M;
    L15:
        NavigationMenuView r11 = r9.n;
        r11.setPadding(0, r11.getPaddingTop(), 0, r7.a());
        j65.b(r9.o, r7);
        if (r1.m().equals(vz1.e) == false) goto L18;
    L19:
        r3 = true;
    L20:
        r5.setWillNotDraw(r3);
        r5.postInvalidateOnAnimation();
        return r1.c();
    L18:
        if (r5.n != null) goto L20;
        goto L19
    }

    @Override // defpackage.ou2
    public void y(qu2 r1) {
    }
}
