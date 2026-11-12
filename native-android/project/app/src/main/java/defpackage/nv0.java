package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends ep4 implements xf1 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv0(int i, vd0 vd0Var, int i2) {
        super(i, vd0Var);
        this.o = i2;
    }

    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.o;
        j15 j15Var = j15.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((g83) obj2).a;
                new nv0(i2, (vd0) obj3, 0).invokeSuspend(j15Var);
                return j15Var;
            case 1:
                ((Number) obj2).floatValue();
                new nv0(i2, (vd0) obj3, 1).invokeSuspend(j15Var);
                return j15Var;
            default:
                if (obj != null) {
                    kf2.k();
                    return null;
                }
                long j2 = ((g83) obj2).a;
                new nv0(i2, (vd0) obj3, 2).invokeSuspend(j15Var);
                return j15Var;
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                kb4.X(obj);
                break;
            case 1:
                kb4.X(obj);
                break;
            default:
                kb4.X(obj);
                break;
        }
        return j15Var;
    }
}
