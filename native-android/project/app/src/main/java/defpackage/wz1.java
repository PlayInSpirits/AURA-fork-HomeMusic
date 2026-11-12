package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz1 extends ma5 {
    public final View p;
    public int q;
    public int r;
    public final int[] s;

    public wz1(View r2) {
        super(0);
        this.s = new int[2];
        this.p = r2;
    }

    @Override // defpackage.ma5
    public final void a(ta5 r1) {
        this.p.setTranslationY(0.0f);
    }

    @Override // defpackage.ma5
    public final void b(ta5 r2) {
        View r3 = this.p;
        int[] r0 = this.s;
        r3.getLocationOnScreen(r0);
        this.q = r0[1];
    }

    @Override // defpackage.ma5
    public final pb5 c(pb5 r3, List r4) {
        Iterator r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L8;
        ta5 r0 = (ta5) r5.next();
        if ((r0.a.d() & 8) == 0) goto L4;
        this.p.setTranslationY(yd.c(this.r, r0.a.c(), 0));
    L8:
        return r3;
    }

    @Override // defpackage.ma5
    public final qr2 d(ta5 r3, qr2 r4) {
        View r5 = this.p;
        int[] r0 = this.s;
        r5.getLocationOnScreen(r0);
        int r1 = this.q - r0[1];
        this.r = r1;
        r5.setTranslationY(r1);
        return r4;
    }
}
