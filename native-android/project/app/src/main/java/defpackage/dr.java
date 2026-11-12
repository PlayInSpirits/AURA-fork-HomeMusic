package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr implements View.OnTouchListener {
    public final /* synthetic */ int n;

    public /* synthetic */ dr(int r1) {
        this.n = r1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r1, MotionEvent r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return true;
    L6:
        return true;
    }
}
