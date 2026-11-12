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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a62 implements bp3, cp3, p5 {
    public final /* synthetic */ int n;
    public final /* synthetic */ h62 o;

    public /* synthetic */ a62(h62 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.bp3
    public boolean g(Preference r9, Object r10) {
        int r11 = this.n;
        h62 r8 = this.o;
        switch(r11) {
            case 0: goto L14;
            default: goto L5;
        };
    L5:
        if (h12.c(r10, Boolean.TRUE) == false) goto L10;
        boolean r12 = LanReceiverService.y;
        if (LanReceiverService.y == false) goto L11;
        LanReceiverService.B.clear();
        LanReceiverService.A = SystemClock.elapsedRealtime() + 120000;
    L11:
        r8.p0();
        return false;
    L10:
        boolean r13 = LanReceiverService.y;
        LanReceiverService.A = 0;
        LanReceiverService.B.clear();
        goto L11
    L14:
        if (h12.c(r10, Boolean.TRUE) == true) goto L16;
        r8.P0 = 0;
        r8.Q0 = true;
        boolean r14 = LanReceiverService.y;
        LanReceiverService.A = 0;
        LanReceiverService.B.clear();
        Context r15 = r8.t0;
        if (r15 == null) goto L51;
        Context r2 = r8.t0;
        if (r2 == null) goto L49;
        r15.stopService(new Intent(r2, LanReceiverService.class));
        r8.p0();
    L48:
        return false;
    L49:
        h12.Q("app");
        throw null;
    L51:
        h12.Q("app");
        throw null;
    L16:
        if (r8.P0 != 0) goto L48;
        String r16 = ud3.D();
        if (r16 != null) goto L21;
    L42:
        r8.s0(R.string.lan_login_first);
        goto L48
    L21:
        if (qm4.u0(r16) == true) goto L42;
        r8.V0 = true;
        ArrayList r17 = new ArrayList();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 33) goto L27;
        r17.add("android.permission.POST_NOTIFICATIONS");
    L27:
        if (r1 < 37) goto L29;
        r17.add("android.permission.ACCESS_LOCAL_NETWORK");
    L29:
        ArrayList r3 = new ArrayList();
        int r4 = r17.size();
        int r5 = 0;
    L30:
        if (r5 >= r4) goto L39;
        Object r6 = r17.get(r5);
        r5 = r5 + 1;
        String r7 = (String) r6;
        Context r18 = r8.t0;
        if (r18 == null) goto L36;
        if (ud3.c(r18, r7) == 0) goto L30;
        r3.add(r6);
        goto L30
    L36:
        h12.Q("app");
        throw null;
    L39:
        if (r3.isEmpty() == false) goto L41;
        r8.t0();
        goto L48
    L41:
        r8.W0.a(r3.toArray(new String[0]));
        goto L48
    }

    @Override // defpackage.p5
    public void i(Object r2) {
        Map r3 = (Map) r2;
        r3.getClass();
        h62 r1 = this.o;
        if (r1.L0 == true) goto L5;
        return;
    L5:
        Collection r4 = r3.values();
        if ((r4 instanceof Collection) == true) goto L8;
    L10:
        Iterator r5 = r4.iterator();
    L12:
        if (r5.hasNext() == false) goto L18;
        if (((Boolean) r5.next()).booleanValue() == true) goto L12;
        r1.s0(R.string.lan_permission);
        return;
    L18:
        if (r1.V0 == false) goto L21;
        r1.t0();
        return;
    L21:
        r1.q0();
        return;
    L8:
        if (r4.isEmpty() == false) goto L10;
        goto L10
    }

    @Override // defpackage.cp3
    public void j(Preference r1) {
        int r2 = this.n;
        h62 r0 = this.o;
        switch(r2) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        u52.f();
        r0.s0(R.string.lan_disconnected);
        return;
    L6:
        r0.q0();
    }
}
