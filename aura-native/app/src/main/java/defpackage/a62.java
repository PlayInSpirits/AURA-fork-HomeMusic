package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class a62 implements bp3, cp3, p5 {
    public final /* synthetic */ int n;
    public final /* synthetic */ h62 o;

    public /* synthetic */ a62(h62 h62Var, int i) {
        this.n = i;
        this.o = h62Var;
    }

    @Override // defpackage.bp3
    public boolean g(Preference preference, Object obj) {
        int i = this.n;
        h62 h62Var = this.o;
        switch (i) {
            case 0:
                if (!h12.c(obj, Boolean.TRUE)) {
                    h62Var.P0 = 0L;
                    h62Var.Q0 = true;
                    boolean z = LanReceiverService.y;
                    LanReceiverService.A = 0L;
                    LanReceiverService.B.clear();
                    Context context = h62Var.t0;
                    if (context == null) {
                        h12.Q("app");
                        throw null;
                    }
                    Context context2 = h62Var.t0;
                    if (context2 == null) {
                        h12.Q("app");
                        throw null;
                    }
                    context.stopService(new Intent(context2, (Class<?>) LanReceiverService.class));
                    h62Var.p0();
                } else if (h62Var.P0 == 0) {
                    String D = ud3.D();
                    if (D == null || qm4.u0(D)) {
                        h62Var.s0(R.string.lan_login_first);
                    } else {
                        h62Var.V0 = true;
                        ArrayList arrayList = new ArrayList();
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 33) {
                            arrayList.add("android.permission.POST_NOTIFICATIONS");
                        }
                        if (i2 >= 37) {
                            arrayList.add("android.permission.ACCESS_LOCAL_NETWORK");
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            String str = (String) obj2;
                            Context context3 = h62Var.t0;
                            if (context3 == null) {
                                h12.Q("app");
                                throw null;
                            }
                            if (ud3.c(context3, str) != 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            h62Var.t0();
                        } else {
                            h62Var.W0.a(arrayList2.toArray(new String[0]));
                        }
                    }
                }
                return false;
            default:
                if (h12.c(obj, Boolean.TRUE)) {
                    boolean z2 = LanReceiverService.y;
                    if (LanReceiverService.y) {
                        LanReceiverService.B.clear();
                        LanReceiverService.A = SystemClock.elapsedRealtime() + 120000;
                    }
                } else {
                    boolean z3 = LanReceiverService.y;
                    LanReceiverService.A = 0L;
                    LanReceiverService.B.clear();
                }
                h62Var.p0();
                return false;
        }
    }

    @Override // defpackage.p5
    public void i(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        h62 h62Var = this.o;
        if (h62Var.L0) {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        h62Var.s0(R.string.lan_permission);
                        return;
                    }
                }
            }
            if (h62Var.V0) {
                h62Var.t0();
            } else {
                h62Var.q0();
            }
        }
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        int i = this.n;
        h62 h62Var = this.o;
        switch (i) {
            case 2:
                h62Var.q0();
                break;
            default:
                u52.f();
                h62Var.s0(R.string.lan_disconnected);
                break;
        }
    }
}
