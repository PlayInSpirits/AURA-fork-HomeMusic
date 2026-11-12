package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.iv2;
import defpackage.jv3;
import defpackage.pu2;
import defpackage.qu2;
import defpackage.tu2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements pu2, iv2, AdapterView.OnItemClickListener {
    public static final int[] o = {R.attr.background, R.attr.divider};
    public qu2 n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        jv3 jv3VarF = jv3.f(context, attributeSet, o, i);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(jv3VarF.c(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(jv3VarF.c(1));
        }
        jv3VarF.g();
    }

    @Override // defpackage.pu2
    public final boolean a(tu2 tu2Var) {
        return this.n.q(tu2Var, null, 0);
    }

    @Override // defpackage.iv2
    public final void b(qu2 qu2Var) {
        this.n = qu2Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((tu2) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
