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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(xg2 xg2Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.p = xg2Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        xg2 xg2Var = this.p;
        ColorStateList colorStateList2 = xg2Var.y;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.o = colorStateList;
        if (xg2Var.x != 0 && xg2Var.y != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{v50.g(xg2Var.y.getColorForState(iArr3, 0), xg2Var.x), v50.g(xg2Var.y.getColorForState(iArr2, 0), xg2Var.x), xg2Var.x});
        }
        this.n = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            xg2 xg2Var = this.p;
            Drawable rippleDrawable = null;
            if (xg2Var.getText().toString().contentEquals(textView.getText()) && xg2Var.x != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xg2Var.x);
                if (this.o != null) {
                    colorDrawable.setTintList(this.n);
                    rippleDrawable = new RippleDrawable(this.o, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = j65.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
