package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.SpannableStringBuilder
 *  android.text.SpannedString
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 */
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class w95 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("white", Color.rgb((int)255, (int)255, (int)255));
        hashMap.put("lime", Color.rgb((int)0, (int)255, (int)0));
        hashMap.put("cyan", Color.rgb((int)0, (int)255, (int)255));
        hashMap.put("red", Color.rgb((int)255, (int)0, (int)0));
        hashMap.put("yellow", Color.rgb((int)255, (int)255, (int)0));
        hashMap.put("magenta", Color.rgb((int)255, (int)0, (int)255));
        hashMap.put("blue", Color.rgb((int)0, (int)0, (int)255));
        hashMap.put("black", Color.rgb((int)0, (int)0, (int)0));
        c = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put("bg_white", Color.rgb((int)255, (int)255, (int)255));
        hashMap.put("bg_lime", Color.rgb((int)0, (int)255, (int)0));
        hashMap.put("bg_cyan", Color.rgb((int)0, (int)255, (int)255));
        hashMap.put("bg_red", Color.rgb((int)255, (int)0, (int)0));
        hashMap.put("bg_yellow", Color.rgb((int)255, (int)255, (int)0));
        hashMap.put("bg_magenta", Color.rgb((int)255, (int)0, (int)255));
        hashMap.put("bg_blue", Color.rgb((int)0, (int)0, (int)255));
        hashMap.put("bg_black", Color.rgb((int)0, (int)0, (int)0));
        d = Collections.unmodifiableMap(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(String object, t95 object2, List object3, SpannableStringBuilder spannableStringBuilder, List list) {
        int n16;
        int n17;
        int n18;
        int n19 = ((t95)object2).b;
        int n26 = spannableStringBuilder.length();
        ArrayList arrayList = ((t95)object2).a;
        arrayList.getClass();
        int n27 = -1;
        switch (((String)((Object)arrayList)).hashCode()) {
            case 3511770: {
                if (!((String)((Object)arrayList)).equals("ruby")) break;
                n27 = 1;
                break;
            }
            case 3314158: {
                if (!((String)((Object)arrayList)).equals("lang")) break;
                n27 = 2;
                break;
            }
            case 118: {
                if (!((String)((Object)arrayList)).equals("v")) break;
                n27 = 3;
                break;
            }
            case 117: {
                if (!((String)((Object)arrayList)).equals("u")) break;
                n27 = 4;
                break;
            }
            case 105: {
                if (!((String)((Object)arrayList)).equals("i")) break;
                n27 = 5;
                break;
            }
            case 99: {
                if (!((String)((Object)arrayList)).equals("c")) break;
                n27 = 6;
                break;
            }
            case 98: {
                if (!((String)((Object)arrayList)).equals("b")) break;
                n27 = 7;
                break;
            }
            case 0: {
                if (!((String)((Object)arrayList)).equals("")) break;
                n27 = 8;
                break;
            }
        }
        switch (n27) {
            default: {
                n18 = -1;
                break;
            }
            case 1: {
                n18 = 7;
                break;
            }
            case 2: {
                n18 = 6;
                break;
            }
            case 3: {
                n18 = 5;
                break;
            }
            case 4: {
                n18 = 4;
                break;
            }
            case 5: {
                n18 = 3;
                break;
            }
            case 6: {
                n18 = 2;
                break;
            }
            case 7: {
                n18 = 1;
                break;
            }
            case 8: {
                n18 = 0;
            }
        }
        switch (n18) {
            default: {
                return;
            }
            case 7: {
                int n28 = w95.c(list, (String)object, (t95)object2);
                arrayList = new ArrayList(object3.size());
                arrayList.addAll(object3);
                Collections.sort(arrayList, s95.c);
                int n29 = ((t95)object2).b;
                n17 = 0;
                for (n16 = 0; n16 < arrayList.size(); ++n16) {
                    if (!"rt".equals(((s95)arrayList.get((int)n16)).a.a)) continue;
                    object3 = (s95)arrayList.get(n16);
                    n18 = w95.c(list, (String)object, ((s95)object3).a);
                    if (n18 == -1) {
                        n18 = n28 != -1 ? n28 : 1;
                    }
                    int n36 = ((s95)object3).a.b - n17;
                    int n37 = ((s95)object3).b - n17;
                    object3 = spannableStringBuilder.subSequence(n36, n37);
                    spannableStringBuilder.delete(n36, n37);
                    spannableStringBuilder.setSpan((Object)new u34(n18, object3.toString()), n29, n36, 33);
                    n17 = object3.length() + n17;
                    n29 = n36;
                }
                break;
            }
            case 5: {
                spannableStringBuilder.setSpan((Object)new p85(((t95)object2).c), n19, n26, 33);
                break;
            }
            case 4: {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n19, n26, 33);
                break;
            }
            case 3: {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n19, n26, 33);
                break;
            }
            case 2: {
                arrayList = ((t95)object2).d.iterator();
                while (arrayList.hasNext()) {
                    Map map = c;
                    object3 = (String)arrayList.next();
                    if (map.containsKey(object3)) {
                        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(((Integer)map.get(object3)).intValue()), n19, n26, 33);
                        continue;
                    }
                    map = d;
                    if (!map.containsKey(object3)) continue;
                    spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(((Integer)map.get(object3)).intValue()), n19, n26, 33);
                }
                break;
            }
            case 1: {
                spannableStringBuilder.setSpan((Object)new StyleSpan(1), n19, n26, 33);
            }
            case 0: 
            case 6: 
        }
        object = w95.b(list, (String)object, (t95)object2);
        n18 = 0;
        while (n18 < ((ArrayList)object).size()) {
            block51: {
                block50: {
                    object2 = ((u95)((ArrayList)object).get((int)n18)).o;
                    n16 = ((q95)object2).l;
                    if (n16 == -1 && ((q95)object2).m == -1) {
                        n16 = -1;
                    } else {
                        n16 = n16 == 1 ? 1 : 0;
                        n17 = ((q95)object2).m == 1 ? 2 : 0;
                        n16 = n17 | n16;
                    }
                    if (n16 != -1) {
                        n16 = ((q95)object2).l;
                        if (n16 == -1 && ((q95)object2).m == -1) {
                            n16 = -1;
                        } else {
                            n16 = n16 == 1 ? 1 : 0;
                            n17 = ((q95)object2).m == 1 ? 2 : 0;
                            n16 |= n17;
                        }
                        xl.d(spannableStringBuilder, new StyleSpan(n16), n19, n26);
                    }
                    if (((q95)object2).j == 1) {
                        spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), n19, n26, 33);
                    }
                    if (((q95)object2).k == 1) {
                        spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n19, n26, 33);
                    }
                    if (((q95)object2).g) {
                        if (!((q95)object2).g) {
                            kf2.o("Font color not defined");
                            return;
                        }
                        xl.d(spannableStringBuilder, new ForegroundColorSpan(((q95)object2).f), n19, n26);
                    }
                    if (((q95)object2).i) {
                        if (!((q95)object2).i) {
                            kf2.o("Background color not defined.");
                            return;
                        }
                        xl.d(spannableStringBuilder, new BackgroundColorSpan(((q95)object2).h), n19, n26);
                    }
                    if (((q95)object2).e != null) {
                        xl.d(spannableStringBuilder, new TypefaceSpan(((q95)object2).e), n19, n26);
                    }
                    if ((n16 = ((q95)object2).n) == 1) break block50;
                    if (n16 != 2) {
                        if (n16 == 3) {
                            xl.d(spannableStringBuilder, new RelativeSizeSpan(((q95)object2).o / 100.0f), n19, n26);
                        }
                        break block51;
                    } else {
                        xl.d(spannableStringBuilder, new RelativeSizeSpan(((q95)object2).o), n19, n26);
                    }
                    break block51;
                }
                xl.d(spannableStringBuilder, new AbsoluteSizeSpan((int)((q95)object2).o, true), n19, n26);
            }
            if (((q95)object2).q) {
                spannableStringBuilder.setSpan(new Object(), n19, n26, 33);
            }
            ++n18;
        }
    }

    public static ArrayList b(List list, String string, t95 t952) {
        ArrayList<u95> arrayList = new ArrayList<u95>();
        for (int i16 = 0; i16 < list.size(); ++i16) {
            int n16;
            q95 q952 = (q95)list.get(i16);
            String string2 = t952.a;
            Set set = t952.d;
            String string3 = t952.c;
            n16 = q952.a.isEmpty() && q952.b.isEmpty() && q952.c.isEmpty() && q952.d.isEmpty() ? TextUtils.isEmpty((CharSequence)string2) : ((n16 = q95.a(q95.a(q95.a(0, 0x40000000, q952.a, string), 2, q952.b, string2), 4, q952.d, string3)) != -1 && set.containsAll(q952.c) ? (n16 += q952.c.size() * 4) : 0);
            if (n16 <= 0) continue;
            arrayList.add(new u95(n16, q952));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String string, t95 t952) {
        list = w95.b(list, string, t952);
        for (int i16 = 0; i16 < ((ArrayList)list).size(); ++i16) {
            int n16 = ((u95)((ArrayList)list).get((int)i16)).o.p;
            if (n16 == -1) continue;
            return n16;
        }
        return -1;
    }

    public static r95 d(String string, Matcher object, be3 be32, ArrayList arrayList) {
        CharSequence charSequence;
        v95 v952 = new v95();
        try {
            charSequence = ((Matcher)object).group(1);
            charSequence.getClass();
            v952.a = y95.c((String)charSequence);
            charSequence = ((Matcher)object).group(2);
            charSequence.getClass();
            v952.b = y95.c((String)charSequence);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder("Skipping cue with bad header: ");
            stringBuilder.append(((Matcher)object).group());
            l93.q0("WebvttCueParser", stringBuilder.toString());
            return null;
        }
        object = ((Matcher)object).group(3);
        object.getClass();
        w95.e((String)object, v952);
        charSequence = new StringBuilder();
        be32.getClass();
        object = be32.n(StandardCharsets.UTF_8);
        while (!TextUtils.isEmpty((CharSequence)object)) {
            if (((StringBuilder)charSequence).length() > 0) {
                ((StringBuilder)charSequence).append("\n");
            }
            ((StringBuilder)charSequence).append(((String)object).trim());
            object = be32.n(StandardCharsets.UTF_8);
        }
        v952.c = w95.f(string, ((StringBuilder)charSequence).toString(), arrayList);
        return new r95(v952.a().a(), v952.a, v952.b);
    }

    /*
     * Exception decompiling
     */
    public static void e(String var0, v95 var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static SpannedString f(String string, String string2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque<t95> arrayDeque = new ArrayDeque<t95>();
        ArrayList<s95> arrayList = new ArrayList<s95>();
        int n16 = 0;
        block35: while (true) {
            String string3;
            Object object;
            int n17;
            block59: {
                n17 = string2.length();
                object = "";
                if (n16 < n17) {
                    Object object2;
                    int n18;
                    char c16 = string2.charAt(n16);
                    int n19 = -1;
                    if (c16 != '&') {
                        if (c16 != '<') {
                            spannableStringBuilder.append(c16);
                            ++n16;
                            continue;
                        }
                        n17 = n16 + 1;
                        if (n17 >= string2.length()) {
                            n16 = n17;
                            continue;
                        }
                        n18 = string2.charAt(n17) == '/' ? 1 : 0;
                        n17 = (n17 = string2.indexOf(62, n17)) == -1 ? string2.length() : ++n17;
                        int n26 = n17 - 2;
                        n19 = string2.charAt(n26) == '/' ? 1 : 0;
                        int n27 = n18 != 0 ? 2 : 1;
                        if (n19 == 0) {
                            n26 = n17 - 1;
                        }
                        object2 = string2.substring(n16 + n27, n26);
                        if (((String)object2).trim().isEmpty()) {
                            n16 = n17;
                            continue;
                        }
                        string3 = ((String)object2).trim();
                        rr2.l(string3.isEmpty() ^ true);
                        String[] stringArray = f35.a;
                        string3 = string3.split("[ \\.]", 2)[0];
                        string3.getClass();
                        int n28 = -1;
                        switch (string3.hashCode()) {
                            case 3511770: {
                                if (!string3.equals("ruby")) break;
                                n28 = 1;
                                break;
                            }
                            case 3314158: {
                                if (!string3.equals("lang")) break;
                                n28 = 2;
                                break;
                            }
                            case 3650: {
                                if (!string3.equals("rt")) break;
                                n28 = 3;
                                break;
                            }
                            case 118: {
                                if (!string3.equals("v")) break;
                                n28 = 4;
                                break;
                            }
                            case 117: {
                                if (!string3.equals("u")) break;
                                n28 = 5;
                                break;
                            }
                            case 105: {
                                if (!string3.equals("i")) break;
                                n28 = 6;
                                break;
                            }
                            case 99: {
                                if (!string3.equals("c")) break;
                                n28 = 7;
                                break;
                            }
                            case 98: {
                                if (!string3.equals("b")) break;
                                n28 = 8;
                                break;
                            }
                        }
                        switch (n28) {
                            default: {
                                n16 = -1;
                                break;
                            }
                            case 1: {
                                n16 = 7;
                                break;
                            }
                            case 2: {
                                n16 = 6;
                                break;
                            }
                            case 3: {
                                n16 = 5;
                                break;
                            }
                            case 4: {
                                n16 = 4;
                                break;
                            }
                            case 5: {
                                n16 = 3;
                                break;
                            }
                            case 6: {
                                n16 = 2;
                                break;
                            }
                            case 7: {
                                n16 = 1;
                                break;
                            }
                            case 8: {
                                n16 = 0;
                            }
                        }
                        switch (n16) {
                            default: {
                                n16 = n17;
                                continue block35;
                            }
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                        }
                        if (n18 == 0) {
                            n16 = n17;
                            if (n19 != 0) continue;
                            n18 = spannableStringBuilder.length();
                            object2 = ((String)object2).trim();
                            rr2.l(((String)object2).isEmpty() ^ true);
                            n16 = ((String)object2).indexOf(" ");
                            if (n16 != -1) {
                                object = ((String)object2).substring(n16).trim();
                                object2 = ((String)object2).substring(0, n16);
                            }
                            stringArray = ((String)object2).split("\\.", -1);
                            string3 = stringArray[0];
                            object2 = new HashSet();
                            for (n16 = 1; n16 < stringArray.length; ++n16) {
                                ((HashSet)object2).add(stringArray[n16]);
                            }
                            arrayDeque.push(new t95(string3, n18, (String)object, (Set)object2));
                            n16 = n17;
                            continue;
                        }
                        break block59;
                    } else {
                        n17 = string2.indexOf(59, ++n16);
                        n18 = string2.indexOf(32, n16);
                        if (n17 == -1) {
                            n17 = n18;
                        } else if (n18 != -1) {
                            n17 = Math.min(n17, n18);
                        }
                        if (n17 != -1) {
                            object2 = string2.substring(n16, n17);
                            switch (((String)object2).hashCode()) {
                                default: {
                                    n16 = n19;
                                    break;
                                }
                                case 3374865: {
                                    if (!((String)object2).equals("nbsp")) {
                                        n16 = n19;
                                        break;
                                    }
                                    n16 = 3;
                                    break;
                                }
                                case 96708: {
                                    if (!((String)object2).equals("amp")) {
                                        n16 = n19;
                                        break;
                                    }
                                    n16 = 2;
                                    break;
                                }
                                case 3464: {
                                    if (!((String)object2).equals("lt")) {
                                        n16 = n19;
                                        break;
                                    }
                                    n16 = 1;
                                    break;
                                }
                                case 3309: {
                                    n16 = !((String)object2).equals("gt") ? n19 : 0;
                                }
                            }
                            switch (n16) {
                                default: {
                                    object = new StringBuilder("ignoring unsupported entity: '&");
                                    ((StringBuilder)object).append((String)object2);
                                    ((StringBuilder)object).append(";'");
                                    l93.q0("WebvttCueParser", ((StringBuilder)object).toString());
                                    break;
                                }
                                case 3: {
                                    spannableStringBuilder.append(' ');
                                    break;
                                }
                                case 2: {
                                    spannableStringBuilder.append('&');
                                    break;
                                }
                                case 1: {
                                    spannableStringBuilder.append('<');
                                    break;
                                }
                                case 0: {
                                    spannableStringBuilder.append('>');
                                }
                            }
                            if (n17 == n18) {
                                spannableStringBuilder.append((CharSequence)" ");
                            }
                            n16 = n17 + 1;
                            continue;
                        }
                        spannableStringBuilder.append(c16);
                        continue;
                    }
                }
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        w95.a(string, new t95("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
                    }
                    w95.a(string, (t95)arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
            }
            do {
                if (arrayDeque.isEmpty()) {
                    n16 = n17;
                    continue block35;
                }
                object = (t95)arrayDeque.pop();
                w95.a(string, (t95)object, arrayList, spannableStringBuilder, list);
                if (!arrayDeque.isEmpty()) {
                    arrayList.add(new s95((t95)object, spannableStringBuilder.length()));
                    continue;
                }
                arrayList.clear();
            } while (!((t95)object).a.equals(string3));
            n16 = n17;
        }
    }

    public static void g(String string, v95 v952) {
        int n16 = string.indexOf(44);
        int n17 = -1;
        String string2 = string;
        if (n16 != -1) {
            string2 = string.substring(n16 + 1);
            int n18 = string2.hashCode();
            int n19 = 2;
            switch (n18) {
                default: {
                    break;
                }
                case 109757538: {
                    if (!string2.equals("start")) break;
                    n17 = 3;
                    break;
                }
                case 100571: {
                    if (!string2.equals("end")) break;
                    n17 = 2;
                    break;
                }
                case -1074341483: {
                    if (!string2.equals("middle")) break;
                    n17 = 1;
                    break;
                }
                case -1364013995: {
                    if (!string2.equals("center")) break;
                    n17 = 0;
                }
            }
            switch (n17) {
                default: {
                    l93.q0("WebvttCueParser", "Invalid anchor value: ".concat(string2));
                    n19 = Integer.MIN_VALUE;
                    break;
                }
                case 3: {
                    n19 = 0;
                    break;
                }
                case 0: 
                case 1: {
                    n19 = 1;
                }
                case 2: 
            }
            v952.g = n19;
            string2 = string.substring(0, n16);
        }
        if (string2.endsWith("%")) {
            v952.e = y95.b(string2);
            v952.f = 0;
            return;
        }
        v952.e = Integer.parseInt(string2);
        v952.f = 1;
    }
}

