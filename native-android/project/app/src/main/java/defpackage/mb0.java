package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb0 extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public jc0 p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public mb0(int r6, int r7) {
        super(r6, r7);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        this.l0 = 0.5f;
        this.p0 = new jc0();
    }

    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int r2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (r2 == (-2)) goto L5;
    L9:
        int r4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (r4 != (-2)) goto L17;
        if (this.X == false) goto L17;
        this.b0 = false;
        if (this.M != 0) goto L17;
        this.M = 1;
    L17:
        if (r2 == 0) goto L19;
        if (r2 == (-1)) goto L19;
    L24:
        if (r4 == 0) goto L26;
        if (r4 == (-1)) goto L26;
    L32:
        if (this.c == (-1.0f)) goto L34;
    L39:
        this.d0 = true;
        this.a0 = true;
        this.b0 = true;
        if ((this.p0 instanceof pk1) == true) goto L42;
        this.p0 = new pk1();
    L42:
        ((pk1) this.p0).O(this.V);
        return;
    L34:
        if (this.a != (-1)) goto L39;
        if (this.b != (-1)) goto L39;
        return;
    L26:
        this.b0 = false;
        if (r4 != 0) goto L32;
        if (this.M != 1) goto L32;
        ((ViewGroup.MarginLayoutParams) this).height = -2;
        this.X = true;
    L19:
        this.a0 = false;
        if (r2 != 0) goto L24;
        if (this.L != 1) goto L24;
        ((ViewGroup.MarginLayoutParams) this).width = -2;
        this.W = true;
        goto L24
    L5:
        if (this.W == false) goto L9;
        this.a0 = false;
        if (this.L != 0) goto L9;
        this.L = 1;
        goto L9
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int r12) {
        int r0 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int r1 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(r12);
        boolean r2 = false;
        if (1 != getLayoutDirection()) goto L5;
        boolean r13 = true;
    L6:
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = this.w;
        this.k0 = this.y;
        float r5 = this.E;
        this.l0 = r5;
        int r6 = this.a;
        this.m0 = r6;
        int r7 = this.b;
        this.n0 = r7;
        float r8 = this.c;
        this.o0 = r8;
        int r9 = this.s;
        if (r13 == false) goto L42;
        if (r9 == (-1)) goto L11;
        this.h0 = r9;
    L10:
        r2 = true;
    L14:
        int r14 = this.u;
        if (r14 == (-1)) goto L17;
        this.g0 = r14;
        r2 = true;
    L17:
        int r15 = this.v;
        if (r15 == (-1)) goto L20;
        this.f0 = r15;
        r2 = true;
    L20:
        int r16 = this.A;
        if (r16 == Integer.MIN_VALUE) goto L23;
        this.k0 = r16;
    L23:
        int r17 = this.B;
        if (r17 == Integer.MIN_VALUE) goto L27;
        this.j0 = r17;
    L27:
        if (r2 == false) goto L30;
        this.l0 = 1.0f - r5;
    L30:
        if (this.d0 == false) goto L60;
        if (this.V != 1) goto L60;
        if (this.d == false) goto L60;
        if (r8 == (-1.0f)) goto L38;
        this.o0 = 1.0f - r8;
        this.m0 = -1;
        this.n0 = -1;
        goto L60
    L38:
        if (r6 == (-1)) goto L40;
        this.n0 = r6;
        this.m0 = -1;
        this.o0 = -1.0f;
        goto L60
    L40:
        if (r7 == (-1)) goto L60;
        this.m0 = r7;
        this.n0 = -1;
        this.o0 = -1.0f;
    L60:
        if (this.u == (-1)) goto L62;
        return;
    L62:
        if (this.v == (-1)) goto L64;
        return;
    L64:
        if (this.t != (-1)) goto L94;
        if (r9 != (-1)) goto L95;
        int r18 = this.g;
        if (r18 == (-1)) goto L72;
        this.h0 = r18;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L78;
        if (r1 <= 0) goto L78;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
    L78:
        int r19 = this.e;
        if (r19 == (-1)) goto L85;
        this.f0 = r19;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L96;
        if (r0 <= 0) goto L97;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L97:
        return;
    L96:
        return;
    L85:
        int r110 = this.f;
        if (r110 == (-1)) goto L98;
        this.g0 = r110;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L99;
        if (r0 <= 0) goto L100;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L100:
        return;
    L99:
        return;
    L98:
        return;
    L72:
        int r111 = this.h;
        if (r111 == (-1)) goto L78;
        this.i0 = r111;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L78;
        if (r1 <= 0) goto L78;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
        goto L78
    L95:
        return;
    L94:
        return;
    L11:
        int r112 = this.t;
        if (r112 == (-1)) goto L14;
        this.i0 = r112;
        goto L10
    L42:
        if (r9 == (-1)) goto L44;
        this.g0 = r9;
    L44:
        int r113 = this.t;
        if (r113 == (-1)) goto L47;
        this.f0 = r113;
    L47:
        int r114 = this.u;
        if (r114 == (-1)) goto L50;
        this.h0 = r114;
    L50:
        int r115 = this.v;
        if (r115 == (-1)) goto L53;
        this.i0 = r115;
    L53:
        int r116 = this.A;
        if (r116 == Integer.MIN_VALUE) goto L56;
        this.j0 = r116;
    L56:
        int r117 = this.B;
        if (r117 == Integer.MIN_VALUE) goto L60;
        this.k0 = r117;
        goto L60
    L5:
        r13 = false;
        goto L6
    }
}
