package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i20(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r8, Outline r9) {
        int r10 = this.a;
        Object r7 = this.b;
        switch(r10) {
            case 0: goto L14;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        Path r11 = ((oc4) r7).e;
        if (r11.isEmpty() == true) goto L19;
        l3.u(r9, r11);
        return;
    L19:
        return;
    L8:
        nc4 r12 = (nc4) r7;
        if (r12.c != null) goto L11;
        return;
    L11:
        if (r12.d.isEmpty() == true) goto L21;
        RectF r13 = r12.d;
        r9.setRoundRect((int) r13.left, (int) r13.top, (int) r13.right, (int) r13.bottom, r12.g);
        return;
    L21:
        return;
    L14:
        k20 r14 = ((Chip) r7).r;
        if (r14 == null) goto L17;
        r14.getOutline(r9);
        return;
    L17:
        r9.setAlpha(0.0f);
    }
}
