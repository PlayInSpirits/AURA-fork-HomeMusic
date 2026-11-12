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
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
    public static final vd0[] a = new vd0[0];
    public static final yr0 b = new yr0();
    public static final String[] c = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] d = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] e = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static boolean f;
    public static boolean g;

    public static int A(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iU = g12.U(obj);
        int i2 = iU & i;
        int iB = B(i2, obj3);
        if (iB != 0) {
            int i3 = ~i;
            int i4 = iU & i3;
            int i5 = -1;
            while (true) {
                int i6 = iB - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && si0.s(obj, objArr[i6]) && (objArr2 == null || si0.s(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        C(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = s(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iB = i9;
            }
        }
        return -1;
    }

    public static int B(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void C(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int D(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static byte[] E(oh0 oh0Var) {
        oh0Var.getClass();
        HashMap map = oh0Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    F(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            cx.f().e(ki0.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void F(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                kf2.l(kx3.a(obj.getClass()).c(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            i30 i30VarA = kx3.a(objArr.getClass());
            if (i30VarA.equals(kx3.a(Boolean[].class))) {
                i = 8;
            } else if (i30VarA.equals(kx3.a(Byte[].class))) {
                i = 9;
            } else if (i30VarA.equals(kx3.a(Integer[].class))) {
                i = 10;
            } else if (i30VarA.equals(kx3.a(Long[].class))) {
                i = 11;
            } else if (i30VarA.equals(kx3.a(Float[].class))) {
                i = 12;
            } else if (i30VarA.equals(kx3.a(Double[].class))) {
                i = 13;
            } else {
                if (!i30VarA.equals(kx3.a(String[].class))) {
                    kf2.l(kx3.a(objArr.getClass()).b(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    public static sp2 G(MediaRoute2Info mediaRoute2Info) {
        int i;
        if (mediaRoute2Info != null) {
            ss0 ss0Var = new ss0(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            Bundle bundle = (Bundle) ss0Var.n;
            bundle.putInt("connectionState", mediaRoute2Info.getConnectionState());
            bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle.putBundle("extras", null);
            } else {
                bundle.putBundle("extras", new Bundle(extras));
            }
            bundle.putBoolean("enabled", true);
            bundle.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(a3.g(mediaRoute2Info)));
                int iJ = a3.j(mediaRoute2Info);
                i = 2;
                if (iJ == 2) {
                    i = 12;
                } else if (iJ == 3) {
                    i = 13;
                } else if (iJ == 4) {
                    i = 14;
                } else if (iJ == 22) {
                    i = 20;
                } else if (iJ == 23) {
                    i = 21;
                } else if (iJ == 26) {
                    i = 22;
                } else if (iJ == 29) {
                    i = 24;
                } else if (iJ != 2000) {
                    switch (iJ) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (iJ) {
                                case 1001:
                                    i = 1;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i = 1000;
                }
            } else {
                i = 0;
            }
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle2 == null) {
                    bundle.putBundle("extras", null);
                } else {
                    bundle.putBundle("extras", new Bundle(bundle2));
                }
                if (i == 0) {
                    i = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                }
                bundle.putInt("deviceType", i);
                bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                    ss0Var.n(parcelableArrayList);
                }
                List features = mediaRoute2Info.getFeatures();
                if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
                    bundle.putBoolean("isDynamicGroupRoute", true);
                }
                if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK")) {
                    ArrayList<String> stringArrayList = extras2.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS");
                    if (stringArrayList == null || stringArrayList.isEmpty()) {
                        Log.w("MediaRouter2Utils", "Invalid feature of a group without members");
                    } else {
                        ss0Var.p(stringArrayList);
                    }
                }
                return ss0Var.r();
            }
        }
        return null;
    }

    public static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final so0 a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        bb1 bb1VarA = cb1.a(f2);
        if (bb1VarA == null) {
            bb1VarA = new ua2(f2);
        }
        return new so0(f3, f2, bb1VarA);
    }

    public static final void b(Object obj, if1 if1Var, rg1 rg1Var) {
        boolean zE = rg1Var.e(obj);
        Object objH = rg1Var.H();
        if (zE || objH == j80.a) {
            objH = new wr0(if1Var);
            rg1Var.b0(objH);
        }
    }

    public static final void c(wf1 wf1Var, rg1 rg1Var, Object obj) {
        ne0 ne0Var = rg1Var.R;
        boolean zE = rg1Var.e(obj);
        Object objH = rg1Var.H();
        if (zE || objH == j80.a) {
            objH = new l62(ne0Var, wf1Var);
            rg1Var.b0(objH);
        }
    }

    public static final wv3 d(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new wv3(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void e(jx3 jx3Var, vb4 vb4Var, Preference preference, jx3 jx3Var2) {
        String strS;
        boolean z = false;
        boolean z2 = jx3Var.n != null;
        f = z2;
        Preference preferenceH0 = vb4Var.h0("homemusic_check_update");
        boolean z3 = preferenceH0 != null && preferenceH0.K;
        if (z2 && z3) {
            z = true;
        }
        preference.A(z);
        String str = (String) jx3Var2.n;
        if (str == null || (strS = vb4Var.t(app.homemusic.R.string.homemusic_settings_google_on, str)) == null) {
            strS = vb4Var.s(app.homemusic.R.string.homemusic_settings_google_off);
            strS.getClass();
        }
        preference.x(strS);
    }

    public static final void f(vb4 vb4Var, String str) {
        if (vb4Var.y()) {
            Toast.makeText(vb4Var.Z(), str, 0).show();
        }
    }

    public static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            kf2.n(f34.f(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static x65 h(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (x65) objNewInstance;
            } catch (IllegalAccessException e2) {
                nz2.r("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                nz2.r("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            nz2.r("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final Object i(yn3 yn3Var, String str, wd0 wd0Var) {
        Object objB = yn3Var.b(str, new o54(20), wd0Var);
        return objB == xe0.n ? objB : j15.a;
    }

    public static final void j(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        if (s != -21521) {
            nz2.f(f34.f(s, "Magic number doesn't match: "));
            return;
        }
        short s2 = dataInputStream.readShort();
        if (s2 == 1) {
            return;
        }
        nz2.f(f34.f(s2, "Unsupported version number: "));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable k(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b2 == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b2 != 14) {
            kf2.o(f34.f(b2, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (h12.c(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    public static hg3 l(View view) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return new hg3(6, r50.d(view));
    }

    public static final String m(Context context) {
        PackageInfo packageInfo;
        String strValueOf;
        PackageInfo packageInfo2 = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("BugReportUtil", "We tried to get versionName but Android wouldn't let us.", e2);
            packageInfo = null;
        }
        String strConcat = "\nApp version name   : ".concat(packageInfo != null ? String.valueOf(packageInfo.versionName) : "Unknown");
        try {
            packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("BugReportUtil", "We tried to get versionCode but Android wouldn't let us.", e3);
        }
        if (packageInfo2 != null) {
            strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo2.getLongVersionCode()) : String.valueOf(packageInfo2.versionCode);
        } else {
            strValueOf = "Unkown";
        }
        String strO = b11.o(strConcat, "\nApp version code   : ", strValueOf);
        String str = Build.VERSION.RELEASE;
        str.getClass();
        String str2 = (strO + "\nAndroid OS version : " + str) + "\nAndroid SDK version: " + Build.VERSION.SDK_INT;
        String str3 = Build.BRAND;
        str3.getClass();
        String str4 = str2 + "\nDevice Brand       : " + str3;
        String str5 = Build.MANUFACTURER;
        str5.getClass();
        String str6 = str4 + "\nDevice Manufacturer: " + str5;
        String str7 = Build.DEVICE;
        str7.getClass();
        String str8 = str6 + "\nDevice Name        : " + str7;
        String str9 = Build.MODEL;
        str9.getClass();
        String str10 = str8 + "\nDevice Model       : " + str9;
        String string = Arrays.toString(Build.SUPPORTED_ABIS);
        string.getClass();
        String str11 = str10 + "\n" + string;
        String packageName = context.getPackageName();
        packageName.getClass();
        return str11 + "\n" + packageName;
    }

    public static String n(Class cls) {
        LinkedHashMap linkedHashMap = u43.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            s43 s43Var = (s43) cls.getAnnotation(s43.class);
            strValue = s43Var != null ? s43Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                kf2.e("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final Object o(e94 e94Var, p94 p94Var) {
        Object objG = e94Var.n.g(p94Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static ArrayList p(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoG = l3.g(it.next());
            if (mediaRoute2InfoG != null) {
                arrayList.add(mediaRoute2InfoG.getId());
            }
        }
        return arrayList;
    }

    public static final boolean q(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static ry r(ne0 ne0Var, wf1 wf1Var) {
        ne0Var.getClass();
        return vr1.v(new eg0(ne0Var, ze0.n, wf1Var, 4));
    }

    public static int s(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int t(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static dx2 w(dx2 dx2Var, hd3 hd3Var, hs hsVar, i80 i80Var, float f2, dt dtVar) {
        return dx2Var.c(new id3(hd3Var, hsVar, i80Var, f2, dtVar));
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x043e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0443  */
    /* JADX WARN: Code duplicated, block: B:160:0x045f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0461  */
    /* JADX WARN: Code duplicated, block: B:162:0x0469  */
    /* JADX WARN: Code duplicated, block: B:169:0x0484 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0486  */
    /* JADX WARN: Code duplicated, block: B:172:0x048e  */
    /* JADX WARN: Code duplicated, block: B:175:0x049e  */
    /* JADX WARN: Code duplicated, block: B:176:0x04a1  */
    public static final hd3 x(int i, rg1 rg1Var) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        long j;
        char c2;
        dt dtVar;
        boolean z;
        long jB;
        int i2;
        float f2;
        int i3;
        int i4;
        ue1 ue1VarS;
        int i5;
        Shader shader;
        uo zh4Var;
        Shader shader2;
        uo zh4Var2;
        uo uoVar;
        int i6;
        int i7;
        Context context = (Context) rg1Var.i(hb.b);
        Resources resources = (Resources) rg1Var.i(hb.c);
        z04 z04Var = (z04) rg1Var.i(hb.e);
        synchronized (z04Var) {
            typedValue = (TypedValue) z04Var.a.b(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                i03 i03Var = z04Var.a;
                int iD = i03Var.d(i);
                Object[] objArr = i03Var.c;
                Object obj = objArr[iD];
                i03Var.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        boolean z2 = false;
        if (charSequence == null || !qm4.p0(charSequence, ".xml")) {
            rg1Var.R(-1771643000);
            boolean zE = rg1Var.e(context.getTheme()) | rg1Var.e(charSequence) | rg1Var.d(i);
            Object objH = rg1Var.H();
            if (zE || objH == j80.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objH = new cc(((BitmapDrawable) drawable).getBitmap());
                    rg1Var.b0(objH);
                } catch (Exception e2) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            cc ccVar = (cc) objH;
            ys ysVar = new ys(ccVar, (((long) ccVar.a.getHeight()) & 4294967295L) | (((long) ccVar.a.getWidth()) << 32));
            rg1Var.o(false);
            return ysVar;
        }
        rg1Var.R(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i8 = typedValue.changingConfigurations;
        iw1 iw1Var = (iw1) rg1Var.i(hb.d);
        hw1 hw1Var = new hw1(theme, i);
        WeakReference weakReference = (WeakReference) iw1Var.a.get(hw1Var);
        gw1 gw1Var = weakReference != null ? (gw1) weakReference.get() : null;
        if (gw1Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!h12.c(xml.getName(), "vector")) {
                kf2.n("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            fd fdVar = new fd();
            fdVar.c = xml;
            fdVar.a = 0;
            j = 4294967295L;
            pz1 pz1Var = new pz1(10, z2);
            c2 = ' ';
            pz1Var.o = new float[64];
            fdVar.e = pz1Var;
            TypedArray typedArrayO = gi1.O(resources, theme, attributeSetAsAttributeSet, gh0.a);
            fdVar.e(typedArrayO.getChangingConfigurations());
            dtVar = null;
            boolean z3 = !gi1.u(xml, "autoMirrored") ? false : typedArrayO.getBoolean(5, false);
            fdVar.e(typedArrayO.getChangingConfigurations());
            float fB = fdVar.b(typedArrayO, "viewportWidth", 7, 0.0f);
            float fB2 = fdVar.b(typedArrayO, "viewportHeight", 8, 0.0f);
            if (fB <= 0.0f) {
                throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fB2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayO.getDimension(3, 0.0f);
            fdVar.e(typedArrayO.getChangingConfigurations());
            float dimension2 = typedArrayO.getDimension(2, 0.0f);
            fdVar.e(typedArrayO.getChangingConfigurations());
            if (typedArrayO.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayO.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jB = x40.g;
                } else {
                    ColorStateList colorStateListR = gi1.r(typedArrayO, xml, theme);
                    fdVar.e(typedArrayO.getChangingConfigurations());
                    jB = colorStateListR != null ? e35.b(colorStateListR.getDefaultColor()) : x40.g;
                }
            } else {
                jB = x40.g;
            }
            int i9 = typedArrayO.getInt(6, -1);
            fdVar.e(typedArrayO.getChangingConfigurations());
            if (i9 == -1) {
                i2 = 5;
            } else if (i9 == 3) {
                i2 = 3;
            } else if (i9 == 5) {
                i2 = 5;
            } else if (i9 != 9) {
                switch (i9) {
                    case 14:
                        i2 = 13;
                        break;
                    case 15:
                        i2 = 14;
                        break;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        i2 = 12;
                        break;
                    default:
                        i2 = 5;
                        break;
                }
            } else {
                i2 = 9;
            }
            float f3 = dimension / resources.getDisplayMetrics().density;
            float f4 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayO.recycle();
            ArrayList arrayList = new ArrayList();
            ew1 ew1Var = new ew1(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            arrayList.add(ew1Var);
            int i10 = 0;
            for (int i11 = 3; xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i11); i11 = 3) {
                List listA = u01.n;
                XmlPullParser xmlPullParser = (XmlPullParser) fdVar.c;
                XmlResourceParser xmlResourceParser = xml;
                pz1 pz1Var2 = (pz1) fdVar.e;
                int i12 = i8;
                int eventType = xmlPullParser.getEventType();
                int i13 = i2;
                if (eventType != 2) {
                    if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                        int i14 = 0;
                        for (int i15 = i10 + 1; i14 < i15; i15 = i15) {
                            ew1 ew1Var2 = (ew1) arrayList.remove(arrayList.size() - 1);
                            ((ew1) arrayList.get(arrayList.size() - 1)).j.add(new b45(ew1Var2.a, ew1Var2.b, ew1Var2.c, ew1Var2.d, ew1Var2.e, ew1Var2.f, ew1Var2.g, ew1Var2.h, ew1Var2.i, ew1Var2.j));
                            i14++;
                        }
                        int[] iArr = (int[]) fdVar.d;
                        if (iArr == null || (i7 = fdVar.b) == 0) {
                            f2 = f4;
                            i10 = 0;
                        } else {
                            int i16 = i7 - 1;
                            fdVar.b = i16;
                            i10 = iArr[i16];
                        }
                    }
                    f2 = f4;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        f2 = f4;
                        if (iHashCode != -1649314686) {
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayO2 = gi1.O(resources, theme, attributeSetAsAttributeSet, gh0.b);
                                    fdVar.e(typedArrayO2.getChangingConfigurations());
                                    float fB3 = fdVar.b(typedArrayO2, "rotation", 5, 0.0f);
                                    float f5 = typedArrayO2.getFloat(1, 0.0f);
                                    fdVar.e(typedArrayO2.getChangingConfigurations());
                                    float f6 = typedArrayO2.getFloat(2, 0.0f);
                                    fdVar.e(typedArrayO2.getChangingConfigurations());
                                    float fB4 = fdVar.b(typedArrayO2, "scaleX", 3, 1.0f);
                                    float fB5 = fdVar.b(typedArrayO2, "scaleY", 4, 1.0f);
                                    float fB6 = fdVar.b(typedArrayO2, "translateX", 6, 0.0f);
                                    float fB7 = fdVar.b(typedArrayO2, "translateY", 7, 0.0f);
                                    String string = typedArrayO2.getString(0);
                                    fdVar.e(typedArrayO2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayO2.recycle();
                                    int i17 = c45.a;
                                    arrayList.add(new ew1(str, fB3, f5, f6, fB4, fB5, fB6, fB7, listA, 512));
                                    int[] iArrCopyOf = (int[]) fdVar.d;
                                    if (iArrCopyOf == null) {
                                        iArrCopyOf = new int[4];
                                        fdVar.d = iArrCopyOf;
                                    } else if (fdVar.b >= iArrCopyOf.length) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                        fdVar.d = iArrCopyOf;
                                    }
                                    int i18 = fdVar.b;
                                    fdVar.b = i18 + 1;
                                    iArrCopyOf[i18] = i10;
                                    i10 = 0;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayO3 = gi1.O(resources, theme, attributeSetAsAttributeSet, gh0.c);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    kf2.n("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayO3.getString(0);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayO3.getString(2);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i19 = c45.a;
                                } else {
                                    listA = pz1.A(pz1Var2, string3);
                                }
                                List list = listA;
                                ue1 ue1VarS2 = gi1.s(typedArrayO3, (XmlPullParser) fdVar.c, theme, "fillColor", 1);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                float fB8 = fdVar.b(typedArrayO3, "fillAlpha", 12, 1.0f);
                                int i20 = !gi1.u((XmlPullParser) fdVar.c, "strokeLineCap") ? -1 : typedArrayO3.getInt(8, -1);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                if (i20 == 0) {
                                    i3 = 0;
                                } else if (i20 == 1) {
                                    i3 = 1;
                                } else if (i20 != 2) {
                                    i3 = 0;
                                } else {
                                    i3 = 2;
                                }
                                int i21 = !gi1.u((XmlPullParser) fdVar.c, "strokeLineJoin") ? -1 : typedArrayO3.getInt(9, -1);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                if (i21 != 0) {
                                    if (i21 == 1) {
                                        i4 = 1;
                                    } else if (i21 == 2) {
                                        i4 = 2;
                                    }
                                    float fB9 = fdVar.b(typedArrayO3, "strokeMiterLimit", 10, 4.0f);
                                    ue1VarS = gi1.s(typedArrayO3, (XmlPullParser) fdVar.c, theme, "strokeColor", 3);
                                    fdVar.e(typedArrayO3.getChangingConfigurations());
                                    float fB10 = fdVar.b(typedArrayO3, "strokeAlpha", 11, 1.0f);
                                    float fB11 = fdVar.b(typedArrayO3, "strokeWidth", 4, 1.0f);
                                    float fB12 = fdVar.b(typedArrayO3, "trimPathEnd", 6, 1.0f);
                                    float fB13 = fdVar.b(typedArrayO3, "trimPathOffset", 7, 0.0f);
                                    float fB14 = fdVar.b(typedArrayO3, "trimPathStart", 5, 0.0f);
                                    if (gi1.u((XmlPullParser) fdVar.c, "fillType")) {
                                        i5 = typedArrayO3.getInt(13, 0);
                                    } else {
                                        i5 = 0;
                                    }
                                    fdVar.e(typedArrayO3.getChangingConfigurations());
                                    typedArrayO3.recycle();
                                    shader = (Shader) ue1VarS2.p;
                                    if (shader == null && ue1VarS2.o == 0) {
                                        zh4Var = null;
                                    } else if (shader != null) {
                                        zh4Var = new pv(shader);
                                    } else {
                                        zh4Var = new zh4(e35.b(ue1VarS2.o));
                                    }
                                    shader2 = (Shader) ue1VarS.p;
                                    if (shader2 != null && ue1VarS.o == 0) {
                                        uoVar = null;
                                    } else {
                                        if (shader2 != null) {
                                            zh4Var2 = new pv(shader2);
                                        } else {
                                            zh4Var2 = new zh4(e35.b(ue1VarS.o));
                                        }
                                        uoVar = zh4Var2;
                                    }
                                    if (i5 == 0) {
                                        i6 = 0;
                                    } else {
                                        i6 = 1;
                                    }
                                    ((ew1) arrayList.get(arrayList.size() - 1)).j.add(new f45(str2, list, i6, zh4Var, fB8, uoVar, fB10, fB11, i3, i4, fB9, fB14, fB12, fB13));
                                }
                                i4 = 0;
                                float fB15 = fdVar.b(typedArrayO3, "strokeMiterLimit", 10, 4.0f);
                                ue1VarS = gi1.s(typedArrayO3, (XmlPullParser) fdVar.c, theme, "strokeColor", 3);
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                float fB16 = fdVar.b(typedArrayO3, "strokeAlpha", 11, 1.0f);
                                float fB17 = fdVar.b(typedArrayO3, "strokeWidth", 4, 1.0f);
                                float fB18 = fdVar.b(typedArrayO3, "trimPathEnd", 6, 1.0f);
                                float fB19 = fdVar.b(typedArrayO3, "trimPathOffset", 7, 0.0f);
                                float fB110 = fdVar.b(typedArrayO3, "trimPathStart", 5, 0.0f);
                                if (gi1.u((XmlPullParser) fdVar.c, "fillType")) {
                                    i5 = 0;
                                } else {
                                    i5 = typedArrayO3.getInt(13, 0);
                                }
                                fdVar.e(typedArrayO3.getChangingConfigurations());
                                typedArrayO3.recycle();
                                shader = (Shader) ue1VarS2.p;
                                if (shader == null) {
                                    zh4Var = null;
                                } else if (shader != null) {
                                    zh4Var = new pv(shader);
                                } else {
                                    zh4Var = new zh4(e35.b(ue1VarS2.o));
                                }
                                shader2 = (Shader) ue1VarS.p;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        zh4Var2 = new pv(shader2);
                                    } else {
                                        zh4Var2 = new zh4(e35.b(ue1VarS.o));
                                    }
                                    uoVar = zh4Var2;
                                } else {
                                    uoVar = null;
                                }
                                if (i5 == 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 1;
                                }
                                ((ew1) arrayList.get(arrayList.size() - 1)).j.add(new f45(str2, list, i6, zh4Var, fB8, uoVar, fB16, fB17, i3, i4, fB15, fB110, fB18, fB19));
                            }
                        } else if (name.equals("clip-path")) {
                            TypedArray typedArrayO4 = gi1.O(resources, theme, attributeSetAsAttributeSet, gh0.d);
                            fdVar.e(typedArrayO4.getChangingConfigurations());
                            String string4 = typedArrayO4.getString(0);
                            fdVar.e(typedArrayO4.getChangingConfigurations());
                            String str3 = string4 == null ? "" : string4;
                            String string5 = typedArrayO4.getString(1);
                            fdVar.e(typedArrayO4.getChangingConfigurations());
                            if (string5 == null) {
                                int i22 = c45.a;
                            } else {
                                listA = pz1.A(pz1Var2, string5);
                            }
                            List list2 = listA;
                            typedArrayO4.recycle();
                            arrayList.add(new ew1(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                            i10++;
                        }
                    } else {
                        f2 = f4;
                    }
                }
                xmlResourceParser.next();
                xml = xmlResourceParser;
                i8 = i12;
                i2 = i13;
                f4 = f2;
            }
            int i23 = i2;
            float f7 = f4;
            int i24 = i8 | fdVar.a;
            while (arrayList.size() > 1) {
                ew1 ew1Var3 = (ew1) arrayList.remove(arrayList.size() - 1);
                ((ew1) arrayList.get(arrayList.size() - 1)).j.add(new b45(ew1Var3.a, ew1Var3.b, ew1Var3.c, ew1Var3.d, ew1Var3.e, ew1Var3.f, ew1Var3.g, ew1Var3.h, ew1Var3.i, ew1Var3.j));
            }
            gw1Var = new gw1(new fw1("", f3, f7, fB, fB2, new b45(ew1Var.a, ew1Var.b, ew1Var.c, ew1Var.d, ew1Var.e, ew1Var.f, ew1Var.g, ew1Var.h, ew1Var.i, ew1Var.j), jB, i23, z3), i24);
            iw1Var.a.put(hw1Var, new WeakReference(gw1Var));
        } else {
            j = 4294967295L;
            c2 = ' ';
            dtVar = null;
        }
        fw1 fw1Var = gw1Var.a;
        oo0 oo0Var = (oo0) rg1Var.i(g90.h);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(oo0Var.g())) & j) | (((long) Float.floatToRawIntBits(fw1Var.j)) << c2);
        Object objZ = rg1Var.z();
        if ((objZ instanceof Long) && jFloatToRawIntBits == ((Number) objZ).longValue()) {
            z = false;
        } else {
            rg1Var.c0(Long.valueOf(jFloatToRawIntBits));
            z = true;
        }
        Object objH2 = rg1Var.H();
        if (z || objH2 == j80.a) {
            gk1 gk1Var = new gk1();
            gb.q(gk1Var, fw1Var.f);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(oo0Var.M(fw1Var.b))) << c2) | (((long) Float.floatToRawIntBits(oo0Var.M(fw1Var.c))) & j);
            float fIntBitsToFloat = fw1Var.d;
            float fIntBitsToFloat2 = fw1Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c2));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j));
            }
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & j);
            e45 e45Var = new e45(gk1Var);
            String str4 = fw1Var.a;
            long j2 = fw1Var.g;
            dt dtVar2 = j2 != 16 ? new dt(fw1Var.h, j2) : dtVar;
            boolean z4 = fw1Var.i;
            e45Var.e.setValue(new qf4(jFloatToRawIntBits2));
            e45Var.f.setValue(Boolean.valueOf(z4));
            n35 n35Var = e45Var.g;
            n35Var.g.setValue(dtVar2);
            n35Var.i.setValue(new qf4(jFloatToRawIntBits3));
            n35Var.c = str4;
            rg1Var.b0(e45Var);
            objH2 = e45Var;
        }
        e45 e45Var2 = (e45) objH2;
        rg1Var.o(false);
        return e45Var2;
    }

    public static e20 y(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!te5.D(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        vw1 vw1Var = yw1.o;
        gy3 gy3VarZ = gy3.r;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (te5.D(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strT = te5.t(xmlPullParserNewPullParser, c[i2]);
                    if (strT != null) {
                        if (Integer.parseInt(strT) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strT2 = te5.t(xmlPullParserNewPullParser, d[i3]);
                                if (strT2 != null) {
                                    j = Long.parseLong(strT2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                vw1 vw1Var2 = yw1.o;
                                gy3VarZ = gy3.r;
                                break;
                            }
                            String strT3 = te5.t(xmlPullParserNewPullParser, e[i]);
                            if (strT3 != null) {
                                gy3VarZ = yw1.p(new wx2(0L, 0L, "image/jpeg"), new wx2(Long.parseLong(strT3), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (te5.D(xmlPullParserNewPullParser, "Container:Directory")) {
                gy3VarZ = z(xmlPullParserNewPullParser, "Container", "Item");
            } else if (te5.D(xmlPullParserNewPullParser, "GContainer:Directory")) {
                gy3VarZ = z(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!te5.C(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (gy3VarZ.isEmpty()) {
            break loop0;
        }
        return new e20(j, gy3VarZ, 3);
        return null;
    }

    public static gy3 z(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        uw1 uw1VarJ = yw1.j();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (te5.D(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strT = te5.t(xmlPullParser, strConcat3);
                String strT2 = te5.t(xmlPullParser, strConcat4);
                String strT3 = te5.t(xmlPullParser, strConcat5);
                String strT4 = te5.t(xmlPullParser, strConcat6);
                if (strT == null || strT2 == null) {
                    return gy3.r;
                }
                uw1VarJ.c(new wx2(strT3 != null ? Long.parseLong(strT3) : 0L, strT4 != null ? Long.parseLong(strT4) : 0L, strT));
            }
        } while (!te5.C(xmlPullParser, strConcat2));
        return uw1VarJ.f();
    }

    public abstract void u(Throwable th);

    public abstract void v(na4 na4Var);
}
