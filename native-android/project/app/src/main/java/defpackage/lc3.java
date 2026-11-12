package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 {
    public final ue1 a;

    public lc3(yf1 r3, if1 r4, int r5) {
        ue1 r0 = new ue1();
        wo0 r1 = new wo0(r4, r3);
        if (r5 >= 0) goto L6;
        fz1.a("size should be >=0");
    L6:
        if (r5 == 0) goto L9;
        f12 r6 = new f12(r0.o, r5, r1);
        r0.o += r5;
        ((f13) r0.p).b(r6);
    L9:
        this.a = r0;
    }
}
