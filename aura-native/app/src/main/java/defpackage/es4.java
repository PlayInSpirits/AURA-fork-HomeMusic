package defpackage;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class es4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ TextInputLayout o;

    public /* synthetic */ es4(TextInputLayout textInputLayout, int i) {
        this.n = i;
        this.o = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        TextInputLayout textInputLayout = this.o;
        switch (i) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.p.t;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.q.requestLayout();
                break;
        }
    }
}
