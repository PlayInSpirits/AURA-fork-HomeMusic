package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ mm3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ jm3(mm3 r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        String r2 = this.p;
        mm3 r6 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ml3 r7 = r6.b;
        long r4 = System.currentTimeMillis();
        xl.E((s24) r7.a, false, true, new jl3(0, r4, r2));
        return;
    L6:
        xl.E((s24) r6.a.o, false, true, new rs0(12, r2));
        return;
    L8:
        xl.E((s24) r6.a.o, false, true, new rs0(11, r2));
    }
}
