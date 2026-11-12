package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.google.android.material.textfield.TextInputLayout;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 implements TextWatcher {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ pn1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                x xVar = (x) obj;
                String string = editable != null ? editable.toString() : null;
                xVar.invoke(string != null ? string : "");
                break;
            case 1:
                eu3 eu3Var = (eu3) obj;
                eu3Var.p0();
                if (!eu3Var.N0 && eu3Var.J0 != null) {
                    eu3Var.o0(editable != null ? editable.toString() : "");
                    break;
                }
                break;
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                textInputLayout.u(!textInputLayout.M0, false);
                if (textInputLayout.x) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.F) {
                    textInputLayout.v(editable);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.n;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.n;
        int i5 = 8;
        Object obj = this.o;
        switch (i4) {
            case 2:
                SearchFragment searchFragment = (SearchFragment) obj;
                if (i + i3 <= 1) {
                    searchFragment.i0();
                } else {
                    String string = charSequence.toString();
                    searchFragment.n0.c.getClass();
                    k03 k03Var = new k03();
                    pn4 pn4VarF = App.f(false);
                    if (pn4VarF.g == null) {
                        pn4VarF.g = new hd5(pn4VarF);
                    }
                    pn4VarF.g.m(string, 5, 0, 5, 5).enqueue(new p8(k03Var, 4));
                    k03Var.e(searchFragment.v(), new k74(searchFragment, 2));
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.C.getText();
                searchView.n0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                if (searchView.l0 && !searchView.e0 && zIsEmpty) {
                    searchView.H.setVisibility(8);
                    i5 = 0;
                }
                searchView.J.setVisibility(i5);
                searchView.r();
                searchView.u();
                if (searchView.a0 != null && !TextUtils.equals(charSequence, searchView.m0)) {
                    searchView.a0.onQueryTextChange(charSequence.toString());
                }
                searchView.m0 = charSequence.toString();
                break;
            case 4:
                ((com.google.android.material.search.SearchView) obj).x.setVisibility(charSequence.length() > 0 ? 0 : 8);
                break;
        }
    }
}
