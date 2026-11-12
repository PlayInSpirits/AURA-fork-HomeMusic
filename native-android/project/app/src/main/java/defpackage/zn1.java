package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zn1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                gf1 gf1Var = (gf1) obj;
                if (i != 2 && i != 6) {
                    return false;
                }
                gf1Var.invoke();
                return true;
            default:
                SearchFragment searchFragment = (SearchFragment) obj;
                String string = ((SearchView) searchFragment.l0.m).getText().toString();
                if (string.equals("") || string.trim().length() <= 1) {
                    return false;
                }
                searchFragment.h0(string);
                return true;
        }
    }
}
