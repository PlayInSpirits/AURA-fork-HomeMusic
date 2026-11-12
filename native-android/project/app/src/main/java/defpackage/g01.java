package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public g01(Bitmap r4) {
        ArrayList r0 = new ArrayList();
        this.e = r0;
        this.a = 16;
        this.b = 12544;
        this.c = -1;
        ArrayList r1 = new ArrayList();
        this.f = r1;
        if (r4.isRecycled() == true) goto L6;
        r1.add(bq4.r);
        this.d = r4;
        r0.add(xq4.d);
        r0.add(xq4.e);
        r0.add(xq4.f);
        r0.add(xq4.g);
        r0.add(xq4.h);
        r0.add(xq4.i);
        return;
    L6:
        kf2.n("Bitmap is not valid");
        throw null;
    }

    public bq4 a() {
        ArrayList r1 = (ArrayList) this.f;
        Bitmap r2 = (Bitmap) this.d;
        if (r2 == null) goto L84;
        int r3 = this.c;
        int r4 = this.b;
        double r5 = -1.0d;
        if (r4 <= 0) goto L9;
        int r7 = r2.getHeight() * r2.getWidth();
        if (r7 <= r4) goto L13;
        r5 = Math.sqrt(((double) r4) / ((double) r7));
    L13:
        int r6 = 0;
        if (r5 > 0.0d) goto L16;
        Bitmap r8 = r2;
    L17:
        int r9 = r8.getWidth();
        int r12 = r8.getHeight();
        int[] r10 = new int[r9 * r12];
        r8.getPixels(r10, 0, r9, 0, 0, r9, r12);
        int r11 = this.a;
        if (r1.isEmpty() == false) goto L20;
        md3[] r13 = null;
    L21:
        z40 r14 = new z40(r10, r11, r13);
        if (r8 == r2) goto L24;
        r8.recycle();
    L24:
        ArrayList r15 = (ArrayList) r14.p;
        ArrayList r0 = (ArrayList) this.e;
        bq4 r16 = new bq4(r15, r0);
        SparseBooleanArray r17 = (SparseBooleanArray) r16.p;
        int r18 = r0.size();
        int r19 = 0;
    L25:
        if (r19 >= r18) goto L81;
        xq4 r20 = (xq4) r0.get(r19);
        float[] r21 = r20.c;
        float[] r22 = r20.a;
        int r110 = r21.length;
        float r111 = 0.0f;
        int r112 = r6;
        float r113 = 0.0f;
    L27:
        if (r112 >= r110) goto L33;
        float r114 = r21[r112];
        if (r114 <= 0.0f) goto L31;
        r113 = r113 + r114;
    L31:
        r112 = r112 + 1;
        goto L27
    L33:
        if (r113 == 0.0f) goto L40;
        int r115 = r21.length;
        int r116 = r6;
    L35:
        if (r116 >= r115) goto L40;
        float r117 = r21[r116];
        if (r117 <= 0.0f) goto L39;
        r21[r116] = r117 / r113;
    L39:
        r116 = r116 + 1;
    L40:
        oi r23 = (oi) r16.o;
        List r118 = (List) r16.n;
        int r119 = r118.size();
        int r120 = r6;
        float r121 = 0.0f;
        nd3 r122 = null;
    L42:
        if (r120 >= r119) goto L77;
        nd3 r24 = (nd3) r118.get(r120);
        float[] r123 = r24.b();
        float r124 = r123[1];
        float r25 = r111;
        float[] r125 = r20.b;
        if (r124 >= r22[r120]) goto L46;
    L75:
        ArrayList r126 = r0;
        bq4 r26 = r16;
    L76:
        r120 = r120 + 1;
        r111 = r25;
        r0 = r126;
        r16 = r26;
        goto L42
    L46:
        if (r124 > r22[2]) goto L75;
        float r127 = r123[2];
        if (r127 < r125[r120]) goto L75;
        if (r127 > r125[2]) goto L75;
        if (r17.get(r24.d) == true) goto L75;
        float[] r27 = r24.b();
        r126 = r0;
        nd3 r28 = (nd3) r16.q;
        if (r28 == null) goto L57;
        int r29 = r28.e;
    L56:
        r26 = r16;
        float[] r30 = r20.c;
        float r210 = r30[r120];
        if (r210 <= r25) goto L61;
        float r211 = (1.0f - Math.abs(r27[1] - r22[1])) * r210;
    L62:
        float r212 = r30[1];
        if (r212 <= r25) goto L65;
        float r213 = (1.0f - Math.abs(r27[2] - r125[1])) * r212;
    L66:
        float r31 = r30[2];
        if (r31 <= r25) goto L69;
        float r32 = (r24.e / r29) * r31;
    L70:
        float r214 = (r211 + r213) + r32;
        if (r122 != null) goto L73;
    L74:
        r122 = r24;
        r121 = r214;
        goto L76
    L73:
        if (r214 <= r121) goto L76;
    L69:
        r32 = r25;
        goto L70
    L65:
        r213 = r25;
        goto L66
    L61:
        r211 = r25;
        goto L62
    L57:
        r29 = 1;
        goto L56
    L77:
        ArrayList r128 = r0;
        bq4 r215 = r16;
        if (r122 == null) goto L80;
        r17.append(r122.d, true);
    L80:
        r23.put(r20, r122);
        r19 = r19 + 1;
        r6 = r120;
        r0 = r128;
        r16 = r215;
        goto L25
    L81:
        bq4 r216 = r16;
        r17.clear();
        return r216;
    L20:
        r13 = (md3[]) r1.toArray(new md3[r1.size()]);
        goto L21
    L16:
        r8 = Bitmap.createScaledBitmap(r2, (int) Math.ceil(((double) r2.getWidth()) * r5), (int) Math.ceil(((double) r2.getHeight()) * r5), false);
        goto L17
    L9:
        if (r3 <= 0) goto L13;
        int r33 = Math.max(r2.getWidth(), r2.getHeight());
        if (r33 <= r3) goto L13;
        r5 = ((double) r3) / ((double) r33);
        goto L13
    L84:
        throw new AssertionError();
    }

    public void b() {
        this.a = 1;
        this.e = (zv2) this.d;
        this.c = 0;
    }

    public boolean c() {
        vv2 r0 = ((zv2) this.e).b.b();
        int r1 = r0.a(6);
        if (r1 == 0) goto L8;
        if (((ByteBuffer) r0.q).get(r1 + r0.n) == 0) goto L8;
        return true;
    L8:
        if (this.b != 65039) goto L10;
        return true;
    L10:
        return false;
    }

    public g01(zv2 r2) {
        this.a = 1;
        this.d = r2;
        this.e = r2;
    }
}
