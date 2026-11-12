package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg2 extends ArrayAdapter {
    public ColorStateList n;
    public ColorStateList o;
    public final /* synthetic */ xg2 p;

    public wg2(xg2 r1, Context r2, int r3, String[] r4) {
        this.p = r1;
        super(r2, r3, r4);
        a();
    }

    public final void a() {
        xg2 r0 = this.p;
        ColorStateList r1 = r0.y;
        ColorStateList r2 = null;
        if (r1 == null) goto L5;
        int[] r4 = {R.attr.state_pressed};
        ColorStateList r5 = new ColorStateList(new int[][]{r4, new int[0]}, new int[]{r1.getColorForState(r4, 0), 0});
    L6:
        this.o = r5;
        if (r0.x != 0) goto L9;
    L11:
        this.n = r2;
        return;
    L9:
        if (r0.y == null) goto L11;
        int[] r3 = {R.attr.state_hovered, -16842919};
        int[] r6 = {R.attr.state_selected, -16842919};
        int r7 = r0.y.getColorForState(r6, 0);
        int r8 = r0.y.getColorForState(r3, 0);
        r2 = new ColorStateList(new int[][]{r6, r3, new int[0]}, new int[]{v50.g(r7, r0.x), v50.g(r8, r0.x), r0.x});
        goto L11
    L5:
        r5 = null;
        goto L6
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r3, View r4, ViewGroup r5) {
        View r6 = super.getView(r3, r4, r5);
        if ((r6 instanceof TextView) == false) goto L13;
        TextView r7 = (TextView) r6;
        xg2 r8 = this.p;
        Drawable r1 = null;
        if (r8.getText().toString().contentEquals(r7.getText()) == true) goto L7;
    L12:
        WeakHashMap r2 = j65.a;
        r7.setBackground(r1);
        goto L13
    L7:
        if (r8.x == 0) goto L12;
        ColorDrawable r0 = new ColorDrawable(r8.x);
        if (this.o == null) goto L11;
        r0.setTintList(this.n);
        r1 = new RippleDrawable(this.o, r0, null);
        goto L12
    L11:
        r1 = r0;
    L13:
        return r6;
    }
}
