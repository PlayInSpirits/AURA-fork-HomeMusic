package defpackage;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he4 {
    public final Object a;
    public final jw4 b;
    public final gn2 c;
    public final do2 d;
    public final Object e;
    public final an2 f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final long n;
    public final boolean o;
    public final yw1 p;
    public final long[] q;

    public he4(ge4 ge4Var) {
        an2 an2Var = ge4Var.f;
        long j = ge4Var.g;
        int i = 0;
        if (an2Var == null) {
            rr2.k("presentationStartTimeMs can only be set if liveConfiguration != null", j == -9223372036854775807L);
            rr2.k("windowStartTimeMs can only be set if liveConfiguration != null", ge4Var.h == -9223372036854775807L);
            rr2.k("elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null", ge4Var.i == -9223372036854775807L);
        } else if (j != -9223372036854775807L) {
            long j2 = ge4Var.h;
            if (j2 != -9223372036854775807L) {
                rr2.k("windowStartTimeMs can't be less than presentationStartTimeMs", j2 >= j);
            }
        }
        int size = ge4Var.p.size();
        long j3 = ge4Var.m;
        if (j3 != -9223372036854775807L) {
            rr2.k("defaultPositionUs can't be greater than durationUs", ge4Var.l <= j3);
        }
        this.a = ge4Var.a;
        this.b = ge4Var.b;
        this.c = ge4Var.c;
        this.d = ge4Var.d;
        this.e = ge4Var.e;
        this.f = ge4Var.f;
        this.g = ge4Var.g;
        this.h = ge4Var.h;
        this.i = ge4Var.i;
        this.j = ge4Var.j;
        this.k = ge4Var.k;
        this.l = ge4Var.l;
        this.m = ge4Var.m;
        long j4 = ge4Var.n;
        this.n = j4;
        this.o = ge4Var.o;
        yw1 yw1Var = ge4Var.p;
        this.p = yw1Var;
        long[] jArr = new long[yw1Var.size()];
        this.q = jArr;
        if (yw1Var.isEmpty()) {
            return;
        }
        jArr[0] = -j4;
        while (i < size - 1) {
            long[] jArr2 = this.q;
            int i2 = i + 1;
            jArr2[i2] = jArr2[i] + ((je4) this.p.get(i)).b;
            i = i2;
        }
    }

    public static Object a(he4 he4Var, int i) {
        Object obj = he4Var.a;
        yw1 yw1Var = he4Var.p;
        return yw1Var.isEmpty() ? obj : Pair.create(obj, ((je4) yw1Var.get(i)).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he4)) {
            return false;
        }
        he4 he4Var = (he4) obj;
        return this.a.equals(he4Var.a) && this.b.equals(he4Var.b) && this.c.equals(he4Var.c) && Objects.equals(this.d, he4Var.d) && Objects.equals(this.e, he4Var.e) && Objects.equals(this.f, he4Var.f) && this.g == he4Var.g && this.h == he4Var.h && this.i == he4Var.i && this.j == he4Var.j && this.k == he4Var.k && this.l == he4Var.l && this.m == he4Var.m && this.n == he4Var.n && this.o == he4Var.o && this.p.equals(he4Var.p);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.a.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31)) * 31;
        do2 do2Var = this.d;
        int iHashCode2 = (iHashCode + (do2Var == null ? 0 : do2Var.hashCode())) * 31;
        Object obj = this.e;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        an2 an2Var = this.f;
        int iHashCode4 = (iHashCode3 + (an2Var != null ? an2Var.hashCode() : 0)) * 31;
        long j = this.g;
        int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.n;
        return this.p.hashCode() + ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.o ? 1 : 0)) * 31);
    }
}
