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
    public static final int[] a = null;
    public static final f01 b = null;
    public static final f01 c = null;
    public static final StackTraceElement[] d = null;
    public static final p61 e = null;
    public static final p61[] f = null;
    public static WebView g;
    public static MutableContextWrapper h;
    public static String i;

    static {
        a = new int[]{2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
        int r1 = 1;
        b = new f01(r1, "REMOVED_TASK");
        c = new f01(r1, "CLOSED_EMPTY");
        d = new StackTraceElement[0];
        p61 r0 = new p61("CLIENT_TELEMETRY", 1);
        e = r0;
        f = new p61[]{r0};
    }

    public static ue1 C(String r8) {
        boolean r0 = xm4.k0(r8, "HTTP/1.", false);
        pr3 r2 = pr3.p;
        pr3 r3 = pr3.q;
        if (r0 == false) goto L18;
        int r1 = 9;
        if (r8.length() < 9) goto L16;
        if (r8.charAt(8) != ' ') goto L16;
        int r4 = r8.charAt(7) - '0';
        if (r4 != 0) goto L11;
    L24:
        int r5 = r1 + 3;
        if (r8.length() < r5) goto L41;
        Integer r6 = xm4.l0(r8.substring(r1, r5));
        if (r6 == null) goto L39;
        int r7 = r6.intValue();
        if (r8.length() > r5) goto L31;
        String r9 = "";
    L37:
        return new ue1(r7, 17, r2, r9);
    L31:
        if (r8.charAt(r5) != ' ') goto L34;
        r9 = r8.substring(r1 + 4);
        goto L37
    L34:
        throw new ProtocolException("Unexpected status line: ".concat(r8));
    L39:
        throw new ProtocolException("Unexpected status line: ".concat(r8));
    L41:
        throw new ProtocolException("Unexpected status line: ".concat(r8));
    L11:
        if (r4 != 1) goto L14;
    L23:
        r2 = r3;
        goto L24
    L14:
        throw new ProtocolException("Unexpected status line: ".concat(r8));
    L16:
        throw new ProtocolException("Unexpected status line: ".concat(r8));
    L18:
        if (xm4.k0(r8, "ICY ", false) == false) goto L21;
        r1 = 4;
        goto L24
    L21:
        if (xm4.k0(r8, "SOURCETABLE ", false) == false) goto L43;
        r1 = 12;
        goto L23
    L43:
        throw new ProtocolException("Unexpected status line: ".concat(r8));
    }

    public static v2 D(h00 r9) {
        int r1 = r9.i(16);
        int r0 = r9.i(16);
        if (r0 != 65535) goto L5;
        r0 = r9.i(24);
        int r2 = 7;
    L6:
        int r3 = r0 + r2;
        if (r1 != 44097) goto L10;
        r3 = r3 + 2;
    L10:
        if (r9.i(2) != 3) goto L13;
    L11:
        r9.i(2);
        if (r9.h() == true) goto L11;
    L13:
        int r4 = r9.i(10);
        if (r9.h() == false) goto L19;
        if (r9.i(3) <= 0) goto L19;
        r9.t(2);
    L19:
        if (r9.h() == false) goto L21;
        int r5 = 48000;
    L22:
        int r10 = r9.i(4);
        int[] r8 = a;
        if (r5 == 44100) goto L25;
    L27:
        if (r5 == 48000) goto L29;
    L48:
        int r11 = 0;
    L50:
        return new v2(r5, r3, r11);
    L29:
        if (r10 >= 14) goto L48;
        int r6 = r8[r10];
        int r7 = r4 % 5;
        if (r7 != 1) goto L33;
    L44:
        if (r10 != 3) goto L45;
    L40:
        r11 = r6 + 1;
        goto L50
    L45:
        if (r10 == 8) goto L40;
    L47:
        r11 = r6;
        goto L50
    L33:
        if (r7 == 2) goto L41;
        if (r7 == 3) goto L44;
        if (r7 != 4) goto L47;
        if (r10 == 3) goto L40;
        if (r10 == 8) goto L40;
        if (r10 != 11) goto L47;
    L41:
        if (r10 == 8) goto L40;
        if (r10 != 11) goto L47;
    L25:
        if (r10 != 13) goto L27;
        r11 = r8[r10];
        goto L50
    L21:
        r5 = 44100;
        goto L22
    L5:
        r2 = 4;
        goto L6
    }

    public static void E(h00 r4, u2 r5) {
        int r1 = r4.i(5);
        r4.t(2);
        if (r4.h() == false) goto L6;
        r4.t(5);
    L6:
        if (r1 < 7) goto L11;
        if (r1 > 10) goto L11;
        r4.s();
    L11:
        if (r4.h() == false) goto L25;
        int r0 = r4.i(3);
        if (r5.b != (-1)) goto L22;
        if (r1 < 0) goto L22;
        if (r1 > 15) goto L22;
        if (r0 != 0) goto L19;
    L20:
        r5.b = r1;
        goto L22
    L19:
        if (r0 == 1) goto L20;
    L22:
        if (r4.h() == false) goto L26;
        M(r4);
        return;
    L26:
        return;
    }

    public static void F(h00 r6, u2 r7) {
        r6.t(2);
        boolean r1 = r6.h();
        int r2 = r6.i(8);
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L18;
        r6.t(2);
        if (r6.h() == false) goto L7;
        r6.t(5);
    L7:
        if (r1 == false) goto L10;
        r6.t(24);
    L16:
        r3 = r3 + 1;
        goto L3
    L10:
        if (r6.h() == true) goto L12;
    L15:
        r6.t(4);
        goto L16
    L12:
        if (r6.h() == true) goto L14;
        r6.t(4);
    L14:
        r7.c = r6.i(6) + 1;
        goto L15
    L18:
        if (r6.h() == false) goto L26;
        r6.t(3);
        if (r6.h() == false) goto L27;
        M(r6);
        return;
    L27:
        return;
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
    public static void G(byte[] r16, byte[] r17, FileOutputStream r18) {
        ByteArrayInputStream r2 = new ByteArrayInputStream(r17);
        DataInputStream r3 = new DataInputStream(r2);
        byte[] r4 = new byte[8];
        r3.read(r4);
        if (new String(r4).equals("BSDIFF40") == false) goto L34;
        int r5 = vr1.E(r3);
        int r6 = vr1.E(r3);
        int r7 = vr1.E(r3);
        if (r5 < 0) goto L32;
        if (r6 < 0) goto L30;
        if (r7 < 0) goto L28;
        r2.close();
        ?? r8 = new ByteArrayInputStream(r17);
        ?? r9 = new ByteArrayInputStream(r17);
        ?? r10 = new ByteArrayInputStream(r17);
        r8.skip(32);     // Catch: Throwable -> L18
        int r11 = r5 + 32;     // Catch: Throwable -> L18
        r9.skip(r11);     // Catch: Throwable -> L18
        r10.skip(r11 + r6);     // Catch: Throwable -> L18
        ?? r1 = new k90();     // Catch: Throwable -> L18
        r8 = r1.a(r8);     // Catch: Throwable -> L18
        r9 = r1.a(r9);     // Catch: Throwable -> L18
        r10 = r1.a(r10);     // Catch: Throwable -> L18
        byte[] r12 = new byte[r7];     // Catch: Throwable -> L18
        int r13 = 0;
        int r14 = 0;
    L10:
        if (r13 >= r7) goto L22;
        int r15 = vr1.E(r8);     // Catch: Throwable -> L18
        int r19 = vr1.E(r8);     // Catch: Throwable -> L18
        int r110 = vr1.E(r8);     // Catch: Throwable -> L18
        H(r9, r12, r13, r15);     // Catch: Throwable -> L18
        int r111 = 0;
    L12:
        if (r111 >= r15) goto L21;
        int r112 = r14 + r111;     // Catch: Throwable -> L18
        if (r112 < 0) goto L20;
        if (r112 >= r16.length) goto L20;
        int r113 = r13 + r111;     // Catch: Throwable -> L18
        r12[r113] = (byte) (r12[r113] + r16[r112]);     // Catch: Throwable -> L18
    L20:
        r111 = r111 + 1;     // Catch: Throwable -> L18
        goto L12
    L21:
        int r20 = r13 + r15;     // Catch: Throwable -> L18
        H(r10, r12, r20, r19);     // Catch: Throwable -> L18
        r13 = r20 + r19;     // Catch: Throwable -> L18
        r14 = (r14 + r15) + r110;     // Catch: Throwable -> L18
        goto L10
    L22:
        r18.write(r12);     // Catch: Throwable -> L18
        r8.close();
        r9.close();
        r10.close();
        return;
    L18:
        th = move-exception;
        r8.close();
        r9.close();
        r10.close();
        throw th;
    L28:
        throw new InvalidHeaderException(r7, "output file length");
    L30:
        throw new InvalidHeaderException(r6, "diff block length");
    L32:
        throw new InvalidHeaderException(r5, "control block length");
    L34:
        throw new InvalidHeaderException("Header missing magic number");
    }

    public static void H(i90 r0, byte[] r1, int r2, int r3) {
        if (r3 == 0) goto L9;
        int r4 = r0.read(r1, r2, r3);
        if (r4 < r3) goto L7;
        return;
    L7:
        mj0.i(xa3.e(r3, r4, "Corrupt patch; bytes expected = ", " bytes read = "));
        return;
    }

    public static final Object I(Object r1) {
        if ((r1 instanceof a70) == true) goto L5;
        return r1;
    L5:
        return kb4.o(((a70) r1).a);
    }

    public static final void L(float[] r19, Matrix r20) {
        r20.getValues(r19);
        float r2 = r19[0];
        float r4 = r19[1];
        float r6 = r19[2];
        float r8 = r19[3];
        float r10 = r19[4];
        float r12 = r19[5];
        float r14 = r19[6];
        float r16 = r19[7];
        float r18 = r19[8];
        r19[0] = r2;
        r19[1] = r8;
        r19[2] = 0.0f;
        r19[3] = r14;
        r19[4] = r4;
        r19[5] = r10;
        r19[6] = 0.0f;
        r19[7] = r16;
        r19[8] = 0.0f;
        r19[9] = 0.0f;
        r19[10] = 1.0f;
        r19[11] = 0.0f;
        r19[12] = r6;
        r19[13] = r12;
        r19[14] = 0.0f;
        r19[15] = r18;
    }

    public static void M(h00 r2) {
        int r0 = r2.i(6);
        if (r0 < 2) goto L9;
        if (r0 > 42) goto L9;
        r2.t(r0 * 8);
        return;
    L9:
        throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", new Object[]{Integer.valueOf(r0)}));
    }

    public static ArrayList N(Collection r2, eg1 r3) {
        ArrayList r0 = new ArrayList(r2.size());
        Iterator r4 = r2.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        r0.add((Bundle) r3.mo77apply(r4.next()));
        goto L4
    L6:
        return r0;
    }

    public static p2 O(ic2 r1, eg1 r2) {
        p2 r0 = new p2();
        r1.getClass();
        r0.u = r1;
        r0.v = r2;
        r1.f(r0, gq0.n);
        return r0;
    }

    public static AbstractList P(eg1 r1, List r2) {
        if ((r2 instanceof RandomAccess) == false) goto L7;
        return new vc2(r1, r2);
    L7:
        return new wc2(r1, r2);
    }

    public static String S(String r10, Object... r11) {
        int r1 = 0;
        int r2 = 0;
    L3:
        int r0 = r11.length;
        if (r2 >= r0) goto L13;
        Object r3 = r11[r2];
        if (r3 != null) goto L29;
        String r4 = "null";
    L12:
        r11[r2] = r4;
        r2 = r2 + 1;
        goto L3
    L29:
        r4 = r3.toString();     // Catch: Exception -> L10
    L10:
        e = move-exception;
        String r5 = b11.o(r3.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(r3)));
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(r5), e);
        r4 = f34.h("<", r5, " threw ", e.getClass().getName(), ">");
        goto L12
    L13:
        StringBuilder r6 = new StringBuilder(r10.length() + (r0 * 16));
        int r7 = 0;
    L14:
        int r8 = r11.length;
        if (r1 >= r8) goto L20;
        int r9 = r10.indexOf("%s", r7);
        if (r9 == (-1)) goto L20;
        r6.append(r10, r7, r9);
        r6.append(r11[r1]);
        r1 = r1 + 1;
        r7 = r9 + 2;
    L20:
        r6.append(r10, r7, r10.length());
        if (r1 >= r8) goto L28;
        r6.append(" [");
        int r12 = r1 + 1;
        r6.append(r11[r1]);
    L24:
        if (r12 >= r11.length) goto L26;
        r6.append(", ");
        r6.append(r11[r12]);
        r12 = r12 + 1;
        goto L24
    L26:
        r6.append(']');
    L28:
        return r6.toString();
    }

    public static final i94 a(c72 r8, boolean r9) {
        cx2 r0 = (cx2) r8.Q.g;
        eo0 r2 = null;
        if ((r0.q & 8) == 0) goto L36;
    L4:
        if (r0 == null) goto L36;
        if ((r0.p & 8) == 0) goto L34;
        cx2 r1 = r0;
        f13 r3 = null;
    L8:
        if (r1 == null) goto L34;
        if ((r1 instanceof g94) == true) goto L11;
        if ((r1.p & 8) == 0) goto L32;
        if ((r1 instanceof fo0) == false) goto L32;
        cx2 r4 = ((fo0) r1).C;
        int r5 = 0;
    L18:
        if (r4 == null) goto L30;
        if ((r4.p & 8) == 0) goto L29;
        r5 = r5 + 1;
        if (r5 != 1) goto L24;
        r1 = r4;
        goto L29
    L24:
        if (r3 != null) goto L26;
        r3 = new f13(new cx2[16]);
    L26:
        if (r1 == null) goto L28;
        r3.b(r1);
        r1 = null;
    L28:
        r3.b(r4);
    L29:
        r4 = r4.s;
        goto L18
    L30:
        if (r5 == 1) goto L8;
    L32:
        r1 = j51.c(r3);
        goto L8
    L11:
        r2 = r1;
    L34:
        if ((r0.q & 8) == 0) goto L36;
        r0 = r0.s;
    L36:
        r2.getClass();
        cx2 r6 = ((cx2) ((g94) r2)).n;
        e94 r7 = r8.v();
        if (r7 != null) goto L40;
        r7 = new e94();
    L40:
        return new i94(r6, r9, r8, r7);
    }

    public static void b(ic2 r2, kg1 r3, Executor r4) {
        r2.f(new lg1(0, r2, r3), r4);
    }

    public static void c(Activity r5) {
        r5.getClass();
        WebView r0 = g;
        if (r0 != null) goto L6;
        return;
    L6:
        if ((r5.getResources().getConfiguration().uiMode & 48) == 32) goto L8;
        boolean r1 = true;
    L9:
        int r6 = g12.s(r5, R.attr.colorSurface, -16777216);
        r0.setBackgroundColor(r6);
        r0.evaluateJavascript("window.hmApplyTheme && window.hmApplyTheme(" + r1 + ", '" + String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(r6 & 16777215)}, 1)) + "');", null);
        return;
    L8:
        r1 = false;
        goto L9
    }

    public static gy3 f(eg1 r3, List r4) {
        uw1 r0 = yw1.j();
        int r1 = 0;
    L4:
        if (r1 >= r4.size()) goto L7;
        Bundle r2 = (Bundle) r4.get(r1);
        r2.getClass();
        r0.c(r3.mo77apply(r2));
        r1 = r1 + 1;
        goto L4
    L7:
        return r0.f();
    }

    public static void g(int r2, be3 r3) {
        r3.K(7);
        byte[] r4 = r3.a;
        r4[0] = -84;
        r4[1] = 64;
        r4[2] = -1;
        r4[3] = -1;
        r4[4] = (byte) ((r2 >> 16) & 255);
        r4[5] = (byte) ((r2 >> 8) & 255);
        r4[6] = (byte) (r2 & 255);
    }

    public static Object j(Future r1) {
        if (r1.isDone() == false) goto L14;
        boolean r0 = false;
    L16:
        Object r2 = r1.get();     // Catch: Throwable -> L9 InterruptedException -> L13
    L6:
        if (r0 == false) goto L8;
        Thread.currentThread().interrupt();
    L8:
        return r2;
    L13:
        r0 = true;
    L9:
        th = move-exception;
        if (r0 == false) goto L12;
        Thread.currentThread().interrupt();
    L12:
        throw th;
    L14:
        kf2.o(gh0.s("Future was expected to be done: %s", new Object[]{r1}));
        return null;
    }

    public static Object l(String r2, Bundle r3) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        Parcelable r4 = r3.getParcelable(r2);
        if (o5.class.isInstance(r4) == false) goto L9;
        return r4;
    L9:
        return null;
    L5:
        return q3.b(r2, r3);
    }

    public static final int n(KeyEvent r1) {
        int r2 = r1.getAction();
        if (r2 != 0) goto L5;
        return 2;
    L5:
        if (r2 == 1) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static String q(long r2) {
        return a35.b("yMMMd", Locale.getDefault()).format(new Date(r2));
    }

    public static boolean s(Uri r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if ("content".equals(r2.getScheme()) == true) goto L6;
        return false;
    L6:
        if ("media".equals(r2.getAuthority()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public static boolean t() {
        ConnectivityManager r0 = (ConnectivityManager) App.a().getSystemService("connectivity");
        if (r0 == null) goto L15;
        Network r2 = r0.getActiveNetwork();
        if (r2 == null) goto L15;
        NetworkCapabilities r1 = r0.getNetworkCapabilities(r2);
        if (r1 == null) goto L15;
        if (r1.hasCapability(12) == false) goto L15;
        if (r1.hasCapability(16) == false) goto L15;
        return false;
    L15:
        return true;
    }

    public abstract void A(View r1, int r2, int r3);

    public abstract void B(View r1, float r2, float r3);

    public abstract void J(boolean r1);

    public abstract void K(boolean r1);

    public abstract boolean Q(View r1, int r2);

    public abstract TransformationMethod R(TransformationMethod r1);

    public abstract int d(View r1, int r2);

    public abstract int e(View r1, int r2);

    public abstract Method h(Class r1, Field r2);

    public abstract Constructor i(Class r1);

    public abstract InputFilter[] k(InputFilter[] r1);

    public abstract String[] m(Class r1);

    public int o(View r1) {
        return 0;
    }

    public int p() {
        return 0;
    }

    public abstract boolean r();

    public abstract boolean u(Class r1);

    public void v(int r1, int r2) {
    }

    public void w() {
    }

    public abstract Rect x();

    public void y(View r1, int r2) {
    }

    public abstract void z(int r1);
}
