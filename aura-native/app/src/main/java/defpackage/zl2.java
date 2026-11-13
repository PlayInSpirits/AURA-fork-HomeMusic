package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl2 implements xl2, r83 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ zl2(int i, int i2, Object obj) {
        this.p = obj;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        pu1Var.Q(((am2) this.p).n.c, i, this.n, this.o);
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p;
        int i = SearchView.Q;
        marginLayoutParams.leftMargin = pb5Var.b() + this.n;
        marginLayoutParams.rightMargin = pb5Var.c() + this.o;
        return pb5Var;
    }
}
