package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kv implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kv(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        long j;
        switch (this.n) {
            case 0:
                ((ez) this.o).cancel();
                return j15.a;
            case 1:
                gh4 gh4Var = (gh4) obj;
                synchronized (jh4.c) {
                    j = jh4.e;
                    jh4.e = 1 + j;
                }
                return new uu3(j, gh4Var, (if1) this.o);
            case 2:
                cz czVar = (cz) this.o;
                j15 j15Var = j15.a;
                czVar.resumeWith(j15Var);
                return j15Var;
            default:
                Throwable th = (Throwable) obj;
                hp4 hp4Var = (hp4) this.o;
                cz czVar2 = hp4Var.p;
                if (czVar2 != null) {
                    czVar2.r(th);
                }
                hp4Var.p = null;
                return j15.a;
        }
    }
}
