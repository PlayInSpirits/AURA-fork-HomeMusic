package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import app.homemusic.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv4 implements zn4 {
    public static final byte[] u = null;
    public static final byte[] v = null;
    public static final byte[] w = null;
    public final Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;

    static {
        u = new byte[]{0, 7, 8, 15};
        v = new byte[]{0, 119, -120, -1};
        w = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public lv4(List r11) {
        be3 r0 = new be3((byte[]) r11.get(0));
        int r12 = r0.H();
        int r1 = r0.H();
        Paint r2 = new Paint();
        this.n = r2;
        r2.setStyle(Paint.Style.FILL_AND_STROKE);
        r2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        r2.setPathEffect(null);
        Paint r3 = new Paint();
        this.o = r3;
        r3.setStyle(Paint.Style.FILL);
        r3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        r3.setPathEffect(null);
        this.p = new Canvas();
        this.q = new qx0(719, 575, 0, 719, 0, 575);
        this.r = new px0(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.s = new vx0(r12, r1);
    }

    public static byte[] a(int r3, int r4, h00 r5) {
        byte[] r0 = new byte[r3];
        int r1 = 0;
    L3:
        if (r1 >= r3) goto L5;
        r0[r1] = (byte) r5.i(r4);
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    public static int[] d() {
        int[] r1 = new int[16];
        r1[0] = 0;
        int r3 = 1;
    L3:
        if (r3 >= 16) goto L33;
        if (r3 < 8) goto L7;
        int r6 = 127;
        if ((r3 & 1) == 0) goto L22;
        int r4 = 127;
    L24:
        if ((r3 & 2) == 0) goto L26;
        int r7 = 127;
    L28:
        if ((r3 & 4) != 0) goto L31;
        r6 = 0;
    L31:
        r1[r3] = f(255, r4, r7, r6);
    L32:
        r3 = r3 + 1;
        goto L3
    L26:
        r7 = 0;
        goto L28
    L22:
        r4 = 0;
        goto L24
    L7:
        if ((r3 & 1) == 0) goto L9;
        int r5 = 255;
    L11:
        if ((r3 & 2) == 0) goto L13;
        int r8 = 255;
    L15:
        if ((r3 & 4) == 0) goto L17;
        int r9 = 255;
    L18:
        r1[r3] = f(255, r5, r8, r9);
        goto L32
    L17:
        r9 = 0;
        goto L18
    L13:
        r8 = 0;
        goto L15
    L9:
        r5 = 0;
        goto L11
    L33:
        return r1;
    }

    public static int[] e() {
        int[] r1 = new int[256];
        r1[0] = 0;
        int r3 = 0;
    L3:
        if (r3 >= 256) goto L129;
        int r5 = 255;
        if (r3 < 8) goto L7;
        int r6 = r3 & 136;
        int r7 = 170;
        int r8 = 85;
        if (r6 == 0) goto L104;
        if (r6 == 8) goto L79;
        int r9 = 43;
        if (r6 == 128) goto L54;
        if (r6 != 136) goto L128;
        if ((r3 & 1) == 0) goto L31;
        int r4 = 43;
    L33:
        if ((r3 & 16) == 0) goto L35;
        int r10 = 85;
    L36:
        int r11 = r4 + r10;
        if ((r3 & 2) == 0) goto L39;
        int r12 = 43;
    L41:
        if ((r3 & 32) == 0) goto L43;
        int r13 = 85;
    L44:
        int r14 = r12 + r13;
        if ((r3 & 4) != 0) goto L49;
        r9 = 0;
    L49:
        if ((r3 & 64) != 0) goto L52;
        r8 = 0;
    L52:
        r1[r3] = f(255, r11, r14, r9 + r8);
        goto L128
    L43:
        r13 = 0;
        goto L44
    L39:
        r12 = 0;
        goto L41
    L35:
        r10 = 0;
        goto L36
    L31:
        r4 = 0;
    L128:
        r3 = r3 + 1;
        goto L3
    L54:
        if ((r3 & 1) == 0) goto L56;
        int r15 = 43;
    L57:
        int r16 = r15 + 127;
        if ((r3 & 16) == 0) goto L60;
        int r17 = 85;
    L61:
        int r18 = r16 + r17;
        if ((r3 & 2) == 0) goto L64;
        int r19 = 43;
    L65:
        int r20 = r19 + 127;
        if ((r3 & 32) == 0) goto L68;
        int r110 = 85;
    L69:
        int r21 = r20 + r110;
        if ((r3 & 4) != 0) goto L73;
        r9 = 0;
    L73:
        int r22 = r9 + 127;
        if ((r3 & 64) != 0) goto L77;
        r8 = 0;
    L77:
        r1[r3] = f(255, r18, r21, r22 + r8);
        goto L128
    L68:
        r110 = 0;
        goto L69
    L64:
        r19 = 0;
        goto L65
    L60:
        r17 = 0;
        goto L61
    L56:
        r15 = 0;
        goto L57
    L79:
        if ((r3 & 1) == 0) goto L81;
        int r23 = 85;
    L83:
        if ((r3 & 16) == 0) goto L85;
        int r24 = 170;
    L86:
        int r25 = r23 + r24;
        if ((r3 & 2) == 0) goto L89;
        int r26 = 85;
    L91:
        if ((r3 & 32) == 0) goto L93;
        int r27 = 170;
    L94:
        int r28 = r26 + r27;
        if ((r3 & 4) != 0) goto L99;
        r8 = 0;
    L99:
        if ((r3 & 64) != 0) goto L102;
        r7 = 0;
    L102:
        r1[r3] = f(127, r25, r28, r8 + r7);
        goto L128
    L93:
        r27 = 0;
        goto L94
    L89:
        r26 = 0;
        goto L91
    L85:
        r24 = 0;
        goto L86
    L81:
        r23 = 0;
        goto L83
    L104:
        if ((r3 & 1) == 0) goto L106;
        int r29 = 85;
    L108:
        if ((r3 & 16) == 0) goto L110;
        int r30 = 170;
    L111:
        int r31 = r29 + r30;
        if ((r3 & 2) == 0) goto L114;
        int r32 = 85;
    L116:
        if ((r3 & 32) == 0) goto L118;
        int r33 = 170;
    L119:
        int r34 = r32 + r33;
        if ((r3 & 4) != 0) goto L124;
        r8 = 0;
    L124:
        if ((r3 & 64) != 0) goto L127;
        r7 = 0;
    L127:
        r1[r3] = f(255, r31, r34, r8 + r7);
        goto L128
    L118:
        r33 = 0;
        goto L119
    L114:
        r32 = 0;
        goto L116
    L110:
        r30 = 0;
        goto L111
    L106:
        r29 = 0;
        goto L108
    L7:
        if ((r3 & 1) == 0) goto L9;
        int r35 = 255;
    L11:
        if ((r3 & 2) == 0) goto L13;
        int r36 = 255;
    L15:
        if ((r3 & 4) != 0) goto L18;
        r5 = 0;
    L18:
        r1[r3] = f(63, r35, r36, r5);
        goto L128
    L13:
        r36 = 0;
        goto L15
    L9:
        r35 = 0;
        goto L11
    L129:
        return r1;
    }

    public static int f(int r0, int r1, int r2, int r3) {
        return (((r0 << 24) | (r1 << 16)) | (r2 << 8)) | r3;
    }

    public static void g(byte[] r21, int[] r22, int r23, int r24, int r25, Paint r26, Canvas r27) {
        h00 r8 = new h00(r21.length, r21);
        int r2 = r24;
        int r9 = r25;
        byte[] r10 = null;
        byte[] r11 = null;
        byte[] r12 = null;
    L4:
        if (r8.b() == 0) goto L122;
        int r13 = 8;
        int r3 = r8.i(8);
        if (r3 == 240) goto L120;
        int r4 = 3;
        int r5 = 2;
        int r6 = 4;
        switch(r3) {
            case 16: goto L77;
            case 17: goto L33;
            case 18: goto L14;
            default: goto L9;
        };
    L9:
        switch(r3) {
            case 32: goto L13;
            case 33: goto L12;
            case 34: goto L11;
            default: goto L4;
        };
    L11:
        r11 = a(16, 8, r8);
        goto L4
    L12:
        r10 = a(4, 8, r8);
        goto L4
    L13:
        r12 = a(4, 4, r8);
        goto L4
    L14:
        boolean r7 = false;
    L15:
        int r14 = r8.i(8);
        if (r14 == 0) goto L19;
        boolean r16 = r7;
        int r17 = 1;
    L25:
        if (r17 == 0) goto L29;
        if (r26 == 0) goto L29;
        r26.setColor(r22[r14]);
        r27.drawRect(r2, r9, r2 + r17, r9 + 1, r26);
    L29:
        r2 = r2 + r17;
        if (r16 == true) goto L4;
        r7 = r16;
        goto L15
    L19:
        if (r8.h() == true) goto L24;
        int r15 = r8.i(7);
        if (r15 == 0) goto L23;
        r16 = r7;
        r17 = r15;
        r14 = 0;
        goto L25
    L23:
        r16 = true;
        r14 = 0;
        r17 = 0;
        goto L25
    L24:
        r16 = r7;
        r17 = r8.i(7);
        r14 = r8.i(8);
        goto L25
    L33:
        if (r23 != 3) goto L38;
        if (r11 != null) goto L36;
        byte[] r18 = w;
    L37:
        byte[] r19 = r18;
    L39:
        boolean r20 = false;
    L40:
        int r110 = r8.i(r6);
        if (r110 == 0) goto L44;
        boolean r0 = r20;
        int r111 = r110;
        int r112 = 1;
    L66:
        if (r112 == 0) goto L71;
        if (r26 == 0) goto L71;
        if (r19 == 0) goto L70;
        r111 = r19[r111];
    L70:
        r26.setColor(r22[r111]);
        int r113 = r4;
        int r114 = 2;
        r27.drawRect(r2, r9, r2 + r112, r9 + 1, r26);
    L72:
        r2 = r2 + r112;
        if (r0 == true) goto L74;
        r20 = r0;
        r4 = r113;
        r5 = r114;
        r6 = 4;
        r13 = 8;
        goto L40
    L74:
        r8.c();
    L71:
        r113 = r4;
        r114 = r5;
        goto L72
    L44:
        if (r8.h() == true) goto L52;
        int r115 = r8.i(r4);
        if (r115 == 0) goto L49;
        r112 = r115 + 2;
        r0 = r20;
    L48:
        r111 = 0;
        goto L66
    L49:
        r0 = true;
    L50:
        r112 = 0;
        goto L48
    L52:
        if (r8.h() == true) goto L55;
        r112 = r8.i(r5) + 4;
        r111 = r8.i(r6);
    L54:
        r0 = r20;
        goto L66
    L55:
        int r1 = r8.i(r5);
        if (r1 == 0) goto L65;
        if (r1 == 1) goto L64;
        if (r1 == r5) goto L63;
        if (r1 == r4) goto L61;
        r0 = r20;
        goto L50
    L61:
        r112 = r8.i(r13) + 25;
        int r28 = r8.i(r6);
    L62:
        r111 = r28;
        goto L54
    L63:
        r112 = r8.i(r6) + 9;
        r28 = r8.i(r6);
        goto L62
    L64:
        r0 = r20;
        r112 = r5;
        goto L48
    L65:
        r0 = r20;
        r112 = 1;
        goto L48
    L36:
        r18 = r11;
        goto L37
    L38:
        r19 = null;
        goto L39
    L77:
        if (r23 != 3) goto L81;
        if (r10 != null) goto L80;
        byte[] r29 = v;
    L86:
        boolean r30 = false;
    L87:
        int r31 = r8.i(2);
        if (r31 == 0) goto L93;
        int r32 = r31;
        int r116 = 1;
    L90:
        char r33 = '\b';
    L91:
        char r34 = 4;
    L110:
        if (r116 == 0) goto L116;
        if (r26 == null) goto L116;
        if (r29 == 0) goto L114;
        r32 = r29[r32];
    L114:
        r26.setColor(r22[r32]);
        r27.drawRect(r2, r9, r2 + r116, r9 + 1, r26);
    L116:
        r2 = r2 + r116;
        if (r30 == true) goto L118;
        r26 = r26;
        r30 = r30;
        goto L87
    L118:
        r8.c();
        goto L4
    L93:
        if (r8.h() == false) goto L96;
        int r35 = r8.i(3) + 3;
        r32 = r8.i(2);
        r116 = r35;
        goto L90
    L96:
        if (r8.h() == false) goto L99;
        r116 = 1;
        r33 = '\b';
        r34 = 4;
    L98:
        r32 = 0;
        goto L110
    L99:
        int r36 = r8.i(2);
        if (r36 == 0) goto L109;
        if (r36 == 1) goto L108;
        if (r36 == 2) goto L107;
        if (r36 == 3) goto L106;
        r30 = r30;
        r33 = '\b';
        r34 = 4;
    L105:
        r32 = 0;
        r116 = 0;
        goto L110
    L106:
        r33 = '\b';
        int r37 = r8.i(8) + 29;
        r32 = r8.i(2);
        r30 = r30;
        r116 = r37;
        goto L91
    L107:
        r33 = '\b';
        r34 = 4;
        r116 = r8.i(4) + 12;
        r32 = r8.i(2);
        r30 = r30;
        goto L110
    L108:
        r33 = '\b';
        r34 = 4;
        r116 = 2;
        goto L98
    L109:
        r33 = '\b';
        r34 = 4;
        r30 = true;
        goto L105
    L80:
        r29 = r10;
        goto L86
    L81:
        if (r23 != 2) goto L85;
        if (r12 != null) goto L84;
        r29 = u;
        goto L86
    L84:
        r29 = r12;
        goto L86
    L85:
        r29 = null;
        goto L86
    L120:
        r9 = r9 + 2;
        r2 = r24;
        goto L4
    }

    public static px0 h(h00 r24, int r25) {
        int r1 = 8;
        int r2 = r24.i(8);
        r24.t(8);
        int r3 = 2;
        int r4 = r25 - 2;
        int r7 = 0;
        int[] r5 = {0, -1, -16777216, -8421505};
        int[] r6 = d();
        int[] r8 = e();
    L3:
        if (r4 <= 0) goto L20;
        int r9 = r24.i(r1);
        int r10 = r24.i(r1);
        if ((r10 & 128) == 0) goto L8;
        int[] r11 = r5;
    L12:
        if ((r10 & 1) == 0) goto L14;
        int r12 = r24.i(r1);
        int r13 = r24.i(r1);
        int r14 = r24.i(r1);
        int r15 = r24.i(r1);
        int r16 = r4 - 6;
    L16:
        if (r12 != 0) goto L18;
        r13 = r7;
        r14 = r13;
        r15 = 255;
    L18:
        double r17 = r12;
        int r18 = r2;
        double r19 = r13 - 128;
        double r20 = r14 - 128;
        r11[r9] = f((byte) (255 - (r15 & 255)), f35.j((int) ((1.402d * r19) + r17), 0, 255), f35.j((int) ((r17 - (0.34414d * r20)) - (r19 * 0.71414d)), 0, 255), f35.j((int) ((r20 * 1.772d) + r17), 0, 255));
        r4 = r16;
        r7 = 0;
        r2 = r18;
        r8 = r8;
        r1 = 8;
        r3 = 2;
        goto L3
    L14:
        int r110 = r24.i(6) << r3;
        int r111 = r24.i(4) << 4;
        r14 = r24.i(4) << 4;
        r16 = r4 - 4;
        r15 = r24.i(r3) << 6;
        r12 = r110;
        r13 = r111;
        goto L16
    L8:
        if ((r10 & 64) == 0) goto L10;
        r11 = r6;
        goto L12
    L10:
        r11 = r8;
        goto L12
    L20:
        return new px0(r2, r5, r6, r8);
    }

    public static rx0 i(h00 r6) {
        int r1 = r6.i(16);
        r6.t(4);
        int r2 = r6.i(2);
        boolean r3 = r6.h();
        r6.t(1);
        byte[] r5 = f35.b;
        if (r2 != 1) goto L5;
        r6.t(r6.i(8) * 16);
    L11:
        byte[] r4 = r5;
    L13:
        return new rx0(r1, r3, r5, r4);
    L5:
        if (r2 != 0) goto L11;
        int r7 = r6.i(16);
        int r0 = r6.i(16);
        if (r7 <= 0) goto L9;
        r5 = new byte[r7];
        r6.l(r7, r5);
    L9:
        if (r0 <= 0) goto L11;
        r4 = new byte[r0];
        r6.l(r0, r4);
        goto L13
    }

    @Override // defpackage.zn4
    public void c(byte[] r44, int r45, int r46, yn4 r47, wc0 r48) {
        h00 r2 = new h00(r45 + r46, r44);
        r2.q(r45);
        Paint r8 = (Paint) this.o;
        Canvas r15 = (Canvas) this.p;
        vx0 r1 = (vx0) this.s;
    L4:
        if (r2.b() < 48) goto L66;
        if (r2.i(8) != 15) goto L66;
        int r4 = r2.i(8);
        int r10 = 16;
        int r11 = r2.i(16);
        int r12 = r2.i(16);
        int r13 = r2.f() + r12;
        if ((r12 * 8) > r2.b()) goto L9;
        int r7 = 4;
        switch(r4) {
            case 16: goto L54;
            case 17: goto L32;
            case 18: goto L27;
            case 19: goto L21;
            case 20: goto L14;
            default: goto L65;
        };
    L32:
        j83 r5 = r1.i;
        SparseArray r14 = r1.c;
        if (r11 != r1.a) goto L65;
        if (r5 == null) goto L65;
        int r17 = r2.i(8);
        r2.t(4);
        boolean r18 = r2.h();
        r2.t(3);
        int r19 = r2.i(16);
        int r20 = r2.i(16);
        r2.i(3);
        int r21 = r2.i(3);
        r2.t(2);
        int r22 = r2.i(8);
        int r23 = r2.i(8);
        int r24 = r2.i(4);
        int r25 = r2.i(2);
        r2.t(2);
        int r16 = r12 - 10;
        SparseArray r6 = new SparseArray();
    L36:
        if (r16 <= 0) goto L44;
        int r9 = r2.i(r10);
        int r110 = r2.i(2);
        r2.i(2);
        int r3 = r2.i(12);
        r2.t(r7);
        int r111 = r2.i(12);
        int r112 = r16 - 6;
        if (r110 == 1) goto L42;
        if (r110 == 2) goto L42;
        r16 = r112;
    L43:
        r6.put(r9, new ux0(r3, r111));
        r7 = 4;
        r10 = 16;
    L42:
        r2.i(8);
        r2.i(8);
        r16 = r16 - 8;
        goto L43
    L44:
        tx0 r113 = new tx0(r17, r18, r19, r20, r21, r22, r23, r24, r25, r6);
        if (r5.o != 0) goto L52;
        tx0 r26 = (tx0) r14.get(r17);
        if (r26 == null) goto L52;
        SparseArray r27 = r26.j;
        int r28 = 0;
    L50:
        if (r28 >= r27.size()) goto L52;
        r113.j.put(r27.keyAt(r28), (ux0) r27.valueAt(r28));
        r28 = r28 + 1;
    L52:
        r14.put(r113.a, r113);
    L65:
        r2.u(r13 - r2.f());
        goto L4
    L14:
        if (r11 != r1.a) goto L65;
        r2.t(4);
        boolean r29 = r2.h();
        r2.t(3);
        int r114 = r2.i(16);
        int r115 = r2.i(16);
        if (r29 == false) goto L18;
        int r30 = r2.i(16);
        int r31 = r2.i(16);
        int r210 = r31;
        int r211 = r2.i(16);
        int r212 = r2.i(16);
        int r116 = r30;
    L19:
        r1.h = new qx0(r114, r115, r116, r210, r211, r212);
        goto L65
    L18:
        r210 = r114;
        r212 = r115;
        r116 = 0;
        r211 = 0;
        goto L19
    L21:
        if (r11 != r1.a) goto L24;
        rx0 r32 = i(r2);
        r1.e.put(r32.a, r32);
        goto L65
    L24:
        if (r11 != r1.b) goto L65;
        rx0 r33 = i(r2);
        r1.g.put(r33.a, r33);
        goto L65
    L27:
        if (r11 != r1.a) goto L30;
        px0 r34 = h(r2, r12);
        r1.d.put(r34.a, r34);
        goto L65
    L30:
        if (r11 != r1.b) goto L65;
        px0 r35 = h(r2, r12);
        r1.f.put(r35.a, r35);
        goto L65
    L54:
        if (r11 != r1.a) goto L65;
        j83 r36 = r1.i;
        int r37 = 8;
        r2.i(8);
        int r38 = r2.i(4);
        int r39 = r2.i(2);
        r2.t(2);
        int r117 = r12 - 2;
        SparseArray r40 = new SparseArray();
    L56:
        if (r117 <= 0) goto L58;
        int r41 = r2.i(r37);
        r2.t(r37);
        r117 = r117 - 6;
        r40.put(r41, new sx0(r2.i(16), r2.i(16)));
        r37 = 8;
        goto L56
    L58:
        j83 r42 = new j83();
        r42.n = r38;
        r42.o = r39;
        r42.p = r40;
        if (r39 == 0) goto L61;
        r1.i = r42;
        r1.c.clear();
        r1.d.clear();
        r1.e.clear();
        goto L65
    L61:
        if (r36 == null) goto L65;
        if (r36.n == r38) goto L65;
        r1.i = r42;
        goto L65
    L9:
        l93.q0("DvbParser", "Data field length exceeds limit");
        r2.t(r2.b());
    L66:
        j83 r43 = r1.i;
        if (r43 != null) goto L70;
        vw1 r0 = yw1.o;
        lg0 r49 = new lg0(-9223372036854775807L, -9223372036854775807L, gy3.r);
    L128:
        r48.accept(r49);
        return;
    L70:
        qx0 r50 = r1.h;
        if (r50 != null) goto L74;
        r50 = (qx0) this.q;
    L74:
        Bitmap r51 = (Bitmap) this.t;
        if (r51 == null) goto L81;
        int r52 = 1;
        if ((r50.a + 1) == r51.getWidth()) goto L79;
    L82:
        Bitmap r53 = Bitmap.createBitmap(r50.a + r52, r50.b + r52, Bitmap.Config.ARGB_8888);
        this.t = r53;
        r15.setBitmap(r53);
    L83:
        ArrayList r213 = new ArrayList();
        SparseArray r54 = (SparseArray) r43.p;
        int r55 = 0;
    L85:
        if (r55 >= r54.size()) goto L127;
        r15.save();
        sx0 r56 = (sx0) r54.valueAt(r55);
        tx0 r118 = (tx0) r1.c.get(r54.keyAt(r55));
        int r119 = r56.a + r50.c;
        int r57 = r56.b + r50.e;
        int r120 = r118.c;
        int r121 = r118.f;
        int r122 = r118.d;
        int r58 = r119 + r120;
        int r59 = r57 + r122;
        SparseArray r123 = r54;
        r15.clipRect(r119, r57, Math.min(r58, r50.d), Math.min(r59, r50.f));
        px0 r60 = (px0) r1.d.get(r121);
        if (r60 != null) goto L91;
        r60 = (px0) r1.f.get(r121);
        if (r60 != null) goto L91;
        r60 = (px0) this.r;
    L91:
        SparseArray r61 = r118.j;
        qx0 r124 = r50;
        int r125 = 0;
    L93:
        if (r125 >= r61.size()) goto L115;
        int r62 = r61.keyAt(r125);
        int r126 = r55;
        ux0 r63 = (ux0) r61.valueAt(r125);
        SparseArray r127 = r61;
        rx0 r64 = (rx0) r1.e.get(r62);
        if (r64 != null) goto L97;
        r64 = (rx0) r1.g.get(r62);
    L97:
        rx0 r65 = r64;
        if (r65 != null) goto L100;
        tx0 r66 = r118;
        int r67 = r119;
        int r214 = r125;
        int r215 = r122;
    L114:
        r125 = r214 + 1;
        r118 = r66;
        r119 = r67;
        r61 = r127;
        r55 = r126;
        r1 = r1;
        r120 = r120;
        r122 = r215;
        goto L93
    L100:
        if (r65.b == false) goto L103;
        Paint r68 = null;
    L102:
        int r216 = r119;
        int r128 = r118.e;
        int r69 = r216 + r63.a;
        int r70 = r63.b + r57;
        if (r128 != 3) goto L109;
        int[] r71 = r60.d;
    L107:
        int r217 = r122;
        Paint r129 = r68;
        tx0 r218 = r118;
        int[] r130 = r71;
        r66 = r218;
        r67 = r216;
        r214 = r125;
        r215 = r217;
        g(r65.c, r130, r128, r69, r70, r129, r15);
        g(r65.d, r130, r128, r69, r70 + 1, r129, r15);
        goto L114
    L109:
        if (r128 != 2) goto L111;
        r71 = r60.c;
        goto L107
    L111:
        r71 = r60.b;
        goto L107
    L103:
        r68 = (Paint) this.n;
        goto L102
    L115:
        vx0 r219 = r1;
        int r131 = r55;
        tx0 r72 = r118;
        int r73 = r119;
        int r220 = r120;
        int r221 = r122;
        if (r72.b == false) goto L125;
        int r74 = r72.e;
        if (r74 != 3) goto L120;
        int r75 = r60.d[r72.g];
        char r132 = 2;
    L124:
        r8.setColor(r75);
        int r133 = r73;
        char r134 = r132;
        int r135 = 0;
        char r136 = 3;
        r15.drawRect(r133, r57, r58, r59, r8);
    L126:
        Bitmap r222 = Bitmap.createBitmap((Bitmap) this.t, r133, r57, r220, r221);
        float r76 = r124.a;
        float r77 = r57;
        float r78 = r124.b;
        r213.add(new ig0(null, null, null, r222, r77 / r78, 0, 0, r133 / r76, 0, Integer.MIN_VALUE, -3.4028235E38f, r220 / r76, r221 / r78, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
        r15.drawColor(r135, PorterDuff.Mode.CLEAR);
        r15.restore();
        r55 = r131 + 1;
        r50 = r124;
        r213 = r213;
        r54 = r123;
        r1 = r219;
        goto L85
    L120:
        r132 = 2;
        if (r74 != 2) goto L123;
        r75 = r60.c[r72.h];
        goto L124
    L123:
        r75 = r60.b[r72.i];
        goto L124
    L125:
        r133 = r73;
        r136 = 3;
        r134 = 2;
        r135 = 0;
        goto L126
    L127:
        r49 = new lg0(-9223372036854775807L, -9223372036854775807L, r213);
        goto L128
    L79:
        if ((r50.b + 1) == ((Bitmap) this.t).getHeight()) goto L83;
    L81:
        r52 = 1;
        goto L82
    }

    @Override // defpackage.zn4
    public void reset() {
        vx0 r1 = (vx0) this.s;
        r1.c.clear();
        r1.d.clear();
        r1.e.clear();
        r1.f.clear();
        r1.g.clear();
        r1.h = null;
        r1.i = null;
    }

    public /* synthetic */ lv4(ConstraintLayout r1, View r2, View r3, TextView r4, View r5, TextView r6, View r7) {
        this.n = r1;
        this.o = r2;
        this.q = r3;
        this.p = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
    }

    public lv4(ConstraintLayout r1, TextView r2, ImageView r3, TextView r4, ImageView r5, ImageView r6, TextView r7) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
    }

    public lv4(LinearLayout r1, RecyclerView r2, ConstraintLayout r3, ProgressBar r4, Button r5, TextView r6, AppBarLayout r7, MaterialToolbar r8) {
        this.n = r2;
        this.o = r3;
        this.q = r4;
        this.r = r5;
        this.p = r6;
        this.s = r7;
        this.t = r8;
    }

    public lv4(Context r5) {
        WindowManager.LayoutParams r0 = new WindowManager.LayoutParams();
        this.q = r0;
        this.r = new Rect();
        this.s = new int[2];
        this.t = new int[2];
        this.n = r5;
        View r1 = LayoutInflater.from(r5).inflate(R.layout.abc_tooltip, null);
        this.o = r1;
        this.p = (TextView) r1.findViewById(R.id.message);
        r0.setTitle(lv4.class.getSimpleName());
        r0.packageName = r5.getPackageName();
        r0.type = 1002;
        r0.width = -2;
        r0.height = -2;
        r0.format = -3;
        r0.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        r0.flags = 24;
    }

    public /* synthetic */ lv4(ViewGroup r1, View r2, View r3, View r4, View r5, View r6, View r7, ViewGroup r8) {
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
        this.r = r6;
        this.s = r7;
        this.t = r8;
    }

    public lv4(Context r1, r90 r2, bq4 r3, pq3 r4, WorkDatabase r5, dd5 r6, ArrayList r7) {
        r1.getClass();
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        Context r8 = r1.getApplicationContext();
        r8.getClass();
        this.n = r8;
    }

    public lv4(gr4 r1) {
        r1.getClass();
        this.n = r1;
        this.s = kq1.a;
        this.t = r81.a;
    }

    public lv4(li1 r3, li1 r4, li1 r5, li1 r6, i11 r7, i11 r8) {
        this.t = s51.a(150, new d34(24, this));
        this.n = r3;
        this.o = r4;
        this.p = r5;
        this.q = r6;
        this.r = r7;
        this.s = r8;
    }
}
