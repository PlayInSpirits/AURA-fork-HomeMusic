package defpackage;

import com.eddyizm.tempus.service.MediaService;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j52 implements oi3 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ j52(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.oi3
    public final void B(qi3 qi3Var, ni3 ni3Var) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                qi3Var.getClass();
                ((ArrayBlockingQueue) obj).offer(Boolean.TRUE);
                break;
            case 1:
                w71 w71Var = ni3Var.a;
                if (w71Var.a.get(1) || w71Var.a.get(5) || w71Var.a.get(4)) {
                    ((li3) ((om1) obj).o).c(qi3Var.a() != null ? qi3Var.a().a : null, qi3Var.g() == 3 && qi3Var.q());
                    break;
                }
                break;
            case 2:
                qi3Var.getClass();
                w71 w71Var2 = ni3Var.a;
                if (w71Var2.a.get(1)) {
                    is3.d = false;
                }
                if (w71Var2.a(0, 1, 4, 8, 9)) {
                    is3.a(qi3Var, (MediaService) obj);
                    break;
                }
                break;
            default:
                w12 w12Var = (w12) obj;
                ((zm4) w12Var.h).a();
                ((an4) w12Var.i).a();
                ((bn4) w12Var.j).a();
                ((cn4) w12Var.k).a();
                break;
        }
    }
}
