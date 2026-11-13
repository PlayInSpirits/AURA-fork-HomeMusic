package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s30 s30Var = (s30) obj;
                s30Var.s(s30Var.t());
                break;
            case 1:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
            case 2:
                ix0 ix0Var = (ix0) obj;
                ix0Var.l = z;
                ix0Var.p();
                if (!z) {
                    ix0Var.s(false);
                    ix0Var.m = false;
                    break;
                }
                break;
            default:
                fa faVar = (fa) obj;
                if (z) {
                    faVar.invoke();
                    break;
                }
                break;
        }
    }
}
