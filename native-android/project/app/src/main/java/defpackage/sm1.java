package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final yw1 l;
    public final yw1 m;
    public final gy3 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public sm1(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        rr2.l((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = yw1.k(arrayList2);
        this.m = yw1.k(arrayList3);
        this.n = yw1.q(new n7(14), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm1)) {
            return false;
        }
        sm1 sm1Var = (sm1) obj;
        return this.d == sm1Var.d && this.e == sm1Var.e && this.f == sm1Var.f && this.g == sm1Var.g && this.i == sm1Var.i && this.j == sm1Var.j && this.k == sm1Var.k && this.o == sm1Var.o && this.r == sm1Var.r && this.s == sm1Var.s && Objects.equals(this.a, sm1Var.a) && Objects.equals(this.b, sm1Var.b) && Objects.equals(this.c, sm1Var.c) && Objects.equals(this.h, sm1Var.h) && Objects.equals(this.l, sm1Var.l) && Objects.equals(this.m, sm1Var.m) && Objects.equals(this.n, sm1Var.n) && Objects.equals(this.p, sm1Var.p) && Objects.equals(this.q, sm1Var.q) && Objects.equals(this.t, sm1Var.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
