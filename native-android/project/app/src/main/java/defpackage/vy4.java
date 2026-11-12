package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.eddyizm.tempus.homemusic.PlayEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy4 implements zn4 {
    public static final Pattern o = null;
    public static final Pattern p = null;
    public static final Pattern q = null;
    public static final Pattern r = null;
    public static final Pattern s = null;
    public static final Pattern t = null;
    public static final Pattern u = null;
    public static final k64 v = null;
    public final XmlPullParserFactory n;

    static {
        o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
        t = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
        u = Pattern.compile("^(\\d+) (\\d+)$");
        v = new k64(1, 30.0f, 1);
    }

    public vy4() {
        XmlPullParserFactory r0 = XmlPullParserFactory.newInstance();     // Catch: XmlPullParserException -> L5
        this.n = r0;     // Catch: XmlPullParserException -> L5
        r0.setNamespaceAware(true);     // Catch: XmlPullParserException -> L5
        return;
    L5:
        e = move-exception;
        nz2.s("Couldn't create XmlPullParserFactory instance", e);
        throw null;
    }

    public static xy4 a(xy4 r0) {
        if (r0 == null) goto L4;
        return r0;
    L4:
        return new xy4();
    }

    public static boolean d(String r1) {
        if (r1.equals("tt") == false) goto L5;
        return true;
    L5:
        if (r1.equals("head") == false) goto L7;
        return true;
    L7:
        if (r1.equals("body") == false) goto L9;
        return true;
    L9:
        if (r1.equals("div") == false) goto L11;
        return true;
    L11:
        if (r1.equals("p") == false) goto L13;
        return true;
    L13:
        if (r1.equals("span") == false) goto L15;
        return true;
    L15:
        if (r1.equals("br") == false) goto L17;
        return true;
    L17:
        if (r1.equals("style") == false) goto L19;
        return true;
    L19:
        if (r1.equals("styling") == false) goto L21;
        return true;
    L21:
        if (r1.equals("layout") == false) goto L23;
        return true;
    L23:
        if (r1.equals("region") == false) goto L25;
        return true;
    L25:
        if (r1.equals("metadata") == false) goto L27;
        return true;
    L27:
        if (r1.equals("image") == false) goto L29;
        return true;
    L29:
        if (r1.equals("data") == false) goto L31;
        return true;
    L31:
        if (r1.equals("information") == true) goto L50;
        return false;
    L50:
        return true;
    }

    public static int e(XmlPullParser r7) {
        String r8 = r7.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (r8 != null) goto L5;
        return 15;
    L5:
        Matcher r1 = u.matcher(r8);
        if (r1.matches() == true) goto L9;
        l93.q0("TtmlParser", "Ignoring malformed cell resolution: ".concat(r8));
        return 15;
    L9:
        boolean r2 = true;
        String r5 = r1.group(1);     // Catch: NumberFormatException -> L17
        r5.getClass();     // Catch: NumberFormatException -> L17
        int r6 = Integer.parseInt(r5);     // Catch: NumberFormatException -> L17
        String r3 = r1.group(2);     // Catch: NumberFormatException -> L17
        r3.getClass();     // Catch: NumberFormatException -> L17
        int r4 = Integer.parseInt(r3);     // Catch: NumberFormatException -> L17
        if (r6 == 0) goto L14;
        if (r4 == 0) goto L14;
    L15:
        rr2.i(r6, r4, "Invalid cell resolution %s %s", r2);     // Catch: NumberFormatException -> L17
        return r4;
    L14:
        r2 = false;
    L17:
        l93.q0("TtmlParser", "Ignoring malformed cell resolution: ".concat(r8));
        return 15;
    }

    public static void f(String r7, xy4 r8) {
        String r0 = f35.a;
        byte r1 = -1;
        String[] r2 = r7.split("\\s+", -1);
        int r3 = r2.length;
        Pattern r4 = q;
        if (r3 != 1) goto L6;
        Matcher r5 = r4.matcher(r7);
    L9:
        if (r5.matches() == false) goto L34;
        String r6 = r5.group(3);
        r6.getClass();
        switch(r6.hashCode()) {
            case 37: goto L22;
            case 3240: goto L18;
            case 3592: goto L14;
            default: goto L25;
        };
    L25:
        switch(r1) {
            case 0: goto L30;
            case 1: goto L29;
            case 2: goto L28;
            default: goto L27;
        };
    L28:
        r8.j = 1;
    L31:
        String r9 = r5.group(1);
        r9.getClass();
        r8.k = Float.parseFloat(r9);
        return;
    L29:
        r8.j = 2;
        goto L31
    L30:
        r8.j = 3;
        goto L31
    L27:
        throw new SubtitleDecoderException(xa3.h("Invalid unit for fontSize: '", r6, "'."));
    L14:
        if (r6.equals("px") == false) goto L25;
        r1 = 2;
        goto L25
    L18:
        if (r6.equals("em") == false) goto L25;
        r1 = 1;
        goto L25
    L22:
        if (r6.equals("%") == false) goto L25;
        r1 = 0;
        goto L25
    L34:
        throw new SubtitleDecoderException(xa3.h("Invalid expression for fontSize: '", r7, "'."));
    L6:
        if (r2.length != 2) goto L36;
        r5 = r4.matcher(r2[1]);
        l93.q0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        goto L9
    L36:
        throw new SubtitleDecoderException(f34.i(new StringBuilder("Invalid number of entries for fontSize: "), r2.length, "."));
    }

    public static k64 g(XmlPullParser r7) {
        String r0 = r7.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (r0 == null) goto L5;
        int r1 = Integer.parseInt(r0);
    L6:
        String r2 = r7.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (r2 == null) goto L13;
        String r3 = f35.a;
        String[] r4 = r2.split(" ", -1);
        if (r4.length != 2) goto L11;
        boolean r5 = true;
    L12:
        rr2.k("frameRateMultiplier doesn't have 2 parts", r5);
        float r6 = Integer.parseInt(r4[0]) / Integer.parseInt(r4[1]);
    L14:
        k64 r8 = v;
        int r9 = r8.b;
        String r10 = r7.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (r10 == null) goto L17;
        r9 = Integer.parseInt(r10);
    L17:
        int r11 = r8.c;
        String r12 = r7.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (r12 == null) goto L21;
        r11 = Integer.parseInt(r12);
    L21:
        return new k64(r9, r1 * r6, r11);
    L11:
        r5 = false;
        goto L12
    L13:
        r6 = 1.0f;
        goto L14
    L5:
        r1 = 30;
        goto L6
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.n50 r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0184: CAST (r11v8 ?? I:float) = (float) (r11v7 int) in method: vy4.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, n50, java.util.HashMap, java.util.HashMap):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy4.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, n50, java.util.HashMap, java.util.HashMap):void");
    }

    public static uy4 i(XmlPullParser r21, uy4 r22, HashMap r23, k64 r24) {
        int r2 = r21.getAttributeCount();
        String[] r3 = null;
        xy4 r7 = j(r21, null);
        String r10 = null;
        String r9 = "";
        int r6 = 0;
        long r12 = -9223372036854775807L;
        long r14 = -9223372036854775807L;
        long r16 = -9223372036854775807L;
    L3:
        if (r6 >= r2) goto L52;
        String r4 = r21.getAttributeName(r6);
        String r5 = r21.getAttributeValue(r6);
        r4.getClass();
        switch(r4.hashCode()) {
            case -934795532: goto L28;
            case 99841: goto L24;
            case 100571: goto L20;
            case 93616297: goto L16;
            case 109780401: goto L12;
            case 1292595405: goto L8;
            default: goto L6;
        };
    L6:
        byte r8 = -1;
    L31:
        switch(r8) {
            case 0: goto L48;
            case 1: goto L46;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L37;
            case 5: goto L34;
            default: goto L50;
        };
    L37:
        String r11 = r5.trim();
        if (r11.isEmpty() == false) goto L40;
        String[] r13 = new String[0];
    L42:
        if (r13.length <= 0) goto L50;
        r3 = r13;
        goto L50
    L40:
        String r15 = f35.a;
        r13 = r11.split("\\s+", -1);
        goto L42
    L44:
        r12 = k(r5, r24);
        goto L50
    L45:
        r14 = k(r5, r24);
        goto L50
    L46:
        r16 = k(r5, r24);
        goto L50
    L34:
        if (r5.startsWith("#") == false) goto L50;
        r10 = r5.substring(1);
        goto L50
    L48:
        if (r23.containsKey(r5) == false) goto L50;
        r9 = r5;
    L50:
        r6 = r6 + 1;
        goto L3
    L8:
        if (r4.equals("backgroundImage") == false) goto L6;
        r8 = 5;
        goto L31
    L12:
        if (r4.equals("style") == false) goto L6;
        r8 = 4;
        goto L31
    L16:
        if (r4.equals("begin") == false) goto L6;
        r8 = 3;
        goto L31
    L20:
        if (r4.equals("end") == false) goto L6;
        r8 = 2;
        goto L31
    L24:
        if (r4.equals("dur") == false) goto L6;
        r8 = 1;
        goto L31
    L28:
        if (r4.equals("region") == false) goto L6;
        r8 = 0;
        goto L31
    L52:
        if (r22 == null) goto L62;
        long r1 = r22.d;
        if (r1 == (-9223372036854775807L)) goto L62;
        if (r12 == (-9223372036854775807L)) goto L59;
        r12 = r12 + r1;
    L59:
        if (r14 == (-9223372036854775807L)) goto L62;
        r14 = r14 + r1;
    L62:
        if (r14 == (-9223372036854775807L)) goto L64;
    L66:
        long r17 = r14;
    L72:
        return new uy4(r21.getName(), null, r12, r17, r7, r3, r9, r10, r22);
    L64:
        if (r16 == (-9223372036854775807L)) goto L67;
        r14 = r12 + r16;
        goto L66
    L67:
        if (r22 == null) goto L66;
        long r18 = r22.e;
        if (r18 == (-9223372036854775807L)) goto L66;
        r17 = r18;
        goto L72
    }

    public static xy4 j(XmlPullParser r18, xy4 r19) {
        int r2 = r18.getAttributeCount();
        xy4 r0 = r19;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L322;
        String r5 = r18.getAttributeValue(r4);
        String r6 = r18.getAttributeName(r4);
        r6.getClass();
        switch(r6.hashCode()) {
            case -1550943582: goto L72;
            case -1289044182: goto L68;
            case -1224696685: goto L64;
            case -1065511464: goto L60;
            case -1008619738: goto L56;
            case -879295043: goto L52;
            case -734428249: goto L48;
            case 3355: goto L44;
            case 3511770: goto L40;
            case 94842723: goto L36;
            case 109403361: goto L32;
            case 110138194: goto L28;
            case 365601008: goto L24;
            case 921125321: goto L20;
            case 1115953443: goto L16;
            case 1287124693: goto L12;
            case 1754920356: goto L8;
            default: goto L6;
        };
    L6:
        byte r7 = -1;
    L75:
        Layout.Alignment r17 = null;
        switch(r7) {
            case 0: goto L320;
            case 1: goto L319;
            case 2: goto L318;
            case 3: goto L289;
            case 4: goto L288;
            case 5: goto L263;
            case 6: goto L262;
            case 7: goto L260;
            case 8: goto L226;
            case 9: goto L222;
            case 10: goto L213;
            case 11: goto L206;
            case 12: goto L327;
            case 13: goto L118;
            case 14: goto L111;
            case 15: goto L107;
            case 16: goto L78;
            default: goto L321;
        };
    L78:
        r0 = a(r0);
        String r8 = rr2.U(r5);
        r8.getClass();
        switch(r8.hashCode()) {
            case -1364013995: goto L98;
            case 100571: goto L94;
            case 3317767: goto L90;
            case 108511772: goto L86;
            case 109757538: goto L82;
            default: goto L80;
        };
    L80:
        byte r9 = -1;
    L101:
        switch(r9) {
            case 0: goto L105;
            case 1: goto L104;
            case 2: goto L103;
            case 3: goto L104;
            case 4: goto L103;
            default: goto L106;
        };
    L103:
        r17 = Layout.Alignment.ALIGN_NORMAL;
        goto L106
    L104:
        r17 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L106
    L105:
        r17 = Layout.Alignment.ALIGN_CENTER;
    L106:
        r0.p = r17;
        goto L321
    L82:
        if (r8.equals(PlayEvent.START) == false) goto L80;
        r9 = 4;
        goto L101
    L86:
        if (r8.equals("right") == false) goto L80;
        r9 = 3;
        goto L101
    L90:
        if (r8.equals("left") == false) goto L80;
        r9 = 2;
        goto L101
    L94:
        if (r8.equals("end") == false) goto L80;
        r9 = 1;
        goto L101
    L98:
        if (r8.equals("center") == false) goto L80;
        r9 = 0;
        goto L101
    L107:
        r0 = a(r0);
        r0.d = d50.a(r5, false);     // Catch: IllegalArgumentException -> L110
        r0.e = true;     // Catch: IllegalArgumentException -> L110
    L110:
        xa3.s("Failed parsing background value: ", r5, "TtmlParser");
        goto L321
    L111:
        String r10 = rr2.U(r5);
        r10.getClass();
        if (r10.equals("before") == false) goto L114;
        r0 = a(r0);
        r0.n = 1;
        goto L321
    L114:
        if (r10.equals("after") == false) goto L321;
        r0 = a(r0);
        r0.n = 2;
        goto L321
    L118:
        r0 = a(r0);
        Pattern r11 = yr4.d;
        if (r5 != null) goto L121;
    L120:
        yr4 r12 = null;
    L202:
        r0.r = r12;
        goto L321
    L121:
        String r13 = rr2.U(r5.trim());
        if (r13.isEmpty() == true) goto L120;
        String[] r14 = TextUtils.split(r13, yr4.d);
        int r15 = r14.length;
        if (r15 != 0) goto L127;
        jx1 r16 = ny3.w;
    L131:
        h22 r20 = new h22(j51.z(yr4.h, r16));
        if (r20.hasNext() == false) goto L134;
        Object r21 = r20.next();
    L135:
        String r22 = (String) r21;
        int r23 = r22.hashCode();
        if (r23 != (-1392885889)) goto L138;
        r22.equals("before");
    L149:
        int r24 = 1;
    L150:
        gb4 r25 = j51.z(yr4.e, r16);
        if (r25.isEmpty() == true) goto L163;
        String r26 = (String) new h22(r25).next();
        int r27 = r26.hashCode();
        if (r27 != 3005871) goto L155;
        r26.equals("auto");
    L161:
        int r110 = -1;
    L162:
        r12 = new yr4(r110, 0, r24);
        goto L202
    L155:
        if (r27 != 3387192) goto L161;
        if (r26.equals("none") == false) goto L161;
        r110 = 0;
        goto L162
    L163:
        gb4 r28 = j51.z(yr4.g, r16);
        gb4 r29 = j51.z(yr4.f, r16);
        if (r28.isEmpty() == true) goto L166;
    L168:
        h22 r30 = new h22(r28);
        if (r30.hasNext() == false) goto L171;
        Object r31 = r30.next();
    L172:
        String r32 = (String) r31;
        int r33 = r32.hashCode();
        if (r33 != (-1274499742)) goto L175;
        r32.equals("filled");
    L181:
        int r34 = 1;
    L182:
        h22 r35 = new h22(r29);
        if (r35.hasNext() == false) goto L185;
        Object r36 = r35.next();
    L186:
        String r37 = (String) r36;
        int r38 = r37.hashCode();
        if (r38 != (-1360216880)) goto L189;
        r37.equals("circle");
    L200:
        int r111 = 1;
    L201:
        r12 = new yr4(r111, r34, r24);
        goto L202
    L189:
        if (r38 == (-905816648)) goto L197;
        if (r38 != 99657) goto L200;
        if (r37.equals("dot") == false) goto L200;
        r111 = 2;
        goto L201
    L197:
        if (r37.equals("sesame") == false) goto L200;
        r111 = 3;
        goto L201
    L185:
        r36 = "circle";
        goto L186
    L175:
        if (r33 != 3417674) goto L181;
        if (r32.equals("open") == false) goto L181;
        r34 = 2;
        goto L182
    L171:
        r31 = "filled";
        goto L172
    L166:
        if (r29.isEmpty() == false) goto L168;
        r12 = new yr4(-1, 0, r24);
        goto L202
    L138:
        if (r23 == (-1106037339)) goto L146;
        if (r23 != 92734940) goto L149;
        if (r22.equals("after") == false) goto L149;
        r24 = 2;
        goto L150
    L146:
        if (r22.equals("outside") == false) goto L149;
        r24 = -2;
        goto L150
    L134:
        r21 = "outside";
        goto L135
    L127:
        if (r15 == 1) goto L129;
        r16 = jx1.j(r14.length, (Object[]) r14.clone());
        goto L131
    L129:
        r16 = new nf4(r14[0]);
        goto L131
    L206:
        String r39 = rr2.U(r5);
        r39.getClass();
        if (r39.equals("all") == false) goto L209;
        r0 = a(r0);
        r0.q = 1;
        goto L321
    L209:
        if (r39.equals("none") == false) goto L321;
        r0 = a(r0);
        r0.q = 0;
        goto L321
    L213:
        xy4 r40 = a(r0);
        Matcher r1 = r.matcher(r5);
        float r41 = Float.MAX_VALUE;
        if (r1.matches() == true) goto L325;
        xa3.s("Invalid value for shear: ", r5, "TtmlParser");
    L221:
        r40.s = r41;
        r0 = r40;
        goto L321
    L325:
        String r3 = r1.group(1);     // Catch: NumberFormatException -> L219
        r3.getClass();     // Catch: NumberFormatException -> L219
        r41 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(r3)));     // Catch: NumberFormatException -> L219
    L219:
        e = move-exception;
        l93.r0("TtmlParser", "Failed to parse shear: " + r5, e);
        goto L221
    L222:
        r0 = a(r0);
        r0.b = d50.a(r5, false);     // Catch: IllegalArgumentException -> L225
        r0.c = true;     // Catch: IllegalArgumentException -> L225
    L225:
        xa3.s("Failed parsing color value: ", r5, "TtmlParser");
        goto L321
    L226:
        String r42 = rr2.U(r5);
        r42.getClass();
        switch(r42.hashCode()) {
            case -618561360: goto L250;
            case -410956671: goto L246;
            case -250518009: goto L242;
            case -136074796: goto L238;
            case 3016401: goto L234;
            case 3556653: goto L230;
            default: goto L228;
        };
    L228:
        byte r43 = -1;
    L253:
        switch(r43) {
            case 0: goto L258;
            case 1: goto L257;
            case 2: goto L256;
            case 3: goto L255;
            case 4: goto L258;
            case 5: goto L255;
            default: goto L321;
        };
    L255:
        r0 = a(r0);
        r0.m = 3;
        goto L321
    L256:
        r0 = a(r0);
        r0.m = 4;
        goto L321
    L257:
        r0 = a(r0);
        r0.m = 1;
        goto L321
    L258:
        r0 = a(r0);
        r0.m = 2;
        goto L321
    L230:
        if (r42.equals("text") == false) goto L366;
        r43 = 5;
        goto L253
    L366:
        r43 = -1;
        goto L253
    L234:
        if (r42.equals("base") == false) goto L367;
        r43 = 4;
        goto L253
    L367:
        r43 = -1;
        goto L253
    L238:
        if (r42.equals("textContainer") == false) goto L368;
        r43 = 3;
        goto L253
    L368:
        r43 = -1;
        goto L253
    L242:
        if (r42.equals("delimiter") == false) goto L369;
        r43 = 2;
        goto L253
    L369:
        r43 = -1;
        goto L253
    L246:
        if (r42.equals("container") == false) goto L370;
        r43 = 1;
        goto L253
    L370:
        r43 = -1;
        goto L253
    L250:
        if (r42.equals("baseContainer") == false) goto L371;
        r43 = 0;
        goto L253
    L371:
        r43 = -1;
        goto L253
    L262:
        r0 = a(r0);
        r0.h = "bold".equalsIgnoreCase(r5) ? 1 : 0;
        goto L321
    L263:
        String r44 = rr2.U(r5);
        r44.getClass();
        switch(r44.hashCode()) {
            case -1461280213: goto L279;
            case -1026963764: goto L275;
            case 913457136: goto L271;
            case 1679736913: goto L267;
            default: goto L265;
        };
    L265:
        byte r112 = -1;
    L282:
        switch(r112) {
            case 0: goto L287;
            case 1: goto L286;
            case 2: goto L285;
            case 3: goto L284;
            default: goto L321;
        };
    L284:
        r0 = a(r0);
        r0.f = 1;
        goto L321
    L285:
        r0 = a(r0);
        r0.f = 0;
        goto L321
    L286:
        r0 = a(r0);
        r0.g = 1;
        goto L321
    L287:
        r0 = a(r0);
        r0.g = 0;
        goto L321
    L267:
        if (r44.equals("linethrough") == false) goto L372;
        r112 = 3;
        goto L282
    L372:
        r112 = -1;
        goto L282
    L271:
        if (r44.equals("nolinethrough") == false) goto L373;
        r112 = 2;
        goto L282
    L373:
        r112 = -1;
        goto L282
    L275:
        if (r44.equals("underline") == false) goto L374;
        r112 = 1;
        goto L282
    L374:
        r112 = -1;
        goto L282
    L279:
        if (r44.equals("nounderline") == false) goto L375;
        r112 = 0;
        goto L282
    L375:
        r112 = -1;
        goto L282
    L288:
        r0 = a(r0);
        r0.t = r5;
        goto L321
    L289:
        r0 = a(r0);
        String r45 = rr2.U(r5);
        r45.getClass();
        switch(r45.hashCode()) {
            case -1364013995: goto L309;
            case 100571: goto L305;
            case 3317767: goto L301;
            case 108511772: goto L297;
            case 109757538: goto L293;
            default: goto L291;
        };
    L291:
        char r46 = 65535;
    L312:
        switch(r46) {
            case 0: goto L316;
            case 1: goto L315;
            case 2: goto L314;
            case 3: goto L315;
            case 4: goto L314;
            default: goto L317;
        };
    L314:
        r17 = Layout.Alignment.ALIGN_NORMAL;
        goto L317
    L315:
        r17 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L317
    L316:
        r17 = Layout.Alignment.ALIGN_CENTER;
    L317:
        r0.o = r17;
        goto L321
    L293:
        if (r45.equals(PlayEvent.START) == false) goto L376;
        r46 = 4;
        goto L312
    L376:
        r46 = 65535;
        goto L312
    L297:
        if (r45.equals("right") == false) goto L377;
        r46 = 3;
        goto L312
    L377:
        r46 = 65535;
        goto L312
    L301:
        if (r45.equals("left") == false) goto L378;
        r46 = 2;
        goto L312
    L378:
        r46 = 65535;
        goto L312
    L305:
        if (r45.equals("end") == false) goto L379;
        r46 = 1;
        goto L312
    L379:
        r46 = 65535;
        goto L312
    L309:
        if (r45.equals("center") == false) goto L380;
        r46 = 0;
        goto L312
    L380:
        r46 = 65535;
        goto L312
    L318:
        r0 = a(r0);
        r0.a = r5;
        goto L321
    L319:
        r0 = a(r0);
        r0.u = r5;
        goto L321
    L320:
        r0 = a(r0);
        r0.i = "italic".equalsIgnoreCase(r5) ? 1 : 0;
        goto L321
    L327:
        r0 = a(r0);     // Catch: SubtitleDecoderException -> L205
        f(r5, r0);     // Catch: SubtitleDecoderException -> L205
    L205:
        xa3.s("Failed parsing fontSize value: ", r5, "TtmlParser");
        goto L321
    L260:
        if ("style".equals(r18.getName()) == false) goto L321;
        r0 = a(r0);
        r0.l = r5;
    L321:
        r4 = r4 + 1;
        goto L3
    L8:
        if (r6.equals("multiRowAlign") == false) goto L6;
        r7 = 16;
        goto L75
    L12:
        if (r6.equals("backgroundColor") == false) goto L6;
        r7 = 15;
        goto L75
    L16:
        if (r6.equals("rubyPosition") == false) goto L6;
        r7 = 14;
        goto L75
    L20:
        if (r6.equals("textEmphasis") == false) goto L6;
        r7 = 13;
        goto L75
    L24:
        if (r6.equals("fontSize") == false) goto L6;
        r7 = 12;
        goto L75
    L28:
        if (r6.equals("textCombine") == false) goto L6;
        r7 = 11;
        goto L75
    L32:
        if (r6.equals("shear") == false) goto L6;
        r7 = 10;
        goto L75
    L36:
        if (r6.equals("color") == false) goto L6;
        r7 = 9;
        goto L75
    L40:
        if (r6.equals("ruby") == false) goto L6;
        r7 = 8;
        goto L75
    L44:
        if (r6.equals("id") == false) goto L6;
        r7 = 7;
        goto L75
    L48:
        if (r6.equals("fontWeight") == false) goto L6;
        r7 = 6;
        goto L75
    L52:
        if (r6.equals("textDecoration") == false) goto L6;
        r7 = 5;
        goto L75
    L56:
        if (r6.equals("origin") == false) goto L6;
        r7 = 4;
        goto L75
    L60:
        if (r6.equals("textAlign") == false) goto L6;
        r7 = 3;
        goto L75
    L64:
        if (r6.equals("fontFamily") == false) goto L6;
        r7 = 2;
        goto L75
    L68:
        if (r6.equals("extent") == false) goto L6;
        r7 = 1;
        goto L75
    L72:
        if (r6.equals("fontStyle") == false) goto L6;
        r7 = 0;
        goto L75
    L322:
        return r0;
    }

    public static long k(String r13, k64 r14) {
        Matcher r0 = o.matcher(r13);
        byte r2 = 4;
        if (r0.matches() == false) goto L17;
        String r15 = r0.group(1);
        r15.getClass();
        double r7 = Long.parseLong(r15) * 3600;
        String r16 = r0.group(2);
        r16.getClass();
        double r8 = r7 + (Long.parseLong(r16) * 60);
        String r17 = r0.group(3);
        r17.getClass();
        double r9 = r8 + Long.parseLong(r17);
        String r18 = r0.group(4);
        double r1 = 0.0d;
        if (r18 == null) goto L7;
        double r10 = Double.parseDouble(r18);
    L8:
        double r11 = r9 + r10;
        String r19 = r0.group(5);
        if (r19 == null) goto L11;
        double r12 = Long.parseLong(r19) / r14.a;
    L12:
        double r20 = r11 + r12;
        String r110 = r0.group(6);
        if (r110 == null) goto L16;
        r1 = (Long.parseLong(r110) / ((double) r14.b)) / ((double) r14.a);
    L16:
        return (long) ((r20 + r1) * 1000000.0d);
    L11:
        r12 = 0.0d;
        goto L12
    L7:
        r10 = 0.0d;
        goto L8
    L17:
        Matcher r3 = p.matcher(r13);
        if (r3.matches() == false) goto L53;
        String r111 = r3.group(1);
        r111.getClass();
        double r21 = Double.parseDouble(r111);
        String r112 = r3.group(2);
        r112.getClass();
        switch(r112.hashCode()) {
            case 102: goto L38;
            case 104: goto L34;
            case 109: goto L30;
            case 116: goto L26;
            case 3494: goto L23;
            default: goto L21;
        };
    L21:
        r2 = -1;
    L41:
        switch(r2) {
            case 0: goto L49;
            case 1: goto L48;
            case 2: goto L46;
            case 3: goto L45;
            case 4: goto L43;
            default: goto L51;
        };
    L43:
        double r113 = 1000.0d;
    L44:
        r21 = r21 / r113;
        goto L51
    L45:
        r113 = r14.c;
        goto L44
    L46:
        double r114 = 60.0d;
    L47:
        r21 = r21 * r114;
        goto L51
    L48:
        r114 = 3600.0d;
        goto L47
    L49:
        r113 = r14.a;
    L51:
        return (long) (r21 * 1000000.0d);
    L23:
        if (r112.equals("ms") == true) goto L41;
        r2 = -1;
        goto L41
    L26:
        if (r112.equals("t") == false) goto L55;
        r2 = 3;
        goto L41
    L55:
        r2 = -1;
        goto L41
    L30:
        if (r112.equals("m") == false) goto L56;
        r2 = 2;
        goto L41
    L56:
        r2 = -1;
        goto L41
    L34:
        if (r112.equals("h") == false) goto L57;
        r2 = 1;
        goto L41
    L57:
        r2 = -1;
        goto L41
    L38:
        if (r112.equals("f") == false) goto L58;
        r2 = 0;
        goto L41
    L58:
        r2 = -1;
        goto L41
    L53:
        throw new SubtitleDecoderException(xa3.g("Malformed time expression: ", r13));
    }

    public static n50 l(XmlPullParser r5) {
        String r6 = te5.t(r5, "extent");
        if (r6 != null) goto L5;
        return null;
    L5:
        Matcher r1 = t.matcher(r6);
        if (r1.matches() == true) goto L14;
        l93.q0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(r6));
        return null;
    L14:
        String r2 = r1.group(1);     // Catch: NumberFormatException -> L12
        r2.getClass();     // Catch: NumberFormatException -> L12
        int r3 = Integer.parseInt(r2);     // Catch: NumberFormatException -> L12
        String r4 = r1.group(2);     // Catch: NumberFormatException -> L12
        r4.getClass();     // Catch: NumberFormatException -> L12
        return new n50(r3, Integer.parseInt(r4));
    L12:
        l93.q0("TtmlParser", "Ignoring malformed tts extent: ".concat(r6));
        return null;
    }

    @Override // defpackage.zn4
    public final qn4 b(byte[] r20, int r21, int r22) {
        qn4 r1 = null;
        XmlPullParser r2 = this.n.newPullParser();     // Catch: IOException -> L49 XmlPullParserException -> L51
        HashMap r3 = new HashMap();     // Catch: IOException -> L49 XmlPullParserException -> L51
        HashMap r6 = new HashMap();     // Catch: IOException -> L49 XmlPullParserException -> L51
        HashMap r7 = new HashMap();     // Catch: IOException -> L49 XmlPullParserException -> L51
        r6.put("", new wy4("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));     // Catch: IOException -> L49 XmlPullParserException -> L51
        r2.setInput(new ByteArrayInputStream(r20, r21, r22), null);     // Catch: IOException -> L49 XmlPullParserException -> L51
        ArrayDeque r8 = new ArrayDeque();     // Catch: IOException -> L49 XmlPullParserException -> L51
        int r0 = r2.getEventType();     // Catch: IOException -> L49 XmlPullParserException -> L51
        k64 r4 = v;     // Catch: IOException -> L49 XmlPullParserException -> L51
        int r5 = 15;
        int r9 = 0;
        z40 r10 = null;
        n50 r11 = null;
    L5:
        if (r0 == 1) goto L59;
        uy4 r12 = (uy4) r8.peek();     // Catch: IOException -> L49 XmlPullParserException -> L51
        if (r9 != 0) goto L53;
        String r15 = r2.getName();     // Catch: IOException -> L49 XmlPullParserException -> L51
        qn4 r16 = r1;
        if (r0 != 2) goto L39;
    L15:
        e = e;
    L61:
        mj0.j("Unexpected error when reading input.", e);
        return r16;
    L17:
        e = e;
    L63:
        mj0.j("Unable to decode source", e);
        return r16;
    L12:
        if ("tt".equals(r15) == false) goto L14;
        r4 = g(r2);     // Catch: IOException -> L15 XmlPullParserException -> L17
        r5 = e(r2);     // Catch: IOException -> L15 XmlPullParserException -> L17
        r11 = l(r2);     // Catch: IOException -> L15 XmlPullParserException -> L17
    L14:
        k64 r13 = r4;
        int r14 = r5;
        n50 r17 = r11;
        if (d(r15) == true) goto L26;
        l93.K("TtmlParser", "Ignoring unsupported tag: " + r2.getName());     // Catch: IOException -> L15 XmlPullParserException -> L17
    L23:
        r9 = r9 + 1;     // Catch: IOException -> L15 XmlPullParserException -> L17
    L24:
        r11 = r17;
        r5 = r14;
        r4 = r13;
    L58:
        r2.next();     // Catch: IOException -> L15 XmlPullParserException -> L17
        r0 = r2.getEventType();     // Catch: IOException -> L15 XmlPullParserException -> L17
        r1 = r16;
        goto L5
    L26:
        if ("head".equals(r15) == false) goto L65;
        h(r2, r3, r14, r17, r6, r7);     // Catch: IOException -> L15 XmlPullParserException -> L17
        goto L24
    L65:
        uy4 r18 = i(r2, r12, r6, r13);     // Catch: IOException -> L15 XmlPullParserException -> L17 SubtitleDecoderException -> L36
        r8.push(r18);     // Catch: IOException -> L15 XmlPullParserException -> L17 SubtitleDecoderException -> L36
        if (r12 == null) goto L24;
        if (r12.m != null) goto L34;
        r12.m = new ArrayList();     // Catch: IOException -> L15 XmlPullParserException -> L17 SubtitleDecoderException -> L36
    L34:
        r12.m.add(r18);     // Catch: IOException -> L15 XmlPullParserException -> L17 SubtitleDecoderException -> L36
    L36:
        e = move-exception;
        l93.r0("TtmlParser", "Suppressing parser error", e);     // Catch: IOException -> L15 XmlPullParserException -> L17
        goto L23
    L39:
        if (r0 != 4) goto L44;
        r12.getClass();     // Catch: IOException -> L15 XmlPullParserException -> L17
        uy4 r19 = uy4.a(r2.getText());     // Catch: IOException -> L15 XmlPullParserException -> L17
        if (r12.m != null) goto L43;
        r12.m = new ArrayList();     // Catch: IOException -> L15 XmlPullParserException -> L17
    L43:
        r12.m.add(r19);     // Catch: IOException -> L15 XmlPullParserException -> L17
        goto L58
    L44:
        if (r0 != 3) goto L58;
        if (r2.getName().equals("tt") == false) goto L48;
        uy4 r23 = (uy4) r8.peek();     // Catch: IOException -> L15 XmlPullParserException -> L17
        r23.getClass();     // Catch: IOException -> L15 XmlPullParserException -> L17
        r10 = new z40(r23, r3, r6, r7);     // Catch: IOException -> L15 XmlPullParserException -> L17
    L48:
        r8.pop();     // Catch: IOException -> L15 XmlPullParserException -> L17
        goto L58
    L53:
        r16 = r1;
        if (r0 != 2) goto L56;
        r9 = r9 + 1;     // Catch: IOException -> L15 XmlPullParserException -> L17
        goto L58
    L56:
        if (r0 != 3) goto L58;
        r9 = r9 - 1;     // Catch: IOException -> L15 XmlPullParserException -> L17
        goto L58
    L59:
        r16 = r1;
        r10.getClass();     // Catch: IOException -> L15 XmlPullParserException -> L17
        return r10;
    L49:
        e = e;
        r16 = r1;
    L51:
        e = e;
        r16 = r1;
        goto L63
    }

    @Override // defpackage.zn4
    public final void c(byte[] r1, int r2, int r3, yn4 r4, wc0 r5) {
        gb.d0(b(r1, r2, r3), r4, r5);
    }
}
