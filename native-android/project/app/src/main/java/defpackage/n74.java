package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n74 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ SearchView o;

    public /* synthetic */ n74(SearchView r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        int r3 = this.n;
        SearchView r1 = this.o;
        switch(r3) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        int r4 = SearchView.Q;
        r1.g();
        return;
    L6:
        int r5 = SearchView.Q;
        r1.l();
        return;
    L8:
        r1.w.setText("");
        r1.j();
    }
}
