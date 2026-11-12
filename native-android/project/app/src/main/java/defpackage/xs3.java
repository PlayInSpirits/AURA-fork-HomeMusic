package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xs3 extends cu4 {
    public static final xs3 g = null;
    public static final Object h = null;
    public final yw1 e;
    public final ws3 f;

    static {
        vw1 r1 = yw1.o;
        g = new xs3(gy3.r, null);
        h = new Object();
    }

    public xs3(yw1 r1, ws3 r2) {
        this.e = r1;
        this.f = r2;
    }

    @Override // defpackage.cu4
    public final int b(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof xs3) == true) goto L8;
        return false;
    L8:
        xs3 r6 = (xs3) r5;
        if (Objects.equals(this.e, r6.e) == true) goto L11;
    L13:
        return false;
    L11:
        if (Objects.equals(this.f, r6.f) == false) goto L13;
        return true;
    }

    @Override // defpackage.cu4
    public final zt4 f(int r13, zt4 r14, boolean r15) {
        ws3 r12 = s(r13);
        Long r3 = Long.valueOf(r12.b);
        long r6 = f35.Q(r12.c);
        r14.getClass();
        r14.i(r3, null, r13, r6, 0, z5.f, false);
        return r14;
    }

    @Override // defpackage.cu4
    public final int h() {
        return o();
    }

    @Override // defpackage.cu4
    public final int hashCode() {
        return Objects.hash(new Object[]{this.e, this.f});
    }

    @Override // defpackage.cu4
    public final Object l(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final bu4 m(int r23, bu4 r24, long r25) {
        ws3 r0 = s(r23);
        gn2 r3 = r0.a;
        long r16 = f35.Q(r0.c);
        r24.b(h, r3, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0, r16, r23, r23, 0);
        return r24;
    }

    @Override // defpackage.cu4
    public final int o() {
        int r0 = this.e.size();
        if (this.f != null) goto L5;
        int r1 = 0;
    L7:
        return r0 + r1;
    L5:
        r1 = 1;
        goto L7
    }

    public final xs3 q(List r11, int r12) {
        uw1 r0 = new uw1(4);
        yw1 r1 = this.e;
        int r2 = 0;
        r0.d(r1.r(0, r12));
    L4:
        if (r2 >= r11.size()) goto L6;
        r0.c(new ws3((gn2) r11.get(r2), -1, -9223372036854775807L));
        r2 = r2 + 1;
        goto L4
    L6:
        r0.d(r1.r(r12, r1.size()));
        return new xs3(r0.f(), this.f);
    }

    public final long r(int r2) {
        if (r2 < 0) goto L7;
        yw1 r1 = this.e;
        if (r2 < r1.size()) goto L6;
        return -1;
    L6:
        return ((ws3) r1.get(r2)).b;
    L7:
        return -1;
    }

    public final ws3 s(int r3) {
        yw1 r0 = this.e;
        if (r3 != r0.size()) goto L8;
        ws3 r2 = this.f;
        if (r2 == null) goto L8;
        return r2;
    L8:
        return (ws3) r0.get(r3);
    }
}
