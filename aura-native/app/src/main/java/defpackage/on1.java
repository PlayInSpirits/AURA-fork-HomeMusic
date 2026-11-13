package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class on1 implements TextView.OnEditorActionListener {
    public on1() {
        super();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) textView.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
        }
        textView.clearFocus();
        return true;
    }
}
