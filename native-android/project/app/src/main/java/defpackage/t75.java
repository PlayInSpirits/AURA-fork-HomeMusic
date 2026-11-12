package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t75 {
    public final ArrayList a;
    public long b;
    public Interpolator c;
    public u75 d;
    public boolean e;
    public final fv4 f;

    public t75() {
        this.b = -1;
        this.f = new fv4(this);
        this.a = new ArrayList();
    }

    public final void a() {
        if (this.e == true) goto L5;
        return;
    L5:
        ArrayList r0 = this.a;
        int r1 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L8;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        ((s75) r4).b();
        goto L6
    L8:
        this.e = false;
    }

    public final void b() {
        if (this.e == false) goto L5;
        return;
    L5:
        ArrayList r0 = this.a;
        int r1 = r0.size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L21;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        s75 r4 = (s75) r3;
        long r5 = this.b;
        if (r5 < 0) goto L10;
        r4.c(r5);
    L10:
        Interpolator r6 = this.c;
        if (r6 == null) goto L16;
        View r7 = (View) r4.a.get();
        if (r7 == null) goto L16;
        r7.animate().setInterpolator(r6);
    L16:
        if (this.d == null) goto L18;
        r4.d(this.f);
    L18:
        View r8 = (View) r4.a.get();
        if (r8 == null) goto L6;
        r8.animate().start();
        goto L6
    L21:
        this.e = true;
    }
}
