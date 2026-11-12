package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.display.DisplayManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class te5 {
    public static final Class[] a = null;
    public static final f01 b = null;
    public static final m94 c = null;
    public static final m94 d = null;
    public static final m94 e = null;

    static {
        a = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        b = new f01(1, "NO_THREAD_ELEMENTS");
        c = new m94(10);
        d = new m94(11);
        e = new m94(12);
    }

    public static String A(Context r3, ComponentName r4) {
        PackageManager r0 = r3.getPackageManager();
        if (Build.VERSION.SDK_INT < 29) goto L5;
        int r1 = 269222528;
    L6:
        ActivityInfo r5 = r0.getActivityInfo(r4, r1);
        String r2 = r5.parentActivityName;
        if (r2 == null) goto L9;
        return r2;
    L9:
        Bundle r6 = r5.metaData;
        if (r6 != null) goto L12;
        return null;
    L12:
        String r7 = r6.getString("android.support.PARENT_ACTIVITY");
        if (r7 != null) goto L16;
        return null;
    L16:
        if (r7.charAt(0) == '.') goto L18;
        return r7;
    L18:
        return r3.getPackageName() + r7;
    L5:
        r1 = 787072;
        goto L6
    }

    public static final boolean B(ba1 r2) {
        f63 r0 = r2.u;
        if (r0 == null) goto L15;
        c72 r1 = r0.H;
        if (r1 != null) goto L7;
        return false;
    L7:
        if (r1.H() != true) goto L18;
        f63 r3 = r2.u;
        if (r3 == null) goto L19;
        c72 r4 = r3.H;
        if (r4 != null) goto L13;
        return false;
    L13:
        if (r4.G() != true) goto L21;
        return true;
    L21:
        return false;
    L19:
        return false;
    L18:
        return false;
    L15:
        return false;
    }

    public static boolean C(XmlPullParser r2, String r3) {
        if (r2.getEventType() == 3) goto L5;
        return false;
    L5:
        if (r2.getName().equals(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean D(XmlPullParser r2, String r3) {
        if (r2.getEventType() == 2) goto L5;
        return false;
    L5:
        if (r2.getName().equals(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static int E(int r1, int r2, int r3) {
        if ((r2 & 8) == 0) goto L5;
        r1 = r1 - 1;
    L5:
        if (r3 <= r1) goto L7;
        mj0.i(xa3.e(r3, r1, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    L7:
        return r1 - r3;
    }

    public static dx2 F(dx2 r1, y43 r2) {
        return r1.c(new b53(r2));
    }

    public static gc G(byte[] r13) {
        be3 r0 = new be3(r13);
        if (r0.c >= 32) goto L5;
        return null;
    L5:
        r0.N(0);
        int r1 = r0.a();
        int r3 = r0.m();
        if (r3 == r1) goto L9;
        l93.q0("PsshAtomUtil", "Advertised atom size (" + r3 + ") does not match buffer size: " + r1);
        return null;
    L9:
        int r2 = r0.m();
        if (r2 == 1886614376) goto L13;
        xa3.m(r2, "Atom type is not pssh: ", "PsshAtomUtil");
        return null;
    L13:
        int r4 = wu.e(r0.m());
        if (r4 <= 1) goto L17;
        xa3.m(r4, "Unsupported pssh version: ", "PsshAtomUtil");
        return null;
    L17:
        UUID r5 = new UUID(r0.u(), r0.u());
        if (r4 != 1) goto L22;
        int r6 = r0.E();
        UUID[] r7 = new UUID[r6];
        int r8 = 0;
    L20:
        if (r8 >= r6) goto L23;
        r7[r8] = new UUID(r0.u(), r0.u());
        r8 = r8 + 1;
    L23:
        int r9 = r0.E();
        int r10 = r0.a();
        if (r9 == r10) goto L27;
        l93.q0("PsshAtomUtil", "Atom data size (" + r9 + ") does not match the bytes left: " + r10);
        return null;
    L27:
        byte[] r11 = new byte[r9];
        r0.k(r11, 0, r9);
        return new gc(r5, r4, r11, r7);
    L22:
        r7 = null;
        goto L23
    }

    public static byte[] H(UUID r3, byte[] r4) {
        gc r5 = G(r4);
        if (r5 != null) goto L5;
        return null;
    L5:
        UUID r1 = (UUID) r5.b;
        if (r3.equals(r1) == true) goto L10;
        l93.q0("PsshAtomUtil", "UUID mismatch. Expected: " + r3 + ", got: " + r1 + ".");
        return null;
    L10:
        return (byte[]) r5.c;
    }

    public static final boolean I(w03 r3, Object r4, Object r5) {
        Object r0 = r3.g(r4);
        if (r0 != null) goto L6;
        return false;
    L6:
        if ((r0 instanceof x03) == false) goto L14;
        x03 r1 = (x03) r0;
        boolean r6 = r1.l(r5);
        if (r6 == true) goto L10;
    L12:
        return r6;
    L10:
        if (r1.g() == false) goto L12;
        r3.j(r4);
        goto L12
    L14:
        if (r0.equals(r5) == false) goto L17;
        r3.j(r4);
        return true;
    L17:
        return false;
    }

    public static final void J(w03 r13, Object r14) {
        long[] r0 = r13.a;
        int r1 = r0.length - 2;
        if (r1 < 0) goto L23;
        int r3 = 0;
    L5:
        long r4 = r0[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r6 = 8 - ((~(r3 - r1)) >>> 31);
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L20;
        if ((255 & r4) >= 128) goto L19;
        int r9 = (r3 << 3) + r8;
        Object r10 = r13.b[r9];
        Object r11 = r13.c[r9];
        if ((r11 instanceof x03) == false) goto L14;
        x03 r12 = (x03) r11;
        r12.l(r14);
        boolean r15 = r12.g();
    L17:
        if (r15 == false) goto L19;
        r13.k(r9);
        goto L19
    L14:
        if (r11 != r14) goto L16;
        r15 = true;
        goto L17
    L16:
        r15 = false;
    L19:
        r4 = r4 >> 8;
        r8 = r8 + 1;
        goto L8
    L20:
        if (r6 == 8) goto L21;
        return;
    L21:
        if (r3 == r1) goto L31;
        r3 = r3 + 1;
        goto L5
    L31:
        return;
    }

    public static final void K(ne0 r4, Object r5) {
        if (r5 != b) goto L6;
        return;
    L6:
        if ((r5 instanceof mt4) == false) goto L14;
        mt4 r6 = (mt4) r5;
        ht4[] r7 = r6.c;
        int r0 = r7.length - 1;
        if (r0 < 0) goto L13;
    L9:
        int r1 = r0 - 1;
        ht4 r2 = r7[r0];
        r2.getClass();
        r2.a(r6.b[r0]);
        if (r1 < 0) goto L18;
        r0 = r1;
        goto L9
    L18:
        return;
    L13:
        return;
    L14:
        Object r8 = r4.s(d, null);
        r8.getClass();
        ((ht4) r8).a(r5);
    }

    public static final void L(v3 r7, i94 r8) {
        e94 r0 = r8.k();
        Object r1 = r0.n.g(n94.f);
        Object r2 = null;
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        o40 r3 = (o40) r1;
        if (r3 == null) goto L9;
        r7.j(t3.a(r3.a, r3.b, 0));
        return;
    L9:
        ArrayList r4 = new ArrayList();
        e94 r5 = r8.k();
        Object r6 = r5.n.g(n94.e);
        if (r6 == null) goto L13;
        r2 = r6;
    L13:
        if (r2 == null) goto L21;
        List r9 = i94.j(4, r8);
        int r10 = r9.size();
        int r11 = 0;
    L15:
        if (r11 >= r10) goto L21;
        i94 r12 = (i94) r9.get(r11);
        e94 r13 = r12.k();
        if (r13.n.c(n94.G) == false) goto L19;
        r4.add(r12);
    L19:
        r11 = r11 + 1;
    L21:
        if (r4.isEmpty() == true) goto L33;
        boolean r14 = e(r4);
        int r15 = 1;
        if (r14 == false) goto L25;
        int r16 = 1;
    L26:
        if (r14 == false) goto L28;
        r15 = r4.size();
    L28:
        r7.j(t3.a(r16, r15, 0));
        return;
    L25:
        r16 = r4.size();
        goto L26
    }

    public static void M(Outline r2, Path r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 30) goto L7;
        l3.u(r2, r3);
        return;
    L7:
        if (r0 < 29) goto L11;
        r2.setConvexPath(r3);     // Catch: IllegalArgumentException -> L14
        return;
    L17:
        return;
    L11:
        if (r3.isConvex() == false) goto L18;
        r2.setConvexPath(r3);
        return;
    }

    public static void N(List r2, ro3 r3, int r4, int r5) {
        int r0 = r2.size() - 1;
    L3:
        if (r0 <= r5) goto L8;
        if (r3.apply(r2.get(r0)) == false) goto L7;
        r2.remove(r0);
    L7:
        r0 = r0 - 1;
        goto L3
    L8:
        int r6 = r5 - 1;
    L9:
        if (r6 < r4) goto L11;
        r2.remove(r6);
        r6 = r6 - 1;
        goto L9
    }

    public static final Object O(ne0 r2) {
        Object r3 = r2.s(c, 0);
        r3.getClass();
        return r3;
    }

    public static void P(rm3 r2, ea2 r3) {
        r92 r0 = r3.h;
        if (r0 != r92.o) goto L5;
    L9:
        r2.P();
        return;
    L5:
        if (r0.compareTo(r92.q) >= 0) goto L9;
        r3.a(new tl0(3, r3, r2));
    }

    public static final void Q() {
        throw new UnsupportedOperationException();
    }

    public static final Object R(ne0 r1, Object r2) {
        if (r2 != null) goto L5;
        r2 = O(r1);
    L5:
        if (r2 != 0) goto L9;
        return b;
    L9:
        if ((r2 instanceof Integer) == false) goto L13;
        mt4 r0 = new mt4(((Number) r2).intValue(), r1);
        return r1.s(e, r0);
    L13:
        return ((ht4) r2).c();
    }

    public static final int S(float r3, float[] r4, int r5) {
        float r0 = 0.0f;
        if (r3 < 0.0f) goto L7;
        r0 = r3;
    L7:
        if (r0 <= 1.0f) goto L10;
        r0 = 1.0f;
    L10:
        if (Math.abs(r0 - r3) <= 1.05E-6f) goto L12;
        r0 = Float.NaN;
    L12:
        r4[r5] = r0;
        return !Float.isNaN(r0) ? 1 : 0;
    }

    public static final td0 a(ne0 r2) {
        if (r2.K(fz0.h0) != null) goto L7;
        r2 = r2.J(gb.a());
    L7:
        return new td0(r2);
    }

    public static final void b(w03 r4, Object r5, Object r6) {
        int r0 = r4.f(r5);
        if (r0 >= 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        Object r2 = null;
    L9:
        if (r2 != null) goto L12;
    L17:
        if (r1 == false) goto L20;
        int r3 = ~r0;
        r4.b[r3] = r5;
        r4.c[r3] = r6;
        return;
    L20:
        r4.c[r0] = r6;
        return;
    L12:
        if ((r2 instanceof x03) == false) goto L14;
        ((x03) r2).a(r6);
    L16:
        r6 = r2;
        goto L17
    L14:
        if (r2 == r6) goto L16;
        x03 r7 = new x03();
        r7.a(r2);
        r7.a(r6);
        r6 = r7;
        goto L17
    L8:
        r2 = r4.c[r0];
        goto L9
    L5:
        r1 = false;
        goto L6
    }

    public static final void c(x65 r2, rm3 r3, ea2 r4) {
        r3.getClass();
        r4.getClass();
        y65 r5 = r2.a;
        if (r5 == null) goto L12;
        xi4 r1 = r5.a;
        monitor-enter(r1);
        AutoCloseable r6 = (AutoCloseable) r5.b.get("androidx.lifecycle.savedstate.vm.tag");     // Catch: Throwable -> L9
        monitor-exit(r1);
    L13:
        c54 r7 = (c54) r6;
        if (r7 != null) goto L16;
        return;
    L16:
        if (r7.p == true) goto L22;
        r7.f(r3, r4);
        P(r3, r4);
        return;
    L22:
        return;
    L9:
        th = move-exception;
        throw th;
    L12:
        r6 = null;
        goto L13
    }

    public static byte[] d(UUID r6, UUID[] r7, byte[] r8) {
        if (r8 == null) goto L5;
        int r1 = r8.length;
    L6:
        int r2 = r1 + 32;
        if (r7 == null) goto L9;
        r2 = r2 + ((r7.length * 16) + 4);
    L9:
        ByteBuffer r3 = ByteBuffer.allocate(r2);
        r3.putInt(r2);
        r3.putInt(1886614376);
        if (r7 == null) goto L12;
        int r4 = 16777216;
    L13:
        r3.putInt(r4);
        r3.putLong(r6.getMostSignificantBits());
        r3.putLong(r6.getLeastSignificantBits());
        if (r7 == null) goto L18;
        r3.putInt(r7.length);
        int r9 = r7.length;
        int r5 = 0;
    L16:
        if (r5 >= r9) goto L18;
        UUID r10 = r7[r5];
        r3.putLong(r10.getMostSignificantBits());
        r3.putLong(r10.getLeastSignificantBits());
        r5 = r5 + 1;
    L18:
        if (r8 != null) goto L20;
    L22:
        r3.putInt(0);
    L24:
        return r3.array();
    L20:
        if (r8.length == 0) goto L22;
        r3.putInt(r8.length);
        r3.put(r8);
        goto L24
    L12:
        r4 = 0;
        goto L13
    L5:
        r1 = 0;
        goto L6
    }

    public static final boolean e(ArrayList r14) {
        if (r14.size() >= 2) goto L6;
    L27:
        return true;
    L6:
        if (r14.size() > 1) goto L8;
        List r15 = u01.n;
    L13:
        if (r15.size() != 1) goto L16;
        long r6 = ((g83) q40.w0(r15)).a;
    L26:
        if (Float.intBitsToFloat((int) (4294967295L & r6)) < Float.intBitsToFloat((int) (r6 >> 32))) goto L27;
        return false;
    L16:
        if (r15.isEmpty() == false) goto L18;
        gc2.b("Empty collection can't be reduced.");
    L18:
        Object r0 = q40.w0(r15);
        int r7 = r15.size() - 1;
        if (1 > r7) goto L24;
        int r8 = 1;
    L21:
        r0 = new g83(g83.e(((g83) r0).a, ((g83) r15.get(r8)).a));
        if (r8 == r7) goto L24;
        r8 = r8 + 1;
    L24:
        r6 = ((g83) r0).a;
        goto L26
    L8:
        ArrayList r1 = new ArrayList();
        Object r9 = r14.get(0);
        int r10 = r14.size() - 1;
        int r11 = 0;
    L9:
        if (r11 >= r10) goto L11;
        r11 = r11 + 1;
        Object r12 = r14.get(r11);
        i94 r13 = (i94) r12;
        i94 r16 = (i94) r9;
        float r17 = Math.abs(Float.intBitsToFloat((int) (r16.g().a() >> 32)) - Float.intBitsToFloat((int) (r13.g().a() >> 32)));
        float r18 = Math.abs(Float.intBitsToFloat((int) (r16.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (r13.g().a() & 4294967295L)));
        r1.add(new g83((Float.floatToRawIntBits(r17) << 32) | (((long) Float.floatToRawIntBits(r18)) & 4294967295L)));
        r9 = r12;
        goto L9
    L11:
        r15 = r1;
        goto L13
    }

    public static final boolean f(Object r3) {
        if ((r3 instanceof nh4) == false) goto L16;
        nh4 r4 = (nh4) r3;
        if (r4.c() != rv2.s) goto L7;
    L10:
        Object r5 = r4.getValue();
        if (r5 != null) goto L14;
        return true;
    L14:
        return f(r5);
    L7:
        if (r4.c() == rv2.D) goto L10;
        if (r4.c() == rv2.A) goto L10;
    L28:
        return false;
    L16:
        if ((r3 instanceof sf1) == true) goto L18;
    L20:
        int r0 = 0;
    L22:
        if (r0 >= 7) goto L28;
        if (a[r0].isInstance(r3) == true) goto L31;
        r0 = r0 + 1;
        goto L22
    L31:
        return true;
    L18:
        if ((r3 instanceof Serializable) == false) goto L20;
        goto L20
    }

    public static final void g(we0 r2, ModifierNodeDetachedCancellationException r3) {
        s22 r0 = (s22) r2.e().K(fz0.h0);
        if (r0 == null) goto L6;
        r0.f(r3);
        return;
    L6:
        mj0.g(r2, "Scope cannot be cancelled because it does not have a job: ");
    }

    public static Drawable h(Drawable r2, Drawable r3, int r4, int r5) {
        if (r2 != null) goto L4;
        return r3;
    L4:
        if (r3 != null) goto L7;
        return r2;
    L7:
        if (r4 != (-1)) goto L12;
        r4 = r3.getIntrinsicWidth();
        if (r4 != (-1)) goto L12;
        r4 = r2.getIntrinsicWidth();
    L12:
        if (r5 != (-1)) goto L18;
        r5 = r3.getIntrinsicHeight();
        if (r5 != (-1)) goto L18;
        r5 = r2.getIntrinsicHeight();
    L18:
        if (r4 <= r2.getIntrinsicWidth()) goto L20;
    L22:
        float r6 = r4 / r5;
        if (r6 < (r2.getIntrinsicWidth() / r2.getIntrinsicHeight())) goto L25;
        int r7 = r2.getIntrinsicWidth();
        r5 = (int) (r7 / r6);
        r4 = r7;
    L26:
        LayerDrawable r0 = new LayerDrawable(new Drawable[]{r2, r3});
        r0.setLayerSize(1, r4, r5);
        r0.setLayerGravity(1, 17);
        return r0;
    L25:
        r5 = r2.getIntrinsicHeight();
        r4 = (int) (r6 * r5);
        goto L26
    L20:
        if (r5 > r2.getIntrinsicHeight()) goto L22;
        goto L22
    }

    public static w03 i() {
        long[] r0 = v54.a;
        return new w03();
    }

    public static final Object j(wf1 r2, vd0 r3) {
        e64 r0 = new e64(r3, r3.getContext());
        return h12.O(r0, r0, r2);
    }

    public static final c54 k(rm3 r1, ea2 r2, String r3, Bundle r4) {
        r1.getClass();
        r2.getClass();
        c54 r0 = new c54(r3, ya4.j(r1.A(r3), r4));
        r0.f(r1, r2);
        P(r1, r2);
        return r0;
    }

    public static Drawable l(Drawable r0, ColorStateList r1, PorterDuff.Mode r2) {
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r1 == null) goto L9;
        r0 = r0.mutate();
        if (r2 == null) goto L9;
        r0.setTintMode(r2);
    L9:
        return r0;
    }

    public static final long m() {
        return Thread.currentThread().getId();
    }

    public static boolean n(Context r5) {
        DisplayManager r6 = (DisplayManager) r5.getSystemService("display");
        if (r6 == null) goto L5;
        Display r7 = r6.getDisplay(0);
    L6:
        if (r7 != null) goto L8;
    L19:
        return false;
    L8:
        if (gm0.x(r7) == false) goto L19;
        Display.HdrCapabilities r8 = r7.getHdrCapabilities();
        if (r8 == null) goto L19;
        int[] r9 = r8.getSupportedHdrTypes();
        int r1 = r9.length;
        int r2 = 0;
    L14:
        if (r2 >= r1) goto L19;
        if (r9[r2] == 1) goto L17;
        r2 = r2 + 1;
        goto L14
    L17:
        return true;
    L5:
        r7 = null;
        goto L6
    }

    public static final boolean o(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final ba1 p(ba1 r1) {
        ba1 r2 = ((ey) ((ra) j51.P(r1)).getFocusOwner()).f();
        if (r2 != null) goto L5;
        return null;
    L5:
        if (r2.A == false) goto L9;
        return r2;
    L9:
        return null;
    }

    public static View q(View r4, int r5) {
        if (Build.VERSION.SDK_INT >= 29) goto L18;
        Method r0 = ra.a1;
        if (r0 != null) goto L8;
        r0 = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
        ra.a1 = r0;
        r0.setAccessible(true);
    L8:
        if (h12.c(r0.invoke(r4, null), Integer.valueOf(r5)) == false) goto L11;
        return r4;
    L11:
        if ((r4 instanceof ViewGroup) == false) goto L18;
        ViewGroup r6 = (ViewGroup) r4;
        int r1 = r6.getChildCount();
        int r2 = 0;
    L13:
        if (r2 >= r1) goto L18;
        View r3 = q(r6.getChildAt(r2), r5);
        if (r3 != null) goto L16;
        r2 = r2 + 1;
        goto L13
    L16:
        return r3;
    L18:
        return null;
    }

    public static final wv3 r(ba1 r2) {
        if (r2.A == false) goto L16;
        f63 r0 = r2.u;
        if (r0 == null) goto L16;
        q62 r1 = wr1.n(r0);
        if (r1.f() == true) goto L11;
        r1 = null;
    L11:
        if (r1 == null) goto L16;
        return r2.t0(r1);
    L16:
        return wv3.e;
    }

    public static final ba1 s(ba1 r8) {
        boolean r0 = r8.n.A;
        if (r0 == false) goto L57;
        if (r0 == true) goto L7;
        cz1.b("visitChildren called on an unattached node");
    L7:
        f13 r1 = new f13(new cx2[16]);
        cx2 r9 = r8.n;
        cx2 r3 = r9.s;
        if (r3 != null) goto L10;
        j51.b(r1, r9);
    L11:
        int r10 = r1.p;
        if (r10 == 0) goto L57;
        cx2 r11 = (cx2) r1.k(r10 - 1);
        if ((r11.q & 1024) == 0) goto L15;
    L16:
        if (r11 == null) goto L11;
        if ((r11.p & 1024) != 0) goto L19;
        r11 = r11.s;
        goto L16
    L19:
        f13 r4 = null;
    L20:
        if (r11 == null) goto L11;
        if ((r11 instanceof ba1) == true) goto L23;
        if ((r11.p & 1024) == 0) goto L55;
        if ((r11 instanceof fo0) == false) goto L55;
        cx2 r5 = ((fo0) r11).C;
        int r6 = 0;
    L41:
        if (r5 == null) goto L53;
        if ((r5.p & 1024) == 0) goto L52;
        r6 = r6 + 1;
        if (r6 != 1) goto L47;
        r11 = r5;
        goto L52
    L47:
        if (r4 != null) goto L49;
        r4 = new f13(new cx2[16]);
    L49:
        if (r11 == null) goto L51;
        r4.b(r11);
        r11 = null;
    L51:
        r4.b(r5);
    L52:
        r5 = r5.s;
        goto L41
    L53:
        if (r6 == 1) goto L20;
    L55:
        r11 = j51.c(r4);
        goto L20
    L23:
        ba1 r12 = (ba1) r11;
        if (r12.n.A == false) goto L55;
        int r7 = r12.v0().ordinal();
        if (r7 == 0) goto L35;
        if (r7 == 1) goto L35;
        if (r7 == 2) goto L35;
        if (r7 == 3) goto L55;
        er1.n();
        return null;
    L35:
        return r12;
    L15:
        j51.b(r1, r11);
        goto L11
    L10:
        r1.b(r3);
    L57:
        return null;
    }

    public static String t(XmlPullParser r3, String r4) {
        int r0 = r3.getAttributeCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        if (r3.getAttributeName(r1).equals(r4) == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return r3.getAttributeValue(r1);
    L9:
        return null;
    }

    public static int[] u(int[] r3) {
        int r0 = 0;
    L4:
        if (r0 >= r3.length) goto L12;
        int r1 = r3[r0];
        if (r1 == 16842912) goto L7;
        if (r1 == 0) goto L9;
        r0 = r0 + 1;
        goto L4
    L9:
        int[] r4 = (int[]) r3.clone();
        r4[r0] = 16842912;
        return r4;
    L7:
        return r3;
    L12:
        int[] r2 = Arrays.copyOf(r3, r3.length + 1);
        r2[r3.length] = 16842912;
        return r2;
    }

    public static boolean v() {
    L21:
        return false;
    L3:
        if (ra.U0 != null) goto L5;
        ra.U0 = Class.forName("android.os.SystemProperties");     // Catch: Exception -> L21
    L5:
        Boolean r1 = null;
        if (ra.V0 != null) goto L12;
        Class r0 = ra.U0;     // Catch: Exception -> L21
        if (r0 == null) goto L10;
        Method r2 = r0.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});     // Catch: Exception -> L21
    L11:
        ra.V0 = r2;     // Catch: Exception -> L21
        goto L12
    L10:
        r2 = null;
    L12:
        Method r3 = ra.V0;     // Catch: Exception -> L21
        if (r3 == null) goto L15;
        Object r4 = r3.invoke(null, new Object[]{"debug.layout", Boolean.FALSE});     // Catch: Exception -> L21
    L17:
        if ((r4 instanceof Boolean) == false) goto L19;
        r1 = (Boolean) r4;     // Catch: Exception -> L21
    L19:
        return h12.c(r1, Boolean.TRUE);
    L15:
        r4 = null;
        goto L17
    }

    public static Object w(Iterable r2) {
        if ((r2 instanceof List) == false) goto L10;
        List r3 = (List) r2;
        if (r3.isEmpty() == false) goto L7;
        tb4.k();
        return null;
    L7:
        return r3.get(r3.size() - 1);
    L10:
        Iterator r4 = r2.iterator();
    L11:
        Object r0 = r4.next();
        if (r4.hasNext() == true) goto L11;
        return r0;
    }

    public static final int x(qc3 r4) {
        if (r4.e != hb3.n) goto L7;
        long r0 = r4.i() & 4294967295L;
    L6:
        return (int) r0;
    L7:
        r0 = r4.i() >> 32;
        goto L6
    }

    public static Intent y(df r3) {
        Intent r0 = r3.getParentActivityIntent();
        if (r0 == null) goto L21;
        return r0;
    L21:
        String r1 = A(r3, r3.getComponentName());     // Catch: PackageManager.NameNotFoundException -> L18
        if (r1 != null) goto L9;
        return null;
    L9:
        ComponentName r2 = new ComponentName(r3, r1);
    L16:
        Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + r1 + "' in manifest");
        return null;
    L11:
        if (A(r3, r2) != null) goto L15;
        return Intent.makeMainActivity(r2);
    L15:
        return new Intent().setComponent(r2);
    L18:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static Intent z(Context r2, ComponentName r3) {
        String r0 = A(r2, r3);
        if (r0 != null) goto L6;
        return null;
    L6:
        ComponentName r1 = new ComponentName(r3.getPackageName(), r0);
        if (A(r2, r1) != null) goto L11;
        return Intent.makeMainActivity(r1);
    L11:
        return new Intent().setComponent(r1);
    }
}
