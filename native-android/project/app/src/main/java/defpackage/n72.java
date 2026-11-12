package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class n72
implements jn4 {
    public final j03 a;
    public final o72 b;
    public final Object c;

    public n72(o72 object, Object object2) {
        this.b = object;
        this.c = object2;
        object = m02.a;
        this.a = new j03();
    }

    @Override
    public final void a() {
        o72.c(this.b, this.c);
    }

    @Override
    public final void b(ea ea6) {
        Object object = (c72)this.b.w.g(this.c);
        object = object != null && (object = ((c72)object).Q) != null ? (cx2)((w12)object).g : null;
        if (object != null && ((cx2)object).A) {
            int n16;
            if (!((cx2)object).n.A) {
                cz1.b("visitSubtreeIf called on an unattached node");
            }
            f13 f132 = new f13(new cx2[16]);
            object = ((cx2)object).n;
            cx2 cx22 = ((cx2)object).s;
            if (cx22 == null) {
                j51.b(f132, (cx2)object);
            } else {
                f132.b(cx22);
            }
            block0: while ((n16 = f132.p) != 0) {
                cx2 cx23 = (cx2)f132.k(n16 - 1);
                if ((cx23.q & 0x40000) != 0) {
                    cx22 = cx23;
                    while (cx22 != null && cx22.A) {
                        if ((cx22.p & 0x40000) != 0) {
                            object = null;
                            Object object2 = cx22;
                            while (object2 != null) {
                                Object object3;
                                if (object2 instanceof rx4) {
                                    object3 = (rx4)object2;
                                    boolean bl5 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(object3.f());
                                    object2 = qx4.o;
                                    if (bl5) {
                                        ea6.invoke(object3);
                                        object3 = object2;
                                    } else {
                                        object3 = qx4.n;
                                    }
                                    if (object3 == qx4.p) break block0;
                                    if (object3 == object2) continue block0;
                                    object3 = object;
                                } else {
                                    object3 = object;
                                    if ((object2.p & 0x40000) != 0) {
                                        object3 = object;
                                        if (object2 instanceof fo0) {
                                            object3 = ((fo0)object2).C;
                                            int n17 = 0;
                                            while (object3 != null) {
                                                Object object4 = object2;
                                                Object object5 = object;
                                                n16 = n17;
                                                if ((((cx2)object3).p & 0x40000) != 0) {
                                                    n16 = n17 + 1;
                                                    if (n16 == 1) {
                                                        object4 = object3;
                                                        object5 = object;
                                                    } else {
                                                        object4 = object;
                                                        if (object == null) {
                                                            object4 = new f13(new cx2[16]);
                                                        }
                                                        object = object2;
                                                        if (object2 != null) {
                                                            ((f13)object4).b(object2);
                                                            object = null;
                                                        }
                                                        ((f13)object4).b(object3);
                                                        object5 = object4;
                                                        object4 = object;
                                                    }
                                                }
                                                object3 = ((cx2)object3).s;
                                                object2 = object4;
                                                object = object5;
                                                n17 = n16;
                                            }
                                            object3 = object;
                                            if (n17 == 1) continue;
                                        }
                                    }
                                }
                                object2 = j51.c((f13)object3);
                                object = object3;
                            }
                        }
                        cx22 = cx22.s;
                    }
                }
                j51.b(f132, cx23);
            }
        }
    }

    @Override
    public final int c() {
        c72 c722 = (c72)this.b.w.g(this.c);
        if (c722 != null) {
            return ((c13)c722.n()).n.p;
        }
        return 0;
    }

    @Override
    public final void d(int n16, long l16) {
        Object object = this.b;
        c72 c722 = (c72)((o72)object).w.g(this.c);
        if (c722 != null && c722.G()) {
            Object object2;
            int n17 = ((c13)c722.n()).n.p;
            if (n16 < 0 || n16 >= n17) {
                object2 = new StringBuilder("Index (");
                ((StringBuilder)object2).append(n16);
                ((StringBuilder)object2).append(") is out of bound of [0, ");
                ((StringBuilder)object2).append(n17);
                ((StringBuilder)object2).append(")");
                cz1.d(((StringBuilder)object2).toString());
            }
            if (c722.H()) {
                cz1.a("Pre-measure called on node that is not placed");
            }
            object2 = ((o72)object).n;
            ((c72)object2).C = true;
            object = h12.L(c722);
            c722 = (c72)((c13)c722.n()).get(n16);
            ((ra)object).r(c722, l16);
            ((c72)object2).C = false;
            this.a.a(n16);
        }
    }
}

