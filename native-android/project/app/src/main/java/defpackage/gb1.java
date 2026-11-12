package defpackage;

import com.eddyizm.tempus.homemusic.SmartPlan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 implements Comparable {
    public static final gb1 o = null;
    public static final gb1 p = null;
    public static final gb1 q = null;
    public final int n;

    static {
        gb1 r0 = new gb1(100);
        gb1 r1 = new gb1(200);
        gb1 r2 = new gb1(300);
        gb1 r3 = new gb1(400);
        gb1 r4 = new gb1(SmartPlan.MAX_QUEUE);
        gb1 r5 = new gb1(600);
        o = r5;
        gb1 r6 = new gb1(700);
        gb1 r7 = new gb1(800);
        gb1 r8 = new gb1(900);
        p = r3;
        q = r6;
        gb.P(new gb1[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    public gb1(int r3) {
        this.n = r3;
        boolean r2 = false;
        if (1 <= r3) goto L5;
    L7:
        if (r2 == true) goto L10;
        dz1.a("Font weight can be in range [1, 1000]. Current value: " + r3);
        return;
    L10:
        return;
    L5:
        if (r3 >= 1001) goto L7;
        r2 = true;
        goto L7
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r1) {
        return h12.j(this.n, ((gb1) r1).n);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof gb1) == true) goto L8;
        return false;
    L8:
        int r5 = ((gb1) r4).n;
        if (this.n == r5) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.n;
    }

    public final String toString() {
        return b11.j(this.n, "FontWeight(weight=", ")");
    }
}
