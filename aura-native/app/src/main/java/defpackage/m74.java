/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import defpackage.j65;
import defpackage.ub5;

public final class m74
implements Runnable {
    public final int n;
    public final SearchView o;

    public m74(SearchView searchView, int n16) {
        this.n = n16;
        this.o = searchView;
    }

    @Override
    public final void run() {
        int n16 = this.n;
        Object object = this.o;
        switch (n16) {
            default: {
                ((SearchView)object).j();
                return;
            }
            case 2: {
                ((SearchView)object).l();
                return;
            }
            case 1: {
                EditText editText = ((SearchView)object).w;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (((SearchView)object).M && (object = j65.h(editText)) != null) {
                    ((ub5)object).a.F(8);
                } else {
                    editText.getContext().getSystemService(InputMethodManager.class).showSoftInput(editText, 1);
                }
                return;
            }
            case 0: 
        }
        EditText editText = ((SearchView)object).w;
        editText.clearFocus();
        SearchBar searchBar = ((SearchView)object).G;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        if (((SearchView)object).M && (object = j65.h(editText)) != null) {
            ((ub5)object).a.x(8);
        } else {
            object = editText.getContext().getSystemService(InputMethodManager.class);
            if (object != null) {
                ((InputMethodManager)object).hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        }
    }
}

