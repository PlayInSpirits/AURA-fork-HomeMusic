package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r23 {
    public static final /* synthetic */ int w = 0;
    public final String n;
    public t23 o;
    public String p;
    public CharSequence q;
    public final ArrayList r;
    public final mj4 s;
    public final LinkedHashMap t;
    public int u;
    public String v;

    static {
        new LinkedHashMap();
    }

    public r23(t43 t43Var) {
        LinkedHashMap linkedHashMap = u43.b;
        this.n = bu.n(t43Var.getClass());
        this.r = new ArrayList();
        this.s = new mj4(0);
        this.t = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.t;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            z13 z13Var = (z13) entry.getValue();
            z13Var.getClass();
            str.getClass();
            if (z13Var.c && (obj = z13Var.d) != null) {
                z13Var.a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                z13 z13Var2 = (z13) entry2.getValue();
                z13Var2.getClass();
                h33 h33Var = z13Var2.a;
                str2.getClass();
                if (z13Var2.b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        h33Var.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbJ = xa3.j("Wrong argument type for '", str2, "' in argument bundle. ");
                sbJ.append(h33Var.b());
                sbJ.append(" expected.");
                throw new IllegalArgumentException(sbJ.toString().toString());
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int[] b(r23 r23Var) {
        ii iiVar = new ii();
        while (true) {
            t23 t23Var = this.o;
            if ((r23Var != null ? r23Var.o : null) != null) {
                t23 t23Var2 = r23Var.o;
                t23Var2.getClass();
                if (t23Var2.h(this.u, t23Var2, null, false) != this) {
                    if (t23Var != null || t23Var.y != this.u) {
                        iiVar.addFirst(this);
                    }
                    if (!h12.c(t23Var, r23Var) || t23Var == null) {
                        break;
                    }
                    this = t23Var;
                } else {
                    iiVar.addFirst(this);
                    break;
                }
            } else {
                if (t23Var != null) {
                    iiVar.addFirst(this);
                } else {
                    iiVar.addFirst(this);
                }
                if (!h12.c(t23Var, r23Var)) {
                    break;
                }
                this = t23Var;
            }
        }
        List listQ0 = q40.Q0(iiVar);
        ArrayList arrayList = new ArrayList(r40.k0(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((r23) it.next()).u));
        }
        return q40.P0(arrayList);
    }

    public final y13 d(int i) {
        mj4 mj4Var = this.s;
        y13 y13Var = mj4Var.e() == 0 ? null : (y13) mj4Var.b(i);
        if (y13Var != null) {
            return y13Var;
        }
        t23 t23Var = this.o;
        if (t23Var != null) {
            return t23Var.d(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:125:0x02af  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:144:0x030e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    public p23 e(ik ikVar) {
        Throwable th;
        Object obj;
        int size;
        String str;
        boolean z;
        String str2;
        int i;
        p23 p23Var;
        Bundle bundle;
        Pattern pattern;
        Matcher matcher;
        Matcher matcher2;
        String str3;
        int i2;
        List listO;
        List listL0;
        List listO2;
        int i3;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        this = this;
        ArrayList arrayList = this.r;
        Throwable th2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size2 = arrayList.size();
        p23 p23Var2 = null;
        int i4 = 0;
        while (i4 < size2) {
            int i5 = i4 + 1;
            n23 n23Var = (n23) arrayList.get(i4);
            Uri uri = ikVar.b;
            LinkedHashMap linkedHashMap = this.t;
            if (uri != null) {
                n23Var.getClass();
                uri.getClass();
                linkedHashMap.getClass();
                Pattern pattern2 = (Pattern) n23Var.f.getValue();
                if (pattern2 != null) {
                    matcher6 = pattern2.matcher(uri.toString());
                } else {
                    matcher3 = th2;
                }
                if (matcher3 != 0 && matcher3.matches()) {
                    Bundle bundle2 = new Bundle();
                    if (n23Var.c(matcher3, bundle2, linkedHashMap) && (!((Boolean) n23Var.g.getValue()).booleanValue() || n23Var.d(uri, bundle2, linkedHashMap))) {
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        String fragment = uri.getFragment();
                        Pattern pattern3 = (Pattern) n23Var.m.getValue();
                        if (pattern3 != null) {
                            matcher5 = pattern3.matcher(String.valueOf(fragment));
                        } else {
                            matcher4 = th2;
                        }
                        if (matcher4 != 0 && matcher4.matches()) {
                            matcher4 = matcher5;
                            List list = (List) n23Var.k.getValue();
                            th = th2;
                            ArrayList arrayList2 = new ArrayList(r40.k0(list, 10));
                            int i6 = 0;
                            for (Object obj2 : list) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    gb.c0();
                                    throw th;
                                }
                                String str4 = (String) obj2;
                                String strDecode = Uri.decode(matcher4.group(i7));
                                z13 z13Var = (z13) linkedHashMap.get(str4);
                                try {
                                    strDecode.getClass();
                                    n23.e(bundle2, str4, strDecode, z13Var);
                                    arrayList2.add(j15.a);
                                    i6 = i7;
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        } else {
                            matcher4 = matcher5;
                            matcher4 = matcher5;
                            th = th2;
                        }
                        boolean zIsEmpty = ud3.b0(linkedHashMap, new m23(0, bundle2)).isEmpty();
                        obj = bundle2;
                        if (!zIsEmpty) {
                        }
                    } else {
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        th = th2;
                    }
                } else {
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    th = th2;
                }
                String str5 = n23Var.a;
                if (uri != null || str5 == null) {
                    size = 0;
                } else {
                    List<String> pathSegments = uri.getPathSegments();
                    List<String> pathSegments2 = Uri.parse(str5).getPathSegments();
                    pathSegments.getClass();
                    pathSegments2.getClass();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Object obj3 : pathSegments) {
                        if (pathSegments2.contains(obj3)) {
                            linkedHashSet.add(obj3);
                        }
                    }
                    size = linkedHashSet.size();
                }
                str = ikVar.c;
                if (str == null && str.equals(n23Var.b)) {
                    z = true;
                } else {
                    z = false;
                }
                str2 = ikVar.d;
                if (str2 != null || (str3 = n23Var.c) == null) {
                    z = z;
                    size = size;
                    i = -1;
                } else {
                    Pattern pattern4 = (Pattern) n23Var.o.getValue();
                    pattern4.getClass();
                    if (pattern4.matcher(str2).matches()) {
                        Pattern patternCompile = Pattern.compile("/");
                        patternCompile.getClass();
                        qm4.A0(0);
                        Matcher matcher7 = patternCompile.matcher(str3);
                        if (matcher7.find()) {
                            i2 = 1;
                            ArrayList arrayList3 = new ArrayList(10);
                            int iEnd = 0;
                            while (true) {
                                arrayList3.add(str3.subSequence(iEnd, matcher7.start()).toString());
                                iEnd = matcher7.end();
                                if (!matcher7.find()) {
                                    break;
                                }
                                i2 = 1;
                            }
                            arrayList3.add(str3.subSequence(iEnd, str3.length()).toString());
                            listO = arrayList3;
                        } else {
                            listO = gb.O(str3.toString());
                            i2 = 1;
                        }
                        boolean zIsEmpty2 = listO.isEmpty();
                        List listL1 = u01.n;
                        if (zIsEmpty2) {
                            listL0 = listL1;
                            break;
                        }
                        ListIterator listIterator = listO.listIterator(listO.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listL0 = listL1;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                listL0 = q40.L0(listO, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String str6 = (String) listL0.get(0);
                        String str7 = (String) listL0.get(i2);
                        Pattern patternCompile2 = Pattern.compile("/");
                        patternCompile2.getClass();
                        qm4.A0(0);
                        Matcher matcher8 = patternCompile2.matcher(str2);
                        if (matcher8.find()) {
                            ArrayList arrayList4 = new ArrayList(10);
                            int iEnd2 = 0;
                            do {
                                arrayList4.add(str2.subSequence(iEnd2, matcher8.start()).toString());
                                iEnd2 = matcher8.end();
                            } while (matcher8.find());
                            arrayList4.add(str2.subSequence(iEnd2, str2.length()).toString());
                            listO2 = arrayList4;
                        } else {
                            listO2 = gb.O(str2.toString());
                        }
                        if (listO2.isEmpty()) {
                            i3 = 1;
                            break;
                        }
                        ListIterator listIterator2 = listO2.listIterator(listO2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                i3 = 1;
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                i3 = 1;
                                listL1 = q40.L0(listO2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        String str8 = (String) listL1.get(0);
                        String str9 = (String) listL1.get(i3);
                        i = h12.c(str6, str8) ? 2 : 0;
                        if (h12.c(str7, str9)) {
                            i++;
                        }
                    } else {
                        z = z;
                        size = size;
                        i = -1;
                    }
                }
                if (obj != null) {
                    p23Var = new p23(this, obj, n23Var.p, size, z, i);
                    if (p23Var2 != null || p23Var.compareTo(p23Var2) > 0) {
                        p23Var2 = p23Var;
                    }
                } else if (z || i > -1) {
                    linkedHashMap.getClass();
                    bundle = new Bundle();
                    if (uri != null) {
                        pattern = (Pattern) n23Var.f.getValue();
                        if (pattern != null) {
                            matcher2 = pattern.matcher(uri.toString());
                        } else {
                            matcher = th;
                        }
                        if (matcher != 0 && matcher.matches()) {
                            n23Var.c(matcher, bundle, linkedHashMap);
                            if (((Boolean) n23Var.g.getValue()).booleanValue()) {
                                matcher = matcher2;
                                n23Var.d(uri, bundle, linkedHashMap);
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher = matcher2;
                    matcher = matcher2;
                    if (ud3.b0(linkedHashMap, new m23(1, bundle)).isEmpty()) {
                        p23Var = new p23(this, obj, n23Var.p, size, z, i);
                        if (p23Var2 != null) {
                        }
                        p23Var2 = p23Var;
                    }
                }
                i4 = i5;
                th2 = th;
            } else {
                th = th2;
            }
            obj = th;
            String str10 = n23Var.a;
            if (uri != null) {
                size = 0;
            } else {
                size = 0;
            }
            str = ikVar.c;
            if (str == null) {
                z = false;
            } else {
                z = false;
            }
            str2 = ikVar.d;
            if (str2 != null) {
                z = z;
                size = size;
                i = -1;
            } else {
                z = z;
                size = size;
                i = -1;
            }
            if (obj != null) {
                p23Var = new p23(this, obj, n23Var.p, size, z, i);
                if (p23Var2 != null) {
                }
                p23Var2 = p23Var;
            } else if (z) {
                linkedHashMap.getClass();
                bundle = new Bundle();
                if (uri != null) {
                    pattern = (Pattern) n23Var.f.getValue();
                    if (pattern != null) {
                        matcher2 = pattern.matcher(uri.toString());
                    } else {
                        matcher = th;
                    }
                    if (matcher != 0) {
                        n23Var.c(matcher, bundle, linkedHashMap);
                        if (((Boolean) n23Var.g.getValue()).booleanValue()) {
                            matcher = matcher2;
                            n23Var.d(uri, bundle, linkedHashMap);
                        }
                    }
                }
                matcher = matcher2;
                matcher = matcher2;
                matcher = matcher2;
                if (ud3.b0(linkedHashMap, new m23(1, bundle)).isEmpty()) {
                    p23Var = new p23(this, obj, n23Var.p, size, z, i);
                    if (p23Var2 != null) {
                    }
                    p23Var2 = p23Var;
                }
            } else {
                linkedHashMap.getClass();
                bundle = new Bundle();
                if (uri != null) {
                    pattern = (Pattern) n23Var.f.getValue();
                    if (pattern != null) {
                        matcher2 = pattern.matcher(uri.toString());
                    } else {
                        matcher = th;
                    }
                    if (matcher != 0) {
                        n23Var.c(matcher, bundle, linkedHashMap);
                        if (((Boolean) n23Var.g.getValue()).booleanValue()) {
                            matcher = matcher2;
                            n23Var.d(uri, bundle, linkedHashMap);
                        }
                    }
                }
                matcher = matcher2;
                matcher = matcher2;
                matcher = matcher2;
                if (ud3.b0(linkedHashMap, new m23(1, bundle)).isEmpty()) {
                    p23Var = new p23(this, obj, n23Var.p, size, z, i);
                    if (p23Var2 != null) {
                    }
                    p23Var2 = p23Var;
                }
            }
            i4 = i5;
            th2 = th;
        }
        return p23Var2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof r23)) {
                r23 r23Var = (r23) obj;
                mj4 mj4Var = r23Var.s;
                LinkedHashMap linkedHashMap = r23Var.t;
                boolean zC = h12.c(this.r, r23Var.r);
                mj4 mj4Var2 = this.s;
                if (mj4Var2.e() != mj4Var.e()) {
                    z = false;
                    break;
                }
                Iterator it = ((gb0) fa4.b0(new nj4(mj4Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!h12.c(mj4Var2.b(iIntValue), mj4Var.b(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap2 = this.t;
                if (linkedHashMap2.size() != linkedHashMap.size()) {
                    z2 = false;
                    break;
                }
                Set setEntrySet = linkedHashMap2.entrySet();
                setEntrySet.getClass();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap.containsKey(entry.getKey()) || !h12.c(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (this.u != r23Var.u || !h12.c(this.v, r23Var.v) || !zC || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, zs3.e);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.u = 0;
            this.p = null;
        } else {
            if (qm4.u0(string)) {
                kf2.n("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            ArrayList arrayListB0 = ud3.b0(this.t, new q23(new n23(strConcat, null, null), 1));
            if (!arrayListB0.isEmpty()) {
                nz2.q("Cannot set route \"", string, "\" for destination ", this, ". Following required arguments are missing: ", arrayListB0);
                return;
            } else {
                this.u = strConcat.hashCode();
                this.p = null;
            }
        }
        this.v = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.u = resourceId;
            this.p = null;
            this.p = ya4.v(context, resourceId);
        }
        this.q = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.u * 31;
        String str = this.v;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            n23 n23Var = (n23) obj;
            int i3 = iHashCode * 31;
            String str2 = n23Var.a;
            int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = n23Var.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = n23Var.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        mj4 mj4Var = this.s;
        mj4Var.getClass();
        int i4 = 0;
        while (true) {
            if (!(i4 < mj4Var.e())) {
                break;
            }
            int i5 = i4 + 1;
            y13 y13Var = (y13) mj4Var.f(i4);
            int i6 = ((iHashCode * 31) + y13Var.a) * 31;
            y23 y23Var = y13Var.b;
            iHashCode = i6 + (y23Var != null ? y23Var.hashCode() : 0);
            Bundle bundle = y13Var.c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i7 = iHashCode * 31;
                    Bundle bundle2 = y13Var.c;
                    bundle2.getClass();
                    Object obj2 = bundle2.get(str5);
                    iHashCode = i7 + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
            i4 = i5;
        }
        LinkedHashMap linkedHashMap = this.t;
        for (String str6 : linkedHashMap.keySet()) {
            int iE = f34.e(str6, iHashCode * 31, 31);
            Object obj3 = linkedHashMap.get(str6);
            iHashCode = iE + (obj3 != null ? obj3.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.p;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.u));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.v;
        if (str2 != null && !qm4.u0(str2)) {
            sb.append(" route=");
            sb.append(this.v);
        }
        if (this.q != null) {
            sb.append(" label=");
            sb.append(this.q);
        }
        return sb.toString();
    }
}
