package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.Rating;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.interfaces.ScanCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pz1 implements y14, eg1, kg1, lm3, Callback, cq0, u55, ScanCallback, c11, y34, ck2, ci, ou2 {
    public final /* synthetic */ int n;
    public Object o;

    public pz1(int i) {
        this.n = i;
        switch (i) {
            case 7:
                this.o = new Bundle();
                break;
            case 15:
                this.o = new xe2((Object) null);
                break;
            case 19:
                this.o = new LinkedHashMap();
                break;
            case 20:
                this.o = AppDatabase.y().G();
                break;
            default:
                wf2 wf2Var = new wf2();
                this.o = wf2Var;
                if (!wf2Var.o) {
                    if (wf2Var.p) {
                        po3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    wf2Var.a();
                    wf2Var.p = true;
                    break;
                }
                break;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList A(defpackage.pz1 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz1.A(pz1, java.lang.String):java.util.ArrayList");
    }

    private final void w(Call call, Throwable th) {
    }

    private final void x() {
    }

    public gp3 B(rf2 rf2Var, ra raVar) {
        long j;
        boolean z;
        long jE;
        xe2 xe2Var = (xe2) this.o;
        List list = (List) rf2Var.n;
        xe2 xe2Var2 = new xe2(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            qn3 qn3Var = (qn3) list.get(i);
            long j2 = qn3Var.a;
            pn3 pn3Var = (pn3) xe2Var.b(j2);
            if (pn3Var == null) {
                j = qn3Var.b;
                jE = qn3Var.d;
                z = false;
            } else {
                long j3 = pn3Var.a;
                j = j3;
                z = pn3Var.c;
                jE = raVar.E(pn3Var.b);
            }
            long j4 = qn3Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            xe2Var2.f(j4, new on3(j4, qn3Var.b, qn3Var.d, qn3Var.e, qn3Var.f, j, jE, z, qn3Var.g, qn3Var.i, qn3Var.j, qn3Var.k, qn3Var.l, qn3Var.m));
            boolean z2 = qn3Var.e;
            if (z2) {
                xe2Var.f(j2, new pn3(qn3Var.b, qn3Var.c, z2));
            } else {
                xe2Var.g(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new gp3(11, xe2Var2, rf2Var);
    }

    public void C(String str, Bitmap bitmap) {
        Integer num = (Integer) eo2.q.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.o).putParcelable(str, bitmap);
        } else {
            kf2.n(xa3.h("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    public void D(String str, long j) {
        Integer num = (Integer) eo2.q.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.o).putLong(str, j);
        } else {
            kf2.n(xa3.h("The ", str, " key cannot be used to put a long"));
        }
    }

    public void E(String str, mu3 mu3Var) {
        Object obj;
        float f = mu3Var.o;
        Integer num = (Integer) eo2.q.get(str);
        if (num != null && num.intValue() != 3) {
            kf2.n(xa3.h("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.o;
        if (mu3Var.p == null) {
            boolean zC = mu3Var.c();
            int i = mu3Var.n;
            if (zC) {
                switch (i) {
                    case 1:
                        mu3Var.p = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        mu3Var.p = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    case 4:
                    case 5:
                        mu3Var.p = Rating.newStarRating(i, mu3Var.b());
                        break;
                    case 6:
                        if (i != 6 || !mu3Var.c()) {
                            f = -1.0f;
                        }
                        mu3Var.p = Rating.newPercentageRating(f);
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                mu3Var.p = Rating.newUnratedRating(i);
            }
            obj = mu3Var.p;
        } else {
            obj = mu3Var.p;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public void F(String str, String str2) {
        Integer num = (Integer) eo2.q.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.o).putCharSequence(str, str2);
        } else {
            kf2.n(xa3.h("The ", str, " key cannot be used to put a String"));
        }
    }

    public void G(CharSequence charSequence, String str) {
        Integer num = (Integer) eo2.q.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.o).putCharSequence(str, charSequence);
        } else {
            kf2.n(xa3.h("The ", str, " key cannot be used to put a CharSequence"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[LOOP:0: B:22:0x0051->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EDGE_INSN: B:53:0x0099->B:35:0x0099 BREAK  A[LOOP:0: B:22:0x0051->B:34:0x0096], SYNTHETIC] */
    public Object H(y00 y00Var, gf1 gf1Var) {
        jf4 jf4Var;
        y94 y94Var;
        if (((rp) this.o) == null) {
            oo3.b("Called runAndWatch on a manager that has been disposed of");
        }
        rp rpVar = (rp) this.o;
        if ((rpVar instanceof jf4) && (y94Var = (jf4Var = (jf4) rpVar).f) != null && !y94Var.equals(y00Var)) {
            kz2 kz2Var = new kz2();
            y94 y94Var2 = jf4Var.f;
            if (y94Var2 == null) {
                oo3.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            x03 x03Var = jf4Var.d;
            ArrayList arrayList = kz2Var.c;
            if (x03Var != null) {
                Object[] objArr = x03Var.b;
                long[] jArr = x03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new hz2(objArr[(i << 3) + i4], y94Var2));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = jf4Var.b;
                obj.getClass();
                arrayList.add(new hz2(obj, y94Var2));
            }
            kz2Var.f();
            jf4Var.h();
            this.o = kz2Var;
        }
        rp rpVar2 = (rp) this.o;
        rpVar2.getClass();
        ch4 ch4VarU = jh4.j().u(rpVar2.m(y00Var));
        rpVar2.e(y00Var);
        try {
            ch4 ch4VarJ = ch4VarU.j();
            try {
                Object objInvoke = gf1Var.invoke();
                ch4.q(ch4VarJ);
                ch4VarU.c();
                rpVar2.f();
                return objInvoke;
            } catch (Throwable th) {
                ch4.q(ch4VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            ch4VarU.c();
            throw th2;
        }
    }

    public void I(String str, Bundle bundle) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            kf2.n(xa3.h("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        } else {
            ((MediaController.TransportControls) this.o).sendCustomAction(str, bundle);
        }
    }

    public void J(float f) {
        if (f == 0.0f) {
            kf2.n("speed must not be zero");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
        I("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
    }

    @Override // defpackage.u55
    public int a(View view) {
        return mw3.A(view) - ((ViewGroup.MarginLayoutParams) ((nw3) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        jg2 jg2Var = (jg2) this.o;
        jg2Var.getClass();
        entry.getClass();
        return new hg2(entry, jg2Var);
    }

    @Override // defpackage.y34
    public x34 b(String str) {
        str.getClass();
        return new po4(((so4) this.o).z());
    }

    @Override // defpackage.ck2
    public void c(Bundle bundle) {
        ((MediaCodec) this.o).setParameters(bundle);
    }

    @Override // defpackage.u55
    public int d() {
        return ((mw3) this.o).F();
    }

    @Override // defpackage.ck2
    public void e(int i, fg0 fg0Var, long j, int i2) {
        ((MediaCodec) this.o).queueSecureInputBuffer(i, 0, fg0Var.i, j, i2);
    }

    @Override // defpackage.ck2
    public void f(int i, int i2, int i3, long j) {
        ((MediaCodec) this.o).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ck2
    public void flush() {
    }

    @Override // defpackage.lm3
    public void g() {
        int i = 0;
        switch (this.n) {
            case 12:
                sl3 sl3Var = (sl3) this.o;
                if (sl3Var.y() && sl3Var.n() != null) {
                    sl3Var.X().runOnUiThread(new rl3(this, i));
                    break;
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.o;
                if (mainActivity.R != null) {
                    Toast.makeText(mainActivity, R.string.song_bottom_sheet_undo_failure, 0).show();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        ((lb4) this.o).l(((cw2) obj).a);
    }

    @Override // defpackage.c11
    public boolean i(Object obj, File file, db3 db3Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        qj0 qj0Var = (qj0) this.o;
        byte[] bArr = (byte[]) qj0Var.d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        qj0Var.h(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        qj0Var.h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                qj0Var.h(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ck2
    public void j() {
    }

    @Override // defpackage.u55
    public int k() {
        mw3 mw3Var = (mw3) this.o;
        return mw3Var.n - mw3Var.G();
    }

    @Override // defpackage.ou2
    public boolean m(qu2 qu2Var, MenuItem menuItem) {
        return false;
    }

    public void n(jw2 jw2Var) {
        jw2Var.getClass();
        int i = jw2Var.a;
        int i2 = jw2Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.o;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + jw2Var);
        }
        treeMap2.put(Integer.valueOf(i2), jw2Var);
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        ((lb4) this.o).m(th);
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public void onError(Exception exc) {
        ((vb4) this.o).h0("scan_library").x(exc.getMessage());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 13:
                break;
            case 14:
                Log.e("PodcastChannelPageViewModel", "downloadPodcastEpisode network error", th);
                break;
            default:
                ((gu3) this.o).g.k("Network error: " + th.getMessage());
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        switch (this.n) {
            case 13:
                if (mm3.f(response)) {
                    ((mm3) this.o).g();
                }
                break;
            case 14:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse() != null && "ok".equals(((ApiResponse) response.body()).getSubsonicResponse().getStatus())) {
                    Log.d("PodcastChannelPageViewModel", "downloadPodcastEpisode successful for id: " + ((PodcastEpisode) this.o).getId());
                } else {
                    Log.e("PodcastChannelPageViewModel", "downloadPodcastEpisode failed with code: " + response.code());
                }
                break;
            default:
                gu3 gu3Var = (gu3) this.o;
                if (response.code() == 501) {
                    Application application = gu3Var.b;
                    application.getClass();
                    gu3Var.g.k(application.getString(R.string.radio_dialog_not_supported_snackbar));
                } else if (response.isSuccessful() && response.body() != null) {
                    ApiResponse apiResponse = (ApiResponse) response.body();
                    String status = apiResponse.getSubsonicResponse().getStatus();
                    if ("ok".equals(status)) {
                        gu3Var.f.k(Boolean.TRUE);
                    } else if ("failed".equals(status)) {
                        gu3.c(gu3Var, apiResponse);
                    }
                } else {
                    gu3Var.g.k("HTTP error: " + response.code());
                }
                break;
        }
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        switch (this.n) {
            case 12:
                sl3 sl3Var = (sl3) this.o;
                if (sl3Var.y() && sl3Var.n() != null) {
                    sl3Var.X().runOnUiThread(new rl3(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cq0
    public boolean p(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.o;
        if (recyclerView.A.e()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.A.d()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.r0();
        return recyclerView.J(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.u55
    public View q(int i) {
        return ((mw3) this.o).u(i);
    }

    @Override // defpackage.u55
    public int r(View view) {
        return mw3.B(view) + ((ViewGroup.MarginLayoutParams) ((nw3) view.getLayoutParams())).rightMargin;
    }

    @Override // defpackage.cq0
    public float s() {
        float f;
        RecyclerView recyclerView = (RecyclerView) this.o;
        if (recyclerView.A.e()) {
            f = recyclerView.p0;
        } else {
            if (!recyclerView.A.d()) {
                return 0.0f;
            }
            f = recyclerView.o0;
        }
        return -f;
    }

    @Override // defpackage.ck2
    public void shutdown() {
    }

    @Override // defpackage.ck2
    public void start() {
    }

    @Override // defpackage.cq0
    public void t() {
        ((RecyclerView) this.o).r0();
    }

    public void u(StringBuilder sb, Iterator it) {
        uc0 uc0Var = (uc0) this.o;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(uc0Var.c(entry.getKey()));
            sb.append("=");
            sb.append(uc0Var.c(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) uc0Var.o);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(uc0Var.c(entry2.getKey()));
                sb.append("=");
                sb.append(uc0Var.c(entry2.getValue()));
            }
        }
    }

    public void v() {
        int i;
        TypedValue typedValue = new TypedValue();
        df dfVar = (df) this.o;
        Resources.Theme theme = dfVar.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        dfVar.setTheme(i);
    }

    @Override // defpackage.ou2
    public void y(qu2 qu2Var) {
        Toolbar toolbar = (Toolbar) this.o;
        y4 y4Var = toolbar.n.G;
        if (y4Var == null || !y4Var.k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.T.p).iterator();
            while (it.hasNext()) {
                ((cd1) it.next()).a.s();
            }
        }
        si1 si1Var = toolbar.e0;
        if (si1Var != null) {
            si1Var.y(qu2Var);
        }
    }

    @Override // defpackage.ci
    public Object z(q64 q64Var, Float f, Float f2, if1 if1Var, vg4 vg4Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objD = su3.d(q64Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, j51.a(0.0f, fFloatValue2, 28), (ck4) this.o, if1Var, vg4Var);
        return objD == xe0.n ? objD : (ud) objD;
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public void onSuccess(boolean z, long j) {
        vb4 vb4Var = (vb4) this.o;
        vb4Var.h0("scan_library").x(vb4Var.t(R.string.settings_scan_result, Long.valueOf(j)));
        if (z) {
            vb4.k0(vb4Var);
        }
    }

    public /* synthetic */ pz1(int i, boolean z) {
        this.n = i;
    }

    public pz1(so4 so4Var) {
        this.n = 26;
        so4Var.getClass();
        this.o = so4Var;
    }

    public pz1(View view) {
        this.n = 0;
        this.o = view;
        rr2.K(b92.n, new wc(8, this));
    }

    public /* synthetic */ pz1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public pz1(PlayerControllerFragment playerControllerFragment, bj2 bj2Var) {
        this.n = 11;
        this.o = playerControllerFragment;
    }
}
