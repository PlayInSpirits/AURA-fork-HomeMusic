package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l75 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public l75(ViewPager2 r1) {
        this.E = r1;
        super(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(yw3 r4, int[] r5) {
        ViewPager2 r0 = this.E;
        int r1 = r0.getOffscreenPageLimit();
        if (r1 != (-1)) goto L6;
        super.F0(r4, r5);
        return;
    L6:
        int r3 = r0.getPageSize() * r1;
        r5[0] = r3;
        r5[1] = r3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void W(hm2 r1, yw3 r2, v3 r3) {
        super.W(r1, r2, r3);
        this.E.G.getClass();
    }

    @Override // defpackage.mw3
    public final void X(hm2 r8, yw3 r9, View r10, v3 r11) {
        ViewPager2 r7 = (ViewPager2) this.E.G.q;
        int r0 = 0;
        if (r7.getOrientation() != 1) goto L5;
        r7.t.getClass();
        int r1 = mw3.I(r10);
    L7:
        if (r7.getOrientation() != 0) goto L9;
        r7.t.getClass();
        r0 = mw3.I(r10);
    L9:
        r11.k(u3.a(r1, 1, r0, 1, false, false));
        return;
    L5:
        r1 = 0;
        goto L7
    }

    @Override // defpackage.mw3
    public final boolean k0(hm2 r2, yw3 r3, int r4, Bundle r5) {
        this.E.G.getClass();
        return super.k0(r2, r3, r4, r5);
    }

    @Override // defpackage.mw3
    public final boolean p0(RecyclerView r1, View r2, Rect r3, boolean r4, boolean r5) {
        return false;
    }
}
