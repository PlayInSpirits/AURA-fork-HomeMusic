package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tc3 extends db2 {
    public final /* synthetic */ int q;
    public final /* synthetic */ xg0 r;

    public /* synthetic */ tc3(xg0 r1, Context r2, int r3) {
        this.q = r3;
        this.r = r1;
        super(r2);
    }

    @Override // defpackage.db2
    public final float d(DisplayMetrics r2) {
        switch(this.q) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        int r1 = r2.densityDpi;
    L6:
        return 100.0f / r1;
    L7:
        r1 = r2.densityDpi;
        goto L6
    }

    @Override // defpackage.db2
    public int e(int r2) {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.e(r2);
    L7:
        return Math.min(100, super.e(r2));
    }

    @Override // defpackage.db2
    public final void h(View r8, ww3 r9) {
        int r0 = this.q;
        DecelerateInterpolator r1 = this.j;
        xg0 r5 = this.r;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        RecyclerView r2 = r5.a;
        if (r2 == null) goto L16;
        int[] r10 = r5.b(r2.getLayoutManager(), r8);
        int r3 = r10[0];
        int r11 = r10[1];
        int r7 = (int) Math.ceil(((double) e(Math.max(Math.abs(r3), Math.abs(r11)))) / 0.3356d);
        if (r7 <= 0) goto L15;
        r9.a = r3;
        r9.b = r11;
        r9.c = r7;
        r9.e = r1;
        r9.f = true;
        return;
    L15:
        return;
    L16:
        return;
    L11:
        int[] r12 = r5.b(r5.a.getLayoutManager(), r8);
        int r4 = r12[0];
        int r13 = r12[1];
        int r14 = (int) Math.ceil(((double) e(Math.max(Math.abs(r4), Math.abs(r13)))) / 0.3356d);
        if (r14 <= 0) goto L17;
        r9.a = r4;
        r9.b = r13;
        r9.c = r14;
        r9.e = r1;
        r9.f = true;
        return;
    }
}
