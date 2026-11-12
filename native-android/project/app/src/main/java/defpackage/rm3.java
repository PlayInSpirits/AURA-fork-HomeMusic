package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class rm3 implements u74, f51, eg1, ak2 {
    public Object n;
    public Object o;

    public rm3(pn4 r29, int r30) {
        TimeUnit r4 = TimeUnit.SECONDS;
        TimeUnit r7 = TimeUnit.MINUTES;
        String r11 = "https://localhost/rest/";
        String r12 = "";
        switch(r30) {
            case 14: goto L62;
            case 17: goto L33;
            default: goto L4;
        };
    L4:
        this.n = r29;
        ok1 r5 = new ok1();
        r5.a(Date.class, new r01());
        r5.a(Bookmarks.class, new lt());
        r5.j = true;
        ArrayList r3 = r5.e;
        int r6 = r3.size();
        ArrayList r15 = r5.f;
        ArrayList r2 = new ArrayList((r15.size() + r6) + 3);
        r2.addAll(r3);
        Collections.reverse(r2);
        ArrayList r8 = new ArrayList(r15);
        Collections.reverse(r8);
        r2.addAll(r8);
        int r9 = r5.g;
        int r10 = r5.h;
        ak0 r13 = bk0.b;
        boolean r16 = gk4.a;
        if (r9 == 2) goto L14;
        if (r10 == 2) goto L14;
        dz4 r14 = r13.a(r9, r10);
        if (r16 == false) goto L10;
        dz4 r17 = gk4.c.a(r9, r10);
        dz4 r18 = gk4.b.a(r9, r10);
    L11:
        r2.add(r14);
        if (r16 == false) goto L14;
        r2.add(r17);
        r2.add(r18);
        goto L14
    L10:
        r18 = null;
        r17 = null;
    L14:
        u21 r19 = r5.a;
        int r20 = r5.c;
        HashMap r21 = new HashMap(r5.d);
        boolean r110 = r5.i;
        boolean r111 = r5.j;
        boolean r112 = r5.k;
        int r22 = r5.b;
        new ArrayList(r3);
        new ArrayList(r15);
        nk1 r113 = new nk1(r19, r20, r21, r110, r111, r112, r22, r2, r5.l, r5.m, new ArrayList(r5.n));
        Retrofit.Builder r23 = new Retrofit.Builder();
        String r1 = r29.j();
        if (r1 == null) goto L17;
        String r24 = qm4.K0(r1).toString();
    L18:
        if (r24 == null) goto L99;
        r12 = r24;
    L99:
        fr1 r25 = new fr1();     // Catch: IllegalArgumentException -> L23
        r25.e(null, r12);     // Catch: IllegalArgumentException -> L23
        gr1 r114 = r25.b();     // Catch: IllegalArgumentException -> L23
    L24:
        if (r114 != null) goto L26;
    L28:
        Retrofit.Builder r26 = r23.baseUrl(r11).addConverterFactory(GsonConverterFactory.create(r113));
        cx r27 = new cx();
        rx r28 = new rx(r27);
        r27.a = 2592000;
        n83 r31 = new n83();
        r31.a(2, r7);
        r31.b(20, r4);
        r31.z = ze5.b(30, r4);
        r31.A = ze5.b(30, r4);
        dr1 r32 = new dr1();
        r32.b = cr1.n;
        r31.c.add(r32);
        r31.c.add(r28);
        File r33 = App.a().getCacheDir();
        r33.getClass();
        r31.l = new hx(r33);
        SSLSocketFactory r34 = x30.b;
        if (r34 == null) goto L31;
        r31.c(r34, x30.a);
    L31:
        Retrofit r35 = r26.client(new o83(r31)).build();
        r35.getClass();
        this.o = (mt) r35.create(mt.class);
        return;
    L26:
        if (r114.d.length() <= 0) goto L28;
        r11 = r12;
    L23:
        r114 = null;
        goto L24
    L17:
        r24 = null;
        goto L18
    L33:
        this.n = r29;
        ok1 r36 = new ok1();
        r36.a(Date.class, new r01());
        r36.a(Bookmarks.class, new lt());
        r36.j = true;
        ArrayList r37 = r36.e;
        int r38 = r37.size();
        ArrayList r39 = r36.f;
        ArrayList r40 = new ArrayList((r39.size() + r38) + 3);
        r40.addAll(r37);
        Collections.reverse(r40);
        ArrayList r41 = new ArrayList(r39);
        Collections.reverse(r41);
        r40.addAll(r41);
        int r42 = r36.g;
        int r43 = r36.h;
        ak0 r115 = bk0.b;
        boolean r116 = gk4.a;
        if (r42 == 2) goto L43;
        if (r43 == 2) goto L43;
        dz4 r117 = r115.a(r42, r43);
        if (r116 == false) goto L39;
        dz4 r118 = gk4.c.a(r42, r43);
        dz4 r44 = gk4.b.a(r42, r43);
    L40:
        r40.add(r117);
        if (r116 == false) goto L43;
        r40.add(r118);
        r40.add(r44);
        goto L43
    L39:
        r44 = null;
        r118 = null;
    L43:
        u21 r45 = r36.a;
        int r46 = r36.c;
        HashMap r119 = new HashMap(r36.d);
        boolean r120 = r36.i;
        boolean r121 = r36.j;
        boolean r122 = r36.k;
        int r47 = r36.b;
        new ArrayList(r37);
        new ArrayList(r39);
        nk1 r123 = new nk1(r45, r46, r119, r120, r121, r122, r47, r40, r36.l, r36.m, new ArrayList(r36.n));
        Retrofit.Builder r48 = new Retrofit.Builder();
        String r49 = r29.j();
        if (r49 == null) goto L46;
        String r50 = qm4.K0(r49).toString();
    L47:
        if (r50 == null) goto L97;
        r12 = r50;
    L97:
        fr1 r51 = new fr1();     // Catch: IllegalArgumentException -> L52
        r51.e(null, r12);     // Catch: IllegalArgumentException -> L52
        gr1 r124 = r51.b();     // Catch: IllegalArgumentException -> L52
    L53:
        if (r124 != null) goto L55;
    L57:
        Retrofit.Builder r52 = r48.baseUrl(r11).addConverterFactory(GsonConverterFactory.create(r123));
        cx r53 = new cx();
        rx r54 = new rx(r53);
        r53.a = 2592000;
        n83 r55 = new n83();
        r55.a(2, r7);
        r55.b(20, r4);
        r55.z = ze5.b(30, r4);
        r55.A = ze5.b(30, r4);
        dr1 r56 = new dr1();
        r56.b = cr1.n;
        r55.c.add(r56);
        r55.c.add(r54);
        File r57 = App.a().getCacheDir();
        r57.getClass();
        r55.l = new hx(r57);
        SSLSocketFactory r58 = x30.b;
        if (r58 == null) goto L60;
        r55.c(r58, x30.a);
    L60:
        Retrofit r59 = r52.client(new o83(r55)).build();
        r59.getClass();
        this.o = (qm3) r59.create(qm3.class);
        return;
    L55:
        if (r124.d.length() <= 0) goto L57;
        r11 = r12;
    L52:
        r124 = null;
        goto L53
    L46:
        r50 = null;
        goto L47
    L62:
        this.n = r29;
        ok1 r60 = new ok1();
        r60.a(Date.class, new r01());
        r60.a(Bookmarks.class, new lt());
        r60.j = true;
        ArrayList r61 = r60.e;
        int r62 = r61.size();
        ArrayList r63 = r60.f;
        ArrayList r64 = new ArrayList((r63.size() + r62) + 3);
        r64.addAll(r61);
        Collections.reverse(r64);
        ArrayList r65 = new ArrayList(r63);
        Collections.reverse(r65);
        r64.addAll(r65);
        int r66 = r60.g;
        int r67 = r60.h;
        ak0 r125 = bk0.b;
        boolean r126 = gk4.a;
        if (r66 == 2) goto L72;
        if (r67 == 2) goto L72;
        dz4 r127 = r125.a(r66, r67);
        if (r126 == false) goto L68;
        dz4 r128 = gk4.c.a(r66, r67);
        dz4 r68 = gk4.b.a(r66, r67);
    L69:
        r64.add(r127);
        if (r126 == false) goto L72;
        r64.add(r128);
        r64.add(r68);
        goto L72
    L68:
        r68 = null;
        r128 = null;
    L72:
        u21 r69 = r60.a;
        int r70 = r60.c;
        HashMap r129 = new HashMap(r60.d);
        boolean r130 = r60.i;
        boolean r131 = r60.j;
        boolean r132 = r60.k;
        int r71 = r60.b;
        new ArrayList(r61);
        new ArrayList(r63);
        nk1 r133 = new nk1(r69, r70, r129, r130, r131, r132, r71, r64, r60.l, r60.m, new ArrayList(r60.n));
        Retrofit.Builder r72 = new Retrofit.Builder();
        String r73 = r29.j();
        if (r73 == null) goto L75;
        String r74 = qm4.K0(r73).toString();
    L76:
        if (r74 == null) goto L95;
        r12 = r74;
    L95:
        fr1 r75 = new fr1();     // Catch: IllegalArgumentException -> L83
        gr1 r76 = null;
        r75.e(null, r12);     // Catch: IllegalArgumentException -> L94
        gr1 r134 = r75.b();     // Catch: IllegalArgumentException -> L94
    L85:
        if (r134 != null) goto L87;
    L89:
        Retrofit.Builder r77 = r72.baseUrl(r11).addConverterFactory(GsonConverterFactory.create(r133));
        cx r78 = new cx();
        rx r79 = new rx(r78);
        r78.a = 2592000;
        n83 r80 = new n83();
        r80.a(2, r7);
        r80.b(20, r4);
        r80.z = ze5.b(30, r4);
        r80.A = ze5.b(30, r4);
        dr1 r81 = new dr1();
        r81.b = cr1.n;
        r80.c.add(r81);
        r80.c.add(r79);
        File r82 = App.a().getCacheDir();
        r82.getClass();
        r80.l = new hx(r82);
        SSLSocketFactory r83 = x30.b;
        if (r83 == null) goto L92;
        r80.c(r83, x30.a);
    L92:
        Retrofit r84 = r77.client(new o83(r80)).build();
        r84.getClass();
        this.o = (in2) r84.create(in2.class);
        return;
    L87:
        if (r134.d.length() <= 0) goto L89;
        r11 = r12;
    L84:
        r134 = r76;
    L83:
        r76 = null;
        goto L84
    L75:
        r74 = null;
        goto L76
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void D(c72 r10) {
        if (r10.Y <= 0) goto L53;
        int r2 = 0;
        if (r10.R.d == y62.r) goto L7;
    L50:
        r10.X = false;
        f13 r11 = r10.y();
        Object[] r0 = r11.n;
        int r12 = r11.p;
    L51:
        if (r2 >= r12) goto L69;
        D((c72) r0[r2]);
        r2 = r2 + 1;
        goto L51
    L69:
        return;
    L7:
        if (r10.p() == true) goto L50;
        if (r10.q() == true) goto L50;
        if (r10.Z == true) goto L50;
        if (r10.H() == false) goto L50;
        cx2 r1 = (cx2) r10.Q.g;
        if ((r1.q & 256) == 0) goto L50;
    L18:
        if (r1 == null) goto L50;
        if ((r1.p & 256) == 0) goto L48;
        ?? r4 = r1;
        ?? r5 = 0;
    L22:
        if (r4 == 0) goto L48;
        if ((r4 instanceof vi1) == true) goto L25;
        if ((r4.p & 256) == 0) goto L46;
        if ((r4 instanceof fo0) == false) goto L46;
        cx2 r6 = ((fo0) r4).C;
        int r7 = 0;
        r4 = r4;
        r5 = r5;
    L32:
        if (r6 == null) goto L44;
        if ((r6.p & 256) == 0) goto L43;
        r7 = r7 + 1;
        r5 = r5;
        if (r7 != 1) goto L38;
        r4 = r6;
        goto L43
    L38:
        if (r5 != 0) goto L40;
        r5 = new f13(new cx2[16]);
    L40:
        if (r4 == 0) goto L42;
        r5.b(r4);
        r4 = 0;
    L42:
        r5.b(r6);
    L43:
        r6 = r6.s;
        r4 = r4;
        r5 = r5;
        goto L32
    L44:
        if (r7 == 1) goto L22;
    L46:
        r4 = j51.c(r5);
        goto L22
    L25:
        vi1 r8 = (vi1) r4;
        r8.L(j51.M(r8, 256));
    L48:
        if ((r1.q & 256) == 0) goto L50;
        r1 = r1.s;
        goto L18
    }

    public Bundle A(String r4) {
        xm2 r3 = (xm2) this.n;
        if (r3.b == false) goto L15;
        Bundle r0 = (Bundle) r3.h;
        if (r0 != null) goto L8;
        return null;
    L8:
        if (r0.containsKey(r4) == false) goto L10;
        Bundle r2 = jz4.w(r4, r0);
    L11:
        r0.remove(r4);
        if (r0.isEmpty() == false) goto L14;
        r3.h = null;
    L14:
        return r2;
    L10:
        r2 = null;
        goto L11
    L15:
        kf2.o("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public void B(String r3) {
        xl.E((s24) this.n, false, true, new rs0(16, r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C() {
        f13 r0 = (f13) this.n;
        int r4 = 0;
        Arrays.sort(r0.n, 0, r0.p, ca1.t);
        int r1 = r0.p;
        c72[] r2 = (c72[]) this.o;
        if (r2 == null) goto L6;
        int r3 = r2.length;
        Object[] r5 = r2;
        if (r3 < r1) goto L6;
    L7:
        this.o = null;
    L8:
        if (r4 >= r1) goto L10;
        r5[r4] = r0.n[r4];
        r4 = r4 + 1;
        goto L8
    L10:
        r0.g();
    L11:
        r1 = r1 - 1;
        if ((-1) >= r1) goto L17;
        c72 r6 = r5[r1];
        r6.getClass();
        if (r6.X == false) goto L16;
        D(r6);
    L16:
        r5[r1] = 0;
        goto L11
    L17:
        this.o = r5;
        return;
    L6:
        r5 = new c72[Math.max(16, r1)];
        goto L7
    }

    public k51 E(Object... r4) {
        AtomicBoolean r0 = (AtomicBoolean) this.o;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (((AtomicBoolean) this.o).get() == false) goto L31;
        monitor-exit(r0);     // Catch: Throwable -> L8
    L7:
        Constructor r3 = null;
    L19:
        if (r3 != null) goto L29;
        return null;
    L29:
        return (k51) r3.newInstance(r4);
    L23:
        e = move-exception;
        mj0.j("Unexpected error creating extractor", e);
        return null;
    L31:
        r3 = ((mj0) this.n).d();     // Catch: Throwable -> L8 Exception -> L13 ClassNotFoundException -> L16
        monitor-exit(r0);     // Catch: Throwable -> L8
        goto L19
    L16:
        ((AtomicBoolean) this.o).set(true);     // Catch: Throwable -> L8
    L13:
        e = move-exception;
        throw new RuntimeException("Error instantiating extension", e);     // Catch: Throwable -> L8
    }

    public Call F(String r3) {
        Log.d("BrowsingClient", "getPlaylist()");
        return ((qm3) this.o).c(((pn4) this.n).f(), r3);
    }

    public i54 G(String r5) {
        xm2 r4 = (xm2) this.n;
        xi4 r0 = (xi4) r4.f;
        monitor-enter(r0);
        Iterator r6 = ((LinkedHashMap) r4.g).entrySet().iterator();     // Catch: Throwable -> L12
    L5:
        i54 r2 = null;
        if (r6.hasNext() == false) goto L14;
        Map.Entry r1 = (Map.Entry) r6.next();     // Catch: Throwable -> L12
        String r3 = (String) r1.getKey();     // Catch: Throwable -> L12
        i54 r7 = (i54) r1.getValue();     // Catch: Throwable -> L12
        if (h12.c(r3, r5) == false) goto L10;
        r2 = r7;
    L10:
        if (r2 == null) goto L5;
    L14:
        monitor-exit(r0);
        return r2;
    L12:
        th = move-exception;
        throw th;
    }

    public void H(d5 r4) {
        bq4 r0 = (bq4) this.n;
        ((ActionMode.Callback) r0.n).onDestroyActionMode(r0.i(r4));
        bg r5 = (bg) this.o;
        if (r5.I == null) goto L6;
        r5.y.getDecorView().removeCallbacks(r5.J);
    L6:
        if (r5.H == null) goto L11;
        s75 r1 = r5.K;
        if (r1 == null) goto L10;
        r1.b();
    L10:
        s75 r2 = j65.a(r5.H);
        r2.a(0.0f);
        r5.K = r2;
        r2.d(new sf(2, this));
    L11:
        r5.G = null;
        ViewGroup r3 = r5.N;
        WeakHashMap r6 = j65.a;
        r3.requestApplyInsets();
        r5.O();
    }

    public boolean I(d5 r5, Menu r6) {
        ViewGroup r0 = ((bg) this.o).N;
        WeakHashMap r1 = j65.a;
        r0.requestApplyInsets();
        bq4 r4 = (bq4) this.n;
        ActionMode.Callback r2 = (ActionMode.Callback) r4.n;
        jo4 r7 = r4.i(r5);
        yd4 r3 = (yd4) r4.q;
        Menu r8 = (Menu) r3.get(r6);
        if (r8 != null) goto L6;
        r8 = new jv2((Context) r4.o, (qu2) r6);
        r3.put(r6, r8);
    L6:
        return r2.onPrepareActionMode(r7, r8);
    }

    public void J(Context r12, XmlResourceParser r13) {
        wb0 r0 = new wb0();
        int r1 = r13.getAttributeCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L104;
        String r4 = r13.getAttributeName(r3);
        String r5 = r13.getAttributeValue(r3);
        if (r4 == null) goto L103;
        if (r5 == null) goto L103;
        if ("id".equals(r4) == false) goto L103;
        if (r5.contains("/") == false) goto L13;
        int r2 = r12.getResources().getIdentifier(r5.substring(r5.indexOf(47) + 1), "id", r12.getPackageName());
    L14:
        if (r2 != (-1)) goto L105;
        if (r5.length() <= 1) goto L18;
        r2 = Integer.parseInt(r5.substring(1));
        goto L105
    L18:
        Log.e("ConstraintLayoutStates", "error in parsing id");
    L105:
        int r6 = r13.getEventType();     // Catch: IOException -> L34 XmlPullParserException -> L36
        rb0 r8 = null;
    L21:
        if (r6 == 1) goto L101;
        if (r6 != 0) goto L24;
        r13.getName();     // Catch: IOException -> L34 XmlPullParserException -> L36
    L97:
        r6 = r13.next();     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L21
    L24:
        if (r6 != 2) goto L26;
        String r7 = r13.getName();     // Catch: IOException -> L34 XmlPullParserException -> L36
        switch(r7.hashCode()) {
            case -2025855158: goto L91;
            case -1984451626: goto L85;
            case -1962203927: goto L82;
            case -1269513683: goto L76;
            case -1238332596: goto L70;
            case -71750448: goto L67;
            case 366511058: goto L61;
            case 1331510167: goto L58;
            case 1791837707: goto L55;
            case 1803088381: goto L52;
            default: goto L97;
        };
    L52:
        if (r7.equals("Constraint") == false) goto L97;
        r8 = wb0.e(r12, Xml.asAttributeSet(r13), false);     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L55:
        if (r7.equals("CustomAttribute") == false) goto L97;
    L62:
        if (r8 == null) goto L65;
        ib0.a(r12, r13, r8.f);     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L65:
        throw new RuntimeException("XML parser error must be within a Constraint " + r13.getLineNumber());     // Catch: IOException -> L34 XmlPullParserException -> L36
    L58:
        if (r7.equals("Barrier") == false) goto L97;
        r8 = wb0.e(r12, Xml.asAttributeSet(r13), false);     // Catch: IOException -> L34 XmlPullParserException -> L36
        r8.d.h0 = 1;     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L61:
        if (r7.equals("CustomMethod") == false) goto L97;
    L67:
        if (r7.equals("Guideline") == false) goto L97;
        r8 = wb0.e(r12, Xml.asAttributeSet(r13), false);     // Catch: IOException -> L34 XmlPullParserException -> L36
        r8.d.a = true;     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L70:
        if (r7.equals("Transform") == false) goto L97;
        if (r8 == null) goto L74;
        r8.e.a(r12, Xml.asAttributeSet(r13));     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L74:
        throw new RuntimeException("XML parser error must be within a Constraint " + r13.getLineNumber());     // Catch: IOException -> L34 XmlPullParserException -> L36
    L76:
        if (r7.equals("PropertySet") == false) goto L97;
        if (r8 == null) goto L80;
        r8.b.a(r12, Xml.asAttributeSet(r13));     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L80:
        throw new RuntimeException("XML parser error must be within a Constraint " + r13.getLineNumber());     // Catch: IOException -> L34 XmlPullParserException -> L36
    L82:
        if (r7.equals("ConstraintOverride") == false) goto L97;
        r8 = wb0.e(r12, Xml.asAttributeSet(r13), true);     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L85:
        if (r7.equals("Motion") == false) goto L97;
        if (r8 == null) goto L89;
        r8.c.a(r12, Xml.asAttributeSet(r13));     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L89:
        throw new RuntimeException("XML parser error must be within a Constraint " + r13.getLineNumber());     // Catch: IOException -> L34 XmlPullParserException -> L36
    L91:
        if (r7.equals("Layout") == false) goto L97;
        if (r8 == null) goto L95;
        r8.d.a(r12, Xml.asAttributeSet(r13));     // Catch: IOException -> L34 XmlPullParserException -> L36
        goto L97
    L95:
        throw new RuntimeException("XML parser error must be within a Constraint " + r13.getLineNumber());     // Catch: IOException -> L34 XmlPullParserException -> L36
    L26:
        if (r6 != 3) goto L97;
        String r9 = r13.getName().toLowerCase(Locale.ROOT);     // Catch: IOException -> L34 XmlPullParserException -> L36
        switch(r9.hashCode()) {
            case -2075718416: goto L45;
            case -190376483: goto L42;
            case 426575017: goto L39;
            case 2146106725: goto L32;
            default: goto L97;
        };     // Catch: IOException -> L34 XmlPullParserException -> L36
    L32:
        if (r9.equals("constraintset") == false) goto L97;
    L39:
        if (r9.equals("constraintoverride") == false) goto L97;
    L46:
        r0.c.put(Integer.valueOf(r8.a), r8);     // Catch: IOException -> L34 XmlPullParserException -> L36
        r8 = null;
        goto L97
    L42:
        if (r9.equals("constraint") == false) goto L97;
    L45:
        if (r9.equals("guideline") == false) goto L97;
    L101:
        ((SparseArray) this.o).put(r2, r0);
        return;
    L34:
        e = move-exception;
        Log.e("ConstraintSet", "Error parsing XML resource", e);
    L36:
        e = move-exception;
        Log.e("ConstraintSet", "Error parsing XML resource", e);
        goto L101
    L13:
        r2 = -1;
    L103:
        r3 = r3 + 1;
        goto L3
    }

    public n50 K(cx3 r5, int r6) {
        yd4 r4 = (yd4) this.n;
        int r7 = r4.d(r5);
        if (r7 < 0) goto L20;
        r65 r1 = (r65) r4.j(r7);
        if (r1 == null) goto L20;
        int r2 = r1.a;
        if ((r2 & r6) == 0) goto L20;
        int r3 = r2 & (~r6);
        r1.a = r3;
        if (r6 != 4) goto L13;
        n50 r8 = r1.b;
    L16:
        if ((r3 & 12) != 0) goto L18;
        r4.h(r7);
        r1.a = 0;
        r1.b = null;
        r1.c = null;
        r65.d.a(r1);
    L18:
        return r8;
    L13:
        if (r6 != 8) goto L19;
        r8 = r1.c;
        goto L16
    L19:
        kf2.n("Must provide flag PRE or POST");
    L20:
        return null;
    }

    public void L(String r3, i54 r4) {
        r4.getClass();
        xm2 r2 = (xm2) this.n;
        xi4 r0 = (xi4) r2.f;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (((LinkedHashMap) r2.g).containsKey(r3) == true) goto L12;
        ((LinkedHashMap) r2.g).put(r3, r4);     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L12:
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");     // Catch: Throwable -> L9
    }

    public void M(String r6) {
        monitor-enter(this);
        Object r2 = ((HashMap) this.n).get(r6);     // Catch: Throwable -> L23
        h12.f(r2, "Argument must not be null");     // Catch: Throwable -> L23
        yq0 r3 = (yq0) r2;     // Catch: Throwable -> L23
        int r4 = r3.b;     // Catch: Throwable -> L23
        if (r4 < 1) goto L29;
        int r5 = r4 - 1;     // Catch: Throwable -> L23
        r3.b = r5;     // Catch: Throwable -> L23
        if (r5 != 0) goto L25;
        yq0 r1 = (yq0) ((HashMap) this.n).remove(r6);     // Catch: Throwable -> L23
        if (r1.equals(r3) == false) goto L22;
        zg5 r7 = (zg5) this.o;     // Catch: Throwable -> L23
        ArrayDeque r0 = (ArrayDeque) r7.n;     // Catch: Throwable -> L23
        monitor-enter(r0);     // Catch: Throwable -> L23
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L13:
        if (((ArrayDeque) r7.n).size() >= 10) goto L17;
        ((ArrayDeque) r7.n).offer(r1);     // Catch: Throwable -> L15
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L15
    L22:
        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + r3 + ", but actually removed: " + r1 + ", safeKey: " + r6);     // Catch: Throwable -> L23
    L25:
        monitor-exit(this);     // Catch: Throwable -> L23
        r3.a.unlock();
        return;
    L29:
        throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + r6 + ", interestedThreads: " + r3.b);     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }

    public void N(cx3 r1) {
        r65 r0 = (r65) ((yd4) this.n).get(r1);
        if (r0 != null) goto L5;
        return;
    L5:
        r0.a &= -2;
    }

    public void O(cx3 r7) {
        xe2 r0 = (xe2) this.o;
        int r1 = r0.h() - 1;
    L3:
        if (r1 < 0) goto L10;
        if (r7 == r0.i(r1)) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        Object[] r3 = r0.p;
        Object r4 = r3[r1];
        Object r5 = ud3.b;
        if (r4 == r5) goto L10;
        r3[r1] = r5;
        r0.n = true;
    L10:
        r65 r6 = (r65) ((yd4) this.n).remove(r7);
        if (r6 == null) goto L16;
        r6.a = 0;
        r6.b = null;
        r6.c = null;
        r65.d.a(r6);
        return;
    }

    public void P() {
        if (((xm2) this.n).c == false) goto L16;
        bf r1 = (bf) this.o;
        if (r1 != null) goto L7;
        r1 = new bf(this);
    L7:
        this.o = r1;
        g92.class.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L13
        bf r4 = (bf) this.o;
        if (r4 == null) goto L20;
        ((LinkedHashSet) r4.b).add(g92.class.getName());
        return;
    L20:
        return;
    L13:
        e = move-exception;
        throw new IllegalArgumentException("Class " + g92.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L16:
        kf2.o("Can not perform this action after onSaveInstanceState");
    }

    public void Q(gl4 r4, z45 r5) {
        r4.getClass();
        ((bq4) this.o).h(new qo2(this, r4, r5, 21));
    }

    public void R(gl4 r4, int r5) {
        r4.getClass();
        ((bq4) this.o).h(new am4((pq3) this.n, r4, false, r5));
    }

    public Call S(String r9, String r10, Boolean r11, ArrayList r12, ArrayList r13) {
        Log.d("BrowsingClient", "updatePlaylist()");
        return ((qm3) this.o).b(((pn4) this.n).f(), r9, r10, r11, r12, r13);
    }

    @Override // defpackage.ak2
    public void a() {
        ns3 r0 = (ns3) this.o;
        MediaCodec r4 = (MediaCodec) this.n;
        int r2 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L9
        if (r2 >= 30) goto L6;
    L11:
        if (r2 < 35) goto L14;
        if (r0 == null) goto L14;
        r0.e(r4);
    L14:
        r4.release();
        return;
    L6:
        if (r2 >= 33) goto L11;
        r4.stop();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        if (Build.VERSION.SDK_INT < 35) goto L20;
        if (r0 == null) goto L20;
        r0.e(r4);
    L20:
        r4.release();
        throw th;
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r1) {
        return ((eg1) ((hg3) this.n).o).mo77apply(r1);
    }

    @Override // defpackage.f51
    public int b() {
        ExtendedFloatingActionButton r0 = (ExtendedFloatingActionButton) ((hg3) this.n).o;
        ExtendedFloatingActionButton r4 = (ExtendedFloatingActionButton) this.o;
        int r1 = r4.U;
        if (r1 == (-1)) goto L5;
        if (r1 == 0) goto L27;
        if (r1 == (-2)) goto L27;
        return r1;
    L27:
        return r0.getMeasuredHeight();
    L5:
        if ((r4.getParent() instanceof View) == false) goto L7;
        View r2 = (View) r4.getParent();
        ViewGroup.LayoutParams r3 = r2.getLayoutParams();
        if (r3 != null) goto L11;
    L14:
        int r5 = r2.getPaddingTop();
        int r6 = r2.getPaddingBottom() + r5;
        if ((r4.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) == false) goto L19;
        ViewGroup.MarginLayoutParams r7 = (ViewGroup.MarginLayoutParams) r4.getLayoutParams();
        if (r7 == null) goto L19;
        int r8 = r7.topMargin + r7.bottomMargin;
    L21:
        return (r2.getHeight() - r8) - r6;
    L19:
        r8 = 0;
        goto L21
    L11:
        if (r3.height != (-2)) goto L14;
        return r0.getMeasuredHeight();
    L7:
        return r0.getMeasuredHeight();
    }

    @Override // defpackage.ak2
    public void c(Bundle r1) {
        ((MediaCodec) this.n).setParameters(r1);
    }

    @Override // defpackage.f51
    public int d() {
        hg3 r0 = (hg3) this.n;
        ExtendedFloatingActionButton r4 = (ExtendedFloatingActionButton) this.o;
        if ((r4.getParent() instanceof View) == false) goto L5;
        View r1 = (View) r4.getParent();
        ViewGroup.LayoutParams r2 = r1.getLayoutParams();
        if (r2 != null) goto L9;
    L12:
        int r3 = r1.getPaddingLeft();
        int r5 = r1.getPaddingRight() + r3;
        if ((r4.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) == false) goto L17;
        ViewGroup.MarginLayoutParams r6 = (ViewGroup.MarginLayoutParams) r4.getLayoutParams();
        if (r6 == null) goto L17;
        int r7 = r6.leftMargin + r6.rightMargin;
    L19:
        return (r1.getWidth() - r7) - r5;
    L17:
        r7 = 0;
        goto L19
    L9:
        if (r2.width != (-2)) goto L12;
        return r0.d();
    L5:
        return r0.d();
    }

    @Override // defpackage.ak2
    public void e(int r8, fg0 r9, long r10, int r12) {
        ((MediaCodec) this.n).queueSecureInputBuffer(r8, 0, r9.i, r10, r12);
    }

    @Override // defpackage.ak2
    public void f(int r8, int r9, int r10, long r11) {
        ((MediaCodec) this.n).queueInputBuffer(r8, 0, r9, r11, r10);
    }

    @Override // defpackage.ak2
    public void flush() {
        ((MediaCodec) this.n).flush();
    }

    @Override // defpackage.ak2
    public void g(int r2) {
        ((MediaCodec) this.n).releaseOutputBuffer(r2, false);
    }

    @Override // defpackage.ak2
    public MediaFormat h() {
        return ((MediaCodec) this.n).getOutputFormat();
    }

    @Override // defpackage.ak2
    public void i() {
        vk.k((MediaCodec) this.n);
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.o).N;
    }

    @Override // defpackage.ak2
    public void l(int r1, long r2) {
        ((MediaCodec) this.n).releaseOutputBuffer(r1, r2);
    }

    @Override // defpackage.ak2
    public int m() {
        return ((MediaCodec) this.n).dequeueInputBuffer(0);
    }

    @Override // defpackage.ak2
    public int n(MediaCodec.BufferInfo r4) {
    L2:
        int r0 = ((MediaCodec) this.n).dequeueOutputBuffer(r4, 0);
        if (r0 == (-3)) goto L2;
        return r0;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        int r2 = ((ExtendedFloatingActionButton) this.o).U;
        if (r2 != 0) goto L6;
        r2 = -2;
    L6:
        return new ViewGroup.LayoutParams(-1, r2);
    }

    @Override // defpackage.u74
    public boolean onQueryTextChange(String r1) {
        ((o7) ((AlbumListPageFragment) this.o).o0.v).filter(r1);
        return false;
    }

    @Override // defpackage.u74
    public boolean onQueryTextSubmit(String r1) {
        ((SearchView) this.n).clearFocus();
        return false;
    }

    @Override // defpackage.ak2
    public void p(int r1) {
        ((MediaCodec) this.n).setVideoScalingMode(r1);
    }

    @Override // defpackage.ak2
    public ByteBuffer q(int r1) {
        return ((MediaCodec) this.n).getInputBuffer(r1);
    }

    @Override // defpackage.ak2
    public void r(Surface r1) {
        ((MediaCodec) this.n).setOutputSurface(r1);
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.o).M;
    }

    @Override // defpackage.ak2
    public ByteBuffer t(int r1) {
        return ((MediaCodec) this.n).getOutputBuffer(r1);
    }

    @Override // defpackage.ak2
    public void u(ArrayList r1) {
        go2.B((MediaCodec) this.n, r1);
    }

    @Override // defpackage.ak2
    public void v(nk2 r4, Handler r5) {
        ((MediaCodec) this.n).setOnFrameRenderedListener(new wk(this, r4, 1), r5);
    }

    @Override // defpackage.ak2
    public void x(ArrayList r1) {
        go2.l((MediaCodec) this.n, r1);
    }

    public void y(cx3 r2, n50 r3) {
        yd4 r1 = (yd4) this.n;
        r65 r0 = (r65) r1.get(r2);
        if (r0 != null) goto L5;
        r0 = r65.a();
        r1.put(r2, r0);
    L5:
        r0.c = r3;
        r0.a |= 8;
    }

    public void z() {
        LinkedHashSet r0 = (LinkedHashSet) this.n;
        if (r0.isEmpty() == true) goto L10;
        r0.clear();
        vo1 r2 = (vo1) this.o;
        if (r2 == null) goto L9;
        r2.invoke();
        return;
    L9:
        return;
    }

    public /* synthetic */ rm3(Object r1, Object r2, boolean r3) {
        this.n = r1;
        this.o = r2;
    }

    public /* synthetic */ rm3(Object r1, Object r2) {
        this.o = r1;
        this.n = r2;
    }

    public rm3(int r2) {
        switch(r2) {
            case 16: goto L11;
            case 17: goto L3;
            case 18: goto L9;
            case 19: goto L3;
            case 20: goto L7;
            case 21: goto L3;
            case 22: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new HashMap();
        this.o = new zg5(21);
        return;
    L5:
        this.n = new yd4(0);
        this.o = new xe2(null);
        return;
    L7:
        this.n = new LinkedHashSet();
        return;
    L9:
        long[] r3 = v54.a;
        this.n = new w03();
        return;
    L11:
        this.n = new f13(new c72[16]);
    }

    public rm3(pq3 r1, bq4 r2) {
        r1.getClass();
        r2.getClass();
        this.n = r1;
        this.o = r2;
    }

    public rm3(MediaCodec r2, ns3 r3) {
        this.n = r2;
        this.o = r3;
        if (Build.VERSION.SDK_INT < 35) goto L12;
        if (r3 == null) goto L13;
        LoudnessCodecController r1 = (LoudnessCodecController) r3.q;
        if (r1 != null) goto L8;
    L10:
        rr2.w(((HashSet) r3.o).add(r2));
        return;
    L8:
        if (vk.i(r1, r2) == true) goto L10;
        return;
    L13:
        return;
    }

    public rm3(mj0 r2) {
        this.n = r2;
        this.o = new AtomicBoolean(false);
    }
}
