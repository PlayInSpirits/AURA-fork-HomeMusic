package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.App;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z40 implements Callback, qn4 {
    public static final ca1 s = null;
    public final Object n;
    public Object o;
    public final Object p;
    public Object q;
    public Object r;

    static {
        s = new ca1(13);
    }

    public z40(int[] r18, int r19, md3[] r20) {
        this.r = new float[3];
        this.q = r20;
        int[] r4 = new int[32768];
        this.o = r4;
        int r5 = 0;
        int r6 = 0;
    L4:
        if (r6 >= r18.length) goto L6;
        int r7 = r18[r6];
        int r8 = h(Color.blue(r7), 8, 5) | ((h(Color.red(r7), 8, 5) << 10) | (h(Color.green(r7), 8, 5) << 5));
        r18[r6] = r8;
        r4[r8] = r4[r8] + 1;
        r6 = r6 + 1;
        goto L4
    L6:
        int r1 = 0;
        int r9 = 0;
    L7:
        if (r1 >= 32768) goto L17;
        if (r4[r1] <= 0) goto L14;
        int r10 = Color.rgb(h((r1 >> 10) & 31, 5, 8), h((r1 >> 5) & 31, 5, 8), h(r1 & 31, 5, 8));
        float[] r11 = (float[]) this.r;
        ThreadLocal r12 = v50.a;
        v50.a(Color.red(r10), Color.green(r10), Color.blue(r10), r11);
        if (j(r11) == false) goto L14;
        r4[r1] = 0;
    L14:
        if (r4[r1] <= 0) goto L16;
        r9 = r9 + 1;
    L16:
        r1 = r1 + 1;
        goto L7
    L17:
        int[] r2 = new int[r9];
        this.n = r2;
        int r13 = 0;
        int r14 = 0;
    L18:
        if (r13 >= 32768) goto L23;
        if (r4[r13] <= 0) goto L22;
        r2[r14] = r13;
        r14 = r14 + 1;
    L22:
        r13 = r13 + 1;
        goto L18
    L23:
        if (r9 > r19) goto L28;
        this.p = new ArrayList();
    L25:
        if (r5 >= r9) goto L27;
        int r3 = r2[r5];
        ((ArrayList) this.p).add(new nd3(Color.rgb(h((r3 >> 10) & 31, 5, 8), h((r3 >> 5) & 31, 5, 8), h(r3 & 31, 5, 8)), r4[r3]));
        r5 = r5 + 1;
        goto L25
    L27:
        return;
    L28:
        PriorityQueue r15 = new PriorityQueue(r19, s);
        r15.offer(new y40(this, 0, ((int[]) this.n).length - 1));
    L30:
        if (r15.size() >= r19) goto L55;
        y40 r16 = (y40) r15.poll();
        if (r16 == null) goto L55;
        int r17 = r16.b;
        int r21 = r16.a;
        if (((r17 + 1) - r21) <= 1) goto L55;
        z40 r22 = r16.j;
        if (((r17 + 1) - r21) <= 1) goto L53;
        int r110 = r16.e - r16.d;
        int r111 = r16.g - r16.f;
        int r112 = r16.i - r16.h;
        if (r110 < r111) goto L41;
        if (r110 < r112) goto L41;
        int r113 = -3;
    L45:
        int[] r114 = (int[]) r22.n;
        int[] r115 = (int[]) r22.o;
        g(r114, r113, r21, r17);
        Arrays.sort(r114, r21, r16.b + 1);
        g(r114, r113, r21, r16.b);
        int r23 = r16.c / 2;
        int r116 = 0;
        int r117 = r21;
    L46:
        int r118 = r16.b;
        if (r117 > r118) goto L52;
        r116 = r116 + r115[r114[r117]];
        if (r116 >= r23) goto L50;
        r117 = r117 + 1;
        goto L46
    L50:
        r21 = Math.min(r118 - 1, r117);
    L52:
        y40 r24 = new y40(r22, r21 + 1, r16.b);
        r16.b = r21;
        r16.a();
        r15.offer(r24);
        r15.offer(r16);
    L41:
        if (r111 < r110) goto L44;
        if (r111 < r112) goto L44;
        r113 = -2;
    L44:
        r113 = -1;
        goto L45
    L53:
        kf2.o("Can not split a box with only 1 color");
        throw null;
    L55:
        ArrayList r25 = new ArrayList(r15.size());
        Iterator r26 = r15.iterator();
    L57:
        if (r26.hasNext() == false) goto L65;
        y40 r27 = (y40) r26.next();
        z40 r28 = r27.j;
        int[] r29 = (int[]) r28.n;
        int[] r30 = (int[]) r28.o;
        int r31 = r27.a;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
    L60:
        if (r31 > r27.b) goto L62;
        int r123 = r29[r31];
        int r124 = r30[r123];
        r120 = r120 + r124;
        r119 = (((r123 >> 10) & 31) * r124) + r119;
        r121 = (((r123 >> 5) & 31) * r124) + r121;
        r122 = r122 + (r124 * (r123 & 31));
        r31 = r31 + 1;
        goto L60
    L62:
        float r32 = r120;
        nd3 r33 = new nd3(Color.rgb(h(Math.round(r119 / r32), 5, 8), h(Math.round(r121 / r32), 5, 8), h(Math.round(r122 / r32), 5, 8)), r120);
        if (j(r33.b()) == true) goto L57;
        r25.add(r33);
        goto L57
    L65:
        this.p = r25;
    }

    public static void g(int[] r2, int r3, int r4, int r5) {
        if (r3 != (-2)) goto L5;
    L9:
        if (r4 > r5) goto L15;
        int r6 = r2[r4];
        int r0 = (((r6 >> 5) & 31) << 10) | (((r6 >> 10) & 31) << 5);
        r2[r4] = (r6 & 31) | r0;
        r4 = r4 + 1;
        goto L9
    L15:
        return;
    L5:
        if (r3 != (-1)) goto L11;
    L7:
        if (r4 > r5) goto L14;
        int r7 = r2[r4];
        int r1 = ((r7 & 31) << 10) | (((r7 >> 5) & 31) << 5);
        r2[r4] = ((r7 >> 10) & 31) | r1;
        r4 = r4 + 1;
        goto L7
    L14:
        return;
    }

    public static int h(int r0, int r1, int r2) {
        if (r2 <= r1) goto L4;
        int r3 = r0 << (r2 - r1);
    L6:
        return r3 & ((1 << r2) - 1);
    L4:
        r3 = r0 >> (r1 - r2);
        goto L6
    }

    public ez a(ko r9, gf1 r10) {
        hx3 r0 = new hx3();
        r0.n = -1;
        Object r1 = this.n;
        monitor-enter(r1);
        Throwable r2 = (Throwable) this.o;     // Catch: Throwable -> L9
        if (r2 == null) goto L11;
        r9.b(r2);     // Catch: Throwable -> L9
        kf2 r8 = fz0.E;     // Catch: Throwable -> L9
        monitor-exit(r1);
        return r8;
    L11:
        fl r3 = (fl) this.p;     // Catch: Throwable -> L9
    L12:
        int r4 = r3.get();     // Catch: Throwable -> L9
        int r5 = r4 + 1;     // Catch: Throwable -> L9
        if (r3.compareAndSet(r4, r5) == false) goto L12;
        int r6 = 0;
        if ((134217727 & r5) != 1) goto L17;
        boolean r7 = true;
    L18:
        r0.n = (r5 >>> 27) & 15;     // Catch: Throwable -> L9
        ((q03) this.q).a(r9);     // Catch: Throwable -> L9
        monitor-exit(r1);
        if (r7 == false) goto L43;
        if (r10 == null) goto L43;
        r10.invoke();     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        monitor-enter(this.n);
    L34:
        th = move-exception;
        throw th;
    L28:
        if (((Throwable) this.o) != null) goto L43;
        this.o = th;     // Catch: Throwable -> L34
        q03 r11 = (q03) this.q;     // Catch: Throwable -> L34
        Object[] r12 = r11.a;     // Catch: Throwable -> L34
        int r13 = r11.b;     // Catch: Throwable -> L34
        int r14 = 0;
    L32:
        if (r14 >= r13) goto L36;
        ((ko) r12[r14]).b(th);     // Catch: Throwable -> L34
        r14 = r14 + 1;     // Catch: Throwable -> L34
        goto L32
    L36:
        ((q03) this.q).d();     // Catch: Throwable -> L34
        fl r15 = (fl) this.p;     // Catch: Throwable -> L34
    L37:
        int r16 = r15.get();     // Catch: Throwable -> L34
        if (r15.compareAndSet(r16, ((((r16 >>> 27) & 15) + 1) & 15) << 27) == false) goto L37;
    L43:
        return new gp3(new jo(r9, this, r0, r6));
    L17:
        r7 = false;
    L9:
        th = move-exception;
        throw th;
    }

    public void b(if1 r5) {
        Object r0 = this.n;
        monitor-enter(r0);
        q03 r1 = (q03) this.q;     // Catch: Throwable -> L10
        this.q = (q03) this.r;     // Catch: Throwable -> L10
        this.r = r1;     // Catch: Throwable -> L10
        fl r4 = (fl) this.p;     // Catch: Throwable -> L10
    L5:
        int r2 = r4.get();     // Catch: Throwable -> L10
        if (r4.compareAndSet(r2, ((((r2 >>> 27) & 15) + 1) & 15) << 27) == false) goto L5;
        int r6 = r1.b;     // Catch: Throwable -> L10
        int r3 = 0;
    L8:
        if (r3 >= r6) goto L12;
        r5.invoke(r1.f(r3));     // Catch: Throwable -> L10
        r3 = r3 + 1;     // Catch: Throwable -> L10
        goto L8
    L12:
        r1.d();     // Catch: Throwable -> L10
        monitor-exit(r0);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public float c(int r2, boolean r3) {
        Layout r1 = (Layout) this.n;
        int r0 = r1.getLineEnd(r1.getLineForOffset(r2));
        if (r2 <= r0) goto L5;
        r2 = r0;
    L5:
        if (r3 == false) goto L9;
        return r1.getPrimaryHorizontal(r2);
    L9:
        return r1.getSecondaryHorizontal(r2);
    }

    public float d(int r29, boolean r30, boolean r31) {
        ArrayList r3 = (ArrayList) this.p;
        Layout r4 = (Layout) this.n;
        if (r31 == false) goto L5;
        int r5 = vr1.w(r4, r29, r31);
        int r6 = r4.getLineStart(r5);
        int r7 = r4.getLineEnd(r5);
        if (r29 == r6) goto L11;
        if (r29 == r7) goto L11;
        return c(r29, r30);
    L11:
        if (r29 == 0) goto L169;
        if (r29 == r4.getText().length()) goto L169;
        int r8 = gb.e(r3, Integer.valueOf(r29));
        if (r8 >= 0) goto L18;
        int r9 = -(r8 + 1);
    L19:
        if (r31 == false) goto L24;
        if (r9 <= 0) goto L24;
        int r2 = r9 - 1;
        if (r29 != ((Number) r3.get(r2)).intValue()) goto L24;
        r9 = r2;
    L24:
        if (r9 != 0) goto L26;
        int r10 = 0;
    L28:
        if (r4.getParagraphDirection(r4.getLineForOffset(r10)) != (-1)) goto L30;
        boolean r11 = true;
    L31:
        int r12 = f(r7, r6);
        if (r9 != 0) goto L34;
        int r13 = 0;
    L35:
        int r14 = r6 - r13;
        int r15 = r12 - r13;
        ArrayList r16 = (ArrayList) this.o;
        boolean[] r17 = (boolean[]) this.q;
        Bidi r18 = null;
        if (r17[r9] == false) goto L38;
        Bidi r19 = (Bidi) r16.get(r9);
        int r20 = -1;
    L67:
        if (r19 == null) goto L69;
        r18 = r19.createLineBidi(r14, r15);
    L69:
        Bidi r21 = r18;
        if (r21 != null) goto L72;
        boolean r110 = true;
    L152:
        boolean r0 = r4.isRtlCharAt(r6);
        if (r30 == true) goto L155;
        if (r11 == r0) goto L155;
    L158:
        if (r29 != r6) goto L160;
        boolean r22 = r11;
    L163:
        if (r22 == false) goto L167;
        return r4.getLineLeft(r5);
    L167:
        return r4.getLineRight(r5);
    L160:
        if (r11 == true) goto L162;
        r22 = r110;
        goto L163
    L162:
        r22 = false;
    L155:
        if (r11 == true) goto L157;
        r11 = r110;
        goto L158
    L157:
        r11 = false;
        goto L158
    L72:
        if (r21.getRunCount() != 1) goto L75;
        r110 = true;
        goto L152
    L75:
        int r23 = r21.getRunCount();
        s62[] r24 = new s62[r23];
        int r25 = 0;
    L76:
        if (r25 >= r23) goto L82;
        int r111 = r21.getRunStart(r25) + r6;
        int r112 = r21.getRunLimit(r25) + r6;
        if ((r21.getRunLevel(r25) % 2) != 1) goto L80;
        boolean r113 = true;
    L81:
        r24[r25] = new s62(r111, r112, r113);
        r25 = r25 + 1;
        goto L76
    L80:
        r113 = false;
        goto L81
    L82:
        int r26 = r21.getRunCount();
        byte[] r27 = new byte[r26];
        int r114 = 0;
    L83:
        if (r114 >= r26) goto L85;
        r27[r114] = (byte) r21.getRunLevel(r114);
        r114 = r114 + 1;
        goto L83
    L85:
        Bidi.reorderVisually(r27, 0, r24, 0, r23);
        if (r29 != r6) goto L118;
        int r1 = 0;
    L88:
        if (r1 >= r23) goto L93;
        if (r24[r1].a == r29) goto L94;
        r1 = r1 + 1;
    L94:
        s62 r28 = r24[r1];
        if (r30 == false) goto L97;
    L100:
        if (r11 == true) goto L102;
        boolean r32 = true;
    L103:
        if (r1 != 0) goto L108;
        if (r32 == false) goto L108;
        return r4.getLineLeft(r5);
    L108:
        if (r1 != (r23 - 1)) goto L112;
        if (r32 == true) goto L112;
        return r4.getLineRight(r5);
    L112:
        if (r32 == false) goto L116;
        return r4.getPrimaryHorizontal(r24[r1 - 1].a);
    L116:
        return r4.getPrimaryHorizontal(r24[r1 + 1].a);
    L102:
        r32 = false;
        goto L103
    L97:
        if (r11 == r28.c) goto L100;
        r32 = r11;
        goto L103
    L93:
        r1 = r20;
        goto L94
    L118:
        if (r29 <= r12) goto L120;
        int r33 = f(r29, r6);
    L121:
        int r34 = 0;
    L122:
        if (r34 >= r23) goto L127;
        if (r24[r34].b == r33) goto L128;
        r34 = r34 + 1;
    L128:
        s62 r35 = r24[r34];
        if (r30 == false) goto L131;
    L136:
        boolean r36 = r11;
    L137:
        if (r34 != 0) goto L142;
        if (r36 == false) goto L142;
        return r4.getLineLeft(r5);
    L142:
        if (r34 != (r23 - 1)) goto L146;
        if (r36 == true) goto L146;
        return r4.getLineRight(r5);
    L146:
        if (r36 == false) goto L150;
        return r4.getPrimaryHorizontal(r24[r34 - 1].b);
    L150:
        return r4.getPrimaryHorizontal(r24[r34 + 1].b);
    L131:
        if (r11 == r35.c) goto L136;
        if (r11 == true) goto L135;
        r36 = true;
        goto L137
    L135:
        r36 = false;
        goto L137
    L127:
        r34 = r20;
        goto L128
    L120:
        r33 = r29;
        goto L121
    L38:
        if (r9 != 0) goto L40;
        int r37 = 0;
    L41:
        int r115 = ((Number) r3.get(r9)).intValue();
        int r38 = r115 - r37;
        char[] r116 = (char[]) this.r;
        if (r116 != null) goto L44;
    L45:
        r116 = new char[r38];
    L46:
        TextUtils.getChars(r4.getText(), r37, r115, r116, 0);
        if (Bidi.requiresBidi(r116, 0, r38) == false) goto L59;
        if (r9 != 0) goto L50;
        int r39 = 0;
    L51:
        int r40 = r4.getParagraphDirection(r4.getLineForOffset(r39));
        r20 = -1;
        if (r40 != (-1)) goto L54;
        int r210 = 1;
    L55:
        Bidi r117 = new Bidi(r116, 0, null, 0, r38, r210);
        boolean r41 = true;
        if (r117.getRunCount() != 1) goto L58;
    L57:
        Bidi r42 = null;
    L60:
        r16.set(r9, r42);
        r17[r9] = r41;
        if (r42 == null) goto L66;
        char[] r43 = (char[]) this.r;
        if (r116 != r43) goto L65;
        r116 = null;
        goto L66
    L65:
        r116 = r43;
    L66:
        this.r = r116;
        r19 = r42;
        goto L67
    L58:
        r42 = r117;
        goto L60
    L54:
        r210 = 0;
        goto L55
    L50:
        r39 = ((Number) r3.get(r9 - 1)).intValue();
        goto L51
    L59:
        r41 = true;
        r20 = -1;
        goto L57
    L44:
        if (r116.length >= r38) goto L46;
    L40:
        r37 = ((Number) r3.get(r9 - 1)).intValue();
        goto L41
    L34:
        r13 = ((Number) r3.get(r9 - 1)).intValue();
        goto L35
    L30:
        r11 = false;
        goto L31
    L26:
        r10 = ((Number) r3.get(r9 - 1)).intValue();
        goto L28
    L18:
        r9 = r8 + 1;
    L169:
        return c(r29, r30);
    L5:
        return c(r29, r30);
    }

    @Override // defpackage.qn4
    public int e(long r2) {
        long[] r1 = (long[]) this.o;
        int r3 = f35.b(r1, r2, false);
        if (r3 >= r1.length) goto L5;
        return r3;
    L5:
        return -1;
    }

    public int f(int r3, int r4) {
    L2:
        if (r3 <= r4) goto L22;
        char r0 = ((Layout) this.n).getText().charAt(r3 - 1);
        if (r0 == ' ') goto L21;
        if (r0 == '\n') goto L21;
        if (r0 == 5760) goto L21;
        if (h12.j(r0, 8192) < 0) goto L16;
        if (h12.j(r0, 8202) > 0) goto L16;
        if (r0 != 8199) goto L21;
    L16:
        if (r0 == 8287) goto L21;
        if (r0 == 12288) goto L21;
        return r3;
    L21:
        r3 = r3 - 1;
        goto L2
    L22:
        return r3;
    }

    public void i(Object r2, String r3) {
        r3.getClass();
        ((LinkedHashMap) this.n).put(r3, r2);
        nl4 r0 = (nl4) ((LinkedHashMap) this.p).get(r3);
        if (r0 == null) goto L5;
        r0.i(r2);
    L5:
        nl4 r1 = (nl4) ((LinkedHashMap) this.q).get(r3);
        if (r1 == null) goto L9;
        r1.i(r2);
        return;
    }

    public boolean j(float[] r7) {
        md3[] r6 = (md3[]) this.q;
        if (r6 != null) goto L5;
    L22:
        return false;
    L5:
        if (r6.length <= 0) goto L22;
        int r1 = r6.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L22;
        r6[r2].getClass();
        float r3 = r7[2];
        if (r3 >= 0.95f) goto L20;
        if (r3 <= 0.05f) goto L20;
        float r4 = r7[0];
        if (r4 < 10.0f) goto L21;
        if (r4 > 37.0f) goto L21;
        if (r7[1] <= 0.82f) goto L20;
    L21:
        r2 = r2 + 1;
    L20:
        return true;
    }

    @Override // defpackage.qn4
    public long k(int r3) {
        return ((long[]) this.o)[r3];
    }

    @Override // defpackage.qn4
    public List m(long r31) {
        uy4 r2 = (uy4) this.n;
        Map r1 = (Map) this.p;
        HashMap r8 = (HashMap) this.q;
        HashMap r0 = (HashMap) this.r;
        ArrayList r9 = new ArrayList();
        r2.g(r31, r2.h, r9);
        TreeMap r7 = new TreeMap();
        r2.i(r31, false, r2.h, r7);
        r2.h(r31, r1, r8, r2.h, r7);
        ArrayList r3 = new ArrayList();
        int r4 = r9.size();
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L8;
        Object r6 = r9.get(r5);
        r5 = r5 + 1;
        Pair r10 = (Pair) r6;
        String r11 = (String) r0.get(r10.second);
        if (r11 == null) goto L3;
        byte[] r12 = Base64.decode(r11, 0);
        Bitmap r15 = BitmapFactory.decodeByteArray(r12, 0, r12.length);
        wy4 r13 = (wy4) r8.get(r10.first);
        r13.getClass();
        r3.add(new ig0(null, null, null, r15, r13.c, 0, r13.e, r13.b, 0, Integer.MIN_VALUE, -3.4028235E38f, r13.f, r13.g, false, -16777216, r13.j, 0.0f, 0));
        goto L3
    L8:
        Iterator r14 = r7.entrySet().iterator();
    L10:
        if (r14.hasNext() == false) goto L63;
        Map.Entry r16 = (Map.Entry) r14.next();
        wy4 r17 = (wy4) r8.get(r16.getKey());
        r17.getClass();
        hg0 r18 = (hg0) r16.getValue();
        CharSequence r19 = r18.a;
        r19.getClass();
        SpannableStringBuilder r20 = (SpannableStringBuilder) r19;
        ko0[] r21 = (ko0[]) r20.getSpans(0, r20.length(), ko0.class);
        int r22 = r21.length;
        int r23 = 0;
    L12:
        if (r23 >= r22) goto L14;
        ko0 r110 = r21[r23];
        r20.replace(r20.getSpanStart(r110), r20.getSpanEnd(r110), "");
        r23 = r23 + 1;
        goto L12
    L14:
        int r24 = 0;
    L16:
        if (r24 >= r20.length()) goto L30;
        if (r20.charAt(r24) != ' ') goto L28;
        int r25 = r24 + 1;
        int r111 = r25;
    L21:
        if (r111 >= r20.length()) goto L25;
        if (r20.charAt(r111) != ' ') goto L25;
        r111 = r111 + 1;
    L25:
        int r112 = r111 - r25;
        if (r112 <= 0) goto L28;
        r20.delete(r24, r112 + r24);
    L28:
        r24 = r24 + 1;
        goto L16
    L30:
        if (r20.length() > 0) goto L32;
    L34:
        int r26 = 0;
    L36:
        if (r26 >= (r20.length() - 1)) goto L44;
        if (r20.charAt(r26) != '\n') goto L42;
        int r113 = r26 + 1;
        if (r20.charAt(r113) != ' ') goto L42;
        r20.delete(r113, r26 + 2);
    L42:
        r26 = r26 + 1;
        goto L36
    L44:
        if (r20.length() > 0) goto L46;
    L48:
        int r27 = 0;
    L50:
        if (r27 >= (r20.length() - 1)) goto L58;
        if (r20.charAt(r27) != ' ') goto L56;
        int r114 = r27 + 1;
        if (r20.charAt(r114) != '\n') goto L56;
        r20.delete(r27, r114);
    L56:
        r27 = r27 + 1;
        goto L50
    L58:
        if (r20.length() <= 0) goto L62;
        if (r20.charAt(r20.length() - 1) != '\n') goto L62;
        r20.delete(r20.length() - 1, r20.length());
    L62:
        float r28 = r17.c;
        int r29 = r17.d;
        r18.e = r28;
        r18.f = r29;
        r18.g = r17.e;
        r18.h = r17.b;
        r18.l = r17.f;
        float r30 = r17.i;
        int r32 = r17.h;
        r18.k = r30;
        r18.j = r32;
        r18.p = r17.j;
        r3.add(r18.a());
        goto L10
    L46:
        if (r20.charAt(r20.length() - 1) != ' ') goto L48;
        r20.delete(r20.length() - 1, r20.length());
        goto L48
    L32:
        if (r20.charAt(0) != ' ') goto L34;
        r20.delete(0, 1);
        goto L34
    L63:
        return r3;
    }

    @Override // defpackage.qn4
    public int n() {
        return ((long[]) this.o).length;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        ((lm3) this.q).g();
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r6, Response r7) {
        lm3 r8 = (lm3) this.q;
        String r0 = (String) this.n;
        mm3 r1 = (mm3) this.r;
        if (mm3.f(r7) == false) goto L13;
        new Thread(new qo2(r1, r0, (String) this.o, 8)).start();
        ArrayList<String> r5 = (ArrayList) this.p;
        if (r5 != null) goto L7;
    L11:
        r1.g();
        r8.onSuccess();
        return;
    L7:
        if (r5.isEmpty() == true) goto L11;
        rm3 r2 = App.f(false).g();
        r2.getClass();
        Log.d("BrowsingClient", "createPlaylist()");
        ((qm3) r2.o).a(((pn4) r2.n).f(), r0, null, r5).enqueue(new hd5(r1, r8, false, 17));
        return;
    L13:
        r8.g();
    }

    public /* synthetic */ z40(ConstraintLayout r1, View r2, View r3, View r4, TextView r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    public z40(Map r2) {
        r2.getClass();
        this.n = new LinkedHashMap(r2);
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.r = new cs0(4, this);
    }

    public z40(bq4 r7, Context r8) {
        Context r1 = r8.getApplicationContext();
        r1.getClass();
        sr r0 = new sr(r1, r7, 0);
        Context r2 = r8.getApplicationContext();
        r2.getClass();
        sr r3 = new sr(r2, r7, 1);
        Context r4 = r8.getApplicationContext();
        r4.getClass();
        String r5 = s53.a;
        r53 r6 = new r53(r7, r4);
        Context r9 = r8.getApplicationContext();
        r9.getClass();
        sr r10 = new sr(r9, r7, 2);
        this.n = r8;
        this.o = r0;
        this.p = r3;
        this.q = r6;
        this.r = r10;
    }

    public z40() {
        this.n = new Object();
        this.p = new fl(0);
        this.q = new q03();
        this.r = new q03();
    }

    public z40(Layout r6) {
        this.n = r6;
        ArrayList r7 = new ArrayList();
        int r0 = 0;
        int r1 = 0;
    L3:
        int r2 = qm4.r0(((Layout) this.n).getText(), '\n', r1, 4);
        if (r2 >= 0) goto L6;
        r1 = ((Layout) this.n).getText().length();
    L7:
        r7.add(Integer.valueOf(r1));
        if (r1 < ((Layout) this.n).getText().length()) goto L3;
        this.p = r7;
        int r8 = r7.size();
        ArrayList r3 = new ArrayList(r8);
    L10:
        if (r0 >= r8) goto L12;
        r3.add(null);
        r0 = r0 + 1;
        goto L10
    L12:
        this.o = r3;
        this.q = new boolean[((ArrayList) this.p).size()];
        ((ArrayList) this.p).size();
        return;
    L6:
        r1 = r2 + 1;
        goto L7
    }

    public z40(uy4 r3, HashMap r4, HashMap r5, HashMap r6) {
        this.n = r3;
        this.q = r5;
        this.r = r6;
        this.p = Collections.unmodifiableMap(r4);
        TreeSet r7 = new TreeSet();
        int r8 = 0;
        r3.d(r7, false);
        long[] r9 = new long[r7.size()];
        Iterator r10 = r7.iterator();
    L4:
        if (r10.hasNext() == false) goto L6;
        long r0 = ((Long) r10.next()).longValue();
        r9[r8] = r0;
        r8 = r8 + 1;
        goto L4
    L6:
        this.o = r9;
    }

    public /* synthetic */ z40(ViewGroup r1, View r2, TextView r3, View r4, ViewGroup r5, View r6) {
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
        this.r = r6;
    }

    public z40(mm3 r1, String r2, String r3, ArrayList r4, lm3 r5) {
        this.r = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }
}
