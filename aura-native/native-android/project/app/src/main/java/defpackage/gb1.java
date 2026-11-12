package defpackage;

import com.eddyizm.tempus.homemusic.SmartPlan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 implements Comparable {
    public static final gb1 o;
    public static final gb1 p;
    public static final gb1 q;
    public final int n;

    static {
        gb1 gb1Var = new gb1(100);
        gb1 gb1Var2 = new gb1(200);
        gb1 gb1Var3 = new gb1(300);
        gb1 gb1Var4 = new gb1(400);
        gb1 gb1Var5 = new gb1(SmartPlan.MAX_QUEUE);
        gb1 gb1Var6 = new gb1(600);
        o = gb1Var6;
        gb1 gb1Var7 = new gb1(700);
        gb1 gb1Var8 = new gb1(800);
        gb1 gb1Var9 = new gb1(900);
        p = gb1Var4;
        q = gb1Var7;
        gb.P(gb1Var, gb1Var2, gb1Var3, gb1Var4, gb1Var5, gb1Var6, gb1Var7, gb1Var8, gb1Var9);
    }

    public gb1(int i) {
        this.n = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        dz1.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return h12.j(this.n, ((gb1) obj).n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gb1) {
            return this.n == ((gb1) obj).n;
        }
        return false;
    }

    public final int hashCode() {
        return this.n;
    }

    public final String toString() {
        return b11.j(this.n, "FontWeight(weight=", ")");
    }
}
