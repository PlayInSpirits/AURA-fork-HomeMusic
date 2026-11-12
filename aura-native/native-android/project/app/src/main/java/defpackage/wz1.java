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

    public wz1(View view) {
        super(0);
        this.s = new int[2];
        this.p = view;
    }

    @Override // defpackage.ma5
    public final void a(ta5 ta5Var) {
        this.p.setTranslationY(0.0f);
    }

    @Override // defpackage.ma5
    public final void b(ta5 ta5Var) {
        View view = this.p;
        int[] iArr = this.s;
        view.getLocationOnScreen(iArr);
        this.q = iArr[1];
    }

    @Override // defpackage.ma5
    public final pb5 c(pb5 pb5Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ta5 ta5Var = (ta5) it.next();
            if ((ta5Var.a.d() & 8) != 0) {
                this.p.setTranslationY(yd.c(this.r, ta5Var.a.c(), 0));
                break;
            }
        }
        return pb5Var;
    }

    @Override // defpackage.ma5
    public final qr2 d(ta5 ta5Var, qr2 qr2Var) {
        View view = this.p;
        int[] iArr = this.s;
        view.getLocationOnScreen(iArr);
        int i = this.q - iArr[1];
        this.r = i;
        view.setTranslationY(i);
        return qr2Var;
    }
}
