package defpackage;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class es4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ TextInputLayout o;

    public /* synthetic */ es4(TextInputLayout r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        TextInputLayout r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.q.requestLayout();
        return;
    L6:
        CheckableImageButton r2 = r1.p.t;
        r2.performClick();
        r2.jumpDrawablesToCurrentState();
    }
}
