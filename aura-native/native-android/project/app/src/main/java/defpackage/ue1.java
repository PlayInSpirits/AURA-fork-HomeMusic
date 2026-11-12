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
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
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
    public static final mj0 r = new mj0(23);
    public final /* synthetic */ int n;
    public int o;
    public Object p;
    public Object q;

    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    public ue1(j02 j02Var, lc3 lc3Var) {
        Object ql0Var;
        this.n = 10;
        ue1 ue1Var = lc3Var.a;
        int i = j02Var.n;
        if (i < 0) {
            fz1.c("negative nearestRange.first");
        }
        int iMin = Math.min(j02Var.o, ue1Var.o - 1);
        if (iMin < i) {
            p03 p03Var = r73.a;
            p03Var.getClass();
            this.p = p03Var;
            this.q = new Object[0];
            this.o = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.q = new Object[i2];
        this.o = i;
        p03 p03Var2 = new p03(i2);
        f13 f13Var = (f13) ue1Var.p;
        if (i < 0 || i >= ue1Var.o) {
            fz1.d("Index " + i + ", size " + ue1Var.o);
        }
        if (iMin < 0 || iMin >= ue1Var.o) {
            fz1.d("Index " + iMin + ", size " + ue1Var.o);
        }
        if (iMin < i) {
            fz1.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iE = su3.e(i, f13Var);
        int i3 = ((f12) f13Var.n[iE]).a;
        while (i3 <= iMin) {
            f12 f12Var = (f12) f13Var.n[iE];
            if1 if1Var = (if1) f12Var.c.n;
            int i4 = f12Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (f12Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (if1Var != null) {
                        ql0Var = if1Var.invoke(Integer.valueOf(iMax - i4));
                        ql0Var = ql0Var == null ? new ql0(iMax) : ql0Var;
                    }
                    p03Var2.g(iMax, ql0Var);
                    ((Object[]) this.q)[iMax - this.o] = ql0Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += f12Var.b;
            iE++;
        }
        this.p = p03Var2;
    }

    public static ue1 g(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = t50.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new ue1((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayO = gi1.O(resources, theme, attributeSetAsAttributeSet, mt3.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayO.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayO.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayO.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayO.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayO.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayO.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayO.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayO.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayO.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayO.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayO.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayO.getFloat(5, 0.0f) : 0.0f;
        typedArrayO.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayO2 = gi1.O(resources, theme, attributeSetAsAttributeSet, mt3.f);
                boolean zHasValue = typedArrayO2.hasValue(0);
                boolean zHasValue2 = typedArrayO2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayO2.getColor(0, 0);
                float f11 = typedArrayO2.getFloat(1, 0.0f);
                typedArrayO2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        gp3 gp3Var = arrayList2.size() > 0 ? new gp3(arrayList2, arrayList) : null;
        if (gp3Var == null) {
            gp3Var = z ? new gp3(color, color2, color3) : new gp3(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) gp3Var.o;
                float[] fArr = (float[]) gp3Var.p;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) gp3Var.o, (float[]) gp3Var.p);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) gp3Var.o;
            float[] fArr2 = (float[]) gp3Var.p;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new ue1(radialGradient, (ColorStateList) null, 0);
    }

    @Override // defpackage.m31
    public void A(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.q).restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.m31
    public void B(byte[] bArr) {
        ((MediaDrm) this.q).closeSession(bArr);
    }

    public List C(CharSequence charSequence) {
        charSequence.getClass();
        si1 si1Var = (si1) this.q;
        si1Var.getClass();
        yj4 yj4Var = new yj4(si1Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (yj4Var.hasNext()) {
            arrayList.add((String) yj4Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.m31
    public void D(final zg5 zg5Var) {
        ((MediaDrm) this.q).setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: te1
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                zk zkVar = ((kk0) zg5Var.n).x;
                zkVar.getClass();
                zkVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public void E(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = xv3.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.p;
            long[] jArr2 = (long[]) this.q;
            int i7 = this.o;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = xv3.b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    @Override // defpackage.m31
    public byte[] H(byte[] bArr, byte[] bArr2) {
        if (ax.c.equals((UUID) this.p) && Build.VERSION.SDK_INT < 27) {
            try {
                String str = f35.a;
                JSONObject jSONObject = new JSONObject(new String(bArr2, StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                String str2 = f35.a;
                l93.G("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(bArr2, StandardCharsets.UTF_8)), e);
            }
        }
        return ((MediaDrm) this.q).provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.m31
    public void N(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.q).provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[LOOP:2: B:27:0x008e->B:35:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x0221  */
    @Override // defpackage.m31
    public k31 O(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        nw0 nw0Var;
        nw0 nw0Var2;
        gc gcVarG;
        int i3;
        byte[] bArrH;
        gc gcVarG2;
        UUID uuid = (UUID) this.p;
        nw0 nw0Var3 = null;
        if (list != null) {
            if (!ax.d.equals(uuid)) {
                nw0Var = (nw0) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        nw0Var = (nw0) list.get(0);
                        break;
                    }
                    nw0Var2 = (nw0) list.get(i2);
                    byte[] bArr3 = nw0Var2.r;
                    bArr3.getClass();
                    gcVarG = te5.G(bArr3);
                    if (gcVarG == null) {
                        i3 = -1;
                    } else {
                        i3 = gcVarG.a;
                    }
                    if (i3 == 1) {
                        nw0Var = nw0Var2;
                        break;
                    }
                    i2++;
                }
            } else {
                nw0 nw0Var4 = (nw0) list.get(0);
                int i4 = 0;
                int length = 0;
                while (true) {
                    if (i4 < list.size()) {
                        nw0 nw0Var5 = (nw0) list.get(i4);
                        byte[] bArr4 = nw0Var5.r;
                        bArr4.getClass();
                        if (Objects.equals(nw0Var5.q, nw0Var4.q) && Objects.equals(nw0Var5.p, nw0Var4.p) && te5.G(bArr4) != null) {
                            length += bArr4.length;
                            i4++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    nw0Var = (nw0) list.get(0);
                                    break;
                                }
                                nw0Var2 = (nw0) list.get(i2);
                                byte[] bArr5 = nw0Var2.r;
                                bArr5.getClass();
                                gcVarG = te5.G(bArr5);
                                if (gcVarG == null) {
                                    i3 = -1;
                                } else {
                                    i3 = gcVarG.a;
                                }
                                if (i3 == 1) {
                                    nw0Var = nw0Var2;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i5 = 0;
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            byte[] bArr7 = ((nw0) list.get(i6)).r;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i5, length2);
                            i5 += length2;
                        }
                        nw0Var = new nw0(nw0Var4.o, nw0Var4.p, nw0Var4.q, bArr6);
                    }
                }
            }
            byte[] bArrD = nw0Var.r;
            bArrD.getClass();
            UUID uuid2 = ax.e;
            if (uuid2.equals(uuid)) {
                byte[] bArrH2 = te5.H(uuid, bArrD);
                if (bArrH2 != null) {
                    bArrD = bArrH2;
                }
                be3 be3Var = new be3(bArrD);
                int iO = be3Var.o();
                short sQ = be3Var.q();
                short sQ2 = be3Var.q();
                if (sQ == 1 && sQ2 == 1) {
                    short sQ3 = be3Var.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strY = be3Var.y(sQ3, charset);
                    if (!strY.contains("<LA_URL>")) {
                        int iIndexOf = strY.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            l93.q0("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strY.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strY.substring(iIndexOf);
                        int i7 = iO + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i7);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i7);
                        byteBufferAllocate.putShort(sQ);
                        byteBufferAllocate.putShort(sQ2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrD = byteBufferAllocate.array();
                    }
                } else {
                    l93.K("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrD = te5.d(uuid2, null, bArrD);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 27 && Objects.equals(uuid, ax.c) && (gcVarG2 = te5.G(bArrD)) != null) {
                bArrD = te5.d(ax.b, (UUID[]) gcVarG2.d, (byte[]) gcVarG2.c);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str3 = Build.MODEL;
                if ((!"AFTB".equals(str3) && !"AFTS".equals(str3) && !"AFTM".equals(str3) && !"AFTT".equals(str3)) || (bArrH = te5.H(uuid, bArrD)) == null) {
                    bArrH = bArrD;
                }
            } else {
                bArrH = bArrD;
            }
            String str4 = nw0Var.q;
            str = (i8 < 26 && ax.c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrH;
            nw0Var3 = nw0Var;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = ((MediaDrm) this.q).getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (ax.c.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            String str5 = f35.a;
            Charset charset2 = StandardCharsets.UTF_8;
            data = new String(data, charset2).replace('+', '-').replace('/', '_').getBytes(charset2);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = ((MediaDrm) this.q).getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && nw0Var3 != null) {
            String str6 = nw0Var3.p;
            if (!TextUtils.isEmpty(str6)) {
                defaultUrl = str6;
            }
        }
        keyRequest.getRequestType();
        return new k31(defaultUrl, data);
    }

    @Override // defpackage.m31
    public int P() {
        return 2;
    }

    @Override // defpackage.m31
    public void Q(byte[] bArr, ik3 ik3Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = (MediaDrm) this.q;
                LogSessionId logSessionIdA = ik3Var.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                hd0.f(playbackComponent).setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused2) {
                l93.q0("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.m31
    public boolean U(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        MediaDrm mediaDrm = (MediaDrm) this.q;
        UUID uuid = (UUID) this.p;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            if (uuid.equals(ax.d)) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(ax.c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, ax.c)) ? uuid : ax.b, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(ax.c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    @Override // defpackage.m31
    public synchronized void a() {
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            ((MediaDrm) this.q).release();
        }
    }

    public void b() {
        la0 la0Var;
        ImageView imageView = (ImageView) this.p;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            aw0.a(drawable);
        }
        if (drawable == null || (la0Var = (la0) this.q) == null) {
            return;
        }
        fg.e(drawable, la0Var, imageView.getDrawableState());
    }

    @Override // defpackage.ps
    public os c(l51 l51Var, long j) {
        long j2;
        long position = l51Var.getPosition();
        int iMin = (int) Math.min(112800L, l51Var.getLength() - position);
        be3 be3Var = (be3) this.q;
        be3Var.K(iMin);
        l51Var.n(be3Var.a, 0, iMin);
        int i = be3Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (be3Var.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = be3Var.a;
            int i2 = be3Var.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jP = au0.P(be3Var, i2, this.o);
            if (jP != j2) {
                long jB = ((iu4) this.p).b(jP);
                if (jB > j) {
                    return j5 == j2 ? new os(-1, jB, position) : new os(0, -9223372036854775807L, position + j4);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new os(0, -9223372036854775807L, position + ((long) i2));
                }
                j4 = i2;
            }
            be3Var.N(i3);
            j3 = i3;
        }
        return j5 != j2 ? new os(-2, j5, position + j3) : os.e;
    }

    public ly3 d(boolean z) {
        ax1 ax1Var;
        ax1 ax1Var2;
        if (z && (ax1Var2 = (ax1) this.q) != null) {
            throw ax1Var2.a();
        }
        ly3 ly3VarG = ly3.g(this.o, (Object[]) this.p, this);
        if (!z || (ax1Var = (ax1) this.q) == null) {
            return ly3VarG;
        }
        throw ax1Var.a();
    }

    @Override // defpackage.m31
    public Map e(byte[] bArr) {
        return ((MediaDrm) this.q).queryKeyStatus(bArr);
    }

    public bx1 f() {
        return d(false);
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        List list = (List) obj;
        tn2 tn2Var = ((ls2) this.q).g;
        Handler handler = tn2Var.l;
        fr2 fr2Var = (fr2) this.p;
        f35.W(handler, new ur2(tn2Var, fr2Var, new ct0(this, this.o, list, fr2Var, 3)));
    }

    public void i(wc0 wc0Var) {
        for (rt2 rt2Var : (CopyOnWriteArrayList) this.q) {
            f35.W(rt2Var.a, new ur2(5, wc0Var, rt2Var.b));
        }
    }

    public f12 j(int i) {
        if (i < 0 || i >= this.o) {
            fz1.d("Index " + i + ", size " + this.o);
        }
        f12 f12Var = (f12) this.q;
        if (f12Var != null) {
            int i2 = f12Var.a;
            if (i < f12Var.b + i2 && i2 <= i) {
                return f12Var;
            }
        }
        f13 f13Var = (f13) this.p;
        f12 f12Var2 = (f12) f13Var.n[su3.e(i, f13Var)];
        this.q = f12Var2;
        return f12Var2;
    }

    @Override // defpackage.ps
    public void k() {
        be3 be3Var = (be3) this.q;
        byte[] bArr = f35.b;
        be3Var.getClass();
        be3Var.L(bArr.length, bArr);
    }

    public Object l(int i) {
        SparseArray sparseArray = (SparseArray) this.p;
        if (this.o == -1) {
            this.o = 0;
        }
        while (true) {
            int i2 = this.o;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.o--;
        }
        while (this.o < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.o + 1)) {
            this.o++;
        }
        return sparseArray.valueAt(this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.p;
        int i9 = this.o;
        int i10 = i9 + 3;
        this.o = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.p = Arrays.copyOf(jArr, iMax);
            this.q = Arrays.copyOf((long[]) this.q, iMax);
        }
        long[] jArr2 = (long[]) this.p;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            cz1.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            cz1.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = xv3.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public boolean n() {
        ColorStateList colorStateList;
        return ((Shader) this.p) == null && (colorStateList = (ColorStateList) this.q) != null && colorStateList.isStateful();
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 13:
                Log.e("SongRepository", "fetchSimilarByArtist.onFailure()", th);
                break;
            default:
                Log.e("SongRepository", "fetchSimilarOnly.onFailure()", th);
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        switch (this.n) {
            case 13:
                List listH = xi4.h((xi4) this.q, response, "similarSongs2");
                Log.d("SongRepository", "fetchSimilarByArtist.onResponse() - similar songs: " + listH.size());
                if (!listH.isEmpty()) {
                    ((wi4) this.p).a(listH.subList(0, Math.min(this.o, listH.size())));
                }
                break;
            default:
                List listH2 = xi4.h((xi4) this.q, response, "similarSongs");
                if (!listH2.isEmpty()) {
                    int iMin = Math.min(this.o, listH2.size());
                    eg0 eg0Var = (eg0) this.p;
                    List<Child> listSubList = listH2.subList(0, iMin);
                    HashSet hashSet = (HashSet) eg0Var.o;
                    List list = (List) eg0Var.p;
                    k03 k03Var = (k03) eg0Var.q;
                    for (Child child : listSubList) {
                        if (!hashSet.contains(child.getId())) {
                            list.add(child);
                            hashSet.add(child.getId());
                        }
                    }
                    k03Var.i(list);
                }
                break;
        }
    }

    @Override // defpackage.m31
    public l31 p() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.q).getProvisionRequest();
        return new l31(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public void q(ed2 ed2Var, int i, int i2, tb1 tb1Var, int i3, Object obj, long j, long j2) {
        i(new pt2(this, ed2Var, new un2(i, i2, tb1Var, i3, obj, f35.i0(j), f35.i0(j2)), 1));
    }

    public void r(ed2 ed2Var, int i, int i2, tb1 tb1Var, int i3, Object obj, long j, long j2) {
        i(new pt2(this, ed2Var, new un2(i, i2, tb1Var, i3, obj, f35.i0(j), f35.i0(j2)), 0));
    }

    public void s(ed2 ed2Var, int i, int i2, tb1 tb1Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        i(new qt2(this, ed2Var, new un2(i, i2, tb1Var, i3, obj, f35.i0(j), f35.i0(j2)), iOException, z));
    }

    public void t(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.p;
        Context context = imageView.getContext();
        int[] iArr = st3.f;
        jv3 jv3VarF = jv3.f(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        j65.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) jv3VarF.o, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = zz1.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                aw0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(jv3VarF.b(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(aw0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            jv3VarF.g();
        }
    }

    public String toString() {
        switch (this.n) {
            case 17:
                StringBuilder sb = new StringBuilder();
                if (((pr3) this.p) == pr3.p) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.o);
                sb.append(' ');
                sb.append((String) this.q);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(ed2 ed2Var, int i, int i2, tb1 tb1Var, int i3, Object obj, long j, long j2, int i4) {
        i(new ot2(this, ed2Var, new un2(i, i2, tb1Var, i3, obj, f35.i0(j), f35.i0(j2)), i4));
    }

    @Override // defpackage.m31
    public se1 v(byte[] bArr) {
        UUID uuid = (UUID) this.p;
        if (Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, ax.c)) {
            uuid = ax.b;
        }
        return new se1(uuid, bArr);
    }

    @Override // defpackage.m31
    public byte[] w() {
        return ((MediaDrm) this.q).openSession();
    }

    public ue1 x(Object obj, Object obj2) {
        int i = (this.o + 1) * 2;
        Object[] objArr = (Object[]) this.p;
        if (i > objArr.length) {
            this.p = Arrays.copyOf(objArr, qw1.b(objArr.length, i));
        }
        uc5.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.p;
        int i2 = this.o;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.o = i2 + 1;
        return this;
    }

    public ue1 y(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.o) * 2;
            Object[] objArr = (Object[]) this.p;
            if (size > objArr.length) {
                this.p = Arrays.copyOf(objArr, qw1.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void z(int i) {
        ImageView imageView = (ImageView) this.p;
        if (i != 0) {
            Drawable drawableR = zz1.r(imageView.getContext(), i);
            if (drawableR != null) {
                aw0.a(drawableR);
            }
            imageView.setImageDrawable(drawableR);
        } else {
            imageView.setImageDrawable(null);
        }
        b();
    }

    public /* synthetic */ ue1(int i, int i2, Object obj, String str) {
        this.n = i2;
        this.p = obj;
        this.o = i;
        this.q = str;
    }

    public /* synthetic */ ue1(Object obj, int i, Object obj2, int i2) {
        this.n = i2;
        this.q = obj;
        this.o = i;
        this.p = obj2;
    }

    public ue1(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.n = 1;
        this.p = arrayList;
        this.o = i;
        this.q = motionEvent;
        if (arrayList.isEmpty()) {
            kf2.n("changes cannot be empty");
            throw null;
        }
    }

    public ue1(ImageView imageView) {
        this.n = 2;
        this.o = 0;
        this.p = imageView;
    }

    public /* synthetic */ ue1(int i, byte b) {
        this.n = i;
    }

    public ue1(nz2 nz2Var) {
        this.n = 15;
        this.p = new SparseArray();
        this.q = nz2Var;
        this.o = -1;
    }

    public ue1(Shader shader, ColorStateList colorStateList, int i) {
        this.n = 3;
        this.p = shader;
        this.q = colorStateList;
        this.o = i;
    }

    public ue1(int i, iu4 iu4Var) {
        this.n = 18;
        this.o = i;
        this.p = iu4Var;
        this.q = new be3();
    }

    public ue1() {
        this.n = 9;
        this.p = new f13(new f12[16]);
    }

    public ue1(UUID uuid) {
        this.n = 0;
        uuid.getClass();
        UUID uuid2 = ax.b;
        rr2.k("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.p = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(ax.c)) ? uuid : uuid2);
        this.q = mediaDrm;
        this.o = 1;
        if (ax.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public ue1(si1 si1Var) {
        this.n = 16;
        o10 o10Var = o10.s;
        this.q = si1Var;
        this.p = o10Var;
        this.o = Integer.MAX_VALUE;
    }

    public ue1(int i) {
        this.n = 5;
        this.p = new Object[i * 2];
        this.o = 0;
    }

    public ue1(sd0 sd0Var) {
        this.n = 4;
        this.q = s51.a(150, new zg5(this));
        this.p = sd0Var;
    }

    public ue1(ls2 ls2Var, fr2 fr2Var, int i) {
        this.n = 7;
        this.q = ls2Var;
        this.p = fr2Var;
        this.o = i;
    }
}
