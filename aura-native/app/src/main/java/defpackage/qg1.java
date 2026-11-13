package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rg1 rg1Var = (rg1) obj;
                rg1Var.A--;
                break;
            default:
                sh4 sh4Var = (sh4) obj;
                sh4Var.k--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rg1) obj).A++;
                break;
            default:
                ((sh4) obj).k++;
                break;
        }
    }
}
