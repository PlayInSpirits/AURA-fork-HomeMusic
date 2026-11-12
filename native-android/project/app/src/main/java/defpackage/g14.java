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
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, au0 au0Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            fg4 fg4Var = d05.b;
            Typeface typeface = (Typeface) fg4Var.g(d05.b(resources, i, string, i3, i2));
            int i4 = 19;
            if (typeface != null) {
                if (au0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new ur2(i4, au0Var, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        xa1 xa1VarL = e35.L(resources.getXml(i), resources);
                        if (xa1VarL == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (au0Var != null) {
                                au0Var.e(-3);
                            }
                        } else {
                            typefaceA = d05.a(context, xa1VarL, resources, i, string, typedValue.assetCookie, i2, au0Var, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceH = d05.a.h(context, resources, i, string, i2);
                        if (typefaceH != null) {
                            fg4Var.l(d05.b(resources, i, string, i5, i2), typefaceH);
                        }
                        if (au0Var != null) {
                            if (typefaceH != null) {
                                new Handler(Looper.getMainLooper()).post(new ur2(i4, au0Var, typefaceH));
                            } else {
                                au0Var.e(-3);
                            }
                        }
                        typefaceA = typefaceH;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (au0Var != null) {
                        au0Var.e(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (au0Var != null) {
                        au0Var.e(-3);
                    }
                }
            }
        } else if (au0Var != null) {
            au0Var.e(-3);
        }
        if (typefaceA != null || au0Var != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
