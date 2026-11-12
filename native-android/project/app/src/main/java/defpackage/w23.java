package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w23 {
    public static final ThreadLocal c = new ThreadLocal();
    public final Context a;
    public final u43 b;

    public w23(Context context, u43 u43Var) {
        u43Var.getClass();
        this.a = context;
        this.b = u43Var;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0383  */
    /* JADX WARN: Code duplicated, block: B:204:0x038d  */
    /* JADX WARN: Code duplicated, block: B:206:0x039e  */
    /* JADX WARN: Code duplicated, block: B:207:0x03af  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:210:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:212:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:215:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:216:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    public static z13 c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        h33 h33Var;
        boolean z;
        b33 b33Var;
        a33 a33Var;
        h33 h33Var2;
        Object objD;
        Class<?> componentType;
        Object objValueOf;
        Object string;
        int i2;
        h33 f33Var;
        boolean z2 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string2 = typedArray.getString(2);
        h33 h33VarE = h33.c;
        a33 a33Var2 = h33.j;
        a33 a33Var3 = h33.p;
        a33 a33Var4 = h33.m;
        a33 a33Var5 = h33.g;
        a33 a33Var6 = h33.d;
        b33 b33Var2 = h33.f;
        b33 b33Var3 = h33.o;
        b33 b33Var4 = h33.l;
        h33 g33Var = h33.i;
        b33 b33Var5 = h33.b;
        if (string2 != null) {
            a33Var = a33Var4;
            String resourcePackageName = resources.getResourcePackageName(i);
            z = z2;
            if ("integer".equals(string2)) {
                h33Var = b33Var4;
                b33Var = b33Var2;
                h33VarE = b33Var5;
            } else {
                b33Var = b33Var2;
                if ("integer[]".equals(string2)) {
                    h33Var = b33Var4;
                    h33VarE = a33Var6;
                } else {
                    if ("List<Int>".equals(string2)) {
                        h33VarE = h33.e;
                    } else if ("long".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = b33Var;
                    } else if ("long[]".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = a33Var5;
                    } else if ("List<Long>".equals(string2)) {
                        h33VarE = h33.h;
                    } else if ("boolean".equals(string2)) {
                        h33VarE = b33Var4;
                        h33Var = h33VarE;
                    } else if ("boolean[]".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = a33Var;
                    } else if ("List<Boolean>".equals(string2)) {
                        h33VarE = h33.n;
                    } else if ("string".equals(string2)) {
                        h33VarE = b33Var3;
                    } else if ("string[]".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = a33Var3;
                    } else if ("List<String>".equals(string2)) {
                        h33VarE = h33.q;
                    } else if ("float".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = g33Var;
                    } else if ("float[]".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = a33Var2;
                    } else if ("List<Float>".equals(string2)) {
                        h33VarE = h33.k;
                    } else if ("reference".equals(string2)) {
                        h33Var = b33Var4;
                        h33VarE = h33VarE;
                    } else if (string2.length() == 0) {
                        h33VarE = b33Var3;
                    } else {
                        try {
                            h33Var = b33Var4;
                            String strConcat = (!xm4.k0(string2, ".", false) || resourcePackageName == null) ? string2 : resourcePackageName.concat(string2);
                            boolean zE0 = xm4.e0(string2, "[]", false);
                            if (zE0) {
                                strConcat = strConcat.substring(0, strConcat.length() - 2);
                            }
                            Class<?> cls = Class.forName(strConcat);
                            if (Parcelable.class.isAssignableFrom(cls)) {
                                f33Var = zE0 ? new d33(cls) : new e33(cls);
                            } else if (Enum.class.isAssignableFrom(cls) && zE0 == 0) {
                                f33Var = new c33(cls);
                            } else if (Serializable.class.isAssignableFrom(cls)) {
                                f33Var = zE0 != 0 ? new f33(cls) : new g33(cls);
                            } else {
                                f33Var = null;
                            }
                            if (f33Var == null) {
                                throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
                            }
                            h33VarE = f33Var;
                        } catch (ClassNotFoundException e) {
                            er1.m(e);
                            return null;
                        }
                    }
                    h33Var = b33Var4;
                }
            }
        } else {
            h33Var = b33Var4;
            z = z2;
            b33Var = b33Var2;
            a33Var = a33Var4;
            h33VarE = null;
        }
        boolean z3 = true;
        if (typedArray.getValue(1, typedValue)) {
            int i3 = typedValue.resourceId;
            if (h33VarE == h33VarE) {
                if (i3 != 0) {
                    i2 = i3;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String strB = h33VarE.b();
                        sb.append("' for ");
                        sb.append(strB);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    i2 = 0;
                }
                string = Integer.valueOf(i2);
                z3 = true;
            } else if (i3 != 0) {
                if (h33VarE != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strB2 = h33VarE.b();
                    sb2.append("' for ");
                    sb2.append(strB2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                objD = Integer.valueOf(i3);
                b33Var = b33Var;
                h33Var2 = h33Var;
                z3 = true;
            } else if (h33VarE == b33Var3) {
                z3 = true;
                string = typedArray.getString(1);
            } else {
                z3 = true;
                int i4 = typedValue.type;
                if (i4 != 3) {
                    if (i4 == 4) {
                        h33Var2 = h33Var;
                        h33VarE = uc5.e(typedValue, h33VarE, g33Var, string2, "float");
                        objD = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        h33Var2 = h33Var;
                        h33VarE = uc5.e(typedValue, h33VarE, b33Var5, string2, "dimension");
                        objD = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        h33Var2 = h33Var;
                        h33VarE = uc5.e(typedValue, h33VarE, h33Var2, string2, "boolean");
                        objD = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (h33VarE == g33Var) {
                            h33VarE = uc5.e(typedValue, h33VarE, g33Var, string2, "float");
                            objValueOf = Float.valueOf(typedValue.data);
                        } else {
                            h33VarE = uc5.e(typedValue, h33VarE, b33Var5, string2, "integer");
                            objValueOf = Integer.valueOf(typedValue.data);
                        }
                        objD = objValueOf;
                        b33Var = b33Var;
                        h33Var2 = h33Var;
                    }
                    b33Var = b33Var;
                } else {
                    h33Var2 = h33Var;
                    String string3 = typedValue.string.toString();
                    if (h33VarE == null) {
                        string3.getClass();
                        try {
                            b33Var5.d(string3);
                            h33VarE = b33Var5;
                            b33Var = b33Var;
                        } catch (IllegalArgumentException unused) {
                            b33Var = b33Var;
                            try {
                                try {
                                    try {
                                        b33Var.d(string3);
                                        h33VarE = b33Var;
                                    } catch (IllegalArgumentException unused2) {
                                        h33Var2.d(string3);
                                        h33VarE = h33Var2;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    g33Var.d(string3);
                                    h33VarE = g33Var;
                                }
                            } catch (IllegalArgumentException unused4) {
                                h33VarE = b33Var3;
                            }
                        }
                    } else {
                        b33Var = b33Var;
                    }
                    h33VarE = h33VarE;
                    objD = h33VarE.d(string3);
                }
            }
            objD = string;
            h33Var2 = h33Var;
        } else {
            b33Var = b33Var;
            h33Var2 = h33Var;
            h33VarE = h33VarE;
            objD = null;
        }
        if (objD == null) {
            objD = null;
            z3 = false;
        }
        if (h33VarE == null) {
            h33VarE = null;
        }
        if (h33VarE == null) {
            if (objD instanceof Integer) {
                g33Var = b33Var5;
            } else if (objD instanceof int[]) {
                g33Var = a33Var6;
            } else if (objD instanceof Long) {
                g33Var = b33Var;
            } else if (objD instanceof long[]) {
                g33Var = a33Var5;
            } else if (!(objD instanceof Float)) {
                if (objD instanceof float[]) {
                    g33Var = a33Var2;
                } else if (objD instanceof Boolean) {
                    g33Var = h33Var2;
                } else if (objD instanceof boolean[]) {
                    g33Var = a33Var;
                } else if ((objD instanceof String) || objD == null) {
                    g33Var = b33Var3;
                } else if ((objD instanceof Object[]) && (((Object[]) objD) instanceof String[])) {
                    g33Var = a33Var3;
                } else if (objD.getClass().isArray()) {
                    Class<?> componentType2 = objD.getClass().getComponentType();
                    componentType2.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = objD.getClass().getComponentType();
                        componentType3.getClass();
                        g33Var = new d33(componentType3);
                    } else if (objD.getClass().isArray()) {
                        componentType = objD.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = objD.getClass().getComponentType();
                            componentType4.getClass();
                            g33Var = new f33(componentType4);
                        } else if (objD instanceof Parcelable) {
                            g33Var = new e33(objD.getClass());
                        } else if (objD instanceof Enum) {
                            g33Var = new c33(objD.getClass());
                        } else {
                            if (objD instanceof Serializable) {
                                nz2.t(objD.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
                                return null;
                            }
                            g33Var = new g33(objD.getClass());
                        }
                    } else if (objD instanceof Parcelable) {
                        g33Var = new e33(objD.getClass());
                    } else if (objD instanceof Enum) {
                        g33Var = new c33(objD.getClass());
                    } else {
                        if (objD instanceof Serializable) {
                            nz2.t(objD.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
                            return null;
                        }
                        g33Var = new g33(objD.getClass());
                    }
                } else if (objD.getClass().isArray()) {
                    componentType = objD.getClass().getComponentType();
                    componentType.getClass();
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = objD.getClass().getComponentType();
                        componentType5.getClass();
                        g33Var = new f33(componentType5);
                    } else if (objD instanceof Parcelable) {
                        g33Var = new e33(objD.getClass());
                    } else if (objD instanceof Enum) {
                        g33Var = new c33(objD.getClass());
                    } else {
                        if (objD instanceof Serializable) {
                            nz2.t(objD.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
                            return null;
                        }
                        g33Var = new g33(objD.getClass());
                    }
                } else if (objD instanceof Parcelable) {
                    g33Var = new e33(objD.getClass());
                } else if (objD instanceof Enum) {
                    g33Var = new c33(objD.getClass());
                } else {
                    if (objD instanceof Serializable) {
                        nz2.t(objD.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
                        return null;
                    }
                    g33Var = new g33(objD.getClass());
                }
            }
            h33VarE = g33Var;
        }
        return new z13(h33VarE, z, objD, z3);
    }

    public final r23 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strI0;
        String strI1;
        String strI2;
        Context context;
        LinkedHashMap linkedHashMap;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        r23 r23VarA = this.b.b(name).a();
        Context context2 = this.a;
        r23VarA.f(context2, attributeSet);
        LinkedHashMap linkedHashMap2 = r23VarA.t;
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = zs3.b;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    typedArrayObtainAttributes.getClass();
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    linkedHashMap2.put(string, c(typedArrayObtainAttributes, resources, i3));
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, zs3.c);
                    typedArrayObtainAttributes2.getClass();
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i4);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        packageName.getClass();
                        strI0 = xm4.i0(string2, "${applicationId}", packageName);
                    } else {
                        strI0 = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strI1 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        strI1 = xm4.i0(string3, "${applicationId}", packageName2);
                        if (strI1.length() <= 0) {
                            kf2.n("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        strI2 = xm4.i0(string4, "${applicationId}", packageName3);
                    } else {
                        strI2 = null;
                    }
                    n23 n23Var = new n23(strI0, strI1, strI2);
                    ArrayList arrayListB0 = ud3.b0(linkedHashMap2, new q23(n23Var, 0));
                    if (!arrayListB0.isEmpty()) {
                        nz2.q("Deep link ", strI0, " can't be used to open destination ", r23VarA, ".\nFollowing required arguments are missing: ", arrayListB0);
                        return null;
                    }
                    r23VarA.r.add(n23Var);
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, zs3.a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        int i5 = i4;
                        y13 y13Var = new y13(typedArrayObtainStyledAttributes.getResourceId(i4, 0));
                        y13Var.b = new y23(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        context = context2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            linkedHashMap = linkedHashMap2;
                            if (next2 == i5) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    typedArrayObtainAttributes3.getClass();
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    z13 z13VarC = c(typedArrayObtainAttributes3, resources, i3);
                                    boolean z = z13VarC.c;
                                    if (z && z && (obj = z13VarC.d) != null) {
                                        z13VarC.a.e(bundle, string5, obj);
                                    }
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i3 = i;
                            }
                            linkedHashMap2 = linkedHashMap;
                            depth2 = i2;
                            i5 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            y13Var.c = bundle;
                        }
                        if (r23VarA instanceof j5) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + r23VarA + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            kf2.n("Cannot have an action with actionId 0");
                            return null;
                        }
                        r23VarA.s.d(resourceId, y13Var);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        linkedHashMap = linkedHashMap2;
                        i2 = depth2;
                        if ("include".equals(name2) && (r23VarA instanceof t23)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, rt3.c);
                            typedArrayObtainAttributes4.getClass();
                            ((t23) r23VarA).g(b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (r23VarA instanceof t23) {
                            ((t23) r23VarA).g(a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    linkedHashMap2 = linkedHashMap;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
        return r23VarA;
    }

    public final t23 b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        r23 r23VarA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (r23VarA instanceof t23) {
            t23 t23Var = (t23) r23VarA;
            xml.close();
            return t23Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
