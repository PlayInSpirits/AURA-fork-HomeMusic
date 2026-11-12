package defpackage;

import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Looper;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr1 {
    public static final f01 a = new f01(1, "RESUME_TOKEN");
    public static final byte[] b = new byte[4096];

    public vr1() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0 A[PHI: r11
  0x00b0: PHI (r11v6 java.lang.String) = (r11v5 java.lang.String), (r11v17 java.lang.String) binds: [B:48:0x0090, B:54:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    public static yc4 A(ContentResolver contentResolver, Uri uri, String str, String str2) {
        ContentResolver contentResolver2;
        Uri uri2;
        Exception exc;
        String strG0;
        String lastPathSegment;
        String type;
        String extensionFromMimeType;
        String str3;
        String lowerCase;
        Throwable th;
        String str4;
        uri.getClass();
        long j = -1;
        try {
            contentResolver2 = contentResolver;
            uri2 = uri;
            try {
                Cursor cursorQuery = contentResolver2.query(uri2, new String[]{"_display_name", "_size"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            int columnIndex2 = cursorQuery.getColumnIndex("_size");
                            strG0 = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : null;
                            if (columnIndex2 >= 0) {
                                try {
                                    if (!cursorQuery.isNull(columnIndex2)) {
                                        j = cursorQuery.getLong(columnIndex2);
                                    }
                                } catch (Throwable th2) {
                                    str4 = strG0;
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        try {
                                            q05.h(cursorQuery, th);
                                            throw th3;
                                        } catch (Exception e) {
                                            exc = e;
                                            strG0 = str4;
                                            Log.w("SharedFile", "Cannot query " + uri2, exc);
                                            if (strG0 != null) {
                                                lastPathSegment = uri2.getLastPathSegment();
                                                if (lastPathSegment != null) {
                                                    strG0 = qm4.G0(lastPathSegment, '/', lastPathSegment);
                                                } else {
                                                    strG0 = null;
                                                }
                                            } else {
                                                lastPathSegment = uri2.getLastPathSegment();
                                                if (lastPathSegment != null) {
                                                    strG0 = qm4.G0(lastPathSegment, '/', lastPathSegment);
                                                } else {
                                                    strG0 = null;
                                                }
                                            }
                                            type = contentResolver2.getType(uri2);
                                            if (type == null) {
                                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                                if (strG0 != null) {
                                                    lowerCase = qm4.G0(strG0, '.', "").toLowerCase(Locale.ROOT);
                                                    lowerCase.getClass();
                                                } else {
                                                    lowerCase = null;
                                                }
                                                type = singleton.getMimeTypeFromExtension(lowerCase);
                                                if (type != null) {
                                                    str = type;
                                                }
                                            } else {
                                                str = type;
                                            }
                                            if (strG0 != null) {
                                                str3 = qm4.u0(strG0) ? null : strG0;
                                                if (str3 != null) {
                                                    str2 = str3;
                                                }
                                            }
                                            if (!qm4.n0(str2, '.')) {
                                                extensionFromMimeType = (String) yc4.d.get(str);
                                                if (extensionFromMimeType == null) {
                                                    extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                                                }
                                                if (extensionFromMimeType != null) {
                                                    str2 = b11.o(str2, ".", extensionFromMimeType);
                                                }
                                            }
                                            return new yc4(str2, j, str);
                                        }
                                    }
                                }
                            }
                        } else {
                            strG0 = null;
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e2) {
                            exc = e2;
                            Log.w("SharedFile", "Cannot query " + uri2, exc);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str4 = null;
                    }
                } else {
                    strG0 = null;
                }
            } catch (Exception e3) {
                e = e3;
                exc = e;
                strG0 = null;
                Log.w("SharedFile", "Cannot query " + uri2, exc);
                if (strG0 != null) {
                    lastPathSegment = uri2.getLastPathSegment();
                    if (lastPathSegment != null) {
                        strG0 = qm4.G0(lastPathSegment, '/', lastPathSegment);
                    } else {
                        strG0 = null;
                    }
                } else {
                    lastPathSegment = uri2.getLastPathSegment();
                    if (lastPathSegment != null) {
                        strG0 = qm4.G0(lastPathSegment, '/', lastPathSegment);
                    } else {
                        strG0 = null;
                    }
                }
                type = contentResolver2.getType(uri2);
                if (type == null) {
                    MimeTypeMap singleton2 = MimeTypeMap.getSingleton();
                    if (strG0 != null) {
                        lowerCase = qm4.G0(strG0, '.', "").toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    type = singleton2.getMimeTypeFromExtension(lowerCase);
                    if (type != null) {
                        str = type;
                    }
                } else {
                    str = type;
                }
                if (strG0 != null) {
                    if (qm4.u0(strG0)) {
                    }
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
                if (!qm4.n0(str2, '.')) {
                    extensionFromMimeType = (String) yc4.d.get(str);
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                    }
                    if (extensionFromMimeType != null) {
                        str2 = b11.o(str2, ".", extensionFromMimeType);
                    }
                }
                return new yc4(str2, j, str);
            }
        } catch (Exception e4) {
            e = e4;
            contentResolver2 = contentResolver;
            uri2 = uri;
        }
        if (strG0 != null || qm4.u0(strG0)) {
            lastPathSegment = uri2.getLastPathSegment();
            if (lastPathSegment != null) {
                strG0 = qm4.G0(lastPathSegment, '/', lastPathSegment);
            } else {
                strG0 = null;
            }
        }
        type = contentResolver2.getType(uri2);
        if (type == null) {
            MimeTypeMap singleton3 = MimeTypeMap.getSingleton();
            if (strG0 != null) {
                lowerCase = qm4.G0(strG0, '.', "").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            type = singleton3.getMimeTypeFromExtension(lowerCase);
            if (type != null) {
                str = type;
            }
        } else {
            str = type;
        }
        if (strG0 != null) {
            if (qm4.u0(strG0)) {
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        if (!qm4.n0(str2, '.')) {
            extensionFromMimeType = (String) yc4.d.get(str);
            if (extensionFromMimeType == null) {
                extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            }
            if (extensionFromMimeType != null) {
                str2 = b11.o(str2, ".", extensionFromMimeType);
            }
        }
        return new yc4(str2, j, str);
    }

    public static PorterDuff.Mode B(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case WaveRetry.MAX_FAILURES /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final Object C(mf3 mf3Var, qr3 qr3Var) {
        qr3Var.getClass();
        Object objB = mf3Var.get(qr3Var);
        if (objB == null) {
            objB = qr3Var.b();
        }
        return ((j35) objB).a(mf3Var);
    }

    public static int D(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i2 + i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (i3 != i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static int E(InputStream inputStream) {
        byte[] bArr = new byte[8];
        if (inputStream.read(bArr) < 8) {
            mj0.i("Could not read offset.");
            return 0;
        }
        byte b2 = bArr[7];
        int i = ((((((((((((((b2 & 127) * 256) + (bArr[6] & 255)) * 256) + (bArr[5] & 255)) * 256) + (bArr[4] & 255)) * 256) + (bArr[3] & 255)) * 256) + (bArr[2] & 255)) * 256) + (bArr[1] & 255)) * 256) + (bArr[0] & 255);
        if (i >= 0) {
            return (b2 & 128) != 0 ? -i : i;
        }
        mj0.i("Integer overflow: 64-bit offsets not supported.");
        return 0;
    }

    public static final dx2 F(dx2 dx2Var, lm0 lm0Var, tb tbVar, boolean z, gd3 gd3Var, rm2 rm2Var, ec3 ec3Var) {
        return dx2Var.c(au0.G(ax2.a, sp1.b, 1042431)).c(new r64(lm0Var, z, gd3Var, rm2Var, ec3Var, tbVar));
    }

    public static long G(InputStream inputStream, long j) throws IOException {
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip == 0) {
                break;
            }
            j2 -= jSkip;
        }
        while (j2 > 0) {
            int iD = D(inputStream, b, 0, (int) Math.min(j2, 4096L));
            if (iD < 1) {
                break;
            }
            j2 -= (long) iD;
        }
        return j - j2;
    }

    public static String H(long j) {
        return "PointerId(value=" + j + ")";
    }

    public static final mf3 I(rr3[] rr3VarArr, mf3 mf3Var, mf3 mf3Var2) {
        lf3 lf3Var = new lf3(mf3.q);
        for (rr3 rr3Var : rr3VarArr) {
            qr3 qr3Var = rr3Var.a;
            if (rr3Var.g || !mf3Var.containsKey(qr3Var)) {
                lf3Var.put(qr3Var, qr3Var.d(rr3Var, (j35) mf3Var2.get(qr3Var)));
            }
        }
        return lf3Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final ak5 J(ck5 ck5Var) throws zzhj {
        try {
            bk5 bk5VarN = ck5Var.n();
            if (bk5VarN == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b2 = bk5VarN.b;
                byte b3 = bk5VarN.a;
                ?? r6 = 0;
                if (b3 == -128) {
                    long jB = ck5Var.b();
                    if (jB > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    K(b2, jB);
                    ak5[] ak5VarArr = new ak5[(int) jB];
                    while (((long) r6) < jB) {
                        ak5VarArr[r6] = J(ck5Var);
                        r6++;
                    }
                    return new uj5(ei5.j(ak5VarArr));
                }
                try {
                    if (b3 != -96) {
                        if (b3 == -64) {
                            throw new zzhj("Tags are currently unsupported");
                        }
                        if (b3 == -32) {
                            return new vj5(ck5Var.q());
                        }
                        if (b3 == 0 || b3 == 32) {
                            long jF = ck5Var.f();
                            K(b2, jF > 0 ? jF : ~jF);
                            return new xj5(jF);
                        }
                        if (b3 == 64) {
                            ck5Var.v((byte) 64);
                            byte[] bArrH = ck5Var.H();
                            int length = bArrH.length;
                            K(b2, length);
                            return new wj5(rj5.i(length, bArrH));
                        }
                        if (b3 != 96) {
                            throw new zzhj("Unidentifiable major type: " + ((b3 >> 5) & 7));
                        }
                        ck5Var.v((byte) 96);
                        String str = new String(ck5Var.H(), StandardCharsets.UTF_8);
                        K(b2, str.length());
                        return new zj5(str);
                    }
                    long j = ck5Var.j();
                    if (j > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR map");
                    }
                    K(b2, j);
                    int i = (int) j;
                    qr2[] qr2VarArr = new qr2[i];
                    ak5 ak5Var = null;
                    int i2 = 0;
                    while (i2 < j) {
                        ak5 ak5VarJ = J(ck5Var);
                        if (ak5Var != null && ak5VarJ.compareTo(ak5Var) <= 0) {
                            throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + ak5Var.toString() + "\nCurrent key: " + ak5VarJ.toString());
                        }
                        qr2VarArr[i2] = new qr2(ak5VarJ, J(ck5Var), r6, 22);
                        i2++;
                        ak5Var = ak5VarJ;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (int i3 = 0; i3 < i; i3++) {
                        qr2 qr2Var = qr2VarArr[i3];
                        if (treeMap.containsKey((ak5) qr2Var.o)) {
                            throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((ak5) qr2Var.o, (ak5) qr2Var.p);
                    }
                    return new yj5(ji5.b(treeMap));
                } catch (RuntimeException e) {
                    e = e;
                    throw new zzhj(e);
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new zzhj(e3);
        }
    }

    public static final void K(byte b2, long j) throws zzhf {
        switch (b2) {
            case 24:
                if (j < 24) {
                    tb4.b(j, " after add info could have been represented in 0 additional bytes, but used 1");
                    break;
                }
                break;
            case 25:
                if (j < 256) {
                    tb4.b(j, " after add info could have been represented in 0-1 additional bytes, but used 2");
                    break;
                }
                break;
            case 26:
                if (j < 65536) {
                    tb4.b(j, " after add info could have been represented in 0-2 additional bytes, but used 4");
                    break;
                }
                break;
            case 27:
                if (j < 4294967296L) {
                    tb4.b(j, " after add info could have been represented in 0-4 additional bytes, but used 8");
                    break;
                }
                break;
        }
    }

    public static Rect c(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static void d(boolean z) {
        if (z) {
            return;
        }
        nz2.c();
    }

    public static final q24 i(Context context, Class cls, String str) {
        context.getClass();
        if (qm4.u0(str)) {
            kf2.n("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new q24(context, cls, str);
        }
        kf2.n("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final boolean j(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return h12.c(qm4.K0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static void k(View view, b85 b85Var) {
        WeakHashMap weakHashMap = j65.a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        c85 c85Var = new c85();
        c85Var.a = paddingStart;
        c85Var.b = paddingTop;
        c85Var.c = paddingEnd;
        c85Var.d = paddingBottom;
        a65.c(view, new gp3(22, b85Var, c85Var));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new z75());
        }
    }

    public static float l(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Map m(kk1 kk1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itSourceIterator = kk1Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            Object objKeyOf = kk1Var.keyOf(itSourceIterator.next());
            Object hx3Var = linkedHashMap.get(objKeyOf);
            if (hx3Var == null && !linkedHashMap.containsKey(objKeyOf)) {
                hx3Var = new hx3();
            }
            hx3 hx3Var2 = (hx3) hx3Var;
            hx3Var2.n++;
            linkedHashMap.put(objKeyOf, hx3Var2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof x32) && !(entry instanceof z32)) {
                jz4.M(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((hx3) entry.getValue()).n));
        }
        return jz4.f(linkedHashMap);
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static boolean o(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ib1 p(ib1[] ib1VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        ib1 ib1Var = null;
        int i3 = Integer.MAX_VALUE;
        for (ib1 ib1Var2 : ib1VarArr) {
            int iAbs = (Math.abs(ib1Var2.c - i2) * 2) + (ib1Var2.d == z ? 0 : 1);
            if (ib1Var == null || i3 > iAbs) {
                ib1Var = ib1Var2;
                i3 = iAbs;
            }
        }
        return ib1Var;
    }

    public static ol1 q(ol1 ol1Var) {
        return (((((double) Math.round(ol1Var.a)) > 90.0d ? 1 : (((double) Math.round(ol1Var.a)) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(ol1Var.a)) > 111.0d ? 1 : (((double) Math.round(ol1Var.a)) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(ol1Var.b)) > 16.0d ? 1 : (((double) Math.round(ol1Var.b)) == 16.0d ? 0 : -1)) > 0) && (((double) Math.round(ol1Var.c)) < 65.0d)) ? ol1.a(ol1Var.a, ol1Var.b, 70.0d) : ol1Var;
    }

    public static final String r(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? rm4.b0(q40.B0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static ViewGroup s(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static final float t(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = ns4.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : qx1.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float u(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = ns4.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? qx1.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static ry v(py pyVar) {
        oy oyVar = new oy();
        oyVar.c = new n04();
        ry ryVar = new ry(oyVar);
        oyVar.b = ryVar;
        oyVar.a = pyVar.getClass();
        try {
            Object objK = pyVar.k(oyVar);
            if (objK == null) {
                return ryVar;
            }
            oyVar.a = objK;
            return ryVar;
        } catch (Exception e) {
            ryVar.o.i(e);
            return ryVar;
        }
    }

    public static final int w(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final ed x(ne0 ne0Var) {
        ed edVar = (ed) ne0Var.K(rv2.p);
        if (edVar != null) {
            return edVar;
        }
        kf2.o("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void y(rg1 rg1Var, wf1 wf1Var) {
        wf1Var.getClass();
        jz4.j(2, wf1Var);
        wf1Var.invoke(rg1Var, 1);
    }

    public static boolean z(View view) {
        WeakHashMap weakHashMap = j65.a;
        return view.getLayoutDirection() == 1;
    }

    public me a(Context context, Looper looper, ml3 ml3Var, Object obj, gj1 gj1Var, hj1 hj1Var) {
        return b(context, looper, ml3Var, obj, (gf5) gj1Var, (gf5) hj1Var);
    }

    public me b(Context context, Looper looper, ml3 ml3Var, Object obj, gf5 gf5Var, gf5 gf5Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface e(Context context, ya1 ya1Var, Resources resources, int i);

    public abstract Typeface f(Context context, ib1[] ib1VarArr, int i);

    public Typeface g(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface h(Context context, Resources resources, int i, String str, int i2) {
        File fileC = wr1.C(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (wr1.k(fileC, resources, i)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }
}
