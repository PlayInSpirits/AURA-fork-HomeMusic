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
import java.io.InputStream;
import java.lang.reflect.Constructor;
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
    public static final int[] p = null;
    public Object n;

    static {
        p = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    }

    public zg5(int r2) {
        switch(r2) {
            case 8: goto L11;
            case 11: goto L9;
            case 21: goto L7;
            case 29: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new xk0(2);
        return;
    L5:
        this.n = new HashMap();
        return;
    L7:
        this.n = new ArrayDeque();
        return;
    L9:
        this.n = new f13(new cd0[16]);
        return;
    L11:
        this.n = new CopyOnWriteArrayList();
    }

    public static synchronized zg5 E(Context r5) {
        monitor-enter(zg5.class);
        Context r6 = r5.getApplicationContext();     // Catch: Throwable -> L23
        monitor-enter(zg5.class);     // Catch: Throwable -> L23
        zg5 r2 = o;     // Catch: Throwable -> L20
        if (r2 == null) goto L10;
    L8:
        monitor-exit(zg5.class);     // Catch: Throwable -> L23
        monitor-exit(zg5.class);
        return r2;
    L10:
        r2 = new zg5();     // Catch: Throwable -> L20
        bm4 r7 = bm4.a(r6);     // Catch: Throwable -> L20
        r2.n = r7;     // Catch: Throwable -> L20
        r7.b();     // Catch: Throwable -> L20
        String r3 = r7.d("defaultGoogleSignInAccount");     // Catch: Throwable -> L20
        if (TextUtils.isEmpty(r3) == true) goto L16;
        String r8 = r7.d(bm4.f("googleSignInOptions", r3));     // Catch: Throwable -> L20
        if (r8 == null) goto L16;
        GoogleSignInOptions.b(r8);     // Catch: JSONException -> L26 Throwable -> L20
    L16:
        o = r2;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.o73
    public Object A() {
        Constructor r5 = (Constructor) this.n;
        return r5.newInstance(null);
    L5:
        e = move-exception;
        hw r0 = ox3.a;
        nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        return null;
    L11:
        e = move-exception;
        throw new RuntimeException("Failed to invoke constructor '" + ox3.b(r5) + "' with no args", e);
    L8:
        e = move-exception;
        nz2.s("Failed to invoke constructor '" + ox3.b(r5) + "' with no args", e.getCause());
        return null;
    }

    public void B(float r5, float r6, long r7) {
        jz r4 = ((i61) this.n).g();
        int r0 = (int) (r7 >> 32);
        int r8 = (int) (r7 & 4294967295L);
        r4.j(Float.intBitsToFloat(r0), Float.intBitsToFloat(r8));
        r4.a(r5, r6);
        r4.j(-Float.intBitsToFloat(r0), -Float.intBitsToFloat(r8));
    }

    public void C(float r1, float r2) {
        ((i61) this.n).g().j(r1, r2);
    }

    public yf0 D() {
        nc1 r6 = (nc1) this.n;
        PackageInfo r0 = r6.getPackageManager().getPackageInfo(r6.getPackageName(), 132);
        ArrayList r1 = new ArrayList();
        ServiceInfo[] r2 = r0.services;
        if (r2 == null) goto L12;
        int r3 = r2.length;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L12;
        Bundle r5 = r2[r4].metaData;
        if (r5 == null) goto L11;
        String r7 = r5.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY");
        if (r7 == null) goto L11;
        r1.add(r7);
    L11:
        r4 = r4 + 1;
    L12:
        List r8 = q40.Q0(r1);
        if (r8.isEmpty() == false) goto L15;
        return null;
    L15:
        Iterator r9 = r8.iterator();
        yf0 r10 = null;
    L17:
        if (r9.hasNext() == false) goto L26;
        Object r11 = Class.forName((String) r9.next()).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{r6});     // Catch: Throwable -> L27
        r11.getClass();     // Catch: Throwable -> L27
        yf0 r12 = (yf0) r11;     // Catch: Throwable -> L27
        if (r12.isAvailableOnDevice() == false) goto L17;
        if (r10 == null) goto L24;
        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");     // Catch: Throwable -> L27
        return null;
    L24:
        r10 = r12;
        goto L17
    L26:
        return r10;
    }

    public synchronized void F() {
        monitor-enter(this);
        bm4 r0 = (bm4) this.n;     // Catch: Throwable -> L13
        ReentrantLock r1 = r0.a;     // Catch: Throwable -> L13
        r1.lock();     // Catch: Throwable -> L13
        r0.b.edit().clear().apply();     // Catch: Throwable -> L8
        r1.unlock();     // Catch: Throwable -> L13
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        r1.unlock();     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.fv2
    public void a(qu2 r3, boolean r4) {
        if ((r3 instanceof en4) == false) goto L5;
        ((en4) r3).z.k().c(false);
    L5:
        fv2 r2 = ((y4) this.n).r;
        if (r2 == null) goto L9;
        r2.a(r3, r4);
        return;
    }

    @Override // defpackage.fl0
    public int b() {
        int r0 = d() << 8;
        return d() | r0;
    }

    public void c(int r1) {
    }

    @Override // defpackage.fl0
    public short d() {
        int r1 = ((InputStream) this.n).read();
        if (r1 == (-1)) goto L7;
        return (short) r1;
    L7:
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.fl0
    public int e(int r5, byte[] r6) {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= r5) goto L8;
        r1 = ((InputStream) this.n).read(r6, r0, r5 - r0);
        if (r1 == (-1)) goto L8;
        r0 = r0 + r1;
    L8:
        if (r0 != 0) goto L13;
        if (r1 != (-1)) goto L13;
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    L13:
        return r0;
    }

    public void f(int r1) {
    }

    @Override // defpackage.q51
    public Object g() {
        ue1 r2 = (ue1) this.n;
        return new xi0((sd0) r2.p, (i61) r2.q);
    }

    public void h(int r1, float r2) {
    }

    @Override // defpackage.p5
    public void i(Object r4) {
        o5 r5 = (o5) r4;
        ld1 r0 = (ld1) this.n;
        gd1 r1 = (gd1) r0.E.pollFirst();
        if (r1 != null) goto L6;
        Log.w("FragmentManager", "No IntentSenders were started for " + this);
        return;
    L6:
        String r3 = r1.n;
        int r2 = r1.o;
        kc1 r6 = r0.c.u(r3);
        if (r6 != null) goto L10;
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + r3);
        return;
    L10:
        r6.D(r2, r5.n, r5.o);
    }

    @Override // defpackage.yy
    public void j(Typeface r1) {
        k40 r0 = (k40) this.n;
        if (r0.m(r1) == false) goto L6;
        r0.i(false);
        return;
    }

    public void k(int r1, boolean r2) {
        xk0 r0 = (xk0) this.n;
        if (r2 == false) goto L6;
        r0.b(r1);
        return;
    L6:
        r0.getClass();
    }

    public boolean l(int r2, int r3) {
        nk r1 = (nk) this.n;
        Object r4 = r1.n.get(r2);
        Object r5 = r1.o.get(r3);
        if (r4 == null) goto L7;
        if (r5 == null) goto L7;
        Object r6 = r1.r.b.o;
        return ((Child) r4).equals((Child) r5);
    L7:
        if (r4 != null) goto L12;
        if (r5 != null) goto L12;
        return true;
    L12:
        throw new AssertionError();
    }

    public boolean m(int r2, int r3) {
        nk r1 = (nk) this.n;
        Object r4 = r1.n.get(r2);
        Object r5 = r1.o.get(r3);
        if (r4 == null) goto L7;
        if (r5 == null) goto L7;
        Object r6 = r1.r.b.o;
        return Objects.equals(((Child) r4).getId(), ((Child) r5).getId());
    L7:
        if (r4 != null) goto L11;
        if (r5 != null) goto L13;
        return true;
    L13:
        return false;
    L11:
        return false;
    }

    public String n(tb1 r8) {
        String r0 = r8.d;
        String r1 = r8.b;
        if (TextUtils.isEmpty(r0) == false) goto L5;
    L9:
        String r2 = "";
    L12:
        String r7 = x(new String[]{r2, o(r8)});
        if (TextUtils.isEmpty(r7) == true) goto L15;
        return r7;
    L15:
        if (TextUtils.isEmpty(r1) == false) goto L18;
        r1 = "";
    L18:
        return r1;
    L5:
        if ("und".equals(r0) == true) goto L9;
        Locale r3 = Locale.forLanguageTag(r0);
        String r4 = f35.a;
        Locale r5 = Locale.getDefault(Locale.Category.DISPLAY);
        r2 = r3.getDisplayName(r5);
        if (TextUtils.isEmpty(r2) == true) goto L9;
        int r6 = r2.offsetByCodePoints(0, 1);     // Catch: IndexOutOfBoundsException -> L19
        r2 = r2.substring(0, r6).toUpperCase(r5) + r2.substring(r6);     // Catch: IndexOutOfBoundsException -> L19
        goto L12
    }

    public String o(tb1 r4) {
        Resources r0 = (Resources) this.n;
        int r5 = r4.f;
        if ((r5 & 2) == 0) goto L5;
        String r1 = r0.getString(R.string.exo_track_role_alternate);
    L7:
        if ((r5 & 4) == 0) goto L10;
        r1 = x(new String[]{r1, r0.getString(R.string.exo_track_role_supplementary)});
    L10:
        if ((r5 & 8) == 0) goto L13;
        r1 = x(new String[]{r1, r0.getString(R.string.exo_track_role_commentary)});
    L13:
        if ((r5 & 1088) != 0) goto L15;
        return r1;
    L15:
        return x(new String[]{r1, r0.getString(R.string.exo_track_role_closed_captions)});
    L5:
        r1 = "";
        goto L7
    }

    @Override // com.eddyizm.tempus.interfaces.MediaCallback
    public void onError(Exception r1) {
    }

    @Override // com.eddyizm.tempus.interfaces.MediaCallback
    public void onLoadMedia(List r5) {
        y7 r4 = (y7) this.n;
        k03 r0 = r4.c;
        k03 r1 = r4.d;
        if (r4.f != 2) goto L6;
        r1.k(Boolean.FALSE);
        return;
    L6:
        List r2 = (List) r0.d();
        r2.addAll(r5);
        r0.k(r2);
        if (r5.size() != 500) goto L10;
        r4.c();
        r1.k(Boolean.TRUE);
        return;
    L10:
        r4.f = 2;
        r1.k(Boolean.FALSE);
    }

    @Override // defpackage.zw
    public int p() {
        re1 r3 = (re1) this.n;
        int r0 = r3.o.read();
        if (r0 == (-1)) goto L6;
        r3.b(1);
        return r0 & 255;
    L6:
        return -1;
    }

    public void q(CancellationException r6) {
        f13 r5 = (f13) this.n;
        int r0 = r5.p;
        az[] r1 = new az[r0];
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1[r3] = ((cd0) r5.n[r3]).b;
        r3 = r3 + 1;
    L5:
        if (r2 >= r0) goto L8;
        r1[r2].r(r6);
        r2 = r2 + 1;
        goto L5
    L8:
        if (r5.p != 0) goto L10;
        return;
    L10:
        fz1.c("uncancelled requests present");
    }

    public void r() {
        ((u80) this.n).getClass();
    }

    public void s(int r2, int r3) {
        nk r1 = (nk) this.n;
        Object r4 = r1.n.get(r2);
        Object r5 = r1.o.get(r3);
        if (r4 == null) goto L8;
        if (r5 == null) goto L8;
        Object r6 = r1.r.b.o;
        return;
    L8:
        throw new AssertionError();
    }

    @Override // defpackage.fl0
    public long skip(long r8) {
        InputStream r7 = (InputStream) this.n;
        if (r8 >= 0) goto L5;
        return 0;
    L5:
        long r2 = r8;
    L7:
        if (r2 <= 0) goto L16;
        long r4 = r7.skip(r2);
        if (r4 > 0) goto L10;
        if (r7.read() == (-1)) goto L16;
        r4 = 1;
    L10:
        r2 = r2 - r4;
    L16:
        return r8 - r2;
    }

    public int t() {
        return ((nk) this.n).o.size();
    }

    public int u() {
        return ((nk) this.n).n.size();
    }

    public void v(float r9, float r10, float r11, float r12) {
        i61 r8 = (i61) this.n;
        jz r0 = r8.g();
        float r1 = Float.intBitsToFloat((int) (r8.j() >> 32)) - (r11 + r9);
        float r13 = Float.intBitsToFloat((int) (r8.j() & 4294967295L)) - (r12 + r10);
        long r2 = Float.floatToRawIntBits(r1);
        long r14 = (((long) Float.floatToRawIntBits(r13)) & 4294967295L) | (r2 << 32);
        if (Float.intBitsToFloat((int) (r14 >> 32)) >= 0.0f) goto L5;
    L7:
        bz1.a("Width and height must be greater than or equal to zero");
    L8:
        r8.t(r14);
        r0.j(r9, r10);
        return;
    L5:
        if (Float.intBitsToFloat((int) (r14 & 4294967295L)) < 0.0f) goto L7;
        goto L7
    }

    @Override // defpackage.fv2
    public boolean w(qu2 r2) {
        y4 r1 = (y4) this.n;
        if (r2 == r1.p) goto L11;
        r1.L = ((en4) r2).A.a;
        fv2 r3 = r1.r;
        if (r3 != null) goto L8;
        return false;
    L8:
        return r3.w(r2);
    L11:
        return false;
    }

    public String x(String... r7) {
        int r0 = r7.length;
        String r1 = "";
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        String r3 = r7[r2];
        if (r3.isEmpty() == true) goto L10;
        if (TextUtils.isEmpty(r1) == false) goto L9;
        r1 = r3;
        goto L10
    L9:
        r1 = ((Resources) this.n).getString(R.string.exo_item_list, new Object[]{r1, r3});
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        return r1;
    }

    public void y(View r2) {
        if (r2.getParent() == null) goto L5;
        r2.setVisibility(8);
    L5:
        ((fr) this.n).a(0);
    }

    public void z() {
        f13 r4 = (f13) this.n;
        j02 r0 = gb.g0(0, r4.p);
        int r1 = r0.n;
        int r2 = r0.o;
        if (r1 > r2) goto L7;
    L4:
        ((cd0) r4.n[r1]).b.resumeWith(j15.a);
        if (r1 == r2) goto L7;
        r1 = r1 + 1;
    L7:
        r4.g();
    }

    public /* synthetic */ zg5(Object r1) {
        this.n = r1;
    }
}
