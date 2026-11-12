package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 extends xi4 {
    public final /* synthetic */ int p;

    public /* synthetic */ lz0(int r1) {
        this.p = r1;
        super(19);
    }

    @Override // defpackage.xi4
    public final void y(TabLayout r7, View r8, View r9, float r10, Drawable r11) {
        switch(this.p) {
            case 0: goto L14;
            default: goto L5;
        };
    L14:
        RectF r6 = xi4.j(r7, r8);
        RectF r12 = xi4.j(r7, r9);
        if (r6.left >= r12.left) goto L17;
        double r13 = (((double) r10) * 3.141592653589793d) / 2.0d;
        float r14 = (float) (1.0d - Math.cos(r13));
        float r15 = (float) Math.sin(r13);
    L18:
        r11.setBounds(yd.c((int) r6.left, r14, (int) r12.left), r11.getBounds().top, yd.c((int) r6.right, r15, (int) r12.right), r11.getBounds().bottom);
        return;
    L17:
        double r16 = (((double) r10) * 3.141592653589793d) / 2.0d;
        r14 = (float) Math.sin(r16);
        r15 = (float) (1.0d - Math.cos(r16));
        goto L18
    L5:
        if (r10 < 0.5f) goto L8;
        r8 = r9;
    L8:
        RectF r17 = xi4.j(r7, r8);
        if (r10 >= 0.5f) goto L11;
        float r18 = yd.b(1.0f, 0.0f, 0.0f, 0.5f, r10);
    L12:
        r11.setBounds((int) r17.left, r11.getBounds().top, (int) r17.right, r11.getBounds().bottom);
        r11.setAlpha((int) (r18 * 255.0f));
        return;
    L11:
        r18 = yd.b(0.0f, 1.0f, 0.5f, 1.0f, r10);
        goto L12
    }
}
