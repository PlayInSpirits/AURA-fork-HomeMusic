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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.TimeoutCancellationException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gb {
    public static final Type[] a = null;
    public static final ro0 b = null;
    public static final rd2 c = null;
    public static final jb2 d = null;

    static {
        a = new Type[0];
        b = new ro0(1.0f, 1.0f);
        c = new rd2(2);
        d = new jb2(8);
    }

    public static Type A(Type r3, Class r4, Class r5) {
        if (r5 != r4) goto L5;
        return r3;
    L5:
        if (r5.isInterface() == false) goto L18;
        Class<?>[] r6 = r4.getInterfaces();
        int r0 = r6.length;
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L18;
        Class<?> r2 = r6[r1];
        if (r2 == r5) goto L11;
        if (r5.isAssignableFrom(r2) == true) goto L15;
        r1 = r1 + 1;
        goto L7
    L15:
        return A(r4.getGenericInterfaces()[r1], r6[r1], r5);
    L11:
        return r4.getGenericInterfaces()[r1];
    L18:
        if (r4.isInterface() == false) goto L20;
    L30:
        return r5;
    L20:
        if (r4 == Object.class) goto L30;
        Class<?> r7 = r4.getSuperclass();
        if (r7 == r5) goto L24;
        if (r5.isAssignableFrom(r7) == true) goto L28;
        r4 = r7;
        goto L20
    L28:
        return A(r4.getGenericSuperclass(), r7, r5);
    L24:
        return r4.getGenericSuperclass();
    }

    public static final String B(int r1) {
        ya4.g(16);
        String r2 = Integer.toString(r1, 16);
        r2.getClass();
        return "0x".concat(r2);
    }

    public static j02 C(Collection r3) {
        r3.getClass();
        return new j02(0, r3.size() - 1, 1);
    }

    public static final s22 D(ne0 r1) {
        s22 r0 = (s22) r1.K(fz0.h0);
        if (r0 == null) goto L5;
        return r0;
    L5:
        mj0.g(r1, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static int E(List r0) {
        r0.getClass();
        return r0.size() - 1;
    }

    public static ImageButton F(Toolbar r5) {
        Drawable r0 = r5.getNavigationIcon();
        if (r0 != null) goto L5;
        return null;
    L5:
        int r2 = 0;
    L7:
        if (r2 >= r5.getChildCount()) goto L14;
        View r3 = r5.getChildAt(r2);
        if ((r3 instanceof ImageButton) == false) goto L13;
        ImageButton r4 = (ImageButton) r3;
        if (r4.getDrawable() != r0) goto L13;
        return r4;
    L13:
        r2 = r2 + 1;
        goto L7
    L14:
        return null;
    }

    public static Class G(Type r3) {
        if ((r3 instanceof Class) == false) goto L7;
        return (Class) r3;
    L7:
        if ((r3 instanceof ParameterizedType) == false) goto L11;
        Type r4 = ((ParameterizedType) r3).getRawType();
        vr1.d(r4 instanceof Class);
        return (Class) r4;
    L11:
        if ((r3 instanceof GenericArrayType) == false) goto L15;
        return Array.newInstance(G(((GenericArrayType) r3).getGenericComponentType()), 0).getClass();
    L15:
        if ((r3 instanceof TypeVariable) == false) goto L19;
        return Object.class;
    L19:
        if ((r3 instanceof WildcardType) == true) goto L21;
        if (r3 != null) goto L24;
        String r0 = "null";
    L25:
        tb4.h("Expected a Class, ParameterizedType, or GenericArrayType, but <", r3, "> is of type ", r0);
        return null;
    L24:
        r0 = r3.getClass().getName();
        goto L25
    L21:
        return G(((WildcardType) r3).getUpperBounds()[0]);
    }

    public static ArrayList H(MaterialToolbar r4, CharSequence r5) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r4.getChildCount()) goto L11;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof TextView) == false) goto L10;
        TextView r3 = (TextView) r2;
        if (TextUtils.equals(r3.getText(), r5) == false) goto L10;
        r0.add(r3);
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        return r0;
    }

    public static final boolean J(String r1) {
        r1.getClass();
        if (r1.equals("POST") == false) goto L5;
        return true;
    L5:
        if (r1.equals("PATCH") == false) goto L7;
        return true;
    L7:
        if (r1.equals("PUT") == false) goto L9;
        return true;
    L9:
        if (r1.equals("DELETE") == false) goto L11;
        return true;
    L11:
        if (r1.equals("MOVE") == true) goto L20;
        return false;
    L20:
        return true;
    }

    public static final as0 K(s22 r9, boolean r10, u22 r11) {
        if ((r9 instanceof a32) == true) goto L5;
        int r2 = 1;
        Class<u22> r4 = u22.class;
        String r5 = "invoke";
        String r6 = "invoke(Ljava/lang/Throwable;)V";
        return r9.T(r11.r(), r10, new q(r2, r11, r4, r5, r6, 0, 7));
    L5:
        return ((a32) r9).O(r10, r11);
    }

    public static final boolean L(ne0 r1) {
        s22 r2 = (s22) r1.K(fz0.h0);
        if (r2 != null) goto L5;
        return true;
    L5:
        return r2.b();
    }

    public static boolean M(Throwable r2) {
        if (Build.VERSION.SDK_INT == 34) goto L5;
        return false;
    L5:
        if ((r2 instanceof NoSuchMethodError) == true) goto L7;
        return false;
    L7:
        if (r2.getMessage() != null) goto L9;
        return false;
    L9:
        if (r2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(") == false) goto L16;
        return true;
    L16:
        return false;
    }

    public static boolean N(Throwable r2) {
        if (Build.VERSION.SDK_INT == 34) goto L5;
        return false;
    L5:
        if ((r2 instanceof NoSuchMethodError) == true) goto L7;
        return false;
    L7:
        if (r2.getMessage() != null) goto L9;
        return false;
    L9:
        if (r2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(") == false) goto L16;
        return true;
    L16:
        return false;
    }

    public static List O(Object r0) {
        List r1 = Collections.singletonList(r0);
        r1.getClass();
        return r1;
    }

    public static List P(Object... r1) {
        if (r1.length <= 0) goto L7;
        List r2 = Arrays.asList(r1);
        r2.getClass();
        return r2;
    L7:
        return u01.n;
    }

    public static ArrayList Q(Object... r3) {
        if (r3.length != 0) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(new hi(r3, true));
    }

    public static final List R(List r2) {
        int r0 = r2.size();
        if (r0 == 0) goto L10;
        if (r0 == 1) goto L8;
        return r2;
    L8:
        return O(r2.get(0));
    L10:
        return u01.n;
    }

    public static void S(qn4 r6, int r7, wc0 r8) {
        long r1 = r6.k(r7);
        List r5 = r6.m(r1);
        if (r5.isEmpty() == false) goto L6;
        return;
    L6:
        if (r7 == (r6.n() - 1)) goto L11;
        long r3 = r6.k(r7 + 1) - r6.k(r7);
        if (r3 <= 0) goto L13;
        r8.accept(new lg0(r1, r3, r5));
        return;
    L13:
        return;
    L11:
        tb4.a();
    }

    public static final boolean T(String r1) {
        r1.getClass();
        if (r1.equals("GET") == false) goto L5;
        return false;
    L5:
        if (r1.equals("HEAD") == true) goto L10;
        return true;
    L10:
        return false;
    }

    public static final void U(float[] r21, float[] r22) {
        float r3 = t(0, 0, r22, r21);
        float r5 = t(0, 1, r22, r21);
        float r7 = t(0, 2, r22, r21);
        float r9 = t(0, 3, r22, r21);
        float r10 = t(1, 0, r22, r21);
        float r11 = t(1, 1, r22, r21);
        float r12 = t(1, 2, r22, r21);
        float r13 = t(1, 3, r22, r21);
        float r14 = t(2, 0, r22, r21);
        float r15 = t(2, 1, r22, r21);
        float r16 = t(2, 2, r22, r21);
        float r17 = t(2, 3, r22, r21);
        float r18 = t(3, 0, r22, r21);
        float r19 = t(3, 1, r22, r21);
        float r20 = t(3, 2, r22, r21);
        float r1 = t(3, 3, r22, r21);
        r21[0] = r3;
        r21[1] = r5;
        r21[2] = r7;
        r21[3] = r9;
        r21[4] = r10;
        r21[5] = r11;
        r21[6] = r12;
        r21[7] = r13;
        r21[8] = r14;
        r21[9] = r15;
        r21[10] = r16;
        r21[11] = r17;
        r21[12] = r18;
        r21[13] = r19;
        r21[14] = r20;
        r21[15] = r1;
    }

    public static final ne5 V(xu3 r31) {
        int r0 = r31.f();
        if (r0 != 33639248) goto L33;
        r31.skip(4);
        short r1 = r31.n();
        int r2 = r1 & 65535;
        if ((r1 & 1) != 0) goto L30;
        int r22 = r31.n() & 65535;
        int r26 = r31.n() & 65535;
        int r25 = r31.n() & 65535;
        long r16 = ((long) r31.f()) & 4294967295L;
        ix3 r6 = new ix3();
        r6.n = ((long) r31.f()) & 4294967295L;
        ix3 r4 = new ix3();
        r4.n = ((long) r31.f()) & 4294967295L;
        int r3 = r31.n() & 65535;
        int r12 = r31.n() & 65535;
        int r13 = r31.n() & 65535;
        r31.skip(8);
        ix3 r7 = new ix3();
        r7.n = ((long) r31.f()) & 4294967295L;
        String r14 = r31.q(r3);
        if (qm4.n0(r14, 0) == false) goto L9;
        mj0.i("bad zip: filename contains 0x00");
        return null;
    L9:
        if (r4.n != 4294967295L) goto L12;
        long r5 = 8;
    L14:
        if (r6.n != 4294967295L) goto L17;
        r5 = r5 + 8;
    L17:
        if (r7.n != 4294967295L) goto L19;
        r5 = r5 + 8;
    L19:
        long r8 = r5;
        jx3 r9 = new jx3();
        jx3 r10 = new jx3();
        jx3 r11 = new jx3();
        fx3 r15 = new fx3();
        W(r31, r12, new qe5(r15, r8, r4, r31, r6, r7, r9, r10, r11));
        if (r8 > 0) goto L22;
    L26:
        String r17 = r31.q(r13);
        String r18 = ge3.o;
        return new ne5(tv1.z("/").d(r14), xm4.e0(r14, "/", false), r17, r16, r6.n, r4.n, r22, r7.n, r25, r26, (Long) r9.n, (Long) r10.n, (Long) r11.n, 57344);
    L22:
        if (r15.n == true) goto L26;
        mj0.i("bad zip: zip64 extra required but absent");
        return null;
    L12:
        r5 = 0;
        goto L14
    L30:
        mj0.i("unsupported zip: general purpose bit flag=".concat(B(r2)));
        return null;
    L33:
        throw new IOException("bad zip: expected " + B(33639248) + " but was " + B(r0));
    }

    public static final void W(xu3 r11, int r12, wf1 r13) {
        tv r0 = r11.o;
        long r1 = r12;
    L4:
        if (r1 == 0) goto L26;
        if (r1 < 4) goto L18;
        int r14 = r11.n() & 65535;
        long r7 = ((long) r11.n()) & 65535;
        long r2 = r1 - 4;
        if (r2 < r7) goto L16;
        r11.P(r7);
        long r5 = r0.o;
        r13.invoke(Integer.valueOf(r14), Long.valueOf(r7));
        long r9 = (r0.o + r7) - r5;
        if (r9 < 0) goto L14;
        if (r9 <= 0) goto L13;
        r0.skip(r9);
    L13:
        r1 = r2 - r7;
        goto L4
    L14:
        mj0.i(f34.f(r14, "unsupported zip: too many bytes processed for "));
        return;
    L16:
        mj0.i("bad zip: truncated value in extra field");
        return;
    L18:
        mj0.i("bad zip: truncated header in extra field");
        return;
    }

    public static final ne5 X(xu3 r27, ne5 r28) {
        int r2 = r27.f();
        if (r2 != 67324752) goto L15;
        r27.skip(2);
        short r3 = r27.n();
        int r4 = r3 & 65535;
        if ((r3 & 1) != 0) goto L12;
        r27.skip(18);
        long r6 = ((long) r27.n()) & 65535;
        int r5 = r27.n() & 65535;
        r27.skip(r6);
        if (r28 != null) goto L10;
        r27.skip(r5);
        return null;
    L10:
        jx3 r7 = new jx3();
        jx3 r8 = new jx3();
        jx3 r9 = new jx3();
        W(r27, r5, new pe5(r27, r7, r8, r9));
        return new ne5(r28.a, r28.b, r28.c, r28.d, r28.e, r28.f, r28.g, r28.h, r28.i, r28.j, r28.k, r28.l, r28.m, (Integer) r7.n, (Integer) r8.n, (Integer) r9.n);
    L12:
        mj0.i("unsupported zip: general purpose bit flag=".concat(B(r4)));
        return null;
    L15:
        throw new IOException("bad zip: expected " + B(67324752) + " but was " + B(r2));
    }

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
    public static Type Y(Type r9, Class r10, Type r11, HashMap r12) {
        TypeVariable r1 = null;
    L3:
        int r3 = 0;
        if ((r11 instanceof TypeVariable) == false) goto L33;
        TypeVariable r2 = (TypeVariable) r11;
        Type r4 = (Type) r12.get(r2);
        Class r5 = Void.TYPE;
        if (r4 != null) goto L7;
        r12.put(r2, r5);
        if (r1 != null) goto L13;
        r1 = r2;
    L13:
        GenericDeclaration r13 = r2.getGenericDeclaration();
        if ((r13 instanceof Class) == false) goto L16;
        Class r14 = (Class) r13;
    L17:
        if (r14 == null) goto L29;
        Type r6 = A(r9, r10, r14);
        if ((r6 instanceof ParameterizedType) == false) goto L29;
        TypeVariable[] r15 = r14.getTypeParameters();
        int r7 = r15.length;
    L22:
        if (r3 >= r7) goto L27;
        if (r2.equals(r15[r3]) == true) goto L25;
        r3 = r3 + 1;
        goto L22
    L25:
        r11 = ((ParameterizedType) r6).getActualTypeArguments()[r3];
    L30:
        if (r11 != r2) goto L3;
    L79:
        if (r1 == null) goto L81;
        r12.put(r1, r11);
    L81:
        return r11;
    L27:
        tb4.k();
        return null;
    L29:
        r11 = r2;
        goto L30
    L16:
        r14 = null;
        goto L17
    L7:
        if (r4 != r5) goto L9;
        return r11;
    L9:
        return r4;
    L33:
        if ((r11 instanceof Class) == false) goto L42;
        Class r0 = (Class) r11;
        if (r0.isArray() == false) goto L42;
        Class<?> r16 = r0.getComponentType();
        Type r17 = Y(r9, r10, r16, r12);
        if (Objects.equals(r16, r17) == false) goto L39;
        r11 = r0;
        goto L79
    L39:
        Type r18 = new a(0, r17);
    L40:
        r11 = r18;
    L42:
        if ((r11 instanceof GenericArrayType) == false) goto L48;
        r11 = (GenericArrayType) r11;
        Type r8 = r11.getGenericComponentType();
        Type r19 = Y(r9, r10, r8, r12);
        if (Objects.equals(r8, r19) == true) goto L79;
        r18 = new a(0, r19);
        goto L40
    L48:
        if ((r11 instanceof ParameterizedType) == false) goto L60;
        r11 = (ParameterizedType) r11;
        Type r20 = r11.getOwnerType();
        Type r21 = Y(r9, r10, r20, r12);
        boolean r22 = !Objects.equals(r21, r20);
        Type[] r23 = r11.getActualTypeArguments();
        int r24 = r23.length;
    L50:
        if (r3 >= r24) goto L57;
        Type r25 = Y(r9, r10, r23[r3], r12);
        if (Objects.equals(r25, r23[r3]) == true) goto L56;
        if (r22 == true) goto L55;
        r23 = (Type[]) r23.clone();
        r22 = true;
    L55:
        r23[r3] = r25;
    L56:
        r3 = r3 + 1;
        goto L50
    L57:
        if (r22 == false) goto L79;
        r18 = new b(r21, r11.getRawType(), r23);
        goto L40
    L60:
        if ((r11 instanceof WildcardType) == false) goto L79;
        r11 = (WildcardType) r11;
        Type[] r26 = r11.getLowerBounds();
        Type[] r27 = r11.getUpperBounds();
        if (r26.length != 1) goto L71;
        Type r28 = Y(r9, r10, r26[0], r12);
        if (r28 == r26[0]) goto L79;
        if ((r28 instanceof WildcardType) == false) goto L68;
        Type[] r29 = ((WildcardType) r28).getLowerBounds();
    L69:
        r11 = new c(new Type[]{Object.class}, r29, 0);
        goto L79
    L68:
        r29 = new Type[]{r28};
        goto L69
    L71:
        if (r27.length != 1) goto L79;
        Type r30 = Y(r9, r10, r27[0], r12);
        if (r30 == r27[0]) goto L79;
        if ((r30 instanceof WildcardType) == false) goto L77;
        Type[] r31 = ((WildcardType) r30).getUpperBounds();
    L78:
        r11 = new c(r31, a, 0);
        goto L79
    L77:
        r31 = new Type[]{r30};
        goto L78
    }

    public static final Object Z(gu4 r4, wf1 r5) {
        K(r4, true, new es0(au0.t(r4.s.getContext()).F(r4.t, r4, r4.r)));
    L6:
        th = move-exception;
        Object r6 = new a70(th, false);
    L11:
        xe0 r0 = xe0.n;
        if (r6 == r0) goto L36;
        Object r1 = r4.S(r6);
        if (r1 != zz1.e) goto L18;
        return r0;
    L18:
        if ((r1 instanceof a70) == false) goto L29;
        Throwable r2 = ((a70) r1).a;
        if ((r2 instanceof TimeoutCancellationException) == true) goto L22;
        throw r2;
    L22:
        if (((TimeoutCancellationException) r2).n == r4) goto L24;
        throw r2;
    L24:
        if ((r6 instanceof a70) == false) goto L31;
        throw ((a70) r6).a;
    L31:
        return r6;
    L29:
        r6 = zz1.M(r1);
        goto L31
    L36:
        return r0;
    L4:
        if ((r5 instanceof jp) == true) goto L8;
        r6 = ya4.Q(r5, r4, r4);     // Catch: Throwable -> L6
    L32:
        goto L11
    L8:
        jz4.j(2, r5);     // Catch: Throwable -> L6
        r6 = r5.invoke(r4, r4);     // Catch: Throwable -> L6
        goto L32
    }

    public static t22 a() {
        return new t22(null);
    }

    public static List a0(ArrayList r4, ku3 r5) {
        List r6 = q40.S0(r4);
        ArrayList r0 = (ArrayList) r6;
        int r1 = r0.size() - 1;
    L3:
        if (r1 <= 0) goto L5;
        int r2 = r5.a(r1 + 1);
        r0.set(r2, r0.set(r1, r0.get(r2)));
        r1 = r1 - 1;
        goto L3
    L5:
        return r6;
    }

    public static final void b(float[] r0, float r1, float r2, float[] r3) {
        ya4.G(r3);
        ya4.N(r3, r1, r2);
        U(r0, r3);
    }

    public static h02 b0(j02 r2, int r3) {
        r2.getClass();
        if (r3 <= 0) goto L5;
        boolean r0 = true;
    L6:
        Integer r1 = Integer.valueOf(r3);
        if (r0 == false) goto L15;
        int r4 = r2.n;
        int r5 = r2.o;
        if (r2.p > 0) goto L13;
        r3 = -r3;
    L13:
        return new h02(r4, r5, r3);
    L15:
        throw new IllegalArgumentException("Step must be positive, was: " + r1 + '.');
    L5:
        r0 = false;
        goto L6
    }

    public static final void c(v3 r2, i94 r3) {
        if (xl.b(r3) == false) goto L11;
        e94 r4 = r3.d;
        p94 r0 = d94.i;
        Object r5 = r4.n.g(r0);
        if (r5 != null) goto L7;
        r5 = null;
    L7:
        w2 r6 = (w2) r5;
        if (r6 == null) goto L12;
        r2.b(new o3(R.id.accessibilityActionSetProgress, r6.a));
        return;
    L12:
        return;
    }

    public static void c0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ArrayList d(Object... r3) {
        if (r3.length != 0) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(new hi(r3, true));
    }

    public static void d0(qn4 r12, yn4 r13, wc0 r14) {
        long r0 = r13.b;
        int r5 = 0;
        if (r0 != (-9223372036854775807L)) goto L5;
        int r4 = 0;
    L13:
        if (r0 != (-9223372036854775807L)) goto L15;
    L21:
        boolean r2 = false;
    L22:
        int r3 = r4;
    L24:
        if (r3 >= r12.n()) goto L27;
        S(r12, r3, r14);
        r3 = r3 + 1;
        goto L24
    L27:
        if (r13.a == false) goto L38;
        if (r2 == false) goto L30;
        r4 = r4 - 1;
    L30:
        if (r5 >= r4) goto L32;
        S(r12, r5, r14);
        r5 = r5 + 1;
        goto L30
    L32:
        if (r2 == false) goto L39;
        r14.accept(new lg0(r12.k(r4), r0 - r12.k(r4), r12.m(r0)));
        return;
    L39:
        return;
    L38:
        return;
    L15:
        if (r4 >= r12.n()) goto L21;
        List r11 = r12.m(r0);
        long r6 = r12.k(r4);
        if (r11.isEmpty() == true) goto L21;
        long r7 = r13.b;
        if (r7 >= r6) goto L21;
        r14.accept(new lg0(r7, r6 - r7, r11));
        r2 = true;
        goto L22
    L5:
        r4 = r12.e(r0);
        if (r4 != (-1)) goto L8;
        r4 = r12.n();
    L8:
        if (r4 <= 0) goto L13;
        if (r12.k(r4 - 1) != r0) goto L13;
        r4 = r4 - 1;
        goto L13
    }

    public static int e(ArrayList r4, Comparable r5) {
        int r0 = r4.size();
        r4.getClass();
        int r1 = r4.size();
        int r2 = 0;
        if (r0 < 0) goto L17;
        if (r0 > r1) goto L15;
        int r3 = r0 - 1;
    L6:
        if (r2 > r3) goto L14;
        int r6 = (r2 + r3) >>> 1;
        int r7 = fu.l((Comparable) r4.get(r6), r5);
        if (r7 < 0) goto L9;
        if (r7 <= 0) goto L12;
        r3 = r6 - 1;
        goto L6
    L12:
        return r6;
    L9:
        r2 = r6 + 1;
        goto L6
    L14:
        return -(r2 + 1);
    L15:
        kf2.h(b11.n("toIndex (", ") is greater than size (", r0, r1, ")."));
        return 0;
    L17:
        kf2.n(b11.n("fromIndex (", ") is greater than toIndex (", 0, r0, ")."));
        return 0;
    }

    public static String e0(Type r1) {
        if ((r1 instanceof Class) == false) goto L7;
        return ((Class) r1).getName();
    L7:
        return r1.toString();
    }

    public static qb2 f(qb2 r1) {
        r1.g();
        r1.p = true;
        if (r1.o <= 0) goto L6;
        return r1;
    L6:
        return qb2.q;
    }

    public static final LinkedHashMap g(ArrayList r22) {
        String r0 = ge3.o;
        ge3 r2 = tv1.z("/");
        boolean r3 = true;
        String r4 = null;
        long r5 = 0;
        long r7 = 0;
        long r9 = 0;
        int r11 = 0;
        long r12 = 0;
        int r14 = 0;
        int r15 = 0;
        Long r16 = null;
        Long r17 = null;
        kd3[] r1 = {new kd3(r2, new ne5(r2, r3, r4, r5, r7, r9, r11, r12, r14, r15, r16, r17, null, 65532))};
        LinkedHashMap r6 = new LinkedHashMap(lg2.W(1));
        lg2.Y(r6, r1);
        Iterator r8 = q40.K0(r22, new jb2(9)).iterator();
    L4:
        if (r8.hasNext() == false) goto L14;
        ne5 r10 = (ne5) r8.next();
        if (((ne5) r6.put(r10.a, r10)) != null) goto L4;
    L7:
        ge3 r13 = r10.a;
        ge3 r18 = r13.b();
        if (r18 == null) goto L4;
        ne5 r19 = (ne5) r6.get(r18);
        if (r19 != null) goto L12;
        boolean r20 = true;
        String r21 = null;
        long r23 = 0;
        long r24 = 0;
        long r110 = 0;
        int r111 = 0;
        long r112 = 0;
        int r113 = 0;
        int r114 = 0;
        Long r115 = null;
        Long r116 = null;
        ne5 r25 = new ne5(r18, r20, r21, r23, r24, r110, r111, r112, r113, r114, r115, r116, null, 65532);
        r6.put(r18, r25);
        r25.q.add(r13);
        r10 = r25;
        goto L7
    L12:
        r19.q.add(r13);
        goto L4
    L14:
        return r6;
    }

    public static j02 g0(int r2, int r3) {
        if (r3 > Integer.MIN_VALUE) goto L7;
        j02 r4 = j02.q;
        return j02.q;
    L7:
        return new j02(r2, r3 - 1, 1);
    }

    public static Type h(Type r3) {
        if ((r3 instanceof Class) == false) goto L10;
        Class r4 = (Class) r3;
        if (r4.isArray() == true) goto L7;
        return r4;
    L7:
        return new a(0, h(r4.getComponentType()));
    L10:
        if ((r3 instanceof ParameterizedType) == false) goto L14;
        ParameterizedType r5 = (ParameterizedType) r3;
        return new b(r5.getOwnerType(), r5.getRawType(), r5.getActualTypeArguments());
    L14:
        if ((r3 instanceof GenericArrayType) == false) goto L18;
        return new a(0, ((GenericArrayType) r3).getGenericComponentType());
    L18:
        if ((r3 instanceof WildcardType) == false) goto L21;
        WildcardType r6 = (WildcardType) r3;
        return new c(r6.getUpperBounds(), r6.getLowerBounds(), 0);
    L21:
        return r3;
    }

    public static final void h0(i94 r9, int r10, i64 r11) {
        f13 r0 = new f13(new i94[16]);
        List r12 = r9.i(false, false);
    L3:
        r0.d(r12, r0.p);
    L4:
        int r13 = r0.p;
        if (r13 == 0) goto L34;
        i94 r14 = (i94) r0.k(r13 - 1);
        boolean r2 = wr1.H(r14);
        e94 r3 = r14.d;
        w03 r4 = r3.n;
        if (r2 == true) goto L4;
        if (r4.c(n94.j) == true) goto L4;
        f63 r5 = r14.d();
        if (r5 == null) goto L33;
        k02 r6 = rr2.Q(wr1.d(r5, true));
        if (r6.a >= r6.c) goto L4;
        if (r6.b >= r6.d) goto L4;
        Object r7 = r3.n.g(d94.e);
        Object r8 = null;
        if (r7 != null) goto L21;
        r7 = null;
    L21:
        wf1 r15 = (wf1) r7;
        Object r16 = r4.g(n94.v);
        if (r16 == null) goto L25;
        r8 = r16;
    L25:
        h64 r17 = (h64) r8;
        if (r15 == null) goto L31;
        if (r17 == null) goto L31;
        if (((Number) r17.b.invoke()).floatValue() <= 0.0f) goto L31;
        int r18 = 1 + r10;
        r11.invoke(new j64(r14, r18, r6, r5));
        h0(r14, r18, r11);
    L31:
        r12 = r14.i(false, false);
        goto L3
    L33:
        throw xa3.l("Expected semantics node to have a coordinator.");
    }

    public static void i(Type r1) {
        if ((r1 instanceof Class) == true) goto L5;
    L8:
        boolean r2 = true;
    L9:
        vr1.d(r2);
        return;
    L5:
        if (((Class) r1).isPrimitive() == false) goto L8;
        r2 = false;
        goto L9
    }

    public static final Object i0(long r7, r r9, ha0 r10) {
        om0 r0 = mx0.n;
        if (r7 <= 0) goto L5;
        boolean r2 = true;
    L7:
        if (r2 != true) goto L17;
        long r8 = mx0.b(r7, e35.W(999999, ox0.o));
        if ((((int) r8) & 1) == 1) goto L11;
    L16:
        long r11 = mx0.c(r8, ox0.p);
    L20:
        if (r11 <= 0) goto L24;
        return Z(new gu4(r11, r10), r9);
    L24:
        throw new TimeoutCancellationException("Timed out immediately", null);
    L11:
        if (r8 == mx0.o) goto L16;
        if (r8 == mx0.p) goto L16;
        r11 = r8 >> 1;
        goto L20
    L17:
        if (r2 == true) goto L25;
        r11 = 0;
        goto L20
    L25:
        er1.n();
        return null;
    L5:
        r2 = false;
        goto L7
    }

    public static float j(float r1, float r2) {
        if (r1 <= r2) goto L5;
        return r2;
    L5:
        return r1;
    }

    public static final Object j0(long r6, wf1 r8, wd0 r9) {
        if ((r9 instanceof hu4) == false) goto L7;
        hu4 r0 = (hu4) r9;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r10 = r0.o;
        int r2 = r0.p;
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        jx3 r7 = r0.n;
        kb4.X(r10);     // Catch: TimeoutCancellationException -> L14
        return r10;
    L14:
        e = e;
    L30:
        if (e.n != r7.n) goto L32;
    L31:
        return null;
    L32:
        throw e;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r10);
        if (r6 <= 0) goto L31;
        jx3 r11 = new jx3();
        r0.n = r11;     // Catch: TimeoutCancellationException -> L27
        r0.p = 1;     // Catch: TimeoutCancellationException -> L27
        gu4 r3 = new gu4(r6, r0);     // Catch: TimeoutCancellationException -> L27
        r11.n = r3;     // Catch: TimeoutCancellationException -> L27
        Object r12 = Z(r3, r8);     // Catch: TimeoutCancellationException -> L27
        xe0 r13 = xe0.n;
        if (r12 != r13) goto L26;
        return r13;
    L26:
        return r12;
    L27:
        e = e;
        r7 = r11;
    L7:
        r0 = new hu4(r9);
        goto L8
    }

    public static double k(double r1, double r3, double r5) {
        if (r3 > r5) goto L12;
        if (r1 >= r3) goto L8;
        return r3;
    L8:
        if (r1 <= r5) goto L10;
        return r5;
    L10:
        return r1;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r5 + " is less than minimum " + r3 + '.');
    }

    public static float l(float r2, float r3, float r4) {
        if (r3 > r4) goto L12;
        if (r2 >= r3) goto L8;
        return r3;
    L8:
        if (r2 <= r4) goto L10;
        return r4;
    L10:
        return r2;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r4 + " is less than minimum " + r3 + '.');
    }

    public static int m(int r2, int r3, int r4) {
        if (r3 > r4) goto L9;
        if (r2 >= r3) goto L5;
        return r3;
    L5:
        if (r2 <= r4) goto L7;
        return r4;
    L7:
        return r2;
    L9:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r4 + " is less than minimum " + r3 + '.');
    }

    public static long n(long r1, long r3, long r5) {
        if (r3 > r5) goto L12;
        if (r1 >= r3) goto L8;
        return r3;
    L8:
        if (r1 <= r5) goto L10;
        return r5;
    L10:
        return r1;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r5 + " is less than minimum " + r3 + '.');
    }

    public static final ia1 o(Context r4) {
        pa r1 = new pa(1);
        r4.getApplicationContext();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r5 = hb1.a.a(r4);
    L7:
        return new ia1(r1, new zb(r5));
    L5:
        r5 = 0;
        goto L7
    }

    public static b3 p(String r3, Bundle r4) {
        r4.getClass();
        switch(r3.hashCode()) {
            case -1678407252: goto L31;
            case -1072734346: goto L19;
            case -543568185: goto L13;
            case -95037569: goto L7;
            default: goto L41;
        };     // Catch: FrameworkClassParsingException -> L42
    L41:
        throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L42
    L7:
        if (r3.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") == false) goto L41;
        String r0 = r4.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");     // Catch: Exception -> L10
        r0.getClass();     // Catch: Exception -> L10
        return new dq0(r0, 2, r4);
    L11:
        throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L42
    L13:
        if (r3.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL") == false) goto L41;
        String r1 = r4.getString("androidx.credentials.BUNDLE_KEY_ID");     // Catch: Exception -> L16
        String r2 = r4.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");     // Catch: Exception -> L16
        r1.getClass();     // Catch: Exception -> L16
        r2.getClass();     // Catch: Exception -> L16
        return new dq0(r2, 1, r4);
    L17:
        throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L42
    L19:
        if (r3.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL") == false) goto L41;
        String r5 = r4.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");     // Catch: FrameworkClassParsingException -> L42
        if (r5 == null) goto L29;
        dq0 r6 = new dq0("androidx.credentials.TYPE_RESTORE_CREDENTIAL", r4);     // Catch: FrameworkClassParsingException -> L42
        if (r5.length() == 0) goto L27;
        new JSONObject(r5);     // Catch: Exception -> L44
        return r6;
    L27:
        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");     // Catch: FrameworkClassParsingException -> L42
    L29:
        throw new NoCredentialException("The device does not contain a restore credential.");     // Catch: FrameworkClassParsingException -> L42
    L31:
        if (r3.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL") == false) goto L41;
        String r7 = r4.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");     // Catch: Exception -> L38
        r7.getClass();     // Catch: Exception -> L38
        dq0 r8 = new dq0("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", r4);     // Catch: Exception -> L38
        if (r7.length() == 0) goto L37;
        new JSONObject(r7);     // Catch: Exception -> L45
        return r8;
    L37:
        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");     // Catch: Exception -> L38
    L39:
        throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L42
    L43:
        return new tg0(r3, r4);
    }

    public static final void q(gk1 r7, b45 r8) {
        List r9 = r8.w;
        int r0 = r9.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L15;
        d45 r2 = (d45) r9.get(r1);
        if ((r2 instanceof f45) == false) goto L12;
        he3 r3 = new he3();
        f45 r4 = (f45) r2;
        r3.d = r4.o;
        r3.n = true;
        r3.c();
        int r5 = r4.p;
        Path r6 = r3.s.a;
        if (r5 != 1) goto L9;
        Path.FillType r10 = Path.FillType.EVEN_ODD;
    L10:
        r6.setFillType(r10);
        r3.c();
        r3.c();
        r3.b = r4.q;
        r3.c();
        r3.c = r4.r;
        r3.c();
        r3.g = r4.s;
        r3.c();
        r3.e = r4.t;
        r3.c();
        r3.f = r4.u;
        r3.o = true;
        r3.c();
        r3.h = r4.v;
        r3.o = true;
        r3.c();
        r3.i = r4.w;
        r3.o = true;
        r3.c();
        r3.j = r4.x;
        r3.o = true;
        r3.c();
        r3.k = r4.y;
        r3.p = true;
        r3.c();
        r3.l = r4.z;
        r3.p = true;
        r3.c();
        r3.m = r4.A;
        r3.p = true;
        r3.c();
        r7.e(r1, r3);
    L14:
        r1 = r1 + 1;
        goto L3
    L9:
        r10 = Path.FillType.WINDING;
        goto L10
    L12:
        if ((r2 instanceof b45) == false) goto L14;
        gk1 r11 = new gk1();
        b45 r12 = (b45) r2;
        r11.k = r12.n;
        r11.c();
        r11.l = r12.o;
        r11.s = true;
        r11.c();
        r11.o = r12.r;
        r11.s = true;
        r11.c();
        r11.p = r12.s;
        r11.s = true;
        r11.c();
        r11.q = r12.t;
        r11.s = true;
        r11.c();
        r11.r = r12.u;
        r11.s = true;
        r11.c();
        r11.m = r12.p;
        r11.s = true;
        r11.c();
        r11.n = r12.q;
        r11.s = true;
        r11.c();
        r11.f = r12.v;
        r11.g = true;
        r11.c();
        q(r11, r12);
        r7.e(r1, r11);
        goto L14
    }

    public static qb2 r() {
        return new qb2(10);
    }

    public static Bitmap s(byte[] r10, int r11, int r12) {
        int r1 = 0;
        int r2 = 1;
        if (r12 == (-1)) goto L7;
        BitmapFactory.Options r0 = new BitmapFactory.Options();
        r0.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(r10, 0, r11, r0);
        int r3 = Math.max(r0.outWidth, r0.outHeight);
        r0.inJustDecodeBounds = false;
        r0.inSampleSize = 1;
    L5:
        if (r3 <= r12) goto L8;
        r0.inSampleSize *= 2;
        r3 = r3 / 2;
    L8:
        Bitmap r4 = BitmapFactory.decodeByteArray(r10, 0, r11, r0);
        if (r0 == null) goto L11;
        r0.inSampleSize = 1;
    L11:
        if (r4 == null) goto L35;
        ByteArrayInputStream r13 = new ByteArrayInputStream(r10);
        f31 r14 = new f31(r13);     // Catch: Throwable -> L27
        r13.close();
        b31 r15 = r14.c("Orientation");
        if (r15 != null) goto L39;
    L18:
        switch(r2) {
            case 3: goto L22;
            case 4: goto L22;
            case 5: goto L21;
            case 6: goto L20;
            case 7: goto L20;
            case 8: goto L21;
            default: goto L23;
        };
    L20:
        r1 = 90;
        goto L23
    L21:
        r1 = 270;
        goto L23
    L22:
        r1 = 180;
    L23:
        if (r1 == 0) goto L26;
        Matrix r8 = new Matrix();
        r8.postRotate(r1);
        return Bitmap.createBitmap(r4, 0, 0, r4.getWidth(), r4.getHeight(), r8, false);
    L26:
        return r4;
    L39:
        r2 = r15.e(r14.f);     // Catch: NumberFormatException -> L36
    L27:
        th = move-exception;
        r13.close();     // Catch: Throwable -> L31
        throw th;
    L31:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L35:
        throw ParserException.a(new IllegalStateException(), "Could not decode image data");
    L7:
        r0 = null;
        goto L8
    }

    public static final float t(int r3, int r4, float[] r5, float[] r6) {
        int r7 = r3 * 4;
        float r1 = r5[r7] * r6[r4];
        float r2 = (r5[r7 + 1] * r6[4 + r4]) + r1;
        float r0 = (r5[r7 + 2] * r6[8 + r4]) + r2;
        return (r5[r7 + 3] * r6[12 + r4]) + r0;
    }

    public static final void u(ne0 r1) {
        s22 r2 = (s22) r1.K(fz0.h0);
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.b() == false) goto L8;
        return;
    L8:
        throw r2.q();
    }

    public static boolean v(Type r4, Type r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if ((r4 instanceof Class) == false) goto L10;
        return r4.equals(r5);
    L10:
        if ((r4 instanceof ParameterizedType) == false) goto L23;
        if ((r5 instanceof ParameterizedType) == true) goto L14;
        return false;
    L14:
        ParameterizedType r6 = (ParameterizedType) r4;
        ParameterizedType r7 = (ParameterizedType) r5;
        if (Objects.equals(r6.getOwnerType(), r7.getOwnerType()) == true) goto L17;
    L21:
        return false;
    L17:
        if (r6.getRawType().equals(r7.getRawType()) == false) goto L21;
        if (Arrays.equals(r6.getActualTypeArguments(), r7.getActualTypeArguments()) == false) goto L21;
        return true;
    L23:
        if ((r4 instanceof GenericArrayType) == false) goto L30;
        if ((r5 instanceof GenericArrayType) == true) goto L28;
        return false;
    L28:
        return v(((GenericArrayType) r4).getGenericComponentType(), ((GenericArrayType) r5).getGenericComponentType());
    L30:
        if ((r4 instanceof WildcardType) == false) goto L41;
        if ((r5 instanceof WildcardType) == true) goto L34;
        return false;
    L34:
        WildcardType r8 = (WildcardType) r4;
        WildcardType r9 = (WildcardType) r5;
        if (Arrays.equals(r8.getUpperBounds(), r9.getUpperBounds()) == true) goto L37;
    L39:
        return false;
    L37:
        if (Arrays.equals(r8.getLowerBounds(), r9.getLowerBounds()) == false) goto L39;
        return true;
    L41:
        if ((r4 instanceof TypeVariable) == true) goto L43;
    L50:
        return false;
    L43:
        if ((r5 instanceof TypeVariable) == true) goto L45;
        return false;
    L45:
        TypeVariable r10 = (TypeVariable) r4;
        TypeVariable r11 = (TypeVariable) r5;
        if (r10.getGenericDeclaration() != r11.getGenericDeclaration()) goto L50;
        if (r10.getName().equals(r11.getName()) == false) goto L50;
        return true;
    }

    public static qm2 w(ci0 r17, String r18, byte[] r19, Map r20) {
        yl4 r1 = new yl4(r17);
        Map r0 = Collections.EMPTY_MAP;
        Uri r3 = Uri.parse(r18);
        rr2.s(r3, "The uri must be set.");
        ii0 r2 = new ii0(r3, 0, 2, r19, r20, 0, -1, null, 1);
        ii0 r14 = r2;
        int r15 = 0;
    L51:
        gi0 r4 = new gi0(r1, r14);     // Catch: Exception -> L45
        byte[] r5 = xw.b(r4);     // Catch: Throwable -> L21 HttpDataSource$InvalidResponseCodeException -> L23
    L57:
        ii0 r6 = r2;
        gi0 r7 = r4;
        ed2 r8 = new ed2(r6, r1.p, r1.q, SystemClock.elapsedRealtime(), 0, r5.length);     // Catch: Throwable -> L13 HttpDataSource$InvalidResponseCodeException -> L15
        qr2 r9 = new qr2(12, r5);     // Catch: Throwable -> L13 HttpDataSource$InvalidResponseCodeException -> L15
        r9.p = r8;     // Catch: Throwable -> L13 HttpDataSource$InvalidResponseCodeException -> L15
        qm2 r10 = new qm2(r9);     // Catch: Throwable -> L13 HttpDataSource$InvalidResponseCodeException -> L15
        f35.h(r7);     // Catch: Exception -> L11
        return r10;
    L15:
        e = e;
    L25:
        int r11 = e.p;     // Catch: Throwable -> L13
        String r12 = null;
        if (r11 == 307) goto L30;
        if (r11 == 308) goto L30;
    L38:
        if (r12 == null) goto L42;
        r15 = r15 + 1;     // Catch: Throwable -> L13
        hi0 r13 = r14.a();     // Catch: Throwable -> L13
        r13.a = Uri.parse(r12);     // Catch: Throwable -> L13
        r14 = r13.a();     // Catch: Throwable -> L13
        f35.h(r7);     // Catch: Exception -> L11
        r2 = r6;
    L11:
        e = e;
    L48:
        throw new MediaDrmCallbackException(r6, r1.p, r1.n.j(), r1.o, e);
    L42:
        throw e;     // Catch: Throwable -> L13
    L30:
        if (r15 >= 5) goto L38;
        Map r16 = e.q;     // Catch: Throwable -> L13
        if (r16 == null) goto L38;
        List r21 = (List) r16.get("Location");     // Catch: Throwable -> L13
        if (r21 == null) goto L38;
        if (r21.isEmpty() == true) goto L38;
        r12 = (String) r21.get(0);     // Catch: Throwable -> L13
    L13:
        th = th;
    L43:
        f35.h(r7);     // Catch: Exception -> L11
        throw th;     // Catch: Exception -> L11
    L19:
        e = e;
        r6 = r2;
        r7 = r4;
    L17:
        th = th;
        r7 = r4;
    L23:
        e = e;
        r6 = r2;
        r7 = r4;
    L21:
        th = th;
        r7 = r4;
    L45:
        e = e;
        r6 = r2;
        goto L48
    }

    public static final v23 x(View r4) {
        r4.getClass();
        g71 r0 = new g71(new h71(new tq4(fa4.c0(k5.A, r4), k5.B, 1), false, new o54(13)));
        if (r0.hasNext() == true) goto L5;
        Object r1 = null;
    L6:
        v23 r2 = (v23) r1;
        if (r2 == null) goto L9;
        return r2;
    L9:
        nz2.w(r4, " does not have a NavController set", "View ");
        return null;
    L5:
        r1 = r0.next();
        goto L6
    }

    public static ActionMenuView y(Toolbar r3) {
        int r0 = 0;
    L4:
        if (r0 >= r3.getChildCount()) goto L10;
        View r1 = r3.getChildAt(r0);
        if ((r1 instanceof ActionMenuView) == true) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        return (ActionMenuView) r1;
    L10:
        return null;
    }

    public static final xi2 z(f82 r12, int r13, long r14, nc3 r16, long r17, hb3 r19, fs r20, gs r21, r62 r22, boolean r23, int r24, i03 r25) {
        Object r6 = r16.c(r13);
        List r0 = (List) r25.b(r13);
        if (r0 == null) goto L5;
        List r3 = r0;
    L10:
        return new xi2(r13, r24, r3, r17, r6, r19, r20, r21, r22, r23);
    L5:
        List r15 = r12.a(r13);
        int r1 = r15.size();
        ArrayList r2 = new ArrayList(r1);
        int r4 = 0;
    L6:
        if (r4 >= r1) goto L8;
        r2.add(((pi2) r15.get(r4)).r(r14));
        r4 = r4 + 1;
        goto L6
    L8:
        r25.i(r13, r2);
        r3 = r2;
        goto L10
    }

    public abstract zk2 I();

    public abstract void f0(np2 r1);
}
