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
import java.io.IOException;
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
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final f01 b = new f01(1, "NO_THREAD_ELEMENTS");
    public static final m94 c = new m94(10);
    public static final m94 d = new m94(11);
    public static final m94 e = new m94(12);

    public static String A(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final boolean B(ba1 ba1Var) {
        c72 c72Var;
        f63 f63Var;
        c72 c72Var2;
        f63 f63Var2 = ba1Var.u;
        return (f63Var2 == null || (c72Var = f63Var2.H) == null || !c72Var.H() || (f63Var = ba1Var.u) == null || (c72Var2 = f63Var.H) == null || !c72Var2.G()) ? false : true;
    }

    public static boolean C(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean D(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int E(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        mj0.i(xa3.e(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static dx2 F(dx2 dx2Var, y43 y43Var) {
        return dx2Var.c(new b53(y43Var));
    }

    public static gc G(byte[] bArr) {
        UUID[] uuidArr;
        be3 be3Var = new be3(bArr);
        if (be3Var.c < 32) {
            return null;
        }
        be3Var.N(0);
        int iA = be3Var.a();
        int iM = be3Var.m();
        if (iM != iA) {
            l93.q0("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = be3Var.m();
        if (iM2 != 1886614376) {
            xa3.m(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = wu.e(be3Var.m());
        if (iE > 1) {
            xa3.m(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(be3Var.u(), be3Var.u());
        if (iE == 1) {
            int iE2 = be3Var.E();
            uuidArr = new UUID[iE2];
            for (int i = 0; i < iE2; i++) {
                uuidArr[i] = new UUID(be3Var.u(), be3Var.u());
            }
        } else {
            uuidArr = null;
        }
        int iE3 = be3Var.E();
        int iA2 = be3Var.a();
        if (iE3 == iA2) {
            byte[] bArr2 = new byte[iE3];
            be3Var.k(bArr2, 0, iE3);
            return new gc(uuid, iE, bArr2, uuidArr);
        }
        l93.q0("PsshAtomUtil", "Atom data size (" + iE3 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] H(UUID uuid, byte[] bArr) {
        gc gcVarG = G(bArr);
        if (gcVarG == null) {
            return null;
        }
        UUID uuid2 = (UUID) gcVarG.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) gcVarG.c;
        }
        l93.q0("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static final boolean I(w03 w03Var, Object obj, Object obj2) {
        Object objG = w03Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof x03)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            w03Var.j(obj);
            return true;
        }
        x03 x03Var = (x03) objG;
        boolean zL = x03Var.l(obj2);
        if (zL && x03Var.g()) {
            w03Var.j(obj);
        }
        return zL;
    }

    public static final void J(w03 w03Var, Object obj) {
        boolean zG;
        long[] jArr = w03Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = w03Var.b[i4];
                        Object obj3 = w03Var.c[i4];
                        if (obj3 instanceof x03) {
                            x03 x03Var = (x03) obj3;
                            x03Var.l(obj);
                            zG = x03Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            w03Var.k(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void K(ne0 ne0Var, Object obj) {
        if (obj == b) {
            return;
        }
        if (!(obj instanceof mt4)) {
            Object objS = ne0Var.s(d, null);
            objS.getClass();
            ((ht4) objS).a(obj);
            return;
        }
        mt4 mt4Var = (mt4) obj;
        ht4[] ht4VarArr = mt4Var.c;
        int length = ht4VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ht4 ht4Var = ht4VarArr[length];
            ht4Var.getClass();
            ht4Var.a(mt4Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final void L(v3 v3Var, i94 i94Var) {
        Object objG = i94Var.k().n.g(n94.f);
        if (objG == null) {
            objG = null;
        }
        o40 o40Var = (o40) objG;
        if (o40Var != null) {
            v3Var.j(t3.a(o40Var.a, o40Var.b, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = i94Var.k().n.g(n94.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listI = i94Var.i((4 & 1) != 0 ? !i94Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                i94 i94Var2 = (i94) listI.get(i);
                if (i94Var2.k().n.c(n94.G)) {
                    arrayList.add(i94Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zE = e(arrayList);
        v3Var.j(t3.a(zE ? 1 : arrayList.size(), zE ? arrayList.size() : 1, 0));
    }

    public static void M(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public static void N(List list, ro3 ro3Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (ro3Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final Object O(ne0 ne0Var) {
        Object objS = ne0Var.s(c, 0);
        objS.getClass();
        return objS;
    }

    public static void P(rm3 rm3Var, ea2 ea2Var) {
        r92 r92Var = ea2Var.h;
        if (r92Var == r92.o || r92Var.compareTo(r92.q) >= 0) {
            rm3Var.P();
        } else {
            ea2Var.a(new tl0(3, ea2Var, rm3Var));
        }
    }

    public static final void Q() {
        throw new UnsupportedOperationException();
    }

    public static final Object R(ne0 ne0Var, Object obj) {
        if (obj == null) {
            obj = O(ne0Var);
        }
        if (obj == 0) {
            return b;
        }
        if (!(obj instanceof Integer)) {
            return ((ht4) obj).c();
        }
        return ne0Var.s(e, new mt4(((Number) obj).intValue(), ne0Var));
    }

    public static final int S(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final td0 a(ne0 ne0Var) {
        if (ne0Var.K(fz0.h0) == null) {
            ne0Var = ne0Var.J(gb.a());
        }
        return new td0(ne0Var);
    }

    public static final void b(w03 w03Var, Object obj, Object obj2) {
        int iF = w03Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : w03Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof x03) {
                ((x03) obj3).a(obj2);
            } else if (obj3 != obj2) {
                x03 x03Var = new x03();
                x03Var.a(obj3);
                x03Var.a(obj2);
                obj2 = x03Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            w03Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        w03Var.b[i] = obj;
        w03Var.c[i] = obj2;
    }

    public static final void c(x65 x65Var, rm3 rm3Var, ea2 ea2Var) {
        AutoCloseable autoCloseable;
        rm3Var.getClass();
        ea2Var.getClass();
        y65 y65Var = x65Var.a;
        if (y65Var != null) {
            synchronized (y65Var.a) {
                autoCloseable = (AutoCloseable) y65Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        c54 c54Var = (c54) autoCloseable;
        if (c54Var == null || c54Var.p) {
            return;
        }
        c54Var.f(rm3Var, ea2Var);
        P(rm3Var, ea2Var);
    }

    public static byte[] d(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static final boolean e(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = u01.n;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    i94 i94Var = (i94) obj2;
                    i94 i94Var2 = (i94) obj;
                    arrayList2.add(new g83((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (i94Var2.g().a() >> 32)) - Float.intBitsToFloat((int) (i94Var.g().a() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (i94Var2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (i94Var.g().a() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((g83) q40.w0(list)).a;
            } else {
                if (list.isEmpty()) {
                    gc2.b("Empty collection can't be reduced.");
                }
                Object objW0 = q40.w0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objW0 = new g83(g83.e(((g83) objW0).a, ((g83) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((g83) objW0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean f(Object obj) {
        if (obj instanceof nh4) {
            nh4 nh4Var = (nh4) obj;
            if (nh4Var.c() == rv2.s || nh4Var.c() == rv2.D || nh4Var.c() == rv2.A) {
                Object value = nh4Var.getValue();
                if (value == null) {
                    return true;
                }
                return f(value);
            }
        } else if (!(obj instanceof sf1) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void g(we0 we0Var, ModifierNodeDetachedCancellationException modifierNodeDetachedCancellationException) {
        s22 s22Var = (s22) we0Var.e().K(fz0.h0);
        if (s22Var != null) {
            s22Var.f(modifierNodeDetachedCancellationException);
        } else {
            mj0.g(we0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static Drawable h(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static w03 i() {
        long[] jArr = v54.a;
        return new w03();
    }

    public static final Object j(wf1 wf1Var, vd0 vd0Var) {
        e64 e64Var = new e64(vd0Var, vd0Var.getContext());
        return h12.O(e64Var, e64Var, wf1Var);
    }

    public static final c54 k(rm3 rm3Var, ea2 ea2Var, String str, Bundle bundle) {
        rm3Var.getClass();
        ea2Var.getClass();
        c54 c54Var = new c54(str, ya4.j(rm3Var.A(str), bundle));
        c54Var.f(rm3Var, ea2Var);
        P(rm3Var, ea2Var);
        return c54Var;
    }

    public static Drawable l(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static final long m() {
        return Thread.currentThread().getId();
    }

    public static boolean n(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean o(long j, long j2) {
        return j == j2;
    }

    public static final ba1 p(ba1 ba1Var) {
        ba1 ba1VarF = ((ey) ((ra) j51.P(ba1Var)).getFocusOwner()).f();
        if (ba1VarF == null || !ba1VarF.A) {
            return null;
        }
        return ba1VarF;
    }

    public static View q(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = ra.a1;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                ra.a1 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (h12.c(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewQ = q(viewGroup.getChildAt(i2), i);
                    if (viewQ != null) {
                        return viewQ;
                    }
                }
            }
        }
        return null;
    }

    public static final wv3 r(ba1 ba1Var) {
        f63 f63Var;
        if (ba1Var.A && (f63Var = ba1Var.u) != null) {
            q62 q62VarN = wr1.n(f63Var);
            if (!q62VarN.f()) {
                q62VarN = null;
            }
            if (q62VarN != null) {
                return ba1Var.t0(q62VarN);
            }
        }
        return wv3.e;
    }

    public static final ba1 s(ba1 ba1Var) {
        boolean z = ba1Var.n.A;
        if (z) {
            if (!z) {
                cz1.b("visitChildren called on an unattached node");
            }
            f13 f13Var = new f13(new cx2[16]);
            cx2 cx2Var = ba1Var.n;
            cx2 cx2Var2 = cx2Var.s;
            if (cx2Var2 == null) {
                j51.b(f13Var, cx2Var);
            } else {
                f13Var.b(cx2Var2);
            }
            while (true) {
                int i = f13Var.p;
                if (i == 0) {
                    break;
                }
                cx2 cx2VarC = (cx2) f13Var.k(i - 1);
                if ((cx2VarC.q & 1024) == 0) {
                    j51.b(f13Var, cx2VarC);
                } else {
                    while (cx2VarC != null) {
                        if ((cx2VarC.p & 1024) != 0) {
                            f13 f13Var2 = null;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof ba1) {
                                    ba1 ba1Var2 = (ba1) cx2VarC;
                                    if (ba1Var2.n.A) {
                                        int iOrdinal = ba1Var2.v0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return ba1Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            er1.n();
                                            return null;
                                        }
                                    }
                                } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                    int i2 = 0;
                                    for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                        if ((cx2Var3.p & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cx2VarC = cx2Var3;
                                            } else {
                                                if (f13Var2 == null) {
                                                    f13Var2 = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var2.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var2.b(cx2Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cx2VarC = j51.c(f13Var2);
                            }
                            break;
                        }
                        cx2VarC = cx2VarC.s;
                    }
                }
            }
        }
        return null;
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int[] u(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static boolean v() {
        try {
            if (ra.U0 == null) {
                ra.U0 = Class.forName("android.os.SystemProperties");
            }
            if (ra.V0 == null) {
                Class cls = ra.U0;
                ra.V0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ra.V0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return h12.c(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object w(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        tb4.k();
        return null;
    }

    public static final int x(qc3 qc3Var) {
        return (int) (qc3Var.e == hb3.n ? qc3Var.i() & 4294967295L : qc3Var.i() >> 32);
    }

    public static Intent y(df dfVar) {
        Intent parentActivityIntent = dfVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strA = A(dfVar, dfVar.getComponentName());
            if (strA == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(dfVar, strA);
            try {
                return A(dfVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strA + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent z(Context context, ComponentName componentName) {
        String strA = A(context, componentName);
        if (strA == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strA);
        return A(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }
}
