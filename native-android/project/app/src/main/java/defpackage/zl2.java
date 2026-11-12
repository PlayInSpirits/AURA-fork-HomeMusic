package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl2 implements xl2, r83 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ zl2(int r1, int r2, Object r3) {
        this.p = r3;
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.xl2
    public void d(pu1 r3, int r4) {
        r3.Q(((am2) this.p).n.c, r4, this.n, this.o);
    }

    @Override // defpackage.r83
    public pb5 x(View r3, pb5 r4) {
        ViewGroup.MarginLayoutParams r5 = (ViewGroup.MarginLayoutParams) this.p;
        int r0 = SearchView.Q;
        r5.leftMargin = r4.b() + this.n;
        r5.rightMargin = r4.c() + this.o;
        return r4;
    }
}
