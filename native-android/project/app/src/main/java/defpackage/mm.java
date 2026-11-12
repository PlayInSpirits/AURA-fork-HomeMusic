package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;

    public /* synthetic */ mm(long j, Object obj, int i) {
        this.n = i;
        this.o = j;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.n) {
            case 0:
                xc5 xc5Var = (xc5) this.p;
                long j = this.o;
                qm qmVar = (qm) xc5Var.p;
                String str = f35.a;
                qmVar.F(j);
                return;
            case 1:
                ye4 ye4Var = (ye4) this.p;
                long j2 = this.o;
                Calendar calendarD = a35.d();
                Calendar calendarE = a35.e(null);
                calendarE.setTimeInMillis(j2);
                ye4Var.n.setError(String.format(ye4Var.r, (calendarD.get(1) == calendarE.get(1) ? a35.b("MMMd", Locale.getDefault()).format(new Date(j2)) : hw.q(j2)).replace(' ', (char) 160)));
                ze4 ze4Var = ye4Var.x;
                ye4Var.w.getError();
                ze4Var.getClass();
                ye4Var.v.a();
                return;
            case 2:
                long j3 = this.o;
                Exception exc = (Exception) this.p;
                if (u52.i == j3) {
                    z52.b();
                    k03 k03Var = u52.b;
                    v52 v52VarC = u52.c();
                    if (exc instanceof p52) {
                        i = R.string.lan_pair_first;
                    } else if (exc instanceof s52) {
                        i = R.string.lan_server_mismatch;
                    } else {
                        i = exc instanceof t52 ? R.string.lan_update_both : R.string.lan_connection_error;
                    }
                    k03Var.k(v52.a(v52VarC, 0, 0, i, 536739837));
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                long j4 = this.o;
                bl2 bl2Var = (bl2) this.p;
                try {
                    try {
                        if (u52.i == j4 && u52.c().a) {
                            ((bj2) bl2Var.get()).c();
                        }
                        break;
                    } catch (Exception e) {
                        w42.a.a("Controller could not pause local playback", e);
                        break;
                    }
                    return;
                } finally {
                    sk2.Z0(bl2Var);
                }
            case 4:
                h62 h62Var = (h62) this.p;
                if (h62Var.l0(this.o)) {
                    h62Var.H0 = null;
                    h62Var.I0 = false;
                    h62Var.s0(R.string.lan_discovery_error);
                    return;
                }
                return;
            default:
                ((RecyclerView) ((wk3) this.p).l0.t).j0((int) this.o);
                return;
        }
    }

    public /* synthetic */ mm(Object obj, long j, int i) {
        this.n = i;
        this.p = obj;
        this.o = j;
    }
}
