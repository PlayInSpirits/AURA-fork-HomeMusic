package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.os.Bundle
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.SpannedString
 *  android.text.TextUtils
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

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
        String string = f35.a;
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

    public ig0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f16, int n16, int n17, float f17, int n18, int n19, float f18, float f19, float f26, boolean bl5, int n26, int n27, float f27, int n28) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            boolean bl6 = bitmap == null;
            rr2.l(bl6);
        }
        this.a = charSequence instanceof Spanned ? SpannedString.valueOf((CharSequence)charSequence) : (charSequence != null ? charSequence.toString() : null);
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f16;
        this.f = n16;
        this.g = n17;
        this.h = f17;
        this.i = n18;
        this.j = f19;
        this.k = f26;
        this.l = bl5;
        this.m = n26;
        this.n = n19;
        this.o = f18;
        this.p = n27;
        this.q = f27;
        this.r = n28;
    }

    public static ig0 a(Bundle bundle) {
        float f16;
        float f17;
        String string;
        Object object;
        int n16;
        int n17;
        int n18;
        int n19;
        int n26;
        int n27;
        CharSequence charSequence;
        ArrayList arrayList;
        Object object2 = bundle.getCharSequence(s);
        boolean bl5 = true;
        int n28 = 0;
        if (object2 != null) {
            arrayList = bundle.getParcelableArrayList(t);
            charSequence = object2;
            if (arrayList != null) {
                object2 = SpannableString.valueOf((CharSequence)object2);
                n27 = arrayList.size();
                n26 = 0;
                while (true) {
                    charSequence = object2;
                    if (n26 < n27) {
                        charSequence = arrayList.get(n26);
                        ++n26;
                        charSequence = (Bundle)charSequence;
                        n19 = charSequence.getInt(yg0.a);
                        n18 = charSequence.getInt(yg0.b);
                        n17 = charSequence.getInt(yg0.c);
                        n16 = charSequence.getInt(yg0.d, -1);
                        charSequence = charSequence.getBundle(yg0.e);
                        if (n16 != 1) {
                            if (n16 != 2) {
                                if (n16 != 3) {
                                    if (n16 != 4) continue;
                                    charSequence.getClass();
                                    charSequence = charSequence.getString(p85.b);
                                    charSequence.getClass();
                                    object2.setSpan((Object)new p85((String)charSequence), n19, n18, n17);
                                    continue;
                                }
                                object2.setSpan(new Object(), n19, n18, n17);
                                continue;
                            }
                            charSequence.getClass();
                            object2.setSpan((Object)new zr4(charSequence.getInt(zr4.d), charSequence.getInt(zr4.e), charSequence.getInt(zr4.f)), n19, n18, n17);
                            continue;
                        }
                        charSequence.getClass();
                        object = charSequence.getString(u34.c);
                        object.getClass();
                        object2.setSpan((Object)new u34(charSequence.getInt(u34.d), (String)object), n19, n18, n17);
                        continue;
                    }
                    break;
                }
            }
        } else {
            charSequence = null;
        }
        if ((arrayList = (Layout.Alignment)bundle.getSerializable(u)) == null) {
            arrayList = null;
        }
        object = (Layout.Alignment)bundle.getSerializable(v);
        if (object == null) {
            object = null;
        }
        object2 = (Bitmap)bundle.getParcelable(w);
        if (object2 != null) {
            charSequence = null;
        } else {
            object2 = bundle.getByteArray(x);
            if (object2 != null) {
                object2 = BitmapFactory.decodeByteArray((byte[])object2, (int)0, (int)((Object)object2).length);
                charSequence = null;
            } else {
                object2 = null;
            }
        }
        String string2 = y;
        boolean bl6 = bundle.containsKey(string2);
        float f18 = -3.4028235E38f;
        n16 = Integer.MIN_VALUE;
        if (bl6 && bundle.containsKey(string = z)) {
            f17 = bundle.getFloat(string2);
            n26 = bundle.getInt(string);
        } else {
            f17 = -3.4028235E38f;
            n26 = Integer.MIN_VALUE;
        }
        string2 = A;
        n27 = bundle.containsKey(string2) ? bundle.getInt(string2) : Integer.MIN_VALUE;
        string2 = B;
        float f19 = bundle.containsKey(string2) ? bundle.getFloat(string2) : -3.4028235E38f;
        string2 = C;
        n19 = bundle.containsKey(string2) ? bundle.getInt(string2) : Integer.MIN_VALUE;
        string2 = E;
        if (bundle.containsKey(string2) && bundle.containsKey(string = D)) {
            f16 = bundle.getFloat(string2);
            n17 = bundle.getInt(string);
        } else {
            f16 = -3.4028235E38f;
            n17 = Integer.MIN_VALUE;
        }
        string2 = F;
        float f26 = bundle.containsKey(string2) ? bundle.getFloat(string2) : -3.4028235E38f;
        string2 = G;
        if (bundle.containsKey(string2)) {
            f18 = bundle.getFloat(string2);
        }
        if (bundle.containsKey(string2 = H)) {
            n18 = bundle.getInt(string2);
        } else {
            n18 = -16777216;
            bl5 = false;
        }
        if (!bundle.getBoolean(I, false)) {
            bl5 = false;
        }
        if (bundle.containsKey(string2 = J)) {
            n16 = bundle.getInt(string2);
        }
        float f27 = bundle.containsKey(string2 = K) ? bundle.getFloat(string2) : 0.0f;
        string2 = L;
        if (bundle.containsKey(string2)) {
            n28 = bundle.getInt(string2);
        }
        return new ig0(charSequence, (Layout.Alignment)arrayList, (Layout.Alignment)object, (Bitmap)object2, f17, n26, n27, f19, n19, n17, f16, f26, f18, bl5, n18, n16, f27, n28);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Bundle bundle2;
                p85[] p85Array;
                charSequence = (Spanned)charSequence;
                Object object2 = yg0.a;
                object2 = new ArrayList();
                int n16 = charSequence.length();
                int n17 = 0;
                for (u34 object3 : (Bundle)charSequence.getSpans(0, n16, u34.class)) {
                    object3.getClass();
                    p85Array = new Bundle();
                    p85Array.putString(u34.c, object3.a);
                    p85Array.putInt(u34.d, object3.b);
                    ((ArrayList)object2).add(yg0.a((Spanned)charSequence, object3, 1, (Bundle)p85Array));
                }
                for (Bundle bundle3 : (p85[])charSequence.getSpans(0, charSequence.length(), zr4.class)) {
                    bundle3.getClass();
                    bundle2 = new Bundle();
                    bundle2.putInt(zr4.d, bundle3.a);
                    bundle2.putInt(zr4.e, bundle3.b);
                    bundle2.putInt(zr4.f, bundle3.c);
                    ((ArrayList)object2).add(yg0.a((Spanned)charSequence, bundle3, 2, bundle2));
                }
                tp1[] tp1Array = (tp1[])charSequence.getSpans(0, charSequence.length(), tp1.class);
                int n18 = tp1Array.length;
                for (n16 = 0; n16 < n18; ++n16) {
                    ((ArrayList)object2).add(yg0.a((Spanned)charSequence, tp1Array[n16], 3, null));
                }
                p85Array = (p85[])charSequence.getSpans(0, charSequence.length(), p85.class);
                n18 = p85Array.length;
                for (n16 = n17; n16 < n18; ++n16) {
                    p85 p852 = p85Array[n16];
                    p852.getClass();
                    bundle2 = new Bundle();
                    bundle2.putString(p85.b, p852.a);
                    ((ArrayList)object2).add(yg0.a((Spanned)charSequence, p852, 4, bundle2));
                }
                if (!((ArrayList)object2).isEmpty()) {
                    bundle.putParcelableArrayList(t, (ArrayList)object2);
                }
            }
        }
        bundle.putSerializable(u, (Serializable)this.b);
        bundle.putSerializable(v, (Serializable)this.c);
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

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && ig0.class == object.getClass()) {
            object = (ig0)object;
            if (TextUtils.equals((CharSequence)this.a, (CharSequence)((ig0)object).a) && this.b == ((ig0)object).b && this.c == ((ig0)object).c) {
                Bitmap bitmap = ((ig0)object).d;
                Bitmap bitmap2 = this.d;
                if ((bitmap2 == null ? bitmap == null : bitmap != null && bitmap2.sameAs(bitmap)) && this.e == ((ig0)object).e && this.f == ((ig0)object).f && this.g == ((ig0)object).g && this.h == ((ig0)object).h && this.i == ((ig0)object).i && this.j == ((ig0)object).j && this.k == ((ig0)object).k && this.l == ((ig0)object).l && this.m == ((ig0)object).m && this.n == ((ig0)object).n && this.o == ((ig0)object).o && this.p == ((ig0)object).p && this.q == ((ig0)object).q && this.r == ((ig0)object).r) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float f16 = this.e;
        int n16 = this.f;
        int n17 = this.g;
        float f17 = this.h;
        int n18 = this.i;
        float f18 = this.j;
        float f19 = this.k;
        boolean bl5 = this.l;
        int n19 = this.m;
        int n26 = this.n;
        float f26 = this.o;
        int n27 = this.p;
        float f27 = this.q;
        int n28 = this.r;
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(f16), n16, n17, Float.valueOf(f17), n18, Float.valueOf(f18), Float.valueOf(f19), bl5, n19, n26, Float.valueOf(f26), n27, Float.valueOf(f27), n28);
    }
}

