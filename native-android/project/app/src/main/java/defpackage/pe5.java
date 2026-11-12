package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pe5 extends q42 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ xu3 o;
    public final /* synthetic */ jx3 p;
    public final /* synthetic */ jx3 q;
    public final /* synthetic */ jx3 r;

    public pe5(xu3 r2, jx3 r3, jx3 r4, jx3 r5) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        super(2);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r17, Object r18) {
        int r1 = this.n;
        j15 r2 = j15.a;
        jx3 r3 = this.r;
        jx3 r4 = this.q;
        jx3 r5 = this.p;
        boolean r6 = true;
        xu3 r0 = this.o;
        switch(r1) {
            case 0: goto L39;
            default: goto L4;
        };
    L4:
        int r7 = ((Number) r17).intValue();
        long r8 = ((Number) r18).longValue();
        if (r7 != 21589) goto L38;
        long r10 = 1;
        if (r8 < 1) goto L37;
        byte r9 = r0.readByte();
        if ((r9 & 1) != 1) goto L11;
        boolean r13 = true;
    L13:
        if ((r9 & 2) != 2) goto L15;
        boolean r11 = true;
    L17:
        if ((r9 & 4) == 4) goto L20;
        r6 = false;
    L20:
        if (r13 == false) goto L23;
        r10 = 5;
    L23:
        if (r11 == false) goto L25;
        r10 = r10 + 4;
    L25:
        if (r6 == false) goto L28;
        r10 = r10 + 4;
    L28:
        if (r8 < r10) goto L35;
        if (r13 == false) goto L31;
        r5.n = Integer.valueOf(r0.f());
    L31:
        if (r11 == false) goto L33;
        r4.n = Integer.valueOf(r0.f());
    L33:
        if (r6 == false) goto L50;
        r3.n = Integer.valueOf(r0.f());
        return r2;
    L50:
        return r2;
    L35:
        mj0.i("bad zip: extended timestamp extra too short");
    L36:
        return null;
    L15:
        r11 = false;
        goto L17
    L11:
        r13 = false;
        goto L13
    L37:
        mj0.i("bad zip: extended timestamp extra too short");
        goto L36
    L38:
        return r2;
    L39:
        int r12 = ((Number) r17).intValue();
        long r14 = ((Number) r18).longValue();
        if (r12 == 1) goto L42;
        return r2;
    L42:
        if (r5.n == null) goto L44;
        mj0.i("bad zip: NTFS extra attribute tag 0x0001 repeated");
    L47:
        return null;
    L44:
        if (r14 != 24) goto L46;
        r5.n = Long.valueOf(r0.j());
        r4.n = Long.valueOf(r0.j());
        r3.n = Long.valueOf(r0.j());
        return r2;
    L46:
        mj0.i("bad zip: NTFS extra attribute tag 0x0001 size != 24");
        goto L47
    }

    public pe5(jx3 r2, xu3 r3, jx3 r4, jx3 r5) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
        this.q = r4;
        this.r = r5;
        super(2);
    }
}
