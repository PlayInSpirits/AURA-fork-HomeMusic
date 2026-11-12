package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v52 {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final float l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final long q;
    public final int r;
    public final String s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final float y;
    public final float z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v52(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, boolean z2, float f, int i, int i2, int i3, int i4, long j3, String str6, boolean z3, int i5, boolean z4, boolean z5, String str7, float f2, float f3, boolean z6, boolean z7, String str8, int i6) {
        boolean z8 = (i6 & 1) == 0;
        boolean z9 = (i6 & 2) == 0;
        String str9 = (i6 & 4) != 0 ? "" : str;
        String str10 = (i6 & 8) != 0 ? "" : str2;
        String str11 = (i6 & 16) != 0 ? "" : str3;
        String str12 = (i6 & 32) != 0 ? "" : str4;
        String str13 = (i6 & 64) != 0 ? "" : str5;
        long j4 = (i6 & 128) != 0 ? 0L : j;
        long j5 = (i6 & 256) != 0 ? 0L : j2;
        boolean z10 = (i6 & 512) != 0 ? false : z;
        boolean z11 = (i6 & 1024) != 0 ? false : z2;
        float f4 = (i6 & 2048) != 0 ? 1.0f : f;
        this(z8, z9, str9, str10, str11, str12, str13, j4, j5, z10, z11, f4, (i6 & 4096) != 0 ? 0 : i, (i6 & 8192) != 0 ? 0 : i2, (i6 & 16384) != 0 ? -1 : i3, (32768 & i6) != 0 ? 0 : i4, (65536 & i6) != 0 ? 0L : j3, 0, (262144 & i6) != 0 ? "" : str6, (524288 & i6) != 0 ? false : z3, (1048576 & i6) != 0 ? 0 : i5, (2097152 & i6) != 0 ? false : z4, (4194304 & i6) != 0 ? false : z5, (8388608 & i6) != 0 ? "" : str7, (16777216 & i6) != 0 ? 1.0f : f2, (33554432 & i6) != 0 ? 1.0f : f3, (67108864 & i6) != 0 ? false : z6, (134217728 & i6) != 0 ? false : z7, (i6 & 268435456) != 0 ? "" : str8);
    }

    public static v52 a(v52 v52Var, int i, int i2, int i3, int i4) {
        boolean z = v52Var.a;
        boolean z2 = (i4 & 2) != 0 ? v52Var.b : false;
        String str = v52Var.c;
        boolean z3 = z2;
        String str2 = v52Var.d;
        String str3 = v52Var.e;
        String str4 = v52Var.f;
        String str5 = v52Var.g;
        long j = v52Var.h;
        long j2 = v52Var.i;
        boolean z4 = v52Var.j;
        boolean z5 = v52Var.k;
        float f = v52Var.l;
        int i5 = (i4 & 4096) != 0 ? v52Var.m : i;
        int i6 = (i4 & 8192) != 0 ? v52Var.n : i2;
        int i7 = v52Var.o;
        int i8 = v52Var.p;
        int i9 = i6;
        long j3 = v52Var.q;
        int i10 = (i4 & 131072) != 0 ? v52Var.r : i3;
        String str6 = v52Var.s;
        boolean z6 = v52Var.t;
        int i11 = v52Var.u;
        boolean z7 = v52Var.v;
        boolean z8 = v52Var.w;
        String str7 = v52Var.x;
        float f2 = v52Var.y;
        float f3 = v52Var.z;
        boolean z9 = v52Var.A;
        boolean z10 = v52Var.B;
        String str8 = v52Var.C;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new v52(z, z3, str, str2, str3, str4, str5, j, j2, z4, z5, f, i5, i9, i7, i8, j3, i10, str6, z6, i11, z7, z8, str7, f2, f3, z9, z10, str8);
    }

    public final long b(long j) {
        long j2;
        if (this.b && this.j) {
            long j3 = j - this.q;
            if (j3 < 0) {
                j3 = 0;
            }
            j2 = (long) (j3 * ((double) this.y));
        } else {
            j2 = 0;
        }
        long j4 = this.h + j2;
        long j5 = this.i;
        return gb.n(j4, 0L, j5 < 0 ? 0L : j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v52)) {
            return false;
        }
        v52 v52Var = (v52) obj;
        return this.a == v52Var.a && this.b == v52Var.b && h12.c(this.c, v52Var.c) && h12.c(this.d, v52Var.d) && h12.c(this.e, v52Var.e) && h12.c(this.f, v52Var.f) && h12.c(this.g, v52Var.g) && this.h == v52Var.h && this.i == v52Var.i && this.j == v52Var.j && this.k == v52Var.k && Float.compare(this.l, v52Var.l) == 0 && this.m == v52Var.m && this.n == v52Var.n && this.o == v52Var.o && this.p == v52Var.p && this.q == v52Var.q && this.r == v52Var.r && h12.c(this.s, v52Var.s) && this.t == v52Var.t && this.u == v52Var.u && this.v == v52Var.v && this.w == v52Var.w && h12.c(this.x, v52Var.x) && Float.compare(this.y, v52Var.y) == 0 && Float.compare(this.z, v52Var.z) == 0 && this.A == v52Var.A && this.B == v52Var.B && h12.c(this.C, v52Var.C);
    }

    public final int hashCode() {
        return this.C.hashCode() + xa3.c(xa3.c(b11.d(b11.d(f34.e(this.x, xa3.c(xa3.c(f34.d(this.u, xa3.c(f34.e(this.s, f34.d(this.r, xa3.b(f34.d(this.p, f34.d(this.o, f34.d(this.n, f34.d(this.m, b11.d(xa3.c(xa3.c(xa3.b(xa3.b(f34.e(this.g, f34.e(this.f, f34.e(this.e, f34.e(this.d, f34.e(this.c, xa3.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), this.l, 31), 31), 31), 31), 31), 31, this.q), 31), 31), 31, this.t), 31), 31, this.v), 31, this.w), 31), this.y, 31), this.z, 31), 31, this.A), 31, this.B);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanRemoteState(active=");
        sb.append(this.a);
        sb.append(", connected=");
        sb.append(this.b);
        sb.append(", name=");
        f34.n(sb, this.c, ", title=", this.d, ", artist=");
        f34.n(sb, this.e, ", album=", this.f, ", coverId=");
        sb.append(this.g);
        sb.append(", position=");
        sb.append(this.h);
        sb.append(", duration=");
        sb.append(this.i);
        sb.append(", playing=");
        sb.append(this.j);
        sb.append(", playWhenReady=");
        sb.append(this.k);
        sb.append(", volume=");
        sb.append(this.l);
        sb.append(", deviceVolume=");
        sb.append(this.m);
        sb.append(", deviceVolumeMax=");
        sb.append(this.n);
        sb.append(", index=");
        sb.append(this.o);
        sb.append(", count=");
        sb.append(this.p);
        sb.append(", receivedAt=");
        sb.append(this.q);
        sb.append(", error=");
        sb.append(this.r);
        sb.append(", revision=");
        sb.append(this.s);
        sb.append(", shuffle=");
        sb.append(this.t);
        sb.append(", repeat=");
        sb.append(this.u);
        sb.append(", hasNext=");
        sb.append(this.v);
        sb.append(", hasPrevious=");
        sb.append(this.w);
        sb.append(", mediaId=");
        sb.append(this.x);
        sb.append(", speed=");
        sb.append(this.y);
        sb.append(", pitch=");
        sb.append(this.z);
        sb.append(", timerActive=");
        sb.append(this.A);
        sb.append(", timerEndOfTrack=");
        sb.append(this.B);
        sb.append(", timerRemaining=");
        sb.append(this.C);
        sb.append(")");
        return sb.toString();
    }

    public v52(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z3, boolean z4, float f, int i, int i2, int i3, int i4, long j3, int i5, String str6, boolean z5, int i6, boolean z6, boolean z7, String str7, float f2, float f3, boolean z8, boolean z9, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = z3;
        this.k = z4;
        this.l = f;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = j3;
        this.r = i5;
        this.s = str6;
        this.t = z5;
        this.u = i6;
        this.v = z6;
        this.w = z7;
        this.x = str7;
        this.y = f2;
        this.z = f3;
        this.A = z8;
        this.B = z9;
        this.C = str8;
    }
}
