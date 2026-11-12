package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView n;
    public final /* synthetic */ d9 o;
    public final /* synthetic */ a9 p;

    public z8(a9 r1, AlertController$RecycleListView r2, d9 r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        a9 r5 = this.p;
        boolean[] r6 = r5.t;
        AlertController$RecycleListView r7 = this.n;
        if (r6 == null) goto L5;
        r6[r3] = r7.isItemChecked(r3);
    L5:
        r5.x.onClick(this.o.b, r3, r7.isItemChecked(r3));
    }
}
