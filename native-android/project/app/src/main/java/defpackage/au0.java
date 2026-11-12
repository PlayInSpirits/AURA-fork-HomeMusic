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
import com.eddyizm.tempus.model.Download;
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
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au0 {
    public static volatile jh5 F;
    public static om1 n;
    public static tk4 o;
    public static File p;
    public static File q;
    public static se4 r;
    public static se4 s;
    public static lt0 t;
    public static eu0 u;
    public static b24 w;
    public static final float[] v = new float[91];
    public static final byte[] x = {48, 49, 53, 0};
    public static final byte[] y = {48, 49, 48, 0};
    public static final byte[] z = {48, 48, 57, 0};
    public static final byte[] A = {48, 48, 53, 0};
    public static final byte[] B = {48, 48, 49, 0};
    public static final byte[] C = {48, 48, 49, 0};
    public static final byte[] D = {48, 48, 50, 0};
    public static final Object E = new Object();

    public static final ef2 A(ef2 ef2Var) {
        c72 c72Var = ef2Var.H.H;
        while (true) {
            c72 c72VarT = c72Var.t();
            c72 c72Var2 = null;
            if ((c72VarT != null ? c72VarT.u : null) == null) {
                ef2 ef2VarY0 = ((f63) c72Var.Q.e).y0();
                ef2VarY0.getClass();
                return ef2VarY0;
            }
            c72 c72VarT2 = c72Var.t();
            if (c72VarT2 != null) {
                c72Var2 = c72VarT2.u;
            }
            c72Var2.getClass();
            c72 c72VarT3 = c72Var.t();
            c72VarT3.getClass();
            c72Var = c72VarT3.u;
            c72Var.getClass();
        }
    }

    public static synchronized se4 B(Context context) {
        try {
            if (s == null) {
                s = new se4(new File(C(context), "streaming_cache"), new d92(ud3.F() * 1048576), s(context));
            }
        } catch (Throwable th) {
            throw th;
        }
        return s;
    }

    public static synchronized File C(Context context) {
        try {
            if (p == null) {
                if (ud3.G() == 0) {
                    File file = context.getExternalFilesDirs(null)[0];
                    p = file;
                    if (file == null || !file.canWrite()) {
                        p = context.getFilesDir();
                    }
                } else {
                    try {
                        p = context.getExternalFilesDirs(null)[1];
                    } catch (Exception unused) {
                        p = context.getExternalFilesDirs(null)[0];
                        ud3.B0(0);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return p;
    }

    public static synchronized se4 D(Context context) {
        return B(context);
    }

    public static synchronized kx E(MediaService mediaService) {
        return d(new rf2((Context) mediaService, x()), u(mediaService));
    }

    public static final dx2 F(dx2 dx2Var, if1 if1Var) {
        return dx2Var.c(new et(if1Var));
    }

    public static dx2 G(dx2 dx2Var, ac4 ac4Var, int i) {
        float f = (i & 4) != 0 ? 1.0f : 0.5f;
        long j = tw4.a;
        if ((i & 2048) != 0) {
            ac4Var = kb4.b;
        }
        long j2 = wj1.a;
        return dx2Var.c(new tj1(f, j, ac4Var, j2, j2, m62.a));
    }

    public static boolean J() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static synchronized void K(File file, ArrayList arrayList) {
        File[] fileArrListFiles;
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile() && file2.getName().toLowerCase().endsWith(".exo")) {
                        arrayList.add(file2);
                    } else if (file2.isDirectory()) {
                        K(file2, arrayList);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static go4 L(go4 go4Var) {
        if ((go4Var instanceof io4) || (go4Var instanceof ho4)) {
            return go4Var;
        }
        return go4Var instanceof Serializable ? new ho4(go4Var) : new io4(go4Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x006a A[EDGE_INSN: B:109:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    public static ix O(tl1 tl1Var) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        tl1 tl1Var2 = tl1Var;
        tl1Var2.getClass();
        int size = tl1Var2.size();
        int i3 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iO = -1;
        int iO2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iO3 = -1;
        int iO4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i3 < size) {
            String strB = tl1Var2.b(i3);
            String strE = tl1Var2.e(i3);
            if (strB.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strE;
                }
                i = 0;
                while (i < strE.length()) {
                    length = strE.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strE.length();
                            break;
                        }
                        i2 = size;
                        if (qm4.n0("=,;", strE.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = qm4.K0(strE.substring(i, length2)).toString();
                    if (length2 != strE.length() || strE.charAt(length2) == ',' || strE.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = xe5.a;
                        int length4 = strE.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strE.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strE.length();
                                break;
                            }
                        }
                        if (length3 >= strE.length() || strE.charAt(length3) != '\"') {
                            int length5 = strE.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strE.length();
                                    break;
                                }
                                int i4 = length5;
                                if (qm4.n0(",;", strE.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = qm4.K0(strE.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iR0 = qm4.r0(strE, '\"', i6, 4);
                            string2 = strE.substring(i6, iR0);
                            i = iR0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iO = xe5.o(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iO2 = xe5.o(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iO3 = xe5.o(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iO4 = xe5.o(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z9 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z10 = true;
                    }
                    size = i2;
                }
                i3++;
                tl1Var2 = tl1Var;
                size = size;
            } else {
                if (strB.equalsIgnoreCase("Pragma")) {
                }
                i3++;
                tl1Var2 = tl1Var;
                size = size;
            }
            z2 = false;
            i = 0;
            while (i < strE.length()) {
                length = strE.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strE.length();
                        break;
                    }
                    i2 = size;
                    if (qm4.n0("=,;", strE.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = qm4.K0(strE.substring(i, length2)).toString();
                if (length2 != strE.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iO = xe5.o(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iO2 = xe5.o(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iO3 = xe5.o(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iO4 = xe5.o(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z9 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z10 = true;
                }
                size = i2;
            }
            i3++;
            tl1Var2 = tl1Var;
            size = size;
        }
        return new ix(z3, z4, iO, iO2, z5, z6, z7, iO3, iO4, z8, z9, z10, !z2 ? null : str);
    }

    public static long P(be3 be3Var, int i, int i2) {
        be3Var.N(i);
        if (be3Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = be3Var.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || be3Var.A() < 7 || be3Var.a() < 7 || (be3Var.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        be3Var.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void Q(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void R(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = j65.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static ck4 S(int i) {
        Float fValueOf = Float.valueOf(1.0f);
        float f = (i & 2) != 0 ? 1500.0f : 400.0f;
        if ((i & 4) != 0) {
            fValueOf = null;
        }
        return new ck4(f, fValueOf);
    }

    public static yy4 T(int i, ry0 ry0Var, int i2) {
        if ((i2 & 4) != 0) {
            ry0Var = sy0.a;
        }
        return new yy4(i, ry0Var);
    }

    public static void U(ArrayList arrayList, int i, long j) {
        int size = arrayList.size();
        if (1 > size || size >= 501) {
            kf2.n("Failed requirement.");
            return;
        }
        if (i < 0 || i >= arrayList.size()) {
            kf2.n("Failed requirement.");
            return;
        }
        if (j < 0) {
            kf2.n("Failed requirement.");
            return;
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                int length = ((String) obj).length();
                if (1 > length || length >= 513) {
                    kf2.n("Failed requirement.");
                    return;
                }
            }
        }
        if (q40.t0(arrayList).size() == arrayList.size()) {
            return;
        }
        kf2.n("Failed requirement.");
    }

    public static final Bundle V(String str) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static ArrayList a(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pr3) obj) != pr3.p) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((pr3) obj2).n);
        }
        return arrayList2;
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static kx d(bi0 bi0Var, se4 se4Var) {
        kx kxVar = new kx();
        kxVar.n = se4Var;
        kxVar.r = bi0Var;
        kxVar.q = true;
        kxVar.s = 2;
        return kxVar;
    }

    public static int f(int i, Context context, String str) {
        if (str == null) {
            return 1;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static byte[] g(List list) {
        list.getClass();
        tv tvVar = new tv();
        ArrayList arrayListA = a(list);
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            String str = (String) obj;
            tvVar.Y(str.length());
            tvVar.d0(str);
        }
        return tvVar.F(tvVar.o);
    }

    public static ImageView.ScaleType h(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static final Object j(long j, wd0 wd0Var) {
        if (j > 0) {
            cz czVar = new cz(1, ya4.x(wd0Var));
            czVar.u();
            if (j < Long.MAX_VALUE) {
                t(czVar.r).H(j, czVar);
            }
            Object objQ = czVar.q();
            if (objQ == xe0.n) {
                return objQ;
            }
        }
        return j15.a;
    }

    public static void k(ju1 ju1Var) {
        if (ju1Var != null) {
            try {
                ju1Var.c();
            } catch (RemoteException unused) {
            }
        }
    }

    public static void l(Context context, List list, final String str, final String str2, final boolean z2, final IntConsumer intConsumer) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Child child = (Child) it.next();
            linkedHashMap.putIfAbsent(child.getId(), child);
        }
        final Context applicationContext = context.getApplicationContext();
        final Handler handler = new Handler(Looper.getMainLooper());
        if (ud3.o() != null) {
            new Thread(new Runnable() { // from class: yt0
                @Override // java.lang.Runnable
                public final void run() {
                    g51.c();
                    List list2 = (List) linkedHashMap.values().stream().filter(new c7(9)).collect(Collectors.toList());
                    final Context context2 = applicationContext;
                    final String str3 = str;
                    final String str4 = str2;
                    final boolean z3 = z2;
                    list2.forEach(new Consumer() { // from class: zt0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            boolean z4 = z3;
                            i51.b(context2, (Child) obj, str3, str4, z4);
                        }
                    });
                    handler.post(new k6(23, intConsumer, list2));
                }
            }).start();
            return;
        }
        eu0 eu0VarW = w(context);
        List list2 = (List) linkedHashMap.values().stream().filter(new tj(2, eu0VarW)).collect(Collectors.toList());
        int iA = eu0VarW.a(gi1.H(list2), (List) list2.stream().map(new Function() { // from class: xt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Download download = new Download((Child) obj);
                download.setPlaylistId(str);
                download.setPlaylistName(str2);
                return download;
            }
        }).collect(Collectors.toList()), z2);
        if (iA == 0 && !list2.isEmpty()) {
            iA = -1;
        }
        intConsumer.accept(iA);
    }

    public static synchronized void m(Context context) {
        try {
            if (t == null) {
                t = new lt0(context, s(context), u(context), x(), Executors.newFixedThreadPool(6));
                App.b().getClass();
                if (App.c().getBoolean("download_wifi_only", false)) {
                    t.d(new h04(2));
                }
                u = new eu0(context, x(), t);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int o(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objZ = z(view);
            view = objZ instanceof View ? (View) objZ : null;
        }
        return i3;
    }

    public static final View p(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(o(view, R.id.view_tree_lifecycle_owner), o(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (q(view) == null) {
                i++;
                Object objZ = z(view);
                View view4 = view2;
                view2 = view;
                view = objZ instanceof View ? (View) objZ : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final h80 q(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (h80) weakReference.get();
        }
        return null;
    }

    public static String r(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z2 = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((xv4) obj).a.g.n;
            if (lw2.l(str2)) {
                return "video/mp4";
            }
            if (lw2.i(str2)) {
                z2 = true;
            } else if (lw2.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z2) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static synchronized tk4 s(Context context) {
        try {
            if (o == null) {
                o = new tk4(context.getApplicationContext(), "exoplayer_internal.db", null, 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return o;
    }

    public static final ao0 t(ne0 ne0Var) {
        le0 le0VarK = ne0Var.K(fz0.R);
        ao0 ao0Var = le0VarK instanceof ao0 ? (ao0) le0VarK : null;
        return ao0Var == null ? qk0.a : ao0Var;
    }

    public static synchronized se4 u(Context context) {
        try {
            if (r == null) {
                r = new se4(new File(v(context), "downloads"), new y53(), s(context));
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    public static synchronized File v(Context context) {
        try {
            if (q == null) {
                int iP = ud3.p();
                if (iP == 0) {
                    File file = context.getExternalFilesDirs(null)[0];
                    q = file;
                    if (file == null || !file.canWrite()) {
                        q = context.getFilesDir();
                    }
                } else if (iP == 1) {
                    try {
                        q = context.getExternalFilesDirs(null)[1];
                    } catch (Exception unused) {
                        q = context.getExternalFilesDirs(null)[0];
                        ud3.j0(0);
                    }
                } else {
                    q = context.getExternalFilesDirs(null)[0];
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return q;
    }

    public static synchronized eu0 w(Context context) {
        m(context);
        return u;
    }

    public static synchronized bi0 x() {
        try {
            if (n == null) {
                CookieManager cookieManager = new CookieManager();
                cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                CookieHandler.setDefault(cookieManager);
                bl0 bl0Var = new bl0(0);
                bl0Var.r = lp1.e;
                bl0Var.p = true;
                n = new om1(1, bl0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return n;
    }

    public static synchronized bl0 y() {
        bl0 bl0Var;
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        map.put("User-Agent", "Tempus/1.0");
        bl0Var = new bl0(0);
        bl0Var.p = true;
        qr2 qr2Var = (qr2) bl0Var.q;
        synchronized (qr2Var) {
            qr2Var.p = null;
            ((HashMap) qr2Var.o).clear();
            ((HashMap) qr2Var.o).putAll(map);
        }
        return bl0Var;
    }

    public static final ViewParent z(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public void H(x34 x34Var, Iterable iterable) {
        x34Var.getClass();
        if (iterable == null) {
            return;
        }
        z34 z34VarU = x34Var.U(i());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    c(z34VarU, obj);
                    z34VarU.O();
                    z34VarU.reset();
                }
            }
            ud3.e(z34VarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public void I(x34 x34Var, Object obj) {
        x34Var.getClass();
        if (obj == null) {
            return;
        }
        z34 z34VarU = x34Var.U(i());
        try {
            c(z34VarU, obj);
            z34VarU.O();
            ud3.e(z34VarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public abstract void M(int i);

    public abstract void N(Typeface typeface);

    public abstract void c(z34 z34Var, Object obj);

    public void e(int i) {
        new Handler(Looper.getMainLooper()).post(new ul(i, 5, this));
    }

    public abstract String i();
}
