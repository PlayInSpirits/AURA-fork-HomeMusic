package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ we5 p;

    public /* synthetic */ pr1(String r1, we5 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r7) {
        int r0 = this.n;
        we5 r4 = this.p;
        String r6 = this.o;
        String r8 = (String) r7;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        nz3 r1 = b11.f(r8);
        r1.d(r8 + "/api/smart-shuffle/" + r6 + "/hide");
        r1.b("POST", r4);
        return new oz3(r1);
    L6:
        nz3 r2 = b11.f(r8);
        r2.d(r8 + "/api/smart-shuffle/" + r6 + "/add");
        r2.b("POST", r4);
        return new oz3(r2);
    L8:
        nz3 r3 = b11.f(r8);
        r3.d(r8 + "/api/wave/" + r6 + "/next");
        r3.b("POST", r4);
        return new oz3(r3);
    L10:
        nz3 r5 = b11.f(r8);
        r5.d(r8 + "/api/smart-shuffle/" + r6 + "/next");
        r5.b("POST", r4);
        return new oz3(r5);
    L12:
        nz3 r9 = b11.f(r8);
        r9.d(r8 + r6);
        r9.b("POST", r4);
        return new oz3(r9);
    }
}
