package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jp4 extends hw {
    public int j;
    public int k;
    public final /* synthetic */ SwipeDismissBehavior l;

    public jp4(SwipeDismissBehavior r1) {
        this.l = r1;
        this.k = -1;
    }

    @Override // defpackage.hw
    public final void A(View r4, int r5, int r6) {
        float r7 = r4.getWidth();
        SwipeDismissBehavior r0 = this.l;
        float r8 = r7 * r0.s;
        float r1 = r4.getWidth() * r0.t;
        float r3 = Math.abs(r5 - this.j);
        if (r3 > r8) goto L7;
        r4.setAlpha(1.0f);
        return;
    L7:
        if (r3 < r1) goto L10;
        r4.setAlpha(0.0f);
        return;
    L10:
        r4.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((r3 - r8) / (r1 - r8))), 1.0f));
    }

    @Override // defpackage.hw
    public final void B(View r9, float r10, float r11) {
        this.k = -1;
        int r12 = r9.getWidth();
        boolean r2 = false;
        SwipeDismissBehavior r3 = this.l;
        if (r10 == 0.0f) goto L25;
        WeakHashMap r5 = j65.a;
        if (r9.getLayoutDirection() != 1) goto L7;
        boolean r6 = true;
    L8:
        int r7 = r3.r;
        if (r7 == 2) goto L28;
        if (r7 != 0) goto L18;
        if (r6 == true) goto L14;
        if (r10 > 0.0f) goto L28;
    L35:
        int r0 = this.j;
    L37:
        if (r3.n.q(r0, r9.getTop()) == false) goto L40;
        ua4 r8 = new ua4(r3, r9, r2);
        WeakHashMap r13 = j65.a;
        r9.postOnAnimation(r8);
        return;
    L40:
        if (r2 == false) goto L45;
        zg5 r14 = r3.o;
        if (r14 == null) goto L46;
        r14.y(r9);
        return;
    L46:
        return;
    L45:
        return;
    L14:
        if (r10 >= 0.0f) goto L35;
    L18:
        if (r7 != 1) goto L35;
        if (r6 == false) goto L23;
        if (r10 <= 0.0f) goto L35;
    L23:
        if (r10 >= 0.0f) goto L35;
    L28:
        if (r10 < 0.0f) goto L33;
        int r15 = r9.getLeft();
        int r1 = this.j;
        if (r15 < r1) goto L33;
        r0 = r1 + r12;
    L34:
        r2 = true;
    L33:
        r0 = this.j - r12;
        goto L34
    L7:
        r6 = false;
        goto L8
    L25:
        int r4 = r9.getLeft() - this.j;
        if (Math.abs(r4) < Math.round(r9.getWidth() * 0.5f)) goto L35;
        goto L35
    }

    @Override // defpackage.hw
    public final boolean Q(View r3, int r4) {
        int r0 = this.k;
        if (r0 == (-1)) goto L6;
        if (r0 == r4) goto L6;
        return false;
    L6:
        if (this.l.w(r3) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // defpackage.hw
    public final int d(View r5, int r6) {
        WeakHashMap r0 = j65.a;
        if (r5.getLayoutDirection() != 1) goto L5;
        boolean r1 = true;
    L6:
        int r2 = this.l.r;
        if (r2 != 0) goto L12;
        int r3 = this.j;
        if (r1 == false) goto L11;
        r3 = r3 - r5.getWidth();
        int r4 = this.j;
    L19:
        return Math.min(Math.max(r3, r6), r4);
    L11:
        r4 = r5.getWidth() + r3;
        goto L19
    L12:
        int r7 = this.j;
        if (r2 != 1) goto L17;
        if (r1 == false) goto L16;
        r4 = r5.getWidth() + r7;
        r3 = r7;
        goto L19
    L16:
        r3 = r7 - r5.getWidth();
        r4 = this.j;
        goto L19
    L17:
        r3 = r7 - r5.getWidth();
        r4 = this.j + r5.getWidth();
        goto L19
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.hw
    public final int e(View r1, int r2) {
        return r1.getTop();
    }

    @Override // defpackage.hw
    public final int o(View r1) {
        return r1.getWidth();
    }

    @Override // defpackage.hw
    public final void y(View r1, int r2) {
        this.k = r2;
        this.j = r1.getLeft();
        ViewParent r3 = r1.getParent();
        if (r3 == null) goto L6;
        SwipeDismissBehavior r0 = this.l;
        r0.q = true;
        r3.requestDisallowInterceptTouchEvent(true);
        r0.q = false;
        return;
    }

    @Override // defpackage.hw
    public final void z(int r2) {
        zg5 r1 = this.l.o;
        if (r1 == null) goto L15;
        br r3 = ((fr) r1.n).v;
        if (r2 != 0) goto L7;
        na4.z().O(r3);
        return;
    L7:
        if (r2 != 1) goto L9;
    L11:
        na4.z().K(r3);
        return;
    L9:
        if (r2 == 2) goto L11;
        return;
    }
}
