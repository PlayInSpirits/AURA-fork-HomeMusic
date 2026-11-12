package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.database.Cursor
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.media.MediaFormat
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Log
 *  android.util.Xml
 *  android.view.View
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
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
import com.eddyizm.tempus.App;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
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

public abstract class e35 {
    public static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    public static volatile Handler c;
    public static final char[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final long n = Long.MIN_VALUE;
    public static final int o = 0;

    static {
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

    public static h00 A(byte[] object) {
        int n16 = object[0];
        if (n16 != 127 && n16 != 100 && n16 != 64 && n16 != 113) {
            int n17;
            byte by;
            byte[] byArray = Arrays.copyOf((byte[])object, ((byte[])object).length);
            n16 = byArray[0];
            if (n16 == -2 || n16 == -1 || n16 == 37 || n16 == -14 || n16 == -24) {
                for (n16 = 0; n16 < byArray.length - 1; n16 += 2) {
                    by = byArray[n16];
                    n17 = n16 + 1;
                    byArray[n16] = byArray[n17];
                    byArray[n17] = by;
                }
            }
            object = new h00(byArray.length, byArray);
            if (byArray[0] == 31) {
                h00 h002 = new h00(byArray.length, byArray);
                while (h002.b() >= 16) {
                    h002.t(2);
                    int n18 = h002.i(14) & 0x3FFF;
                    n17 = Math.min(8 - ((h00)object).d, 14);
                    int n19 = ((h00)object).d;
                    n16 = 8 - n19 - n17;
                    byte[] byArray2 = ((h00)object).b;
                    int n26 = ((h00)object).c;
                    byArray2[n26] = by = (byte)((65280 >> n19 | (1 << n16) - 1) & byArray2[n26]);
                    n17 = 14 - n17;
                    byArray2[n26] = (byte)(by | n18 >>> n17 << n16);
                    n16 = n26 + 1;
                    while (true) {
                        byArray2 = ((h00)object).b;
                        if (n17 <= 8) break;
                        byArray2[n16] = (byte)(n18 >>> n17 - 8);
                        n17 -= 8;
                        ++n16;
                    }
                    n26 = 8 - n17;
                    byArray2[n16] = by = (byte)(byArray2[n16] & (1 << n26) - 1);
                    byArray2[n16] = (byte)((n18 & (1 << n17) - 1) << n26 | by);
                    ((h00)object).t(14);
                    ((h00)object).a();
                }
            }
            ((h00)object).o(byArray.length, byArray);
            return object;
        }
        return new h00(((byte[])object).length, (byte[])object);
    }

    public static ArrayList B(Collection collection2) {
        ArrayList<Collection> arrayList = new ArrayList<Collection>(collection2.size());
        for (Collection collection2 : collection2) {
            if (collection2 == null) continue;
            arrayList.add(collection2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Handler C() {
        if (c != null) return c;
        synchronized (e35.class) {
            try {
                Handler handler;
                if (c != null) return c;
                c = handler = new Handler(Looper.getMainLooper());
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static int D(int n16, float f16) {
        return e35.E(Float.floatToIntBits(f16), n16);
    }

    public static int E(int n16, int n17) {
        return n17 * 31 + n16;
    }

    public static int F(int n16, Object object) {
        int n17 = object == null ? 0 : object.hashCode();
        return e35.E(n17, n16);
    }

    public static final void G(String string) {
        string.getClass();
        if (string.length() > 0) {
            int n16 = string.length();
            for (int i16 = 0; i16 < n16; ++i16) {
                char c16 = string.charAt(i16);
                if ('!' <= c16 && c16 < '\u007f') {
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder("Unexpected char 0x");
                ya4.g(16);
                String string2 = Integer.toString(c16, 16);
                string2.getClass();
                String string3 = string2;
                if (string2.length() < 2) {
                    string3 = "0".concat(string2);
                }
                stringBuilder.append(string3);
                stringBuilder.append(" at ");
                stringBuilder.append(i16);
                stringBuilder.append(" in header name: ");
                stringBuilder.append(string);
                throw new IllegalArgumentException(stringBuilder.toString().toString());
            }
            return;
        }
        kf2.n("name is empty");
    }

    public static final void H(String string, String string2) {
        string.getClass();
        string2.getClass();
        int n16 = string.length();
        for (int i16 = 0; i16 < n16; ++i16) {
            char c16 = string.charAt(i16);
            if (c16 == '\t' || ' ' <= c16 && c16 < '\u007f') continue;
            StringBuilder stringBuilder = new StringBuilder("Unexpected char 0x");
            ya4.g(16);
            String string3 = Integer.toString(c16, 16);
            string3.getClass();
            String string4 = string3;
            if (string3.length() < 2) {
                string4 = "0".concat(string3);
            }
            stringBuilder.append(string4);
            stringBuilder.append(" at ");
            stringBuilder.append(i16);
            stringBuilder.append(" in ");
            stringBuilder.append(string2);
            stringBuilder.append(" value");
            string = xe5.l(string2) ? "" : ": ".concat(string);
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    public static boolean I(int n16, int n17) {
        return !(n16 <= 0 && n16 != Integer.MIN_VALUE || n17 <= 0 && n17 != Integer.MIN_VALUE);
        {
        }
    }

    public static void J(MediaFormat mediaFormat, String string, int n16) {
        if (n16 != -1) {
            mediaFormat.setInteger(string, n16);
        }
    }

    public static final String K(String string) {
        String string2 = string != null ? ((Object)qm4.K0(string)).toString() : null;
        string = string2;
        if (string2 == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        string2 = string;
        if (!xm4.k0(string, "http://", true)) {
            string2 = string;
            if (!xm4.k0(string, "https://", true)) {
                string2 = "https://".concat(string);
            }
        }
        return qm4.L0(qm4.H0(string2, '#'), '/');
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static xa1 L(XmlResourceParser object, Resources resources) {
        Object object2;
        int n16;
        int n17;
        Object object3;
        TypedArray typedArray;
        int n18;
        Object object4;
        block36: {
            object4 = TimeUnit.DAYS;
            while ((n18 = object.next()) != 2 && n18 != 1) {
            }
            if (n18 != 2) throw new XmlPullParserException("No start tag found");
            object.require(2, null, "font-family");
            if (!object.getName().equals("font-family")) {
                e35.T((XmlPullParser)object);
                return null;
            }
            typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)object), mt3.b);
            String string = typedArray.getString(0);
            String string2 = typedArray.getString(5);
            String string3 = typedArray.getString(6);
            object3 = typedArray.getString(2);
            n17 = typedArray.getResourceId(1, 0);
            n18 = typedArray.getInteger(3, 1);
            n16 = typedArray.getInteger(4, 500);
            object2 = typedArray.getString(7);
            typedArray.recycle();
            if (string == null || string2 == null) break block36;
            List list = e35.P(resources, n17);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            while (true) {
                Object object5;
                block38: {
                    boolean bl5;
                    boolean bl6;
                    Object object6;
                    block40: {
                        Throwable var0_3;
                        block35: {
                            block39: {
                                block37: {
                                    int n19;
                                    String string4;
                                    block34: {
                                        if (object.next() != 3) {
                                            if (object.getEventType() != 2) continue;
                                            if (object.getName().equals("fallback")) {
                                                block33: {
                                                    typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)object), mt3.d);
                                                    n17 = 3;
                                                    try {
                                                        object6 = typedArray.getString(0);
                                                        string4 = typedArray.getString(1);
                                                        object5 = typedArray.getString(2);
                                                        if (object6 == null) break block33;
                                                        break block34;
                                                    }
                                                    catch (Throwable throwable) {
                                                        var0_3 = throwable;
                                                        break block35;
                                                    }
                                                }
                                                object = new XmlPullParserException("query attribute must be set in fallback element");
                                                throw object;
                                            }
                                            e35.T((XmlPullParser)object);
                                            continue;
                                        }
                                        if (!arrayList.isEmpty()) {
                                            return new ab1(arrayList, n18, n16, (String)object2);
                                        }
                                        if (string3 == null) {
                                            kf2.n("The provider font XML requires query attribute or fallback children.");
                                            return null;
                                        }
                                        arrayList.add(new pa1(string, list, string2, string3, null, null));
                                        if (object3 == null) return new ab1(arrayList, n18, n16, (String)object2);
                                        arrayList.add(new pa1(string, list, string2, (String)object3, null, null));
                                        return new ab1(arrayList, n18, n16, (String)object2);
                                    }
                                    while ((n19 = object.next()) != n17) {
                                        try {
                                            e35.T((XmlPullParser)object);
                                        }
                                        catch (Throwable throwable) {
                                            var0_3 = throwable;
                                            break block35;
                                        }
                                    }
                                    try {
                                        object5 = new pa1(string, list, string2, (String)object6, string4, (String)object5);
                                    }
                                    catch (Throwable throwable) {}
                                    if (!(typedArray instanceof AutoCloseable)) break block37;
                                    ((AutoCloseable)typedArray).close();
                                    break block38;
                                }
                                if (!(typedArray instanceof ExecutorService)) break block39;
                                object6 = (ExecutorService)typedArray;
                                if (object6 == ForkJoinPool.commonPool() || (bl6 = object6.isTerminated())) break block38;
                                object6.shutdown();
                                n17 = 0;
                                break block40;
                            }
                            typedArray.recycle();
                            break block38;
                        }
                        if (typedArray == null) throw var0_3;
                        try {
                            if (typedArray instanceof AutoCloseable) {
                                ((AutoCloseable)typedArray).close();
                                throw var0_3;
                            }
                            if (!(typedArray instanceof ExecutorService)) {
                                typedArray.recycle();
                                throw var0_3;
                            }
                            object2 = (ExecutorService)typedArray;
                            if (object2 == ForkJoinPool.commonPool()) throw var0_3;
                            bl6 = object2.isTerminated();
                            if (bl6) throw var0_3;
                            object2.shutdown();
                            n18 = 0;
                            while (true) {
                                if (bl5 = bl6) {
                                    if (n18 == 0) throw var0_3;
                                    Thread.currentThread().interrupt();
                                    throw var0_3;
                                }
                                try {
                                    bl6 = object2.awaitTermination(1L, (TimeUnit)((Object)object4));
                                }
                                catch (InterruptedException interruptedException) {
                                    bl6 = bl5;
                                    if (n18 != 0) continue;
                                    object2.shutdownNow();
                                    n18 = 1;
                                    bl6 = bl5;
                                }
                            }
                        }
                        catch (Throwable throwable) {
                            var0_3.addSuppressed(throwable);
                        }
                        throw var0_3;
                    }
                    while (!(bl5 = bl6)) {
                        try {
                            bl6 = object6.awaitTermination(1L, (TimeUnit)((Object)object4));
                        }
                        catch (InterruptedException interruptedException) {
                            bl6 = bl5;
                            if (n17 != 0) continue;
                            object6.shutdownNow();
                            n17 = 1;
                            bl6 = bl5;
                        }
                    }
                    if (n17 != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
                arrayList.add(object5);
            }
        }
        object3 = new ArrayList();
        while (true) {
            if (object.next() == 3) {
                if (!((ArrayList)object3).isEmpty()) return new ya1(((ArrayList)object3).toArray(new za1[0]));
                return null;
            }
            if (object.getEventType() != 2) continue;
            if (object.getName().equals("font")) {
                typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)object), mt3.c);
                n18 = 8;
                if (!typedArray.hasValue(8)) {
                    n18 = 1;
                }
                n17 = typedArray.getInt(n18, 400);
                n18 = typedArray.hasValue(6) ? 6 : 2;
                boolean bl7 = 1 == typedArray.getInt(n18, 0);
                n18 = 9;
                if (!typedArray.hasValue(9)) {
                    n18 = 3;
                }
                n16 = typedArray.hasValue(7) ? 7 : 4;
                object4 = typedArray.getString(n16);
                n16 = typedArray.getInt(n18, 0);
                n18 = typedArray.hasValue(5) ? 5 : 0;
                int n26 = typedArray.getResourceId(n18, 0);
                object2 = typedArray.getString(n18);
                typedArray.recycle();
                while (object.next() != 3) {
                    e35.T((XmlPullParser)object);
                }
                ((ArrayList)object3).add(new za1(n17, n16, n26, (String)object2, (String)object4, bl7));
                continue;
            }
            e35.T((XmlPullParser)object);
        }
    }

    /*
     * Exception decompiling
     */
    public static h32 M(l32 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 27->70)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static h32 N(String object) {
        Object object2 = new StringReader((String)object);
        try {
            object = new l32((Reader)object2);
            object2 = e35.M((l32)object);
            object2.getClass();
            if (!(object2 instanceof i32) && ((l32)object).e0() != 10) {
                object = new RuntimeException("Did not consume the entire document.");
                throw object;
            }
            return object2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        catch (MalformedJsonException malformedJsonException) {
            throw new RuntimeException(malformedJsonException);
        }
    }

    public static int O(h00 h002, int[] nArray) {
        int n16;
        int n17 = 0;
        int n18 = 0;
        for (n16 = 0; n16 < 3 && h002.h(); ++n16) {
            ++n18;
        }
        n16 = 0;
        while (n17 < n18) {
            n16 += 1 << nArray[n17];
            ++n17;
        }
        return h002.i(nArray[n18]) + n16;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List P(Resources object, int n16) {
        ArrayList arrayList;
        TypedArray typedArray;
        block13: {
            block12: {
                ArrayList<byte[]> arrayList2;
                block11: {
                    block10: {
                        if (n16 == 0) {
                            return Collections.EMPTY_LIST;
                        }
                        typedArray = object.obtainTypedArray(n16);
                        if (typedArray.length() != 0) break block10;
                        object = Collections.EMPTY_LIST;
                        typedArray.recycle();
                        return object;
                    }
                    arrayList = new ArrayList();
                    if (typedArray.getType(0) != 1) break block11;
                    break block12;
                }
                try {
                    object = object.getStringArray(n16);
                    arrayList2 = new ArrayList<byte[]>();
                    int n17 = ((String[])object).length;
                    for (n16 = 0; n16 < n17; ++n16) {
                        arrayList2.add(Base64.decode((String)object[n16], (int)0));
                    }
                }
                catch (Throwable throwable) {}
                arrayList.add(arrayList2);
                break block13;
                typedArray.recycle();
                throw throwable;
            }
            for (n16 = 0; n16 < typedArray.length(); ++n16) {
                int n18 = typedArray.getResourceId(n16, 0);
                if (n18 == 0) continue;
                String[] stringArray = object.getStringArray(n18);
                ArrayList<byte[]> arrayList3 = new ArrayList<byte[]>();
                int n19 = stringArray.length;
                for (n18 = 0; n18 < n19; ++n18) {
                    arrayList3.add(Base64.decode((String)stringArray[n18], (int)0));
                }
                {
                    arrayList.add(arrayList3);
                }
            }
        }
        typedArray.recycle();
        return arrayList;
    }

    public static final String Q() {
        ((Object)((Object)App.b())).getClass();
        Object object = App.c();
        object.getClass();
        String string = e35.K(object.getString("homemusic_hub_url", null));
        object = string;
        if (string == null) {
            string = e35.K("https://146.103.112.215:8445");
            object = string;
            if (string == null) {
                object = "";
            }
        }
        return object;
    }

    public static void R(MediaFormat mediaFormat, List list) {
        for (int i16 = 0; i16 < list.size(); ++i16) {
            mediaFormat.setByteBuffer(f34.f(i16, "csd-"), ByteBuffer.wrap((byte[])list.get(i16)));
        }
    }

    public static void S(View view, CharSequence object) {
        if (Build.VERSION.SDK_INT >= 26) {
            hv4.a(view, (CharSequence)object);
            return;
        }
        jv4 jv42 = jv4.x;
        if (jv42 != null && jv42.n == view) {
            jv4.b(null);
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = jv4.y;
            if (object != null && ((jv4)object).n == view) {
                ((jv4)object).a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new jv4(view, (CharSequence)object);
    }

    public static void T(XmlPullParser xmlPullParser) {
        int n16 = 1;
        while (n16 > 0) {
            int n17 = xmlPullParser.next();
            if (n17 != 2) {
                if (n17 != 3) continue;
                --n16;
                continue;
            }
            ++n16;
        }
    }

    public static final int U(long l16) {
        float[] fArray = s50.a;
        return (int)(x40.a(l16, s50.e) >>> 32);
    }

    public static final long V(int n16) {
        Object object = ox0.q;
        if (object.compareTo(object) <= 0) {
            long l16 = n16;
            l16 = TimeUnit.NANOSECONDS.convert(l16, TimeUnit.SECONDS);
            object = mx0.n;
            n16 = nx0.a;
            return l16 << 1;
        }
        return e35.W(n16, object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final long W(long l16, ox0 object) {
        long l17;
        int n16;
        long l18;
        long l19;
        block14: {
            block15: {
                block16: {
                    TimeUnit timeUnit = ((ox0)((Object)object)).n;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    l19 = timeUnit.convert(4611686018426999999L, timeUnit2);
                    if (-l19 <= l16 && l16 <= l19) {
                        l16 = timeUnit2.convert(l16, timeUnit);
                        object = mx0.n;
                        int n17 = nx0.a;
                        return l16 << 1;
                    }
                    if (((Enum)object).compareTo(ox0.p) < 0) return e35.u(gb.n(TimeUnit.MILLISECONDS.convert(l16, timeUnit), -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
                    l18 = Long.signum(l16);
                    l19 = l16;
                    if (l16 < -9223372036854775807L) {
                        l19 = -9223372036854775807L;
                    }
                    l19 = Math.abs(l19);
                    n16 = ((Enum)object).ordinal();
                    l17 = 0L;
                    if (n16 == 2) break block15;
                    if (n16 == 3) break block16;
                    if (n16 != 4) {
                        if (n16 != 5) {
                            if (n16 != 6) {
                                mj0.g(object, "Wrong unit for millisMultiplier: ");
                                return 0L;
                            }
                            l16 = 86400000L;
                            break block14;
                        } else {
                            l16 = 3600000L;
                        }
                        break block14;
                    } else {
                        l16 = 60000L;
                    }
                    break block14;
                }
                l16 = 1000L;
                break block14;
            }
            l16 = 1L;
        }
        if (l19 == 0L) {
            l16 = l17;
            return e35.u(l18 * l16);
        }
        l17 = 0x3FFFFFFFFFFFFFFFL;
        if (l19 == 1L) {
            if (l16 <= 0x3FFFFFFFFFFFFFFFL) return e35.u(l18 * l16);
        } else if (l16 == 1L) {
            l16 = l19;
            if (l19 <= 0x3FFFFFFFFFFFFFFFL) return e35.u(l18 * l16);
        } else {
            n16 = 128 - Long.numberOfLeadingZeros(l19) - Long.numberOfLeadingZeros(l16);
            if (n16 < 63) {
                l16 = l19 * l16;
                return e35.u(l18 * l16);
            }
            if (n16 <= 63) {
                l19 *= l16;
                l16 = l19;
                if (l19 <= 0x3FFFFFFFFFFFFFFFL) return e35.u(l18 * l16);
            }
        }
        l16 = l17;
        return e35.u(l18 * l16);
    }

    public static String X(int n16) {
        if (n16 == 0) {
            return "Clear";
        }
        if (n16 == 1) {
            return "Src";
        }
        if (n16 == 2) {
            return "Dst";
        }
        if (n16 == 3) {
            return "SrcOver";
        }
        if (n16 == 4) {
            return "DstOver";
        }
        if (n16 == 5) {
            return "SrcIn";
        }
        if (n16 == 6) {
            return "DstIn";
        }
        if (n16 == 7) {
            return "SrcOut";
        }
        if (n16 == 8) {
            return "DstOut";
        }
        if (n16 == 9) {
            return "SrcAtop";
        }
        if (n16 == 10) {
            return "DstAtop";
        }
        if (n16 == 11) {
            return "Xor";
        }
        if (n16 == 12) {
            return "Plus";
        }
        if (n16 == 13) {
            return "Modulate";
        }
        if (n16 == 14) {
            return "Screen";
        }
        if (n16 == 15) {
            return "Overlay";
        }
        if (n16 == 16) {
            return "Darken";
        }
        if (n16 == 17) {
            return "Lighten";
        }
        if (n16 == 18) {
            return "ColorDodge";
        }
        if (n16 == 19) {
            return "ColorBurn";
        }
        if (n16 == 20) {
            return "HardLight";
        }
        if (n16 == 21) {
            return "Softlight";
        }
        if (n16 == 22) {
            return "Difference";
        }
        if (n16 == 23) {
            return "Exclusion";
        }
        if (n16 == 24) {
            return "Multiply";
        }
        if (n16 == 25) {
            return "Hue";
        }
        if (n16 == 26) {
            return "Saturation";
        }
        if (n16 == 27) {
            return "Color";
        }
        if (n16 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    /*
     * Unable to fully structure code
     */
    public static final long a(float red, float green, float blue, float alpha, p50 colorSpace) {
        if (colorSpace.c()) {
            float a = Math.max(0.0f, Math.min(1.0f, alpha));
            float r = Math.max(0.0f, Math.min(1.0f, red));
            float g = Math.max(0.0f, Math.min(1.0f, green));
            float b = Math.max(0.0f, Math.min(1.0f, blue));
            int argb = ((int) (a * 255.0f + 0.5f) << 24)
                    | ((int) (r * 255.0f + 0.5f) << 16)
                    | ((int) (g * 255.0f + 0.5f) << 8)
                    | (int) (b * 255.0f + 0.5f);
            int ignored = x40.h;
            return ((long) argb) << 32;
        }

        if ((int) (colorSpace.b >> 32) != 3) {
            bz1.a("Color only works with ColorSpaces with 3 components");
        }
        int colorSpaceId = colorSpace.c;
        if (colorSpaceId == -1) {
            bz1.a("Unknown color space, please use a color space in ColorSpaces");
        }

        float r = Math.max(colorSpace.b(0), Math.min(colorSpace.a(0), red));
        float g = Math.max(colorSpace.b(1), Math.min(colorSpace.a(1), green));
        float b = Math.max(colorSpace.b(2), Math.min(colorSpace.a(2), blue));
        float a = Math.max(0.0f, Math.min(1.0f, alpha));

        long packed = ((long) colorSpaceId) & 63L;
        packed |= (((long) packHalf(r)) & 65535L) << 48;
        packed |= (((long) packHalf(g)) & 65535L) << 32;
        packed |= (((long) packHalf(b)) & 65535L) << 16;
        packed |= (((long) ((int) (a * 1023.0f + 0.5f))) & 1023L) << 6;
        int ignored = x40.h;
        return packed;
    }

    private static int packHalf(float value) {
        int bits = Float.floatToRawIntBits(value);
        int sign = bits >>> 31;
        int exponent = (bits >>> 23) & 255;
        int mantissa = bits & 0x7FFFFF;
        int halfExponent;

        if (exponent == 255) {
            mantissa = mantissa == 0 ? 0 : 512;
            halfExponent = 31;
        } else {
            halfExponent = exponent - 112;
            if (halfExponent >= 31) {
                mantissa = 0;
                halfExponent = 49;
            } else if (halfExponent <= 0) {
                if (halfExponent >= -10) {
                    int shifted = (mantissa | 0x800000) >> (1 - halfExponent);
                    if ((shifted & 4096) != 0) {
                        shifted += 8192;
                    }
                    mantissa = shifted >> 13;
                    halfExponent = 0;
                } else {
                    mantissa = 0;
                    halfExponent = 0;
                }
            } else {
                mantissa >>= 13;
                if ((bits & 4096) != 0) {
                    return ((((halfExponent << 10) | mantissa) + 1) | (sign << 15)) & 65535;
                }
            }
        }

        return (mantissa | (sign << 15) | (halfExponent << 10)) & 65535;
    }

    public static final long b(int n16) {
        long l16 = n16;
        n16 = x40.h;
        return l16 << 32;
    }

    public static final long c(long l16) {
        int n16 = x40.h;
        return l16 << 32;
    }

    public static final void d(int n16, rg1 object) {
        block28: {
            block19: {
                int n17;
                long l16;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                Object object8;
                block25: {
                    block27: {
                        Object object9;
                        block26: {
                            boolean bl5;
                            block24: {
                                block23: {
                                    block22: {
                                        block21: {
                                            block20: {
                                                ((rg1)object).S(-2092244638);
                                                bl5 = n16 != 0;
                                                if (!((rg1)object).K(n16 & 1, bl5)) break block19;
                                                object8 = ((rg1)object).H();
                                                object7 = j80.a;
                                                object6 = object8;
                                                if (object8 == object7) {
                                                    object6 = new ty1();
                                                    ((rg1)object).b0(object6);
                                                }
                                                object5 = (ty1)object6;
                                                ((ty1)object5).a(0, (rg1)object);
                                                object4 = new py1(au0.T(800, null, 6), hz3.o);
                                                object3 = Float.valueOf(0.08f);
                                                object9 = Float.valueOf(0.2f);
                                                object6 = object8 = ((rg1)object).H();
                                                if (object8 == object7) {
                                                    object6 = new qy1((ty1)object5, (Float)object3, (Float)object9, (py1)object4);
                                                    ((rg1)object).b0(object6);
                                                }
                                                object2 = (qy1)object6;
                                                bl5 = ((rg1)object).g(object4);
                                                object8 = ((rg1)object).H();
                                                if (bl5) break block20;
                                                object6 = object8;
                                                if (object8 != object7) break block21;
                                            }
                                            object6 = new uy1((Float)object3, (qy1)object2, (Float)object9, (py1)object4);
                                            ((rg1)object).b0(object6);
                                        }
                                        object6 = (gf1)object6;
                                        object8 = ((rg1)object).M.b.n;
                                        ((ya3)object8).x0(ma3.f);
                                        rr2.R((ya3)object8, 0, object6);
                                        bl5 = ((rg1)object).g(object5);
                                        object8 = ((rg1)object).H();
                                        if (bl5) break block22;
                                        object6 = object8;
                                        if (object8 != object7) break block23;
                                    }
                                    object6 = new o(12, object5, object2);
                                    ((rg1)object).b0(object6);
                                }
                                bu.b(object2, (if1)object6, (rg1)object);
                                object6 = ji2.b;
                                l16 = x40.c;
                                object5 = kb4.i((dx2)object6, x40.b(l16, ((Number)((qy1)object2).p.getValue()).floatValue()));
                                object2 = fz0.s;
                                object6 = object8 = (ui2)lu.a.g(object2);
                                if (object8 == null) {
                                    object6 = new ou((hs)object2, false);
                                }
                                n17 = Long.hashCode(((rg1)object).T);
                                object3 = ((rg1)object).k();
                                object8 = j51.E((rg1)object, (dx2)object5);
                                e80.e.getClass();
                                ((rg1)object).U();
                                if (((rg1)object).S) {
                                    ((rg1)object).j();
                                } else {
                                    ((rg1)object).e0();
                                }
                                object5 = fz0.I;
                                l93.c0((wf1)object5, (rg1)object, object6);
                                object2 = fz0.H;
                                l93.c0((wf1)object2, (rg1)object, object3);
                                object4 = fz0.J;
                                l93.c0((wf1)object4, (rg1)object, n17);
                                l93.a0((rg1)object);
                                object3 = fz0.G;
                                l93.c0((wf1)object3, (rg1)object, object8);
                                object9 = fz0.z;
                                object6 = w50.a;
                                if (!((fs)object9).equals(fz0.y)) break block24;
                                ((rg1)object).R(-1446604504);
                                ((rg1)object).o(false);
                                object6 = w50.a;
                                break block25;
                            }
                            ((rg1)object).R(-1446550657);
                            bl5 = ((rg1)object).e(gi.a);
                            object8 = ((rg1)object).H();
                            if (bl5) break block26;
                            object6 = object8;
                            if (object8 != object7) break block27;
                        }
                        object6 = new y50((fs)object9);
                        ((rg1)object).b0(object6);
                    }
                    object6 = (y50)object6;
                    ((rg1)object).o(false);
                }
                n17 = Long.hashCode(((rg1)object).T);
                object7 = ((rg1)object).k();
                object8 = j51.E((rg1)object, ax2.a);
                ((rg1)object).U();
                if (((rg1)object).S) {
                    ((rg1)object).j();
                } else {
                    ((rg1)object).e0();
                }
                l93.c0((wf1)object5, (rg1)object, object6);
                l93.c0((wf1)object2, (rg1)object, object7);
                l93.c0((wf1)object4, (rg1)object, n17);
                l93.a0((rg1)object);
                l93.c0((wf1)object3, (rg1)object, object8);
                gi1.c(bu.x(2131231241, (rg1)object), null, au0.G(new uf4(96.0f, 96.0f, 96.0f, 96.0f), null, 1044475), null, null, 0.0f, (rg1)object, 440, 120);
                object8 = new uf4(Float.NaN, 16.0f, Float.NaN, 16.0f);
                object6 = w01.e;
                n17 = Long.hashCode(((rg1)object).T);
                object8 = j51.E((rg1)object, (dx2)object8);
                object7 = ((rg1)object).k();
                ((rg1)object).U();
                if (((rg1)object).S) {
                    ((rg1)object).j();
                } else {
                    ((rg1)object).e0();
                }
                l93.c0((wf1)object5, (rg1)object, object6);
                l93.c0((wf1)object2, (rg1)object, object7);
                l93.a0((rg1)object);
                l93.c0((wf1)object3, (rg1)object, object8);
                l93.c0((wf1)object4, (rg1)object, n17);
                ((rg1)object).o(true);
                jz4.a(((Resources)((rg1)object).i(hb.c)).getString(2131952120), null, new zs4(0xFF7FFC, l16, su3.v(15)), 0, false, 0, 0, (rg1)object, 0);
                ((rg1)object).o(true);
                ((rg1)object).o(true);
                break block28;
            }
            ((rg1)object).N();
        }
        object = ((rg1)object).p();
        if (object != null) {
            ((lv3)object).d = new d60(n16);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void e(List list, int n16, boolean bl5, Uri uri, String string, boolean bl6, boolean bl7, if1 if12, gf1 gf12, rg1 object, int n17) {
        block42: {
            block31: {
                boolean var21_31;
                float f16;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                block41: {
                    block40: {
                        Boolean bl8;
                        Object object6;
                        Object object7;
                        i80 i802;
                        Object object8;
                        b13 b132;
                        int n27;
                        int n28;
                        int n29;
                        block39: {
                            block38: {
                                block37: {
                                    block36: {
                                        block35: {
                                            block34: {
                                                block33: {
                                                    block32: {
                                                        boolean var21_22;
                                                        list.getClass();
                                                        ((rg1)object).S(321351878);
                                                        n29 = ((rg1)object).g(list) ? 4 : 2;
                                                        n28 = ((rg1)object).d(n16) ? 32 : 16;
                                                        n27 = ((rg1)object).f(bl5) ? 256 : 128;
                                                        int n36 = ((rg1)object).g(uri) ? 2048 : 1024;
                                                        int n37 = ((rg1)object).e(string) ? 16384 : 8192;
                                                        int n38 = ((rg1)object).f(bl6) ? 131072 : 65536;
                                                        int n39 = ((rg1)object).f(bl7) ? 0x100000 : 524288;
                                                        int n46 = ((rg1)object).g(if12) ? 0x800000 : 0x400000;
                                                        int n47 = ((rg1)object).g(gf12) ? 0x4000000 : 0x2000000;
                                                        n27 = n17 | n29 | n28 | n27 | n36 | n37 | n38 | n39 | n46 | n47;
                                                        var21_22 = (0x2492493 & n27) != 0x2492492;
                                                        if (!((rg1)object).K(n27 & 1, (boolean)var21_22)) break block31;
                                                        object5 = uc5.S(n16, (rg1)object);
                                                        b132 = uc5.S(if12, (rg1)object);
                                                        uc5.S(gf12, (rg1)object);
                                                        n29 = bl6 && !bl5 && !list.isEmpty() ? 1 : 0;
                                                        n28 = !bl5 && !list.isEmpty() ? list.size() + n29 : 1;
                                                        object4 = uc5.S(n28, (rg1)object);
                                                        if (bl5) {
                                                            n29 = 0;
                                                        } else if (n29 != 0 && bl7) {
                                                            n29 = list.size();
                                                        } else {
                                                            n29 = n28 - 1;
                                                            if (n29 < 0) {
                                                                n29 = 0;
                                                            }
                                                            n29 = gb.m(n16, 0, n29);
                                                        }
                                                        boolean bl10 = ((rg1)object).d(n28);
                                                        object8 = ((rg1)object).H();
                                                        i802 = j80.a;
                                                        if (bl10) break block32;
                                                        object3 = object8;
                                                        if (object8 != i802) break block33;
                                                    }
                                                    object3 = new y63(n28);
                                                    ((rg1)object).b0(object3);
                                                }
                                                object7 = (gf1)object3;
                                                object3 = ed3.a;
                                                object2 = lm0.H;
                                                boolean bl11 = ((rg1)object).d(n29);
                                                boolean bl12 = ((rg1)object).c(0.0f);
                                                boolean bl13 = ((rg1)object).e(object7);
                                                object8 = ((rg1)object).H();
                                                if (bl11 | bl12 | bl13) break block34;
                                                object3 = object8;
                                                if (object8 != i802) break block35;
                                            }
                                            object3 = new bd3(n29, (gf1)object7);
                                            ((rg1)object).b0(object3);
                                        }
                                        object3 = (gf1)object3;
                                        object2 = (lm0)gh0.z(new Object[0], (m54)object2, (gf1)object3, (rg1)object, 0);
                                        ((lm0)object2).G.setValue(object7);
                                        object6 = ((ad3)object2).p;
                                        object3 = object8 = ((rg1)object).H();
                                        if (object8 == i802) {
                                            object3 = uc5.B(Boolean.FALSE);
                                            ((rg1)object).b0(object3);
                                        }
                                        object7 = (b13)object3;
                                        boolean bl14 = ((rg1)object).e(object6);
                                        object8 = ((rg1)object).H();
                                        if (bl14) break block36;
                                        object3 = object8;
                                        if (object8 != i802) break block37;
                                    }
                                    object3 = new p(object6, object7, null, 9);
                                    ((rg1)object).b0(object3);
                                }
                                bu.c((wf1)object3, (rg1)object, object6);
                                object3 = object8 = ((rg1)object).H();
                                if (object8 == i802) {
                                    object3 = uc5.B(Boolean.FALSE);
                                    ((rg1)object).b0(object3);
                                }
                                object6 = (b13)object3;
                                bl8 = (Boolean)object7.getValue();
                                bl8.getClass();
                                boolean bl15 = ((rg1)object).e(object7);
                                object8 = ((rg1)object).H();
                                if (bl15) break block38;
                                object3 = object8;
                                if (object8 != i802) break block39;
                            }
                            object3 = new e73((b13)object7, (b13)object6, null);
                            ((rg1)object).b0(object3);
                        }
                        bu.c((wf1)object3, (rg1)object, bl8);
                        boolean bl16 = ((rg1)object).e(object7);
                        boolean bl17 = ((rg1)object).d(n28);
                        boolean bl18 = ((rg1)object).d(n29);
                        boolean bl19 = ((rg1)object).e(object2);
                        object3 = ((rg1)object).H();
                        if (bl16 | bl17 | bl18 | bl19 || object3 == i802) {
                            object3 = new f73(n29, n28, (lm0)object2, (b13)object7, null);
                            ((rg1)object).b0(object3);
                        }
                        bu.c((wf1)object3, (rg1)object, n29);
                        int n18 = ((rg1)object).e(object2);
                        n29 = (n27 &= 0x380) == 256 ? 1 : 0;
                        int n19 = ((rg1)object).e(object4);
                        int n26 = ((rg1)object).e(object5);
                        int n36 = ((rg1)object).e(b132);
                        object3 = ((rg1)object).H();
                        if ((n18 | n29 | n19 | n26 | n36) != 0 || object3 == i802) {
                            object3 = new h73((lm0)object2, bl5, (b13)object6, (b13)object4, (b13)object5, b132, null);
                            ((rg1)object).b0(object3);
                        }
                        bu.c((wf1)object3, (rg1)object, object2);
                        ((Object)((Object)App.b())).getClass();
                        if (App.c().getBoolean("rounded_corner", false)) {
                            ((Object)((Object)App.b())).getClass();
                            object3 = App.c().getString("rounded_corner_size", "12");
                            object3.getClass();
                            f16 = Integer.parseInt((String)object3);
                        } else {
                            f16 = 0.0f;
                        }
                        object5 = ji2.b;
                        object4 = q05.b(2);
                        var21_31 = !bl5 && n28 > 1;
                        n29 = n27 == 256 ? 1 : 0;
                        int n37 = ((rg1)object).g(list);
                        object8 = ((rg1)object).H();
                        if ((n37 | n29) != 0) break block40;
                        object3 = object8;
                        if (object8 != i802) break block41;
                    }
                    object3 = new z63(list, bl5);
                    ((rg1)object).b0(object3);
                }
                uc5.a((lm0)object2, (dx2)object5, (ac3)object4, null, 16.0f, null, null, (boolean)var21_31, (if1)object3, null, null, null, fh0.w(325113351, new a73((lm0)object2, f16, gf12, bl5, uri, string, list), (rg1)object), (rg1)object, 197040);
                break block42;
            }
            ((rg1)object).N();
        }
        object = ((rg1)object).p();
        if (object != null) {
            ((lv3)object).d = new b73(list, n16, bl5, uri, string, bl6, bl7, if12, gf12, n17);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void f(Uri uri, String string, rg1 object, int n16) {
        block21: {
            block14: {
                b13 b132;
                Object object2;
                block20: {
                    Object object3;
                    block19: {
                        i80 i802;
                        Object object4;
                        block18: {
                            block17: {
                                int n17;
                                int n26;
                                int n27;
                                block16: {
                                    block15: {
                                        boolean var7_8;
                                        ((rg1)object).S(1374447570);
                                        n27 = ((rg1)object).g(uri) ? 4 : 2;
                                        n26 = ((rg1)object).e(string) ? 32 : 16;
                                        n27 = n27 | n16 | n26;
                                        n26 = 1;
                                        var7_8 = (n27 & 0x13) != 18;
                                        if (!((rg1)object).K(n27 & 1, (boolean)var7_8)) break block14;
                                        object3 = ((Context)((rg1)object).i(hb.b)).getApplicationContext();
                                        int n18 = ((rg1)object).e(uri);
                                        n17 = n27 & 0x70;
                                        n27 = n17 == 32 ? 1 : 0;
                                        object4 = ((rg1)object).H();
                                        i802 = j80.a;
                                        if ((n18 | n27) != 0) break block15;
                                        object2 = object4;
                                        if (object4 != i802) break block16;
                                    }
                                    object2 = uc5.B(null);
                                    ((rg1)object).b0(object2);
                                }
                                b132 = (b13)object2;
                                boolean bl6 = ((rg1)object).e(b132);
                                boolean bl7 = ((rg1)object).g(object3);
                                int n19 = ((rg1)object).g(uri);
                                n27 = n17 == 32 ? n26 : 0;
                                object4 = ((rg1)object).H();
                                if ((bl6 | bl7 | n19 | n27) != 0) break block17;
                                object2 = object4;
                                if (object4 != i802) break block18;
                            }
                            object2 = new ry1((Context)object3, uri, string, b132);
                            ((rg1)object).b0(object2);
                        }
                        object3 = (if1)object2;
                        boolean bl8 = ((rg1)object).e(uri);
                        boolean bl9 = ((rg1)object).e(string);
                        object4 = ((rg1)object).H();
                        if (bl8 | bl9) break block19;
                        object2 = object4;
                        if (object4 != i802) break block20;
                    }
                    object2 = new wr0((if1)object3);
                    ((rg1)object).b0(object2);
                }
                object2 = (wr0)object2;
                object2 = (Bitmap)b132.getValue();
                if (object2 != null) {
                    ((rg1)object).R(-2049573095);
                    gi1.d(new cc((Bitmap)object2), null, ji2.b, (rg1)object, 25008);
                    ((rg1)object).o(false);
                } else {
                    ((rg1)object).R(-2049353088);
                    gi1.c(bu.x(2131231240, (rg1)object), null, ji2.b, null, od0.a, 0.0f, (rg1)object, 25016, 104);
                    ((rg1)object).o(false);
                }
                break block21;
            }
            ((rg1)object).N();
        }
        object = ((rg1)object).p();
        if (object != null) {
            ((lv3)object).d = new ib((Comparable)uri, string, n16, 7);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void g(String string, String string2, rg1 object, int n16) {
        block16: {
            block11: {
                b13 b132;
                Object object2;
                int n17;
                block15: {
                    Context context;
                    block14: {
                        i80 i802;
                        Object object3;
                        int n18;
                        int n26;
                        int n27;
                        block13: {
                            block12: {
                                boolean var8_9;
                                ((rg1)object).S(-299945073);
                                n27 = ((rg1)object).e(string) ? 4 : 2;
                                n26 = ((rg1)object).e(string2) ? 32 : 16;
                                n17 = n27 | n16 | n26;
                                n26 = 1;
                                var8_9 = (n17 & 0x13) != 18;
                                if (!((rg1)object).K(n17 & 1, (boolean)var8_9)) break block11;
                                context = ((Context)((rg1)object).i(hb.b)).getApplicationContext();
                                n18 = n17 & 0xE;
                                n27 = n18 == 4 ? 1 : 0;
                                object3 = ((rg1)object).H();
                                i802 = j80.a;
                                if (n27 != 0) break block12;
                                object2 = object3;
                                if (object3 != i802) break block13;
                            }
                            object2 = uc5.B(null);
                            ((rg1)object).b0(object2);
                        }
                        b132 = (b13)object2;
                        n27 = n18 == 4 ? n26 : 0;
                        int n19 = ((rg1)object).e(b132);
                        int n28 = ((rg1)object).g(context);
                        object3 = ((rg1)object).H();
                        if ((n19 | n27 | n28) != 0) break block14;
                        object2 = object3;
                        if (object3 != i802) break block15;
                    }
                    object2 = new dd0(string, context, b132, 4);
                    ((rg1)object).b0(object2);
                }
                bu.b(string, (if1)object2, (rg1)object);
                object2 = (Bitmap)b132.getValue();
                if (object2 != null) {
                    ((rg1)object).R(-2130593189);
                    gi1.d(new cc((Bitmap)object2), string2, ji2.b, (rg1)object, n17 & 0x70 | 0x6180);
                    ((rg1)object).o(false);
                } else {
                    ((rg1)object).R(-2130372221);
                    gi1.c(bu.x(2131231241, (rg1)object), string2, ji2.b, null, od0.a, 0.0f, (rg1)object, 0x6188 | n17 & 0x70, 104);
                    ((rg1)object).o(false);
                }
                break block16;
            }
            ((rg1)object).N();
        }
        object = ((rg1)object).p();
        if (object != null) {
            ((lv3)object).d = new ib((Comparable)((Object)string), string2, n16, 8);
        }
    }

    public static final long h(float f16, float f17) {
        long l16 = Float.floatToRawIntBits(f16);
        return (long)Float.floatToRawIntBits(f17) & 0xFFFFFFFFL | l16 << 32;
    }

    public static final long i(long l16, long l17) {
        if (l16 != 0x3FFFFFFFFFFFFFFFL && l16 != -4611686018427387903L) {
            if (l17 != 0x3FFFFFFFFFFFFFFFL && l17 != -4611686018427387903L) {
                return gb.n(l16 + l17, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL);
            }
            return l17;
        }
        if (-4611686018427387903L < l17 && l17 < 0x3FFFFFFFFFFFFFFFL || (l17 ^ l16) >= 0L) {
            return l16;
        }
        return 9223372036854759646L;
    }

    public static final int j(char c16) {
        if ('0' <= c16 && c16 < ':') {
            return c16 - 48;
        }
        if ('a' <= c16 && c16 < 'g') {
            return c16 - 87;
        }
        if ('A' <= c16 && c16 < 'G') {
            return c16 - 55;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected hex digit: ");
        stringBuilder.append(c16);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final void k(v3 v36, i94 object) {
        e94 e942 = ((i94)object).d;
        w03 w032 = e942.n;
        Object object2 = n94.w;
        Object object3 = e942.n.g(object2);
        e942 = null;
        object2 = object3;
        if (object3 == null) {
            object2 = null;
        }
        object2 = (m24)object2;
        if (xl.b((i94)object)) {
            object = object2 = w032.g(d94.x);
            if (object2 == null) {
                object = null;
            }
            if ((object = (w2)object) != null) {
                v36.b(new o3(16908358, ((w2)object).a));
            }
            object = object2 = w032.g(d94.z);
            if (object2 == null) {
                object = null;
            }
            if ((object = (w2)object) != null) {
                v36.b(new o3(16908359, ((w2)object).a));
            }
            object = object2 = w032.g(d94.y);
            if (object2 == null) {
                object = null;
            }
            if ((object = (w2)object) != null) {
                v36.b(new o3(16908360, ((w2)object).a));
            }
            if ((object = w032.g(d94.A)) == null) {
                object = e942;
            }
            if ((object = (w2)object) != null) {
                v36.b(new o3(16908361, ((w2)object).a));
            }
        }
    }

    public static void l(lg4 lg42, List list, z80 z802) {
        if (!list.isEmpty()) {
            int n16 = list.size();
            for (int i16 = 0; i16 < n16; ++i16) {
                Object object;
                int n17 = lg42.c((mg1)list.get(i16));
                int n18 = lg42.r(n17);
                if ((n18 = lg42.N(lg42.b, n18)) < lg42.g(lg42.b, lg42.r(n17 + 1))) {
                    n17 = lg42.h(n18);
                    object = lg42.c[n17];
                } else {
                    object = j80.a;
                }
                object = object instanceof lv3 ? (lv3)object : null;
                if (object == null) continue;
                ((lv3)object).a = z802;
            }
        }
    }

    public static void m() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        kf2.n("You must call this method on the main thread");
    }

    public static boolean n(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static final void o(int n16) {
        if (n16 >= 1) {
            return;
        }
        kf2.e(f34.f(n16, "Expected positive parallelism level, but got "));
    }

    public static final void p(sl1 object, String string, String string2) {
        object.getClass();
        string.getClass();
        string2.getClass();
        object = ((sl1)object).a;
        ((ArrayList)object).add(string);
        ((ArrayList)object).add(((Object)qm4.K0(string2)).toString());
    }

    public static int q(yw3 yw32, qz0 qz02, View view, View view2, mw3 mw32, boolean bl5) {
        if (mw32.v() != 0 && yw32.b() != 0 && view != null && view2 != null) {
            if (!bl5) {
                return Math.abs(mw3.I(view) - mw3.I(view2)) + 1;
            }
            int n16 = qz02.d(view2);
            int n17 = qz02.g(view);
            return Math.min(qz02.n(), n16 - n17);
        }
        return 0;
    }

    public static int r(yw3 yw32, qz0 qz02, View view, View view2, mw3 mw32, boolean bl5, boolean bl6) {
        if (mw32.v() != 0 && yw32.b() != 0 && view != null && view2 != null) {
            int n16 = Math.min(mw3.I(view), mw3.I(view2));
            int n17 = Math.max(mw3.I(view), mw3.I(view2));
            n17 = bl6 ? Math.max(0, yw32.b() - n17 - 1) : Math.max(0, n16);
            if (!bl5) {
                return n17;
            }
            n16 = Math.abs(qz02.d(view2) - qz02.g(view));
            int n18 = Math.abs(mw3.I(view) - mw3.I(view2));
            float f16 = (float)n16 / (float)(n18 + 1);
            return Math.round((float)n17 * f16 + (float)(qz02.m() - qz02.g(view)));
        }
        return 0;
    }

    public static int s(yw3 yw32, qz0 qz02, View view, View view2, mw3 mw32, boolean bl5) {
        if (mw32.v() != 0 && yw32.b() != 0 && view != null && view2 != null) {
            if (!bl5) {
                return yw32.b();
            }
            int n16 = qz02.d(view2);
            int n17 = qz02.g(view);
            int n18 = Math.abs(mw3.I(view) - mw3.I(view2));
            return (int)((float)(n16 - n17) / (float)(n18 + 1) * (float)yw32.b());
        }
        return 0;
    }

    public static final long t(ad3 ad32) {
        long l16 = ad32.k();
        long l17 = ad32.p();
        return ji2.M(ad32.l() * (float)ad32.p()) + l16 * l17;
    }

    public static final long u(long l16) {
        mx0.n.getClass();
        int n16 = nx0.a;
        return (l16 << 1) + 1L;
    }

    public static int v(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                int n16 = bitmap.getAllocationByteCount();
                return n16;
            }
            catch (NullPointerException nullPointerException) {
                int n17 = bitmap.getHeight();
                return bitmap.getRowBytes() * n17;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        stringBuilder.append(bitmap);
        int n18 = bitmap.getWidth();
        int n19 = bitmap.getHeight();
        bitmap = bitmap.getConfig();
        stringBuilder.append("[");
        stringBuilder.append(n18);
        stringBuilder.append("x");
        stringBuilder.append(n19);
        stringBuilder.append("] ");
        stringBuilder.append(bitmap);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static int w(Bitmap.Config config) {
        Bitmap.Config config2 = config;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        int n16 = c35.a[config2.ordinal()];
        int n17 = 1;
        if (n16 != 1) {
            int n18;
            n17 = n18 = 2;
            if (n16 != 2) {
                n17 = n18;
                if (n16 != 3) {
                    if (n16 != 4) {
                        return 4;
                    }
                    return 8;
                }
            }
        }
        return n17;
    }

    public static final int x(Cursor object, String string) {
        object.getClass();
        int n16 = object.getColumnIndex(string);
        if (n16 < 0) {
            String[] stringArray = new StringBuilder("`");
            stringArray.append(string);
            stringArray.append('`');
            n16 = object.getColumnIndex(stringArray.toString());
            if (n16 < 0) {
                if (Build.VERSION.SDK_INT <= 25 && string.length() != 0) {
                    stringArray = object.getColumnNames();
                    stringArray.getClass();
                    String string2 = ".".concat(string);
                    CharSequence charSequence = new StringBuilder(".");
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append('`');
                    String string3 = ((StringBuilder)charSequence).toString();
                    int n17 = stringArray.length;
                    n16 = 0;
                    int n18 = 0;
                    while (n18 < n17) {
                        charSequence = stringArray[n18];
                        if (((String)charSequence).length() < string.length() + 2 || !xm4.e0((String)charSequence, string2, false) && (((String)charSequence).charAt(0) != '`' || !xm4.e0((String)charSequence, string3, false))) {
                            ++n18;
                            ++n16;
                            continue;
                        }
                        break;
                    }
                } else {
                    n16 = -1;
                }
            }
        }
        if (n16 >= 0) {
            return n16;
        }
        try {
            object = object.getColumnNames();
            object.getClass();
            object = ti.n0(63, object);
        }
        catch (Exception exception) {
            Log.d((String)"RoomCursorUtil", (String)"Cannot collect column names for debug purposes", (Throwable)exception);
            object = "unknown";
        }
        tb4.h("column '", string, "' does not exist. Available columns: ", object);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int y(byte[] byArray) {
        int n16;
        int n17;
        int n18;
        block5: {
            block3: {
                block0: {
                    block4: {
                        block1: {
                            block2: {
                                n18 = 0;
                                n17 = byArray[0];
                                if (n17 == -2) break block0;
                                if (n17 == -1) break block1;
                                if (n17 == 31) break block2;
                                n16 = (byArray[5] & 3) << 12 | (byArray[6] & 0xFF) << 4;
                                n17 = byArray[7];
                                break block3;
                            }
                            n17 = (byArray[6] & 3) << 12 | (byArray[7] & 0xFF) << 4;
                            n16 = byArray[8];
                            break block4;
                        }
                        n17 = (byArray[7] & 3) << 12 | (byArray[6] & 0xFF) << 4;
                        n16 = byArray[9];
                    }
                    n17 = ((n16 & 0x3C) >> 2 | n17) + 1;
                    n16 = 1;
                    break block5;
                }
                n16 = (byArray[4] & 3) << 12 | (byArray[7] & 0xFF) << 4;
                n17 = byArray[6];
            }
            n17 = ((n17 & 0xF0) >> 4 | n16) + 1;
            n16 = n18;
        }
        n18 = n17;
        if (n16 == 0) return n18;
        return n17 * 16 / 14;
    }

    public static int z(int n16) {
        if (n16 != 2147385345 && n16 != -25230976 && n16 != 536864768 && n16 != -14745368) {
            if (n16 != 1683496997 && n16 != 622876772) {
                if (n16 != 1078008818 && n16 != -233094848) {
                    if (n16 != 1908687592 && n16 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }
}

