package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyManagementException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509KeyManager;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fz0 implements ju, me0, po0, y14, o95 {
    public static final fz0 A;
    public static final fz0 B;
    public static final fz0 C;
    public static final fz0 D;
    public static final kf2 E;
    public static final /* synthetic */ fz0 F;
    public static final d60 G;
    public static final d60 H;
    public static final d60 I;
    public static final d60 J;
    public static final k2 K;
    public static final fz0 L;
    public static final Object M;
    public static volatile fz0 N;
    public static final mb O;
    public static final mb P;
    public static final mb Q;
    public static final /* synthetic */ fz0 R;
    public static final /* synthetic */ fz0 S;
    public static final fz0 T;
    public static final fz0 U;
    public static final fz0 V;
    public static final fz0 W;
    public static final fz0 X;
    public static final fz0 Y;
    public static final fz0 Z;
    public static final wv3 a0;
    public static final fz0 b0;
    public static final fz0 c0;
    public static final /* synthetic */ fz0 d0;
    public static final fz0 e0;
    public static final String[] f0;
    public static final /* synthetic */ fz0 g0;
    public static final /* synthetic */ fz0 h0;
    public static fz0 i0;
    public static final fz0 j0;
    public static final hs o = new hs(-1.0f, -1.0f);
    public static final hs p = new hs(0.0f, -1.0f);
    public static final hs q = new hs(1.0f, -1.0f);
    public static final hs r = new hs(-1.0f, 0.0f);
    public static final hs s = new hs(0.0f, 0.0f);
    public static final hs t = new hs(1.0f, 0.0f);
    public static final hs u = new hs(-1.0f, 1.0f);
    public static final hs v = new hs(0.0f, 1.0f);
    public static final hs w = new hs(1.0f, 1.0f);
    public static final gs x;
    public static final fs y;
    public static final fs z;
    public final /* synthetic */ int n;

    static {
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
        byte b = 0;
        G = new d60(4, b);
        H = new d60(5, b);
        I = new d60(6, b);
        J = new d60(7, b);
        K = new k2(9, b);
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

    public static String d(String str, String str2) {
        byte[] bytes = q40.B0(q40.J0(gb.P(str, str2)), ":", null, null, null, 62).getBytes(w10.a);
        bytes.getClass();
        String upperCase = qm4.J0(12, h(bytes)).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        l93.o(4, 4);
        int length = upperCase.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 4) + (length % 4 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i2 = i + 4;
            CharSequence charSequenceSubSequence = upperCase.subSequence(i, (i2 < 0 || i2 > length) ? length : i2);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i = i2;
        }
        return q40.B0(arrayList, " ", null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    public static SSLContext f() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String str;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey("tempus-lan-v1", null);
        PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
        if (privateKey != null) {
            KeyInfo keyInfo = (KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class);
            String[] digests = keyInfo.getDigests();
            digests.getClass();
            if (ti.m0(digests, "NONE") >= 0) {
                String[] encryptionPaddings = keyInfo.getEncryptionPaddings();
                encryptionPaddings.getClass();
                if (ti.m0(encryptionPaddings, "NoPadding") < 0) {
                    w42 w42Var = w42.a;
                    if (privateKey == null) {
                        str = "Creating TLS identity";
                    } else {
                        str = "Replacing legacy TLS identity; pairing required again";
                    }
                    w42.a.a(str, null);
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tempus-lan-v1", 12).setKeySize(2048).setDigests("NONE", "SHA-256", "SHA-384", "SHA-512").setEncryptionPaddings("NoPadding").setSignaturePaddings("PKCS1", "PSS").build());
                    keyPairGenerator.generateKeyPair();
                }
            } else {
                w42 w42Var2 = w42.a;
                if (privateKey == null) {
                    str = "Creating TLS identity";
                } else {
                    str = "Replacing legacy TLS identity; pairing required again";
                }
                w42.a.a(str, null);
                KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator2.initialize(new KeyGenParameterSpec.Builder("tempus-lan-v1", 12).setKeySize(2048).setDigests("NONE", "SHA-256", "SHA-384", "SHA-512").setEncryptionPaddings("NoPadding").setSignaturePaddings("PKCS1", "PSS").build());
                keyPairGenerator2.generateKeyPair();
            }
        } else {
            w42 w42Var3 = w42.a;
            if (privateKey == null) {
                str = "Creating TLS identity";
            } else {
                str = "Replacing legacy TLS identity; pairing required again";
            }
            w42.a.a(str, null);
            KeyPairGenerator keyPairGenerator3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator3.initialize(new KeyGenParameterSpec.Builder("tempus-lan-v1", 12).setKeySize(2048).setDigests("NONE", "SHA-256", "SHA-384", "SHA-512").setEncryptionPaddings("NoPadding").setSignaturePaddings("PKCS1", "PSS").build());
            keyPairGenerator3.generateKeyPair();
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, null);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        keyManagers.getClass();
        ArrayList arrayList = new ArrayList();
        for (KeyManager keyManager : keyManagers) {
            if (keyManager instanceof X509KeyManager) {
                arrayList.add(keyManager);
            }
        }
        x42 x42Var = new x42((X509KeyManager) q40.w0(arrayList));
        i62 i62Var = new i62();
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(new x42[]{x42Var}, new i62[]{i62Var}, null);
        return sSLContext;
    }

    public static String h(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        bArrDigest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String l(SSLSocket sSLSocket) throws CertificateEncodingException {
        byte[] encoded = sSLSocket.getSession().getLocalCertificates()[0].getEncoded();
        encoded.getClass();
        return h(encoded);
    }

    public static String m(SSLSocket sSLSocket) throws CertificateEncodingException {
        byte[] encoded = sSLSocket.getSession().getPeerCertificates()[0].getEncoded();
        encoded.getClass();
        return h(encoded);
    }

    public static JSONObject n(SSLSocket sSLSocket) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(sSLSocket.getInputStream());
        int i = dataInputStream.readInt();
        if (1 > i || i >= 131073) {
            kf2.n("Invalid frame size");
            return null;
        }
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new JSONObject(new String(bArr, w10.a));
    }

    public static void p(SSLSocket sSLSocket, JSONObject jSONObject) throws IOException {
        jSONObject.getClass();
        String string = jSONObject.toString();
        string.getClass();
        byte[] bytes = string.getBytes(w10.a);
        bytes.getClass();
        int length = bytes.length;
        if (1 > length || length >= 131073) {
            kf2.n("Failed requirement.");
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(sSLSocket.getOutputStream());
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.flush();
    }

    @Override // defpackage.ju
    public Rect a(Activity activity) throws Exception {
        int i = this.n;
        iu iuVar = ju.b;
        DisplayCutout displayCutoutJ = null;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i2 = rect.bottom + dimensionPixelSize;
                    if (i2 == point.y) {
                        rect.bottom = i2;
                    } else {
                        int i3 = rect.right + dimensionPixelSize;
                        if (i3 == point.x) {
                            rect.right = i3;
                        }
                    }
                }
                return rect;
            case 4:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    iuVar.getClass();
                    Log.w(iu.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i4 = rect2.bottom + dimensionPixelSize2;
                    if (i4 == point2.y) {
                        rect2.bottom = i4;
                    } else {
                        int i5 = rect2.right + dimensionPixelSize2;
                        if (i5 == point2.x) {
                            rect2.right = i5;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (i3.x(obj2)) {
                            displayCutoutJ = i3.j(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        iuVar.getClass();
                        Log.w(iu.b, e2);
                    }
                    if (displayCutoutJ != null) {
                        if (rect2.left == displayCutoutJ.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutJ.getSafeInsetRight()) {
                            rect2.right = displayCutoutJ.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutJ.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutJ.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutJ.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                    break;
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    iuVar.getClass();
                    Log.w(iu.b, e3);
                    return C.a(activity);
                }
        }
    }

    @Override // defpackage.o95
    public String[] b() {
        return f0;
    }

    @Override // defpackage.po0
    public float c(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.o95
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public synchronized SSLContext e() {
        return f();
    }

    public oc2 g(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(oc2.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                oc2 oc2Var = (oc2) objNewInstance;
                if (!oc2Var.d) {
                    return oc2Var;
                }
                tb4.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
                return null;
            } catch (Throwable th) {
                cx.f().e(kd5.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            cx.f().e(kd5.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    @Override // defpackage.o95
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public boolean i() {
        return this instanceof ng2;
    }

    public void j(float f, float f2, float f3, kc4 kc4Var) {
        kc4Var.c(f, 0.0f);
    }

    public void k(String str) {
        qg3 qg3Var = qg3.a;
        qg3.a.getClass();
        qg3.i(str, 4, null);
    }

    public void o(Context context, pk5 pk5Var) {
        try {
            context.unbindService(pk5Var);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public boolean q(Context context, String str, Intent intent, pk5 pk5Var, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) ae5.a(context).o).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, pk5Var, 4225) : context.bindService(intent, 4225, executor, pk5Var);
    }

    public /* synthetic */ fz0(int i) {
        this.n = i;
    }
}
