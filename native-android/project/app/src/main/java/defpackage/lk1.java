package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 extends bz4 {
    public final /* synthetic */ int a;

    public /* synthetic */ lk1(int i) {
        this.a = i;
    }

    public static h32 c(int i, l32 l32Var) throws IOException {
        int iW = xa3.w(i);
        if (iW == 5) {
            return new k32(l32Var.c0());
        }
        if (iW == 6) {
            return new k32(new q72(l32Var.c0()));
        }
        if (iW == 7) {
            return new k32(Boolean.valueOf(l32Var.R()));
        }
        if (iW == 8) {
            l32Var.a0();
            return i32.n;
        }
        kf2.o("Unexpected token: ".concat(b11.x(i)));
        return null;
    }

    public static void d(q32 q32Var, h32 h32Var) throws IOException {
        if (h32Var == null || (h32Var instanceof i32)) {
            q32Var.F();
            return;
        }
        if (h32Var instanceof k32) {
            k32 k32Var = (k32) h32Var;
            Serializable serializable = k32Var.n;
            if (serializable instanceof Number) {
                q32Var.T(k32Var.e());
                return;
            } else if (serializable instanceof Boolean) {
                q32Var.X(k32Var.d());
                return;
            } else {
                q32Var.W(k32Var.b());
                return;
            }
        }
        if (h32Var instanceof f32) {
            q32Var.f();
            ArrayList arrayList = ((f32) h32Var).n;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d(q32Var, (h32) obj);
            }
            q32Var.q();
            return;
        }
        if (!(h32Var instanceof j32)) {
            kf2.l(h32Var.getClass(), "Couldn't write ");
            return;
        }
        q32Var.j();
        Iterator it = ((lb2) h32Var.a().n.entrySet()).iterator();
        while (((kb2) it).hasNext()) {
            mb2 mb2VarB = ((kb2) it).b();
            q32Var.u((String) mb2VarB.getKey());
            d(q32Var, (h32) mb2VarB.getValue());
        }
        q32Var.s();
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        h32 f32Var;
        h32 f32Var2;
        boolean zR;
        switch (this.a) {
            case 0:
                if (l32Var.e0() != 9) {
                    return Double.valueOf(l32Var.T());
                }
                l32Var.a0();
                return null;
            case 1:
                if (l32Var.e0() != 9) {
                    return Float.valueOf((float) l32Var.T());
                }
                l32Var.a0();
                return null;
            case 2:
                if (l32Var.e0() != 9) {
                    return Long.valueOf(l32Var.X());
                }
                l32Var.a0();
                return null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArrayList arrayList = new ArrayList();
                l32Var.b();
                while (l32Var.J()) {
                    try {
                        arrayList.add(Integer.valueOf(l32Var.W()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                l32Var.q();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                try {
                    return Long.valueOf(l32Var.X());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            case 5:
                if (l32Var.e0() != 9) {
                    return Float.valueOf((float) l32Var.T());
                }
                l32Var.a0();
                return null;
            case 6:
                if (l32Var.e0() != 9) {
                    return Double.valueOf(l32Var.T());
                }
                l32Var.a0();
                return null;
            case 7:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC0 = l32Var.c0();
                if (strC0.length() == 1) {
                    return Character.valueOf(strC0.charAt(0));
                }
                StringBuilder sbJ = xa3.j("Expecting character, got: ", strC0, "; at ");
                sbJ.append(l32Var.H());
                throw new JsonSyntaxException(sbJ.toString());
            case 8:
                int iE0 = l32Var.e0();
                if (iE0 != 9) {
                    return iE0 == 8 ? Boolean.toString(l32Var.R()) : l32Var.c0();
                }
                l32Var.a0();
                return null;
            case 9:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC1 = l32Var.c0();
                try {
                    return new BigDecimal(strC1);
                } catch (NumberFormatException e3) {
                    oi0.a(xa3.j("Failed parsing '", strC1, "' as BigDecimal; at path "), l32Var.H(), e3);
                    return null;
                }
            case 10:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC2 = l32Var.c0();
                try {
                    return new BigInteger(strC2);
                } catch (NumberFormatException e4) {
                    oi0.a(xa3.j("Failed parsing '", strC2, "' as BigInteger; at path "), l32Var.H(), e4);
                    return null;
                }
            case 11:
                if (l32Var.e0() != 9) {
                    return new q72(l32Var.c0());
                }
                l32Var.a0();
                return null;
            case 12:
                if (l32Var.e0() != 9) {
                    return new StringBuilder(l32Var.c0());
                }
                l32Var.a0();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (l32Var.e0() != 9) {
                    return new StringBuffer(l32Var.c0());
                }
                l32Var.a0();
                return null;
            case 15:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC3 = l32Var.c0();
                if ("null".equals(strC3)) {
                    return null;
                }
                return new URL(strC3);
            case WaveRetry.MAX_FAILURES /* 16 */:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                try {
                    String strC4 = l32Var.c0();
                    if ("null".equals(strC4)) {
                        return null;
                    }
                    return new URI(strC4);
                } catch (URISyntaxException e5) {
                    throw new JsonIOException(e5);
                }
            case 17:
                if (l32Var.e0() != 9) {
                    return InetAddress.getByName(l32Var.c0());
                }
                l32Var.a0();
                return null;
            case 18:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC5 = l32Var.c0();
                try {
                    return UUID.fromString(strC5);
                } catch (IllegalArgumentException e6) {
                    oi0.a(xa3.j("Failed parsing '", strC5, "' as UUID; at path "), l32Var.H(), e6);
                    return null;
                }
            case 19:
                String strC6 = l32Var.c0();
                try {
                    return Currency.getInstance(strC6);
                } catch (IllegalArgumentException e7) {
                    oi0.a(xa3.j("Failed parsing '", strC6, "' as Currency; at path "), l32Var.H(), e7);
                    return null;
                }
            case 20:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                l32Var.f();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (l32Var.e0() != 4) {
                    String strY = l32Var.Y();
                    int iW = l32Var.W();
                    if ("year".equals(strY)) {
                        i2 = iW;
                    } else if ("month".equals(strY)) {
                        i3 = iW;
                    } else if ("dayOfMonth".equals(strY)) {
                        i4 = iW;
                    } else if ("hourOfDay".equals(strY)) {
                        i5 = iW;
                    } else if ("minute".equals(strY)) {
                        i6 = iW;
                    } else if ("second".equals(strY)) {
                        i7 = iW;
                    }
                }
                l32Var.s();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            case 21:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(l32Var.c0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                if (l32Var instanceof n32) {
                    n32 n32Var = (n32) l32Var;
                    int iE1 = n32Var.e0();
                    if (iE1 == 5 || iE1 == 2 || iE1 == 4 || iE1 == 10) {
                        er1.j(b11.x(iE1), " when reading a JsonElement.", "Unexpected ");
                        return null;
                    }
                    h32 h32Var = (h32) n32Var.q0();
                    n32Var.k0();
                    return h32Var;
                }
                int iE2 = l32Var.e0();
                int iW2 = xa3.w(iE2);
                if (iW2 == 0) {
                    l32Var.b();
                    f32Var = new f32();
                } else if (iW2 != 2) {
                    f32Var = null;
                } else {
                    l32Var.f();
                    f32Var = new j32();
                }
                if (f32Var == null) {
                    return c(iE2, l32Var);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (l32Var.J()) {
                        String strY2 = f32Var instanceof j32 ? l32Var.Y() : null;
                        int iE3 = l32Var.e0();
                        int iW3 = xa3.w(iE3);
                        if (iW3 == 0) {
                            l32Var.b();
                            f32Var2 = new f32();
                        } else if (iW3 != 2) {
                            f32Var2 = null;
                        } else {
                            l32Var.f();
                            f32Var2 = new j32();
                        }
                        boolean z = f32Var2 != null;
                        if (f32Var2 == null) {
                            f32Var2 = c(iE3, l32Var);
                        }
                        if (f32Var instanceof f32) {
                            ((f32) f32Var).n.add(f32Var2);
                        } else {
                            ((j32) f32Var).n.put(strY2, f32Var2);
                        }
                        if (z) {
                            arrayDeque.addLast(f32Var);
                            f32Var = f32Var2;
                        }
                    } else {
                        if (f32Var instanceof f32) {
                            l32Var.q();
                        } else {
                            l32Var.s();
                        }
                        if (arrayDeque.isEmpty()) {
                            return f32Var;
                        }
                        f32Var = (h32) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                l32Var.b();
                int iE4 = l32Var.e0();
                int i8 = 0;
                while (iE4 != 2) {
                    int iW4 = xa3.w(iE4);
                    if (iW4 == 5 || iW4 == 6) {
                        int iW5 = l32Var.W();
                        if (iW5 == 0) {
                            zR = false;
                        } else {
                            if (iW5 != 1) {
                                StringBuilder sbJ2 = f34.j(iW5, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbJ2.append(l32Var.H());
                                throw new JsonSyntaxException(sbJ2.toString());
                            }
                            zR = true;
                        }
                    } else {
                        if (iW4 != 7) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + b11.x(iE4) + "; at path " + l32Var.v());
                        }
                        zR = l32Var.R();
                    }
                    if (zR) {
                        bitSet.set(i8);
                    }
                    i8++;
                    iE4 = l32Var.e0();
                }
                l32Var.q();
                return bitSet;
            case 24:
                int iE5 = l32Var.e0();
                if (iE5 != 9) {
                    return iE5 == 6 ? Boolean.valueOf(Boolean.parseBoolean(l32Var.c0())) : Boolean.valueOf(l32Var.R());
                }
                l32Var.a0();
                return null;
            case 25:
                if (l32Var.e0() != 9) {
                    return Boolean.valueOf(l32Var.c0());
                }
                l32Var.a0();
                return null;
            case 26:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                try {
                    int iW6 = l32Var.W();
                    if (iW6 <= 255 && iW6 >= -128) {
                        return Byte.valueOf((byte) iW6);
                    }
                    StringBuilder sbJ3 = f34.j(iW6, "Lossy conversion from ", " to byte; at path ");
                    sbJ3.append(l32Var.H());
                    throw new JsonSyntaxException(sbJ3.toString());
                } catch (NumberFormatException e8) {
                    throw new JsonSyntaxException(e8);
                }
            case 27:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                try {
                    int iW7 = l32Var.W();
                    if (iW7 <= 65535 && iW7 >= -32768) {
                        return Short.valueOf((short) iW7);
                    }
                    StringBuilder sbJ4 = f34.j(iW7, "Lossy conversion from ", " to short; at path ");
                    sbJ4.append(l32Var.H());
                    throw new JsonSyntaxException(sbJ4.toString());
                } catch (NumberFormatException e9) {
                    throw new JsonSyntaxException(e9);
                }
            default:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                try {
                    return Integer.valueOf(l32Var.W());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        int i = 0;
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    q32Var.F();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                nk1.a(dDoubleValue);
                q32Var.K(dDoubleValue);
                return;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    q32Var.F();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                nk1.a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                q32Var.T(numberValueOf);
                return;
            case 2:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    q32Var.F();
                    return;
                } else {
                    q32Var.W(number2.toString());
                    return;
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                q32Var.f();
                int length = atomicIntegerArray.length();
                while (i < length) {
                    q32Var.M(atomicIntegerArray.get(i));
                    i++;
                }
                q32Var.q();
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    q32Var.F();
                    return;
                } else {
                    q32Var.M(number3.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    q32Var.F();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                q32Var.T(numberValueOf2);
                return;
            case 6:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    q32Var.F();
                    return;
                } else {
                    q32Var.K(number4.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                q32Var.W(ch != null ? String.valueOf(ch) : null);
                return;
            case 8:
                q32Var.W((String) obj);
                return;
            case 9:
                q32Var.T((BigDecimal) obj);
                return;
            case 10:
                q32Var.T((BigInteger) obj);
                return;
            case 11:
                q32Var.T((q72) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                q32Var.W(sb != null ? sb.toString() : null);
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                q32Var.W(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case 15:
                URL url = (URL) obj;
                q32Var.W(url != null ? url.toExternalForm() : null);
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                URI uri = (URI) obj;
                q32Var.W(uri != null ? uri.toASCIIString() : null);
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                q32Var.W(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case 18:
                UUID uuid = (UUID) obj;
                q32Var.W(uuid != null ? uuid.toString() : null);
                return;
            case 19:
                q32Var.W(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    q32Var.F();
                    return;
                }
                q32Var.j();
                q32Var.u("year");
                q32Var.M(calendar.get(1));
                q32Var.u("month");
                q32Var.M(calendar.get(2));
                q32Var.u("dayOfMonth");
                q32Var.M(calendar.get(5));
                q32Var.u("hourOfDay");
                q32Var.M(calendar.get(11));
                q32Var.u("minute");
                q32Var.M(calendar.get(12));
                q32Var.u("second");
                q32Var.M(calendar.get(13));
                q32Var.s();
                return;
            case 21:
                Locale locale = (Locale) obj;
                q32Var.W(locale != null ? locale.toString() : null);
                return;
            case 22:
                d(q32Var, (h32) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                q32Var.f();
                int length2 = bitSet.length();
                while (i < length2) {
                    q32Var.M(bitSet.get(i) ? 1L : 0L);
                    i++;
                }
                q32Var.q();
                return;
            case 24:
                q32Var.R((Boolean) obj);
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                q32Var.W(bool == null ? "null" : bool.toString());
                return;
            case 26:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    q32Var.F();
                    return;
                } else {
                    q32Var.M(number5.byteValue());
                    return;
                }
            case 27:
                Number number6 = (Number) obj;
                if (number6 == null) {
                    q32Var.F();
                    return;
                } else {
                    q32Var.M(number6.shortValue());
                    return;
                }
            default:
                Number number7 = (Number) obj;
                if (number7 == null) {
                    q32Var.F();
                    return;
                } else {
                    q32Var.M(number7.intValue());
                    return;
                }
        }
    }
}
