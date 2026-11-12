package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class d60
implements wf1 {
    public final int n;

    public /* synthetic */ d60(int n16) {
        this.n = 15;
    }

    public /* synthetic */ d60(int n16, byte by) {
        this.n = n16;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        int n16 = this.n;
        Object object3 = null;
        Object object4 = null;
        boolean bl5 = false;
        boolean bl6 = false;
        Object object5 = j15.a;
        switch (n16) {
            default: {
                object = (t44)object;
                return ((ur4)object2).a;
            }
            case 28: {
                object = (t44)object;
                return ((mr4)object2).a;
            }
            case 27: {
                object = (t44)object;
                object2 = (xb4)object2;
                return gb.d(s54.a(new x40(object2.a), s54.p, (t44)object), s54.a(new g83(object2.b), s54.x, (t44)object), Float.valueOf(object2.c));
            }
            case 26: {
                object = (t44)object;
                object = (ss4)object2;
                return gb.d((int)(((ss4)object).a >> 32), (int)(((ss4)object).a & 0xFFFFFFFFL));
            }
            case 25: {
                int n17;
                object = (t44)object;
                object4 = (List)object2;
                object2 = new ArrayList(object4.size());
                n16 = object4.size();
                for (n17 = 0; n17 < n16; ++n17) {
                    object2.add(s54.a((ge)object4.get(n17), s54.b, (t44)object));
                }
                return object2;
            }
            case 24: {
                object = (t44)object;
                return Float.valueOf(((hr)object2).a);
            }
            case 23: {
                object = (t44)object;
                object2 = (hb2)object2;
                return gb.d(object2.a, s54.a(object2.b, s54.i, (t44)object));
            }
            case 22: {
                object = (t44)object;
                return ((gb1)object2).n;
            }
            case 21: {
                object = (t44)object;
                object3 = object2;
                object2 = new bt4(((cs4)object3).a);
                object4 = s54.v;
                return gb.d(s54.a(object2, (m54)object4, (t44)object), s54.a(new bt4(((cs4)object3).b), (m54)object4, (t44)object));
            }
            case 20: {
                object = (t44)object;
                object = (bs4)object2;
                return gb.d(Float.valueOf(((bs4)object).a), Float.valueOf(((bs4)object).b));
            }
            case 19: {
                object = (t44)object;
                return ((sr4)object2).a;
            }
            case 18: {
                object = (t44)object;
                object2 = (he)object2;
                return gb.d(object2.o, s54.a(object2.n, s54.a, (t44)object));
            }
            case 17: {
                int n17;
                object = (t44)object;
                object2 = (w44)object2;
                object = object2.n;
                Object object6 = object2.o;
                object3 = ((w03)object6).b;
                object2 = ((w03)object6).c;
                long[] lArray = ((w03)object6).a;
                int n18 = lArray.length - 2;
                if (n18 >= 0) {
                    n17 = 0;
                    while (true) {
                        long l16;
                        if ((((l16 = lArray[n17]) ^ 0xFFFFFFFFFFFFFFFFL) << 7 & l16 & 0x8080808080808080L) != -9187201950435737472L) {
                            int n19 = 8 - (~(n17 - n18) >>> 31);
                            for (n16 = 0; n16 < n19; ++n16) {
                                if ((0xFFL & l16) < 128L) {
                                    int n26 = (n17 << 3) + n16;
                                    object6 = object3[n26];
                                    object5 = ((x44)object2[n26]).c();
                                    if (object5.isEmpty()) {
                                        object.remove(object6);
                                    } else {
                                        object.put(object6, object5);
                                    }
                                }
                                l16 >>= 8;
                            }
                            if (n19 != 8) break;
                        }
                        if (n17 == n18) break;
                        ++n17;
                    }
                }
                if (object.isEmpty()) {
                    object = object4;
                }
                return object;
            }
            case 16: {
                int n17 = (Integer)object;
                object = (le0)object2;
                return n17 + 1;
            }
            case 15: {
                object = (rg1)object;
                ((Integer)object2).getClass();
                e35.d(xl.O(1), (rg1)object);
                return object5;
            }
            case 14: {
                object = (t44)object;
                object = ((z82)object2).c();
                if (object.isEmpty()) {
                    object = object3;
                }
                return object;
            }
            case 13: {
                object = (t44)object;
                object = (lm0)object2;
                return gb.P(((ad3)object).k(), Float.valueOf(gb.l(((ad3)object).l(), -0.5f, 0.5f)), ((lm0)object).n());
            }
            case 12: {
                return ((ne0)object).J((le0)object2);
            }
            case 11: {
                return ((ne0)object).J((le0)object2);
            }
            case 10: {
                object = (Boolean)object;
                ((Boolean)object).booleanValue();
                object2 = (le0)object2;
                return object;
            }
            case 9: {
                object4 = (ne0)object;
                object = (le0)object2;
                object4.getClass();
                object.getClass();
                object3 = object4.u(object.getKey());
                object4 = q01.n;
                if (object3 != object4) {
                    fz0 fz02 = fz0.R;
                    object2 = (pe0)object3.K(fz02);
                    object = object2 == null ? new e60((le0)object, (ne0)object3) : ((object3 = object3.u(fz02)) == object4 ? new e60((le0)object2, (ne0)object) : new e60((le0)object2, new e60((le0)object, (ne0)object3)));
                }
                return object;
            }
            case 8: {
                return ((dx2)object).c((bx2)object2);
            }
            case 7: {
                object = (e80)object;
                ((Integer)object2).getClass();
                ((c72)object).getClass();
                return object5;
            }
            case 6: {
                object = (e80)object;
                object2 = (ui2)object2;
                object = (c72)object;
                if (!h12.c(((c72)object).I, object2)) {
                    ((c72)object).I = object2;
                    ((c72)object).D();
                }
                return object5;
            }
            case 5: {
                int n17;
                object4 = (e80)object;
                object = (c90)object2;
                object4 = (c72)object4;
                ((c72)object4).M = object;
                object2 = ((c72)object4).Q;
                Object object7 = g90.h;
                object3 = (mf3)object;
                object3.getClass();
                ((c72)object4).a0((oo0)vr1.C((mf3)object3, (qr3)object7));
                object7 = g90.n;
                object3 = (mf3)object;
                object = (r62)((Object)vr1.C((mf3)object3, (qr3)object7));
                if (((c72)object4).K != object) {
                    ((c72)object4).K = object;
                    ((c72)object4).D();
                    object = ((c72)object4).t();
                    if (object != null) {
                        ((c72)object).B();
                    } else {
                        object = ((c72)object4).A;
                        if (object != null) {
                            ((ra)object).invalidate();
                        }
                    }
                    ((c72)object4).C();
                    object = (cx2)object2.g;
                    while (object != null) {
                        object.C();
                        object = ((cx2)object).s;
                    }
                }
                ((c72)object4).e0((m65)vr1.C((mf3)object3, g90.t));
                object2 = (cx2)object2.g;
                if ((object2.q & 0x8000) != 0) {
                    while (object2 != null) {
                        if ((object2.p & 0x8000) != 0) {
                            object3 = object2;
                            object = null;
                            while (object3 != null) {
                                if (object3 instanceof a90) {
                                    object4 = ((cx2)((Object)((a90)object3))).n;
                                    if (((cx2)object4).A) {
                                        g63.c((cx2)object4);
                                        object4 = object;
                                    } else {
                                        ((cx2)object4).w = true;
                                        object4 = object;
                                    }
                                } else {
                                    object4 = object;
                                    if ((((cx2)object3).p & 0x8000) != 0) {
                                        object4 = object;
                                        if (object3 instanceof fo0) {
                                            object4 = ((fo0)object3).C;
                                            n17 = 0;
                                            while (object4 != null) {
                                                object7 = object3;
                                                Object object8 = object;
                                                n16 = n17;
                                                if ((((cx2)object4).p & 0x8000) != 0) {
                                                    n16 = n17 + 1;
                                                    if (n16 == 1) {
                                                        object7 = object4;
                                                        object8 = object;
                                                    } else {
                                                        object7 = object;
                                                        if (object == null) {
                                                            object7 = new f13(new cx2[16]);
                                                        }
                                                        object = object3;
                                                        if (object3 != null) {
                                                            ((f13)object7).b(object3);
                                                            object = null;
                                                        }
                                                        ((f13)object7).b(object4);
                                                        object8 = object7;
                                                        object7 = object;
                                                    }
                                                }
                                                object4 = ((cx2)object4).s;
                                                object3 = object7;
                                                object = object8;
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
                        if ((object2.q & 0x8000) == 0) break;
                        object2 = object2.s;
                    }
                }
                return object5;
            }
            case 4: {
                object = (e80)object;
                object2 = (dx2)object2;
                ((c72)object).d0((dx2)object2);
                return object5;
            }
            case 3: {
                object = (rg1)object;
                int n17 = (Integer)object2;
                bl6 = bl5;
                if ((n17 & 3) != 2) {
                    bl6 = true;
                }
                if (!((rg1)object).K(n17 & 1, bl6)) {
                    ((rg1)object).N();
                }
                return object5;
            }
            case 2: {
                object = (rg1)object;
                int n17 = (Integer)object2;
                if ((n17 & 3) != 2) {
                    bl6 = true;
                }
                if (!((rg1)object).K(n17 & 1, bl6)) {
                    ((rg1)object).N();
                }
                return object5;
            }
            case 1: {
                object = (StringBuilder)object;
                object2 = (bx2)object2;
                if (((StringBuilder)object).length() > 1) {
                    ((StringBuilder)object).append(", ");
                }
                ((StringBuilder)object).append(object2);
                return object;
            }
            case 0: 
        }
        object = (String)object;
        object2 = (le0)object2;
        object.getClass();
        object2.getClass();
        if (((String)object).length() == 0) {
            object = object2.toString();
        } else {
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(", ");
            ((StringBuilder)object4).append(object2);
            object = ((StringBuilder)object4).toString();
        }
        return object;
    }
}

