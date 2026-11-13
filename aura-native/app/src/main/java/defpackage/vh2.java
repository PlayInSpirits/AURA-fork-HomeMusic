package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vh2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ xh2 o;

    public /* synthetic */ vh2(xh2 xh2Var, int i) {
        this.n = i;
        this.o = xh2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        xh2 xh2Var = this.o;
        switch (i) {
            case 0:
                Iterator it = xh2Var.B0.iterator();
                while (it.hasNext()) {
                    wc4 wc4Var = (wc4) it.next();
                    Long l = xh2Var.n0().n;
                    xc4 xc4Var = wc4Var.a;
                    xc4Var.H0 = l.longValue();
                    ((TextInputEditText) xc4Var.B0.q).setText(g12.x(new Date(l.longValue())));
                }
                xh2Var.i0(false, false);
                break;
            default:
                Iterator it2 = xh2Var.C0.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                xh2Var.i0(false, false);
                break;
        }
    }
}
