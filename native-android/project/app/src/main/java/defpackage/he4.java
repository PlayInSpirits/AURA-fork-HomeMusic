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

    public he4(ge4 r10) {
        an2 r0 = r10.f;
        long r1 = r10.g;
        int r5 = 0;
        if (r0 != null) goto L18;
        if (r1 != (-9223372036854775807L)) goto L7;
        boolean r2 = true;
    L8:
        rr2.k("presentationStartTimeMs can only be set if liveConfiguration != null", r2);
        if (r10.h != (-9223372036854775807L)) goto L11;
        boolean r3 = true;
    L12:
        rr2.k("windowStartTimeMs can only be set if liveConfiguration != null", r3);
        if (r10.i != (-9223372036854775807L)) goto L15;
        boolean r4 = true;
    L16:
        rr2.k("elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null", r4);
    L26:
        int r6 = r10.p.size();
        long r7 = r10.m;
        if (r7 != (-9223372036854775807L)) goto L29;
    L33:
        this.a = r10.a;
        this.b = r10.b;
        this.c = r10.c;
        this.d = r10.d;
        this.e = r10.e;
        this.f = r10.f;
        this.g = r10.g;
        this.h = r10.h;
        this.i = r10.i;
        this.j = r10.j;
        this.k = r10.k;
        this.l = r10.l;
        this.m = r10.m;
        long r8 = r10.n;
        this.n = r8;
        this.o = r10.o;
        yw1 r11 = r10.p;
        this.p = r11;
        long[] r9 = new long[r11.size()];
        this.q = r9;
        if (r11.isEmpty() == true) goto L39;
        r9[0] = -r8;
    L37:
        if (r5 >= (r6 - 1)) goto L41;
        long[] r12 = this.q;
        int r13 = r5 + 1;
        r12[r13] = r12[r5] + ((je4) this.p.get(r5)).b;
        r5 = r13;
        goto L37
    L41:
        return;
    L39:
        return;
    L29:
        if (r10.l > r7) goto L31;
        boolean r14 = true;
    L32:
        rr2.k("defaultPositionUs can't be greater than durationUs", r14);
        goto L33
    L31:
        r14 = false;
        goto L32
    L15:
        r4 = false;
        goto L16
    L11:
        r3 = false;
        goto L12
    L7:
        r2 = false;
        goto L8
    L18:
        if (r1 == (-9223372036854775807L)) goto L26;
        long r15 = r10.h;
        if (r15 == (-9223372036854775807L)) goto L26;
        if (r15 < r1) goto L24;
        boolean r16 = true;
    L25:
        rr2.k("windowStartTimeMs can't be less than presentationStartTimeMs", r16);
        goto L26
    L24:
        r16 = false;
        goto L25
    }

    public static Object a(he4 r2, int r3) {
        Object r0 = r2.a;
        yw1 r4 = r2.p;
        if (r4.isEmpty() == false) goto L6;
        return r0;
    L6:
        return Pair.create(r0, ((je4) r4.get(r3)).a);
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof he4) == true) goto L8;
        return false;
    L8:
        he4 r9 = (he4) r8;
        if (this.a.equals(r9.a) == true) goto L11;
    L41:
        return false;
    L11:
        if (this.b.equals(r9.b) == false) goto L41;
        if (this.c.equals(r9.c) == false) goto L41;
        if (Objects.equals(this.d, r9.d) == false) goto L41;
        if (Objects.equals(this.e, r9.e) == false) goto L41;
        if (Objects.equals(this.f, r9.f) == false) goto L41;
        if (this.g != r9.g) goto L41;
        if (this.h != r9.h) goto L41;
        if (this.i != r9.i) goto L41;
        if (this.j != r9.j) goto L41;
        if (this.k != r9.k) goto L41;
        if (this.l != r9.l) goto L41;
        if (this.m != r9.m) goto L41;
        if (this.n != r9.n) goto L41;
        if (this.o != r9.o) goto L41;
        if (this.p.equals(r9.p) == false) goto L41;
        return true;
    }

    public final int hashCode() {
        int r0 = (this.c.hashCode() + ((this.b.a.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31)) * 31;
        int r1 = 0;
        do2 r2 = this.d;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        Object r5 = this.e;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        an2 r8 = this.f;
        if (r8 == null) goto L14;
        r1 = r8.hashCode();
    L14:
        int r9 = (r7 + r1) * 31;
        long r10 = this.g;
        int r11 = (r9 + ((int) (r10 ^ (r10 >>> 32)))) * 31;
        long r12 = this.h;
        int r13 = (r11 + ((int) (r12 ^ (r12 >>> 32)))) * 31;
        long r14 = this.i;
        int r15 = (((((r13 + ((int) (r14 ^ (r14 >>> 32)))) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long r16 = this.l;
        int r17 = (r15 + ((int) (r16 ^ (r16 >>> 32)))) * 31;
        long r18 = this.m;
        int r19 = (r17 + ((int) (r18 ^ (r18 >>> 32)))) * 31;
        long r20 = this.n;
        return this.p.hashCode() + ((((r19 + ((int) (r20 ^ (r20 >>> 32)))) * 31) + (this.o ? 1 : 0)) * 31);
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r2.hashCode();
        goto L6
    }
}
