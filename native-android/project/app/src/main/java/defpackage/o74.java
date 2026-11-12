package defpackage;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o74 implements b85, r83 {
    public final /* synthetic */ SearchView n;

    public /* synthetic */ o74(SearchView r1) {
        this.n = r1;
    }

    @Override // defpackage.b85
    public pb5 m(View r4, pb5 r5, c85 r6) {
        MaterialToolbar r3 = this.n.t;
        boolean r7 = vr1.z(r3);
        if (r7 == false) goto L5;
        int r0 = r6.c;
    L6:
        if (r7 == false) goto L8;
        int r8 = r6.a;
    L9:
        r3.setPadding(r5.b() + r0, r6.b, r5.c() + r8, r6.d);
        return r5;
    L8:
        r8 = r6.c;
        goto L9
    L5:
        r0 = r6.a;
        goto L6
    }

    @Override // defpackage.r83
    public pb5 x(View r1, pb5 r2) {
        SearchView.e(this.n, r2);
        return r2;
    }
}
