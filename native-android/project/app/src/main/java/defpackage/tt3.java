package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum tt3 extends Enum implements g9 {
    public static final tt3 o = null;
    public static final /* synthetic */ tt3[] p = null;
    public final int n;

    static {
        tt3 r0 = new tt3("RS256", 0, -257);
        tt3 r1 = new tt3("RS384", 1, -258);
        tt3 r2 = new tt3("RS512", 2, -259);
        tt3 r3 = new tt3("LEGACY_RS1", 3, -262);
        tt3 r4 = new tt3("PS256", 4, -37);
        tt3 r5 = new tt3("PS384", 5, -38);
        tt3 r6 = new tt3("PS512", 6, -39);
        tt3 r7 = new tt3("RS1", 7, -65535);
        o = r7;
        p = new tt3[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public tt3(String r1, int r2, int r3) {
        super(r1, r2);
        this.n = r3;
    }

    public static tt3 valueOf(String r1) {
        return (tt3) Enum.valueOf(tt3.class, r1);
    }

    public static tt3[] values() {
        return (tt3[]) p.clone();
    }

    @Override // defpackage.g9
    public final int a() {
        return this.n;
    }
}
