package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 extends tz3 {
    public static final hu2 c = null;
    public final List a;
    public final List b;

    static {
        c = ve5.a("application/x-www-form-urlencoded");
    }

    public rb1(ArrayList r1, ArrayList r2) {
        r1.getClass();
        r2.getClass();
        this.a = ze5.k(r1);
        this.b = ze5.k(r2);
    }

    public final long a(ew r5, boolean r6) {
        if (r6 == false) goto L4;
        tv r7 = new tv();
    L5:
        List r0 = this.a;
        int r1 = r0.size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L10;
        if (r2 <= 0) goto L9;
        r7.Y(38);
    L9:
        r7.d0((String) r0.get(r2));
        r7.Y(61);
        r7.d0((String) this.b.get(r2));
        r2 = r2 + 1;
        goto L6
    L10:
        if (r6 == false) goto L13;
        long r3 = r7.o;
        r7.b();
        return r3;
    L13:
        return 0;
    L4:
        r5.getClass();
        r7 = r5.a();
        goto L5
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        return c;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew r2) {
        r2.getClass();
        a(r2, false);
    }
}
