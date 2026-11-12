package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class uc3
implements if1 {
    public final int n;
    public final ad3 o;

    public /* synthetic */ uc3(ad3 ad32, int n16) {
        this.n = n16;
        this.o = ad32;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object invoke(Object object) {
        int n16;
        long l16;
        float f16;
        Float f17;
        Object object2;
        Object object3;
        j15 j152;
        int n17;
        block19: {
            qc3 qc32;
            block18: {
                int n18;
                n17 = this.n;
                j152 = j15.a;
                object3 = null;
                object2 = this.o;
                switch (n17) {
                    default: {
                        Object object4 = (o82)object;
                        ch4 ch42 = ya4.t();
                        object = ch42 != null ? ch42.e() : null;
                        object3 = ya4.z(ch42);
                        try {
                            n17 = ((ad3)object2).e;
                            Object object5 = ((o82)object4).b;
                            object2 = ((q82)object5).c;
                            if (object2 == null) {
                                return j152;
                            }
                            object4 = ((o82)object4).a;
                            object5 = ((q82)object5).b;
                            vp3 vp32 = new vp3((ll)object2, n17, (rm3)object5, null);
                            ((ArrayList)object4).add(vp32);
                            return j152;
                        }
                        finally {
                            ya4.H(ch42, (ch4)object3, (if1)object);
                        }
                    }
                    case 0: 
                }
                f17 = (Float)object;
                f16 = f17.floatValue();
                long l17 = e35.t((ad3)object2);
                float f18 = ((ad3)object2).i + f16;
                l16 = ji2.M(f18);
                ((ad3)object2).i = f18 - (float)l16;
                if (Math.abs(f16) < 1.0E-4f) {
                    return Float.valueOf(f16);
                }
                long l18 = l17 + l16;
                l16 = gb.n(l18, ((ad3)object2).h, ((ad3)object2).g);
                boolean bl5 = false;
                n17 = l18 != l16 ? 1 : 0;
                ((ad3)object2).j = f18 = (float)(l16 -= l17);
                l17 = Math.abs(l16);
                f16 = 0.0f;
                if (l17 != 0L) {
                    object = ((ad3)object2).E;
                    boolean bl6 = f18 > 0.0f;
                    ((zd3)object).setValue(bl6);
                    object = ((ad3)object2).F;
                    bl6 = bl5;
                    if (f18 < 0.0f) {
                        bl6 = true;
                    }
                    ((zd3)object).setValue(bl6);
                }
                if ((qc32 = ((qc3)(object = (qc3)((ad3)object2).m.getValue())).h(n18 = -(n16 = (int)l16))) == null || (object = ((ad3)object2).b) == null) break block18;
                qc3 qc33 = ((qc3)object).h(n18);
                object = object3;
                if (qc33 == null) break block19;
                ((ad3)object2).b = qc33;
            }
            object = qc32;
        }
        if (object != null) {
            ((ad3)object2).h((qc3)object, ((ad3)object2).a, true);
            ((ad3)object2).A.setValue(j152);
        } else {
            object3 = ((ad3)object2).d;
            object = (ad3)((nq)object3).o;
            object3 = (vd3)((nq)object3).q;
            if (((ad3)object).p() != 0) {
                f16 = (float)n16 / (float)((ad3)object).p();
            }
            ((vd3)object3).h(((vd3)object3).g() + f16);
            object = (c72)((ad3)object2).x.getValue();
            if (object != null) {
                ((c72)object).l();
            }
        }
        object = f17;
        if (n17 != 0) {
            object = l16;
        }
        f16 = ((Number)object).floatValue();
        return Float.valueOf(f16);
    }
}

