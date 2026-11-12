package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fl4 extends xb1 {
    public final /* synthetic */ m84 b;
    public final /* synthetic */ e20 c;

    public fl4(e20 r1, m84 r2, m84 r3) {
        this.c = r1;
        this.b = r3;
        super(r2);
    }

    @Override // defpackage.xb1, defpackage.m84
    public final l84 e(long r9) {
        l84 r10 = this.b.e(r9);
        o84 r1 = r10.a;
        long r2 = r1.a;
        long r4 = r1.b;
        long r6 = this.c.o;
        o84 r0 = new o84(r2, r4 + r6);
        o84 r11 = r10.b;
        return new l84(r0, new o84(r11.a, r11.b + r6));
    }
}
