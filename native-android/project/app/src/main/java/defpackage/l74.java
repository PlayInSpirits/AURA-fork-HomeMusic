package defpackage;

import android.view.View;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.ui.fragment.SearchFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l74 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ SearchFragment o;
    public final /* synthetic */ String p;

    public /* synthetic */ l74(SearchFragment searchFragment, String str, int i) {
        this.n = i;
        this.o = searchFragment;
        this.p = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        String str = this.p;
        SearchFragment searchFragment = this.o;
        switch (i) {
            case 0:
                searchFragment.h0(str);
                break;
            case 1:
                rm2 rm2Var = searchFragment.n0.c;
                new Thread(new e84((jv3) rm2Var.o, new RecentSearch(str, 0L), 0)).start();
                searchFragment.i0();
                break;
            default:
                searchFragment.h0(str);
                break;
        }
    }
}
