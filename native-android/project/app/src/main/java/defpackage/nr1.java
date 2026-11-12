package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ we5 o;

    public /* synthetic */ nr1(we5 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        int r0 = this.n;
        we5 r3 = this.o;
        String r5 = (String) r4;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        nz3 r1 = b11.f(r5);
        r1.d(r5.concat("/api/plays/events"));
        r1.b("POST", r3);
        return new oz3(r1);
    L6:
        nz3 r2 = b11.f(r5);
        r2.d(r5.concat("/api/smart-shuffle/start"));
        r2.b("POST", r3);
        return new oz3(r2);
    L8:
        nz3 r6 = b11.f(r5);
        r6.d(r5.concat("/api/downloads"));
        r6.b("POST", r3);
        return new oz3(r6);
    L10:
        nz3 r7 = b11.f(r5);
        r7.d(r5.concat("/api/dislikes"));
        r7.b("POST", r3);
        return new oz3(r7);
    L12:
        nz3 r8 = b11.f(r5);
        r8.d(r5.concat("/api/auth/google/link"));
        r8.b("POST", r3);
        return new oz3(r8);
    L14:
        nz3 r9 = b11.f(r5);
        r9.d(r5.concat("/api/wave/start"));
        r9.b("POST", r3);
        return new oz3(r9);
    L16:
        nz3 r10 = b11.f(r5);
        r10.d(r5.concat("/api/assistant/tasks"));
        r10.b("POST", r3);
        return new oz3(r10);
    }
}
