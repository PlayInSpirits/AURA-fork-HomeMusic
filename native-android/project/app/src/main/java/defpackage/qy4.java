package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 */
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class qy4
implements k51 {
    public final int a;
    public final int b;
    public final List c;
    public final be3 d;
    public final SparseIntArray e;
    public final qn0 f;
    public final xn4 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final sr3 k;
    public r71 l;
    public m51 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ty4 r;
    public int s;
    public int t;

    public qy4(int n16, int n17, xn4 object, iu4 iu42, qn0 qn02) {
        this.f = qn02;
        this.a = n16;
        this.b = n17;
        this.g = object;
        if (n16 != 1 && n16 != 2) {
            this.c = object = new ArrayList();
            ((ArrayList)object).add(iu42);
        } else {
            this.c = Collections.singletonList(iu42);
        }
        this.d = new be3(0, new byte[9400]);
        iu42 = new SparseBooleanArray();
        this.i = iu42;
        this.j = new SparseBooleanArray();
        object = new SparseArray();
        this.h = object;
        this.e = new SparseIntArray();
        this.k = new sr3(1);
        this.m = m51.i;
        this.t = -1;
        iu42.clear();
        object.clear();
        iu42 = new SparseArray();
        n17 = iu42.size();
        for (n16 = 0; n16 < n17; ++n16) {
            object.put(iu42.keyAt(n16), (Object)((ty4)iu42.valueAt(n16)));
        }
        object.put(0, (Object)new h84(new xc5(this)));
        this.r = null;
    }

    @Override
    public final void a() {
    }

    @Override
    public final int b(l51 object, t71 t712) {
        int n16;
        int n17;
        int n18;
        int n19;
        Object object2;
        Object object3;
        long l16 = object.getLength();
        int n26 = this.a;
        int n27 = n26 == 2 ? 1 : 0;
        if (this.o) {
            long l17 = -9223372036854775807L;
            object3 = this.k;
            if (l16 != -1L && n27 == 0 && !((sr3)object3).d) {
                int n28 = this.t;
                iu4 iu42 = ((sr3)object3).b;
                be3 be32 = ((sr3)object3).c;
                if (n28 <= 0) {
                    ((sr3)object3).a((l51)object);
                    return 0;
                }
                if (!((sr3)object3).f) {
                    l16 = object.getLength();
                    n27 = (int)Math.min(112800L, l16);
                    if (object.getPosition() != (l16 -= (long)n27)) {
                        t712.a = l16;
                        return 1;
                    }
                    be32.K(n27);
                    object.k();
                    object.n(be32.a, 0, n27);
                    int n29 = be32.b;
                    int n36 = be32.c;
                    int n37 = n36 - 188;
                    block0: while (true) {
                        l16 = l17;
                        if (n37 < n29) break;
                        object = be32.a;
                        n27 = 0;
                        for (int i16 = -4; i16 <= 4; ++i16) {
                            n26 = i16 * 188 + n37;
                            if (n26 >= n29 && n26 < n36 && object[n26] == 71) {
                                n27 = n26 = n27 + 1;
                                if (n26 != 5) continue;
                                l16 = au0.P(be32, n37, n28);
                                if (l16 == -9223372036854775807L) break;
                                break block0;
                            }
                            n27 = 0;
                        }
                        --n37;
                    }
                    ((sr3)object3).h = l16;
                    ((sr3)object3).f = true;
                    return 0;
                }
                if (((sr3)object3).h == -9223372036854775807L) {
                    ((sr3)object3).a((l51)object);
                    return 0;
                }
                if (!((sr3)object3).e) {
                    block39: {
                        n27 = (int)Math.min(112800L, object.getLength());
                        if (object.getPosition() != 0L) {
                            t712.a = 0L;
                            return 1;
                        }
                        be32.K(n27);
                        object.k();
                        object.n(be32.a, 0, n27);
                        int n38 = be32.c;
                        for (n27 = be32.b; n27 < n38; ++n27) {
                            if (be32.a[n27] != 71 || (l16 = au0.P(be32, n27, n28)) == -9223372036854775807L) {
                                continue;
                            }
                            break block39;
                        }
                        l16 = -9223372036854775807L;
                    }
                    ((sr3)object3).g = l16;
                    ((sr3)object3).e = true;
                    return 0;
                }
                l16 = ((sr3)object3).g;
                if (l16 == -9223372036854775807L) {
                    ((sr3)object3).a((l51)object);
                    return 0;
                }
                l16 = iu42.b(l16);
                ((sr3)object3).i = iu42.c(((sr3)object3).h) - l16;
                ((sr3)object3).a((l51)object);
                return 0;
            }
            if (!this.p) {
                this.p = true;
                l17 = ((sr3)object3).i;
                if (l17 != -9223372036854775807L) {
                    object2 = ((sr3)object3).b;
                    n19 = this.t;
                    this.l = object2 = new r71(new pa(18), new ue1(n19, (iu4)object2), l17, l17 + 1L, 0L, l16, 188L, 940);
                    this.m.w(((r71)object2).a);
                } else {
                    this.m.w(new bo(l17));
                }
            }
            if (this.q) {
                this.q = false;
                this.d(0L, 0L);
                if (object.getPosition() != 0L) {
                    t712.a = 0L;
                    return 1;
                }
            }
            if ((object2 = this.l) != null && ((r71)object2).c != null) {
                return ((r71)object2).b((l51)object, t712);
            }
        }
        object2 = this.d;
        object3 = ((be3)object2).a;
        if (9400 - ((be3)object2).b < 188) {
            n19 = ((be3)object2).a();
            if (n19 > 0) {
                System.arraycopy(object3, ((be3)object2).b, object3, 0, n19);
            }
            ((be3)object2).L(n19, (byte[])object3);
        }
        while (true) {
            n19 = ((be3)object2).a();
            t712 = this.h;
            if (n19 >= 188) break;
            n18 = ((be3)object2).c;
            n19 = object.read((byte[])object3, n18, 9400 - n18);
            if (n19 == -1) {
                for (n19 = 0; n19 < t712.size(); ++n19) {
                    object = (ty4)t712.valueAt(n19);
                    if (!(object instanceof ag3)) continue;
                    object = (ag3)object;
                    n18 = n27 != 0 && !((ag3)object).e() ? 0 : 1;
                    if (((ag3)object).c != 3 || ((ag3)object).j != -1 || n27 != 0 && ((ag3)object).a instanceof vk1 || n18 == 0) continue;
                    ((ag3)object).a(1, new be3());
                }
                return -1;
            }
            ((be3)object2).M(n18 + n19);
        }
        n19 = ((be3)object2).b;
        n18 = ((be3)object2).c;
        object = ((be3)object2).a;
        for (n27 = n19; n27 < n18 && object[n27] != 71; ++n27) {
        }
        ((be3)object2).N(n27);
        int n39 = n27 + 188;
        object = null;
        if (n39 > n18) {
            this.s = n27 = n27 - n19 + this.s;
            if (n26 == 2 && n27 > 376) {
                throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.s = 0;
        }
        if (n39 > (n17 = ((be3)object2).c)) {
            return 0;
        }
        n18 = ((be3)object2).m();
        if ((0x800000 & n18) != 0) {
            ((be3)object2).N(n39);
            return 0;
        }
        n27 = (0x400000 & n18) != 0 ? 1 : 0;
        int n46 = (0x1FFF00 & n18) >> 8;
        n19 = (n18 & 0x20) != 0 ? 1 : 0;
        if ((n18 & 0x10) != 0) {
            object = (ty4)t712.get(n46);
        }
        if (object == null) {
            ((be3)object2).N(n39);
            return 0;
        }
        if (n26 != 2) {
            n16 = n18 & 0xF;
            t712 = this.e;
            n18 = t712.get(n46, n16 - 1);
            t712.put(n46, n16);
            if (n18 == n16) {
                ((be3)object2).N(n39);
                return 0;
            }
            if (n16 != (n18 + 1 & 0xF)) {
                object.c();
            }
        }
        n18 = n27;
        if (n19 != 0) {
            n16 = ((be3)object2).A();
            n19 = (((be3)object2).A() & 0x40) != 0 ? 2 : 0;
            n18 = n27 | n19;
            ((be3)object2).O(n16 - 1);
        }
        boolean bl5 = this.o;
        if (n26 == 2 || bl5 || !this.j.get(n46, false)) {
            ((be3)object2).M(n39);
            object.a(n18, (be3)object2);
            ((be3)object2).M(n17);
        }
        if (n26 != 2 && !bl5 && this.o && l16 != -1L) {
            this.q = true;
        }
        ((be3)object2).N(n39);
        return 0;
    }

    @Override
    public final boolean c(l51 l512) {
        byte[] byArray = this.d.a;
        l512 = (rk0)l512;
        ((rk0)l512).e(byArray, 0, 940, false);
        block0: for (int i16 = 0; i16 < 188; ++i16) {
            for (int i17 = 0; i17 < 5; ++i17) {
                if (byArray[i17 * 188 + i16] == 71) continue;
                continue block0;
            }
            ((rk0)l512).d(i16, false);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(long l16, long l17) {
        int n16;
        Object object;
        SparseArray sparseArray = this.h;
        List list = this.c;
        boolean bl5 = this.a != 2;
        rr2.w(bl5);
        int n17 = list.size();
        for (int i16 = 0; i16 < n17; ++i16) {
            object = (iu4)list.get(i16);
            synchronized (object) {
                l16 = ((iu4)object).b;
            }
            int n18 = l16 == -9223372036854775807L ? 1 : 0;
            n16 = n18;
            if (n18 == 0) {
                l16 = ((iu4)object).d();
                n16 = l16 != -9223372036854775807L && l16 != 0L && l16 != l17 ? 1 : 0;
            }
            if (n16 == 0) continue;
            ((iu4)object).f(l17);
        }
        if (l17 != 0L && (object = this.l) != null) {
            ((r71)object).d(l17);
        }
        this.d.K(0);
        this.e.clear();
        n16 = 0;
        while (true) {
            if (n16 >= sparseArray.size()) {
                this.s = 0;
                return;
            }
            ((ty4)sparseArray.valueAt(n16)).c();
            ++n16;
        }
    }

    @Override
    public final void f(m51 m512) {
        m51 m513 = m512;
        if ((this.b & 1) == 0) {
            m513 = new ll(m512, this.g);
        }
        this.m = m513;
    }
}

