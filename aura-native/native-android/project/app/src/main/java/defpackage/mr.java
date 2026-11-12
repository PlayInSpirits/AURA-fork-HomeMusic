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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ mr(pn2 pn2Var, fr2 fr2Var, uj2 uj2Var, Bundle bundle, String str) {
        this.n = 8;
        this.o = pn2Var;
        this.p = fr2Var;
        this.r = uj2Var;
        this.s = bundle;
        this.q = str;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0229  */
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
        a13 a13VarC;
        String string;
        int i = this.n;
        HubException hubException = null;
        jn2VarH = null;
        jn2 jn2VarH = null;
        hubException = null;
        hubException = null;
        gq0 gq0Var = gq0.n;
        int i2 = 1;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.q;
        switch (i) {
            case 0:
                zs4 zs4Var = (zs4) obj4;
                r62 r62Var = (r62) obj3;
                String str = (String) obj5;
                oo0 oo0Var = (oo0) obj2;
                ha1 ha1Var = (ha1) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ch4 ch4VarJ = jh4.j();
                    a13 a13Var = ch4VarJ instanceof a13 ? (a13) ch4VarJ : null;
                    if (a13Var == null || (a13VarC = a13Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        ch4 ch4VarJ2 = a13VarC.j();
                        try {
                            zs4 zs4VarG0 = ud3.g0(zs4Var, r62Var);
                            u01 u01Var = u01.n;
                            mc mcVar = new mc(str, zs4VarG0, u01Var, u01Var, ha1Var, oo0Var, true);
                            mcVar.d();
                            mcVar.b();
                            ch4.q(ch4VarJ2);
                            a13VarC.w().l();
                            a13VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            ch4.q(ch4VarJ2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            a13VarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 1:
                ((aa0) obj3).run().f(new t6((na4) obj4, (AtomicBoolean) obj5, (ba0) obj2, (AtomicBoolean) obj, 3), gq0Var);
                return;
            case 2:
                up4 up4Var = (up4) obj3;
                up4 up4Var2 = (up4) obj5;
                View view = (View) obj;
                Window window = ((df) obj2).getWindow();
                window.getClass();
                if1 if1Var = up4Var.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) if1Var.invoke(resources)).booleanValue();
                if1 if1Var2 = up4Var2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((ez0) obj4).b(up4Var, up4Var2, window, view, zBooleanValue, ((Boolean) if1Var2.invoke(resources2)).booleanValue());
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Serializable serializable = (Serializable) obj4;
                Context context = (Context) obj3;
                String str2 = (String) obj5;
                ArrayList arrayList = (ArrayList) obj2;
                String str3 = (String) obj;
                WeakReference weakReference = a.a;
                if (!(serializable instanceof s14)) {
                    kd3 kd3Var = (kd3) serializable;
                    SmartOut smartOut = (SmartOut) kd3Var.n;
                    List list = (List) kd3Var.o;
                    context.getClass();
                    a.k(context, str2, arrayList, smartOut, list, str3, 0);
                }
                Throwable thA = bb3.a(serializable);
                if (thA != null) {
                    Log.w("HubSmart", PlayEvent.START, thA);
                    a.d = false;
                    context.getClass();
                    HubException hubException2 = thA instanceof HubException ? (HubException) thA : null;
                    if (hubException2 == null) {
                        string = context.getString(R.string.homemusic_smart_unavailable);
                        string.getClass();
                    } else {
                        int i3 = hubException2.n;
                        if (400 <= i3 && i3 < 500 && i3 != 404) {
                            hubException = hubException2;
                        }
                        if (hubException == null || (string = hubException.getMessage()) == null) {
                            string = context.getString(R.string.homemusic_smart_unavailable);
                            string.getClass();
                        }
                    }
                    Toast.makeText(context, string, 0).show();
                    a.c();
                    return;
                }
                return;
            case 4:
                HubUpdater.download$lambda$0$1((f9) obj4, (Activity) obj3, obj5, (HubUpdatePatch) obj2, (HubAppRelease) obj);
                return;
            case 5:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) obj5;
                ArrayAdapter arrayAdapter = (ArrayAdapter) obj2;
                f9 f9Var = (f9) obj;
                if (((fx3) obj4).n) {
                    return;
                }
                linkedHashMap.put(nsdServiceInfo.getServiceName(), nsdServiceInfo);
                arrayAdapter.clear();
                arrayAdapter.addAll(linkedHashMap.keySet());
                f9Var.setTitle(R.string.lan_choose_device);
                return;
            case 6:
                ((AtomicReference) obj3).set(((pn2) obj4).z.s((fr2) obj5, (jn2) obj2));
                ((q90) obj).d();
                return;
            case 7:
                pn2 pn2Var = (pn2) obj4;
                fr2 fr2Var = (fr2) obj3;
                nj2 nj2Var = (nj2) obj2;
                Bundle bundle = (Bundle) obj;
                va4 va4Var = new va4((String) obj5, Bundle.EMPTY);
                if (!pn2Var.x.J(fr2Var, va4Var)) {
                    nj2Var.e();
                    return;
                } else {
                    ic2 ic2VarQ = pn2Var.z.q(fr2Var, va4Var, bundle);
                    ic2VarQ.f(new ws1(15, ic2VarQ, nj2Var), gq0Var);
                    return;
                }
            case 8:
                pn2 pn2Var2 = (pn2) obj4;
                fr2 fr2Var2 = (fr2) obj3;
                uj2 uj2Var = (uj2) obj2;
                Bundle bundle2 = (Bundle) obj;
                String str4 = (String) obj5;
                tn2 tn2Var = pn2Var2.z;
                if (!pn2Var2.x.I(fr2Var2, 50003)) {
                    uj2Var.f(null);
                    return;
                }
                if (bundle2 != null) {
                    bundle2.setClassLoader(tn2Var.f.getClassLoader());
                    try {
                        int i4 = bundle2.getInt("android.media.browse.extra.PAGE");
                        int i5 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE");
                        jn2VarH = f92.h(tn2Var.f, bundle2);
                        if (i4 >= 0 && i5 > 0) {
                            lb4 lb4VarH0 = f35.h0(tn2Var.r(fr2Var2, str4, i5, jn2VarH), new ln2(pn2Var2, i2));
                            lb4VarH0.f(new nn2(lb4VarH0, uj2Var, i2), gq0Var);
                            return;
                        }
                    } catch (BadParcelableException unused) {
                    }
                }
                lb4 lb4VarH1 = f35.h0(tn2Var.r(fr2Var2, str4, Integer.MAX_VALUE, jn2VarH), new ln2(pn2Var2, i2));
                lb4VarH1.f(new nn2(lb4VarH1, uj2Var, i2), gq0Var);
                return;
            case 9:
                String str5 = (String) obj5;
                gf1 gf1Var = (gf1) obj3;
                k03 k03Var = (k03) obj2;
                oy oyVar = (oy) obj;
                ((i80) obj4).getClass();
                boolean zY = xl.y();
                if (zY) {
                    try {
                        Trace.beginSection(xl.N(str5));
                    } catch (Throwable th5) {
                        if (zY) {
                            Trace.endSection();
                        }
                        throw th5;
                    }
                }
                try {
                    gf1Var.invoke();
                    qa3 qa3Var = rv2.v;
                    k03Var.i(qa3Var);
                    oyVar.a(qa3Var);
                    break;
                } catch (Throwable th6) {
                    k03Var.i(new pa3(th6));
                    oyVar.b(th6);
                    break;
                }
                if (zY) {
                    Trace.endSection();
                    return;
                }
                return;
            case 10:
                mm3 mm3Var = (mm3) obj4;
                String str6 = (String) obj5;
                String str7 = (String) obj3;
                App.f(false).g().S(str6, str7, mm3Var.j(str6), null, null).enqueue(new z40(mm3Var, str6, str7, (ArrayList) obj2, (lm3) obj));
                return;
            default:
                String str8 = (String) obj2;
                fu3 fu3Var = (fu3) obj;
                String str9 = "local_" + UUID.randomUUID().toString();
                InternetRadioStationCache internetRadioStationCache = new InternetRadioStationCache();
                internetRadioStationCache.setId(str9);
                internetRadioStationCache.setName((String) obj5);
                internetRadioStationCache.setStreamUrl((String) obj4);
                internetRadioStationCache.setHomePageUrl((String) obj3);
                internetRadioStationCache.setSource(InternetRadioStationCache.SOURCE_LOCAL);
                internetRadioStationCache.setCoverArtUrl(str8);
                c12 c12VarZ = AppDatabase.y().z();
                xl.E((AppDatabase_Impl) c12VarZ.o, false, true, new b12(c12VarZ, internetRadioStationCache, i2));
                if (str8 != null && !str8.isEmpty()) {
                    xt3.b(str9, str8);
                }
                new Handler(Looper.getMainLooper()).post(fu3Var);
                return;
        }
    }

    public /* synthetic */ mr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
    }

    public /* synthetic */ mr(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.q = str;
        this.p = obj2;
        this.r = obj3;
        this.s = obj4;
    }

    public /* synthetic */ mr(String str, String str2, String str3, String str4, fu3 fu3Var) {
        this.n = 11;
        this.q = str;
        this.o = str2;
        this.p = str3;
        this.r = str4;
        this.s = fu3Var;
    }
}
