package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ View o;

    public /* synthetic */ ni0(View r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        View r2 = this.o;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((InputMethodManager) r2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(r2, 1);
        return;
    L6:
        ((InputMethodManager) r2.getContext().getSystemService("input_method")).showSoftInput(r2, 0);
        return;
    L8:
        r2.setVisibility(8);
        return;
    L10:
        r2.requestFocus();
        r2.post(new ni0(r2, 3));
    }
}
