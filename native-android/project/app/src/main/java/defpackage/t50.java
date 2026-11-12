package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import app.homemusic.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t50 {
    public static final ThreadLocal a = null;

    static {
        a = new ThreadLocal();
    }

    public static ColorStateList a(Resources r4, XmlResourceParser r5, Resources.Theme r6) {
        AttributeSet r0 = Xml.asAttributeSet(r5);
    L3:
        int r1 = r5.next();
        if (r1 == 2) goto L8;
        if (r1 != 1) goto L3;
    L8:
        if (r1 != 2) goto L12;
        return b(r4, r5, r0, r6);
    L12:
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources r36, XmlPullParser r37, AttributeSet r38, Resources.Theme r39) {
        r36 = r36;
        r38 = r38;
        r39 = r39;
        String r3 = r37.getName();
        if (r3.equals("selector") == false) goto L148;
        ?? r4 = 1;
        int r5 = r37.getDepth() + 1;
        Object[] r6 = new int[20][];
        int[] r7 = new int[20];
        int r8 = 0;
        int r9 = 0;
    L5:
        int r10 = r37.next();
        if (r10 == r4) goto L145;
        int r11 = r37.getDepth();
        if (r11 >= r5) goto L11;
        if (r10 == 3) goto L145;
    L11:
        if (r10 != 2) goto L15;
        if (r11 > r5) goto L15;
        if (r37.getName().equals("item") == false) goto L15;
        int[] r12 = mt3.a;
        if (r39 != null) goto L19;
        ?? r13 = r36.obtainAttributes(r38, r12);
    L20:
        int r14 = r13.getResourceId(r8, -1);
        if (r14 == (-1)) goto L33;
        ThreadLocal r15 = a;
        TypedValue r16 = (TypedValue) r15.get();
        if (r16 != null) goto L25;
        TypedValue r17 = new TypedValue();
        r15.set(r17);
    L26:
        r36.getValue(r14, r17, r4);
        int r18 = r17.type;
        if (r18 < 28) goto L149;
        if (r18 <= 31) goto L33;
    L149:
        int r19 = a(r36, r36.getXml(r14), r39).getDefaultColor();     // Catch: Exception -> L32
    L35:
        if (r13.hasValue(r4) == false) goto L38;
        float r110 = r13.getFloat(r4, 1.0f);
    L41:
        ?? r111 = r4;
        if (Build.VERSION.SDK_INT >= 31) goto L44;
    L46:
        float r20 = r13.getFloat(4, -1.0f);
    L47:
        r13.recycle();
        int r21 = r38.getAttributeCount();
        int[] r112 = new int[r21];
        int r113 = r8;
        int r114 = r113;
    L48:
        if (r113 >= r21) goto L63;
        int r115 = r38.getAttributeNameResource(r113);
        if (r115 == 16843173) goto L62;
        if (r115 == 16843551) goto L62;
        if (r115 == R.attr.alpha) goto L62;
        if (r115 == R.attr.lStar) goto L62;
        int r22 = r114 + 1;
        if (r38.getAttributeBooleanValue(r113, false) == true) goto L61;
        r115 = -r115;
    L61:
        r112[r114] = r115;
        r114 = r22;
    L62:
        r113 = r113 + 1;
        goto L48
    L63:
        int[] r0 = StateSet.trimStateSet(r112, r114);
        float r116 = 100.0f;
        if (r20 >= 0.0f) goto L66;
    L68:
        boolean r23 = false;
    L70:
        if (r110 != 1.0f) goto L73;
        if (r23 == true) goto L73;
        r0 = r0;
        r5 = r5;
    L129:
        int r1 = r9 + 1;
        int r2 = 8;
        if (r1 > r7.length) goto L132;
    L136:
        r7[r9] = r19;
        if (r1 <= r6.length) goto L143;
        Class<?> r24 = r6.getClass().getComponentType();
        if (r9 <= 4) goto L142;
        r2 = r9 * 2;
    L142:
        Object[] r25 = (Object[]) Array.newInstance(r24, r2);
        System.arraycopy(r6, 0, r25, 0, r9);
        r6 = r25;
    L143:
        r6[r9] = r0;
        r6 = (int[][]) r6;
        r9 = r1;
        r4 = r111 == true ? 1 : 0;
        r5 = r5;
        r8 = 0;
        goto L5
    L132:
        if (r9 > 4) goto L134;
        int r26 = 8;
    L135:
        int[] r27 = new int[r26];
        System.arraycopy(r7, 0, r27, 0, r9);
        r7 = r27;
        goto L136
    L134:
        r26 = r9 * 2;
    L73:
        int r117 = su3.l((int) ((Color.alpha(r19) * r110) + 0.5f), 0, 255);
        if (r23 == false) goto L127;
        ty r28 = ty.a(r19);
        float r118 = r28.a;
        float r29 = r28.b;
        i85 r119 = i85.k;
        if (r29 >= 1.0d) goto L78;
    L81:
        r0 = r0;
        r5 = r5;
        int r30 = gi1.w(r20);
    L116:
        r19 = r30;
    L128:
        r19 = (16777215 & r19) | (r117 << 24);
        goto L129
    L78:
        if (Math.round(r20) <= 0.0d) goto L81;
        if (Math.round(r20) >= 100.0d) goto L81;
        if (r118 >= 0.0f) goto L85;
        float r120 = 0.0f;
    L86:
        float r210 = 0.0f;
        float r121 = r29;
        boolean r211 = r111 == true ? 1 : 0;
        ty r31 = null;
    L88:
        if (Math.abs(r210 - r29) < 0.4f) goto L122;
        float r212 = 1000.0f;
        float r213 = r116;
        float r214 = 0.0f;
        float r215 = 1000.0f;
        ty r216 = null;
    L91:
        if (Math.abs(r214 - r213) <= 0.01f) goto L112;
        r116 = r116;
        float r122 = ((r213 - r214) / 2.0f) + r214;
        r0 = r0;
        int r32 = ty.b(r122, r121, r120).c(i85.k);
        float r123 = gi1.D(Color.red(r32));
        float r33 = gi1.D(Color.green(r32));
        float r34 = gi1.D(Color.blue(r32));
        float[] r35 = gi1.d[r111 == true ? 1 : 0];
        float r124 = ((r34 * r35[2]) + ((r33 * r35[r111 == true ? 1 : 0]) + (r123 * r35[0]))) / r116;
        if (r124 > 0.008856452f) goto L95;
        float r125 = r124 * 903.2963f;
    L96:
        float r40 = Math.abs(r20 - r125);
        if (r40 >= 0.2f) goto L101;
        ty r41 = ty.a(r32);
        ty r42 = ty.b(r41.c, r41.b, r120);
        float r43 = r41.d - r42.d;
        float r44 = r41.e - r42.e;
        float r45 = r41.f - r42.f;
        r5 = r5;
        float r46 = (float) (Math.pow(Math.sqrt((r45 * r45) + ((r44 * r44) + (r43 * r43))), 0.63d) * 1.41d);
        if (r46 > 1.0f) goto L103;
        r215 = r46;
        r212 = r40;
        r216 = r41;
    L103:
        if (r212 != 0.0f) goto L108;
        if (r215 != 0.0f) goto L108;
    L106:
        ty r47 = r216;
        if (r211 == true) goto L114;
        if (r47 != null) goto L120;
        r29 = r121;
    L121:
        r121 = ((r29 - r210) / 2.0f) + r210;
        goto L88
    L120:
        r31 = r47;
        r210 = r121;
        goto L121
    L114:
        if (r47 != null) goto L115;
        r121 = ((r29 - r210) / 2.0f) + r210;
        r211 = false;
        goto L88
    L115:
        r30 = r47.c(r119);
    L108:
        if (r125 >= r20) goto L110;
        r214 = r122;
    L111:
        r116 = r116;
        r0 = r0;
        r5 = r5;
        goto L91
    L110:
        r213 = r122;
        goto L111
    L101:
        r5 = r5;
        goto L103
    L95:
        r125 = (((float) Math.cbrt(r124)) * 116.0f) - 16.0f;
        goto L96
    L112:
        r0 = r0;
        r5 = r5;
        r116 = r116;
        goto L106
    L122:
        r0 = r0;
        r5 = r5;
        if (r31 != null) goto L125;
        r30 = gi1.w(r20);
        goto L116
    L125:
        r30 = r31.c(r119);
        goto L116
    L85:
        r120 = Math.min(360.0f, r118);
        goto L86
    L127:
        r0 = r0;
        r5 = r5;
        goto L128
    L66:
        if (r20 > 100.0f) goto L68;
        r23 = r111 == true ? 1 : 0;
        goto L70
    L44:
        if (r13.hasValue(2) == false) goto L46;
        r20 = r13.getFloat(2, -1.0f);
        goto L47
    L38:
        if (r13.hasValue(3) == false) goto L40;
        r110 = r13.getFloat(3, 1.0f);
        goto L41
    L40:
        r110 = 1.0f;
    L32:
        r19 = r13.getColor(r8, -65281);
        goto L35
    L25:
        r17 = r16;
    L33:
        r19 = r13.getColor(r8, -65281);
        goto L35
    L19:
        r13 = r39.obtainStyledAttributes(r38, r12, r8, r8);
    L15:
        int r310 = r5;
        r4 = r4 == true ? 1 : 0;
        r5 = r310;
        r8 = 0;
    L145:
        int[] r48 = new int[r9];
        int[][] r49 = new int[r9][];
        System.arraycopy(r7, 0, r48, 0, r9);
        System.arraycopy(r6, 0, r49, 0, r9);
        return new ColorStateList(r49, r48);
    L148:
        throw new XmlPullParserException(r37.getPositionDescription() + ": invalid color state list tag " + r3);
    }
}
