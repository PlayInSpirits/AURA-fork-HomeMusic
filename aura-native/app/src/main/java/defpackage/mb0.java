/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.ViewGroup;
import defpackage.jc0;
import defpackage.pk1;

public final class mb0
extends ViewGroup.MarginLayoutParams {
    public mb0(android.content.Context a0, android.util.AttributeSet a1) {
        super(a0, a1);
    }

    public mb0(android.view.ViewGroup.LayoutParams a0) {
        super(a0);
    }

    public int A;
    public int B;
    public int C;
    public int D = 0;
    public float E = 0.5f;
    public float F = 0.5f;
    public String G = null;
    public float H = -1.0f;
    public float I = -1.0f;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public int Q = 0;
    public float R = 1.0f;
    public float S = 1.0f;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;
    public String Y = null;
    public int Z = 0;
    public int a = -1;
    public boolean a0 = true;
    public int b = -1;
    public boolean b0 = true;
    public float c = -1.0f;
    public boolean c0 = false;
    public boolean d = true;
    public boolean d0 = false;
    public int e = -1;
    public boolean e0 = false;
    public int f = -1;
    public int f0 = -1;
    public int g = -1;
    public int g0 = -1;
    public int h = -1;
    public int h0 = -1;
    public int i = -1;
    public int i0 = -1;
    public int j = -1;
    public int j0;
    public int k = -1;
    public int k0;
    public int l = -1;
    public float l0 = 0.5f;
    public int m = -1;
    public int m0;
    public int n = -1;
    public int n0;
    public int o = -1;
    public float o0;
    public int p = -1;
    public jc0 p0;
    public int q = 0;
    public float r = 0.0f;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = Integer.MIN_VALUE;
    public int x = Integer.MIN_VALUE;
    public int y = Integer.MIN_VALUE;
    public int z = Integer.MIN_VALUE;

    public mb0(int n16, int n17) {
        super(n16, n17);
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        this.p0 = new jc0();
    }

    public final void a() {
        int n16;
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int n17 = this.width;
        if (n17 == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if ((n16 = this.height) == -2 && this.X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (n17 == 0 || n17 == -1) {
            this.a0 = false;
            if (n17 == 0 && this.L == 1) {
                this.width = -2;
                this.W = true;
            }
        }
        if (n16 == 0 || n16 == -1) {
            this.b0 = false;
            if (n16 == 0 && this.M == 1) {
                this.height = -2;
                this.X = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.d0 = true;
        this.a0 = true;
        this.b0 = true;
        if (!(this.p0 instanceof pk1)) {
            this.p0 = new pk1();
        }
        ((pk1)this.p0).O(this.V);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void resolveLayoutDirection(int n16) {
        int n17;
        int n18;
        int n19;
        block33: {
            block29: {
                int n26;
                int n27;
                block34: {
                    float f16;
                    float f17;
                    int n28;
                    block32: {
                        block31: {
                            block30: {
                                n19 = this.leftMargin;
                                n18 = this.rightMargin;
                                super.resolveLayoutDirection(n16);
                                n16 = this.getLayoutDirection();
                                n28 = 0;
                                n16 = 1 == n16 ? 1 : 0;
                                this.h0 = -1;
                                this.i0 = -1;
                                this.f0 = -1;
                                this.g0 = -1;
                                this.j0 = this.w;
                                this.k0 = this.y;
                                this.l0 = f17 = this.E;
                                this.m0 = n27 = this.a;
                                this.n0 = n26 = this.b;
                                this.o0 = f16 = this.c;
                                n17 = this.s;
                                if (n16 == 0) break block29;
                                if (n17 == -1) break block30;
                                this.h0 = n17;
                                break block31;
                            }
                            int n29 = this.t;
                            n16 = n28;
                            if (n29 == -1) break block32;
                            this.i0 = n29;
                        }
                        n16 = 1;
                    }
                    if ((n28 = this.u) != -1) {
                        this.g0 = n28;
                        n16 = 1;
                    }
                    if ((n28 = this.v) != -1) {
                        this.f0 = n28;
                        n16 = 1;
                    }
                    if ((n28 = this.A) != Integer.MIN_VALUE) {
                        this.k0 = n28;
                    }
                    if ((n28 = this.B) != Integer.MIN_VALUE) {
                        this.j0 = n28;
                    }
                    if (n16 != 0) {
                        this.l0 = 1.0f - f17;
                    }
                    if (!this.d0 || this.V != 1 || !this.d) break block33;
                    if (f16 == -1.0f) break block34;
                    this.o0 = 1.0f - f16;
                    this.m0 = -1;
                    this.n0 = -1;
                    break block33;
                }
                if (n27 != -1) {
                    this.n0 = n27;
                    this.m0 = -1;
                    this.o0 = -1.0f;
                    break block33;
                } else if (n26 != -1) {
                    this.m0 = n26;
                    this.n0 = -1;
                    this.o0 = -1.0f;
                }
                break block33;
            }
            if (n17 != -1) {
                this.g0 = n17;
            }
            if ((n16 = this.t) != -1) {
                this.f0 = n16;
            }
            if ((n16 = this.u) != -1) {
                this.h0 = n16;
            }
            if ((n16 = this.v) != -1) {
                this.i0 = n16;
            }
            if ((n16 = this.A) != Integer.MIN_VALUE) {
                this.j0 = n16;
            }
            if ((n16 = this.B) != Integer.MIN_VALUE) {
                this.k0 = n16;
            }
        }
        if (this.u != -1 || this.v != -1 || this.t != -1 || n17 != -1) return;
        n16 = this.g;
        if (n16 != -1) {
            this.h0 = n16;
            if (this.rightMargin <= 0 && n18 > 0) {
                this.rightMargin = n18;
            }
        } else {
            n16 = this.h;
            if (n16 != -1) {
                this.i0 = n16;
                if (this.rightMargin <= 0 && n18 > 0) {
                    this.rightMargin = n18;
                }
            }
        }
        if ((n16 = this.e) != -1) {
            this.f0 = n16;
            if (this.leftMargin > 0 || n19 <= 0) return;
            this.leftMargin = n19;
            return;
        } else {
            n16 = this.f;
            if (n16 == -1) return;
            this.g0 = n16;
            if (this.leftMargin > 0 || n19 <= 0) return;
            this.leftMargin = n19;
        }
    }
}

