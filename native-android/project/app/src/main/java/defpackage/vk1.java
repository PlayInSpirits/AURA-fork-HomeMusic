package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

public final class vk1
implements mz0 {
    public static final double[] r = new double[]{23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0};
    public String a;
    public wv4 b;
    public final r20 c;
    public final String d;
    public final be3 e;
    public final n41 f;
    public final boolean[] g;
    public final uk1 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public vk1(r20 r202, String object) {
        this.c = r202;
        this.d = object;
        this.g = new boolean[4];
        object = new Object();
        ((uk1)object).d = new byte[128];
        this.h = object;
        if (r202 != null) {
            this.f = new n41(178);
            this.e = new be3();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(be3 be32) {
        this.b.getClass();
        int n16 = be32.b;
        int n17 = be32.c;
        byte[] byArray = be32.a;
        this.i += (long)be32.a();
        this.b.e(be32.a(), be32);
        while (true) {
            long l16;
            int n18;
            int n19;
            int n26;
            int n27;
            byte[] byArray2;
            n41 n412;
            Object object;
            int n28;
            block20: {
                block23: {
                    block21: {
                        float f16;
                        int n29;
                        int n36;
                        Object object2;
                        block27: {
                            block28: {
                                block24: {
                                    block25: {
                                        block26: {
                                            block22: {
                                                n28 = uc5.o(byArray, n16, n17, this.g);
                                                object = this.h;
                                                n412 = this.f;
                                                if (n28 == n17) {
                                                    if (!this.k) {
                                                        ((uk1)object).a(byArray, n16, n17);
                                                    }
                                                    if (n412 != null) {
                                                        n412.a(byArray, n16, n17);
                                                    }
                                                    return;
                                                }
                                                byArray2 = be32.a;
                                                n27 = n28 + 3;
                                                n26 = byArray2[n27] & 0xFF;
                                                n19 = n28 - n16;
                                                if (this.k) break block20;
                                                if (n19 > 0) {
                                                    ((uk1)object).a(byArray, n16, n28);
                                                }
                                                n18 = n19 < 0 ? -n19 : 0;
                                                if (!((uk1)object).a) break block21;
                                                ((uk1)object).b = n18 = ((uk1)object).b - n18;
                                                if (((uk1)object).c != 0 || n26 != 181) break block22;
                                                ((uk1)object).c = n18;
                                                break block23;
                                            }
                                            ((uk1)object).a = false;
                                            object2 = this.a;
                                            object2.getClass();
                                            byArray2 = Arrays.copyOf(((uk1)object).d, ((uk1)object).b);
                                            n36 = byArray2[4];
                                            n29 = byArray2[5];
                                            n18 = byArray2[6];
                                            n36 = (n29 & 0xFF) >> 4 | (n36 & 0xFF) << 4;
                                            n29 = n18 & 0xFF | (n29 & 0xF) << 8;
                                            n18 = (byArray2[7] & 0xF0) >> 4;
                                            if (n18 == 2) break block24;
                                            if (n18 == 3) break block25;
                                            if (n18 == 4) break block26;
                                            f16 = 1.0f;
                                            break block27;
                                        }
                                        f16 = n29 * 121;
                                        n18 = n36 * 100;
                                        break block28;
                                    }
                                    f16 = n29 * 16;
                                    n18 = n36 * 9;
                                    break block28;
                                }
                                f16 = n29 * 4;
                                n18 = n36 * 3;
                            }
                            f16 /= (float)n18;
                        }
                        sb1 sb12 = new sb1();
                        sb12.a = object2;
                        sb12.l = lw2.m(this.d);
                        sb12.m = lw2.m("video/mpeg2");
                        sb12.t = n36;
                        sb12.u = n29;
                        sb12.z = f16;
                        sb12.p = Collections.singletonList(byArray2);
                        object2 = new tb1(sb12);
                        n18 = (byArray2[7] & 0xF) - 1;
                        if (n18 >= 0 && n18 < 8) {
                            double d16 = r[n18];
                            n36 = byArray2[((uk1)object).c + 9];
                            n18 = (n36 & 0x60) >> 5;
                            if (n18 != (n36 &= 0x1F)) {
                                d16 = ((double)n18 + 1.0) / (double)(n36 + 1) * d16;
                            }
                            l16 = (long)(1000000.0 / d16);
                        } else {
                            l16 = 0L;
                        }
                        object = Pair.create((Object)object2, (Object)l16);
                        this.b.g((tb1)((Pair)object).first);
                        this.l = (Long)((Pair)object).second;
                        this.k = true;
                        break block20;
                    }
                    if (n26 == 179) {
                        ((uk1)object).a = true;
                    }
                }
                ((uk1)object).a(uk1.e, 0, 3);
            }
            if (n412 != null) {
                if (n19 > 0) {
                    n412.a(byArray, n16, n28);
                    n18 = 0;
                } else {
                    n18 = -n19;
                }
                if (n412.d(n18)) {
                    object = (byte[])n412.f;
                    n18 = uc5.b0(n412.c, (byte[])object);
                    object = f35.a;
                    byArray2 = (byte[])n412.f;
                    object = this.e;
                    ((be3)object).L(n18, byArray2);
                    this.c.n(this.o, (be3)object);
                }
                if (n26 == 178 && be32.a[n28 + 2] == 1) {
                    n412.g(n26);
                }
            }
            if (n26 != 0 && n26 != 179) {
                if (n26 == 184) {
                    this.p = true;
                }
            } else {
                n28 = n17 - n28;
                if (this.q && this.k && (l16 = this.o) != -9223372036854775807L) {
                    n16 = this.p ? 1 : 0;
                    n18 = (int)(this.i - this.n);
                    this.b.a(l16, n16, n18 - n28, n28, null);
                }
                if (!this.j || this.q) {
                    this.n = this.i - (long)n28;
                    l16 = this.m;
                    if (l16 == -9223372036854775807L) {
                        l16 = this.o;
                        l16 = l16 != -9223372036854775807L ? (l16 += this.l) : -9223372036854775807L;
                    }
                    this.o = l16;
                    this.p = false;
                    this.m = -9223372036854775807L;
                    this.j = true;
                }
                boolean bl5 = n26 == 0;
                this.q = bl5;
            }
            n16 = n27;
        }
    }

    @Override
    public final void c() {
        uc5.i(this.g);
        Object object = this.h;
        ((uk1)object).a = false;
        ((uk1)object).b = 0;
        ((uk1)object).c = 0;
        object = this.f;
        if (object != null) {
            ((n41)object).f();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override
    public final void d(boolean bl5) {
        this.b.getClass();
        if (bl5) {
            int n16 = this.p;
            int n17 = (int)(this.i - this.n);
            this.b.a(this.o, n16, n17, 0, null);
        }
    }

    @Override
    public final void e(int n16, long l16) {
        this.m = l16;
    }

    @Override
    public final void f(m51 m512, sy4 sy42) {
        sy42.a();
        sy42.b();
        this.a = sy42.e;
        sy42.b();
        this.b = m512.t(sy42.d, 2);
        r20 r202 = this.c;
        if (r202 != null) {
            r202.p(m512, sy42);
        }
    }
}

