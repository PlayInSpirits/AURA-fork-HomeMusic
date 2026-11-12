package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g14 {
    public static final ThreadLocal a = null;
    public static final WeakHashMap b = null;
    public static final Object c = null;

    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }

    public static Typeface a(Context r12, int r13, TypedValue r14, int r15, au0 r16, boolean r17, boolean r18) {
        Resources r2 = r12.getResources();
        r2.getValue(r13, r14, true);
        CharSequence r0 = r14.string;
        if (r0 == null) goto L48;
        String r4 = r0.toString();
        Typeface r10 = null;
        if (r4.startsWith("res/") == true) goto L8;
        if (r16 == null) goto L40;
        r16.e(-3);
    L40:
        if (r10 != null) goto L46;
        if (r16 != null) goto L46;
        if (r18 == true) goto L46;
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(r13) + " could not be retrieved.");
    L46:
        return r10;
    L8:
        int r1 = r14.assetCookie;
        fg4 r6 = d05.b;
        Typeface r3 = (Typeface) r6.g(d05.b(r2, r13, r4, r1, r15));
        int r8 = 19;
        if (r3 == null) goto L13;
        if (r16 == null) goto L12;
        new Handler(Looper.getMainLooper()).post(new ur2(r8, r16, r3));
    L12:
        r10 = r3;
        goto L40
    L13:
        if (r18 == true) goto L40;
    L22:
        e = move-exception;
        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(r4), e);
    L38:
        if (r16 == null) goto L40;
        r16.e(-3);
    L24:
        e = move-exception;
        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(r4), e);
        goto L38
    L16:
        if (r4.toLowerCase().endsWith(".xml") == false) goto L27;
        xa1 r5 = e35.L(r2.getXml(r13), r2);     // Catch: IOException -> L22 XmlPullParserException -> L24
        if (r5 != null) goto L26;
        Log.e("ResourcesCompat", "Failed to find font-family tag");     // Catch: IOException -> L22 XmlPullParserException -> L24
        if (r16 == null) goto L40;
        r16.e(-3);     // Catch: IOException -> L22 XmlPullParserException -> L24
        goto L40
    L26:
        r10 = d05.a(r12, r5, r2, r13, r4, r14.assetCookie, r15, r16, r17);     // Catch: IOException -> L22 XmlPullParserException -> L24
        goto L40
    L27:
        int r19 = r14.assetCookie;     // Catch: IOException -> L22 XmlPullParserException -> L24
        Typeface r110 = d05.a.h(r12, r2, r13, r4, r15);     // Catch: IOException -> L22 XmlPullParserException -> L24
        if (r110 == null) goto L30;
        r6.l(d05.b(r2, r13, r4, r19, r15), r110);     // Catch: IOException -> L22 XmlPullParserException -> L24
    L30:
        if (r16 == null) goto L33;
        if (r110 == null) goto L34;
        new Handler(Looper.getMainLooper()).post(new ur2(r8, r16, r110));     // Catch: IOException -> L22 XmlPullParserException -> L24
        goto L33
    L34:
        r16.e(-3);     // Catch: IOException -> L22 XmlPullParserException -> L24
    L33:
        r10 = r110;
        goto L40
    L48:
        throw new Resources.NotFoundException("Resource \"" + r2.getResourceName(r13) + "\" (" + Integer.toHexString(r13) + ") is not a Font: " + r14);
    }
}
