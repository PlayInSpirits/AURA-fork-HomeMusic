package defpackage;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements vw2 {
    public final /* synthetic */ int a;
    public final Object b;

    public ji0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new si1(11);
                break;
            case 2:
                n83 n83Var = new n83();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                n83Var.b(2500L, timeUnit);
                n83Var.z = ze5.b(2500L, timeUnit);
                SSLSocketFactory sSLSocketFactory = x30.b;
                if (sSLSocketFactory != null) {
                    n83Var.c(sSLSocketFactory, x30.a);
                }
                this.b = new o83(n83Var);
                break;
            default:
                this.b = new i80(21);
                break;
        }
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 na4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new mw(1, (i80) obj);
            case 1:
                return new ar1((si1) obj);
            default:
                return new mw(3, (o83) obj);
        }
    }
}
