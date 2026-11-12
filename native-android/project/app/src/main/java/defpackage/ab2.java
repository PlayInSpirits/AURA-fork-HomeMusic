package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ab2 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View r8) {
        int r0 = this.k.size();
        View r1 = null;
        int r2 = Integer.MAX_VALUE;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L18;
        View r4 = ((cx3) this.k.get(r3)).a;
        nw3 r5 = (nw3) r4.getLayoutParams();
        if (r4 == r8) goto L17;
        if (r5.a.j() == true) goto L17;
        int r6 = (r5.a.d() - this.d) * this.e;
        if (r6 < 0) goto L17;
        if (r6 >= r2) goto L17;
        r1 = r4;
        if (r6 == 0) goto L18;
        r2 = r6;
    L17:
        r3 = r3 + 1;
    L18:
        if (r1 != null) goto L21;
        this.d = -1;
        return;
    L21:
        this.d = ((nw3) r1.getLayoutParams()).a.d();
    }

    public final View b(hm2 r5) {
        List r0 = this.k;
        if (r0 == null) goto L16;
        int r6 = r0.size();
        int r1 = 0;
    L5:
        if (r1 >= r6) goto L14;
        View r2 = ((cx3) this.k.get(r1)).a;
        nw3 r3 = (nw3) r2.getLayoutParams();
        if (r3.a.j() == true) goto L13;
        if (this.d != r3.a.d()) goto L13;
        a(r2);
        return r2;
    L13:
        r1 = r1 + 1;
        goto L5
    L14:
        return null;
    L16:
        View r7 = r5.k(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return r7;
    }
}
