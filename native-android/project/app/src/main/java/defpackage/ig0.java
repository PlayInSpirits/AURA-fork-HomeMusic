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
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
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
        String str = f35.a;
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

    public ig0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            rr2.l(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static ig0 a(Bundle bundle) {
        ?? r7;
        Bitmap bitmapDecodeByteArray;
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        ?? charSequence = bundle.getCharSequence(s);
        boolean z2 = true;
        if (charSequence != 0) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(t);
            if (parcelableArrayList != null) {
                charSequence = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = parcelableArrayList.get(i4);
                    i4++;
                    Bundle bundle2 = (Bundle) obj;
                    int i5 = bundle2.getInt(yg0.a);
                    int i6 = bundle2.getInt(yg0.b);
                    int i7 = bundle2.getInt(yg0.c);
                    int i8 = bundle2.getInt(yg0.d, -1);
                    Bundle bundle3 = bundle2.getBundle(yg0.e);
                    if (i8 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(u34.c);
                        string.getClass();
                        charSequence.setSpan(new u34(bundle3.getInt(u34.d), string), i5, i6, i7);
                    } else if (i8 == 2) {
                        bundle3.getClass();
                        charSequence.setSpan(new zr4(bundle3.getInt(zr4.d), bundle3.getInt(zr4.e), bundle3.getInt(zr4.f)), i5, i6, i7);
                    } else if (i8 == 3) {
                        charSequence.setSpan(new tp1(), i5, i6, i7);
                    } else if (i8 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(p85.b);
                        string2.getClass();
                        charSequence.setSpan(new p85(string2), i5, i6, i7);
                    }
                }
            }
        } else {
            charSequence = 0;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(u);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(v);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(w);
        if (bitmap != null) {
            r7 = 0;
            bitmapDecodeByteArray = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(x);
            if (byteArray != null) {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                r7 = 0;
            } else {
                r7 = charSequence;
                bitmapDecodeByteArray = null;
            }
        }
        String str = y;
        if (bundle.containsKey(str)) {
            String str2 = z;
            if (bundle.containsKey(str2)) {
                f = bundle.getFloat(str);
                i = bundle.getInt(str2);
            } else {
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
            }
        } else {
            f = -3.4028235E38f;
            i = Integer.MIN_VALUE;
        }
        String str3 = A;
        int i9 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
        String str4 = B;
        float f3 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
        String str5 = C;
        int i10 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                f2 = bundle.getFloat(str6);
                i2 = bundle.getInt(str7);
            } else {
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
            }
        } else {
            f2 = -3.4028235E38f;
            i2 = Integer.MIN_VALUE;
        }
        String str8 = F;
        float f4 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
        String str9 = G;
        float f5 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
        String str10 = H;
        if (bundle.containsKey(str10)) {
            i3 = bundle.getInt(str10);
        } else {
            i3 = -16777216;
            z2 = false;
        }
        int i11 = i3;
        boolean z3 = !bundle.getBoolean(I, false) ? false : z2;
        String str11 = J;
        int i12 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
        String str12 = K;
        float f6 = bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
        String str13 = L;
        return new ig0(r7, alignment2, alignment4, bitmapDecodeByteArray, f, i, i9, f3, i10, i2, f2, f4, f5, z3, i11, i12, f6, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = yg0.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (u34 u34Var : (u34[]) spanned.getSpans(0, spanned.length(), u34.class)) {
                    u34Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(u34.c, u34Var.a);
                    bundle2.putInt(u34.d, u34Var.b);
                    arrayList.add(yg0.a(spanned, u34Var, 1, bundle2));
                }
                for (zr4 zr4Var : (zr4[]) spanned.getSpans(0, spanned.length(), zr4.class)) {
                    zr4Var.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(zr4.d, zr4Var.a);
                    bundle3.putInt(zr4.e, zr4Var.b);
                    bundle3.putInt(zr4.f, zr4Var.c);
                    arrayList.add(yg0.a(spanned, zr4Var, 2, bundle3));
                }
                for (tp1 tp1Var : (tp1[]) spanned.getSpans(0, spanned.length(), tp1.class)) {
                    arrayList.add(yg0.a(spanned, tp1Var, 3, null));
                }
                for (p85 p85Var : (p85[]) spanned.getSpans(0, spanned.length(), p85.class)) {
                    p85Var.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(p85.b, p85Var.a);
                    arrayList.add(yg0.a(spanned, p85Var, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ig0.class == obj.getClass()) {
            ig0 ig0Var = (ig0) obj;
            if (TextUtils.equals(this.a, ig0Var.a) && this.b == ig0Var.b && this.c == ig0Var.c) {
                Bitmap bitmap = ig0Var.d;
                Bitmap bitmap2 = this.d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.e == ig0Var.e && this.f == ig0Var.f && this.g == ig0Var.g && this.h == ig0Var.h && this.i == ig0Var.i && this.j == ig0Var.j && this.k == ig0Var.k && this.l == ig0Var.l && this.m == ig0Var.m && this.n == ig0Var.n && this.o == ig0Var.o && this.p == ig0Var.p && this.q == ig0Var.q && this.r == ig0Var.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
