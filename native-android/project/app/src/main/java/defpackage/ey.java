package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey implements u91 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public Object h;

    public ey(Context r5) {
        TypedArray r0 = r5.obtainStyledAttributes(zz1.F(R.attr.materialCalendarStyle, r5, nh2.class.getCanonicalName()).data, ht3.x);
        this.a = c6.f(r5, r0.getResourceId(4, 0));
        this.g = c6.f(r5, r0.getResourceId(2, 0));
        this.b = c6.f(r5, r0.getResourceId(3, 0));
        this.c = c6.f(r5, r0.getResourceId(5, 0));
        ColorStateList r1 = h12.s(r5, r0, 7);
        this.d = c6.f(r5, r0.getResourceId(9, 0));
        this.e = c6.f(r5, r0.getResourceId(8, 0));
        this.f = c6.f(r5, r0.getResourceId(10, 0));
        Paint r6 = new Paint();
        this.h = r6;
        r6.setColor(r1.getDefaultColor());
        r0.recycle();
    }

    public boolean a(boolean r9) {
        if (f() == null) goto L49;
        ba1 r10 = f();
        h(null);
        if (r10 == null) goto L49;
        z91 r8 = z91.n;
        z91 r2 = z91.p;
        r10.r0(r8, r2);
        if (r10.n.A == true) goto L10;
        cz1.b("visitAncestors called on an unattached node");
    L10:
        cx2 r11 = r10.n.r;
        c72 r12 = j51.O(r10);
    L11:
        if (r12 == null) goto L49;
        if ((((cx2) r12.Q.g).q & 1024) == 0) goto L43;
    L14:
        if (r11 == null) goto L43;
        if ((r11.p & 1024) == 0) goto L42;
        cx2 r3 = r11;
        f13 r4 = null;
    L18:
        if (r3 == null) goto L42;
        if ((r3 instanceof ba1) == true) goto L21;
        if ((r3.p & 1024) == 0) goto L41;
        if ((r3 instanceof fo0) == false) goto L41;
        cx2 r5 = ((fo0) r3).C;
        int r6 = 0;
    L27:
        if (r5 == null) goto L39;
        if ((r5.p & 1024) == 0) goto L38;
        r6 = r6 + 1;
        if (r6 != 1) goto L33;
        r3 = r5;
        goto L38
    L33:
        if (r4 != null) goto L35;
        r4 = new f13(new cx2[16]);
    L35:
        if (r3 == null) goto L37;
        r4.b(r3);
        r3 = null;
    L37:
        r4.b(r5);
    L38:
        r5 = r5.s;
        goto L27
    L39:
        if (r6 == 1) goto L18;
    L41:
        r3 = j51.c(r4);
        goto L18
    L21:
        ((ba1) r3).r0(z91.o, r2);
    L42:
        r11 = r11.r;
    L43:
        r12 = r12.t();
        if (r12 == null) goto L48;
        w12 r13 = r12.Q;
        if (r13 == null) goto L48;
        r11 = (sq4) r13.f;
    L48:
        r11 = null;
    L49:
        return true;
    }

    public boolean b(int r2, boolean r3, boolean r4) {
        boolean r5 = true;
        if (r3 == true) goto L17;
        int r0 = uc5.M((ba1) this.c).ordinal();
        if (r0 != 0) goto L7;
        a(r3);
    L18:
        if (r5 == false) goto L21;
        if (r4 == false) goto L21;
        c();
    L21:
        return r5;
    L7:
        if (r0 != 1) goto L9;
    L15:
        r5 = false;
        goto L18
    L9:
        if (r0 == 2) goto L15;
        if (r0 == 3) goto L15;
        er1.n();
        return false;
    L17:
        a(r3);
        goto L18
    }

    public void c() {
        ra r1 = (ra) this.a;
        if (r1.isFocused() == false) goto L5;
    L14:
        r1.clearFocus();
        return;
    L5:
        if (r1.hasFocus() == true) goto L14;
        if (r1.hasFocus() == false) goto L16;
        View r0 = r1.findFocus();
        if (r0 == null) goto L12;
        r0.clearFocus();
    L12:
        r1.clearFocus();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v24, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v25, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v29, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v30, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v34, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [f13] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    public boolean d(KeyEvent r13, gf1 r14) {
        ba1 r0 = (ba1) this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
    L246:
        th = move-exception;
        Trace.endSection();
        throw th;
    L4:
        if (((s91) this.d).e == false) goto L9;
        System.out.println("FocusRelatedWarning: Dispatching key event while focus system is invalidated.");     // Catch: Throwable -> L246
        Trace.endSection();
        return false;
    L9:
        if (i(r13) == true) goto L12;
        Trace.endSection();
        return false;
    L12:
        ba1 r12 = te5.p(r0);     // Catch: Throwable -> L246
        if (r12 != null) goto L16;
    L31:
        if (r12 == null) goto L79;
        if (r12.n.A == true) goto L35;
        cz1.b("visitAncestors called on an unattached node");     // Catch: Throwable -> L246
    L35:
        cx2 r6 = r12.n;     // Catch: Throwable -> L246
        c72 r15 = j51.O(r12);     // Catch: Throwable -> L246
    L36:
        if (r15 == null) goto L74;
        if ((((cx2) r15.Q.g).q & 8192) == 0) goto L68;
    L39:
        if (r6 == null) goto L68;
        if ((r6.p & 8192) == 0) goto L67;
        f13 r8 = null;
        cx2 r7 = r6;
    L43:
        if (r7 == null) goto L67;
        if ((r7 instanceof j42) == true) goto L46;
        if ((r7.p & 8192) == 0) goto L66;
        if ((r7 instanceof fo0) == false) goto L66;
        cx2 r9 = ((fo0) r7).C;     // Catch: Throwable -> L246
        int r10 = 0;
        r7 = r7;
        r8 = r8;
    L52:
        if (r9 == null) goto L64;
        if ((r9.p & 8192) == 0) goto L63;
        r10 = r10 + 1;     // Catch: Throwable -> L246
        r8 = r8;
        if (r10 != 1) goto L58;
        r7 = r9;
        goto L63
    L58:
        if (r8 != null) goto L60;
        r8 = new f13(new cx2[16]);     // Catch: Throwable -> L246
    L60:
        if (r7 == null) goto L62;
        r8.b(r7);     // Catch: Throwable -> L246
        r7 = null;
    L62:
        r8.b(r9);     // Catch: Throwable -> L246
    L63:
        r9 = r9.s;     // Catch: Throwable -> L246
        r7 = r7;
        r8 = r8;
        goto L52
    L64:
        if (r10 == 1) goto L43;
    L66:
        r7 = j51.c(r8);     // Catch: Throwable -> L246
        goto L43
    L46:
        eo0 r11 = r7;
    L75:
        eo0 r16 = (j42) r11;     // Catch: Throwable -> L246
        if (r16 == null) goto L79;
        cx2 r17 = ((cx2) r16).n;     // Catch: Throwable -> L246
    L125:
        if (r17 != null) goto L127;
    L244:
        Trace.endSection();
        return false;
    L127:
        if (r17.n.A == true) goto L129;
        cz1.b("visitAncestors called on an unattached node");     // Catch: Throwable -> L246
    L129:
        cx2 r18 = r17.n.r;     // Catch: Throwable -> L246
        c72 r1 = j51.O(r17);     // Catch: Throwable -> L246
        ArrayList r2 = null;
    L130:
        if (r1 == null) goto L172;
        if ((((cx2) r1.Q.g).q & 8192) == 0) goto L166;
    L133:
        if (r18 == null) goto L166;
        if ((r18.p & 8192) == 0) goto L165;
        cx2 r19 = r18;
        f13 r20 = null;
    L137:
        if (r19 == null) goto L165;
        if ((r19 instanceof j42) == false) goto L143;
        if (r2 != null) goto L142;
        r2 = new ArrayList();     // Catch: Throwable -> L246
    L142:
        r2.add(r19);     // Catch: Throwable -> L246
        boolean r21 = false;
    L144:
        if (r21 == false) goto L164;
        if ((r19.p & 8192) == 0) goto L164;
        if ((r19 instanceof fo0) == false) goto L164;
        cx2 r22 = ((fo0) r19).C;     // Catch: Throwable -> L246
        int r110 = 0;
    L150:
        if (r22 == null) goto L162;
        if ((r22.p & 8192) == 0) goto L161;
        r110 = r110 + 1;     // Catch: Throwable -> L246
        if (r110 != 1) goto L156;
        r19 = r22;
        goto L161
    L156:
        if (r20 != null) goto L158;
        r20 = new f13(new cx2[16]);     // Catch: Throwable -> L246
    L158:
        if (r19 == null) goto L160;
        r20.b(r19);     // Catch: Throwable -> L246
        r19 = null;
    L160:
        r20.b(r22);     // Catch: Throwable -> L246
    L161:
        r22 = r22.s;     // Catch: Throwable -> L246
        goto L150
    L162:
        if (r110 == 1) goto L137;
    L164:
        r19 = j51.c(r20);     // Catch: Throwable -> L246
        goto L137
    L143:
        r21 = true;
    L165:
        r18 = r18.r;     // Catch: Throwable -> L246
    L166:
        r1 = r1.t();     // Catch: Throwable -> L246
        if (r1 == null) goto L171;
        w12 r111 = r1.Q;     // Catch: Throwable -> L246
        if (r111 == null) goto L171;
        r18 = (sq4) r111.f;     // Catch: Throwable -> L246
    L171:
        r18 = null;
        goto L130
    L172:
        if (r2 == null) goto L179;
        int r112 = r2.size() - 1;     // Catch: Throwable -> L246
        if (r112 < 0) goto L179;
    L175:
        int r3 = r112 - 1;     // Catch: Throwable -> L246
        ((j42) r2.get(r112)).getClass();     // Catch: Throwable -> L246
        if (r3 < 0) goto L179;
        r112 = r3;
    L179:
        ?? r113 = r17.n;     // Catch: Throwable -> L246
        ?? r4 = 0;
    L180:
        if (r113 == 0) goto L205;
        if ((r113 instanceof j42) == true) goto L183;
        if ((r113.p & 8192) == 0) goto L203;
        if ((r113 instanceof fo0) == false) goto L203;
        cx2 r23 = ((fo0) r113).C;     // Catch: Throwable -> L246
        int r24 = 0;
        r4 = r4;
        r113 = r113;
    L189:
        if (r23 == null) goto L201;
        if ((r23.p & 8192) == 0) goto L200;
        r24 = r24 + 1;     // Catch: Throwable -> L246
        r4 = r4;
        if (r24 != 1) goto L195;
        r113 = r23;
        goto L200
    L195:
        if (r4 != 0) goto L197;
        r4 = new f13(new cx2[16]);     // Catch: Throwable -> L246
    L197:
        if (r113 == 0) goto L199;
        r4.b(r113);     // Catch: Throwable -> L246
        r113 = 0;
    L199:
        r4.b(r23);     // Catch: Throwable -> L246
    L200:
        r23 = r23.s;     // Catch: Throwable -> L246
        r4 = r4;
        r113 = r113;
        goto L189
    L201:
        if (r24 == 1) goto L180;
    L203:
        r113 = j51.c(r4);     // Catch: Throwable -> L246
        goto L180
    L183:
        j42 r114 = (j42) r113;     // Catch: Throwable -> L246
        goto L203
    L205:
        if (((Boolean) r14.invoke()).booleanValue() == false) goto L208;
        Trace.endSection();
        return true;
    L208:
        ?? r115 = r17.n;     // Catch: Throwable -> L246
        ?? r116 = 0;
    L209:
        if (r115 == 0) goto L236;
        if ((r115 instanceof j42) == true) goto L213;
        if ((r115.p & 8192) == 0) goto L235;
        if ((r115 instanceof fo0) == false) goto L235;
        cx2 r5 = ((fo0) r115).C;     // Catch: Throwable -> L246
        int r25 = 0;
        r115 = r115;
        r116 = r116;
    L221:
        if (r5 == null) goto L233;
        if ((r5.p & 8192) == 0) goto L232;
        r25 = r25 + 1;     // Catch: Throwable -> L246
        r116 = r116;
        if (r25 != 1) goto L227;
        r115 = r5;
        goto L232
    L227:
        if (r116 != 0) goto L229;
        r116 = new f13(new cx2[16]);     // Catch: Throwable -> L246
    L229:
        if (r115 == 0) goto L231;
        r116.b(r115);     // Catch: Throwable -> L246
        r115 = 0;
    L231:
        r116.b(r5);     // Catch: Throwable -> L246
    L232:
        r5 = r5.s;     // Catch: Throwable -> L246
        r115 = r115;
        r116 = r116;
        goto L221
    L233:
        if (r25 == 1) goto L209;
    L235:
        r115 = j51.c(r116);     // Catch: Throwable -> L246
        goto L209
    L213:
        if (((j42) r115).q(r13) == false) goto L235;
        Trace.endSection();
        return true;
    L236:
        if (r2 == null) goto L244;
        int r117 = r2.size();     // Catch: Throwable -> L246
        int r118 = 0;
    L238:
        if (r118 >= r117) goto L244;
        if (((j42) r2.get(r118)).q(r13) == true) goto L241;
        r118 = r118 + 1;
        goto L238
    L241:
        Trace.endSection();
        return true;
    L67:
        r6 = r6.r;     // Catch: Throwable -> L246
    L68:
        r15 = r15.t();     // Catch: Throwable -> L246
        if (r15 == null) goto L73;
        w12 r26 = r15.Q;     // Catch: Throwable -> L246
        if (r26 == null) goto L73;
        r6 = (sq4) r26.f;     // Catch: Throwable -> L246
    L73:
        r6 = null;
        goto L36
    L74:
        r11 = null;
    L79:
        if (r0.n.A == true) goto L81;
        cz1.b("visitAncestors called on an unattached node");     // Catch: Throwable -> L246
    L81:
        cx2 r119 = r0.n.r;     // Catch: Throwable -> L246
        c72 r27 = j51.O(r0);     // Catch: Throwable -> L246
    L82:
        if (r27 == null) goto L120;
        if ((((cx2) r27.Q.g).q & 8192) == 0) goto L114;
    L85:
        if (r119 == null) goto L114;
        if ((r119.p & 8192) == 0) goto L113;
        cx2 r28 = r119;
        f13 r29 = null;
    L89:
        if (r28 == null) goto L113;
        if ((r28 instanceof j42) == true) goto L92;
        if ((r28.p & 8192) == 0) goto L112;
        if ((r28 instanceof fo0) == false) goto L112;
        cx2 r30 = ((fo0) r28).C;     // Catch: Throwable -> L246
        int r31 = 0;
        r28 = r28;
        r29 = r29;
    L98:
        if (r30 == null) goto L110;
        if ((r30.p & 8192) == 0) goto L109;
        r31 = r31 + 1;     // Catch: Throwable -> L246
        r29 = r29;
        if (r31 != 1) goto L104;
        r28 = r30;
        goto L109
    L104:
        if (r29 != null) goto L106;
        r29 = new f13(new cx2[16]);     // Catch: Throwable -> L246
    L106:
        if (r28 == null) goto L108;
        r29.b(r28);     // Catch: Throwable -> L246
        r28 = null;
    L108:
        r29.b(r30);     // Catch: Throwable -> L246
    L109:
        r30 = r30.s;     // Catch: Throwable -> L246
        r28 = r28;
        r29 = r29;
        goto L98
    L110:
        if (r31 == 1) goto L89;
    L112:
        r28 = j51.c(r29);     // Catch: Throwable -> L246
        goto L89
    L92:
        eo0 r32 = r28;
    L121:
        eo0 r33 = (j42) r32;     // Catch: Throwable -> L246
        if (r33 == null) goto L124;
        r17 = ((cx2) r33).n;     // Catch: Throwable -> L246
        goto L125
    L124:
        r17 = null;
    L113:
        r119 = r119.r;     // Catch: Throwable -> L246
    L114:
        r27 = r27.t();     // Catch: Throwable -> L246
        if (r27 == null) goto L119;
        w12 r120 = r27.Q;     // Catch: Throwable -> L246
        if (r120 == null) goto L119;
        r119 = (sq4) r120.f;     // Catch: Throwable -> L246
    L119:
        r119 = null;
        goto L82
    L120:
        r32 = null;
        goto L121
    L16:
        if (r12.n.A == true) goto L18;
        cz1.b("visitLocalDescendants called on an unattached node");     // Catch: Throwable -> L246
    L18:
        cx2 r34 = r12.n;     // Catch: Throwable -> L246
        if ((r34.q & 9216) == 0) goto L29;
        cx2 r35 = r34.s;     // Catch: Throwable -> L246
        r17 = null;
    L21:
        if (r35 == null) goto L30;
        int r36 = r35.p;     // Catch: Throwable -> L246
        if ((r36 & 9216) == 0) goto L28;
        if ((r36 & 1024) != 0) goto L30;
        r17 = r35;
    L28:
        r35 = r35.s;     // Catch: Throwable -> L246
    L30:
        if (r17 != null) goto L125;
    L29:
        r17 = null;
        goto L30
    }

    public Boolean e(int r20, wv3 r21, if1 r22) {
        ra r4 = (ra) this.b;
        ba1 r5 = (ba1) this.c;
        ba1 r6 = te5.p(r5);
        int r8 = 4;
        int r12 = 2;
        boolean r16 = false;
        if (r6 == null) goto L123;
        r62 r18 = r4.getLayoutDirection();
        x91 r14 = r6.s0();
        y91 r7 = r14.h;
        y91 r13 = r14.i;
        if (r20 != 1) goto L7;
        r7 = r14.b;
    L51:
        y91 r10 = y91.c;
        if (h12.c(r7, r10) == false) goto L55;
    L158:
        return null;
    L55:
        if (h12.c(r7, y91.d) == false) goto L60;
        ba1 r0 = te5.p(r5);
        if (r0 == null) goto L158;
        return (Boolean) r22.invoke(r0);
    L60:
        y91 r15 = y91.b;
        if (h12.c(r7, r15) == false) goto L63;
    L124:
        r62 r9 = r4.getLayoutDirection();
        dd0 r11 = new dd0(r6, this, r22, r12);
        if (r20 == 1) goto L128;
        if (r20 == 2) goto L128;
        if (r20 == 3) goto L145;
        if (r20 == 4) goto L145;
        if (r20 == 5) goto L145;
        if (r20 == 6) goto L145;
        if (r20 != 7) goto L160;
        int r1 = r9.ordinal();
        if (r1 == 0) goto L154;
        if (r1 != 1) goto L152;
        r8 = 3;
        goto L154
    L152:
        er1.n();
        return null;
    L154:
        ba1 r2 = te5.p(r5);
        if (r2 == null) goto L158;
        return kb4.b0(r8, r11, r2, r21);
    L160:
        if (r20 != 8) goto L218;
        ba1 r3 = te5.p(r5);
        if (r3 != null) goto L164;
    L211:
        ba1 r17 = null;
    L212:
        if (r17 == null) goto L216;
        if (r17 == r5) goto L216;
        r16 = ((Boolean) r11.invoke(r17)).booleanValue();
    L216:
        return Boolean.valueOf(r16);
    L164:
        if (r3.n.A == true) goto L166;
        cz1.b("visitAncestors called on an unattached node");
    L166:
        cx2 r19 = r3.n.r;
        c72 r23 = j51.O(r3);
    L167:
        if (r23 == null) goto L211;
        if ((((cx2) r23.Q.g).q & 1024) == 0) goto L205;
    L170:
        if (r19 == null) goto L205;
        if ((r19.p & 1024) == 0) goto L204;
        cx2 r24 = r19;
        f13 r25 = null;
    L174:
        if (r24 == null) goto L204;
        if ((r24 instanceof ba1) == true) goto L177;
        if ((r24.p & 1024) == 0) goto L203;
        if ((r24 instanceof fo0) == false) goto L203;
        cx2 r26 = ((fo0) r24).C;
        int r27 = 0;
    L186:
        if (r26 == null) goto L201;
        if ((r26.p & 1024) == 0) goto L199;
        r27 = r27 + 1;
        if (r27 != 1) goto L193;
        r24 = r26;
        goto L199
    L193:
        if (r25 != null) goto L196;
        r25 = new f13(new cx2[16]);
    L196:
        if (r24 == null) goto L198;
        r25.b(r24);
        r24 = null;
    L198:
        r25.b(r26);
    L199:
        r26 = r26.s;
        goto L186
    L201:
        if (r27 == 1) goto L174;
    L203:
        r24 = j51.c(r25);
        goto L174
    L177:
        ba1 r28 = (ba1) r24;
        if (r28.s0().a == false) goto L203;
        r17 = r28;
    L204:
        r19 = r19.r;
    L205:
        r23 = r23.t();
        if (r23 == null) goto L210;
        w12 r29 = r23.Q;
        if (r29 == null) goto L210;
        r19 = (sq4) r29.f;
    L210:
        r19 = null;
        goto L167
    L218:
        throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(o91.a(r20)).toString());
    L145:
        return kb4.b0(r20, r11, r5, r21);
    L128:
        if (r20 != 1) goto L130;
        boolean r30 = zz1.o(r5, r11);
    L133:
        return Boolean.valueOf(r30);
    L130:
        if (r20 != 2) goto L134;
        r30 = zz1.f(r5, r11);
        goto L133
    L134:
        kf2.o("This function should only be used for 1-D focus search");
        return null;
    L63:
        if (r7 == r15) goto L119;
        if (r7 == r10) goto L117;
        f13 r31 = r7.a;
        int r32 = r31.p;
        if (r32 != 0) goto L68;
        System.out.println("FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
    L116:
        return Boolean.valueOf(r16);
    L68:
        Object[] r33 = r31.n;
        int r34 = 0;
        boolean r35 = false;
    L69:
        if (r34 >= r32) goto L114;
        xo r36 = (xo) r33[r34];
        if (r36.n.A == true) goto L73;
        cz1.b("visitChildren called on an unattached node");
    L73:
        f13 r37 = new f13(new cx2[16]);
        cx2 r38 = r36.n;
        cx2 r39 = r38.s;
        if (r39 != null) goto L76;
        j51.b(r37, r38);
    L77:
        int r40 = r37.p;
        if (r40 == 0) goto L113;
        cx2 r41 = (cx2) r37.k(r40 - 1);
        if ((r41.q & 1024) == 0) goto L81;
    L82:
        if (r41 == null) goto L77;
        if ((r41.p & 1024) != 0) goto L85;
        r41 = r41.s;
        goto L82
    L85:
        f13 r42 = null;
    L86:
        if (r41 == null) goto L77;
        if ((r41 instanceof ba1) == true) goto L90;
        if ((r41.p & 1024) == 0) goto L111;
        if ((r41 instanceof fo0) == false) goto L111;
        cx2 r43 = ((fo0) r41).C;
        int r44 = 0;
    L97:
        if (r43 == null) goto L109;
        if ((r43.p & 1024) == 0) goto L108;
        r44 = r44 + 1;
        if (r44 != 1) goto L103;
        r41 = r43;
        goto L108
    L103:
        if (r42 != null) goto L105;
        r42 = new f13(new cx2[16]);
    L105:
        if (r41 == null) goto L107;
        r42.b(r41);
        r41 = null;
    L107:
        r42.b(r43);
    L108:
        r43 = r43.s;
        goto L97
    L109:
        if (r44 == 1) goto L86;
    L111:
        r41 = j51.c(r42);
        goto L86
    L90:
        if (((Boolean) r22.invoke((ba1) r41)).booleanValue() == false) goto L111;
        r35 = true;
        goto L113
    L81:
        j51.b(r37, r41);
    L113:
        r34 = r34 + 1;
        goto L69
    L76:
        r37.b(r39);
        goto L77
    L114:
        r16 = r35;
        goto L116
    L117:
        kf2.o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        return null;
    L119:
        kf2.o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        return null;
    L7:
        if (r20 != 2) goto L9;
        r7 = r14.c;
        goto L51
    L9:
        if (r20 != 5) goto L11;
        r7 = r14.d;
        goto L51
    L11:
        if (r20 != 6) goto L13;
        r7 = r14.e;
        goto L51
    L13:
        if (r20 != 3) goto L25;
        int r110 = r18.ordinal();
        if (r110 == 0) goto L21;
        if (r110 != 1) goto L18;
        r7 = r13;
        goto L21
    L18:
        er1.n();
        return null;
    L21:
        if (r7 != y91.b) goto L23;
        r7 = null;
    L23:
        if (r7 != null) goto L51;
        r7 = r14.f;
        goto L51
    L25:
        if (r20 != 4) goto L39;
        int r111 = r18.ordinal();
        if (r111 == 0) goto L32;
        if (r111 == 1) goto L34;
        er1.n();
        return null;
    L34:
        if (r7 != y91.b) goto L36;
        r7 = null;
    L36:
        if (r7 != null) goto L51;
        r7 = r14.g;
        goto L51
    L32:
        r7 = r13;
        goto L34
    L39:
        if (r20 != 7) goto L42;
    L43:
        ey r112 = (ey) ((ra) j51.P(r6)).getFocusOwner();
        ba1 r113 = r112.f();
        if (r20 != 7) goto L46;
        r14.j.getClass();
    L48:
        if (r113 == r112.f()) goto L50;
        r7 = y91.d;
        goto L51
    L50:
        r7 = y91.b;
        goto L51
    L46:
        r14.k.getClass();
        goto L48
    L42:
        if (r20 == 8) goto L43;
        kf2.o("invalid FocusDirection");
        return null;
    L123:
        r6 = null;
        goto L124
    }

    public ba1 f() {
        ba1 r2 = (ba1) this.h;
        if (r2 != null) goto L5;
        return null;
    L5:
        if (r2.A != true) goto L9;
        return r2;
    L9:
        return null;
    }

    public boolean g(int r4) {
        boolean r0 = false;
        if (b(r4, false, false) == true) goto L5;
        return false;
    L5:
        Boolean r5 = e(r4, null, new ha(r4, 2));
        if (r5 == null) goto L8;
        r0 = r5.booleanValue();
    L8:
        if (r0 == true) goto L10;
        c();
    L10:
        return r0;
    }

    public void h(ba1 r5) {
        ba1 r0 = (ba1) this.h;
        this.h = r5;
        q03 r4 = (q03) this.g;
        Object[] r1 = r4.a;
        int r6 = r4.b;
        int r2 = 0;
    L3:
        if (r2 >= r6) goto L5;
        ((t91) r1[r2]).a(r0, r5);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean i(KeyEvent r40) {
        long r1 = fh0.a(r40.getKeyCode());
        int r3 = hw.n(r40);
        int r10 = -862048943;
        long r15 = 0;
        char r5 = '\b';
        int r21 = 0;
        int r22 = 0;
        int r7 = 1;
        if (r3 != 2) goto L63;
        n03 r4 = (n03) this.f;
        if (r4 != null) goto L7;
        r4 = new n03(3);
        this.f = r4;
    L7:
        n03 r6 = r4;
        int r0 = Long.hashCode(r1) * (-862048943);
        int r2 = r0 ^ (r0 << 16);
        int r8 = r2 >>> 7;
        int r9 = r2 & 127;
        int r11 = r6.c;
        int r25 = r8 & r11;
        int r26 = 0;
    L8:
        long[] r12 = r6.a;
        int r28 = r25 >> 3;
        int r13 = (r25 & 7) << 3;
        long r14 = (r12[r28] >>> r13) | ((r12[r28 + 1] << (64 - r13)) & ((-r13) >> 63));
        int r29 = r10;
        long r16 = r9;
        long r17 = r14 ^ (r16 * 72340172838076673L);
        long r18 = ((r17 - 72340172838076673L) & (~r17)) & (-9187201950435737472L);
    L10:
        if (r18 == r15) goto L15;
        int r19 = (r25 + (Long.numberOfTrailingZeros(r18) >> 3)) & r11;
        long r33 = r15;
        if (r6.b[r19] == r1) goto L13;
        r18 = r18 & (r18 - 1);
        r15 = r33;
        goto L10
    L13:
        boolean r37 = 1;
    L59:
        r6.b[r19] = r1;
        return r37;
    L15:
        long r34 = r15;
        if (((r14 & ((~r14) << 6)) & (-9187201950435737472L)) != r34) goto L17;
        r26 = r26 + 8;
        r25 = (r25 + r26) & r11;
        r10 = r29;
        r15 = r34;
        goto L8
    L17:
        int r20 = r6.b(r8);
        if (r6.e == 0) goto L20;
    L21:
        int r38 = 1;
        long r39 = 128;
    L55:
        r19 = r20;
        r6.d++;
        int r23 = r6.e;
        long[] r24 = r6.a;
        int r27 = r19 >> 3;
        long r30 = r24[r27];
        int r31 = (r19 & 7) << 3;
        if (((r30 >> r31) & 255) != r39) goto L58;
        r22 = r38 == true ? 1 : 0;
    L58:
        r6.e = r23 - r22;
        int r32 = r6.c;
        long r35 = (r30 & (~(255 << r31))) | (r16 << r31);
        r24[r27] = r35;
        r24[(((r19 - 7) & r32) + (r32 & 7)) >> 3] = r35;
        r37 = r38;
        goto L59
    L20:
        if (((r6.a[r20 >> 3] >> ((r20 & 7) << 3)) & 255) == 254) goto L21;
        int r36 = r6.c;
        if (r36 > 8) goto L25;
    L47:
        int r110 = 1;
        r39 = 128;
        int r41 = v54.b(r6.c);
        long[] r42 = r6.a;
        long[] r43 = r6.b;
        int r44 = r6.c;
        r6.c(r41);
        long[] r45 = r6.a;
        long[] r46 = r6.b;
        int r47 = r6.c;
        int r111 = 0;
    L48:
        if (r111 >= r44) goto L46;
        if (((r42[r111 >> 3] >> ((r111 & 7) << 3)) & 255) >= 128) goto L52;
        long r112 = r43[r111];
        int r113 = Long.hashCode(r112) * r29;
        int r114 = r113 ^ (r113 << 16);
        int r115 = r6.b(r114 >>> 7);
        long[] r116 = r45;
        int r48 = r115 >> 3;
        int r117 = (r115 & 7) << 3;
        long r49 = (r116[r48] & (~(255 << r117))) | ((r114 & 127) << r117);
        r116[r48] = r49;
        r116[(((r115 - 7) & r47) + (r47 & 7)) >> 3] = r49;
        r46[r115] = r112;
    L53:
        r111 = r111 + 1;
        r42 = r42;
        r45 = r116;
        r43 = r43;
        r110 = r110;
        goto L48
    L52:
        r116 = r45;
    L46:
        r38 = r110;
        r20 = r6.b(r8);
        goto L55
    L25:
        if (Long.compare((((long) r6.d) * 32) ^ Long.MIN_VALUE, (((long) r36) * 25) ^ Long.MIN_VALUE) > 0) goto L47;
        long[] r50 = r6.a;
        int r51 = r6.c;
        long[] r118 = r6.b;
        int r119 = (r51 + 7) >> 3;
        int r120 = 0;
    L27:
        if (r120 >= r119) goto L29;
        long r52 = r50[r120] & (-9187201950435737472L);
        r50[r120] = ((~r52) + (r52 >>> 7)) & (-72340172838076674L);
        r120 = r120 + 1;
        r5 = r5;
        r51 = r51;
        goto L27
    L29:
        char r121 = r5;
        int r122 = r51;
        r39 = 128;
        int r53 = ti.j0(r50);
        int r54 = r53 - 1;
        long r123 = 72057594037927935L;
        r50[r54] = (r50[r54] & 72057594037927935L) | (-72057594037927936L);
        r50[r53] = r50[0];
        int r55 = r122;
        int r56 = 0;
    L30:
        if (r56 == r55) goto L45;
        int r57 = r56 >> 3;
        int r58 = (r56 & 7) << 3;
        long r210 = (r50[r57] >> r58) & 255;
        if (r210 == 128) goto L33;
        if (r210 != 254) goto L33;
        int r124 = Long.hashCode(r118[r56]) * r29;
        int r125 = r124 ^ (r124 << 16);
        long r211 = r123;
        int r126 = r125 >>> 7;
        int r127 = r6.b(r126);
        int r128 = r126 & r55;
        char r212 = r121;
        if ((((r127 - r128) & r55) / 8) == (((r56 - r128) & r55) / 8)) goto L39;
        int r129 = r7;
        int r59 = r127 >> 3;
        long r213 = r50[r59];
        int r60 = (r127 & 7) << 3;
        if (((r213 >> r60) & 255) != 128) goto L43;
        int r310 = r56;
        r50[r59] = (r213 & (~(255 << r60))) | (((long) (r125 & 127)) << r60);
        r50[r57] = (r50[r57] & (~(255 << r58))) | (128 << r58);
        r118[r127] = r118[r310];
        r118[r310] = r34;
        int r61 = r310;
    L44:
        r50[r50.length - r129] = (r50[0] & r211) | Long.MIN_VALUE;
        r56 = r61 + r129;
        r7 = r129;
        r123 = r211;
        r121 = r212;
        r55 = r55;
        goto L30
    L43:
        int r311 = r56;
        r50[r59] = (r213 & (~(255 << r60))) | ((r125 & 127) << r60);
        long r62 = r118[r127];
        r118[r127] = r118[r311];
        r118[r311] = r62;
        r61 = r311 - 1;
        goto L44
    L39:
        int r130 = r7;
        r50[r57] = (r50[r57] & (~(255 << r58))) | (((long) (r125 & 127)) << r58);
        r50[r50.length - r130] = (r50[0] & r211) | Long.MIN_VALUE;
        r56 = r56 + 1;
        r7 = r130;
        r123 = r211;
        r121 = r212;
    L33:
        r56 = r56 + 1;
        goto L30
    L45:
        r110 = r7;
        r6.e = v54.a(r6.c) - r6.d;
        goto L46
    L63:
        if (r3 != 1) goto L87;
        n03 r63 = (n03) this.f;
        if (r63 != null) goto L67;
    L86:
        return false;
    L67:
        if (r63.a(r1) != true) goto L86;
        n03 r64 = (n03) this.f;
        if (r64 == null) goto L84;
        int r65 = Long.hashCode(r1) * (-862048943);
        int r66 = r65 ^ (r65 << 16);
        int r67 = r66 & 127;
        int r68 = r64.c;
        int r69 = r66 >>> 7;
    L71:
        int r70 = r69 & r68;
        long[] r71 = r64.a;
        int r72 = r70 >> 3;
        int r73 = (r70 & 7) << 3;
        long r74 = ((r71[r72 + 1] << (64 - r73)) & ((-r73) >> 63)) | (r71[r72] >>> r73);
        long r75 = (((long) r67) * 72340172838076673L) ^ r74;
        long r76 = ((~r75) & (r75 - 72340172838076673L)) & (-9187201950435737472L);
    L73:
        if (r76 == 0) goto L79;
        int r131 = ((Long.numberOfTrailingZeros(r76) >> 3) + r70) & r68;
        if (r64.b[r131] == r1) goto L81;
        r76 = r76 & (r76 - 1);
    L81:
        if (r131 < 0) goto L84;
        r64.d--;
        long[] r77 = r64.a;
        int r78 = r64.c;
        int r79 = r131 >> 3;
        int r80 = (r131 & 7) << 3;
        long r81 = (r77[r79] & (~(255 << r80))) | (254 << r80);
        r77[r79] = r81;
        r77[(((r131 - 7) & r78) + (r78 & 7)) >> 3] = r81;
        return true;
    L79:
        if (((r74 & ((~r74) << 6)) & (-9187201950435737472L)) != 0) goto L80;
        r21 = r21 + 8;
        r69 = r70 + r21;
        goto L71
    L80:
        r131 = -1;
    L84:
        return true;
    L87:
        return true;
    }

    public ey(ConstraintLayout r1, TextInputEditText r2, TextInputEditText r3, CheckBox r4, TextInputEditText r5, TextInputEditText r6, TextInputEditText r7, TextInputEditText r8) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
    }

    public ey(ConstraintLayout r1, Button r2, Button r3, Button r4, Button r5, Button r6, ComposeView r7, ConstraintLayout r8, Button r9) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r8;
        this.h = r9;
    }

    public ey(ra r4, ra r5) {
        this.a = r4;
        this.b = r5;
        this.c = new ba1(2, null, 14);
        this.d = new s91(this, r5);
        this.e = new w91(this);
        this.g = new q03(1);
    }

    public /* synthetic */ ey(LinearLayout r1, View r2, View r3, TextView r4, TextView r5, View r6, View r7, TextView r8, View r9) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
    }
}
