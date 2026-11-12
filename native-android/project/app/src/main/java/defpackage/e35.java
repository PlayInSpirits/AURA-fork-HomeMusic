package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e35 {
    public static final char[] a = null;
    public static final char[] b = null;
    public static volatile Handler c = null;
    public static final char[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final int[] g = null;
    public static final int[] h = null;
    public static final int[] i = null;
    public static final int[] j = null;
    public static final int[] k = null;
    public static final int[] l = null;
    public static final int[] m = null;
    public static final long n = Long.MIN_VALUE;
    public static final /* synthetic */ int o = 0;

    static {
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        b = new char[64];
        d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        e = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        f = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        g = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
        h = new int[]{8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
        i = new int[]{5, 8, 10, 12};
        j = new int[]{6, 9, 12, 15};
        k = new int[]{2, 4, 6, 8};
        l = new int[]{9, 11, 13, 16};
        m = new int[]{5, 8, 10, 12};
    }

    public static h00 A(byte[] r12) {
        byte r1 = r12[0];
        if (r1 == 127) goto L38;
        if (r1 == 100) goto L38;
        if (r1 == 64) goto L38;
        if (r1 == 113) goto L38;
        byte[] r13 = Arrays.copyOf(r12, r12.length);
        byte r2 = r13[0];
        if (r2 != (-2)) goto L14;
    L21:
        int r3 = 0;
    L23:
        if (r3 >= (r13.length - 1)) goto L25;
        byte r4 = r13[r3];
        int r5 = r3 + 1;
        r13[r3] = r13[r5];
        r13[r5] = r4;
        r3 = r3 + 2;
    L25:
        h00 r6 = new h00(r13.length, r13);
        if (r13[0] != 31) goto L35;
        h00 r0 = new h00(r13.length, r13);
    L29:
        if (r0.b() < 16) goto L35;
        r0.t(2);
        int r7 = r0.i(14) & 16383;
        int r8 = Math.min(8 - r6.d, 14);
        int r9 = r6.d;
        int r10 = (8 - r9) - r8;
        byte[] r11 = r6.b;
        int r14 = r6.c;
        byte r15 = (byte) (((65280 >> r9) | ((1 << r10) - 1)) & r11[r14]);
        r11[r14] = r15;
        int r16 = 14 - r8;
        r11[r14] = (byte) (r15 | ((r7 >>> r16) << r10));
        int r17 = r14 + 1;
    L31:
        byte[] r18 = r6.b;
        if (r16 <= 8) goto L34;
        r18[r17] = (byte) (r7 >>> (r16 - 8));
        r16 = r16 - 8;
        r17 = r17 + 1;
        goto L31
    L34:
        int r19 = 8 - r16;
        byte r20 = (byte) (r18[r17] & ((1 << r19) - 1));
        r18[r17] = r20;
        r18[r17] = (byte) (((r7 & ((1 << r16) - 1)) << r19) | r20);
        r6.t(14);
        r6.a();
    L35:
        r6.o(r13.length, r13);
        return r6;
    L14:
        if (r2 == (-1)) goto L21;
        if (r2 == 37) goto L21;
        if (r2 == (-14)) goto L21;
        if (r2 != (-24)) goto L25;
    L38:
        return new h00(r12.length, r12);
    }

    public static ArrayList B(Collection r2) {
        ArrayList r0 = new ArrayList(r2.size());
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L8;
        Object r1 = r3.next();
        if (r1 == null) goto L4;
        r0.add(r1);
        goto L4
    L8:
        return r0;
    }

    public static Handler C() {
        if (c != null) goto L16;
        monitor-enter(e35.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (c != null) goto L11;
        c = new Handler(Looper.getMainLooper());     // Catch: Throwable -> L9
    L11:
        monitor-exit(e35.class);     // Catch: Throwable -> L9
    L16:
        return c;
    }

    public static int D(int r0, float r1) {
        return E(Float.floatToIntBits(r1), r0);
    }

    public static int E(int r0, int r1) {
        return (r1 * 31) + r0;
    }

    public static int F(int r0, Object r1) {
        if (r1 != null) goto L4;
        int r2 = 0;
    L6:
        return E(r2, r0);
    L4:
        r2 = r1.hashCode();
        goto L6
    }

    public static final void G(String r5) {
        r5.getClass();
        if (r5.length() <= 0) goto L17;
        int r0 = r5.length();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L16;
        char r2 = r5.charAt(r1);
        if ('!' > r2) goto L11;
        if (r2 >= 127) goto L11;
        r1 = r1 + 1;
    L11:
        StringBuilder r3 = new StringBuilder("Unexpected char 0x");
        ya4.g(16);
        String r4 = Integer.toString(r2, 16);
        r4.getClass();
        if (r4.length() >= 2) goto L14;
        r4 = "0".concat(r4);
    L14:
        r3.append(r4);
        r3.append(" at ");
        r3.append(r1);
        r3.append(" in header name: ");
        r3.append(r5);
        throw new IllegalArgumentException(r3.toString().toString());
    L16:
        return;
    L17:
        kf2.n("name is empty");
    }

    public static final void H(String r5, String r6) {
        r5.getClass();
        r6.getClass();
        int r0 = r5.length();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L21;
        char r2 = r5.charAt(r1);
        if (r2 == '\t') goto L20;
        if (' ' > r2) goto L11;
        if (r2 < 127) goto L20;
    L11:
        StringBuilder r3 = new StringBuilder("Unexpected char 0x");
        ya4.g(16);
        String r4 = Integer.toString(r2, 16);
        r4.getClass();
        if (r4.length() >= 2) goto L14;
        r4 = "0".concat(r4);
    L14:
        r3.append(r4);
        r3.append(" at ");
        r3.append(r1);
        r3.append(" in ");
        r3.append(r6);
        r3.append(" value");
        if (xe5.l(r6) == false) goto L17;
        String r7 = "";
    L18:
        r3.append(r7);
        throw new IllegalArgumentException(r3.toString().toString());
    L17:
        r7 = ": ".concat(r5);
    L20:
        r1 = r1 + 1;
        goto L3
    }

    public static boolean I(int r1, int r2) {
        if (r1 > 0) goto L5;
        if (r1 == Integer.MIN_VALUE) goto L5;
        return false;
    L5:
        if (r2 > 0) goto L10;
        if (r2 == Integer.MIN_VALUE) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }

    public static void J(MediaFormat r1, String r2, int r3) {
        if (r3 == (-1)) goto L6;
        r1.setInteger(r2, r3);
        return;
    }

    public static final String K(String r3) {
        if (r3 == null) goto L5;
        String r4 = qm4.K0(r3).toString();
    L6:
        if (r4 != null) goto L9;
        r4 = "";
    L9:
        if (r4.length() != 0) goto L12;
        return null;
    L12:
        if (xm4.k0(r4, "http://", true) == true) goto L17;
        if (xm4.k0(r4, "https://", true) == true) goto L17;
        r4 = "https://".concat(r4);
    L17:
        return qm4.L0(qm4.H0(r4, '#'), new char[]{'/'});
    L5:
        r4 = null;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static xa1 L(XmlResourceParser r29, Resources r30) {
        TimeUnit r1 = TimeUnit.DAYS;
    L3:
        int r2 = r29.next();
        int r4 = 2;
        if (r2 == 2) goto L7;
        if (r2 != 1) goto L3;
    L7:
        if (r2 != 2) goto L150;
        r29.require(2, null, "font-family");
        if (r29.getName().equals("font-family") == false) goto L147;
        TypedArray r5 = r30.obtainAttributes(Xml.asAttributeSet(r29), mt3.b);
        int r7 = 0;
        String r9 = r5.getString(0);
        String r11 = r5.getString(5);
        String r15 = r5.getString(6);
        String r16 = r5.getString(2);
        int r12 = r5.getResourceId(1, 0);
        int r13 = 3;
        int r14 = r5.getInteger(3, 1);
        int r3 = r5.getInteger(4, SmartPlan.MAX_QUEUE);
        String r6 = r5.getString(7);
        r5.recycle();
        if (r9 == null) goto L103;
        if (r11 == null) goto L103;
        List r10 = P(r30, r12);
        ArrayList r8 = new ArrayList();
    L15:
        if (r29.next() == r13) goto L91;
        if (r29.getEventType() != r4) goto L15;
        if (r29.getName().equals("fallback") == false) goto L89;
        TypedArray r17 = r30.obtainAttributes(Xml.asAttributeSet(r29), mt3.d);
        int r19 = r14;
        int r18 = 3;
        String r110 = r17.getString(r7);     // Catch: Throwable -> L60
        String r111 = r17.getString(1);     // Catch: Throwable -> L60
        String r112 = r17.getString(r4);     // Catch: Throwable -> L60
        if (r110 == null) goto L62;
    L24:
        int r20 = r18;
        if (r29.next() == r20) goto L155;
        T(r29);     // Catch: Throwable -> L29
        r18 = r20;
    L29:
        th = move-exception;
        Throwable r21 = th;
        ?? r22 = r17;
        long r23 = 1;
    L65:
        if (r22 == 0) goto L195;
    L86:
        th = move-exception;
        r21.addSuppressed(th);
        throw r21;
    L67:
        if ((r22 instanceof AutoCloseable) == false) goto L69;
        ((AutoCloseable) r22).close();     // Catch: Throwable -> L86
        throw r21;
    L69:
        if ((r22 instanceof ExecutorService) == false) goto L83;
        ExecutorService r24 = (ExecutorService) r22;     // Catch: Throwable -> L86
        if (r24 == ForkJoinPool.commonPool()) goto L196;
        boolean r0 = r24.isTerminated();     // Catch: Throwable -> L86
        if (r0 == true) goto L197;
        r24.shutdown();     // Catch: Throwable -> L86
        boolean r25 = false;
    L76:
        if (r0 == true) goto L81;
        r0 = r24.awaitTermination(r23, r1);     // Catch: InterruptedException -> L79 Throwable -> L86
    L79:
        if (r25 == true) goto L76;
        r24.shutdownNow();     // Catch: Throwable -> L86
        r25 = true;
        goto L76
    L81:
        if (r25 == false) goto L198;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L86
        throw r21;
    L198:
        throw r21;
    L197:
        throw r21;
    L196:
        throw r21;
    L83:
        r22.recycle();     // Catch: Throwable -> L86
        throw r21;
    L195:
        throw r21;
    L155:
        ?? r26 = r17;
        int r27 = r19;
        r23 = 1;
        pa1 r28 = new pa1(r9, r10, r11, r110, r111, r112);     // Catch: Throwable -> L55
        if ((r26 instanceof AutoCloseable) == false) goto L39;
        ((AutoCloseable) r26).close();
    L54:
        r8.add(r28);
    L90:
        r14 = r27;
        r3 = r3;
        r6 = r6;
        r4 = 2;
        r7 = 0;
        r13 = 3;
        goto L15
    L39:
        if ((r26 instanceof ExecutorService) == false) goto L53;
        ExecutorService r31 = (ExecutorService) r26;
        if (r31 == ForkJoinPool.commonPool()) goto L54;
        boolean r113 = r31.isTerminated();
        if (r113 == true) goto L54;
        r31.shutdown();
        boolean r114 = false;
    L46:
        if (r113 == true) goto L51;
        r113 = r31.awaitTermination(1, r1);     // Catch: InterruptedException -> L49
    L49:
        if (r114 == true) goto L46;
        r31.shutdownNow();
        r114 = true;
        goto L46
    L51:
        if (r114 == false) goto L54;
        Thread.currentThread().interrupt();
        goto L54
    L53:
        r26.recycle();
    L55:
        th = th;
    L56:
        r21 = th;
        r22 = r26;
    L57:
        th = th;
        r26 = r17;
    L59:
        r23 = 1;
        goto L56
    L62:
        r26 = r17;
        r23 = 1;
        throw new XmlPullParserException("query attribute must be set in fallback element");     // Catch: Throwable -> L55
    L60:
        th = th;
        r26 = r17;
        goto L59
    L89:
        r27 = r14;
        T(r29);
        goto L90
    L91:
        int r210 = r3;
        String r211 = r6;
        int r32 = r14;
        if (r8.isEmpty() == true) goto L95;
        return new ab1(r8, r32, r210, r211);
    L95:
        if (r15 == null) goto L101;
        r8.add(new pa1(r9, r10, r11, r15, null, null));
        if (r16 == null) goto L100;
        r8.add(new pa1(r9, r10, r11, r16, null, null));
    L100:
        return new ab1(r8, r32, r210, r211);
    L101:
        kf2.n("The provider font XML requires query attribute or fallback children.");
        return null;
    L103:
        ArrayList r33 = new ArrayList();
    L105:
        if (r29.next() == 3) goto L143;
        if (r29.getEventType() != 2) goto L105;
        if (r29.getName().equals("font") == true) goto L111;
        T(r29);
        goto L105
    L111:
        TypedArray r34 = r30.obtainAttributes(Xml.asAttributeSet(r29), mt3.c);
        int r115 = 8;
        if (r34.hasValue(8) == true) goto L115;
        r115 = 1;
    L115:
        int r212 = r34.getInt(r115, 400);
        if (r34.hasValue(6) == false) goto L119;
        int r35 = 6;
    L121:
        if (1 != r34.getInt(r35, 0)) goto L123;
        boolean r213 = true;
    L124:
        int r36 = 9;
        if (r34.hasValue(9) == true) goto L129;
        r36 = 3;
    L129:
        if (r34.hasValue(7) == false) goto L131;
        int r37 = 7;
    L132:
        String r214 = r34.getString(r37);
        int r215 = r34.getInt(r36, 0);
        if (r34.hasValue(5) == false) goto L135;
        int r38 = 5;
    L136:
        int r216 = r34.getResourceId(r38, 0);
        String r217 = r34.getString(r38);
        r34.recycle();
    L138:
        if (r29.next() == 3) goto L140;
        T(r29);
        goto L138
    L140:
        r33.add(new za1(r212, r215, r216, r217, r214, r213));
        goto L105
    L135:
        r38 = 0;
        goto L136
    L131:
        r37 = 4;
        goto L132
    L123:
        r213 = false;
        goto L124
    L119:
        r35 = 2;
        goto L121
    L143:
        if (r33.isEmpty() == false) goto L146;
        return null;
    L146:
        return new ya1((za1[]) r33.toArray(new za1[0]));
    L147:
        T(r29);
        return null;
    L150:
        throw new XmlPullParserException("No start tag found");
    }

    public static h32 M(l32 r6) {
        boolean r2 = r6.o;
        r6.o = true;
        h32 r0 = fh0.q(r6);     // Catch: Throwable -> L6 OutOfMemoryError -> L8 StackOverflowError -> L11
        r6.o = r2;
        return r0;
    L6:
        th = move-exception;
        r6.o = r2;
        throw th;
    L11:
        e = move-exception;
        throw new JsonParseException("Failed parsing JSON source: " + r6 + " to Json", e);     // Catch: Throwable -> L6
    L8:
        e = move-exception;
        throw new JsonParseException("Failed parsing JSON source: " + r6 + " to Json", e);     // Catch: Throwable -> L6
    }

    public static h32 N(String r2) {
        l32 r3 = new l32(new StringReader(r2));     // Catch: NumberFormatException -> L11 IOException -> L14 MalformedJsonException -> L17
        h32 r0 = M(r3);     // Catch: NumberFormatException -> L11 IOException -> L14 MalformedJsonException -> L17
        r0.getClass();     // Catch: NumberFormatException -> L11 IOException -> L14 MalformedJsonException -> L17
        if ((r0 instanceof i32) == false) goto L6;
    L10:
        return r0;
    L6:
        if (r3.e0() == 10) goto L10;
        throw new JsonSyntaxException("Did not consume the entire document.");     // Catch: NumberFormatException -> L11 IOException -> L14 MalformedJsonException -> L17
    L17:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L14:
        e = move-exception;
        throw new JsonIOException(e);
    L11:
        e = move-exception;
        throw new JsonSyntaxException(e);
    }

    public static int O(h00 r5, int[] r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= 3) goto L8;
        if (r5.h() == false) goto L8;
        r2 = r2 + 1;
        r1 = r1 + 1;
    L8:
        int r3 = 0;
    L9:
        if (r0 >= r2) goto L12;
        r3 = r3 + (1 << r6[r0]);
        r0 = r0 + 1;
        goto L9
    L12:
        return r5.i(r6[r2]) + r3;
    }

    public static List P(Resources r8, int r9) {
        if (r9 == 0) goto L4;
        TypedArray r0 = r8.obtainTypedArray(r9);
    L11:
        th = move-exception;
        r0.recycle();
        throw th;
    L7:
        if (r0.length() != 0) goto L13;
        List r10 = Collections.EMPTY_LIST;     // Catch: Throwable -> L11
        r0.recycle();
        return r10;
    L13:
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        if (r0.getType(0) != 1) goto L25;
        int r11 = 0;
    L17:
        if (r11 >= r0.length()) goto L29;
        int r3 = r0.getResourceId(r11, 0);     // Catch: Throwable -> L11
        if (r3 == 0) goto L24;
        String[] r4 = r8.getStringArray(r3);     // Catch: Throwable -> L11
        ArrayList r5 = new ArrayList();     // Catch: Throwable -> L11
        int r6 = r4.length;     // Catch: Throwable -> L11
        int r7 = 0;
    L21:
        if (r7 >= r6) goto L23;
        r5.add(Base64.decode(r4[r7], 0));     // Catch: Throwable -> L11
        r7 = r7 + 1;     // Catch: Throwable -> L11
        goto L21
    L23:
        r1.add(r5);     // Catch: Throwable -> L11
    L24:
        r11 = r11 + 1;     // Catch: Throwable -> L11
    L29:
        r0.recycle();
        return r1;
    L25:
        String[] r12 = r8.getStringArray(r9);     // Catch: Throwable -> L11
        ArrayList r13 = new ArrayList();     // Catch: Throwable -> L11
        int r14 = r12.length;     // Catch: Throwable -> L11
        int r15 = 0;
    L26:
        if (r15 >= r14) goto L28;
        r13.add(Base64.decode(r12[r15], 0));     // Catch: Throwable -> L11
        r15 = r15 + 1;     // Catch: Throwable -> L11
        goto L26
    L28:
        r1.add(r13);     // Catch: Throwable -> L11
        goto L29
    L4:
        return Collections.EMPTY_LIST;
    }

    public static final String Q() {
        App.b().getClass();
        SharedPreferences r0 = App.c();
        r0.getClass();
        String r1 = K(r0.getString("homemusic_hub_url", null));
        if (r1 != null) goto L8;
        String r2 = K("https://146.103.112.215:8445");
        if (r2 != null) goto L9;
        return "";
    L9:
        return r2;
    L8:
        return r1;
    }

    public static void R(MediaFormat r3, List r4) {
        int r0 = 0;
    L4:
        if (r0 >= r4.size()) goto L6;
        r3.setByteBuffer(f34.f(r0, "csd-"), ByteBuffer.wrap((byte[]) r4.get(r0)));
        r0 = r0 + 1;
        goto L4
    }

    public static void S(View r2, CharSequence r3) {
        if (Build.VERSION.SDK_INT < 26) goto L6;
        hv4.a(r2, r3);
        return;
    L6:
        jv4 r0 = jv4.x;
        if (r0 == null) goto L12;
        if (r0.n != r2) goto L12;
        jv4.b(null);
    L12:
        if (TextUtils.isEmpty(r3) == false) goto L20;
        jv4 r4 = jv4.y;
        if (r4 != null) goto L16;
    L18:
        r2.setOnLongClickListener(null);
        r2.setLongClickable(false);
        r2.setOnHoverListener(null);
        return;
    L16:
        if (r4.n != r2) goto L18;
        r4.a();
        goto L18
    L20:
        new jv4(r2, r3);
    }

    public static void T(XmlPullParser r3) {
        int r0 = 1;
    L3:
        if (r0 <= 0) goto L11;
        int r1 = r3.next();
        if (r1 != 2) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        if (r1 != 3) goto L3;
        r0 = r0 - 1;
        goto L3
    }

    public static final int U(long r1) {
        float[] r0 = s50.a;
        return (int) (x40.a(r1, s50.e) >>> 32);
    }

    public static final long V(int r3) {
        ox0 r0 = ox0.q;
        if (r0.compareTo(r0) > 0) goto L7;
        long r1 = TimeUnit.NANOSECONDS.convert(r3, TimeUnit.SECONDS);
        om0 r4 = mx0.n;
        long r2 = r1 << 1;
        int r5 = nx0.a;
        return r2;
    L7:
        return W(r3, r0);
    }

    public static final long W(long r8, ox0 r10) {
        TimeUnit r0 = r10.n;
        TimeUnit r3 = TimeUnit.NANOSECONDS;
        long r1 = r0.convert(4611686018426999999L, r3);
        if ((-r1) > r8) goto L9;
        if (r8 > r1) goto L9;
        long r9 = r3.convert(r8, r0);
        om0 r11 = mx0.n;
        long r12 = r9 << 1;
        int r13 = nx0.a;
        return r12;
    L9:
        if (r10.compareTo(ox0.p) < 0) goto L55;
        long r2 = Long.signum(r8);
        if (r8 >= (-9223372036854775807L)) goto L13;
        r8 = -9223372036854775807L;
    L13:
        long r14 = Math.abs(r8);
        int r4 = r10.ordinal();
        long r5 = 0;
        if (r4 != 2) goto L16;
        long r6 = 1;
    L31:
        if (r14 != 0) goto L33;
    L32:
        r14 = r5;
    L53:
        return u(r2 * r14);
    L33:
        r5 = 4611686018427387903L;
        if (r14 != 1) goto L40;
        if (r6 > 4611686018427387903L) goto L32;
        r14 = r6;
        goto L53
    L40:
        if (r6 == 1) goto L42;
        int r15 = (128 - Long.numberOfLeadingZeros(r14)) - Long.numberOfLeadingZeros(r6);
        if (r15 >= 63) goto L47;
        r14 = r14 * r6;
        goto L53
    L47:
        if (r15 > 63) goto L32;
        r14 = r14 * r6;
        if (r14 <= 4611686018427387903L) goto L53;
    L42:
        if (r14 <= 4611686018427387903L) goto L53;
    L16:
        if (r4 != 3) goto L18;
        r6 = 1000;
        goto L31
    L18:
        if (r4 != 4) goto L20;
        r6 = 60000;
        goto L31
    L20:
        if (r4 != 5) goto L22;
        r6 = 3600000;
        goto L31
    L22:
        if (r4 != 6) goto L24;
        r6 = 86400000;
        goto L31
    L24:
        mj0.g(r10, "Wrong unit for millisMultiplier: ");
        return 0;
    L55:
        return u(gb.n(TimeUnit.MILLISECONDS.convert(r8, r0), -4611686018427387903L, 4611686018427387903L));
    }

    public static String X(int r1) {
        if (r1 != 0) goto L6;
        return "Clear";
    L6:
        if (r1 != 1) goto L10;
        return "Src";
    L10:
        if (r1 != 2) goto L14;
        return "Dst";
    L14:
        if (r1 != 3) goto L18;
        return "SrcOver";
    L18:
        if (r1 != 4) goto L22;
        return "DstOver";
    L22:
        if (r1 != 5) goto L26;
        return "SrcIn";
    L26:
        if (r1 != 6) goto L30;
        return "DstIn";
    L30:
        if (r1 != 7) goto L34;
        return "SrcOut";
    L34:
        if (r1 != 8) goto L38;
        return "DstOut";
    L38:
        if (r1 != 9) goto L42;
        return "SrcAtop";
    L42:
        if (r1 != 10) goto L46;
        return "DstAtop";
    L46:
        if (r1 != 11) goto L50;
        return "Xor";
    L50:
        if (r1 != 12) goto L54;
        return "Plus";
    L54:
        if (r1 != 13) goto L58;
        return "Modulate";
    L58:
        if (r1 != 14) goto L62;
        return "Screen";
    L62:
        if (r1 != 15) goto L66;
        return "Overlay";
    L66:
        if (r1 != 16) goto L70;
        return "Darken";
    L70:
        if (r1 != 17) goto L74;
        return "Lighten";
    L74:
        if (r1 != 18) goto L78;
        return "ColorDodge";
    L78:
        if (r1 != 19) goto L82;
        return "ColorBurn";
    L82:
        if (r1 != 20) goto L86;
        return "HardLight";
    L86:
        if (r1 != 21) goto L90;
        return "Softlight";
    L90:
        if (r1 != 22) goto L94;
        return "Difference";
    L94:
        if (r1 != 23) goto L98;
        return "Exclusion";
    L98:
        if (r1 != 24) goto L102;
        return "Multiply";
    L102:
        if (r1 != 25) goto L106;
        return "Hue";
    L106:
        if (r1 != 26) goto L110;
        return "Saturation";
    L110:
        if (r1 != 27) goto L114;
        return "Color";
    L114:
        if (r1 != 28) goto L117;
        return "Luminosity";
    L117:
        return "Unknown";
    }

    public static final long a(float r21, float r22, float r23, float r24, p50 r25) {
        float r5 = 1.0f;
        float r6 = 0.0f;
        if (r25.c() == false) goto L36;
        if (r24 >= 0.0f) goto L7;
        float r0 = 0.0f;
    L9:
        if (r0 <= 1.0f) goto L11;
        r0 = 1.0f;
    L11:
        int r1 = ((int) ((r0 * 255.0f) + 0.5f)) << 24;
        if (r21 >= 0.0f) goto L14;
        float r7 = 0.0f;
    L16:
        if (r7 <= 1.0f) goto L18;
        r7 = 1.0f;
    L18:
        int r2 = r1 | (((int) ((r7 * 255.0f) + 0.5f)) << 16);
        if (r22 >= 0.0f) goto L21;
        float r3 = 0.0f;
    L23:
        if (r3 <= 1.0f) goto L25;
        r3 = 1.0f;
    L25:
        int r4 = r2 | (((int) ((r3 * 255.0f) + 0.5f)) << 8);
        if (r23 < 0.0f) goto L30;
        r6 = r23;
    L30:
        if (r6 > 1.0f) goto L33;
        r5 = r6;
    L33:
        long r8 = ((long) (r4 | ((int) ((r5 * 255.0f) + 0.5f)))) << 32;
        int r9 = x40.h;
        return r8;
    L21:
        r3 = r22;
        goto L23
    L14:
        r7 = r21;
        goto L16
    L7:
        r0 = r24;
        goto L9
    L36:
        if (((int) (r25.b >> 32)) == 3) goto L39;
        bz1.a("Color only works with ColorSpaces with 3 components");
    L39:
        int r10 = r25.c;
        if (r10 != (-1)) goto L43;
        bz1.a("Unknown color space, please use a color space in ColorSpaces");
    L43:
        int r11 = 0;
        float r12 = r25.b(0);
        float r13 = r25.a(0);
        if (r21 < r12) goto L48;
        r12 = r21;
    L48:
        if (r12 > r13) goto L51;
        r13 = r12;
    L51:
        int r14 = Float.floatToRawIntBits(r13);
        int r15 = r14 >>> 31;
        int r16 = (r14 >>> 23) & 255;
        int r17 = r14 & 8388607;
        if (r16 != 255) goto L57;
        if (r17 == 0) goto L55;
        int r18 = 512;
    L56:
        int r19 = 31;
    L72:
        int r20 = r18 | ((r15 << 15) | (r19 << 10));
    L70:
        short r26 = (short) r20;
        float r27 = r25.b(1);
        float r110 = r25.a(1);
        if (r22 < r27) goto L78;
        r27 = r22;
    L78:
        if (r27 > r110) goto L81;
        r110 = r27;
    L81:
        int r28 = Float.floatToRawIntBits(r110);
        int r111 = r28 >>> 31;
        int r112 = (r28 >>> 23) & 255;
        int r29 = r28 & 8388607;
        if (r112 != 255) goto L87;
        if (r29 == 0) goto L85;
        int r30 = 512;
    L86:
        int r113 = 31;
    L102:
        int r31 = r30 | ((r111 << 15) | (r113 << 10));
    L100:
        short r32 = (short) r31;
        float r114 = r25.b(2);
        float r33 = r25.a(2);
        if (r23 < r114) goto L108;
        r114 = r23;
    L108:
        if (r114 > r33) goto L111;
        r33 = r114;
    L111:
        int r34 = Float.floatToRawIntBits(r33);
        int r115 = r34 >>> 31;
        int r116 = (r34 >>> 23) & 255;
        int r117 = 8388607 & r34;
        if (r116 != 255) goto L116;
        if (r117 == 0) goto L115;
        r11 = 512;
    L115:
        int r35 = r11;
        r11 = 31;
    L131:
        int r36 = r35 | ((r115 << 15) | (r11 << 10));
    L129:
        short r37 = (short) r36;
        if (r24 < 0.0f) goto L137;
        r6 = r24;
    L137:
        if (r6 > 1.0f) goto L140;
        r5 = r6;
    L140:
        long r38 = (((long) r10) & 63) | (((((((long) r26) & 65535) << 48) | ((((long) r32) & 65535) << 32)) | ((65535 & ((long) r37)) << 16)) | ((((long) ((int) ((r5 * 1023.0f) + 0.5f))) & 1023) << 6));
        int r39 = x40.h;
        return r38;
    L116:
        int r118 = r116 - 112;
        if (r118 < 31) goto L119;
        r35 = 0;
        r11 = 49;
        goto L131
    L119:
        if (r118 > 0) goto L126;
        if (r118 < (-10)) goto L125;
        int r40 = (r117 | 8388608) >> (1 - r118);
        if ((r40 & 4096) == 0) goto L124;
        r40 = r40 + 8192;
    L124:
        r35 = r40 >> 13;
        goto L131
    L125:
        r35 = 0;
        goto L131
    L126:
        int r41 = r117 >> 13;
        if ((r34 & 4096) == 0) goto L130;
        r36 = (((r118 << 10) | r41) + 1) | (r115 << 15);
        goto L129
    L130:
        r35 = r41;
        r11 = r118;
        goto L131
    L85:
        r30 = 0;
        goto L86
    L87:
        r113 = r112 - 112;
        if (r113 < 31) goto L90;
        r30 = 0;
        r113 = 49;
        goto L102
    L90:
        if (r113 > 0) goto L97;
        if (r113 < (-10)) goto L96;
        int r42 = (r29 | 8388608) >> (1 - r113);
        if ((r42 & 4096) == 0) goto L95;
        r42 = r42 + 8192;
    L95:
        r30 = r42 >> 13;
        r113 = 0;
        goto L102
    L96:
        r30 = 0;
        r113 = 0;
        goto L102
    L97:
        int r210 = r29 >> 13;
        if ((r28 & 4096) == 0) goto L101;
        r31 = (((r113 << 10) | r210) + 1) | (r111 << 15);
        goto L100
    L101:
        r30 = r210;
        goto L102
    L55:
        r18 = 0;
        goto L56
    L57:
        r19 = r16 - 112;
        if (r19 < 31) goto L60;
        r18 = 0;
        r19 = 49;
        goto L72
    L60:
        if (r19 > 0) goto L67;
        if (r19 < (-10)) goto L66;
        int r43 = (r17 | 8388608) >> (1 - r19);
        if ((r43 & 4096) == 0) goto L65;
        r43 = r43 + 8192;
    L65:
        r18 = r43 >> 13;
        r19 = 0;
        goto L72
    L66:
        r18 = 0;
        r19 = 0;
        goto L72
    L67:
        int r119 = r17 >> 13;
        if ((r14 & 4096) == 0) goto L71;
        r20 = (((r19 << 10) | r119) + 1) | (r15 << 15);
        goto L70
    L71:
        r18 = r119;
        goto L72
    }

    public static final long b(int r2) {
        long r0 = ((long) r2) << 32;
        int r3 = x40.h;
        return r0;
    }

    public static final long c(long r1) {
        long r2 = r1 << 32;
        int r0 = x40.h;
        return r2;
    }

    public static final void d(int r17, rg1 r18) {
        rg1 r7 = r18;
        r7.S(-2092244638);
        if (r17 == 0) goto L5;
        boolean r2 = true;
    L7:
        if (r7.K(r17 & 1, r2) == false) goto L46;
        Object r3 = r7.H();
        Object r4 = j80.a;
        if (r3 != r4) goto L11;
        r3 = new ty1();
        r7.b0(r3);
    L11:
        ty1 r5 = (ty1) r3;
        r5.a(0, r7);
        py1 r6 = new py1(au0.T(800, null, 6), hz3.o);
        Float r8 = Float.valueOf(0.08f);
        Float r9 = Float.valueOf(0.2f);
        Object r10 = r7.H();
        if (r10 != r4) goto L14;
        r10 = new qy1(r5, r8, r9, r6);
        r7.b0(r10);
    L14:
        qy1 r11 = (qy1) r10;
        boolean r12 = r7.g(r6);
        Object r13 = r7.H();
        if (r12 == true) goto L17;
        if (r13 == r4) goto L17;
    L18:
        ya3 r14 = r7.M.b.n;
        r14.x0(ma3.f);
        rr2.R(r14, 0, (gf1) r13);
        boolean r15 = r7.g(r5);
        Object r16 = r7.H();
        if (r15 == true) goto L21;
        if (r16 == r4) goto L21;
    L22:
        bu.b(r11, (if1) r16, r7);
        d71 r19 = ji2.b;
        long r110 = x40.c;
        dx2 r20 = kb4.i(r19, x40.b(r110, ((Number) r11.p.getValue()).floatValue()));
        hs r21 = fz0.s;
        Object r22 = (ui2) lu.a.g(r21);
        if (r22 != null) goto L25;
        r22 = new ou(r21, false);
    L25:
        int r23 = Long.hashCode(r7.T);
        mf3 r24 = r7.k();
        dx2 r25 = j51.E(r7, r20);
        e80.e.getClass();
        r7.U();
        if (r7.S == false) goto L28;
        r7.j();
    L29:
        d60 r111 = fz0.I;
        l93.c0(r111, r7, r22);
        d60 r112 = fz0.H;
        l93.c0(r112, r7, r24);
        Integer r26 = Integer.valueOf(r23);
        d60 r113 = fz0.J;
        l93.c0(r113, r7, r26);
        l93.a0(r7);
        d60 r27 = fz0.G;
        l93.c0(r27, r7, r25);
        fs r28 = fz0.z;
        y50 r29 = w50.a;
        if (r28.equals(fz0.y) == false) goto L32;
        r7.R(-1446604504);
        r7.o(false);
        y50 r1 = w50.a;
    L37:
        int r30 = Long.hashCode(r7.T);
        mf3 r31 = r7.k();
        dx2 r32 = j51.E(r7, ax2.a);
        r7.U();
        if (r7.S == false) goto L40;
        r7.j();
    L41:
        l93.c0(r111, r7, r1);
        l93.c0(r112, r7, r31);
        l93.c0(r113, r7, Integer.valueOf(r30));
        l93.a0(r7);
        l93.c0(r27, r7, r32);
        gi1.c(bu.x(R.drawable.ic_placeholder_song, r7), null, au0.G(new uf4(96.0f, 96.0f, 96.0f, 96.0f), null, 1044475), null, null, 0.0f, r7, 440, 120);
        uf4 r33 = new uf4(Float.NaN, 16.0f, Float.NaN, 16.0f);
        w01 r34 = w01.e;
        int r35 = Long.hashCode(r7.T);
        dx2 r36 = j51.E(r7, r33);
        mf3 r37 = r7.k();
        r7.U();
        if (r7.S == false) goto L44;
        r7.j();
    L45:
        l93.c0(r111, r7, r34);
        l93.c0(r112, r7, r37);
        l93.a0(r7);
        l93.c0(r27, r7, r36);
        l93.c0(r113, r7, Integer.valueOf(r35));
        r7.o(true);
        jz4.a(((Resources) r7.i(hb.c)).getString(R.string.homemusic_player_next_loading), null, new zs4(16744444, r110, su3.v(15)), 0, false, 0, 0, r18, 0);
        rg1 r38 = r18;
        r38.o(true);
        r38.o(true);
        rg1 r39 = r38;
    L47:
        lv3 r40 = r39.p();
        if (r40 == null) goto L51;
        r40.d = new d60(r17);
        return;
    L51:
        return;
    L44:
        r7.e0();
        goto L45
    L40:
        r7.e0();
        goto L41
    L32:
        r7.R(-1446550657);
        boolean r41 = r7.e(gi.a);
        Object r42 = r7.H();
        if (r41 == true) goto L35;
        if (r42 == r4) goto L35;
    L36:
        r7.o(false);
        r1 = (y50) r42;
    L35:
        r42 = new y50(r28);
        r7.b0(r42);
        goto L36
    L28:
        r7.e0();
    L21:
        r16 = new o(12, r5, r11);
        r7.b0(r16);
    L17:
        r13 = new uy1(r8, r11, r9, r6);
        r7.b0(r13);
        goto L18
    L46:
        r7.N();
        r39 = r7;
        goto L47
    L5:
        r2 = false;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final List r25, final int r26, final boolean r27, final Uri r28, final String r29, final boolean r30, final boolean r31, final if1 r32, final gf1 r33, rg1 r34, final int r35) {
        r25.getClass();
        r34.S(321351878);
        if (r34.g(r25) == false) goto L5;
        int r4 = 4;
    L6:
        int r5 = r35 | r4;
        if (r34.d(r26) == false) goto L9;
        int r6 = 32;
    L10:
        int r7 = r5 | r6;
        if (r34.f(r27) == false) goto L13;
        int r8 = 256;
    L14:
        int r9 = r7 | r8;
        if (r34.g(r28) == false) goto L17;
        int r10 = 2048;
    L18:
        int r11 = r9 | r10;
        if (r34.e(r29) == false) goto L21;
        int r12 = 16384;
    L22:
        int r13 = r11 | r12;
        if (r34.f(r30) == false) goto L25;
        int r14 = 131072;
    L26:
        int r15 = r13 | r14;
        if (r34.f(r31) == false) goto L29;
        int r16 = 1048576;
    L30:
        int r17 = r15 | r16;
        if (r34.g(r32) == false) goto L33;
        int r18 = 8388608;
    L34:
        int r19 = r17 | r18;
        if (r34.g(r33) == false) goto L37;
        int r110 = 67108864;
    L38:
        int r20 = r19 | r110;
        if ((38347923 & r20) == 38347922) goto L41;
        boolean r111 = true;
    L43:
        if (r34.K(r20 & 1, r111) == false) goto L126;
        b13 r112 = uc5.S(Integer.valueOf(r26), r34);
        b13 r113 = uc5.S(r32, r34);
        uc5.S(r33, r34);
        if (r30 == false) goto L50;
        if (r27 == true) goto L50;
        if (r25.isEmpty() == true) goto L50;
        int r114 = 1;
    L51:
        if (r27 == false) goto L53;
    L56:
        int r21 = 1;
    L57:
        b13 r115 = uc5.S(Integer.valueOf(r21), r34);
        if (r27 == false) goto L61;
        final int r22 = 0;
    L60:
        final int r23 = r21;
        boolean r116 = r34.d(r23);
        Object r0 = r34.H();
        Object r1 = j80.a;
        Object r2 = r0;
        if (r116 == true) goto L73;
        if (r0 == r1) goto L73;
    L74:
        final gf1 r3 = (gf1) r2;
        dd3 r117 = ed3.a;
        Object[] r24 = new Object[0];
        xc5 r36 = lm0.H;
        boolean r118 = (r34.d(r22) | r34.c(0.0f)) | r34.e(r3);
        Object r37 = r34.H();
        Object r38 = r37;
        if (r118 == true) goto L77;
        if (r37 == r1) goto L77;
    L78:
        lm0 r119 = (lm0) gh0.z(r24, r36, (gf1) r38, r34, 0);
        r119.G.setValue(r3);
        Object r39 = r119.p;
        Object r40 = r34.H();
        Object r41 = r40;
        if (r40 != r1) goto L81;
        Object r42 = uc5.B(Boolean.FALSE);
        r34.b0(r42);
        r41 = r42;
    L81:
        b13 r43 = (b13) r41;
        boolean r44 = r34.e(r39);
        Object r45 = r34.H();
        vd0 r46 = null;
        Object r47 = r45;
        if (r44 == true) goto L84;
        if (r45 == r1) goto L84;
    L85:
        bu.c((wf1) r47, r34, r39);
        Object r48 = r34.H();
        Object r49 = r48;
        if (r48 != r1) goto L88;
        Object r50 = uc5.B(Boolean.FALSE);
        r34.b0(r50);
        r49 = r50;
    L88:
        b13 r51 = (b13) r49;
        Boolean r52 = (Boolean) r43.getValue();
        r52.getClass();
        boolean r120 = r34.e(r43);
        Object r53 = r34.H();
        Object r54 = r53;
        if (r120 == true) goto L91;
        if (r53 == r1) goto L91;
    L92:
        bu.c((wf1) r54, r34, r52);
        Integer r55 = Integer.valueOf(r22);
        boolean r56 = ((r34.e(r43) | r34.d(r23)) | r34.d(r22)) | r34.e(r119);
        Object r121 = r34.H();
        if (r56 == true) goto L97;
        if (r121 == r1) goto L97;
        lm0 r57 = r119;
    L98:
        bu.c((wf1) r121, r34, r55);
        boolean r58 = r34.e(r57);
        int r59 = r20 & 896;
        if (r59 != 256) goto L101;
        boolean r60 = true;
    L102:
        boolean r61 = (((r58 | r60) | r34.e(r115)) | r34.e(r112)) | r34.e(r113);
        Object r62 = r34.H();
        if (r61 == true) goto L107;
        if (r62 == r1) goto L107;
        final boolean r122 = r27;
        lm0 r123 = r57;
        int r63 = 1;
    L108:
        bu.c((wf1) r62, r34, r123);
        App.b().getClass();
        if (App.c().getBoolean("rounded_corner", false) == false) goto L112;
        App.b().getClass();
        String r64 = App.c().getString("rounded_corner_size", "12");
        r64.getClass();
        final float r65 = Integer.parseInt(r64);
    L111:
        final lm0 r210 = r123;
        d71 r124 = ji2.b;
        ac3 r66 = q05.b(2);
        if (r122 == true) goto L117;
        if (r23 <= r63) goto L117;
        boolean r125 = r63;
    L118:
        if (r59 != 256) goto L120;
        int r126 = r63;
    L121:
        int r67 = (r34.g(r25) ? 1 : 0) | r126;
        Object r68 = r34.H();
        Object r69 = r68;
        if (r67 != 0) goto L124;
        if (r68 == r1) goto L124;
    L125:
        if1 r127 = (if1) r69;
        final boolean r70 = r122;
        uc5.a(r210, r124, r66, null, 16.0f, null, null, r125, r127, null, null, null, fh0.w(325113351, new a73(r210, r65, r33, r70, r28, r29, r25), r34), r34, 197040);
    L127:
        lv3 r128 = r34.p();
        if (r128 == null) goto L131;
        r128.d = new b73(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35);
        return;
    L131:
        return;
    L124:
        Object r71 = new z63(r25, r122);
        r34.b0(r71);
        r69 = r71;
        goto L125
    L120:
        r126 = 0;
    L117:
        r125 = 0;
        goto L118
    L112:
        r65 = 0.0f;
    L107:
        r122 = r27;
        r123 = r57;
        r63 = 1;
        Object r72 = new h73(r123, r122, r51, r115, r112, r113, null);
        r34.b0(r72);
        r62 = r72;
        goto L108
    L101:
        r60 = false;
    L97:
        r121 = new f73(r22, r23, r119, r43, null);
        r57 = r119;
        r34.b0(r121);
    L91:
        Object r73 = new e73(r43, r51, null);
        r34.b0(r73);
        r54 = r73;
    L84:
        Object r74 = new p(r39, r43, r46, 9);
        r34.b0(r74);
        r47 = r74;
    L77:
        Object r75 = new bd3(r22, r3);
        r34.b0(r75);
        r38 = r75;
    L73:
        Object r76 = new y63(r23);
        r34.b0(r76);
        r2 = r76;
        goto L74
    L61:
        if (r114 == 0) goto L65;
        if (r31 == false) goto L65;
        int r129 = r25.size();
    L64:
        r22 = r129;
    L65:
        int r130 = r21 - 1;
        if (r130 >= 0) goto L68;
        int r77 = 0;
    L69:
        r129 = gb.m(r26, 0, r77);
        goto L64
    L68:
        r77 = r130;
        goto L69
    L53:
        if (r25.isEmpty() == true) goto L56;
        r21 = r25.size() + r114;
    L50:
        r114 = 0;
        goto L51
    L126:
        r34.N();
        goto L127
    L41:
        r111 = false;
        goto L43
    L37:
        r110 = 33554432;
        goto L38
    L33:
        r18 = 4194304;
        goto L34
    L29:
        r16 = 524288;
        goto L30
    L25:
        r14 = 65536;
        goto L26
    L21:
        r12 = 8192;
        goto L22
    L17:
        r10 = 1024;
        goto L18
    L13:
        r8 = 128;
        goto L14
    L9:
        r6 = 16;
        goto L10
    L5:
        r4 = 2;
        goto L6
    }

    public static final void f(Uri r12, String r13, rg1 r14, int r15) {
        r14.S(1374447570);
        if (r14.g(r12) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r0 | r15;
        if (r14.e(r13) == false) goto L9;
        int r2 = 32;
    L10:
        int r3 = r1 | r2;
        boolean r4 = true;
        if ((r3 & 19) == 18) goto L13;
        boolean r5 = true;
    L15:
        if (r14.K(r3 & 1, r5) == false) goto L40;
        Context r6 = ((Context) r14.i(hb.b)).getApplicationContext();
        boolean r7 = r14.e(r12);
        int r8 = r3 & 112;
        if (r8 != 32) goto L19;
        boolean r9 = true;
    L20:
        boolean r10 = r7 | r9;
        Object r11 = r14.H();
        Object r16 = j80.a;
        if (r10 == true) goto L23;
        if (r11 == r16) goto L23;
    L24:
        b13 r17 = (b13) r11;
        boolean r18 = (r14.e(r17) | r14.g(r6)) | r14.g(r12);
        if (r8 == 32) goto L28;
        r4 = false;
    L28:
        boolean r19 = r18 | r4;
        Object r20 = r14.H();
        if (r19 == true) goto L31;
        if (r20 == r16) goto L31;
    L32:
        if1 r21 = (if1) r20;
        boolean r22 = r14.e(r12) | r14.e(r13);
        Object r23 = r14.H();
        if (r22 == true) goto L35;
        if (r23 == r16) goto L35;
    L36:
        wr0 r24 = (wr0) r23;
        Bitmap r25 = (Bitmap) r17.getValue();
        if (r25 == null) goto L39;
        r14.R(-2049573095);
        gi1.d(new cc(r25), null, ji2.b, r14, 25008);
        r14.o(false);
    L41:
        lv3 r26 = r14.p();
        if (r26 == null) goto L45;
        r26.d = new ib(r12, r13, r15, 7);
        return;
    L45:
        return;
    L39:
        r14.R(-2049353088);
        gi1.c(bu.x(R.drawable.ic_placeholder_radio, r14), null, ji2.b, null, od0.a, 0.0f, r14, 25016, 104);
        r14.o(false);
    L35:
        r23 = new wr0(r21);
        r14.b0(r23);
    L31:
        r20 = new ry1(r6, r12, r13, r17);
        r14.b0(r20);
    L23:
        r11 = uc5.B(null);
        r14.b0(r11);
        goto L24
    L19:
        r9 = false;
        goto L20
    L40:
        r14.N();
        goto L41
    L13:
        r5 = false;
        goto L15
    L9:
        r2 = 16;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public static final void g(String r12, String r13, rg1 r14, int r15) {
        r14.S(-299945073);
        int r2 = 4;
        if (r14.e(r12) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r0 | r15;
        if (r14.e(r13) == false) goto L9;
        int r3 = 32;
    L10:
        int r4 = r1 | r3;
        boolean r5 = true;
        if ((r4 & 19) == 18) goto L13;
        boolean r6 = true;
    L15:
        if (r14.K(r4 & 1, r6) == false) goto L36;
        Object r7 = ((Context) r14.i(hb.b)).getApplicationContext();
        int r8 = r4 & 14;
        if (r8 != 4) goto L19;
        boolean r9 = true;
    L20:
        Object r10 = r14.H();
        Object r11 = j80.a;
        if (r9 == true) goto L23;
        if (r10 == r11) goto L23;
    L24:
        b13 r16 = (b13) r10;
        if (r8 == 4) goto L28;
        r5 = false;
    L28:
        boolean r17 = (r14.e(r16) | r5) | r14.g(r7);
        Object r18 = r14.H();
        if (r17 == true) goto L31;
        if (r18 == r11) goto L31;
    L32:
        bu.b(r12, (if1) r18, r14);
        Bitmap r19 = (Bitmap) r16.getValue();
        if (r19 == null) goto L35;
        r14.R(-2130593189);
        gi1.d(new cc(r19), r13, ji2.b, r14, (r4 & 112) | 24960);
        r14.o(false);
    L37:
        lv3 r20 = r14.p();
        if (r20 == null) goto L41;
        r20.d = new ib(r12, r13, r15, 8);
        return;
    L41:
        return;
    L35:
        r14.R(-2130372221);
        gi1.c(bu.x(R.drawable.ic_placeholder_song, r14), r13, ji2.b, null, od0.a, 0.0f, r14, 24968 | (r4 & 112), 104);
        r14.o(false);
    L31:
        r18 = new dd0(r12, r7, r16, r2);
        r14.b0(r18);
    L23:
        r10 = uc5.B(null);
        r14.b0(r10);
        goto L24
    L19:
        r9 = false;
        goto L20
    L36:
        r14.N();
        goto L37
    L13:
        r6 = false;
        goto L15
    L9:
        r3 = 16;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public static final long h(float r4, float r5) {
        long r0 = Float.floatToRawIntBits(r4);
        return (((long) Float.floatToRawIntBits(r5)) & 4294967295L) | (r0 << 32);
    }

    public static final long i(long r7, long r9) {
        if (r7 == 4611686018427387903L) goto L16;
        if (r7 == (-4611686018427387903L)) goto L16;
        if (r9 != 4611686018427387903L) goto L10;
    L14:
        return r9;
    L10:
        if (r9 == (-4611686018427387903L)) goto L14;
        return gb.n(r7 + r9, -4611686018427387903L, 4611686018427387903L);
    L16:
        if ((-4611686018427387903L) >= r9) goto L21;
        if (r9 >= 4611686018427387903L) goto L21;
    L22:
        return r7;
    L21:
        if ((r9 ^ r7) >= 0) goto L22;
        return 9223372036854759646L;
    }

    public static final int j(char r3) {
        if ('0' > r3) goto L9;
        if (r3 >= ':') goto L9;
        return r3 - '0';
    L9:
        if ('a' > r3) goto L15;
        if (r3 >= 'g') goto L15;
        return r3 - 'W';
    L15:
        if ('A' > r3) goto L21;
        if (r3 >= 'G') goto L21;
        return r3 - '7';
    L21:
        throw new IllegalArgumentException("Unexpected hex digit: " + r3);
    }

    public static final void k(v3 r4, i94 r5) {
        e94 r0 = r5.d;
        w03 r1 = r0.n;
        Object r2 = r0.n.g(n94.w);
        Object r3 = null;
        if (r2 != null) goto L5;
        r2 = null;
    L5:
        m24 r6 = (m24) r2;
        if (xl.b(r5) == false) goto L33;
        Object r7 = r1.g(d94.x);
        if (r7 != null) goto L10;
        r7 = null;
    L10:
        w2 r8 = (w2) r7;
        if (r8 == null) goto L13;
        r4.b(new o3(android.R.id.accessibilityActionPageUp, r8.a));
    L13:
        Object r9 = r1.g(d94.z);
        if (r9 != null) goto L16;
        r9 = null;
    L16:
        w2 r10 = (w2) r9;
        if (r10 == null) goto L19;
        r4.b(new o3(android.R.id.accessibilityActionPageDown, r10.a));
    L19:
        Object r11 = r1.g(d94.y);
        if (r11 != null) goto L22;
        r11 = null;
    L22:
        w2 r12 = (w2) r11;
        if (r12 == null) goto L25;
        r4.b(new o3(android.R.id.accessibilityActionPageLeft, r12.a));
    L25:
        Object r13 = r1.g(d94.A);
        if (r13 == null) goto L29;
        r3 = r13;
    L29:
        w2 r14 = (w2) r3;
        if (r14 == null) goto L34;
        r4.b(new o3(android.R.id.accessibilityActionPageRight, r14.a));
        return;
    L34:
        return;
    }

    public static void l(lg4 r5, List r6, z80 r7) {
        if (r6.isEmpty() == true) goto L17;
        int r0 = r6.size();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L21;
        int r2 = r5.c((mg1) r6.get(r1));
        int r3 = r5.r(r2);
        int r4 = r5.N(r5.b, r3);
        if (r4 >= r5.g(r5.b, r5.r(r2 + 1))) goto L9;
        int r8 = r5.h(r4);
        Object r9 = r5.c[r8];
    L11:
        if ((r9 instanceof lv3) == false) goto L13;
        lv3 r10 = (lv3) r9;
    L14:
        if (r10 == null) goto L16;
        r10.a = r7;
    L16:
        r1 = r1 + 1;
        goto L5
    L13:
        r10 = null;
        goto L14
    L9:
        r9 = j80.a;
        goto L11
    L21:
        return;
    }

    public static void m() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L5;
        return;
    L5:
        kf2.n("You must call this method on the main thread");
    }

    public static boolean n(Object r0, Object r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equals(r1);
    }

    public static final void o(int r1) {
        if (r1 < 1) goto L5;
        return;
    L5:
        kf2.e(f34.f(r1, "Expected positive parallelism level, but got "));
    }

    public static final void p(sl1 r0, String r1, String r2) {
        r0.getClass();
        r1.getClass();
        r2.getClass();
        ArrayList r3 = r0.a;
        r3.add(r1);
        r3.add(qm4.K0(r2).toString());
    }

    public static int q(yw3 r0, qz0 r1, View r2, View r3, mw3 r4, boolean r5) {
        if (r4.v() != 0) goto L5;
        return 0;
    L5:
        if (r0.b() == 0) goto L16;
        if (r2 == null) goto L17;
        if (r3 == null) goto L18;
        if (r5 == false) goto L11;
        int r6 = r1.d(r3) - r1.g(r2);
        return Math.min(r1.n(), r6);
    L11:
        return Math.abs(mw3.I(r2) - mw3.I(r3)) + 1;
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    public static int r(yw3 r3, qz0 r4, View r5, View r6, mw3 r7, boolean r8, boolean r9) {
        if (r7.v() != 0) goto L5;
    L17:
        return 0;
    L5:
        if (r3.b() == 0) goto L17;
        if (r5 == null) goto L17;
        if (r6 == null) goto L17;
        int r10 = Math.min(mw3.I(r5), mw3.I(r6));
        int r1 = Math.max(mw3.I(r5), mw3.I(r6));
        if (r9 == false) goto L12;
        int r11 = Math.max(0, (r3.b() - r1) - 1);
    L13:
        if (r8 == true) goto L16;
        return r11;
    L16:
        return Math.round((r11 * (Math.abs(r4.d(r6) - r4.g(r5)) / (Math.abs(mw3.I(r5) - mw3.I(r6)) + 1))) + (r4.m() - r4.g(r5)));
    L12:
        r11 = Math.max(0, r10);
        goto L13
    }

    public static int s(yw3 r0, qz0 r1, View r2, View r3, mw3 r4, boolean r5) {
        if (r4.v() != 0) goto L5;
        return 0;
    L5:
        if (r0.b() == 0) goto L16;
        if (r2 == null) goto L17;
        if (r3 == null) goto L18;
        if (r5 == true) goto L13;
        return r0.b();
    L13:
        return (int) (((r1.d(r3) - r1.g(r2)) / (Math.abs(mw3.I(r2) - mw3.I(r3)) + 1)) * r0.b());
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    public static final long t(ad3 r4) {
        return ji2.M(r4.l() * r4.p()) + (((long) r4.k()) * ((long) r4.p()));
    }

    public static final long u(long r3) {
        long r4 = (r3 << 1) + 1;
        mx0.n.getClass();
        int r0 = nx0.a;
        return r4;
    }

    public static int v(Bitmap r5) {
        if (r5.isRecycled() == false) goto L10;
        StringBuilder r1 = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        r1.append(r5);
        int r2 = r5.getWidth();
        int r3 = r5.getHeight();
        Bitmap.Config r6 = r5.getConfig();
        r1.append("[");
        r1.append(r2);
        r1.append("x");
        r1.append(r3);
        r1.append("] ");
        r1.append(r6);
        throw new IllegalStateException(r1.toString());
    L10:
        return r5.getAllocationByteCount();
    L6:
        int r0 = r5.getHeight();
        return r5.getRowBytes() * r0;
    }

    public static int w(Bitmap.Config r2) {
        if (r2 != null) goto L4;
        r2 = Bitmap.Config.ARGB_8888;
    L4:
        int r3 = c35.a[r2.ordinal()];
        int r0 = 1;
        if (r3 == 1) goto L15;
        r0 = 2;
        if (r3 == 2) goto L15;
        if (r3 == 3) goto L15;
        if (r3 == 4) goto L13;
        return 4;
    L13:
        return 8;
    L15:
        return r0;
    }

    public static final int x(Cursor r12, String r13) {
        r12.getClass();
        int r0 = r12.getColumnIndex(r13);
        if (r0 >= 0) goto L28;
        r0 = r12.getColumnIndex("`" + r13 + '`');
        if (r0 >= 0) goto L28;
        if (Build.VERSION.SDK_INT <= 25) goto L12;
    L27:
        r0 = -1;
        goto L28
    L12:
        if (r13.length() == 0) goto L27;
        String[] r1 = r12.getColumnNames();
        r1.getClass();
        String r4 = ".".concat(r13);
        String r3 = "." + r13 + '`';
        int r5 = r1.length;
        int r6 = 0;
        int r7 = 0;
    L15:
        if (r7 >= r5) goto L27;
        String r8 = r1[r7];
        int r9 = r6 + 1;
        if (r8.length() < (r13.length() + 2)) goto L26;
        if (xm4.e0(r8, r4, false) == true) goto L25;
        if (r8.charAt(0) != '`') goto L26;
        if (xm4.e0(r8, r3, false) == false) goto L26;
    L25:
        r0 = r6;
    L26:
        r7 = r7 + 1;
        r6 = r9;
    L28:
        if (r0 < 0) goto L36;
        return r0;
    L36:
        String[] r14 = r12.getColumnNames();     // Catch: Exception -> L32
        r14.getClass();     // Catch: Exception -> L32
        String r15 = ti.n0(63, r14);     // Catch: Exception -> L32
    L34:
        tb4.h("column '", r13, "' does not exist. Available columns: ", r15);
        return 0;
    L32:
        e = move-exception;
        Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
        r15 = "unknown";
        goto L34
    }

    public static int y(byte[] r7) {
        boolean r0 = false;
        byte r1 = r7[0];
        if (r1 != (-2)) goto L5;
        int r2 = ((r7[4] & 3) << 12) | ((r7[7] & 255) << 4);
        byte r8 = r7[6];
    L9:
        int r9 = (((r8 & 240) >> 4) | r2) + 1;
    L14:
        if (r0 == true) goto L16;
        return r9;
    L16:
        return (r9 * 16) / 14;
    L5:
        if (r1 != (-1)) goto L7;
        int r3 = ((r7[7] & 3) << 12) | ((r7[6] & 255) << 4);
        byte r10 = r7[9];
    L11:
        r9 = (((r10 & 60) >> 2) | r3) + 1;
        r0 = true;
        goto L14
    L7:
        if (r1 == 31) goto L10;
        r2 = ((r7[5] & 3) << 12) | ((r7[6] & 255) << 4);
        r8 = r7[7];
        goto L9
    L10:
        r3 = ((r7[6] & 3) << 12) | ((r7[7] & 255) << 4);
        r10 = r7[8];
        goto L11
    }

    public static int z(int r1) {
        if (r1 != 2147385345) goto L5;
        return 1;
    L5:
        if (r1 != (-25230976)) goto L7;
        return 1;
    L7:
        if (r1 != 536864768) goto L9;
        return 1;
    L9:
        if (r1 != (-14745368)) goto L12;
        return 1;
    L12:
        if (r1 != 1683496997) goto L14;
        return 2;
    L14:
        if (r1 != 622876772) goto L17;
        return 2;
    L17:
        if (r1 != 1078008818) goto L19;
        return 3;
    L19:
        if (r1 != (-233094848)) goto L22;
        return 3;
    L22:
        if (r1 != 1908687592) goto L24;
        return 4;
    L24:
        if (r1 == (-398277519)) goto L36;
        return 0;
    L36:
        return 4;
    }
}
