package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class il1 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ gf1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il1(int i, gf1 gf1Var) {
        super(0);
        this.n = i;
        this.o = gf1Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        gf1 gf1Var = this.o;
        switch (i) {
            case 0:
                try {
                    return (List) gf1Var.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return u01.n;
                }
            default:
                gf1Var.invoke();
                return j15.a;
        }
    }
}
