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

    public static Context a() {
        if (o == null) {
            o = b();
        }
        return o;
    }

    public static App b() {
        if (n == null) {
            n = new App();
        }
        return n;
    }

    public static SharedPreferences c() {
        if (q == null) {
            Context context = o;
            q = context.getSharedPreferences(pp3.b(context), 0);
        }
        return q;
    }

    public static pn4 d() {
        String strU = ud3.u();
        String strK = ud3.K();
        String strY = ud3.y();
        String strJ = ud3.J();
        String strB = ud3.B();
        boolean zU = xa3.u("low_security", false);
        c12 c12Var = new c12(10);
        c12Var.o = strU;
        c12Var.p = strK;
        c12Var.j(strY, strJ, zU, strB);
        i61 i61Var = (i61) c12Var.q;
        if (i61Var != null) {
            String str = (String) i61Var.o;
            if (str != null) {
                ud3.q0(str);
            }
            String str2 = (String) ((i61) c12Var.q).q;
            if (str2 != null) {
                ud3.C0(str2);
            }
            String str3 = (String) ((i61) c12Var.q).p;
            if (str3 != null) {
                ud3.u0(str3);
            }
        }
        return new pn4(c12Var);
    }

    public static pn4 e(String str) {
        String strK = ud3.K();
        String strY = ud3.y();
        String strJ = ud3.J();
        String strB = ud3.B();
        boolean zU = xa3.u("low_security", false);
        c12 c12Var = new c12(10);
        c12Var.o = str;
        c12Var.p = strK;
        c12Var.j(strY, strJ, zU, strB);
        return new pn4(c12Var);
    }

    public static pn4 f(boolean z) {
        if (p == null || z) {
            p = d();
        }
        return p;
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        oz ozVar = sg0.b;
        oz ozVar2 = new oz();
        ozVar2.n = ozVar.n;
        ozVar2.o = ozVar.o;
        ozVar2.p = ozVar.p;
        ozVar2.n = Integer.valueOf(R.drawable.ui_crash);
        SSLSocketFactory socketFactory = null;
        ozVar2.p = null;
        ozVar2.o = CrashActivity.class;
        sg0.b = ozVar2;
        Context applicationContext = getApplicationContext();
        jz4.d(applicationContext.getSharedPreferences(pp3.b(applicationContext), 0).getString("theme", "default"));
        n = new App();
        Context applicationContext2 = getApplicationContext();
        o = applicationContext2;
        q = applicationContext2.getSharedPreferences(pp3.b(applicationContext2), 0);
        Context context = o;
        X509TrustManager x509TrustManager = x30.a;
        context.getClass();
        try {
            w30 w30Var = new w30(context);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(new w30[]{w30Var}, new X509TrustManager[]{x30.a}, null);
            socketFactory = sSLContext.getSocketFactory();
        } catch (KeyManagementException e) {
            Log.e("ClientCertManager", "Failed setting mTLS", e);
        } catch (NoSuchAlgorithmException e2) {
            Log.e("ClientCertManager", "Failed setting mTLS", e2);
        }
        x30.b = socketFactory;
        if (socketFactory != null) {
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        }
    }
}
