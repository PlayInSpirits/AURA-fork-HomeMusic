package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jc0 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public final hb0 H;
    public final hb0 I;
    public final hb0 J;
    public final hb0 K;
    public final hb0 L;
    public final hb0 M;
    public final hb0 N;
    public final hb0 O;
    public final hb0[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public jc0 S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public q00 b;
    public int b0;
    public q00 c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public String j;
    public final float[] j0;
    public boolean k;
    public final jc0[] k0;
    public boolean l;
    public final jc0[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public up1 d = null;
    public w45 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public jc0() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = 0;
        this.G = 0;
        hb0 hb0Var = new hb0(this, 2);
        this.H = hb0Var;
        hb0 hb0Var2 = new hb0(this, 3);
        this.I = hb0Var2;
        hb0 hb0Var3 = new hb0(this, 4);
        this.J = hb0Var3;
        hb0 hb0Var4 = new hb0(this, 5);
        this.K = hb0Var4;
        hb0 hb0Var5 = new hb0(this, 6);
        this.L = hb0Var5;
        hb0 hb0Var6 = new hb0(this, 8);
        this.M = hb0Var6;
        hb0 hb0Var7 = new hb0(this, 9);
        this.N = hb0Var7;
        hb0 hb0Var8 = new hb0(this, 7);
        this.O = hb0Var8;
        this.P = new hb0[]{hb0Var, hb0Var3, hb0Var2, hb0Var4, hb0Var5, hb0Var8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new jc0[]{null, null};
        this.l0 = new jc0[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(hb0Var);
        arrayList.add(hb0Var2);
        arrayList.add(hb0Var3);
        arrayList.add(hb0Var4);
        arrayList.add(hb0Var6);
        arrayList.add(hb0Var7);
        arrayList.add(hb0Var8);
        arrayList.add(hb0Var5);
    }

    public static void D(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void E(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void m(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            f34.n(sb, "      behavior", " :   ", str2, ",\n");
        }
        D(i, 0, "      size", sb);
        D(i2, 0, "      min", sb);
        D(i3, Integer.MAX_VALUE, "      max", sb);
        D(i4, 0, "      matchMin", sb);
        D(i5, 0, "      matchDef", sb);
        E(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void n(StringBuilder sb, String str, hb0 hb0Var) {
        if (hb0Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(hb0Var.f);
        sb.append("'");
        if (hb0Var.h != Integer.MIN_VALUE || hb0Var.g != 0) {
            sb.append(",");
            sb.append(hb0Var.g);
            if (hb0Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(hb0Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void A() {
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.S = null;
        this.D = Float.NaN;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hb0 hb0Var = (hb0) arrayList.get(i);
            hb0Var.c = false;
            hb0Var.b = 0;
        }
    }

    public void C(yc5 yc5Var) {
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.O.h();
        this.M.h();
        this.N.h();
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.H.i(i);
        this.J.i(i2);
        this.X = i;
        this.T = i2 - i;
        this.k = true;
    }

    public final void G(int i, int i2) {
        if (this.l) {
            return;
        }
        this.I.i(i);
        this.K.i(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.E) {
            this.L.i(i + this.Z);
        }
        this.l = true;
    }

    public final void H(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void I(int i) {
        this.o0[0] = i;
    }

    public final void J(int i) {
        this.o0[1] = i;
    }

    public final void K(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void L(boolean z, boolean z2) {
        int i;
        int i2;
        up1 up1Var = this.d;
        boolean z3 = z & up1Var.g;
        w45 w45Var = this.e;
        boolean z4 = z2 & w45Var.g;
        int i3 = up1Var.h.g;
        int i4 = w45Var.h.g;
        int i5 = up1Var.i.g;
        int i6 = w45Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void M(eb2 eb2Var, boolean z) {
        int i;
        int i2;
        w45 w45Var;
        up1 up1Var;
        eb2Var.getClass();
        int iN = eb2.n(this.H);
        int iN2 = eb2.n(this.I);
        int iN3 = eb2.n(this.J);
        int iN4 = eb2.n(this.K);
        if (z && (up1Var = this.d) != null) {
            yo0 yo0Var = up1Var.h;
            if (yo0Var.j) {
                yo0 yo0Var2 = up1Var.i;
                if (yo0Var2.j) {
                    iN = yo0Var.g;
                    iN3 = yo0Var2.g;
                }
            }
        }
        if (z && (w45Var = this.e) != null) {
            yo0 yo0Var3 = w45Var.h;
            if (yo0Var3.j) {
                yo0 yo0Var4 = w45Var.i;
                if (yo0Var4.j) {
                    iN2 = yo0Var3.g;
                    iN4 = yo0Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(kc0 kc0Var, eb2 eb2Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            uo.h(kc0Var, eb2Var, this);
            hashSet.remove(this);
            b(eb2Var, kc0Var.S(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((hb0) it.next()).d.a(kc0Var, eb2Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((hb0) it2.next()).d.a(kc0Var, eb2Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((hb0) it3.next()).d.a(kc0Var, eb2Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((hb0) it4.next()).d.a(kc0Var, eb2Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((hb0) it5.next()).d.a(kc0Var, eb2Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
  0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x0670  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [jc0] */
    public void b(eb2 eb2Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        jc0 jc0Var;
        kc0 kc0Var;
        WeakReference weakReference;
        WeakReference weakReference2;
        jc0 jc0Var2;
        kc0 kc0Var2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        hb0 hb0Var;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        hb0 hb0Var2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        hb0 hb0Var3;
        int i20;
        hb0 hb0Var4;
        ai4 ai4Var;
        ai4 ai4Var2;
        ai4 ai4Var3;
        boolean z10;
        ?? r3;
        ?? r4;
        int i21;
        ai4 ai4Var4;
        ai4 ai4Var5;
        ai4 ai4Var6;
        int i22;
        int i23;
        boolean z11;
        int i24;
        ai4 ai4Var7;
        int i25;
        float f2;
        ?? r27;
        w45 w45Var;
        boolean z12;
        up1 up1Var;
        int i26;
        int i27;
        boolean zV;
        int i28;
        boolean zW;
        up1 up1Var2;
        w45 w45Var2;
        boolean z13;
        ArrayList arrayList;
        int size;
        int i29;
        HashSet hashSet2;
        eb2 eb2Var2 = eb2Var;
        hb0 hb0Var5 = this.H;
        ai4 ai4VarK = eb2Var2.k(hb0Var5);
        hb0 hb0Var6 = this.J;
        ai4 ai4VarK2 = eb2Var2.k(hb0Var6);
        hb0 hb0Var7 = this.I;
        ai4 ai4VarK3 = eb2Var2.k(hb0Var7);
        hb0 hb0Var8 = this.K;
        ai4 ai4VarK4 = eb2Var2.k(hb0Var8);
        hb0 hb0Var9 = this.L;
        ai4 ai4VarK5 = eb2Var2.k(hb0Var9);
        jc0 jc0Var3 = this.S;
        if (jc0Var3 != null) {
            int[] iArr2 = jc0Var3.o0;
            i = 0;
            i3 = iArr2[0] == 2 ? 1 : 0;
            int i30 = iArr2[1] == 2 ? 1 : 0;
            int i31 = this.q;
            if (i31 != 1) {
                if (i31 == 2) {
                    i3 = 0;
                } else if (i31 != 3) {
                }
                i2 = i30;
            } else {
                i2 = 0;
            }
            i4 = this.f0;
            zArr = this.R;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i6 = i3;
                i29 = i;
                while (true) {
                    if (i29 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i32 = size;
                    hashSet2 = ((hb0) arrayList.get(i29)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i32;
                }
            } else {
                i6 = i3;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    eb2Var2.d(ai4VarK, this.X);
                    eb2Var2.d(ai4VarK2, this.X + this.T);
                    if (i6 != 0 && (jc0Var2 = this.S) != null) {
                        kc0Var2 = (kc0) jc0Var2;
                        weakReference3 = kc0Var2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || hb0Var5.c() > ((hb0) kc0Var2.G0.get()).c()) {
                            kc0Var2.G0 = new WeakReference(hb0Var5);
                        }
                        weakReference4 = kc0Var2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || hb0Var6.c() > ((hb0) kc0Var2.I0.get()).c()) {
                            kc0Var2.I0 = new WeakReference(hb0Var6);
                        }
                    }
                }
                if (this.l) {
                    eb2Var2.d(ai4VarK3, this.Y);
                    eb2Var2.d(ai4VarK4, this.Y + this.U);
                    hashSet = hb0Var9.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        eb2Var2.d(ai4VarK5, this.Y + this.Z);
                    }
                    if (i5 != 0 && (jc0Var = this.S) != null) {
                        kc0Var = (kc0) jc0Var;
                        weakReference = kc0Var.F0;
                        if (weakReference != null || weakReference.get() == null || hb0Var7.c() > ((hb0) kc0Var.F0.get()).c()) {
                            kc0Var.F0 = new WeakReference(hb0Var7);
                        }
                        weakReference2 = kc0Var.H0;
                        if (weakReference2 != null || weakReference2.get() == null || hb0Var8.c() > ((hb0) kc0Var.H0.get()).c()) {
                            kc0Var.H0 = new WeakReference(hb0Var8);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r12 = i;
                    this.k = r12;
                    this.l = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (up1Var2 = this.d) == null || (w45Var2 = this.e) == null) {
                hb0Var = hb0Var9;
                zArr3 = zArr2;
            } else {
                hb0Var = hb0Var9;
                yo0 yo0Var = up1Var2.h;
                zArr3 = zArr2;
                if (yo0Var.j && up1Var2.i.j && w45Var2.h.j && w45Var2.i.j) {
                    eb2Var2.d(ai4VarK, yo0Var.g);
                    eb2Var2.d(ai4VarK2, this.d.i.g);
                    eb2Var2.d(ai4VarK3, this.e.h.g);
                    eb2Var2.d(ai4VarK4, this.e.i.g);
                    eb2Var2.d(ai4VarK5, this.e.k.g);
                    if (this.S == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !v()) {
                            eb2Var2.f(eb2Var2.k(this.S.J), ai4VarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || w()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            eb2Var2.f(eb2Var2.k(this.S.K), ai4VarK4, 0, 8);
                        }
                    }
                    this.k = z13;
                    this.l = z13;
                    return;
                }
            }
            if (this.S != null) {
                if (u(0)) {
                    ((kc0) this.S).N(this, 0);
                    zV = true;
                    i28 = 1;
                } else {
                    zV = v();
                    i28 = 1;
                }
                if (u(i28)) {
                    ((kc0) this.S).N(this, i28);
                    zW = true;
                } else {
                    zW = w();
                }
                if (zV && i6 != 0 && this.f0 != 8 && hb0Var5.f == null && hb0Var6.f == null) {
                    eb2Var2.f(eb2Var2.k(this.S.J), ai4VarK2, 0, 1);
                }
                if (!zW && i5 != 0 && this.f0 != 8 && hb0Var7.f == null && hb0Var8.f == null && hb0Var == null) {
                    eb2Var2.f(eb2Var2.k(this.S.K), ai4VarK4, 0, 1);
                }
                z4 = zW;
                z3 = zV;
            } else {
                hb0Var5 = hb0Var5;
                z3 = false;
                z4 = false;
            }
            i7 = this.T;
            i8 = this.a0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.U;
            i10 = this.b0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.o0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i33 = this.W;
            this.A = i33;
            f = this.V;
            this.B = f;
            i14 = this.r;
            i15 = this.s;
            if (f > 0.0f) {
                hb0Var2 = hb0Var8;
                if (this.f0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i27 = i15;
                    } else {
                        i27 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i27 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.A = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                hb0Var = hb0Var;
                                i16 = i11;
                                i17 = 4;
                                z7 = false;
                            }
                            i18 = i27;
                            int[] iArr3 = this.t;
                            iArr3[0] = i17;
                            iArr3[1] = i18;
                            if (z7) {
                                int i34 = this.A;
                                i19 = -1;
                                if (i34 != 0) {
                                }
                                if (z7) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (iArr[0] == 2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i8 = 0;
                                }
                                hb0Var3 = this.O;
                                boolean z14 = !hb0Var3.f();
                                char c = '\b';
                                boolean z15 = zArr[0];
                                boolean z16 = zArr[1];
                                i20 = this.o;
                                int[] iArr4 = this.C;
                                if (i20 != 2) {
                                    hb0Var4 = hb0Var;
                                    ai4Var = ai4VarK;
                                    ai4Var2 = ai4VarK2;
                                    ai4Var3 = ai4VarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                } else {
                                    hb0Var4 = hb0Var;
                                    ai4Var = ai4VarK;
                                    ai4Var2 = ai4VarK2;
                                    ai4Var3 = ai4VarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                }
                                if (z) {
                                    ai4Var4 = r33;
                                    ai4Var5 = ai4VarK4;
                                    ai4Var6 = ai4Var3;
                                    i22 = 0;
                                    i23 = 8;
                                    z11 = true;
                                    i24 = 1;
                                } else {
                                    ai4Var4 = r33;
                                    ai4Var5 = ai4VarK4;
                                    ai4Var6 = ai4Var3;
                                    i22 = 0;
                                    i23 = 8;
                                    z11 = true;
                                    i24 = 1;
                                }
                                if (this.p == 2) {
                                    i24 = i22;
                                }
                                if (i24 != 0) {
                                    ai4Var7 = ai4Var4;
                                } else {
                                    ai4Var7 = ai4Var4;
                                }
                                if (z7) {
                                    i25 = this.A;
                                    f2 = this.B;
                                    if (i25 == 1) {
                                        pi piVarL = eb2Var2.l();
                                        piVarL.d.g(ai4Var5, -1.0f);
                                        piVarL.d.g(ai4Var7, 1.0f);
                                        piVarL.d.g(ai4Var2, f2);
                                        piVarL.d.g(ai4Var, -f2);
                                        eb2Var2.c(piVarL);
                                    } else {
                                        pi piVarL2 = eb2Var2.l();
                                        piVarL2.d.g(ai4Var2, -1.0f);
                                        piVarL2.d.g(ai4Var, 1.0f);
                                        piVarL2.d.g(ai4Var5, f2);
                                        piVarL2.d.g(ai4Var7, -f2);
                                        eb2Var2.c(piVarL2);
                                    }
                                }
                                if (hb0Var3.f()) {
                                    jc0 jc0Var4 = hb0Var3.f.d;
                                    float radians = (float) Math.toRadians(this.D + 90.0f);
                                    int iD = hb0Var3.d();
                                    ai4 ai4VarK6 = eb2Var2.k(g(2));
                                    ai4 ai4VarK7 = eb2Var2.k(g(3));
                                    ai4 ai4VarK8 = eb2Var2.k(g(4));
                                    ai4 ai4VarK9 = eb2Var2.k(g(5));
                                    ai4 ai4VarK10 = eb2Var2.k(jc0Var4.g(2));
                                    ai4 ai4VarK11 = eb2Var2.k(jc0Var4.g(3));
                                    ai4 ai4VarK12 = eb2Var2.k(jc0Var4.g(4));
                                    ai4 ai4VarK13 = eb2Var2.k(jc0Var4.g(5));
                                    pi piVarL3 = eb2Var2.l();
                                    double d = radians;
                                    double dSin = Math.sin(d);
                                    double d2 = iD;
                                    piVarL3.d.g(ai4VarK11, 0.5f);
                                    piVarL3.d.g(ai4VarK13, 0.5f);
                                    piVarL3.d.g(ai4VarK7, -0.5f);
                                    piVarL3.d.g(ai4VarK9, -0.5f);
                                    piVarL3.b = -((float) (dSin * d2));
                                    eb2Var2.c(piVarL3);
                                    pi piVarL4 = eb2Var2.l();
                                    float fCos = (float) (Math.cos(d) * d2);
                                    piVarL4.d.g(ai4VarK10, 0.5f);
                                    piVarL4.d.g(ai4VarK12, 0.5f);
                                    piVarL4.d.g(ai4VarK6, -0.5f);
                                    piVarL4.d.g(ai4VarK8, -0.5f);
                                    piVarL4.b = -fCos;
                                    eb2Var2.c(piVarL4);
                                }
                                this.k = false;
                                this.l = false;
                            }
                            i19 = -1;
                            if (z7) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (iArr[0] == 2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            hb0Var3 = this.O;
                            boolean z17 = !hb0Var3.f();
                            char c2 = '\b';
                            boolean z18 = zArr[0];
                            boolean z19 = zArr[1];
                            i20 = this.o;
                            int[] iArr5 = this.C;
                            if (i20 != 2) {
                                hb0Var4 = hb0Var;
                                ai4Var = ai4VarK;
                                ai4Var2 = ai4VarK2;
                                ai4Var3 = ai4VarK5;
                                z10 = z3;
                                r3 = i6;
                                r4 = i5;
                                i21 = i17;
                            } else {
                                hb0Var4 = hb0Var;
                                ai4Var = ai4VarK;
                                ai4Var2 = ai4VarK2;
                                ai4Var3 = ai4VarK5;
                                z10 = z3;
                                r3 = i6;
                                r4 = i5;
                                i21 = i17;
                            }
                            if (z) {
                                ai4Var4 = r33;
                                ai4Var5 = ai4VarK4;
                                ai4Var6 = ai4Var3;
                                i22 = 0;
                                i23 = 8;
                                z11 = true;
                                i24 = 1;
                            } else {
                                ai4Var4 = r33;
                                ai4Var5 = ai4VarK4;
                                ai4Var6 = ai4Var3;
                                i22 = 0;
                                i23 = 8;
                                z11 = true;
                                i24 = 1;
                            }
                            if (this.p == 2) {
                                i24 = i22;
                            }
                            if (i24 != 0) {
                                ai4Var7 = ai4Var4;
                            } else {
                                ai4Var7 = ai4Var4;
                            }
                            if (z7) {
                                i25 = this.A;
                                f2 = this.B;
                                if (i25 == 1) {
                                    pi piVarL5 = eb2Var2.l();
                                    piVarL5.d.g(ai4Var5, -1.0f);
                                    piVarL5.d.g(ai4Var7, 1.0f);
                                    piVarL5.d.g(ai4Var2, f2);
                                    piVarL5.d.g(ai4Var, -f2);
                                    eb2Var2.c(piVarL5);
                                } else {
                                    pi piVarL6 = eb2Var2.l();
                                    piVarL6.d.g(ai4Var2, -1.0f);
                                    piVarL6.d.g(ai4Var, 1.0f);
                                    piVarL6.d.g(ai4Var5, f2);
                                    piVarL6.d.g(ai4Var7, -f2);
                                    eb2Var2.c(piVarL6);
                                }
                            }
                            if (hb0Var3.f()) {
                                jc0 jc0Var5 = hb0Var3.f.d;
                                float radians2 = (float) Math.toRadians(this.D + 90.0f);
                                int iD2 = hb0Var3.d();
                                ai4 ai4VarK14 = eb2Var2.k(g(2));
                                ai4 ai4VarK15 = eb2Var2.k(g(3));
                                ai4 ai4VarK16 = eb2Var2.k(g(4));
                                ai4 ai4VarK17 = eb2Var2.k(g(5));
                                ai4 ai4VarK18 = eb2Var2.k(jc0Var5.g(2));
                                ai4 ai4VarK19 = eb2Var2.k(jc0Var5.g(3));
                                ai4 ai4VarK110 = eb2Var2.k(jc0Var5.g(4));
                                ai4 ai4VarK111 = eb2Var2.k(jc0Var5.g(5));
                                pi piVarL7 = eb2Var2.l();
                                double d3 = radians2;
                                double dSin2 = Math.sin(d3);
                                double d4 = iD2;
                                piVarL7.d.g(ai4VarK19, 0.5f);
                                piVarL7.d.g(ai4VarK111, 0.5f);
                                piVarL7.d.g(ai4VarK15, -0.5f);
                                piVarL7.d.g(ai4VarK17, -0.5f);
                                piVarL7.b = -((float) (dSin2 * d4));
                                eb2Var2.c(piVarL7);
                                pi piVarL8 = eb2Var2.l();
                                float fCos2 = (float) (Math.cos(d3) * d4);
                                piVarL8.d.g(ai4VarK18, 0.5f);
                                piVarL8.d.g(ai4VarK110, 0.5f);
                                piVarL8.d.g(ai4VarK14, -0.5f);
                                piVarL8.d.g(ai4VarK16, -0.5f);
                                piVarL8.b = -fCos2;
                                eb2Var2.c(piVarL8);
                            }
                            this.k = false;
                            this.l = false;
                        }
                        if (i13 != 3 && i27 == 3) {
                            this.A = 1;
                            if (i33 == -1) {
                                this.B = 1.0f / f;
                            }
                            i16 = (int) (this.B * i7);
                            if (i12 != 3) {
                                i17 = i17;
                                i18 = 4;
                            }
                        }
                        z7 = true;
                        i18 = i27;
                        int[] iArr6 = this.t;
                        iArr6[0] = i17;
                        iArr6[1] = i18;
                        if (z7) {
                            int i35 = this.A;
                            i19 = -1;
                            boolean z20 = i35 != 0 || i35 == -1;
                            if (z7 || !((i26 = this.A) == 1 || i26 == i19)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof kc0)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            hb0Var3 = this.O;
                            boolean z110 = !hb0Var3.f();
                            char c3 = '\b';
                            boolean z111 = zArr[0];
                            boolean z112 = zArr[1];
                            i20 = this.o;
                            int[] iArr7 = this.C;
                            if (i20 != 2 || this.k) {
                                hb0Var4 = hb0Var;
                                ai4Var = ai4VarK;
                                ai4Var2 = ai4VarK2;
                                ai4Var3 = ai4VarK5;
                                z10 = z3;
                                r3 = i6;
                                r4 = i5;
                                i21 = i17;
                            } else {
                                if (z && (up1Var = this.d) != null) {
                                    yo0 yo0Var2 = up1Var.h;
                                    if (yo0Var2.j && up1Var.i.j) {
                                        if (z) {
                                            eb2Var2.d(ai4VarK, yo0Var2.g);
                                            eb2Var2.d(ai4VarK2, this.d.i.g);
                                            if (this.S != null && i6 != 0 && zArr3[0] && !v()) {
                                                eb2Var2.f(eb2Var2.k(this.S.J), ai4VarK2, 0, 8);
                                            }
                                        }
                                        hb0Var4 = hb0Var;
                                        ai4Var = ai4VarK;
                                        ai4Var2 = ai4VarK2;
                                        ai4Var3 = ai4VarK5;
                                        z10 = z3;
                                        r3 = i6;
                                        r4 = i5;
                                        i21 = i17;
                                    } else {
                                        c3 = '\b';
                                    }
                                }
                                jc0 jc0Var6 = this.S;
                                ai4 ai4VarK20 = jc0Var6 != null ? eb2Var2.k(jc0Var6.J) : null;
                                jc0 jc0Var7 = this.S;
                                ai4 ai4VarK21 = jc0Var7 != null ? eb2Var2.k(jc0Var7.H) : null;
                                ?? r5 = i6;
                                i21 = i17;
                                z10 = z3;
                                boolean z21 = z20;
                                ai4Var = ai4VarK;
                                ?? r6 = i5;
                                ai4Var2 = ai4VarK2;
                                hb0Var4 = hb0Var;
                                ai4Var3 = ai4VarK5;
                                eb2Var2 = eb2Var;
                                d(eb2Var2, true, r5, r6, zArr3[0], ai4VarK21, ai4VarK20, iArr[0], z9, this.H, this.J, this.X, i8, this.a0, iArr7[0], this.c0, z21, iArr[1] == 3, z10, z4, z111, i21, i18, this.u, this.v, this.w, z110);
                                r3 = r5;
                                r4 = r6;
                            }
                            if (z || (w45Var = this.e) == null) {
                                ai4Var4 = r33;
                                ai4Var5 = ai4VarK4;
                                ai4Var6 = ai4Var3;
                                i22 = 0;
                                i23 = 8;
                                z11 = true;
                                i24 = 1;
                            } else {
                                yo0 yo0Var3 = w45Var.h;
                                if (yo0Var3.j && w45Var.i.j) {
                                    int i36 = yo0Var3.g;
                                    ai4Var4 = ai4VarK3;
                                    eb2Var2.d(ai4Var4, i36);
                                    ai4Var5 = ai4VarK4;
                                    eb2Var2.d(ai4Var5, this.e.i.g);
                                    ai4Var6 = ai4Var3;
                                    eb2Var2.d(ai4Var6, this.e.k.g);
                                    jc0 jc0Var8 = this.S;
                                    if (jc0Var8 == null || z4 || r4 == 0) {
                                        i22 = 0;
                                        i23 = 8;
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        z12 = true;
                                        if (zArr3[1]) {
                                            i22 = 0;
                                            i23 = 8;
                                            eb2Var2.f(eb2Var2.k(jc0Var8.K), ai4Var5, 0, 8);
                                        } else {
                                            i22 = 0;
                                            i23 = 8;
                                        }
                                    }
                                    i24 = i22;
                                    z11 = z12;
                                } else {
                                    ai4Var4 = r33;
                                    ai4Var5 = ai4VarK4;
                                    ai4Var6 = ai4Var3;
                                    i22 = 0;
                                    i23 = 8;
                                    z11 = true;
                                    i24 = 1;
                                }
                            }
                            if (this.p == 2) {
                                i24 = i22;
                            }
                            if (i24 != 0 || this.l) {
                                ai4Var7 = ai4Var4;
                            } else {
                                int i37 = (iArr[z11 ? 1 : 0] == 2 && (this instanceof kc0)) ? z11 ? 1 : 0 : i22;
                                int i38 = i37 != 0 ? i22 : i16;
                                jc0 jc0Var9 = this.S;
                                ai4 ai4VarK22 = jc0Var9 != null ? eb2Var2.k(jc0Var9.K) : null;
                                jc0 jc0Var10 = this.S;
                                ai4 ai4VarK23 = jc0Var10 != null ? eb2Var2.k(jc0Var10.I) : null;
                                int i39 = this.Z;
                                if (i39 > 0 || this.f0 == i23) {
                                    r27 = z110;
                                    hb0 hb0Var10 = hb0Var4;
                                    if (hb0Var10.f != null) {
                                        eb2Var2.e(ai4Var6, ai4Var4, i39, i23);
                                        eb2Var2.e(ai4Var6, eb2Var2.k(hb0Var10.f), hb0Var10.d(), i23);
                                        if (r4 != 0) {
                                            eb2Var2.f(ai4VarK22, eb2Var2.k(hb0Var2), i22, 5);
                                        }
                                        r27 = i22;
                                    } else if (this.f0 == i23) {
                                        eb2Var2.e(ai4Var6, ai4Var4, hb0Var10.d(), i23);
                                        r27 = z110;
                                    } else {
                                        eb2Var2.e(ai4Var6, ai4Var4, i39, i23);
                                        r27 = z110;
                                    }
                                }
                                r27 = z110;
                                boolean z22 = zArr3[z11 ? 1 : 0];
                                int i40 = i22;
                                int i41 = iArr[z11 ? 1 : 0];
                                int i42 = this.Y;
                                int i43 = this.b0;
                                int i44 = iArr7[z11 ? 1 : 0];
                                float f3 = this.d0;
                                int i45 = iArr[i40];
                                boolean z23 = z11 ? 1 : 0;
                                ?? r18 = z11;
                                if (i45 != 3) {
                                    r18 = i40;
                                }
                                ai4Var7 = ai4Var4;
                                eb2Var2 = eb2Var;
                                d(eb2Var2, false, r4, r3, z22, ai4VarK23, ai4VarK22, i41, i37, this.I, this.K, i42, i38, i43, i44, f3, z8, r18, z4, z10, z112, i18, i21, this.x, this.y, this.z, r27);
                            }
                            if (z7) {
                                i25 = this.A;
                                f2 = this.B;
                                if (i25 == 1) {
                                    pi piVarL9 = eb2Var2.l();
                                    piVarL9.d.g(ai4Var5, -1.0f);
                                    piVarL9.d.g(ai4Var7, 1.0f);
                                    piVarL9.d.g(ai4Var2, f2);
                                    piVarL9.d.g(ai4Var, -f2);
                                    eb2Var2.c(piVarL9);
                                } else {
                                    pi piVarL10 = eb2Var2.l();
                                    piVarL10.d.g(ai4Var2, -1.0f);
                                    piVarL10.d.g(ai4Var, 1.0f);
                                    piVarL10.d.g(ai4Var5, f2);
                                    piVarL10.d.g(ai4Var7, -f2);
                                    eb2Var2.c(piVarL10);
                                }
                            }
                            if (hb0Var3.f()) {
                                jc0 jc0Var11 = hb0Var3.f.d;
                                float radians3 = (float) Math.toRadians(this.D + 90.0f);
                                int iD3 = hb0Var3.d();
                                ai4 ai4VarK112 = eb2Var2.k(g(2));
                                ai4 ai4VarK113 = eb2Var2.k(g(3));
                                ai4 ai4VarK114 = eb2Var2.k(g(4));
                                ai4 ai4VarK115 = eb2Var2.k(g(5));
                                ai4 ai4VarK116 = eb2Var2.k(jc0Var11.g(2));
                                ai4 ai4VarK117 = eb2Var2.k(jc0Var11.g(3));
                                ai4 ai4VarK118 = eb2Var2.k(jc0Var11.g(4));
                                ai4 ai4VarK119 = eb2Var2.k(jc0Var11.g(5));
                                pi piVarL11 = eb2Var2.l();
                                double d5 = radians3;
                                double dSin3 = Math.sin(d5);
                                double d6 = iD3;
                                piVarL11.d.g(ai4VarK117, 0.5f);
                                piVarL11.d.g(ai4VarK119, 0.5f);
                                piVarL11.d.g(ai4VarK113, -0.5f);
                                piVarL11.d.g(ai4VarK115, -0.5f);
                                piVarL11.b = -((float) (dSin3 * d6));
                                eb2Var2.c(piVarL11);
                                pi piVarL12 = eb2Var2.l();
                                float fCos3 = (float) (Math.cos(d5) * d6);
                                piVarL12.d.g(ai4VarK116, 0.5f);
                                piVarL12.d.g(ai4VarK118, 0.5f);
                                piVarL12.d.g(ai4VarK112, -0.5f);
                                piVarL12.d.g(ai4VarK114, -0.5f);
                                piVarL12.b = -fCos3;
                                eb2Var2.c(piVarL12);
                            }
                            this.k = false;
                            this.l = false;
                        }
                        i19 = -1;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (iArr[0] == 2) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        hb0Var3 = this.O;
                        boolean z113 = !hb0Var3.f();
                        char c4 = '\b';
                        boolean z114 = zArr[0];
                        boolean z115 = zArr[1];
                        i20 = this.o;
                        int[] iArr8 = this.C;
                        if (i20 != 2) {
                            hb0Var4 = hb0Var;
                            ai4Var = ai4VarK;
                            ai4Var2 = ai4VarK2;
                            ai4Var3 = ai4VarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        } else {
                            hb0Var4 = hb0Var;
                            ai4Var = ai4VarK;
                            ai4Var2 = ai4VarK2;
                            ai4Var3 = ai4VarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        }
                        if (z) {
                            ai4Var4 = r33;
                            ai4Var5 = ai4VarK4;
                            ai4Var6 = ai4Var3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        } else {
                            ai4Var4 = r33;
                            ai4Var5 = ai4VarK4;
                            ai4Var6 = ai4Var3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        }
                        if (this.p == 2) {
                            i24 = i22;
                        }
                        if (i24 != 0) {
                            ai4Var7 = ai4Var4;
                        } else {
                            ai4Var7 = ai4Var4;
                        }
                        if (z7) {
                            i25 = this.A;
                            f2 = this.B;
                            if (i25 == 1) {
                                pi piVarL13 = eb2Var2.l();
                                piVarL13.d.g(ai4Var5, -1.0f);
                                piVarL13.d.g(ai4Var7, 1.0f);
                                piVarL13.d.g(ai4Var2, f2);
                                piVarL13.d.g(ai4Var, -f2);
                                eb2Var2.c(piVarL13);
                            } else {
                                pi piVarL14 = eb2Var2.l();
                                piVarL14.d.g(ai4Var2, -1.0f);
                                piVarL14.d.g(ai4Var, 1.0f);
                                piVarL14.d.g(ai4Var5, f2);
                                piVarL14.d.g(ai4Var7, -f2);
                                eb2Var2.c(piVarL14);
                            }
                        }
                        if (hb0Var3.f()) {
                            jc0 jc0Var12 = hb0Var3.f.d;
                            float radians4 = (float) Math.toRadians(this.D + 90.0f);
                            int iD4 = hb0Var3.d();
                            ai4 ai4VarK1110 = eb2Var2.k(g(2));
                            ai4 ai4VarK1111 = eb2Var2.k(g(3));
                            ai4 ai4VarK1112 = eb2Var2.k(g(4));
                            ai4 ai4VarK1113 = eb2Var2.k(g(5));
                            ai4 ai4VarK1114 = eb2Var2.k(jc0Var12.g(2));
                            ai4 ai4VarK1115 = eb2Var2.k(jc0Var12.g(3));
                            ai4 ai4VarK1116 = eb2Var2.k(jc0Var12.g(4));
                            ai4 ai4VarK1117 = eb2Var2.k(jc0Var12.g(5));
                            pi piVarL15 = eb2Var2.l();
                            double d7 = radians4;
                            double dSin4 = Math.sin(d7);
                            double d8 = iD4;
                            piVarL15.d.g(ai4VarK1115, 0.5f);
                            piVarL15.d.g(ai4VarK1117, 0.5f);
                            piVarL15.d.g(ai4VarK1111, -0.5f);
                            piVarL15.d.g(ai4VarK1113, -0.5f);
                            piVarL15.b = -((float) (dSin4 * d8));
                            eb2Var2.c(piVarL15);
                            pi piVarL16 = eb2Var2.l();
                            float fCos4 = (float) (Math.cos(d7) * d8);
                            piVarL16.d.g(ai4VarK1114, 0.5f);
                            piVarL16.d.g(ai4VarK1116, 0.5f);
                            piVarL16.d.g(ai4VarK1110, -0.5f);
                            piVarL16.d.g(ai4VarK1112, -0.5f);
                            piVarL16.b = -fCos4;
                            eb2Var2.c(piVarL16);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    if (i33 == -1) {
                        if (z5 && !z6) {
                            this.A = 0;
                        } else if (!z5 && z6) {
                            this.A = 1;
                            if (i33 == -1) {
                                this.B = 1.0f / f;
                            }
                        }
                    }
                    if (this.A == 0 && (!hb0Var7.f() || !hb0Var2.f())) {
                        this.A = 1;
                    } else if (this.A == 1 && (!hb0Var5.f() || !hb0Var6.f())) {
                        this.A = 0;
                    }
                    if (this.A == -1 && (!hb0Var7.f() || !hb0Var2.f() || !hb0Var5.f() || !hb0Var6.f())) {
                        if (hb0Var7.f() && hb0Var2.f()) {
                            this.A = 0;
                        } else if (hb0Var5.f() && hb0Var6.f()) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    if (this.A == -1) {
                        int i46 = this.u;
                        if (i46 > 0 && this.x == 0) {
                            this.A = 0;
                        } else if (i46 == 0 && this.x > 0) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    i16 = i11;
                    z7 = true;
                    i18 = i27;
                    int[] iArr9 = this.t;
                    iArr9[0] = i17;
                    iArr9[1] = i18;
                    if (z7) {
                        int i310 = this.A;
                        i19 = -1;
                        if (i310 != 0) {
                        }
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (iArr[0] == 2) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        hb0Var3 = this.O;
                        boolean z116 = !hb0Var3.f();
                        char c5 = '\b';
                        boolean z117 = zArr[0];
                        boolean z118 = zArr[1];
                        i20 = this.o;
                        int[] iArr10 = this.C;
                        if (i20 != 2) {
                            hb0Var4 = hb0Var;
                            ai4Var = ai4VarK;
                            ai4Var2 = ai4VarK2;
                            ai4Var3 = ai4VarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        } else {
                            hb0Var4 = hb0Var;
                            ai4Var = ai4VarK;
                            ai4Var2 = ai4VarK2;
                            ai4Var3 = ai4VarK5;
                            z10 = z3;
                            r3 = i6;
                            r4 = i5;
                            i21 = i17;
                        }
                        if (z) {
                            ai4Var4 = r33;
                            ai4Var5 = ai4VarK4;
                            ai4Var6 = ai4Var3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        } else {
                            ai4Var4 = r33;
                            ai4Var5 = ai4VarK4;
                            ai4Var6 = ai4Var3;
                            i22 = 0;
                            i23 = 8;
                            z11 = true;
                            i24 = 1;
                        }
                        if (this.p == 2) {
                            i24 = i22;
                        }
                        if (i24 != 0) {
                            ai4Var7 = ai4Var4;
                        } else {
                            ai4Var7 = ai4Var4;
                        }
                        if (z7) {
                            i25 = this.A;
                            f2 = this.B;
                            if (i25 == 1) {
                                pi piVarL17 = eb2Var2.l();
                                piVarL17.d.g(ai4Var5, -1.0f);
                                piVarL17.d.g(ai4Var7, 1.0f);
                                piVarL17.d.g(ai4Var2, f2);
                                piVarL17.d.g(ai4Var, -f2);
                                eb2Var2.c(piVarL17);
                            } else {
                                pi piVarL18 = eb2Var2.l();
                                piVarL18.d.g(ai4Var2, -1.0f);
                                piVarL18.d.g(ai4Var, 1.0f);
                                piVarL18.d.g(ai4Var5, f2);
                                piVarL18.d.g(ai4Var7, -f2);
                                eb2Var2.c(piVarL18);
                            }
                        }
                        if (hb0Var3.f()) {
                            jc0 jc0Var13 = hb0Var3.f.d;
                            float radians5 = (float) Math.toRadians(this.D + 90.0f);
                            int iD5 = hb0Var3.d();
                            ai4 ai4VarK1118 = eb2Var2.k(g(2));
                            ai4 ai4VarK1119 = eb2Var2.k(g(3));
                            ai4 ai4VarK11110 = eb2Var2.k(g(4));
                            ai4 ai4VarK11111 = eb2Var2.k(g(5));
                            ai4 ai4VarK11112 = eb2Var2.k(jc0Var13.g(2));
                            ai4 ai4VarK11113 = eb2Var2.k(jc0Var13.g(3));
                            ai4 ai4VarK11114 = eb2Var2.k(jc0Var13.g(4));
                            ai4 ai4VarK11115 = eb2Var2.k(jc0Var13.g(5));
                            pi piVarL19 = eb2Var2.l();
                            double d9 = radians5;
                            double dSin5 = Math.sin(d9);
                            double d10 = iD5;
                            piVarL19.d.g(ai4VarK11113, 0.5f);
                            piVarL19.d.g(ai4VarK11115, 0.5f);
                            piVarL19.d.g(ai4VarK1119, -0.5f);
                            piVarL19.d.g(ai4VarK11111, -0.5f);
                            piVarL19.b = -((float) (dSin5 * d10));
                            eb2Var2.c(piVarL19);
                            pi piVarL110 = eb2Var2.l();
                            float fCos5 = (float) (Math.cos(d9) * d10);
                            piVarL110.d.g(ai4VarK11112, 0.5f);
                            piVarL110.d.g(ai4VarK11114, 0.5f);
                            piVarL110.d.g(ai4VarK1118, -0.5f);
                            piVarL110.d.g(ai4VarK11110, -0.5f);
                            piVarL110.b = -fCos5;
                            eb2Var2.c(piVarL110);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    i19 = -1;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (iArr[0] == 2) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    hb0Var3 = this.O;
                    boolean z119 = !hb0Var3.f();
                    char c6 = '\b';
                    boolean z1110 = zArr[0];
                    boolean z1111 = zArr[1];
                    i20 = this.o;
                    int[] iArr11 = this.C;
                    if (i20 != 2) {
                        hb0Var4 = hb0Var;
                        ai4Var = ai4VarK;
                        ai4Var2 = ai4VarK2;
                        ai4Var3 = ai4VarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    } else {
                        hb0Var4 = hb0Var;
                        ai4Var = ai4VarK;
                        ai4Var2 = ai4VarK2;
                        ai4Var3 = ai4VarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    }
                    if (z) {
                        ai4Var4 = r33;
                        ai4Var5 = ai4VarK4;
                        ai4Var6 = ai4Var3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    } else {
                        ai4Var4 = r33;
                        ai4Var5 = ai4VarK4;
                        ai4Var6 = ai4Var3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    }
                    if (this.p == 2) {
                        i24 = i22;
                    }
                    if (i24 != 0) {
                        ai4Var7 = ai4Var4;
                    } else {
                        ai4Var7 = ai4Var4;
                    }
                    if (z7) {
                        i25 = this.A;
                        f2 = this.B;
                        if (i25 == 1) {
                            pi piVarL111 = eb2Var2.l();
                            piVarL111.d.g(ai4Var5, -1.0f);
                            piVarL111.d.g(ai4Var7, 1.0f);
                            piVarL111.d.g(ai4Var2, f2);
                            piVarL111.d.g(ai4Var, -f2);
                            eb2Var2.c(piVarL111);
                        } else {
                            pi piVarL112 = eb2Var2.l();
                            piVarL112.d.g(ai4Var2, -1.0f);
                            piVarL112.d.g(ai4Var, 1.0f);
                            piVarL112.d.g(ai4Var5, f2);
                            piVarL112.d.g(ai4Var7, -f2);
                            eb2Var2.c(piVarL112);
                        }
                    }
                    if (hb0Var3.f()) {
                        jc0 jc0Var14 = hb0Var3.f.d;
                        float radians6 = (float) Math.toRadians(this.D + 90.0f);
                        int iD6 = hb0Var3.d();
                        ai4 ai4VarK11116 = eb2Var2.k(g(2));
                        ai4 ai4VarK11117 = eb2Var2.k(g(3));
                        ai4 ai4VarK11118 = eb2Var2.k(g(4));
                        ai4 ai4VarK11119 = eb2Var2.k(g(5));
                        ai4 ai4VarK111110 = eb2Var2.k(jc0Var14.g(2));
                        ai4 ai4VarK111111 = eb2Var2.k(jc0Var14.g(3));
                        ai4 ai4VarK111112 = eb2Var2.k(jc0Var14.g(4));
                        ai4 ai4VarK111113 = eb2Var2.k(jc0Var14.g(5));
                        pi piVarL113 = eb2Var2.l();
                        double d11 = radians6;
                        double dSin6 = Math.sin(d11);
                        double d12 = iD6;
                        piVarL113.d.g(ai4VarK111111, 0.5f);
                        piVarL113.d.g(ai4VarK111113, 0.5f);
                        piVarL113.d.g(ai4VarK11117, -0.5f);
                        piVarL113.d.g(ai4VarK11119, -0.5f);
                        piVarL113.b = -((float) (dSin6 * d12));
                        eb2Var2.c(piVarL113);
                        pi piVarL114 = eb2Var2.l();
                        float fCos6 = (float) (Math.cos(d11) * d12);
                        piVarL114.d.g(ai4VarK111110, 0.5f);
                        piVarL114.d.g(ai4VarK111112, 0.5f);
                        piVarL114.d.g(ai4VarK11116, -0.5f);
                        piVarL114.d.g(ai4VarK11118, -0.5f);
                        piVarL114.b = -fCos6;
                        eb2Var2.c(piVarL114);
                    }
                    this.k = false;
                    this.l = false;
                }
                z7 = false;
                int[] iArr12 = this.t;
                iArr12[0] = i17;
                iArr12[1] = i18;
                if (z7) {
                    int i311 = this.A;
                    i19 = -1;
                    if (i311 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (iArr[0] == 2) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    hb0Var3 = this.O;
                    boolean z1112 = !hb0Var3.f();
                    char c7 = '\b';
                    boolean z1113 = zArr[0];
                    boolean z1114 = zArr[1];
                    i20 = this.o;
                    int[] iArr13 = this.C;
                    if (i20 != 2) {
                        hb0Var4 = hb0Var;
                        ai4Var = ai4VarK;
                        ai4Var2 = ai4VarK2;
                        ai4Var3 = ai4VarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    } else {
                        hb0Var4 = hb0Var;
                        ai4Var = ai4VarK;
                        ai4Var2 = ai4VarK2;
                        ai4Var3 = ai4VarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    }
                    if (z) {
                        ai4Var4 = r33;
                        ai4Var5 = ai4VarK4;
                        ai4Var6 = ai4Var3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    } else {
                        ai4Var4 = r33;
                        ai4Var5 = ai4VarK4;
                        ai4Var6 = ai4Var3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    }
                    if (this.p == 2) {
                        i24 = i22;
                    }
                    if (i24 != 0) {
                        ai4Var7 = ai4Var4;
                    } else {
                        ai4Var7 = ai4Var4;
                    }
                    if (z7) {
                        i25 = this.A;
                        f2 = this.B;
                        if (i25 == 1) {
                            pi piVarL115 = eb2Var2.l();
                            piVarL115.d.g(ai4Var5, -1.0f);
                            piVarL115.d.g(ai4Var7, 1.0f);
                            piVarL115.d.g(ai4Var2, f2);
                            piVarL115.d.g(ai4Var, -f2);
                            eb2Var2.c(piVarL115);
                        } else {
                            pi piVarL116 = eb2Var2.l();
                            piVarL116.d.g(ai4Var2, -1.0f);
                            piVarL116.d.g(ai4Var, 1.0f);
                            piVarL116.d.g(ai4Var5, f2);
                            piVarL116.d.g(ai4Var7, -f2);
                            eb2Var2.c(piVarL116);
                        }
                    }
                    if (hb0Var3.f()) {
                        jc0 jc0Var15 = hb0Var3.f.d;
                        float radians7 = (float) Math.toRadians(this.D + 90.0f);
                        int iD7 = hb0Var3.d();
                        ai4 ai4VarK111114 = eb2Var2.k(g(2));
                        ai4 ai4VarK111115 = eb2Var2.k(g(3));
                        ai4 ai4VarK111116 = eb2Var2.k(g(4));
                        ai4 ai4VarK111117 = eb2Var2.k(g(5));
                        ai4 ai4VarK111118 = eb2Var2.k(jc0Var15.g(2));
                        ai4 ai4VarK111119 = eb2Var2.k(jc0Var15.g(3));
                        ai4 ai4VarK1111110 = eb2Var2.k(jc0Var15.g(4));
                        ai4 ai4VarK1111111 = eb2Var2.k(jc0Var15.g(5));
                        pi piVarL117 = eb2Var2.l();
                        double d13 = radians7;
                        double dSin7 = Math.sin(d13);
                        double d14 = iD7;
                        piVarL117.d.g(ai4VarK111119, 0.5f);
                        piVarL117.d.g(ai4VarK1111111, 0.5f);
                        piVarL117.d.g(ai4VarK111115, -0.5f);
                        piVarL117.d.g(ai4VarK111117, -0.5f);
                        piVarL117.b = -((float) (dSin7 * d14));
                        eb2Var2.c(piVarL117);
                        pi piVarL118 = eb2Var2.l();
                        float fCos7 = (float) (Math.cos(d13) * d14);
                        piVarL118.d.g(ai4VarK111118, 0.5f);
                        piVarL118.d.g(ai4VarK1111110, 0.5f);
                        piVarL118.d.g(ai4VarK111114, -0.5f);
                        piVarL118.d.g(ai4VarK111116, -0.5f);
                        piVarL118.b = -fCos7;
                        eb2Var2.c(piVarL118);
                    }
                    this.k = false;
                    this.l = false;
                }
                i19 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                hb0Var3 = this.O;
                boolean z1115 = !hb0Var3.f();
                char c8 = '\b';
                boolean z1116 = zArr[0];
                boolean z1117 = zArr[1];
                i20 = this.o;
                int[] iArr14 = this.C;
                if (i20 != 2) {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.p == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    ai4Var7 = ai4Var4;
                } else {
                    ai4Var7 = ai4Var4;
                }
                if (z7) {
                    i25 = this.A;
                    f2 = this.B;
                    if (i25 == 1) {
                        pi piVarL119 = eb2Var2.l();
                        piVarL119.d.g(ai4Var5, -1.0f);
                        piVarL119.d.g(ai4Var7, 1.0f);
                        piVarL119.d.g(ai4Var2, f2);
                        piVarL119.d.g(ai4Var, -f2);
                        eb2Var2.c(piVarL119);
                    } else {
                        pi piVarL1110 = eb2Var2.l();
                        piVarL1110.d.g(ai4Var2, -1.0f);
                        piVarL1110.d.g(ai4Var, 1.0f);
                        piVarL1110.d.g(ai4Var5, f2);
                        piVarL1110.d.g(ai4Var7, -f2);
                        eb2Var2.c(piVarL1110);
                    }
                }
                if (hb0Var3.f()) {
                    jc0 jc0Var16 = hb0Var3.f.d;
                    float radians8 = (float) Math.toRadians(this.D + 90.0f);
                    int iD8 = hb0Var3.d();
                    ai4 ai4VarK1111112 = eb2Var2.k(g(2));
                    ai4 ai4VarK1111113 = eb2Var2.k(g(3));
                    ai4 ai4VarK1111114 = eb2Var2.k(g(4));
                    ai4 ai4VarK1111115 = eb2Var2.k(g(5));
                    ai4 ai4VarK1111116 = eb2Var2.k(jc0Var16.g(2));
                    ai4 ai4VarK1111117 = eb2Var2.k(jc0Var16.g(3));
                    ai4 ai4VarK1111118 = eb2Var2.k(jc0Var16.g(4));
                    ai4 ai4VarK1111119 = eb2Var2.k(jc0Var16.g(5));
                    pi piVarL1111 = eb2Var2.l();
                    double d15 = radians8;
                    double dSin8 = Math.sin(d15);
                    double d16 = iD8;
                    piVarL1111.d.g(ai4VarK1111117, 0.5f);
                    piVarL1111.d.g(ai4VarK1111119, 0.5f);
                    piVarL1111.d.g(ai4VarK1111113, -0.5f);
                    piVarL1111.d.g(ai4VarK1111115, -0.5f);
                    piVarL1111.b = -((float) (dSin8 * d16));
                    eb2Var2.c(piVarL1111);
                    pi piVarL1112 = eb2Var2.l();
                    float fCos8 = (float) (Math.cos(d15) * d16);
                    piVarL1112.d.g(ai4VarK1111116, 0.5f);
                    piVarL1112.d.g(ai4VarK1111118, 0.5f);
                    piVarL1112.d.g(ai4VarK1111112, -0.5f);
                    piVarL1112.d.g(ai4VarK1111114, -0.5f);
                    piVarL1112.b = -fCos8;
                    eb2Var2.c(piVarL1112);
                }
                this.k = false;
                this.l = false;
            }
            hb0Var2 = hb0Var8;
            ai4VarK4 = ai4VarK4;
            i16 = i11;
            i17 = i14;
            i18 = i15;
            z7 = false;
            int[] iArr15 = this.t;
            iArr15[0] = i17;
            iArr15[1] = i18;
            if (z7) {
                int i312 = this.A;
                i19 = -1;
                if (i312 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                hb0Var3 = this.O;
                boolean z1118 = !hb0Var3.f();
                char c9 = '\b';
                boolean z1119 = zArr[0];
                boolean z11110 = zArr[1];
                i20 = this.o;
                int[] iArr16 = this.C;
                if (i20 != 2) {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.p == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    ai4Var7 = ai4Var4;
                } else {
                    ai4Var7 = ai4Var4;
                }
                if (z7) {
                    i25 = this.A;
                    f2 = this.B;
                    if (i25 == 1) {
                        pi piVarL1113 = eb2Var2.l();
                        piVarL1113.d.g(ai4Var5, -1.0f);
                        piVarL1113.d.g(ai4Var7, 1.0f);
                        piVarL1113.d.g(ai4Var2, f2);
                        piVarL1113.d.g(ai4Var, -f2);
                        eb2Var2.c(piVarL1113);
                    } else {
                        pi piVarL1114 = eb2Var2.l();
                        piVarL1114.d.g(ai4Var2, -1.0f);
                        piVarL1114.d.g(ai4Var, 1.0f);
                        piVarL1114.d.g(ai4Var5, f2);
                        piVarL1114.d.g(ai4Var7, -f2);
                        eb2Var2.c(piVarL1114);
                    }
                }
                if (hb0Var3.f()) {
                    jc0 jc0Var17 = hb0Var3.f.d;
                    float radians9 = (float) Math.toRadians(this.D + 90.0f);
                    int iD9 = hb0Var3.d();
                    ai4 ai4VarK11111110 = eb2Var2.k(g(2));
                    ai4 ai4VarK11111111 = eb2Var2.k(g(3));
                    ai4 ai4VarK11111112 = eb2Var2.k(g(4));
                    ai4 ai4VarK11111113 = eb2Var2.k(g(5));
                    ai4 ai4VarK11111114 = eb2Var2.k(jc0Var17.g(2));
                    ai4 ai4VarK11111115 = eb2Var2.k(jc0Var17.g(3));
                    ai4 ai4VarK11111116 = eb2Var2.k(jc0Var17.g(4));
                    ai4 ai4VarK11111117 = eb2Var2.k(jc0Var17.g(5));
                    pi piVarL1115 = eb2Var2.l();
                    double d17 = radians9;
                    double dSin9 = Math.sin(d17);
                    double d18 = iD9;
                    piVarL1115.d.g(ai4VarK11111115, 0.5f);
                    piVarL1115.d.g(ai4VarK11111117, 0.5f);
                    piVarL1115.d.g(ai4VarK11111111, -0.5f);
                    piVarL1115.d.g(ai4VarK11111113, -0.5f);
                    piVarL1115.b = -((float) (dSin9 * d18));
                    eb2Var2.c(piVarL1115);
                    pi piVarL1116 = eb2Var2.l();
                    float fCos9 = (float) (Math.cos(d17) * d18);
                    piVarL1116.d.g(ai4VarK11111114, 0.5f);
                    piVarL1116.d.g(ai4VarK11111116, 0.5f);
                    piVarL1116.d.g(ai4VarK11111110, -0.5f);
                    piVarL1116.d.g(ai4VarK11111112, -0.5f);
                    piVarL1116.b = -fCos9;
                    eb2Var2.c(piVarL1116);
                }
                this.k = false;
                this.l = false;
            }
            i19 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (iArr[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            hb0Var3 = this.O;
            boolean z11111 = !hb0Var3.f();
            char c10 = '\b';
            boolean z11112 = zArr[0];
            boolean z11113 = zArr[1];
            i20 = this.o;
            int[] iArr17 = this.C;
            if (i20 != 2) {
                hb0Var4 = hb0Var;
                ai4Var = ai4VarK;
                ai4Var2 = ai4VarK2;
                ai4Var3 = ai4VarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            } else {
                hb0Var4 = hb0Var;
                ai4Var = ai4VarK;
                ai4Var2 = ai4VarK2;
                ai4Var3 = ai4VarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            }
            if (z) {
                ai4Var4 = r33;
                ai4Var5 = ai4VarK4;
                ai4Var6 = ai4Var3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            } else {
                ai4Var4 = r33;
                ai4Var5 = ai4VarK4;
                ai4Var6 = ai4Var3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            }
            if (this.p == 2) {
                i24 = i22;
            }
            if (i24 != 0) {
                ai4Var7 = ai4Var4;
            } else {
                ai4Var7 = ai4Var4;
            }
            if (z7) {
                i25 = this.A;
                f2 = this.B;
                if (i25 == 1) {
                    pi piVarL1117 = eb2Var2.l();
                    piVarL1117.d.g(ai4Var5, -1.0f);
                    piVarL1117.d.g(ai4Var7, 1.0f);
                    piVarL1117.d.g(ai4Var2, f2);
                    piVarL1117.d.g(ai4Var, -f2);
                    eb2Var2.c(piVarL1117);
                } else {
                    pi piVarL1118 = eb2Var2.l();
                    piVarL1118.d.g(ai4Var2, -1.0f);
                    piVarL1118.d.g(ai4Var, 1.0f);
                    piVarL1118.d.g(ai4Var5, f2);
                    piVarL1118.d.g(ai4Var7, -f2);
                    eb2Var2.c(piVarL1118);
                }
            }
            if (hb0Var3.f()) {
                jc0 jc0Var18 = hb0Var3.f.d;
                float radians10 = (float) Math.toRadians(this.D + 90.0f);
                int iD10 = hb0Var3.d();
                ai4 ai4VarK11111118 = eb2Var2.k(g(2));
                ai4 ai4VarK11111119 = eb2Var2.k(g(3));
                ai4 ai4VarK111111110 = eb2Var2.k(g(4));
                ai4 ai4VarK111111111 = eb2Var2.k(g(5));
                ai4 ai4VarK111111112 = eb2Var2.k(jc0Var18.g(2));
                ai4 ai4VarK111111113 = eb2Var2.k(jc0Var18.g(3));
                ai4 ai4VarK111111114 = eb2Var2.k(jc0Var18.g(4));
                ai4 ai4VarK111111115 = eb2Var2.k(jc0Var18.g(5));
                pi piVarL1119 = eb2Var2.l();
                double d19 = radians10;
                double dSin10 = Math.sin(d19);
                double d110 = iD10;
                piVarL1119.d.g(ai4VarK111111113, 0.5f);
                piVarL1119.d.g(ai4VarK111111115, 0.5f);
                piVarL1119.d.g(ai4VarK11111119, -0.5f);
                piVarL1119.d.g(ai4VarK111111111, -0.5f);
                piVarL1119.b = -((float) (dSin10 * d110));
                eb2Var2.c(piVarL1119);
                pi piVarL11110 = eb2Var2.l();
                float fCos10 = (float) (Math.cos(d19) * d110);
                piVarL11110.d.g(ai4VarK111111112, 0.5f);
                piVarL11110.d.g(ai4VarK111111114, 0.5f);
                piVarL11110.d.g(ai4VarK11111118, -0.5f);
                piVarL11110.d.g(ai4VarK111111110, -0.5f);
                piVarL11110.b = -fCos10;
                eb2Var2.c(piVarL11110);
            }
            this.k = false;
            this.l = false;
        }
        i = 0;
        i2 = i;
        i3 = i2;
        i4 = this.f0;
        zArr = this.R;
        i5 = i2;
        if (i4 == 8) {
            arrayList = this.Q;
            size = arrayList.size();
            i6 = i3;
            i29 = i;
            while (true) {
                if (i29 < size) {
                    if (!zArr[i]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i313 = size;
                hashSet2 = ((hb0) arrayList.get(i29)).a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i29++;
                size = i313;
            }
        } else {
            i6 = i3;
        }
        z2 = this.k;
        if (z2) {
            if (z2) {
                eb2Var2.d(ai4VarK, this.X);
                eb2Var2.d(ai4VarK2, this.X + this.T);
                if (i6 != 0) {
                    kc0Var2 = (kc0) jc0Var2;
                    weakReference3 = kc0Var2.G0;
                    if (weakReference3 != null) {
                        kc0Var2.G0 = new WeakReference(hb0Var5);
                    } else {
                        kc0Var2.G0 = new WeakReference(hb0Var5);
                    }
                    weakReference4 = kc0Var2.I0;
                    if (weakReference4 != null) {
                        kc0Var2.I0 = new WeakReference(hb0Var6);
                    } else {
                        kc0Var2.I0 = new WeakReference(hb0Var6);
                    }
                }
            }
            if (this.l) {
                eb2Var2.d(ai4VarK3, this.Y);
                eb2Var2.d(ai4VarK4, this.Y + this.U);
                hashSet = hb0Var9.a;
                if (hashSet != null) {
                    eb2Var2.d(ai4VarK5, this.Y + this.Z);
                }
                if (i5 != 0) {
                    kc0Var = (kc0) jc0Var;
                    weakReference = kc0Var.F0;
                    if (weakReference != null) {
                        kc0Var.F0 = new WeakReference(hb0Var7);
                    } else {
                        kc0Var.F0 = new WeakReference(hb0Var7);
                    }
                    weakReference2 = kc0Var.H0;
                    if (weakReference2 != null) {
                        kc0Var.H0 = new WeakReference(hb0Var8);
                    } else {
                        kc0Var.H0 = new WeakReference(hb0Var8);
                    }
                }
            }
            if (this.k) {
                ?? r13 = i;
                this.k = r13;
                this.l = r13;
                return;
            }
        } else {
            if (z2) {
                eb2Var2.d(ai4VarK, this.X);
                eb2Var2.d(ai4VarK2, this.X + this.T);
                if (i6 != 0) {
                    kc0Var2 = (kc0) jc0Var2;
                    weakReference3 = kc0Var2.G0;
                    if (weakReference3 != null) {
                        kc0Var2.G0 = new WeakReference(hb0Var5);
                    } else {
                        kc0Var2.G0 = new WeakReference(hb0Var5);
                    }
                    weakReference4 = kc0Var2.I0;
                    if (weakReference4 != null) {
                        kc0Var2.I0 = new WeakReference(hb0Var6);
                    } else {
                        kc0Var2.I0 = new WeakReference(hb0Var6);
                    }
                }
            }
            if (this.l) {
                eb2Var2.d(ai4VarK3, this.Y);
                eb2Var2.d(ai4VarK4, this.Y + this.U);
                hashSet = hb0Var9.a;
                if (hashSet != null) {
                    eb2Var2.d(ai4VarK5, this.Y + this.Z);
                }
                if (i5 != 0) {
                    kc0Var = (kc0) jc0Var;
                    weakReference = kc0Var.F0;
                    if (weakReference != null) {
                        kc0Var.F0 = new WeakReference(hb0Var7);
                    } else {
                        kc0Var.F0 = new WeakReference(hb0Var7);
                    }
                    weakReference2 = kc0Var.H0;
                    if (weakReference2 != null) {
                        kc0Var.H0 = new WeakReference(hb0Var8);
                    } else {
                        kc0Var.H0 = new WeakReference(hb0Var8);
                    }
                }
            }
            if (this.k) {
                ?? r14 = i;
                this.k = r14;
                this.l = r14;
                return;
            }
        }
        zArr2 = this.f;
        if (z) {
            hb0Var = hb0Var9;
            zArr3 = zArr2;
        } else {
            hb0Var = hb0Var9;
            zArr3 = zArr2;
        }
        if (this.S != null) {
            if (u(0)) {
                ((kc0) this.S).N(this, 0);
                zV = true;
                i28 = 1;
            } else {
                zV = v();
                i28 = 1;
            }
            if (u(i28)) {
                ((kc0) this.S).N(this, i28);
                zW = true;
            } else {
                zW = w();
            }
            if (zV) {
            }
            if (!zW) {
                eb2Var2.f(eb2Var2.k(this.S.K), ai4VarK4, 0, 1);
            }
            z4 = zW;
            z3 = zV;
        } else {
            hb0Var5 = hb0Var5;
            z3 = false;
            z4 = false;
        }
        i7 = this.T;
        i8 = this.a0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.U;
        i10 = this.b0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        iArr = this.o0;
        i12 = iArr[0];
        if (i12 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        i13 = iArr[1];
        if (i13 != 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i314 = this.W;
        this.A = i314;
        f = this.V;
        this.B = f;
        i14 = this.r;
        i15 = this.s;
        if (f > 0.0f) {
            hb0Var2 = hb0Var8;
            if (this.f0 != 8) {
                if (i12 == 3) {
                    i17 = i14;
                } else {
                    i17 = i14;
                }
                if (i13 == 3) {
                    i27 = i15;
                } else {
                    i27 = i15;
                }
                if (i12 == 3) {
                    if (i12 != 3) {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    } else {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    }
                } else if (i12 != 3) {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                } else {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                }
                i18 = i27;
                int[] iArr18 = this.t;
                iArr18[0] = i17;
                iArr18[1] = i18;
                if (z7) {
                    int i315 = this.A;
                    i19 = -1;
                    if (i315 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (iArr[0] == 2) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    hb0Var3 = this.O;
                    boolean z11114 = !hb0Var3.f();
                    char c11 = '\b';
                    boolean z11115 = zArr[0];
                    boolean z11116 = zArr[1];
                    i20 = this.o;
                    int[] iArr19 = this.C;
                    if (i20 != 2) {
                        hb0Var4 = hb0Var;
                        ai4Var = ai4VarK;
                        ai4Var2 = ai4VarK2;
                        ai4Var3 = ai4VarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    } else {
                        hb0Var4 = hb0Var;
                        ai4Var = ai4VarK;
                        ai4Var2 = ai4VarK2;
                        ai4Var3 = ai4VarK5;
                        z10 = z3;
                        r3 = i6;
                        r4 = i5;
                        i21 = i17;
                    }
                    if (z) {
                        ai4Var4 = r33;
                        ai4Var5 = ai4VarK4;
                        ai4Var6 = ai4Var3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    } else {
                        ai4Var4 = r33;
                        ai4Var5 = ai4VarK4;
                        ai4Var6 = ai4Var3;
                        i22 = 0;
                        i23 = 8;
                        z11 = true;
                        i24 = 1;
                    }
                    if (this.p == 2) {
                        i24 = i22;
                    }
                    if (i24 != 0) {
                        ai4Var7 = ai4Var4;
                    } else {
                        ai4Var7 = ai4Var4;
                    }
                    if (z7) {
                        i25 = this.A;
                        f2 = this.B;
                        if (i25 == 1) {
                            pi piVarL11111 = eb2Var2.l();
                            piVarL11111.d.g(ai4Var5, -1.0f);
                            piVarL11111.d.g(ai4Var7, 1.0f);
                            piVarL11111.d.g(ai4Var2, f2);
                            piVarL11111.d.g(ai4Var, -f2);
                            eb2Var2.c(piVarL11111);
                        } else {
                            pi piVarL11112 = eb2Var2.l();
                            piVarL11112.d.g(ai4Var2, -1.0f);
                            piVarL11112.d.g(ai4Var, 1.0f);
                            piVarL11112.d.g(ai4Var5, f2);
                            piVarL11112.d.g(ai4Var7, -f2);
                            eb2Var2.c(piVarL11112);
                        }
                    }
                    if (hb0Var3.f()) {
                        jc0 jc0Var19 = hb0Var3.f.d;
                        float radians11 = (float) Math.toRadians(this.D + 90.0f);
                        int iD11 = hb0Var3.d();
                        ai4 ai4VarK111111116 = eb2Var2.k(g(2));
                        ai4 ai4VarK111111117 = eb2Var2.k(g(3));
                        ai4 ai4VarK111111118 = eb2Var2.k(g(4));
                        ai4 ai4VarK111111119 = eb2Var2.k(g(5));
                        ai4 ai4VarK1111111110 = eb2Var2.k(jc0Var19.g(2));
                        ai4 ai4VarK1111111111 = eb2Var2.k(jc0Var19.g(3));
                        ai4 ai4VarK1111111112 = eb2Var2.k(jc0Var19.g(4));
                        ai4 ai4VarK1111111113 = eb2Var2.k(jc0Var19.g(5));
                        pi piVarL11113 = eb2Var2.l();
                        double d111 = radians11;
                        double dSin11 = Math.sin(d111);
                        double d112 = iD11;
                        piVarL11113.d.g(ai4VarK1111111111, 0.5f);
                        piVarL11113.d.g(ai4VarK1111111113, 0.5f);
                        piVarL11113.d.g(ai4VarK111111117, -0.5f);
                        piVarL11113.d.g(ai4VarK111111119, -0.5f);
                        piVarL11113.b = -((float) (dSin11 * d112));
                        eb2Var2.c(piVarL11113);
                        pi piVarL11114 = eb2Var2.l();
                        float fCos11 = (float) (Math.cos(d111) * d112);
                        piVarL11114.d.g(ai4VarK1111111110, 0.5f);
                        piVarL11114.d.g(ai4VarK1111111112, 0.5f);
                        piVarL11114.d.g(ai4VarK111111116, -0.5f);
                        piVarL11114.d.g(ai4VarK111111118, -0.5f);
                        piVarL11114.b = -fCos11;
                        eb2Var2.c(piVarL11114);
                    }
                    this.k = false;
                    this.l = false;
                }
                i19 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                hb0Var3 = this.O;
                boolean z11117 = !hb0Var3.f();
                char c12 = '\b';
                boolean z11118 = zArr[0];
                boolean z11119 = zArr[1];
                i20 = this.o;
                int[] iArr110 = this.C;
                if (i20 != 2) {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.p == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    ai4Var7 = ai4Var4;
                } else {
                    ai4Var7 = ai4Var4;
                }
                if (z7) {
                    i25 = this.A;
                    f2 = this.B;
                    if (i25 == 1) {
                        pi piVarL11115 = eb2Var2.l();
                        piVarL11115.d.g(ai4Var5, -1.0f);
                        piVarL11115.d.g(ai4Var7, 1.0f);
                        piVarL11115.d.g(ai4Var2, f2);
                        piVarL11115.d.g(ai4Var, -f2);
                        eb2Var2.c(piVarL11115);
                    } else {
                        pi piVarL11116 = eb2Var2.l();
                        piVarL11116.d.g(ai4Var2, -1.0f);
                        piVarL11116.d.g(ai4Var, 1.0f);
                        piVarL11116.d.g(ai4Var5, f2);
                        piVarL11116.d.g(ai4Var7, -f2);
                        eb2Var2.c(piVarL11116);
                    }
                }
                if (hb0Var3.f()) {
                    jc0 jc0Var110 = hb0Var3.f.d;
                    float radians12 = (float) Math.toRadians(this.D + 90.0f);
                    int iD12 = hb0Var3.d();
                    ai4 ai4VarK1111111114 = eb2Var2.k(g(2));
                    ai4 ai4VarK1111111115 = eb2Var2.k(g(3));
                    ai4 ai4VarK1111111116 = eb2Var2.k(g(4));
                    ai4 ai4VarK1111111117 = eb2Var2.k(g(5));
                    ai4 ai4VarK1111111118 = eb2Var2.k(jc0Var110.g(2));
                    ai4 ai4VarK1111111119 = eb2Var2.k(jc0Var110.g(3));
                    ai4 ai4VarK11111111110 = eb2Var2.k(jc0Var110.g(4));
                    ai4 ai4VarK11111111111 = eb2Var2.k(jc0Var110.g(5));
                    pi piVarL11117 = eb2Var2.l();
                    double d113 = radians12;
                    double dSin12 = Math.sin(d113);
                    double d114 = iD12;
                    piVarL11117.d.g(ai4VarK1111111119, 0.5f);
                    piVarL11117.d.g(ai4VarK11111111111, 0.5f);
                    piVarL11117.d.g(ai4VarK1111111115, -0.5f);
                    piVarL11117.d.g(ai4VarK1111111117, -0.5f);
                    piVarL11117.b = -((float) (dSin12 * d114));
                    eb2Var2.c(piVarL11117);
                    pi piVarL11118 = eb2Var2.l();
                    float fCos12 = (float) (Math.cos(d113) * d114);
                    piVarL11118.d.g(ai4VarK1111111118, 0.5f);
                    piVarL11118.d.g(ai4VarK11111111110, 0.5f);
                    piVarL11118.d.g(ai4VarK1111111114, -0.5f);
                    piVarL11118.d.g(ai4VarK1111111116, -0.5f);
                    piVarL11118.b = -fCos12;
                    eb2Var2.c(piVarL11118);
                }
                this.k = false;
                this.l = false;
            }
            z7 = false;
            int[] iArr111 = this.t;
            iArr111[0] = i17;
            iArr111[1] = i18;
            if (z7) {
                int i316 = this.A;
                i19 = -1;
                if (i316 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (iArr[0] == 2) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                hb0Var3 = this.O;
                boolean z111110 = !hb0Var3.f();
                char c13 = '\b';
                boolean z111111 = zArr[0];
                boolean z111112 = zArr[1];
                i20 = this.o;
                int[] iArr112 = this.C;
                if (i20 != 2) {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                } else {
                    hb0Var4 = hb0Var;
                    ai4Var = ai4VarK;
                    ai4Var2 = ai4VarK2;
                    ai4Var3 = ai4VarK5;
                    z10 = z3;
                    r3 = i6;
                    r4 = i5;
                    i21 = i17;
                }
                if (z) {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                } else {
                    ai4Var4 = r33;
                    ai4Var5 = ai4VarK4;
                    ai4Var6 = ai4Var3;
                    i22 = 0;
                    i23 = 8;
                    z11 = true;
                    i24 = 1;
                }
                if (this.p == 2) {
                    i24 = i22;
                }
                if (i24 != 0) {
                    ai4Var7 = ai4Var4;
                } else {
                    ai4Var7 = ai4Var4;
                }
                if (z7) {
                    i25 = this.A;
                    f2 = this.B;
                    if (i25 == 1) {
                        pi piVarL11119 = eb2Var2.l();
                        piVarL11119.d.g(ai4Var5, -1.0f);
                        piVarL11119.d.g(ai4Var7, 1.0f);
                        piVarL11119.d.g(ai4Var2, f2);
                        piVarL11119.d.g(ai4Var, -f2);
                        eb2Var2.c(piVarL11119);
                    } else {
                        pi piVarL111110 = eb2Var2.l();
                        piVarL111110.d.g(ai4Var2, -1.0f);
                        piVarL111110.d.g(ai4Var, 1.0f);
                        piVarL111110.d.g(ai4Var5, f2);
                        piVarL111110.d.g(ai4Var7, -f2);
                        eb2Var2.c(piVarL111110);
                    }
                }
                if (hb0Var3.f()) {
                    jc0 jc0Var111 = hb0Var3.f.d;
                    float radians13 = (float) Math.toRadians(this.D + 90.0f);
                    int iD13 = hb0Var3.d();
                    ai4 ai4VarK11111111112 = eb2Var2.k(g(2));
                    ai4 ai4VarK11111111113 = eb2Var2.k(g(3));
                    ai4 ai4VarK11111111114 = eb2Var2.k(g(4));
                    ai4 ai4VarK11111111115 = eb2Var2.k(g(5));
                    ai4 ai4VarK11111111116 = eb2Var2.k(jc0Var111.g(2));
                    ai4 ai4VarK11111111117 = eb2Var2.k(jc0Var111.g(3));
                    ai4 ai4VarK11111111118 = eb2Var2.k(jc0Var111.g(4));
                    ai4 ai4VarK11111111119 = eb2Var2.k(jc0Var111.g(5));
                    pi piVarL111111 = eb2Var2.l();
                    double d115 = radians13;
                    double dSin13 = Math.sin(d115);
                    double d116 = iD13;
                    piVarL111111.d.g(ai4VarK11111111117, 0.5f);
                    piVarL111111.d.g(ai4VarK11111111119, 0.5f);
                    piVarL111111.d.g(ai4VarK11111111113, -0.5f);
                    piVarL111111.d.g(ai4VarK11111111115, -0.5f);
                    piVarL111111.b = -((float) (dSin13 * d116));
                    eb2Var2.c(piVarL111111);
                    pi piVarL111112 = eb2Var2.l();
                    float fCos13 = (float) (Math.cos(d115) * d116);
                    piVarL111112.d.g(ai4VarK11111111116, 0.5f);
                    piVarL111112.d.g(ai4VarK11111111118, 0.5f);
                    piVarL111112.d.g(ai4VarK11111111112, -0.5f);
                    piVarL111112.d.g(ai4VarK11111111114, -0.5f);
                    piVarL111112.b = -fCos13;
                    eb2Var2.c(piVarL111112);
                }
                this.k = false;
                this.l = false;
            }
            i19 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (iArr[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            hb0Var3 = this.O;
            boolean z111113 = !hb0Var3.f();
            char c14 = '\b';
            boolean z111114 = zArr[0];
            boolean z111115 = zArr[1];
            i20 = this.o;
            int[] iArr113 = this.C;
            if (i20 != 2) {
                hb0Var4 = hb0Var;
                ai4Var = ai4VarK;
                ai4Var2 = ai4VarK2;
                ai4Var3 = ai4VarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            } else {
                hb0Var4 = hb0Var;
                ai4Var = ai4VarK;
                ai4Var2 = ai4VarK2;
                ai4Var3 = ai4VarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            }
            if (z) {
                ai4Var4 = r33;
                ai4Var5 = ai4VarK4;
                ai4Var6 = ai4Var3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            } else {
                ai4Var4 = r33;
                ai4Var5 = ai4VarK4;
                ai4Var6 = ai4Var3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            }
            if (this.p == 2) {
                i24 = i22;
            }
            if (i24 != 0) {
                ai4Var7 = ai4Var4;
            } else {
                ai4Var7 = ai4Var4;
            }
            if (z7) {
                i25 = this.A;
                f2 = this.B;
                if (i25 == 1) {
                    pi piVarL111113 = eb2Var2.l();
                    piVarL111113.d.g(ai4Var5, -1.0f);
                    piVarL111113.d.g(ai4Var7, 1.0f);
                    piVarL111113.d.g(ai4Var2, f2);
                    piVarL111113.d.g(ai4Var, -f2);
                    eb2Var2.c(piVarL111113);
                } else {
                    pi piVarL111114 = eb2Var2.l();
                    piVarL111114.d.g(ai4Var2, -1.0f);
                    piVarL111114.d.g(ai4Var, 1.0f);
                    piVarL111114.d.g(ai4Var5, f2);
                    piVarL111114.d.g(ai4Var7, -f2);
                    eb2Var2.c(piVarL111114);
                }
            }
            if (hb0Var3.f()) {
                jc0 jc0Var112 = hb0Var3.f.d;
                float radians14 = (float) Math.toRadians(this.D + 90.0f);
                int iD14 = hb0Var3.d();
                ai4 ai4VarK111111111110 = eb2Var2.k(g(2));
                ai4 ai4VarK111111111111 = eb2Var2.k(g(3));
                ai4 ai4VarK111111111112 = eb2Var2.k(g(4));
                ai4 ai4VarK111111111113 = eb2Var2.k(g(5));
                ai4 ai4VarK111111111114 = eb2Var2.k(jc0Var112.g(2));
                ai4 ai4VarK111111111115 = eb2Var2.k(jc0Var112.g(3));
                ai4 ai4VarK111111111116 = eb2Var2.k(jc0Var112.g(4));
                ai4 ai4VarK111111111117 = eb2Var2.k(jc0Var112.g(5));
                pi piVarL111115 = eb2Var2.l();
                double d117 = radians14;
                double dSin14 = Math.sin(d117);
                double d118 = iD14;
                piVarL111115.d.g(ai4VarK111111111115, 0.5f);
                piVarL111115.d.g(ai4VarK111111111117, 0.5f);
                piVarL111115.d.g(ai4VarK111111111111, -0.5f);
                piVarL111115.d.g(ai4VarK111111111113, -0.5f);
                piVarL111115.b = -((float) (dSin14 * d118));
                eb2Var2.c(piVarL111115);
                pi piVarL111116 = eb2Var2.l();
                float fCos14 = (float) (Math.cos(d117) * d118);
                piVarL111116.d.g(ai4VarK111111111114, 0.5f);
                piVarL111116.d.g(ai4VarK111111111116, 0.5f);
                piVarL111116.d.g(ai4VarK111111111110, -0.5f);
                piVarL111116.d.g(ai4VarK111111111112, -0.5f);
                piVarL111116.b = -fCos14;
                eb2Var2.c(piVarL111116);
            }
            this.k = false;
            this.l = false;
        }
        hb0Var2 = hb0Var8;
        ai4VarK4 = ai4VarK4;
        i16 = i11;
        i17 = i14;
        i18 = i15;
        z7 = false;
        int[] iArr114 = this.t;
        iArr114[0] = i17;
        iArr114[1] = i18;
        if (z7) {
            int i317 = this.A;
            i19 = -1;
            if (i317 != 0) {
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (iArr[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            hb0Var3 = this.O;
            boolean z111116 = !hb0Var3.f();
            char c15 = '\b';
            boolean z111117 = zArr[0];
            boolean z111118 = zArr[1];
            i20 = this.o;
            int[] iArr115 = this.C;
            if (i20 != 2) {
                hb0Var4 = hb0Var;
                ai4Var = ai4VarK;
                ai4Var2 = ai4VarK2;
                ai4Var3 = ai4VarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            } else {
                hb0Var4 = hb0Var;
                ai4Var = ai4VarK;
                ai4Var2 = ai4VarK2;
                ai4Var3 = ai4VarK5;
                z10 = z3;
                r3 = i6;
                r4 = i5;
                i21 = i17;
            }
            if (z) {
                ai4Var4 = r33;
                ai4Var5 = ai4VarK4;
                ai4Var6 = ai4Var3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            } else {
                ai4Var4 = r33;
                ai4Var5 = ai4VarK4;
                ai4Var6 = ai4Var3;
                i22 = 0;
                i23 = 8;
                z11 = true;
                i24 = 1;
            }
            if (this.p == 2) {
                i24 = i22;
            }
            if (i24 != 0) {
                ai4Var7 = ai4Var4;
            } else {
                ai4Var7 = ai4Var4;
            }
            if (z7) {
                i25 = this.A;
                f2 = this.B;
                if (i25 == 1) {
                    pi piVarL111117 = eb2Var2.l();
                    piVarL111117.d.g(ai4Var5, -1.0f);
                    piVarL111117.d.g(ai4Var7, 1.0f);
                    piVarL111117.d.g(ai4Var2, f2);
                    piVarL111117.d.g(ai4Var, -f2);
                    eb2Var2.c(piVarL111117);
                } else {
                    pi piVarL111118 = eb2Var2.l();
                    piVarL111118.d.g(ai4Var2, -1.0f);
                    piVarL111118.d.g(ai4Var, 1.0f);
                    piVarL111118.d.g(ai4Var5, f2);
                    piVarL111118.d.g(ai4Var7, -f2);
                    eb2Var2.c(piVarL111118);
                }
            }
            if (hb0Var3.f()) {
                jc0 jc0Var113 = hb0Var3.f.d;
                float radians15 = (float) Math.toRadians(this.D + 90.0f);
                int iD15 = hb0Var3.d();
                ai4 ai4VarK111111111118 = eb2Var2.k(g(2));
                ai4 ai4VarK111111111119 = eb2Var2.k(g(3));
                ai4 ai4VarK1111111111110 = eb2Var2.k(g(4));
                ai4 ai4VarK1111111111111 = eb2Var2.k(g(5));
                ai4 ai4VarK1111111111112 = eb2Var2.k(jc0Var113.g(2));
                ai4 ai4VarK1111111111113 = eb2Var2.k(jc0Var113.g(3));
                ai4 ai4VarK1111111111114 = eb2Var2.k(jc0Var113.g(4));
                ai4 ai4VarK1111111111115 = eb2Var2.k(jc0Var113.g(5));
                pi piVarL111119 = eb2Var2.l();
                double d119 = radians15;
                double dSin15 = Math.sin(d119);
                double d1110 = iD15;
                piVarL111119.d.g(ai4VarK1111111111113, 0.5f);
                piVarL111119.d.g(ai4VarK1111111111115, 0.5f);
                piVarL111119.d.g(ai4VarK111111111119, -0.5f);
                piVarL111119.d.g(ai4VarK1111111111111, -0.5f);
                piVarL111119.b = -((float) (dSin15 * d1110));
                eb2Var2.c(piVarL111119);
                pi piVarL1111110 = eb2Var2.l();
                float fCos15 = (float) (Math.cos(d119) * d1110);
                piVarL1111110.d.g(ai4VarK1111111111112, 0.5f);
                piVarL1111110.d.g(ai4VarK1111111111114, 0.5f);
                piVarL1111110.d.g(ai4VarK111111111118, -0.5f);
                piVarL1111110.d.g(ai4VarK1111111111110, -0.5f);
                piVarL1111110.b = -fCos15;
                eb2Var2.c(piVarL1111110);
            }
            this.k = false;
            this.l = false;
        }
        i19 = -1;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (iArr[0] == 2) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z9) {
            i8 = 0;
        }
        hb0Var3 = this.O;
        boolean z111119 = !hb0Var3.f();
        char c16 = '\b';
        boolean z1111110 = zArr[0];
        boolean z1111111 = zArr[1];
        i20 = this.o;
        int[] iArr116 = this.C;
        if (i20 != 2) {
            hb0Var4 = hb0Var;
            ai4Var = ai4VarK;
            ai4Var2 = ai4VarK2;
            ai4Var3 = ai4VarK5;
            z10 = z3;
            r3 = i6;
            r4 = i5;
            i21 = i17;
        } else {
            hb0Var4 = hb0Var;
            ai4Var = ai4VarK;
            ai4Var2 = ai4VarK2;
            ai4Var3 = ai4VarK5;
            z10 = z3;
            r3 = i6;
            r4 = i5;
            i21 = i17;
        }
        if (z) {
            ai4Var4 = r33;
            ai4Var5 = ai4VarK4;
            ai4Var6 = ai4Var3;
            i22 = 0;
            i23 = 8;
            z11 = true;
            i24 = 1;
        } else {
            ai4Var4 = r33;
            ai4Var5 = ai4VarK4;
            ai4Var6 = ai4Var3;
            i22 = 0;
            i23 = 8;
            z11 = true;
            i24 = 1;
        }
        if (this.p == 2) {
            i24 = i22;
        }
        if (i24 != 0) {
            ai4Var7 = ai4Var4;
        } else {
            ai4Var7 = ai4Var4;
        }
        if (z7) {
            i25 = this.A;
            f2 = this.B;
            if (i25 == 1) {
                pi piVarL1111111 = eb2Var2.l();
                piVarL1111111.d.g(ai4Var5, -1.0f);
                piVarL1111111.d.g(ai4Var7, 1.0f);
                piVarL1111111.d.g(ai4Var2, f2);
                piVarL1111111.d.g(ai4Var, -f2);
                eb2Var2.c(piVarL1111111);
            } else {
                pi piVarL1111112 = eb2Var2.l();
                piVarL1111112.d.g(ai4Var2, -1.0f);
                piVarL1111112.d.g(ai4Var, 1.0f);
                piVarL1111112.d.g(ai4Var5, f2);
                piVarL1111112.d.g(ai4Var7, -f2);
                eb2Var2.c(piVarL1111112);
            }
        }
        if (hb0Var3.f()) {
            jc0 jc0Var114 = hb0Var3.f.d;
            float radians16 = (float) Math.toRadians(this.D + 90.0f);
            int iD16 = hb0Var3.d();
            ai4 ai4VarK1111111111116 = eb2Var2.k(g(2));
            ai4 ai4VarK1111111111117 = eb2Var2.k(g(3));
            ai4 ai4VarK1111111111118 = eb2Var2.k(g(4));
            ai4 ai4VarK1111111111119 = eb2Var2.k(g(5));
            ai4 ai4VarK11111111111110 = eb2Var2.k(jc0Var114.g(2));
            ai4 ai4VarK11111111111111 = eb2Var2.k(jc0Var114.g(3));
            ai4 ai4VarK11111111111112 = eb2Var2.k(jc0Var114.g(4));
            ai4 ai4VarK11111111111113 = eb2Var2.k(jc0Var114.g(5));
            pi piVarL1111113 = eb2Var2.l();
            double d1111 = radians16;
            double dSin16 = Math.sin(d1111);
            double d1112 = iD16;
            piVarL1111113.d.g(ai4VarK11111111111111, 0.5f);
            piVarL1111113.d.g(ai4VarK11111111111113, 0.5f);
            piVarL1111113.d.g(ai4VarK1111111111117, -0.5f);
            piVarL1111113.d.g(ai4VarK1111111111119, -0.5f);
            piVarL1111113.b = -((float) (dSin16 * d1112));
            eb2Var2.c(piVarL1111113);
            pi piVarL1111114 = eb2Var2.l();
            float fCos16 = (float) (Math.cos(d1111) * d1112);
            piVarL1111114.d.g(ai4VarK11111111111110, 0.5f);
            piVarL1111114.d.g(ai4VarK11111111111112, 0.5f);
            piVarL1111114.d.g(ai4VarK1111111111116, -0.5f);
            piVarL1111114.d.g(ai4VarK1111111111118, -0.5f);
            piVarL1111114.b = -fCos16;
            eb2Var2.c(piVarL1111114);
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.f0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
  0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void d(eb2 eb2Var, boolean z, boolean z2, boolean z3, boolean z4, ai4 ai4Var, ai4 ai4Var2, int i, boolean z5, hb0 hb0Var, hb0 hb0Var2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        ai4 ai4VarK;
        ai4 ai4VarK2;
        hb0 hb0Var3;
        ai4 ai4Var3;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        jc0 jc0Var;
        boolean z20;
        int iMin2;
        boolean z21;
        int i14;
        int iD;
        int i15;
        int i16;
        HashSet hashSet;
        boolean z22;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        int i22;
        eb2Var = eb2Var;
        int i23 = i8;
        int i24 = i9;
        ai4 ai4VarK3 = eb2Var.k(hb0Var);
        ai4 ai4VarK4 = eb2Var.k(hb0Var2);
        ai4 ai4VarK5 = eb2Var.k(hb0Var.f);
        ai4 ai4VarK6 = eb2Var.k(hb0Var2.f);
        boolean zF = hb0Var.f();
        boolean zF2 = hb0Var2.f();
        boolean zF3 = this.O.f();
        int i25 = zF2 ? (zF ? 1 : 0) + 1 : zF ? 1 : 0;
        if (zF3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iW = xa3.w(i);
        boolean z25 = (iW == 0 || iW == 1 || iW != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 == -1 || !z) {
            i28 = i3;
            z12 = z25;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i28 = i29;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.f0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i28;
            z14 = z26;
        }
        if (z11) {
            if (!zF && !zF2 && !zF3) {
                eb2Var.d(ai4VarK3, i2);
            } else if (zF && !zF2) {
                i10 = 8;
                eb2Var.e(ai4VarK3, ai4VarK5, hb0Var.d(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z14 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    eb2Var.f(ai4VarK4, ai4VarK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        eb2Var.g(ai4VarK4, ai4VarK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        eb2Var.e(ai4VarK4, ai4VarK3, iMin, 8);
                    } else if (z8) {
                        eb2Var.e(ai4VarK4, ai4VarK3, iMin, 5);
                        eb2Var.g(ai4VarK4, ai4VarK3, iMin, 8);
                    } else {
                        eb2Var.e(ai4VarK4, ai4VarK3, iMin, 5);
                        eb2Var.g(ai4VarK4, ai4VarK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i30 = hb0Var.e;
                    if (i30 == 3 || i30 == 5) {
                        ai4VarK = eb2Var.k(this.S.g(3));
                        ai4VarK2 = eb2Var.k(this.S.g(5));
                    } else {
                        ai4VarK = eb2Var.k(this.S.g(2));
                        ai4VarK2 = eb2Var.k(this.S.g(4));
                    }
                    pi piVarL = eb2Var.l();
                    int i31 = i23;
                    piVarL.d.g(ai4VarK4, -1.0f);
                    piVarL.d.g(ai4VarK3, 1.0f);
                    piVarL.d.g(ai4VarK2, f2);
                    piVarL.d.g(ai4VarK, -f2);
                    eb2Var.c(piVarL);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i11 = i31;
                } else {
                    i11 = i23;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                eb2Var.e(ai4VarK4, ai4VarK3, iMax, 8);
                z15 = z4;
                i11 = i23;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i26 >= 2 && z2 && z27) {
                    eb2Var.f(ai4VarK3, ai4Var, 0, 8);
                    hb0 hb0Var4 = this.L;
                    boolean z28 = z || hb0Var4.f == null;
                    if (!z && (hb0Var3 = hb0Var4.f) != null) {
                        jc0 jc0Var2 = hb0Var3.d;
                        if (jc0Var2.V != 0.0f) {
                            int[] iArr = jc0Var2.o0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        eb2Var.f(ai4Var2, ai4VarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zF || zF2 || zF3) {
                if (zF && !zF2) {
                    hb0Var2 = hb0Var2;
                    ai4VarK4 = ai4VarK4;
                    z15 = z15;
                    ai4Var3 = ai4VarK6;
                    z20 = z2;
                    i22 = (z2 && (hb0Var.f.d instanceof ep)) ? 8 : 5;
                } else if (zF || !zF2) {
                    ai4Var3 = ai4VarK6;
                    if (zF && zF2) {
                        jc0 jc0Var3 = hb0Var.f.d;
                        jc0 jc0Var4 = hb0Var2.f.d;
                        z15 = z15;
                        jc0 jc0Var5 = this.S;
                        int i32 = 6;
                        if (z14) {
                            if (i27 == 0) {
                                if (i24 != 0 || i11 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (ai4VarK5.s && ai4Var3.s) {
                                    eb2Var.e(ai4VarK3, ai4VarK5, hb0Var.d(), 8);
                                    eb2Var.e(ai4VarK4, ai4Var3, -hb0Var2.d(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((jc0Var3 instanceof ep) || (jc0Var4 instanceof ep)) {
                                    eb2Var = eb2Var;
                                    i27 = i27;
                                    ai4VarK3 = ai4VarK3;
                                    ai4VarK4 = ai4VarK4;
                                    z18 = z24;
                                    ai4Var2 = ai4Var2;
                                    i12 = i20;
                                    ai4VarK5 = ai4VarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = 4;
                                } else {
                                    eb2Var = eb2Var;
                                    ai4VarK3 = ai4VarK3;
                                    ai4VarK4 = ai4VarK4;
                                    z18 = z24;
                                    i12 = i20;
                                    ai4VarK5 = ai4VarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = i21;
                                    i27 = i27;
                                    ai4Var2 = ai4Var2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((jc0Var3 instanceof ep) || (jc0Var4 instanceof ep)) {
                                        i12 = 5;
                                    } else {
                                        eb2Var = eb2Var;
                                        i27 = i27;
                                        ai4VarK3 = ai4VarK3;
                                        ai4VarK4 = ai4VarK4;
                                        ai4VarK5 = ai4VarK5;
                                        i32 = 6;
                                        i12 = 5;
                                        i13 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    ai4Var2 = ai4Var2;
                                } else if (i27 == 1) {
                                    i12 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i13 = i19;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i24 > 0) {
                                                eb2Var = eb2Var;
                                                ai4Var2 = ai4Var2;
                                                ai4VarK3 = ai4VarK3;
                                                ai4VarK4 = ai4VarK4;
                                                ai4VarK5 = ai4VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                            } else if (i24 != 0 || i11 != 0) {
                                                eb2Var = eb2Var;
                                                ai4Var2 = ai4Var2;
                                                ai4VarK3 = ai4VarK3;
                                                ai4VarK4 = ai4VarK4;
                                                ai4VarK5 = ai4VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 4;
                                            } else if (z9) {
                                                i18 = (jc0Var3 == jc0Var5 || jc0Var4 == jc0Var5) ? 5 : 4;
                                                i13 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                eb2Var = eb2Var;
                                                ai4Var2 = ai4Var2;
                                                ai4VarK3 = ai4VarK3;
                                                ai4VarK4 = ai4VarK4;
                                                ai4VarK5 = ai4VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i12 = i18;
                                        eb2Var = eb2Var;
                                    } else if (z9) {
                                        eb2Var = eb2Var;
                                        ai4Var2 = ai4Var2;
                                        ai4VarK3 = ai4VarK3;
                                        ai4VarK4 = ai4VarK4;
                                        ai4VarK5 = ai4VarK5;
                                        i12 = 8;
                                        i32 = z2 ? 5 : 4;
                                    } else {
                                        eb2Var = eb2Var;
                                        ai4Var2 = ai4Var2;
                                        ai4VarK3 = ai4VarK3;
                                        ai4VarK4 = ai4VarK4;
                                        ai4VarK5 = ai4VarK5;
                                        i12 = 8;
                                        i32 = 8;
                                    }
                                    i13 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i12 = 5;
                                    i13 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i13 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                ai4Var2 = ai4Var2;
                            }
                            if (z17 || ai4VarK5 != ai4Var3 || jc0Var3 == jc0Var5) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && ai4VarK5 == ai4Var && ai4Var3 == ai4Var2) {
                                    i32 = 8;
                                    z20 = false;
                                    i17 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i17 = i12;
                                }
                                ai4 ai4Var4 = ai4VarK5;
                                jc0Var = jc0Var4;
                                eb2Var.b(ai4VarK3, ai4Var4, hb0Var.d(), f, ai4Var3, ai4VarK4, hb0Var2.d(), i32);
                                ai4VarK5 = ai4Var4;
                                i12 = i17;
                                z19 = z22;
                            } else {
                                jc0Var = jc0Var4;
                                z20 = z2;
                            }
                            if (this.f0 != 8 && ((hashSet = hb0Var2.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && ai4VarK5 != ai4Var3 && !z14 && ((jc0Var3 instanceof ep) || (jc0Var instanceof ep))) {
                                    i12 = 6;
                                }
                                eb2Var.f(ai4VarK3, ai4VarK5, hb0Var.d(), i12);
                                eb2Var.g(ai4VarK4, ai4Var3, -hb0Var2.d(), i12);
                            }
                            if (z20 || !z10 || (jc0Var3 instanceof ep) || (jc0Var instanceof ep) || jc0Var == jc0Var5) {
                                iMin2 = i13;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i12 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (jc0Var3 != jc0Var5 && jc0Var != jc0Var5) {
                                        i32 = iMin2;
                                    }
                                    if ((jc0Var3 instanceof pk1) || (jc0Var instanceof pk1)) {
                                        i32 = 5;
                                    }
                                    if ((jc0Var3 instanceof ep) || (jc0Var instanceof ep)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i16 = 5;
                                    } else {
                                        i16 = i32;
                                    }
                                    iMin2 = Math.max(i16, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i12, iMin2);
                                    if (z6 || z9 || !(jc0Var3 == jc0Var5 || jc0Var == jc0Var5)) {
                                        i15 = iMin2;
                                    } else {
                                        i15 = 4;
                                    }
                                } else {
                                    i15 = iMin2;
                                }
                                eb2Var.e(ai4VarK3, ai4VarK5, hb0Var.d(), i15);
                                eb2Var.e(ai4VarK4, ai4Var3, -hb0Var2.d(), i15);
                            }
                            if (z20) {
                                if (ai4Var == ai4VarK5) {
                                    iD = hb0Var.d();
                                } else {
                                    iD = 0;
                                }
                                if (ai4VarK5 != ai4Var) {
                                    eb2Var.f(ai4VarK3, ai4Var, iD, 5);
                                }
                            }
                            if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                i14 = 5;
                            } else if (z14 && i27 == 3) {
                                eb2Var.f(ai4VarK4, ai4VarK3, 0, 8);
                                i14 = 5;
                            } else {
                                i14 = 5;
                                eb2Var.f(ai4VarK4, ai4VarK3, 0, 5);
                            }
                        } else {
                            if (ai4VarK5.s && ai4Var3.s) {
                                eb2Var.b(ai4VarK3, ai4VarK5, hb0Var.d(), f, ai4Var3, ai4VarK4, hb0Var2.d(), 8);
                                if (z2 && z15) {
                                    int iD2 = hb0Var2.f != null ? hb0Var2.d() : 0;
                                    if (ai4Var3 != ai4Var2) {
                                        eb2Var.f(ai4Var2, ai4VarK4, iD2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i12 = 5;
                            i13 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            }
                            ai4 ai4Var5 = ai4VarK5;
                            jc0Var = jc0Var4;
                            eb2Var.b(ai4VarK3, ai4Var5, hb0Var.d(), f, ai4Var3, ai4VarK4, hb0Var2.d(), i32);
                            ai4VarK5 = ai4Var5;
                            i12 = i17;
                            z19 = z22;
                        } else {
                            jc0Var = jc0Var4;
                            z20 = z2;
                        }
                        if (this.f0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i12 = 6;
                            }
                            eb2Var.f(ai4VarK3, ai4VarK5, hb0Var.d(), i12);
                            eb2Var.g(ai4VarK4, ai4Var3, -hb0Var2.d(), i12);
                        }
                        if (z20) {
                            iMin2 = i13;
                            z21 = z19;
                        } else {
                            iMin2 = i13;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (jc0Var3 != jc0Var5) {
                                    i32 = iMin2;
                                }
                                if (jc0Var3 instanceof pk1) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (jc0Var3 instanceof ep) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i16 = 5;
                                } else {
                                    i16 = i32;
                                }
                                iMin2 = Math.max(i16, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i12, iMin2);
                                if (z6) {
                                    i15 = iMin2;
                                } else {
                                    i15 = iMin2;
                                }
                            } else {
                                i15 = iMin2;
                            }
                            eb2Var.e(ai4VarK3, ai4VarK5, hb0Var.d(), i15);
                            eb2Var.e(ai4VarK4, ai4Var3, -hb0Var2.d(), i15);
                        }
                        if (z20) {
                            if (ai4Var == ai4VarK5) {
                                iD = hb0Var.d();
                            } else {
                                iD = 0;
                            }
                            if (ai4VarK5 != ai4Var) {
                                eb2Var.f(ai4VarK3, ai4Var, iD, 5);
                            }
                        }
                        if (z20) {
                            i14 = 5;
                        } else {
                            i14 = 5;
                        }
                    }
                    i22 = i14;
                } else {
                    ai4Var3 = ai4VarK6;
                    eb2Var.e(ai4VarK4, ai4Var3, -hb0Var2.d(), 8);
                    if (z2) {
                        eb2Var.f(ai4VarK3, ai4Var, 0, 5);
                        hb0Var2 = hb0Var2;
                        i14 = 5;
                        ai4VarK4 = ai4VarK4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i22 = i14;
                }
                if (z20 || !z15) {
                    return;
                }
                int iD3 = hb0Var2.f != null ? hb0Var2.d() : 0;
                if (ai4Var3 != ai4Var2) {
                    eb2Var.f(ai4Var2, ai4VarK4, iD3, i22);
                    return;
                }
                return;
            }
            ai4Var3 = ai4VarK6;
            i14 = 5;
            z20 = z2;
            i22 = i14;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            eb2Var.e(ai4VarK4, ai4VarK3, 0, 3);
            if (i4 > 0) {
                eb2Var.f(ai4VarK4, ai4VarK3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                eb2Var.g(ai4VarK4, ai4VarK3, i5, i10);
            }
        } else {
            eb2Var.e(ai4VarK4, ai4VarK3, iMin, i10);
        }
        z15 = z4;
        i11 = i23;
        if (z11) {
        }
        boolean z29 = z15;
        if (i26 >= 2) {
        }
    }

    public final void e(eb2 eb2Var) {
        eb2Var.k(this.H);
        eb2Var.k(this.I);
        eb2Var.k(this.J);
        eb2Var.k(this.K);
        if (this.Z > 0) {
            eb2Var.k(this.L);
        }
    }

    public final void f() {
        if (this.d == null) {
            up1 up1Var = new up1(this);
            up1Var.h.e = 4;
            up1Var.i.e = 5;
            up1Var.f = 0;
            this.d = up1Var;
        }
        if (this.e == null) {
            w45 w45Var = new w45(this);
            yo0 yo0Var = new yo0(w45Var);
            w45Var.k = yo0Var;
            w45Var.l = null;
            w45Var.h.e = 6;
            w45Var.i.e = 7;
            yo0Var.e = 8;
            w45Var.f = 1;
            this.e = w45Var;
        }
    }

    public hb0 g(int i) {
        switch (xa3.w(i)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(xa3.v(i));
        }
    }

    public final int h(int i) {
        int[] iArr = this.o0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int i() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final jc0 j(int i) {
        hb0 hb0Var;
        hb0 hb0Var2;
        if (i != 0) {
            if (i == 1 && (hb0Var2 = (hb0Var = this.K).f) != null && hb0Var2.f == hb0Var) {
                return hb0Var2.d;
            }
            return null;
        }
        hb0 hb0Var3 = this.J;
        hb0 hb0Var4 = hb0Var3.f;
        if (hb0Var4 == null || hb0Var4.f != hb0Var3) {
            return null;
        }
        return hb0Var4.d;
    }

    public final jc0 k(int i) {
        hb0 hb0Var;
        hb0 hb0Var2;
        if (i != 0) {
            if (i == 1 && (hb0Var2 = (hb0Var = this.I).f) != null && hb0Var2.f == hb0Var) {
                return hb0Var2.d;
            }
            return null;
        }
        hb0 hb0Var3 = this.H;
        hb0 hb0Var4 = hb0Var3.f;
        if (hb0Var4 == null || hb0Var4.f != hb0Var3) {
            return null;
        }
        return hb0Var4.d;
    }

    public void l(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.U);
        sb.append("\n");
        sb.append("    actualLeft:" + this.X);
        sb.append("\n");
        sb.append("    actualTop:" + this.Y);
        sb.append("\n");
        n(sb, "left", this.H);
        n(sb, "top", this.I);
        n(sb, "right", this.J);
        n(sb, "bottom", this.K);
        n(sb, "baseline", this.L);
        n(sb, "centerX", this.M);
        n(sb, "centerY", this.N);
        int i = this.T;
        int i2 = this.a0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.o0;
        int i6 = iArr2[0];
        float[] fArr = this.j0;
        float f2 = fArr[0];
        m(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.U;
        int i8 = this.b0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        m(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.V;
        int i13 = this.W;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        E(sb, "    horizontalBias", this.c0, 0.5f);
        E(sb, "    verticalBias", this.d0, 0.5f);
        D(this.h0, 0, "    horizontalChainStyle", sb);
        D(this.i0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int o() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int p() {
        jc0 jc0Var = this.S;
        return (jc0Var == null || !(jc0Var instanceof kc0)) ? this.X : ((kc0) jc0Var).w0 + this.X;
    }

    public final int q() {
        jc0 jc0Var = this.S;
        return (jc0Var == null || !(jc0Var instanceof kc0)) ? this.Y : ((kc0) jc0Var).x0 + this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean r(int i) {
        if (i == 0) {
            if ((this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean s(int i, int i2) {
        hb0 hb0Var;
        hb0 hb0Var2;
        hb0 hb0Var3;
        hb0 hb0Var4;
        if (i == 0) {
            hb0 hb0Var5 = this.H;
            hb0 hb0Var6 = hb0Var5.f;
            if (hb0Var6 == null || !hb0Var6.c || (hb0Var4 = (hb0Var3 = this.J).f) == null || !hb0Var4.c) {
                return false;
            }
            return (hb0Var4.c() - hb0Var3.d()) - (hb0Var5.d() + hb0Var5.f.c()) >= i2;
        }
        hb0 hb0Var7 = this.I;
        hb0 hb0Var8 = hb0Var7.f;
        if (hb0Var8 == null || !hb0Var8.c || (hb0Var2 = (hb0Var = this.K).f) == null || !hb0Var2.c) {
            return false;
        }
        return (hb0Var2.c() - hb0Var.d()) - (hb0Var7.d() + hb0Var7.f.c()) >= i2;
    }

    public final void t(int i, int i2, int i3, int i4, jc0 jc0Var) {
        g(i).a(jc0Var.g(i2), i3, i4);
    }

    public String toString() {
        StringBuilder sbI = xa3.i("");
        sbI.append(this.g0 != null ? b11.q(new StringBuilder("id: "), this.g0, " ") : "");
        sbI.append("(");
        sbI.append(this.X);
        sbI.append(", ");
        sbI.append(this.Y);
        sbI.append(") - (");
        sbI.append(this.T);
        sbI.append(" x ");
        return f34.i(sbI, this.U, ")");
    }

    public final boolean u(int i) {
        hb0 hb0Var;
        hb0 hb0Var2;
        int i2 = i * 2;
        hb0[] hb0VarArr = this.P;
        hb0 hb0Var3 = hb0VarArr[i2];
        hb0 hb0Var4 = hb0Var3.f;
        return (hb0Var4 == null || hb0Var4.f == hb0Var3 || (hb0Var2 = (hb0Var = hb0VarArr[i2 + 1]).f) == null || hb0Var2.f != hb0Var) ? false : true;
    }

    public final boolean v() {
        hb0 hb0Var = this.H;
        hb0 hb0Var2 = hb0Var.f;
        if (hb0Var2 != null && hb0Var2.f == hb0Var) {
            return true;
        }
        hb0 hb0Var3 = this.J;
        hb0 hb0Var4 = hb0Var3.f;
        return hb0Var4 != null && hb0Var4.f == hb0Var3;
    }

    public final boolean w() {
        hb0 hb0Var = this.I;
        hb0 hb0Var2 = hb0Var.f;
        if (hb0Var2 != null && hb0Var2.f == hb0Var) {
            return true;
        }
        hb0 hb0Var3 = this.K;
        hb0 hb0Var4 = hb0Var3.f;
        return hb0Var4 != null && hb0Var4.f == hb0Var3;
    }

    public final boolean x() {
        return this.g && this.f0 != 8;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        return this.H.c && this.J.c;
    }

    public boolean z() {
        if (this.l) {
            return true;
        }
        return this.I.c && this.K.c;
    }
}
