package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a82 implements xr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a82(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xr0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b82) obj).c = null;
                break;
            case 1:
                q82 q82Var = (q82) obj;
                ll llVar = q82Var.c;
                if (llVar != null) {
                    llVar.o = false;
                }
                q82Var.c = null;
                break;
            default:
                l82 l82Var = (l82) obj;
                l82Var.f = true;
                l82Var.d = 0;
                l82Var.c();
                break;
        }
    }
}
