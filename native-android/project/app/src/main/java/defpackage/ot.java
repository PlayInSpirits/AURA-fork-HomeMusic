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

    public /* synthetic */ ot(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        yo yoVar;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                pt ptVar = (pt) obj;
                ImageView imageView = ptVar.A;
                if (imageView.getVisibility() != 0 || (yoVar = ptVar.S) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                yoVar.setBounds(rect);
                yoVar.i(imageView, null);
                return;
            case 2:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.C;
                View view2 = searchView.K;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.E.getPaddingLeft();
                    Rect rect2 = new Rect();
                    boolean z = e85.a;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.d0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect2);
                    int i10 = rect2.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect2.left) + rect2.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                kv4 kv4Var = (kv4) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                kv4Var.V = iArr[0];
                view.getWindowVisibleDisplayFrame(kv4Var.P);
                return;
        }
    }
}
