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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tx3 implements cz4 {
    public final mf4 n;
    public final int o;
    public final u21 p;
    public final List q;

    public tx3(mf4 mf4Var, int i, u21 u21Var, p40 p40Var, List list) {
        this.n = mf4Var;
        this.o = i;
        this.p = u21Var;
        this.q = list;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        fu.x(this.q);
        return ox3.a.u(rawType) ? new sx3(rawType, b(nk1Var, typeToken, rawType, true)) : new rx3(this.n.e(typeToken), b(nk1Var, typeToken, rawType, false));
    }

    public final LinkedHashMap b(nk1 nk1Var, TypeToken typeToken, Class cls, boolean z) {
        Method methodH;
        List listSingletonList;
        int i;
        int i2;
        boolean z2;
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            TypeToken typeToken2 = typeToken;
            Class rawType = cls;
            while (rawType != Object.class) {
                Field[] declaredFields = rawType.getDeclaredFields();
                if (rawType != cls && declaredFields.length > 0) {
                    fu.x(this.q);
                }
                int length = declaredFields.length;
                boolean z3 = false;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    Field field = declaredFields[i3];
                    boolean zC = this.c(field, true);
                    boolean zC2 = this.c(field, z3);
                    if (zC || zC2) {
                        if (!z) {
                            methodH = null;
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            zC2 = z3;
                            methodH = null;
                        } else {
                            methodH = ox3.a.h(rawType, field);
                            ox3.e(methodH);
                            if (methodH.getAnnotation(ka4.class) != null && field.getAnnotation(ka4.class) == null) {
                                throw new JsonIOException(xa3.h("@SerializedName on ", ox3.d(methodH, z3), " is not supported"));
                            }
                        }
                        if (methodH == null) {
                            ox3.e(field);
                        }
                        boolean z4 = true;
                        Type typeY = gb.Y(typeToken2.getType(), rawType, field.getGenericType(), new HashMap());
                        ka4 ka4Var = (ka4) field.getAnnotation(ka4.class);
                        if (ka4Var == null) {
                            switch (this.o) {
                                case 1:
                                    name = field.getName();
                                    break;
                                case 2:
                                    name = b11.b(field.getName());
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    name = b11.b(b11.a(field.getName(), ' '));
                                    break;
                                case 4:
                                    name = b11.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                                    break;
                                case 5:
                                    name = b11.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
                                    break;
                                case 6:
                                    name = b11.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
                                    break;
                                default:
                                    name = b11.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
                                    break;
                            }
                            listSingletonList = Collections.singletonList(name);
                        } else {
                            String strValue = ka4Var.value();
                            String[] strArrAlternate = ka4Var.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                arrayList.add(strValue);
                                Collections.addAll(arrayList, strArrAlternate);
                                listSingletonList = arrayList;
                            }
                        }
                        int size = listSingletonList.size();
                        px3 px3Var = null;
                        int i5 = 0;
                        while (i5 < size) {
                            String str = (String) listSingletonList.get(i5);
                            if (i5 != 0) {
                                zC = false;
                            }
                            int i6 = i3;
                            boolean z5 = zC2;
                            TypeToken<?> typeToken3 = TypeToken.get(typeY);
                            Class<? super Object> rawType2 = typeToken3.getRawType();
                            boolean z6 = (rawType2 == null || !rawType2.isPrimitive()) ? false : z4;
                            int modifiers = field.getModifiers();
                            boolean z7 = (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) ? z4 : false;
                            List list = listSingletonList;
                            e32 e32Var = (e32) field.getAnnotation(e32.class);
                            bz4 bz4VarB = e32Var != null ? p40.b(this.n, nk1Var, typeToken3, e32Var) : null;
                            int i7 = i5;
                            boolean z8 = bz4VarB != null ? z4 : false;
                            if (bz4VarB == null) {
                                bz4VarB = nk1Var.g(typeToken3);
                            }
                            px3 px3Var2 = px3Var;
                            boolean z9 = z4;
                            int i8 = size;
                            boolean z10 = zC;
                            px3Var = (px3) linkedHashMap.put(str, new px3(str, field, z10, z5, methodH, z8, bz4VarB, nk1Var, typeToken3, z6, z7));
                            if (px3Var2 != null) {
                                px3Var = px3Var2;
                            }
                            i5 = i7 + 1;
                            this = this;
                            nk1Var = nk1Var;
                            zC = z10;
                            zC2 = z5;
                            methodH = methodH;
                            size = i8;
                            i3 = i6;
                            z4 = z9;
                            i4 = i4;
                            listSingletonList = list;
                        }
                        i = i3;
                        i2 = i4;
                        px3 px3Var3 = px3Var;
                        z2 = false;
                        if (px3Var3 != null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + px3Var3.a + "'; conflict is caused by fields " + ox3.c(px3Var3.b) + " and " + ox3.c(field));
                        }
                    } else {
                        z2 = z3;
                        i = i3;
                        i2 = i4;
                    }
                    i3 = i + 1;
                    this = this;
                    nk1Var = nk1Var;
                    declaredFields = declaredFields;
                    length = i2;
                    z3 = z2;
                }
                typeToken2 = TypeToken.get(gb.Y(typeToken2.getType(), rawType, rawType.getGenericSuperclass(), new HashMap()));
                rawType = typeToken2.getRawType();
            }
        }
        return linkedHashMap;
    }

    public final boolean c(Field field, boolean z) {
        Class<?> type = field.getType();
        u21 u21Var = this.p;
        u21Var.getClass();
        if (u21.c(type)) {
            return false;
        }
        u21Var.b(z);
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || u21.c(field.getType())) {
            return false;
        }
        List list = z ? u21Var.n : u21Var.o;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        return true;
    }
}
