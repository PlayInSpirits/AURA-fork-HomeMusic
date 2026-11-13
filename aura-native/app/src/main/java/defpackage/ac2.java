package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ac2 implements View.OnTouchListener {
    public final /* synthetic */ bc2 n;

    public ac2(bc2 bc2Var) {
        this.n = bc2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bc2 bc2Var = this.n;
        yb2 yb2Var = bc2Var.E;
        Handler handler = bc2Var.I;
        lg lgVar = bc2Var.M;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && lgVar != null && lgVar.isShowing() && x >= 0 && x < lgVar.getWidth() && y >= 0 && y < lgVar.getHeight()) {
            handler.postDelayed(yb2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(yb2Var);
        return false;
    }
}
