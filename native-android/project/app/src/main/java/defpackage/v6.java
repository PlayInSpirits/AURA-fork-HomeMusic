package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartNextIn;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.SmartRec;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveNextIn;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.WaveTrack;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ v6(pn2 pn2Var, fr2 fr2Var, uj2 uj2Var, String str) {
        this.n = 26;
        this.o = pn2Var;
        this.p = fr2Var;
        this.q = uj2Var;
    }

    private final void a() {
        Bitmap bitmap;
        ic2 ic2Var = (ic2) this.o;
        lb4 lb4Var = (lb4) this.p;
        gn2 gn2Var = (gn2) this.q;
        try {
            bitmap = (Bitmap) hw.j(ic2Var);
        } catch (CancellationException | ExecutionException e) {
            l93.B("MLSLegacyStub", "failed to get bitmap", e);
            bitmap = null;
        }
        lb4Var.l(f92.a(gn2Var, bitmap));
    }

    private final void b() {
        pn2 pn2Var = (pn2) this.o;
        fr2 fr2Var = (fr2) this.p;
        uj2 uj2Var = (uj2) this.q;
        if (!pn2Var.x.I(fr2Var, 50004)) {
            uj2Var.f(null);
            return;
        }
        tn2 tn2Var = pn2Var.z;
        pq pqVar = tn2Var.D;
        tn2Var.B(fr2Var);
        pqVar.getClass();
        mw1 mw1Var = new mw1(m92.b(-6));
        int i = 0;
        mw1Var.f(new sn2(tn2Var, mw1Var, fr2Var, i), new rn2(tn2Var, i));
        lb4 lb4VarH0 = f35.h0(mw1Var, new ln2(pn2Var, i));
        lb4VarH0.f(new nn2(lb4VarH0, uj2Var, i), gq0.n);
    }

    private final void c() {
        tn2 tn2Var = (tn2) this.o;
        fr2 fr2Var = (fr2) this.p;
        String str = (String) this.q;
        tn2Var.getClass();
        er2 er2Var = fr2Var.d;
        er2Var.getClass();
        tn2Var.E.remove(str, fr2Var);
        tn2Var.F.remove(er2Var, str);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02cb A[Catch: all -> 0x028d, TryCatch #8 {all -> 0x028d, blocks: (B:105:0x025e, B:107:0x0286, B:122:0x02bd, B:123:0x02c5, B:125:0x02cb, B:126:0x02cd, B:112:0x028f, B:113:0x0293, B:115:0x0299, B:117:0x02a5, B:119:0x02a9, B:120:0x02b5, B:121:0x02bc), top: B:471:0x025e }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0367  */
    /* JADX WARN: Code duplicated, block: B:163:0x038e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0674 A[Catch: all -> 0x0635, TryCatch #2 {all -> 0x0635, blocks: (B:240:0x0606, B:242:0x062e, B:257:0x0666, B:258:0x066e, B:260:0x0674, B:261:0x0676, B:247:0x0637, B:248:0x063b, B:250:0x0641, B:252:0x064d, B:254:0x0651, B:255:0x065e, B:256:0x0665), top: B:460:0x0606 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        a00 a00Var;
        boolean zF;
        String message;
        Object s14Var;
        Object s14Var2;
        SmartOut smartOutV;
        List<SmartRec> recs;
        SmartSession smartSession;
        Long lAfterFailure;
        ao2 ao2Var;
        Object s14Var3;
        WaveOut waveOutZ;
        List<WaveTrack> tracks;
        Long lAfterFailure2;
        String string;
        int i = 12;
        va4 va4Var = null;
        final int i2 = 1;
        int i3 = 0;
        switch (this.n) {
            case 0:
                ArrayList arrayList = (ArrayList) this.o;
                s24 s24Var = (s24) ((ss0) this.p).n;
                int[] iArr = (int[]) this.q;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    w6 w6Var = (w6) obj;
                    String str = w6Var.a;
                    String str2 = w6Var.b;
                    int iIntValue = ((Integer) xl.E(s24Var, true, false, new ps0(0, str, str2))).intValue();
                    if (iIntValue > 0) {
                        Log.w("AlbumArtistBackfill", "Left album " + str + " alone, " + iIntValue + " unfilled rows under it are not filed as " + str2);
                    } else if (((Integer) xl.E(s24Var, false, true, new qs0(w6Var.c, str, str2, 0))).intValue() > 0) {
                        iArr[0] = iArr[0] + 1;
                    } else {
                        Log.w("AlbumArtistBackfill", "Album " + str + " changed no row as " + str2);
                    }
                }
                return;
            case 1:
                xc5 xc5Var = (xc5) this.o;
                tb1 tb1Var = (tb1) this.p;
                ej0 ej0Var = (ej0) this.q;
                qm qmVar = (qm) xc5Var.p;
                String str3 = f35.a;
                qmVar.y(tb1Var, ej0Var);
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.o;
                Handler handler = (Handler) this.p;
                tc2 tc2Var = (tc2) this.q;
                int i5 = 9;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new a0(i5, tc2Var));
                    }
                    synchronized (an.r) {
                        try {
                            int i6 = an.t - 1;
                            an.t = i6;
                            if (i6 == 0) {
                                ScheduledExecutorService scheduledExecutorService = an.s;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                an.s = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new a0(i5, tc2Var));
                    }
                    synchronized (an.r) {
                        try {
                            int i7 = an.t - 1;
                            an.t = i7;
                            if (i7 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = an.s;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                an.s = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                MediaService mediaService = (MediaService) this.o;
                List<kd3> list = (List) this.p;
                qi3 qi3Var = (qi3) this.q;
                if (mediaService.D) {
                    return;
                }
                for (kd3 kd3Var : list) {
                    int iIntValue2 = ((Number) kd3Var.n).intValue();
                    Object obj2 = kd3Var.o;
                    obj2.getClass();
                    gn2 gn2Var = (gn2) obj2;
                    if (iIntValue2 > qi3Var.o0() && iIntValue2 < qi3Var.Q0() && h12.c(qi3Var.Y(iIntValue2).a, gn2Var.a)) {
                        qi3Var.z0(iIntValue2, gn2Var);
                    }
                }
                return;
            case 4:
                WorkDatabase workDatabase = (WorkDatabase) this.o;
                String str4 = (String) this.p;
                sc5 sc5Var = (sc5) this.q;
                fd5 fd5VarA = workDatabase.A();
                fd5VarA.getClass();
                w24 w24VarB = w24.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                w24VarB.h(1, str4);
                WorkDatabase_Impl workDatabase_Impl = fd5VarA.a;
                workDatabase_Impl.b();
                Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorH.getCount());
                    while (cursorH.moveToNext()) {
                        arrayList2.add(cursorH.getString(0));
                    }
                    cursorH.close();
                    w24VarB.j();
                    int size2 = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj3 = arrayList2.get(i8);
                        i8++;
                        wr1.h(sc5Var, (String) obj3);
                    }
                    return;
                } catch (Throwable th4) {
                    cursorH.close();
                    w24VarB.j();
                    throw th4;
                }
            case 5:
                String str5 = (String) this.o;
                vz vzVar = (vz) this.p;
                yz yzVar = (yz) this.q;
                b00 b00Var = b00.a;
                kd3 kd3VarB = b00.b();
                if (h12.c(kd3VarB != null ? (String) kd3VarB.n : null, str5)) {
                    synchronized (b00Var) {
                        a00Var = (a00) b00.f.remove(vzVar.f);
                    }
                    if (a00Var != null) {
                        n61.l(a00Var.c);
                        zF = n61.f(1, a00Var.a, a00Var.b);
                    } else {
                        zF = vzVar.e;
                    }
                    Map mapX = lg2.X(new kd3("ref", vzVar.c), new kd3("star", Boolean.valueOf(zF)));
                    nk1 nk1Var = rr1.c;
                    WebView webView = hw.g;
                    if (webView != null) {
                        webView.evaluateJavascript(f34.h("window.dispatchEvent(new CustomEvent(", nk1Var.j("hm:hub-favorite"), ", {detail: ", nk1Var.j(mapX), "}));"), null);
                    }
                    Context contextA = App.a();
                    HubException hubException = yzVar.c;
                    if (hubException == null || (message = hubException.getMessage()) == null) {
                        message = "";
                    }
                    Toast.makeText(contextA, contextA.getString(R.string.homemusic_hub_action_failed, message), 1).show();
                    return;
                }
                return;
            case 6:
                xm0 xm0Var = (xm0) this.o;
                View view = (View) this.p;
                tm0 tm0Var = (tm0) this.q;
                xm0Var.a.endViewTransition(view);
                tm0Var.d();
                return;
            case 7:
                sw0 sw0Var = (sw0) this.o;
                ((tw0) this.p).c(sw0Var.a, sw0Var.b, (Exception) this.q);
                return;
            case 8:
                sw0 sw0Var2 = (sw0) this.o;
                ((tw0) this.p).D(sw0Var2.a, sw0Var2.b, (tv1) this.q);
                return;
            case 9:
                vj vjVar = (vj) this.o;
                bu buVar = (bu) this.p;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.q;
                try {
                    sa1 sa1VarO = si0.o(vjVar.n);
                    if (sa1VarO == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ra1 ra1Var = (ra1) ((sz0) sa1VarO.b);
                    synchronized (ra1Var.q) {
                        ra1Var.s = threadPoolExecutor;
                        break;
                    }
                    ((sz0) sa1VarO.b).a(new vz0(buVar, threadPoolExecutor));
                    return;
                } catch (Throwable th5) {
                    buVar.u(th5);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 10:
                gf1 gf1Var = (gf1) this.o;
                fo1 fo1Var = (fo1) this.p;
                gf1 gf1Var2 = (gf1) this.q;
                try {
                    s14Var = gf1Var.invoke();
                    break;
                } catch (Throwable th6) {
                    s14Var = new s14(th6);
                }
                io1.b.post(new v6(fo1Var, s14Var, gf1Var2, i));
                return;
            case 11:
                fo1 fo1Var2 = (fo1) this.o;
                Object obj4 = this.p;
                String str6 = (String) this.q;
                if (fo1Var2.c()) {
                    fo1Var2.r(false);
                    if (!(obj4 instanceof s14)) {
                        if (obj4 != null) {
                            kf2.k();
                            return;
                        }
                        ((uc1) fo1Var2.c).c.setText((CharSequence) null);
                        fo1Var2.h = str6;
                        System.currentTimeMillis();
                        throw null;
                    }
                    Throwable thA = bb3.a(obj4);
                    if (thA != null) {
                        String message2 = thA.getMessage();
                        if (message2 == null) {
                            message2 = fo1Var2.v(R.string.homemusic_login_no_hub, new Object[0]);
                        }
                        fo1Var2.t(message2);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                fo1 fo1Var3 = (fo1) this.o;
                Object obj5 = this.p;
                gf1 gf1Var3 = (gf1) this.q;
                if (fo1Var3.c()) {
                    if (!(obj5 instanceof s14)) {
                        kd3 kd3Var2 = (kd3) obj5;
                        fo1Var3.u((String) kd3Var2.n, (String) kd3Var2.o);
                    }
                    Throwable thA2 = bb3.a(obj5);
                    if (thA2 != null) {
                        fo1Var3.r(false);
                        if ((thA2 instanceof HubException) && ((HubException) thA2).n == 409 && gf1Var3 != null) {
                            gf1Var3.invoke();
                            return;
                        }
                        String message3 = thA2.getMessage();
                        if (message3 == null) {
                            message3 = fo1Var3.v(R.string.homemusic_login_no_hub, new Object[0]);
                        }
                        fo1Var3.t(message3);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                cp1 cp1Var = (cp1) this.o;
                HubMixToday hubMixToday = (HubMixToday) this.p;
                View view2 = (View) this.q;
                if (cp1Var.T == null || hubMixToday == null) {
                    return;
                }
                view2.setTag(hubMixToday);
                ud3.E0(view2, hubMixToday);
                return;
            case 14:
                cp1 cp1Var2 = (cp1) this.o;
                boolean[] zArr = (boolean[]) this.p;
                List list2 = (List) this.q;
                if (zArr[0]) {
                    return;
                }
                bo2.o(cp1Var2.F0, list2, 0);
                zArr[0] = true;
                return;
            case 15:
                vb4 vb4Var = (vb4) this.o;
                Preference preference = (Preference) this.p;
                String str7 = (String) this.q;
                if (vb4Var.y()) {
                    preference.x(str7);
                    return;
                }
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                HubShareActivity hubShareActivity = (HubShareActivity) this.o;
                jx3 jx3Var = (jx3) this.p;
                String str8 = (String) this.q;
                ux3 ux3Var = HubShareActivity.P;
                Object obj6 = jx3Var.n;
                obj6.getClass();
                String str9 = (String) obj6;
                String str10 = qm4.u0(str8) ? null : str8;
                if (hubShareActivity.isFinishing() || hubShareActivity.isDestroyed()) {
                    return;
                }
                if (str10 != null) {
                    Toast.makeText(hubShareActivity, str10, 1).show();
                }
                hubShareActivity.startActivity(new Intent(hubShareActivity, (Class<?>) MainActivity.class).addFlags(872415232).putExtra("homemusic_hub_route", str9));
                hubShareActivity.finish();
                return;
            case 17:
                SmartNextIn smartNextIn = (SmartNextIn) this.o;
                final String str11 = (String) this.p;
                SmartSession smartSession2 = (SmartSession) this.q;
                final jx3 jx3Var2 = new jx3();
                jx3Var2.n = smartNextIn;
                WeakReference weakReference = a.a;
                try {
                    b00 b00Var2 = b00.a;
                    String strA = b00.a();
                    rr1 rr1Var = rr1.a;
                    SmartNextIn smartNextInCompatible = smartNextIn.compatible(rr1.e().contains("typed_favorites_v1"), rr1.e().contains("favorite_compensation_chains_v1"), strA);
                    jx3Var2.n = smartNextInCompatible;
                    List<PlayEvent> played = smartNextInCompatible.getPlayed();
                    if (played == null || !played.isEmpty()) {
                        Iterator<T> it = played.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((PlayEvent) it.next()).getAccount() != null) {
                                    rr1 rr1Var2 = rr1.a;
                                    if (strA == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    final int i9 = 0;
                                    smartOutV = (SmartOut) rr1.B(strA, new gf1() { // from class: bt1
                                        @Override // defpackage.gf1
                                        public final Object invoke() {
                                            int i10 = i9;
                                            jx3 jx3Var3 = jx3Var2;
                                            String str12 = str11;
                                            switch (i10) {
                                                case 0:
                                                    return rr1.v(str12, (SmartNextIn) jx3Var3.n);
                                                default:
                                                    return rr1.z(str12, (WaveNextIn) jx3Var3.n);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        recs = smartOutV.getRecs();
                        if (recs == null) {
                            recs = u01.n;
                        }
                        s14Var2 = new kd3(smartOutV, a.l(recs));
                        io1.b.post(new v6(smartSession2, jx3Var2, s14Var2, 18));
                        return;
                    }
                    smartOutV = rr1.v(str11, (SmartNextIn) jx3Var2.n);
                    recs = smartOutV.getRecs();
                    if (recs == null) {
                        recs = u01.n;
                    }
                    s14Var2 = new kd3(smartOutV, a.l(recs));
                } catch (Throwable th7) {
                    s14Var2 = new s14(th7);
                }
                io1.b.post(new v6(smartSession2, jx3Var2, s14Var2, 18));
                return;
            case 18:
                SmartSession smartSession3 = (SmartSession) this.o;
                jx3 jx3Var3 = (jx3) this.p;
                Serializable serializable = (Serializable) this.q;
                WeakReference weakReference2 = a.a;
                SmartNextIn smartNextIn2 = (SmartNextIn) jx3Var3.n;
                smartSession3.setInFlight(false);
                if (a.b != smartSession3) {
                    return;
                }
                if (serializable instanceof s14) {
                    smartSession = null;
                } else {
                    kd3 kd3Var3 = (kd3) serializable;
                    SmartOut smartOut = (SmartOut) kd3Var3.n;
                    List list3 = (List) kd3Var3.o;
                    smartSession3.sent(smartNextIn2);
                    smartSession3.setFailures(0);
                    if (list3.isEmpty() || (ao2Var = (ao2) a.a.get()) == null) {
                        smartSession = null;
                    } else {
                        qi3 qi3VarH = a.h();
                        if (qi3VarH != null) {
                            if (!a.j(qi3VarH)) {
                                qi3VarH = null;
                            }
                            if (qi3VarH == null || a.b != smartSession3) {
                                qi3VarH = null;
                            }
                        } else {
                            qi3VarH = null;
                        }
                        if (qi3VarH == null) {
                            smartSession = null;
                        } else {
                            ArrayList arrayListE = a.e(qi3VarH);
                            smartSession = null;
                            ArrayList arrayList3 = new ArrayList(r40.k0(arrayListE, 10));
                            int size3 = arrayListE.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj7 = arrayListE.get(i10);
                                i10++;
                                gn2 gn2Var2 = (gn2) obj7;
                                String str12 = gn2Var2.a;
                                str12.getClass();
                                arrayList3.add(new s11(str12, smartSession3.isRec(gn2Var2.a)));
                            }
                            SmartPlan smartPlan = SmartPlan.INSTANCE;
                            int iO0 = qi3VarH.o0();
                            ArrayList arrayList4 = new ArrayList(r40.k0(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((dt1) it2.next()).a);
                            }
                            List<kd3> listInsertions = smartPlan.insertions(arrayList3, iO0, arrayList4);
                            if (!listInsertions.isEmpty()) {
                                int iW = lg2.W(r40.k0(list3, 10));
                                if (iW < 16) {
                                    iW = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                                for (Object obj8 : list3) {
                                    linkedHashMap.put(((dt1) obj8).a.getQueueId(), obj8);
                                }
                                ArrayList arrayList5 = new ArrayList(r40.k0(listInsertions, 10));
                                Iterator<T> it3 = listInsertions.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add((SmartRec) ((kd3) it3.next()).o);
                                }
                                List<String> listRegister = smartSession3.register(arrayList5);
                                rs1 rs1Var = rs1.a;
                                int iW2 = lg2.W(r40.k0(listRegister, 10));
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW2 >= 16 ? iW2 : 16);
                                for (Object obj9 : listRegister) {
                                    linkedHashMap2.put(obj9, smartSession3.getRecContext());
                                }
                                rs1.b(linkedHashMap2, a.f(smartSession3));
                                for (kd3 kd3Var4 : listInsertions) {
                                    int iIntValue3 = ((Number) kd3Var4.n).intValue();
                                    dt1 dt1Var = (dt1) linkedHashMap.get(((SmartRec) kd3Var4.o).getQueueId());
                                    if (dt1Var != null) {
                                        bo2.h(ao2Var, iIntValue3, gb.O(dt1Var.b), gb.O(dt1Var.c));
                                    }
                                }
                                String id = smartSession3.getId();
                                ArrayList arrayList6 = new ArrayList(r40.k0(listInsertions, 10));
                                Iterator<T> it4 = listInsertions.iterator();
                                while (it4.hasNext()) {
                                    arrayList6.add(((SmartRec) ((kd3) it4.next()).o).getRef());
                                }
                                ArrayList arrayList7 = new ArrayList(r40.k0(listInsertions, 10));
                                Iterator<T> it5 = listInsertions.iterator();
                                while (it5.hasNext()) {
                                    arrayList7.add(((SmartRec) ((kd3) it5.next()).o).getAfter());
                                }
                                Log.i("HubSmart", "next " + id + ": " + arrayList6 + " after " + arrayList7);
                            }
                        }
                    }
                    if (smartSession3.getAgain()) {
                        a.b();
                        return;
                    }
                    if (list3.isEmpty() && smartOut.getPending()) {
                        smartSession3.setPolls(smartSession3.getPolls() + 1);
                        Long lAfterPending = WaveRetry.INSTANCE.afterPending(smartSession3.getPolls());
                        if (lAfterPending != null) {
                            long jLongValue = lAfterPending.longValue();
                            a.d();
                            u6 u6Var = new u6(11);
                            a.c = u6Var;
                            io1.b.postDelayed(u6Var, jLongValue);
                        }
                    } else {
                        smartSession3.setPolls(0);
                    }
                }
                Throwable thA3 = bb3.a(serializable);
                if (thA3 != null) {
                    boolean z = thA3 instanceof HubException;
                    if (z && ((HubException) thA3).n == 404) {
                        smartSession3.expire();
                        a.b = smartSession;
                        a.d();
                        a.c();
                        return;
                    }
                    Log.w("HubSmart", "next " + smartSession3.getId() + ": " + thA3.getMessage());
                    if (!z) {
                        rr1.m();
                    }
                    smartSession3.setFailures(smartSession3.getFailures() + 1);
                    if (!smartSession3.getAgain() || (lAfterFailure = WaveRetry.INSTANCE.afterFailure(smartSession3.getFailures())) == null) {
                        return;
                    }
                    long jLongValue2 = lAfterFailure.longValue();
                    a.d();
                    u6 u6Var2 = new u6(11);
                    a.c = u6Var2;
                    io1.b.postDelayed(u6Var2, jLongValue2);
                    return;
                }
                return;
            case 19:
                Object obj10 = this.o;
                Context context = (Context) this.p;
                String str13 = (String) this.q;
                if (!(obj10 instanceof s14)) {
                    obj10.getClass();
                    kf2.k();
                    return;
                }
                Throwable thA4 = bb3.a(obj10);
                if (thA4 != null) {
                    Log.w("HubTracks", "download ".concat(str13), thA4);
                    String message4 = thA4.getMessage();
                    if (message4 == null) {
                        message4 = "";
                    }
                    Toast.makeText(context, context.getString(R.string.homemusic_hub_action_failed, message4), 1).show();
                    return;
                }
                return;
            case 20:
                WaveNextIn waveNextIn = (WaveNextIn) this.o;
                final String str14 = (String) this.p;
                WaveSession waveSession = (WaveSession) this.q;
                final jx3 jx3Var4 = new jx3();
                jx3Var4.n = waveNextIn;
                WeakReference weakReference3 = b.a;
                try {
                    b00 b00Var3 = b00.a;
                    String strA2 = b00.a();
                    rr1 rr1Var3 = rr1.a;
                    WaveNextIn waveNextInCompatible = waveNextIn.compatible(rr1.e().contains("typed_favorites_v1"), rr1.e().contains("favorite_compensation_chains_v1"), strA2);
                    jx3Var4.n = waveNextInCompatible;
                    List<PlayEvent> played2 = waveNextInCompatible.getPlayed();
                    if (played2 == null || !played2.isEmpty()) {
                        Iterator<T> it6 = played2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (((PlayEvent) it6.next()).getAccount() != null) {
                                    rr1 rr1Var4 = rr1.a;
                                    if (strA2 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    waveOutZ = (WaveOut) rr1.B(strA2, new gf1() { // from class: bt1
                                        @Override // defpackage.gf1
                                        public final Object invoke() {
                                            int i11 = i2;
                                            jx3 jx3Var5 = jx3Var4;
                                            String str15 = str14;
                                            switch (i11) {
                                                case 0:
                                                    return rr1.v(str15, (SmartNextIn) jx3Var5.n);
                                                default:
                                                    return rr1.z(str15, (WaveNextIn) jx3Var5.n);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        tracks = waveOutZ.getTracks();
                        if (tracks == null) {
                            tracks = u01.n;
                        }
                        s14Var3 = new kd3(waveOutZ, b.k(waveSession.getContext(), tracks));
                        io1.b.post(new v6(waveSession, jx3Var4, s14Var3, 21));
                        return;
                    }
                    waveOutZ = rr1.z(str14, (WaveNextIn) jx3Var4.n);
                    tracks = waveOutZ.getTracks();
                    if (tracks == null) {
                        tracks = u01.n;
                    }
                    s14Var3 = new kd3(waveOutZ, b.k(waveSession.getContext(), tracks));
                } catch (Throwable th8) {
                    s14Var3 = new s14(th8);
                }
                io1.b.post(new v6(waveSession, jx3Var4, s14Var3, 21));
                return;
            case 21:
                WaveSession waveSession2 = (WaveSession) this.o;
                jx3 jx3Var5 = (jx3) this.p;
                Serializable serializable2 = (Serializable) this.q;
                WeakReference weakReference4 = b.a;
                WaveNextIn waveNextIn2 = (WaveNextIn) jx3Var5.n;
                waveSession2.setInFlight(false);
                if (b.b != waveSession2) {
                    return;
                }
                if (!(serializable2 instanceof s14)) {
                    kd3 kd3Var5 = (kd3) serializable2;
                    WaveOut waveOut = (WaveOut) kd3Var5.n;
                    List list4 = (List) kd3Var5.o;
                    waveSession2.sent(waveNextIn2);
                    waveSession2.setFailures(0);
                    b.b(waveSession2, list4);
                    waveSession2.setSettledFor(waveSession2.getAskedFor());
                    if (waveSession2.getAgain()) {
                        b.c();
                        return;
                    }
                    b.f(waveSession2);
                    qi3 qi3VarJ = b.j(waveSession2);
                    if (qi3VarJ == null) {
                        return;
                    }
                    int size4 = b.a(qi3VarJ, waveSession2).size();
                    if (list4.isEmpty() && waveOut.getPending() && size4 <= 2) {
                        waveSession2.setPolls(waveSession2.getPolls() + 1);
                        Long lAfterPending2 = WaveRetry.INSTANCE.afterPending(waveSession2.getPolls());
                        if (lAfterPending2 != null) {
                            long jLongValue3 = lAfterPending2.longValue();
                            b.e();
                            u6 u6Var3 = new u6(i);
                            b.c = u6Var3;
                            io1.b.postDelayed(u6Var3, jLongValue3);
                        }
                    } else {
                        waveSession2.setPolls(0);
                    }
                }
                Throwable thA5 = bb3.a(serializable2);
                if (thA5 != null) {
                    boolean z2 = thA5 instanceof HubException;
                    if (z2 && ((HubException) thA5).n == 404) {
                        String id2 = waveSession2.getId();
                        waveSession2.setInFlight(true);
                        io1.a.execute(new ws1(waveSession2, id2, 5));
                        return;
                    }
                    Log.w("HubWave", "next " + waveSession2.getId() + ": " + thA5.getMessage());
                    if (!z2) {
                        rr1.m();
                    }
                    waveSession2.setFailures(waveSession2.getFailures() + 1);
                    b.f(waveSession2);
                    qi3 qi3VarJ2 = b.j(waveSession2);
                    if (qi3VarJ2 != null) {
                        int size5 = b.a(qi3VarJ2, waveSession2).size();
                        if ((waveSession2.getAgain() || size5 <= 2) && (lAfterFailure2 = WaveRetry.INSTANCE.afterFailure(waveSession2.getFailures())) != null) {
                            long jLongValue4 = lAfterFailure2.longValue();
                            b.e();
                            u6 u6Var4 = new u6(i);
                            b.c = u6Var4;
                            io1.b.postDelayed(u6Var4, jLongValue4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                MainActivity mainActivity = (MainActivity) this.o;
                Object obj11 = this.p;
                Runnable runnable = (Runnable) this.q;
                if (mainActivity.isFinishing() || mainActivity.isDestroyed()) {
                    return;
                }
                if (!(obj11 instanceof s14)) {
                    b.i(mainActivity, (WaveOut) obj11);
                }
                Throwable thA6 = bb3.a(obj11);
                if (thA6 != null) {
                    Log.w("HubWave", PlayEvent.START, thA6);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    HubException hubException2 = thA6 instanceof HubException ? (HubException) thA6 : null;
                    if (hubException2 == null || (string = hubException2.getMessage()) == null) {
                        string = mainActivity.getString(R.string.homemusic_wave_failed);
                        string.getClass();
                    }
                    Toast.makeText(mainActivity, string, 1).show();
                    return;
                }
                return;
            case 23:
                fx3 fx3Var = (fx3) this.o;
                fx3 fx3Var2 = (fx3) this.p;
                f9 f9Var = (f9) this.q;
                fx3Var.n = false;
                if (fx3Var2.n) {
                    return;
                }
                f9Var.setTitle(R.string.lan_connection_error);
                return;
            case 24:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.o;
                oy oyVar = (oy) this.p;
                uy1 uy1Var = (uy1) this.q;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    uy1Var.invoke();
                    oyVar.a(null);
                    return;
                } catch (Throwable th9) {
                    oyVar.b(th9);
                    return;
                }
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                pn2 pn2Var = (pn2) this.o;
                fr2 fr2Var = (fr2) this.p;
                String str15 = (String) this.q;
                if (pn2Var.x.I(fr2Var, 50002)) {
                    pn2Var.z.z(fr2Var, str15);
                    return;
                }
                return;
            case 28:
                c();
                return;
            default:
                sk2 sk2Var = (sk2) this.o;
                String str16 = (String) this.p;
                Bundle bundle = (Bundle) this.q;
                sk2Var.c1();
                rk2 rk2Var = sk2Var.d;
                o15 it7 = (!rk2Var.Y() ? wa4.b : rk2Var.P0()).a.iterator();
                while (it7.hasNext()) {
                    va4 va4Var2 = (va4) it7.next();
                    if (va4Var2.a == 0 && va4Var2.b.equals(str16)) {
                        va4Var = va4Var2;
                        if (va4Var == null || j60.n(str16)) {
                            ic2 ic2VarB1 = sk2Var.b1(new va4(str16, bundle), Bundle.EMPTY);
                            ic2VarB1.f(new lg1(i3, ic2VarB1, new vc0(str16)), gq0.n);
                            return;
                        }
                        return;
                    }
                }
                if (va4Var == null) {
                }
                ic2 ic2VarB2 = sk2Var.b1(new va4(str16, bundle), Bundle.EMPTY);
                ic2VarB2.f(new lg1(i3, ic2VarB2, new vc0(str16)), gq0.n);
                return;
        }
    }

    public /* synthetic */ v6(lo2 lo2Var, sk2 sk2Var, String str, Bundle bundle) {
        this.n = 29;
        this.o = sk2Var;
        this.p = str;
        this.q = bundle;
    }

    public /* synthetic */ v6(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
