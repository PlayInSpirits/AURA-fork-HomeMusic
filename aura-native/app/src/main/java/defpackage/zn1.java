package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
                if (i == 2 || i == 6) {
                    gf1Var.invoke();
                    break;
                }
                break;
            default:
                SearchFragment searchFragment = (SearchFragment) obj;
                String obj2 = ((SearchView) searchFragment.l0.m).getText().toString();
                if (!obj2.equals("") && obj2.trim().length() > 1) {
                    searchFragment.h0(obj2);
                    break;
                }
                break;
        }
        return true;
    }
}
