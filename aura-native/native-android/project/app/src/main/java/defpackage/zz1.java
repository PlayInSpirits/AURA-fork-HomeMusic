package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.Base64
 *  android.util.TypedValue
 *  android.view.Display
 *  android.view.MotionEvent
 *  android.view.RoundedCorner
 *  android.view.ViewStructure
 *  android.view.autofill.AutofillId
 */
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.media3.common.ParserException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public abstract class zz1 {
    public static Context a;
    public static Boolean b;
    public static final Object[] c;
    public static final f01 d;
    public static final f01 e;
    public static final f01 f;
    public static final f01 g;
    public static final f01 h;
    public static final n01 i;
    public static final n01 j;
    public static final p94 k;
    public static final p94 l;
    public static final p94 m;

    static {
        c = new Object[0];
        d = new f01(1, "COMPLETING_ALREADY");
        e = new f01(1, "COMPLETING_WAITING_CHILDREN");
        f = new f01(1, "COMPLETING_RETRY");
        g = new f01(1, "TOO_LATE_TO_CANCEL");
        h = new f01(1, "SEALED");
        i = new n01(false);
        j = new n01(true);
        k = new p94("TestTagsAsResourceId", false, new m94(6));
        l = new p94("AccessibilityClassName", true, new n54(28));
        m = new p94("CredentialRequest", false, new m94(7));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final long A(ey1 ey12, hb3 hb32, dy1 dy12, boolean bl5) {
        long l16;
        block7: {
            float f16;
            long l17;
            block9: {
                int n16;
                block8: {
                    block6: {
                        l17 = ey12.g;
                        if (hb32 != null) break block6;
                        l16 = l17;
                        break block7;
                    }
                    n16 = dy12.a;
                    if (n16 != 1) break block8;
                    f16 = Float.intBitsToFloat((int)(l17 >> 32));
                    break block9;
                }
                l16 = l17;
                if (n16 != 2) break block7;
                f16 = Float.intBitsToFloat((int)(l17 & 0xFFFFFFFFL));
            }
            if (hb32 == hb3.o) {
                l16 = Float.floatToRawIntBits(f16);
                l17 = Float.floatToRawIntBits(0.0f);
                l16 <<= 32;
            } else {
                l16 = Float.floatToRawIntBits(0.0f);
                l17 = Float.floatToRawIntBits(f16);
                l16 <<= 32;
            }
            l16 |= l17 & 0xFFFFFFFFL;
        }
        l16 = g83.d(zz1.B(ey12, hb32, dy12), l16);
        if (!bl5 && ey12.i) {
            return 0L;
        }
        return l16;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final long B(ey1 ey12, hb3 hb32, dy1 dy12) {
        long l16;
        long l17;
        float f16;
        if (hb32 == null) {
            return ey12.c;
        }
        int n16 = dy12.a;
        if (n16 == 1) {
            f16 = Float.intBitsToFloat((int)(ey12.c >> 32));
        } else {
            if (n16 != 2) return ey12.c;
            f16 = Float.intBitsToFloat((int)(ey12.c & 0xFFFFFFFFL));
        }
        if (hb32 == hb3.o) {
            l17 = Float.floatToRawIntBits(f16);
            l16 = Float.floatToRawIntBits(0.0f);
            l17 <<= 32;
            return l17 | 0xFFFFFFFFL & l16;
        }
        l17 = Float.floatToRawIntBits(0.0f);
        l16 = Float.floatToRawIntBits(f16);
        l17 <<= 32;
        return l17 | 0xFFFFFFFFL & l16;
    }

    public static c05 C(be3 be32, boolean bl5, boolean bl6) {
        int n16 = 0;
        if (bl5) {
            zz1.N(3, be32, false);
        }
        be32.y((int)be32.r(), StandardCharsets.UTF_8);
        long l16 = be32.r();
        String[] stringArray = new String[(int)l16];
        while ((long)n16 < l16) {
            stringArray[n16] = be32.y((int)be32.r(), StandardCharsets.UTF_8);
            ++n16;
        }
        if (bl6 && (be32.A() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new c05(stringArray);
    }

    public static TypedValue D(Context context, int n16) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n16, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean E(Context context, int n16, boolean bl5) {
        if ((context = zz1.D(context, n16)) != null && context.type == 18) {
            return context.data != 0;
        }
        return bl5;
    }

    public static TypedValue F(int n16, Context context, String string) {
        TypedValue typedValue = zz1.D(context, n16);
        if (typedValue != null) {
            return typedValue;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", string, context.getResources().getResourceName(n16)));
    }

    public static final int G(int n16) {
        return (n16 & 0xFF) << 24 | ((0xFF000000 & n16) >>> 24 | (0xFF0000 & n16) >>> 8 | (0xFF00 & n16) << 8);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean H(ba1 var0, ba1 var1_1, int var2_2, dd0 var3_3) {
        block45: {
            block48: {
                block43: {
                    block44: {
                        block47: {
                            block46: {
                                if (var0.v0() != z91.o) break block45;
                                var9_4 /* !! */  = new ba1[16];
                                if (!var0.n.A) {
                                    cz1.b("visitChildren called on an unattached node");
                                }
                                var14_5 = new f13(new cx2[16]);
                                var7_6 = var0.n;
                                var8_7 /* !! */  = var7_6.s;
                                if (var8_7 /* !! */  == null) {
                                    j51.b(var14_5, (cx2)var7_6);
lbl10:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var14_5.b(var8_7 /* !! */ );
                                ** while (true)
                                var5_8 = 0;
                                block1: while (true) {
                                    var4_9 = var14_5.p;
                                    var13_14 = null;
                                    if (var4_9 == 0) break;
                                    var7_6 = (cx2)var14_5.k(var4_9 - 1);
                                    var10_11 /* !! */  = var7_6;
                                    if ((var7_6.q & 1024) == 0) {
                                        j51.b(var14_5, (cx2)var7_6);
                                        continue;
                                    }
                                    while (true) {
                                        if (var10_11 /* !! */  == null) continue block1;
                                        if ((var10_11 /* !! */ .p & 1024) != 0) {
                                            var7_6 = null;
                                            var4_9 = var5_8;
                                            var8_7 /* !! */  = var9_4 /* !! */ ;
                                            while (true) {
                                                var9_4 /* !! */  = var8_7 /* !! */ ;
                                                var5_8 = var4_9;
                                                if (var10_11 /* !! */  == null) ** break;
                                                if (var10_11 /* !! */  instanceof ba1) {
                                                    var10_11 /* !! */  = (ba1)var10_11 /* !! */ ;
                                                    var6_10 = var4_9 + 1;
                                                    var9_4 /* !! */  = var8_7 /* !! */ ;
                                                    if (var8_7 /* !! */ .length < var6_10) {
                                                        var5_8 = var8_7 /* !! */ .length;
                                                        var9_4 /* !! */  = new Object[Math.max(var6_10, var5_8 * 2)];
                                                        System.arraycopy(var8_7 /* !! */ , 0, var9_4 /* !! */ , 0, var5_8);
                                                    }
                                                    var9_4 /* !! */ [var4_9] = var10_11 /* !! */ ;
                                                    var11_12 = var9_4 /* !! */ ;
                                                    var9_4 /* !! */  = var7_6;
                                                } else {
                                                    var11_12 = var8_7 /* !! */ ;
                                                    var6_10 = var4_9;
                                                    var9_4 /* !! */  = var7_6;
                                                    if ((var10_11 /* !! */ .p & 1024) != 0) {
                                                        var11_12 = var8_7 /* !! */ ;
                                                        var6_10 = var4_9;
                                                        var9_4 /* !! */  = var7_6;
                                                        if (var10_11 /* !! */  instanceof fo0) {
                                                            var9_4 /* !! */  = ((fo0)var10_11 /* !! */ ).C;
                                                            var5_8 = 0;
                                                            while (var9_4 /* !! */  != null) {
                                                                var11_12 = var10_11 /* !! */ ;
                                                                var12_13 /* !! */  = var7_6;
                                                                var6_10 = var5_8;
                                                                if ((var9_4 /* !! */ .p & 1024) != 0) {
                                                                    var6_10 = var5_8 + 1;
                                                                    if (var6_10 == 1) {
                                                                        var11_12 = var9_4 /* !! */ ;
                                                                        var12_13 /* !! */  = var7_6;
                                                                    } else {
                                                                        var11_12 = var7_6;
                                                                        if (var7_6 == null) {
                                                                            var11_12 = new f13(new cx2[16]);
                                                                        }
                                                                        var7_6 = var10_11 /* !! */ ;
                                                                        if (var10_11 /* !! */  != null) {
                                                                            var11_12.b(var10_11 /* !! */ );
                                                                            var7_6 = null;
                                                                        }
                                                                        var11_12.b(var9_4 /* !! */ );
                                                                        var12_13 /* !! */  = var11_12;
                                                                        var11_12 = var7_6;
                                                                    }
                                                                }
                                                                var9_4 /* !! */  = var9_4 /* !! */ .s;
                                                                var10_11 /* !! */  = var11_12;
                                                                var7_6 = var12_13 /* !! */ ;
                                                                var5_8 = var6_10;
                                                            }
                                                            var11_12 = var8_7 /* !! */ ;
                                                            var6_10 = var4_9;
                                                            var9_4 /* !! */  = var7_6;
                                                            if (var5_8 == 1) continue;
                                                        }
                                                    }
                                                }
                                                var10_11 /* !! */  = j51.c((f13)var9_4 /* !! */ );
                                                var8_7 /* !! */  = var11_12;
                                                var4_9 = var6_10;
                                                var7_6 = var9_4 /* !! */ ;
                                            }
                                        }
                                        var10_11 /* !! */  = var10_11 /* !! */ .s;
                                    }
                                    break;
                                }
                                Arrays.sort(var9_4 /* !! */ , 0, var5_8, ca1.o);
                                if (var2_2 != 1) break block46;
                                var7_6 = gb.g0(0, var5_8);
                                var4_9 = var7_6.n;
                                var6_10 = var7_6.o;
                                if (var4_9 > var6_10) break block43;
                                var5_8 = 0;
                                while (var5_8 == 0 || !te5.B((ba1)(var7_6 = var9_4 /* !! */ [var4_9])) || !zz1.o((ba1)var7_6, var3_3)) {
                                    if (h12.c(var9_4 /* !! */ [var4_9], var1_1 /* !! */ )) {
                                        var5_8 = 1;
                                    }
                                    if (var4_9 != var6_10) {
                                        ++var4_9;
                                        continue;
                                    }
                                    break block43;
                                }
                                break block47;
                            }
                            if (var2_2 != 2) break block48;
                            var7_6 = gb.g0(0, var5_8);
                            var6_10 = var7_6.n;
                            var4_9 = var7_6.o;
                            if (var6_10 <= var4_9) {
                                var5_8 = 0;
lbl114:
                                // 2 sources

                                while (true) {
                                    if (var5_8 == 0 || !te5.B((ba1)(var7_6 = var9_4 /* !! */ [var4_9])) || !zz1.f((ba1)var7_6, var3_3)) break block44;
                                    break;
                                }
                            }
                            break block43;
                        }
                        return true;
                    }
                    if (h12.c(var9_4 /* !! */ [var4_9], var1_1 /* !! */ )) {
                        var5_8 = 1;
                    }
                    if (var4_9 != var6_10) {
                        --var4_9;
                        ** continue;
                    }
                }
                if (var2_2 != 1 && var0.s0().a) {
                    if (!var0.n.A) {
                        cz1.b("visitAncestors called on an unattached node");
                    }
                    var1_1 /* !! */  = var0.n.r;
                    var11_12 = j51.O(var0);
                    block7: while (true) {
                        var7_6 = var13_14;
                        if (var11_12 == null) break;
                        if ((((cx2)var11_12.Q.g).q & 1024) != 0) {
                            var8_7 /* !! */  = var1_1 /* !! */ ;
                            while (var8_7 /* !! */  != null) {
                                if ((var8_7 /* !! */ .p & 1024) != 0) {
                                    var7_6 = var8_7 /* !! */ ;
                                    var1_1 /* !! */  = null;
                                    while (var7_6 != null) {
                                        if (var7_6 instanceof ba1) break block7;
                                        var9_4 /* !! */  = var1_1 /* !! */ ;
                                        if ((var7_6.p & 1024) != 0) {
                                            var9_4 /* !! */  = var1_1 /* !! */ ;
                                            if (var7_6 instanceof fo0) {
                                                var9_4 /* !! */  = ((fo0)var7_6).C;
                                                var2_2 = 0;
                                                while (var9_4 /* !! */  != null) {
                                                    var10_11 /* !! */  = var7_6;
                                                    var12_13 /* !! */  = var1_1 /* !! */ ;
                                                    var4_9 = var2_2;
                                                    if ((var9_4 /* !! */ .p & 1024) != 0) {
                                                        var4_9 = var2_2 + 1;
                                                        if (var4_9 == 1) {
                                                            var10_11 /* !! */  = var9_4 /* !! */ ;
                                                            var12_13 /* !! */  = var1_1 /* !! */ ;
                                                        } else {
                                                            var10_11 /* !! */  = var1_1 /* !! */ ;
                                                            if (var1_1 /* !! */  == null) {
                                                                var10_11 /* !! */  = new f13(new cx2[16]);
                                                            }
                                                            var1_1 /* !! */  = var7_6;
                                                            if (var7_6 != null) {
                                                                var10_11 /* !! */ .b(var7_6);
                                                                var1_1 /* !! */  = null;
                                                            }
                                                            var10_11 /* !! */ .b(var9_4 /* !! */ );
                                                            var12_13 /* !! */  = var10_11 /* !! */ ;
                                                            var10_11 /* !! */  = var1_1 /* !! */ ;
                                                        }
                                                    }
                                                    var9_4 /* !! */  = var9_4 /* !! */ .s;
                                                    var7_6 = var10_11 /* !! */ ;
                                                    var1_1 /* !! */  = var12_13 /* !! */ ;
                                                    var2_2 = var4_9;
                                                }
                                                var9_4 /* !! */  = var1_1 /* !! */ ;
                                                if (var2_2 == 1) continue;
                                            }
                                        }
                                        var7_6 = j51.c((f13)var9_4 /* !! */ );
                                        var1_1 /* !! */  = var9_4 /* !! */ ;
                                    }
                                }
                                var8_7 /* !! */  = var8_7 /* !! */ .r;
                            }
                        }
                        if ((var11_12 = var11_12.t()) != null && (var1_1 /* !! */  = var11_12.Q) != null) {
                            var1_1 /* !! */  = (sq4)var1_1 /* !! */ .f;
                            continue;
                        }
                        var1_1 /* !! */  = null;
                    }
                    if (var7_6 != null) {
                        return (Boolean)var3_3.invoke(var0);
                    }
                }
                return false;
            }
            kf2.o("This function should only be used for 1-D focus search");
            return false;
        }
        kf2.o("This function should only be used within a parent that has focus.");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] I(Collection objectArray) {
        objectArray.getClass();
        int n16 = objectArray.size();
        Object[] objectArray2 = c;
        if (n16 == 0) {
            return objectArray2;
        }
        Iterator iterator = objectArray.iterator();
        if (!iterator.hasNext()) {
            return objectArray2;
        }
        objectArray2 = new Object[n16];
        n16 = 0;
        while (true) {
            int n17 = n16 + 1;
            objectArray2[n16] = iterator.next();
            if (n17 >= objectArray2.length) {
                int n18;
                if (!iterator.hasNext()) {
                    return objectArray2;
                }
                n16 = n18 = n17 * 3 + 1 >>> 1;
                if (n18 <= n17) {
                    n16 = 0x7FFFFFFD;
                    if (n17 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                }
                objectArray = Arrays.copyOf(objectArray2, n16);
            } else {
                objectArray = objectArray2;
                if (!iterator.hasNext()) {
                    return Arrays.copyOf(objectArray2, n17);
                }
            }
            n16 = n17;
            objectArray2 = objectArray;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] J(Collection object, Object[] objectArray) {
        object.getClass();
        objectArray.getClass();
        int n16 = object.size();
        int n17 = 0;
        if (n16 == 0) {
            if (objectArray.length <= 0) return objectArray;
            objectArray[0] = null;
            return objectArray;
        }
        Iterator iterator = object.iterator();
        if (!iterator.hasNext()) {
            if (objectArray.length <= 0) return objectArray;
            objectArray[0] = null;
            return objectArray;
        }
        if (n16 <= objectArray.length) {
            object = objectArray;
        } else {
            object = Array.newInstance(objectArray.getClass().getComponentType(), n16);
            object.getClass();
            object = (Object[])object;
        }
        while (true) {
            T[] TArray;
            n16 = n17 + 1;
            object[n17] = iterator.next();
            if (n16 >= ((Object)object).length) {
                int n18;
                if (!iterator.hasNext()) {
                    return object;
                }
                n17 = n18 = n16 * 3 + 1 >>> 1;
                if (n18 <= n16) {
                    n17 = 0x7FFFFFFD;
                    if (n16 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                }
                TArray = Arrays.copyOf(object, n17);
            } else {
                TArray = object;
                if (!iterator.hasNext()) {
                    if (object != objectArray) return Arrays.copyOf(object, n16);
                    objectArray[n16] = null;
                    return objectArray;
                }
            }
            n17 = n16;
            object = TArray;
        }
    }

    public static final String K(byte by) {
        char[] cArray = e35.d;
        return new String(new char[]{cArray[by >> 4 & 0xF], cArray[by & 0xF]});
    }

    public static final String L(int n16) {
        if (n16 == 0) {
            return "0";
        }
        char[] cArray = e35.d;
        char c16 = cArray[n16 >> 28 & 0xF];
        char c17 = cArray[n16 >> 24 & 0xF];
        char c18 = cArray[n16 >> 20 & 0xF];
        char c19 = cArray[n16 >> 16 & 0xF];
        char c26 = cArray[n16 >> 12 & 0xF];
        char c27 = cArray[n16 >> 8 & 0xF];
        char c28 = cArray[n16 >> 4 & 0xF];
        char c29 = cArray[n16 & 0xF];
        cArray = new char[8];
        cArray[0] = c16;
        cArray[1] = c17;
        cArray[2] = c18;
        cArray[3] = c19;
        cArray[4] = c26;
        cArray[5] = c27;
        cArray[6] = c28;
        cArray[7] = c29;
        for (n16 = 0; n16 < 8 && cArray[n16] == '0'; ++n16) {
        }
        if (n16 >= 0) {
            if (n16 <= 8) {
                return new String(cArray, n16, 8 - n16);
            }
            kf2.n(b11.j(n16, "startIndex: ", " > endIndex: 8"));
            return null;
        }
        kf2.h(b11.j(n16, "startIndex: ", ", endIndex: 8, size: 8"));
        return null;
    }

    public static final Object M(Object object) {
        Object object2 = object instanceof nx1 ? (nx1)object : null;
        if (object2 != null && (object2 = ((nx1)object2).a) != null) {
            return object2;
        }
        return object;
    }

    public static boolean N(int n16, be3 object, boolean bl5) {
        block10: {
            block8: {
                block9: {
                    block7: {
                        if (((be3)object).a() >= 7) break block7;
                        if (!bl5) {
                            StringBuilder stringBuilder = new StringBuilder("too short header: ");
                            stringBuilder.append(((be3)object).a());
                            throw ParserException.a(null, stringBuilder.toString());
                        }
                        break block8;
                    }
                    if (((be3)object).A() == n16) break block9;
                    if (!bl5) {
                        object = new StringBuilder("expected header type ");
                        ((StringBuilder)object).append(Integer.toHexString(n16));
                        throw ParserException.a(null, ((StringBuilder)object).toString());
                    }
                    break block8;
                }
                if (((be3)object).A() == 118 && ((be3)object).A() == 111 && ((be3)object).A() == 114 && ((be3)object).A() == 98 && ((be3)object).A() == 105 && ((be3)object).A() == 115) {
                    return true;
                }
                if (!bl5) break block10;
            }
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int a(cf2 object, pp1 pp12) {
        long l16;
        cf2 cf22 = ((cf2)object).d0();
        if (cf22 == null) {
            StringBuilder stringBuilder = new StringBuilder("Child of ");
            stringBuilder.append(object);
            stringBuilder.append(" cannot be null when calculating alignment line");
            cz1.b(stringBuilder.toString());
        }
        if (((cf2)object).h0().a().containsKey(pp12)) {
            if ((object = (Integer)((cf2)object).h0().a().get(pp12)) == null) return Integer.MIN_VALUE;
            return (Integer)object;
        }
        int n16 = cf22.c0(pp12);
        if (n16 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean bl5 = ((cf2)object).A;
        boolean bl6 = ((cf2)object).B;
        cf22.A = true;
        ((cf2)object).B = true;
        ((cf2)object).n0();
        cf22.A = bl5;
        ((cf2)object).B = bl6;
        if (pp12 instanceof pp1) {
            l16 = cf22.j0() & 0xFFFFFFFFL;
            return n16 + (int)l16;
        }
        l16 = cf22.j0() >> 32;
        return n16 + (int)l16;
    }

    public static final boolean b(ey1 ey12) {
        return ey12.h && !ey12.d;
    }

    public static final void c(Logger logger, ar4 ar42, fr4 fr42, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fr42.b);
        stringBuilder.append(' ');
        stringBuilder.append(String.format("%-22s", Arrays.copyOf(new Object[]{string}, 1)));
        stringBuilder.append(": ");
        stringBuilder.append(ar42.a);
        logger.fine(stringBuilder.toString());
    }

    public static final float d(ig3 ig32, boolean bl5, rp1[] rp1Array, float f16) {
        int n16 = rp1Array.length;
        float f17 = Float.NaN;
        for (int i16 = 0; i16 < n16; ++i16) {
            boolean bl6;
            float f18 = ig32.b(rp1Array[i16]);
            if (!Float.isNaN(f17) && bl5 != (bl6 = f18 > f17)) continue;
            f17 = f18;
        }
        if (Float.isNaN(f17)) {
            return f16;
        }
        return f17;
    }

    public static final boolean e(int n16, int n17, int n18, byte[] byArray, byte[] byArray2) {
        byArray.getClass();
        byArray2.getClass();
        for (int i16 = 0; i16 < n18; ++i16) {
            if (byArray[i16 + n16] == byArray2[i16 + n17]) continue;
            return false;
        }
        return true;
    }

    public static final boolean f(ba1 ba12, dd0 dd02) {
        block6: {
            block11: {
                ba1 ba13;
                block12: {
                    block10: {
                        block9: {
                            block13: {
                                int n16;
                                block7: {
                                    block8: {
                                        boolean bl5;
                                        n16 = ba12.v0().ordinal();
                                        if (n16 == 0) break block6;
                                        if (n16 == 1) break block7;
                                        if (n16 == 2) break block6;
                                        if (n16 != 3) break block8;
                                        if (!zz1.x(ba12, dd02) && !(bl5 = ba12.s0().a ? (Boolean)dd02.invoke(ba12) : false)) break block9;
                                        break block10;
                                    }
                                    er1.n();
                                    return false;
                                }
                                ba13 = te5.s(ba12);
                                if (ba13 == null) break block11;
                                n16 = ba13.v0().ordinal();
                                if (n16 == 0) break block12;
                                if (n16 == 1) break block13;
                                if (n16 != 2) {
                                    if (n16 != 3) {
                                        er1.n();
                                        return false;
                                    }
                                    kf2.o("ActiveParent must have a focusedChild");
                                    return false;
                                }
                                break block12;
                            }
                            if (zz1.f(ba13, dd02) || zz1.p(ba12, ba13, 2, dd02) || ba13.s0().a && ((Boolean)dd02.invoke(ba13)).booleanValue()) break block10;
                        }
                        return false;
                    }
                    return true;
                }
                return zz1.p(ba12, ba13, 2, dd02);
            }
            kf2.o("ActiveParent must have a focusedChild");
            return false;
        }
        return zz1.x(ba12, dd02);
    }

    public static void g(float f16, float[] fArray) {
        if (f16 <= 0.5f) {
            fArray[0] = 1.0f - f16 * 2.0f;
            fArray[1] = 0.0f;
            return;
        }
        fArray[0] = 0.0f;
        fArray[1] = f16 * 2.0f - 1.0f;
    }

    public static final boolean h(ey1 ey12) {
        return !ey12.h && ey12.d;
    }

    public static final void i(long l16, long l17, long l18) {
        if ((l17 | l18) >= 0L && l17 <= l16 && l16 - l17 >= l18) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("size=");
        stringBuilder.append(l16);
        stringBuilder.append(" offset=");
        stringBuilder.append(l17);
        stringBuilder.append(" byteCount=");
        stringBuilder.append(l18);
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static long l(int n16, int n17, int n18, int n19) {
        block6: {
            int n26;
            int n27;
            block3: {
                block5: {
                    block4: {
                        block2: {
                            int n28 = 262142;
                            n27 = Math.min(n18, 262142);
                            n26 = Integer.MAX_VALUE;
                            n18 = (n19 = n19 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(n19, 262142)) == Integer.MAX_VALUE ? n27 : n19;
                            if (n18 >= 8191) break block2;
                            n18 = n28;
                            break block3;
                        }
                        if (n18 >= Short.MAX_VALUE) break block4;
                        n18 = 65534;
                        break block3;
                    }
                    if (n18 >= 65535) break block5;
                    n18 = 32766;
                    break block3;
                }
                if (n18 >= 262143) break block6;
                n18 = 8190;
            }
            n17 = n17 == Integer.MAX_VALUE ? n26 : Math.min(n18, n17);
            return qc0.a(Math.min(n18, n16), n17, n27, n19);
        }
        qc0.i(n18);
        er1.a();
        return 0L;
    }

    public static long m(int n16, int n17, int n18, int n19) {
        block6: {
            int n26;
            int n27;
            block3: {
                block5: {
                    block4: {
                        block2: {
                            int n28 = 262142;
                            n27 = Math.min(n16, 262142);
                            n26 = Integer.MAX_VALUE;
                            n16 = (n17 = n17 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(n17, 262142)) == Integer.MAX_VALUE ? n27 : n17;
                            if (n16 >= 8191) break block2;
                            n16 = n28;
                            break block3;
                        }
                        if (n16 >= Short.MAX_VALUE) break block4;
                        n16 = 65534;
                        break block3;
                    }
                    if (n16 >= 65535) break block5;
                    n16 = 32766;
                    break block3;
                }
                if (n16 >= 262143) break block6;
                n16 = 8190;
            }
            n19 = n19 == Integer.MAX_VALUE ? n26 : Math.min(n16, n19);
            return qc0.a(n27, n17, Math.min(n16, n18), n19);
        }
        qc0.i(n16);
        er1.a();
        return 0L;
    }

    public static final String n(long l16) {
        String string = l16 <= -999500000L ? b11.p(new StringBuilder(), (l16 - 500000000L) / 1000000000L, " s ") : (l16 <= -999500L ? b11.p(new StringBuilder(), (l16 - 500000L) / 1000000L, " ms") : (l16 <= 0L ? b11.p(new StringBuilder(), (l16 - 500L) / 1000L, " \u00b5s") : (l16 < 999500L ? b11.p(new StringBuilder(), (l16 + 500L) / 1000L, " \u00b5s") : (l16 < 999500000L ? b11.p(new StringBuilder(), (l16 + 500000L) / 1000000L, " ms") : b11.p(new StringBuilder(), (l16 + 500000000L) / 1000000000L, " s ")))));
        return String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
    }

    public static final boolean o(ba1 ba12, dd0 dd02) {
        int n16 = ba12.v0().ordinal();
        if (n16 != 0) {
            if (n16 != 1) {
                if (n16 != 2) {
                    if (n16 == 3) {
                        if (ba12.s0().a) {
                            return (Boolean)dd02.invoke(ba12);
                        }
                        return zz1.y(ba12, dd02);
                    }
                    er1.n();
                    return false;
                }
            } else {
                ba1 ba13 = te5.s(ba12);
                if (ba13 != null) {
                    return zz1.o(ba13, dd02) || zz1.p(ba12, ba13, 1, dd02);
                    {
                    }
                }
                kf2.o("ActiveParent must have a focusedChild");
                return false;
            }
        }
        return zz1.y(ba12, dd02);
    }

    public static final boolean p(ba1 object, ba1 ba12, int n16, dd0 dd02) {
        if (zz1.H((ba1)object, ba12, n16, dd02)) {
            return true;
        }
        if ((object = (Boolean)uc5.U((ba1)object, n16, new x50(((ey)((ra)j51.P((eo0)object)).getFocusOwner()).f(), (ba1)object, ba12, n16, dd02, 1))) != null) {
            return (Boolean)object;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static jl1 q(SSLSession certificateArray) {
        void var3_10;
        void var2_3;
        mu4 mu42;
        v20 v202;
        u01 u012;
        block7: {
            u012 = u01.n;
            String string = certificateArray.getCipherSuite();
            if (string == null) {
                kf2.o("cipherSuite == null");
                return null;
            }
            boolean bl5 = string.equals("TLS_NULL_WITH_NULL_NULL") ? true : string.equals("SSL_NULL_WITH_NULL_NULL");
            if (bl5) {
                mj0.i("cipherSuite == ".concat(string));
                return null;
            }
            v202 = v20.b.u(string);
            String string2 = certificateArray.getProtocol();
            if (string2 == null) {
                kf2.o("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(string2)) {
                mj0.i("tlsVersion == NONE");
                return null;
            }
            mu4.o.getClass();
            mu42 = xi4.m(string2);
            try {
                Certificate[] certificateArray2 = certificateArray.getPeerCertificates();
                if (certificateArray2 == null) break block7;
                List list = ze5.f(Arrays.copyOf(certificateArray2, certificateArray2.length));
            }
            catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {}
        }
        u01 u013 = u012;
        certificateArray = certificateArray.getLocalCertificates();
        if (certificateArray != null) {
            List list = ze5.f(Arrays.copyOf(certificateArray, certificateArray.length));
        }
        return new jl1(mu42, v202, (List)var2_3, new hl1((List)var3_10, 1));
    }

    public static Drawable r(Context context, int n16) {
        return c14.c().d(context, n16);
    }

    public static final cz s(vd0 vd02) {
        if (!(vd02 instanceof mr0)) {
            return new cz(1, vd02);
        }
        cz cz5 = ((mr0)vd02).j();
        if (cz5 != null) {
            if (!cz5.C()) {
                cz5 = null;
            }
            if (cz5 != null) {
                return cz5;
            }
        }
        return new cz(2, vd02);
    }

    public static j34 t(Display display, int n16) {
        if (Build.VERSION.SDK_INT >= 31 && (display = hd0.n(display, n16)) != null) {
            int n17 = go2.a((RoundedCorner)display);
            if (n17 != 0) {
                n16 = 1;
                if (n17 != 1) {
                    n16 = 2;
                    if (n17 != 2) {
                        n16 = 3;
                        if (n17 != 3) {
                            kf2.n(f34.f(n17, "Invalid position: "));
                            return null;
                        }
                    }
                }
            } else {
                n16 = 0;
            }
            return new j34(n16, go2.A((RoundedCorner)display), go2.b((RoundedCorner)display));
        }
        return null;
    }

    public static boolean u(MotionEvent motionEvent, int n16) {
        return (motionEvent.getSource() & n16) == n16;
    }

    public static Typeface v(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 31 && hd0.a(configuration) != Integer.MAX_VALUE && hd0.a(configuration) != 0 && typeface != null) {
            int n16 = vl4.a(typeface);
            return sr0.g(typeface, su3.l(hd0.a(configuration) + n16, 1, 1000), typeface.isItalic());
        }
        return null;
    }

    public static qv2 w(List object) {
        ArrayList<pv2> arrayList = new ArrayList<pv2>();
        for (int i16 = 0; i16 < object.size(); ++i16) {
            Object object2 = (String)object.get(i16);
            Object object3 = f35.a;
            object3 = ((String)object2).split("=", 2);
            if (((String[])object3).length != 2) {
                l93.q0("VorbisUtil", "Failed to parse Vorbis comment: ".concat((String)object2));
                continue;
            }
            if (object3[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    object2 = Base64.decode((String)object3[1], (int)0);
                    object3 = new be3((byte[])object2);
                    arrayList.add(dg3.d((be3)object3));
                }
                catch (RuntimeException runtimeException) {
                    l93.r0("VorbisUtil", "Failed to parse vorbis picture", runtimeException);
                }
                continue;
            }
            arrayList.add(new r85(object3[0], object3[1]));
        }
        object = arrayList.isEmpty() ? null : new qv2(arrayList);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean x(ba1 var0, dd0 var1_1) {
        var6_2 /* !! */  = new ba1[16];
        if (!var0 /* !! */ .n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        var10_3 = new f13(new cx2[16]);
        var5_4 = var0 /* !! */ .n;
        var0 /* !! */  = var5_4.s;
        if (var0 /* !! */  == null) {
            j51.b(var10_3, (cx2)var5_4);
lbl9:
            // 2 sources

            while (true) {
                var3_5 = 0;
                break;
            }
        } else {
            var10_3.b(var0 /* !! */ );
            ** continue;
        }
        block1: while ((var2_6 = var10_3.p) != 0) {
            var0 /* !! */  = (cx2)var10_3.k(var2_6 - 1);
            var7_8 = var0 /* !! */ ;
            if ((var0 /* !! */ .q & 1024) == 0) {
                j51.b(var10_3, (cx2)var0 /* !! */ );
                continue;
            }
            while (var7_8 != null) {
                if ((var7_8.p & 1024) != 0) {
                    var0 /* !! */  = null;
                    var2_6 = var3_5;
                    var5_4 = var6_2 /* !! */ ;
                    while (true) {
                        var6_2 /* !! */  = var5_4;
                        var3_5 = var2_6;
                        if (var7_8 == null) continue block1;
                        if (var7_8 instanceof ba1) {
                            var4_7 = var2_6 + 1;
                            var6_2 /* !! */  = var5_4;
                            if (var5_4.length < var4_7) {
                                var3_5 = var5_4.length;
                                var6_2 /* !! */  = new Object[Math.max(var4_7, var3_5 * 2)];
                                System.arraycopy(var5_4, 0, var6_2 /* !! */ , 0, var3_5);
                            }
                            var6_2 /* !! */ [var2_6] = var7_8;
                            var8_9 /* !! */  = var6_2 /* !! */ ;
                            var6_2 /* !! */  = var0 /* !! */ ;
                        } else {
                            var8_9 /* !! */  = var5_4;
                            var6_2 /* !! */  = var0 /* !! */ ;
                            var4_7 = var2_6;
                            if ((var7_8.p & 1024) != 0) {
                                var8_9 /* !! */  = var5_4;
                                var6_2 /* !! */  = var0 /* !! */ ;
                                var4_7 = var2_6;
                                if (var7_8 instanceof fo0) {
                                    var6_2 /* !! */  = ((fo0)var7_8).C;
                                    var3_5 = 0;
                                    while (var6_2 /* !! */  != null) {
                                        var8_9 /* !! */  = var7_8;
                                        var9_10 /* !! */  = var0 /* !! */ ;
                                        var4_7 = var3_5;
                                        if ((var6_2 /* !! */ .p & 1024) != 0) {
                                            var4_7 = var3_5 + 1;
                                            if (var4_7 == 1) {
                                                var8_9 /* !! */  = var6_2 /* !! */ ;
                                                var9_10 /* !! */  = var0 /* !! */ ;
                                            } else {
                                                var8_9 /* !! */  = var0 /* !! */ ;
                                                if (var0 /* !! */  == null) {
                                                    var8_9 /* !! */  = new f13(new cx2[16]);
                                                }
                                                var0 /* !! */  = var7_8;
                                                if (var7_8 != null) {
                                                    var8_9 /* !! */ .b(var7_8);
                                                    var0 /* !! */  = null;
                                                }
                                                var8_9 /* !! */ .b(var6_2 /* !! */ );
                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                var8_9 /* !! */  = var0 /* !! */ ;
                                            }
                                        }
                                        var6_2 /* !! */  = var6_2 /* !! */ .s;
                                        var7_8 = var8_9 /* !! */ ;
                                        var0 /* !! */  = var9_10 /* !! */ ;
                                        var3_5 = var4_7;
                                    }
                                    var8_9 /* !! */  = var5_4;
                                    var6_2 /* !! */  = var0 /* !! */ ;
                                    var4_7 = var2_6;
                                    if (var3_5 == 1) continue;
                                }
                            }
                        }
                        var7_8 = j51.c((f13)var6_2 /* !! */ );
                        var5_4 = var8_9 /* !! */ ;
                        var0 /* !! */  = var6_2 /* !! */ ;
                        var2_6 = var4_7;
                    }
                }
                var7_8 = var7_8.s;
            }
        }
        Arrays.sort(var6_2 /* !! */ , 0, var3_5, ca1.o);
        if (var2_6 < var6_2 /* !! */ .length) {
            for (var2_6 = var3_5 - 1; var2_6 >= 0; --var2_6) {
                var0 /* !! */  = var6_2 /* !! */ [var2_6];
                if (!te5.B((ba1)var0 /* !! */ ) || !zz1.f((ba1)var0 /* !! */ , var1_1)) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean y(ba1 var0, dd0 var1_1) {
        var6_2 /* !! */  = new ba1[16];
        if (!var0 /* !! */ .n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        var10_3 = new f13(new cx2[16]);
        var5_4 = var0 /* !! */ .n;
        var0 /* !! */  = var5_4.s;
        if (var0 /* !! */  == null) {
            j51.b(var10_3, (cx2)var5_4);
lbl9:
            // 2 sources

            while (true) {
                var3_5 = 0;
                break;
            }
        } else {
            var10_3.b(var0 /* !! */ );
            ** continue;
        }
        block1: while ((var2_6 = var10_3.p) != 0) {
            var7_8 /* !! */  = var0 /* !! */  = (cx2)var10_3.k(var2_6 - 1);
            if ((var0 /* !! */ .q & 1024) == 0) {
                j51.b(var10_3, var0 /* !! */ );
                continue;
            }
            while (var7_8 /* !! */  != null) {
                if ((var7_8 /* !! */ .p & 1024) != 0) {
                    var0 /* !! */  = null;
                    var2_6 = var3_5;
                    var5_4 = var6_2 /* !! */ ;
                    while (true) {
                        var6_2 /* !! */  = var5_4;
                        var3_5 = var2_6;
                        if (var7_8 /* !! */  == null) continue block1;
                        if (var7_8 /* !! */  instanceof ba1) {
                            var4_7 = var2_6 + 1;
                            var6_2 /* !! */  = var5_4;
                            if (var5_4.length < var4_7) {
                                var3_5 = var5_4.length;
                                var6_2 /* !! */  = new Object[Math.max(var4_7, var3_5 * 2)];
                                System.arraycopy(var5_4, 0, var6_2 /* !! */ , 0, var3_5);
                            }
                            var6_2 /* !! */ [var2_6] = var7_8 /* !! */ ;
                            var8_9 /* !! */  = var0 /* !! */ ;
                        } else {
                            var6_2 /* !! */  = var5_4;
                            var8_9 /* !! */  = var0 /* !! */ ;
                            var4_7 = var2_6;
                            if ((var7_8 /* !! */ .p & 1024) != 0) {
                                var6_2 /* !! */  = var5_4;
                                var8_9 /* !! */  = var0 /* !! */ ;
                                var4_7 = var2_6;
                                if (var7_8 /* !! */  instanceof fo0) {
                                    var6_2 /* !! */  = ((fo0)var7_8 /* !! */ ).C;
                                    var3_5 = 0;
                                    while (var6_2 /* !! */  != null) {
                                        var8_9 /* !! */  = var7_8 /* !! */ ;
                                        var9_10 /* !! */  = var0 /* !! */ ;
                                        var4_7 = var3_5;
                                        if ((var6_2 /* !! */ .p & 1024) != 0) {
                                            var4_7 = var3_5 + 1;
                                            if (var4_7 == 1) {
                                                var8_9 /* !! */  = var6_2 /* !! */ ;
                                                var9_10 /* !! */  = var0 /* !! */ ;
                                            } else {
                                                var8_9 /* !! */  = var0 /* !! */ ;
                                                if (var0 /* !! */  == null) {
                                                    var8_9 /* !! */  = new f13(new cx2[16]);
                                                }
                                                var0 /* !! */  = var7_8 /* !! */ ;
                                                if (var7_8 /* !! */  != null) {
                                                    var8_9 /* !! */ .b(var7_8 /* !! */ );
                                                    var0 /* !! */  = null;
                                                }
                                                var8_9 /* !! */ .b(var6_2 /* !! */ );
                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                var8_9 /* !! */  = var0 /* !! */ ;
                                            }
                                        }
                                        var6_2 /* !! */  = var6_2 /* !! */ .s;
                                        var7_8 /* !! */  = var8_9 /* !! */ ;
                                        var0 /* !! */  = var9_10 /* !! */ ;
                                        var3_5 = var4_7;
                                    }
                                    var6_2 /* !! */  = var5_4;
                                    var8_9 /* !! */  = var0 /* !! */ ;
                                    var4_7 = var2_6;
                                    if (var3_5 == 1) continue;
                                }
                            }
                        }
                        var7_8 /* !! */  = j51.c((f13)var8_9 /* !! */ );
                        var5_4 = var6_2 /* !! */ ;
                        var0 /* !! */  = var8_9 /* !! */ ;
                        var2_6 = var4_7;
                    }
                }
                var7_8 /* !! */  = var7_8 /* !! */ .s;
            }
        }
        Arrays.sort(var6_2 /* !! */ , 0, var3_5, ca1.o);
        for (var2_6 = 0; var2_6 < var3_5; ++var2_6) {
            var0 /* !! */  = var6_2 /* !! */ [var2_6];
            if (!te5.B(var0 /* !! */ ) || !zz1.o(var0 /* !! */ , var1_1)) continue;
            return true;
        }
        return false;
    }

    public static final void z(ViewStructure viewStructure, c72 c722, AutofillId object, String object2, yv3 object3) {
        boolean bl5;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        int n16;
        Object object8;
        int n17;
        int n18;
        Object object9;
        int n19;
        Object object10;
        long[] lArray;
        Object object11;
        Object object12;
        Object object13;
        int n26;
        Object object14;
        block81: {
            int n27;
            Object object15;
            Object[] objectArray;
            Object object16;
            int n28;
            Object object17;
            int n29;
            object14 = n94.a;
            object14 = d94.a;
            object14 = c722.v();
            int n36 = 8;
            n26 = 1;
            if (object14 != null && (object14 = object14.n) != null) {
                Object object18;
                Object object19;
                Object object20;
                block80: {
                    Object[] objectArray2 = object14.b;
                    Object[] objectArray3 = object14.c;
                    long[] lArray2 = object14.a;
                    int n37 = lArray2.length - 2;
                    if (n37 >= 0) {
                        boolean bl6 = true;
                        n29 = 0;
                        object17 = null;
                        n28 = 0;
                        object13 = null;
                        object12 = null;
                        object11 = null;
                        lArray = null;
                        object16 = null;
                        object10 = null;
                        n19 = 0;
                        object14 = null;
                        objectArray = null;
                        while (true) {
                            if ((((object9 = lArray2[n29]) ^ 0xFFFFFFFFFFFFFFFFL) << 7 & object9 & 0x8080808080808080L) != -9187201950435737472L) {
                                int n38 = 8 - (~(n29 - n37) >>> 31);
                                n18 = 0;
                                n17 = n19;
                                n19 = n28;
                                for (n28 = n18; n28 < n38; ++n28) {
                                    if ((object9 & 0xFFL) < 128L) {
                                        n18 = (n29 << 3) + n28;
                                        object8 = objectArray2[n18];
                                        Object object21 = objectArray3[n18];
                                        p94 p942 = (p94)object8;
                                        if (h12.c(p942, n94.r)) {
                                            object21.getClass();
                                            object8 = (mb)object21;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.a)) {
                                            object21.getClass();
                                            object18 = (String)q40.x0((List)object21);
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                            if (object18 != null) {
                                                viewStructure.setContentDescription((CharSequence)object18);
                                                object8 = object17;
                                                n16 = n19;
                                                object7 = object13;
                                                object6 = object12;
                                                object5 = object11;
                                                object4 = lArray;
                                                object15 = object16;
                                                object20 = object10;
                                                n18 = n17;
                                                bl5 = bl6;
                                                object19 = object14;
                                            }
                                        } else if (h12.c(p942, n94.q)) {
                                            object21.getClass();
                                            object4 = (qd0)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.s)) {
                                            object21.getClass();
                                            object5 = (wb)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.D)) {
                                            object21.getClass();
                                            object6 = (he)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.l)) {
                                            object21.getClass();
                                            viewStructure.setFocused(((Boolean)object21).booleanValue());
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.N)) {
                                            object21.getClass();
                                            object19 = (Integer)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                        } else if (h12.c(p942, n94.J)) {
                                            n18 = n26;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.n)) {
                                            object21.getClass();
                                            bl5 = (Boolean)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.w)) {
                                            object21.getClass();
                                            object20 = (m24)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.G)) {
                                            object21.getClass();
                                            object15 = (Boolean)object21;
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, n94.H)) {
                                            object21.getClass();
                                            object7 = (qu4)((Object)object21);
                                            object8 = object17;
                                            n16 = n19;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, d94.b)) {
                                            viewStructure.setClickable(n26 != 0);
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, d94.c)) {
                                            viewStructure.setLongClickable(n26 != 0);
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else if (h12.c(p942, d94.v)) {
                                            viewStructure.setFocusable(n26 != 0);
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                        } else {
                                            object8 = object17;
                                            n16 = n19;
                                            object7 = object13;
                                            object6 = object12;
                                            object5 = object11;
                                            object4 = lArray;
                                            object15 = object16;
                                            object20 = object10;
                                            n18 = n17;
                                            bl5 = bl6;
                                            object19 = object14;
                                            if (h12.c(p942, d94.k)) {
                                                n16 = n26;
                                                object19 = object14;
                                                bl5 = bl6;
                                                n18 = n17;
                                                object20 = object10;
                                                object15 = object16;
                                                object4 = lArray;
                                                object5 = object11;
                                                object6 = object12;
                                                object7 = object13;
                                                object8 = object17;
                                            }
                                        }
                                        object17 = object8;
                                        n19 = n16;
                                        object13 = object7;
                                        object12 = object6;
                                        object11 = object5;
                                        lArray = object4;
                                        object16 = object15;
                                        object10 = object20;
                                        n17 = n18;
                                        bl6 = bl5;
                                        object14 = object19;
                                        object18 = objectArray;
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            object17 = object8;
                                            n19 = n16;
                                            object13 = object7;
                                            object12 = object6;
                                            object11 = object5;
                                            lArray = object4;
                                            object16 = object15;
                                            object10 = object20;
                                            n17 = n18;
                                            bl6 = bl5;
                                            object14 = object19;
                                            object18 = objectArray;
                                            if (h12.c(p942, m)) {
                                                object18 = object21;
                                                object17 = object8;
                                                n19 = n16;
                                                object13 = object7;
                                                object12 = object6;
                                                object11 = object5;
                                                lArray = object4;
                                                object16 = object15;
                                                object10 = object20;
                                                n17 = n18;
                                                bl6 = bl5;
                                                object14 = object19;
                                            }
                                        }
                                    } else {
                                        object18 = objectArray;
                                    }
                                    object9 >>= 8;
                                    objectArray = object18;
                                }
                                n27 = n26;
                                object18 = object17;
                                n16 = n19;
                                object19 = object13;
                                object20 = object12;
                                object15 = object11;
                                object4 = lArray;
                                object5 = object16;
                                object6 = object10;
                                n18 = n17;
                                bl5 = bl6;
                                object7 = object14;
                                object8 = objectArray;
                                n26 = n27;
                                if (n38 != 8) break block80;
                                n28 = n19;
                                n19 = n17;
                                n17 = n27;
                            } else {
                                n17 = n26;
                            }
                            object18 = object17;
                            n16 = n28;
                            object19 = object13;
                            object20 = object12;
                            object15 = object11;
                            object4 = lArray;
                            object5 = object16;
                            object6 = object10;
                            n18 = n19;
                            bl5 = bl6;
                            object7 = object14;
                            object8 = objectArray;
                            n26 = n17;
                            if (n29 != n37) {
                                ++n29;
                                n26 = n17;
                                continue;
                            }
                            break block80;
                            break;
                        }
                    }
                    n26 = 1;
                    bl5 = true;
                    object18 = null;
                    n16 = 0;
                    object19 = null;
                    object20 = null;
                    object15 = null;
                    object4 = null;
                    object5 = null;
                    object6 = null;
                    n18 = 0;
                    object7 = null;
                    object8 = null;
                }
                object13 = object18;
                lArray = object19;
                object12 = object20;
                object11 = object15;
                n17 = n26;
            } else {
                n17 = 1;
                bl5 = true;
                object13 = null;
                object12 = null;
                object11 = null;
                lArray = null;
                n16 = 0;
                object4 = null;
                object5 = null;
                object6 = null;
                n18 = 0;
                object7 = null;
                object8 = null;
            }
            object10 = c722.v();
            object14 = object10;
            if (object10 != null) {
                object14 = object10;
                if (((e94)object10).p) {
                    if (((e94)object10).q) {
                        object14 = object10;
                    } else {
                        object10 = ((e94)object10).b();
                        object16 = new q03(((c13)c722.n()).n.p);
                        ((q03)object16).c(c722.n());
                        while (true) {
                            object14 = object10;
                            if (!((q03)object16).i()) break;
                            object14 = (c72)((q03)object16).k(((q03)object16).b - 1);
                            object17 = object14.v();
                            if (object17 == null || object17.p) continue;
                            ((e94)object10).e((e94)object17);
                            if (object17.q) continue;
                            ((q03)object16).c(object14.n());
                        }
                    }
                }
            }
            if (object14 != null && (object14 = object14.n) != null) {
                object10 = object14.b;
                objectArray = object14.c;
                object17 = object14.a;
                n27 = ((long[])object17).length - 2;
                if (n27 >= 0) {
                    n26 = 0;
                    object14 = null;
                    n19 = n36;
                    while (true) {
                        if ((((object9 = object17[n26]) ^ 0xFFFFFFFFFFFFFFFFL) << 7 & object9 & 0x8080808080808080L) != -9187201950435737472L) {
                            n29 = 8 - (~(n26 - n27) >>> 31);
                            for (n28 = 0; n28 < n29; ++n28) {
                                if ((object9 & 0xFFL) < 128L) {
                                    n36 = (n26 << 3) + n28;
                                    object15 = object10[n36];
                                    object16 = objectArray[n36];
                                    if (h12.c(object15 = (p94)object15, n94.j)) {
                                        viewStructure.setEnabled(false);
                                    } else if (h12.c(object15, n94.z)) {
                                        object16.getClass();
                                        object14 = (List)object16;
                                    }
                                }
                                object9 >>= n19;
                            }
                            object16 = object10;
                            object10 = object14;
                            if (n29 != n19) break block81;
                        } else {
                            object16 = object10;
                        }
                        object10 = object14;
                        if (n26 != n27) {
                            ++n26;
                            object10 = object16;
                            continue;
                        }
                        break block81;
                        break;
                    }
                }
            }
            object10 = null;
        }
        object14 = c722.o;
        if (c722.t() == null) {
            object14 = null;
        }
        n19 = object14 != null ? object14.intValue() : -1;
        j3.u(viewStructure, object, n19);
        viewStructure.setId(n19, (String)object2, null, null);
        object = object13 != null ? Integer.valueOf(object13.a) : (n16 != 0 ? Integer.valueOf(n17) : (lArray != null ? Integer.valueOf(2) : null));
        if (object != null) {
            tn.r(viewStructure, object.intValue());
        }
        if (object12 != null) {
            object = ((he)object12).o;
            if (object.length() > 5000) {
                object = Character.isHighSurrogate(object.charAt(4999)) && Character.isLowSurrogate(object.charAt(5000)) ? qm4.I0(4999, (String)object) : qm4.I0(5000, (String)object);
            }
            j3.v(viewStructure, tn.g((CharSequence)object));
        }
        if (object11 != null) {
            j3.v(viewStructure, ((wb)object11).a);
        }
        if (object4 != null && (object = h12.t((qd0)object4)) != null) {
            tn.s(viewStructure, (String[])object);
        }
        if ((object2 = (c72)((yv3)object3).a.b(n19 = c722.o)) != null && object2.t != -4) {
            object = ((yv3)object3).c;
            n19 = ((yv3)object3).e((c72)object2);
            object = (long[])object.p;
            object9 = object[n19];
            AutofillId autofillId = object[n19 + 1];
            n26 = (int)(object9 >> 32);
            n19 = (int)object9;
            viewStructure.setDimens(n26, n19, 0, 0, (int)(autofillId >> 32) - n26, (int)autofillId - n19);
        }
        if (object5 != null) {
            viewStructure.setSelected(((Boolean)object5).booleanValue());
        }
        if (lArray != null) {
            viewStructure.setCheckable(n17 != 0);
            n19 = lArray == qu4.n ? n17 : 0;
            viewStructure.setChecked(n19 != 0);
        } else if (object5 != null) {
            viewStructure.setCheckable(n17 != 0);
            viewStructure.setChecked(((Boolean)object5).booleanValue());
        }
        qd0.a.getClass();
        object = h12.t(pd0.b);
        object.getClass();
        if (((AutofillId)object).length != 0) {
            object = object[0];
            n19 = object4 != null && (object2 = h12.t((qd0)object4)) != null && ti.m0(object2, object) >= 0 ? n17 : 0;
            n19 = n18 == 0 && n19 == 0 ? 0 : n17;
            if (n19 == 0 && !bl5) {
                n17 = 0;
            }
            j3.w(viewStructure, n17 != 0);
            n17 = ((f63)c722.Q.e).J0() ? 4 : 0;
            viewStructure.setVisibility(n17);
            if (object10 != null) {
                n26 = object10.size();
                object = "";
                for (n17 = 0; n17 < n26; ++n17) {
                    object2 = ((he)object10.get((int)n17)).o;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(object);
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append("\n");
                    object = ((StringBuilder)object3).toString();
                }
                viewStructure.setText((CharSequence)object);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((c13)c722.n()).isEmpty() && object6 != null) {
                viewStructure.setClassName("android.widget.ImageView");
            }
            if (n16 != 0) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && object7 != null) {
                    i3.s(viewStructure, ((Number)object7).intValue());
                }
                if (n19 != 0) {
                    j3.t(viewStructure);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 && object8 != null) {
                kf2.k();
            }
            return;
        }
        kf2.m("Array is empty.");
    }

    public qv2 j(uv2 uv22) {
        ByteBuffer byteBuffer = uv22.r;
        byteBuffer.getClass();
        boolean bl5 = byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0;
        rr2.l(bl5);
        return this.k(uv22, byteBuffer);
    }

    public abstract qv2 k(uv2 var1, ByteBuffer var2);
}

