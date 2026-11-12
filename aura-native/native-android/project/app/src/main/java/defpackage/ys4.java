package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import java.util.HashMap;
import java.util.Map;

public final class ys4
extends cx2
implements u62,
rv0,
g94 {
    public String B;
    public zs4 C;
    public ha1 D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public HashMap I;
    public rd3 J;
    public ws4 K;
    public xs4 L;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void S(e72 object) {
        Throwable throwable2;
        boolean bl5;
        jz jz5;
        block15: {
            Object object2;
            ij4 ij42;
            ij4 ij43;
            long l16;
            ic ic6;
            Object object3;
            Object object4;
            block14: {
                block17: {
                    block16: {
                        if (!this.A) {
                            return;
                        }
                        object4 = this.L;
                        if (object4 == null) break block16;
                        if (!((xs4)object4).c) {
                            object4 = null;
                        }
                        if (object4 == null) break block16;
                        object4 = object3 = ((xs4)object4).d;
                        if (object3 != null) break block17;
                    }
                    object4 = this.q0();
                }
                if ((ic6 = ((rd3)object4).j) == null) {
                    object = this.J;
                    object3 = this.L;
                    object4 = new StringBuilder("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=");
                    ((StringBuilder)object4).append(object);
                    ((StringBuilder)object4).append(", textSubstitution=");
                    ((StringBuilder)object4).append(object3);
                    ((StringBuilder)object4).append(")");
                    fz1.b(((StringBuilder)object4).toString());
                    er1.a();
                    return;
                }
                jz5 = ((e72)object).n.o.g();
                bl5 = ((rd3)object4).k;
                if (bl5) {
                    l16 = ((rd3)object4).l;
                    float f16 = (int)(l16 >> 32);
                    float f17 = (int)(l16 & 0xFFFFFFFFL);
                    jz5.e();
                    jz5.m(0.0f, 0.0f, f16, f17);
                }
                try {
                    object = this.C;
                    ij43 = ((zs4)object).a;
                    ij42 = ((zs4)object).a;
                    object = object4 = ij43.m;
                    if (object4 != null) break block14;
                    object = sr4.b;
                }
                catch (Throwable throwable2) {
                    break block15;
                }
            }
            object4 = object3 = ij43.n;
            if (object3 == null) {
                object4 = xb4.d;
            }
            object3 = object2 = ij43.o;
            if (object2 == null) {
                object3 = c71.d;
            }
            if ((object2 = ij43.a.f()) != null) {
                ic6.e(jz5, (uo)object2, ij42.a.b(), (xb4)object4, (sr4)object, (q05)object3);
            } else {
                l16 = x40.g;
                if (l16 == 16L) {
                    l16 = ij42.a.c() != 16L ? ij42.a.c() : x40.b;
                }
                ic6.d(jz5, l16, (xb4)object4, (sr4)object, (q05)object3);
            }
            if (!bl5) return;
            jz5.k();
            return;
        }
        if (!bl5) throw throwable2;
        jz5.k();
        throw throwable2;
    }

    @Override
    public final void c0(q94 q942) {
        Object object;
        c42[] c42Array = object = this.K;
        if (object == null) {
            this.K = c42Array = new ws4(this, 0);
        }
        Object object2 = new he(this.B);
        object = o94.a;
        q942.a(n94.z, gb.O(object2));
        object2 = this.L;
        if (object2 != null) {
            boolean bl5 = ((xs4)object2).c;
            Object object3 = n94.B;
            object = o94.a;
            c42 c422 = object[17];
            object3.getClass();
            q942.a((p94)object3, bl5);
            object3 = new he(((xs4)object2).b);
            object2 = n94.A;
            object = object[16];
            object2.getClass();
            q942.a((p94)object2, object3);
        }
        object = new ws4(this, 1);
        q942.a(d94.l, new w2(null, (sf1)object));
        object = new ws4(this, 2);
        q942.a(d94.m, new w2(null, (sf1)object));
        object = new wc(29, this);
        q942.a(d94.n, new w2(null, (sf1)object));
        q942.a(d94.a, new w2(null, (sf1)c42Array));
    }

    @Override
    public final boolean f0() {
        return false;
    }

    public final rd3 q0() {
        Object object = this.C;
        if (this.J == null) {
            this.J = new rd3(this.B, (zs4)object, this.D, this.E, this.F, this.G, this.H);
        }
        object = this.J;
        object.getClass();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final vi2 r(cf2 object, pi2 object2, long l16) {
        Object object3;
        Object object4;
        block10: {
            block12: {
                block11: {
                    Trace.beginSection((String)"TextStringSimpleNode::measure");
                    object4 = this.L;
                    if (object4 == null) break block11;
                    if (!((xs4)object4).c) {
                        object4 = null;
                    }
                    if (object4 == null) break block11;
                    object4 = object3 = ((xs4)object4).d;
                    if (object3 != null) break block12;
                }
                object4 = this.q0();
            }
            ((rd3)object4).c((oo0)object);
            boolean bl5 = ((rd3)object4).a(l16, object.getLayoutDirection());
            object3 = ((rd3)object4).n;
            if (object3 != null) {
                object3.a();
            }
            object3 = ((rd3)object4).j;
            object3.getClass();
            ks4 ks42 = ((ic)object3).d;
            l16 = ((rd3)object4).l;
            if (!bl5) break block10;
            j51.M(this, 2).I0();
            object4 = object3 = this.I;
            if (object3 == null) {
                object4 = new HashMap(2);
                this.I = object4;
            }
            object4.put(j9.a, Math.round(ks42.c(0) + 0.0f));
            object4.put(j9.b, Math.round(ks42.c(ks42.f - 1) + 0.0f));
        }
        int n16 = (int)(l16 >> 32);
        int n17 = (int)(0xFFFFFFFFL & l16);
        try {
            object2 = object2.r(zz1.m(n16, n16, n17, n17));
            object3 = this.I;
            object3.getClass();
            object4 = new la((jg3)object2, 6);
            object = ((cf2)object).T(n16, n17, (Map)object3, null, (if1)object4);
            return object;
        }
        finally {
            Trace.endSection();
        }
    }
}

