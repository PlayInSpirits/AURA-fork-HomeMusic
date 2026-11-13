package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kn1 extends p44 {
    public final Map H;
    public ow0 I;

    public kn1(n9 n9Var, ww0 ww0Var, sw0 sw0Var, Map map) {
        super(n9Var, ww0Var, sw0Var);
        this.H = map;
    }

    @Override // defpackage.p44
    public final tb1 m(tb1 tb1Var) {
        ow0 ow0Var;
        ow0 ow0Var2 = this.I;
        if (ow0Var2 == null) {
            ow0Var2 = tb1Var.r;
        }
        if (ow0Var2 != null && (ow0Var = (ow0) this.H.get(ow0Var2.p)) != null) {
            ow0Var2 = ow0Var;
        }
        qv2 qv2Var = tb1Var.l;
        qv2 qv2Var2 = null;
        if (qv2Var != null) {
            pv2[] pv2VarArr = qv2Var.a;
            int length = pv2VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                pv2 pv2Var = pv2VarArr[i2];
                if ((pv2Var instanceof hq3) && "com.apple.streaming.transportStreamTimestamp".equals(((hq3) pv2Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    pv2[] pv2VarArr2 = new pv2[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            pv2VarArr2[i < i2 ? i : i - 1] = pv2VarArr[i];
                        }
                        i++;
                    }
                    qv2Var2 = new qv2(pv2VarArr2);
                }
            }
            if (ow0Var2 == tb1Var.r || qv2Var != tb1Var.l) {
                sb1 a = tb1Var.a();
                a.q = ow0Var2;
                a.k = qv2Var;
                tb1Var = new tb1(a);
            }
            return super.m(tb1Var);
        }
        qv2Var = qv2Var2;
        if (ow0Var2 == tb1Var.r) {
        }
        sb1 a2 = tb1Var.a();
        a2.q = ow0Var2;
        a2.k = qv2Var;
        tb1Var = new tb1(a2);
        return super.m(tb1Var);
    }
}
