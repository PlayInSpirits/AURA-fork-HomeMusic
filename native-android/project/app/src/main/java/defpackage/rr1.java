package defpackage;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.CookieManager;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubAssistantTask;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubGoogleLogin;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.HubPlayEventsResult;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartAddOut;
import com.eddyizm.tempus.homemusic.SmartNextIn;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.WaveNextIn;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rr1 {
    public static volatile String i;
    public static volatile long j;
    public static volatile String k;
    public static volatile long l;
    public static final rr1 a = new rr1();
    public static final hu2 b = ve5.a("application/json; charset=utf-8");
    public static final nk1 c = new nk1();
    public static final si1 d = new si1(1);
    public static final ThreadLocal e = new ThreadLocal();
    public static final rp4 f = new rp4(new e90(9));
    public static final rp4 g = new rp4(new e90(10));
    public static final rp4 h = new rp4(new e90(11));
    public static volatile Set m = z01.n;

    public static final WaveOut A(Map map) {
        map.getClass();
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(map);
        strJ.getClass();
        sz3Var.getClass();
        return (WaveOut) d(new nr1(sz3.b(strJ, b), 1), new or1(3));
    }

    public static Object B(String str, gf1 gf1Var) throws IOException {
        str.getClass();
        na naVar = new na(0, b00.a, b00.class, "currentAccount", "currentAccount()Ljava/lang/String;", 0, 3);
        rs0 rs0Var = new rs0(5, str);
        if (!h12.c(naVar.invoke(), str)) {
            mj0.i("Account changed");
            return null;
        }
        h();
        String strC = c();
        String cookie = CookieManager.getInstance().getCookie(strC);
        if (cookie == null) {
            mj0.i("Hub session unavailable");
            return null;
        }
        qr1 qr1Var = new qr1(strC, cookie);
        if (!((Boolean) rs0Var.invoke(qr1Var)).booleanValue() || !h12.c(naVar.invoke(), str)) {
            mj0.i("Account changed");
            return null;
        }
        ThreadLocal threadLocal = e;
        threadLocal.set(qr1Var);
        try {
            return gf1Var.invoke();
        } finally {
            threadLocal.remove();
        }
    }

    public static final HubAssistantTask a(ContentResolver contentResolver, List list) {
        uz2 uz2Var = new uz2();
        uz2Var.c(wz2.f);
        byte b2 = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                gb.c0();
                throw null;
            }
            Uri uri = (Uri) obj;
            Map map = yc4.d;
            yc4 yc4VarA = vr1.A(contentResolver, uri, "image/png", "screenshot_" + i2);
            uz2Var.a("images", yc4VarA.a, new rd0(contentResolver, uri, yc4VarA.b));
            i2 = i3;
        }
        return (HubAssistantTask) d(new mr1(uz2Var.b(), b2), new k2(27, b2));
    }

    public static final HubAssistantTask b(String str, String str2, boolean z) {
        Map mapX;
        if (!z || str2 == null) {
            mapX = lg2.X(new kd3("text", str), new kd3("url", str2));
        } else {
            mapX = Collections.singletonMap("url", str2);
            mapX.getClass();
        }
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(mapX);
        strJ.getClass();
        sz3Var.getClass();
        byte b2 = 0;
        return (HubAssistantTask) d(new nr1(sz3.b(strJ, b), b2), new k2(29, b2));
    }

    public static final String c() throws HubException {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = i;
        if (str != null && jElapsedRealtime - j < 120000) {
            return str;
        }
        String strQ = e35.Q();
        App.b().getClass();
        SharedPreferences sharedPreferencesC = App.c();
        sharedPreferencesC.getClass();
        String string = sharedPreferencesC.getString("homemusic_hub_local_url", null);
        if (string == null) {
            string = "http://192.168.0.111:8080";
        }
        String strK = e35.K(string);
        if (strK != null && !strK.equals(strQ)) {
            try {
                o83 o83Var = (o83) h.getValue();
                nz3 nz3Var = new nz3();
                nz3Var.d(strK.concat("/healthz"));
                oz3 oz3Var = new oz3(nz3Var);
                o83Var.getClass();
                k14 k14VarC = new bv3(o83Var, oz3Var).c();
                try {
                    z = k14VarC.C;
                    k14VarC.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(k14VarC, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                strQ = strK;
            }
        }
        if (strQ.length() == 0) {
            throw new HubException("Не задан адрес Хаба — укажите его в настройках");
        }
        i = strQ;
        j = jElapsedRealtime;
        return strQ;
    }

    public static Object d(if1 if1Var, if1 if1Var2) throws HubException {
        qr1 qr1Var = (qr1) e.get();
        if (qr1Var != null) {
            nz3 nz3VarA = ((oz3) if1Var.invoke(qr1Var.a)).a();
            nz3VarA.a("Cookie", qr1Var.b);
            oz3 oz3Var = new oz3(nz3VarA);
            o83 o83Var = (o83) f.getValue();
            o83Var.getClass();
            k14 k14VarC = new bv3(o83Var, oz3Var).c();
            try {
                if (!k14VarC.C) {
                    throw i(k14VarC);
                }
                Object objInvoke = if1Var2.invoke(k14VarC);
                k14VarC.close();
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(k14VarC, th);
                    throw th2;
                }
            }
        }
        String strC = c();
        o83 o83VarK = k();
        oz3 oz3Var2 = (oz3) if1Var.invoke(strC);
        o83VarK.getClass();
        oz3Var2.getClass();
        k14 k14VarC2 = new bv3(o83VarK, oz3Var2).c();
        if (k14VarC2.q != 401) {
            try {
                if (!k14VarC2.C) {
                    throw i(k14VarC2);
                }
                Object objInvoke2 = if1Var2.invoke(k14VarC2);
                k14VarC2.close();
                return objInvoke2;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    q05.h(k14VarC2, th3);
                    throw th4;
                }
            }
        }
        k14VarC2.close();
        o(strC);
        o83 o83VarK2 = k();
        oz3 oz3Var3 = (oz3) if1Var.invoke(strC);
        o83VarK2.getClass();
        oz3Var3.getClass();
        k14 k14VarC3 = new bv3(o83VarK2, oz3Var3).c();
        try {
            if (!k14VarC3.C) {
                throw i(k14VarC3);
            }
            Object objInvoke3 = if1Var2.invoke(k14VarC3);
            k14VarC3.close();
            return objInvoke3;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                q05.h(k14VarC3, th5);
                throw th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    public static Set e() throws HubException {
        Set setT0;
        Set set = z01.n;
        String strC = c();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (h12.c(k, strC) && jElapsedRealtime - l < 300000) {
            return m;
        }
        try {
            o83 o83Var = (o83) h.getValue();
            nz3 nz3Var = new nz3();
            nz3Var.d(strC.concat("/healthz"));
            oz3 oz3Var = new oz3(nz3Var);
            o83Var.getClass();
            k14 k14VarC = new bv3(o83Var, oz3Var).c();
            try {
                if (k14VarC.C) {
                    n14 n14Var = k14VarC.t;
                    setT0 = null;
                    String strString = n14Var != null ? n14Var.string() : null;
                    if (strString == null) {
                        strString = "";
                    }
                    f32 f32Var = (f32) e35.N(strString).a().n.get("capabilities");
                    if (f32Var != null) {
                        ArrayList arrayList = new ArrayList(r40.k0(f32Var, 10));
                        ArrayList arrayList2 = f32Var.n;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            arrayList.add(((h32) obj).b());
                        }
                        setT0 = q40.T0(arrayList);
                    }
                    if (setT0 == null) {
                        setT0 = set;
                    }
                } else {
                    setT0 = set;
                }
                k14VarC.close();
                set = setT0;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(k14VarC, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
        m = set;
        l = jElapsedRealtime;
        k = strC;
        return set;
    }

    public static final void f(String str, String str2, String str3, String str4, String str5) throws HubException {
        Map mapX = x(str);
        Map mapX2 = lg2.X(new kd3("artist", str2), new kd3("title", str3), new kd3("context", str4), new kd3("client", str5));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapX);
        linkedHashMap.putAll(mapX2);
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(linkedHashMap);
        strJ.getClass();
        sz3Var.getClass();
        d(new nr1(sz3.b(strJ, b), 3), new or1(9));
    }

    public static final void g(String str) {
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(lg2.X(new kd3("track_refs", gb.O(str)), new kd3("star", Boolean.FALSE)));
        strJ.getClass();
        sz3Var.getClass();
        if (d(new nr1(sz3.b(strJ, b), 4), new or1(12)) == null) {
            return;
        }
        kf2.k();
    }

    public static final HubMe h() throws HubException {
        HubMe hubMe;
        String strC = c();
        try {
            o83 o83VarK = k();
            nz3 nz3Var = new nz3();
            nz3Var.d(strC.concat("/api/auth/me"));
            oz3 oz3Var = new oz3(nz3Var);
            o83VarK.getClass();
            k14 k14VarC = new bv3(o83VarK, oz3Var).c();
            try {
                if (k14VarC.C) {
                    hubMe = (HubMe) p(k14VarC, HubMe.class);
                } else {
                    if (k14VarC.q != 401) {
                        throw i(k14VarC);
                    }
                    hubMe = null;
                }
                k14VarC.close();
                return hubMe == null ? o(strC) : hubMe;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(k14VarC, th);
                    throw th2;
                }
            }
        } catch (HubException e2) {
            throw e2;
        } catch (IOException e3) {
            m();
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getSimpleName();
            }
            throw new HubException("Хаб недоступен: ".concat(message));
        }
    }

    public static final HubException i(k14 k14Var) {
        int i2 = k14Var.q;
        String strJ = null;
        try {
            n14 n14Var = k14Var.t;
            String strString = n14Var != null ? n14Var.string() : null;
            if (strString == null) {
                strString = "";
            }
            h32 h32Var = (h32) e35.N(strString).a().n.get("detail");
            if (h32Var != null && (h32Var instanceof k32)) {
                strJ = h32Var.b();
            }
        } catch (Exception unused) {
        }
        if (strJ == null || qm4.u0(strJ)) {
            if (i2 == 401) {
                strJ = "Хаб не принял логин и пароль Navidrome";
            } else {
                strJ = i2 == 413 ? "Файл слишком большой" : b11.j(i2, "Ошибка Хаба (HTTP ", ")");
            }
        }
        return new HubException(i2, strJ);
    }

    public static ArrayList j(List list, boolean z) {
        h32 h32Var;
        list.getClass();
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlayEvent playEvent = (PlayEvent) it.next();
            nk1 nk1Var = c;
            nk1Var.getClass();
            if (playEvent == null) {
                h32Var = i32.n;
            } else {
                p32 p32Var = new p32();
                nk1Var.l(playEvent, PlayEvent.class, p32Var);
                ArrayList arrayList2 = p32Var.y;
                if (arrayList2.isEmpty()) {
                    h32Var = p32Var.A;
                } else {
                    er1.o(arrayList2, "Expected one JSON element but was ");
                    h32Var = null;
                }
            }
            j32 j32VarA = h32Var.a();
            nb2 nb2Var = j32VarA.n;
            if (!z) {
            }
            arrayList.add(j32VarA);
        }
        return arrayList;
    }

    public static final o83 k() {
        return (o83) g.getValue();
    }

    public static final HubGoogleLogin l(String str, String str2, String str3) {
        str.getClass();
        return (HubGoogleLogin) s(lg2.X(new kd3("id_token", str), new kd3("code", str2), new kd3("username", str3)), "/api/auth/google", HubGoogleLogin.class);
    }

    public static final void m() {
        i = null;
        k = null;
    }

    public static final HubAppRelease n() {
        n83 n83VarA = ((o83) f.getValue()).a();
        n83VarA.i = true;
        n83VarA.j = true;
        o83 o83Var = new o83(n83VarA);
        nz3 nz3Var = new nz3();
        nz3Var.d("https://raw.githubusercontent.com/PlayInSpirits/HomeMusic-Fork/main".concat("/app/latest.json"));
        k14 k14VarC = new bv3(o83Var, new oz3(nz3Var)).c();
        try {
            if (k14VarC.q == 404) {
                k14VarC.close();
                return null;
            }
            if (!k14VarC.C) {
                throw i(k14VarC);
            }
            HubAppRelease hubAppRelease = (HubAppRelease) p(k14VarC, HubAppRelease.class);
            k14VarC.close();
            return hubAppRelease;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(k14VarC, th);
                throw th2;
            }
        }
    }

    public static HubMe o(String str) throws HubException {
        String strK = ud3.K();
        String strY = ud3.y();
        if (strK == null || strK.length() == 0 || strY == null || strY.length() == 0) {
            throw new HubException(401, "Сначала войдите в аккаунт Navidrome — Хаб использует ту же учётную запись");
        }
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(lg2.X(new kd3("username", strK), new kd3("password", strY)));
        strJ.getClass();
        sz3Var.getClass();
        we5 we5VarB = sz3.b(strJ, b);
        o83 o83VarK = k();
        nz3 nz3Var = new nz3();
        nz3Var.d(str.concat("/api/auth/login"));
        nz3Var.b("POST", we5VarB);
        oz3 oz3Var = new oz3(nz3Var);
        o83VarK.getClass();
        k14 k14VarC = new bv3(o83VarK, oz3Var).c();
        try {
            if (!k14VarC.C) {
                throw i(k14VarC);
            }
            try {
                CookieManager.getInstance().flush();
            } catch (Throwable th) {
                Log.w("HubClient", "Cookie flush failed", th);
            }
            HubMe hubMe = (HubMe) p(k14VarC, HubMe.class);
            k14VarC.close();
            return hubMe;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q05.h(k14VarC, th2);
                throw th3;
            }
        }
    }

    public static Object p(k14 k14Var, Class cls) throws HubException {
        n14 n14Var = k14Var.t;
        String strString = n14Var != null ? n14Var.string() : null;
        if (strString == null) {
            strString = "";
        }
        Object objD = c.d(cls, strString);
        if (objD != null) {
            return objD;
        }
        throw new HubException("Пустой ответ Хаба");
    }

    public static ArrayList q(k14 k14Var, Class cls) {
        n14 n14Var = k14Var.t;
        String strString = n14Var != null ? n14Var.string() : null;
        if (strString == null) {
            strString = "";
        }
        h32 h32VarN = e35.N(strString);
        if (!(h32VarN instanceof f32)) {
            er1.o(h32VarN, "Not a JSON Array: ");
            return null;
        }
        f32 f32Var = (f32) h32VarN;
        ArrayList arrayList = new ArrayList(r40.k0(f32Var, 10));
        ArrayList arrayList2 = f32Var.n;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            nk1 nk1Var = c;
            nk1Var.getClass();
            arrayList.add(su3.I(cls).cast(nk1Var.b((h32) obj, TypeToken.get(cls))));
        }
        return arrayList;
    }

    public static final HubPlayEventsResult r(List list) {
        list.getClass();
        sz3 sz3Var = tz3.Companion;
        Map mapSingletonMap = Collections.singletonMap("events", j(list, e().contains("launch_events_v1")));
        mapSingletonMap.getClass();
        String strJ = c.j(mapSingletonMap);
        strJ.getClass();
        sz3Var.getClass();
        return (HubPlayEventsResult) d(new nr1(sz3.b(strJ, b), 6), new or1(21));
    }

    public static Object s(Map map, String str, Class cls) throws HubException {
        String strC = c();
        nz3 nz3Var = new nz3();
        nz3Var.d(strC.concat(str));
        if (map != null) {
            sz3 sz3Var = tz3.Companion;
            String strJ = c.j(map);
            strJ.getClass();
            sz3Var.getClass();
            nz3Var.b("POST", sz3.b(strJ, b));
        }
        try {
            o83 o83VarK = k();
            oz3 oz3Var = new oz3(nz3Var);
            o83VarK.getClass();
            k14 k14VarC = new bv3(o83VarK, oz3Var).c();
            try {
                if (!k14VarC.C) {
                    throw i(k14VarC);
                }
                try {
                    CookieManager.getInstance().flush();
                } catch (Throwable th) {
                    Log.w("HubClient", "Cookie flush failed", th);
                }
                Object objP = p(k14VarC, cls);
                k14VarC.close();
                return objP;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    q05.h(k14VarC, th2);
                    throw th3;
                }
            }
        } catch (HubException e2) {
            throw e2;
        } catch (IOException e3) {
            m();
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getSimpleName();
            }
            throw new HubException("Хаб недоступен: ".concat(message));
        }
        throw e2;
    }

    public static final SmartAddOut t(String str, String str2) {
        str.getClass();
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(x(str2));
        strJ.getClass();
        sz3Var.getClass();
        return (SmartAddOut) d(new pr1(str, sz3.b(strJ, b), 3), new or1(15));
    }

    public static final void u(String str, String str2) throws HubException {
        str.getClass();
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(x(str2));
        strJ.getClass();
        sz3Var.getClass();
        d(new pr1(str, sz3.b(strJ, b), 4), new or1(16));
    }

    public static final SmartOut v(String str, SmartNextIn smartNextIn) {
        str.getClass();
        smartNextIn.getClass();
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(lg2.X(new kd3("played", j(smartNextIn.getPlayed(), e().contains("launch_events_v1"))), new kd3("at", smartNextIn.getAt())));
        strJ.getClass();
        sz3Var.getClass();
        return (SmartOut) d(new pr1(str, sz3.b(strJ, b), 1), new or1(4));
    }

    public static final SmartOut w(Map map) {
        map.getClass();
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(map);
        strJ.getClass();
        sz3Var.getClass();
        return (SmartOut) d(new nr1(sz3.b(strJ, b), 5), new or1(17));
    }

    public static Map x(String str) {
        if (ot1.c(str)) {
            Map mapSingletonMap = Collections.singletonMap("ref", qm4.z0(str, "hub:"));
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        Map mapSingletonMap2 = Collections.singletonMap("nd_song_id", str);
        mapSingletonMap2.getClass();
        return mapSingletonMap2;
    }

    public static final void y(ContentResolver contentResolver, Uri uri) {
        uri.getClass();
        Map map = yc4.d;
        yc4 yc4VarA = vr1.A(contentResolver, uri, "audio/mpeg", "audio");
        uz2 uz2Var = new uz2();
        uz2Var.c(wz2.f);
        uz2Var.a("files", yc4VarA.a, new rd0(contentResolver, uri, yc4VarA.b));
    }

    public static final WaveOut z(String str, WaveNextIn waveNextIn) {
        str.getClass();
        waveNextIn.getClass();
        sz3 sz3Var = tz3.Companion;
        String strJ = c.j(lg2.X(new kd3("played", j(waveNextIn.getPlayed(), e().contains("launch_events_v1"))), new kd3("queued", waveNextIn.getQueued())));
        strJ.getClass();
        sz3Var.getClass();
        return (WaveOut) d(new pr1(str, sz3.b(strJ, b), 2), new or1(5));
    }
}
