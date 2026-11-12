package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh2 extends kw3 {
    public final Calendar a;
    public final Calendar b;
    public final /* synthetic */ nh2 c;

    public lh2(nh2 r2) {
        this.c = r2;
        this.a = a35.e(null);
        this.b = a35.e(null);
    }

    @Override // defpackage.kw3
    public final void g(Canvas r24, RecyclerView r25) {
        lh2 r0 = this;
        if ((r25.getAdapter() instanceof ke5) == true) goto L5;
        return;
    L5:
        if ((r25.getLayoutManager() instanceof GridLayoutManager) == false) goto L41;
        ke5 r1 = (ke5) r25.getAdapter();
        GridLayoutManager r2 = (GridLayoutManager) r25.getLayoutManager();
        nh2 r3 = r0.c;
        r3.n0.getClass();
        ArrayList r4 = new ArrayList();
        int r5 = r4.size();
        int r7 = 0;
    L8:
        if (r7 >= r5) goto L42;
        Object r8 = r4.get(r7);
        r7 = r7 + 1;
        ld3 r9 = (ld3) r8;
        Object r10 = r9.a;
        Object r11 = r9.b;
        if (r10 == null) goto L30;
        if (r11 == null) goto L8;
        long r12 = ((Long) r10).longValue();
        Calendar r13 = r0.a;
        r13.setTimeInMillis(r12);
        long r14 = ((Long) r11).longValue();
        Calendar r15 = r0.b;
        r15.setTimeInMillis(r14);
        int r16 = r13.get(1) - r1.q.o0.n.p;
        int r17 = r15.get(1) - r1.q.o0.n.p;
        View r18 = r2.q(r16);
        View r19 = r2.q(r17);
        int r110 = r2.F;
        int r20 = r16 / r110;
        int r21 = r17 / r110;
        int r111 = r20;
    L14:
        if (r111 > r21) goto L30;
        View r112 = r2.q(r2.F * r111);
        if (r112 == null) goto L29;
        int r113 = r112.getTop() + ((Rect) ((c6) r3.r0.d).b).top;
        int r114 = r112.getBottom() - ((Rect) ((c6) r3.r0.d).b).bottom;
        if (r111 != r20) goto L22;
        if (r18 == null) goto L22;
        int r115 = (r18.getWidth() / 2) + r18.getLeft();
    L23:
        if (r111 != r21) goto L27;
        if (r19 == null) goto L27;
        int r116 = (r19.getWidth() / 2) + r19.getLeft();
    L28:
        r24.drawRect(r115, r113, r116, r114, (Paint) r3.r0.h);
    L27:
        r116 = r25.getWidth();
    L22:
        r115 = 0;
    L29:
        r111 = r111 + 1;
    L30:
        r0 = this;
        goto L8
    L42:
        return;
    }
}
