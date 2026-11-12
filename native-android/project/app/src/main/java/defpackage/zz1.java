package defpackage;

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
import android.view.autofill.AutofillValue;
import androidx.media3.common.ParserException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.IOException;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz1 {
    public static Context a;
    public static Boolean b;
    public static final Object[] c = new Object[0];
    public static final f01 d = new f01(1, "COMPLETING_ALREADY");
    public static final f01 e = new f01(1, "COMPLETING_WAITING_CHILDREN");
    public static final f01 f = new f01(1, "COMPLETING_RETRY");
    public static final f01 g = new f01(1, "TOO_LATE_TO_CANCEL");
    public static final f01 h = new f01(1, "SEALED");
    public static final n01 i = new n01(false);
    public static final n01 j = new n01(true);
    public static final p94 k = new p94("TestTagsAsResourceId", false, new m94(6));
    public static final p94 l = new p94("AccessibilityClassName", true, new n54(28));
    public static final p94 m = new p94("CredentialRequest", false, new m94(7));

    public static final long A(ey1 ey1Var, hb3 hb3Var, dy1 dy1Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        long j3 = ey1Var.g;
        if (hb3Var != null) {
            int i2 = dy1Var.a;
            if (i2 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (hb3Var == hb3.o) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j2 = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j2 = jFloatToRawIntBits3 << 32;
            }
            j3 = j2 | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = g83.d(B(ey1Var, hb3Var, dy1Var), j3);
        if (z || !ey1Var.i) {
            return jD;
        }
        return 0L;
    }

    public static final long B(ey1 ey1Var, hb3 hb3Var, dy1 dy1Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (hb3Var == null) {
            return ey1Var.c;
        }
        int i2 = dy1Var.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (ey1Var.c >> 32));
        } else {
            if (i2 != 2) {
                return ey1Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (ey1Var.c & 4294967295L));
        }
        if (hb3Var == hb3.o) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & jFloatToRawIntBits);
    }

    public static c05 C(be3 be3Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            N(3, be3Var, false);
        }
        be3Var.y((int) be3Var.r(), StandardCharsets.UTF_8);
        long jR = be3Var.r();
        String[] strArr = new String[(int) jR];
        for (int i2 = 0; i2 < jR; i2++) {
            strArr[i2] = be3Var.y((int) be3Var.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (be3Var.A() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new c05(strArr);
    }

    public static TypedValue D(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean E(Context context, int i2, boolean z) {
        TypedValue typedValueD = D(context, i2);
        if (typedValueD == null || typedValueD.type != 18) {
            return z;
        }
        return typedValueD.data != 0;
    }

    public static TypedValue F(int i2, Context context, String str) {
        TypedValue typedValueD = D(context, i2);
        if (typedValueD != null) {
            return typedValueD;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static final int G(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 cx2) = (r13v7 cx2), (r13v14 cx2) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean H(ba1 ba1Var, ba1 ba1Var2, int i2, dd0 dd0Var) {
        cx2 cx2Var;
        cx2 cx2Var2;
        c72 c72VarO;
        w12 w12Var;
        cx2 cx2VarC;
        f13 f13Var;
        if (ba1Var.v0() != z91.o) {
            kf2.o("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new ba1[16];
        if (!ba1Var.n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        f13 f13Var2 = new f13(new cx2[16]);
        cx2 cx2Var3 = ba1Var.n;
        cx2 cx2Var4 = cx2Var3.s;
        if (cx2Var4 == null) {
            j51.b(f13Var2, cx2Var3);
        } else {
            f13Var2.b(cx2Var4);
        }
        int i3 = 0;
        while (true) {
            int i4 = f13Var2.p;
            cx2Var = null;
            if (i4 == 0) {
                break;
            }
            cx2 cx2VarC2 = (cx2) f13Var2.k(i4 - 1);
            if ((cx2VarC2.q & 1024) == 0) {
                j51.b(f13Var2, cx2VarC2);
            } else {
                while (cx2VarC2 != null) {
                    if ((cx2VarC2.p & 1024) != 0) {
                        f13 f13Var3 = null;
                        while (cx2VarC2 != null) {
                            if (cx2VarC2 instanceof ba1) {
                                ba1 ba1Var3 = (ba1) cx2VarC2;
                                int i5 = i3 + 1;
                                if (objArr.length < i5) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i5, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i3] = ba1Var3;
                                i3 = i5;
                            } else if ((cx2VarC2.p & 1024) != 0 && (cx2VarC2 instanceof fo0)) {
                                int i6 = 0;
                                for (cx2 cx2Var5 = ((fo0) cx2VarC2).C; cx2Var5 != null; cx2Var5 = cx2Var5.s) {
                                    if ((cx2Var5.p & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            cx2VarC2 = cx2Var5;
                                        } else {
                                            if (f13Var3 == null) {
                                                f13Var3 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC2 != null) {
                                                f13Var3.b(cx2VarC2);
                                                cx2VarC2 = null;
                                            }
                                            f13Var3.b(cx2Var5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            cx2VarC2 = j51.c(f13Var3);
                        }
                        break;
                    }
                    cx2VarC2 = cx2VarC2.s;
                }
            }
        }
        Arrays.sort(objArr, 0, i3, ca1.o);
        if (i2 != 1) {
            if (i2 != 2) {
                kf2.o("This function should only be used for 1-D focus search");
                return false;
            }
            j02 j02VarG0 = gb.g0(0, i3);
            int i7 = j02VarG0.n;
            int i8 = j02VarG0.o;
            if (i7 <= i8) {
                boolean z = false;
                while (true) {
                    if (z) {
                        ba1 ba1Var4 = (ba1) objArr[i8];
                        if (te5.B(ba1Var4) && f(ba1Var4, dd0Var)) {
                            return true;
                        }
                    }
                    if (h12.c(objArr[i8], ba1Var2)) {
                        z = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
            }
            if (i2 != 1) {
                if (!ba1Var.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2Var2 = ba1Var.n.r;
                c72VarO = j51.O(ba1Var);
                loop5: while (c72VarO != null) {
                    if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                        while (cx2Var2 != null) {
                            if ((cx2Var2.p & 1024) != 0) {
                                cx2VarC = cx2Var2;
                                f13Var = null;
                                while (cx2VarC != null) {
                                    if (cx2VarC instanceof ba1) {
                                        cx2Var = cx2VarC;
                                        break loop5;
                                    }
                                    if ((cx2VarC.p & 1024) == 0) {
                                    }
                                    cx2VarC = j51.c(f13Var);
                                }
                            }
                            cx2Var2 = cx2Var2.r;
                        }
                    }
                    c72VarO = c72VarO.t();
                    if (c72VarO != null) {
                    }
                }
                if (cx2Var != null) {
                    return ((Boolean) dd0Var.invoke(ba1Var)).booleanValue();
                }
            }
            return false;
        }
        j02 j02VarG1 = gb.g0(0, i3);
        int i9 = j02VarG1.n;
        int i10 = j02VarG1.o;
        if (i9 <= i10) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    ba1 ba1Var5 = (ba1) objArr[i9];
                    if (te5.B(ba1Var5) && o(ba1Var5, dd0Var)) {
                        return true;
                    }
                }
                if (h12.c(objArr[i9], ba1Var2)) {
                    z2 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
        }
        if (i2 != 1 && ba1Var.s0().a) {
            if (!ba1Var.n.A) {
                cz1.b("visitAncestors called on an unattached node");
            }
            cx2Var2 = ba1Var.n.r;
            c72VarO = j51.O(ba1Var);
            loop5: while (c72VarO != null) {
                if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                    while (cx2Var2 != null) {
                        if ((cx2Var2.p & 1024) != 0) {
                            cx2VarC = cx2Var2;
                            f13Var = null;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof ba1) {
                                    cx2Var = cx2VarC;
                                    break loop5;
                                }
                                if ((cx2VarC.p & 1024) == 0 && (cx2VarC instanceof fo0)) {
                                    int i11 = 0;
                                    for (cx2 cx2Var6 = ((fo0) cx2VarC).C; cx2Var6 != null; cx2Var6 = cx2Var6.s) {
                                        if ((cx2Var6.p & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cx2VarC = cx2Var6;
                                            } else {
                                                if (f13Var == null) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var.b(cx2Var6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cx2VarC = j51.c(f13Var);
                            }
                        }
                        cx2Var2 = cx2Var2.r;
                    }
                }
                c72VarO = c72VarO.t();
                cx2Var2 = (c72VarO != null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
            }
            if (cx2Var != null) {
                return ((Boolean) dd0Var.invoke(ba1Var)).booleanValue();
            }
        }
        return false;
    }

    public static final Object[] I(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = c;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] J(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final String K(byte b2) {
        char[] cArr = e35.d;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String L(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = e35.d;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        if (i3 < 0) {
            kf2.h(b11.j(i3, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i3 <= 8) {
            return new String(cArr2, i3, 8 - i3);
        }
        kf2.n(b11.j(i3, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    public static final Object M(Object obj) {
        mx1 mx1Var;
        nx1 nx1Var = obj instanceof nx1 ? (nx1) obj : null;
        return (nx1Var == null || (mx1Var = nx1Var.a) == null) ? obj : mx1Var;
    }

    public static boolean N(int i2, be3 be3Var, boolean z) throws ParserException {
        if (be3Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + be3Var.a());
        }
        if (be3Var.A() != i2) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i2));
        }
        if (be3Var.A() == 118 && be3Var.A() == 111 && be3Var.A() == 114 && be3Var.A() == 98 && be3Var.A() == 105 && be3Var.A() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    public static final int a(cf2 cf2Var, pp1 pp1Var) {
        cf2 cf2VarD0 = cf2Var.d0();
        if (cf2VarD0 == null) {
            cz1.b("Child of " + cf2Var + " cannot be null when calculating alignment line");
        }
        if (cf2Var.h0().a().containsKey(pp1Var)) {
            Integer num = (Integer) cf2Var.h0().a().get(pp1Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iC0 = cf2VarD0.c0(pp1Var);
            if (iC0 != Integer.MIN_VALUE) {
                boolean z = cf2Var.A;
                boolean z2 = cf2Var.B;
                cf2VarD0.A = true;
                cf2Var.B = true;
                cf2Var.n0();
                cf2VarD0.A = z;
                cf2Var.B = z2;
                return iC0 + ((int) (pp1Var instanceof pp1 ? cf2VarD0.j0() & 4294967295L : cf2VarD0.j0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean b(ey1 ey1Var) {
        return ey1Var.h && !ey1Var.d;
    }

    public static final void c(Logger logger, ar4 ar4Var, fr4 fr4Var, String str) {
        logger.fine(fr4Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ar4Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float d(ig3 ig3Var, boolean z, rp1[] rp1VarArr, float f2) {
        float f3 = Float.NaN;
        for (rp1 rp1Var : rp1VarArr) {
            float fB = ig3Var.b(rp1Var);
            if (Float.isNaN(f3)) {
                f3 = fB;
            } else if (z == (fB > f3)) {
                f3 = fB;
            }
        }
        return Float.isNaN(f3) ? f2 : f3;
    }

    public static final boolean e(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean f(ba1 ba1Var, dd0 dd0Var) {
        int iOrdinal = ba1Var.v0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba1 ba1VarS = te5.s(ba1Var);
                if (ba1VarS == null) {
                    kf2.o("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = ba1VarS.v0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (f(ba1VarS, dd0Var) || p(ba1Var, ba1VarS, 2, dd0Var) || (ba1VarS.s0().a && ((Boolean) dd0Var.invoke(ba1VarS)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            er1.n();
                            return false;
                        }
                        kf2.o("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return p(ba1Var, ba1VarS, 2, dd0Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    er1.n();
                    return false;
                }
                if (!x(ba1Var, dd0Var)) {
                    if (!(ba1Var.s0().a ? ((Boolean) dd0Var.invoke(ba1Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return x(ba1Var, dd0Var);
    }

    public static void g(float f2, float[] fArr) {
        if (f2 <= 0.5f) {
            fArr[0] = 1.0f - (f2 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f2 * 2.0f) - 1.0f;
        }
    }

    public static final boolean h(ey1 ey1Var) {
        return !ey1Var.h && ey1Var.d;
    }

    public static final void i(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static long l(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    qc0.i(i7);
                    er1.a();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return qc0.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long m(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    qc0.i(i7);
                    er1.a();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return qc0.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final String n(long j2) {
        String strP;
        if (j2 <= -999500000) {
            strP = b11.p(new StringBuilder(), (j2 - 500000000) / 1000000000, " s ");
        } else if (j2 <= -999500) {
            strP = b11.p(new StringBuilder(), (j2 - 500000) / 1000000, " ms");
        } else if (j2 <= 0) {
            strP = b11.p(new StringBuilder(), (j2 - 500) / 1000, " µs");
        } else if (j2 < 999500) {
            strP = b11.p(new StringBuilder(), (j2 + 500) / 1000, " µs");
        } else {
            strP = j2 < 999500000 ? b11.p(new StringBuilder(), (j2 + 500000) / 1000000, " ms") : b11.p(new StringBuilder(), (j2 + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strP}, 1));
    }

    public static final boolean o(ba1 ba1Var, dd0 dd0Var) {
        int iOrdinal = ba1Var.v0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba1 ba1VarS = te5.s(ba1Var);
                if (ba1VarS != null) {
                    return o(ba1VarS, dd0Var) || p(ba1Var, ba1VarS, 1, dd0Var);
                }
                kf2.o("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ba1Var.s0().a ? ((Boolean) dd0Var.invoke(ba1Var)).booleanValue() : y(ba1Var, dd0Var);
                }
                er1.n();
                return false;
            }
        }
        return y(ba1Var, dd0Var);
    }

    public static final boolean p(ba1 ba1Var, ba1 ba1Var2, int i2, dd0 dd0Var) {
        if (H(ba1Var, ba1Var2, i2, dd0Var)) {
            return true;
        }
        Boolean bool = (Boolean) uc5.U(ba1Var, i2, new x50(((ey) ((ra) j51.P(ba1Var)).getFocusOwner()).f(), ba1Var, ba1Var2, i2, dd0Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static jl1 q(SSLSession sSLSession) throws IOException {
        List listF;
        List listF2 = u01.n;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            kf2.o("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            mj0.i("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        v20 v20VarU = v20.b.u(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            kf2.o("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            mj0.i("tlsVersion == NONE");
            return null;
        }
        mu4.o.getClass();
        mu4 mu4VarM = xi4.m(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listF = peerCertificates != null ? ze5.f(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listF2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listF2 = ze5.f(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new jl1(mu4VarM, v20VarU, listF2, new hl1(listF, 1));
    }

    public static Drawable r(Context context, int i2) {
        return c14.c().d(context, i2);
    }

    public static final cz s(vd0 vd0Var) {
        if (!(vd0Var instanceof mr0)) {
            return new cz(1, vd0Var);
        }
        cz czVarJ = ((mr0) vd0Var).j();
        if (czVarJ != null) {
            if (!czVarJ.C()) {
                czVarJ = null;
            }
            if (czVarJ != null) {
                return czVarJ;
            }
        }
        return new cz(2, vd0Var);
    }

    public static j34 t(Display display, int i2) {
        RoundedCorner roundedCorner;
        int i3;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i2)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        kf2.n(f34.f(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        return new j34(i3, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static boolean u(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    public static Typeface v(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, su3.l(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static qv2 w(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String str2 = f35.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                l93.q0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(dg3.d(new be3(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    l93.r0("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new r85(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new qv2(arrayList);
    }

    public static final boolean x(ba1 ba1Var, dd0 dd0Var) {
        Object[] objArr = new ba1[16];
        if (!ba1Var.n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        f13 f13Var = new f13(new cx2[16]);
        cx2 cx2Var = ba1Var.n;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 == null) {
            j51.b(f13Var, cx2Var);
        } else {
            f13Var.b(cx2Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = f13Var.p;
            if (i3 == 0) {
                break;
            }
            cx2 cx2VarC = (cx2) f13Var.k(i3 - 1);
            if ((cx2VarC.q & 1024) == 0) {
                j51.b(f13Var, cx2VarC);
            } else {
                while (cx2VarC != null) {
                    if ((cx2VarC.p & 1024) != 0) {
                        f13 f13Var2 = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof ba1) {
                                ba1 ba1Var2 = (ba1) cx2VarC;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = ba1Var2;
                                i2 = i4;
                            } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                int i5 = 0;
                                for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                    if ((cx2Var3.p & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cx2VarC = cx2Var3;
                                        } else {
                                            if (f13Var2 == null) {
                                                f13Var2 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var2.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var2.b(cx2Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var2);
                        }
                        break;
                    }
                    cx2VarC = cx2VarC.s;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ca1.o);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                ba1 ba1Var3 = (ba1) objArr[i6];
                if (te5.B(ba1Var3) && f(ba1Var3, dd0Var)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final boolean y(ba1 ba1Var, dd0 dd0Var) {
        Object[] objArr = new ba1[16];
        if (!ba1Var.n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        f13 f13Var = new f13(new cx2[16]);
        cx2 cx2Var = ba1Var.n;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 == null) {
            j51.b(f13Var, cx2Var);
        } else {
            f13Var.b(cx2Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = f13Var.p;
            if (i3 == 0) {
                break;
            }
            cx2 cx2VarC = (cx2) f13Var.k(i3 - 1);
            if ((cx2VarC.q & 1024) == 0) {
                j51.b(f13Var, cx2VarC);
            } else {
                while (cx2VarC != null) {
                    if ((cx2VarC.p & 1024) != 0) {
                        f13 f13Var2 = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof ba1) {
                                ba1 ba1Var2 = (ba1) cx2VarC;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = ba1Var2;
                                i2 = i4;
                            } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                int i5 = 0;
                                for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                    if ((cx2Var3.p & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cx2VarC = cx2Var3;
                                        } else {
                                            if (f13Var2 == null) {
                                                f13Var2 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var2.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var2.b(cx2Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var2);
                        }
                        break;
                    }
                    cx2VarC = cx2VarC.s;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ca1.o);
        for (int i6 = 0; i6 < i2; i6++) {
            ba1 ba1Var3 = (ba1) objArr[i6];
            if (te5.B(ba1Var3) && o(ba1Var3, dd0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    public static final void z(ViewStructure viewStructure, c72 c72Var, AutofillId autofillId, String str, yv3 yv3Var) {
        ?? r38;
        long j2;
        long j3;
        char c2;
        long j4;
        boolean zBooleanValue;
        mb mbVar;
        he heVar;
        wb wbVar;
        qu4 qu4Var;
        boolean z;
        qd0 qd0Var;
        Boolean bool;
        m24 m24Var;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        ?? r6;
        ?? r7;
        String[] strArrT;
        String[] strArrT2;
        CharSequence charSequenceI0;
        w03 w03Var;
        Object[] objArr;
        int i2;
        int i3;
        Object[] objArr2;
        w03 w03Var2;
        boolean z3;
        mb mbVar2;
        qu4 qu4Var2;
        he heVar2;
        wb wbVar2;
        boolean z4;
        p94 p94Var = n94.a;
        p94 p94Var2 = d94.a;
        e94 e94VarV = c72Var.v();
        int i4 = 8;
        boolean z5 = true;
        if (e94VarV == null || (w03Var2 = e94VarV.n) == null) {
            r38 = 1;
            j2 = 128;
            j3 = 255;
            c2 = 7;
            j4 = -9187201950435737472L;
            zBooleanValue = true;
            mbVar = null;
            heVar = null;
            wbVar = null;
            qu4Var = null;
            z = false;
            qd0Var = null;
            bool = null;
            m24Var = null;
            z2 = false;
            num = null;
            obj = null;
        } else {
            j2 = 128;
            Object[] objArr3 = w03Var2.b;
            Object[] objArr4 = w03Var2.c;
            long[] jArr = w03Var2.a;
            j3 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                mbVar2 = null;
                z = false;
                qu4Var2 = null;
                heVar2 = null;
                wbVar2 = null;
                qd0Var = null;
                bool = null;
                m24Var = null;
                z2 = false;
                num = null;
                obj = null;
                c2 = 7;
                while (true) {
                    long j5 = jArr[i5];
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j5 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr3[i8];
                                Object obj3 = objArr4[i8];
                                p94 p94Var3 = (p94) obj2;
                                if (h12.c(p94Var3, n94.r)) {
                                    obj3.getClass();
                                    mbVar2 = (mb) obj3;
                                } else if (h12.c(p94Var3, n94.a)) {
                                    obj3.getClass();
                                    String str2 = (String) q40.x0((List) obj3);
                                    if (str2 != null) {
                                        viewStructure.setContentDescription(str2);
                                    }
                                } else if (h12.c(p94Var3, n94.q)) {
                                    obj3.getClass();
                                    qd0Var = (qd0) obj3;
                                } else if (h12.c(p94Var3, n94.s)) {
                                    obj3.getClass();
                                    wbVar2 = (wb) obj3;
                                } else if (h12.c(p94Var3, n94.D)) {
                                    obj3.getClass();
                                    heVar2 = (he) obj3;
                                } else if (h12.c(p94Var3, n94.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (h12.c(p94Var3, n94.N)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (h12.c(p94Var3, n94.J)) {
                                    z2 = z5;
                                } else if (h12.c(p94Var3, n94.n)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (h12.c(p94Var3, n94.w)) {
                                    obj3.getClass();
                                    m24Var = (m24) obj3;
                                } else if (h12.c(p94Var3, n94.G)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (h12.c(p94Var3, n94.H)) {
                                    obj3.getClass();
                                    qu4Var2 = (qu4) obj3;
                                } else if (h12.c(p94Var3, d94.b)) {
                                    viewStructure.setClickable(z5);
                                } else if (h12.c(p94Var3, d94.c)) {
                                    viewStructure.setLongClickable(z5);
                                } else if (h12.c(p94Var3, d94.v)) {
                                    viewStructure.setFocusable(z5);
                                } else if (h12.c(p94Var3, d94.k)) {
                                    z = z5;
                                }
                                z4 = z5;
                                if (Build.VERSION.SDK_INT >= 34 && h12.c(p94Var3, m)) {
                                    obj = obj3;
                                }
                            } else {
                                z4 = z5;
                            }
                            j5 >>= 8;
                            i7++;
                            z5 = z4;
                        }
                        z3 = z5;
                        z3 = z3;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        z3 = z5 ? 1 : 0;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z5 = z3 ? 1 : 0;
                }
            } else {
                z3 = true;
                c2 = 7;
                j4 = -9187201950435737472L;
                zBooleanValue = true;
                mbVar2 = null;
                z = false;
                qu4Var2 = null;
                heVar2 = null;
                wbVar2 = null;
                qd0Var = null;
                bool = null;
                m24Var = null;
                z2 = false;
                num = null;
                obj = null;
            }
            mbVar = mbVar2;
            qu4Var = qu4Var2;
            heVar = heVar2;
            wbVar = wbVar2;
            r38 = z3;
        }
        e94 e94VarV2 = c72Var.v();
        if (e94VarV2 != null && e94VarV2.p && !e94VarV2.q) {
            e94VarV2 = e94VarV2.b();
            q03 q03Var = new q03(((c13) c72Var.n()).n.p);
            q03Var.c(c72Var.n());
            while (q03Var.i()) {
                c72 c72Var2 = (c72) q03Var.k(q03Var.b - 1);
                e94 e94VarV3 = c72Var2.v();
                if (e94VarV3 != null && !e94VarV3.p) {
                    e94VarV2.e(e94VarV3);
                    if (!e94VarV3.q) {
                        q03Var.c(c72Var2.n());
                    }
                }
            }
        }
        if (e94VarV2 == null || (w03Var = e94VarV2.n) == null) {
            list = null;
        } else {
            Object[] objArr5 = w03Var.b;
            Object[] objArr6 = w03Var.c;
            long[] jArr2 = w03Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j6 = jArr2[i9];
                    int i10 = i4;
                    List list2 = list;
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i11 = 8 - ((~(i9 - length2)) >>> 31);
                        list = list2;
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i9 << 3) + i12;
                                Object obj4 = objArr5[i13];
                                Object obj5 = objArr6[i13];
                                i3 = i12;
                                p94 p94Var4 = (p94) obj4;
                                objArr2 = objArr5;
                                if (h12.c(p94Var4, n94.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (h12.c(p94Var4, n94.z)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i3 = i12;
                                objArr2 = objArr5;
                            }
                            j6 >>= i10;
                            i12 = i3 + 1;
                            objArr5 = objArr2;
                        }
                        objArr = objArr5;
                        i2 = i10;
                        if (i11 != i2) {
                            break;
                        }
                    } else {
                        objArr = objArr5;
                        i2 = i10;
                        list = list2;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    i4 = i2;
                    jArr2 = jArr2;
                    objArr5 = objArr;
                }
            } else {
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(c72Var.o);
        if (c72Var.t() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (mbVar != null) {
            numValueOf = Integer.valueOf(mbVar.a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = qu4Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (heVar != null) {
            String str3 = heVar.o;
            if (str3.length() > 5000) {
                if (Character.isHighSurrogate(str3.charAt(4999)) && Character.isLowSurrogate(str3.charAt(SmartSession.MAX_SONGS))) {
                    charSequenceI0 = str3;
                    charSequenceI0 = qm4.I0(4999, str3);
                } else {
                    charSequenceI0 = str3;
                    charSequenceI0 = str3;
                    charSequenceI0 = qm4.I0(SmartSession.MAX_SONGS, str3);
                }
            }
            charSequenceI0 = str3;
            viewStructure.setAutofillValue(AutofillValue.forText(charSequenceI0));
        }
        if (wbVar != null) {
            viewStructure.setAutofillValue(wbVar.a);
        }
        if (qd0Var != null && (strArrT2 = h12.t(qd0Var)) != null) {
            viewStructure.setAutofillHints(strArrT2);
        }
        c72 c72Var3 = (c72) yv3Var.a.b(c72Var.o);
        if (c72Var3 != null && c72Var3.t != -4) {
            ue1 ue1Var = yv3Var.c;
            int iE = yv3Var.e(c72Var3);
            long[] jArr3 = (long[]) ue1Var.p;
            long j7 = jArr3[iE];
            long j8 = jArr3[iE + 1];
            int i14 = (int) (j7 >> 32);
            int i15 = (int) j7;
            viewStructure.setDimens(i14, i15, 0, 0, ((int) (j8 >> 32)) - i14, ((int) j8) - i15);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (qu4Var != null) {
            ?? r8 = r38;
            viewStructure.setCheckable(r8);
            viewStructure.setChecked(qu4Var == qu4.n ? r8 == true ? 1 : 0 : false);
            r7 = r8;
        } else {
            r6 = r38;
            if (bool != null) {
                r7 = r6;
                viewStructure.setCheckable(r6);
                viewStructure.setChecked(bool.booleanValue());
                r7 = r6;
            }
        }
        r7 = r6;
        qd0.a.getClass();
        String[] strArrT3 = h12.t(pd0.b);
        strArrT3.getClass();
        if (strArrT3.length == 0) {
            kf2.m("Array is empty.");
            return;
        }
        ?? r1 = (z2 || ((qd0Var == null || (strArrT = h12.t(qd0Var)) == null || ti.m0(strArrT, strArrT3[0]) < 0) ? 0 : r7) != 0) ? r7 : 0;
        viewStructure.setDataIsSensitive((r1 != 0 || zBooleanValue) ? r7 : 0);
        viewStructure.setVisibility(((f63) c72Var.Q.e).J0() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String str4 = "";
            for (int i16 = 0; i16 < size; i16++) {
                str4 = ((Object) str4) + ((he) list.get(i16)).o + "\n";
            }
            viewStructure.setText(str4);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((c13) c72Var.n()).isEmpty() && m24Var != null) {
            viewStructure.setClassName("android.widget.ImageView");
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (r1 != 0) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT < 35 || obj == null) {
            return;
        }
        kf2.k();
    }

    public qv2 j(uv2 uv2Var) {
        ByteBuffer byteBuffer = uv2Var.r;
        byteBuffer.getClass();
        rr2.l(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return k(uv2Var, byteBuffer);
    }

    public abstract qv2 k(uv2 uv2Var, ByteBuffer byteBuffer);
}
