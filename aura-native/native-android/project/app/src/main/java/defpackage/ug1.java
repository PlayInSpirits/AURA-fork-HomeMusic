package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class ug1
implements gf1 {
    public final vg1 n;

    public ug1(vg1 vg12) {
        this.n = vg12;
    }

    @Override
    public final Object invoke() {
        ArrayList arrayList = this.n.a;
        w03 w032 = new w03(arrayList.size());
        int n16 = arrayList.size();
        for (int i16 = 0; i16 < n16; ++i16) {
            i42 i422 = (i42)arrayList.get(i16);
            Object object = i422.b;
            int n17 = i422.a;
            Object object2 = object != null ? new b32(n17, i422.b) : Integer.valueOf(n17);
            int n18 = w032.f(object2);
            n17 = n18 < 0 ? 1 : 0;
            if ((object = n17 != 0 ? null : w032.c[n18]) == null) {
                object = i422;
            } else if (object instanceof q03) {
                object = (q03)object;
                ((q03)object).a(i422);
            } else {
                Object object3 = t73.a;
                object3 = new q03(2);
                ((q03)object3).a(object);
                ((q03)object3).a(i422);
                object = object3;
            }
            if (n17 != 0) {
                n17 = ~n18;
                w032.b[n17] = object2;
                w032.c[n17] = object;
                continue;
            }
            w032.c[n18] = object;
        }
        return new mz2(w032);
    }
}

