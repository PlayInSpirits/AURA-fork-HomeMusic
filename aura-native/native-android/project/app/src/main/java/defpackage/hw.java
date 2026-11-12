package defpackage;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.media3.common.ParserException;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import io.sigpipe.jbsdiff.InvalidHeaderException;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hw {
    public static final f01 b;
    public static final f01 c;
    public static final p61 e;
    public static final p61[] f;
    public static WebView g;
    public static MutableContextWrapper h;
    public static String i;
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final StackTraceElement[] d = new StackTraceElement[0];

    static {
        int i2 = 1;
        b = new f01(i2, "REMOVED_TASK");
        c = new f01(i2, "CLOSED_EMPTY");
        p61 p61Var = new p61("CLIENT_TELEMETRY", 1L);
        e = p61Var;
        f = new p61[]{p61Var};
    }

    public static ue1 C(String str) throws ProtocolException {
        int i2;
        String strSubstring;
        boolean zK0 = xm4.k0(str, "HTTP/1.", false);
        pr3 pr3Var = pr3.p;
        pr3 pr3Var2 = pr3.q;
        if (zK0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                pr3Var = pr3Var2;
            }
        } else if (xm4.k0(str, "ICY ", false)) {
            i2 = 4;
        } else {
            if (!xm4.k0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 12;
            pr3Var = pr3Var2;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numL0 = xm4.l0(str.substring(i2, i3));
        if (numL0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numL0.intValue();
        if (str.length() <= i3) {
            strSubstring = "";
        } else {
            if (str.charAt(i3) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i2 + 4);
        }
        return new ue1(iIntValue, 17, pr3Var, strSubstring);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static v2 D(h00 h00Var) {
        int i2;
        int i3;
        int i4 = h00Var.i(16);
        int i5 = h00Var.i(16);
        if (i5 == 65535) {
            i5 = h00Var.i(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i6 = i5 + i2;
        if (i4 == 44097) {
            i6 += 2;
        }
        if (h00Var.i(2) == 3) {
            do {
                h00Var.i(2);
            } while (h00Var.h());
        }
        int i7 = h00Var.i(10);
        if (h00Var.h() && h00Var.i(3) > 0) {
            h00Var.t(2);
        }
        int i8 = h00Var.h() ? 48000 : 44100;
        int i9 = h00Var.i(4);
        int[] iArr = a;
        if (i8 == 44100 && i9 == 13) {
            i3 = iArr[i9];
        } else if (i8 != 48000 || i9 >= 14) {
            i3 = 0;
        } else {
            int i10 = iArr[i9];
            int i11 = i7 % 5;
            if (i11 == 1) {
                if (i9 != 3 || i9 == 8) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (i9 != 3) {
                    }
                    i3 = i10 + 1;
                } else if (i11 == 4 && (i9 == 3 || i9 == 8 || i9 == 11)) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
            } else if (i9 == 8 || i9 == 11) {
                i3 = i10 + 1;
            } else {
                i3 = i10;
            }
        }
        return new v2(i8, i6, i3);
    }

    public static void E(h00 h00Var, u2 u2Var) throws ParserException {
        int i2 = h00Var.i(5);
        h00Var.t(2);
        if (h00Var.h()) {
            h00Var.t(5);
        }
        if (i2 >= 7 && i2 <= 10) {
            h00Var.s();
        }
        if (h00Var.h()) {
            int i3 = h00Var.i(3);
            if (u2Var.b == -1 && i2 >= 0 && i2 <= 15 && (i3 == 0 || i3 == 1)) {
                u2Var.b = i2;
            }
            if (h00Var.h()) {
                M(h00Var);
            }
        }
    }

    public static void F(h00 h00Var, u2 u2Var) throws ParserException {
        h00Var.t(2);
        boolean zH = h00Var.h();
        int i2 = h00Var.i(8);
        for (int i3 = 0; i3 < i2; i3++) {
            h00Var.t(2);
            if (h00Var.h()) {
                h00Var.t(5);
            }
            if (zH) {
                h00Var.t(24);
            } else {
                if (h00Var.h()) {
                    if (!h00Var.h()) {
                        h00Var.t(4);
                    }
                    u2Var.c = h00Var.i(6) + 1;
                }
                h00Var.t(4);
            }
        }
        if (h00Var.h()) {
            h00Var.t(3);
            if (h00Var.h()) {
                M(h00Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k90] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [i90, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [i90, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v2, types: [i90, java.io.InputStream] */
    public static void G(byte[] bArr, byte[] bArr2, FileOutputStream fileOutputStream) throws IOException, InvalidHeaderException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        byte[] bArr3 = new byte[8];
        dataInputStream.read(bArr3);
        if (!new String(bArr3).equals("BSDIFF40")) {
            throw new InvalidHeaderException("Header missing magic number");
        }
        int iE = vr1.E(dataInputStream);
        int iE2 = vr1.E(dataInputStream);
        int iE3 = vr1.E(dataInputStream);
        if (iE < 0) {
            throw new InvalidHeaderException(iE, "control block length");
        }
        if (iE2 < 0) {
            throw new InvalidHeaderException(iE2, "diff block length");
        }
        if (iE3 < 0) {
            throw new InvalidHeaderException(iE3, "output file length");
        }
        byteArrayInputStream.close();
        java.io.InputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
        java.io.InputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr2);
        java.io.InputStream byteArrayInputStream4 = new ByteArrayInputStream(bArr2);
        try {
            byteArrayInputStream2.skip(32L);
            int i2 = iE + 32;
            byteArrayInputStream3.skip(i2);
            byteArrayInputStream4.skip(i2 + iE2);
            k90 k90Var = new k90();
            byteArrayInputStream2 = k90Var.a(byteArrayInputStream2);
            byteArrayInputStream3 = k90Var.a(byteArrayInputStream3);
            byteArrayInputStream4 = k90Var.a(byteArrayInputStream4);
            byte[] bArr4 = new byte[iE3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < iE3) {
                int iE4 = vr1.E(byteArrayInputStream2);
                int iE5 = vr1.E(byteArrayInputStream2);
                int iE6 = vr1.E(byteArrayInputStream2);
                H(byteArrayInputStream3, bArr4, i3, iE4);
                for (int i5 = 0; i5 < iE4; i5++) {
                    int i6 = i4 + i5;
                    if (i6 >= 0 && i6 < bArr.length) {
                        int i7 = i3 + i5;
                        bArr4[i7] = (byte) (bArr4[i7] + bArr[i6]);
                    }
                }
                int i8 = i3 + iE4;
                H(byteArrayInputStream4, bArr4, i8, iE5);
                i3 = i8 + iE5;
                i4 = i4 + iE4 + iE6;
            }
            fileOutputStream.write(bArr4);
        } finally {
            byteArrayInputStream2.close();
            byteArrayInputStream3.close();
            byteArrayInputStream4.close();
        }
    }

    public static void H(i90 i90Var, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0 && (i4 = i90Var.read(bArr, i2, i3)) < i3) {
            mj0.i(xa3.e(i3, i4, "Corrupt patch; bytes expected = ", " bytes read = "));
        }
    }

    public static final Object I(Object obj) {
        return obj instanceof a70 ? kb4.o(((a70) obj).a) : obj;
    }

    public static final void L(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static void M(h00 h00Var) throws ParserException {
        int i2 = h00Var.i(6);
        if (i2 < 2 || i2 > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i2)));
        }
        h00Var.t(i2 * 8);
    }

    public static ArrayList N(Collection collection, eg1 eg1Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) eg1Var.mo77apply(it.next()));
        }
        return arrayList;
    }

    public static p2 O(ic2 ic2Var, eg1 eg1Var) {
        p2 p2Var = new p2();
        ic2Var.getClass();
        p2Var.u = ic2Var;
        p2Var.v = eg1Var;
        ic2Var.f(p2Var, gq0.n);
        return p2Var;
    }

    public static AbstractList P(eg1 eg1Var, List list) {
        return list instanceof RandomAccess ? new vc2(eg1Var, list) : new wc2(eg1Var, list);
    }

    public static String S(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strH;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                strH = "null";
            } else {
                try {
                    strH = obj.toString();
                } catch (Exception e2) {
                    String strO = b11.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e2);
                    strH = f34.h("<", strO, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i3] = strH;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final i94 a(c72 c72Var, boolean z) {
        cx2 cx2Var = (cx2) c72Var.Q.g;
        eo0 eo0Var = null;
        if ((cx2Var.q & 8) != 0) {
            loop0: while (cx2Var != null) {
                if ((cx2Var.p & 8) == 0) {
                    if ((cx2Var.q & 8) != 0) {
                        break;
                        break;
                    }
                    cx2Var = cx2Var.s;
                } else {
                    cx2 cx2VarC = cx2Var;
                    f13 f13Var = null;
                    while (cx2VarC != null) {
                        if (cx2VarC instanceof g94) {
                            eo0Var = cx2VarC;
                            break loop0;
                        }
                        if ((cx2VarC.p & 8) != 0 && (cx2VarC instanceof fo0)) {
                            int i2 = 0;
                            for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                if ((cx2Var2.p & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cx2VarC = cx2Var2;
                                    } else {
                                        if (f13Var == null) {
                                            f13Var = new f13(new cx2[16]);
                                        }
                                        if (cx2VarC != null) {
                                            f13Var.b(cx2VarC);
                                            cx2VarC = null;
                                        }
                                        f13Var.b(cx2Var2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cx2VarC = j51.c(f13Var);
                    }
                    if ((cx2Var.q & 8) != 0) {
                        break;
                    }
                    cx2Var = cx2Var.s;
                }
            }
        }
        eo0Var.getClass();
        cx2 cx2Var3 = ((cx2) ((g94) eo0Var)).n;
        e94 e94VarV = c72Var.v();
        if (e94VarV == null) {
            e94VarV = new e94();
        }
        return new i94(cx2Var3, z, c72Var, e94VarV);
    }

    public static void b(ic2 ic2Var, kg1 kg1Var, Executor executor) {
        ic2Var.f(new lg1(0, ic2Var, kg1Var), executor);
    }

    public static void c(Activity activity) {
        activity.getClass();
        WebView webView = g;
        if (webView == null) {
            return;
        }
        boolean z = (activity.getResources().getConfiguration().uiMode & 48) != 32;
        int iS = g12.s(activity, R.attr.colorSurface, -16777216);
        webView.setBackgroundColor(iS);
        webView.evaluateJavascript("window.hmApplyTheme && window.hmApplyTheme(" + z + ", '" + String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(iS & 16777215)}, 1)) + "');", null);
    }

    public static gy3 f(eg1 eg1Var, List list) {
        uw1 uw1VarJ = yw1.j();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            uw1VarJ.c(eg1Var.mo77apply(bundle));
        }
        return uw1VarJ.f();
    }

    public static void g(int i2, be3 be3Var) {
        be3Var.K(7);
        byte[] bArr = be3Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static Object j(Future future) {
        Object obj;
        if (!future.isDone()) {
            kf2.o(gh0.s("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object l(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return q3.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (o5.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int n(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static String q(long j) {
        return a35.b("yMMMd", Locale.getDefault()).format(new Date(j));
    }

    public static boolean s(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean t() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) App.a().getSystemService("connectivity");
        return connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16);
    }

    public abstract void A(View view, int i2, int i3);

    public abstract void B(View view, float f2, float f3);

    public abstract void J(boolean z);

    public abstract void K(boolean z);

    public abstract boolean Q(View view, int i2);

    public abstract TransformationMethod R(TransformationMethod transformationMethod);

    public abstract int d(View view, int i2);

    public abstract int e(View view, int i2);

    public abstract Method h(Class cls, Field field);

    public abstract Constructor i(Class cls);

    public abstract InputFilter[] k(InputFilter[] inputFilterArr);

    public abstract String[] m(Class cls);

    public int o(View view) {
        return 0;
    }

    public int p() {
        return 0;
    }

    public abstract boolean r();

    public abstract boolean u(Class cls);

    public void v(int i2, int i3) {
    }

    public void w() {
    }

    public abstract Rect x();

    public void y(View view, int i2) {
    }

    public abstract void z(int i2);
}
