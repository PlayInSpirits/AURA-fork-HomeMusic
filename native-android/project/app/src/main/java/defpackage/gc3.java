package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc3 implements xf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ gc3(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.n;
        int i2 = 0;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                lm0 lm0Var = (lm0) obj5;
                r62 r62Var = (r62) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zA = xl.A(lm0Var, fFloatValue);
                if (lm0Var.m().e != hb3.n && r62Var != r62.n) {
                    zA = !zA;
                }
                int i3 = lm0Var.m().b;
                float fK = i3 == 0 ? 0.0f : xl.k(lm0Var) / i3;
                float f = fK - ((int) fK);
                if (Math.abs(fFloatValue) >= lm0Var.n.M(400.0f)) {
                    i2 = fFloatValue > 0.0f ? 1 : 2;
                }
                if (i2 == 0) {
                    if (Math.abs(f) <= 0.5f) {
                        float fAbs = Math.abs(fK);
                        oo0 oo0Var = lm0Var.n;
                        dd3 dd3Var = ed3.a;
                        if (fAbs < Math.abs(Math.min(oo0Var.M(56.0f), lm0Var.o() / 2.0f) / lm0Var.o()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zA) {
                            fFloatValue2 = fFloatValue3;
                        }
                    } else if (zA) {
                        fFloatValue2 = fFloatValue3;
                    }
                } else if (i2 == 1) {
                    fFloatValue2 = fFloatValue3;
                } else if (i2 != 2) {
                    fFloatValue2 = 0.0f;
                }
                return Float.valueOf(fFloatValue2);
            default:
                Spannable spannable = (Spannable) obj5;
                lc lcVar = (lc) obj4;
                ij4 ij4Var = (ij4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                vk0 vk0Var = ij4Var.f;
                gb1 gb1Var = ij4Var.c;
                if (gb1Var == null) {
                    gb1Var = gb1.p;
                }
                eb1 eb1Var = ij4Var.d;
                i2 = eb1Var != null ? eb1Var.a : 0;
                fb1 fb1Var = ij4Var.e;
                int i4 = fb1Var != null ? fb1Var.a : 65535;
                mc mcVar = (mc) lcVar.o;
                n05 n05VarB = ((ia1) mcVar.r).b(vk0Var, gb1Var, i2, i4);
                if (n05VarB instanceof n05) {
                    Object obj6 = n05VarB.n;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    z05 z05Var = new z05(n05VarB, mcVar.w);
                    mcVar.w = z05Var;
                    Object obj7 = z05Var.q;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new ka1(1, typeface), iIntValue, iIntValue2, 33);
                return j15.a;
        }
    }
}
