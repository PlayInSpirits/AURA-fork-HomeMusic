package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView n;
    public final /* synthetic */ d9 o;
    public final /* synthetic */ a9 p;

    public z8(a9 a9Var, AlertController$RecycleListView alertController$RecycleListView, d9 d9Var) {
        this.p = a9Var;
        this.n = alertController$RecycleListView;
        this.o = d9Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a9 a9Var = this.p;
        boolean[] zArr = a9Var.t;
        AlertController$RecycleListView alertController$RecycleListView = this.n;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        a9Var.x.onClick(this.o.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
