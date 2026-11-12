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
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.subsonic.models.Child;
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
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e35 {
    public static volatile Handler c = null;
    public static final long n = Long.MIN_VALUE;
    public static final /* synthetic */ int o = 0;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] e = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] g = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] h = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] i = {5, 8, 10, 12};
    public static final int[] j = {6, 9, 12, 15};
    public static final int[] k = {2, 4, 6, 8};
    public static final int[] l = {9, 11, 13, 16};
    public static final int[] m = {5, 8, 10, 12};

    public static h00 A(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new h00(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        h00 h00Var = new h00(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            h00 h00Var2 = new h00(bArrCopyOf.length, bArrCopyOf);
            while (h00Var2.b() >= 16) {
                h00Var2.t(2);
                int i4 = h00Var2.i(14) & 16383;
                int iMin = Math.min(8 - h00Var.d, 14);
                int i5 = h00Var.d;
                int i6 = (8 - i5) - iMin;
                byte[] bArr3 = h00Var.b;
                int i7 = h00Var.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr3[i7]);
                bArr3[i7] = b5;
                int i8 = 14 - iMin;
                bArr3[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (true) {
                    bArr2 = h00Var.b;
                    if (i8 > 8) {
                        bArr2[i9] = (byte) (i4 >>> (i8 - 8));
                        i8 -= 8;
                        i9++;
                    }
                }
                int i10 = 8 - i8;
                byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                h00Var.t(14);
                h00Var.a();
            }
        }
        h00Var.o(bArrCopyOf.length, bArrCopyOf);
        return h00Var;
    }

    public static ArrayList B(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler C() {
        if (c == null) {
            synchronized (e35.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static int D(int i2, float f2) {
        return E(Float.floatToIntBits(f2), i2);
    }

    public static int E(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int F(int i2, Object obj) {
        return E(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static final void G(String str) {
        str.getClass();
        if (str.length() <= 0) {
            kf2.n("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ya4.g(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void H(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ya4.g(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(xe5.l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static boolean I(int i2, int i3) {
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void J(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static final String K(String str) {
        String string = str != null ? qm4.K0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        if (!xm4.k0(string, "http://", true) && !xm4.k0(string, "https://", true)) {
            string = "https://".concat(string);
        }
        return qm4.L0(qm4.H0(string, '#'), '/');
    }

    /* JADX WARN: Code duplicated, block: B:159:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0121 A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:66:0x011d, B:68:0x0121, B:70:0x0125, B:72:0x012e, B:74:0x0134, B:77:0x013a, B:82:0x0148, B:80:0x0141, B:83:0x0150, B:84:0x0154), top: B:159:0x011d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0125 A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:66:0x011d, B:68:0x0121, B:70:0x0125, B:72:0x012e, B:74:0x0134, B:77:0x013a, B:82:0x0148, B:80:0x0141, B:83:0x0150, B:84:0x0154), top: B:159:0x011d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0150 A[Catch: all -> 0x015b, TryCatch #4 {all -> 0x015b, blocks: (B:66:0x011d, B:68:0x0121, B:70:0x0125, B:72:0x012e, B:74:0x0134, B:77:0x013a, B:82:0x0148, B:80:0x0141, B:83:0x0150, B:84:0x0154), top: B:159:0x011d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0154 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #4 {all -> 0x015b, blocks: (B:66:0x011d, B:68:0x0121, B:70:0x0125, B:72:0x012e, B:74:0x0134, B:77:0x013a, B:82:0x0148, B:80:0x0141, B:83:0x0150, B:84:0x0154), top: B:159:0x011d, inners: #1 }] */
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
    public static xa1 L(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i2;
        int i3;
        ?? r4;
        long j2;
        Throwable th;
        ?? r5;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            T(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mt3.b);
        int i4 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, SmartPlan.MAX_QUEUE);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mt3.c);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            T(xmlResourceParser);
                        }
                        arrayList.add(new za1(i6, i8, resourceId2, string7, string6, z));
                    } else {
                        T(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new ya1((za1[]) arrayList.toArray(new za1[0]));
        }
        List listP = P(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mt3.d);
                    int i10 = integer;
                    int i11 = 3;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i4);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            r4 = typedArrayObtainAttributes3;
                            j2 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (true) {
                            int i12 = i11;
                            if (xmlResourceParser.next() == i12) {
                                break;
                            }
                            try {
                                T(xmlResourceParser);
                                i11 = i12;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = typedArrayObtainAttributes3;
                                j2 = 1;
                            }
                        }
                        try {
                            r4 = typedArrayObtainAttributes3;
                            i3 = i10;
                            j2 = 1;
                            try {
                                pa1 pa1Var = new pa1(string, listP, string2, string8, string9, string10);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r4;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(pa1Var);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = typedArrayObtainAttributes3;
                            j2 = 1;
                            th = th;
                            r5 = r4;
                            if (r5 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r5 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r5).close();
                                    throw th;
                                }
                                if (r5 instanceof ExecutorService) {
                                    r5.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r5;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r5 = r4;
                    if (r5 != 0) {
                        throw th;
                    }
                    if (!(r5 instanceof AutoCloseable)) {
                        ((AutoCloseable) r5).close();
                        throw th;
                    }
                    if (r5 instanceof ExecutorService) {
                        r5.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r5;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j2, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i3 = integer;
                T(xmlResourceParser);
                integer = i3;
                integer2 = integer2;
                string5 = string5;
                i2 = 2;
                i4 = 0;
                i5 = 3;
            }
        }
        int i13 = integer2;
        String str = string5;
        int i14 = integer;
        if (!arrayList2.isEmpty()) {
            return new ab1(arrayList2, i14, i13, str);
        }
        if (string3 == null) {
            kf2.n("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new pa1(string, listP, string2, string3, null, null));
        if (string4 != null) {
            arrayList2.add(new pa1(string, listP, string2, string4, null, null));
        }
        return new ab1(arrayList2, i14, i13, str);
    }

    public static h32 M(l32 l32Var) {
        boolean z = l32Var.o;
        l32Var.o = true;
        try {
            try {
                try {
                    h32 h32VarQ = fh0.q(l32Var);
                    l32Var.o = z;
                    return h32VarQ;
                } catch (StackOverflowError e2) {
                    throw new JsonParseException("Failed parsing JSON source: " + l32Var + " to Json", e2);
                }
            } catch (OutOfMemoryError e3) {
                throw new JsonParseException("Failed parsing JSON source: " + l32Var + " to Json", e3);
            }
        } catch (Throwable th) {
            l32Var.o = z;
            throw th;
        }
    }

    public static h32 N(String str) {
        try {
            l32 l32Var = new l32(new StringReader(str));
            h32 h32VarM = M(l32Var);
            h32VarM.getClass();
            if (!(h32VarM instanceof i32) && l32Var.e0() != 10) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return h32VarM;
        } catch (MalformedJsonException e2) {
            throw new JsonSyntaxException(e2);
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        } catch (NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        }
    }

    public static int O(h00 h00Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && h00Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return h00Var.i(iArr[i2]) + i4;
    }

    public static List P(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final String Q() {
        App.b().getClass();
        SharedPreferences sharedPreferencesC = App.c();
        sharedPreferencesC.getClass();
        String strK = K(sharedPreferencesC.getString("homemusic_hub_url", null));
        if (strK != null) {
            return strK;
        }
        String strK2 = K("https://146.103.112.215:8445");
        return strK2 == null ? "" : strK2;
    }

    public static void R(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(f34.f(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void S(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            hv4.a(view, charSequence);
            return;
        }
        jv4 jv4Var = jv4.x;
        if (jv4Var != null && jv4Var.n == view) {
            jv4.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new jv4(view, charSequence);
            return;
        }
        jv4 jv4Var2 = jv4.y;
        if (jv4Var2 != null && jv4Var2.n == view) {
            jv4Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void T(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final int U(long j2) {
        float[] fArr = s50.a;
        return (int) (x40.a(j2, s50.e) >>> 32);
    }

    public static final long V(int i2) {
        ox0 ox0Var = ox0.SECONDS;
        if (ox0Var.compareTo(ox0Var) > 0) {
            return W(i2, ox0Var);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i2, TimeUnit.SECONDS);
        om0 om0Var = mx0.n;
        long j2 = jConvert << 1;
        int i3 = nx0.a;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d A[PHI: r4
  0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long W(long j2, ox0 ox0Var) {
        long j3;
        TimeUnit timeUnit = ox0Var.n;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j2 && j2 <= jConvert) {
            long jConvert2 = timeUnit2.convert(j2, timeUnit);
            om0 om0Var = mx0.n;
            long j4 = jConvert2 << 1;
            int i2 = nx0.a;
            return j4;
        }
        if (ox0Var.compareTo(ox0.MILLISECONDS) < 0) {
            return u(gb.n(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j2);
        if (j2 < -9223372036854775807L) {
            j2 = -9223372036854775807L;
        }
        long jAbs = Math.abs(j2);
        int iOrdinal = ox0Var.ordinal();
        long j5 = 0;
        if (iOrdinal == 2) {
            j3 = 1;
        } else if (iOrdinal == 3) {
            j3 = 1000;
        } else if (iOrdinal == 4) {
            j3 = 60000;
        } else if (iOrdinal == 5) {
            j3 = 3600000;
        } else {
            if (iOrdinal != 6) {
                mj0.g(ox0Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j3 = 86400000;
        }
        if (jAbs == 0) {
            jAbs = j5;
        } else {
            j5 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j3 > 4611686018427387903L) {
                    jAbs = j5;
                } else {
                    jAbs = j3;
                }
            } else if (j3 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j3);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j3;
                } else if (iNumberOfLeadingZeros > 63) {
                    jAbs = j5;
                } else {
                    jAbs *= j3;
                    if (jAbs > 4611686018427387903L) {
                        jAbs = j5;
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
                jAbs = j5;
            }
        }
        return u(jSignum * jAbs);
    }

    public static String X(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        return i2 == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long a(float f2, float f3, float f4, float f5, p50 p50Var) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (p50Var.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = x40.h;
            return j2;
        }
        if (((int) (p50Var.b >> 32)) != 3) {
            bz1.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = p50Var.c;
        if (i25 == -1) {
            bz1.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = p50Var.b(0);
        float fA3 = p50Var.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s = (short) i4;
                    fB = p50Var.b(1);
                    fA = p50Var.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                fB2 = p50Var.b(2);
                                fA2 = p50Var.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s3 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = x40.h;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s4 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = x40.h;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s5 = (short) i11;
                    fB2 = p50Var.b(2);
                    fA2 = p50Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s6 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = x40.h;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s7 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = x40.h;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s8 = (short) i4;
        fB = p50Var.b(1);
        fA = p50Var.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s9 = (short) i11;
                    fB2 = p50Var.b(2);
                    fA2 = p50Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s10 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = x40.h;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s11 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = x40.h;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s12 = (short) i11;
        fB2 = p50Var.b(2);
        fA2 = p50Var.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s13 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = x40.h;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s14 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = x40.h;
        return j10;
    }

    public static final long b(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = x40.h;
        return j2;
    }

    public static final long c(long j2) {
        long j3 = j2 << 32;
        int i2 = x40.h;
        return j3;
    }

    public static final void d(int i2, rg1 rg1Var) {
        rg1 rg1Var2;
        y50 y50Var;
        rg1 rg1Var3 = rg1Var;
        rg1Var3.S(-2092244638);
        if (rg1Var3.K(i2 & 1, i2 != 0)) {
            Object objH = rg1Var3.H();
            Object obj = j80.a;
            if (objH == obj) {
                objH = new ty1();
                rg1Var3.b0(objH);
            }
            ty1 ty1Var = (ty1) objH;
            ty1Var.a(0, rg1Var3);
            py1 py1Var = new py1(au0.T(800, null, 6), hz3.o);
            Float fValueOf = Float.valueOf(0.08f);
            Float fValueOf2 = Float.valueOf(0.2f);
            Object objH2 = rg1Var3.H();
            if (objH2 == obj) {
                objH2 = new qy1(ty1Var, fValueOf, fValueOf2, py1Var);
                rg1Var3.b0(objH2);
            }
            qy1 qy1Var = (qy1) objH2;
            boolean zG = rg1Var3.g(py1Var);
            Object objH3 = rg1Var3.H();
            if (zG || objH3 == obj) {
                objH3 = new uy1(fValueOf, qy1Var, fValueOf2, py1Var);
                rg1Var3.b0(objH3);
            }
            ya3 ya3Var = rg1Var3.M.b.n;
            ya3Var.x0(ma3.f);
            rr2.R(ya3Var, 0, (gf1) objH3);
            boolean zG2 = rg1Var3.g(ty1Var);
            Object objH4 = rg1Var3.H();
            if (zG2 || objH4 == obj) {
                objH4 = new o(12, ty1Var, qy1Var);
                rg1Var3.b0(objH4);
            }
            bu.b(qy1Var, (if1) objH4, rg1Var3);
            d71 d71Var = ji2.b;
            long j2 = x40.c;
            dx2 dx2VarI = kb4.i(d71Var, x40.b(j2, ((Number) qy1Var.p.getValue()).floatValue()));
            hs hsVar = fz0.s;
            Object ouVar = (ui2) lu.a.g(hsVar);
            if (ouVar == null) {
                ouVar = new ou(hsVar, false);
            }
            int iHashCode = Long.hashCode(rg1Var3.T);
            mf3 mf3VarK = rg1Var3.k();
            dx2 dx2VarE = j51.E(rg1Var3, dx2VarI);
            e80.e.getClass();
            rg1Var3.U();
            if (rg1Var3.S) {
                rg1Var3.j();
            } else {
                rg1Var3.e0();
            }
            d60 d60Var = fz0.I;
            l93.c0(d60Var, rg1Var3, ouVar);
            d60 d60Var2 = fz0.H;
            l93.c0(d60Var2, rg1Var3, mf3VarK);
            Integer numValueOf = Integer.valueOf(iHashCode);
            d60 d60Var3 = fz0.J;
            l93.c0(d60Var3, rg1Var3, numValueOf);
            l93.a0(rg1Var3);
            d60 d60Var4 = fz0.G;
            l93.c0(d60Var4, rg1Var3, dx2VarE);
            fs fsVar = fz0.z;
            y50 y50Var2 = w50.a;
            if (fsVar.equals(fz0.y)) {
                rg1Var3.R(-1446604504);
                rg1Var3.o(false);
                y50Var = w50.a;
            } else {
                rg1Var3.R(-1446550657);
                boolean zE = rg1Var3.e(gi.a);
                Object objH5 = rg1Var3.H();
                if (zE || objH5 == obj) {
                    objH5 = new y50(fsVar);
                    rg1Var3.b0(objH5);
                }
                rg1Var3.o(false);
                y50Var = (y50) objH5;
            }
            int iHashCode2 = Long.hashCode(rg1Var3.T);
            mf3 mf3VarK2 = rg1Var3.k();
            dx2 dx2VarE2 = j51.E(rg1Var3, ax2.a);
            rg1Var3.U();
            if (rg1Var3.S) {
                rg1Var3.j();
            } else {
                rg1Var3.e0();
            }
            l93.c0(d60Var, rg1Var3, y50Var);
            l93.c0(d60Var2, rg1Var3, mf3VarK2);
            l93.c0(d60Var3, rg1Var3, Integer.valueOf(iHashCode2));
            l93.a0(rg1Var3);
            l93.c0(d60Var4, rg1Var3, dx2VarE2);
            gi1.c(bu.x(R.drawable.ic_placeholder_song, rg1Var3), null, au0.G(new uf4(96.0f, 96.0f, 96.0f, 96.0f), null, 1044475), null, null, 0.0f, rg1Var3, 440, 120);
            uf4 uf4Var = new uf4(Float.NaN, 16.0f, Float.NaN, 16.0f);
            w01 w01Var = w01.e;
            int iHashCode3 = Long.hashCode(rg1Var3.T);
            dx2 dx2VarE3 = j51.E(rg1Var3, uf4Var);
            mf3 mf3VarK3 = rg1Var3.k();
            rg1Var3.U();
            if (rg1Var3.S) {
                rg1Var3.j();
            } else {
                rg1Var3.e0();
            }
            l93.c0(d60Var, rg1Var3, w01Var);
            l93.c0(d60Var2, rg1Var3, mf3VarK3);
            l93.a0(rg1Var3);
            l93.c0(d60Var4, rg1Var3, dx2VarE3);
            l93.c0(d60Var3, rg1Var3, Integer.valueOf(iHashCode3));
            rg1Var3.o(true);
            jz4.a(((Resources) rg1Var3.i(hb.c)).getString(R.string.homemusic_player_next_loading), null, new zs4(16744444, j2, su3.v(15)), 0, false, 0, 0, rg1Var, 0);
            rg1 rg1Var4 = rg1Var;
            rg1Var4.o(true);
            rg1Var4.o(true);
            rg1Var2 = rg1Var4;
        } else {
            rg1Var3.N();
            rg1Var2 = rg1Var3;
        }
        lv3 lv3VarP = rg1Var2.p();
        if (lv3VarP != null) {
            lv3VarP.d = new d60(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final List list, final int i2, final boolean z, final Uri uri, final String str, final boolean z2, final boolean z3, final if1 if1Var, final gf1 gf1Var, rg1 rg1Var, final int i3) {
        int iM;
        final int i4;
        lm0 lm0Var;
        final boolean z4;
        lm0 lm0Var2;
        int i5;
        final float f2;
        list.getClass();
        rg1Var.S(321351878);
        int i6 = i3 | (rg1Var.g(list) ? 4 : 2) | (rg1Var.d(i2) ? 32 : 16) | (rg1Var.f(z) ? 256 : 128) | (rg1Var.g(uri) ? 2048 : 1024) | (rg1Var.e(str) ? 16384 : 8192) | (rg1Var.f(z2) ? 131072 : 65536) | (rg1Var.f(z3) ? 1048576 : 524288) | (rg1Var.g(if1Var) ? 8388608 : 4194304) | (rg1Var.g(gf1Var) ? 67108864 : 33554432);
        if (rg1Var.K(i6 & 1, (38347923 & i6) != 38347922)) {
            b13 b13VarS = uc5.S(Integer.valueOf(i2), rg1Var);
            b13 b13VarS2 = uc5.S(if1Var, rg1Var);
            uc5.S(gf1Var, rg1Var);
            int i7 = (!z2 || z || list.isEmpty()) ? 0 : 1;
            int size = (z || list.isEmpty()) ? 1 : list.size() + i7;
            b13 b13VarS3 = uc5.S(Integer.valueOf(size), rg1Var);
            if (z) {
                i4 = 0;
            } else {
                if (i7 == 0 || !z3) {
                    int i8 = size - 1;
                    iM = gb.m(i2, 0, i8 < 0 ? 0 : i8);
                } else {
                    iM = list.size();
                }
                i4 = iM;
            }
            final int i9 = size;
            boolean zD = rg1Var.d(i9);
            Object objH = rg1Var.H();
            Object obj = j80.a;
            Object obj2 = objH;
            if (zD || objH == obj) {
                Object obj3 = new gf1() { // from class: y63
                    @Override // defpackage.gf1
                    public final Object invoke() {
                        return Integer.valueOf(i9);
                    }
                };
                rg1Var.b0(obj3);
                obj2 = obj3;
            }
            final gf1 gf1Var2 = (gf1) obj2;
            dd3 dd3Var = ed3.a;
            Object[] objArr = new Object[0];
            xc5 xc5Var = lm0.H;
            boolean zD2 = rg1Var.d(i4) | rg1Var.c(0.0f) | rg1Var.e(gf1Var2);
            Object objH2 = rg1Var.H();
            Object obj4 = objH2;
            if (zD2 || objH2 == obj) {
                Object obj5 = new gf1() { // from class: bd3
                    @Override // defpackage.gf1
                    public final Object invoke() {
                        return new lm0(i4, 0.0f, gf1Var2);
                    }
                };
                rg1Var.b0(obj5);
                obj4 = obj5;
            }
            lm0 lm0Var3 = (lm0) gh0.z(objArr, xc5Var, (gf1) obj4, rg1Var, 0);
            lm0Var3.G.setValue(gf1Var2);
            Object obj6 = lm0Var3.p;
            Object objH3 = rg1Var.H();
            Object obj7 = objH3;
            if (objH3 == obj) {
                Object objB = uc5.B(Boolean.FALSE);
                rg1Var.b0(objB);
                obj7 = objB;
            }
            b13 b13Var = (b13) obj7;
            boolean zE = rg1Var.e(obj6);
            Object objH4 = rg1Var.H();
            vd0 vd0Var = null;
            Object obj8 = objH4;
            if (zE || objH4 == obj) {
                Object pVar = new p(obj6, b13Var, vd0Var, 9);
                rg1Var.b0(pVar);
                obj8 = pVar;
            }
            bu.c((wf1) obj8, rg1Var, obj6);
            Object objH5 = rg1Var.H();
            Object obj9 = objH5;
            if (objH5 == obj) {
                Object objB2 = uc5.B(Boolean.FALSE);
                rg1Var.b0(objB2);
                obj9 = objB2;
            }
            b13 b13Var2 = (b13) obj9;
            Boolean bool = (Boolean) b13Var.getValue();
            bool.getClass();
            boolean zE2 = rg1Var.e(b13Var);
            Object objH6 = rg1Var.H();
            Object obj10 = objH6;
            if (zE2 || objH6 == obj) {
                Object e73Var = new e73(b13Var, b13Var2, null);
                rg1Var.b0(e73Var);
                obj10 = e73Var;
            }
            bu.c((wf1) obj10, rg1Var, bool);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zE3 = rg1Var.e(b13Var) | rg1Var.d(i9) | rg1Var.d(i4) | rg1Var.e(lm0Var3);
            Object objH7 = rg1Var.H();
            if (zE3 || objH7 == obj) {
                objH7 = new f73(i4, i9, lm0Var3, b13Var, null);
                lm0Var = lm0Var3;
                rg1Var.b0(objH7);
            } else {
                lm0Var = lm0Var3;
            }
            bu.c((wf1) objH7, rg1Var, numValueOf);
            int i10 = i6 & 896;
            boolean zE4 = rg1Var.e(lm0Var) | (i10 == 256) | rg1Var.e(b13VarS3) | rg1Var.e(b13VarS) | rg1Var.e(b13VarS2);
            Object objH8 = rg1Var.H();
            if (zE4 || objH8 == obj) {
                z4 = z;
                lm0Var2 = lm0Var;
                i5 = 1;
                Object h73Var = new h73(lm0Var2, z4, b13Var2, b13VarS3, b13VarS, b13VarS2, null);
                rg1Var.b0(h73Var);
                objH8 = h73Var;
            } else {
                z4 = z;
                lm0Var2 = lm0Var;
                i5 = 1;
            }
            bu.c((wf1) objH8, rg1Var, lm0Var2);
            App.b().getClass();
            if (App.c().getBoolean("rounded_corner", false)) {
                App.b().getClass();
                String string = App.c().getString("rounded_corner_size", "12");
                string.getClass();
                f2 = Integer.parseInt(string);
            } else {
                f2 = 0.0f;
            }
            final lm0 lm0Var4 = lm0Var2;
            d71 d71Var = ji2.b;
            ac3 ac3VarB = q05.b(2);
            boolean z5 = (z4 || i9 <= i5) ? 0 : i5;
            int i11 = (rg1Var.g(list) ? 1 : 0) | (i10 == 256 ? i5 : 0);
            Object objH9 = rg1Var.H();
            Object obj11 = objH9;
            if (i11 != 0 || objH9 == obj) {
                Object obj12 = new if1() { // from class: z63
                    @Override // defpackage.if1
                    public final Object invoke(Object obj13) {
                        String id;
                        int iIntValue = ((Integer) obj13).intValue();
                        if (z4) {
                            return WaveOrigin.RADIO;
                        }
                        Child child = (Child) q40.y0(list, iIntValue);
                        if (child == null || (id = child.getId()) == null) {
                            id = "loading";
                        }
                        return id + "_" + iIntValue;
                    }
                };
                rg1Var.b0(obj12);
                obj11 = obj12;
            }
            if1 if1Var2 = (if1) obj11;
            final boolean z6 = z4;
            uc5.a(lm0Var4, d71Var, ac3VarB, null, 16.0f, null, null, z5, if1Var2, null, null, null, fh0.w(325113351, new yf1() { // from class: a73
                @Override // defpackage.yf1
                public final Object d(Object obj13, Object obj14, Object obj15, Object obj16) {
                    final int iIntValue = ((Integer) obj14).intValue();
                    rg1 rg1Var2 = (rg1) obj15;
                    int iIntValue2 = ((Integer) obj16).intValue();
                    ((rc3) obj13).getClass();
                    final lm0 lm0Var5 = lm0Var4;
                    float fAbs = Math.abs(lm0Var5.l() + (lm0Var5.k() - iIntValue));
                    float fL = 1.0f - gb.l(fAbs, 0.0f, 1.0f);
                    final float f3 = (fL * 1.0f) + ((1.0f - fL) * 0.92f);
                    float fL2 = 1.0f - gb.l(fAbs, 0.0f, 1.0f);
                    final float f4 = (fL2 * 1.0f) + ((1.0f - fL2) * 0.7f);
                    d71 d71Var2 = ji2.b;
                    boolean zC = rg1Var2.c(f3) | rg1Var2.c(f4);
                    Object objH10 = rg1Var2.H();
                    i80 i80Var = j80.a;
                    if (zC || objH10 == i80Var) {
                        objH10 = new if1() { // from class: c73
                            @Override // defpackage.if1
                            public final Object invoke(Object obj17) {
                                b24 b24Var = (b24) obj17;
                                b24Var.getClass();
                                float f5 = f3;
                                b24Var.c(f5);
                                b24Var.e(f5);
                                b24Var.b(f4);
                                return j15.a;
                            }
                        };
                        rg1Var2.b0(objH10);
                    }
                    dx2 dx2VarF = au0.F(d71Var2, (if1) objH10);
                    int i12 = l34.a;
                    lu0 lu0Var = new lu0(f2);
                    dx2 dx2VarG = au0.G(dx2VarF, new k34(lu0Var, lu0Var, lu0Var, lu0Var), 1042431);
                    boolean zE5 = ((((iIntValue2 & 112) ^ 48) > 32 && rg1Var2.d(iIntValue)) || (iIntValue2 & 48) == 32) | rg1Var2.e(lm0Var5);
                    final gf1 gf1Var3 = gf1Var;
                    boolean zE6 = zE5 | rg1Var2.e(gf1Var3);
                    Object objH11 = rg1Var2.H();
                    if (zE6 || objH11 == i80Var) {
                        objH11 = new gf1() { // from class: d73
                            @Override // defpackage.gf1
                            public final Object invoke() {
                                if (iIntValue == lm0Var5.k()) {
                                    gf1Var3.invoke();
                                }
                                return j15.a;
                            }
                        };
                        rg1Var2.b0(objH11);
                    }
                    dx2 dx2VarJ = wr1.j(dx2VarG, (gf1) objH11);
                    hs hsVar = fz0.s;
                    Object ouVar = (ui2) lu.a.g(hsVar);
                    if (ouVar == null) {
                        ouVar = new ou(hsVar, false);
                    }
                    int iHashCode = Long.hashCode(rg1Var2.T);
                    mf3 mf3VarK = rg1Var2.k();
                    dx2 dx2VarE = j51.E(rg1Var2, dx2VarJ);
                    e80.e.getClass();
                    rg1Var2.U();
                    if (rg1Var2.S) {
                        rg1Var2.j();
                    } else {
                        rg1Var2.e0();
                    }
                    l93.c0(fz0.I, rg1Var2, ouVar);
                    l93.c0(fz0.H, rg1Var2, mf3VarK);
                    l93.c0(fz0.J, rg1Var2, Integer.valueOf(iHashCode));
                    l93.a0(rg1Var2);
                    l93.c0(fz0.G, rg1Var2, dx2VarE);
                    if (z6) {
                        rg1Var2.R(-974337395);
                        e35.f(uri, str, rg1Var2, 0);
                        rg1Var2.o(false);
                    } else {
                        List list2 = list;
                        if (iIntValue >= list2.size()) {
                            rg1Var2.R(-974206203);
                            e35.d(0, rg1Var2);
                            rg1Var2.o(false);
                        } else {
                            rg1Var2.R(-974149659);
                            Child child = (Child) q40.y0(list2, iIntValue);
                            e35.g(child != null ? child.getCoverArtId() : null, child != null ? child.getTitle() : null, rg1Var2, 0);
                            rg1Var2.o(false);
                        }
                    }
                    rg1Var2.o(true);
                    return j15.a;
                }
            }, rg1Var), rg1Var, 197040);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new wf1(list, i2, z, uri, str, z2, z3, if1Var, gf1Var, i3) { // from class: b73
                public final /* synthetic */ List n;
                public final /* synthetic */ int o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ Uri q;
                public final /* synthetic */ String r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ if1 u;
                public final /* synthetic */ gf1 v;

                @Override // defpackage.wf1
                public final Object invoke(Object obj13, Object obj14) {
                    ((Integer) obj14).getClass();
                    int iO = xl.O(1);
                    e35.e(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (rg1) obj13, iO);
                    return j15.a;
                }
            };
        }
    }

    public static final void f(Uri uri, String str, rg1 rg1Var, int i2) {
        rg1Var.S(1374447570);
        int i3 = (rg1Var.g(uri) ? 4 : 2) | i2 | (rg1Var.e(str) ? 32 : 16);
        if (rg1Var.K(i3 & 1, (i3 & 19) != 18)) {
            Context applicationContext = ((Context) rg1Var.i(hb.b)).getApplicationContext();
            int i4 = i3 & 112;
            boolean zE = rg1Var.e(uri) | (i4 == 32);
            Object objH = rg1Var.H();
            Object obj = j80.a;
            if (zE || objH == obj) {
                objH = uc5.B(null);
                rg1Var.b0(objH);
            }
            b13 b13Var = (b13) objH;
            boolean zE2 = rg1Var.e(b13Var) | rg1Var.g(applicationContext) | rg1Var.g(uri) | (i4 == 32);
            Object objH2 = rg1Var.H();
            if (zE2 || objH2 == obj) {
                objH2 = new ry1(applicationContext, uri, str, b13Var);
                rg1Var.b0(objH2);
            }
            if1 if1Var = (if1) objH2;
            boolean zE3 = rg1Var.e(uri) | rg1Var.e(str);
            Object objH3 = rg1Var.H();
            if (zE3 || objH3 == obj) {
                objH3 = new wr0(if1Var);
                rg1Var.b0(objH3);
            }
            Bitmap bitmap = (Bitmap) b13Var.getValue();
            if (bitmap != null) {
                rg1Var.R(-2049573095);
                gi1.d(new cc(bitmap), null, ji2.b, rg1Var, 25008);
                rg1Var.o(false);
            } else {
                rg1Var.R(-2049353088);
                gi1.c(bu.x(R.drawable.ic_placeholder_radio, rg1Var), null, ji2.b, null, od0.a, 0.0f, rg1Var, 25016, 104);
                rg1Var.o(false);
            }
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new ib(uri, str, i2, 7);
        }
    }

    public static final void g(String str, String str2, rg1 rg1Var, int i2) {
        rg1Var.S(-299945073);
        int i3 = 4;
        int i4 = (rg1Var.e(str) ? 4 : 2) | i2 | (rg1Var.e(str2) ? 32 : 16);
        if (rg1Var.K(i4 & 1, (i4 & 19) != 18)) {
            Object applicationContext = ((Context) rg1Var.i(hb.b)).getApplicationContext();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objH = rg1Var.H();
            Object obj = j80.a;
            if (z || objH == obj) {
                objH = uc5.B(null);
                rg1Var.b0(objH);
            }
            b13 b13Var = (b13) objH;
            boolean zE = rg1Var.e(b13Var) | (i5 == 4) | rg1Var.g(applicationContext);
            Object objH2 = rg1Var.H();
            if (zE || objH2 == obj) {
                objH2 = new dd0(str, applicationContext, b13Var, i3);
                rg1Var.b0(objH2);
            }
            bu.b(str, (if1) objH2, rg1Var);
            Bitmap bitmap = (Bitmap) b13Var.getValue();
            if (bitmap != null) {
                rg1Var.R(-2130593189);
                gi1.d(new cc(bitmap), str2, ji2.b, rg1Var, (i4 & 112) | 24960);
                rg1Var.o(false);
            } else {
                rg1Var.R(-2130372221);
                gi1.c(bu.x(R.drawable.ic_placeholder_song, rg1Var), str2, ji2.b, null, od0.a, 0.0f, rg1Var, 24968 | (i4 & 112), 104);
                rg1Var.o(false);
            }
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new ib(str, str2, i2, 8);
        }
    }

    public static final long h(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final long i(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : gb.n(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    public static final int j(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void k(v3 v3Var, i94 i94Var) {
        e94 e94Var = i94Var.d;
        w03 w03Var = e94Var.n;
        Object objG = e94Var.n.g(n94.w);
        if (objG == null) {
            objG = null;
        }
        if (xl.b(i94Var)) {
            Object objG2 = w03Var.g(d94.x);
            if (objG2 == null) {
                objG2 = null;
            }
            w2 w2Var = (w2) objG2;
            if (w2Var != null) {
                v3Var.b(new o3(android.R.id.accessibilityActionPageUp, w2Var.a));
            }
            Object objG3 = w03Var.g(d94.z);
            if (objG3 == null) {
                objG3 = null;
            }
            w2 w2Var2 = (w2) objG3;
            if (w2Var2 != null) {
                v3Var.b(new o3(android.R.id.accessibilityActionPageDown, w2Var2.a));
            }
            Object objG4 = w03Var.g(d94.y);
            if (objG4 == null) {
                objG4 = null;
            }
            w2 w2Var3 = (w2) objG4;
            if (w2Var3 != null) {
                v3Var.b(new o3(android.R.id.accessibilityActionPageLeft, w2Var3.a));
            }
            Object objG5 = w03Var.g(d94.A);
            w2 w2Var4 = (w2) (objG5 != null ? objG5 : null);
            if (w2Var4 != null) {
                v3Var.b(new o3(android.R.id.accessibilityActionPageRight, w2Var4.a));
            }
        }
    }

    public static void l(lg4 lg4Var, List list, z80 z80Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iC = lg4Var.c((mg1) list.get(i2));
            int iN = lg4Var.N(lg4Var.b, lg4Var.r(iC));
            Object obj = iN < lg4Var.g(lg4Var.b, lg4Var.r(iC + 1)) ? lg4Var.c[lg4Var.h(iN)] : j80.a;
            lv3 lv3Var = obj instanceof lv3 ? (lv3) obj : null;
            if (lv3Var != null) {
                lv3Var.a = z80Var;
            }
        }
    }

    public static void m() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        kf2.n("You must call this method on the main thread");
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final void o(int i2) {
        if (i2 >= 1) {
            return;
        }
        kf2.e(f34.f(i2, "Expected positive parallelism level, but got "));
    }

    public static final void p(sl1 sl1Var, String str, String str2) {
        sl1Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = sl1Var.a;
        arrayList.add(str);
        arrayList.add(qm4.K0(str2).toString());
    }

    public static int q(yw3 yw3Var, qz0 qz0Var, View view, View view2, mw3 mw3Var, boolean z) {
        if (mw3Var.v() == 0 || yw3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mw3.I(view) - mw3.I(view2)) + 1;
        }
        return Math.min(qz0Var.n(), qz0Var.d(view2) - qz0Var.g(view));
    }

    public static int r(yw3 yw3Var, qz0 qz0Var, View view, View view2, mw3 mw3Var, boolean z, boolean z2) {
        if (mw3Var.v() == 0 || yw3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (yw3Var.b() - Math.max(mw3.I(view), mw3.I(view2))) - 1) : Math.max(0, Math.min(mw3.I(view), mw3.I(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(qz0Var.d(view2) - qz0Var.g(view)) / (Math.abs(mw3.I(view) - mw3.I(view2)) + 1))) + (qz0Var.m() - qz0Var.g(view)));
        }
        return iMax;
    }

    public static int s(yw3 yw3Var, qz0 qz0Var, View view, View view2, mw3 mw3Var, boolean z) {
        if (mw3Var.v() == 0 || yw3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yw3Var.b();
        }
        return (int) (((qz0Var.d(view2) - qz0Var.g(view)) / (Math.abs(mw3.I(view) - mw3.I(view2)) + 1)) * yw3Var.b());
    }

    public static final long t(ad3 ad3Var) {
        return ji2.M(ad3Var.l() * ad3Var.p()) + (((long) ad3Var.k()) * ((long) ad3Var.p()));
    }

    public static final long u(long j2) {
        long j3 = (j2 << 1) + 1;
        mx0.n.getClass();
        int i2 = nx0.a;
        return j3;
    }

    public static int v(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int w(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = c35.a[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                return i2 != 4 ? 4 : 8;
            }
        }
        return i3;
    }

    public static final int x(Cursor cursor, String str) {
        String strN0;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            String str3 = columnNames[i3];
                            int i4 = i2 + 1;
                            if (str3.length() < str.length() + 2 || !(xm4.e0(str3, strConcat, false) || (str3.charAt(0) == '`' && xm4.e0(str3, str2, false)))) {
                                i3++;
                                i2 = i4;
                            } else {
                                columnIndex = i2;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            strN0 = ti.n0(63, columnNames2);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            strN0 = "unknown";
        }
        tb4.h("column '", str, "' does not exist. Available columns: ", strN0);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int y(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            if (z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z) {
            return (i3 * 16) / 14;
        }
        return i3;
    }

    public static int z(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }
}
