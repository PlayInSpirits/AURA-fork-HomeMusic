package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ab2 {
    public ab2() {
        super();
    }

    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int d;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((cx3) this.k.get(i2)).a;
            nw3 nw3Var = (nw3) view3.getLayoutParams();
            if (view3 != view && !nw3Var.a.j() && (d = (nw3Var.a.d() - this.d) * this.e) >= 0 && d < i) {
                view2 = view3;
                if (d == 0) {
                    break;
                } else {
                    i = d;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((nw3) view2.getLayoutParams()).a.d();
        }
    }

    public final View b(hm2 hm2Var) {
        List list = this.k;
        if (list == null) {
            View view = hm2Var.k(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((cx3) this.k.get(i)).a;
            nw3 nw3Var = (nw3) view2.getLayoutParams();
            if (!nw3Var.a.j() && this.d == nw3Var.a.d()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
