package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sg3 implements kl1 {
    public final View a;

    public /* synthetic */ sg3(View r1) {
        this.a = r1;
    }

    public void a() {
        View r2 = this.a;
        if (r2 == null) goto L6;
        ((InputMethodManager) r2.getContext().getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
        return;
    }

    public void b() {
        View r2 = this.a;
        if (r2 != null) goto L6;
        return;
    L6:
        if (r2.isInEditMode() == false) goto L8;
    L11:
        r2.requestFocus();
        View r0 = r2;
    L12:
        if (r0 != null) goto L14;
        r0 = r2.getRootView().findViewById(R.id.content);
    L14:
        if (r0 != null) goto L16;
        return;
    L16:
        if (r0.hasWindowFocus() == false) goto L20;
        r0.post(new ni0(r0, 2));
        return;
    L20:
        return;
    L8:
        if (r2.onCheckIsTextEditor() == true) goto L11;
        r0 = r2.getRootView().findFocus();
        goto L12
    }
}
