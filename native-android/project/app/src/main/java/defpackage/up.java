package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.database.AppDatabase_Impl;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.HubUpdatePatch;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.SmartRec;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.service.MediaService;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ up(vb4 r2, HubMe r3, jx3 r4, String r5, jx3 r6, Preference r7) {
        this.n = 1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
        this.o = r5;
        this.s = r6;
        this.t = r7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L54;
            case 1: goto L48;
            case 2: goto L41;
            case 3: goto L31;
            case 4: goto L15;
            case 5: goto L13;
            default: goto L4;
        };
    L4:
        String r0 = (String) this.o;
        String r1 = (String) this.p;
        String r2 = (String) this.q;
        String r3 = (String) this.r;
        String r4 = (String) this.s;
        fu3 r10 = (fu3) this.t;
        AppDatabase r5 = AppDatabase.y();
        int r9 = 0;
        InternetRadioStationCache r6 = (InternetRadioStationCache) xl.E((AppDatabase_Impl) r5.z().o, true, false, new rs0(7, r0));
        if (r6 == null) goto L11;
        r6.setName(r1);
        r6.setStreamUrl(r2);
        r6.setHomePageUrl(r3);
        r6.setCoverArtUrl(r4);
        c12 r7 = r5.z();
        xl.E((AppDatabase_Impl) r7.o, false, true, new b12(r7, r6, r9));
        if (r4 == null) goto L11;
        if (r4.isEmpty() == true) goto L11;
        xt3.b(r0, r4);
    L11:
        new Handler(Looper.getMainLooper()).post(r10);
        return;
    L13:
        HubUpdater.g((Activity) this.p, (HubAppRelease) this.q, (HubUpdatePatch) this.o, (LinearProgressIndicator) this.r, (TextView) this.s, (f9) this.t);
        return;
    L15:
        String r8 = (String) this.o;
        ArrayList r11 = (ArrayList) this.r;
        String r12 = (String) this.p;
        String r13 = (String) this.q;
        Context r14 = (Context) this.s;
        String r15 = (String) this.t;
        WeakReference r16 = a.a;
        SmartSession.Companion r17 = SmartSession.Companion;     // Catch: Throwable -> L20
        if (r12 == null) goto L22;
        String r18 = SmartContexts.INSTANCE.hubId(r12);     // Catch: Throwable -> L20
    L19:
        String r19 = r18;
        SmartOut r20 = rr1.w(r17.startBody(r8, r11, r19, (String) a.e.get(r8), r13, rs1.f()));     // Catch: Throwable -> L20
        List<SmartRec> r21 = r20.getRecs();     // Catch: Throwable -> L20
        if (r21 != null) goto L26;
        r21 = u01.n;     // Catch: Throwable -> L20
    L26:
        Object r22 = new kd3(r20, a.l(r21));     // Catch: Throwable -> L20
    L29:
        io1.b.post(new mr(r22, r14, r8, r11, r15, 3));
        return;
    L22:
        r18 = null;
    L20:
        th = move-exception;
        r22 = new s14(th);
        goto L29
    L31:
        Object r23 = this.p;
        jx3 r24 = (jx3) this.q;
        String r25 = (String) this.o;
        jx3 r26 = (jx3) this.r;
        vb4 r27 = (vb4) this.s;
        Preference r110 = (Preference) this.t;
        if ((r23 instanceof s14) == true) goto L34;
        r24.n = ((HubMe) r23).getGoogleEmail();
        bu.e(r26, r27, r110, r24);
        bu.f(r27, r25);
    L34:
        Throwable r111 = bb3.a(r23);
        if (r111 == null) goto L72;
        String r112 = r111.getMessage();
        if (r112 != null) goto L39;
        r112 = r27.s(R.string.homemusic_hub_unreachable);
        r112.getClass();
    L39:
        bu.f(r27, r112);
        return;
    L72:
        return;
    L41:
        gf1 r28 = (gf1) this.p;
        jx3 r29 = (jx3) this.q;
        String r30 = (String) this.o;
        jx3 r31 = (jx3) this.r;
        vb4 r32 = (vb4) this.s;
        Preference r33 = (Preference) this.t;
        Object r34 = r28.invoke();     // Catch: Throwable -> L44
    L46:
        io1.b.post(new up(r34, r29, r30, r31, r32, r33, 3));
        return;
    L44:
        th = move-exception;
        r34 = new s14(th);
        goto L46
    L48:
        vb4 r35 = (vb4) this.p;
        HubMe r36 = (HubMe) this.q;
        jx3 r37 = (jx3) this.r;
        String r38 = (String) this.o;
        jx3 r39 = (jx3) this.s;
        Preference r113 = (Preference) this.t;
        if (r35.y() == false) goto L73;
        if (r36 == null) goto L74;
        r37.n = r38;
        r39.n = r36.getGoogleEmail();
        bu.e(r37, r35, r113, r39);
        return;
    L74:
        return;
    L73:
        return;
    L54:
        MediaService r40 = (MediaService) this.p;
        qi3 r41 = (qi3) this.q;
        String r42 = (String) this.o;
        ArrayList r43 = (ArrayList) this.r;
        hx3 r44 = (hx3) this.s;
        ix3 r114 = (ix3) this.t;
        if (r40.D == false) goto L58;
        return;
    L58:
        if (r41.Q0() <= 0) goto L61;
        return;
    L61:
        if (h12.c(r42, ud3.u()) == false) goto L63;
        r41.T(r43, r44.n, r114.n);
        r41.b();
        r40.w(r41);
        return;
    L63:
        if (r41.Q0() > 0) goto L78;
        new Thread(new k6(10, r40, r41)).start();
        return;
    }

    public /* synthetic */ up(Object r1, Object r2, Object r3, Object r4, Object r5, Object r6, int r7) {
        this.n = r7;
        this.p = r1;
        this.q = r2;
        this.o = r3;
        this.r = r4;
        this.s = r5;
        this.t = r6;
    }

    public /* synthetic */ up(String r2, String r3, String r4, String r5, String r6, fu3 r7) {
        this.n = 6;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
    }

    public /* synthetic */ up(String r2, ArrayList r3, String r4, String r5, Context r6, String r7) {
        this.n = 4;
        this.o = r2;
        this.r = r3;
        this.p = r4;
        this.q = r5;
        this.s = r6;
        this.t = r7;
    }
}
