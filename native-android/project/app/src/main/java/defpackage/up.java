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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

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

    public /* synthetic */ up(vb4 vb4Var, HubMe hubMe, jx3 jx3Var, String str, jx3 jx3Var2, Preference preference) {
        this.n = 1;
        this.p = vb4Var;
        this.q = hubMe;
        this.r = jx3Var;
        this.o = str;
        this.s = jx3Var2;
        this.t = preference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        Object s14Var2;
        switch (this.n) {
            case 0:
                MediaService mediaService = (MediaService) this.p;
                qi3 qi3Var = (qi3) this.q;
                String str = (String) this.o;
                ArrayList arrayList = (ArrayList) this.r;
                hx3 hx3Var = (hx3) this.s;
                ix3 ix3Var = (ix3) this.t;
                if (!mediaService.D && qi3Var.Q0() <= 0) {
                    if (h12.c(str, ud3.u())) {
                        qi3Var.T(arrayList, hx3Var.n, ix3Var.n);
                        qi3Var.b();
                        mediaService.w(qi3Var);
                        break;
                    } else if (qi3Var.Q0() <= 0) {
                        new Thread(new k6(10, mediaService, qi3Var)).start();
                        break;
                    }
                }
                break;
            case 1:
                vb4 vb4Var = (vb4) this.p;
                HubMe hubMe = (HubMe) this.q;
                jx3 jx3Var = (jx3) this.r;
                String str2 = (String) this.o;
                jx3 jx3Var2 = (jx3) this.s;
                Preference preference = (Preference) this.t;
                if (vb4Var.y() && hubMe != null) {
                    jx3Var.n = str2;
                    jx3Var2.n = hubMe.getGoogleEmail();
                    bu.e(jx3Var, vb4Var, preference, jx3Var2);
                    break;
                }
                break;
            case 2:
                gf1 gf1Var = (gf1) this.p;
                jx3 jx3Var3 = (jx3) this.q;
                String str3 = (String) this.o;
                jx3 jx3Var4 = (jx3) this.r;
                vb4 vb4Var2 = (vb4) this.s;
                Preference preference2 = (Preference) this.t;
                try {
                    s14Var = gf1Var.invoke();
                } catch (Throwable th) {
                    s14Var = new s14(th);
                }
                io1.b.post(new up(s14Var, jx3Var3, str3, jx3Var4, vb4Var2, preference2, 3));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Object obj = this.p;
                jx3 jx3Var5 = (jx3) this.q;
                String str4 = (String) this.o;
                jx3 jx3Var6 = (jx3) this.r;
                vb4 vb4Var3 = (vb4) this.s;
                Preference preference3 = (Preference) this.t;
                if (!(obj instanceof s14)) {
                    jx3Var5.n = ((HubMe) obj).getGoogleEmail();
                    bu.e(jx3Var6, vb4Var3, preference3, jx3Var5);
                    bu.f(vb4Var3, str4);
                }
                Throwable thA = bb3.a(obj);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = vb4Var3.s(R.string.homemusic_hub_unreachable);
                        message.getClass();
                    }
                    bu.f(vb4Var3, message);
                }
                break;
            case 4:
                String str5 = (String) this.o;
                ArrayList arrayList2 = (ArrayList) this.r;
                String str6 = (String) this.p;
                String str7 = (String) this.q;
                Context context = (Context) this.s;
                String str8 = (String) this.t;
                WeakReference weakReference = a.a;
                try {
                    SmartOut smartOutW = rr1.w(SmartSession.Companion.startBody(str5, arrayList2, str6 != null ? SmartContexts.INSTANCE.hubId(str6) : null, (String) a.e.get(str5), str7, rs1.f()));
                    List<SmartRec> recs = smartOutW.getRecs();
                    if (recs == null) {
                        recs = u01.n;
                    }
                    s14Var2 = new kd3(smartOutW, a.l(recs));
                } catch (Throwable th2) {
                    s14Var2 = new s14(th2);
                }
                io1.b.post(new mr(s14Var2, context, str5, arrayList2, str8, 3));
                break;
            case 5:
                HubUpdater.download$lambda$0((Activity) this.p, (HubAppRelease) this.q, (HubUpdatePatch) this.o, (LinearProgressIndicator) this.r, (TextView) this.s, (f9) this.t);
                break;
            default:
                String str9 = (String) this.o;
                String str10 = (String) this.p;
                String str11 = (String) this.q;
                String str12 = (String) this.r;
                String str13 = (String) this.s;
                fu3 fu3Var = (fu3) this.t;
                AppDatabase appDatabaseY = AppDatabase.y();
                int i = 0;
                InternetRadioStationCache internetRadioStationCache = (InternetRadioStationCache) xl.E((AppDatabase_Impl) appDatabaseY.z().o, true, false, new rs0(7, str9));
                if (internetRadioStationCache != null) {
                    internetRadioStationCache.setName(str10);
                    internetRadioStationCache.setStreamUrl(str11);
                    internetRadioStationCache.setHomePageUrl(str12);
                    internetRadioStationCache.setCoverArtUrl(str13);
                    c12 c12VarZ = appDatabaseY.z();
                    xl.E((AppDatabase_Impl) c12VarZ.o, false, true, new b12(c12VarZ, internetRadioStationCache, i));
                    if (str13 != null && !str13.isEmpty()) {
                        xt3.b(str9, str13);
                    }
                }
                new Handler(Looper.getMainLooper()).post(fu3Var);
                break;
        }
    }

    public /* synthetic */ up(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.n = i;
        this.p = obj;
        this.q = obj2;
        this.o = obj3;
        this.r = obj4;
        this.s = obj5;
        this.t = obj6;
    }

    public /* synthetic */ up(String str, String str2, String str3, String str4, String str5, fu3 fu3Var) {
        this.n = 6;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        this.t = fu3Var;
    }

    public /* synthetic */ up(String str, ArrayList arrayList, String str2, String str3, Context context, String str4) {
        this.n = 4;
        this.o = str;
        this.r = arrayList;
        this.p = str2;
        this.q = str3;
        this.s = context;
        this.t = str4;
    }
}
