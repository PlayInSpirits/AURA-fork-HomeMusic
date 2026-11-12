package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class i94 {
    public final cx2 a;
    public final boolean b;
    public final c72 c;
    public final e94 d;
    public i94 e;
    public final int f;

    public i94(cx2 cx22, boolean bl5, c72 c722, e94 e942) {
        this.a = cx22;
        this.b = bl5;
        this.c = c722;
        this.d = e942;
        this.f = c722.o;
    }

    public static /* synthetic */ List j(int n16, i94 i942) {
        boolean bl5 = false;
        boolean bl6 = (n16 & 1) != 0 ? i942.b ^ true : false;
        if ((n16 & 2) == 0) {
            bl5 = true;
        }
        return i942.i(bl6, bl5);
    }

    public final wv3 a(f63 f632) {
        Object object;
        eo0 eo02;
        f63 f633;
        i94 i942;
        block18: {
            i942 = this.l();
            if (i942 == null) {
                return wv3.e;
            }
            cx2 cx22 = (cx2)i942.c.Q.g;
            int n16 = cx22.q;
            f633 = null;
            if ((n16 & 8) != 0) {
                while (cx22 != null) {
                    if ((cx22.p & 8) != 0) {
                        eo02 = cx22;
                        object = null;
                        while (eo02 != null) {
                            Object object2;
                            if (eo02 instanceof g94) {
                                object2 = object;
                                if (eo02.c()) {
                                    break block18;
                                }
                            } else {
                                object2 = object;
                                if ((((cx2)eo02).p & 8) != 0) {
                                    object2 = object;
                                    if (eo02 instanceof fo0) {
                                        object2 = ((fo0)eo02).C;
                                        int n17 = 0;
                                        while (object2 != null) {
                                            Object object3 = eo02;
                                            Object object4 = object;
                                            n16 = n17;
                                            if ((((cx2)object2).p & 8) != 0) {
                                                n16 = n17 + 1;
                                                if (n16 == 1) {
                                                    object3 = object2;
                                                    object4 = object;
                                                } else {
                                                    object3 = object;
                                                    if (object == null) {
                                                        object3 = new f13(new cx2[16]);
                                                    }
                                                    object = eo02;
                                                    if (eo02 != null) {
                                                        ((f13)object3).b(eo02);
                                                        object = null;
                                                    }
                                                    ((f13)object3).b(object2);
                                                    object4 = object3;
                                                    object3 = object;
                                                }
                                            }
                                            object2 = ((cx2)object2).s;
                                            eo02 = object3;
                                            object = object4;
                                            n17 = n16;
                                        }
                                        object2 = object;
                                        if (n17 == 1) continue;
                                    }
                                }
                            }
                            eo02 = j51.c((f13)object2);
                            object = object2;
                        }
                    }
                    if ((cx22.q & 8) == 0) break;
                    cx22 = cx22.s;
                }
            }
            eo02 = null;
        }
        eo02 = (g94)eo02;
        object = f633;
        if (eo02 != null) {
            object = j51.M(eo02, 8);
        }
        if (object == null) {
            return i942.a(f632);
        }
        return ((f63)object).C(f632, true);
    }

    public final i94 b(m24 object, if1 object2) {
        e94 e942 = new e94();
        e942.p = false;
        e942.q = false;
        object2.invoke(e942);
        object2 = new h94((if1)object2);
        int n16 = this.f;
        int n17 = object != null ? 1000000000 : 2000000000;
        object = new i94((cx2)object2, false, new c72(n16 + n17, true), e942);
        ((i94)object).e = this;
        return object;
    }

    public final void c(c72 objectArray, ArrayList arrayList) {
        Object object = objectArray.x();
        objectArray = ((f13)object).n;
        int n16 = ((f13)object).p;
        for (int i16 = 0; i16 < n16; ++i16) {
            object = (c72)objectArray[i16];
            if (!((c72)object).G() || ((c72)object).Z) continue;
            if (((c72)object).Q.d(8)) {
                arrayList.add(hw.a((c72)object, this.b));
                continue;
            }
            this.c((c72)object, arrayList);
        }
    }

    public final f63 d() {
        if (this.o()) {
            i94 i942 = this.l();
            if (i942 != null) {
                return i942.d();
            }
            return null;
        }
        g94 g942 = this.f();
        if (g942 != null) {
            return j51.M(g942, 8);
        }
        return (iz1)this.c.Q.d;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        this.r(arrayList, false);
        int n16 = arrayList.size();
        for (int i16 = arrayList.size(); i16 < n16; ++i16) {
            i94 i942 = (i94)arrayList.get(i16);
            if (i942.p()) {
                arrayList2.add(i942);
                continue;
            }
            if (i942.d.q) continue;
            i942.e(arrayList, arrayList2);
        }
    }

    public final g94 f() {
        boolean bl5 = this.d.p;
        Object object = null;
        Object object2 = this.c;
        if (bl5) {
            cx2 cx22 = (cx2)((c72)object2).Q.g;
            object2 = object;
            if ((cx22.q & 8) != 0) {
                Object object3 = null;
                while (true) {
                    object2 = object3;
                    if (cx22 != null) {
                        Object object4 = object3;
                        if ((cx22.p & 8) != 0) {
                            Object object5 = cx22;
                            object2 = null;
                            while (true) {
                                int n16;
                                Object object6;
                                object4 = object3;
                                if (object5 == null) break;
                                if (object5 instanceof g94) {
                                    object6 = (g94)object5;
                                    object4 = object3;
                                    if (object6.c()) {
                                        if (object6.d0()) {
                                            return object6;
                                        }
                                        object4 = object3;
                                        if (object3 == null) {
                                            object4 = object6;
                                        }
                                    }
                                    n16 = 0;
                                    object6 = object4;
                                } else {
                                    n16 = 1;
                                    object6 = object3;
                                }
                                object4 = object2;
                                if (n16 != 0) {
                                    object4 = object2;
                                    if ((((cx2)object5).p & 8) != 0) {
                                        object4 = object2;
                                        if (object5 instanceof fo0) {
                                            object3 = ((fo0)object5).C;
                                            n16 = 0;
                                            while (object3 != null) {
                                                object4 = object5;
                                                object = object2;
                                                int n17 = n16;
                                                if ((((cx2)object3).p & 8) != 0) {
                                                    n17 = n16 + 1;
                                                    if (n17 == 1) {
                                                        object4 = object3;
                                                        object = object2;
                                                    } else {
                                                        object4 = object2;
                                                        if (object2 == null) {
                                                            object4 = new f13(new cx2[16]);
                                                        }
                                                        object2 = object5;
                                                        if (object5 != null) {
                                                            ((f13)object4).b(object5);
                                                            object2 = null;
                                                        }
                                                        ((f13)object4).b(object3);
                                                        object = object4;
                                                        object4 = object2;
                                                    }
                                                }
                                                object3 = ((cx2)object3).s;
                                                object5 = object4;
                                                object2 = object;
                                                n16 = n17;
                                            }
                                            object4 = object2;
                                            if (n16 == 1) {
                                                object3 = object6;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                object5 = j51.c((f13)object4);
                                object3 = object6;
                                object2 = object4;
                            }
                        }
                        object2 = object4;
                        if ((cx22.q & 8) != 0) {
                            cx22 = cx22.s;
                            object3 = object4;
                            continue;
                        }
                    }
                    break;
                }
            }
        } else {
            cx2 cx23 = (cx2)((c72)object2).Q.g;
            object2 = object;
            if ((cx23.q & 8) != 0) {
                block3: while (true) {
                    object2 = object;
                    if (cx23 == null) break;
                    if ((cx23.p & 8) != 0) {
                        cx2 cx24 = cx23;
                        object2 = null;
                        while (cx24 != null) {
                            Object object7;
                            if (cx24 instanceof g94) {
                                object7 = object2;
                                if (((g94)((Object)cx24)).c()) {
                                    object2 = cx24;
                                    break block3;
                                }
                            } else {
                                object7 = object2;
                                if ((cx24.p & 8) != 0) {
                                    object7 = object2;
                                    if (cx24 instanceof fo0) {
                                        object7 = ((fo0)cx24).C;
                                        int n18 = 0;
                                        while (object7 != null) {
                                            Object object8 = cx24;
                                            Object object9 = object2;
                                            int n19 = n18;
                                            if ((((cx2)object7).p & 8) != 0) {
                                                n19 = n18 + 1;
                                                if (n19 == 1) {
                                                    object8 = object7;
                                                    object9 = object2;
                                                } else {
                                                    object8 = object2;
                                                    if (object2 == null) {
                                                        object8 = new f13(new cx2[16]);
                                                    }
                                                    object2 = cx24;
                                                    if (cx24 != null) {
                                                        ((f13)object8).b(cx24);
                                                        object2 = null;
                                                    }
                                                    ((f13)object8).b(object7);
                                                    object9 = object8;
                                                    object8 = object2;
                                                }
                                            }
                                            object7 = ((cx2)object7).s;
                                            cx24 = object8;
                                            object2 = object9;
                                            n18 = n19;
                                        }
                                        object7 = object2;
                                        if (n18 == 1) continue;
                                    }
                                }
                            }
                            cx24 = j51.c((f13)object7);
                            object2 = object7;
                        }
                    }
                    object2 = object;
                    if ((cx23.q & 8) == 0) break;
                    cx23 = cx23.s;
                }
            }
        }
        return (g94)object2;
    }

    public final wv3 g() {
        f63 f632 = this.d();
        if (f632 != null) {
            if (!f632.A0().A) {
                f632 = null;
            }
            if (f632 != null) {
                return wr1.n(f632).C(f632, true);
            }
        }
        return wv3.e;
    }

    public final wv3 h() {
        f63 f632 = this.d();
        if (f632 != null) {
            if (!f632.A0().A) {
                f632 = null;
            }
            if (f632 != null) {
                return wr1.d(f632, true);
            }
        }
        return wv3.e;
    }

    public final List i(boolean bl5, boolean bl6) {
        if (!bl5 && this.d.q) {
            return u01.n;
        }
        ArrayList arrayList = new ArrayList();
        if (this.p()) {
            ArrayList arrayList2 = new ArrayList();
            this.e(arrayList, arrayList2);
            return arrayList2;
        }
        return this.r(arrayList, bl6);
    }

    public final e94 k() {
        boolean bl5 = this.p();
        e94 e942 = this.d;
        if (bl5) {
            e942 = e942.b();
            this.q(new ArrayList(), e942);
            return e942;
        }
        return e942;
    }

    public final i94 l() {
        Object object;
        boolean bl5;
        block8: {
            Object object2 = this.e;
            if (object2 != null) {
                return object2;
            }
            c72 c722 = this.c;
            bl5 = this.b;
            if (bl5) {
                for (object2 = c722.t(); object2 != null; object2 = ((c72)object2).t()) {
                    object = ((c72)object2).v();
                    if (object == null || !((e94)object).p) {
                        continue;
                    }
                    break;
                }
            } else {
                object2 = null;
            }
            object = object2;
            if (object2 == null) {
                for (object2 = c722.t(); object2 != null; object2 = ((c72)object2).t()) {
                    if (!((c72)object2).Q.d(8)) continue;
                    object = object2;
                    break block8;
                }
                object = null;
            }
        }
        if (object == null) {
            return null;
        }
        return hw.a((c72)object, bl5);
    }

    public final wv3 m() {
        Object object;
        Object object2 = this.f();
        if (object2 == null) {
            return ((iz1)this.c.Q.d).X0();
        }
        cx2 cx22 = ((cx2)object2).n;
        object2 = d94.b;
        object2 = object = this.d.n.g(object2);
        if (object == null) {
            object2 = null;
        }
        boolean bl5 = object2 != null;
        return fu.s(cx22, bl5, true);
    }

    public final e94 n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.p;
    }

    public final void q(ArrayList arrayList, e94 e942) {
        if (!this.d.q) {
            this.r(arrayList, false);
            int n16 = arrayList.size();
            for (int i16 = arrayList.size(); i16 < n16; ++i16) {
                i94 i942 = (i94)arrayList.get(i16);
                if (i942.p()) continue;
                e942.e(i942.d);
                i942.q(arrayList, e942);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean bl5) {
        if (this.o()) {
            return u01.n;
        }
        this.c(this.c, arrayList);
        if (bl5) {
            Object object;
            e94 e942 = this.d;
            w03 w032 = e942.n;
            Object object2 = object = w032.g(n94.w);
            if (object == null) {
                object2 = null;
            }
            if ((object2 = (m24)object2) != null && e942.p && !arrayList.isEmpty()) {
                arrayList.add(this.b((m24)object2, new o54((m24)object2)));
            }
            if (w032.c(object2 = n94.a) && !arrayList.isEmpty() && e942.p) {
                object2 = object = w032.g(object2);
                if (object == null) {
                    object2 = null;
                }
                if ((object2 = (object2 = (List)object2) != null ? (String)q40.x0((List)object2) : null) != null) {
                    arrayList.add(0, this.b(null, new rs0(18, (String)object2)));
                }
            }
        }
        return arrayList;
    }
}

