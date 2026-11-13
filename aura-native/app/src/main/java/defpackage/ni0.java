package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ni0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ View o;

    public /* synthetic */ ni0(View view, int i) {
        this.n = i;
        this.o = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        View view = this.o;
        switch (i) {
            case 0:
                view.requestFocus();
                view.post(new ni0(view, 3));
                break;
            case 1:
                view.setVisibility(8);
                break;
            case 2:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
