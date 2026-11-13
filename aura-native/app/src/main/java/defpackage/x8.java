package defpackage;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x8 extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView n;
    public final /* synthetic */ a9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(a9 a9Var, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.o = a9Var;
        this.n = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.o.t;
        if (zArr != null && zArr[i]) {
            this.n.setItemChecked(i, true);
        }
        return view2;
    }
}
