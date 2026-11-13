package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class n74 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ SearchView o;

    public /* synthetic */ n74(SearchView searchView, int i) {
        this.n = i;
        this.o = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        SearchView searchView = this.o;
        switch (i) {
            case 0:
                searchView.w.setText("");
                searchView.j();
                break;
            case 1:
                int i2 = SearchView.Q;
                searchView.l();
                break;
            default:
                int i3 = SearchView.Q;
                searchView.g();
                break;
        }
    }
}
