package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bq4 implements qd3, zn4 {
    public static final md3 r = null;
    public final Object n;
    public Object o;
    public Object p;
    public Object q;

    static {
        r = new md3();
    }

    public bq4(he r41, zs4 r42, List r43, oo0 r44, ha1 r45, boolean r46) {
        he r1 = r41;
        this.n = r1;
        this.o = r43;
        final int r4 = 0;
        gf1 r3 = new dz2(this, r4);
        b92 r5 = b92.n;
        rr2.K(r5, r3);
        final int r6 = 1;
        this.p = rr2.K(r5, new dz2(this, r6));
        sd3 r7 = r42.b;
        int r8 = ie.a;
        ArrayList r9 = r1.q;
        String r10 = r1.o;
        u01 r11 = u01.n;
        if (r9 == null) goto L5;
        List r12 = q40.K0(r9, new ca1(11));
    L6:
        ArrayList r13 = new ArrayList();
        ii r14 = new ii();
        int r15 = r12.size();
        int r16 = 0;
        int r17 = 0;
    L7:
        if (r16 >= r15) goto L43;
        ge r18 = (ge) r12.get(r16);
        sd3 r19 = r7.a((sd3) r18.a);
        int r110 = r18.b;
        int r111 = r18.c;
        if (r110 <= r111) goto L12;
        dz1.a("Reversed range is not supported");
    L12:
        if (r17 >= r110) goto L26;
        if (r14.isEmpty() == true) goto L26;
        ge r20 = (ge) r14.last();
        r12 = r12;
        int r21 = r20.c;
        r11 = r11;
        Object r22 = r20.a;
        if (r110 >= r21) goto L19;
        r13.add(new ge(r17, r110, r22));
        r17 = r110;
        goto L12
    L19:
        int r112 = r15;
        r13.add(new ge(r17, r21, r22));
        r17 = r20.c;
    L21:
        if (r14.isEmpty() == true) goto L25;
        if (r17 != ((ge) r14.last()).c) goto L25;
        r14.removeLast();
    L25:
        r15 = r112;
    L26:
        List r113 = r12;
        u01 r114 = r11;
        int r115 = r15;
        if (r17 >= r110) goto L29;
        r13.add(new ge(r17, r110, r7));
        r17 = r110;
    L29:
        ge r23 = (ge) r14.g();
        if (r23 == null) goto L41;
        int r24 = r23.c;
        Object r25 = r23.a;
        int r26 = r23.b;
        if (r26 != r110) goto L35;
        if (r24 != r111) goto L35;
        r14.removeLast();
        r14.addLast(new ge(r110, r111, ((sd3) r25).a(r19)));
    L42:
        r16 = r16 + 1;
        r12 = r113;
        r11 = r114;
        r15 = r115;
    L35:
        if (r26 != r24) goto L37;
        r13.add(new ge(r26, r24, r25));
        r14.removeLast();
        r14.addLast(new ge(r110, r111, r19));
        goto L42
    L37:
        if (r24 < r111) goto L39;
        r14.addLast(new ge(r110, r111, ((sd3) r25).a(r19)));
        goto L42
    L39:
        nz2.c();
        throw null;
    L41:
        r14.addLast(new ge(r110, r111, r19));
        goto L42
    L43:
        u01 r116 = r11;
    L45:
        if (r17 > r10.length()) goto L56;
        if (r14.isEmpty() == true) goto L56;
        ge r27 = (ge) r14.last();
        Object r28 = r27.a;
        int r29 = r27.c;
        r13.add(new ge(r17, r29, r28));
    L50:
        if (r14.isEmpty() == true) goto L54;
        if (r29 != ((ge) r14.last()).c) goto L54;
        r14.removeLast();
    L54:
        r17 = r29;
    L56:
        if (r17 >= r10.length()) goto L59;
        r13.add(new ge(r17, r10.length(), r7));
    L59:
        if (r13.isEmpty() == false) goto L61;
        int r30 = 0;
        r13.add(new ge(0, 0, r7));
    L62:
        ArrayList r31 = new ArrayList(r13.size());
        int r32 = r13.size();
        int r33 = r30;
    L63:
        if (r33 >= r32) goto L113;
        ge r117 = (ge) r13.get(r33);
        int r118 = r117.b;
        int r119 = r117.c;
        if (r118 == r119) goto L67;
        String r120 = r10.substring(r118, r119);
    L68:
        if (r118 != r119) goto L71;
    L69:
        ArrayList r34 = null;
    L70:
        int r210 = r32;
        ArrayList r211 = r13;
        int r212 = r33;
        List r35 = r34;
        if (r34 != null) goto L94;
        r35 = r116;
    L94:
        he r121 = new he(r120, r35);
        sd3 r2 = (sd3) r117.a;
        if (r2.b != 0) goto L97;
        r2 = new sd3(r2.a, r7.b, r2.c, r2.d, r2.e, r2.f, r2.g, r2.h, r2.i);
    L97:
        zs4 r36 = new zs4(r42.a, r7.a(r2));
        List r37 = r121.n;
        if (r37 != null) goto L100;
        List r213 = r116;
    L101:
        List r38 = (List) this.o;
        ArrayList r39 = new ArrayList(r38.size());
        int r40 = r38.size();
        int r47 = 0;
    L102:
        if (r47 >= r40) goto L112;
        ge r122 = (ge) r38.get(r47);
        int r123 = r122.b;
        int r124 = r122.c;
        if (ie.a(r118, r119, r123, r124) == false) goto L111;
        if (r118 > r123) goto L108;
        if (r124 > r119) goto L108;
    L109:
        r39.add(new ge(r123 - r118, r124 - r118, r122.a));
    L108:
        dz1.a("placeholder can not overlap with paragraph.");
    L111:
        r47 = r47 + 1;
        r38 = r38;
        goto L102
    L112:
        r31.add(new pd3(new mc(r120, r36, r213, r39, r45, r44, r46), r118, r119));
        r33 = r212 + 1;
        r1 = r41;
        r10 = r10;
        r32 = r210;
        r13 = r211;
        goto L63
    L100:
        r213 = r37;
        goto L101
    L71:
        List r125 = r1.n;
        if (r125 == null) goto L69;
        if (r118 == 0) goto L76;
    L83:
        r34 = new ArrayList(r125.size());
        int r48 = r125.size();
        int r49 = 0;
    L84:
        if (r49 >= r48) goto L70;
        int r126 = r48;
        ge r50 = (ge) r125.get(r49);
        int r127 = r49;
        Object r51 = r50.a;
        int r52 = r50.b;
        int r214 = r32;
        if ((((fe) r51) instanceof sd3) == true) goto L91;
        int r53 = r50.c;
        if (ie.a(r118, r119, r52, r53) == false) goto L91;
        String r54 = r50.d;
        r34.add(new ge(gb.m(r52, r118, r119) - r118, gb.m(r53, r118, r119) - r118, (fe) r50.a, r54));
    L91:
        r49 = r127 + 1;
        r48 = r126;
        r32 = r214;
        r13 = r13;
        r33 = r33;
        goto L84
    L76:
        if (r119 < r10.length()) goto L83;
        r34 = new ArrayList(r125.size());
        int r55 = r125.size();
        int r56 = 0;
    L78:
        if (r56 >= r55) goto L70;
        int r128 = r55;
        Object r57 = r125.get(r56);
        int r129 = r56;
        if ((((fe) ((ge) r57).a) instanceof sd3) == true) goto L82;
        r34.add(r57);
    L82:
        r56 = r129 + 1;
        r55 = r128;
        goto L78
    L67:
        r120 = "";
        goto L68
    L113:
        this.q = r31;
        return;
    L61:
        r30 = 0;
        goto L62
    L5:
        r12 = r11;
        goto L6
    }

    public static bq4 m(LayoutInflater r3, ViewGroup r4) {
        View r5 = r3.inflate(R.layout.item_library_album, r4, false);
        int r6 = R.id.album_cover_image_view;
        ImageView r0 = (ImageView) uo.s(r5, R.id.album_cover_image_view);
        if (r0 == null) goto L10;
        r6 = R.id.album_name_label;
        TextView r1 = (TextView) uo.s(r5, R.id.album_name_label);
        if (r1 == null) goto L10;
        r6 = R.id.artist_name_label;
        TextView r2 = (TextView) uo.s(r5, R.id.artist_name_label);
        if (r2 == null) goto L10;
        return new bq4((ConstraintLayout) r5, r0, r1, r2);
    L10:
        nz2.n("Missing required view with ID: ".concat(r5.getResources().getResourceName(r6)));
        return null;
    }

    @Override // defpackage.qd3
    public boolean a() {
        ArrayList r4 = (ArrayList) this.q;
        int r0 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (((pd3) r4.get(r2)).a.a() == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    @Override // defpackage.zn4
    public void c(byte[] r33, int r34, int r35, yn4 r36, wc0 r37) {
        bg3 r2 = (bg3) this.p;
        be3 r3 = (be3) this.o;
        be3 r4 = (be3) this.n;
        r4.L(r34 + r35, r33);
        r4.N(r34);
        if (((Inflater) this.q) != null) goto L5;
        this.q = new Inflater();
    L5:
        Inflater r0 = (Inflater) this.q;
        String r1 = f35.a;
        if (r4.a() > 0) goto L8;
    L12:
        int r5 = 0;
        r2.d = 0;
        int[] r6 = r2.b;
        be3 r7 = r2.a;
        r2.e = 0;
        r2.f = 0;
        r2.g = 0;
        r2.h = 0;
        r2.i = 0;
        r7.K(0);
        r2.c = false;
        ArrayList r10 = new ArrayList();
    L14:
        if (r4.a() < 3) goto L94;
        int r8 = r4.c;
        int r9 = r4.A();
        int r11 = r4.H();
        int r12 = r4.b + r11;
        if (r12 <= r8) goto L18;
        r4.N(r8);
        int r13 = r5;
        int[] r14 = r6;
        ig0 r15 = null;
    L91:
        if (r15 == null) goto L93;
        r10.add(r15);
    L93:
        r5 = r13;
        r6 = r14;
        goto L14
    L18:
        char r16 = 128;
        if (r9 == 128) goto L54;
        switch(r9) {
            case 20: goto L47;
            case 21: goto L27;
            case 22: goto L23;
            default: goto L21;
        };
    L21:
        r14 = r6;
    L53:
        r13 = 0;
        r15 = null;
    L90:
        r4.N(r12);
        goto L91
    L23:
        if (r11 < 19) goto L21;
        r2.d = r4.H();
        r2.e = r4.H();
        r4.O(11);
        r2.f = r4.H();
        r2.g = r4.H();
        goto L21
    L27:
        if (r11 < 4) goto L21;
        r4.O(3);
        if ((128 & r4.A()) == 0) goto L32;
        int r17 = 1;
    L33:
        int r18 = r11 - 4;
        if (r17 != 0) goto L36;
    L42:
        int r19 = r7.b;
        int r20 = r7.c;
        if (r19 >= r20) goto L21;
        if (r18 <= 0) goto L21;
        int r21 = Math.min(r18, r20 - r19);
        r4.k(r7.a, r19, r21);
        r7.N(r19 + r21);
        goto L21
    L36:
        if (r18 < 7) goto L21;
        int r22 = r4.D();
        if (r22 < 4) goto L21;
        r2.h = r4.H();
        r2.i = r4.H();
        r7.K(r22 - 4);
        r18 = r11 - 11;
        goto L42
    L32:
        r17 = r5;
        goto L33
    L47:
        if ((r11 % 5) != 2) goto L21;
        r4.O(2);
        Arrays.fill(r6, r5);
        int r23 = r11 / 5;
        int r24 = r5;
    L50:
        if (r24 >= r23) goto L52;
        int r25 = r4.A();
        int r110 = r4.A();
        int r111 = r4.A();
        char r32 = r16;
        double r26 = r110;
        double r112 = r111 - 128;
        int[] r113 = r6;
        double r27 = r4.A() - 128;
        r113[r25] = f35.j((int) ((r27 * 1.772d) + r26), 0, 255) | (((r4.A() << 24) | (f35.j((int) ((1.402d * r112) + r26), 0, 255) << 16)) | (f35.j((int) ((r26 - (0.34414d * r27)) - (r112 * 0.71414d)), 0, 255) << 8));
        r24 = r24 + 1;
        r16 = r32;
        r6 = r113;
        goto L50
    L52:
        r14 = r6;
        r2.c = true;
        goto L53
    L54:
        r14 = r6;
        if (r2.d != 0) goto L57;
    L88:
        r15 = null;
    L87:
        r13 = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = 0;
        r2.g = 0;
        r2.h = 0;
        r2.i = 0;
        r7.K(0);
        r2.c = false;
        goto L90
    L57:
        if (r2.e == 0) goto L88;
        if (r2.h == 0) goto L88;
        if (r2.i == 0) goto L88;
        int r28 = r7.c;
        if (r28 == 0) goto L88;
        if (r7.b != r28) goto L88;
        if (r2.c == false) goto L88;
        r7.N(0);
        int r29 = r2.h * r2.i;
        int[] r30 = new int[r29];
        int r31 = 0;
    L70:
        if (r31 >= r29) goto L86;
        int r38 = r7.A();
        if (r38 != 0) goto L73;
        int r39 = r7.A();
        if (r39 == 0) goto L70;
        if ((r39 & 64) != 0) goto L80;
        int r40 = r39 & 63;
    L82:
        if ((r39 & 128) != 0) goto L84;
        int r41 = r14[0];
    L85:
        int r42 = r40 + r31;
        Arrays.fill(r30, r31, r42, r41);
    L74:
        r31 = r42;
        goto L70
    L84:
        r41 = r14[r7.A()];
        goto L85
    L80:
        r40 = ((r39 & 63) << 8) | r7.A();
        goto L82
    L73:
        r42 = r31 + 1;
        r30[r31] = r14[r38];
        goto L74
    L86:
        Bitmap r114 = Bitmap.createBitmap(r30, r2.h, r2.i, Bitmap.Config.ARGB_8888);
        float r43 = r2.f;
        float r44 = r2.d;
        float r210 = r43 / r44;
        float r45 = r2.g;
        float r46 = r2.e;
        r15 = new ig0(null, null, null, r114, r45 / r46, 0, 0, r210, 0, Integer.MIN_VALUE, -3.4028235E38f, r2.h / r44, r2.i / r46, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        goto L87
    L94:
        r37.accept(new lg0(-9223372036854775807L, -9223372036854775807L, r10));
        return;
    L8:
        if (r4.j() != 120) goto L12;
        if (f35.K(r4, r3, r0) == false) goto L12;
        r4.L(r3.c, r3.a);
        goto L12
    }

    @Override // defpackage.qd3
    public float d() {
        return ((Number) ((r72) this.p).getValue()).floatValue();
    }

    public void e(v33 r3) {
        if (((LinkedHashSet) this.q).add(r3) == false) goto L6;
        ((w33) this.o).a(this, r3, -1);
        return;
    }

    public void f(s83 r2, int r3) {
        if (r3 == 1) goto L9;
        if (r3 == 0) goto L9;
        kf2.e(f34.f(r3, "Unsupported priority value: "));
        return;
    L9:
        if (((LinkedHashSet) this.q).add(r2) == false) goto L12;
        ((w33) this.o).a(this, r2, r3);
        return;
    }

    public void g(v33 r3, t33 r4) {
        w33 r2 = (w33) this.o;
        r2.getClass();
        if (r2.g != 0) goto L12;
        u83 r1 = r2.c(-1);
        r2.f = r1;
        r2.g = -1;
        r2.h = r3;
        if (r4 == null) goto L11;
        if (r1 == null) goto L9;
        r1.d.getClass();
    L9:
        nl4 r5 = r2.a;
        y33 r6 = new y33(r4);
        r5.getClass();
        r5.j(null, r6);
        return;
    L11:
        return;
    }

    public void h(Runnable r1) {
        ((ia4) this.n).execute(r1);
    }

    public jo4 i(d5 r6) {
        ArrayList r0 = (ArrayList) this.p;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        jo4 r3 = (jo4) r0.get(r2);
        if (r3 == null) goto L9;
        if (r3.b != r6) goto L9;
        return r3;
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        jo4 r4 = new jo4((Context) this.o, r6);
        r0.add(r4);
        return r4;
    }

    public ms2 j() {
        oj2 r0 = ((pn2) this.q).s;
        if (r0 != null) goto L5;
        kf2.o("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    L5:
        return r0.d;
    }

    public zp4 k(rc5 r6) {
        r6.getClass();
        String r0 = r6.a;
        int r7 = r6.b;
        w24 r2 = w24.b(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        r2.h(1, r0);
        r2.c(2, r7);
        WorkDatabase_Impl r5 = (WorkDatabase_Impl) this.n;
        r5.b();
        Cursor r8 = xl.H(r5, r2);
        int r9 = e35.x(r8, "work_spec_id");     // Catch: Throwable -> L7
        int r1 = e35.x(r8, "generation");     // Catch: Throwable -> L7
        int r3 = e35.x(r8, "system_id");     // Catch: Throwable -> L7
        if (r8.moveToFirst() == false) goto L9;
        zp4 r4 = new zp4(r8.getString(r9), r8.getInt(r1), r8.getInt(r3));     // Catch: Throwable -> L7
    L10:
        r8.close();
        r2.j();
        return r4;
    L9:
        r4 = null;
    L7:
        th = move-exception;
        r8.close();
        r2.j();
        throw th;
    }

    public x65 l(i30 r5, String r6) {
        xi4 r0 = (xi4) this.q;
        monitor-enter(r0);
        x65 r1 = (x65) ((e75) this.n).a.get(r6);     // Catch: Throwable -> L11
        if (r5.d(r1) == false) goto L14;
        b75 r4 = (b75) this.o;     // Catch: Throwable -> L11
        if ((r4 instanceof k54) == false) goto L13;
        k54 r7 = (k54) r4;     // Catch: Throwable -> L11
        r1.getClass();     // Catch: Throwable -> L11
        ea2 r8 = r7.d;     // Catch: Throwable -> L11
        if (r8 == null) goto L13;
        rm3 r9 = r7.e;     // Catch: Throwable -> L11
        r9.getClass();     // Catch: Throwable -> L11
        te5.c(r1, r9, r8);     // Catch: Throwable -> L11
    L13:
        r1.getClass();     // Catch: Throwable -> L11
    L23:
        monitor-exit(r0);
        return r1;
    L14:
        f03 r2 = new f03((tf0) this.p);     // Catch: Throwable -> L11
        z45 r3 = d75.a;     // Catch: Throwable -> L11
        r2.a.put(r3, r6);     // Catch: Throwable -> L11
        b75 r10 = (b75) this.o;     // Catch: Throwable -> L11
        r10.getClass();     // Catch: Throwable -> L11
        x65 r11 = r10.c(r5, r2);     // Catch: Throwable -> L11 AbstractMethodError -> L17
    L16:
        r1 = r11;
        e75 r12 = (e75) this.n;     // Catch: Throwable -> L11
        r12.getClass();     // Catch: Throwable -> L11
        r1.getClass();     // Catch: Throwable -> L11
        x65 r13 = (x65) r12.a.put(r6, r1);     // Catch: Throwable -> L11
        if (r13 == null) goto L23;
        r13.a();     // Catch: Throwable -> L11
    L17:
        Class r14 = r5.n;     // Catch: Throwable -> L11 AbstractMethodError -> L19
        r14.getClass();     // Catch: Throwable -> L11 AbstractMethodError -> L19
        r11 = r10.b(r14, r2);     // Catch: Throwable -> L11 AbstractMethodError -> L19
    L19:
        Class r15 = r5.n;     // Catch: Throwable -> L11
        r15.getClass();     // Catch: Throwable -> L11
        r11 = r10.a(r15);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public void n(zp4 r2) {
        WorkDatabase_Impl r0 = (WorkDatabase_Impl) this.n;
        r0.b();
        r0.c();
        ((vo0) this.o).m(r2);     // Catch: Throwable -> L6
        r0.t();     // Catch: Throwable -> L6
        r0.o();
        return;
    L6:
        th = move-exception;
        r0.o();
        throw th;
    }

    public void o(oj2 r10, String r11, Bundle r12) {
        List r0 = (List) r10.f.get(r11);
        if (r0 == null) goto L34;
        Iterator r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L42;
        ld3 r2 = (ld3) r1.next();
        Bundle r3 = (Bundle) r2.b;
        if (r12 != null) goto L10;
        int r5 = -1;
    L11:
        if (r3 != null) goto L13;
        int r4 = -1;
    L15:
        if (r12 != null) goto L17;
        int r7 = -1;
    L18:
        if (r3 != null) goto L20;
        int r6 = -1;
    L21:
        int r8 = Integer.MAX_VALUE;
        int r9 = 0;
        if (r5 == (-1)) goto L26;
        if (r7 == (-1)) goto L26;
        int r13 = r5 * r7;
        int r14 = (r7 + r13) - 1;
    L27:
        if (r4 == (-1)) goto L31;
        if (r6 == (-1)) goto L31;
        r9 = r6 * r4;
        r8 = (r6 + r9) - 1;
    L31:
        if (r14 < r9) goto L6;
        if (r8 < r13) goto L6;
        ((pn2) this.q).g(r11, r10, (Bundle) r2.b, r12);
    L26:
        r14 = Integer.MAX_VALUE;
        r13 = 0;
        goto L27
    L20:
        r6 = r3.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        goto L21
    L17:
        r7 = r12.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        goto L18
    L13:
        r4 = r3.getInt("android.media.browse.extra.PAGE", -1);
        goto L15
    L10:
        r5 = r12.getInt("android.media.browse.extra.PAGE", -1);
        goto L11
    L42:
        return;
    }

    public void p(String r1, Bundle r2) {
        qj2 r0 = (qj2) this.o;
        r0.getClass();
        r0.notifyChildrenChanged(r1);
    }

    public boolean q(d5 r3, MenuItem r4) {
        return ((ActionMode.Callback) this.n).onActionItemClicked(i(r3), new xu2((Context) this.o, (oo4) r4));
    }

    public void r() {
        qj2 r0 = new qj2(this, (pn2) this.q);
        this.o = r0;
        r0.onCreate();
    }

    public boolean s(d5 r5, Menu r6) {
        ActionMode.Callback r0 = (ActionMode.Callback) this.n;
        jo4 r7 = i(r5);
        yd4 r1 = (yd4) this.q;
        Menu r2 = (Menu) r1.get(r6);
        if (r2 != null) goto L6;
        r2 = new jv2((Context) this.o, (qu2) r6);
        r1.put(r6, r2);
    L6:
        return r0.onCreateActionMode(r7, r2);
    }

    public /* synthetic */ bq4(ConstraintLayout r1, ImageView r2, TextView r3, TextView r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public bq4(WorkDatabase_Impl r3) {
        this.n = r3;
        this.o = new vo0(r3, 2);
        this.p = new aq4(r3, 0);
        this.q = new aq4(r3, 1);
    }

    public bq4(e75 r1, b75 r2, tf0 r3) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = new xi4(13);
    }

    public bq4(ExecutorService r3) {
        this.p = new Handler(Looper.getMainLooper());
        this.q = new vc5(this);
        ia4 r0 = new ia4(r3, 0);
        this.n = r0;
        this.o = kb4.w(r0);
    }

    public /* synthetic */ bq4(ViewGroup r1, View r2, View r3, ViewGroup r4, View r5) {
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }

    public bq4(int r3) {
        switch(r3) {
            case 12: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new be3();
        this.o = new be3();
        this.p = new bg3();
        return;
    L5:
        this.n = new oi(0);
        this.o = new SparseArray();
        this.p = new xe2(null);
        this.q = new oi(0);
    }

    public bq4(ss2 r1) {
        this.n = r1;
        this.o = new w33();
        new LinkedHashSet();
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
    }

    public bq4(Context r1, ActionMode.Callback r2) {
        this.o = r1;
        this.n = r2;
        this.p = new ArrayList();
        this.q = new yd4(0);
    }

    public bq4(List r6, ArrayList r7) {
        this.n = r6;
        this.p = new SparseBooleanArray();
        int r0 = 0;
        this.o = new oi(0);
        int r8 = r6.size();
        int r1 = Integer.MIN_VALUE;
        nd3 r2 = null;
    L3:
        if (r0 >= r8) goto L8;
        nd3 r3 = (nd3) r6.get(r0);
        int r4 = r3.e;
        if (r4 <= r1) goto L7;
        r2 = r3;
        r1 = r4;
    L7:
        r0 = r0 + 1;
        goto L3
    L8:
        this.q = r2;
    }

    public bq4(pn2 r1) {
        this.q = r1;
        this.n = new ArrayList();
    }

    public bq4(AudioTrack r2, zh0 r3) {
        this.n = r2;
        this.o = r3;
        Handler r4 = f35.p(null);
        this.p = r4;
        AudioRouting.OnRoutingChangedListener r0 = new wm(this);
        this.q = r0;
        r2.addOnRoutingChangedListener(r0, r4);
    }
}
