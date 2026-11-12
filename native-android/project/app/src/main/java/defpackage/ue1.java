package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ue1 implements m31, kg1, Callback, ps {
    public static final mj0 r = null;
    public final /* synthetic */ int n;
    public int o;
    public Object p;
    public Object q;

    static {
        r = new mj0(23);
    }

    public ue1(j02 r13, lc3 r14) {
        this.n = 10;
        ue1 r15 = r14.a;
        int r0 = r13.n;
        if (r0 >= 0) goto L6;
        fz1.c("negative nearestRange.first");
    L6:
        int r16 = Math.min(r13.o, r15.o - 1);
        if (r16 >= r0) goto L9;
        p03 r17 = r73.a;
        r17.getClass();
        this.p = r17;
        this.q = new Object[0];
        this.o = 0;
        return;
    L9:
        int r1 = (r16 - r0) + 1;
        this.q = new Object[r1];
        this.o = r0;
        p03 r2 = new p03(r1);
        f13 r3 = (f13) r15.p;
        if (r0 >= 0) goto L12;
    L14:
        fz1.d("Index " + r0 + ", size " + r15.o);
    L15:
        if (r16 >= 0) goto L17;
    L19:
        fz1.d("Index " + r16 + ", size " + r15.o);
    L20:
        if (r16 >= r0) goto L23;
        fz1.a("toIndex (" + r16 + ") should be not smaller than fromIndex (" + r0 + ")");
    L23:
        int r18 = su3.e(r0, r3);
        int r4 = ((f12) r3.n[r18]).a;
    L24:
        if (r4 > r16) goto L35;
        f12 r5 = (f12) r3.n[r18];
        if1 r6 = (if1) r5.c.n;
        int r7 = r5.a;
        int r8 = Math.max(r0, r7);
        int r9 = Math.min(r16, (r5.b + r7) - 1);
        if (r8 > r9) goto L34;
    L27:
        if (r6 == null) goto L30;
        Object r10 = r6.invoke(Integer.valueOf(r8 - r7));
        if (r10 == null) goto L30;
    L31:
        r2.g(r8, r10);
        ((Object[]) this.q)[r8 - this.o] = r10;
        if (r8 == r9) goto L34;
        r8 = r8 + 1;
    L30:
        r10 = new ql0(r8);
    L34:
        r4 = r4 + r5.b;
        r18 = r18 + 1;
        goto L24
    L35:
        this.p = r2;
        return;
    L17:
        if (r16 >= r15.o) goto L19;
    L12:
        if (r0 >= r15.o) goto L14;
        goto L14
    }

    public static ue1 g(Resources r30, int r31, Resources.Theme r32) {
        XmlResourceParser r2 = r30.getXml(r31);
        AttributeSet r3 = Xml.asAttributeSet(r2);
    L3:
        int r4 = r2.next();
        if (r4 == 2) goto L7;
        if (r4 != 1) goto L3;
    L7:
        if (r4 != 2) goto L130;
        String r5 = r2.getName();
        r5.getClass();
        if (r5.equals("gradient") == false) goto L11;
        String r6 = r2.getName();
        if (r6.equals("gradient") == false) goto L128;
        TypedArray r7 = gi1.O(r30, r32, r3, mt3.e);
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") == null) goto L21;
        float r12 = r7.getFloat(8, 0.0f);
    L23:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") == null) goto L25;
        float r13 = r7.getFloat(9, 0.0f);
    L27:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") == null) goto L29;
        float r14 = r7.getFloat(10, 0.0f);
    L31:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") == null) goto L33;
        float r15 = r7.getFloat(11, 0.0f);
    L35:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") == null) goto L37;
        float r8 = r7.getFloat(3, 0.0f);
    L39:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") == null) goto L41;
        float r9 = r7.getFloat(4, 0.0f);
    L43:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "type") == null) goto L45;
        int r11 = r7.getInt(2, 0);
    L47:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") == null) goto L49;
        int r10 = r7.getColor(0, 0);
    L51:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") == null) goto L53;
        boolean r20 = true;
    L55:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") == null) goto L57;
        int r16 = r7.getColor(7, 0);
    L59:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") == null) goto L61;
        int r17 = r7.getColor(1, 0);
    L63:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") == null) goto L65;
        int r18 = r7.getInt(6, 0);
    L67:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") == null) goto L69;
        float r19 = r7.getFloat(5, 0.0f);
    L70:
        r7.recycle();
        int r21 = r2.getDepth() + 1;
        ArrayList r22 = new ArrayList(20);
        float r25 = r19;
        ArrayList r110 = new ArrayList(20);
    L71:
        int r23 = r2.next();
        float r26 = r14;
        if (r23 == 1) goto L90;
        int r111 = r2.getDepth();
        float r27 = r15;
        if (r111 >= r21) goto L78;
        if (r23 != 3) goto L78;
    L92:
        if (r110.size() <= 0) goto L94;
        gp3 r0 = new gp3(r110, r22);
    L95:
        if (r0 != null) goto L100;
        if (r20 == false) goto L99;
        r0 = new gp3(r10, r16, r17);
        goto L100
    L99:
        r0 = new gp3(r10, r17);
    L100:
        if (r11 == 1) goto L113;
        if (r11 == 2) goto L111;
        int[] r112 = (int[]) r0.o;
        float[] r113 = (float[]) r0.p;
        if (r18 == 1) goto L109;
        if (r18 == 2) goto L108;
        Shader.TileMode r1 = Shader.TileMode.CLAMP;
    L110:
        Shader r114 = new LinearGradient(r12, r13, r26, r27, r112, r113, r1);
    L124:
        return new ue1(r114, null, 0);
    L108:
        r1 = Shader.TileMode.MIRROR;
        goto L110
    L109:
        r1 = Shader.TileMode.REPEAT;
        goto L110
    L111:
        r114 = new SweepGradient(r8, r9, (int[]) r0.o, (float[]) r0.p);
        goto L124
    L113:
        if (r25 <= 0.0f) goto L126;
        int[] r24 = (int[]) r0.o;
        float[] r28 = (float[]) r0.p;
        if (r18 != 1) goto L117;
        Shader.TileMode r29 = Shader.TileMode.REPEAT;
    L122:
        r114 = new RadialGradient(r8, r9, r25, r24, r28, r29);
        goto L124
    L117:
        if (r18 == 2) goto L120;
        r29 = Shader.TileMode.CLAMP;
        goto L122
    L120:
        r29 = Shader.TileMode.MIRROR;
        goto L122
    L126:
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    L94:
        r0 = null;
    L78:
        if (r23 != 2) goto L79;
        if (r111 > r21) goto L79;
        if (r2.getName().equals("item") == false) goto L79;
        TypedArray r33 = gi1.O(r30, r32, r3, mt3.f);
        boolean r115 = r33.hasValue(0);
        boolean r116 = r33.hasValue(1);
        if (r115 == false) goto L89;
        if (r116 == false) goto L89;
        int r210 = r33.getColor(0, 0);
        float r211 = r33.getFloat(1, 0.0f);
        r33.recycle();
        r110.add(Integer.valueOf(r210));
        r22.add(Float.valueOf(r211));
    L89:
        throw new XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    L79:
        r14 = r26;
        r15 = r27;
        goto L71
    L90:
        r27 = r15;
        goto L92
    L69:
        r19 = 0.0f;
        goto L70
    L65:
        r18 = 0;
        goto L67
    L61:
        r17 = 0;
        goto L63
    L57:
        r16 = 0;
        goto L59
    L53:
        r20 = false;
        goto L55
    L49:
        r10 = 0;
        goto L51
    L45:
        r11 = 0;
        goto L47
    L41:
        r9 = 0.0f;
        goto L43
    L37:
        r8 = 0.0f;
        goto L39
    L33:
        r15 = 0.0f;
        goto L35
    L29:
        r14 = 0.0f;
        goto L31
    L25:
        r13 = 0.0f;
        goto L27
    L21:
        r12 = 0.0f;
        goto L23
    L128:
        throw new XmlPullParserException(r2.getPositionDescription() + ": invalid gradient color tag " + r6);
    L11:
        if (r5.equals("selector") == false) goto L15;
        ColorStateList r34 = t50.b(r30, r2, r3, r32);
        return new ue1(null, r34, r34.getDefaultColor());
    L15:
        throw new XmlPullParserException(r2.getPositionDescription() + ": unsupported complex color tag " + r5);
    L130:
        throw new XmlPullParserException("No start tag found");
    }

    @Override // defpackage.m31
    public void A(byte[] r1, byte[] r2) {
        ((MediaDrm) this.q).restoreKeys(r1, r2);
    }

    @Override // defpackage.m31
    public void B(byte[] r1) {
        ((MediaDrm) this.q).closeSession(r1);
    }

    public List C(CharSequence r3) {
        r3.getClass();
        si1 r0 = (si1) this.q;
        r0.getClass();
        yj4 r1 = new yj4(r0, this, r3);
        ArrayList r2 = new ArrayList();
    L4:
        if (r1.hasNext() == false) goto L7;
        r2.add((String) r1.next());
        goto L4
    L7:
        return Collections.unmodifiableList(r2);
    }

    @Override // defpackage.m31
    public void D(final zg5 r3) {
        ((MediaDrm) this.q).setOnEventListener(new te1(this, r3));
    }

    public void E(int r24, int r25, int r26, long r27) {
        char r1 = '2';
        if ((((int) (r27 >> 50)) & 1023) <= 0) goto L22;
        int r2 = xv3.b;
        long r4 = -1125899873288193L;
        int r3 = 33554431;
        char r10 = 25;
        long[] r8 = (long[]) this.p;
        long[] r9 = (long[]) this.q;
        int r0 = this.o;
        r9[0] = (r27 & (-1125899873288193L)) | (((long) (r24 & 33554431)) << 25);
        int r6 = 1;
    L5:
        if (r6 <= 0) goto L30;
        r6 = r6 - 1;
        long r11 = r9[r6];
        int r7 = ((int) r11) & r3;
        int r13 = ((int) (r11 >> r10)) & r3;
        int r12 = ((int) (r11 >> r1)) & 1023;
        if (r12 != 1023) goto L9;
        int r14 = r0;
    L10:
        if (r13 < 0) goto L31;
    L12:
        if (r13 >= (r0 - 2)) goto L21;
        if (r13 > r14) goto L21;
        int r15 = r13 + 2;
        long r16 = r8[r15];
        char r17 = r1;
        int r28 = r3;
        if ((((int) (r16 >> r10)) & r28) != r7) goto L19;
        long r5 = r8[r13];
        int r18 = r13 + 1;
        long r19 = r4;
        long r20 = r8[r18];
        char r29 = r10;
        int r23 = r14;
        int r110 = ((int) (r5 >> 32)) + r25;
        r8[r13] = (((long) (((int) r5) + r26)) & 4294967295L) | (((long) r110) << 32);
        int r21 = ((int) r20) + r26;
        r8[r18] = (((long) r21) & 4294967295L) | (((long) (((int) (r20 >> 32)) + r25)) << 32);
        r8[r15] = (((r16 >> 63) & 1) << 60) | r16;
        if ((((int) (r16 >> r17)) & 1023) <= 0) goto L20;
        int r22 = xv3.b;
        r9[r6] = (r16 & r19) | (((long) ((r13 + 3) & r28)) << r29);
        r6 = r6 + 1;
    L20:
        r13 = r13 + 3;
        r14 = r23;
        r10 = r29;
        r3 = r28;
        r1 = r17;
        r4 = r19;
        goto L12
    L19:
        r19 = r4;
        r29 = r10;
        r23 = r14;
    L21:
        r10 = r10;
        r3 = r3;
        r1 = r1;
        r4 = r4;
        goto L5
    L31:
        return;
    L9:
        r14 = (r12 * 3) + r13;
        goto L10
    L30:
        return;
    }

    @Override // defpackage.m31
    public byte[] H(byte[] r10, byte[] r11) {
        if (ax.c.equals((UUID) this.p) == false) goto L19;
        if (Build.VERSION.SDK_INT >= 27) goto L19;
        String r1 = f35.a;     // Catch: JSONException -> L12
        JSONObject r0 = new JSONObject(new String(r11, StandardCharsets.UTF_8));     // Catch: JSONException -> L12
        StringBuilder r2 = new StringBuilder("{\"keys\":[");     // Catch: JSONException -> L12
        JSONArray r3 = r0.getJSONArray("keys");     // Catch: JSONException -> L12
        int r4 = 0;
    L9:
        if (r4 >= r3.length()) goto L15;
        if (r4 == 0) goto L14;
        r2.append(",");     // Catch: JSONException -> L12
    L14:
        JSONObject r5 = r3.getJSONObject(r4);     // Catch: JSONException -> L12
        r2.append("{\"k\":\"");     // Catch: JSONException -> L12
        r2.append(r5.getString("k").replace('-', '+').replace('_', '/'));     // Catch: JSONException -> L12
        r2.append("\",\"kid\":\"");     // Catch: JSONException -> L12
        r2.append(r5.getString("kid").replace('-', '+').replace('_', '/'));     // Catch: JSONException -> L12
        r2.append("\",\"kty\":\"");     // Catch: JSONException -> L12
        r2.append(r5.getString("kty"));     // Catch: JSONException -> L12
        r2.append("\"}");     // Catch: JSONException -> L12
        r4 = r4 + 1;     // Catch: JSONException -> L12
        goto L9
    L15:
        r2.append("]}");     // Catch: JSONException -> L12
        r11 = r2.toString().getBytes(StandardCharsets.UTF_8);     // Catch: JSONException -> L12
    L12:
        e = move-exception;
        String r6 = f35.a;
        l93.G("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(r11, StandardCharsets.UTF_8)), e);
    L19:
        return ((MediaDrm) this.q).provideKeyResponse(r10, r11);
    }

    @Override // defpackage.m31
    public void N(byte[] r1) {
        ((MediaDrm) this.q).provideProvisionResponse(r1);
    }

    @Override // defpackage.m31
    public k31 O(byte[] r17, List r18, int r19, HashMap r20) {
        UUID r2 = (UUID) this.p;
        nw0 r5 = null;
        if (r18 != null) goto L5;
        byte[] r8 = null;
        String r9 = null;
    L91:
        MediaDrm.KeyRequest r1 = ((MediaDrm) this.q).getKeyRequest(r17, r8, r9, r19, r20);
        byte[] r3 = r1.getData();
        if (ax.c.equals(r2) == true) goto L94;
    L97:
        String r4 = r1.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(r4) == false) goto L101;
    L99:
        r4 = "";
    L110:
        if (TextUtils.isEmpty(r4) == false) goto L115;
        if (r5 == null) goto L115;
        String r0 = r5.p;
        if (TextUtils.isEmpty(r0) == true) goto L115;
        r4 = r0;
    L115:
        r1.getRequestType();
        return new k31(r4, r3);
    L101:
        if (Build.VERSION.SDK_INT < 33) goto L110;
        if ("https://default.url".equals(r4) == false) goto L110;
        String r6 = ((MediaDrm) this.q).getPropertyString("version");
        if (Objects.equals(r6, "1.2") == true) goto L99;
        if (Objects.equals(r6, "aidl-1") == false) goto L110;
    L94:
        if (Build.VERSION.SDK_INT >= 27) goto L97;
        String r7 = f35.a;
        Charset r10 = StandardCharsets.UTF_8;
        r3 = new String(r3, r10).replace('+', '-').replace('/', '_').getBytes(r10);
        goto L97
    L5:
        if (ax.d.equals(r2) == true) goto L8;
        nw0 r11 = (nw0) r18.get(0);
    L37:
        byte[] r12 = r11.r;
        r12.getClass();
        UUID r13 = ax.e;
        if (r13.equals(r2) == false) goto L56;
        byte[] r14 = te5.H(r2, r12);
        if (r14 == null) goto L43;
        r12 = r14;
    L43:
        be3 r15 = new be3(r12);
        int r16 = r15.o();
        short r110 = r15.q();
        short r111 = r15.q();
        if (r110 != 1) goto L54;
        if (r111 != 1) goto L54;
        short r21 = r15.q();
        Charset r22 = StandardCharsets.UTF_16LE;
        String r23 = r15.y(r21, r22);
        if (r23.contains("<LA_URL>") == true) goto L55;
        int r24 = r23.indexOf("</DATA>");
        if (r24 != (-1)) goto L53;
        l93.q0("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
    L53:
        String r25 = r23.substring(0, r24) + "<LA_URL>https://x</LA_URL>" + r23.substring(r24);
        int r112 = r16 + 52;
        ByteBuffer r26 = ByteBuffer.allocate(r112);
        r26.order(ByteOrder.LITTLE_ENDIAN);
        r26.putInt(r112);
        r26.putShort(r110);
        r26.putShort(r111);
        r26.putShort((short) (r25.length() * 2));
        r26.put(r25.getBytes(r22));
        r12 = r26.array();
    L55:
        r12 = te5.d(r13, null, r12);
    L54:
        l93.K("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
    L56:
        int r27 = Build.VERSION.SDK_INT;
        if (r27 >= 27) goto L64;
        if (Objects.equals(r2, ax.c) == false) goto L64;
        gc r28 = te5.G(r12);
        if (r28 == null) goto L64;
        r12 = te5.d(ax.b, (UUID[]) r28.d, (byte[]) r28.c);
    L64:
        if (r13.equals(r2) == true) goto L66;
    L78:
        byte[] r29 = r12;
    L79:
        String r30 = r11.q;
        if (r27 < 26) goto L82;
    L88:
        String r31 = r30;
    L89:
        r9 = r31;
        r8 = r29;
        r5 = r11;
        goto L91
    L82:
        if (ax.c.equals(r2) == false) goto L88;
        if ("video/mp4".equals(r30) == false) goto L86;
    L87:
        r31 = "cenc";
        goto L89
    L86:
        if ("audio/mp4".equals(r30) == false) goto L88;
    L66:
        if ("Amazon".equals(Build.MANUFACTURER) == false) goto L78;
        String r32 = Build.MODEL;
        if ("AFTB".equals(r32) == false) goto L70;
    L75:
        r29 = te5.H(r2, r12);
        if (r29 == null) goto L78;
    L70:
        if ("AFTS".equals(r32) == true) goto L75;
        if ("AFTM".equals(r32) == true) goto L75;
        if ("AFTT".equals(r32) == false) goto L78;
    L8:
        if (Build.VERSION.SDK_INT >= 28) goto L10;
    L26:
        int r33 = 0;
    L28:
        if (r33 >= r18.size()) goto L36;
        nw0 r113 = (nw0) r18.get(r33);
        byte[] r114 = r113.r;
        r114.getClass();
        gc r115 = te5.G(r114);
        if (r115 != null) goto L32;
        int r116 = -1;
    L33:
        if (r116 == 1) goto L34;
        r33 = r33 + 1;
        goto L28
    L34:
        r11 = r113;
        goto L37
    L32:
        r116 = r115.a;
        goto L33
    L36:
        r11 = (nw0) r18.get(0);
        goto L37
    L10:
        if (r18.size() <= 1) goto L26;
        nw0 r34 = (nw0) r18.get(0);
        int r117 = 0;
        int r118 = 0;
    L13:
        if (r117 >= r18.size()) goto L21;
        nw0 r119 = (nw0) r18.get(r117);
        byte[] r120 = r119.r;
        r120.getClass();
        if (Objects.equals(r119.q, r34.q) == false) goto L26;
        if (Objects.equals(r119.p, r34.p) == false) goto L26;
        if (te5.G(r120) == null) goto L26;
        r118 = r118 + r120.length;
        r117 = r117 + 1;
        goto L13
    L21:
        byte[] r121 = new byte[r118];
        int r122 = 0;
        int r123 = 0;
    L23:
        if (r122 >= r18.size()) goto L25;
        byte[] r124 = ((nw0) r18.get(r122)).r;
        r124.getClass();
        int r125 = r124.length;
        System.arraycopy(r124, 0, r121, r123, r125);
        r123 = r123 + r125;
        r122 = r122 + 1;
        goto L23
    L25:
        r11 = new nw0(r34.o, r34.p, r34.q, r121);
        goto L37
    }

    @Override // defpackage.m31
    public int P() {
        return 2;
    }

    @Override // defpackage.m31
    public void Q(byte[] r3, ik3 r4) {
        if (Build.VERSION.SDK_INT < 31) goto L12;
        MediaDrm r2 = (MediaDrm) this.q;     // Catch: UnsupportedOperationException -> L8
        LogSessionId r5 = r4.a();     // Catch: UnsupportedOperationException -> L8
        go2.d();     // Catch: UnsupportedOperationException -> L8
        if (go2.w(r5) == true) goto L13;
        MediaDrm.PlaybackComponent r6 = hd0.e(r2, r3);     // Catch: UnsupportedOperationException -> L8
        r6.getClass();     // Catch: UnsupportedOperationException -> L8
        hd0.q(hd0.f(r6), r5);     // Catch: UnsupportedOperationException -> L8
        return;
    L13:
        return;
    L8:
        l93.q0("FrameworkMediaDrm", "setLogSessionId failed.");
        return;
    }

    @Override // defpackage.m31
    public boolean U(String r6, byte[] r7) {
        MediaDrm r0 = (MediaDrm) this.q;
        UUID r5 = (UUID) this.p;
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 31) goto L5;
    L20:
        MediaCrypto r2 = null;
    L34:
        th = th;
    L41:
        if (r2 == null) goto L43;
        r2.release();
    L43:
        throw th;
    L22:
        if (r1 < 27) goto L24;
    L26:
        UUID r3 = r5;
    L27:
        MediaCrypto r4 = new MediaCrypto(r3, r7);     // Catch: Throwable -> L34 MediaCryptoException -> L44
        boolean r8 = r4.requiresSecureDecoderComponent(r6);     // Catch: Throwable -> L31 MediaCryptoException -> L33
        r4.release();
        return r8;
    L33:
        r2 = r4;
    L31:
        th = th;
        r2 = r4;
        goto L41
    L24:
        if (Objects.equals(r5, ax.c) == false) goto L26;
        r3 = ax.b;     // Catch: Throwable -> L34 MediaCryptoException -> L44
    L37:
        boolean r9 = !r5.equals(ax.c);
        if (r2 == null) goto L40;
        r2.release();
    L40:
        return r9;
    L5:
        if (r5.equals(ax.d) == false) goto L16;
        String r10 = r0.getPropertyString("version");
        if (r10.startsWith("v5.") == false) goto L9;
    L15:
        boolean r11 = false;
    L17:
        if (r11 == false) goto L20;
        return hd0.w(r0, r6, sr0.a(r0, r7));
    L9:
        if (r10.startsWith("14.") == true) goto L15;
        if (r10.startsWith("15.") == true) goto L15;
        if (r10.startsWith("16.0") == true) goto L15;
        r11 = true;
        goto L17
    L16:
        r11 = r5.equals(ax.c);
        goto L17
    }

    @Override // defpackage.m31
    public synchronized void a() {
        monitor-enter(this);
        int r0 = this.o - 1;     // Catch: Throwable -> L7
        this.o = r0;     // Catch: Throwable -> L7
        if (r0 != 0) goto L9;
        ((MediaDrm) this.q).release();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void b() {
        ImageView r0 = (ImageView) this.p;
        Drawable r1 = r0.getDrawable();
        if (r1 == null) goto L5;
        aw0.a(r1);
    L5:
        if (r1 == null) goto L10;
        la0 r2 = (la0) this.q;
        if (r2 == null) goto L11;
        fg.e(r1, r2, r0.getDrawableState());
        return;
    L11:
        return;
    }

    @Override // defpackage.ps
    public os c(l51 r19, long r20) {
        long r4 = r19.getPosition();
        int r1 = (int) Math.min(112800, r19.getLength() - r4);
        be3 r2 = (be3) this.q;
        r2.K(r1);
        r19.n(r2.a, 0, r1);
        int r3 = r2.c;
        long r6 = -1;
        long r10 = -1;
        long r14 = -9223372036854775807L;
    L4:
        if (r2.a() < 188) goto L30;
        byte[] r5 = r2.a;
        int r12 = r2.b;
    L6:
        if (r12 >= r3) goto L10;
        long r16 = -9223372036854775807L;
        if (r5[r12] == 71) goto L11;
        r12 = r12 + 1;
    L11:
        int r7 = r12 + 188;
        if (r7 > r3) goto L32;
        long r8 = au0.P(r2, r12, this.o);
        if (r8 == r16) goto L29;
        long r9 = ((iu4) this.p).b(r8);
        if (r9 > r20) goto L19;
        r14 = r9;
        if ((100000 + r14) > r20) goto L27;
        r10 = r12;
        goto L29
    L27:
        return new os(0, -9223372036854775807L, r4 + ((long) r12));
    L19:
        if (r14 != r16) goto L23;
        return new os(-1, r9, r4);
    L23:
        return new os(0, -9223372036854775807L, r4 + r10);
    L29:
        r2.N(r7);
        r6 = r7;
    L32:
        if (r14 == r16) goto L36;
        return new os(-2, r14, r4 + r6);
    L36:
        return os.e;
    L10:
        r16 = -9223372036854775807L;
        goto L11
    L30:
        r16 = -9223372036854775807L;
        goto L32
    }

    public ly3 d(boolean r3) {
        if (r3 == false) goto L8;
        ax1 r0 = (ax1) this.q;
        if (r0 == null) goto L8;
        throw r0.a();
    L8:
        ly3 r1 = ly3.g(this.o, (Object[]) this.p, this);
        if (r3 == false) goto L15;
        ax1 r2 = (ax1) this.q;
        if (r2 == null) goto L15;
        throw r2.a();
    L15:
        return r1;
    }

    @Override // defpackage.m31
    public Map e(byte[] r1) {
        return ((MediaDrm) this.q).queryKeyStatus(r1);
    }

    public bx1 f() {
        return d(false);
    }

    @Override // defpackage.kg1
    public void h(Object r8) {
        List r3 = (List) r8;
        tn2 r9 = ((ls2) this.q).g;
        Handler r6 = r9.l;
        fr2 r4 = (fr2) this.p;
        f35.W(r6, new ur2(r9, r4, new ct0(this, this.o, r3, r4, 3)));
    }

    public void i(wc0 r5) {
        Iterator r4 = ((CopyOnWriteArrayList) this.q).iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        rt2 r0 = (rt2) r4.next();
        st2 r1 = r0.b;
        f35.W(r0.a, new ur2(5, r5, r1));
        goto L4
    }

    public f12 j(int r4) {
        if (r4 >= 0) goto L4;
    L6:
        fz1.d("Index " + r4 + ", size " + this.o);
    L7:
        f12 r0 = (f12) this.q;
        if (r0 == null) goto L13;
        int r1 = r0.a;
        if (r4 >= (r0.b + r1)) goto L13;
        if (r1 > r4) goto L13;
        return r0;
    L13:
        f13 r2 = (f13) this.p;
        f12 r5 = (f12) r2.n[su3.e(r4, r2)];
        this.q = r5;
        return r5;
    L4:
        if (r4 >= this.o) goto L6;
        goto L6
    }

    @Override // defpackage.ps
    public void k() {
        be3 r2 = (be3) this.q;
        byte[] r0 = f35.b;
        r2.getClass();
        r2.L(r0.length, r0);
    }

    public Object l(int r4) {
        SparseArray r0 = (SparseArray) this.p;
        if (this.o != (-1)) goto L5;
        this.o = 0;
    L5:
        int r1 = this.o;
        if (r1 <= 0) goto L11;
        if (r4 >= r0.keyAt(r1)) goto L11;
        this.o--;
    L11:
        if (this.o >= (r0.size() - 1)) goto L16;
        if (r4 < r0.keyAt(this.o + 1)) goto L16;
        this.o++;
    L16:
        return r0.valueAt(this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(int r17, int r18, int r19, int r20, int r21, int r22, int r23, boolean r24, boolean r25, boolean r26) {
        int r4 = r17 & 33554431;
        long[] r5 = (long[]) this.p;
        int r6 = this.o;
        int r7 = r6 + 3;
        this.o = r7;
        int r8 = r5.length;
        if (r8 > r7) goto L5;
        int r9 = Math.max(r8 * 2, r7);
        this.p = Arrays.copyOf(r5, r9);
        this.q = Arrays.copyOf((long[]) this.q, r9);
    L5:
        long[] r0 = (long[]) this.p;
        r0[r6] = (((long) r18) << 32) | (((long) r19) & 4294967295L);
        r0[r6 + 1] = (((long) r20) << 32) | (((long) r21) & 4294967295L);
        boolean r10 = false;
        int r11 = r22 & 33554431;
        r0[r6 + 2] = (((((((r26 ? 1 : 0) << 63) | ((r25 ? 1 : 0) << 62)) | ((r24 ? 1 : 0) << 61)) | 1152921504606846976L) | (((long) Math.min(0, 1023)) << 50)) | (((long) r11) << 25)) | ((long) (r17 & 33554431));
        if (r22 != (-1)) goto L9;
        return r6;
    L9:
        if (r23 == (-4)) goto L11;
        Object[] r1 = true;
    L13:
        if (r1 == true) goto L15;
        cz1.b("Inserted child " + r4 + " without valid parent index");
    L15:
        int r2 = r23 + 2;
        long r14 = r0[r2];
        if ((33554431 & ((int) r14)) != r11) goto L18;
        r10 = true;
    L18:
        if (r10 == true) goto L20;
        cz1.b("Inserted child " + r4 + " without valid parent index or parent " + r11 + " not found");
    L20:
        int r3 = xv3.b;
        r0[r2] = ((-1151795604700004353L) & r14) | (((long) Math.min((r6 - r23) / 3, 1023)) << 50);
        return r6;
    L11:
        r1 = false;
        goto L13
    }

    public boolean n() {
        if (((Shader) this.p) != null) goto L10;
        ColorStateList r1 = (ColorStateList) this.q;
        if (r1 != null) goto L7;
        return false;
    L7:
        if (r1.isStateful() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // defpackage.kg1
    public void o(Throwable r1) {
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 13: goto L6;
            default: goto L4;
        };
    L4:
        Log.e("SongRepository", "fetchSimilarOnly.onFailure()", r2);
        return;
    L6:
        Log.e("SongRepository", "fetchSimilarByArtist.onFailure()", r2);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r4, Response r5) {
        switch(this.n) {
            case 13: goto L14;
            default: goto L4;
        };
    L4:
        List r6 = xi4.h((xi4) this.q, r5, "similarSongs");
        if (r6.isEmpty() == true) goto L23;
        int r7 = Math.min(this.o, r6.size());
        eg0 r3 = (eg0) this.p;
        List r8 = r6.subList(0, r7);
        HashSet r9 = (HashSet) r3.o;
        List r0 = (List) r3.p;
        k03 r10 = (k03) r3.q;
        Iterator r11 = r8.iterator();
    L8:
        if (r11.hasNext() == false) goto L12;
        Child r1 = (Child) r11.next();
        if (r9.contains(r1.getId()) == true) goto L8;
        r0.add(r1);
        r9.add(r1.getId());
        goto L8
    L12:
        r10.i(r0);
        return;
    L23:
        return;
    L14:
        List r12 = xi4.h((xi4) this.q, r5, "similarSongs2");
        Log.d("SongRepository", "fetchSimilarByArtist.onResponse() - similar songs: " + r12.size());
        if (r12.isEmpty() == true) goto L24;
        ((wi4) this.p).a(r12.subList(0, Math.min(this.o, r12.size())));
        return;
    }

    @Override // defpackage.m31
    public l31 p() {
        MediaDrm.ProvisionRequest r2 = ((MediaDrm) this.q).getProvisionRequest();
        byte[] r1 = r2.getData();
        return new l31(r2.getDefaultUrl(), r1);
    }

    public void q(ed2 r11, int r12, int r13, tb1 r14, int r15, Object r16, long r17, long r19) {
        i(new pt2(this, r11, new un2(r12, r13, r14, r15, r16, f35.i0(r17), f35.i0(r19)), 1));
    }

    public void r(ed2 r11, int r12, int r13, tb1 r14, int r15, Object r16, long r17, long r19) {
        i(new pt2(this, r11, new un2(r12, r13, r14, r15, r16, f35.i0(r17), f35.i0(r19)), 0));
    }

    public void s(ed2 r11, int r12, int r13, tb1 r14, int r15, Object r16, long r17, long r19, IOException r21, boolean r22) {
        i(new qt2(this, r11, new un2(r12, r13, r14, r15, r16, f35.i0(r17), f35.i0(r19)), r21, r22));
    }

    public void t(AttributeSet r9, int r10) {
        ImageView r0 = (ImageView) this.p;
        Context r8 = r0.getContext();
        int[] r2 = st3.f;
        jv3 r11 = jv3.f(r8, r9, r2, r10);
        TypedArray r7 = (TypedArray) r11.o;
        j65.n(r0, r0.getContext(), r2, r9, (TypedArray) r11.o, r10, 0);
        Drawable r12 = r0.getDrawable();     // Catch: Throwable -> L10
        if (r12 != null) goto L12;
        int r1 = r7.getResourceId(1, -1);     // Catch: Throwable -> L10
        if (r1 == (-1)) goto L12;
        r12 = zz1.r(r0.getContext(), r1);     // Catch: Throwable -> L10
        if (r12 == null) goto L12;
        r0.setImageDrawable(r12);     // Catch: Throwable -> L10
    L12:
        if (r12 == null) goto L15;
        aw0.a(r12);     // Catch: Throwable -> L10
    L15:
        if (r7.hasValue(2) == false) goto L18;
        r0.setImageTintList(r11.b(2));     // Catch: Throwable -> L10
    L18:
        if (r7.hasValue(3) == false) goto L20;
        r0.setImageTintMode(aw0.c(r7.getInt(3, -1), null));     // Catch: Throwable -> L10
    L20:
        r11.g();
        return;
    L10:
        th = move-exception;
        r11.g();
        throw th;
    }

    public String toString() {
        switch(this.n) {
            case 17: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder();
        if (((pr3) this.p) != pr3.p) goto L9;
        r0.append("HTTP/1.0");
    L10:
        r0.append(' ');
        r0.append(this.o);
        r0.append(' ');
        r0.append((String) this.q);
        return r0.toString();
    L9:
        r0.append("HTTP/1.1");
        goto L10
    L5:
        return super.toString();
    }

    public void u(ed2 r11, int r12, int r13, tb1 r14, int r15, Object r16, long r17, long r19, int r21) {
        i(new ot2(this, r11, new un2(r12, r13, r14, r15, r16, f35.i0(r17), f35.i0(r19)), r21));
    }

    @Override // defpackage.m31
    public se1 v(byte[] r4) {
        UUID r3 = (UUID) this.p;
        if (Build.VERSION.SDK_INT >= 27) goto L8;
        if (Objects.equals(r3, ax.c) == false) goto L8;
        r3 = ax.b;
    L8:
        return new se1(r3, r4);
    }

    @Override // defpackage.m31
    public byte[] w() {
        return ((MediaDrm) this.q).openSession();
    }

    public ue1 x(Object r4, Object r5) {
        int r0 = (this.o + 1) * 2;
        Object[] r1 = (Object[]) this.p;
        if (r0 <= r1.length) goto L5;
        this.p = Arrays.copyOf(r1, qw1.b(r1.length, r0));
    L5:
        uc5.d(r4, r5);
        Object[] r2 = (Object[]) this.p;
        int r3 = this.o;
        int r6 = r3 * 2;
        r2[r6] = r4;
        r2[r6 + 1] = r5;
        this.o = r3 + 1;
        return this;
    }

    public ue1 y(Iterable r4) {
        if ((r4 instanceof Collection) == false) goto L7;
        int r0 = this.o;
        int r1 = (((Collection) r4).size() + r0) * 2;
        Object[] r2 = (Object[]) this.p;
        if (r1 <= r2.length) goto L7;
        this.p = Arrays.copyOf(r2, qw1.b(r2.length, r1));
    L7:
        Iterator r5 = r4.iterator();
    L9:
        if (r5.hasNext() == false) goto L11;
        Map.Entry r3 = (Map.Entry) r5.next();
        x(r3.getKey(), r3.getValue());
        goto L9
    L11:
        return this;
    }

    public void z(int r3) {
        ImageView r0 = (ImageView) this.p;
        if (r3 == 0) goto L8;
        Drawable r4 = zz1.r(r0.getContext(), r3);
        if (r4 == null) goto L7;
        aw0.a(r4);
    L7:
        r0.setImageDrawable(r4);
    L9:
        b();
        return;
    L8:
        r0.setImageDrawable(null);
        goto L9
    }

    public /* synthetic */ ue1(int r1, int r2, Object r3, String r4) {
        this.n = r2;
        this.p = r3;
        this.o = r1;
        this.q = r4;
    }

    public /* synthetic */ ue1(Object r1, int r2, Object r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }

    public ue1(ArrayList r2, int r3, MotionEvent r4) {
        this.n = 1;
        this.p = r2;
        this.o = r3;
        this.q = r4;
        if (r2.isEmpty() == true) goto L5;
        return;
    L5:
        kf2.n("changes cannot be empty");
        throw null;
    }

    public ue1(ImageView r2) {
        this.n = 2;
        this.o = 0;
        this.p = r2;
    }

    public /* synthetic */ ue1(int r1, byte r2) {
        this.n = r1;
    }

    public ue1(nz2 r2) {
        this.n = 15;
        this.p = new SparseArray();
        this.q = r2;
        this.o = -1;
    }

    public ue1(Shader r2, ColorStateList r3, int r4) {
        this.n = 3;
        this.p = r2;
        this.q = r3;
        this.o = r4;
    }

    public ue1(int r2, iu4 r3) {
        this.n = 18;
        this.o = r2;
        this.p = r3;
        this.q = new be3();
    }

    public ue1() {
        this.n = 9;
        this.p = new f13(new f12[16]);
    }

    public ue1(UUID r6) {
        this.n = 0;
        r6.getClass();
        UUID r0 = ax.b;
        rr2.k("Use C.CLEARKEY_UUID instead", !r0.equals(r6));
        this.p = r6;
        if (Build.VERSION.SDK_INT < 27) goto L5;
    L7:
        r0 = r6;
    L8:
        MediaDrm r1 = new MediaDrm(r0);
        this.q = r1;
        this.o = 1;
        if (ax.d.equals(r6) == true) goto L11;
        return;
    L11:
        if ("ASUS_Z00AD".equals(Build.MODEL) == false) goto L15;
        r1.setPropertyString("securityLevel", "L3");
        return;
    L15:
        return;
    L5:
        if (r6.equals(ax.c) == false) goto L7;
        goto L7
    }

    public ue1(si1 r2) {
        this.n = 16;
        o10 r0 = o10.s;
        this.q = r2;
        this.p = r0;
        this.o = Integer.MAX_VALUE;
    }

    public ue1(int r2) {
        this.n = 5;
        this.p = new Object[r2 * 2];
        this.o = 0;
    }

    public ue1(sd0 r3) {
        this.n = 4;
        this.q = s51.a(150, new zg5(this));
        this.p = r3;
    }

    public ue1(ls2 r2, fr2 r3, int r4) {
        this.n = 7;
        this.q = r2;
        this.p = r3;
        this.o = r4;
    }
}
