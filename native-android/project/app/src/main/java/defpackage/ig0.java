package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ig0 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new ig0("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String r0 = f35.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(17, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(18, 36);
        y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public ig0(CharSequence r2, Layout.Alignment r3, Layout.Alignment r4, Bitmap r5, float r6, int r7, int r8, float r9, int r10, int r11, float r12, float r13, float r14, boolean r15, int r16, int r17, float r18, int r19) {
        if (r2 != null) goto L5;
        r5.getClass();
    L10:
        if ((r2 instanceof Spanned) == false) goto L12;
        this.a = SpannedString.valueOf(r2);
    L15:
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r10;
        this.j = r13;
        this.k = r14;
        this.l = r15;
        this.m = r16;
        this.n = r11;
        this.o = r12;
        this.p = r17;
        this.q = r18;
        this.r = r19;
        return;
    L12:
        if (r2 == null) goto L14;
        this.a = r2.toString();
        goto L15
    L14:
        this.a = null;
        goto L15
    L5:
        if (r5 != null) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        goto L10
    L7:
        r0 = false;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static ig0 a(Bundle r25) {
        ?? r1 = r25.getCharSequence(s);
        boolean r2 = true;
        int r3 = 0;
        if (r1 == 0) goto L21;
        ArrayList r5 = r25.getParcelableArrayList(t);
        if (r5 == null) goto L22;
        r1 = SpannableString.valueOf(r1);
        int r6 = r5.size();
        int r7 = 0;
    L7:
        if (r7 >= r6) goto L22;
        Object r8 = r5.get(r7);
        r7 = r7 + 1;
        Bundle r9 = (Bundle) r8;
        int r10 = r9.getInt(yg0.a);
        int r11 = r9.getInt(yg0.b);
        int r12 = r9.getInt(yg0.c);
        int r13 = r9.getInt(yg0.d, -1);
        Bundle r14 = r9.getBundle(yg0.e);
        if (r13 != 1) goto L11;
        r14.getClass();
        String r15 = r14.getString(u34.c);
        r15.getClass();
        r1.setSpan(new u34(r14.getInt(u34.d), r15), r10, r11, r12);
        goto L7
    L11:
        if (r13 != 2) goto L13;
        r14.getClass();
        r1.setSpan(new zr4(r14.getInt(zr4.d), r14.getInt(zr4.e), r14.getInt(zr4.f)), r10, r11, r12);
        goto L7
    L13:
        if (r13 != 3) goto L15;
        r1.setSpan(new tp1(), r10, r11, r12);
        goto L7
    L15:
        if (r13 != 4) goto L7;
        r14.getClass();
        String r16 = r14.getString(p85.b);
        r16.getClass();
        r1.setSpan(new p85(r16), r10, r11, r12);
    L22:
        Layout.Alignment r17 = (Layout.Alignment) r25.getSerializable(u);
        if (r17 == null) goto L25;
        Layout.Alignment r18 = r17;
    L26:
        Layout.Alignment r19 = (Layout.Alignment) r25.getSerializable(v);
        if (r19 == null) goto L29;
        Layout.Alignment r20 = r19;
    L30:
        Bitmap r21 = (Bitmap) r25.getParcelable(w);
        if (r21 == null) goto L33;
        ?? r22 = 0;
        Bitmap r110 = r21;
    L37:
        String r4 = y;
        float r23 = -3.4028235E38f;
        int r24 = Integer.MIN_VALUE;
        if (r25.containsKey(r4) == false) goto L42;
        String r26 = z;
        if (r25.containsKey(r26) == false) goto L42;
        float r111 = r25.getFloat(r4);
        int r112 = r25.getInt(r26);
    L43:
        String r27 = A;
        if (r25.containsKey(r27) == false) goto L46;
        int r113 = r25.getInt(r27);
    L47:
        String r28 = B;
        if (r25.containsKey(r28) == false) goto L50;
        float r114 = r25.getFloat(r28);
    L51:
        String r29 = C;
        if (r25.containsKey(r29) == false) goto L54;
        int r115 = r25.getInt(r29);
    L55:
        String r30 = E;
        if (r25.containsKey(r30) == false) goto L60;
        String r31 = D;
        if (r25.containsKey(r31) == false) goto L60;
        float r116 = r25.getFloat(r30);
        int r117 = r25.getInt(r31);
    L61:
        String r32 = F;
        if (r25.containsKey(r32) == false) goto L64;
        float r118 = r25.getFloat(r32);
    L65:
        String r33 = G;
        if (r25.containsKey(r33) == false) goto L68;
        r23 = r25.getFloat(r33);
    L68:
        float r119 = r23;
        String r34 = H;
        if (r25.containsKey(r34) == false) goto L72;
        int r35 = r25.getInt(r34);
    L71:
        int r210 = r35;
        if (r25.getBoolean(I, false) == true) goto L76;
        boolean r211 = false;
    L77:
        String r36 = J;
        if (r25.containsKey(r36) == false) goto L80;
        r24 = r25.getInt(r36);
    L80:
        int r212 = r24;
        String r37 = K;
        if (r25.containsKey(r37) == false) goto L84;
        float r38 = r25.getFloat(r37);
    L83:
        float r213 = r38;
        String r39 = L;
        if (r25.containsKey(r39) == false) goto L89;
        r3 = r25.getInt(r39);
    L89:
        return new ig0(r22, r18, r20, r110, r111, r112, r113, r114, r115, r117, r116, r118, r119, r211, r210, r212, r213, r3);
    L84:
        r38 = 0.0f;
        goto L83
    L76:
        r211 = r2;
        goto L77
    L72:
        r35 = -16777216;
        r2 = false;
        goto L71
    L64:
        r118 = -3.4028235E38f;
    L60:
        r116 = -3.4028235E38f;
        r117 = Integer.MIN_VALUE;
        goto L61
    L54:
        r115 = Integer.MIN_VALUE;
        goto L55
    L50:
        r114 = -3.4028235E38f;
        goto L51
    L46:
        r113 = Integer.MIN_VALUE;
    L42:
        r111 = -3.4028235E38f;
        r112 = Integer.MIN_VALUE;
        goto L43
    L33:
        byte[] r40 = r25.getByteArray(x);
        if (r40 == null) goto L36;
        r110 = BitmapFactory.decodeByteArray(r40, 0, r40.length);
        r22 = 0;
        goto L37
    L36:
        r22 = r1;
        r110 = null;
        goto L37
    L29:
        r20 = null;
        goto L30
    L25:
        r18 = null;
        goto L26
    L21:
        r1 = 0;
        goto L22
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        CharSequence r1 = this.a;
        if (r1 == null) goto L21;
        r0.putCharSequence(s, r1);
        if ((r1 instanceof Spanned) == false) goto L21;
        Spanned r2 = (Spanned) r1;
        String r3 = yg0.a;
        ArrayList<? extends Parcelable> r4 = new ArrayList();
        int r5 = 0;
        u34[] r6 = (u34[]) r2.getSpans(0, r2.length(), u34.class);
        int r7 = r6.length;
        int r8 = 0;
    L7:
        if (r8 >= r7) goto L9;
        u34 r9 = r6[r8];
        r9.getClass();
        Bundle r10 = new Bundle();
        r10.putString(u34.c, r9.a);
        r10.putInt(u34.d, r9.b);
        r4.add(yg0.a(r2, r9, 1, r10));
        r8 = r8 + 1;
        goto L7
    L9:
        zr4[] r11 = (zr4[]) r2.getSpans(0, r2.length(), zr4.class);
        int r12 = r11.length;
        int r13 = 0;
    L10:
        if (r13 >= r12) goto L12;
        zr4 r14 = r11[r13];
        r14.getClass();
        Bundle r15 = new Bundle();
        r15.putInt(zr4.d, r14.a);
        r15.putInt(zr4.e, r14.b);
        r15.putInt(zr4.f, r14.c);
        r4.add(yg0.a(r2, r14, 2, r15));
        r13 = r13 + 1;
        goto L10
    L12:
        tp1[] r16 = (tp1[]) r2.getSpans(0, r2.length(), tp1.class);
        int r17 = r16.length;
        int r18 = 0;
    L13:
        if (r18 >= r17) goto L15;
        r4.add(yg0.a(r2, r16[r18], 3, null));
        r18 = r18 + 1;
        goto L13
    L15:
        p85[] r19 = (p85[]) r2.getSpans(0, r2.length(), p85.class);
        int r20 = r19.length;
    L16:
        if (r5 >= r20) goto L19;
        p85 r21 = r19[r5];
        r21.getClass();
        Bundle r22 = new Bundle();
        r22.putString(p85.b, r21.a);
        r4.add(yg0.a(r2, r21, 4, r22));
        r5 = r5 + 1;
        goto L16
    L19:
        if (r4.isEmpty() == true) goto L21;
        r0.putParcelableArrayList(t, r4);
    L21:
        r0.putSerializable(u, this.b);
        r0.putSerializable(v, this.c);
        r0.putFloat(y, this.e);
        r0.putInt(z, this.f);
        r0.putInt(A, this.g);
        r0.putFloat(B, this.h);
        r0.putInt(C, this.i);
        r0.putInt(D, this.n);
        r0.putFloat(E, this.o);
        r0.putFloat(F, this.j);
        r0.putFloat(G, this.k);
        r0.putBoolean(I, this.l);
        r0.putInt(H, this.m);
        r0.putInt(J, this.p);
        r0.putFloat(K, this.q);
        r0.putInt(L, this.r);
        return r0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L52:
        return false;
    L8:
        if (ig0.class != r5.getClass()) goto L52;
        ig0 r6 = (ig0) r5;
        if (TextUtils.equals(this.a, r6.a) == false) goto L52;
        if (this.b != r6.b) goto L52;
        if (this.c != r6.c) goto L52;
        Bitmap r2 = r6.d;
        Bitmap r3 = this.d;
        if (r3 != null) goto L20;
        if (r2 != null) goto L52;
    L24:
        if (this.e != r6.e) goto L52;
        if (this.f != r6.f) goto L52;
        if (this.g != r6.g) goto L52;
        if (this.h != r6.h) goto L52;
        if (this.i != r6.i) goto L52;
        if (this.j != r6.j) goto L52;
        if (this.k != r6.k) goto L52;
        if (this.l != r6.l) goto L52;
        if (this.m != r6.m) goto L52;
        if (this.n != r6.n) goto L52;
        if (this.o != r6.o) goto L52;
        if (this.p != r6.p) goto L52;
        if (this.q != r6.q) goto L52;
        if (this.r != r6.r) goto L52;
        return true;
    L20:
        if (r2 == null) goto L52;
        if (r3.sameAs(r2) == false) goto L52;
        goto L52
    }

    public final int hashCode() {
        Float r6 = Float.valueOf(this.e);
        Integer r7 = Integer.valueOf(this.f);
        Integer r8 = Integer.valueOf(this.g);
        Float r9 = Float.valueOf(this.h);
        Integer r10 = Integer.valueOf(this.i);
        Float r11 = Float.valueOf(this.j);
        Float r12 = Float.valueOf(this.k);
        Boolean r13 = Boolean.valueOf(this.l);
        Integer r14 = Integer.valueOf(this.m);
        Integer r15 = Integer.valueOf(this.n);
        Float r16 = Float.valueOf(this.o);
        Integer r17 = Integer.valueOf(this.p);
        Float r18 = Float.valueOf(this.q);
        Integer r19 = Integer.valueOf(this.r);
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19});
    }
}
