/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import defpackage.ak4;
import defpackage.kf2;
import defpackage.td;
import defpackage.yc5;
import defpackage.yd4;
import defpackage.yx0;
import defpackage.zg5;
import defpackage.zj4;
import java.util.ArrayList;

public final class sd
implements Choreographer.FrameCallback {
    public final yc5 n;

    public sd(yc5 yc52) {
        this.n = yc52;
    }

    @Override
    public final void doFrame(long l16) {
        int n16;
        Object object = (td)((zg5)this.n.n).n;
        long l17 = SystemClock.uptimeMillis();
        ArrayList arrayList = ((td)object).b;
        l16 = SystemClock.uptimeMillis();
        for (int i16 = 0; i16 < arrayList.size(); ++i16) {
            long l18;
            zj4 zj42 = (zj4)arrayList.get(i16);
            if (zj42 == null) continue;
            Object object2 = ((td)object).a;
            Object object3 = (Long)((yd4)object2).get(zj42);
            if (object3 != null) {
                if ((Long)object3 >= l16) continue;
                ((yd4)object2).remove(zj42);
            }
            if ((l18 = zj42.g) == 0L) {
                zj42.g = l17;
                zj42.a(zj42.b);
                continue;
            }
            l18 = l17 - l18;
            zj42.g = l17;
            boolean bl5 = zj42.m;
            float f16 = zj42.l;
            if (bl5) {
                if (f16 != Float.MAX_VALUE) {
                    zj42.k.i = f16;
                    zj42.l = Float.MAX_VALUE;
                }
                zj42.b = (float)zj42.k.i;
                zj42.a = 0.0f;
                zj42.m = false;
                n16 = 1;
            } else {
                float f17;
                object3 = zj42.k;
                if (f16 != Float.MAX_VALUE) {
                    double d16 = ((ak4)object3).i;
                    double d17 = zj42.b;
                    d16 = zj42.a;
                    object2 = ((ak4)object3).a(d17, d16, l18 /= 2L);
                    object3 = zj42.k;
                    ((ak4)object3).i = zj42.l;
                    zj42.l = Float.MAX_VALUE;
                    object3 = ((ak4)object3).a(((yx0)object2).a, ((yx0)object2).b, l18);
                    zj42.b = ((yx0)object3).a;
                    zj42.a = ((yx0)object3).b;
                } else {
                    object3 = ((ak4)object3).a(zj42.b, zj42.a, l18);
                    zj42.b = ((yx0)object3).a;
                    zj42.a = ((yx0)object3).b;
                }
                zj42.b = f16 = Math.max(zj42.b, -3.4028235E38f);
                zj42.b = f17 = Math.min(f16, Float.MAX_VALUE);
                f16 = zj42.a;
                object3 = zj42.k;
                object3.getClass();
                if ((double)Math.abs(f16) < ((ak4)object3).e && (double)Math.abs(f17 - (float)((ak4)object3).i) < ((ak4)object3).d) {
                    zj42.b = (float)zj42.k.i;
                    zj42.a = 0.0f;
                    n16 = 1;
                } else {
                    n16 = 0;
                }
            }
            zj42.b = f16 = Math.min(zj42.b, Float.MAX_VALUE);
            zj42.b = f16 = Math.max(f16, -3.4028235E38f);
            zj42.a(f16);
            if (n16 == 0) continue;
            object3 = zj42.i;
            zj42.f = false;
            object2 = td.f;
            if (((ThreadLocal)object2).get() == null) {
                ((ThreadLocal)object2).set(new td());
            }
            object2 = (td)((ThreadLocal)object2).get();
            ((td)object2).a.remove(zj42);
            ArrayList arrayList2 = ((td)object2).b;
            n16 = arrayList2.indexOf(zj42);
            if (n16 >= 0) {
                arrayList2.set(n16, null);
                ((td)object2).e = true;
            }
            zj42.g = 0L;
            zj42.c = false;
            for (n16 = 0; n16 < ((ArrayList)object3).size(); ++n16) {
                if (((ArrayList)object3).get(n16) == null) {
                    continue;
                }
                ((ArrayList)object3).get(n16).getClass();
                kf2.k();
                return;
            }
            for (n16 = ((ArrayList)object3).size() - 1; n16 >= 0; --n16) {
                if (((ArrayList)object3).get(n16) != null) continue;
                ((ArrayList)object3).remove(n16);
            }
        }
        if (((td)object).e) {
            for (n16 = arrayList.size() - 1; n16 >= 0; --n16) {
                if (arrayList.get(n16) != null) continue;
                arrayList.remove(n16);
            }
            ((td)object).e = false;
        }
        if (arrayList.size() > 0) {
            if (((td)object).d == null) {
                ((td)object).d = new yc5(((td)object).c);
            }
            object = ((td)object).d;
            ((Choreographer)((yc5)object).o).postFrameCallback((sd)((yc5)object).p);
        }
    }
}

