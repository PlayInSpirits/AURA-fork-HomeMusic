package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yu2 implements nd4, gv2, AdapterView.OnItemClickListener {
    public Rect n;

    public static int o(ListAdapter r10, Context r11, int r12) {
        int r0 = 0;
        int r1 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r3 = r10.getCount();
        int r5 = 0;
        int r6 = 0;
        FrameLayout r7 = null;
        View r8 = null;
    L3:
        if (r0 >= r3) goto L15;
        int r9 = r10.getItemViewType(r0);
        if (r9 == r6) goto L7;
        r8 = null;
        r6 = r9;
    L7:
        if (r7 != null) goto L9;
        r7 = new FrameLayout(r11);
    L9:
        r8 = r10.getView(r0, r8, r7);
        r8.measure(r1, r2);
        int r13 = r8.getMeasuredWidth();
        if (r13 >= r12) goto L11;
        if (r13 <= r5) goto L14;
        r5 = r13;
    L14:
        r0 = r0 + 1;
        goto L3
    L11:
        return r12;
    L15:
        return r5;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return 0;
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context r1, qu2 r2) {
    }

    public abstract void n(qu2 r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        ListAdapter r5 = (ListAdapter) r1.getAdapter();
        if ((r5 instanceof HeaderViewListAdapter) == false) goto L5;
        nu2 r6 = (nu2) ((HeaderViewListAdapter) r5).getWrappedAdapter();
    L6:
        qu2 r7 = r6.n;
        MenuItem r8 = (MenuItem) r5.getItem(r3);
        if ((this instanceof uz) == true) goto L9;
        int r9 = 0;
    L10:
        r7.q(r8, this, r9);
        return;
    L9:
        r9 = 4;
        goto L10
    L5:
        r6 = (nu2) r5;
        goto L6
    }

    public abstract void p(View r1);

    public abstract void q(boolean r1);

    public abstract void r(int r1);

    public abstract void s(int r1);

    public abstract void t(PopupWindow.OnDismissListener r1);

    public abstract void u(boolean r1);

    public abstract void v(int r1);
}
