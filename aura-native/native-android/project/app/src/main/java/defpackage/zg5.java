package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import app.homemusic.R;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.eddyizm.tempus.interfaces.MediaCallback;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zg5 implements fv2, MediaCallback, bd0, jh, yy, o73, fl0, q51, p5, zw {
    public static zg5 o;
    public static final int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public Object n;

    public zg5(int i) {
        switch (i) {
            case 8:
                this.n = new CopyOnWriteArrayList();
                break;
            case 11:
                this.n = new f13(new cd0[16]);
                break;
            case 21:
                this.n = new ArrayDeque();
                break;
            case 29:
                this.n = new HashMap();
                break;
            default:
                this.n = new xk0(2);
                break;
        }
    }

    public static synchronized zg5 E(Context context) {
        zg5 zg5Var;
        String strD;
        Context applicationContext = context.getApplicationContext();
        synchronized (zg5.class) {
            zg5Var = o;
            if (zg5Var == null) {
                zg5Var = new zg5();
                bm4 bm4VarA = bm4.a(applicationContext);
                zg5Var.n = bm4VarA;
                bm4VarA.b();
                String strD2 = bm4VarA.d("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strD2) && (strD = bm4VarA.d(bm4.f("googleSignInOptions", strD2))) != null) {
                    try {
                        GoogleSignInOptions.b(strD);
                    } catch (JSONException unused) {
                    }
                }
                o = zg5Var;
            }
        }
        return zg5Var;
        return zg5Var;
    }

    @Override // defpackage.o73
    public Object A() {
        Constructor constructor = (Constructor) this.n;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            hw hwVar = ox3.a;
            nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ox3.b(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            nz2.s("Failed to invoke constructor '" + ox3.b(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    public void B(float f, float f2, long j) {
        jz jzVarG = ((i61) this.n).g();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        jzVarG.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        jzVarG.a(f, f2);
        jzVarG.j(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void C(float f, float f2) {
        ((i61) this.n).g().j(f, f2);
    }

    public yf0 D() {
        String string;
        nc1 nc1Var = (nc1) this.n;
        PackageInfo packageInfo = nc1Var.getPackageManager().getPackageInfo(nc1Var.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listQ0 = q40.Q0(arrayList);
        if (listQ0.isEmpty()) {
            return null;
        }
        Iterator it = listQ0.iterator();
        yf0 yf0Var = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(nc1Var);
                objNewInstance.getClass();
                yf0 yf0Var2 = (yf0) objNewInstance;
                if (!yf0Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (yf0Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    yf0Var = yf0Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return yf0Var;
    }

    public synchronized void F() {
        bm4 bm4Var = (bm4) this.n;
        ReentrantLock reentrantLock = bm4Var.a;
        reentrantLock.lock();
        try {
            bm4Var.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.fv2
    public void a(qu2 qu2Var, boolean z) {
        if (qu2Var instanceof en4) {
            ((en4) qu2Var).z.k().c(false);
        }
        fv2 fv2Var = ((y4) this.n).r;
        if (fv2Var != null) {
            fv2Var.a(qu2Var, z);
        }
    }

    @Override // defpackage.fl0
    public int b() {
        return d() | (d() << 8);
    }

    public void c(int i) {
    }

    @Override // defpackage.fl0
    public short d() throws IOException {
        int i = ((InputStream) this.n).read();
        if (i != -1) {
            return (short) i;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.fl0
    public int e(int i, byte[] bArr) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.n).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i2;
    }

    public void f(int i) {
    }

    @Override // defpackage.q51
    public Object g() {
        ue1 ue1Var = (ue1) this.n;
        return new xi0((sd0) ue1Var.p, (i61) ue1Var.q);
    }

    public void h(int i, float f) {
    }

    @Override // defpackage.p5
    public void i(Object obj) {
        o5 o5Var = (o5) obj;
        ld1 ld1Var = (ld1) this.n;
        gd1 gd1Var = (gd1) ld1Var.E.pollFirst();
        if (gd1Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = gd1Var.n;
        int i = gd1Var.o;
        kc1 kc1VarU = ld1Var.c.u(str);
        if (kc1VarU != null) {
            kc1VarU.D(i, o5Var.n, o5Var.o);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.yy
    public void j(Typeface typeface) {
        k40 k40Var = (k40) this.n;
        if (k40Var.m(typeface)) {
            k40Var.i(false);
        }
    }

    public void k(int i, boolean z) {
        xk0 xk0Var = (xk0) this.n;
        if (z) {
            xk0Var.b(i);
        } else {
            xk0Var.getClass();
        }
    }

    public boolean l(int i, int i2) {
        nk nkVar = (nk) this.n;
        Object obj = nkVar.n.get(i);
        Object obj2 = nkVar.o.get(i2);
        if (obj != null && obj2 != null) {
            Object obj3 = nkVar.r.b.o;
            return ((Child) obj).equals((Child) obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean m(int i, int i2) {
        nk nkVar = (nk) this.n;
        Object obj = nkVar.n.get(i);
        Object obj2 = nkVar.o.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        Object obj3 = nkVar.r.b.o;
        return Objects.equals(((Child) obj).getId(), ((Child) obj2).getId());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String n(tb1 tb1Var) {
        String displayName;
        String str = tb1Var.d;
        String str2 = tb1Var.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = f35.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strX = x(displayName, o(tb1Var));
        if (!TextUtils.isEmpty(strX)) {
            return strX;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public String o(tb1 tb1Var) {
        Resources resources = (Resources) this.n;
        int i = tb1Var.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = x(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = x(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? x(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // com.eddyizm.tempus.interfaces.MediaCallback
    public void onError(Exception exc) {
    }

    @Override // com.eddyizm.tempus.interfaces.MediaCallback
    public void onLoadMedia(List list) {
        y7 y7Var = (y7) this.n;
        k03 k03Var = y7Var.c;
        k03 k03Var2 = y7Var.d;
        if (y7Var.f == 2) {
            k03Var2.k(Boolean.FALSE);
            return;
        }
        List list2 = (List) k03Var.d();
        list2.addAll(list);
        k03Var.k(list2);
        if (list.size() == 500) {
            y7Var.c();
            k03Var2.k(Boolean.TRUE);
        } else {
            y7Var.f = 2;
            k03Var2.k(Boolean.FALSE);
        }
    }

    @Override // defpackage.zw
    public int p() throws IOException {
        re1 re1Var = (re1) this.n;
        int i = re1Var.o.read();
        if (i == -1) {
            return -1;
        }
        re1Var.b(1L);
        return i & 255;
    }

    public void q(CancellationException cancellationException) {
        f13 f13Var = (f13) this.n;
        int i = f13Var.p;
        az[] azVarArr = new az[i];
        for (int i2 = 0; i2 < i; i2++) {
            azVarArr[i2] = ((cd0) f13Var.n[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            azVarArr[i3].r(cancellationException);
        }
        if (f13Var.p == 0) {
            return;
        }
        fz1.c("uncancelled requests present");
    }

    public void r() {
        ((u80) this.n).getClass();
    }

    public void s(int i, int i2) {
        nk nkVar = (nk) this.n;
        Object obj = nkVar.n.get(i);
        Object obj2 = nkVar.o.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = nkVar.r.b.o;
    }

    @Override // defpackage.fl0
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.n;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public int t() {
        return ((nk) this.n).o.size();
    }

    public int u() {
        return ((nk) this.n).n.size();
    }

    public void v(float f, float f2, float f3, float f4) {
        i61 i61Var = (i61) this.n;
        jz jzVarG = i61Var.g();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (i61Var.j() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (i61Var.j() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            bz1.a("Width and height must be greater than or equal to zero");
        }
        i61Var.t(jFloatToRawIntBits);
        jzVarG.j(f, f2);
    }

    @Override // defpackage.fv2
    public boolean w(qu2 qu2Var) {
        y4 y4Var = (y4) this.n;
        if (qu2Var == y4Var.p) {
            return false;
        }
        y4Var.L = ((en4) qu2Var).A.a;
        fv2 fv2Var = y4Var.r;
        if (fv2Var != null) {
            return fv2Var.w(qu2Var);
        }
        return false;
    }

    public String x(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.n).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void y(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((fr) this.n).a(0);
    }

    public void z() {
        f13 f13Var = (f13) this.n;
        j02 j02VarG0 = gb.g0(0, f13Var.p);
        int i = j02VarG0.n;
        int i2 = j02VarG0.o;
        if (i <= i2) {
            while (true) {
                ((cd0) f13Var.n[i]).b.resumeWith(j15.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        f13Var.g();
    }

    public /* synthetic */ zg5(Object obj) {
        this.n = obj;
    }
}
