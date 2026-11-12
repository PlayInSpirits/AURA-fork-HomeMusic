package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xc5 implements xs, Callback, in4, ps, m54, g84 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public xc5(pn4 r29, int r30) {
        this.n = r30;
        TimeUnit r5 = TimeUnit.SECONDS;
        TimeUnit r8 = TimeUnit.MINUTES;
        String r12 = "https://localhost/rest/";
        String r13 = "";
        switch(r30) {
            case 11: goto L91;
            case 14: goto L62;
            case 16: goto L33;
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
        if (r23 == null) goto L128;
        r13 = r23;
    L128:
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
        this.p = (w8) r34.create(w8.class);
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
        if (r49 == null) goto L124;
        r13 = r49;
    L124:
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
        this.p = (n93) r58.create(n93.class);
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
        if (r73 == null) goto L132;
        r13 = r73;
    L132:
        fr1 r74 = new fr1();     // Catch: IllegalArgumentException -> L81
        r74.e(null, r13);     // Catch: IllegalArgumentException -> L81
        gr1 r135 = r74.b();     // Catch: IllegalArgumentException -> L81
    L82:
        if (r135 != null) goto L84;
    L86:
        Retrofit.Builder r75 = r71.baseUrl(r12).addConverterFactory(GsonConverterFactory.create(r134));
        cx r76 = new cx();
        rx r77 = new rx(r76);
        r76.a = 2592000;
        n83 r78 = new n83();
        r78.a(2, r8);
        r78.b(20, r5);
        r78.z = ze5.b(30, r5);
        r78.A = ze5.b(30, r5);
        dr1 r79 = new dr1();
        r79.b = cr1.n;
        r78.c.add(r79);
        r78.c.add(r77);
        File r80 = App.a().getCacheDir();
        r80.getClass();
        r78.l = new hx(r80);
        SSLSocketFactory r81 = x30.b;
        if (r81 == null) goto L89;
        r78.c(r81, x30.a);
    L89:
        Retrofit r82 = r75.client(new o83(r78)).build();
        r82.getClass();
        this.p = (so2) r82.create(so2.class);
        return;
    L84:
        if (r135.d.length() <= 0) goto L86;
        r12 = r13;
    L81:
        r135 = null;
        goto L82
    L75:
        r73 = null;
        goto L76
    L91:
        this.o = r29;
        ok1 r83 = new ok1();
        r83.a(Date.class, new r01());
        r83.a(Bookmarks.class, new lt());
        r83.j = true;
        ArrayList r84 = r83.e;
        int r85 = r84.size();
        ArrayList r86 = r83.f;
        ArrayList r87 = new ArrayList((r86.size() + r85) + 3);
        r87.addAll(r84);
        Collections.reverse(r87);
        ArrayList r88 = new ArrayList(r86);
        Collections.reverse(r88);
        r87.addAll(r88);
        int r89 = r83.g;
        int r90 = r83.h;
        ak0 r136 = bk0.b;
        boolean r137 = gk4.a;
        if (r89 == 2) goto L101;
        if (r90 == 2) goto L101;
        dz4 r138 = r136.a(r89, r90);
        if (r137 == false) goto L97;
        dz4 r139 = gk4.c.a(r89, r90);
        dz4 r91 = gk4.b.a(r89, r90);
    L98:
        r87.add(r138);
        if (r137 == false) goto L101;
        r87.add(r139);
        r87.add(r91);
        goto L101
    L97:
        r91 = null;
        r139 = null;
    L101:
        u21 r92 = r83.a;
        int r93 = r83.c;
        HashMap r140 = new HashMap(r83.d);
        boolean r141 = r83.i;
        boolean r142 = r83.j;
        boolean r143 = r83.k;
        int r94 = r83.b;
        new ArrayList(r84);
        new ArrayList(r86);
        nk1 r144 = new nk1(r92, r93, r140, r141, r142, r143, r94, r87, r83.l, r83.m, new ArrayList(r83.n));
        Retrofit.Builder r95 = new Retrofit.Builder();
        String r96 = r29.j();
        if (r96 == null) goto L104;
        String r97 = qm4.K0(r96).toString();
    L105:
        if (r97 == null) goto L130;
        r13 = r97;
    L130:
        fr1 r98 = new fr1();     // Catch: IllegalArgumentException -> L112
        gr1 r99 = null;
        r98.e(null, r13);     // Catch: IllegalArgumentException -> L123
        gr1 r145 = r98.b();     // Catch: IllegalArgumentException -> L123
    L114:
        if (r145 != null) goto L116;
    L118:
        Retrofit.Builder r100 = r95.baseUrl(r12).addConverterFactory(GsonConverterFactory.create(r144));
        cx r101 = new cx();
        rx r102 = new rx(r101);
        r101.a = 2592000;
        n83 r103 = new n83();
        r103.a(2, r8);
        r103.b(20, r5);
        r103.z = ze5.b(30, r5);
        r103.A = ze5.b(30, r5);
        dr1 r104 = new dr1();
        r104.b = cr1.n;
        r103.c.add(r104);
        r103.c.add(r102);
        File r105 = App.a().getCacheDir();
        r105.getClass();
        r103.l = new hx(r105);
        SSLSocketFactory r106 = x30.b;
        if (r106 == null) goto L121;
        r103.c(r106, x30.a);
    L121:
        Retrofit r107 = r100.client(new o83(r103)).build();
        r107.getClass();
        this.p = (x02) r107.create(x02.class);
        return;
    L116:
        if (r145.d.length() <= 0) goto L118;
        r12 = r13;
    L113:
        r145 = r99;
    L112:
        r99 = null;
        goto L113
    L104:
        r97 = null;
        goto L105
    }

    public static void l(xc5 r4, boolean r5, boolean r6) {
        monitor-enter(r4);
        boolean r0 = false;
        if (r5 == true) goto L34;
    L20:
        PowerManager.WakeLock r2 = (PowerManager.WakeLock) r4.p;     // Catch: Throwable -> L12
        if (r2 != null) goto L24;
        monitor-exit(r4);
        return;
    L24:
        if (r5 == false) goto L27;
        if (r6 == false) goto L27;
        r0 = true;
    L27:
        if (r0 == false) goto L29;
        r2.acquire();     // Catch: Throwable -> L12
    L30:
        monitor-exit(r4);
        return;
    L29:
        r2.release();     // Catch: Throwable -> L12
        goto L30
    L34:
    L12:
        th = move-exception;
        throw th;
    L6:
        if (((PowerManager.WakeLock) r4.p) != null) goto L20;
        if (((Context) r4.o).checkSelfPermission("android.permission.WAKE_LOCK") == 0) goto L14;
        l93.q0("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");     // Catch: Throwable -> L12
        monitor-exit(r4);
        return;
    L14:
        PowerManager r3 = (PowerManager) ((Context) r4.o).getSystemService("power");     // Catch: Throwable -> L12
        if (r3 != null) goto L19;
        l93.q0("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");     // Catch: Throwable -> L12
        monitor-exit(r4);
        return;
    L19:
        PowerManager.WakeLock r7 = r3.newWakeLock(1, "ExoPlayer:WakeLockManager");     // Catch: Throwable -> L12
        r4.p = r7;     // Catch: Throwable -> L12
        r7.setReferenceCounted(false);     // Catch: Throwable -> L12
        goto L20
    }

    public static int r(int r5, int r6) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r1 >= r5) goto L12;
        r2 = r2 + 1;
        if (r2 != r6) goto L8;
        r3 = r3 + 1;
        r2 = 0;
    L10:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 <= r6) goto L10;
        r3 = r3 + 1;
        r2 = 1;
        goto L10
    L12:
        if ((r2 + 1) > r6) goto L14;
        return r3;
    L14:
        return r3 + 1;
    }

    @Override // defpackage.g84
    public void a(be3 r10) {
        qy4 r0 = (qy4) this.p;
        SparseArray r1 = r0.h;
        h00 r9 = (h00) this.o;
        if (r10.A() == 0) goto L6;
        return;
    L6:
        if ((r10.A() & 128) == 0) goto L27;
        r10.O(6);
        int r2 = r10.a() / 4;
        int r5 = 0;
    L9:
        if (r5 >= r2) goto L18;
        r10.k(r9.b, 0, 4);
        r9.q(0);
        int r6 = r9.i(16);
        r9.t(3);
        if (r6 != 0) goto L13;
        r9.t(13);
    L16:
        r5 = r5 + 1;
        goto L9
    L13:
        int r7 = r9.i(13);
        if (r1.get(r7) != null) goto L16;
        r1.put(r7, new h84(new ew4(r0, r7)));
        r0.n++;
        goto L16
    L18:
        if (r0.a == 2) goto L25;
        r1.remove(0);
        return;
    L25:
        return;
    }

    @Override // defpackage.in4
    public jn4 apply() {
        return ((o72) this.o).f(this.p);
    }

    @Override // defpackage.g84
    public void b(iu4 r1, m51 r2, sy4 r3) {
    }

    @Override // defpackage.ps
    public os c(l51 r17, long r18) {
        long r4 = r17.getPosition();
        int r1 = (int) Math.min(20000, r17.getLength() - r4);
        be3 r2 = (be3) this.p;
        r2.K(r1);
        r17.n(r2.a, 0, r1);
        int r3 = -1;
        int r5 = -1;
        long r10 = -9223372036854775807L;
    L4:
        if (r2.a() < 4) goto L53;
        if (r71.a(r2.b, r2.a) != 442) goto L7;
        r2.O(4);
        long r14 = sr3.c(r2);
        if (r14 == (-9223372036854775807L)) goto L22;
        long r15 = ((iu4) this.o).b(r14);
        if (r15 > r18) goto L13;
        r10 = r15;
        long r16 = 100000 + r10;
        r5 = r2.b;
        if (r16 <= r18) goto L22;
        return new os(0, -9223372036854775807L, r4 + ((long) r5));
    L13:
        if (r10 != (-9223372036854775807L)) goto L17;
        return new os(-1, r15, r4);
    L17:
        return new os(0, -9223372036854775807L, r4 + ((long) r5));
    L22:
        int r6 = r2.c;
        if (r2.a() >= 10) goto L25;
        r2.N(r6);
    L51:
        r3 = r2.b;
        goto L4
    L25:
        r2.O(9);
        int r8 = r2.A() & 7;
        if (r2.a() >= r8) goto L28;
        r2.N(r6);
        goto L51
    L28:
        r2.O(r8);
        if (r2.a() >= 4) goto L32;
        r2.N(r6);
        goto L51
    L32:
        if (r71.a(r2.b, r2.a) != 443) goto L38;
        r2.O(4);
        int r9 = r2.H();
        if (r2.a() >= r9) goto L36;
        r2.N(r6);
        goto L51
    L36:
        r2.O(r9);
    L38:
        if (r2.a() < 4) goto L51;
        int r11 = r71.a(r2.b, r2.a);
        if (r11 == 442) goto L51;
        if (r11 == 441) goto L51;
        if ((r11 >>> 8) != 1) goto L51;
        r2.O(4);
        if (r2.a() < 2) goto L49;
        r2.N(Math.min(r2.c, r2.b + r2.H()));
        goto L38
    L49:
        r2.N(r6);
        goto L51
    L7:
        r2.O(1);
        goto L4
    L53:
        if (r10 == (-9223372036854775807L)) goto L57;
        return new os(-2, r10, r4 + ((long) r3));
    L57:
        return os.e;
    }

    @Override // defpackage.in4
    public void cancel() {
    }

    @Override // defpackage.in4
    public boolean d() {
        return true;
    }

    @Override // defpackage.in4
    public boolean e(bt2 r1) {
        return true;
    }

    @Override // defpackage.m54
    public Object f(Object r1) {
        return ((if1) this.p).invoke(r1);
    }

    @Override // defpackage.xs
    public ic2 g(Uri r3) {
        r20 r0 = (r20) this.p;
        if (r0 == null) goto L10;
        Uri r1 = (Uri) r0.p;
        if (r1 == null) goto L10;
        if (r1.equals(r3) == false) goto L10;
        ic2 r2 = (ic2) ((r20) this.p).q;
        r2.getClass();
        return r2;
    L10:
        ic2 r4 = ((xs) this.o).g(r3);
        this.p = new r20(r3, r4);
        return r4;
    }

    @Override // defpackage.m54
    public Object h(t44 r1, Object r2) {
        return ((wf1) this.o).invoke(r1, r2);
    }

    @Override // defpackage.xs
    public ic2 i(do2 r4) {
        r20 r0 = (r20) this.p;
        if (r0 == null) goto L14;
        Uri r1 = (Uri) r0.p;
        if (r1 != null) goto L7;
    L8:
        byte[] r2 = (byte[]) r0.o;
        if (r2 == null) goto L14;
        if (Arrays.equals(r2, r4.k) == false) goto L14;
    L12:
        ic2 r3 = (ic2) ((r20) this.p).q;
        r3.getClass();
        return r3;
    L7:
        if (r1.equals(r4.m) == true) goto L12;
    L14:
        ic2 r5 = ((xs) this.o).i(r4);
        if (r5 != null) goto L18;
        return null;
    L18:
        this.p = new r20(r4, r5);
        return r5;
    }

    @Override // defpackage.xs
    public ic2 j(byte[] r3) {
        r20 r0 = (r20) this.p;
        if (r0 == null) goto L10;
        byte[] r1 = (byte[]) r0.o;
        if (r1 == null) goto L10;
        if (Arrays.equals(r1, r3) == false) goto L10;
        ic2 r2 = (ic2) ((r20) this.p).q;
        r2.getClass();
        return r2;
    L10:
        ic2 r4 = ((xs) this.o).j(r3);
        this.p = new r20(r3, r4);
        return r4;
    }

    @Override // defpackage.ps
    public void k() {
        be3 r2 = (be3) this.p;
        byte[] r0 = f35.b;
        r2.getClass();
        r2.L(r0.length, r0);
    }

    public void m(Object r2, String r3) {
        HashMap r0 = (HashMap) this.o;
        r2.getClass();
        r0.put(r3, r2);
        ((ArrayList) this.p).remove(r3);
    }

    public void n() {
        int[] r0 = (int[]) this.o;
        if (r0 == null) goto L5;
        Arrays.fill(r0, -1);
    L5:
        this.p = null;
    }

    public void o(bj0 r4) {
        monitor-enter(r4);
        monitor-exit(r4);
        Handler r0 = (Handler) this.o;
        if (r0 == null) goto L8;
        r0.post(new km(this, r4, 0));
        return;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        ((hq1) this.o).l();
        return;
    L6:
        d34.r((l61) this.o, (StarCallback) this.p);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r12, Response r13) {
        switch(this.n) {
            case 8: goto L37;
            default: goto L4;
        };
    L4:
        hq1 r14 = (hq1) this.o;
        if (mm3.f(r13) == false) goto L8;
        ((mm3) this.p).g();
    L8:
        if (mm3.f(r13) == false) goto L35;
        String r11 = (String) r14.c;
        im3 r15 = (im3) r14.g;
        k03 r0 = r15.j;
        List r1 = (List) r0.d();
        if (r1 == ((ArrayList) r14.b)) goto L30;
        Playlist r2 = r15.e;
        if (r2 == null) goto L30;
        if (r2.getId().equals(r11) == false) goto L30;
        List r3 = (List) r14.d;
        if (r1 != null) goto L19;
    L29:
        im3.c(r15, r11, true);
    L31:
        final ew4 r5 = (ew4) r14.e;
        final MainActivity r10 = (MainActivity) r5.p;
        qp4 r16 = r10.R;
        if (r16 == null) goto L50;
        FrameLayout r17 = (FrameLayout) r16.c;
        int[] r18 = qg4.E;
        qg4 r19 = qg4.h(r17, r17.getResources().getText(R.string.playlist_chooser_dialog_toast_remove_success), 0);
        r19.e(r10.u());
        final im3 r6 = (im3) r5.q;
        final String r7 = (String) r5.r;
        final Child r8 = (Child) r5.s;
        final int r9 = r5.o;
        r19.i(R.string.song_bottom_sheet_undo, new gi4(r5, r6, r7, r8, r9, r10));
        r19.j();
        return;
    L50:
        return;
    L19:
        if (r1.size() != r3.size()) goto L29;
        int r20 = 0;
    L23:
        if (r20 >= r1.size()) goto L28;
        if (((Child) r1.get(r20)).getId().equals(((Child) r3.get(r20)).getId()) == false) goto L29;
        r20 = r20 + 1;
        goto L23
    L28:
        r15.f = null;
        int r110 = r15.h + 1;
        r15.h = r110;
        r15.i = r110;
        ArrayList r111 = new ArrayList(r1);
        r111.remove(r14.a);
        r0.k(r111);
    L30:
        r15.f = null;
        goto L31
    L35:
        r14.l();
        return;
    L37:
        l61 r112 = (l61) this.o;
        StarCallback r113 = (StarCallback) this.p;
        if (r13.isSuccessful() == false) goto L43;
        if (d34.w(r13) == true) goto L43;
        n61.a(r112);
        r113.onSuccess();
        return;
    L43:
        if (d34.w(r13) == false) goto L45;
        n61.j(r112);
        r113.onRefused();
        return;
    L45:
        d34.r(r112, r113);
    }

    public void p(int r5) {
        int[] r0 = (int[]) this.o;
        if (r0 != null) goto L7;
        int[] r6 = new int[Math.max(r5, 10) + 1];
        this.o = r6;
        Arrays.fill(r6, -1);
        return;
    L7:
        if (r5 < r0.length) goto L14;
        int r2 = r0.length;
    L9:
        if (r2 > r5) goto L11;
        r2 = r2 * 2;
        goto L9
    L11:
        int[] r7 = new int[r2];
        this.o = r7;
        System.arraycopy(r0, 0, r7, 0, r0.length);
        int[] r4 = (int[]) this.o;
        Arrays.fill(r4, r0.length, r4.length, -1);
        return;
    }

    public Call q(String r10, int r11, int r12, Integer r13, Integer r14) {
        Log.d("BrowsingClient", "getAlbumList2()");
        return ((w8) this.p).b(((pn4) this.o).f(), r10, r11, r12, r13, r14, ud3.k());
    }

    public Call s() {
        Log.d("BrowsingClient", "getStarred2()");
        return ((w8) this.p).d(((pn4) this.o).f());
    }

    public void t() {
        ((SparseIntArray) this.o).clear();
    }

    public void u(int r4, int r5) {
        int[] r0 = (int[]) this.o;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r4 >= r0.length) goto L21;
        int r1 = r4 + r5;
        p(r1);
        int[] r2 = (int[]) this.o;
        System.arraycopy(r2, r4, r2, r1, (r2.length - r4) - r5);
        Arrays.fill((int[]) this.o, r4, r1, -1);
        ArrayList r3 = (ArrayList) this.p;
        if (r3 == null) goto L22;
        int r6 = r3.size() - 1;
    L11:
        if (r6 < 0) goto L23;
        pk4 r7 = (pk4) ((ArrayList) this.p).get(r6);
        int r8 = r7.n;
        if (r8 < r4) goto L16;
        r7.n = r8 + r5;
    L16:
        r6 = r6 - 1;
        goto L11
    L23:
        return;
    L22:
        return;
    }

    public void v(int r6, int r7) {
        int[] r0 = (int[]) this.o;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r6 >= r0.length) goto L24;
        int r1 = r6 + r7;
        p(r1);
        int[] r2 = (int[]) this.o;
        System.arraycopy(r2, r1, r2, r6, (r2.length - r6) - r7);
        int[] r3 = (int[]) this.o;
        Arrays.fill(r3, r3.length - r7, r3.length, -1);
        ArrayList r4 = (ArrayList) this.p;
        if (r4 == null) goto L25;
        int r5 = r4.size() - 1;
    L11:
        if (r5 < 0) goto L26;
        pk4 r8 = (pk4) ((ArrayList) this.p).get(r5);
        int r9 = r8.n;
        if (r9 < r6) goto L18;
        if (r9 >= r1) goto L17;
        ((ArrayList) this.p).remove(r5);
        goto L18
    L17:
        r8.n = r9 - r7;
    L18:
        r5 = r5 - 1;
        goto L11
    L26:
        return;
    L25:
        return;
    }

    public void w(int r2, Bundle r3, Messenger r4) {
        Message r0 = Message.obtain();
        r0.what = r2;
        r0.arg1 = 1;
        if (r3 == null) goto L5;
        r0.setData(r3);
    L5:
        r0.replyTo = r4;
        ((Messenger) this.o).send(r0);
    }

    public void x(boolean r4, Status r5) {
        Map r0 = (Map) this.o;
        monitor-enter(r0);
        HashMap r1 = new HashMap((Map) this.o);     // Catch: Throwable -> L30
        monitor-exit(r0);     // Catch: Throwable -> L30
        Map r2 = (Map) this.p;
        monitor-enter(r2);
        HashMap r3 = new HashMap((Map) this.p);     // Catch: Throwable -> L27
        monitor-exit(r2);     // Catch: Throwable -> L27
        Iterator r6 = r1.entrySet().iterator();
    L12:
        if (r6.hasNext() == false) goto L18;
        Map.Entry r7 = (Map.Entry) r6.next();
        if (r4 == true) goto L17;
        if (((Boolean) r7.getValue()).booleanValue() == false) goto L12;
    L17:
        ((BasePendingResult) r7.getKey()).c(r5);
        goto L12
    L18:
        Iterator r8 = r3.entrySet().iterator();
    L20:
        if (r8.hasNext() == false) goto L26;
        Map.Entry r9 = (Map.Entry) r8.next();
        if (r4 == true) goto L25;
        if (((Boolean) r9.getValue()).booleanValue() == false) goto L20;
    L25:
        ((cr4) r9.getKey()).c(new ApiException(r5));
        goto L20
    L26:
        return;
    L27:
        th = move-exception;
        throw th;
    L30:
        th = move-exception;
        throw th;
    }

    public /* synthetic */ xc5(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ xc5(int r1, boolean r2) {
        this.n = r1;
    }

    public /* synthetic */ xc5(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public xc5(WorkDatabase_Impl r3) {
        this.n = 0;
        this.o = r3;
        this.p = new vo0(r3, 3);
    }

    public xc5(iu4 r2) {
        this.n = 18;
        this.o = r2;
        this.p = new be3();
    }

    public xc5(int r1) {
        this.n = r1;
        switch(r1) {
            case 10: goto L8;
            case 23: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new HashMap();
        this.p = new ArrayList();
        return;
    L6:
        this.o = Collections.synchronizedMap(new WeakHashMap());
        this.p = Collections.synchronizedMap(new WeakHashMap());
        return;
    L8:
        this.o = new SparseIntArray();
        this.p = new SparseIntArray();
    }

    public xc5(Animation r2) {
        this.n = 9;
        this.o = r2;
        this.p = null;
    }

    public xc5(Handler r2, qm r3) {
        this.n = 3;
        if (r3 == null) goto L5;
        r2.getClass();
    L6:
        this.o = r2;
        this.p = r3;
        return;
    L5:
        r2 = null;
        goto L6
    }

    public xc5(Animator r2) {
        this.n = 9;
        this.o = null;
        this.p = r2;
    }

    public xc5(EditText r5) {
        this.n = 7;
        this.o = r5;
        l01 r0 = new l01(r5);
        this.p = r0;
        r5.addTextChangedListener(r0);
        if (yz0.b != null) goto L17;
        Object r4 = yz0.a;
        monitor-enter(r4);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (yz0.b != null) goto L13;
        yz0 r1 = new yz0();     // Catch: Throwable -> L11
        yz0.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, yz0.class.getClassLoader());     // Catch: Throwable -> L19
    L10:
        yz0.b = r1;     // Catch: Throwable -> L11
    L13:
        monitor-exit(r4);     // Catch: Throwable -> L11
    L17:
        r5.setEditableFactory(yz0.b);
    }

    public xc5(gy3 r2, int[] r3) {
        this.n = 15;
        this.o = yw1.k(r2);
        this.p = r3;
    }

    public xc5(mm3 r2, hq1 r3) {
        this.n = 17;
        this.p = r2;
        this.o = r3;
    }

    public xc5(qy4 r3) {
        this.n = 21;
        this.p = r3;
        this.o = new h00(4, new byte[4]);
    }

    public xc5(IBinder r2, Bundle r3) {
        this.n = 13;
        this.o = new Messenger(r2);
        this.p = r3;
    }
}
