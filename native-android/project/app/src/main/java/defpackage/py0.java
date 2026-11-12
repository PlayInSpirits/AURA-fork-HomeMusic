package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum py0 extends Enum implements g9 {
    public static final /* synthetic */ py0[] o = null;
    public final int n;

    static {
        o = new py0[]{new py0("ED256", 0, -260), new py0("ED512", 1, -261), new py0("ED25519", 2, -8), new py0("ES256", 3, -7), new py0("ECDH_HKDF_256", 4, -25), new py0("ES384", 5, -35), new py0("ES512", 6, -36)};
    }

    public py0(String r1, int r2, int r3) {
        super(r1, r2);
        this.n = r3;
    }

    public static py0 valueOf(String r1) {
        return (py0) Enum.valueOf(py0.class, r1);
    }

    public static py0[] values() {
        return (py0[]) o.clone();
    }

    @Override // defpackage.g9
    public final int a() {
        return this.n;
    }
}
