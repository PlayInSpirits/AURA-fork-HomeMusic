package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.nsd.NsdServiceInfo;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.database.AppDatabase_Impl;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubUpdatePatch;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ mr(pn2 r2, fr2 r3, uj2 r4, Bundle r5, String r6) {
        this.n = 8;
        this.o = r2;
        this.p = r3;
        this.r = r4;
        this.s = r5;
        this.q = r6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.n;
        HubException r2 = null;
        jn2 r3 = null;
        r3 = null;
        r2 = null;
        r2 = null;
        gq0 r4 = gq0.n;
        int r5 = 1;
        Object r6 = this.s;
        Object r7 = this.r;
        Object r8 = this.p;
        Object r9 = this.o;
        Object r0 = this.q;
        switch(r1) {
            case 0: goto L79;
            case 1: goto L77;
            case 2: goto L75;
            case 3: goto L52;
            case 4: goto L50;
            case 5: goto L46;
            case 6: goto L44;
            case 7: goto L39;
            case 8: goto L27;
            case 9: goto L13;
            case 10: goto L11;
            default: goto L4;
        };
    L4:
        String r10 = (String) r7;
        fu3 r11 = (fu3) r6;
        String r12 = "local_" + UUID.randomUUID().toString();
        InternetRadioStationCache r13 = new InternetRadioStationCache();
        r13.setId(r12);
        r13.setName((String) r0);
        r13.setStreamUrl((String) r9);
        r13.setHomePageUrl((String) r8);
        r13.setSource(InternetRadioStationCache.SOURCE_LOCAL);
        r13.setCoverArtUrl(r10);
        c12 r14 = AppDatabase.y().z();
        xl.E((AppDatabase_Impl) r14.o, false, true, new b12(r14, r13, r5));
        if (r10 != null) goto L7;
    L9:
        new Handler(Looper.getMainLooper()).post(r11);
        return;
    L7:
        if (r10.isEmpty() == true) goto L9;
        xt3.b(r12, r10);
        goto L9
    L11:
        mm3 r15 = (mm3) r9;
        String r16 = (String) r0;
        String r17 = (String) r8;
        App.f(false).g().S(r16, r17, r15.j(r16), null, null).enqueue(new z40(r15, r16, r17, (ArrayList) r7, (lm3) r6));
        return;
    L13:
        String r18 = (String) r0;
        gf1 r19 = (gf1) r8;
        k03 r20 = (k03) r7;
        oy r21 = (oy) r6;
        ((i80) r9).getClass();
        boolean r22 = xl.y();
        if (r22 == true) goto L113;
    L111:
        r19.invoke();     // Catch: Throwable -> L18
        qa3 r23 = rv2.v;     // Catch: Throwable -> L18
        r20.i(r23);     // Catch: Throwable -> L18
        r21.a(r23);     // Catch: Throwable -> L18
    L20:
        if (r22 == false) goto L121;
        Trace.endSection();
        return;
    L121:
        return;
    L18:
        th = move-exception;
        r20.i(new pa3(th));     // Catch: Throwable -> L23
        r21.b(th);     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        if (r22 == false) goto L26;
        Trace.endSection();
    L26:
        throw th;
    L113:
        Trace.beginSection(xl.N(r18));     // Catch: Throwable -> L23
        goto L111
    L27:
        pn2 r24 = (pn2) r9;
        fr2 r25 = (fr2) r8;
        uj2 r26 = (uj2) r7;
        Bundle r27 = (Bundle) r6;
        String r28 = (String) r0;
        tn2 r29 = r24.z;
        if (r24.x.I(r25, 50003) == true) goto L30;
        r26.f(null);
        return;
    L30:
        if (r27 == null) goto L37;
        r27.setClassLoader(r29.f.getClassLoader());
        int r30 = r27.getInt("android.media.browse.extra.PAGE");     // Catch: BadParcelableException -> L108
        int r110 = r27.getInt("android.media.browse.extra.PAGE_SIZE");     // Catch: BadParcelableException -> L108
        r3 = f92.h(r29.f, r27);     // Catch: BadParcelableException -> L108
        if (r30 < 0) goto L37;
        if (r110 <= 0) goto L37;
        lb4 r31 = f35.h0(r29.r(r25, r28, r110, r3), new ln2(r24, r5));     // Catch: BadParcelableException -> L108
        r31.f(new nn2(r31, r26, r5), r4);     // Catch: BadParcelableException -> L108
        return;
    L37:
        lb4 r32 = f35.h0(r29.r(r25, r28, Integer.MAX_VALUE, r3), new ln2(r24, r5));
        r32.f(new nn2(r32, r26, r5), r4);
        return;
    L39:
        pn2 r33 = (pn2) r9;
        fr2 r34 = (fr2) r8;
        nj2 r35 = (nj2) r7;
        Bundle r36 = (Bundle) r6;
        va4 r37 = new va4((String) r0, Bundle.EMPTY);
        if (r33.x.J(r34, r37) == true) goto L42;
        r35.e();
        return;
    L42:
        ic2 r38 = r33.z.q(r34, r37, r36);
        r38.f(new ws1(15, r38, r35), r4);
        return;
    L44:
        ((AtomicReference) r8).set(((pn2) r9).z.s((fr2) r0, (jn2) r7));
        ((q90) r6).d();
        return;
    L46:
        LinkedHashMap r39 = (LinkedHashMap) r8;
        NsdServiceInfo r40 = (NsdServiceInfo) r0;
        ArrayAdapter r41 = (ArrayAdapter) r7;
        f9 r42 = (f9) r6;
        if (((fx3) r9).n == true) goto L125;
        r39.put(r40.getServiceName(), r40);
        r41.clear();
        r41.addAll(r39.keySet());
        r42.setTitle(R.string.lan_choose_device);
        return;
    L125:
        return;
    L50:
        HubUpdater.f((f9) r9, (Activity) r8, r0, (HubUpdatePatch) r7, (HubAppRelease) r6);
        return;
    L52:
        Serializable r43 = (Serializable) r9;
        Context r111 = (Context) r8;
        String r112 = (String) r0;
        ArrayList r113 = (ArrayList) r7;
        String r114 = (String) r6;
        WeakReference r44 = a.a;
        if ((r43 instanceof s14) == true) goto L55;
        kd3 r45 = (kd3) r43;
        SmartOut r115 = (SmartOut) r45.n;
        List r116 = (List) r45.o;
        r111.getClass();
        a.k(r111, r112, r113, r115, r116, r114, 0);
    L55:
        Throwable r46 = bb3.a(r43);
        if (r46 == null) goto L126;
        Log.w("HubSmart", PlayEvent.START, r46);
        a.d = false;
        r111.getClass();
        if ((r46 instanceof HubException) == false) goto L60;
        HubException r47 = (HubException) r46;
    L61:
        if (r47 == null) goto L72;
        int r48 = r47.n;
        if (400 <= r48) goto L65;
    L69:
        if (r2 == null) goto L72;
        String r49 = r2.getMessage();
        if (r49 == null) goto L72;
    L73:
        Toast.makeText(r111, r49, 0).show();
        a.c();
        return;
    L65:
        if (r48 >= 500) goto L69;
        if (r48 == 404) goto L69;
        r2 = r47;
    L72:
        r49 = r111.getString(R.string.homemusic_smart_unavailable);
        r49.getClass();
        goto L73
    L60:
        r47 = null;
        goto L61
    L126:
        return;
    L75:
        up4 r50 = (up4) r8;
        up4 r51 = (up4) r0;
        View r52 = (View) r6;
        Window r53 = ((df) r7).getWindow();
        r53.getClass();
        if1 r54 = r50.c;
        Resources r55 = r52.getResources();
        r55.getClass();
        boolean r56 = ((Boolean) r54.invoke(r55)).booleanValue();
        if1 r57 = r51.c;
        Resources r58 = r52.getResources();
        r58.getClass();
        ((ez0) r9).b(r50, r51, r53, r52, r56, ((Boolean) r57.invoke(r58)).booleanValue());
        return;
    L77:
        ((aa0) r8).run().f(new t6((na4) r9, (AtomicBoolean) r0, (ba0) r7, (AtomicBoolean) r6, 3), r4);
        return;
    L79:
        zs4 r59 = (zs4) r9;
        r62 r60 = (r62) r8;
        String r117 = (String) r0;
        oo0 r118 = (oo0) r7;
        ha1 r119 = (ha1) r6;
        Trace.beginSection("BackgroundTextMeasurement");
        ch4 r61 = jh4.j();     // Catch: Throwable -> L102
        if ((r61 instanceof a13) == false) goto L83;
        a13 r62 = (a13) r61;     // Catch: Throwable -> L102
    L84:
        if (r62 == null) goto L105;
        a13 r63 = r62.C(null, null);     // Catch: Throwable -> L102
        if (r63 == null) goto L105;
        ch4 r64 = r63.j();     // Catch: Throwable -> L93
        zs4 r120 = ud3.g0(r59, r60);     // Catch: Throwable -> L95
        u01 r121 = u01.n;     // Catch: Throwable -> L95
        mc r122 = new mc(r117, r120, r121, r121, r119, r118, true);     // Catch: Throwable -> L95
        r122.d();     // Catch: Throwable -> L95
        r122.b();     // Catch: Throwable -> L95
        ch4.q(r64);     // Catch: Throwable -> L93
        r63.w().l();     // Catch: Throwable -> L102
        r63.c();     // Catch: Throwable -> L102
        Trace.endSection();
        return;
    L95:
        th = move-exception;
        ch4.q(r64);     // Catch: Throwable -> L93
        throw th;     // Catch: Throwable -> L93
    L93:
        th = move-exception;
        throw th;     // Catch: Throwable -> L99
    L99:
        th = move-exception;
        r63.c();     // Catch: Throwable -> L102
        throw th;     // Catch: Throwable -> L102
    L105:
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");     // Catch: Throwable -> L102
    L83:
        r62 = null;
    L102:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public /* synthetic */ mr(Object r1, Object r2, Object r3, Object r4, Object r5, int r6) {
        this.n = r6;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
        this.s = r5;
    }

    public /* synthetic */ mr(Object r1, String r2, Object r3, Object r4, Object r5, int r6) {
        this.n = r6;
        this.o = r1;
        this.q = r2;
        this.p = r3;
        this.r = r4;
        this.s = r5;
    }

    public /* synthetic */ mr(String r2, String r3, String r4, String r5, fu3 r6) {
        this.n = 11;
        this.q = r2;
        this.o = r3;
        this.p = r4;
        this.r = r5;
        this.s = r6;
    }
}
