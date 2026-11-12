package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.res.ResourceResolutionException;
import androidx.media3.common.ParserException;
import androidx.preference.Preference;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bu {
    public static final vd0[] a = null;
    public static final yr0 b = null;
    public static final String[] c = null;
    public static final String[] d = null;
    public static final String[] e = null;
    public static boolean f;
    public static boolean g;

    static {
        a = new vd0[0];
        b = new yr0();
        c = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        d = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        e = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    public static int A(Object r9, Object r10, int r11, Object r12, int[] r13, Object[] r14, Object[] r15) {
        int r0 = g12.U(r9);
        int r1 = r0 & r11;
        int r2 = B(r1, r12);
        if (r2 == 0) goto L21;
        int r4 = ~r11;
        int r3 = r0 & r4;
        int r5 = -1;
    L6:
        int r6 = r2 - 1;
        int r7 = r13[r6];
        if ((r7 & r4) == r3) goto L9;
    L19:
        int r8 = r7 & r11;
        if (r8 == 0) goto L21;
        r5 = r6;
        r2 = r8;
        goto L6
    L9:
        if (si0.s(r9, r14[r6]) == false) goto L19;
        if (r15 == null) goto L13;
        if (si0.s(r10, r15[r6]) == false) goto L19;
    L13:
        int r16 = r7 & r11;
        if (r5 != (-1)) goto L17;
        C(r1, r16, r12);
        return r6;
    L17:
        r13[r5] = s(r13[r5], r16, r11);
        return r6;
    L21:
        return -1;
    }

    public static int B(int r1, Object r2) {
        if ((r2 instanceof byte[]) == false) goto L7;
        return ((byte[]) r2)[r1] & 255;
    L7:
        if ((r2 instanceof short[]) == false) goto L11;
        return ((short[]) r2)[r1] & 65535;
    L11:
        return ((int[]) r2)[r1];
    }

    public static void C(int r1, int r2, Object r3) {
        if ((r3 instanceof byte[]) == false) goto L7;
        ((byte[]) r3)[r1] = (byte) r2;
        return;
    L7:
        if ((r3 instanceof short[]) == false) goto L10;
        ((short[]) r3)[r1] = (short) r2;
        return;
    L10:
        ((int[]) r3)[r1] = r2;
    }

    public static int D(Context r1, int r2) {
        TypedArray r3 = r1.obtainStyledAttributes(R.style.Animation.Activity, new int[]{r2});
        int r4 = r3.getResourceId(0, -1);
        r3.recycle();
        return r4;
    }

    public static byte[] E(oh0 r4) {
        r4.getClass();
        HashMap r5 = r4.a;
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();     // Catch: IOException -> L22
        DataOutputStream r1 = new DataOutputStream(r0);     // Catch: IOException -> L22
        r1.writeShort(-21521);     // Catch: Throwable -> L9
        r1.writeShort(1);     // Catch: Throwable -> L9
        r1.writeInt(r5.size());     // Catch: Throwable -> L9
        Iterator r6 = r5.entrySet().iterator();     // Catch: Throwable -> L9
    L7:
        if (r6.hasNext() == false) goto L11;
        Map.Entry r2 = (Map.Entry) r6.next();     // Catch: Throwable -> L9
        F(r1, (String) r2.getKey(), r2.getValue());     // Catch: Throwable -> L9
        goto L7
    L11:
        r1.flush();     // Catch: Throwable -> L9
        if (r1.size() > 10240) goto L17;
        byte[] r7 = r0.toByteArray();     // Catch: Throwable -> L9
        r1.close();     // Catch: IOException -> L22
        r7.getClass();     // Catch: IOException -> L22
        return r7;
    L17:
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        q05.h(r1, th);     // Catch: IOException -> L22
        throw th;     // Catch: IOException -> L22
    L22:
        e = move-exception;
        String r3 = ki0.a;
        cx.f().e(r3, "Error in Data#toByteArray: ", e);
        return new byte[0];
    }

    public static final void F(DataOutputStream r16, String r17, Object r18) {
        if (r18 != null) goto L6;
        r16.writeByte(0);
    L108:
        r16.writeUTF(r17);
        return;
    L6:
        if ((r18 instanceof Boolean) == false) goto L9;
        r16.writeByte(1);
        r16.writeBoolean(((Boolean) r18).booleanValue());
        goto L108
    L9:
        if ((r18 instanceof Byte) == false) goto L12;
        r16.writeByte(2);
        r16.writeByte(((Number) r18).byteValue());
        goto L108
    L12:
        if ((r18 instanceof Integer) == false) goto L15;
        r16.writeByte(3);
        r16.writeInt(((Number) r18).intValue());
        goto L108
    L15:
        if ((r18 instanceof Long) == false) goto L18;
        r16.writeByte(4);
        r16.writeLong(((Number) r18).longValue());
        goto L108
    L18:
        if ((r18 instanceof Float) == false) goto L21;
        r16.writeByte(5);
        r16.writeFloat(((Number) r18).floatValue());
        goto L108
    L21:
        if ((r18 instanceof Double) == false) goto L24;
        r16.writeByte(6);
        r16.writeDouble(((Number) r18).doubleValue());
        goto L108
    L24:
        if ((r18 instanceof String) == false) goto L27;
        r16.writeByte(7);
        r16.writeUTF((String) r18);
        goto L108
    L27:
        if ((r18 instanceof Object[]) == false) goto L112;
        Object[] r1 = (Object[]) r18;
        i30 r3 = kx3.a(r1.getClass());
        if (r3.equals(kx3.a(Boolean[].class)) == false) goto L32;
        int r4 = 8;
    L49:
        r16.writeByte(r4);
        r16.writeInt(r1.length);
        int r5 = r1.length;
        int r6 = 0;
    L50:
        if (r6 >= r5) goto L108;
        Object r13 = r1[r6];
        String r14 = null;
        Boolean r15 = null;
        Byte r19 = null;
        Integer r110 = null;
        Long r111 = null;
        Float r112 = null;
        Double r113 = null;
        if (r4 == 8) goto L54;
        if (r4 == 9) goto L62;
        if (r4 == 10) goto L70;
        if (r4 == 11) goto L78;
        if (r4 == 12) goto L86;
        if (r4 == 13) goto L94;
        if (r4 != 14) goto L107;
        if ((r13 instanceof String) == false) goto L104;
        r14 = (String) r13;
    L104:
        if (r14 != null) goto L106;
        r14 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    L106:
        r16.writeUTF(r14);
    L107:
        r6 = r6 + 1;
        goto L50
    L94:
        if ((r13 instanceof Double) == false) goto L96;
        r113 = (Double) r13;
    L96:
        if (r113 == null) goto L98;
        double r114 = r113.doubleValue();
    L99:
        r16.writeDouble(r114);
        goto L107
    L98:
        r114 = 0.0d;
        goto L99
    L86:
        if ((r13 instanceof Float) == false) goto L88;
        r112 = (Float) r13;
    L88:
        if (r112 == null) goto L90;
        float r115 = r112.floatValue();
    L91:
        r16.writeFloat(r115);
        goto L107
    L90:
        r115 = 0.0f;
        goto L91
    L78:
        if ((r13 instanceof Long) == false) goto L80;
        r111 = (Long) r13;
    L80:
        if (r111 == null) goto L82;
        long r116 = r111.longValue();
    L83:
        r16.writeLong(r116);
        goto L107
    L82:
        r116 = 0;
        goto L83
    L70:
        if ((r13 instanceof Integer) == false) goto L72;
        r110 = (Integer) r13;
    L72:
        if (r110 == null) goto L74;
        int r117 = r110.intValue();
    L75:
        r16.writeInt(r117);
        goto L107
    L74:
        r117 = 0;
        goto L75
    L62:
        if ((r13 instanceof Byte) == false) goto L64;
        r19 = (Byte) r13;
    L64:
        if (r19 == null) goto L66;
        byte r118 = r19.byteValue();
    L67:
        r16.writeByte(r118);
        goto L107
    L66:
        r118 = 0;
        goto L67
    L54:
        if ((r13 instanceof Boolean) == false) goto L56;
        r15 = (Boolean) r13;
    L56:
        if (r15 == null) goto L58;
        boolean r119 = r15.booleanValue();
    L59:
        r16.writeBoolean(r119);
        goto L107
    L58:
        r119 = false;
        goto L59
    L32:
        if (r3.equals(kx3.a(Byte[].class)) == false) goto L35;
        r4 = 9;
        goto L49
    L35:
        if (r3.equals(kx3.a(Integer[].class)) == false) goto L38;
        r4 = 10;
        goto L49
    L38:
        if (r3.equals(kx3.a(Long[].class)) == false) goto L41;
        r4 = 11;
        goto L49
    L41:
        if (r3.equals(kx3.a(Float[].class)) == false) goto L44;
        r4 = 12;
        goto L49
    L44:
        if (r3.equals(kx3.a(Double[].class)) == false) goto L47;
        r4 = 13;
        goto L49
    L47:
        if (r3.equals(kx3.a(String[].class)) == false) goto L110;
        r4 = 14;
        goto L49
    L110:
        kf2.l(kx3.a(r1.getClass()).b(), "Unsupported value type ");
        return;
    L112:
        kf2.l(kx3.a(r18.getClass()).c(), "Unsupported value type ");
    }

    public static sp2 G(MediaRoute2Info r13) {
        if (r13 == null) goto L93;
        ss0 r1 = new ss0(to2.i(r13), to2.h(r13).toString());
        Bundle r2 = (Bundle) r1.n;
        r2.putInt("connectionState", to2.a(r13));
        r2.putInt("volumeHandling", to2.x(r13));
        r2.putInt("volumeMax", xq2.c(r13));
        r2.putInt("volume", xq2.z(r13));
        Bundle r3 = l3.j(r13);
        if (r3 != null) goto L8;
        r2.putBundle("extras", null);
    L9:
        r2.putBoolean("enabled", true);
        r2.putBoolean("canDisconnect", false);
        if (Build.VERSION.SDK_INT < 34) goto L53;
        r2.putStringArrayList("deduplicationIds", new ArrayList(a3.g(r13)));
        int r4 = a3.j(r13);
        int r7 = 2;
        if (r4 != 2) goto L14;
        r7 = 12;
    L54:
        CharSequence r5 = xq2.n(r13);
        if (r5 == null) goto L57;
        r2.putString("status", r5.toString());
    L57:
        Uri r6 = xq2.i(r13);
        if (r6 == null) goto L60;
        r2.putString("iconUri", r6.toString());
    L60:
        Bundle r8 = l3.j(r13);
        if (r8 == null) goto L93;
        if (r8.containsKey("androidx.mediarouter.media.KEY_EXTRAS") == false) goto L93;
        if (r8.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") == false) goto L93;
        if (r8.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS") == false) goto L93;
        Bundle r9 = r8.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
        if (r9 != null) goto L72;
        r2.putBundle("extras", null);
    L73:
        if (r7 != 0) goto L76;
        r7 = r8.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
    L76:
        r2.putInt("deviceType", r7);
        r2.putInt("playbackType", r8.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList r0 = r8.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (r0 == null) goto L79;
        r1.n(r0);
    L79:
        List r14 = to2.k(r13);
        if (r14.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE") == false) goto L83;
        r2.putBoolean("isDynamicGroupRoute", true);
    L83:
        if (r14.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK") == false) goto L92;
        ArrayList<String> r15 = r8.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS");
        if (r15 != null) goto L87;
    L90:
        Log.w("MediaRouter2Utils", "Invalid feature of a group without members");
        goto L92
    L87:
        if (r15.isEmpty() == true) goto L90;
        r1.p(r15);
    L92:
        return r1.r();
    L72:
        r2.putBundle("extras", new Bundle(r9));
        goto L73
    L14:
        if (r4 != 3) goto L16;
        r7 = 13;
        goto L54
    L16:
        if (r4 != 4) goto L18;
        r7 = 14;
        goto L54
    L18:
        if (r4 != 22) goto L20;
        r7 = 20;
        goto L54
    L20:
        if (r4 != 23) goto L22;
        r7 = 21;
        goto L54
    L22:
        if (r4 != 26) goto L24;
        r7 = 22;
        goto L54
    L24:
        if (r4 != 29) goto L26;
        r7 = 24;
        goto L54
    L26:
        if (r4 == 2000) goto L45;
        switch(r4) {
            case 8: goto L44;
            case 9: goto L43;
            case 10: goto L42;
            case 11: goto L41;
            case 12: goto L40;
            case 13: goto L39;
            default: goto L28;
        };
    L28:
        switch(r4) {
            case 1001: goto L38;
            case 1002: goto L54;
            case 1003: goto L37;
            case 1004: goto L36;
            case 1005: goto L35;
            case 1006: goto L34;
            case 1007: goto L33;
            case 1008: goto L32;
            case 1009: goto L31;
            case 1010: goto L30;
            default: goto L53;
        };
    L30:
        r7 = 11;
        goto L54
    L31:
        r7 = 10;
        goto L54
    L32:
        r7 = 9;
        goto L54
    L33:
        r7 = 8;
        goto L54
    L34:
        r7 = 7;
        goto L54
    L35:
        r7 = 6;
        goto L54
    L36:
        r7 = 5;
        goto L54
    L37:
        r7 = 4;
        goto L54
    L38:
        r7 = 1;
        goto L54
    L39:
        r7 = 19;
        goto L54
    L40:
        r7 = 18;
        goto L54
    L41:
        r7 = 17;
        goto L54
    L42:
        r7 = 23;
        goto L54
    L43:
        r7 = 16;
        goto L54
    L44:
        r7 = 3;
        goto L54
    L45:
        r7 = 1000;
    L53:
        r7 = 0;
        goto L54
    L8:
        r2.putBundle("extras", new Bundle(r3));
    L93:
        return null;
    }

    public static boolean H(Object r2, Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
    L9:
        return false;
    L7:
        if (r2.equals(r3) == false) goto L9;
        return true;
    }

    public static final so0 a(Context r3) {
        float r0 = r3.getResources().getConfiguration().fontScale;
        float r4 = r3.getResources().getDisplayMetrics().density;
        bb1 r2 = cb1.a(r0);
        if (r2 != null) goto L6;
        r2 = new ua2(r0);
    L6:
        return new so0(r4, r0, r2);
    }

    public static final void b(Object r1, if1 r2, rg1 r3) {
        boolean r4 = r3.e(r1);
        Object r0 = r3.H();
        if (r4 == false) goto L5;
    L6:
        r0 = new wr0(r2);
        r3.b0(r0);
    L7:
        wr0 r5 = (wr0) r0;
        return;
    L5:
        if (r0 != j80.a) goto L7;
        goto L6
    }

    public static final void c(wf1 r2, rg1 r3, Object r4) {
        ne0 r0 = r3.R;
        boolean r5 = r3.e(r4);
        Object r1 = r3.H();
        if (r5 == false) goto L5;
    L6:
        r1 = new l62(r0, r2);
        r3.b0(r1);
    L7:
        l62 r6 = (l62) r1;
        return;
    L5:
        if (r1 != j80.a) goto L7;
        goto L6
    }

    public static final wv3 d(long r8, long r10) {
        int r2 = (int) (r8 >> 32);
        float r3 = Float.intBitsToFloat(r2);
        int r9 = (int) (r8 & 4294967295L);
        float r11 = Float.intBitsToFloat(r9);
        float r4 = Float.intBitsToFloat(r2);
        float r1 = Float.intBitsToFloat((int) (r10 >> 32)) + r4;
        float r12 = Float.intBitsToFloat(r9);
        return new wv3(r3, r11, r1, Float.intBitsToFloat((int) (r10 & 4294967295L)) + r12);
    }

    public static final void e(jx3 r3, vb4 r4, Preference r5, jx3 r6) {
        boolean r0 = false;
        if (r3.n == null) goto L5;
        boolean r7 = true;
    L6:
        f = r7;
        Preference r2 = r4.h0("homemusic_check_update");
        if (r2 != null) goto L9;
    L11:
        boolean r8 = false;
    L12:
        if (r7 == false) goto L15;
        if (r8 == false) goto L15;
        r0 = true;
    L15:
        r5.A(r0);
        String r9 = (String) r6.n;
        if (r9 == null) goto L20;
        String r10 = r4.t(app.homemusic.R.string.homemusic_settings_google_on, new Object[]{r9});
        if (r10 == null) goto L20;
    L21:
        r5.x(r10);
        return;
    L20:
        r10 = r4.s(app.homemusic.R.string.homemusic_settings_google_off);
        r10.getClass();
        goto L21
    L9:
        if (r2.K != true) goto L11;
        r8 = true;
        goto L12
    L5:
        r7 = false;
        goto L6
    }

    public static final void f(vb4 r1, String r2) {
        if (r1.y() == false) goto L6;
        Toast.makeText(r1.Z(), r2, 0).show();
        return;
    }

    public static Object g(int r1) {
        if (r1 >= 2) goto L5;
    L18:
        kf2.n(f34.f(r1, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    L5:
        if (r1 > 1073741824) goto L18;
        if (Integer.highestOneBit(r1) != r1) goto L18;
        if (r1 > 256) goto L13;
        return new byte[r1];
    L13:
        if (r1 > 65536) goto L17;
        return new short[r1];
    L17:
        return new int[r1];
    }

    public static x65 h(Class r4) {
        Constructor r2 = r4.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L18
        if (Modifier.isPublic(r2.getModifiers()) == false) goto L17;
        Object r3 = r2.newInstance(null);     // Catch: IllegalAccessException -> L8 InstantiationException -> L10
        r3.getClass();     // Catch: IllegalAccessException -> L8 InstantiationException -> L10
        return (x65) r3;
    L8:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r4, e);
        return null;
    L10:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r4, e);
        return null;
    L17:
        throw new RuntimeException("Cannot create an instance of " + r4);
    L18:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r4, e);
        return null;
    }

    public static final Object i(yn3 r2, String r3, wd0 r4) {
        Object r5 = r2.b(r3, new o54(20), r4);
        if (r5 != xe0.n) goto L6;
        return r5;
    L6:
        return j15.a;
    }

    public static final void j(DataInputStream r2) {
        short r0 = r2.readShort();
        if (r0 != (-21521)) goto L9;
        short r3 = r2.readShort();
        if (r3 != 1) goto L7;
        return;
    L7:
        nz2.f(f34.f(r3, "Unsupported version number: "));
        return;
    L9:
        nz2.f(f34.f(r0, "Magic number doesn't match: "));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable k(DataInputStream r5, byte r6) {
        if (r6 != 0) goto L6;
        return null;
    L6:
        if (r6 != 1) goto L10;
        return Boolean.valueOf(r5.readBoolean());
    L10:
        if (r6 != 2) goto L14;
        return Byte.valueOf(r5.readByte());
    L14:
        if (r6 != 3) goto L18;
        return Integer.valueOf(r5.readInt());
    L18:
        if (r6 != 4) goto L22;
        return Long.valueOf(r5.readLong());
    L22:
        if (r6 != 5) goto L26;
        return Float.valueOf(r5.readFloat());
    L26:
        if (r6 != 6) goto L30;
        return Double.valueOf(r5.readDouble());
    L30:
        if (r6 == 7) goto L32;
        int r2 = 0;
        if (r6 != 8) goto L40;
        int r7 = r5.readInt();
        ?? r0 = new Boolean[r7];
    L36:
        if (r2 >= r7) goto L38;
        r0[r2] = Boolean.valueOf(r5.readBoolean());
        r2 = r2 + 1;
        goto L36
    L38:
        return r0;
    L40:
        if (r6 != 9) goto L46;
        int r8 = r5.readInt();
        ?? r1 = new Byte[r8];
    L42:
        if (r2 >= r8) goto L44;
        r1[r2] = Byte.valueOf(r5.readByte());
        r2 = r2 + 1;
        goto L42
    L44:
        return r1;
    L46:
        if (r6 != 10) goto L52;
        int r9 = r5.readInt();
        ?? r3 = new Integer[r9];
    L48:
        if (r2 >= r9) goto L50;
        r3[r2] = Integer.valueOf(r5.readInt());
        r2 = r2 + 1;
        goto L48
    L50:
        return r3;
    L52:
        if (r6 != 11) goto L58;
        int r10 = r5.readInt();
        ?? r4 = new Long[r10];
    L54:
        if (r2 >= r10) goto L56;
        r4[r2] = Long.valueOf(r5.readLong());
        r2 = r2 + 1;
        goto L54
    L56:
        return r4;
    L58:
        if (r6 != 12) goto L64;
        int r11 = r5.readInt();
        ?? r12 = new Float[r11];
    L60:
        if (r2 >= r11) goto L62;
        r12[r2] = Float.valueOf(r5.readFloat());
        r2 = r2 + 1;
        goto L60
    L62:
        return r12;
    L64:
        if (r6 != 13) goto L70;
        int r13 = r5.readInt();
        ?? r14 = new Double[r13];
    L66:
        if (r2 >= r13) goto L68;
        r14[r2] = Double.valueOf(r5.readDouble());
        r2 = r2 + 1;
        goto L66
    L68:
        return r14;
    L70:
        if (r6 != 14) goto L78;
        int r15 = r5.readInt();
        ?? r16 = new String[r15];
    L72:
        if (r2 >= r15) goto L77;
        String r17 = r5.readUTF();
        if (h12.c(r17, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d") == false) goto L76;
        r17 = null;
    L76:
        r16[r2] = r17;
        r2 = r2 + 1;
        goto L72
    L77:
        return r16;
    L78:
        kf2.o(f34.f(r6, "Unsupported type "));
        return null;
    L32:
        return r5.readUTF();
    }

    public static hg3 l(View r2) {
        if (Build.VERSION.SDK_INT < 26) goto L6;
        int r1 = 6;
        return new hg3(r1, r50.d(r2));
    L6:
        return null;
    }

    public static final String m(Context r6) {
        PackageInfo r2 = null;
        PackageInfo r3 = r6.getPackageManager().getPackageInfo(r6.getPackageName(), 0);     // Catch: PackageManager.NameNotFoundException -> L5
    L7:
        if (r3 == null) goto L9;
        String r4 = String.valueOf(r3.versionName);
    L10:
        String r5 = "\nApp version name   : ".concat(r4);
        r2 = r6.getPackageManager().getPackageInfo(r6.getPackageName(), 0);     // Catch: PackageManager.NameNotFoundException -> L13
    L15:
        if (r2 != null) goto L17;
        String r0 = "Unkown";
    L21:
        String r1 = b11.o(r5, "\nApp version code   : ", r0);
        String r7 = Build.VERSION.RELEASE;
        r7.getClass();
        String r8 = (r1 + "\nAndroid OS version : " + r7) + "\nAndroid SDK version: " + Build.VERSION.SDK_INT;
        String r9 = Build.BRAND;
        r9.getClass();
        String r10 = r8 + "\nDevice Brand       : " + r9;
        String r11 = Build.MANUFACTURER;
        r11.getClass();
        String r12 = r10 + "\nDevice Manufacturer: " + r11;
        String r13 = Build.DEVICE;
        r13.getClass();
        String r14 = r12 + "\nDevice Name        : " + r13;
        String r15 = Build.MODEL;
        r15.getClass();
        String r16 = r14 + "\nDevice Model       : " + r15;
        String r17 = Arrays.toString(Build.SUPPORTED_ABIS);
        r17.getClass();
        String r18 = r16 + "\n" + r17;
        String r19 = r6.getPackageName();
        r19.getClass();
        return r18 + "\n" + r19;
    L17:
        if (Build.VERSION.SDK_INT < 28) goto L19;
        r0 = String.valueOf(sr0.e(r2));
        goto L21
    L19:
        r0 = String.valueOf(r2.versionCode);
    L13:
        e = move-exception;
        Log.w("BugReportUtil", "We tried to get versionCode but Android wouldn't let us.", e);
        goto L15
    L9:
        r4 = "Unknown";
    L5:
        e = move-exception;
        Log.w("BugReportUtil", "We tried to get versionName but Android wouldn't let us.", e);
        r3 = null;
        goto L7
    }

    public static String n(Class r4) {
        LinkedHashMap r0 = u43.b;
        String r1 = (String) r0.get(r4);
        if (r1 != null) goto L14;
        s43 r2 = (s43) r4.getAnnotation(s43.class);
        if (r2 == null) goto L7;
        r1 = r2.value();
    L8:
        if (r1 != null) goto L10;
    L12:
        kf2.e("No @Navigator.Name annotation found for ".concat(r4.getSimpleName()));
        return null;
    L10:
        if (r1.length() <= 0) goto L12;
        r0.put(r4, r1);
        goto L14
    L7:
        r1 = null;
    L14:
        r1.getClass();
        return r1;
    }

    public static final Object o(e94 r0, p94 r1) {
        Object r2 = r0.n.g(r1);
        if (r2 != null) goto L6;
        return null;
    L6:
        return r2;
    }

    public static ArrayList p(List r2) {
        if (r2 == null) goto L4;
        ArrayList r0 = new ArrayList();
        Iterator r3 = r2.iterator();
    L7:
        if (r3.hasNext() == false) goto L12;
        MediaRoute2Info r1 = l3.g(r3.next());
        if (r1 == null) goto L7;
        r0.add(l3.p(r1));
        goto L7
    L12:
        return r0;
    L4:
        return new ArrayList();
    }

    public static final boolean q(Spanned r2, Class r3) {
        if (r2.nextSpanTransition(-1, r2.length(), r3) == r2.length()) goto L6;
        return true;
    L6:
        return false;
    }

    public static ry r(ne0 r3, wf1 r4) {
        r3.getClass();
        ze0 r2 = ze0.n;
        return vr1.v(new eg0(r3, r2, r4, 4));
    }

    public static int s(int r1, int r2, int r3) {
        return (r1 & (~r3)) | (r2 & r3);
    }

    public static int t(int r1) {
        if (r1 >= 32) goto L5;
        int r0 = 4;
    L7:
        return (r1 + 1) * r0;
    L5:
        r0 = 2;
        goto L7
    }

    public static dx2 w(dx2 r6, hd3 r7, hs r8, i80 r9, float r10, dt r11) {
        return r6.c(new id3(r7, r8, r9, r10, r11));
    }

    public static final hd3 x(int r70, rg1 r71) {
        Context r2 = (Context) r71.i(hb.b);
        Resources r3 = (Resources) r71.i(hb.c);
        z04 r4 = (z04) r71.i(hb.e);
        monitor-enter(r4);
        TypedValue r5 = (TypedValue) r4.a.b(r70);     // Catch: Throwable -> L8
        if (r5 != null) goto L10;
        r5 = new TypedValue();     // Catch: Throwable -> L8
        r3.getValue(r70, r5, true);     // Catch: Throwable -> L8
        i03 r7 = r4.a;     // Catch: Throwable -> L8
        int r8 = r7.d(r70);     // Catch: Throwable -> L8
        Object[] r9 = r7.c;     // Catch: Throwable -> L8
        Object r10 = r9[r8];     // Catch: Throwable -> L8
        r7.b[r8] = r70;     // Catch: Throwable -> L8
        r9[r8] = r5;     // Catch: Throwable -> L8
    L10:
        monitor-exit(r4);
        CharSequence r6 = r5.string;
        boolean r11 = false;
        if (r6 != null) goto L14;
    L232:
        r71.R(-1771643000);
        Object r12 = r2.getTheme();
        boolean r13 = r71.e(r12) | (r71.e(r6) | r71.d(r70));
        Object r14 = r71.H();
        if (r13 == true) goto L248;
        if (r14 == j80.a) goto L248;
    L239:
        cc r15 = (cc) r14;
        ys r0 = new ys(r15, (((long) r15.a.getHeight()) & 4294967295L) | (((long) r15.a.getWidth()) << 32));
        r71.o(false);
        return r0;
    L248:
        Drawable r1 = r3.getDrawable(r70, null);     // Catch: Exception -> L241
        r1.getClass();     // Catch: Exception -> L241
        r14 = new cc(((BitmapDrawable) r1).getBitmap());     // Catch: Exception -> L241
        r71.b0(r14);
    L241:
        e = move-exception;
        throw new ResourceResolutionException("Error attempting to load resource: " + r6, e);
    L14:
        if (qm4.p0(r6, ".xml") != true) goto L232;
        r71.R(-1771798434);
        Resources.Theme r16 = r2.getTheme();
        int r17 = r5.changingConfigurations;
        iw1 r18 = (iw1) r71.i(hb.d);
        hw1 r19 = new hw1(r16, r70);
        WeakReference r110 = (WeakReference) r18.a.get(r19);
        if (r110 == null) goto L18;
        gw1 r111 = (gw1) r110.get();
    L19:
        if (r111 != null) goto L208;
        XmlResourceParser r20 = r3.getXml(r70);
        int r112 = r20.next();
    L22:
        if (r112 == 2) goto L25;
        if (r112 == 1) goto L25;
        r112 = r20.next();
    L25:
        if (r112 != 2) goto L207;
        if (h12.c(r20.getName(), "vector") == false) goto L204;
        AttributeSet r113 = Xml.asAttributeSet(r20);
        fd r114 = new fd();
        r114.c = r20;
        r114.a = 0;
        long r115 = 4294967295L;
        pz1 r21 = new pz1(10, r11);
        char r116 = ' ';
        r21.o = new float[64];
        r114.e = r21;
        TypedArray r22 = gi1.O(r3, r16, r113, gh0.a);
        r114.e(r22.getChangingConfigurations());
        dt r117 = null;
        if (gi1.u(r20, "autoMirrored") == true) goto L31;
        boolean r30 = false;
    L32:
        r114.e(r22.getChangingConfigurations());
        float r24 = r114.b(r22, "viewportWidth", 7, 0.0f);
        float r25 = r114.b(r22, "viewportHeight", 8, 0.0f);
        if (r24 <= 0.0f) goto L203;
        if (r25 <= 0.0f) goto L201;
        int r23 = 3;
        float r26 = r22.getDimension(3, 0.0f);
        r114.e(r22.getChangingConfigurations());
        float r27 = r22.getDimension(2, 0.0f);
        r114.e(r22.getChangingConfigurations());
        if (r22.hasValue(1) == false) goto L45;
        TypedValue r118 = new TypedValue();
        r22.getValue(1, r118);
        if (r118.type != 2) goto L41;
        long r28 = x40.g;
    L46:
        int r29 = r22.getInt(6, -1);
        r114.e(r22.getChangingConfigurations());
        if (r29 == (-1)) goto L52;
        if (r29 == 3) goto L57;
        if (r29 == 5) goto L262;
        if (r29 == 9) goto L56;
        switch(r29) {
            case 14: goto L55;
            case 15: goto L54;
            case 16: goto L53;
            default: goto L263;
        };
    L53:
        int r31 = 12;
    L58:
        float r210 = r26 / r3.getDisplayMetrics().density;
        float r32 = r27 / r3.getDisplayMetrics().density;
        r22.recycle();
        ArrayList r119 = new ArrayList();
        ew1 r35 = new ew1(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        r119.add(r35);
        int r36 = 0;
    L60:
        if (r20.getEventType() == 1) goto L65;
        if (r20.getDepth() < 1) goto L64;
    L66:
        List r48 = u01.n;
        XmlPullParser r33 = (XmlPullParser) r114.c;
        XmlResourceParser r50 = r20;
        pz1 r34 = (pz1) r114.e;
        int r51 = r17;
        int r37 = r33.getEventType();
        int r52 = r31;
        if (r37 != 2) goto L69;
        String r38 = r33.getName();
        if (r38 != null) goto L88;
    L82:
        float r53 = r32;
    L194:
        r50.next();
        r20 = r50;
        r17 = r51;
        r31 = r52;
        r32 = r53;
        r23 = 3;
        goto L60
    L88:
        int r39 = r38.hashCode();
        r53 = r32;
        if (r39 == (-1649314686)) goto L181;
        if (r39 == 3433509) goto L110;
        if (r39 != 98629247) goto L194;
        if (r38.equals("group") == false) goto L194;
        TypedArray r40 = gi1.O(r3, r16, r113, gh0.b);
        r114.e(r40.getChangingConfigurations());
        float r41 = r114.b(r40, "rotation", 5, 0.0f);
        float r42 = r40.getFloat(1, 0.0f);
        r114.e(r40.getChangingConfigurations());
        float r43 = r40.getFloat(2, 0.0f);
        r114.e(r40.getChangingConfigurations());
        float r44 = r114.b(r40, "scaleX", 3, 1.0f);
        float r45 = r114.b(r40, "scaleY", 4, 1.0f);
        float r46 = r114.b(r40, "translateX", 6, 0.0f);
        float r47 = r114.b(r40, "translateY", 7, 0.0f);
        String r49 = r40.getString(0);
        r114.e(r40.getChangingConfigurations());
        if (r49 != null) goto L101;
        String r410 = "";
    L102:
        r40.recycle();
        int r54 = c45.a;
        r119.add(new ew1(r410, r41, r42, r43, r44, r45, r46, r47, r48, 512));
        int[] r55 = (int[]) r114.d;
        if (r55 != null) goto L106;
        r55 = new int[4];
        r114.d = r55;
    L108:
        int r56 = r114.b;
        r114.b = r56 + 1;
        r55[r56] = r36;
    L85:
        r36 = 0;
        goto L194
    L106:
        if (r114.b < r55.length) goto L108;
        r55 = Arrays.copyOf(r55, r55.length * 2);
        r114.d = r55;
        goto L108
    L101:
        r410 = r49;
        goto L102
    L110:
        if (r38.equals("path") == false) goto L194;
        TypedArray r57 = gi1.O(r3, r16, r113, gh0.c);
        r114.e(r57.getChangingConfigurations());
        if (r33.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L178;
        String r58 = r57.getString(0);
        r114.e(r57.getChangingConfigurations());
        if (r58 != null) goto L118;
        String r59 = "";
    L119:
        String r60 = r57.getString(2);
        r114.e(r57.getChangingConfigurations());
        if (r60 != null) goto L123;
        int r61 = c45.a;
    L122:
        List r510 = r48;
        ue1 r62 = gi1.s(r57, (XmlPullParser) r114.c, r16, "fillColor", 1);
        r114.e(r57.getChangingConfigurations());
        float r63 = r114.b(r57, "fillAlpha", 12, 1.0f);
        if (gi1.u((XmlPullParser) r114.c, "strokeLineCap") == true) goto L127;
        int r64 = -1;
    L128:
        r114.e(r57.getChangingConfigurations());
        if (r64 != 0) goto L131;
    L134:
        int r65 = 0;
    L138:
        if (gi1.u((XmlPullParser) r114.c, "strokeLineJoin") == true) goto L140;
        int r66 = -1;
    L141:
        r114.e(r57.getChangingConfigurations());
        if (r66 == 0) goto L147;
        if (r66 != 1) goto L146;
        int r67 = 1;
    L151:
        float r68 = r114.b(r57, "strokeMiterLimit", 10, 4.0f);
        ue1 r69 = gi1.s(r57, (XmlPullParser) r114.c, r16, "strokeColor", 3);
        r114.e(r57.getChangingConfigurations());
        float r610 = r114.b(r57, "strokeAlpha", 11, 1.0f);
        float r611 = r114.b(r57, "strokeWidth", 4, 1.0f);
        float r612 = r114.b(r57, "trimPathEnd", 6, 1.0f);
        float r613 = r114.b(r57, "trimPathOffset", 7, 0.0f);
        float r614 = r114.b(r57, "trimPathStart", 5, 0.0f);
        if (gi1.u((XmlPullParser) r114.c, "fillType") == true) goto L154;
        int r211 = 0;
    L155:
        r114.e(r57.getChangingConfigurations());
        r57.recycle();
        Shader r72 = (Shader) r62.p;
        if (r72 == null) goto L159;
    L160:
        if (r72 == null) goto L162;
        uo r511 = new pv(r72);
    L164:
        Shader r73 = (Shader) r69.p;
        if (r73 == null) goto L168;
    L169:
        if (r73 == null) goto L172;
        uo r74 = new pv(r73);
    L171:
        uo r615 = r74;
    L174:
        if (r211 != 0) goto L176;
        int r512 = 0;
    L177:
        ((ew1) r119.get(r119.size() - 1)).j.add(new f45(r59, r510, r512, r511, r63, r615, r610, r611, r65, r67, r68, r614, r612, r613));
        goto L194
    L176:
        r512 = 1;
        goto L177
    L172:
        r74 = new zh4(e35.b(r69.o));
        goto L171
    L168:
        if (r69.o != 0) goto L169;
        r615 = null;
        goto L174
    L162:
        r511 = new zh4(e35.b(r62.o));
        goto L164
    L159:
        if (r62.o != 0) goto L160;
        r511 = null;
        goto L164
    L154:
        r211 = r57.getInt(13, 0);
        goto L155
    L146:
        if (r66 != 2) goto L147;
        r67 = 2;
    L147:
        r67 = 0;
        goto L151
    L140:
        r66 = r57.getInt(9, -1);
        goto L141
    L131:
        if (r64 != 1) goto L133;
        r65 = 1;
        goto L138
    L133:
        if (r64 != 2) goto L134;
        r65 = 2;
        goto L138
    L127:
        r64 = r57.getInt(8, -1);
        goto L128
    L123:
        r48 = pz1.A(r34, r60);
        goto L122
    L118:
        r59 = r58;
        goto L119
    L178:
        kf2.n("No path data available");
        return null;
    L181:
        if (r38.equals("clip-path") == false) goto L194;
        TypedArray r75 = gi1.O(r3, r16, r113, gh0.d);
        r114.e(r75.getChangingConfigurations());
        String r76 = r75.getString(0);
        r114.e(r75.getChangingConfigurations());
        if (r76 != null) goto L187;
        String r513 = "";
    L188:
        String r77 = r75.getString(1);
        r114.e(r75.getChangingConfigurations());
        if (r77 != null) goto L192;
        int r78 = c45.a;
    L191:
        List r616 = r48;
        r75.recycle();
        r119.add(new ew1(r513, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, r616, 512));
        r36 = r36 + 1;
        goto L194
    L192:
        r48 = pz1.A(r34, r77);
        goto L191
    L187:
        r513 = r76;
        goto L188
    L69:
        if (r37 != 3) goto L82;
        if ("group".equals(r33.getName()) == false) goto L82;
        int r79 = r36 + 1;
        int r80 = 0;
    L74:
        if (r80 >= r79) goto L76;
        ew1 r81 = (ew1) r119.remove(r119.size() - 1);
        ((ew1) r119.get(r119.size() - 1)).j.add(new b45(r81.a, r81.b, r81.c, r81.d, r81.e, r81.f, r81.g, r81.h, r81.i, r81.j));
        r80 = r80 + 1;
        r79 = r79;
        goto L74
    L76:
        int[] r82 = (int[]) r114.d;
        if (r82 == null) goto L84;
        int r83 = r114.b;
        if (r83 == 0) goto L84;
        int r84 = r83 - 1;
        r114.b = r84;
        r36 = r82[r84];
    L84:
        r53 = r32;
        goto L85
    L64:
        if (r20.getEventType() != r23) goto L66;
    L65:
        int r514 = r31;
        float r515 = r32;
        int r85 = r17 | r114.a;
    L197:
        if (r119.size() <= 1) goto L199;
        ew1 r86 = (ew1) r119.remove(r119.size() - 1);
        ((ew1) r119.get(r119.size() - 1)).j.add(new b45(r86.a, r86.b, r86.c, r86.d, r86.e, r86.f, r86.g, r86.h, r86.i, r86.j));
        goto L197
    L199:
        r111 = new gw1(new fw1("", r210, r515, r24, r25, new b45(r35.a, r35.b, r35.c, r35.d, r35.e, r35.f, r35.g, r35.h, r35.i, r35.j), r28, r514, r30), r85);
        r18.a.put(r19, new WeakReference(r111));
    L209:
        fw1 r87 = r111.a;
        oo0 r88 = (oo0) r71.i(g90.h);
        float r89 = r87.j;
        float r90 = r88.g();
        long r91 = Float.floatToRawIntBits(r89);
        long r92 = (((long) Float.floatToRawIntBits(r90)) & r115) | (r91 << r116);
        Object r93 = r71.z();
        if ((r93 instanceof Long) == true) goto L212;
    L214:
        r71.c0(Long.valueOf(r92));
        boolean r94 = true;
    L215:
        Object r95 = r71.H();
        if (r94 == false) goto L218;
    L219:
        gk1 r96 = new gk1();
        gb.q(r96, r87.f);
        float r97 = r87.b;
        float r98 = r87.c;
        float r99 = r88.M(r97);
        float r100 = r88.M(r98);
        long r101 = (Float.floatToRawIntBits(r99) << r116) | (((long) Float.floatToRawIntBits(r100)) & r115);
        float r102 = r87.d;
        float r103 = r87.e;
        if (Float.isNaN(r102) == false) goto L223;
        r102 = Float.intBitsToFloat((int) (r101 >> r116));
    L223:
        if (Float.isNaN(r103) == false) goto L225;
        r103 = Float.intBitsToFloat((int) (r101 & r115));
    L225:
        long r104 = (Float.floatToRawIntBits(r102) << r116) | (Float.floatToRawIntBits(r103) & r115);
        e45 r105 = new e45(r96);
        String r106 = r87.a;
        long r107 = r87.g;
        int r120 = r87.h;
        if (r107 == 16) goto L228;
        dt r121 = new dt(r120, r107);
    L229:
        boolean r108 = r87.i;
        r105.e.setValue(new qf4(r101));
        r105.f.setValue(Boolean.valueOf(r108));
        n35 r109 = r105.g;
        r109.g.setValue(r121);
        r109.i.setValue(new qf4(r104));
        r109.c = r106;
        r71.b0(r105);
        r95 = r105;
    L230:
        e45 r122 = (e45) r95;
        r71.o(false);
        return r122;
    L228:
        r121 = r117;
        goto L229
    L218:
        if (r95 != j80.a) goto L230;
    L212:
        if (r92 != ((Number) r93).longValue()) goto L214;
        r94 = false;
        goto L215
    L54:
        r31 = 14;
        goto L58
    L55:
        r31 = 13;
        goto L58
    L263:
        r31 = 5;
        goto L58
    L56:
        r31 = 9;
        goto L58
    L262:
        r31 = 5;
        goto L58
    L57:
        r31 = 3;
        goto L58
    L52:
        r31 = 5;
        goto L58
    L41:
        ColorStateList r123 = gi1.r(r22, r20, r16);
        r114.e(r22.getChangingConfigurations());
        if (r123 == null) goto L44;
        r28 = e35.b(r123.getDefaultColor());
        goto L46
    L44:
        r28 = x40.g;
        goto L46
    L45:
        r28 = x40.g;
        goto L46
    L201:
        throw new XmlPullParserException(r22.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
    L203:
        throw new XmlPullParserException(r22.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
    L31:
        r30 = r22.getBoolean(5, false);
        goto L32
    L204:
        kf2.n("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
        return null;
    L207:
        throw new XmlPullParserException("No start tag found");
    L208:
        r115 = 4294967295L;
        r116 = ' ';
        r117 = null;
        goto L209
    L18:
        r111 = null;
    L8:
        th = move-exception;
        throw th;
    }

    public static e20 y(String r18) {
        XmlPullParser r0 = XmlPullParserFactory.newInstance().newPullParser();
        r0.setInput(new StringReader(r18));
        r0.next();
        if (te5.D(r0, "x:xmpmeta") == false) goto L44;
        vw1 r2 = yw1.o;
        gy3 r3 = gy3.r;
        long r6 = -9223372036854775807L;
    L5:
        r0.next();
        if (te5.D(r0, "rdf:Description") == false) goto L31;
        int r4 = 0;
        int r7 = 0;
    L9:
        if (r7 >= 4) goto L40;
        String r8 = te5.t(r0, c[r7]);
        if (r8 != null) goto L13;
        r7 = r7 + 1;
        goto L9
    L13:
        if (Integer.parseInt(r8) != 1) goto L40;
        int r9 = 0;
    L15:
        if (r9 >= 4) goto L20;
        String r10 = te5.t(r0, d[r9]);
        if (r10 != null) goto L18;
        r9 = r9 + 1;
        goto L15
    L18:
        r6 = Long.parseLong(r10);
        if (r6 == (-1)) goto L20;
    L23:
        if (r4 >= 2) goto L28;
        String r11 = te5.t(r0, e[r4]);
        if (r11 != null) goto L26;
        r4 = r4 + 1;
        goto L23
    L26:
        r3 = yw1.p(new wx2(0, 0, "image/jpeg"), new wx2(Long.parseLong(r11), 0, "video/mp4"));
    L37:
        if (te5.C(r0, "x:xmpmeta") == false) goto L5;
        if (r3.isEmpty() == true) goto L40;
        return new e20(r6, r3, 3);
    L28:
        vw1 r5 = yw1.o;
        r3 = gy3.r;
    L20:
        r6 = -9223372036854775807L;
    L40:
        return null;
    L31:
        if (te5.D(r0, "Container:Directory") == false) goto L34;
        r3 = z(r0, "Container", "Item");
        goto L37
    L34:
        if (te5.D(r0, "GContainer:Directory") == false) goto L37;
        r3 = z(r0, "GContainer", "GContainerItem");
        goto L37
    L44:
        throw ParserException.a(null, "Couldn't find xmp metadata");
    }

    public static gy3 z(XmlPullParser r12, String r13, String r14) {
        uw1 r0 = yw1.j();
        String r1 = r13.concat(":Item");
        String r15 = r13.concat(":Directory");
    L3:
        r12.next();
        if (te5.D(r12, r1) == false) goto L19;
        String r2 = r14.concat(":Mime");
        String r3 = r14.concat(":Semantic");
        String r4 = r14.concat(":Length");
        String r5 = r14.concat(":Padding");
        String r11 = te5.t(r12, r2);
        String r6 = te5.t(r12, r3);
        String r7 = te5.t(r12, r4);
        String r8 = te5.t(r12, r5);
        if (r11 == null) goto L17;
        if (r6 == null) goto L17;
        long r9 = 0;
        if (r7 == null) goto L12;
        long r10 = Long.parseLong(r7);
    L13:
        if (r8 == null) goto L15;
        r9 = Long.parseLong(r8);
    L15:
        r0.c(new wx2(r10, r9, r11));
        goto L19
    L12:
        r10 = 0;
    L17:
        return gy3.r;
    L19:
        if (te5.C(r12, r15) == false) goto L3;
        return r0.f();
    }

    public abstract void u(Throwable r1);

    public abstract void v(na4 r1);
}
