package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m74 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SearchView o;

    public /* synthetic */ m74(SearchView searchView, int i) {
        this.n = i;
        this.o = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ub5 ub5VarH;
        ub5 ub5VarH2;
        int i = this.n;
        SearchView searchView = this.o;
        switch (i) {
            case 0:
                EditText editText = searchView.w;
                editText.clearFocus();
                SearchBar searchBar = searchView.G;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                if (searchView.M && (ub5VarH = j65.h(editText)) != null) {
                    ub5VarH.a.x(8);
                } else {
                    InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                }
                break;
            case 1:
                EditText editText2 = searchView.w;
                if (editText2.requestFocus()) {
                    editText2.sendAccessibilityEvent(8);
                }
                if (searchView.M && (ub5VarH2 = j65.h(editText2)) != null) {
                    ub5VarH2.a.F(8);
                } else {
                    ((InputMethodManager) editText2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText2, 1);
                }
                break;
            case 2:
                searchView.l();
                break;
            default:
                searchView.j();
                break;
        }
    }
}
