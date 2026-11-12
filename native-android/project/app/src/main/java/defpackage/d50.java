package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d50 {
    public static final Pattern a = null;
    public static final Pattern b = null;
    public static final Pattern c = null;
    public static final HashMap d = null;

    static {
        a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        HashMap r0 = new HashMap();
        d = r0;
        xa3.n(-984833, r0, "aliceblue", -332841, "antiquewhite");
        r0.put("aqua", -16711681);
        r0.put("aquamarine", -8388652);
        xa3.n(-983041, r0, "azure", -657956, "beige");
        xa3.n(-6972, r0, "bisque", -16777216, "black");
        xa3.n(-5171, r0, "blanchedalmond", -16776961, "blue");
        xa3.n(-7722014, r0, "blueviolet", -5952982, "brown");
        xa3.n(-2180985, r0, "burlywood", -10510688, "cadetblue");
        xa3.n(-8388864, r0, "chartreuse", -2987746, "chocolate");
        xa3.n(-32944, r0, "coral", -10185235, "cornflowerblue");
        xa3.n(-1828, r0, "cornsilk", -2354116, "crimson");
        r0.put("cyan", -16711681);
        r0.put("darkblue", -16777077);
        xa3.n(-16741493, r0, "darkcyan", -4684277, "darkgoldenrod");
        r0.put("darkgray", -5658199);
        r0.put("darkgreen", -16751616);
        r0.put("darkgrey", -5658199);
        r0.put("darkkhaki", -4343957);
        xa3.n(-7667573, r0, "darkmagenta", -11179217, "darkolivegreen");
        xa3.n(-29696, r0, "darkorange", -6737204, "darkorchid");
        xa3.n(-7667712, r0, "darkred", -1468806, "darksalmon");
        xa3.n(-7357297, r0, "darkseagreen", -12042869, "darkslateblue");
        r0.put("darkslategray", -13676721);
        r0.put("darkslategrey", -13676721);
        r0.put("darkturquoise", -16724271);
        r0.put("darkviolet", -7077677);
        xa3.n(-60269, r0, "deeppink", -16728065, "deepskyblue");
        r0.put("dimgray", -9868951);
        r0.put("dimgrey", -9868951);
        r0.put("dodgerblue", -14774017);
        r0.put("firebrick", -5103070);
        xa3.n(-1296, r0, "floralwhite", -14513374, "forestgreen");
        r0.put("fuchsia", -65281);
        r0.put("gainsboro", -2302756);
        xa3.n(-460545, r0, "ghostwhite", -10496, "gold");
        r0.put("goldenrod", -2448096);
        r0.put("gray", -8355712);
        xa3.n(-16744448, r0, "green", -5374161, "greenyellow");
        r0.put("grey", -8355712);
        r0.put("honeydew", -983056);
        xa3.n(-38476, r0, "hotpink", -3318692, "indianred");
        xa3.n(-11861886, r0, "indigo", -16, "ivory");
        xa3.n(-989556, r0, "khaki", -1644806, "lavender");
        xa3.n(-3851, r0, "lavenderblush", -8586240, "lawngreen");
        xa3.n(-1331, r0, "lemonchiffon", -5383962, "lightblue");
        xa3.n(-1015680, r0, "lightcoral", -2031617, "lightcyan");
        r0.put("lightgoldenrodyellow", -329006);
        r0.put("lightgray", -2894893);
        r0.put("lightgreen", -7278960);
        r0.put("lightgrey", -2894893);
        xa3.n(-18751, r0, "lightpink", -24454, "lightsalmon");
        xa3.n(-14634326, r0, "lightseagreen", -7876870, "lightskyblue");
        r0.put("lightslategray", -8943463);
        r0.put("lightslategrey", -8943463);
        r0.put("lightsteelblue", -5192482);
        r0.put("lightyellow", -32);
        xa3.n(-16711936, r0, "lime", -13447886, "limegreen");
        r0.put("linen", -331546);
        r0.put("magenta", -65281);
        xa3.n(-8388608, r0, "maroon", -10039894, "mediumaquamarine");
        xa3.n(-16777011, r0, "mediumblue", -4565549, "mediumorchid");
        xa3.n(-7114533, r0, "mediumpurple", -12799119, "mediumseagreen");
        xa3.n(-8689426, r0, "mediumslateblue", -16713062, "mediumspringgreen");
        xa3.n(-12004916, r0, "mediumturquoise", -3730043, "mediumvioletred");
        xa3.n(-15132304, r0, "midnightblue", -655366, "mintcream");
        xa3.n(-6943, r0, "mistyrose", -6987, "moccasin");
        xa3.n(-8531, r0, "navajowhite", -16777088, "navy");
        xa3.n(-133658, r0, "oldlace", -8355840, "olive");
        xa3.n(-9728477, r0, "olivedrab", -23296, "orange");
        xa3.n(-47872, r0, "orangered", -2461482, "orchid");
        xa3.n(-1120086, r0, "palegoldenrod", -6751336, "palegreen");
        xa3.n(-5247250, r0, "paleturquoise", -2396013, "palevioletred");
        xa3.n(-4139, r0, "papayawhip", -9543, "peachpuff");
        xa3.n(-3308225, r0, "peru", -16181, "pink");
        xa3.n(-2252579, r0, "plum", -5185306, "powderblue");
        xa3.n(-8388480, r0, "purple", -10079335, "rebeccapurple");
        xa3.n(-65536, r0, "red", -4419697, "rosybrown");
        xa3.n(-12490271, r0, "royalblue", -7650029, "saddlebrown");
        xa3.n(-360334, r0, "salmon", -744352, "sandybrown");
        xa3.n(-13726889, r0, "seagreen", -2578, "seashell");
        xa3.n(-6270419, r0, "sienna", -4144960, "silver");
        xa3.n(-7876885, r0, "skyblue", -9807155, "slateblue");
        r0.put("slategray", -9404272);
        r0.put("slategrey", -9404272);
        r0.put("snow", -1286);
        r0.put("springgreen", -16711809);
        xa3.n(-12156236, r0, "steelblue", -2968436, "tan");
        xa3.n(-16744320, r0, "teal", -2572328, "thistle");
        xa3.n(-40121, r0, "tomato", 0, "transparent");
        xa3.n(-12525360, r0, "turquoise", -1146130, "violet");
        xa3.n(-663885, r0, "wheat", -1, "white");
        xa3.n(-657931, r0, "whitesmoke", -256, "yellow");
        r0.put("yellowgreen", -6632142);
    }

    public static int a(String r6, boolean r7) {
        rr2.l(!TextUtils.isEmpty(r6));
        String r8 = r6.replace(" ", "");
        if (r8.charAt(0) != '#') goto L15;
        int r9 = (int) Long.parseLong(r8.substring(1), 16);
        if (r8.length() != 7) goto L9;
        return (-16777216) | r9;
    L9:
        if (r8.length() == 9) goto L11;
        nz2.c();
        return 0;
    L11:
        return ((r9 & 255) << 24) | (r9 >>> 8);
    L15:
        if (r8.startsWith("rgba") == false) goto L28;
        if (r7 == false) goto L18;
        Pattern r2 = c;
    L19:
        Matcher r10 = r2.matcher(r8);
        if (r10.matches() == true) goto L22;
    L37:
        nz2.c();
        return 0;
    L22:
        if (r7 == false) goto L24;
        String r11 = r10.group(4);
        r11.getClass();
        int r12 = (int) (Float.parseFloat(r11) * 255.0f);
    L25:
        String r0 = r10.group(1);
        r0.getClass();
        int r1 = Integer.parseInt(r0, 10);
        String r3 = r10.group(2);
        r3.getClass();
        int r4 = Integer.parseInt(r3, 10);
        String r13 = r10.group(3);
        r13.getClass();
        return Color.argb(r12, r1, r4, Integer.parseInt(r13, 10));
    L24:
        String r14 = r10.group(4);
        r14.getClass();
        r12 = Integer.parseInt(r14, 10);
        goto L25
    L18:
        r2 = b;
        goto L19
    L28:
        if (r8.startsWith("rgb") == false) goto L33;
        Matcher r15 = a.matcher(r8);
        if (r15.matches() == false) goto L37;
        String r16 = r15.group(1);
        r16.getClass();
        int r17 = Integer.parseInt(r16, 10);
        String r5 = r15.group(2);
        r5.getClass();
        int r18 = Integer.parseInt(r5, 10);
        String r19 = r15.group(3);
        r19.getClass();
        return Color.rgb(r17, r18, Integer.parseInt(r19, 10));
    L33:
        Integer r20 = (Integer) d.get(rr2.U(r8));
        if (r20 == null) goto L37;
        return r20.intValue();
    }
}
