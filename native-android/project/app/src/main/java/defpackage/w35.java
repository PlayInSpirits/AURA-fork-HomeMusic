package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w35 {
    public static final Matrix p = null;
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final t35 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final oi o;

    static {
        p = new Matrix();
    }

    public w35(w35 r4) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        oi r0 = new oi(0);
        this.o = r0;
        this.g = new t35(r4.g, r0);
        this.a = new Path(r4.a);
        this.b = new Path(r4.b);
        this.h = r4.h;
        this.i = r4.i;
        this.j = r4.j;
        this.k = r4.k;
        this.l = r4.l;
        this.m = r4.m;
        String r1 = r4.m;
        if (r1 == null) goto L5;
        r0.put(r1, this);
    L5:
        this.n = r4.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(t35 r21, Matrix r22, Canvas r23, int r24, int r25) {
        Matrix r1 = r21.a;
        ArrayList r6 = r21.b;
        r1.set(r22);
        Matrix r2 = r21.a;
        r2.preConcat(r21.j);
        r23.save();
        char r7 = 0;
        int r8 = 0;
    L4:
        if (r8 >= r6.size()) goto L80;
        u35 r0 = (u35) r6.get(r8);
        if ((r0 instanceof t35) == false) goto L10;
        a((t35) r0, r2, r23, r24, r25);
    L8:
        int r18 = r8;
    L79:
        r8 = r18 + 1;
        r7 = 0;
        goto L4
    L10:
        if ((r0 instanceof v35) == false) goto L8;
        v35 r3 = (v35) r0;
        float r5 = r24 / this.j;
        float r10 = r25 / this.k;
        float r11 = Math.min(r5, r10);
        Matrix r12 = this.c;
        r12.set(r2);
        r12.postScale(r5, r10);
        float[] r9 = {0.0f, 1.0f, 1.0f, 0.0f};
        r2.mapVectors(r9);
        float r13 = (float) Math.hypot(r9[r7], r9[1]);
        boolean r17 = r7;
        r18 = r8;
        float r14 = (float) Math.hypot(r9[2], r9[3]);
        float r15 = (r9[r17 ? 1 : 0] * r9[3]) - (r9[1] * r9[2]);
        float r16 = Math.max(r13, r14);
        if (r16 <= 0.0f) goto L14;
        float r19 = Math.abs(r15) / r16;
    L16:
        if (r19 == 0.0f) goto L79;
        Path r20 = this.a;
        r20.reset();
        cf3[] r110 = r3.a;
        if (r110 == null) goto L21;
        cf3.b(r110, r20);
    L21:
        Path r111 = this.b;
        r111.reset();
        if ((r3 instanceof r35) == true) goto L24;
        s35 r4 = (s35) r3;
        float r112 = r4.i;
        if (r112 == 0.0f) goto L31;
    L32:
        float r113 = r4.k;
        float r114 = (r112 + r113) % 1.0f;
        float r115 = (r4.j + r113) % 1.0f;
        if (this.f != null) goto L35;
        this.f = new PathMeasure();
    L35:
        this.f.setPath(r20, r17);
        float r116 = this.f.getLength();
        float r117 = r114 * r116;
        float r118 = r115 * r116;
        r20.reset();
        PathMeasure r119 = this.f;
        if (r117 <= r118) goto L38;
        r119.getSegment(r117, r116, r20, true);
        float r120 = 0.0f;
        this.f.getSegment(0.0f, r118, r20, true);
    L39:
        r20.rLineTo(r120, r120);
    L40:
        r111.addPath(r20, r12);
        ue1 r26 = r4.f;
        float r121 = 255.0f;
        if (((Shader) r26.p) != null) goto L46;
        if (r26.o != 0) goto L46;
        r121 = 255.0f;
        int r122 = 16777215;
    L59:
        ue1 r27 = r4.d;
        if (((Shader) r27.p) != null) goto L65;
        if (r27.o == 0) goto L79;
    L65:
        if (this.d != null) goto L67;
        Paint r28 = new Paint(1);
        this.d = r28;
        r28.setStyle(Paint.Style.STROKE);
    L67:
        Paint r29 = this.d;
        Paint.Join r123 = r4.m;
        if (r123 == null) goto L70;
        r29.setStrokeJoin(r123);
    L70:
        Paint.Cap r124 = r4.l;
        if (r124 == null) goto L73;
        r29.setStrokeCap(r124);
    L73:
        r29.setStrokeMiter(r4.n);
        Shader r125 = (Shader) r27.p;
        if (r125 == null) goto L76;
        r125.setLocalMatrix(r12);
        r29.setShader(r125);
        r29.setAlpha(Math.round(r4.g * r121));
    L77:
        r29.setColorFilter(null);
        r29.setStrokeWidth(r4.e * (r11 * r19));
        r23.drawPath(r111, r29);
        goto L79
    L76:
        r29.setShader(null);
        r29.setAlpha(255);
        int r30 = r27.o;
        float r126 = r4.g;
        PorterDuff.Mode r127 = z35.w;
        r29.setColor((r30 & r122) | (((int) (Color.alpha(r30) * r126)) << 24));
    L46:
        if (this.e != null) goto L48;
        r122 = 16777215;
        Paint r31 = new Paint(1);
        this.e = r31;
        r31.setStyle(Paint.Style.FILL);
    L49:
        Paint r32 = this.e;
        Shader r128 = (Shader) r26.p;
        if (r128 == null) goto L52;
        r128.setLocalMatrix(r12);
        r32.setShader(r128);
        r32.setAlpha(Math.round(r4.h * 255.0f));
    L53:
        r32.setColorFilter(null);
        if (r4.c != 0) goto L56;
        Path.FillType r33 = Path.FillType.WINDING;
    L57:
        r111.setFillType(r33);
        r23.drawPath(r111, r32);
        goto L59
    L56:
        r33 = Path.FillType.EVEN_ODD;
        goto L57
    L52:
        r32.setShader(null);
        r32.setAlpha(255);
        int r34 = r26.o;
        float r129 = r4.h;
        PorterDuff.Mode r130 = z35.w;
        r32.setColor((r34 & r122) | (((int) (Color.alpha(r34) * r129)) << 24));
        goto L53
    L48:
        r122 = 16777215;
        goto L49
    L38:
        r120 = 0.0f;
        r119.getSegment(r117, r118, r20, true);
        goto L39
    L31:
        if (r4.j == 1.0f) goto L40;
    L24:
        if (r3.c != 0) goto L26;
        Path.FillType r35 = Path.FillType.WINDING;
    L27:
        r111.setFillType(r35);
        r111.addPath(r20, r12);
        r23.clipPath(r111);
        goto L79
    L26:
        r35 = Path.FillType.EVEN_ODD;
        goto L27
    L14:
        r19 = 0.0f;
        goto L16
    L80:
        r23.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float r2) {
        setRootAlpha((int) (r2 * 255.0f));
    }

    public void setRootAlpha(int r1) {
        this.l = r1;
    }

    public w35() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new oi(0);
        this.g = new t35();
        this.a = new Path();
        this.b = new Path();
    }
}
