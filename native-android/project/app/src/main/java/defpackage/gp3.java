package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp3 implements Callback, kg1, ez, lm3, rh0, r83, b93 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public gp3(pn4 r29, int r30) {
        this.n = r30;
        TimeUnit r5 = TimeUnit.SECONDS;
        TimeUnit r8 = TimeUnit.MINUTES;
        String r12 = "https://localhost/rest/";
        String r13 = "";
        switch(r30) {
            case 13: goto L62;
            case 21: goto L33;
            default: goto L4;
        };
    L4:
        this.o = r29;
        ok1 r2 = new ok1();
        r2.a(Date.class, new r01());
        r2.a(Bookmarks.class, new lt());
        r2.j = true;
        ArrayList r4 = r2.e;
        int r6 = r4.size();
        ArrayList r7 = r2.f;
        ArrayList r3 = new ArrayList((r7.size() + r6) + 3);
        r3.addAll(r4);
        Collections.reverse(r3);
        ArrayList r9 = new ArrayList(r7);
        Collections.reverse(r9);
        r3.addAll(r9);
        int r10 = r2.g;
        int r11 = r2.h;
        ak0 r14 = bk0.b;
        boolean r16 = gk4.a;
        if (r10 == 2) goto L14;
        if (r11 == 2) goto L14;
        dz4 r15 = r14.a(r10, r11);
        if (r16 == false) goto L10;
        dz4 r17 = gk4.c.a(r10, r11);
        dz4 r18 = gk4.b.a(r10, r11);
    L11:
        r3.add(r15);
        if (r16 == false) goto L14;
        r3.add(r17);
        r3.add(r18);
        goto L14
    L10:
        r18 = null;
        r17 = null;
    L14:
        u21 r19 = r2.a;
        int r20 = r2.c;
        HashMap r110 = new HashMap(r2.d);
        boolean r111 = r2.i;
        boolean r112 = r2.j;
        boolean r113 = r2.k;
        int r21 = r2.b;
        new ArrayList(r4);
        new ArrayList(r7);
        nk1 r114 = new nk1(r19, r20, r110, r111, r112, r113, r21, r3, r2.l, r2.m, new ArrayList(r2.n));
        Retrofit.Builder r22 = new Retrofit.Builder();
        String r1 = r29.j();
        if (r1 == null) goto L17;
        String r23 = qm4.K0(r1).toString();
    L18:
        if (r23 == null) goto L97;
        r13 = r23;
    L97:
        fr1 r24 = new fr1();     // Catch: IllegalArgumentException -> L23
        r24.e(null, r13);     // Catch: IllegalArgumentException -> L23
        gr1 r115 = r24.b();     // Catch: IllegalArgumentException -> L23
    L24:
        if (r115 != null) goto L26;
    L28:
        Retrofit.Builder r25 = r22.baseUrl(r12).addConverterFactory(GsonConverterFactory.create(r114));
        cx r26 = new cx();
        rx r27 = new rx(r26);
        r26.a = 2592000;
        n83 r28 = new n83();
        r28.a(2, r8);
        r28.b(20, r5);
        r28.z = ze5.b(30, r5);
        r28.A = ze5.b(30, r5);
        dr1 r31 = new dr1();
        r31.b = cr1.n;
        r28.c.add(r31);
        r28.c.add(r27);
        File r32 = App.a().getCacheDir();
        r32.getClass();
        r28.l = new hx(r32);
        SSLSocketFactory r33 = x30.b;
        if (r33 == null) goto L31;
        r28.c(r33, x30.a);
    L31:
        Retrofit r34 = r25.client(new o83(r28)).build();
        r34.getClass();
        this.p = (ov) r34.create(ov.class);
        return;
    L26:
        if (r115.d.length() <= 0) goto L28;
        r12 = r13;
    L23:
        r115 = null;
        goto L24
    L17:
        r23 = null;
        goto L18
    L33:
        this.o = r29;
        ok1 r35 = new ok1();
        r35.a(Date.class, new r01());
        r35.a(Bookmarks.class, new lt());
        r35.j = true;
        ArrayList r36 = r35.e;
        int r37 = r36.size();
        ArrayList r38 = r35.f;
        ArrayList r39 = new ArrayList((r38.size() + r37) + 3);
        r39.addAll(r36);
        Collections.reverse(r39);
        ArrayList r40 = new ArrayList(r38);
        Collections.reverse(r40);
        r39.addAll(r40);
        int r41 = r35.g;
        int r42 = r35.h;
        ak0 r116 = bk0.b;
        boolean r117 = gk4.a;
        if (r41 == 2) goto L43;
        if (r42 == 2) goto L43;
        dz4 r118 = r116.a(r41, r42);
        if (r117 == false) goto L39;
        dz4 r119 = gk4.c.a(r41, r42);
        dz4 r43 = gk4.b.a(r41, r42);
    L40:
        r39.add(r118);
        if (r117 == false) goto L43;
        r39.add(r119);
        r39.add(r43);
        goto L43
    L39:
        r43 = null;
        r119 = null;
    L43:
        u21 r44 = r35.a;
        int r45 = r35.c;
        HashMap r120 = new HashMap(r35.d);
        boolean r121 = r35.i;
        boolean r122 = r35.j;
        boolean r123 = r35.k;
        int r46 = r35.b;
        new ArrayList(r36);
        new ArrayList(r38);
        nk1 r124 = new nk1(r44, r45, r120, r121, r122, r123, r46, r39, r35.l, r35.m, new ArrayList(r35.n));
        Retrofit.Builder r47 = new Retrofit.Builder();
        String r48 = r29.j();
        if (r48 == null) goto L46;
        String r49 = qm4.K0(r48).toString();
    L47:
        if (r49 == null) goto L95;
        r13 = r49;
    L95:
        fr1 r50 = new fr1();     // Catch: IllegalArgumentException -> L52
        r50.e(null, r13);     // Catch: IllegalArgumentException -> L52
        gr1 r125 = r50.b();     // Catch: IllegalArgumentException -> L52
    L53:
        if (r125 != null) goto L55;
    L57:
        Retrofit.Builder r51 = r47.baseUrl(r12).addConverterFactory(GsonConverterFactory.create(r124));
        cx r52 = new cx();
        rx r53 = new rx(r52);
        r52.a = 2592000;
        n83 r54 = new n83();
        r54.a(2, r8);
        r54.b(20, r5);
        r54.z = ze5.b(30, r5);
        r54.A = ze5.b(30, r5);
        dr1 r55 = new dr1();
        r55.b = cr1.n;
        r54.c.add(r55);
        r54.c.add(r53);
        File r56 = App.a().getCacheDir();
        r56.getClass();
        r54.l = new hx(r56);
        SSLSocketFactory r57 = x30.b;
        if (r57 == null) goto L60;
        r54.c(r57, x30.a);
    L60:
        Retrofit r58 = r51.client(new o83(r54)).build();
        r58.getClass();
        this.p = (gq4) r58.create(gq4.class);
        return;
    L55:
        if (r125.d.length() <= 0) goto L57;
        r12 = r13;
    L52:
        r125 = null;
        goto L53
    L46:
        r49 = null;
        goto L47
    L62:
        this.o = r29;
        ok1 r59 = new ok1();
        r59.a(Date.class, new r01());
        r59.a(Bookmarks.class, new lt());
        r59.j = true;
        ArrayList r60 = r59.e;
        int r61 = r60.size();
        ArrayList r62 = r59.f;
        ArrayList r63 = new ArrayList((r62.size() + r61) + 3);
        r63.addAll(r60);
        Collections.reverse(r63);
        ArrayList r64 = new ArrayList(r62);
        Collections.reverse(r64);
        r63.addAll(r64);
        int r65 = r59.g;
        int r66 = r59.h;
        ak0 r126 = bk0.b;
        boolean r127 = gk4.a;
        if (r65 == 2) goto L72;
        if (r66 == 2) goto L72;
        dz4 r128 = r126.a(r65, r66);
        if (r127 == false) goto L68;
        dz4 r129 = gk4.c.a(r65, r66);
        dz4 r67 = gk4.b.a(r65, r66);
    L69:
        r63.add(r128);
        if (r127 == false) goto L72;
        r63.add(r129);
        r63.add(r67);
        goto L72
    L68:
        r67 = null;
        r129 = null;
    L72:
        u21 r68 = r59.a;
        int r69 = r59.c;
        HashMap r130 = new HashMap(r59.d);
        boolean r131 = r59.i;
        boolean r132 = r59.j;
        boolean r133 = r59.k;
        int r70 = r59.b;
        new ArrayList(r60);
        new ArrayList(r62);
        nk1 r134 = new nk1(r68, r69, r130, r131, r132, r133, r70, r63, r59.l, r59.m, new ArrayList(r59.n));
        Retrofit.Builder r71 = new Retrofit.Builder();
        String r72 = r29.j();
        if (r72 == null) goto L75;
        String r73 = qm4.K0(r72).toString();
    L76:
        if (r73 == null) goto L101;
        r13 = r73;
    L101:
        fr1 r74 = new fr1();     // Catch: IllegalArgumentException -> L83
        gr1 r75 = null;
        r74.e(null, r13);     // Catch: IllegalArgumentException -> L94
        gr1 r135 = r74.b();     // Catch: IllegalArgumentException -> L94
    L85:
        if (r135 != null) goto L87;
    L89:
        Retrofit.Builder r76 = r71.baseUrl(r12).addConverterFactory(GsonConverterFactory.create(r134));
        cx r77 = new cx();
        rx r78 = new rx(r77);
        r77.a = 2592000;
        n83 r79 = new n83();
        r79.a(2, r8);
        r79.b(20, r5);
        r79.z = ze5.b(30, r5);
        r79.A = ze5.b(30, r5);
        dr1 r80 = new dr1();
        r80.b = cr1.n;
        r79.c.add(r80);
        r79.c.add(r78);
        File r81 = App.a().getCacheDir();
        r81.getClass();
        r79.l = new hx(r81);
        SSLSocketFactory r82 = x30.b;
        if (r82 == null) goto L92;
        r79.c(r82, x30.a);
    L92:
        Retrofit r83 = r76.client(new o83(r79)).build();
        r83.getClass();
        this.p = (zi2) r83.create(zi2.class);
        return;
    L87:
        if (r135.d.length() <= 0) goto L89;
        r12 = r13;
    L84:
        r135 = r75;
    L83:
        r75 = null;
        goto L84
    L75:
        r73 = null;
        goto L76
    }

    @Override // defpackage.b93
    public void a(jw r1) {
        ((Map) ((xc5) this.p).p).remove((cr4) this.o);
    }

    @Override // defpackage.rh0
    public void b(Exception r4) {
        fj4 r0 = (fj4) this.p;
        tw2 r1 = (tw2) this.o;
        tw2 r2 = r0.s;
        if (r2 == null) goto L7;
        if (r2 != r1) goto L8;
        fj4 r3 = (fj4) this.p;
        tw2 r5 = (tw2) this.o;
        xi0 r6 = r3.o;
        qh0 r7 = r3.t;
        sh0 r8 = r5.c;
        r6.b(r7, r4, r8, r8.e());
        return;
    L8:
        return;
    }

    public boolean c(long r7) {
        List r6 = (List) ((rf2) this.p).n;
        int r0 = r6.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        Object r3 = r6.get(r2);
        if (vr1.n(((qn3) r3).a, r7) == true) goto L9;
        r2 = r2 + 1;
    L9:
        qn3 r4 = (qn3) r3;
        if (r4 != null) goto L12;
        return false;
    L12:
        return r4.h;
    L8:
        r3 = null;
        goto L9
    }

    @Override // defpackage.ez
    public void cancel() {
        if (((fl) this.p).compareAndSet(1, 1) == true) goto L6;
        ((jo) this.o).invoke();
        return;
    }

    public void d() {
        this.o = null;
        this.p = null;
    }

    public Call e(String r3) {
        Log.d("BrowsingClient", "getAlbum()");
        return ((ov) this.p).f(((pn4) this.o).f(), r3);
    }

    @Override // defpackage.rh0
    public void f(Object r7) {
        fj4 r0 = (fj4) this.p;
        tw2 r1 = (tw2) this.o;
        tw2 r2 = r0.s;
        if (r2 == null) goto L17;
        if (r2 != r1) goto L18;
        fj4 r3 = (fj4) this.p;
        tw2 r6 = (tw2) this.o;
        xq0 r4 = r3.n.p;
        if (r7 != null) goto L8;
    L15:
        xi0 r5 = r3.o;
        f42 r8 = r6.a;
        sh0 r9 = r6.c;
        r5.a(r8, r7, r9, r9.e(), r3.t);
        return;
    L8:
        if (r4.a(r6.c.e()) == false) goto L15;
        r3.r = r7;
        xi0 r10 = r3.o;
        r10.R = 2;
        m11 r11 = r10.C;
        if (r11.z == false) goto L12;
        li1 r12 = r11.v;
    L13:
        r12.execute(r10);
        return;
    L12:
        r12 = r11.u;
        goto L13
    L18:
        return;
    }

    @Override // defpackage.lm3
    public void g() {
        gm3 r3 = (gm3) this.p;
        im3.c(r3.f, r3.e, true);
        r3.b.g();
    }

    @Override // defpackage.kg1
    public void h(Object r10) {
        gr2 r11 = (gr2) r10;
        jn2 r5 = (jn2) this.p;
        lb4 r9 = (lb4) this.o;
        yw1 r0 = r11.a;
        if (r0.isEmpty() == false) goto L6;
        r9.l(new m92(-2, SystemClock.elapsedRealtime(), r5, new xa4("no error message provided", -2, Bundle.EMPTY), null, 4));
        return;
    L6:
        r9.l(m92.c(yw1.o((gn2) r0.get(Math.max(0, Math.min(r11.b, r0.size() - 1)))), r5));
    }

    public Call i(String r3) {
        Log.d("BrowsingClient", "getArtist()");
        return ((ov) this.p).e(((pn4) this.o).f(), r3);
    }

    public Call j() {
        Log.d("BrowsingClient", "getArtists()");
        return ((ov) this.p).k(((pn4) this.o).f(), ud3.k());
    }

    public KeyListener k(KeyListener r2) {
        if ((r2 instanceof NumberKeyListener) == true) goto L15;
        ((xc5) ((zg5) this.p).n).getClass();
        if ((r2 instanceof d01) == false) goto L7;
        return r2;
    L7:
        if (r2 != null) goto L11;
        return null;
    L11:
        if ((r2 instanceof NumberKeyListener) == false) goto L14;
        return r2;
    L14:
        return new d01(r2);
    L15:
        return r2;
    }

    public Long l(String r5) {
        w24 r1 = w24.b(1, "SELECT long_value FROM Preference where `key`=?");
        r1.h(1, r5);
        s24 r4 = (s24) this.o;
        r4.b();
        Cursor r6 = xl.H(r4, r1);
        Long r0 = null;
        if (r6.moveToFirst() == true) goto L6;
    L12:
        r6.close();
        r1.j();
        return r0;
    L6:
        if (r6.isNull(0) == true) goto L12;
        r0 = Long.valueOf(r6.getLong(0));     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r6.close();
        r1.j();
        throw th;
    }

    public Call m(String r3) {
        Log.d("BrowsingClient", "getSong()");
        return ((ov) this.p).c(((pn4) this.o).f(), r3);
    }

    public void n(fp3 r2) {
        s24 r0 = (s24) this.o;
        r0.b();
        r0.c();
        ((vo0) this.p).m(r2);     // Catch: Throwable -> L6
        r0.t();     // Catch: Throwable -> L6
        r0.o();
        return;
    L6:
        th = move-exception;
        r0.o();
        throw th;
    }

    @Override // defpackage.kg1
    public void o(Throwable r10) {
        ((lb4) this.o).l(new m92(-1, SystemClock.elapsedRealtime(), (jn2) this.p, new xa4("no error message provided", -1, Bundle.EMPTY), null, 4));
        l93.G("MediaSessionImpl", "Failed fetching recent media item at boot time: " + r10.getMessage(), r10);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        ((Consumer) this.o).accept(kb4.d((String) this.p, Collections.EMPTY_LIST));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r2, Response r3) {
        ArrayList r4 = new ArrayList();
        if (r3.isSuccessful() == true) goto L5;
    L11:
        ((Consumer) this.o).accept(kb4.d((String) this.p, r4));
        return;
    L5:
        if (r3.body() == null) goto L11;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbum() == null) goto L11;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbum().getSongs() == null) goto L11;
        r4.addAll(((ApiResponse) r3.body()).getSubsonicResponse().getAlbum().getSongs());
        goto L11
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        gm3 r0 = (gm3) this.p;
        im3 r1 = r0.f;
        r1.f = null;
        if (r1.e(r0.e) == false) goto L6;
        r1.i = r1.h;
        r1.j.k((ArrayList) this.o);
        return;
    }

    public void p(AttributeSet r4, int r5) {
        TypedArray r6 = ((EditText) this.o).getContext().obtainStyledAttributes(r4, st3.i, r5, 0);
        boolean r1 = true;
        if (r6.hasValue(14) == false) goto L9;
        r1 = r6.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r6.recycle();
        v(r1);
        return;
    L7:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    public AutofillId q(long r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        ContentCaptureSession r0 = kz.d(this.o);
        hg3 r2 = bu.l((View) this.p);
        Objects.requireNonNull(r2);
        return yh.d(r0, tn.f(r2.o), r3);
    L6:
        return null;
    }

    public a01 r(InputConnection r2, EditorInfo r3) {
        zg5 r1 = (zg5) this.p;
        if (r2 != null) goto L5;
        r1.getClass();
        InputConnection r4 = null;
    L11:
        return (a01) r4;
    L5:
        xc5 r5 = (xc5) r1.n;
        r5.getClass();
        if ((r2 instanceof a01) == true) goto L9;
        r2 = new a01(r3, r2, (EditText) r5.o);
    L9:
        r4 = r2;
        goto L11
    }

    public void s(Bundle r4) {
        xm2 r3 = (xm2) this.o;
        j54 r0 = (j54) r3.d;
        if (r3.a == true) goto L6;
        r3.a();
    L6:
        if (r0.h().h.compareTo(r92.q) < 0) goto L8;
        nz2.u(r0.h().h, "performRestore cannot be called when owner is ");
        return;
    L8:
        if (r3.b == true) goto L16;
        Bundle r1 = null;
        if (r4 != null) goto L12;
    L14:
        r3.h = r1;
        r3.b = true;
        return;
    L12:
        if (r4.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key") == false) goto L14;
        r1 = jz4.w("androidx.lifecycle.BundlableSavedStateRegistry.key", r4);
        goto L14
    L16:
        kf2.o("SavedStateRegistry was already restored.");
    }

    public void t(Bundle r5) {
        xm2 r4 = (xm2) this.o;
        Bundle r0 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        Bundle r1 = (Bundle) r4.h;
        if (r1 == null) goto L5;
        r0.putAll(r1);
    L5:
        xi4 r2 = (xi4) r4.f;
        monitor-enter(r2);
        Iterator r6 = ((LinkedHashMap) r4.g).entrySet().iterator();     // Catch: Throwable -> L12
    L9:
        if (r6.hasNext() == false) goto L14;
        Map.Entry r3 = (Map.Entry) r6.next();     // Catch: Throwable -> L12
        String r7 = (String) r3.getKey();     // Catch: Throwable -> L12
        Bundle r8 = ((i54) r3.getValue()).a();     // Catch: Throwable -> L12
        r7.getClass();     // Catch: Throwable -> L12
        r0.putBundle(r7, r8);     // Catch: Throwable -> L12
        goto L9
    L14:
        monitor-exit(r2);
        if (r0.isEmpty() == true) goto L25;
        r5.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", r0);
        return;
    L25:
        return;
    L12:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.n) {
            case 18: goto L6;
            default: goto L5;
        };
    L6:
        String r1 = "[ ";
        if (((ai4) this.o) == null) goto L12;
        int r0 = 0;
    L10:
        if (r0 >= 9) goto L12;
        StringBuilder r2 = xa3.i(r1);
        r2.append(((ai4) this.o).u[r0]);
        r2.append(" ");
        r1 = r2.toString();
        r0 = r0 + 1;
    L12:
        StringBuilder r3 = b11.s(r1, "] ");
        r3.append((ai4) this.o);
        return r3.toString();
    L5:
        return super.toString();
    }

    public Call u() {
        Log.d("SystemClient", "ping()");
        int r0 = ud3.x();
        gq4 r1 = (gq4) this.p;
        pn4 r7 = (pn4) this.o;
        Call<ApiResponse> r2 = r1.b(r7.f());
        String r8 = r7.j();
        String r3 = ud3.v();
        AtomicInteger r4 = ra0.a;
        TimeUnit r5 = TimeUnit.SECONDS;
        if (r8 == null) goto L20;
        if (r3 == null) goto L20;
        if (r3.length() == 0) goto L20;
        String r6 = qm4.L0(r3, new char[]{'/'});
        if (r6.length() == 0) goto L20;
        if (xm4.k0(r8, r6, false) == false) goto L20;
        if (r8.length() != r6.length()) goto L17;
    L18:
        r2.timeout().g(r0, r5);
        return r2;
    L17:
        if (r8.charAt(r6.length()) == '/') goto L18;
    L20:
        r2.timeout().g(Math.min(r0 * 2, 10), r5);
        return r2;
    }

    public void v(boolean r5) {
        l01 r4 = (l01) ((xc5) ((zg5) this.p).n).p;
        if (r4.p != r5) goto L5;
        return;
    L5:
        if (r4.o == null) goto L12;
        tz0 r0 = tz0.a();
        k01 r1 = r4.o;
        r0.getClass();
        l93.m(r1, "initCallback cannot be null");
        ReentrantReadWriteLock r2 = r0.a;
        r2.writeLock().lock();
        r0.b.remove(r1);     // Catch: Throwable -> L9
        r2.writeLock().unlock();
    L9:
        th = move-exception;
        r2.writeLock().unlock();
        throw th;
    L12:
        r4.p = r5;
        if (r5 == false) goto L19;
        l01.a(r4.n, tz0.a().b());
        return;
    }

    public Call w(int r3, String r4) {
        Log.d("MediaAnnotationClient", "setRating()");
        return ((zi2) this.p).a(((pn4) this.o).f(), r4, r3);
    }

    @Override // defpackage.r83
    public pb5 x(View r4, pb5 r5) {
        b85 r0 = (b85) this.o;
        c85 r3 = (c85) this.p;
        c85 r1 = new c85();
        r1.a = r3.a;
        r1.b = r3.b;
        r1.c = r3.c;
        r1.d = r3.d;
        return r0.m(r4, r5, r1);
    }

    public el y() {
        File r0 = (File) this.p;
        File r4 = (File) this.o;
        if (r4.exists() == true) goto L5;
    L24:
        return new el(r4);
    L12:
        e = move-exception;
        File r1 = r4.getParentFile();
        if (r1 == null) goto L23;
        if (r1.mkdirs() == false) goto L23;
        return new el(r4);
    L19:
        e = move-exception;
        throw new IOException("Couldn't create " + r4, e);
    L23:
        throw new IOException("Couldn't create " + r4, e);
    L5:
        if (r0.exists() == false) goto L7;
        r4.delete();
        goto L24
    L7:
        if (r4.renameTo(r0) == true) goto L24;
        l93.q0("AtomicFile", "Couldn't rename file " + r4 + " to backup file " + r0);
        goto L24
    }

    public /* synthetic */ gp3(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ gp3(int r1, boolean r2) {
        this.n = r1;
    }

    public /* synthetic */ gp3(Object r1, Object r2, boolean r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
    }

    public /* synthetic */ gp3(int r1, Object r2) {
        this.n = r1;
        this.p = r2;
    }

    public gp3(xm2 r2) {
        this.n = 19;
        this.o = r2;
        rm3 r0 = new rm3();
        r0.n = r2;
        this.p = r0;
    }

    public gp3(WorkDatabase r2) {
        this.n = 0;
        this.o = r2;
        this.p = new vo0(r2);
    }

    public gp3(jo r2) {
        this.n = 16;
        this.o = r2;
        this.p = new fl(0);
    }

    public gp3(EditText r3) {
        this.n = 2;
        this.o = r3;
        zg5 r0 = new zg5();
        r0.n = new xc5(r3);
        this.p = r0;
    }

    public gp3(File r3) {
        this.n = 3;
        this.o = r3;
        this.p = new File(r3.getPath() + ".bak");
    }

    public gp3(int r1) {
        this.n = r1;
        switch(r1) {
            case 12: goto L6;
            default: goto L4;
        };
    L4:
        this.o = qr2.q;
        return;
    L6:
        this.o = new HashMap();
        this.p = new HashMap();
    }

    public gp3(ArrayList r5, ArrayList r6) {
        this.n = 10;
        int r0 = r5.size();
        this.o = new int[r0];
        this.p = new float[r0];
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((int[]) this.o)[r1] = ((Integer) r5.get(r1)).intValue();
        ((float[]) this.p)[r1] = ((Float) r6.get(r1)).floatValue();
        r1 = r1 + 1;
        goto L3
    }

    public gp3(int r2, int r3) {
        this.n = 10;
        this.o = new int[]{r2, r3};
        this.p = new float[]{0.0f, 1.0f};
    }

    public gp3(int r2, int r3, int r4) {
        this.n = 10;
        this.o = new int[]{r2, r3, r4};
        this.p = new float[]{0.0f, 0.5f, 1.0f};
    }
}
