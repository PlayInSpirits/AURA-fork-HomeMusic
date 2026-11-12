package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qa5 extends WindowInsetsAnimation$Callback {
    public final ma5 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public qa5(ma5 r2) {
        super(r2.o);
        this.d = new HashMap();
        this.a = r2;
    }

    public final ta5 a(WindowInsetsAnimation r6) {
        HashMap r5 = this.d;
        ta5 r0 = (ta5) r5.get(r6);
        if (r0 != null) goto L6;
        ta5 r1 = new ta5(0, null, 0);
        r1.a = new ra5(r6);
        r5.put(r6, r1);
        return r1;
    L6:
        return r0;
    }

    public final void onEnd(WindowInsetsAnimation r3) {
        this.a.a(a(r3));
        this.d.remove(r3);
    }

    public final void onPrepare(WindowInsetsAnimation r2) {
        this.a.b(a(r2));
    }

    public final WindowInsets onProgress(WindowInsets r5, List r6) {
        ArrayList r0 = this.c;
        if (r0 != null) goto L5;
        ArrayList r1 = new ArrayList(r6.size());
        this.c = r1;
        this.b = Collections.unmodifiableList(r1);
    L6:
        int r2 = r6.size() - 1;
    L7:
        if (r2 < 0) goto L10;
        WindowInsetsAnimation r3 = xq2.l(r6.get(r2));
        ta5 r4 = a(r3);
        r4.a.e(xq2.D(r3));
        this.c.add(r4);
        r2 = r2 - 1;
        goto L7
    L10:
        return this.a.c(pb5.g(r5, null), this.b).f();
    L5:
        r0.clear();
        goto L6
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation r2, WindowInsetsAnimation.Bounds r3) {
        ta5 r4 = a(r2);
        qr2 r0 = new qr2(r3);
        qr2 r1 = this.a.d(r4, r0);
        r1.getClass();
        xq2.o();
        return xq2.j(((vz1) r1.o).d(), ((vz1) r1.p).d());
    }
}
