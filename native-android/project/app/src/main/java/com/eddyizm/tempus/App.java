package com.eddyizm.tempus;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;
import defpackage.c12;
import defpackage.i61;
import defpackage.jz4;
import defpackage.oz;
import defpackage.pn4;
import defpackage.pp3;
import defpackage.sg0;
import defpackage.ud3;
import defpackage.w30;
import defpackage.x30;
import defpackage.xa3;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class App extends Application {
    public static App n;
    public static Context o;
    public static pn4 p;
    public static SharedPreferences q;

    public App() {
    }

    public static Context a() {
        if (o != null) goto L6;
        o = b();
    L6:
        return o;
    }

    public static App b() {
        if (n != null) goto L6;
        n = new App();
    L6:
        return n;
    }

    public static SharedPreferences c() {
        if (q != null) goto L6;
        Context r0 = o;
        q = r0.getSharedPreferences(pp3.b(r0), 0);
    L6:
        return q;
    }

    public static pn4 d() {
        String r0 = ud3.u();
        String r1 = ud3.K();
        String r2 = ud3.y();
        String r3 = ud3.J();
        String r4 = ud3.B();
        boolean r5 = xa3.u("low_security", false);
        c12 r6 = new c12(10);
        r6.o = r0;
        r6.p = r1;
        r6.j(r2, r3, r5, r4);
        i61 r7 = (i61) r6.q;
        if (r7 == null) goto L14;
        String r8 = (String) r7.o;
        if (r8 == null) goto L7;
        ud3.q0(r8);
    L7:
        String r9 = (String) ((i61) r6.q).q;
        if (r9 == null) goto L10;
        ud3.C0(r9);
    L10:
        String r10 = (String) ((i61) r6.q).p;
        if (r10 == null) goto L14;
        ud3.u0(r10);
    L14:
        return new pn4(r6);
    }

    public static pn4 e(String r7) {
        String r0 = ud3.K();
        String r1 = ud3.y();
        String r2 = ud3.J();
        String r3 = ud3.B();
        boolean r4 = xa3.u("low_security", false);
        c12 r5 = new c12(10);
        r5.o = r7;
        r5.p = r0;
        r5.j(r1, r2, r4, r3);
        return new pn4(r5);
    }

    public static pn4 f(boolean r1) {
        if (p == null) goto L5;
        if (r1 == true) goto L5;
    L7:
        return p;
    L5:
        p = d();
        goto L7
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        oz r0 = sg0.b;
        oz r1 = new oz();
        r1.n = r0.n;
        r1.o = r0.o;
        r1.p = r0.p;
        r1.n = Integer.valueOf(R.drawable.ui_crash);
        SSLSocketFactory r2 = null;
        r1.p = null;
        r1.o = CrashActivity.class;
        sg0.b = r1;
        Context r3 = getApplicationContext();
        jz4.d(r3.getSharedPreferences(pp3.b(r3), 0).getString("theme", "default"));
        n = new App();
        Context r7 = getApplicationContext();
        o = r7;
        q = r7.getSharedPreferences(pp3.b(r7), 0);
        Context r8 = o;
        X509TrustManager r4 = x30.a;
        r8.getClass();
        w30 r5 = new w30(r8);     // Catch: KeyManagementException -> L5 NoSuchAlgorithmException -> L7
        SSLContext r9 = SSLContext.getInstance("TLS");     // Catch: KeyManagementException -> L5 NoSuchAlgorithmException -> L7
        r9.init(new w30[]{r5}, new X509TrustManager[]{x30.a}, null);     // Catch: KeyManagementException -> L5 NoSuchAlgorithmException -> L7
        r2 = r9.getSocketFactory();     // Catch: KeyManagementException -> L5 NoSuchAlgorithmException -> L7
    L11:
        x30.b = r2;
        if (r2 == null) goto L17;
        HttpsURLConnection.setDefaultSSLSocketFactory(r2);
        return;
    L17:
        return;
    L5:
        e = move-exception;
        Log.e("ClientCertManager", "Failed setting mTLS", e);
    L7:
        e = move-exception;
        Log.e("ClientCertManager", "Failed setting mTLS", e);
        goto L11
    }
}
