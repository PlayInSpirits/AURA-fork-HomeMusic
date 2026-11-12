package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 extends xi4 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz0(int i) {
        super(19);
        this.p = i;
    }

    @Override // defpackage.xi4
    public final void y(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.p) {
            case 0:
                RectF rectFJ = xi4.j(tabLayout, view);
                RectF rectFJ2 = xi4.j(tabLayout, view2);
                if (rectFJ.left < rectFJ2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(yd.c((int) rectFJ.left, fSin, (int) rectFJ2.left), drawable.getBounds().top, yd.c((int) rectFJ.right, fCos, (int) rectFJ2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFJ3 = xi4.j(tabLayout, view);
                float fB = f < 0.5f ? yd.b(1.0f, 0.0f, 0.0f, 0.5f, f) : yd.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFJ3.left, drawable.getBounds().top, (int) rectFJ3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
