package defpackage;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class o74 implements b85, r83 {
    public final /* synthetic */ SearchView n;

    public /* synthetic */ o74(SearchView searchView) {
        this.n = searchView;
    }

    @Override // defpackage.b85
    public pb5 m(View view, pb5 pb5Var, c85 c85Var) {
        MaterialToolbar materialToolbar = this.n.t;
        boolean z = vr1.z(materialToolbar);
        materialToolbar.setPadding(pb5Var.b() + (z ? c85Var.c : c85Var.a), c85Var.b, pb5Var.c() + (z ? c85Var.a : c85Var.c), c85Var.d);
        return pb5Var;
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        SearchView.e(this.n, pb5Var);
        return pb5Var;
    }
}
