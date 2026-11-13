/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.l51;
import defpackage.rr2;
import defpackage.vv4;
import defpackage.wv4;

public final class my4 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(wv4 wv42, vv4 vv42) {
        if (this.c > 0) {
            wv42.a(this.d, this.e, this.f, this.g, vv42);
            this.c = 0;
        }
    }

    public final void b(wv4 wv42, long l16, int n16, int n17, int n18, vv4 vv42) {
        boolean bl5 = this.g <= n17 + n18;
        rr2.v("TrueHD chunk samples must be contiguous in the sample queue.", bl5);
        if (this.b) {
            int n19;
            int n26 = this.c;
            this.c = n19 = n26 + 1;
            if (n26 == 0) {
                this.d = l16;
                this.e = n16;
                this.f = 0;
            }
            this.f += n17;
            this.g = n18;
            if (n19 >= 16) {
                this.a(wv42, vv42);
            }
        }
    }

    public final void c(l51 l512) {
        block10: {
            block9: {
                if (this.b) break block9;
                byte[] byArray = this.a;
                int n16 = 0;
                int n17 = 0;
                l512.n(byArray, 0, 10);
                l512.k();
                int n18 = n16;
                if (byArray[4] == -8) {
                    n18 = n16;
                    if (byArray[5] == 114) {
                        n18 = n16;
                        if (byArray[6] == 111) {
                            byte by = byArray[7];
                            if ((by & 0xFE) != 186) {
                                n18 = n16;
                            } else {
                                n18 = n17;
                                if ((by & 0xFF) == 187) {
                                    n18 = 1;
                                }
                                n18 = n18 != 0 ? 9 : 8;
                                n18 = 40 << (byArray[n18] >> 4 & 7);
                            }
                        }
                    }
                }
                if (n18 != 0) break block10;
            }
            return;
        }
        this.b = true;
    }
}

