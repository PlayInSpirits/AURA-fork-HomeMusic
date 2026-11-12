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
    public static final rr1 a = null;
    public static final hu2 b = null;
    public static final nk1 c = null;
    public static final si1 d = null;
    public static final ThreadLocal e = null;
    public static final rp4 f = null;
    public static final rp4 g = null;
    public static final rp4 h = null;
    public static volatile String i;
    public static volatile long j;
    public static volatile String k;
    public static volatile long l;
    public static volatile Set m;

    static {
        a = new rr1();
        b = ve5.a("application/json; charset=utf-8");
        c = new nk1();
        d = new si1(1);
        e = new ThreadLocal();
        f = new rp4(new e90(9));
        g = new rp4(new e90(10));
        h = new rp4(new e90(11));
        m = z01.n;
    }

    public static final WaveOut A(Map r2) {
        r2.getClass();
        sz3 r0 = tz3.Companion;
        String r3 = c.j(r2);
        r3.getClass();
        r0.getClass();
        return (WaveOut) d(new nr1(sz3.b(r3, b), 1), new or1(3));
    }

    public static Object B(String r8, gf1 r9) {
        r8.getClass();
        int r1 = 0;
        Class<b00> r3 = b00.class;
        String r4 = "currentAccount";
        String r5 = "currentAccount()Ljava/lang/String;";
        na r0 = new na(r1, b00.a, r3, r4, r5, 0, 3);
        rs0 r2 = new rs0(5, r8);
        if (h12.c(r0.invoke(), r8) == false) goto L21;
        h();
        String r6 = c();
        String r7 = CookieManager.getInstance().getCookie(r6);
        if (r7 == null) goto L19;
        qr1 r10 = new qr1(r6, r7);
        if (((Boolean) r2.invoke(r10)).booleanValue() == true) goto L9;
    L17:
        mj0.i("Account changed");
        return null;
    L9:
        if (h12.c(r0.invoke(), r8) == false) goto L17;
        ThreadLocal r11 = e;
        r11.set(r10);
        Object r12 = r9.invoke();     // Catch: Throwable -> L14
        r11.remove();
        return r12;
    L14:
        th = move-exception;
        r11.remove();
        throw th;
    L19:
        mj0.i("Hub session unavailable");
        return null;
    L21:
        mj0.i("Account changed");
        return null;
    }

    public static final HubAssistantTask a(ContentResolver r7, List r8) {
        uz2 r0 = new uz2();
        r0.c(wz2.f);
        Iterator r9 = r8.iterator();
        byte r1 = 0;
        int r2 = 0;
    L4:
        if (r9.hasNext() == false) goto L11;
        Object r3 = r9.next();
        int r4 = r2 + 1;
        if (r2 < 0) goto L8;
        Uri r5 = (Uri) r3;
        Map r6 = yc4.d;
        yc4 r10 = vr1.A(r7, r5, "image/png", "screenshot_" + r2);
        r0.a("images", r10.a, new rd0(r7, r5, r10.b));
        r2 = r4;
        goto L4
    L8:
        gb.c0();
        throw null;
    L11:
        return (HubAssistantTask) d(new mr1(r0.b(), r1), new k2(27, r1));
    }

    public static final HubAssistantTask b(String r2, String r3, boolean r4) {
        if (r4 == false) goto L6;
        if (r3 == null) goto L6;
        Map r5 = Collections.singletonMap("url", r3);
        r5.getClass();
    L7:
        sz3 r6 = tz3.Companion;
        String r7 = c.j(r5);
        r7.getClass();
        r6.getClass();
        byte r8 = 0;
        return (HubAssistantTask) d(new nr1(sz3.b(r7, b), r8), new k2(29, r8));
    L6:
        r5 = lg2.X(new kd3[]{new kd3("text", r2), new kd3("url", r3)});
        goto L7
    }

    public static final String c() {
        long r1 = SystemClock.elapsedRealtime();
        String r3 = i;
        if (r3 != null) goto L5;
    L7:
        String r4 = e35.Q();
        App.b().getClass();
        SharedPreferences r5 = App.c();
        r5.getClass();
        String r6 = r5.getString("homemusic_hub_local_url", null);
        if (r6 != null) goto L10;
        r6 = "http://192.168.0.111:8080";
    L10:
        String r7 = e35.K(r6);
        if (r7 == null) goto L27;
        if (r7.equals(r4) == true) goto L27;
        o83 r8 = (o83) h.getValue();     // Catch: Exception -> L23
        nz3 r9 = new nz3();     // Catch: Exception -> L23
        r9.d(r7.concat("/healthz"));     // Catch: Exception -> L23
        oz3 r0 = new oz3(r9);     // Catch: Exception -> L23
        r8.getClass();     // Catch: Exception -> L23
        k14 r2 = new bv3(r8, r0).c();     // Catch: Exception -> L23
        boolean r10 = r2.C;     // Catch: Throwable -> L18
        r2.close();     // Catch: Exception -> L23
    L24:
        if (r10 == false) goto L27;
        r4 = r7;
        goto L27
    L18:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        q05.h(r2, th);     // Catch: Exception -> L23
        throw th;     // Catch: Exception -> L23
    L23:
        r10 = false;
    L27:
        if (r4.length() == 0) goto L31;
        i = r4;
        j = r1;
        return r4;
    L31:
        throw new HubException("Не задан адрес Хаба — укажите его в настройках");
    L5:
        if ((r1 - j) >= 120000) goto L7;
        return r3;
    }

    public static Object d(if1 r4, if1 r5) {
        qr1 r0 = (qr1) e.get();
        if (r0 == null) goto L18;
        nz3 r6 = ((oz3) r4.invoke(r0.a)).a();
        r6.a("Cookie", r0.b);
        oz3 r1 = new oz3(r6);
        o83 r7 = (o83) f.getValue();
        r7.getClass();
        k14 r8 = new bv3(r7, r1).c();
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        q05.h(r8, th);
        throw th;
    L6:
        if (r8.C == false) goto L13;
        Object r9 = r5.invoke(r8);     // Catch: Throwable -> L10
        r8.close();
        return r9;
    L13:
        throw i(r8);     // Catch: Throwable -> L10
    L18:
        String r2 = c();
        o83 r3 = k();
        oz3 r10 = (oz3) r4.invoke(r2);
        r3.getClass();
        r10.getClass();
        k14 r11 = new bv3(r3, r10).c();
        if (r11.q != 401) goto L55;
        r11.close();
        o(r2);
        o83 r12 = k();
        oz3 r13 = (oz3) r4.invoke(r2);
        r12.getClass();
        r13.getClass();
        k14 r14 = new bv3(r12, r13).c();
    L39:
        th = move-exception;
        throw th;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        q05.h(r14, th);
        throw th;
    L35:
        if (r14.C == false) goto L42;
        Object r15 = r5.invoke(r14);     // Catch: Throwable -> L39
        r14.close();
        return r15;
    L42:
        throw i(r14);     // Catch: Throwable -> L39
    L55:
    L25:
        th = move-exception;
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        q05.h(r11, th);
        throw th;
    L21:
        if (r11.C == false) goto L28;
        Object r16 = r5.invoke(r11);     // Catch: Throwable -> L25
        r11.close();
        return r16;
    L28:
        throw i(r11);     // Catch: Throwable -> L25
    }

    public static Set e() {
        Set r0 = z01.n;
        String r2 = c();
        long r3 = SystemClock.elapsedRealtime();
        if (h12.c(k, r2) == true) goto L5;
    L41:
        o83 r5 = (o83) h.getValue();     // Catch: Exception -> L36
        nz3 r6 = new nz3();     // Catch: Exception -> L36
        r6.d(r2.concat("/healthz"));     // Catch: Exception -> L36
        oz3 r1 = new oz3(r6);     // Catch: Exception -> L36
        r5.getClass();     // Catch: Exception -> L36
        k14 r4 = new bv3(r5, r1).c();     // Catch: Exception -> L36
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        q05.h(r4, th);     // Catch: Exception -> L36
        throw th;     // Catch: Exception -> L36
    L10:
        if (r4.C == true) goto L12;
    L11:
        Set r7 = r0;
    L28:
        r4.close();     // Catch: Exception -> L36
        r0 = r7;
        goto L34
    L12:
        n14 r8 = r4.t;     // Catch: Throwable -> L15
        r7 = null;
        if (r8 == null) goto L17;
        String r9 = r8.string();     // Catch: Throwable -> L15
    L18:
        if (r9 != null) goto L20;
        r9 = "";
    L20:
        f32 r10 = (f32) e35.N(r9).a().n.get("capabilities");     // Catch: Throwable -> L15
        if (r10 == null) goto L26;
        ArrayList r11 = new ArrayList(r40.k0(r10, 10));     // Catch: Throwable -> L15
        ArrayList r12 = r10.n;     // Catch: Throwable -> L15
        int r13 = r12.size();     // Catch: Throwable -> L15
        int r14 = 0;
    L23:
        if (r14 >= r13) goto L25;
        Object r15 = r12.get(r14);     // Catch: Throwable -> L15
        r14 = r14 + 1;     // Catch: Throwable -> L15
        r11.add(((h32) r15).b());     // Catch: Throwable -> L15
        goto L23
    L25:
        r7 = q40.T0(r11);     // Catch: Throwable -> L15
    L26:
        if (r7 != null) goto L28;
    L17:
        r9 = null;
    L34:
        m = r0;
        l = r3;
        k = r2;
        return r0;
    L5:
        if ((r3 - l) >= 300000) goto L41;
        return m;
    }

    public static final void f(String r2, String r3, String r4, String r5, String r6) {
        Map r7 = x(r2);
        Map r8 = lg2.X(new kd3[]{new kd3("artist", r3), new kd3("title", r4), new kd3("context", r5), new kd3("client", r6)});
        LinkedHashMap r9 = new LinkedHashMap(r7);
        r9.putAll(r8);
        sz3 r10 = tz3.Companion;
        String r11 = c.j(r9);
        r11.getClass();
        r10.getClass();
        d(new nr1(sz3.b(r11, b), 3), new or1(9));
    }

    public static final void g(String r4) {
        sz3 r0 = tz3.Companion;
        Map r5 = lg2.X(new kd3[]{new kd3("track_refs", gb.O(r4)), new kd3("star", Boolean.FALSE)});
        String r6 = c.j(r5);
        r6.getClass();
        r0.getClass();
        if (d(new nr1(sz3.b(r6, b), 4), new or1(12)) != null) goto L5;
        return;
    L5:
        kf2.k();
    }

    public static final HubMe h() {
        String r1 = c();
        o83 r2 = k();     // Catch: IOException -> L24 HubException -> L30
        nz3 r3 = new nz3();     // Catch: IOException -> L24 HubException -> L30
        r3.d(r1.concat("/api/auth/me"));     // Catch: IOException -> L24 HubException -> L30
        oz3 r0 = new oz3(r3);     // Catch: IOException -> L24 HubException -> L30
        r2.getClass();     // Catch: IOException -> L24 HubException -> L30
        k14 r4 = new bv3(r2, r0).c();     // Catch: IOException -> L24 HubException -> L30
    L7:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        q05.h(r4, th);     // Catch: IOException -> L24 HubException -> L30
        throw th;     // Catch: IOException -> L24 HubException -> L30
    L5:
        if (r4.C == false) goto L11;
        HubMe r5 = (HubMe) p(r4, HubMe.class);     // Catch: Throwable -> L7
    L13:
        r4.close();     // Catch: IOException -> L24 HubException -> L30
        if (r5 == null) goto L16;
        return r5;
    L16:
        return o(r1);
    L11:
        if (r4.q != 401) goto L19;
        r5 = null;
        goto L13
    L19:
        throw i(r4);     // Catch: Throwable -> L7
    L30:
        e = move-exception;
        throw e;
    L24:
        e = move-exception;
        m();
        String r6 = e.getMessage();
        if (r6 != null) goto L29;
        r6 = e.getClass().getSimpleName();
    L29:
        throw new HubException("Хаб недоступен: ".concat(r6));
    }

    public static final HubException i(k14 r3) {
        int r0 = r3.q;
        String r1 = null;
        n14 r4 = r3.t;     // Catch: Exception -> L26
        if (r4 == null) goto L6;
        String r5 = r4.string();     // Catch: Exception -> L26
    L7:
        if (r5 != null) goto L9;
        r5 = "";
    L9:
        h32 r6 = (h32) e35.N(r5).a().n.get("detail");     // Catch: Exception -> L26
        if (r6 == null) goto L14;
        if ((r6 instanceof k32) == false) goto L14;
        r1 = r6.b();     // Catch: Exception -> L26
        goto L14
    L6:
        r5 = null;
    L14:
        if (r1 == null) goto L18;
        if (qm4.u0(r1) == true) goto L18;
    L25:
        return new HubException(r0, r1);
    L18:
        if (r0 != 401) goto L21;
        r1 = "Хаб не принял логин и пароль Navidrome";
        goto L25
    L21:
        if (r0 != 413) goto L23;
        r1 = "Файл слишком большой";
        goto L25
    L23:
        r1 = b11.j(r0, "Ошибка Хаба (HTTP ", ")");
        goto L25
    }

    public static ArrayList j(List r5, boolean r6) {
        r5.getClass();
        ArrayList r0 = new ArrayList(r40.k0(r5, 10));
        Iterator r7 = r5.iterator();
    L4:
        if (r7.hasNext() == false) goto L16;
        PlayEvent r1 = (PlayEvent) r7.next();
        nk1 r2 = c;
        r2.getClass();
        if (r1 != null) goto L8;
        h32 r3 = i32.n;
    L12:
        j32 r4 = r3.a();
        nb2 r8 = r4.n;
        h32 r9 = (h32) r8.remove("_compensation_chain");
        h32 r10 = (h32) r8.remove("_account");
        h32 r11 = (h32) r8.remove("_rejected");
        if (r6 == true) goto L15;
        h32 r12 = (h32) r8.remove("launch_id");
        h32 r13 = (h32) r8.remove("launch_origin");
    L15:
        r0.add(r4);
        goto L4
    L8:
        p32 r14 = new p32();
        r2.l(r1, PlayEvent.class, r14);
        ArrayList r15 = r14.y;
        if (r15.isEmpty() == false) goto L11;
        r3 = r14.A;
        goto L12
    L11:
        er1.o(r15, "Expected one JSON element but was ");
        r3 = null;
        goto L12
    L16:
        return r0;
    }

    public static final o83 k() {
        return (o83) g.getValue();
    }

    public static final HubGoogleLogin l(String r2, String r3, String r4) {
        r2.getClass();
        return (HubGoogleLogin) s(lg2.X(new kd3[]{new kd3("id_token", r2), new kd3("code", r3), new kd3("username", r4)}), "/api/auth/google", HubGoogleLogin.class);
    }

    public static final void m() {
        i = null;
        k = null;
    }

    public static final HubAppRelease n() {
        n83 r1 = ((o83) f.getValue()).a();
        r1.i = true;
        r1.j = true;
        o83 r2 = new o83(r1);
        nz3 r3 = new nz3();
        r3.d("https://raw.githubusercontent.com/PlayInSpirits/HomeMusic-Fork/main".concat("/app/latest.json"));
        k14 r0 = new bv3(r2, new oz3(r3)).c();
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        q05.h(r0, th);
        throw th;
    L5:
        if (r0.q != 404) goto L9;
        r0.close();
        return null;
    L9:
        if (r0.C == false) goto L16;
        HubAppRelease r4 = (HubAppRelease) p(r0, HubAppRelease.class);     // Catch: Throwable -> L13
        r0.close();
        return r4;
    L16:
        throw i(r0);     // Catch: Throwable -> L13
    }

    public static HubMe o(String r5) {
        String r0 = ud3.K();
        String r1 = ud3.y();
        if (r0 == null) goto L28;
        if (r0.length() == 0) goto L28;
        if (r1 == null) goto L28;
        if (r1.length() == 0) goto L28;
        sz3 r2 = tz3.Companion;
        Map r3 = lg2.X(new kd3[]{new kd3("username", r0), new kd3("password", r1)});
        String r4 = c.j(r3);
        r4.getClass();
        r2.getClass();
        we5 r6 = sz3.b(r4, b);
        o83 r7 = k();
        nz3 r8 = new nz3();
        r8.d(r5.concat("/api/auth/login"));
        r8.b("POST", r6);
        oz3 r9 = new oz3(r8);
        r7.getClass();
        k14 r10 = new bv3(r7, r9).c();
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        q05.h(r10, th);
        throw th;
    L11:
        if (r10.C == false) goto L22;
        CookieManager.getInstance().flush();     // Catch: Throwable -> L14
    L16:
        HubMe r11 = (HubMe) p(r10, HubMe.class);     // Catch: Throwable -> L19
        r10.close();
        return r11;
    L14:
        th = move-exception;
        Log.w("HubClient", "Cookie flush failed", th);     // Catch: Throwable -> L19
        goto L16
    L22:
        throw i(r10);     // Catch: Throwable -> L19
    L28:
        throw new HubException(401, "Сначала войдите в аккаунт Navidrome — Хаб использует ту же учётную запись");
    }

    public static Object p(k14 r1, Class r2) {
        n14 r3 = r1.t;
        if (r3 == null) goto L5;
        String r4 = r3.string();
    L6:
        if (r4 != null) goto L8;
        r4 = "";
    L8:
        Object r5 = c.d(r2, r4);
        if (r5 == null) goto L12;
        return r5;
    L12:
        throw new HubException("Пустой ответ Хаба");
    L5:
        r4 = null;
        goto L6
    }

    public static ArrayList q(k14 r6, Class r7) {
        n14 r8 = r6.t;
        if (r8 == null) goto L5;
        String r9 = r8.string();
    L6:
        if (r9 != null) goto L8;
        r9 = "";
    L8:
        h32 r10 = e35.N(r9);
        if ((r10 instanceof f32) == false) goto L14;
        f32 r11 = (f32) r10;
        ArrayList r0 = new ArrayList(r40.k0(r11, 10));
        ArrayList r12 = r11.n;
        int r1 = r12.size();
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L13;
        Object r3 = r12.get(r2);
        r2 = r2 + 1;
        nk1 r4 = c;
        r4.getClass();
        r0.add(su3.I(r7).cast(r4.b((h32) r3, TypeToken.get(r7))));
        goto L11
    L13:
        return r0;
    L14:
        er1.o(r10, "Not a JSON Array: ");
        return null;
    L5:
        r9 = null;
        goto L6
    }

    public static final HubPlayEventsResult r(List r3) {
        r3.getClass();
        sz3 r0 = tz3.Companion;
        Map r4 = Collections.singletonMap("events", j(r3, e().contains("launch_events_v1")));
        r4.getClass();
        String r5 = c.j(r4);
        r5.getClass();
        r0.getClass();
        return (HubPlayEventsResult) d(new nr1(sz3.b(r5, b), 6), new or1(21));
    }

    public static Object s(Map r2, String r3, Class r4) {
        String r0 = c();
        nz3 r1 = new nz3();
        r1.d(r0.concat(r3));
        if (r2 == null) goto L36;
        sz3 r5 = tz3.Companion;
        String r6 = c.j(r2);
        r6.getClass();
        r5.getClass();
        r1.b("POST", sz3.b(r6, b));
    L36:
        o83 r7 = k();     // Catch: IOException -> L23 HubException -> L29
        oz3 r8 = new oz3(r1);     // Catch: IOException -> L23 HubException -> L29
        r7.getClass();     // Catch: IOException -> L23 HubException -> L29
        k14 r9 = new bv3(r7, r8).c();     // Catch: IOException -> L23 HubException -> L29
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        q05.h(r9, th);     // Catch: IOException -> L23 HubException -> L29
        throw th;     // Catch: IOException -> L23 HubException -> L29
    L7:
        if (r9.C == false) goto L18;
        CookieManager.getInstance().flush();     // Catch: Throwable -> L10
    L12:
        Object r10 = p(r9, r4);     // Catch: Throwable -> L15
        r9.close();     // Catch: IOException -> L23 HubException -> L29
        return r10;
    L10:
        th = move-exception;
        Log.w("HubClient", "Cookie flush failed", th);     // Catch: Throwable -> L15
        goto L12
    L18:
        throw i(r9);     // Catch: Throwable -> L15
    L29:
        e = move-exception;
        throw e;
    L23:
        e = move-exception;
        m();
        String r11 = e.getMessage();
        if (r11 != null) goto L28;
        r11 = e.getClass().getSimpleName();
    L28:
        throw new HubException("Хаб недоступен: ".concat(r11));
    }

    public static final SmartAddOut t(String r2, String r3) {
        r2.getClass();
        sz3 r0 = tz3.Companion;
        String r4 = c.j(x(r3));
        r4.getClass();
        r0.getClass();
        return (SmartAddOut) d(new pr1(r2, sz3.b(r4, b), 3), new or1(15));
    }

    public static final void u(String r2, String r3) {
        r2.getClass();
        sz3 r0 = tz3.Companion;
        String r4 = c.j(x(r3));
        r4.getClass();
        r0.getClass();
        d(new pr1(r2, sz3.b(r4, b), 4), new or1(16));
    }

    public static final SmartOut v(String r4, SmartNextIn r5) {
        r4.getClass();
        r5.getClass();
        sz3 r0 = tz3.Companion;
        Map r6 = lg2.X(new kd3[]{new kd3("played", j(r5.getPlayed(), e().contains("launch_events_v1"))), new kd3("at", r5.getAt())});
        String r7 = c.j(r6);
        r7.getClass();
        r0.getClass();
        return (SmartOut) d(new pr1(r4, sz3.b(r7, b), 1), new or1(4));
    }

    public static final SmartOut w(Map r2) {
        r2.getClass();
        sz3 r0 = tz3.Companion;
        String r3 = c.j(r2);
        r3.getClass();
        r0.getClass();
        return (SmartOut) d(new nr1(sz3.b(r3, b), 5), new or1(17));
    }

    public static Map x(String r1) {
        if (ot1.c(r1) == false) goto L6;
        Map r2 = Collections.singletonMap("ref", qm4.z0(r1, "hub:"));
        r2.getClass();
        return r2;
    L6:
        Map r3 = Collections.singletonMap("nd_song_id", r1);
        r3.getClass();
        return r3;
    }

    public static final void y(ContentResolver r4, Uri r5) {
        r5.getClass();
        Map r0 = yc4.d;
        yc4 r1 = vr1.A(r4, r5, "audio/mpeg", "audio");
        uz2 r2 = new uz2();
        r2.c(wz2.f);
        r2.a("files", r1.a, new rd0(r4, r5, r1.b));
        List r6 = (List) d(new mr1(r2.b(), 1), new k2(28, 0));
    }

    public static final WaveOut z(String r4, WaveNextIn r5) {
        r4.getClass();
        r5.getClass();
        sz3 r0 = tz3.Companion;
        Map r6 = lg2.X(new kd3[]{new kd3("played", j(r5.getPlayed(), e().contains("launch_events_v1"))), new kd3("queued", r5.getQueued())});
        String r7 = c.j(r6);
        r7.getClass();
        r0.getClass();
        return (WaveOut) d(new pr1(r4, sz3.b(r7, b), 2), new or1(5));
    }
}
