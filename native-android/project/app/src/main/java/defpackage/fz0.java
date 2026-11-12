package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.webkit.WebView;
import androidx.work.WorkerParameters;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509KeyManager;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fz0 implements ju, me0, po0, y14, o95 {
    public static final fz0 A = null;
    public static final fz0 B = null;
    public static final fz0 C = null;
    public static final fz0 D = null;
    public static final kf2 E = null;
    public static final /* synthetic */ fz0 F = null;
    public static final d60 G = null;
    public static final d60 H = null;
    public static final d60 I = null;
    public static final d60 J = null;
    public static final k2 K = null;
    public static final fz0 L = null;
    public static final Object M = null;
    public static volatile fz0 N;
    public static final mb O = null;
    public static final mb P = null;
    public static final mb Q = null;
    public static final /* synthetic */ fz0 R = null;
    public static final /* synthetic */ fz0 S = null;
    public static final fz0 T = null;
    public static final fz0 U = null;
    public static final fz0 V = null;
    public static final fz0 W = null;
    public static final fz0 X = null;
    public static final fz0 Y = null;
    public static final fz0 Z = null;
    public static final wv3 a0 = null;
    public static final fz0 b0 = null;
    public static final fz0 c0 = null;
    public static final /* synthetic */ fz0 d0 = null;
    public static final fz0 e0 = null;
    public static final String[] f0 = null;
    public static final /* synthetic */ fz0 g0 = null;
    public static final /* synthetic */ fz0 h0 = null;
    public static fz0 i0;
    public static final fz0 j0 = null;
    public static final hs o = null;
    public static final hs p = null;
    public static final hs q = null;
    public static final hs r = null;
    public static final hs s = null;
    public static final hs t = null;
    public static final hs u = null;
    public static final hs v = null;
    public static final hs w = null;
    public static final gs x = null;
    public static final fs y = null;
    public static final fs z = null;
    public final /* synthetic */ int n;

    static {
        o = new hs(-1.0f, -1.0f);
        p = new hs(0.0f, -1.0f);
        q = new hs(1.0f, -1.0f);
        r = new hs(-1.0f, 0.0f);
        s = new hs(0.0f, 0.0f);
        t = new hs(1.0f, 0.0f);
        u = new hs(-1.0f, 1.0f);
        v = new hs(0.0f, 1.0f);
        w = new hs(1.0f, 1.0f);
        new gs(-1.0f);
        x = new gs(0.0f);
        y = new fs(-1.0f);
        z = new fs(0.0f);
        A = new fz0(2);
        B = new fz0(3);
        C = new fz0(4);
        D = new fz0(5);
        E = new kf2(17);
        F = new fz0(7);
        byte r2 = 0;
        G = new d60(4, r2);
        H = new d60(5, r2);
        I = new d60(6, r2);
        J = new d60(7, r2);
        K = new k2(9, r2);
        L = new fz0(8);
        M = new Object();
        O = new mb(0);
        P = new mb(1);
        Q = new mb(2);
        R = new fz0(11);
        S = new fz0(12);
        T = new fz0(13);
        U = new fz0(14);
        V = new fz0(15);
        W = new fz0(16);
        X = new fz0(17);
        Y = new fz0(18);
        Z = new fz0(19);
        a0 = new wv3(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
        b0 = new fz0(21);
        c0 = new fz0(22);
        d0 = new fz0(23);
        e0 = new fz0(24);
        f0 = new String[0];
        g0 = new fz0(26);
        h0 = new fz0(27);
        j0 = new fz0(29);
    }

    public fz0() {
        this.n = 9;
        new ConcurrentHashMap();
    }

    public static String d(String r9, String r10) {
        byte[] r11 = q40.B0(q40.J0(gb.P(new String[]{r9, r10})), ":", null, null, null, 62).getBytes(w10.a);
        r11.getClass();
        String r12 = qm4.J0(12, h(r11)).toUpperCase(Locale.ROOT);
        r12.getClass();
        l93.o(4, 4);
        int r13 = r12.length();
        int r0 = r13 / 4;
        int r2 = 0;
        if ((r13 % 4) != 0) goto L5;
        int r1 = 0;
    L6:
        ArrayList r3 = new ArrayList(r0 + r1);
    L7:
        if (r2 < 0) goto L17;
        if (r2 >= r13) goto L17;
        int r4 = r2 + 4;
        if (r4 < 0) goto L14;
        if (r4 > r13) goto L14;
        int r5 = r4;
    L15:
        CharSequence r6 = r12.subSequence(r2, r5);
        r6.getClass();
        r3.add(r6.toString());
        r2 = r4;
    L14:
        r5 = r13;
    L17:
        return q40.B0(r3, " ", null, null, null, 62);
    L5:
        r1 = 1;
        goto L6
    }

    public static SSLContext f() {
        KeyStore r1 = KeyStore.getInstance("AndroidKeyStore");
        r1.load(null);
        Key r4 = r1.getKey("tempus-lan-v1", null);
        if ((r4 instanceof PrivateKey) == false) goto L5;
        PrivateKey r5 = (PrivateKey) r4;
    L7:
        if (r5 == null) goto L13;
        KeyInfo r7 = (KeyInfo) KeyFactory.getInstance(r5.getAlgorithm(), "AndroidKeyStore").getKeySpec(r5, KeyInfo.class);
        String[] r8 = r7.getDigests();
        r8.getClass();
        if (ti.m0(r8, "NONE") < 0) goto L13;
        String[] r9 = r7.getEncryptionPaddings();
        r9.getClass();
        if (ti.m0(r9, "NoPadding") < 0) goto L13;
    L18:
        KeyManagerFactory r0 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        r0.init(r1, null);
        KeyManager[] r2 = r0.getKeyManagers();
        r2.getClass();
        ArrayList r3 = new ArrayList();
        int r6 = r2.length;
        int r10 = 0;
    L19:
        if (r10 >= r6) goto L24;
        KeyManager r11 = r2[r10];
        if ((r11 instanceof X509KeyManager) == false) goto L23;
        r3.add(r11);
    L23:
        r10 = r10 + 1;
        goto L19
    L24:
        x42 r12 = new x42((X509KeyManager) q40.w0(r3));
        i62 r13 = new i62();
        SSLContext r14 = SSLContext.getInstance("TLS");
        r14.init(new x42[]{r12}, new i62[]{r13}, null);
        return r14;
    L13:
        w42 r15 = w42.a;
        if (r5 != null) goto L16;
        String r16 = "Creating TLS identity";
    L17:
        w42.b(r16);
        KeyPairGenerator r17 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        r17.initialize(new KeyGenParameterSpec.Builder("tempus-lan-v1", 12).setKeySize(2048).setDigests(new String[]{"NONE", "SHA-256", "SHA-384", "SHA-512"}).setEncryptionPaddings(new String[]{"NoPadding"}).setSignaturePaddings(new String[]{"PKCS1", "PSS"}).build());
        r17.generateKeyPair();
        goto L18
    L16:
        r16 = "Replacing legacy TLS identity; pairing required again";
        goto L17
    L5:
        r5 = null;
        goto L7
    }

    public static String h(byte[] r7) {
        byte[] r8 = MessageDigest.getInstance("SHA-256").digest(r7);
        r8.getClass();
        StringBuilder r0 = new StringBuilder();
        r0.append("");
        int r2 = r8.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L8;
        byte r5 = r8[r3];
        r4 = r4 + 1;
        if (r4 <= 1) goto L7;
        r0.append("");
    L7:
        r0.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r5)}, 1)));
        r3 = r3 + 1;
        goto L3
    L8:
        r0.append("");
        return r0.toString();
    }

    public static String l(SSLSocket r1) {
        byte[] r2 = r1.getSession().getLocalCertificates()[0].getEncoded();
        r2.getClass();
        return h(r2);
    }

    public static String m(SSLSocket r1) {
        byte[] r2 = r1.getSession().getPeerCertificates()[0].getEncoded();
        r2.getClass();
        return h(r2);
    }

    public static JSONObject n(SSLSocket r3) {
        DataInputStream r0 = new DataInputStream(r3.getInputStream());
        int r4 = r0.readInt();
        if (1 <= r4) goto L5;
    L8:
        kf2.n("Invalid frame size");
        return null;
    L5:
        if (r4 >= 131073) goto L8;
        byte[] r5 = new byte[r4];
        r0.readFully(r5);
        return new JSONObject(new String(r5, w10.a));
    }

    public static void p(SSLSocket r2, JSONObject r3) {
        r3.getClass();
        String r4 = r3.toString();
        r4.getClass();
        byte[] r5 = r4.getBytes(w10.a);
        r5.getClass();
        int r0 = r5.length;
        if (1 <= r0) goto L5;
    L8:
        kf2.n("Failed requirement.");
        return;
    L5:
        if (r0 >= 131073) goto L8;
        DataOutputStream r1 = new DataOutputStream(r2.getOutputStream());
        r1.writeInt(r5.length);
        r1.write(r5);
        r1.flush();
    }

    @Override // defpackage.ju
    public Rect a(Activity r12) {
        int r11 = this.n;
        int r3 = 0;
        iu r4 = ju.b;
        DisplayCutout r9 = null;
        switch(r11) {
            case 3: goto L94;
            case 4: goto L20;
            default: goto L4;
        };
    L4:
        Configuration r13 = r12.getResources().getConfiguration();
        Field r0 = Configuration.class.getDeclaredField("windowConfiguration");     // Catch: Exception -> L7
        r0.setAccessible(true);     // Catch: Exception -> L7
        Object r14 = r0.get(r13);     // Catch: Exception -> L7
        Object r15 = r14.getClass().getDeclaredMethod("getBounds", null).invoke(r14, null);     // Catch: Exception -> L7
        r15.getClass();     // Catch: Exception -> L7
        return new Rect((Rect) r15);
    L7:
        e = move-exception;
        if ((e instanceof NoSuchFieldException) == false) goto L11;
    L18:
        r4.getClass();
        Log.w(iu.b, e);
        return C.a(r12);
    L11:
        if ((e instanceof NoSuchMethodException) == true) goto L18;
        if ((e instanceof IllegalAccessException) == true) goto L18;
        if ((e instanceof InvocationTargetException) == true) goto L18;
        throw e;
    L20:
        Rect r16 = new Rect();
        Configuration r10 = r12.getResources().getConfiguration();
        Field r7 = Configuration.class.getDeclaredField("windowConfiguration");     // Catch: Exception -> L24
        r7.setAccessible(true);     // Catch: Exception -> L24
        Object r8 = r7.get(r10);     // Catch: Exception -> L24
        if (r12.isInMultiWindowMode() == false) goto L26;
        Object r5 = r8.getClass().getDeclaredMethod("getBounds", null).invoke(r8, null);     // Catch: Exception -> L24
        r5.getClass();     // Catch: Exception -> L24
        r16.set((Rect) r5);     // Catch: Exception -> L24
    L108:
    L39:
        Display r6 = r12.getWindowManager().getDefaultDisplay();
        Point r17 = new Point();
        r6.getRealSize(r17);
        if (r12.isInMultiWindowMode() == true) goto L55;
        Resources r18 = r12.getResources();
        int r1 = r18.getIdentifier("navigation_bar_height", "dimen", "android");
        if (r1 <= 0) goto L44;
        int r2 = r18.getDimensionPixelSize(r1);
    L45:
        int r19 = r16.bottom + r2;
        if (r19 != r17.y) goto L48;
        r16.bottom = r19;
        goto L55
    L48:
        int r20 = r16.right + r2;
        if (r20 != r17.x) goto L52;
        r16.right = r20;
        goto L55
    L52:
        if (r16.left != r2) goto L55;
        r16.left = 0;
        goto L55
    L44:
        r2 = 0;
    L55:
        if (r16.width() < r17.x) goto L59;
        if (r16.height() < r17.y) goto L59;
    L93:
        return r16;
    L59:
        if (r12.isInMultiWindowMode() == true) goto L93;
        Constructor<?> r110 = Class.forName("android.view.DisplayInfo").getConstructor(null);     // Catch: Exception -> L64
        r110.setAccessible(true);     // Catch: Exception -> L64
        Object r111 = r110.newInstance(null);     // Catch: Exception -> L64
        Method r21 = r6.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{r111.getClass()});     // Catch: Exception -> L64
        r21.setAccessible(true);     // Catch: Exception -> L64
        r21.invoke(r6, new Object[]{r111});     // Catch: Exception -> L64
        Field r22 = r111.getClass().getDeclaredField("displayCutout");     // Catch: Exception -> L64
        r22.setAccessible(true);     // Catch: Exception -> L64
        Object r112 = r22.get(r111);     // Catch: Exception -> L64
        if (i3.x(r112) == false) goto L80;
        r9 = i3.j(r112);     // Catch: Exception -> L64
    L80:
        if (r9 == null) goto L93;
        if (r16.left != sr0.w(r9)) goto L85;
        r16.left = 0;
    L85:
        if ((r17.x - r16.right) != sr0.C(r9)) goto L88;
        r16.right = sr0.C(r9) + r16.right;
    L88:
        if (r16.top != sr0.d(r9)) goto L91;
        r16.top = 0;
    L91:
        if ((r17.y - r16.bottom) != sr0.B(r9)) goto L93;
        r16.bottom = sr0.B(r9) + r16.bottom;
    L64:
        e = move-exception;
        if ((e instanceof ClassNotFoundException) == false) goto L68;
    L79:
        r4.getClass();
        Log.w(iu.b, e);
        goto L80
    L68:
        if ((e instanceof NoSuchMethodException) == true) goto L79;
        if ((e instanceof NoSuchFieldException) == true) goto L79;
        if ((e instanceof IllegalAccessException) == true) goto L79;
        if ((e instanceof InvocationTargetException) == true) goto L79;
        if ((e instanceof InstantiationException) == true) goto L79;
        throw e;
    L26:
        Object r23 = r8.getClass().getDeclaredMethod("getAppBounds", null).invoke(r8, null);     // Catch: Exception -> L24
        r23.getClass();     // Catch: Exception -> L24
        r16.set((Rect) r23);     // Catch: Exception -> L24
    L24:
        e = move-exception;
        if ((e instanceof NoSuchFieldException) == false) goto L31;
    L38:
        r4.getClass();
        Log.w(iu.b, e);
        r12.getWindowManager().getDefaultDisplay().getRectSize(r16);
        goto L39
    L31:
        if ((e instanceof NoSuchMethodException) == true) goto L38;
        if ((e instanceof IllegalAccessException) == true) goto L38;
        if ((e instanceof InvocationTargetException) == true) goto L38;
        throw e;
    L94:
        Rect r113 = new Rect();
        Display r24 = r12.getWindowManager().getDefaultDisplay();
        r24.getRectSize(r113);
        if (r12.isInMultiWindowMode() == true) goto L105;
        Point r25 = new Point();
        r24.getRealSize(r25);
        Resources r114 = r12.getResources();
        int r26 = r114.getIdentifier("navigation_bar_height", "dimen", "android");
        if (r26 <= 0) goto L99;
        r3 = r114.getDimensionPixelSize(r26);
    L99:
        int r115 = r113.bottom + r3;
        if (r115 != r25.y) goto L102;
        r113.bottom = r115;
        goto L105
    L102:
        int r116 = r113.right + r3;
        if (r116 != r25.x) goto L105;
        r113.right = r116;
    L105:
        return r113;
    }

    @Override // defpackage.o95
    public String[] b() {
        return f0;
    }

    @Override // defpackage.po0
    public float c(Context r1) {
        return r1.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.o95
    public WebViewProviderBoundaryInterface createWebView(WebView r1) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public synchronized SSLContext e() {
        monitor-enter(this);
        SSLContext r0 = f();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public oc2 g(Context r4, String r5, WorkerParameters r6) {
        r4.getClass();
        r5.getClass();
        r6.getClass();
        Class<? extends U> r0 = Class.forName(r5).asSubclass(oc2.class);     // Catch: Throwable -> L13
        r0.getClass();     // Catch: Throwable -> L13
        Object r7 = r0.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{r4, r6});     // Catch: Throwable -> L10
        r7.getClass();     // Catch: Throwable -> L10
        oc2 r8 = (oc2) r7;     // Catch: Throwable -> L10
        if (r8.d == true) goto L8;
        return r8;
    L8:
        tb4.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", r5, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        return null;
    L10:
        th = move-exception;
        cx.f().e(kd5.a, "Could not instantiate ".concat(r5), th);
        throw th;
    L13:
        th = move-exception;
        cx.f().e(kd5.a, "Invalid class: ".concat(r5), th);
        throw th;
    }

    @Override // defpackage.o95
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public boolean i() {
        return this instanceof ng2;
    }

    public void j(float r1, float r2, float r3, kc4 r4) {
        r4.c(r1, 0.0f);
    }

    public void k(String r2) {
        qg3 r1 = qg3.a;
        qg3.a.getClass();
        qg3.i(r2, 4, null);
    }

    public void o(Context r1, pk5 r2) {
        r1.unbindService(r2);     // Catch: Throwable -> L4
        return;
    }

    public boolean q(Context r2, String r3, Intent r4, pk5 r5, Executor r6) {
        ComponentName r1 = r4.getComponent();
        if (r1 == null) goto L11;
        String r7 = r1.getPackageName();
        "com.google.android.gms".equals(r7);
        if ((((Context) ae5.a(r2).o).getPackageManager().getApplicationInfo(r7, 0).flags & 2097152) == 0) goto L11;
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    L11:
        if (r6 != null) goto L14;
        r6 = null;
    L14:
        if (Build.VERSION.SDK_INT < 29) goto L18;
        if (r6 == null) goto L18;
        return kz.r(r2, r4, r6, r5);
    L18:
        return r2.bindService(r4, r5, 4225);
    }

    public /* synthetic */ fz0(int r1) {
        this.n = r1;
    }
}
