package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hd5 implements z30, Callback, e01, in4, wa3 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public hd5(pn4 pn4Var) {
        gr1 gr1VarB;
        dz4 dz4VarA;
        dz4 dz4VarA2;
        this.n = 19;
        this.o = pn4Var;
        ok1 ok1Var = new ok1();
        ok1Var.a(Date.class, new r01());
        ok1Var.a(Bookmarks.class, new lt());
        ok1Var.j = true;
        ArrayList arrayList = ok1Var.e;
        int size = arrayList.size();
        ArrayList arrayList2 = ok1Var.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        int i = ok1Var.g;
        int i2 = ok1Var.h;
        ak0 ak0Var = bk0.b;
        boolean z = gk4.a;
        if (i != 2 && i2 != 2) {
            dz4 dz4VarA3 = ak0Var.a(i, i2);
            if (z) {
                dz4VarA2 = gk4.c.a(i, i2);
                dz4VarA = gk4.b.a(i, i2);
            } else {
                dz4VarA = null;
                dz4VarA2 = null;
            }
            arrayList3.add(dz4VarA3);
            if (z) {
                arrayList3.add(dz4VarA2);
                arrayList3.add(dz4VarA);
            }
        }
        u21 u21Var = ok1Var.a;
        int i3 = ok1Var.c;
        HashMap map = new HashMap(ok1Var.d);
        boolean z2 = ok1Var.i;
        boolean z3 = ok1Var.j;
        boolean z4 = ok1Var.k;
        int i4 = ok1Var.b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        nk1 nk1Var = new nk1(u21Var, i3, map, z2, z3, z4, i4, arrayList3, ok1Var.l, ok1Var.m, new ArrayList(ok1Var.n));
        Retrofit.Builder builder = new Retrofit.Builder();
        String strJ = pn4Var.j();
        String string = strJ != null ? qm4.K0(strJ).toString() : null;
        string = string == null ? "" : string;
        try {
            fr1 fr1Var = new fr1();
            fr1Var.e(null, string);
            gr1VarB = fr1Var.b();
        } catch (IllegalArgumentException unused) {
            gr1VarB = null;
        }
        Retrofit.Builder builderAddConverterFactory = builder.baseUrl((gr1VarB == null || gr1VarB.d.length() <= 0) ? "https://localhost/rest/" : string).addConverterFactory(GsonConverterFactory.create(nk1Var));
        cx cxVar = new cx();
        rx rxVar = new rx(cxVar);
        cxVar.a = 2592000;
        n83 n83Var = new n83();
        n83Var.a(2L, TimeUnit.MINUTES);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n83Var.b(20L, timeUnit);
        n83Var.z = ze5.b(30L, timeUnit);
        n83Var.A = ze5.b(30L, timeUnit);
        dr1 dr1Var = new dr1();
        dr1Var.b = cr1.n;
        n83Var.c.add(dr1Var);
        n83Var.c.add(rxVar);
        File cacheDir = App.a().getCacheDir();
        cacheDir.getClass();
        n83Var.l = new hx(cacheDir);
        SSLSocketFactory sSLSocketFactory = x30.b;
        if (sSLSocketFactory != null) {
            n83Var.c(sSLSocketFactory, x30.a);
        }
        Retrofit retrofitBuild = builderAddConverterFactory.client(new o83(n83Var)).build();
        retrofitBuild.getClass();
        this.p = (f84) retrofitBuild.create(f84.class);
    }

    @Override // defpackage.e01
    public Object a() {
        return (q15) this.o;
    }

    @Override // defpackage.in4
    public jn4 apply() {
        o72 o72Var = (o72) this.o;
        h72 h72VarI = i();
        if (h72VarI != null) {
            o72Var.d(h72VarI, false);
        }
        return o72Var.f(this.p);
    }

    @Override // defpackage.e01
    public boolean b(CharSequence charSequence, int i, int i2, k05 k05Var) {
        if ((k05Var.c & 4) > 0) {
            return true;
        }
        if (((q15) this.o) == null) {
            this.o = new q15(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((om0) this.p).getClass();
        ((q15) this.o).setSpan(new l05(k05Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.wa3
    public List c(Integer num) {
        List listC = ((wa3) this.o).c(null);
        lg4 lg4Var = (lg4) this.p;
        int i = lg4Var.v;
        return i < 0 ? listC : q40.G0(gh0.d(lg4Var, num, i, Integer.valueOf(lg4Var.E(lg4Var.b, i))), listC);
    }

    @Override // defpackage.in4
    public void cancel() {
        h72 h72VarI = i();
        if ((h72VarI != null ? h72VarI.f : null) != null) {
            o72.c((o72) this.o, this.p);
        }
    }

    @Override // defpackage.in4
    public boolean d() {
        ef3 ef3Var;
        h72 h72VarI = i();
        if (h72VarI == null || (ef3Var = h72VarI.f) == null) {
            return true;
        }
        return ef3Var.c();
    }

    @Override // defpackage.in4
    public boolean e(bt2 bt2Var) {
        h72 h72VarI = i();
        ef3 ef3Var = h72VarI != null ? h72VarI.f : null;
        if (ef3Var == null || ef3Var.c()) {
            return true;
        }
        ch4 ch4VarT = ya4.t();
        if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
        ch4 ch4VarZ = ya4.z(ch4VarT);
        try {
            boolean zE = ef3Var.e(bt2Var);
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
            return zE;
        } catch (Throwable th) {
            try {
                h72VarI.getClass();
                throw th;
            } catch (Throwable th2) {
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                throw th2;
            }
        }
    }

    public void f(ValueAnimator valueAnimator) {
        xi4 xi4Var = new xi4(8);
        valueAnimator.addListener((pl4) this.p);
        ((ArrayList) this.o).add(xi4Var);
    }

    @Override // defpackage.wa3
    public boolean g() {
        return ((wa3) this.o).g();
    }

    public Object h(xn3 xn3Var) {
        HashMap map = (HashMap) this.p;
        jk1 jk1Var = (jk1) map.get(xn3Var);
        if (jk1Var == null) {
            jk1Var = new jk1(xn3Var);
            map.put(xn3Var, jk1Var);
        } else {
            xn3Var.a();
        }
        jk1 jk1Var2 = jk1Var.d;
        jk1Var2.c = jk1Var.c;
        jk1Var.c.d = jk1Var2;
        jk1 jk1Var3 = (jk1) this.o;
        jk1Var.d = jk1Var3;
        jk1 jk1Var4 = jk1Var3.c;
        jk1Var.c = jk1Var4;
        jk1Var4.d = jk1Var;
        jk1Var.d.c = jk1Var;
        ArrayList arrayList = jk1Var.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return jk1Var.b.remove(size - 1);
        }
        return null;
    }

    public h72 i() {
        o72 o72Var = (o72) this.o;
        c72 c72Var = (c72) o72Var.w.g(this.p);
        if (c72Var != null) {
            return (h72) o72Var.s.g(c72Var);
        }
        return null;
    }

    public ArrayList j(String str) {
        w24 w24VarB = w24.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        w24VarB.h(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            ArrayList arrayList = new ArrayList(cursorH.getCount());
            while (cursorH.moveToNext()) {
                arrayList.add(cursorH.getString(0));
            }
            cursorH.close();
            w24VarB.j();
            return arrayList;
        } catch (Throwable th) {
            cursorH.close();
            w24VarB.j();
            throw th;
        }
    }

    public void k(xn3 xn3Var, Object obj) {
        HashMap map = (HashMap) this.p;
        jk1 jk1Var = (jk1) map.get(xn3Var);
        if (jk1Var == null) {
            jk1Var = new jk1(xn3Var);
            jk1Var.d = jk1Var;
            jk1 jk1Var2 = (jk1) this.o;
            jk1Var.d = jk1Var2.d;
            jk1Var.c = jk1Var2;
            jk1Var2.d = jk1Var;
            jk1Var.d.c = jk1Var;
            map.put(xn3Var, jk1Var);
        } else {
            xn3Var.a();
        }
        if (jk1Var.b == null) {
            jk1Var.b = new ArrayList();
        }
        jk1Var.b.add(obj);
    }

    public Object l() {
        jk1 jk1Var = (jk1) this.o;
        jk1 jk1Var2 = jk1Var.d;
        while (true) {
            boolean zEquals = jk1Var2.equals(jk1Var);
            Object obj = jk1Var2.a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = jk1Var2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? jk1Var2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            jk1 jk1Var3 = jk1Var2.d;
            jk1Var3.c = jk1Var2.c;
            jk1Var2.c.d = jk1Var3;
            ((HashMap) this.p).remove(obj);
            ((xn3) obj).a();
            jk1Var2 = jk1Var2.d;
        }
    }

    public Call m(String str, int i, int i2, int i3, int i4) {
        Log.d("BrowsingClient", "search3()");
        return ((f84) this.p).a(((pn4) this.o).f(), str, i, i2, i3, 0, i4, 0, ud3.k());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 2:
                ArtistID3 artistID3G = kb4.g((String) this.o, null);
                if (artistID3G != null) {
                    ((k03) this.p).k(artistID3G);
                }
                break;
            case 8:
                d34.r((l61) this.o, (StarCallback) this.p);
                break;
            case 17:
                ((lm3) this.o).g();
                break;
            default:
                new Thread(new jq3((hh3) this.p, (k03) this.o)).start();
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        switch (this.n) {
            case 2:
                ArtistID3 artistID3G = kb4.g((String) this.o, (!response.isSuccessful() || response.body() == null) ? null : ((ApiResponse) response.body()).getSubsonicResponse().getArtist());
                if (artistID3G != null) {
                    ((k03) this.p).k(artistID3G);
                }
                break;
            case 8:
                l61 l61Var = (l61) this.o;
                StarCallback starCallback = (StarCallback) this.p;
                if (response.isSuccessful() && !d34.w(response)) {
                    n61.a(l61Var);
                    starCallback.onSuccess();
                } else if (!d34.w(response)) {
                    d34.r(l61Var, starCallback);
                } else {
                    n61.j(l61Var);
                    starCallback.onRefused();
                }
                break;
            case 17:
                lm3 lm3Var = (lm3) this.o;
                if (!mm3.f(response)) {
                    lm3Var.g();
                } else {
                    ((mm3) this.p).g();
                    lm3Var.onSuccess();
                }
                break;
            default:
                k03 k03Var = (k03) this.o;
                hh3 hh3Var = (hh3) this.p;
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getInternetRadioStations() == null || ((ApiResponse) response.body()).getSubsonicResponse().getInternetRadioStations().getInternetRadioStations() == null) {
                    new Thread(new jq3(hh3Var, k03Var)).start();
                } else {
                    List<InternetRadioStation> internetRadioStations = ((ApiResponse) response.body()).getSubsonicResponse().getInternetRadioStations().getInternetRadioStations();
                    new Thread(new jq3(3, internetRadioStations)).start();
                    new Thread(new ur2(hh3Var, internetRadioStations, k03Var)).start();
                }
                break;
        }
    }

    public String toString() {
        switch (this.n) {
            case 10:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                jk1 jk1Var = (jk1) this.o;
                jk1 jk1Var2 = jk1Var.c;
                boolean z = false;
                while (!jk1Var2.equals(jk1Var)) {
                    sb.append('{');
                    sb.append(jk1Var2.a);
                    sb.append(':');
                    ArrayList arrayList = jk1Var2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    jk1Var2 = jk1Var2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hd5(Object obj, Object obj2, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    public /* synthetic */ hd5(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public hd5(int i) {
        this.n = i;
        switch (i) {
            case 20:
                this.o = new ArrayList();
                this.p = new pl4();
                break;
            case 21:
            default:
                this.o = new jk1(null);
                this.p = new HashMap();
                break;
            case 22:
                this.o = new f13(new Reference[16]);
                this.p = new ReferenceQueue();
                break;
            case 23:
                ej1 ej1Var = ej1.c;
                this.o = new SparseIntArray();
                this.p = ej1Var;
                break;
        }
    }

    public hd5(WorkDatabase_Impl workDatabase_Impl) {
        this.n = 0;
        this.o = workDatabase_Impl;
        this.p = new vo0(workDatabase_Impl, 6);
        new aq4(workDatabase_Impl, 20);
    }

    public hd5(s24 s24Var) {
        this.n = 11;
        this.o = s24Var;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.p = setNewSetFromMap;
    }

    public hd5(Context context) {
        this.n = 1;
        this.o = context;
    }

    public hd5(MediaCodec.CryptoInfo cryptoInfo) {
        this.n = 5;
        this.o = cryptoInfo;
        this.p = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public hd5(gy3 gy3Var, int[] iArr) {
        this.n = 15;
        this.o = yw1.k(gy3Var);
        this.p = iArr;
    }

    public hd5(String str, Bundle bundle) {
        this.n = 13;
        if (str != null) {
            this.o = str;
            this.p = bundle;
        } else {
            kf2.n("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            throw null;
        }
    }
}
