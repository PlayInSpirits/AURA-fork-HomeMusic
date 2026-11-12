package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class d63
implements e63 {
    @Override
    public final boolean a(cx2 cx22) {
        cx2 cx23 = null;
        cx2 cx24 = cx22;
        cx22 = cx23;
        while (true) {
            int n16 = 0;
            if (cx24 == null) break;
            if (cx24 instanceof rn3) {
                cx23 = cx22;
                if (((rn3)((Object)cx24)).z()) {
                    return true;
                }
            } else {
                cx23 = cx22;
                if ((cx24.p & 0x10) != 0) {
                    cx23 = cx22;
                    if (cx24 instanceof fo0) {
                        cx23 = ((fo0)cx24).C;
                        while (cx23 != null) {
                            Object object = cx22;
                            int n17 = n16;
                            cx2 cx25 = cx24;
                            if ((cx23.p & 0x10) != 0) {
                                n17 = n16 + 1;
                                if (n17 == 1) {
                                    cx25 = cx23;
                                    object = cx22;
                                } else {
                                    object = cx22;
                                    if (cx22 == null) {
                                        object = new f13(new cx2[16]);
                                    }
                                    cx25 = cx24;
                                    if (cx24 != null) {
                                        ((f13)object).b(cx24);
                                        cx25 = null;
                                    }
                                    ((f13)object).b(cx23);
                                }
                            }
                            cx23 = cx23.s;
                            cx22 = object;
                            n16 = n17;
                            cx24 = cx25;
                        }
                        cx23 = cx22;
                        if (n16 == 1) continue;
                    }
                }
            }
            cx24 = j51.c((f13)((Object)cx23));
            cx22 = cx23;
        }
        return false;
    }

    @Override
    public final int d() {
        return 16;
    }

    @Override
    public final void i(c72 c722, long l16, fm1 fm12, int n16, boolean bl5) {
        c722.z(l16, fm12, n16, bl5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean k(fm1 fm12, c72 object) {
        object = (f63)((c72)object).Q.e;
        object.getClass();
        object = ((f63)object).D0(g63.f(16));
        if (object == null || !((cx2)object).A) return false;
        if (!((cx2)object).n.A) {
            cz1.b("visitLocalDescendants called on an unattached node");
        }
        cx2 cx22 = ((cx2)object).n;
        if ((cx22.q & 0x10) == 0) return false;
        while (cx22 != null) {
            if ((cx22.p & 0x10) != 0) {
                cx2 cx23 = cx22;
                object = null;
                while (cx23 != null) {
                    Object object2;
                    if (cx23 instanceof rn3) {
                        object2 = object;
                        if (((rn3)((Object)cx23)).X()) {
                            fm12.p = fm12.n.b - 1;
                            return true;
                        }
                    } else {
                        object2 = object;
                        if ((cx23.p & 0x10) != 0) {
                            object2 = object;
                            if (cx23 instanceof fo0) {
                                object2 = ((fo0)cx23).C;
                                int n16 = 0;
                                while (object2 != null) {
                                    Object object3 = cx23;
                                    Object object4 = object;
                                    int n17 = n16;
                                    if ((((cx2)object2).p & 0x10) != 0) {
                                        n17 = n16 + 1;
                                        if (n17 == 1) {
                                            object3 = object2;
                                            object4 = object;
                                        } else {
                                            object3 = object;
                                            if (object == null) {
                                                object3 = new f13(new cx2[16]);
                                            }
                                            object = cx23;
                                            if (cx23 != null) {
                                                ((f13)object3).b(cx23);
                                                object = null;
                                            }
                                            ((f13)object3).b(object2);
                                            object4 = object3;
                                            object3 = object;
                                        }
                                    }
                                    object2 = ((cx2)object2).s;
                                    cx23 = object3;
                                    object = object4;
                                    n16 = n17;
                                }
                                object2 = object;
                                if (n16 == 1) continue;
                            }
                        }
                    }
                    cx23 = j51.c((f13)object2);
                    object = object2;
                }
            }
            cx22 = cx22.s;
        }
        return false;
    }

    @Override
    public final boolean m(c72 c722) {
        return true;
    }
}

