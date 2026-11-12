package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dv2 extends cx0 {
    public final int A;
    public su2 B;
    public tu2 C;
    public final int z;

    public dv2(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.z = 21;
            this.A = 22;
        } else {
            this.z = 22;
            this.A = 21;
        }
    }

    @Override // defpackage.cx0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        nu2 nu2Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.B != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                nu2Var = (nu2) headerViewListAdapter.getWrappedAdapter();
            } else {
                nu2Var = (nu2) adapter;
                headersCount = 0;
            }
            tu2 tu2VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= nu2Var.getCount()) ? null : nu2Var.getItem(i);
            tu2 tu2Var = this.C;
            if (tu2Var != tu2VarB) {
                qu2 qu2Var = nu2Var.n;
                if (tu2Var != null) {
                    this.B.a(qu2Var, tu2Var);
                }
                this.C = tu2VarB;
                if (tu2VarB != null) {
                    this.B.l(qu2Var, tu2VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.z) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.A) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (nu2) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (nu2) adapter).n.c(false);
        return true;
    }

    public void setHoverListener(su2 su2Var) {
        this.B = su2Var;
    }

    @Override // defpackage.cx0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
