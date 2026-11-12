package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb1 {
    public static final String A0;
    public static final tb1 Q = new tb1(new sb1());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final c50 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final yw1 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final qv2 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final ow0 r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static {
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        b0 = Integer.toString(11, 36);
        c0 = Integer.toString(12, 36);
        d0 = Integer.toString(13, 36);
        e0 = Integer.toString(14, 36);
        f0 = Integer.toString(15, 36);
        g0 = Integer.toString(16, 36);
        h0 = Integer.toString(17, 36);
        i0 = Integer.toString(18, 36);
        j0 = Integer.toString(19, 36);
        k0 = Integer.toString(20, 36);
        l0 = Integer.toString(21, 36);
        m0 = Integer.toString(22, 36);
        n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        p0 = Integer.toString(25, 36);
        q0 = Integer.toString(26, 36);
        r0 = Integer.toString(27, 36);
        s0 = Integer.toString(28, 36);
        t0 = Integer.toString(29, 36);
        u0 = Integer.toString(30, 36);
        v0 = Integer.toString(31, 36);
        w0 = Integer.toString(32, 36);
        x0 = Integer.toString(33, 36);
        y0 = Integer.toString(34, 36);
        z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    public tb1(sb1 sb1Var) {
        boolean z;
        String str;
        this.a = sb1Var.a;
        String strR = f35.R(sb1Var.d);
        this.d = strR;
        if (sb1Var.c.isEmpty() && sb1Var.b != null) {
            this.c = yw1.o(new o42(strR, sb1Var.b));
            this.b = sb1Var.b;
        } else if (sb1Var.c.isEmpty() || sb1Var.b != null) {
            if (!sb1Var.c.isEmpty() || sb1Var.b != null) {
                int i = 0;
                while (true) {
                    if (i >= sb1Var.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((o42) sb1Var.c.get(i)).b.equals(sb1Var.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            rr2.w(z);
            this.c = sb1Var.c;
            this.b = sb1Var.b;
        } else {
            yw1 yw1Var = sb1Var.c;
            this.c = yw1Var;
            int size = yw1Var.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str = ((o42) yw1Var.get(0)).b;
                    break;
                }
                Object obj = yw1Var.get(i2);
                i2++;
                o42 o42Var = (o42) obj;
                if (TextUtils.equals(o42Var.a, strR)) {
                    str = o42Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = sb1Var.e;
        rr2.v("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", sb1Var.g == 0 || (sb1Var.f & 32768) != 0);
        this.f = sb1Var.f;
        this.g = sb1Var.g;
        int i3 = sb1Var.h;
        this.h = i3;
        int i4 = sb1Var.i;
        this.i = i4;
        this.j = i4 != -1 ? i4 : i3;
        this.k = sb1Var.j;
        this.l = sb1Var.k;
        this.m = sb1Var.l;
        this.n = sb1Var.m;
        this.o = sb1Var.n;
        this.p = sb1Var.o;
        List list = sb1Var.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        ow0 ow0Var = sb1Var.q;
        this.r = ow0Var;
        this.s = sb1Var.r;
        this.t = sb1Var.s;
        this.u = sb1Var.t;
        this.v = sb1Var.u;
        this.w = sb1Var.v;
        this.x = sb1Var.w;
        this.y = sb1Var.x;
        int i5 = sb1Var.y;
        this.z = i5 == -1 ? 0 : i5;
        float f = sb1Var.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = sb1Var.A;
        this.C = sb1Var.B;
        this.D = sb1Var.C;
        this.E = sb1Var.D;
        this.F = sb1Var.E;
        this.G = sb1Var.F;
        this.H = sb1Var.G;
        int i6 = sb1Var.H;
        this.I = i6 == -1 ? 0 : i6;
        int i7 = sb1Var.I;
        this.J = i7 != -1 ? i7 : 0;
        this.K = sb1Var.J;
        this.L = sb1Var.K;
        this.M = sb1Var.L;
        this.N = sb1Var.M;
        int i8 = sb1Var.N;
        if (i8 != 0 || ow0Var == null) {
            this.O = i8;
        } else {
            this.O = 1;
        }
    }

    public static String c(tb1 tb1Var) {
        int i;
        String str;
        String str2;
        if (tb1Var == null) {
            return "null";
        }
        int i2 = tb1Var.e;
        yw1 yw1Var = tb1Var.c;
        String str3 = tb1Var.d;
        int i3 = tb1Var.G;
        int i4 = tb1Var.F;
        int i5 = tb1Var.E;
        float f = tb1Var.y;
        c50 c50Var = tb1Var.D;
        float f2 = tb1Var.A;
        int i6 = tb1Var.x;
        int i7 = tb1Var.w;
        int i8 = tb1Var.v;
        int i9 = tb1Var.u;
        ow0 ow0Var = tb1Var.r;
        String str4 = tb1Var.k;
        int i10 = tb1Var.j;
        String str5 = tb1Var.m;
        int i11 = tb1Var.f;
        uc0 uc0Var = new uc0(String.valueOf(','));
        StringBuilder sbI = xa3.i("id=");
        sbI.append(tb1Var.a);
        sbI.append(", mimeType=");
        sbI.append(tb1Var.n);
        if (str5 != null) {
            sbI.append(", container=");
            sbI.append(str5);
        }
        if (i10 != -1) {
            sbI.append(", bitrate=");
            sbI.append(i10);
        }
        if (str4 != null) {
            sbI.append(", codecs=");
            sbI.append(str4);
        }
        if (ow0Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < ow0Var.q; i12++) {
                UUID uuid = ow0Var.n[i12].o;
                if (uuid.equals(ax.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(ax.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(ax.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(ax.d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(ax.a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                }
            }
            sbI.append(", drm=[");
            uc0Var.a(sbI, linkedHashSet.iterator());
            sbI.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            sbI.append(", res=");
            sbI.append(i9);
            sbI.append("x");
            sbI.append(i8);
        }
        if (i7 != -1 && i6 != -1) {
            sbI.append(", decRes=");
            sbI.append(i7);
            sbI.append("x");
            sbI.append(i6);
        }
        double d = f2;
        int i13 = ms0.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbI.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str6 = f35.a;
            sbI.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c50Var != null) {
            int i14 = c50Var.f;
            int i15 = c50Var.e;
            if ((i15 != -1 && i14 != -1) || c50Var.d()) {
                sbI.append(", color=");
                if (c50Var.d()) {
                    String strB = c50.b(c50Var.a);
                    String strA = c50.a(c50Var.b);
                    String strC = c50.c(c50Var.c);
                    String str7 = f35.a;
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbI.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            sbI.append(", fps=");
            sbI.append(f);
        }
        if (i5 != -1) {
            sbI.append(", maxSubLayers=");
            sbI.append(i5);
        }
        if (i4 != -1) {
            sbI.append(", channels=");
            sbI.append(i4);
        }
        if (i3 != -1) {
            sbI.append(", sample_rate=");
            sbI.append(i3);
        }
        if (str3 != null) {
            sbI.append(", language=");
            sbI.append(str3);
        }
        if (!yw1Var.isEmpty()) {
            sbI.append(", labels=[");
            uc0Var.a(sbI, hw.P(new mj0(20), yw1Var).iterator());
            sbI.append("]");
        }
        if (i2 != 0) {
            sbI.append(", selectionFlags=[");
            String str8 = f35.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            uc0Var.a(sbI, arrayList.iterator());
            sbI.append("]");
        }
        if (i11 != 0) {
            sbI.append(", roleFlags=[");
            String str9 = f35.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            uc0Var.a(sbI, arrayList2.iterator());
            sbI.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            sbI.append(", auxiliaryTrackType=");
            int i16 = tb1Var.g;
            String str10 = f35.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    kf2.o("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbI.append(str);
        }
        return sbI.toString();
    }

    public final sb1 a() {
        sb1 sb1Var = new sb1();
        sb1Var.a = this.a;
        sb1Var.b = this.b;
        sb1Var.c = this.c;
        sb1Var.d = this.d;
        sb1Var.e = this.e;
        sb1Var.f = this.f;
        sb1Var.h = this.h;
        sb1Var.i = this.i;
        sb1Var.j = this.k;
        sb1Var.k = this.l;
        sb1Var.l = this.m;
        sb1Var.m = this.n;
        sb1Var.n = this.o;
        sb1Var.o = this.p;
        sb1Var.p = this.q;
        sb1Var.q = this.r;
        sb1Var.r = this.s;
        sb1Var.s = this.t;
        sb1Var.t = this.u;
        sb1Var.u = this.v;
        sb1Var.v = this.w;
        sb1Var.w = this.x;
        sb1Var.x = this.y;
        sb1Var.y = this.z;
        sb1Var.z = this.A;
        sb1Var.A = this.B;
        sb1Var.B = this.C;
        sb1Var.C = this.D;
        sb1Var.D = this.E;
        sb1Var.E = this.F;
        sb1Var.F = this.G;
        sb1Var.G = this.H;
        sb1Var.H = this.I;
        sb1Var.I = this.J;
        sb1Var.J = this.K;
        sb1Var.K = this.L;
        sb1Var.L = this.M;
        sb1Var.M = this.N;
        sb1Var.N = this.O;
        return sb1Var;
    }

    public final boolean b(tb1 tb1Var) {
        List list = this.q;
        if (list.size() != tb1Var.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) tb1Var.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final tb1 d(tb1 tb1Var) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == tb1Var) {
            return this;
        }
        int iH = lw2.h(this.n);
        String str3 = tb1Var.a;
        yw1 yw1Var = tb1Var.c;
        int i3 = tb1Var.M;
        int i4 = tb1Var.N;
        String str4 = tb1Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (yw1Var.isEmpty()) {
            yw1Var = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = tb1Var.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = tb1Var.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = tb1Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strV = f35.v(iH, tb1Var.k);
            if (f35.e0(strV).length == 1) {
                str5 = strV;
            }
        }
        qv2 qv2VarB = tb1Var.l;
        qv2 qv2Var = this.l;
        if (qv2Var != null) {
            qv2VarB = qv2Var.b(qv2VarB);
        }
        float f = this.y;
        if (f == -1.0f && iH == 2) {
            f = tb1Var.y;
        }
        int i7 = this.e | tb1Var.e;
        int i8 = this.f | tb1Var.f;
        ow0 ow0Var = tb1Var.r;
        ArrayList arrayList = new ArrayList();
        yw1 yw1Var2 = yw1Var;
        if (ow0Var != null) {
            String str6 = ow0Var.p;
            nw0[] nw0VarArr = ow0Var.n;
            int length = nw0VarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                nw0 nw0Var = nw0VarArr[i10];
                int i11 = length;
                if (nw0Var.r != null) {
                    arrayList.add(nw0Var);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        ow0 ow0Var2 = this.r;
        if (ow0Var2 != null) {
            if (str2 == null) {
                str2 = ow0Var2.p;
            }
            int size = arrayList.size();
            nw0[] nw0VarArr2 = ow0Var2.n;
            String str7 = str2;
            int length2 = nw0VarArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                nw0 nw0Var2 = nw0VarArr2[i13];
                int i14 = length2;
                if (nw0Var2.r != null) {
                    UUID uuid = nw0Var2.o;
                    i2 = i4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(nw0Var2);
                            break;
                        }
                        i = size;
                        if (((nw0) arrayList.get(i15)).o.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i12 = i13 + 1;
                length2 = i14;
                i4 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i16 = i4;
        ow0 ow0Var3 = arrayList.isEmpty() ? null : new ow0(str2, false, (nw0[]) arrayList.toArray(new nw0[0]));
        sb1 sb1VarA = a();
        sb1VarA.a = str3;
        sb1VarA.b = str4;
        sb1VarA.c = yw1.k(yw1Var2);
        sb1VarA.d = str;
        sb1VarA.e = i7;
        sb1VarA.f = i8;
        sb1VarA.h = i5;
        sb1VarA.i = i6;
        sb1VarA.j = str5;
        sb1VarA.k = qv2VarB;
        sb1VarA.q = ow0Var3;
        sb1VarA.x = f;
        sb1VarA.L = i3;
        sb1VarA.M = i16;
        return new tb1(sb1VarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || tb1.class != obj.getClass()) {
            return false;
        }
        tb1 tb1Var = (tb1) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = tb1Var.P) == 0 || i2 == i) && this.e == tb1Var.e && this.f == tb1Var.f && this.g == tb1Var.g && this.h == tb1Var.h && this.i == tb1Var.i && this.o == tb1Var.o && this.s == tb1Var.s && this.u == tb1Var.u && this.v == tb1Var.v && this.w == tb1Var.w && this.x == tb1Var.x && this.z == tb1Var.z && this.C == tb1Var.C && this.E == tb1Var.E && this.F == tb1Var.F && this.G == tb1Var.G && this.H == tb1Var.H && this.I == tb1Var.I && this.J == tb1Var.J && this.K == tb1Var.K && this.M == tb1Var.M && this.N == tb1Var.N && this.O == tb1Var.O && Float.compare(this.y, tb1Var.y) == 0 && Float.compare(this.A, tb1Var.A) == 0 && Objects.equals(this.a, tb1Var.a) && Objects.equals(this.b, tb1Var.b) && this.c.equals(tb1Var.c) && Objects.equals(this.k, tb1Var.k) && Objects.equals(this.m, tb1Var.m) && Objects.equals(this.n, tb1Var.n) && Objects.equals(this.d, tb1Var.d) && Arrays.equals(this.B, tb1Var.B) && Objects.equals(this.l, tb1Var.l) && Objects.equals(this.D, tb1Var.D) && Objects.equals(this.r, tb1Var.r) && b(tb1Var);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            qv2 qv2Var = this.l;
            int iHashCode5 = (iHashCode4 + (qv2Var == null ? 0 : qv2Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return f34.i(sb, this.G, "])");
    }
}
