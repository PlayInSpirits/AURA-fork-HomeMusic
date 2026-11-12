package defpackage;

import com.eddyizm.tempus.viewmodel.b;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k03 c;
    public final /* synthetic */ hd d;

    public /* synthetic */ mp1(hd hdVar, int i, k03 k03Var, int i2) {
        this.a = i2;
        this.d = hdVar;
        this.b = i;
        this.c = k03Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        k03 k03Var = this.c;
        int i2 = this.b;
        hd hdVar = this.d;
        switch (i) {
            case 0:
                if (i2 == ((b) hdVar).F) {
                    k03Var.k(obj);
                }
                break;
            default:
                if (i2 == ((n92) hdVar).n) {
                    k03Var.k(obj);
                }
                break;
        }
    }
}
