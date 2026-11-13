/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import defpackage.kl1;
import defpackage.ni0;

public class sg3
implements kl1 {
    public final View a;

    public sg3(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void b() {
        View view = this.a;
        if (view != null) {
            View view2;
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                view2 = view.getRootView().findFocus();
            } else {
                view.requestFocus();
                view2 = view;
            }
            View view3 = view2;
            if (view2 == null) {
                view3 = view.getRootView().findViewById(0x1020002);
            }
            if (view3 != null && view3.hasWindowFocus()) {
                view3.post(new ni0(view3, 2));
            }
        }
    }
}

