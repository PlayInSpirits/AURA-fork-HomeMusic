package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class a63
extends i63 {
    public final cx2 c;
    public final te2 d;
    public final xe2 e;
    public f63 f;
    public kn3 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public a63(cx2 object) {
        this.c = object;
        object = new te2();
        ((te2)object).c = new long[2];
        this.d = object;
        this.e = new xe2(2);
        this.i = true;
        this.j = true;
    }

    @Override
    public final boolean a(xe2 object, q62 object2, gp3 object3, boolean bl5) {
        boolean bl6;
        block41: {
            boolean bl7;
            long l16;
            long l17;
            int n16;
            int n17;
            Object object4;
            Object object5;
            boolean bl8;
            boolean bl9;
            block40: {
                int n18;
                int n19;
                Object object6;
                Object object7;
                Object object8;
                block43: {
                    block42: {
                        bl9 = super.a((xe2)object, (q62)object2, (gp3)object3, bl5);
                        object8 = this.c;
                        bl8 = ((cx2)object8).A;
                        bl6 = true;
                        if (!bl8) break block42;
                        object5 = null;
                        while (object8 != null) {
                            if (object8 instanceof rn3) {
                                this.f = j51.M((rn3)object8, 16);
                                object4 = object5;
                            } else {
                                object4 = object5;
                                if ((((cx2)object8).p & 0x10) != 0) {
                                    object4 = object5;
                                    if (object8 instanceof fo0) {
                                        object4 = ((fo0)object8).C;
                                        n17 = 0;
                                        while (object4 != null) {
                                            object7 = object8;
                                            object6 = object5;
                                            n16 = n17;
                                            if ((((cx2)object4).p & 0x10) != 0) {
                                                n16 = n17 + 1;
                                                if (n16 == 1) {
                                                    object7 = object4;
                                                    object6 = object5;
                                                } else {
                                                    object7 = object5;
                                                    if (object5 == null) {
                                                        object7 = new f13(new cx2[16]);
                                                    }
                                                    object5 = object8;
                                                    if (object8 != null) {
                                                        ((f13)object7).b(object8);
                                                        object5 = null;
                                                    }
                                                    ((f13)object7).b(object4);
                                                    object6 = object7;
                                                    object7 = object5;
                                                }
                                            }
                                            object4 = ((cx2)object4).s;
                                            object8 = object7;
                                            object5 = object6;
                                            n17 = n16;
                                        }
                                        object4 = object5;
                                        if (n17 == 1) continue;
                                    }
                                }
                            }
                            object8 = j51.c(object4);
                            object5 = object4;
                        }
                        if (this.f != null) break block43;
                    }
                    return true;
                }
                n17 = ((xe2)object).h();
                n16 = 0;
                while (true) {
                    object8 = this.d;
                    object4 = this.e;
                    if (n16 >= n17) break;
                    l17 = ((xe2)object).e(n16);
                    object5 = (on3)((xe2)object).i(n16);
                    if (((te2)object8).c(l17)) {
                        long l18 = ((on3)object5).g;
                        l16 = ((on3)object5).c;
                        if (((l18 & 0x7FFFFFFF7FFFFFFFL) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) == 0L && ((l16 & 0x7FFFFFFF7FFFFFFFL) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) == 0L) {
                            long l19;
                            long l26;
                            object7 = new ArrayList<bm1>(((on3)object5).b().size());
                            object8 = ((on3)object5).b();
                            n19 = object8.size();
                            for (n18 = 0; n18 < n19; ++n18) {
                                object6 = (bm1)object8.get(n18);
                                l26 = ((bm1)object6).b;
                                if (((l26 & 0x7FFFFFFF7FFFFFFFL) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) != 0L) continue;
                                l19 = ((bm1)object6).a;
                                f63 f632 = this.f;
                                f632.getClass();
                                ((ArrayList)object7).add(new bm1(l19, f632.A((q62)object2, l26), ((bm1)object6).c, ((bm1)object6).d, ((bm1)object6).e));
                            }
                            object8 = this.f;
                            object8.getClass();
                            l18 = ((f63)object8).A((q62)object2, l18);
                            object8 = this.f;
                            object8.getClass();
                            l26 = ((f63)object8).A((q62)object2, l16);
                            l16 = ((on3)object5).a;
                            long l27 = ((on3)object5).b;
                            bl8 = ((on3)object5).d;
                            long l28 = ((on3)object5).f;
                            bl7 = ((on3)object5).h;
                            n19 = ((on3)object5).i;
                            l19 = ((on3)object5).j;
                            object6 = new on3(l16, l27, l26, bl8, ((on3)object5).e, l28, l18, bl7, n19, (ArrayList)object7, l19, ((on3)object5).k, ((on3)object5).l, ((on3)object5).n);
                            object8 = object7 = ((on3)object5).q;
                            if (object7 == null) {
                                object8 = object5;
                            }
                            ((on3)object6).q = object8;
                            object8 = ((on3)object5).q;
                            if (object8 != null) {
                                object5 = object8;
                            }
                            ((on3)object6).q = object5;
                            ((xe2)object4).f(l17, object6);
                        }
                    }
                    ++n16;
                }
                if (((xe2)object4).d()) {
                    ((te2)object8).b = 0;
                    this.a.g();
                    return bl6;
                }
                for (n17 = ((te2)object8).b - 1; -1 < n17; --n17) {
                    if (((xe2)object).c(((te2)object8).c[n17]) >= 0 || n17 >= (n18 = ((te2)object8).b)) continue;
                    n16 = n17;
                    while (n16 < n18 - 1) {
                        object2 = ((te2)object8).c;
                        n19 = n16 + 1;
                        object2[n16] = object2[n19];
                        n16 = n19;
                    }
                    --((te2)object8).b;
                }
                object5 = new ArrayList(((xe2)object4).h());
                n16 = ((xe2)object4).h();
                for (n17 = 0; n17 < n16; ++n17) {
                    ((ArrayList)object5).add(((xe2)object4).i(n17));
                }
                object2 = new kn3((List)object5, (gp3)object3);
                n16 = ((ArrayList)object5).size();
                for (n17 = 0; n17 < n16; ++n17) {
                    object = ((ArrayList)object5).get(n17);
                    if (!((gp3)object3).c(((on3)object).a)) {
                        continue;
                    }
                    break block40;
                }
                object = null;
            }
            object3 = (on3)object;
            if (object3 != null) {
                boolean bl10 = ((on3)object3).d;
                if (!bl5) {
                    this.i = false;
                } else if (!this.i && (bl10 || ((on3)object3).h)) {
                    object = this.f;
                    object.getClass();
                    l16 = ((jg3)object).p;
                    l17 = ((on3)object3).c;
                    float f16 = Float.intBitsToFloat((int)(l17 >> 32));
                    float f17 = Float.intBitsToFloat((int)(l17 & 0xFFFFFFFFL));
                    n16 = (int)(l16 >> 32);
                    n17 = (int)(l16 & 0xFFFFFFFFL);
                    bl5 = f16 < 0.0f ? bl6 : false;
                    bl8 = f16 > (float)n16 ? bl6 : false;
                    bl7 = f17 < 0.0f ? bl6 : false;
                    boolean bl11 = f17 > (float)n17 ? bl6 : false;
                    this.i = (bl11 | (bl8 | bl5 | bl7)) ^ true;
                }
                bl8 = this.i;
                bl5 = this.h;
                n17 = 5;
                if (bl8 != bl5 && ((n16 = ((kn3)object2).c) == 3 || n16 == 4 || n16 == 5)) {
                    if (bl8) {
                        n17 = 4;
                    }
                    ((kn3)object2).c = n17;
                } else {
                    n17 = ((kn3)object2).c;
                    if (n17 == 4 && bl5 && !this.j) {
                        ((kn3)object2).c = 3;
                    } else if (n17 == 5 && bl8 && bl10) {
                        ((kn3)object2).c = 3;
                    }
                }
            }
            if (!bl9 && ((kn3)object2).c == 3 && (object = this.g) != null && (n17 = (object5 = ((kn3)object).a).size()) == (object = ((kn3)object2).a).size()) {
                n16 = object.size();
                for (n17 = 0; n17 < n16; ++n17) {
                    object3 = (on3)object5.get(n17);
                    object4 = (on3)object.get(n17);
                    if (g83.b(((on3)object3).c, ((on3)object4).c)) {
                        continue;
                    }
                    break block41;
                }
                bl6 = false;
            }
        }
        this.g = object2;
        return bl6;
    }

    @Override
    public final void b(gp3 gp32) {
        super.b(gp32);
        kn3 kn32 = this.g;
        if (kn32 == null) {
            return;
        }
        this.h = this.i;
        List list = kn32.a;
        int n16 = list.size();
        boolean bl5 = false;
        for (int i16 = 0; i16 < n16; ++i16) {
            on3 on32 = (on3)list.get(i16);
            boolean bl6 = on32.d;
            long l16 = on32.a;
            boolean bl7 = gp32.c(l16);
            boolean bl8 = this.i;
            if ((bl6 || bl7) && (bl6 || bl8)) continue;
            this.d.e(l16);
        }
        this.i = false;
        if (kn32.c == 5) {
            bl5 = true;
        }
        this.j = bl5;
    }

    public final void c() {
        int n16;
        Object object = this.a;
        Object object2 = ((f13)object).n;
        int n17 = ((f13)object).p;
        for (n16 = 0; n16 < n17; ++n16) {
            ((a63)object2[n16]).c();
        }
        Object object3 = this.c;
        object = null;
        while (object3 != null) {
            if (object3 instanceof rn3) {
                ((rn3)object3).t();
                object2 = object;
            } else {
                object2 = object;
                if ((object3.p & 0x10) != 0) {
                    object2 = object;
                    if (object3 instanceof fo0) {
                        object2 = ((fo0)object3).C;
                        n17 = 0;
                        while (object2 != null) {
                            Object object4 = object;
                            n16 = n17;
                            Object object5 = object3;
                            if ((object2.p & 0x10) != 0) {
                                n16 = n17 + 1;
                                if (n16 == 1) {
                                    object5 = object2;
                                    object4 = object;
                                } else {
                                    object4 = object;
                                    if (object == null) {
                                        object4 = new f13(new cx2[16]);
                                    }
                                    object5 = object3;
                                    if (object3 != null) {
                                        object4.b(object3);
                                        object5 = null;
                                    }
                                    object4.b(object2);
                                }
                            }
                            object2 = object2.s;
                            object = object4;
                            n17 = n16;
                            object3 = object5;
                        }
                        object2 = object;
                        if (n17 == 1) continue;
                    }
                }
            }
            object3 = j51.c((f13)object2);
            object = object2;
        }
    }

    public final boolean d(gp3 gp32) {
        xe2 xe22 = this.e;
        boolean bl5 = xe22.d();
        boolean bl6 = false;
        int n16 = 0;
        if (bl5) {
            bl5 = bl6;
        } else {
            Object object = this.c;
            if (!((cx2)object).A) {
                bl5 = bl6;
            } else {
                Object object2 = ((cx2)object).u;
                bl5 = object2 != null && (object2 = object2.H) != null ? object2.H() : false;
                if (!bl5) {
                    bl5 = bl6;
                } else {
                    int n17;
                    int n18;
                    Object object3;
                    kn3 kn32 = this.g;
                    kn32.getClass();
                    object2 = this.f;
                    object2.getClass();
                    long l16 = object2.p;
                    Object object4 = object;
                    object2 = null;
                    while (object4 != null) {
                        if (object4 instanceof rn3) {
                            ((rn3)object4).n(kn32, ln3.p, l16);
                            object3 = object2;
                        } else {
                            object3 = object2;
                            if ((((cx2)object4).p & 0x10) != 0) {
                                object3 = object2;
                                if (object4 instanceof fo0) {
                                    object3 = ((fo0)object4).C;
                                    n18 = 0;
                                    while (object3 != null) {
                                        Object object5 = object4;
                                        Object object6 = object2;
                                        n17 = n18;
                                        if ((((cx2)object3).p & 0x10) != 0) {
                                            n17 = n18 + 1;
                                            if (n17 == 1) {
                                                object5 = object3;
                                                object6 = object2;
                                            } else {
                                                object5 = object2;
                                                if (object2 == null) {
                                                    object5 = new f13(new cx2[16]);
                                                }
                                                object2 = object4;
                                                if (object4 != null) {
                                                    object5.b(object4);
                                                    object2 = null;
                                                }
                                                object5.b(object3);
                                                object6 = object5;
                                                object5 = object2;
                                            }
                                        }
                                        object3 = ((cx2)object3).s;
                                        object4 = object5;
                                        object2 = object6;
                                        n18 = n17;
                                    }
                                    object3 = object2;
                                    if (n18 == 1) continue;
                                }
                            }
                        }
                        object4 = j51.c((f13)object3);
                        object2 = object3;
                    }
                    if (((cx2)object).A) {
                        object2 = this.a;
                        object3 = object2.n;
                        n18 = object2.p;
                        for (n17 = n16; n17 < n18; ++n17) {
                            ((a63)object3[n17]).d(gp32);
                        }
                    }
                    bl5 = true;
                }
            }
        }
        this.b(gp32);
        xe22.a();
        this.f = null;
        return bl5;
    }

    public final boolean e(gp3 object, boolean bl5) {
        int n16;
        Object object2;
        int n17;
        Object object3;
        Object object4;
        cx2 cx22;
        block29: {
            block28: {
                boolean bl6;
                if (this.e.d()) break block28;
                cx22 = this.c;
                if (cx22.A && (bl6 = (object4 = cx22.u) != null && (object4 = ((f63)object4).H) != null ? ((c72)object4).H() : false)) break block29;
            }
            return false;
        }
        kn3 kn32 = this.g;
        kn32.getClass();
        object4 = this.f;
        object4.getClass();
        long l16 = ((jg3)object4).p;
        Object object5 = cx22;
        object4 = null;
        while (object5 != null) {
            if (object5 instanceof rn3) {
                ((rn3)object5).n(kn32, ln3.n, l16);
                object3 = object4;
            } else {
                object3 = object4;
                if ((((cx2)object5).p & 0x10) != 0) {
                    object3 = object4;
                    if (object5 instanceof fo0) {
                        object3 = ((fo0)object5).C;
                        n17 = 0;
                        while (object3 != null) {
                            object2 = object5;
                            Object object6 = object4;
                            n16 = n17;
                            if ((((cx2)object3).p & 0x10) != 0) {
                                n16 = n17 + 1;
                                if (n16 == 1) {
                                    object2 = object3;
                                    object6 = object4;
                                } else {
                                    object2 = object4;
                                    if (object4 == null) {
                                        object2 = new f13(new cx2[16]);
                                    }
                                    object4 = object5;
                                    if (object5 != null) {
                                        ((f13)object2).b(object5);
                                        object4 = null;
                                    }
                                    ((f13)object2).b(object3);
                                    object6 = object2;
                                    object2 = object4;
                                }
                            }
                            object3 = ((cx2)object3).s;
                            object5 = object2;
                            object4 = object6;
                            n17 = n16;
                        }
                        object3 = object4;
                        if (n17 == 1) continue;
                    }
                }
            }
            object5 = j51.c((f13)object3);
            object4 = object3;
        }
        if (cx22.A) {
            object3 = this.a;
            object4 = ((f13)object3).n;
            n16 = ((f13)object3).p;
            for (n17 = 0; n17 < n16; ++n17) {
                object3 = (a63)object4[n17];
                this.f.getClass();
                ((a63)object3).e((gp3)object, bl5);
            }
        }
        if (cx22.A) {
            object = null;
            object3 = cx22;
            while (object3 != null) {
                if (object3 instanceof rn3) {
                    ((rn3)object3).n(kn32, ln3.o, l16);
                    object4 = object;
                } else {
                    object4 = object;
                    if ((((cx2)object3).p & 0x10) != 0) {
                        object4 = object;
                        if (object3 instanceof fo0) {
                            object4 = ((fo0)object3).C;
                            n17 = 0;
                            while (object4 != null) {
                                object5 = object3;
                                object2 = object;
                                n16 = n17;
                                if ((((cx2)object4).p & 0x10) != 0) {
                                    n16 = n17 + 1;
                                    if (n16 == 1) {
                                        object5 = object4;
                                        object2 = object;
                                    } else {
                                        object5 = object;
                                        if (object == null) {
                                            object5 = new f13(new cx2[16]);
                                        }
                                        object = object3;
                                        if (object3 != null) {
                                            ((f13)object5).b(object3);
                                            object = null;
                                        }
                                        ((f13)object5).b(object4);
                                        object2 = object5;
                                        object5 = object;
                                    }
                                }
                                object4 = ((cx2)object4).s;
                                object3 = object5;
                                object = object2;
                                n17 = n16;
                            }
                            object4 = object;
                            if (n17 == 1) continue;
                        }
                    }
                }
                object3 = j51.c((f13)object4);
                object = object4;
            }
        }
        return true;
    }

    public final void f(long l16, q03 q032) {
        Object[] objectArray = this.d;
        if (objectArray.c(l16) && q032.g(this) < 0) {
            objectArray.e(l16);
            this.e.g(l16);
        }
        f13 f132 = this.a;
        objectArray = f132.n;
        int n16 = f132.p;
        for (int i16 = 0; i16 < n16; ++i16) {
            ((a63)objectArray[i16]).f(l16, q032);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Node(modifierNode=");
        stringBuilder.append(this.c);
        stringBuilder.append(", children=");
        stringBuilder.append(this.a);
        stringBuilder.append(", pointerIds=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

