package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au0 {
    public static final byte[] A = null;
    public static final byte[] B = null;
    public static final byte[] C = null;
    public static final byte[] D = null;
    public static final Object E = null;
    public static volatile jh5 F;
    public static om1 n;
    public static tk4 o;
    public static File p;
    public static File q;
    public static se4 r;
    public static se4 s;
    public static lt0 t;
    public static eu0 u;
    public static final float[] v = null;
    public static b24 w;
    public static final byte[] x = null;
    public static final byte[] y = null;
    public static final byte[] z = null;

    static {
        v = new float[91];
        x = new byte[]{48, 49, 53, 0};
        y = new byte[]{48, 49, 48, 0};
        z = new byte[]{48, 48, 57, 0};
        A = new byte[]{48, 48, 53, 0};
        B = new byte[]{48, 48, 49, 0};
        C = new byte[]{48, 48, 49, 0};
        D = new byte[]{48, 48, 50, 0};
        E = new Object();
    }

    public au0() {
    }

    public static final ef2 A(ef2 r2) {
        c72 r3 = r2.H.H;
    L3:
        c72 r0 = r3.t();
        c72 r1 = null;
        if (r0 == null) goto L6;
        c72 r4 = r0.u;
    L7:
        if (r4 == null) goto L12;
        c72 r5 = r3.t();
        if (r5 == null) goto L11;
        r1 = r5.u;
    L11:
        r1.getClass();
        c72 r6 = r3.t();
        r6.getClass();
        r3 = r6.u;
        r3.getClass();
        goto L3
    L12:
        ef2 r7 = ((f63) r3.Q.e).y0();
        r7.getClass();
        return r7;
    L6:
        r4 = null;
        goto L7
    }

    public static synchronized se4 B(Context r8) {
        monitor-enter(au0.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (s != null) goto L9;
        s = new se4(new File(C(r8), "streaming_cache"), new d92(ud3.F() * 1048576), s(r8));     // Catch: Throwable -> L7
    L9:
        se4 r9 = s;     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r9;
    }

    public static synchronized File C(Context r5) {
        monitor-enter(au0.class);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (p == null) goto L7;
    L20:
        File r6 = p;     // Catch: Throwable -> L13
        monitor-exit(au0.class);
        return r6;
    L7:
        if (ud3.G() != 0) goto L27;
        File r1 = r5.getExternalFilesDirs(null)[0];     // Catch: Throwable -> L13
        p = r1;     // Catch: Throwable -> L13
        if (r1 != null) goto L11;
    L15:
        p = r5.getFilesDir();     // Catch: Throwable -> L13
        goto L20
    L11:
        if (r1.canWrite() == true) goto L20;
    L27:
        p = r5.getExternalFilesDirs(null)[1];     // Catch: Throwable -> L13 Exception -> L19
    L19:
        p = r5.getExternalFilesDirs(null)[0];     // Catch: Throwable -> L13
        ud3.B0(0);     // Catch: Throwable -> L13
        goto L20
    }

    public static synchronized se4 D(Context r1) {
        monitor-enter(au0.class);
        se4 r2 = B(r1);     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r2;
    L7:
        th = move-exception;
        throw th;
    }

    public static synchronized kx E(MediaService r3) {
        monitor-enter(au0.class);
        kx r4 = d(new rf2(r3, x()), u(r3));     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r4;
    L7:
        th = move-exception;
        throw th;
    }

    public static final dx2 F(dx2 r1, if1 r2) {
        return r1.c(new et(r2));
    }

    public static dx2 G(dx2 r11, ac4 r12, int r13) {
        if ((r13 & 4) == 0) goto L6;
        float r0 = 1.0f;
    L5:
        float r2 = r0;
        long r3 = tw4.a;
        if ((r13 & 2048) == 0) goto L10;
        r12 = kb4.b;
    L10:
        long r6 = wj1.a;
        return r11.c(new tj1(r2, r3, r12, r6, r6, m62.a));
    L6:
        r0 = 0.5f;
        goto L5
    }

    public static boolean J() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static synchronized void K(File r6, ArrayList r7) {
        monitor-enter(au0.class);
    L15:
        th = move-exception;
        throw th;
    L5:
        if (r6.isDirectory() == false) goto L21;
        File[] r8 = r6.listFiles();     // Catch: Throwable -> L15
        if (r8 == null) goto L21;
        int r1 = r8.length;     // Catch: Throwable -> L15
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L21;
        File r3 = r8[r2];     // Catch: Throwable -> L15
        if (r3.isFile() == false) goto L18;
        if (r3.getName().toLowerCase().endsWith(".exo") == false) goto L18;
        r7.add(r3);     // Catch: Throwable -> L15
    L20:
        r2 = r2 + 1;
    L18:
        if (r3.isDirectory() == false) goto L20;
        K(r3, r7);     // Catch: Throwable -> L15
    L21:
        monitor-exit(au0.class);
    }

    public static go4 L(go4 r1) {
        if ((r1 instanceof io4) == false) goto L5;
        return r1;
    L5:
        if ((r1 instanceof ho4) == false) goto L8;
        return r1;
    L8:
        if ((r1 instanceof Serializable) == false) goto L12;
        return new ho4(r1);
    L12:
        return new io4(r1);
    }

    public static ix O(tl1 r26) {
        tl1 r0 = r26;
        r0.getClass();
        int r1 = r0.size();
        int r6 = 0;
        boolean r7 = true;
        String r8 = null;
        boolean r9 = false;
        boolean r10 = false;
        int r11 = -1;
        int r12 = -1;
        boolean r13 = false;
        boolean r14 = false;
        boolean r15 = false;
        int r16 = -1;
        int r17 = -1;
        boolean r18 = false;
        boolean r19 = false;
        boolean r20 = false;
    L3:
        if (r6 >= r1) goto L91;
        String r2 = r0.b(r6);
        String r4 = r0.e(r6);
        if (r2.equalsIgnoreCase("Cache-Control") == false) goto L10;
        if (r8 == null) goto L8;
    L7:
        r7 = false;
    L12:
        int r3 = 0;
    L14:
        if (r3 >= r4.length()) goto L90;
        int r5 = r4.length();
        int r21 = r3;
    L16:
        if (r21 >= r5) goto L21;
        int r23 = r1;
        if (qm4.n0("=,;", r4.charAt(r21)) == true) goto L22;
        r21 = r21 + 1;
        r1 = r23;
    L22:
        String r22 = qm4.K0(r4.substring(r3, r21)).toString();
        if (r21 != r4.length()) goto L25;
    L51:
        r3 = r21 + 1;
        String r24 = null;
    L53:
        if ("no-cache".equalsIgnoreCase(r22) == false) goto L57;
        r9 = true;
    L55:
        r1 = r23;
        goto L14
    L57:
        if ("no-store".equalsIgnoreCase(r22) == false) goto L60;
        r10 = true;
        goto L55
    L60:
        if ("max-age".equalsIgnoreCase(r22) == false) goto L64;
        r11 = xe5.o(-1, r24);
        goto L55
    L64:
        if ("s-maxage".equalsIgnoreCase(r22) == false) goto L67;
        r12 = xe5.o(-1, r24);
        goto L55
    L67:
        if ("private".equalsIgnoreCase(r22) == false) goto L70;
        r13 = true;
        goto L55
    L70:
        if ("public".equalsIgnoreCase(r22) == false) goto L73;
        r14 = true;
        goto L55
    L73:
        if ("must-revalidate".equalsIgnoreCase(r22) == false) goto L76;
        r15 = true;
        goto L55
    L76:
        if ("max-stale".equalsIgnoreCase(r22) == false) goto L79;
        r16 = xe5.o(Integer.MAX_VALUE, r24);
        goto L55
    L79:
        if ("min-fresh".equalsIgnoreCase(r22) == false) goto L82;
        r17 = xe5.o(-1, r24);
        goto L55
    L82:
        if ("only-if-cached".equalsIgnoreCase(r22) == false) goto L85;
        r18 = true;
        goto L55
    L85:
        if ("no-transform".equalsIgnoreCase(r22) == false) goto L88;
        r19 = true;
        goto L55
    L88:
        if ("immutable".equalsIgnoreCase(r22) == false) goto L55;
        r20 = true;
        goto L55
    L25:
        if (r4.charAt(r21) == ',') goto L51;
        if (r4.charAt(r21) == ';') goto L51;
        int r25 = r21 + 1;
        byte[] r27 = xe5.a;
        int r28 = r4.length();
    L30:
        if (r25 >= r28) goto L37;
        char r29 = r4.charAt(r25);
        if (r29 == ' ') goto L36;
        if (r29 == '\t') goto L36;
    L39:
        if (r25 < r4.length()) goto L41;
    L43:
        int r30 = r4.length();
        int r31 = r25;
    L44:
        if (r31 >= r30) goto L49;
        int r210 = r30;
        if (qm4.n0(",;", r4.charAt(r31)) == true) goto L50;
        r31 = r31 + 1;
        r30 = r210;
    L50:
        int r211 = r31;
        r24 = qm4.K0(r4.substring(r25, r31)).toString();
        r3 = r211;
        goto L53
    L49:
        r31 = r4.length();
        goto L50
    L41:
        if (r4.charAt(r25) != '\"') goto L43;
        int r32 = r25 + 1;
        int r33 = qm4.r0(r4, '\"', r32, 4);
        r24 = r4.substring(r32, r33);
        r3 = r33 + 1;
    L36:
        r25 = r25 + 1;
        goto L30
    L37:
        r25 = r4.length();
        goto L39
    L21:
        r23 = r1;
        r21 = r4.length();
    L90:
        r6 = r6 + 1;
        r0 = r26;
        r1 = r1;
        goto L3
    L8:
        r8 = r4;
        goto L12
    L10:
        if (r2.equalsIgnoreCase("Pragma") == false) goto L90;
    L91:
        if (r7 == true) goto L93;
        String r212 = null;
    L95:
        return new ix(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r212);
    L93:
        r212 = r8;
        goto L95
    }

    public static long P(be3 r7, int r8, int r9) {
        r7.N(r8);
        if (r7.a() >= 5) goto L5;
        return -9223372036854775807L;
    L5:
        int r10 = r7.m();
        if ((8388608 & r10) == 0) goto L9;
        return -9223372036854775807L;
    L9:
        if (((2096896 & r10) >> 8) == r9) goto L12;
        return -9223372036854775807L;
    L12:
        if ((r10 & 32) != 0) goto L14;
    L21:
        return -9223372036854775807L;
    L14:
        if (r7.A() < 7) goto L21;
        if (r7.a() < 7) goto L21;
        if ((r7.A() & 16) != 16) goto L21;
        byte[] r0 = new byte[6];
        r7.k(r0, 0, 6);
        return (((((((long) r0[0]) & 255) << 25) | ((((long) r0[1]) & 255) << 17)) | ((((long) r0[2]) & 255) << 9)) | ((((long) r0[3]) & 255) << 1)) | ((((long) r0[4]) & 255) >> 7);
    }

    public static void Q(TextInputLayout r5, CheckableImageButton r6, ColorStateList r7) {
        Drawable r0 = r6.getDrawable();
        if (r6.getDrawable() == null) goto L10;
        if (r7 != null) goto L6;
        return;
    L6:
        if (r7.isStateful() == false) goto L12;
        int[] r8 = r5.getDrawableState();
        int[] r1 = r6.getDrawableState();
        int r2 = r8.length;
        int[] r9 = Arrays.copyOf(r8, r8.length + r1.length);
        System.arraycopy(r1, 0, r9, r2, r1.length);
        int r10 = r7.getColorForState(r9, r7.getDefaultColor());
        Drawable r11 = r0.mutate();
        r11.setTintList(ColorStateList.valueOf(r10));
        r6.setImageDrawable(r11);
        return;
    L12:
        return;
    }

    public static void R(CheckableImageButton r3, View.OnLongClickListener r4) {
        WeakHashMap r0 = j65.a;
        boolean r1 = r3.hasOnClickListeners();
        boolean r2 = false;
        int r5 = 1;
        if (r4 == null) goto L5;
        boolean r6 = true;
    L6:
        if (r1 == true) goto L8;
        if (r6 == true) goto L8;
    L9:
        r3.setFocusable(r2);
        r3.setClickable(r1);
        r3.setPressable(r1);
        r3.setLongClickable(r6);
        if (r2 == true) goto L13;
        r5 = 2;
    L13:
        r3.setImportantForAccessibility(r5);
        return;
    L8:
        r2 = true;
        goto L9
    L5:
        r6 = false;
        goto L6
    }

    public static ck4 S(int r2) {
        Float r0 = Float.valueOf(1.0f);
        if ((r2 & 2) == 0) goto L5;
        float r1 = 1500.0f;
    L7:
        if ((r2 & 4) == 0) goto L10;
        r0 = null;
    L10:
        return new ck4(r1, r0);
    L5:
        r1 = 400.0f;
        goto L7
    }

    public static yy4 T(int r0, ry0 r1, int r2) {
        if ((r2 & 4) == 0) goto L6;
        r1 = sy0.a;
    L6:
        return new yy4(r0, r1);
    }

    public static void U(ArrayList r5, int r6, long r7) {
        int r0 = r5.size();
        if (1 <= r0) goto L5;
    L32:
        kf2.n("Failed requirement.");
        return;
    L5:
        if (r0 >= 501) goto L32;
        if (r6 >= 0) goto L8;
    L30:
        kf2.n("Failed requirement.");
        return;
    L8:
        if (r6 >= r5.size()) goto L30;
        if (r7 >= 0) goto L12;
        kf2.n("Failed requirement.");
        return;
    L12:
        if (r5.isEmpty() == true) goto L24;
        int r8 = r5.size();
        int r9 = 0;
    L15:
        if (r9 >= r8) goto L24;
        Object r10 = r5.get(r9);
        r9 = r9 + 1;
        int r11 = ((String) r10).length();
        if (1 > r11) goto L21;
        if (r11 < 513) goto L15;
    L21:
        kf2.n("Failed requirement.");
        return;
    L24:
        if (q40.t0(r5).size() != r5.size()) goto L26;
        return;
    L26:
        kf2.n("Failed requirement.");
    }

    public static final Bundle V(String r2) {
        r2.getClass();
        Bundle r0 = new Bundle();
        r0.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", r2);
        r0.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        r0.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        r0.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return r0;
    }

    public static ArrayList a(List r4) {
        r4.getClass();
        ArrayList r0 = new ArrayList();
        Iterator r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L8;
        Object r1 = r5.next();
        if (((pr3) r1) == pr3.p) goto L4;
        r0.add(r1);
        goto L4
    L8:
        ArrayList r6 = new ArrayList(r40.k0(r0, 10));
        int r2 = r0.size();
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L11;
        Object r7 = r0.get(r3);
        r3 = r3 + 1;
        r6.add(((pr3) r7).n);
        goto L9
    L11:
        return r6;
    }

    public static void b(TextInputLayout r5, CheckableImageButton r6, ColorStateList r7, PorterDuff.Mode r8) {
        Drawable r0 = r6.getDrawable();
        if (r0 == null) goto L13;
        r0 = r0.mutate();
        if (r7 != null) goto L7;
    L9:
        r0.setTintList(r7);
    L10:
        if (r8 == null) goto L13;
        r0.setTintMode(r8);
        goto L13
    L7:
        if (r7.isStateful() == false) goto L9;
        int[] r9 = r5.getDrawableState();
        int[] r1 = r6.getDrawableState();
        int r2 = r9.length;
        int[] r10 = Arrays.copyOf(r9, r9.length + r1.length);
        System.arraycopy(r1, 0, r10, r2, r1.length);
        r0.setTintList(ColorStateList.valueOf(r7.getColorForState(r10, r7.getDefaultColor())));
    L13:
        if (r6.getDrawable() == r0) goto L16;
        r6.setImageDrawable(r0);
        return;
    }

    public static kx d(bi0 r1, se4 r2) {
        kx r0 = new kx();
        r0.n = r2;
        r0.r = r1;
        r0.q = true;
        r0.s = 2;
        return r0;
    }

    public static int f(int r4, Context r5, String r6) {
        if (r6 != null) goto L5;
        return 1;
    L5:
        String[] r7 = r5.getPackageManager().getPackagesForUid(r4);
        if (r7 != null) goto L8;
        return 2;
    L8:
        if (r7.length == 0) goto L21;
        int r8 = r7.length;
        int r2 = 0;
    L11:
        if (r2 >= r8) goto L16;
        if (r7[r2].equals(r6) == true) goto L14;
        r2 = r2 + 1;
        goto L11
    L14:
        return 0;
    L16:
        return 1;
    L21:
        return 2;
    }

    public static byte[] g(List r5) {
        r5.getClass();
        tv r0 = new tv();
        ArrayList r6 = a(r5);
        int r1 = r6.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        Object r3 = r6.get(r2);
        r2 = r2 + 1;
        String r4 = (String) r3;
        r0.Y(r4.length());
        r0.d0(r4);
        goto L3
    L6:
        return r0.F(r0.o);
    }

    public static ImageView.ScaleType h(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 5) goto L18;
        if (r1 == 6) goto L16;
        return ImageView.ScaleType.CENTER;
    L16:
        return ImageView.ScaleType.CENTER_INSIDE;
    L18:
        return ImageView.ScaleType.CENTER_CROP;
    L20:
        return ImageView.ScaleType.FIT_END;
    L22:
        return ImageView.ScaleType.FIT_CENTER;
    L24:
        return ImageView.ScaleType.FIT_START;
    L26:
        return ImageView.ScaleType.FIT_XY;
    }

    public static final Object j(long r3, wd0 r5) {
        if (r3 <= 0) goto L12;
        cz r0 = new cz(1, ya4.x(r5));
        r0.u();
        if (r3 >= Long.MAX_VALUE) goto L8;
        t(r0.r).H(r3, r0);
    L8:
        Object r4 = r0.q();
        if (r4 != xe0.n) goto L12;
        return r4;
    L12:
        return j15.a;
    }

    public static void k(ju1 r0) {
        if (r0 == null) goto L8;
        r0.c();     // Catch: RemoteException -> L5
        return;
    L9:
        return;
    }

    public static void l(Context r8, List r9, final String r10, final String r11, final boolean r12, final IntConsumer r13) {
        final LinkedHashMap r1 = new LinkedHashMap();
        Iterator r14 = r9.iterator();
    L4:
        if (r14.hasNext() == false) goto L6;
        Child r0 = (Child) r14.next();
        r1.putIfAbsent(r0.getId(), r0);
        goto L4
    L6:
        final Context r2 = r8.getApplicationContext();
        final Handler r6 = new Handler(Looper.getMainLooper());
        if (ud3.o() != null) goto L15;
        eu0 r15 = w(r8);
        List r16 = (List) r1.values().stream().filter(new tj(2, r15)).collect(Collectors.toList());
        int r17 = r15.a(gi1.H(r16), (List) r16.stream().map(new xt0(r10, r11)).collect(Collectors.toList()), r12);
        if (r17 == 0) goto L11;
    L13:
        r13.accept(r17);
        return;
    L11:
        if (r16.isEmpty() == true) goto L13;
        r17 = -1;
        goto L13
    L15:
        new Thread(new yt0(r1, r2, r10, r11, r12, r6, r13)).start();
    }

    public static synchronized void m(Context r8) {
        monitor-enter(au0.class);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (t != null) goto L12;
        t = new lt0(r8, s(r8), u(r8), x(), Executors.newFixedThreadPool(6));     // Catch: Throwable -> L9
        App.b().getClass();     // Catch: Throwable -> L9
        if (App.c().getBoolean("download_wifi_only", false) == false) goto L11;
        t.d(new h04(2));     // Catch: Throwable -> L9
    L11:
        u = new eu0(r8, x(), t);     // Catch: Throwable -> L9
    L12:
        monitor-exit(au0.class);
    }

    public static boolean n(Object r2, Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
    L9:
        return false;
    L7:
        if (r2.equals(r3) == false) goto L9;
        return true;
    }

    public static final int o(View r5, int r6) {
        int r1 = 0;
        int r2 = Integer.MAX_VALUE;
        Object r3 = null;
    L3:
        if (r5 == null) goto L16;
        Object r4 = r5.getTag(r6);
        if (r4 == null) goto L12;
        if (r3 != null) goto L9;
        r3 = r4;
    L11:
        r2 = r1;
        goto L12
    L9:
        if (r4.equals(r3) == true) goto L11;
    L12:
        r1 = r1 + 1;
        Object r7 = z(r5);
        if ((r7 instanceof View) == true) goto L14;
        r5 = null;
        goto L3
    L14:
        r5 = (View) r7;
    L16:
        return r2;
    }

    public static final View p(View r6) {
        if (r6.isAttachedToWindow() == true) goto L5;
        return r6;
    L5:
        int r0 = Math.min(o(r6, R.id.view_tree_lifecycle_owner), o(r6, R.id.view_tree_saved_state_registry_owner));
        View r2 = r6;
        int r3 = 0;
        View r1 = r2;
    L6:
        if (r6 == null) goto L19;
        if (r3 == r0) goto L9;
        if (q(r6) != null) goto L13;
        r3 = r3 + 1;
        Object r4 = z(r6);
        if ((r4 instanceof View) == false) goto L17;
        View r5 = (View) r4;
    L18:
        View r7 = r2;
        r2 = r6;
        r6 = r5;
        r1 = r7;
        goto L6
    L17:
        r5 = null;
    L13:
        return r6;
    L9:
        if ((r6.getParent() instanceof ViewGroup) == true) goto L13;
        return r2;
    L19:
        return r1;
    }

    public static final h80 q(View r2) {
        Object r3 = r2.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if ((r3 instanceof WeakReference) == false) goto L5;
        WeakReference r4 = (WeakReference) r3;
    L6:
        if (r4 != null) goto L8;
        return null;
    L8:
        return (h80) r4.get();
    L5:
        r4 = null;
        goto L6
    }

    public static String r(ArrayList r6) {
        int r0 = r6.size();
        boolean r1 = false;
        String r3 = null;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L19;
        Object r4 = r6.get(r2);
        r2 = r2 + 1;
        String r5 = ((xv4) r4).a.g.n;
        if (lw2.l(r5) == true) goto L6;
        if (lw2.i(r5) == true) goto L10;
        if (lw2.j(r5) == false) goto L3;
        if (Objects.equals(r5, "image/heic") == true) goto L15;
        if (Objects.equals(r5, "image/avif") == false) goto L3;
        r3 = "image/avif";
        goto L3
    L15:
        r3 = "image/heif";
        goto L3
    L10:
        r1 = true;
        goto L3
    L6:
        return "video/mp4";
    L19:
        if (r1 == false) goto L22;
        return "audio/mp4";
    L22:
        if (r3 == null) goto L24;
        return r3;
    L24:
        return "application/mp4";
    }

    public static synchronized tk4 s(Context r5) {
        monitor-enter(au0.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (o != null) goto L9;
        o = new tk4(r5.getApplicationContext(), "exoplayer_internal.db", null, 1);     // Catch: Throwable -> L7
    L9:
        tk4 r6 = o;     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r6;
    }

    public static final ao0 t(ne0 r1) {
        le0 r2 = r1.K(fz0.R);
        if ((r2 instanceof ao0) == false) goto L5;
        ao0 r3 = (ao0) r2;
    L6:
        if (r3 == null) goto L8;
        return r3;
    L8:
        return qk0.a;
    L5:
        r3 = null;
        goto L6
    }

    public static synchronized se4 u(Context r4) {
        monitor-enter(au0.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r != null) goto L9;
        r = new se4(new File(v(r4), "downloads"), new y53(), s(r4));     // Catch: Throwable -> L7
    L9:
        se4 r5 = r;     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r5;
    }

    public static synchronized File v(Context r5) {
        monitor-enter(au0.class);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (q != null) goto L23;
        int r1 = ud3.p();     // Catch: Throwable -> L13
        if (r1 != 0) goto L18;
        File r2 = r5.getExternalFilesDirs(null)[0];     // Catch: Throwable -> L13
        q = r2;     // Catch: Throwable -> L13
        if (r2 != null) goto L11;
    L15:
        q = r5.getFilesDir();     // Catch: Throwable -> L13
        goto L23
    L11:
        if (r2.canWrite() == true) goto L23;
    L18:
        if (r1 == 1) goto L30;
        q = r5.getExternalFilesDirs(null)[0];     // Catch: Throwable -> L13
        goto L23
    L30:
        q = r5.getExternalFilesDirs(null)[1];     // Catch: Throwable -> L13 Exception -> L21
    L21:
        q = r5.getExternalFilesDirs(null)[0];     // Catch: Throwable -> L13
        ud3.j0(0);     // Catch: Throwable -> L13
    L23:
        File r6 = q;     // Catch: Throwable -> L13
        monitor-exit(au0.class);
        return r6;
    }

    public static synchronized eu0 w(Context r1) {
        monitor-enter(au0.class);
        m(r1);     // Catch: Throwable -> L7
        eu0 r2 = u;     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r2;
    L7:
        th = move-exception;
        throw th;
    }

    public static synchronized bi0 x() {
        monitor-enter(au0.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (n != null) goto L9;
        CookieManager r1 = new CookieManager();     // Catch: Throwable -> L7
        r1.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);     // Catch: Throwable -> L7
        CookieHandler.setDefault(r1);     // Catch: Throwable -> L7
        bl0 r2 = new bl0(0);     // Catch: Throwable -> L7
        r2.r = lp1.e;     // Catch: Throwable -> L7
        r2.p = true;     // Catch: Throwable -> L7
        n = new om1(1, r2);     // Catch: Throwable -> L7
    L9:
        om1 r3 = n;     // Catch: Throwable -> L7
        monitor-exit(au0.class);
        return r3;
    }

    public static synchronized bl0 y() {
        monitor-enter(au0.class);
        CookieManager r1 = new CookieManager();     // Catch: Throwable -> L14
        r1.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);     // Catch: Throwable -> L14
        CookieHandler.setDefault(r1);     // Catch: Throwable -> L14
        HashMap r2 = new HashMap();     // Catch: Throwable -> L14
        r2.put("Icy-MetaData", "1");     // Catch: Throwable -> L14
        r2.put("User-Agent", "Tempus/1.0");     // Catch: Throwable -> L14
        bl0 r3 = new bl0(0);     // Catch: Throwable -> L14
        r3.p = true;     // Catch: Throwable -> L14
        qr2 r4 = (qr2) r3.q;     // Catch: Throwable -> L14
        monitor-enter(r4);     // Catch: Throwable -> L14
        r4.p = null;     // Catch: Throwable -> L11
        ((HashMap) r4.o).clear();     // Catch: Throwable -> L11
        ((HashMap) r4.o).putAll(r2);     // Catch: Throwable -> L11
        monitor-exit(r4);     // Catch: Throwable -> L14
        monitor-exit(au0.class);
        return r3;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    public static final ViewParent z(View r1) {
        r1.getClass();
        ViewParent r0 = r1.getParent();
        if (r0 == null) goto L5;
        return r0;
    L5:
        Object r2 = r1.getTag(R.id.view_tree_disjoint_parent);
        if ((r2 instanceof ViewParent) == true) goto L8;
        return null;
    L8:
        return (ViewParent) r2;
    }

    public void H(x34 r2, Iterable r3) {
        r2.getClass();
        if (r3 != null) goto L5;
        return;
    L5:
        z34 r4 = r2.U(i());
        Iterator r5 = r3.iterator();     // Catch: Throwable -> L13
    L8:
        if (r5.hasNext() == false) goto L15;
        Object r0 = r5.next();     // Catch: Throwable -> L13
        if (r0 == null) goto L8;
        c(r4, r0);     // Catch: Throwable -> L13
        r4.O();     // Catch: Throwable -> L13
        r4.reset();     // Catch: Throwable -> L13
        goto L8
    L15:
        ud3.e(r4, null);
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        ud3.e(r4, th);
        throw th;
    }

    public void I(x34 r2, Object r3) {
        r2.getClass();
        if (r3 != null) goto L5;
        return;
    L5:
        z34 r4 = r2.U(i());
        c(r4, r3);     // Catch: Throwable -> L9
        r4.O();     // Catch: Throwable -> L9
        ud3.e(r4, null);
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        ud3.e(r4, th);
        throw th;
    }

    public abstract void M(int r1);

    public abstract void N(Typeface r1);

    public abstract void c(z34 r1, Object r2);

    public void e(int r4) {
        new Handler(Looper.getMainLooper()).post(new ul(r4, 5, this));
    }

    public abstract String i();
}
