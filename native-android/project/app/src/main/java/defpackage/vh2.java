package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vh2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ xh2 o;

    public /* synthetic */ vh2(xh2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r7) {
        int r0 = this.n;
        xh2 r6 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        Iterator r1 = r6.C0.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        ((View.OnClickListener) r1.next()).onClick(r7);
        goto L6
    L8:
        r6.i0(false, false);
        return;
    L10:
        Iterator r8 = r6.B0.iterator();
    L12:
        if (r8.hasNext() == false) goto L14;
        wc4 r2 = (wc4) r8.next();
        Long r3 = r6.n0().n;
        xc4 r4 = r2.a;
        r4.H0 = r3.longValue();
        ((TextInputEditText) r4.B0.q).setText(g12.x(new Date(r3.longValue())));
        goto L12
    L14:
        r6.i0(false, false);
    }
}
