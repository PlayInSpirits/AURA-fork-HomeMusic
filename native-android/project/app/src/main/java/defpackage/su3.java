package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.DragEvent;
import com.eddyizm.tempus.subsonic.models.Playlist;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class su3 {
    public static final int[] a = null;
    public static final long[] b = null;
    public static final Object[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final Object f = null;

    static {
        a = new int[0];
        b = new long[0];
        c = new Object[0];
        d = new int[]{R.attr.theme, app.homemusic.R.attr.theme};
        e = new int[]{app.homemusic.R.attr.materialThemeOverlay};
        f = new Object();
    }

    public static final String A(Element r6, String r7) {
        ArrayList r0 = new ArrayList();
        NodeList r8 = r6.getChildNodes();
        int r1 = r8.getLength();
        int r2 = 0;
    L3:
        String r3 = null;
        Element r4 = null;
        r3 = null;
        if (r2 >= r1) goto L14;
        Node r5 = r8.item(r2);
        if ((r5 instanceof Element) == false) goto L8;
        r4 = (Element) r5;
    L8:
        if (r4 == null) goto L13;
        String r9 = r4.getTagName();
        r9.getClass();
        if (qm4.E0(r9, ':').equals(r7) == false) goto L13;
        r0.add(r4);
    L13:
        r2 = r2 + 1;
        goto L3
    L14:
        Element r10 = (Element) q40.x0(r0);
        if (r10 == null) goto L19;
        String r11 = r10.getTextContent();
        if (r11 == null) goto L19;
        r3 = qm4.K0(r11).toString();
    L19:
        if (r3 != null) goto L22;
        return "";
    L22:
        return r3;
    }

    public static Context H(Context r2, AttributeSet r3, int r4, int r5) {
        TypedArray r6 = r2.obtainStyledAttributes(r3, e, r4, r5);
        int r0 = r6.getResourceId(0, 0);
        r6.recycle();
        if ((r2 instanceof ud0) == true) goto L5;
    L7:
        boolean r7 = false;
    L8:
        if (r0 == 0) goto L18;
        if (r7 == true) goto L18;
        ud0 r8 = new ud0(r2, r0);
        TypedArray r9 = r2.obtainStyledAttributes(r3, d);
        int r10 = r9.getResourceId(0, 0);
        int r11 = r9.getResourceId(1, 0);
        r9.recycle();
        if (r10 != 0) goto L15;
        r10 = r11;
    L15:
        if (r10 == 0) goto L17;
        r8.getTheme().applyStyle(r10, true);
    L17:
        return r8;
    L18:
        return r2;
    L5:
        if (((ud0) r2).a != r0) goto L7;
        r7 = true;
        goto L8
    }

    public static Class I(Class r1) {
        if (r1 != Integer.TYPE) goto L7;
        return Integer.class;
    L7:
        if (r1 != Float.TYPE) goto L11;
        return Float.class;
    L11:
        if (r1 != Byte.TYPE) goto L15;
        return Byte.class;
    L15:
        if (r1 != Double.TYPE) goto L19;
        return Double.class;
    L19:
        if (r1 != Long.TYPE) goto L23;
        return Long.class;
    L23:
        if (r1 != Character.TYPE) goto L27;
        return Character.class;
    L27:
        if (r1 != Boolean.TYPE) goto L31;
        return Boolean.class;
    L31:
        if (r1 != Short.TYPE) goto L35;
        return Short.class;
    L35:
        if (r1 != Void.TYPE) goto L38;
        return Void.class;
    L38:
        return r1;
    }

    public static aw a(int r2, int r3, wv r4) {
        int r5 = r3 & 2;
        wv r0 = wv.n;
        if (r5 == 0) goto L6;
        r4 = r0;
    L6:
        if (r2 != (-2)) goto L8;
        if (r4 != r0) goto L33;
        y00.d.getClass();
        return new aw(x00.b);
    L33:
        return new t90(1, r4);
    L8:
        if (r2 == (-1)) goto L24;
        if (r2 != 0) goto L11;
        if (r4 != r0) goto L23;
        return new aw(0);
    L23:
        return new t90(1, r4);
    L11:
        if (r2 == Integer.MAX_VALUE) goto L18;
        if (r4 != r0) goto L16;
        return new aw(r2);
    L16:
        return new t90(r2, r4);
    L18:
        return new aw(Integer.MAX_VALUE);
    L24:
        if (r4 == r0) goto L26;
        kf2.n("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    L26:
        return new t90(1, wv.o);
    }

    public static final void b(gf1 r6, final dx2 r7, final q82 r8, final pc3 r9, rg1 r10, int r11) {
        r10.S(1055276397);
        if (r10.g(r6) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r0 | r11;
        if (r10.e(r7) == false) goto L9;
        int r2 = 32;
    L10:
        int r3 = r1 | r2;
        if (r10.e(r8) == false) goto L13;
        int r4 = 256;
    L14:
        int r5 = r3 | r4;
        if (r10.e(r9) == false) goto L17;
        int r12 = 2048;
    L18:
        int r13 = r5 | r12;
        if ((r13 & 1171) == 1170) goto L21;
        boolean r14 = true;
    L23:
        if (r10.K(r13 & 1, r14) == false) goto L25;
        final b13 r15 = uc5.S(r6, r10);
        q05.a(fh0.w(-933153643, new e82(r8, r7, r9, r15), r10), r10, 6);
    L26:
        lv3 r16 = r10.p();
        if (r16 == null) goto L30;
        r16.d = new rt1(r6, r7, r8, r9, r11);
        return;
    L30:
        return;
    L25:
        r10.N();
        goto L26
    L21:
        r14 = false;
        goto L23
    L17:
        r12 = 1024;
        goto L18
    L13:
        r4 = 128;
        goto L14
    L9:
        r2 = 16;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public static final Object c(q64 r9, float r10, xd r11, ui0 r12, if1 r13, wd0 r14) {
        if ((r14 instanceof yg4) == false) goto L7;
        yg4 r0 = (yg4) r14;
        int r1 = r0.r;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.r = r1 - Integer.MIN_VALUE;
    L8:
        Object r15 = r0.q;
        int r2 = r0.r;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        float r16 = r0.n;
        gx3 r17 = r0.p;
        r11 = r0.o;
        kb4.X(r15);
    L23:
        return new ud(new Float(r16 - r17.n), r11);
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r15);
        gx3 r5 = new gx3();
        if (((Number) r11.a()).floatValue() != 0.0f) goto L17;
        boolean r18 = true;
    L18:
        xg4 r3 = new xg4(r10, r5, r9, r13, 0);
        r0.o = r11;
        r0.p = r5;
        r0.n = r10;
        r0.r = 1;
        Object r19 = j51.g(r11, r12, !r18, r3, r0);
        xe0 r110 = xe0.n;
        if (r19 != r110) goto L21;
        return r110;
    L21:
        r16 = r10;
        r17 = r5;
        goto L23
    L17:
        r18 = false;
    L7:
        r0 = new yg4(r14);
        goto L8
    }

    public static final Object d(q64 r16, float r17, float r18, xd r19, ck4 r20, if1 r21, wd0 r22) {
        float r0 = r17;
        if ((r22 instanceof zg4) == false) goto L8;
        zg4 r2 = (zg4) r22;
        int r3 = r2.s;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L8;
        r2.s = r3 - Integer.MIN_VALUE;
    L7:
        zg4 r8 = r2;
        Object r1 = r8.r;
        int r4 = r8.s;
        if (r4 == 0) goto L15;
        if (r4 != 1) goto L13;
        float r5 = r8.o;
        float r6 = r8.n;
        gx3 r7 = r8.q;
        xd r9 = r8.p;
        kb4.X(r1);
        float r10 = r5;
        r0 = r6;
    L24:
        return new ud(new Float(r0 - r7.n), j51.p(r9, 0.0f, m(((Number) r9.a()).floatValue(), r10), 29));
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        kb4.X(r1);
        gx3 r12 = new gx3();
        r10 = ((Number) r19.a()).floatValue();
        Float r11 = new Float(r0);
        if (((Number) r19.a()).floatValue() != 0.0f) goto L18;
        boolean r13 = true;
    L19:
        xg4 r14 = new xg4(r18, r12, r16, r21, 1);
        r8.p = r19;
        r8.q = r12;
        r8.n = r0;
        r8.o = r10;
        r8.s = 1;
        Object r15 = j51.h(r19, r11, r20, !r13, r14, r8);
        xe0 r23 = xe0.n;
        if (r15 != r23) goto L22;
        return r23;
    L22:
        r9 = r19;
        r7 = r12;
        goto L24
    L18:
        r13 = false;
    L8:
        r2 = new zg4(r22);
        goto L7
    }

    public static final int e(int r5, f13 r6) {
        int r0 = r6.p - 1;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        int r2 = ((r0 - r1) / 2) + r1;
        Object[] r3 = r6.n;
        int r4 = ((f12) r3[r2]).a;
        if (r4 == r5) goto L10;
        if (r4 < r5) goto L8;
        r0 = r2 - 1;
        goto L3
    L8:
        r1 = r2 + 1;
        if (r5 >= ((f12) r3[r1]).a) goto L3;
    L10:
        return r2;
    L12:
        return r1;
    }

    public static final void f(mj4 r8) {
        int r0 = r8.q;
        int[] r1 = r8.o;
        Object[] r2 = r8.p;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r0) goto L10;
        Object r6 = r2[r4];
        if (r6 == f) goto L9;
        if (r4 == r5) goto L8;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L8:
        r5 = r5 + 1;
    L9:
        r4 = r4 + 1;
        goto L3
    L10:
        r8.n = false;
        r8.q = r5;
    }

    public static final void g(vd r1, q64 r2, if1 r3, float r4) {
        float r5 = r2.a(r4);     // Catch: CancellationException -> L4
    L5:
        r3.invoke(Float.valueOf(r5));
        if (Math.abs(r4 - r5) <= 0.5f) goto L11;
        r1.a();
        return;
    L11:
        return;
    L4:
        r1.a();
        r5 = 0.0f;
        goto L5
    }

    public static final int h(int r3, int r4, int[] r5) {
        r5.getClass();
        int r6 = r3 - 1;
        int r0 = 0;
    L3:
        if (r0 > r6) goto L11;
        int r1 = (r0 + r6) >>> 1;
        int r2 = r5[r1];
        if (r2 < r4) goto L6;
        if (r2 <= r4) goto L9;
        r6 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r0 = r1 + 1;
        goto L3
    L11:
        return ~r0;
    }

    public static final int i(long[] r4, int r5, long r6) {
        r4.getClass();
        int r7 = r5 - 1;
        int r0 = 0;
    L3:
        if (r0 > r7) goto L11;
        int r1 = (r0 + r7) >>> 1;
        long r2 = r4[r1];
        if (r2 < r6) goto L6;
        if (r2 <= r6) goto L9;
        r7 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r0 = r1 + 1;
        goto L3
    L11:
        return ~r0;
    }

    public static ArrayList j(byte[] r6) {
        long r2 = (((long) (((r6[11] & 255) << 8) | (r6[10] & 255))) * 1000000000) / 48000;
        ArrayList r0 = new ArrayList(3);
        r0.add(r6);
        r0.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(r2).array());
        r0.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return r0;
    }

    public static float k(float r1, float r2, float r3) {
        if (r1 >= r2) goto L6;
        return r2;
    L6:
        if (r1 <= r3) goto L8;
        return r3;
    L8:
        return r1;
    }

    public static int l(int r0, int r1, int r2) {
        if (r0 >= r1) goto L4;
        return r1;
    L4:
        if (r0 <= r2) goto L6;
        return r2;
    L6:
        return r0;
    }

    public static final float m(float r2, float r3) {
        if (r3 != 0.0f) goto L6;
        return 0.0f;
    L6:
        if (r3 <= 0.0f) goto L11;
        if (r2 > r3) goto L12;
    L13:
        return r2;
    L12:
        return r3;
    L11:
        if (r2 >= r3) goto L13;
        goto L12
    }

    public static k44 o(byte[] r3, Parcelable.Creator r4) {
        ji2.m(r4);
        Parcel r0 = Parcel.obtain();
        r0.unmarshall(r3, 0, r3.length);
        r0.setDataPosition(0);
        k44 r5 = (k44) r4.createFromParcel(r0);
        r0.recycle();
        return r5;
    }

    public static ArrayList p(Element r6, String r7) {
        ArrayList r0 = new ArrayList();
        NodeList r8 = r6.getChildNodes();
        int r1 = r8.getLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L14;
        Node r3 = r8.item(r2);
        if ((r3 instanceof Element) == false) goto L7;
        Element r4 = (Element) r3;
    L8:
        if (r4 == null) goto L13;
        String r5 = r4.getTagName();
        r5.getClass();
        if (qm4.E0(r5, ':').equals(r7) == false) goto L13;
        r0.add(r4);
    L13:
        r2 = r2 + 1;
        goto L3
    L7:
        r4 = null;
        goto L8
    L14:
        return r0;
    }

    public static final List q(String r4, List r5) {
        r5.getClass();
        r4.getClass();
        if (qm4.u0(r4) == false) goto L5;
        return r5;
    L5:
        ArrayList r0 = new ArrayList();
        Iterator r6 = r5.iterator();
    L7:
        if (r6.hasNext() == false) goto L14;
        Object r1 = r6.next();
        ux3 r3 = qn1.a;
        String r2 = ((Playlist) r1).getName();
        if (r2 != null) goto L12;
        r2 = "";
    L12:
        if (qn1.a(r2, r4) == false) goto L7;
        r0.add(r1);
        goto L7
    L14:
        return r0;
    }

    public static j23 s(e75 r3) {
        sf0 r0 = sf0.b;
        r0.getClass();
        bq4 r1 = new bq4(r3, j23.c, r0);
        i30 r4 = kx3.a(j23.class);
        String r2 = r4.b();
        if (r2 != null) goto L5;
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L5:
        return (j23) r1.l(r4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r2));
    }

    public static long t(byte r5, byte r6) {
        int r0 = r5 & 255;
        int r7 = r5 & 3;
        if (r7 == 0) goto L8;
        int r3 = 2;
        if (r7 == 1) goto L9;
        if (r7 == 2) goto L9;
        r3 = r6 & 63;
    L9:
        int r8 = r0 >> 3;
        int r9 = r8 & 3;
        if (r8 < 16) goto L13;
        int r10 = 2500 << r9;
    L19:
        return ((long) r3) * ((long) r10);
    L13:
        if (r8 < 12) goto L15;
        r10 = 10000 << (r8 & 1);
        goto L19
    L15:
        if (r9 != 3) goto L17;
        r10 = 60000;
        goto L19
    L17:
        r10 = 10000 << r9;
        goto L19
    L8:
        r3 = 1;
        goto L9
    }

    public static final long u(zg5 r6) {
        DragEvent r7 = (DragEvent) r6.n;
        float r0 = r7.getX();
        float r8 = r7.getY();
        return (Float.floatToRawIntBits(r0) << 32) | (((long) Float.floatToRawIntBits(r8)) & 4294967295L);
    }

    public static final long v(int r2) {
        return z(4294967296L, r2);
    }

    public static final long z(long r4, float r6) {
        long r5 = r4 | (((long) Float.floatToRawIntBits(r6)) & 4294967295L);
        ct4[] r7 = bt4.b;
        return r5;
    }

    public abstract Object B(Intent r1, int r2);

    public void C(boolean r1) {
    }

    public abstract void D(boolean r1);

    public abstract void E(int r1);

    public abstract void F(int r1);

    public abstract void G(ArrayList r1);

    public abstract Intent n(nc1 r1, Object r2);

    public abstract void r(kc4 r1, float r2, float r3);

    public zh0 w(nc1 r1, Object r2) {
        return null;
    }

    public abstract void x(int r1);

    public abstract boolean y();
}
