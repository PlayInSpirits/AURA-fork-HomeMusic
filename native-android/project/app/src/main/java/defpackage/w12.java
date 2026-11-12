package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public w12(i41 r4, d41 r5, vp4 r6, int r7, int r8, int r9, int r10) {
        this.a = 3;
        this.b = r4;
        this.d = r5;
        this.e = r6;
        this.f = new zt4();
        this.g = r6.a(r4.u, new gt0(4, this));
        this.h = new zm4(this, r7);
        this.i = new an4(this, r8);
        this.j = new bn4(this, r9);
        this.k = new cn4(this, r10);
        j52 r11 = new j52(3, this);
        this.c = r11;
        r4.n.a(r11);
    }

    public static final void a(w12 r1, cx2 r2, f63 r3) {
        cx2 r4 = r2.r;
    L3:
        if (r4 == null) goto L16;
        if (r4 == ((b63) r1.c)) goto L6;
        if ((r4.p & 2) != 0) goto L20;
        r4.p0(r3);
        r4 = r4.r;
        goto L3
    L20:
        return;
    L6:
        c72 r5 = ((c72) r1.b).t();
        if (r5 == null) goto L9;
        iz1 r6 = (iz1) r5.Q.d;
    L10:
        r3.J = r6;
        r1.e = r3;
        return;
    L9:
        r6 = null;
        goto L10
    }

    public static cx2 b(bx2 r4, cx2 r5) {
        if ((r4 instanceof gx2) == false) goto L5;
        cx2 r6 = ((gx2) r4).d();
        r6.p = g63.e(r6);
    L14:
        if (r6.A == false) goto L16;
        cz1.b("A ModifierNodeElement cannot return an already attached node from create() ");
    L16:
        r6.v = true;
        cx2 r0 = r5.s;
        if (r0 == null) goto L19;
        r0.r = r6;
        r6.s = r0;
    L19:
        r5.s = r6;
        r6.r = r5;
        return r6;
    L5:
        xo r1 = new xo();
        p03 r2 = g63.a;
        if ((r4 instanceof zh) == false) goto L8;
        int r3 = 9;
    L10:
        if ((r4 instanceof zu) == false) goto L12;
        r3 = r3 | 524288;
    L12:
        r1.p = r3;
        r1.B = r4;
        new HashSet();
        r6 = r1;
        goto L14
    L8:
        r3 = 1;
        goto L10
    }

    public static cx2 c(cx2 r3) {
        boolean r0 = r3.A;
        if (r0 == false) goto L8;
        p03 r1 = g63.a;
        if (r0 == true) goto L7;
        cz1.b("autoInvalidateRemovedNode called on unattached node");
    L7:
        g63.a(r3, -1, 2);
        r3.n0();
        r3.h0();
    L8:
        cx2 r2 = r3.s;
        cx2 r4 = r3.r;
        if (r2 == null) goto L11;
        r2.r = r4;
        r3.s = null;
    L11:
        if (r4 == null) goto L13;
        r4.s = r2;
        r3.r = null;
    L13:
        r4.getClass();
        return r4;
    }

    public static void h(bx2 r2, bx2 r3, cx2 r4) {
        if ((r2 instanceof gx2) == false) goto L13;
        if ((r3 instanceof gx2) == false) goto L13;
        r4.getClass();
        ((gx2) r3).e(r4);
        if (r4.A == false) goto L10;
        g63.c(r4);
        return;
    L10:
        r4.w = true;
        return;
    L13:
        if ((r4 instanceof xo) == false) goto L37;
        xo r5 = (xo) r4;
        boolean r1 = r5.A;
        if (r1 == false) goto L21;
        if (r1 == true) goto L19;
        cz1.b("unInitializeModifier called on unattached node");
    L19:
        if ((r5.p & 8) == 0) goto L21;
        ((ra) j51.P(r5)).w();
    L21:
        r5.B = r3;
        p03 r6 = g63.a;
        if ((r3 instanceof zh) == false) goto L24;
        int r7 = 9;
    L26:
        if ((r3 instanceof zu) == false) goto L28;
        r7 = r7 | 524288;
    L28:
        r5.p = r7;
        if (r5.A == false) goto L32;
        r5.q0(false);
    L32:
        if (r4.A == false) goto L35;
        g63.c(r4);
        return;
    L35:
        r4.w = true;
        return;
    L24:
        r7 = 1;
        goto L26
    L37:
        cz1.b("Unknown Modifier.Node type");
    }

    public boolean d(int r1) {
        if ((((cx2) this.g).q & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void e() {
        cx2 r2 = (cx2) this.g;
    L3:
        if (r2 == null) goto L14;
        r2.m0();
        if (r2.v == false) goto L11;
        p03 r0 = g63.a;
        if (r2.A == true) goto L9;
        cz1.b("autoInvalidateInsertedNode called on unattached node");
    L9:
        g63.a(r2, -1, 1);
    L11:
        if (r2.w == false) goto L13;
        g63.c(r2);
    L13:
        r2.v = false;
        r2.w = false;
        r2 = r2.s;
        goto L3
    }

    public void f(int r32, q03 r33, q03 r34, cx2 r35, boolean r36) {
        yk r0 = (yk) this.k;
        if (r0 != null) goto L5;
        int r3 = r32;
        q03 r4 = r33;
        q03 r5 = r34;
        r0 = new yk(this, r35, r3, r4, r5, r36);
        this.k = r0;
    L6:
        w12 r2 = (w12) r0.t;
        this.k = null;
        int r6 = r4.b - r3;
        int r7 = r5.b - r3;
        char r8 = 2;
        int r9 = ((r6 + r7) + 1) / 2;
        o02 r10 = new o02(r9 * 3);
        o02 r11 = new o02(r9 * 4);
        int r12 = 0;
        r11.e(0, r6, 0, r7);
        int r13 = (r9 * 2) + 1;
        int[] r14 = new int[r13];
        int[] r15 = new int[r13];
        int[] r16 = new int[5];
    L7:
        int r17 = r11.b;
        if (r17 == 0) goto L121;
        char r37 = r8;
        int[] r18 = r11.a;
        int r38 = r12;
        int r19 = r17 - 1;
        r11.b = r19;
        int r110 = r18[r19];
        int r111 = r17 - 2;
        r11.b = r111;
        int r112 = r18[r111];
        int r20 = r17 - 3;
        r11.b = r20;
        int r21 = r18[r20];
        int r113 = r17 - 4;
        r11.b = r113;
        int r22 = r18[r113];
        int r114 = r21 - r22;
        int r39 = r13;
        int r23 = r110 - r112;
        int[] r115 = r14;
        if (r114 < 1) goto L120;
        if (r23 < 1) goto L120;
        int r310 = 1;
        int r116 = ((r114 + r23) + 1) / 2;
        int r117 = r39 / 2;
        int r118 = r117 + 1;
        r115[r118] = r22;
        r15[r118] = r21;
        int r24 = r38;
    L14:
        if (r24 >= r116) goto L120;
        int r119 = r114 - r23;
        int r25 = r116;
        int[] r26 = r15;
        if ((Math.abs(r119) & 1) != r310) goto L18;
        int r120 = 1;
    L19:
        int r121 = -r24;
        int r27 = r120;
        int r122 = r121;
    L21:
        if (r122 > r24) goto L55;
        if (r122 == r121) goto L29;
        if (r122 == r24) goto L27;
        int r28 = r122;
        int[] r29 = r16;
        if (r115[(r122 + 1) + r117] > r115[(r28 - 1) + r117]) goto L30;
    L28:
        int r123 = r115[(r28 - 1) + r117];
        int r124 = r123 + 1;
    L31:
        int r210 = ((r124 - r22) + r112) - r28;
        if (r24 == 0) goto L34;
        int r211 = 1;
    L35:
        if (r124 != r123) goto L37;
        int r212 = 1;
    L38:
        int r213 = r210 - (r211 & r212);
        int r214 = r123;
        int r125 = r210;
    L39:
        if (r124 >= r21) goto L44;
        if (r125 >= r110) goto L44;
        if (r0.d(r124, r125) == false) goto L44;
        r124 = r124 + 1;
        r125 = r125 + 1;
    L44:
        r115[r117 + r28] = r124;
        if (r27 == 0) goto L53;
        int r215 = r125;
        int r126 = r119 - r28;
        int r216 = r114;
        if (r126 < (r121 + 1)) goto L54;
        if (r126 > (r24 - 1)) goto L54;
        if (r26[r117 + r126] > r124) goto L54;
        r29[r38] = r214;
        r29[1] = r213;
        r29[r37] = r124;
        r29[3] = r215;
        r29[4] = r38;
        char r127 = 1;
    L93:
        if (Math.min(r29[r37] - r29[r38], r29[3] - r29[r127]) <= 0) goto L115;
        int r30 = r29[r38];
        int r128 = r29[r127];
        int r129 = r29[3] - r128;
        int r130 = r29[r37] - r30;
        if (r129 == r130) goto L113;
        r130 = Math.min(r130, r129);
        int r131 = r29[4];
        if (r131 == 0) goto L99;
        int r132 = 1;
    L100:
        int r133 = r29[3];
        char r134 = 1;
        int r135 = r29[1];
        int r31 = r133 - r135;
        int r217 = r29[r37];
        int r218 = r29[r38];
        if (r31 <= (r217 - r218)) goto L103;
        int r40 = 1;
    L104:
        int r41 = r30 + ((r40 | r132) ^ 1);
        if (r131 == 0) goto L107;
        int r136 = 1;
    L109:
        if ((r133 - r135) <= (r217 - r218)) goto L111;
        int r42 = 1;
    L112:
        r128 = r128 + (((r42 ^ 1) | r136) ^ 1);
        r30 = r41;
    L114:
        r10.d(r30, r128, r130);
    L116:
        r11.e(r22, r29[r38], r112, r29[r134]);
        r11.e(r29[r37], r21, r29[3], r110);
    L117:
        r8 = r37;
        r12 = r38;
        r13 = r39;
        r14 = r115;
        r15 = r26;
        r16 = r29;
        goto L7
    L111:
        r42 = r38;
        goto L112
    L107:
        r136 = r38;
        goto L109
    L103:
        r40 = r38;
        goto L104
    L99:
        r132 = r38;
        goto L100
    L113:
        r134 = 1;
        goto L114
    L115:
        r134 = r127;
    L54:
        r122 = r28 + 2;
        r16 = r29;
        r114 = r216;
        goto L21
    L53:
        r216 = r114;
        goto L54
    L37:
        r212 = r38;
        goto L38
    L34:
        r211 = r38;
    L30:
        r123 = r115[(r28 + 1) + r117];
        r124 = r123;
        goto L31
    L27:
        r28 = r122;
        r29 = r16;
        goto L28
    L29:
        r28 = r122;
        r29 = r16;
        goto L30
    L55:
        r29 = r16;
        int r219 = r114;
        if ((r119 & 1) != 0) goto L58;
        int r137 = 1;
    L59:
        int r138 = r121;
    L60:
        if (r138 > r24) goto L119;
        if (r138 == r121) goto L68;
        if (r138 == r24) goto L66;
        int r220 = r137;
        if (r26[(r138 + 1) + r117] < r26[(r138 - 1) + r117]) goto L69;
    L67:
        int r139 = r26[(r138 - 1) + r117];
        int r140 = r139 - 1;
    L70:
        int r221 = r110 - ((r21 - r140) - r138);
        if (r24 == 0) goto L73;
        int r222 = 1;
    L74:
        if (r140 != r139) goto L76;
        int r223 = 1;
    L77:
        int r224 = r221 + (r222 & r223);
        int r225 = r139;
        int r141 = r221;
    L78:
        if (r140 <= r22) goto L83;
        if (r141 <= r112) goto L83;
        int r226 = r141;
        int r227 = r138;
        if (r0.d(r140 - 1, r226 - 1) == false) goto L84;
        r140 = r140 - 1;
        r141 = r226 - 1;
        r138 = r227;
    L84:
        r26[r117 + r227] = r140;
        if (r220 == 0) goto L118;
        int r142 = r119 - r227;
        if (r142 < r121) goto L118;
        if (r142 > r24) goto L118;
        if (r115[r117 + r142] < r140) goto L118;
        r29[r38] = r140;
        r127 = 1;
        r29[1] = r226;
        r29[r37] = r225;
        r29[3] = r224;
        r29[4] = 1;
    L118:
        r138 = r227 + 2;
        r137 = r220;
    L83:
        r226 = r141;
        r227 = r138;
        goto L84
    L76:
        r223 = r38;
        goto L77
    L73:
        r222 = r38;
    L69:
        r139 = r26[(r138 + 1) + r117];
        r140 = r139;
        goto L70
    L66:
        r220 = r137;
        goto L67
    L68:
        r220 = r137;
        goto L69
    L119:
        r24 = r24 + 1;
        r15 = r26;
        r116 = r25;
        r16 = r29;
        r114 = r219;
        r310 = 1;
        goto L14
    L58:
        r137 = r38;
        goto L59
    L18:
        r120 = r38;
    L120:
        r26 = r15;
        r29 = r16;
        goto L117
    L121:
        int r311 = r12;
        int r43 = r10.b;
        if ((r43 % 3) == 0) goto L125;
        cz1.b("Array size not a multiple of 3");
    L125:
        if (r43 <= 3) goto L127;
        int r44 = r311;
        r10.f(r44, r43 - 3);
    L128:
        r10.d(r6, r7, r44);
        int r45 = r44;
        int r46 = r45;
        int r47 = r46;
    L130:
        if (r45 >= r10.b) goto L160;
        int[] r48 = r10.a;
        int r49 = r48[r45];
        int r143 = r48[r45 + 2];
        int r50 = r49 - r143;
        int r51 = r48[r45 + 1] - r143;
        r45 = r45 + 3;
    L132:
        if (r46 >= r50) goto L140;
        cx2 r144 = ((cx2) r0.q).s;
        r144.getClass();
        if ((r144.p & 2) == 0) goto L139;
        f63 r145 = r144.u;
        r145.getClass();
        f63 r146 = r145.J;
        f63 r147 = r145.I;
        r147.getClass();
        if (r146 == null) goto L138;
        r146.I = r147;
    L138:
        r147.J = r146;
        a(r2, (cx2) r0.q, r147);
    L139:
        r0.q = c(r144);
        r46 = r46 + 1;
    L140:
        if (r47 >= r51) goto L154;
        int r52 = r0.o + r47;
        cx2 r53 = b((bx2) ((q03) r0.s).f(r52), (cx2) r0.q);
        r0.q = r53;
        if (r0.p == false) goto L151;
        cx2 r54 = r53.s;
        r54.getClass();
        f63 r55 = r54.u;
        r55.getClass();
        u62 r148 = j51.j((cx2) r0.q);
        if (r148 == null) goto L146;
        w62 r149 = new w62((c72) r2.b, r148);
        ((cx2) r0.q).p0(r149);
        a(r2, (cx2) r0.q, r149);
        r149.J = r55.J;
        r149.I = r55;
        r55.J = r149;
    L147:
        ((cx2) r0.q).g0();
        ((cx2) r0.q).m0();
        cx2 r56 = (cx2) r0.q;
        p03 r150 = g63.a;
        if (r56.A == true) goto L150;
        cz1.b("autoInvalidateInsertedNode called on unattached node");
    L150:
        g63.a(r56, -1, 1);
    L152:
        r47 = r47 + 1;
        goto L140
    L146:
        ((cx2) r0.q).p0(r55);
        goto L147
    L151:
        r53.v = true;
    L154:
        int r57 = r143 - 1;
        if (r143 <= 0) goto L130;
        cx2 r58 = ((cx2) r0.q).s;
        r58.getClass();
        r0.q = r58;
        bx2 r59 = (bx2) ((q03) r0.r).f(r0.o + r46);
        bx2 r151 = (bx2) ((q03) r0.s).f(r0.o + r47);
        if (h12.c(r59, r151) == true) goto L159;
        h(r59, r151, (cx2) r0.q);
    L159:
        r46 = r46 + 1;
        r47 = r47 + 1;
        r143 = r57;
        goto L154
    L160:
        this.k = r0;
        cx2 r1 = ((sq4) this.f).r;
        int r152 = r44;
    L161:
        if (r1 == null) goto L165;
        if (r1 == ((b63) this.c)) goto L200;
        r152 = r152 | r1.p;
        r1.q = r152;
        r1 = r1.r;
        goto L161
    L200:
        return;
    L165:
        return;
    L127:
        r44 = r311;
        goto L128
    L5:
        r3 = r32;
        r4 = r33;
        r5 = r34;
        r0.q = r35;
        r0.o = r3;
        r0.r = r4;
        r0.s = r5;
        r0.p = r36;
        goto L6
    }

    public void g() {
        c72 r0 = (c72) this.b;
        f63 r1 = (iz1) this.d;
        cx2 r2 = ((sq4) this.f).r;
    L3:
        if (r2 == null) goto L17;
        u62 r3 = j51.j(r2);
        if (r3 == null) goto L15;
        f63 r4 = r2.u;
        if (r4 == null) goto L13;
        w62 r5 = (w62) r4;
        u62 r6 = r5.n0;
        r5.b1(r3);
        if (r6 == r2) goto L14;
        tb3 r7 = r5.g0;
        if (r7 == null) goto L14;
        ((vj1) r7).c();
    L14:
        r1.J = r5;
        r5.I = r1;
        r1 = r5;
    L16:
        r2 = r2.r;
        goto L3
    L13:
        r5 = new w62(r0, r3);
        r2.p0(r5);
        goto L14
    L15:
        r2.p0(r1);
        goto L16
    L17:
        c72 r8 = r0.t();
        if (r8 == null) goto L20;
        iz1 r9 = (iz1) r8.Q.d;
    L21:
        r1.J = r9;
        this.e = r1;
        return;
    L20:
        r9 = null;
        goto L21
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder("[");
        cx2 r1 = (cx2) this.g;
        sq4 r4 = (sq4) this.f;
        if (r1 != r4) goto L9;
        r0.append("]");
    L16:
        return r0.toString();
    L9:
        if (r1 == null) goto L16;
        if (r1 == r4) goto L16;
        r0.append(String.valueOf(r1));
        if (r1.s == r4) goto L13;
        r0.append(",");
        r1 = r1.s;
        goto L9
    L13:
        r0.append("]");
        goto L16
    L5:
        return super.toString();
    }

    public w12(ConstraintLayout r2, ImageView r3, TextView r4, Button r5, Button r6, Button r7, TextView r8, TextView r9, TextView r10, View r11) {
        this.a = 0;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.h = r5;
        this.i = r6;
        this.j = r7;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.k = r11;
    }

    public w12(LinearLayout r2, MaterialButton r3, TextInputEditText r4, TextInputLayout r5, ListView r6, TextView r7, ProgressBar r8, RecyclerView r9, MaterialButton r10, TextInputEditText r11) {
        this.a = 2;
        this.b = r2;
        this.c = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.d = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
    }

    public w12(c72 r3) {
        this.a = 1;
        this.b = r3;
        b63 r0 = new b63();
        r0.q = -1;
        this.c = r0;
        iz1 r1 = new iz1(r3);
        this.d = r1;
        this.e = r1;
        sq4 r4 = r1.n0;
        this.f = r4;
        this.g = r4;
        this.h = new q03();
    }
}
