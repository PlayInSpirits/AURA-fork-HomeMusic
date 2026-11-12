package defpackage;

import android.opengl.GLES20;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nr3 {
    public static final float[] i = null;
    public static final float[] j = null;
    public static final float[] k = null;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    static {
        i = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
        j = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
        k = new float[]{0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    }

    public nr3(ConstraintLayout r1, ConstraintLayout r2) {
        this.h = r1;
        this.g = r2;
    }

    public static boolean b(int r2, int r3, int r4) {
        if (r2 == r3) goto L14;
        int r5 = View.MeasureSpec.getMode(r2);
        int r0 = View.MeasureSpec.getMode(r3);
        int r6 = View.MeasureSpec.getSize(r3);
        if (r0 == 1073741824) goto L7;
        return false;
    L7:
        if (r5 == Integer.MIN_VALUE) goto L9;
        if (r5 == 0) goto L9;
        return false;
    L9:
        if (r4 != r6) goto L16;
        return true;
    L16:
        return false;
    L14:
        return true;
    }

    public static boolean c(mr3 r4) {
        lr3 r0 = r4.a;
        lr3 r5 = r4.b;
        tu[] r1 = r0.a;
        if (r1.length == 1) goto L5;
    L11:
        return false;
    L5:
        if (r1[0].a != 0) goto L11;
        tu[] r6 = r5.a;
        if (r6.length != 1) goto L11;
        if (r6[0].a != 0) goto L11;
        return true;
    }

    public void a() {
        ew4 r0 = new ew4();     // Catch: GlUtil$GlException -> L4
        this.h = r0;     // Catch: GlUtil$GlException -> L4
        this.b = GLES20.glGetUniformLocation(r0.o, "uMvpMatrix");     // Catch: GlUtil$GlException -> L4
        this.c = GLES20.glGetUniformLocation(((ew4) this.h).o, "uTexMatrix");     // Catch: GlUtil$GlException -> L4
        int r1 = GLES20.glGetAttribLocation(((ew4) this.h).o, "aPosition");     // Catch: GlUtil$GlException -> L4
        GLES20.glEnableVertexAttribArray(r1);     // Catch: GlUtil$GlException -> L4
        j51.l();     // Catch: GlUtil$GlException -> L4
        this.d = r1;     // Catch: GlUtil$GlException -> L4
        int r2 = GLES20.glGetAttribLocation(((ew4) this.h).o, "aTexCoords");     // Catch: GlUtil$GlException -> L4
        GLES20.glEnableVertexAttribArray(r2);     // Catch: GlUtil$GlException -> L4
        j51.l();     // Catch: GlUtil$GlException -> L4
        this.e = r2;     // Catch: GlUtil$GlException -> L4
        this.f = GLES20.glGetUniformLocation(((ew4) this.h).o, "uTexture");     // Catch: GlUtil$GlException -> L4
        return;
    L4:
        e = move-exception;
        l93.G("ProjectionRenderer", "Failed to initialize the program", e);
    }

    public void d(jc0 r18, kr r19) {
        ConstraintLayout r3 = (ConstraintLayout) this.h;
        hb0 r4 = r18.J;
        hb0 r5 = r18.H;
        if (r18.f0 != 8) goto L7;
        r19.e = 0;
        r19.f = 0;
        r19.g = 0;
        return;
    L7:
        if (r18.S == null) goto L205;
        fd4 r6 = ConstraintLayout.C;
        int r7 = r19.a;
        int r8 = r19.b;
        int r9 = r19.c;
        int r10 = r19.d;
        int r11 = this.a + this.b;
        int r12 = this.c;
        View r13 = r18.e0;
        int r14 = xa3.w(r7);
        if (r14 == 0) goto L45;
        if (r14 == 1) goto L44;
        if (r14 != 2) goto L14;
        int r15 = ViewGroup.getChildMeasureSpec(this.e, r12, -2);
        if (r18.r != 1) goto L26;
        boolean r16 = true;
    L27:
        int r17 = r19.j;
        if (r17 == 1) goto L31;
        if (r17 == 2) goto L31;
    L42:
        int r20 = r15;
    L46:
        int r21 = xa3.w(r8);
        if (r21 != 0) goto L49;
        int r0 = View.MeasureSpec.makeMeasureSpec(r10, 1073741824);
    L83:
        kc0 r22 = (kc0) r18.S;
        if (r22 == null) goto L106;
        if (uo.q(r3.v, 256) == false) goto L106;
        if (r13.getMeasuredWidth() != r18.o()) goto L106;
        if (r13.getMeasuredWidth() >= r22.o()) goto L106;
        if (r13.getMeasuredHeight() != r18.i()) goto L106;
        if (r13.getMeasuredHeight() >= r22.i()) goto L106;
        if (r13.getBaseline() != r18.Z) goto L106;
        if (r18.x() == true) goto L106;
        if (b(r18.F, r20, r18.o()) == false) goto L106;
        if (b(r18.G, r0, r18.i()) == false) goto L106;
        r19.e = r18.o();
        r19.f = r18.i();
        r19.g = r18.Z;
        return;
    L106:
        if (r7 != 3) goto L108;
        boolean r23 = true;
    L109:
        if (r8 != 3) goto L111;
        boolean r24 = true;
    L113:
        if (r8 == 4) goto L117;
        if (r8 == 1) goto L117;
        boolean r25 = false;
    L118:
        if (r7 == 4) goto L122;
        if (r7 == 1) goto L122;
        boolean r110 = false;
    L124:
        if (r23 == true) goto L126;
    L128:
        boolean r26 = false;
    L129:
        if (r24 == true) goto L131;
    L133:
        boolean r27 = false;
    L134:
        if (r13 != null) goto L136;
        return;
    L136:
        mb0 r111 = (mb0) r13.getLayoutParams();
        int r112 = r19.j;
        if (r112 != 1) goto L139;
    L148:
        r13.measure(r20, r0);
        r18.F = r20;
        r18.G = r0;
        r18.g = false;
        int r28 = r13.getMeasuredWidth();
        int r29 = r13.getMeasuredHeight();
        int r113 = r13.getBaseline();
        int r114 = r18.u;
        if (r114 <= 0) goto L151;
        int r115 = Math.max(r114, r28);
    L152:
        int r116 = r18.v;
        if (r116 <= 0) goto L155;
        r115 = Math.min(r116, r115);
    L155:
        int r117 = r18.x;
        if (r117 <= 0) goto L159;
        int r118 = Math.max(r117, r29);
    L158:
        int r119 = r0;
        int r1 = r18.y;
        if (r1 <= 0) goto L164;
        r118 = Math.min(r1, r118);
    L164:
        if (uo.q(r3.v, 1) == false) goto L166;
    L172:
        if (r28 != r115) goto L178;
        if (r29 != r118) goto L178;
        int r30 = r113;
        boolean r31 = false;
    L176:
        int r32 = -1;
    L184:
        if (r30 == r32) goto L186;
        boolean r120 = true;
    L188:
        if (r115 == r19.c) goto L190;
    L193:
        boolean r33 = true;
    L194:
        r19.i = r33;
        if (r111.c0 == false) goto L197;
        r120 = true;
    L197:
        if (r120 == true) goto L199;
    L203:
        r19.e = r115;
        r19.f = r118;
        r19.h = r120;
        r19.g = r30;
        return;
    L199:
        if (r30 == (-1)) goto L203;
        if (r18.Z == r30) goto L203;
        r19.i = true;
        goto L203
    L190:
        if (r118 != r19.d) goto L193;
        r33 = r31;
        goto L194
    L186:
        r120 = r31;
    L178:
        if (r28 == r115) goto L180;
        r20 = View.MeasureSpec.makeMeasureSpec(r115, 1073741824);
    L180:
        if (r29 == r118) goto L182;
        int r2 = View.MeasureSpec.makeMeasureSpec(r118, 1073741824);
    L183:
        r13.measure(r20, r2);
        r18.F = r20;
        r18.G = r2;
        r31 = false;
        r18.g = false;
        int r34 = r13.getMeasuredWidth();
        int r35 = r13.getMeasuredHeight();
        r30 = r13.getBaseline();
        r115 = r34;
        r118 = r35;
        goto L176
    L182:
        r2 = r119;
        goto L183
    L166:
        if (r26 == false) goto L169;
        if (r25 == false) goto L169;
        r115 = (int) ((r118 * r18.V) + 0.5f);
    L169:
        if (r27 == false) goto L172;
        if (r110 == false) goto L172;
        r118 = (int) ((r115 / r18.V) + 0.5f);
        goto L172
    L159:
        r118 = r29;
        goto L158
    L151:
        r115 = r28;
        goto L152
    L139:
        if (r112 == 2) goto L148;
        if (r23 == false) goto L148;
        if (r18.r != 0) goto L148;
        if (r24 == false) goto L148;
        if (r18.s != 0) goto L148;
        r31 = false;
        r30 = 0;
        r32 = -1;
        r115 = 0;
        r118 = 0;
        goto L184
    L131:
        if (r18.V <= 0.0f) goto L133;
        r27 = true;
        goto L134
    L126:
        if (r18.V <= 0.0f) goto L128;
        r26 = true;
    L122:
        r110 = true;
    L117:
        r25 = true;
        goto L118
    L111:
        r24 = false;
        goto L113
    L108:
        r23 = false;
        goto L109
    L49:
        if (r21 != 1) goto L51;
        r0 = ViewGroup.getChildMeasureSpec(this.f, r11, -2);
        goto L83
    L51:
        if (r21 != 2) goto L53;
        r0 = ViewGroup.getChildMeasureSpec(this.f, r11, -2);
        if (r18.s != 1) goto L65;
        boolean r36 = true;
    L66:
        int r37 = r19.j;
        if (r37 == 1) goto L70;
        if (r37 != 2) goto L83;
    L70:
        if (r13.getMeasuredWidth() != r18.o()) goto L72;
        boolean r38 = true;
    L74:
        if (r19.j == 2) goto L80;
        if (r36 == false) goto L80;
        if (r36 == false) goto L79;
        if (r38 == true) goto L80;
    L79:
        if (r18.z() == false) goto L83;
    L80:
        r0 = View.MeasureSpec.makeMeasureSpec(r18.i(), 1073741824);
        goto L83
    L72:
        r38 = false;
        goto L74
    L65:
        r36 = false;
        goto L66
    L53:
        if (r21 == 3) goto L55;
        r0 = 0;
        goto L83
    L55:
        int r39 = this.f;
        if (r5 == null) goto L58;
        int r40 = r18.I.g;
    L59:
        if (r4 == null) goto L61;
        r40 = r40 + r18.K.g;
    L61:
        r0 = ViewGroup.getChildMeasureSpec(r39, r11 + r40, -1);
        goto L83
    L58:
        r40 = 0;
    L31:
        if (r13.getMeasuredHeight() != r18.i()) goto L33;
        boolean r121 = true;
    L35:
        if (r19.j == 2) goto L43;
        if (r16 == false) goto L43;
        if (r16 == false) goto L40;
        if (r121 == true) goto L43;
    L40:
        if (r18.y() == false) goto L42;
    L43:
        r15 = View.MeasureSpec.makeMeasureSpec(r18.o(), 1073741824);
        goto L42
    L33:
        r121 = false;
        goto L35
    L26:
        r16 = false;
        goto L27
    L14:
        if (r14 == 3) goto L16;
        r20 = 0;
        goto L46
    L16:
        int r41 = this.e;
        if (r5 == null) goto L19;
        int r122 = r5.g;
    L20:
        if (r4 == null) goto L22;
        r122 = r122 + r4.g;
    L22:
        r20 = ViewGroup.getChildMeasureSpec(r41, r12 + r122, -1);
        goto L46
    L19:
        r122 = 0;
        goto L20
    L44:
        r15 = ViewGroup.getChildMeasureSpec(this.e, r12, -2);
        goto L42
    L45:
        r15 = View.MeasureSpec.makeMeasureSpec(r9, 1073741824);
        goto L42
    }
}
