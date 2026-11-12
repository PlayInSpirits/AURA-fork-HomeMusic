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

    public dv2(Context r3, boolean r4) {
        super(r3, r4);
        if (1 != r3.getResources().getConfiguration().getLayoutDirection()) goto L6;
        this.z = 21;
        this.A = 22;
        return;
    L6:
        this.z = 22;
        this.A = 21;
    }

    @Override // defpackage.cx0, android.view.View
    public final boolean onHoverEvent(MotionEvent r5) {
        if (this.B == null) goto L27;
        ListAdapter r0 = getAdapter();
        if ((r0 instanceof HeaderViewListAdapter) == false) goto L7;
        HeaderViewListAdapter r1 = (HeaderViewListAdapter) r0;
        int r2 = r1.getHeadersCount();
        nu2 r3 = (nu2) r1.getWrappedAdapter();
    L9:
        if (r5.getAction() == 10) goto L17;
        int r4 = pointToPosition((int) r5.getX(), (int) r5.getY());
        if (r4 == (-1)) goto L17;
        int r6 = r4 - r2;
        if (r6 < 0) goto L17;
        if (r6 >= r3.getCount()) goto L17;
        tu2 r7 = r3.b(r6);
    L18:
        tu2 r8 = this.C;
        if (r8 == r7) goto L27;
        qu2 r9 = r3.n;
        if (r8 == null) goto L23;
        this.B.a(r9, r8);
    L23:
        this.C = r7;
        if (r7 == null) goto L27;
        this.B.l(r9, r7);
    L17:
        r7 = null;
        goto L18
    L7:
        r3 = (nu2) r0;
        r2 = 0;
    L27:
        return super.onHoverEvent(r5);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, KeyEvent r6) {
        ListMenuItemView r0 = (ListMenuItemView) getSelectedView();
        if (r0 != null) goto L5;
    L12:
        if (r0 == null) goto L22;
        if (r5 != this.A) goto L22;
        setSelection(-1);
        ListAdapter r4 = getAdapter();
        if ((r4 instanceof HeaderViewListAdapter) == false) goto L18;
        nu2 r7 = (nu2) ((HeaderViewListAdapter) r4).getWrappedAdapter();
    L19:
        r7.n.c(false);
        return true;
    L18:
        r7 = (nu2) r4;
    L22:
        return super.onKeyDown(r5, r6);
    L5:
        if (r5 != this.z) goto L12;
        if (r0.isEnabled() == true) goto L9;
    L11:
        return true;
    L9:
        if (r0.getItemData().hasSubMenu() == false) goto L11;
        performItemClick(r0, getSelectedItemPosition(), getSelectedItemId());
        goto L11
    }

    public void setHoverListener(su2 r1) {
        this.B = r1;
    }

    @Override // defpackage.cx0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable r1) {
        super.setSelector(r1);
    }
}
