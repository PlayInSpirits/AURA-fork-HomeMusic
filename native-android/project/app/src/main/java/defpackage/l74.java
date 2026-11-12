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

    public /* synthetic */ l74(SearchFragment r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r5) {
        int r6 = this.n;
        String r0 = this.p;
        SearchFragment r4 = this.o;
        switch(r6) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r4.h0(r0);
        return;
    L6:
        rm2 r7 = r4.n0.c;
        RecentSearch r1 = new RecentSearch(r0, 0);
        new Thread(new e84((jv3) r7.o, r1, 0)).start();
        r4.i0();
        return;
    L8:
        r4.h0(r0);
    }
}
