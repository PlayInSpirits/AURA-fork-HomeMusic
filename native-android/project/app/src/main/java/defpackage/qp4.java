package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.eddyizm.tempus.database.AppDatabase;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.BufferedReader;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qp4 {
    public static qp4 d;
    public final Object a;
    public Object b;
    public Object c;

    public qp4(im... r6) {
        wd4 r0 = new wd4();
        bj4 r1 = new bj4();
        r1.c = 1.0f;
        r1.d = 1.0f;
        gm r2 = gm.e;
        r1.e = r2;
        r1.f = r2;
        r1.g = r2;
        r1.h = r2;
        ByteBuffer r3 = im.a;
        r1.k = r3;
        r1.l = r3;
        r1.b = -1;
        im[] r4 = new im[r6.length + 2];
        this.a = r4;
        System.arraycopy(r6, 0, r4, 0, r6.length);
        this.b = r0;
        this.c = r1;
        r4[r6.length] = r0;
        r4[r6.length + 1] = r1;
    }

    public static boolean a(Editable r6, KeyEvent r7, boolean r8) {
        if (KeyEvent.metaStateHasNoModifiers(r7.getMetaState()) == false) goto L26;
        int r9 = Selection.getSelectionStart(r6);
        int r1 = Selection.getSelectionEnd(r6);
        if (r9 == (-1)) goto L26;
        if (r1 == (-1)) goto L26;
        if (r9 != r1) goto L26;
        l05[] r2 = (l05[]) r6.getSpans(r9, r1, l05.class);
        if (r2 == null) goto L26;
        if (r2.length <= 0) goto L26;
        int r3 = r2.length;
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L26;
        l05 r5 = r2[r4];
        int r10 = r6.getSpanStart(r5);
        int r11 = r6.getSpanEnd(r5);
        if (r8 == false) goto L19;
        if (r10 != r9) goto L19;
    L23:
        r6.delete(r10, r11);
        return true;
    L19:
        if (r8 == true) goto L21;
        if (r11 == r9) goto L23;
    L21:
        if (r9 <= r10) goto L25;
        if (r9 < r11) goto L23;
    L25:
        r4 = r4 + 1;
    L26:
        return false;
    }

    public int b() {
        if (e().a.isEmpty() == false) goto L6;
        return -1;
    L6:
        long r0 = ((long) ((xi2) q40.w0(e().a)).a) - ((long) e().h);
        if (r0 >= 0) goto L10;
        r0 = 0;
    L10:
        return (int) r0;
    }

    public boolean c() {
        return !e().a.isEmpty();
    }

    public int d() {
        if (e().a.isEmpty() == false) goto L6;
        return -1;
    L6:
        long r0 = ((long) ((xi2) q40.C0(e().a)).a) + ((long) e().h);
        long r2 = ((long) h()) - 1;
        if (r0 <= r2) goto L10;
        r0 = r2;
    L10:
        return (int) r0;
    }

    public qc3 e() {
        qc3 r0 = (qc3) this.b;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("layoutInfo");
        throw null;
    }

    public int f() {
        if (e().a.isEmpty() == false) goto L7;
        return 0;
    L7:
        return Math.abs(((((xi2) q40.C0(e().a)).l + e().b) + e().c) - e().g);
    }

    public int g() {
        int r1 = 0;
        if (e().a.isEmpty() == false) goto L5;
        return 0;
    L5:
        int r0 = ((xi2) q40.w0(e().a)).l + (-e().f);
        if (r0 > 0) goto L10;
        r1 = r0;
    L10:
        return Math.abs(r1);
    }

    public int h() {
        return ((Number) ((vc3) this.a).invoke()).intValue();
    }

    public boolean i(CharSequence r7, int r8, int r9, k05 r10) {
        if ((r10.c & 3) != 0) goto L19;
        wk0 r6 = (wk0) this.c;
        vv2 r0 = r10.b();
        int r4 = r0.a(8);
        if (r4 == 0) goto L7;
        ((ByteBuffer) r0.q).getShort(r4 + r0.n);
    L7:
        r6.getClass();
        ThreadLocal r1 = wk0.b;
        if (r1.get() != null) goto L10;
        r1.set(new StringBuilder());
    L10:
        StringBuilder r2 = (StringBuilder) r1.get();
        r2.setLength(0);
    L11:
        if (r8 >= r9) goto L13;
        r2.append(r7.charAt(r8));
        r8 = r8 + 1;
        goto L11
    L13:
        boolean r11 = r6.a.hasGlyph(r2.toString());
        int r12 = r10.c & 4;
        if (r11 == false) goto L16;
        int r13 = r12 | 2;
    L17:
        r10.c = r13;
        goto L19
    L16:
        r13 = r12 | 1;
    L19:
        if ((r10.c & 3) != 2) goto L21;
        return true;
    L21:
        return false;
    }

    public boolean j() {
        ArrayDeque r0 = (ArrayDeque) this.b;
        if (((String) this.c) == null) goto L6;
    L13:
        return true;
    L6:
        if (r0.isEmpty() == true) goto L9;
        String r1 = (String) r0.poll();
        r1.getClass();
        this.c = r1;
        return true;
    L9:
        String r2 = ((BufferedReader) this.a).readLine();
        this.c = r2;
        if (r2 == null) goto L14;
        String r3 = r2.trim();
        this.c = r3;
        if (r3.isEmpty() == true) goto L9;
    L14:
        return false;
    }

    public boolean k(int r6, jc0 r7, nr3 r8) {
        kr r5 = (kr) this.b;
        int[] r0 = r7.o0;
        int[] r1 = r7.t;
        r5.a = r0[0];
        boolean r3 = true;
        r5.b = r0[1];
        r5.c = r7.o();
        r5.d = r7.i();
        r5.i = false;
        r5.j = r6;
        if (r5.a != 3) goto L5;
        boolean r9 = true;
    L7:
        if (r5.b != 3) goto L9;
        boolean r2 = true;
    L11:
        if (r9 == true) goto L13;
    L15:
        boolean r10 = false;
    L16:
        if (r2 == true) goto L18;
    L20:
        boolean r4 = false;
    L22:
        if (r10 == true) goto L24;
    L26:
        if (r4 == true) goto L28;
    L30:
        r8.d(r7, r5);
        r7.K(r5.e);
        r7.H(r5.f);
        r7.E = r5.h;
        int r11 = r5.g;
        r7.Z = r11;
        if (r11 > 0) goto L34;
        r3 = false;
    L34:
        r7.E = r3;
        r5.j = 0;
        return r5.i;
    L28:
        if (r1[1] != 4) goto L30;
        r5.b = 1;
        goto L30
    L24:
        if (r1[0] != 4) goto L26;
        r5.a = 1;
        goto L26
    L18:
        if (r7.V <= 0.0f) goto L20;
        r4 = true;
        goto L22
    L13:
        if (r7.V <= 0.0f) goto L15;
        r10 = true;
        goto L16
    L9:
        r2 = false;
        goto L11
    L5:
        r9 = false;
        goto L7
    }

    public String l() {
        if (j() == false) goto L6;
        String r0 = (String) this.c;
        this.c = null;
        return r0;
    L6:
        tb4.k();
        return null;
    }

    public void m(q92 r3) {
        ua4 r0 = (ua4) this.c;
        if (r0 == null) goto L5;
        r0.run();
    L5:
        ua4 r1 = new ua4((ea2) this.a, r3);
        this.c = r1;
        ((Handler) this.b).postAtFrontOfQueue(r1);
    }

    public Object n(CharSequence r17, int r18, int r19, int r20, boolean r21, e01 r22) {
        g01 r5 = new g01((zv2) ((na4) this.b).p);
        int r9 = Character.codePointAt(r17, r18);
        int r10 = 0;
        boolean r11 = true;
        int r6 = r18;
    L3:
        int r7 = r6;
    L5:
        if (r6 >= r19) goto L55;
        if (r10 >= r20) goto L55;
        if (r11 == false) goto L55;
        SparseArray r13 = ((zv2) r5.e).a;
        if (r13 != null) goto L11;
        zv2 r14 = null;
    L13:
        if (r5.a == 2) goto L19;
        if (r14 != null) goto L17;
        r5.b();
    L16:
        char r15 = 1;
    L38:
        r5.b = r9;
        if (r15 == 1) goto L51;
        if (r15 != 2) goto L41;
        int r12 = Character.charCount(r9) + r6;
        if (r12 >= r19) goto L50;
        r9 = Character.codePointAt(r17, r12);
    L50:
        r6 = r12;
        goto L5
    L41:
        if (r15 != 3) goto L5;
        if (r21 == true) goto L46;
        if (i(r17, r7, r6, ((zv2) r5.f).b) == true) goto L3;
    L46:
        r11 = r22.b(r17, r7, r6, ((zv2) r5.f).b);
        r10 = r10 + 1;
        goto L3
    L51:
        r6 = Character.charCount(Character.codePointAt(r17, r7)) + r7;
        if (r6 >= r19) goto L3;
        r9 = Character.codePointAt(r17, r6);
        goto L3
    L17:
        r5.a = 2;
        r5.e = r14;
        r5.c = 1;
    L18:
        r15 = 2;
        goto L38
    L19:
        if (r14 == null) goto L22;
        r5.e = r14;
        r5.c++;
        goto L18
    L22:
        if (r9 != 65038) goto L25;
        r5.b();
        goto L16
    L25:
        if (r9 == 65039) goto L18;
        zv2 r16 = (zv2) r5.e;
        if (r16.b != null) goto L30;
        r5.b();
        goto L16
    L30:
        if (r5.c == 1) goto L32;
        r5.f = r16;
        r5.b();
    L34:
        r15 = 3;
        goto L38
    L32:
        if (r5.c() == false) goto L35;
        r5.f = (zv2) r5.e;
        r5.b();
        goto L34
    L35:
        r5.b();
        goto L16
    L11:
        r14 = (zv2) r13.get(r9);
    L55:
        if (r5.a != 2) goto L69;
        if (((zv2) r5.e).b == null) goto L69;
        if (r5.c <= 1) goto L61;
    L62:
        if (r10 >= r20) goto L69;
        if (r11 == false) goto L69;
        if (r21 == false) goto L66;
    L67:
        r22.b(r17, r7, r6, ((zv2) r5.e).b);
        goto L69
    L66:
        if (i(r17, r7, r6, ((zv2) r5.e).b) == true) goto L69;
    L61:
        if (r5.c() == true) goto L62;
    L69:
        return r22.a();
    }

    public void o(String r3, String r4) {
        xl.E((s24) this.a, false, true, new ps0(3, r3, r4));
    }

    public void p(kc0 r4, int r5, int r6, int r7) {
        r4.getClass();
        int r0 = r4.a0;
        int r1 = r4.b0;
        r4.a0 = 0;
        r4.b0 = 0;
        r4.K(r6);
        r4.H(r7);
        if (r0 >= 0) goto L5;
        r4.a0 = 0;
    L6:
        if (r1 >= 0) goto L8;
        r4.b0 = 0;
    L9:
        kc0 r3 = (kc0) this.c;
        r3.s0 = r5;
        r3.Q();
        return;
    L8:
        r4.b0 = r1;
        goto L9
    L5:
        r4.a0 = r0;
        goto L6
    }

    public void q(kc0 r9) {
        ArrayList r8 = (ArrayList) this.a;
        r8.clear();
        int r0 = r9.p0.size();
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L11;
        jc0 r4 = (jc0) r9.p0.get(r2);
        int[] r5 = r4.o0;
        if (r5[0] != 3) goto L8;
    L9:
        r8.add(r4);
    L10:
        r2 = r2 + 1;
        goto L4
    L8:
        if (r5[1] != 3) goto L10;
    L11:
        r9.r0.b = true;
    }

    public qp4(ConstraintLayout r1, TextView r2, ImageView r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public qp4(AppDatabase r3) {
        this.b = new i80(22);
        this.c = new si1(25);
        this.a = r3;
    }

    public qp4(DrawerLayout r1, BottomNavigationView r2, TextView r3, FrameLayout r4) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    public qp4(zg2 r3, View r4) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L6;
        Object r1 = new ch2();
    L9:
        this.a = r1;
        this.b = r3;
        this.c = r4;
        return;
    L6:
        if (r0 < 33) goto L8;
        r1 = new ah2();
        goto L9
    L8:
        r1 = null;
        goto L9
    }

    public qp4(vc3 r1) {
        this.a = r1;
    }

    public qp4(Context r2, LocationManager r3) {
        this.c = new yn4();
        this.a = r2;
        this.b = r3;
    }

    public qp4(kc0 r2) {
        this.a = new ArrayList();
        this.b = new kr();
        this.c = r2;
    }

    public qp4(na4 r8, om0 r9, wk0 r10, Set r11) {
        this.a = r9;
        this.b = r8;
        this.c = r10;
        if (r11.isEmpty() == true) goto L9;
        Iterator r12 = r11.iterator();
    L7:
        if (r12.hasNext() == false) goto L11;
        int[] r13 = (int[]) r12.next();
        String r1 = new String(r13, 0, r13.length);
        e01 r6 = new f01(0, r1);
        n(r1, 0, r1.length(), 1, true, r6);
        goto L7
    L11:
        return;
    }

    public qp4(ja2 r3) {
        this.a = new ea2(r3, true);
        this.b = new Handler(Looper.getMainLooper());
    }

    public qp4(ArrayDeque r1, BufferedReader r2) {
        this.b = r1;
        this.a = r2;
    }
}
