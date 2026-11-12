package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy4 implements zn4 {
    public static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern t = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern u = Pattern.compile("^(\\d+) (\\d+)$");
    public static final k64 v = new k64(1, 30.0f, 1);
    public final XmlPullParserFactory n;

    public vy4() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.n = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            nz2.s("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static xy4 a(xy4 xy4Var) {
        return xy4Var == null ? new xy4() : xy4Var;
    }

    public static boolean d(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = u.matcher(attributeValue);
        if (!matcher.matches()) {
            l93.q0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            rr2.i(i, i2, "Invalid cell resolution %s %s", z);
            return i2;
        } catch (NumberFormatException unused) {
            l93.q0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void f(String str, xy4 xy4Var) throws SubtitleDecoderException {
        Matcher matcher;
        String str2 = f35.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = q;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(f34.i(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            l93.q0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(xa3.h("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                xy4Var.j = 3;
                break;
            case "em":
                xy4Var.j = 2;
                break;
            case "px":
                xy4Var.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(xa3.h("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        xy4Var.k = Float.parseFloat(strGroup2);
    }

    public static k64 g(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = f35.a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            rr2.k("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        k64 k64Var = v;
        int i2 = k64Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = k64Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new k64(i2, i * f, i3);
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
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.n50 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy4.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, n50, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static uy4 i(XmlPullParser xmlPullParser, uy4 uy4Var, HashMap map, k64 k64Var) throws SubtitleDecoderException {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        xy4 xy4VarJ = j(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jK = -9223372036854775807L;
        long jK2 = -9223372036854775807L;
        long jK3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jK3 = k(attributeValue, k64Var);
                    break;
                case "end":
                    jK2 = k(attributeValue, k64Var);
                    break;
                case "begin":
                    jK = k(attributeValue, k64Var);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = f35.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (uy4Var != null) {
            long j2 = uy4Var.d;
            if (j2 != -9223372036854775807L) {
                if (jK != -9223372036854775807L) {
                    jK += j2;
                }
                if (jK2 != -9223372036854775807L) {
                    jK2 += j2;
                }
            }
        }
        if (jK2 != -9223372036854775807L) {
            j = jK2;
        } else {
            if (jK3 != -9223372036854775807L) {
                jK2 = jK + jK3;
            } else if (uy4Var != null) {
                long j3 = uy4Var.e;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jK2;
        }
        return new uy4(xmlPullParser.getName(), null, jK, j, xy4VarJ, strArr, str, strSubstring, uy4Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x022c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e  */
    /* JADX WARN: Code duplicated, block: B:163:0x025c  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0289  */
    /* JADX WARN: Code duplicated, block: B:171:0x028e  */
    /* JADX WARN: Code duplicated, block: B:174:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:184:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    public static xy4 j(XmlPullParser xmlPullParser, xy4 xy4Var) {
        byte b;
        int i;
        gb4 gb4VarZ;
        gb4 gb4VarZ2;
        gb4 gb4VarZ3;
        h22 h22Var;
        Object next;
        String str;
        int iHashCode;
        h22 h22Var2;
        Object next2;
        String str2;
        int iHashCode2;
        int i2;
        yr4 yr4Var;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        xy4 xy4VarA = xy4Var;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            String attributeName = xmlPullParser.getAttributeName(i3);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = 13;
                    break;
                case "rubyPosition":
                    b = 14;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    xy4VarA = a(xy4VarA);
                    xy4VarA.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    xy4VarA = a(xy4VarA);
                    xy4VarA.u = attributeValue;
                    break;
                case 2:
                    xy4VarA = a(xy4VarA);
                    xy4VarA.a = attributeValue;
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    xy4VarA = a(xy4VarA);
                    String strU = rr2.U(attributeValue);
                    strU.getClass();
                    switch (strU) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    xy4VarA.o = alignment;
                    break;
                case 4:
                    xy4VarA = a(xy4VarA);
                    xy4VarA.t = attributeValue;
                    break;
                case 5:
                    String strU2 = rr2.U(attributeValue);
                    strU2.getClass();
                    switch (strU2) {
                        case "nounderline":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.g = 0;
                            break;
                        case "underline":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.g = 1;
                            break;
                        case "nolinethrough":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.f = 0;
                            break;
                        case "linethrough":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.f = 1;
                            break;
                    }
                    break;
                case 6:
                    xy4VarA = a(xy4VarA);
                    xy4VarA.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        xy4VarA = a(xy4VarA);
                        xy4VarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strU3 = rr2.U(attributeValue);
                    strU3.getClass();
                    switch (strU3) {
                        case "baseContainer":
                        case "base":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.m = 2;
                            break;
                        case "container":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.m = 1;
                            break;
                        case "delimiter":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            xy4VarA = a(xy4VarA);
                            xy4VarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    xy4VarA = a(xy4VarA);
                    try {
                        xy4VarA.b = d50.a(attributeValue, false);
                        xy4VarA.c = true;
                    } catch (IllegalArgumentException unused) {
                        xa3.s("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    xy4 xy4VarA2 = a(xy4VarA);
                    Matcher matcher = r.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            l93.r0("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        xa3.s("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    xy4VarA2.s = fMin;
                    xy4VarA = xy4VarA2;
                    break;
                case 11:
                    String strU4 = rr2.U(attributeValue);
                    strU4.getClass();
                    if (strU4.equals("all")) {
                        xy4VarA = a(xy4VarA);
                        xy4VarA.q = 1;
                    } else if (strU4.equals("none")) {
                        xy4VarA = a(xy4VarA);
                        xy4VarA.q = 0;
                    }
                    break;
                case 12:
                    try {
                        xy4VarA = a(xy4VarA);
                        f(attributeValue, xy4VarA);
                    } catch (SubtitleDecoderException unused2) {
                        xa3.s("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    xy4VarA = a(xy4VarA);
                    Pattern pattern = yr4.d;
                    if (attributeValue == null) {
                        yr4Var = null;
                    } else {
                        String strU5 = rr2.U(attributeValue.trim());
                        if (strU5.isEmpty()) {
                            yr4Var = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strU5, yr4.d);
                            int length = strArrSplit.length;
                            jx1 jx1VarJ = length != 0 ? length != 1 ? jx1.j(strArrSplit.length, (Object[]) strArrSplit.clone()) : new nf4(strArrSplit[0]) : ny3.w;
                            h22 h22Var3 = new h22(j51.z(yr4.h, jx1VarJ));
                            String str4 = (String) (h22Var3.hasNext() ? h22Var3.next() : "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i = -2;
                                }
                                gb4VarZ = j51.z(yr4.e, jx1VarJ);
                                if (gb4VarZ.isEmpty()) {
                                    gb4VarZ2 = j51.z(yr4.g, jx1VarJ);
                                    gb4VarZ3 = j51.z(yr4.f, jx1VarJ);
                                    if (gb4VarZ2.isEmpty() || !gb4VarZ3.isEmpty()) {
                                        h22Var = new h22(gb4VarZ2);
                                        if (h22Var.hasNext()) {
                                            next = h22Var.next();
                                        } else {
                                            next = "filled";
                                        }
                                        str = (String) next;
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i4 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            h22Var2 = new h22(gb4VarZ3);
                                            if (h22Var2.hasNext()) {
                                                next2 = h22Var2.next();
                                            } else {
                                                next2 = "circle";
                                            }
                                            str2 = (String) next2;
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i2 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i2 = 3;
                                                }
                                                yr4Var = new yr4(i2, i4, i);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i2 = 1;
                                            yr4Var = new yr4(i2, i4, i);
                                        } else {
                                            str.equals("filled");
                                        }
                                        h22Var2 = new h22(gb4VarZ3);
                                        if (h22Var2.hasNext()) {
                                            next2 = h22Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            yr4Var = new yr4(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        yr4Var = new yr4(i2, i4, i);
                                    } else {
                                        yr4Var = new yr4(-1, 0, i);
                                    }
                                } else {
                                    str3 = (String) new h22(gb4VarZ).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i5 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        yr4Var = new yr4(i5, 0, i);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    yr4Var = new yr4(i5, 0, i);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i = 1;
                            gb4VarZ = j51.z(yr4.e, jx1VarJ);
                            if (gb4VarZ.isEmpty()) {
                                str3 = (String) new h22(gb4VarZ).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    yr4Var = new yr4(i5, 0, i);
                                } else {
                                    str3.equals("auto");
                                }
                                yr4Var = new yr4(i5, 0, i);
                            } else {
                                gb4VarZ2 = j51.z(yr4.g, jx1VarJ);
                                gb4VarZ3 = j51.z(yr4.f, jx1VarJ);
                                if (gb4VarZ2.isEmpty()) {
                                    h22Var = new h22(gb4VarZ2);
                                    if (h22Var.hasNext()) {
                                        next = h22Var.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        h22Var2 = new h22(gb4VarZ3);
                                        if (h22Var2.hasNext()) {
                                            next2 = h22Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            yr4Var = new yr4(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        yr4Var = new yr4(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    h22Var2 = new h22(gb4VarZ3);
                                    if (h22Var2.hasNext()) {
                                        next2 = h22Var2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        yr4Var = new yr4(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    yr4Var = new yr4(i2, i4, i);
                                } else {
                                    h22Var = new h22(gb4VarZ2);
                                    if (h22Var.hasNext()) {
                                        next = h22Var.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        h22Var2 = new h22(gb4VarZ3);
                                        if (h22Var2.hasNext()) {
                                            next2 = h22Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            yr4Var = new yr4(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        yr4Var = new yr4(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    h22Var2 = new h22(gb4VarZ3);
                                    if (h22Var2.hasNext()) {
                                        next2 = h22Var2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        yr4Var = new yr4(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    yr4Var = new yr4(i2, i4, i);
                                }
                            }
                        }
                    }
                    xy4VarA.r = yr4Var;
                    break;
                case 14:
                    String strU6 = rr2.U(attributeValue);
                    strU6.getClass();
                    if (strU6.equals("before")) {
                        xy4VarA = a(xy4VarA);
                        xy4VarA.n = 1;
                    } else if (strU6.equals("after")) {
                        xy4VarA = a(xy4VarA);
                        xy4VarA.n = 2;
                    }
                    break;
                case 15:
                    xy4VarA = a(xy4VarA);
                    try {
                        xy4VarA.d = d50.a(attributeValue, false);
                        xy4VarA.e = true;
                    } catch (IllegalArgumentException unused3) {
                        xa3.s("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case WaveRetry.MAX_FAILURES /* 16 */:
                    xy4VarA = a(xy4VarA);
                    String strU7 = rr2.U(attributeValue);
                    strU7.getClass();
                    switch (strU7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    xy4VarA.p = alignment;
                    break;
            }
        }
        return xy4VarA;
    }

    public static long k(String str, k64 k64Var) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = o.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d3 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d5 = d4 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / k64Var.a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) k64Var.b)) / ((double) k64Var.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = p.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(xa3.g("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d8 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d = k64Var.a;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = k64Var.c;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            default:
                return (long) (d8 * 1000000.0d);
        }
        d8 *= d2;
        return (long) (d8 * 1000000.0d);
    }

    public static n50 l(XmlPullParser xmlPullParser) {
        String strT = te5.t(xmlPullParser, "extent");
        if (strT == null) {
            return null;
        }
        Matcher matcher = t.matcher(strT);
        if (!matcher.matches()) {
            l93.q0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strT));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new n50(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            l93.q0("TtmlParser", "Ignoring malformed tts extent: ".concat(strT));
            return null;
        }
    }

    @Override // defpackage.zn4
    public final qn4 b(byte[] bArr, int i, int i2) {
        qn4 qn4Var;
        qn4 qn4Var2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.n.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new wy4("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            k64 k64VarG = v;
            int iE = 15;
            int i3 = 0;
            z40 z40Var = null;
            n50 n50VarL = null;
            while (eventType != 1) {
                uy4 uy4Var = (uy4) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    qn4Var = qn4Var2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                k64VarG = g(xmlPullParserNewPullParser);
                                iE = e(xmlPullParserNewPullParser);
                                n50VarL = l(xmlPullParserNewPullParser);
                            }
                            k64 k64Var = k64VarG;
                            int i4 = iE;
                            n50 n50Var = n50VarL;
                            if (d(name)) {
                                if ("head".equals(name)) {
                                    h(xmlPullParserNewPullParser, map, i4, n50Var, map2, map3);
                                } else {
                                    try {
                                        uy4 uy4VarI = i(xmlPullParserNewPullParser, uy4Var, map2, k64Var);
                                        arrayDeque.push(uy4VarI);
                                        if (uy4Var != null) {
                                            if (uy4Var.m == null) {
                                                uy4Var.m = new ArrayList();
                                            }
                                            uy4Var.m.add(uy4VarI);
                                        }
                                    } catch (SubtitleDecoderException e) {
                                        l93.r0("TtmlParser", "Suppressing parser error", e);
                                        i3++;
                                    }
                                }
                                n50VarL = n50Var;
                                iE = i4;
                                k64VarG = k64Var;
                            } else {
                                l93.K("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i3++;
                            n50VarL = n50Var;
                            iE = i4;
                            k64VarG = k64Var;
                        } catch (IOException e2) {
                            e = e2;
                            mj0.j("Unexpected error when reading input.", e);
                            return qn4Var;
                        } catch (XmlPullParserException e3) {
                            e = e3;
                            mj0.j("Unable to decode source", e);
                            return qn4Var;
                        }
                    } else if (eventType == 4) {
                        uy4Var.getClass();
                        uy4 uy4VarA = uy4.a(xmlPullParserNewPullParser.getText());
                        if (uy4Var.m == null) {
                            uy4Var.m = new ArrayList();
                        }
                        uy4Var.m.add(uy4VarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            uy4 uy4Var2 = (uy4) arrayDeque.peek();
                            uy4Var2.getClass();
                            z40Var = new z40(uy4Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    qn4Var = qn4Var2;
                    if (eventType == 2) {
                        i3++;
                    } else if (eventType == 3) {
                        i3--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                qn4Var2 = qn4Var;
            }
            qn4Var = qn4Var2;
            z40Var.getClass();
            return z40Var;
        } catch (IOException e4) {
            e = e4;
            qn4Var = qn4Var2;
        } catch (XmlPullParserException e5) {
            e = e5;
            qn4Var = qn4Var2;
        }
    }

    @Override // defpackage.zn4
    public final void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        gb.d0(b(bArr, i, i2), yn4Var, wc0Var);
    }
}
