package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bo implements m84 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public bo(long r3, long r5) {
        this.a = 2;
        this.b = r3;
        if (r5 != 0) goto L5;
        o84 r4 = o84.c;
    L6:
        this.c = new l84(r4, r4);
        return;
    L5:
        r4 = new o84(0, r5);
        goto L6
    }

    @Override // defpackage.m84
    public final boolean b() {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return true;
    L8:
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long r19) {
        int r3 = this.a;
        int r5 = 1;
        Object r6 = this.c;
        switch(r3) {
            case 0: goto L21;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        v71 r7 = (v71) r6;
        r7.k.getClass();
        rm3 r4 = r7.k;
        long[] r8 = (long[]) r4.n;
        long[] r9 = (long[]) r4.o;
        int r10 = f35.f(r8, f35.k((((long) r7.e) * r19) / 1000000, 0, r7.j - 1), false);
        long r11 = 0;
        if (r10 != (-1)) goto L9;
        long r13 = 0;
    L10:
        if (r10 == (-1)) goto L13;
        r11 = r9[r10];
    L13:
        int r12 = r7.e;
        long r14 = (r13 * 1000000) / ((long) r12);
        long r15 = this.b;
        o84 r0 = new o84(r14, r11 + r15);
        if (r14 == r19) goto L20;
        if (r10 == (r8.length - 1)) goto L20;
        int r16 = r10 + 1;
        return new l84(r0, new o84((r8[r16] * 1000000) / ((long) r12), r15 + r9[r16]));
    L20:
        return new l84(r0, r0);
    L9:
        r13 = r8[r10];
        goto L10
    L21:
        co r17 = (co) r6;
        l84 r1 = r17.i[0].b(r19);
    L22:
        u20[] r18 = r17.i;
        if (r5 >= r18.length) goto L28;
        l84 r20 = r18[r5].b(r19);
        if (r20.a.b >= r1.a.b) goto L27;
        r1 = r20;
    L27:
        r5 = r5 + 1;
        goto L22
    L28:
        return r1;
    L5:
        return (l84) r6;
    }

    @Override // defpackage.m84
    public final long g() {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return this.b;
    L7:
        return ((v71) this.c).b();
    L9:
        return this.b;
    }

    public bo(long r3) {
        this.a = 2;
        this(r3, 0);
    }

    public /* synthetic */ bo(Object r1, long r2, int r4) {
        this.a = r4;
        this.c = r1;
        this.b = r2;
    }
}
