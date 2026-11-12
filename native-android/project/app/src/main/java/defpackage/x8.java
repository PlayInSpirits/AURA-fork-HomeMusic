package defpackage;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView n;
    public final /* synthetic */ a9 o;

    public x8(a9 r1, ContextThemeWrapper r2, int r3, CharSequence[] r4, AlertController$RecycleListView r5) {
        this.o = r1;
        this.n = r5;
        super(r2, r3, R.id.text1, r4);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r1, View r2, ViewGroup r3) {
        View r4 = super.getView(r1, r2, r3);
        boolean[] r5 = this.o.t;
        if (r5 != null) goto L5;
    L7:
        return r4;
    L5:
        if (r5[r1] == false) goto L7;
        this.n.setItemChecked(r1, true);
        goto L7
    }
}
