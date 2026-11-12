package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m40 implements af {
    public final /* synthetic */ CollapsingToolbarLayout a;

    public m40(CollapsingToolbarLayout r1) {
        this.a = r1;
    }

    @Override // defpackage.af
    public final void a(int r12) {
        CollapsingToolbarLayout r11 = this.a;
        k40 r0 = r11.x;
        r11.L = r12;
        pb5 r1 = r11.N;
        if (r1 == null) goto L5;
        int r2 = r1.d();
    L6:
        int r3 = r11.getChildCount();
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L16;
        View r5 = r11.getChildAt(r4);
        l40 r6 = (l40) r5.getLayoutParams();
        h75 r7 = CollapsingToolbarLayout.b(r5);
        int r8 = r6.a;
        if (r8 != 1) goto L11;
        r7.b(su3.l(-r12, 0, ((r11.getHeight() - CollapsingToolbarLayout.b(r5).b) - r5.getHeight()) - ((FrameLayout.LayoutParams) ((l40) r5.getLayoutParams())).bottomMargin));
    L15:
        r4 = r4 + 1;
        goto L7
    L11:
        if (r8 != 2) goto L15;
        r7.b(Math.round((-r12) * r6.b));
        goto L15
    L16:
        r11.d();
        if (r11.C == null) goto L20;
        if (r2 <= 0) goto L20;
        WeakHashMap r9 = j65.a;
        r11.postInvalidateOnAnimation();
    L20:
        int r10 = r11.getHeight();
        WeakHashMap r13 = j65.a;
        int r14 = (r10 - r11.getMinimumHeight()) - r2;
        float r15 = r10 - r11.getScrimVisibleHeightTrigger();
        float r16 = r14;
        float r17 = Math.min(1.0f, r15 / r16);
        r0.d = r17;
        r0.e = xa3.a(1.0f, r17, 0.5f, r17);
        r0.f = r11.L + r14;
        r0.p(Math.abs(r12) / r16);
        return;
    L5:
        r2 = 0;
        goto L6
    }
}
