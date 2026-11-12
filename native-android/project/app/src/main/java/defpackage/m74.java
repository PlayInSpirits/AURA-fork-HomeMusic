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

    public /* synthetic */ m74(SearchView r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        SearchView r4 = this.o;
        switch(r0) {
            case 0: goto L18;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r4.j();
        return;
    L6:
        r4.l();
        return;
    L8:
        EditText r1 = r4.w;
        if (r1.requestFocus() == false) goto L12;
        r1.sendAccessibilityEvent(8);
    L12:
        if (r4.M == false) goto L16;
        ub5 r5 = j65.h(r1);
        if (r5 == null) goto L16;
        r5.a.F(8);
        return;
    L16:
        ((InputMethodManager) r1.getContext().getSystemService(InputMethodManager.class)).showSoftInput(r1, 1);
        return;
    L18:
        EditText r2 = r4.w;
        r2.clearFocus();
        SearchBar r3 = r4.G;
        if (r3 == null) goto L22;
        r3.requestFocus();
    L22:
        if (r4.M == false) goto L26;
        ub5 r6 = j65.h(r2);
        if (r6 == null) goto L26;
        r6.a.x(8);
        return;
    L26:
        InputMethodManager r7 = (InputMethodManager) r2.getContext().getSystemService(InputMethodManager.class);
        if (r7 == null) goto L32;
        r7.hideSoftInputFromWindow(r2.getWindowToken(), 0);
        return;
    }
}
