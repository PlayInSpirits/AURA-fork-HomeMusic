package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import com.eddyizm.tempus.subsonic.models.Playlist;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class su3 {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static final int[] d = {R.attr.theme, app.homemusic.R.attr.theme};
    public static final int[] e = {app.homemusic.R.attr.materialThemeOverlay};
    public static final Object f = new Object();

    public static final String A(Element element, String str) {
        String string;
        String textContent;
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        int i = 0;
        while (true) {
            string = null;
            string = null;
            if (i >= length) {
                break;
            }
            Node nodeItem = childNodes.item(i);
            Element element2 = nodeItem instanceof Element ? (Element) nodeItem : null;
            if (element2 != null) {
                String tagName = element2.getTagName();
                tagName.getClass();
                if (qm4.E0(tagName, ':').equals(str)) {
                    arrayList.add(element2);
                }
            }
            i++;
        }
        Element element3 = (Element) q40.x0(arrayList);
        if (element3 != null && (textContent = element3.getTextContent()) != null) {
            string = qm4.K0(textContent).toString();
        }
        return string == null ? "" : string;
    }

    public static Context H(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof ud0) && ((ud0) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        ud0 ud0Var = new ud0(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            ud0Var.getTheme().applyStyle(resourceId2, true);
        }
        return ud0Var;
    }

    public static Class I(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    public static aw a(int i, int i2, wv wvVar) {
        int i3 = i2 & 2;
        wv wvVar2 = wv.n;
        if (i3 != 0) {
            wvVar = wvVar2;
        }
        if (i == -2) {
            if (wvVar != wvVar2) {
                return new t90(1, wvVar);
            }
            y00.d.getClass();
            return new aw(x00.b);
        }
        if (i == -1) {
            if (wvVar == wvVar2) {
                return new t90(1, wv.o);
            }
            kf2.n("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return wvVar == wvVar2 ? new aw(0) : new t90(1, wvVar);
        }
        if (i != Integer.MAX_VALUE) {
            return wvVar == wvVar2 ? new aw(i) : new t90(i, wvVar);
        }
        return new aw(Integer.MAX_VALUE);
    }

    public static final void b(gf1 gf1Var, final dx2 dx2Var, final q82 q82Var, final pc3 pc3Var, rg1 rg1Var, int i) {
        rg1Var.S(1055276397);
        int i2 = (rg1Var.g(gf1Var) ? 4 : 2) | i | (rg1Var.e(dx2Var) ? 32 : 16) | (rg1Var.e(q82Var) ? 256 : 128) | (rg1Var.e(pc3Var) ? 2048 : 1024);
        if (rg1Var.K(i2 & 1, (i2 & 1171) != 1170)) {
            final b13 b13VarS = uc5.S(gf1Var, rg1Var);
            q05.a(fh0.w(-933153643, new xf1() { // from class: e82
                @Override // defpackage.xf1
                public final Object a(Object obj, Object obj2, Object obj3) {
                    dx2 dx2VarC;
                    Object obj4;
                    u44 u44Var = (u44) obj;
                    rg1 rg1Var2 = (rg1) obj2;
                    ((Integer) obj3).getClass();
                    Object objH = rg1Var2.H();
                    i80 i80Var = j80.a;
                    if (objH == i80Var) {
                        objH = new c82(u44Var, new wc(12, b13VarS));
                        rg1Var2.b0(objH);
                    }
                    c82 c82Var = (c82) objH;
                    Object objH2 = rg1Var2.H();
                    if (objH2 == i80Var) {
                        wo0 wo0Var = new wo0();
                        wo0Var.n = c82Var;
                        p03 p03Var = r73.a;
                        wo0Var.o = new p03();
                        objH2 = new kn4(wo0Var);
                        rg1Var2.b0(objH2);
                    }
                    kn4 kn4Var = (kn4) objH2;
                    int i3 = 4;
                    q82 q82Var2 = q82Var;
                    if (q82Var2 != null) {
                        rg1Var2.R(1743490539);
                        rg1Var2.R(887527095);
                        String str = Build.FINGERPRINT;
                        if (str == null || !str.equals("robolectric")) {
                            rg1Var2.R(1345729441);
                            View view = (View) rg1Var2.i(hb.f);
                            boolean zE = rg1Var2.e(view);
                            Object objH3 = rg1Var2.H();
                            if (zE || objH3 == i80Var) {
                                Object tag = view.getTag(app.homemusic.R.id.compose_prefetch_scheduler);
                                objH3 = tag instanceof wp3 ? (wp3) tag : null;
                                if (objH3 == null) {
                                    objH3 = new sc(view);
                                    view.setTag(app.homemusic.R.id.compose_prefetch_scheduler, objH3);
                                }
                                rg1Var2.b0(objH3);
                            }
                            obj4 = (wp3) objH3;
                            rg1Var2.o(false);
                        } else {
                            rg1Var2.R(1345548711);
                            Object objH4 = rg1Var2.H();
                            if (objH4 == i80Var) {
                                objH4 = new xp3();
                                rg1Var2.b0(objH4);
                            }
                            obj4 = (xp3) objH4;
                            rg1Var2.o(false);
                        }
                        Object obj5 = obj4;
                        rg1Var2.o(false);
                        Object[] objArr = {q82Var2, c82Var, kn4Var, obj5};
                        boolean zE2 = rg1Var2.e(q82Var2) | rg1Var2.g(c82Var) | rg1Var2.g(kn4Var) | rg1Var2.g(obj5);
                        Object objH5 = rg1Var2.H();
                        if (zE2 || objH5 == i80Var) {
                            ry1 ry1Var = new ry1(q82Var2, c82Var, kn4Var, obj5, 1);
                            rg1Var2.b0(ry1Var);
                            objH5 = ry1Var;
                        }
                        if1 if1Var = (if1) objH5;
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
                        boolean zD = rg1Var2.d(objArrCopyOf.length);
                        for (Object obj6 : objArrCopyOf) {
                            zD |= rg1Var2.e(obj6);
                        }
                        Object objH6 = rg1Var2.H();
                        if (zD || objH6 == i80Var) {
                            rg1Var2.b0(new wr0(if1Var));
                        }
                        rg1Var2.o(false);
                    } else {
                        rg1Var2.R(1744076749);
                        rg1Var2.o(false);
                    }
                    int i4 = r82.a;
                    dx2 dx2Var2 = dx2Var;
                    if (q82Var2 != null && (dx2VarC = dx2Var2.c(new sx4(q82Var2))) != null) {
                        dx2Var2 = dx2VarC;
                    }
                    boolean zE3 = rg1Var2.e(c82Var);
                    pc3 pc3Var2 = pc3Var;
                    boolean zE4 = zE3 | rg1Var2.e(pc3Var2);
                    Object objH7 = rg1Var2.H();
                    if (zE4 || objH7 == i80Var) {
                        objH7 = new ib(i3, c82Var, pc3Var2);
                        rg1Var2.b0(objH7);
                    }
                    gn4.a(kn4Var, dx2Var2, (wf1) objH7, rg1Var2, 8);
                    return j15.a;
                }
            }, rg1Var), rg1Var, 6);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new rt1(gf1Var, dx2Var, q82Var, pc3Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(q64 q64Var, float f2, xd xdVar, ui0 ui0Var, if1 if1Var, wd0 wd0Var) {
        yg4 yg4Var;
        float f3;
        gx3 gx3Var;
        if (wd0Var instanceof yg4) {
            yg4Var = (yg4) wd0Var;
            int i = yg4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg4Var.r = i - Integer.MIN_VALUE;
            } else {
                yg4Var = new yg4(wd0Var);
            }
        } else {
            yg4Var = new yg4(wd0Var);
        }
        Object obj = yg4Var.q;
        int i2 = yg4Var.r;
        if (i2 == 0) {
            kb4.X(obj);
            gx3 gx3Var2 = new gx3();
            boolean z = ((Number) xdVar.a()).floatValue() == 0.0f;
            xg4 xg4Var = new xg4(f2, gx3Var2, q64Var, if1Var, 0);
            yg4Var.o = xdVar;
            yg4Var.p = gx3Var2;
            yg4Var.n = f2;
            yg4Var.r = 1;
            Object objG = j51.g(xdVar, ui0Var, !z, xg4Var, yg4Var);
            xe0 xe0Var = xe0.n;
            if (objG == xe0Var) {
                return xe0Var;
            }
            f3 = f2;
            gx3Var = gx3Var2;
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = yg4Var.n;
            gx3Var = yg4Var.p;
            xdVar = yg4Var.o;
            kb4.X(obj);
        }
        return new ud(new Float(f3 - gx3Var.n), xdVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object d(q64 q64Var, float f2, float f3, xd xdVar, ck4 ck4Var, if1 if1Var, wd0 wd0Var) {
        zg4 zg4Var;
        float fFloatValue;
        xd xdVar2;
        gx3 gx3Var;
        float f4 = f2;
        if (wd0Var instanceof zg4) {
            zg4Var = (zg4) wd0Var;
            int i = zg4Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                zg4Var.s = i - Integer.MIN_VALUE;
            } else {
                zg4Var = new zg4(wd0Var);
            }
        } else {
            zg4Var = new zg4(wd0Var);
        }
        zg4 zg4Var2 = zg4Var;
        Object obj = zg4Var2.r;
        int i2 = zg4Var2.s;
        if (i2 == 0) {
            kb4.X(obj);
            gx3 gx3Var2 = new gx3();
            fFloatValue = ((Number) xdVar.a()).floatValue();
            Float f5 = new Float(f4);
            boolean z = ((Number) xdVar.a()).floatValue() == 0.0f;
            xg4 xg4Var = new xg4(f3, gx3Var2, q64Var, if1Var, 1);
            zg4Var2.p = xdVar;
            zg4Var2.q = gx3Var2;
            zg4Var2.n = f4;
            zg4Var2.o = fFloatValue;
            zg4Var2.s = 1;
            Object objH = j51.h(xdVar, f5, ck4Var, !z, xg4Var, zg4Var2);
            xe0 xe0Var = xe0.n;
            if (objH == xe0Var) {
                return xe0Var;
            }
            xdVar2 = xdVar;
            gx3Var = gx3Var2;
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f6 = zg4Var2.o;
            float f7 = zg4Var2.n;
            gx3Var = zg4Var2.q;
            xdVar2 = zg4Var2.p;
            kb4.X(obj);
            fFloatValue = f6;
            f4 = f7;
        }
        return new ud(new Float(f4 - gx3Var.n), j51.p(xdVar2, 0.0f, m(((Number) xdVar2.a()).floatValue(), fFloatValue), 29));
    }

    public static final int e(int i, f13 f13Var) {
        int i2 = f13Var.p - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = f13Var.n;
            int i5 = ((f12) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((f12) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void f(mj4 mj4Var) {
        int i = mj4Var.q;
        int[] iArr = mj4Var.o;
        Object[] objArr = mj4Var.p;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        mj4Var.n = false;
        mj4Var.q = i2;
    }

    public static final void g(vd vdVar, q64 q64Var, if1 if1Var, float f2) {
        float fA;
        try {
            fA = q64Var.a(f2);
        } catch (CancellationException unused) {
            vdVar.a();
            fA = 0.0f;
        }
        if1Var.invoke(Float.valueOf(fA));
        if (Math.abs(f2 - fA) > 0.5f) {
            vdVar.a();
        }
    }

    public static final int h(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int i(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static ArrayList j(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static float k(float f2, float f3, float f4) {
        if (f2 < f3) {
            return f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    public static int l(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static final float m(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (f3 <= 0.0f ? f2 >= f3 : f2 <= f3) ? f2 : f3;
    }

    public static k44 o(byte[] bArr, Parcelable.Creator creator) {
        ji2.m(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        k44 k44Var = (k44) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return k44Var;
    }

    public static ArrayList p(Element element, String str) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            Element element2 = nodeItem instanceof Element ? (Element) nodeItem : null;
            if (element2 != null) {
                String tagName = element2.getTagName();
                tagName.getClass();
                if (qm4.E0(tagName, ':').equals(str)) {
                    arrayList.add(element2);
                }
            }
        }
        return arrayList;
    }

    public static final List q(String str, List list) {
        list.getClass();
        str.getClass();
        if (qm4.u0(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ux3 ux3Var = qn1.a;
            String name = ((Playlist) obj).getName();
            if (name == null) {
                name = "";
            }
            if (qn1.a(name, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static j23 s(e75 e75Var) {
        sf0 sf0Var = sf0.b;
        sf0Var.getClass();
        bq4 bq4Var = new bq4(e75Var, j23.c, sf0Var);
        i30 i30VarA = kx3.a(j23.class);
        String strB = i30VarA.b();
        if (strB != null) {
            return (j23) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static long t(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static final long u(zg5 zg5Var) {
        DragEvent dragEvent = (DragEvent) zg5Var.n;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final long v(int i) {
        return z(4294967296L, i);
    }

    public static final long z(long j, float f2) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        ct4[] ct4VarArr = bt4.b;
        return jFloatToRawIntBits;
    }

    public abstract Object B(Intent intent, int i);

    public void C(boolean z) {
    }

    public abstract void D(boolean z);

    public abstract void E(int i);

    public abstract void F(int i);

    public abstract void G(ArrayList arrayList);

    public abstract Intent n(nc1 nc1Var, Object obj);

    public abstract void r(kc4 kc4Var, float f2, float f3);

    public zh0 w(nc1 nc1Var, Object obj) {
        return null;
    }

    public abstract void x(int i);

    public abstract boolean y();
}
