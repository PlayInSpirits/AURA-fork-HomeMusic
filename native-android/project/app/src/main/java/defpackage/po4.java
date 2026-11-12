package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class po4 implements x34 {
    public final we1 n;

    public po4(we1 r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // defpackage.x34
    public final /* bridge */ /* synthetic */ z34 U(String r1) {
        return b(r1);
    }

    public final zo4 b(String r5) {
        r5.getClass();
        we1 r4 = this.n;
        r4.getClass();
        String r0 = qm4.K0(r5).toString();
        if (r0.length() < 3) goto L23;
        String r1 = r0.substring(0, 3).toUpperCase(Locale.ROOT);
        r1.getClass();
        int r2 = r1.hashCode();
        if (r2 == 79487) goto L19;
        if (r2 == 81978) goto L16;
        if (r2 != 85954) goto L23;
        if (r1.equals("WIT") == false) goto L23;
    L20:
        xo4 r3 = new xo4(r4, r5);
        r3.q = new int[0];
        r3.r = new long[0];
        r3.s = new double[0];
        r3.t = new String[0];
        r3.u = new byte[0][];
        return r3;
    L16:
        if (r1.equals("SEL") == true) goto L20;
    L19:
        if (r1.equals("PRA") == true) goto L20;
    L23:
        return new yo4(r4, r5);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }
}
