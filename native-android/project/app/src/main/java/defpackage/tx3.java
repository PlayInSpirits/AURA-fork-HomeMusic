package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tx3 implements cz4 {
    public final mf4 n;
    public final int o;
    public final u21 p;
    public final List q;

    public tx3(mf4 r1, int r2, u21 r3, p40 r4, List r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r5;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r5, TypeToken r6) {
        Class r0 = r6.getRawType();
        if (Object.class.isAssignableFrom(r0) == true) goto L6;
        return null;
    L6:
        fu.x(this.q);
        if (ox3.a.u(r0) == false) goto L11;
        return new sx3(r0, b(r5, r6, r0, true));
    L11:
        return new rx3(this.n.e(r6), b(r5, r6, r0, false));
    }

    public final LinkedHashMap b(nk1 r27, TypeToken r28, Class r29, boolean r30) {
        LinkedHashMap r13 = new LinkedHashMap();
        if (r29.isInterface() == true) goto L89;
        TypeToken r14 = r28;
        Class r15 = r29;
    L7:
        if (r15 == Object.class) goto L89;
        Field[] r1 = r15.getDeclaredFields();
        if (r15 != r29) goto L11;
    L13:
        int r3 = r1.length;
        boolean r4 = false;
        int r5 = 0;
    L14:
        if (r5 >= r3) goto L88;
        int r6 = r3;
        Field r7 = r1[r5];
        boolean r8 = this.c(r7, true);
        boolean r10 = this.c(r7, r4);
        if (r8 == true) goto L20;
        if (r10 == true) goto L20;
        boolean r25 = r4;
        int r21 = r5;
        int r23 = r6;
    L85:
        r5 = r21 + 1;
        tx3 this = this;
        r27 = r27;
        r1 = r1;
        r3 = r23;
        r4 = r25;
    L20:
        if (r30 == true) goto L22;
    L24:
        Method r12 = null;
    L32:
        if (r12 != null) goto L34;
        ox3.e(r7);
    L34:
        boolean r17 = true;
        Type r19 = gb.Y(r14.getType(), r15, r7.getGenericType(), new HashMap());
        ka4 r2 = (ka4) r7.getAnnotation(ka4.class);
        if (r2 == null) goto L37;
        String r9 = r2.value();
        String[] r11 = r2.alternate();
        if (r11.length != 0) goto L49;
        List r16 = Collections.singletonList(r9);
    L50:
        int r18 = r16.size();
        px3 r110 = null;
        int r20 = 0;
    L51:
        if (r20 >= r18) goto L83;
        String r22 = (String) r16.get(r20);
        if (r20 == 0) goto L55;
        r8 = false;
    L55:
        int r24 = r5;
        boolean r26 = r10;
        TypeToken<?> r111 = TypeToken.get(r19);
        Class<? super Object> r210 = r111.getRawType();
        if (r210 != null) goto L58;
    L60:
        boolean r112 = false;
    L61:
        int r211 = r7.getModifiers();
        if (Modifier.isStatic(r211) == true) goto L64;
    L67:
        boolean r113 = false;
    L66:
        List r212 = r16;
        e32 r31 = (e32) r7.getAnnotation(e32.class);
        if (r31 == null) goto L71;
        bz4 r32 = p40.b(this.n, r27, r111, r31);
    L72:
        int r33 = r20;
        if (r32 == null) goto L75;
        boolean r34 = r17;
    L76:
        if (r32 != null) goto L78;
        r32 = r27.g(r111);
    L78:
        px3 r0 = r110;
        boolean r213 = r17;
        int r114 = r18;
        boolean r35 = r8;
        r110 = (px3) r13.put(r22, new px3(r22, r7, r35, r26, r12, r34, r32, r27, r111, r112, r113));
        if (r0 == null) goto L82;
        r110 = r0;
    L82:
        r20 = r33 + 1;
        this = this;
        r27 = r27;
        r8 = r35;
        r10 = r26;
        r12 = r12;
        r18 = r114;
        r5 = r24;
        r17 = r213;
        r6 = r6;
        r16 = r212;
        goto L51
    L75:
        r34 = false;
        goto L76
    L71:
        r32 = null;
        goto L72
    L64:
        if (Modifier.isFinal(r211) == false) goto L67;
        r113 = r17;
        goto L66
    L58:
        if (r210.isPrimitive() == false) goto L60;
        r112 = r17;
        goto L61
    L83:
        r21 = r5;
        r23 = r6;
        px3 r36 = r110;
        r25 = false;
        if (r36 == null) goto L85;
        throw new IllegalArgumentException("Class " + r29.getName() + " declares multiple JSON fields named '" + r36.a + "'; conflict is caused by fields " + ox3.c(r36.b) + " and " + ox3.c(r7));
    L49:
        ArrayList r37 = new ArrayList(r11.length + 1);
        r37.add(r9);
        Collections.addAll(r37, r11);
        r16 = r37;
        goto L50
    L37:
        switch(this.o) {
            case 1: goto L44;
            case 2: goto L43;
            case 3: goto L42;
            case 4: goto L41;
            case 5: goto L40;
            case 6: goto L39;
            default: goto L38;
        };
    L38:
        String r38 = b11.a(r7.getName(), '.').toLowerCase(Locale.ENGLISH);
    L45:
        r16 = Collections.singletonList(r38);
        goto L50
    L39:
        r38 = b11.a(r7.getName(), '-').toLowerCase(Locale.ENGLISH);
        goto L45
    L40:
        r38 = b11.a(r7.getName(), '_').toLowerCase(Locale.ENGLISH);
        goto L45
    L41:
        r38 = b11.a(r7.getName(), '_').toUpperCase(Locale.ENGLISH);
        goto L45
    L42:
        r38 = b11.b(b11.a(r7.getName(), ' '));
        goto L45
    L43:
        r38 = b11.b(r7.getName());
        goto L45
    L44:
        r38 = r7.getName();
        goto L45
    L22:
        if (Modifier.isStatic(r7.getModifiers()) == false) goto L25;
        r10 = r4;
        goto L24
    L25:
        r12 = ox3.a.h(r15, r7);
        ox3.e(r12);
        if (r12.getAnnotation(ka4.class) == null) goto L32;
        if (r7.getAnnotation(ka4.class) != null) goto L32;
        throw new JsonIOException(xa3.h("@SerializedName on ", ox3.d(r12, r4), " is not supported"));
    L88:
        r14 = TypeToken.get(gb.Y(r14.getType(), r15, r15.getGenericSuperclass(), new HashMap()));
        r15 = r14.getRawType();
        goto L7
    L11:
        if (r1.length <= 0) goto L13;
        fu.x(this.q);
    L89:
        return r13;
    }

    public final boolean c(Field r3, boolean r4) {
        Class<?> r0 = r3.getType();
        u21 r2 = this.p;
        r2.getClass();
        if (u21.c(r0) == true) goto L25;
        r2.b(r4);
        if ((136 & r3.getModifiers()) == 0) goto L8;
        return false;
    L8:
        if (r3.isSynthetic() == false) goto L11;
        return false;
    L11:
        if (u21.c(r3.getType()) == true) goto L30;
        if (r4 == false) goto L15;
        List r5 = r2.n;
    L17:
        if (r5.isEmpty() == true) goto L23;
        Iterator r6 = r5.iterator();
        if (r6.hasNext() == true) goto L22;
        return true;
    L22:
        throw xa3.d(r6);
    L23:
        return true;
    L15:
        r5 = r2.o;
        goto L17
    L30:
        return false;
    L25:
        return false;
    }
}
