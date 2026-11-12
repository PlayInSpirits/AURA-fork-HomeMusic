package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w44 implements u44 {
    public static final xc5 r = new xc5(19, new d60(17, 0), new ms3(3));
    public final Map n;
    public final w03 o;
    public x44 p;
    public final kl3 q;

    public w44(Map map) {
        this.n = map;
        long[] jArr = v54.a;
        this.o = new w03();
        this.q = new kl3(5, this);
    }

    @Override // defpackage.u44
    public final void e(Object obj, r70 r70Var, rg1 rg1Var, int i) {
        int i2;
        rg1Var.S(533563200);
        if ((i & 6) == 0) {
            i2 = (rg1Var.g(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rg1Var.g(r70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rg1Var.g(this) ? 256 : 128;
        }
        if (rg1Var.K(i2 & 1, (i2 & 147) != 146)) {
            rg1Var.T(obj);
            Object objH = rg1Var.H();
            i80 i80Var = j80.a;
            if (objH == i80Var) {
                kl3 kl3Var = this.q;
                if (!((Boolean) kl3Var.invoke(obj)).booleanValue()) {
                    nz2.k(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.n.get(obj);
                wl4 wl4Var = z44.a;
                a54 a54Var = new a54(new y44(map, kl3Var));
                rg1Var.b0(a54Var);
                objH = a54Var;
            }
            a54 a54Var2 = (a54) objH;
            gi1.b(new rr3[]{z44.a.a(a54Var2), td2.a.a(a54Var2)}, r70Var, rg1Var, (i2 & 112) | 8);
            boolean zG = rg1Var.g(this) | rg1Var.g(obj) | rg1Var.g(a54Var2);
            Object objH2 = rg1Var.H();
            if (zG || objH2 == i80Var) {
                objH2 = new dd0(this, obj, a54Var2, 5);
                rg1Var.b0(objH2);
            }
            bu.b(j15.a, (if1) objH2, rg1Var);
            if (rg1Var.y && rg1Var.G.i == rg1Var.z) {
                rg1Var.z = -1;
                rg1Var.y = false;
            }
            rg1Var.o(false);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new o70(this, obj, r70Var, i, 3);
        }
    }
}
