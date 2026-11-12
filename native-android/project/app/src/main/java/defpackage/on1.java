package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class on1 implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView r1, int r2, KeyEvent r3) {
        if (r2 == 3) goto L5;
        return false;
    L5:
        InputMethodManager r0 = (InputMethodManager) r1.getContext().getSystemService(InputMethodManager.class);
        if (r0 == null) goto L8;
        r0.hideSoftInputFromWindow(r1.getWindowToken(), 0);
    L8:
        r1.clearFocus();
        return true;
    }
}
