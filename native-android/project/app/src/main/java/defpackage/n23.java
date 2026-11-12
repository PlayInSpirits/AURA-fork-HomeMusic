package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n23 {
    public static final Pattern q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern r = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final rp4 f;
    public final rp4 g;
    public final r72 h;
    public boolean i;
    public final r72 j;
    public final r72 k;
    public final r72 l;
    public final rp4 m;
    public final String n;
    public final rp4 o;
    public final boolean p;

    public n23(String str, String str2, String str3) {
        List listO;
        List listL0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = new rp4(new l23(this, 6));
        this.g = new rp4(new l23(this, 4));
        l23 l23Var = new l23(this, 7);
        b92 b92Var = b92.n;
        this.h = rr2.K(b92Var, l23Var);
        this.j = rr2.K(b92Var, new l23(this, 1));
        this.k = rr2.K(b92Var, new l23(this, 0));
        this.l = rr2.K(b92Var, new l23(this, 3));
        this.m = new rp4(new l23(this, 2));
        this.o = new rp4(new l23(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            a(str.substring(0, matcher.start()), arrayList, sb);
            this.p = (qm4.o0(sb, ".*") || qm4.o0(sb, "([^/]+?)")) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            this.e = xm4.i0(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            kf2.e(xa3.h("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        Pattern patternCompile = Pattern.compile("/");
        patternCompile.getClass();
        qm4.A0(0);
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listO = arrayList2;
        } else {
            listO = gb.O(str3.toString());
        }
        if (listO.isEmpty()) {
            listL0 = u01.n;
        } else {
            ListIterator listIterator = listO.listIterator(listO.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listL0 = q40.L0(listO, listIterator.nextIndex() + 1);
                }
            }
            listL0 = u01.n;
        }
        this.n = xm4.i0(f34.h("^(", (String) listL0.get(0), "|[*]+)/(", (String) listL0.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            }
            sb.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
    }

    public static void e(Bundle bundle, String str, String str2, z13 z13Var) {
        if (z13Var == null) {
            bundle.putString(str, str2);
            return;
        }
        h33 h33Var = z13Var.a;
        str.getClass();
        h33Var.e(bundle, str, h33Var.d(str2));
    }

    public final ArrayList b() {
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            v40.n0(((k23) it.next()).b, arrayList);
        }
        return q40.G0(q40.G0(this.d, arrayList), (List) this.k.getValue());
    }

    public final boolean c(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i3));
            z13 z13Var = (z13) map.get(str);
            try {
                strDecode.getClass();
                e(bundle, str, strDecode, z13Var);
                arrayList2.add(j15.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        n23 n23Var = this;
        for (Map.Entry entry : ((Map) n23Var.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            k23 k23Var = (k23) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (n23Var.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = gb.O(query);
            }
            queryParameters.getClass();
            j15 j15Var = j15.a;
            int i = 0;
            Bundle bundleG = fh0.g(new kd3[0]);
            ArrayList arrayList = k23Var.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str2 = (String) obj;
                z13 z13Var = (z13) map.get(str2);
                h33 h33Var = z13Var != null ? z13Var.a : null;
                if ((h33Var instanceof a33) && !z13Var.c) {
                    int i3 = ((a33) h33Var).r;
                    Object obj2 = u01.n;
                    switch (i3) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 2:
                            obj2 = new float[0];
                            break;
                        case 4:
                            obj2 = new int[0];
                            break;
                        case 6:
                            obj2 = new long[0];
                            break;
                        case 8:
                            obj2 = new String[0];
                            break;
                    }
                    h33Var.e(bundleG, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = k23Var.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList2 = k23Var.b;
                ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
                int size2 = arrayList2.size();
                int i4 = i;
                int i5 = i4;
                while (i5 < size2) {
                    Object obj3 = arrayList2.get(i5);
                    i5++;
                    int i6 = i;
                    int i7 = i4 + 1;
                    if (i4 < 0) {
                        gb.c0();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    String strGroup = matcher.group(i7);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    String str6 = strGroup;
                    z13 z13Var2 = (z13) map.get(str5);
                    try {
                        if (bundleG.containsKey(str5)) {
                            if (bundleG.containsKey(str5)) {
                                if (z13Var2 != null) {
                                    h33 h33Var2 = z13Var2.a;
                                    Object objA = h33Var2.a(str5, bundleG);
                                    if (!bundleG.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    h33Var2.e(bundleG, str5, h33Var2.c(objA, str6));
                                    objValueOf = j15Var;
                                }
                                z = i6;
                            } else {
                                z = 1;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            e(bundleG, str5, str6, z13Var2);
                            objValueOf = j15Var;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList3.add(objValueOf);
                    map = map;
                    i4 = i7;
                    i = i6;
                }
                map = map;
            }
            bundle.putAll(bundleG);
            n23Var = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n23)) {
            n23 n23Var = (n23) obj;
            if (h12.c(this.a, n23Var.a) && h12.c(this.b, n23Var.b) && h12.c(this.c, n23Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
