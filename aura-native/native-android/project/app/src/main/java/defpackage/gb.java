package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.TimeoutCancellationException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gb {
    public static final Type[] a = new Type[0];
    public static final ro0 b = new ro0(1.0f, 1.0f);
    public static final rd2 c = new rd2(2);
    public static final jb2 d = new jb2(8);

    public static Type A(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return A(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final String B(int i) {
        ya4.g(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static j02 C(Collection collection) {
        collection.getClass();
        return new j02(0, collection.size() - 1, 1);
    }

    public static final s22 D(ne0 ne0Var) {
        s22 s22Var = (s22) ne0Var.K(fz0.h0);
        if (s22Var != null) {
            return s22Var;
        }
        mj0.g(ne0Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static int E(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static ImageButton F(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static Class G(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            vr1.d(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) G(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return G(((WildcardType) type).getUpperBounds()[0]);
        }
        tb4.h("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static ArrayList H(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final boolean J(String str) {
        str.getClass();
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static final as0 K(s22 s22Var, boolean z, u22 u22Var) {
        if (s22Var instanceof a32) {
            return ((a32) s22Var).O(z, u22Var);
        }
        return s22Var.T(u22Var.r(), z, new q(1, u22Var, u22.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 7));
    }

    public static final boolean L(ne0 ne0Var) {
        s22 s22Var = (s22) ne0Var.K(fz0.h0);
        if (s22Var != null) {
            return s22Var.b();
        }
        return true;
    }

    public static boolean M(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean N(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static List O(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List P(Object... objArr) {
        if (objArr.length <= 0) {
            return u01.n;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList Q(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new hi(objArr, true));
    }

    public static final List R(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : O(list.get(0));
        }
        return u01.n;
    }

    public static void S(qn4 qn4Var, int i, wc0 wc0Var) {
        long jK = qn4Var.k(i);
        List listM = qn4Var.m(jK);
        if (listM.isEmpty()) {
            return;
        }
        if (i == qn4Var.n() - 1) {
            tb4.a();
            return;
        }
        long jK2 = qn4Var.k(i + 1) - qn4Var.k(i);
        if (jK2 > 0) {
            wc0Var.accept(new lg0(jK, jK2, listM));
        }
    }

    public static final boolean T(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final void U(float[] fArr, float[] fArr2) {
        float fT = t(0, 0, fArr2, fArr);
        float fT2 = t(0, 1, fArr2, fArr);
        float fT3 = t(0, 2, fArr2, fArr);
        float fT4 = t(0, 3, fArr2, fArr);
        float fT5 = t(1, 0, fArr2, fArr);
        float fT6 = t(1, 1, fArr2, fArr);
        float fT7 = t(1, 2, fArr2, fArr);
        float fT8 = t(1, 3, fArr2, fArr);
        float fT9 = t(2, 0, fArr2, fArr);
        float fT10 = t(2, 1, fArr2, fArr);
        float fT11 = t(2, 2, fArr2, fArr);
        float fT12 = t(2, 3, fArr2, fArr);
        float fT13 = t(3, 0, fArr2, fArr);
        float fT14 = t(3, 1, fArr2, fArr);
        float fT15 = t(3, 2, fArr2, fArr);
        float fT16 = t(3, 3, fArr2, fArr);
        fArr[0] = fT;
        fArr[1] = fT2;
        fArr[2] = fT3;
        fArr[3] = fT4;
        fArr[4] = fT5;
        fArr[5] = fT6;
        fArr[6] = fT7;
        fArr[7] = fT8;
        fArr[8] = fT9;
        fArr[9] = fT10;
        fArr[10] = fT11;
        fArr[11] = fT12;
        fArr[12] = fT13;
        fArr[13] = fT14;
        fArr[14] = fT15;
        fArr[15] = fT16;
    }

    public static final ne5 V(xu3 xu3Var) throws IOException {
        int iF = xu3Var.f();
        if (iF != 33639248) {
            throw new IOException("bad zip: expected " + B(33639248) + " but was " + B(iF));
        }
        xu3Var.skip(4L);
        short sN = xu3Var.n();
        int i = sN & 65535;
        if ((sN & 1) != 0) {
            mj0.i("unsupported zip: general purpose bit flag=".concat(B(i)));
            return null;
        }
        int iN = xu3Var.n() & 65535;
        int iN2 = xu3Var.n() & 65535;
        int iN3 = xu3Var.n() & 65535;
        long jF = ((long) xu3Var.f()) & 4294967295L;
        ix3 ix3Var = new ix3();
        ix3Var.n = ((long) xu3Var.f()) & 4294967295L;
        ix3 ix3Var2 = new ix3();
        ix3Var2.n = ((long) xu3Var.f()) & 4294967295L;
        int iN4 = xu3Var.n() & 65535;
        int iN5 = xu3Var.n() & 65535;
        int iN6 = xu3Var.n() & 65535;
        xu3Var.skip(8L);
        ix3 ix3Var3 = new ix3();
        ix3Var3.n = ((long) xu3Var.f()) & 4294967295L;
        String strQ = xu3Var.q(iN4);
        if (qm4.n0(strQ, (char) 0)) {
            mj0.i("bad zip: filename contains 0x00");
            return null;
        }
        long j = ix3Var2.n == 4294967295L ? 8L : 0L;
        if (ix3Var.n == 4294967295L) {
            j += 8;
        }
        if (ix3Var3.n == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        jx3 jx3Var = new jx3();
        jx3 jx3Var2 = new jx3();
        jx3 jx3Var3 = new jx3();
        fx3 fx3Var = new fx3();
        W(xu3Var, iN5, new qe5(fx3Var, j2, ix3Var2, xu3Var, ix3Var, ix3Var3, jx3Var, jx3Var2, jx3Var3));
        if (j2 > 0 && !fx3Var.n) {
            mj0.i("bad zip: zip64 extra required but absent");
            return null;
        }
        String strQ2 = xu3Var.q(iN6);
        String str = ge3.o;
        return new ne5(tv1.z("/").d(strQ), xm4.e0(strQ, "/", false), strQ2, jF, ix3Var.n, ix3Var2.n, iN, ix3Var3.n, iN3, iN2, (Long) jx3Var.n, (Long) jx3Var2.n, (Long) jx3Var3.n, 57344);
    }

    public static final void W(xu3 xu3Var, int i, wf1 wf1Var) throws IOException {
        tv tvVar = xu3Var.o;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                mj0.i("bad zip: truncated header in extra field");
                return;
            }
            int iN = xu3Var.n() & 65535;
            long jN = ((long) xu3Var.n()) & 65535;
            long j2 = j - 4;
            if (j2 < jN) {
                mj0.i("bad zip: truncated value in extra field");
                return;
            }
            xu3Var.P(jN);
            long j3 = tvVar.o;
            wf1Var.invoke(Integer.valueOf(iN), Long.valueOf(jN));
            long j4 = (tvVar.o + jN) - j3;
            if (j4 < 0) {
                mj0.i(f34.f(iN, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    tvVar.skip(j4);
                }
                j = j2 - jN;
            }
        }
    }

    public static final ne5 X(xu3 xu3Var, ne5 ne5Var) throws IOException {
        int iF = xu3Var.f();
        if (iF != 67324752) {
            throw new IOException("bad zip: expected " + B(67324752) + " but was " + B(iF));
        }
        xu3Var.skip(2L);
        short sN = xu3Var.n();
        int i = sN & 65535;
        if ((sN & 1) != 0) {
            mj0.i("unsupported zip: general purpose bit flag=".concat(B(i)));
            return null;
        }
        xu3Var.skip(18L);
        long jN = ((long) xu3Var.n()) & 65535;
        int iN = xu3Var.n() & 65535;
        xu3Var.skip(jN);
        if (ne5Var == null) {
            xu3Var.skip(iN);
            return null;
        }
        jx3 jx3Var = new jx3();
        jx3 jx3Var2 = new jx3();
        jx3 jx3Var3 = new jx3();
        W(xu3Var, iN, new pe5(xu3Var, jx3Var, jx3Var2, jx3Var3));
        return new ne5(ne5Var.a, ne5Var.b, ne5Var.c, ne5Var.d, ne5Var.e, ne5Var.f, ne5Var.g, ne5Var.h, ne5Var.i, ne5Var.j, ne5Var.k, ne5Var.l, ne5Var.m, (Integer) jx3Var.n, (Integer) jx3Var2.n, (Integer) jx3Var3.n);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type Y(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeY;
        Type[] upperBounds2;
        Type typeY2;
        Type[] lowerBounds2;
        Type typeY3;
        boolean z;
        Type[] actualTypeArguments;
        int length;
        Type bVar;
        Type typeY4;
        Type genericComponentType;
        Type typeY5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeY instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeY).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeY};
                                }
                                type2 = new c(upperBounds2, a, 0);
                                break;
                            }
                            typeY2 = Y(type, cls, lowerBounds[0], map);
                            if (typeY2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeY2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeY2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeY2};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2, 0);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeY3 = Y(type, cls, ownerType, map);
                        z = !Objects.equals(typeY3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeY4 = Y(type, cls, actualTypeArguments[i], map);
                            if (Objects.equals(typeY4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeY4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        bVar = new b(typeY3, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeY5 = Y(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeY5)) {
                        bVar = new a(0, typeY5);
                        type2 = bVar;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeY = Y(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeY instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeY).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeY};
                                    }
                                    type2 = new c(upperBounds2, a, 0);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeY2 = Y(type, cls, lowerBounds[0], map);
                            if (typeY2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeY2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeY2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeY2};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2, 0);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeY3 = Y(type, cls, ownerType2, map);
                        z = !Objects.equals(typeY3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeY4 = Y(type, cls, actualTypeArguments[i], map);
                            if (Objects.equals(typeY4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeY4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        bVar = new b(typeY3, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeY5 = Y(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeY5)) {
                        break;
                    }
                    bVar = new a(0, typeY5);
                    type2 = bVar;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeY6 = Y(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeY6)) {
                    bVar = new a(0, typeY6);
                    type2 = bVar;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeA = A(type, cls, cls4);
                if (typeA instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i >= length2) {
                            tb4.k();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeA).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static final Object Z(gu4 gu4Var, wf1 wf1Var) throws Throwable {
        Object a70Var;
        Object objS;
        K(gu4Var, true, new es0(au0.t(gu4Var.s.getContext()).F(gu4Var.t, gu4Var, gu4Var.r)));
        try {
            if (wf1Var instanceof jp) {
                jz4.j(2, wf1Var);
                a70Var = wf1Var.invoke(gu4Var, gu4Var);
            } else {
                a70Var = ya4.Q(wf1Var, gu4Var, gu4Var);
            }
        } catch (Throwable th) {
            a70Var = new a70(th, false);
        }
        xe0 xe0Var = xe0.n;
        if (a70Var == xe0Var || (objS = gu4Var.S(a70Var)) == zz1.e) {
            return xe0Var;
        }
        if (objS instanceof a70) {
            Throwable th2 = ((a70) objS).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).n != gu4Var) {
                throw th2;
            }
            if (a70Var instanceof a70) {
                throw ((a70) a70Var).a;
            }
        } else {
            a70Var = zz1.M(objS);
        }
        return a70Var;
    }

    public static t22 a() {
        return new t22(null);
    }

    public static List a0(ArrayList arrayList, ku3 ku3Var) {
        List listS0 = q40.S0(arrayList);
        ArrayList arrayList2 = (ArrayList) listS0;
        for (int size = arrayList2.size() - 1; size > 0; size--) {
            int iA = ku3Var.a(size + 1);
            arrayList2.set(iA, arrayList2.set(size, arrayList2.get(iA)));
        }
        return listS0;
    }

    public static final void b(float[] fArr, float f, float f2, float[] fArr2) {
        ya4.G(fArr2);
        ya4.N(fArr2, f, f2);
        U(fArr, fArr2);
    }

    public static h02 b0(j02 j02Var, int i) {
        j02Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = j02Var.n;
        int i3 = j02Var.o;
        if (j02Var.p <= 0) {
            i = -i;
        }
        return new h02(i2, i3, i);
    }

    public static final void c(v3 v3Var, i94 i94Var) {
        if (xl.b(i94Var)) {
            e94 e94Var = i94Var.d;
            Object objG = e94Var.n.g(d94.i);
            if (objG == null) {
                objG = null;
            }
            w2 w2Var = (w2) objG;
            if (w2Var != null) {
                v3Var.b(new o3(R.id.accessibilityActionSetProgress, w2Var.a));
            }
        }
    }

    public static void c0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new hi(objArr, true));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void d0(qn4 qn4Var, yn4 yn4Var, wc0 wc0Var) {
        int iE;
        boolean z;
        long j = yn4Var.b;
        if (j == -9223372036854775807L) {
            iE = 0;
        } else {
            iE = qn4Var.e(j);
            if (iE == -1) {
                iE = qn4Var.n();
            }
            if (iE > 0 && qn4Var.k(iE - 1) == j) {
                iE--;
            }
        }
        if (j == -9223372036854775807L || iE >= qn4Var.n()) {
            z = false;
        } else {
            List listM = qn4Var.m(j);
            long jK = qn4Var.k(iE);
            if (listM.isEmpty()) {
                z = false;
            } else {
                long j2 = yn4Var.b;
                if (j2 < jK) {
                    wc0Var.accept(new lg0(j2, jK - j2, listM));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iE; i < qn4Var.n(); i++) {
            S(qn4Var, i, wc0Var);
        }
        if (yn4Var.a) {
            if (z) {
                iE--;
            }
            for (int i2 = 0; i2 < iE; i2++) {
                S(qn4Var, i2, wc0Var);
            }
            if (z) {
                wc0Var.accept(new lg0(qn4Var.k(iE), j - qn4Var.k(iE), qn4Var.m(j)));
            }
        }
    }

    public static int e(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            kf2.n(b11.n("fromIndex (", ") is greater than toIndex (", 0, size, ")."));
            return 0;
        }
        if (size > size2) {
            kf2.h(b11.n("toIndex (", ") is greater than size (", size, size2, ")."));
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iL = fu.l((Comparable) arrayList.get(i3), comparable);
            if (iL < 0) {
                i = i3 + 1;
            } else {
                if (iL <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    public static String e0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static qb2 f(qb2 qb2Var) {
        qb2Var.g();
        qb2Var.p = true;
        return qb2Var.o > 0 ? qb2Var : qb2.q;
    }

    public static final LinkedHashMap g(ArrayList arrayList) {
        String str = ge3.o;
        ge3 ge3VarZ = tv1.z("/");
        kd3[] kd3VarArr = {new kd3(ge3VarZ, new ne5(ge3VarZ, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(lg2.W(1));
        lg2.Y(linkedHashMap, kd3VarArr);
        for (ne5 ne5Var : q40.K0(arrayList, new jb2(9))) {
            if (((ne5) linkedHashMap.put(ne5Var.a, ne5Var)) == null) {
                while (true) {
                    ge3 ge3Var = ne5Var.a;
                    ge3 ge3VarB = ge3Var.b();
                    if (ge3VarB == null) {
                        break;
                    }
                    ne5 ne5Var2 = (ne5) linkedHashMap.get(ge3VarB);
                    if (ne5Var2 != null) {
                        ne5Var2.q.add(ge3Var);
                        break;
                    }
                    ne5 ne5Var3 = new ne5(ge3VarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(ge3VarB, ne5Var3);
                    ne5Var3.q.add(ge3Var);
                    ne5Var = ne5Var3;
                }
            }
        }
        return linkedHashMap;
    }

    public static j02 g0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new j02(i, i2 - 1, 1);
        }
        j02 j02Var = j02.q;
        return j02.q;
    }

    public static Type h(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(0, h(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(0, ((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
    }

    public static final void h0(i94 i94Var, int i, i64 i64Var) {
        f13 f13Var = new f13(new i94[16]);
        List listI = i94Var.i(false, false);
        while (true) {
            f13Var.d(listI, f13Var.p);
            while (true) {
                int i2 = f13Var.p;
                if (i2 == 0) {
                    return;
                }
                i94 i94Var2 = (i94) f13Var.k(i2 - 1);
                boolean zH = wr1.H(i94Var2);
                e94 e94Var = i94Var2.d;
                w03 w03Var = e94Var.n;
                if (!zH && !w03Var.c(n94.j)) {
                    f63 f63VarD = i94Var2.d();
                    if (f63VarD == null) {
                        throw xa3.l("Expected semantics node to have a coordinator.");
                    }
                    k02 k02VarQ = rr2.Q(wr1.d(f63VarD, true));
                    if (k02VarQ.a < k02VarQ.c && k02VarQ.b < k02VarQ.d) {
                        Object objG = e94Var.n.g(d94.e);
                        if (objG == null) {
                            objG = null;
                        }
                        wf1 wf1Var = (wf1) objG;
                        Object objG2 = w03Var.g(n94.v);
                        h64 h64Var = (h64) (objG2 != null ? objG2 : null);
                        if (wf1Var == null || h64Var == null || ((Number) h64Var.b.invoke()).floatValue() <= 0.0f) {
                            listI = i94Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            i64Var.invoke(new j64(i94Var2, i3, k02VarQ, f63VarD));
                            h0(i94Var2, i3, i64Var);
                        }
                    }
                }
            }
        }
    }

    public static void i(Type type) {
        vr1.d(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static final Object i0(long j, r rVar, ha0 ha0Var) {
        long jC;
        om0 om0Var = mx0.n;
        boolean z = j > 0;
        if (z) {
            long jB = mx0.b(j, e35.W(999999L, ox0.NANOSECONDS));
            jC = ((((int) jB) & 1) != 1 || jB == mx0.o || jB == mx0.p) ? mx0.c(jB, ox0.MILLISECONDS) : jB >> 1;
        } else {
            if (z) {
                er1.n();
                return null;
            }
            jC = 0;
        }
        if (jC > 0) {
            return Z(new gu4(jC, ha0Var), rVar);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    public static float j(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j0(long j, wf1 wf1Var, wd0 wd0Var) throws Throwable {
        hu4 hu4Var;
        jx3 jx3Var;
        if (wd0Var instanceof hu4) {
            hu4Var = (hu4) wd0Var;
            int i = hu4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                hu4Var.p = i - Integer.MIN_VALUE;
            } else {
                hu4Var = new hu4(wd0Var);
            }
        } else {
            hu4Var = new hu4(wd0Var);
        }
        Object obj = hu4Var.o;
        int i2 = hu4Var.p;
        if (i2 == 0) {
            kb4.X(obj);
            if (j > 0) {
                jx3 jx3Var2 = new jx3();
                try {
                    hu4Var.n = jx3Var2;
                    hu4Var.p = 1;
                    gu4 gu4Var = new gu4(j, hu4Var);
                    jx3Var2.n = gu4Var;
                    Object objZ = Z(gu4Var, wf1Var);
                    xe0 xe0Var = xe0.n;
                    return objZ == xe0Var ? xe0Var : objZ;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    jx3Var = jx3Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jx3Var = hu4Var.n;
        try {
            kb4.X(obj);
            return obj;
        } catch (TimeoutCancellationException e2) {
            e = e2;
        }
        if (e.n != jx3Var.n) {
            throw e;
        }
        return null;
    }

    public static double k(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            return d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float l(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int m(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long n(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final ia1 o(Context context) {
        pa paVar = new pa(1);
        context.getApplicationContext();
        return new ia1(paVar, new zb(Build.VERSION.SDK_INT >= 31 ? hb1.a.a(context) : 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static b3 p(String str, Bundle bundle) throws NoCredentialException {
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            string.getClass();
                            dq0 dq0Var = new dq0("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return dq0Var;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 == null) {
                            throw new NoCredentialException("The device does not contain a restore credential.");
                        }
                        dq0 dq0Var2 = new dq0("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                return dq0Var2;
                            } catch (Exception unused3) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new FrameworkClassParsingException();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string3.getClass();
                            string4.getClass();
                            return new dq0(string4, 1, bundle);
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string5 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string5.getClass();
                            return new dq0(string5, 2, bundle);
                        } catch (Exception unused5) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                default:
                    throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused6) {
            return new tg0(str, bundle);
        }
    }

    public static final void q(gk1 gk1Var, b45 b45Var) {
        List list = b45Var.w;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d45 d45Var = (d45) list.get(i);
            if (d45Var instanceof f45) {
                he3 he3Var = new he3();
                f45 f45Var = (f45) d45Var;
                he3Var.d = f45Var.o;
                he3Var.n = true;
                he3Var.c();
                he3Var.s.a.setFillType(f45Var.p == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                he3Var.c();
                he3Var.c();
                he3Var.b = f45Var.q;
                he3Var.c();
                he3Var.c = f45Var.r;
                he3Var.c();
                he3Var.g = f45Var.s;
                he3Var.c();
                he3Var.e = f45Var.t;
                he3Var.c();
                he3Var.f = f45Var.u;
                he3Var.o = true;
                he3Var.c();
                he3Var.h = f45Var.v;
                he3Var.o = true;
                he3Var.c();
                he3Var.i = f45Var.w;
                he3Var.o = true;
                he3Var.c();
                he3Var.j = f45Var.x;
                he3Var.o = true;
                he3Var.c();
                he3Var.k = f45Var.y;
                he3Var.p = true;
                he3Var.c();
                he3Var.l = f45Var.z;
                he3Var.p = true;
                he3Var.c();
                he3Var.m = f45Var.A;
                he3Var.p = true;
                he3Var.c();
                gk1Var.e(i, he3Var);
            } else if (d45Var instanceof b45) {
                gk1 gk1Var2 = new gk1();
                b45 b45Var2 = (b45) d45Var;
                gk1Var2.k = b45Var2.n;
                gk1Var2.c();
                gk1Var2.l = b45Var2.o;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.o = b45Var2.r;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.p = b45Var2.s;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.q = b45Var2.t;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.r = b45Var2.u;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.m = b45Var2.p;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.n = b45Var2.q;
                gk1Var2.s = true;
                gk1Var2.c();
                gk1Var2.f = b45Var2.v;
                gk1Var2.g = true;
                gk1Var2.c();
                q(gk1Var2, b45Var2);
                gk1Var.e(i, gk1Var2);
            }
        }
    }

    public static qb2 r() {
        return new qb2(10);
    }

    public static Bitmap s(byte[] bArr, int i, int i2) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        int iE = 1;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            f31 f31Var = new f31(byteArrayInputStream);
            byteArrayInputStream.close();
            b31 b31VarC = f31Var.c("Orientation");
            if (b31VarC != null) {
                try {
                    iE = b31VarC.e(f31Var.f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static final float t(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void u(ne0 ne0Var) {
        s22 s22Var = (s22) ne0Var.K(fz0.h0);
        if (s22Var != null && !s22Var.b()) {
            throw s22Var.q();
        }
    }

    public static boolean v(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return v(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static qm2 w(ci0 ci0Var, String str, byte[] bArr, Map map) throws Throwable {
        ii0 ii0Var;
        gi0 gi0Var;
        Map map2;
        List list;
        yl4 yl4Var = new yl4(ci0Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        rr2.s(uri, "The uri must be set.");
        ii0 ii0Var2 = new ii0(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        ii0 ii0VarA = ii0Var2;
        int i = 0;
        while (true) {
            try {
                gi0 gi0Var2 = new gi0(yl4Var, ii0VarA);
                try {
                    byte[] bArrB = xw.b(gi0Var2);
                    try {
                        ii0Var = ii0Var2;
                        gi0Var = gi0Var2;
                        try {
                            try {
                                ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, SystemClock.elapsedRealtime(), 0L, bArrB.length);
                                qr2 qr2Var = new qr2(12, bArrB);
                                qr2Var.p = ed2Var;
                                qm2 qm2Var = new qm2(qr2Var);
                                f35.h(gi0Var);
                                return qm2Var;
                            } catch (HttpDataSource$InvalidResponseCodeException e) {
                                e = e;
                                int i2 = e.p;
                                String str2 = null;
                                if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.q) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                    str2 = (String) list.get(0);
                                }
                                if (str2 == null) {
                                    throw e;
                                }
                                i++;
                                hi0 hi0VarA = ii0VarA.a();
                                hi0VarA.a = Uri.parse(str2);
                                ii0VarA = hi0VarA.a();
                                try {
                                    f35.h(gi0Var);
                                    ii0Var2 = ii0Var;
                                } catch (Exception e2) {
                                    e = e2;
                                    throw new MediaDrmCallbackException(ii0Var, yl4Var.p, yl4Var.n.j(), yl4Var.o, e);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            f35.h(gi0Var);
                            throw th;
                        }
                    } catch (HttpDataSource$InvalidResponseCodeException e3) {
                        e = e3;
                        ii0Var = ii0Var2;
                        gi0Var = gi0Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        gi0Var = gi0Var2;
                        f35.h(gi0Var);
                        throw th;
                    }
                } catch (HttpDataSource$InvalidResponseCodeException e4) {
                    e = e4;
                    ii0Var = ii0Var2;
                    gi0Var = gi0Var2;
                } catch (Throwable th3) {
                    th = th3;
                    gi0Var = gi0Var2;
                }
                ii0Var2 = ii0Var;
            } catch (Exception e5) {
                e = e5;
                ii0Var = ii0Var2;
            }
        }
    }

    public static final v23 x(View view) {
        view.getClass();
        g71 g71Var = new g71(new h71(new tq4(fa4.c0(k5.A, view), k5.B, 1), false, new o54(13)));
        v23 v23Var = (v23) (!g71Var.hasNext() ? null : g71Var.next());
        if (v23Var != null) {
            return v23Var;
        }
        nz2.w(view, " does not have a NavController set", "View ");
        return null;
    }

    public static ActionMenuView y(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static final xi2 z(f82 f82Var, int i, long j, nc3 nc3Var, long j2, hb3 hb3Var, fs fsVar, gs gsVar, r62 r62Var, boolean z, int i2, i03 i03Var) {
        List list;
        Object objC = nc3Var.c(i);
        List list2 = (List) i03Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = f82Var.a(i);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((pi2) listA.get(i3)).r(j));
            }
            i03Var.i(i, arrayList);
            list = arrayList;
        }
        return new xi2(i, i2, list, j2, objC, hb3Var, fsVar, gsVar, r62Var, z);
    }

    public abstract zk2 I();

    public abstract void f0(np2 np2Var);
}
