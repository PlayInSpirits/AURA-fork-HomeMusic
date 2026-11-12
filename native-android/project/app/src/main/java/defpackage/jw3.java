package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jw3 {
    public cw3 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(cx3 r2) {
        int r0 = r2.j;
        if (r2.h() == false) goto L6;
        return;
    L6:
        if ((r0 & 4) != 0) goto L9;
        r2.b();
        return;
    }

    public abstract boolean a(cx3 r1, cx3 r2, n50 r3, n50 r4);

    public final void c(cx3 r10) {
        cw3 r9 = this.a;
        if (r9 == null) goto L47;
        RecyclerView r11 = r9.a;
        boolean r0 = true;
        r10.p(true);
        View r1 = r10.a;
        if (r10.h != null) goto L7;
    L9:
        r10.i = null;
        if ((r10.j & 16) != 0) goto L50;
        hm2 r2 = r11.p;
        r11.n0();
        ew4 r3 = r11.s;
        e20 r4 = (e20) r3.q;
        rm2 r5 = (rm2) r3.p;
        int r6 = r3.o;
        if (r6 != 1) goto L20;
        if (((View) r3.s) != r1) goto L17;
    L16:
        r0 = false;
    L32:
        if (r0 == false) goto L36;
        cx3 r7 = RecyclerView.N(r1);
        r2.l(r7);
        r2.i(r7);
        if (RecyclerView.Q0 == false) goto L36;
        Log.d("RecyclerView", "after removing animated view: " + r1 + ", " + r11);
    L36:
        r11.p0(!r0);
        if (r0 == false) goto L39;
        return;
    L39:
        if (r10.l() == false) goto L49;
        r11.removeDetachedView(r1, false);
        return;
    L49:
        return;
    L17:
        kf2.o("Cannot call removeViewIfHidden within removeView(At) for a different view");
        return;
    L20:
        if (r6 != 2) goto L46;
        kf2.o("Cannot call removeViewIfHidden within removeViewIfHidden");
        return;
    L46:
        r3.o = 2;     // Catch: Throwable -> L25
        int r8 = ((RecyclerView) r5.o).indexOfChild(r1);     // Catch: Throwable -> L25
        if (r8 != (-1)) goto L28;
        r3.p(r1);     // Catch: Throwable -> L25
    L24:
        r3.o = 0;
        goto L32
    L28:
        if (r4.s(r8) == false) goto L31;
        r4.y(r8);     // Catch: Throwable -> L25
        r3.p(r1);     // Catch: Throwable -> L25
        r5.i(r8);     // Catch: Throwable -> L25
        goto L24
    L31:
        r3.o = 0;
    L25:
        th = move-exception;
        r3.o = 0;
        throw th;
    L50:
        return;
    L7:
        if (r10.i != null) goto L9;
        r10.h = null;
        goto L9
    }

    public abstract void d(cx3 r1);

    public abstract void e();

    public abstract boolean f();
}
