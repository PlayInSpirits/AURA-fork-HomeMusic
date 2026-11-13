package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class x50 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ x50(jg3[] jg3VarArr, y50 y50Var, int i, cf2 cf2Var, int[] iArr) {
        this.n = 0;
        this.p = jg3VarArr;
        this.q = y50Var;
        this.o = i;
        this.r = cf2Var;
        this.s = iArr;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        Object obj2 = this.s;
        int i2 = this.o;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (i) {
            case 0:
                jg3[] jg3VarArr = (jg3[]) obj5;
                y50 y50Var = (y50) obj4;
                cf2 cf2Var = (cf2) obj3;
                int[] iArr = (int[]) obj2;
                ig3 ig3Var = (ig3) obj;
                int length = jg3VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    jg3 jg3Var = jg3VarArr[i3];
                    jg3Var.getClass();
                    jg3Var.t();
                    ig3.f(ig3Var, jg3Var, y50Var.a.a(jg3Var.n, i2, cf2Var.getLayoutDirection()), iArr[i4]);
                    i3++;
                    i4++;
                }
                return j15.a;
            case 1:
                ba1 ba1Var = (ba1) obj4;
                ba1 ba1Var2 = (ba1) obj3;
                dd0 dd0Var = (dd0) obj2;
                es esVar = (es) obj;
                if (((ba1) obj5) != ((ey) ((ra) j51.P(ba1Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean H = zz1.H(ba1Var, ba1Var2, i2, dd0Var);
                Boolean valueOf = Boolean.valueOf(H);
                if (H || !esVar.a()) {
                    return valueOf;
                }
                return null;
            default:
                ba1 ba1Var3 = (ba1) obj4;
                wv3 wv3Var = (wv3) obj3;
                dd0 dd0Var2 = (dd0) obj2;
                es esVar2 = (es) obj;
                if (((ba1) obj5) != ((ey) ((ra) j51.P(ba1Var3)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean R = kb4.R(i2, dd0Var2, ba1Var3, wv3Var);
                Boolean valueOf2 = Boolean.valueOf(R);
                if (R || !esVar2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }

    public /* synthetic */ x50(ba1 ba1Var, ba1 ba1Var2, Object obj, int i, dd0 dd0Var, int i2) {
        this.n = i2;
        this.p = ba1Var;
        this.q = ba1Var2;
        this.r = obj;
        this.o = i;
        this.s = dd0Var;
    }
}
