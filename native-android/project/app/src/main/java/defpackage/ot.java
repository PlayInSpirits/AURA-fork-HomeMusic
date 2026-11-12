package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ot implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        int r10 = this.a;
        int r11 = 0;
        Object r0 = this.b;
        switch(r10) {
            case 0: goto L27;
            case 1: goto L21;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        kv4 r12 = (kv4) r0;
        int[] r13 = new int[2];
        r1.getLocationOnScreen(r13);
        r12.V = r13[0];
        r1.getWindowVisibleDisplayFrame(r12.P);
        return;
    L6:
        SearchView r14 = (SearchView) r0;
        SearchView.SearchAutoComplete r15 = r14.C;
        View r16 = r14.K;
        boolean r17 = true;
        if (r16.getWidth() <= 1) goto L28;
        Resources r18 = r14.getContext().getResources();
        int r19 = r14.E.getPaddingLeft();
        Rect r20 = new Rect();
        boolean r21 = e85.a;
        if (r14.getLayoutDirection() == 1) goto L13;
        r17 = false;
    L13:
        if (r14.d0 == false) goto L15;
        r11 = r18.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + r18.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
    L15:
        r15.getDropDownBackground().getPadding(r20);
        int r22 = r20.left;
        if (r17 == false) goto L18;
        int r23 = -r22;
    L19:
        r15.setDropDownHorizontalOffset(r23);
        r15.setDropDownWidth((((r16.getWidth() + r20.left) + r20.right) + r11) - r19);
        return;
    L18:
        r23 = r19 - (r22 + r11);
        goto L19
    L28:
        return;
    L21:
        pt r24 = (pt) r0;
        ImageView r25 = r24.A;
        if (r25.getVisibility() != 0) goto L29;
        yo r26 = r24.S;
        if (r26 == null) goto L30;
        Rect r27 = new Rect();
        r25.getDrawingRect(r27);
        r26.setBounds(r27);
        r26.i(r25, null);
        return;
    L30:
        return;
    L29:
        return;
    L27:
        throw null;
    }
}
