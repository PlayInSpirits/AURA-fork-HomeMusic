package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wg(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r9, View r10, int r11, long r12) {
        int r13 = this.n;
        Object r8 = this.o;
        switch(r13) {
            case 0: goto L35;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((SearchView) r8).n(r11);
        return;
    L6:
        xg2 r14 = (xg2) r8;
        bc2 r15 = r14.r;
        if (r11 < 0) goto L9;
        Object r1 = r14.getAdapter().getItem(r11);
    L13:
        xg2.a(r14, r1);
        AdapterView.OnItemClickListener r2 = r14.getOnItemClickListener();
        if (r2 == null) goto L33;
        if (r10 == null) goto L20;
        if (r11 < 0) goto L20;
    L32:
        r2.onItemClick(r15.p, r10, r11, r12);
    L20:
        if (r15.M.isShowing() == true) goto L22;
        r10 = null;
    L24:
        if (r15.M.isShowing() == true) goto L27;
        int r16 = -1;
    L26:
        r11 = r16;
        if (r15.M.isShowing() == true) goto L31;
        r12 = Long.MIN_VALUE;
        goto L32
    L31:
        r12 = r15.p.getSelectedItemId();
        goto L32
    L27:
        r16 = r15.p.getSelectedItemPosition();
        goto L26
    L22:
        r10 = r15.p.getSelectedView();
    L33:
        r15.dismiss();
        return;
    L9:
        if (r15.M.isShowing() == true) goto L11;
        r1 = null;
        goto L13
    L11:
        r1 = r15.p.getSelectedItem();
        goto L13
    L35:
        yg r17 = (yg) r8;
        bh r18 = r17.T;
        r18.setSelection(r11);
        if (r18.getOnItemClickListener() == null) goto L38;
        r18.performItemClick(r10, r11, r17.Q.getItemId(r11));
    L38:
        r17.dismiss();
    }
}
