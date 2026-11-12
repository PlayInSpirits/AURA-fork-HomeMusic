package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p30 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p30(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r4, boolean r5) {
        int r0 = this.a;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L12;
            case 2: goto L8;
            default: goto L4;
        };
    L4:
        fa r6 = (fa) r3;
        if (r5 == false) goto L26;
        r6.invoke();
        return;
    L26:
        return;
    L8:
        ix0 r7 = (ix0) r3;
        r7.l = r5;
        r7.p();
        if (r5 == true) goto L27;
        r7.s(false);
        r7.m = false;
        return;
    L27:
        return;
    L12:
        EditText[] r8 = (EditText[]) r3;
        int r9 = r8.length;
        int r1 = 0;
    L13:
        if (r1 >= r9) goto L18;
        if (r8[r1].hasFocus() == true) goto L29;
        r1 = r1 + 1;
        goto L13
    L29:
        return;
    L18:
        InputMethodManager r10 = (InputMethodManager) r4.getContext().getSystemService(InputMethodManager.class);
        if (r10 == null) goto L28;
        r10.hideSoftInputFromWindow(r4.getWindowToken(), 0);
        return;
    L28:
        return;
    L22:
        s30 r11 = (s30) r3;
        r11.s(r11.t());
    }
}
