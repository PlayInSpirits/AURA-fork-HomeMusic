package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wg(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.n;
        Object obj = this.o;
        switch (i2) {
            case 0:
                yg ygVar = (yg) obj;
                bh bhVar = ygVar.T;
                bhVar.setSelection(i);
                if (bhVar.getOnItemClickListener() != null) {
                    bhVar.performItemClick(view, i, ygVar.Q.getItemId(i));
                }
                ygVar.dismiss();
                break;
            case 1:
                xg2 xg2Var = (xg2) obj;
                bc2 bc2Var = xg2Var.r;
                if (i < 0) {
                    item = !bc2Var.M.isShowing() ? null : bc2Var.p.getSelectedItem();
                } else {
                    item = xg2Var.getAdapter().getItem(i);
                }
                xg2.a(xg2Var, item);
                AdapterView.OnItemClickListener onItemClickListener = xg2Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !bc2Var.M.isShowing() ? null : bc2Var.p.getSelectedView();
                        i = !bc2Var.M.isShowing() ? -1 : bc2Var.p.getSelectedItemPosition();
                        j = !bc2Var.M.isShowing() ? Long.MIN_VALUE : bc2Var.p.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(bc2Var.p, view, i, j);
                }
                bc2Var.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
