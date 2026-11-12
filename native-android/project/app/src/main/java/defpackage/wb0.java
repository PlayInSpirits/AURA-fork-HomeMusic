package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.eddyizm.tempus.homemusic.PlayEvent;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wb0 {
    public static final int[] d = null;
    public static final SparseIntArray e = null;
    public static final SparseIntArray f = null;
    public final HashMap a;
    public final boolean b;
    public final HashMap c;

    static {
        d = new int[]{0, 4, 8};
        SparseIntArray r0 = new SparseIntArray();
        e = r0;
        SparseIntArray r3 = new SparseIntArray();
        f = r3;
        r0.append(82, 25);
        r0.append(83, 26);
        r0.append(85, 29);
        r0.append(86, 30);
        r0.append(92, 36);
        r0.append(91, 35);
        r0.append(63, 4);
        r0.append(62, 3);
        r0.append(58, 1);
        r0.append(60, 91);
        r0.append(59, 92);
        r0.append(101, 6);
        r0.append(102, 7);
        r0.append(70, 17);
        r0.append(71, 18);
        r0.append(72, 19);
        r0.append(54, 99);
        r0.append(0, 27);
        r0.append(87, 32);
        r0.append(88, 33);
        r0.append(69, 10);
        r0.append(68, 9);
        r0.append(106, 13);
        r0.append(109, 16);
        r0.append(107, 14);
        r0.append(104, 11);
        r0.append(108, 15);
        r0.append(105, 12);
        r0.append(95, 40);
        r0.append(80, 39);
        r0.append(79, 41);
        r0.append(94, 42);
        r0.append(78, 20);
        r0.append(93, 37);
        r0.append(67, 5);
        r0.append(81, 87);
        r0.append(90, 87);
        r0.append(84, 87);
        r0.append(61, 87);
        r0.append(57, 87);
        r0.append(5, 24);
        r0.append(7, 28);
        r0.append(23, 31);
        r0.append(24, 8);
        r0.append(6, 34);
        r0.append(8, 2);
        r0.append(3, 23);
        r0.append(4, 21);
        r0.append(96, 95);
        r0.append(73, 96);
        r0.append(2, 22);
        r0.append(13, 43);
        r0.append(26, 44);
        r0.append(21, 45);
        r0.append(22, 46);
        r0.append(20, 60);
        r0.append(18, 47);
        r0.append(19, 48);
        r0.append(14, 49);
        r0.append(15, 50);
        r0.append(16, 51);
        r0.append(17, 52);
        r0.append(25, 53);
        r0.append(97, 54);
        r0.append(74, 55);
        r0.append(98, 56);
        r0.append(75, 57);
        r0.append(99, 58);
        r0.append(76, 59);
        r0.append(64, 61);
        r0.append(66, 62);
        r0.append(65, 63);
        r0.append(28, 64);
        r0.append(121, 65);
        r0.append(35, 66);
        r0.append(122, 67);
        r0.append(113, 79);
        r0.append(1, 38);
        r0.append(112, 68);
        r0.append(100, 69);
        r0.append(77, 70);
        r0.append(111, 97);
        r0.append(32, 71);
        r0.append(30, 72);
        r0.append(31, 73);
        r0.append(33, 74);
        r0.append(29, 75);
        r0.append(114, 76);
        r0.append(89, 77);
        r0.append(123, 78);
        r0.append(56, 80);
        r0.append(55, 81);
        r0.append(116, 82);
        r0.append(120, 83);
        r0.append(119, 84);
        r0.append(118, 85);
        r0.append(117, 86);
        r3.append(85, 6);
        r3.append(85, 7);
        r3.append(0, 27);
        r3.append(89, 13);
        r3.append(92, 16);
        r3.append(90, 14);
        r3.append(87, 11);
        r3.append(91, 15);
        r3.append(88, 12);
        r3.append(78, 40);
        r3.append(71, 39);
        r3.append(70, 41);
        r3.append(77, 42);
        r3.append(69, 20);
        r3.append(76, 37);
        r3.append(60, 5);
        r3.append(72, 87);
        r3.append(75, 87);
        r3.append(73, 87);
        r3.append(57, 87);
        r3.append(56, 87);
        r3.append(5, 24);
        r3.append(7, 28);
        r3.append(23, 31);
        r3.append(24, 8);
        r3.append(6, 34);
        r3.append(8, 2);
        r3.append(3, 23);
        r3.append(4, 21);
        r3.append(79, 95);
        r3.append(64, 96);
        r3.append(2, 22);
        r3.append(13, 43);
        r3.append(26, 44);
        r3.append(21, 45);
        r3.append(22, 46);
        r3.append(20, 60);
        r3.append(18, 47);
        r3.append(19, 48);
        r3.append(14, 49);
        r3.append(15, 50);
        r3.append(16, 51);
        r3.append(17, 52);
        r3.append(25, 53);
        r3.append(80, 54);
        r3.append(65, 55);
        r3.append(81, 56);
        r3.append(66, 57);
        r3.append(82, 58);
        r3.append(67, 59);
        r3.append(59, 62);
        r3.append(58, 63);
        r3.append(28, 64);
        r3.append(105, 65);
        r3.append(34, 66);
        r3.append(106, 67);
        r3.append(96, 79);
        r3.append(1, 38);
        r3.append(97, 98);
        r3.append(95, 68);
        r3.append(83, 69);
        r3.append(68, 70);
        r3.append(32, 71);
        r3.append(30, 72);
        r3.append(31, 73);
        r3.append(33, 74);
        r3.append(29, 75);
        r3.append(98, 76);
        r3.append(74, 77);
        r3.append(107, 78);
        r3.append(55, 80);
        r3.append(54, 81);
        r3.append(100, 82);
        r3.append(104, 83);
        r3.append(103, 84);
        r3.append(102, 85);
        r3.append(101, 86);
        r3.append(94, 97);
    }

    public wb0() {
        this.a = new HashMap();
        this.b = true;
        this.c = new HashMap();
    }

    public static int[] d(dp r10, String r11) {
        String[] r12 = r11.split(",");
        Context r0 = r10.getContext();
        int[] r1 = new int[r12.length];
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= r12.length) goto L30;
        String r5 = r12[r3].trim();
        Object r6 = null;
        int r7 = ys3.class.getField(r5).getInt(null);     // Catch: Exception -> L8
    L9:
        if (r7 != 0) goto L11;
        r7 = r0.getResources().getIdentifier(r5, "id", r0.getPackageName());
    L11:
        if (r7 != 0) goto L28;
        if (r10.isInEditMode() == false) goto L28;
        if ((r10.getParent() instanceof ConstraintLayout) == false) goto L28;
        ConstraintLayout r8 = (ConstraintLayout) r10.getParent();
        if (r5 == null) goto L23;
        HashMap r9 = r8.z;
        if (r9 != null) goto L21;
    L24:
        if (r6 == null) goto L28;
        if ((r6 instanceof Integer) == false) goto L28;
        r7 = ((Integer) r6).intValue();
        goto L28
    L21:
        if (r9.containsKey(r5) == false) goto L24;
        r6 = r8.z.get(r5);
        goto L24
    L23:
        r8.getClass();
    L28:
        r1[r4] = r7;
        r3 = r3 + 1;
        r4 = r4 + 1;
    L8:
        r7 = 0;
        goto L9
    L30:
        if (r4 != r12.length) goto L32;
        return r1;
    L32:
        return Arrays.copyOf(r1, r4);
    }

    public static rb0 e(Context r21, AttributeSet r22, boolean r23) {
        rb0 r0 = new rb0();
        if (r23 == false) goto L6;
        int[] r1 = kt3.c;
    L7:
        TypedArray r2 = r21.obtainStyledAttributes(r22, r1);
        String[] r3 = xl.d;
        ub0 r6 = r0.b;
        vb0 r7 = r0.e;
        tb0 r8 = r0.c;
        sb0 r9 = r0.d;
        int[] r10 = d;
        SparseIntArray r15 = e;
        if (r23 == false) goto L113;
        int r4 = r2.getIndexCount();
        qb0 r5 = new qb0();
        r5.a = new int[10];
        r5.b = new int[10];
        r5.c = 0;
        r5.d = new int[10];
        r5.e = new float[10];
        r5.f = 0;
        r5.g = new int[5];
        r5.h = new String[5];
        r5.i = 0;
        r5.j = new int[4];
        r5.k = new boolean[4];
        r5.l = 0;
        r8.getClass();
        r9.getClass();
        r7.getClass();
        int r11 = 0;
    L10:
        if (r11 >= r4) goto L236;
        int r12 = r2.getIndex(r11);
        int r19 = r4;
        switch(f.get(r12)) {
            case 2: goto L111;
            case 3: goto L13;
            case 4: goto L13;
            case 5: goto L110;
            case 6: goto L109;
            case 7: goto L108;
            case 8: goto L107;
            case 9: goto L13;
            case 10: goto L13;
            case 11: goto L106;
            case 12: goto L105;
            case 13: goto L104;
            case 14: goto L103;
            case 15: goto L102;
            case 16: goto L101;
            case 17: goto L100;
            case 18: goto L99;
            case 19: goto L98;
            case 20: goto L97;
            case 21: goto L96;
            case 22: goto L95;
            case 23: goto L94;
            case 24: goto L93;
            case 25: goto L13;
            case 26: goto L13;
            case 27: goto L92;
            case 28: goto L91;
            case 29: goto L13;
            case 30: goto L13;
            case 31: goto L90;
            case 32: goto L13;
            case 33: goto L13;
            case 34: goto L89;
            case 35: goto L13;
            case 36: goto L13;
            case 37: goto L88;
            case 38: goto L87;
            case 39: goto L86;
            case 40: goto L85;
            case 41: goto L84;
            case 42: goto L83;
            case 43: goto L82;
            case 44: goto L81;
            case 45: goto L80;
            case 46: goto L79;
            case 47: goto L78;
            case 48: goto L77;
            case 49: goto L76;
            case 50: goto L75;
            case 51: goto L74;
            case 52: goto L73;
            case 53: goto L72;
            case 54: goto L71;
            case 55: goto L70;
            case 56: goto L69;
            case 57: goto L68;
            case 58: goto L67;
            case 59: goto L66;
            case 60: goto L65;
            case 61: goto L13;
            case 62: goto L64;
            case 63: goto L63;
            case 64: goto L62;
            case 65: goto L58;
            case 66: goto L57;
            case 67: goto L56;
            case 68: goto L55;
            case 69: goto L54;
            case 70: goto L53;
            case 71: goto L52;
            case 72: goto L51;
            case 73: goto L50;
            case 74: goto L49;
            case 75: goto L48;
            case 76: goto L47;
            case 77: goto L46;
            case 78: goto L45;
            case 79: goto L44;
            case 80: goto L43;
            case 81: goto L42;
            case 82: goto L41;
            case 83: goto L40;
            case 84: goto L39;
            case 85: goto L38;
            case 86: goto L26;
            case 87: goto L25;
            case 88: goto L13;
            case 89: goto L13;
            case 90: goto L13;
            case 91: goto L13;
            case 92: goto L13;
            case 93: goto L24;
            case 94: goto L23;
            case 95: goto L22;
            case 96: goto L21;
            case 97: goto L20;
            case 98: goto L16;
            case 99: goto L15;
            default: goto L13;
        };
    L13:
        StringBuilder r13 = new StringBuilder("Unknown attribute 0x");
        int r20 = r11;
        r13.append(Integer.toHexString(r12));
        r13.append("   ");
        r13.append(r15.get(r12));
        Log.w("ConstraintSet", r13.toString());
    L112:
        r11 = r20 + 1;
        r4 = r19;
        goto L10
    L15:
        r20 = r11;
        r5.d(99, r2.getBoolean(r12, r9.g));
        goto L112
    L16:
        r20 = r11;
        int r14 = vx2.D;
        if (r2.peekValue(r12).type != 3) goto L19;
        r2.getString(r12);
        goto L112
    L19:
        r0.a = r2.getResourceId(r12, r0.a);
        goto L112
    L20:
        r20 = r11;
        r5.b(97, r2.getInt(r12, r9.o0));
        goto L112
    L21:
        r20 = r11;
        h(r5, r2, r12, 1);
        goto L112
    L22:
        r20 = r11;
        h(r5, r2, r12, 0);
        goto L112
    L23:
        r20 = r11;
        r5.b(94, r2.getDimensionPixelSize(r12, r9.S));
        goto L112
    L24:
        r20 = r11;
        r5.b(93, r2.getDimensionPixelSize(r12, r9.L));
        goto L112
    L25:
        r20 = r11;
        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(r12) + "   " + r15.get(r12));
        goto L112
    L26:
        r20 = r11;
        int r16 = r2.peekValue(r12).type;
        if (r16 != 1) goto L32;
        int r17 = r2.getResourceId(r12, -1);
        r8.i = r17;
        r5.b(89, r17);
        if (r8.i == (-1)) goto L112;
        r5.b(88, -2);
        goto L112
    L32:
        if (r16 != 3) goto L37;
        String r18 = r2.getString(r12);
        r8.h = r18;
        r5.c(90, r18);
        if (r8.h.indexOf("/") <= 0) goto L36;
        int r24 = r2.getResourceId(r12, -1);
        r8.i = r24;
        r5.b(89, r24);
        r5.b(88, -2);
        goto L112
    L36:
        r5.b(88, -1);
        goto L112
    L37:
        r5.b(88, r2.getInteger(r12, r8.i));
        goto L112
    L38:
        r20 = r11;
        r5.a(85, r2.getFloat(r12, r8.f));
        goto L112
    L39:
        r20 = r11;
        r5.b(84, r2.getInteger(r12, r8.g));
        goto L112
    L40:
        r20 = r11;
        r5.b(83, g(r2, r12, r7.h));
        goto L112
    L41:
        r20 = r11;
        r5.b(82, r2.getInteger(r12, r8.b));
        goto L112
    L42:
        r20 = r11;
        r5.d(81, r2.getBoolean(r12, r9.m0));
        goto L112
    L43:
        r20 = r11;
        r5.d(80, r2.getBoolean(r12, r9.l0));
        goto L112
    L44:
        r20 = r11;
        r5.a(79, r2.getFloat(r12, r8.d));
        goto L112
    L45:
        r20 = r11;
        r5.b(78, r2.getInt(r12, r6.b));
        goto L112
    L46:
        r20 = r11;
        r5.c(77, r2.getString(r12));
        goto L112
    L47:
        r20 = r11;
        r5.b(76, r2.getInt(r12, r8.c));
        goto L112
    L48:
        r20 = r11;
        r5.d(75, r2.getBoolean(r12, r9.n0));
        goto L112
    L49:
        r20 = r11;
        r5.c(74, r2.getString(r12));
        goto L112
    L50:
        r20 = r11;
        r5.b(73, r2.getDimensionPixelSize(r12, r9.g0));
        goto L112
    L51:
        r20 = r11;
        r5.b(72, r2.getInt(r12, r9.f0));
        goto L112
    L52:
        r20 = r11;
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        goto L112
    L53:
        r20 = r11;
        r5.a(70, r2.getFloat(r12, 1.0f));
        goto L112
    L54:
        r20 = r11;
        r5.a(69, r2.getFloat(r12, 1.0f));
        goto L112
    L55:
        r20 = r11;
        r5.a(68, r2.getFloat(r12, r6.d));
        goto L112
    L56:
        r20 = r11;
        r5.a(67, r2.getFloat(r12, r8.e));
        goto L112
    L57:
        r20 = r11;
        r5.b(66, r2.getInt(r12, 0));
        goto L112
    L58:
        r20 = r11;
        if (r2.peekValue(r12).type != 3) goto L61;
        r5.c(65, r2.getString(r12));
        goto L112
    L61:
        r5.c(65, r3[r2.getInteger(r12, 0)]);
        goto L112
    L62:
        r20 = r11;
        r5.b(64, g(r2, r12, r8.a));
        goto L112
    L63:
        r20 = r11;
        r5.a(63, r2.getFloat(r12, r9.B));
        goto L112
    L64:
        r20 = r11;
        r5.b(62, r2.getDimensionPixelSize(r12, r9.A));
        goto L112
    L65:
        r20 = r11;
        r5.a(60, r2.getFloat(r12, r7.a));
        goto L112
    L66:
        r20 = r11;
        r5.b(59, r2.getDimensionPixelSize(r12, r9.c0));
        goto L112
    L67:
        r20 = r11;
        r5.b(58, r2.getDimensionPixelSize(r12, r9.b0));
        goto L112
    L68:
        r20 = r11;
        r5.b(57, r2.getDimensionPixelSize(r12, r9.a0));
        goto L112
    L69:
        r20 = r11;
        r5.b(56, r2.getDimensionPixelSize(r12, r9.Z));
        goto L112
    L70:
        r20 = r11;
        r5.b(55, r2.getInt(r12, r9.Y));
        goto L112
    L71:
        r20 = r11;
        r5.b(54, r2.getInt(r12, r9.X));
        goto L112
    L72:
        r20 = r11;
        r5.a(53, r2.getDimension(r12, r7.k));
        goto L112
    L73:
        r20 = r11;
        r5.a(52, r2.getDimension(r12, r7.j));
        goto L112
    L74:
        r20 = r11;
        r5.a(51, r2.getDimension(r12, r7.i));
        goto L112
    L75:
        r20 = r11;
        r5.a(50, r2.getDimension(r12, r7.g));
        goto L112
    L76:
        r20 = r11;
        r5.a(49, r2.getDimension(r12, r7.f));
        goto L112
    L77:
        r20 = r11;
        r5.a(48, r2.getFloat(r12, r7.e));
        goto L112
    L78:
        r20 = r11;
        r5.a(47, r2.getFloat(r12, r7.d));
        goto L112
    L79:
        r20 = r11;
        r5.a(46, r2.getFloat(r12, r7.c));
        goto L112
    L80:
        r20 = r11;
        r5.a(45, r2.getFloat(r12, r7.b));
        goto L112
    L81:
        r20 = r11;
        r5.d(44, true);
        r5.a(44, r2.getDimension(r12, r7.m));
        goto L112
    L82:
        r20 = r11;
        r5.a(43, r2.getFloat(r12, r6.c));
        goto L112
    L83:
        r20 = r11;
        r5.b(42, r2.getInt(r12, r9.W));
        goto L112
    L84:
        r20 = r11;
        r5.b(41, r2.getInt(r12, r9.V));
        goto L112
    L85:
        r20 = r11;
        r5.a(40, r2.getFloat(r12, r9.T));
        goto L112
    L86:
        r20 = r11;
        r5.a(39, r2.getFloat(r12, r9.U));
        goto L112
    L87:
        r20 = r11;
        int r25 = r2.getResourceId(r12, r0.a);
        r0.a = r25;
        r5.b(38, r25);
        goto L112
    L88:
        r20 = r11;
        r5.a(37, r2.getFloat(r12, r9.x));
        goto L112
    L89:
        r20 = r11;
        r5.b(34, r2.getDimensionPixelSize(r12, r9.H));
        goto L112
    L90:
        r20 = r11;
        r5.b(31, r2.getDimensionPixelSize(r12, r9.K));
        goto L112
    L91:
        r20 = r11;
        r5.b(28, r2.getDimensionPixelSize(r12, r9.G));
        goto L112
    L92:
        r20 = r11;
        r5.b(27, r2.getInt(r12, r9.E));
        goto L112
    L93:
        r20 = r11;
        r5.b(24, r2.getDimensionPixelSize(r12, r9.F));
        goto L112
    L94:
        r20 = r11;
        r5.b(23, r2.getLayoutDimension(r12, r9.b));
        goto L112
    L95:
        r20 = r11;
        r5.b(22, r10[r2.getInt(r12, r6.a)]);
        goto L112
    L96:
        r20 = r11;
        r5.b(21, r2.getLayoutDimension(r12, r9.c));
        goto L112
    L97:
        r20 = r11;
        r5.a(20, r2.getFloat(r12, r9.w));
        goto L112
    L98:
        r20 = r11;
        r5.a(19, r2.getFloat(r12, r9.f));
        goto L112
    L99:
        r20 = r11;
        r5.b(18, r2.getDimensionPixelOffset(r12, r9.e));
        goto L112
    L100:
        r20 = r11;
        r5.b(17, r2.getDimensionPixelOffset(r12, r9.d));
        goto L112
    L101:
        r20 = r11;
        r5.b(16, r2.getDimensionPixelSize(r12, r9.N));
        goto L112
    L102:
        r20 = r11;
        r5.b(15, r2.getDimensionPixelSize(r12, r9.R));
        goto L112
    L103:
        r20 = r11;
        r5.b(14, r2.getDimensionPixelSize(r12, r9.O));
        goto L112
    L104:
        r20 = r11;
        r5.b(13, r2.getDimensionPixelSize(r12, r9.M));
        goto L112
    L105:
        r20 = r11;
        r5.b(12, r2.getDimensionPixelSize(r12, r9.Q));
        goto L112
    L106:
        r20 = r11;
        r5.b(11, r2.getDimensionPixelSize(r12, r9.P));
        goto L112
    L107:
        r20 = r11;
        r5.b(8, r2.getDimensionPixelSize(r12, r9.J));
        goto L112
    L108:
        r20 = r11;
        r5.b(7, r2.getDimensionPixelOffset(r12, r9.D));
        goto L112
    L109:
        r20 = r11;
        r5.b(6, r2.getDimensionPixelOffset(r12, r9.C));
        goto L112
    L110:
        r20 = r11;
        r5.c(5, r2.getString(r12));
        goto L112
    L111:
        r20 = r11;
        r5.b(2, r2.getDimensionPixelSize(r12, r9.I));
    L236:
        r2.recycle();
        return r0;
    L113:
        int r26 = r2.getIndexCount();
        int r110 = 0;
    L114:
        if (r110 >= r26) goto L234;
        int r27 = r2.getIndex(r110);
        if (r27 == 1) goto L124;
        if (23 == r27) goto L124;
        if (24 == r27) goto L124;
        r8.getClass();
        r9.getClass();
        r7.getClass();
    L124:
        switch(r15.get(r27)) {
            case 1: goto L231;
            case 2: goto L230;
            case 3: goto L229;
            case 4: goto L228;
            case 5: goto L227;
            case 6: goto L226;
            case 7: goto L225;
            case 8: goto L224;
            case 9: goto L223;
            case 10: goto L222;
            case 11: goto L221;
            case 12: goto L220;
            case 13: goto L219;
            case 14: goto L218;
            case 15: goto L217;
            case 16: goto L216;
            case 17: goto L215;
            case 18: goto L214;
            case 19: goto L213;
            case 20: goto L212;
            case 21: goto L211;
            case 22: goto L210;
            case 23: goto L209;
            case 24: goto L208;
            case 25: goto L207;
            case 26: goto L206;
            case 27: goto L205;
            case 28: goto L204;
            case 29: goto L203;
            case 30: goto L202;
            case 31: goto L201;
            case 32: goto L200;
            case 33: goto L199;
            case 34: goto L198;
            case 35: goto L197;
            case 36: goto L196;
            case 37: goto L195;
            case 38: goto L194;
            case 39: goto L193;
            case 40: goto L192;
            case 41: goto L191;
            case 42: goto L190;
            case 43: goto L189;
            case 44: goto L188;
            case 45: goto L187;
            case 46: goto L186;
            case 47: goto L185;
            case 48: goto L184;
            case 49: goto L183;
            case 50: goto L182;
            case 51: goto L181;
            case 52: goto L180;
            case 53: goto L179;
            case 54: goto L178;
            case 55: goto L177;
            case 56: goto L176;
            case 57: goto L175;
            case 58: goto L174;
            case 59: goto L173;
            case 60: goto L172;
            case 61: goto L171;
            case 62: goto L170;
            case 63: goto L169;
            case 64: goto L168;
            case 65: goto L164;
            case 66: goto L163;
            case 67: goto L162;
            case 68: goto L161;
            case 69: goto L160;
            case 70: goto L159;
            case 71: goto L158;
            case 72: goto L157;
            case 73: goto L156;
            case 74: goto L155;
            case 75: goto L154;
            case 76: goto L153;
            case 77: goto L152;
            case 78: goto L151;
            case 79: goto L150;
            case 80: goto L149;
            case 81: goto L148;
            case 82: goto L147;
            case 83: goto L146;
            case 84: goto L145;
            case 85: goto L144;
            case 86: goto L135;
            case 87: goto L134;
            case 88: goto L125;
            case 89: goto L125;
            case 90: goto L125;
            case 91: goto L133;
            case 92: goto L132;
            case 93: goto L131;
            case 94: goto L130;
            case 95: goto L129;
            case 96: goto L128;
            case 97: goto L127;
            default: goto L125;
        };
    L125:
        StringBuilder r111 = new StringBuilder("Unknown attribute 0x");
        int r28 = r26;
        r111.append(Integer.toHexString(r27));
        r111.append("   ");
        r111.append(r15.get(r27));
        Log.w("ConstraintSet", r111.toString());
    L232:
        r110 = r110 + 1;
        r26 = r28;
        goto L114
    L127:
        r28 = r26;
        r9.o0 = r2.getInt(r27, r9.o0);
        goto L232
    L128:
        r28 = r26;
        h(r9, r2, r27, 1);
        goto L232
    L129:
        r28 = r26;
        h(r9, r2, r27, 0);
        goto L232
    L130:
        r28 = r26;
        r9.S = r2.getDimensionPixelSize(r27, r9.S);
        goto L232
    L131:
        r28 = r26;
        r9.L = r2.getDimensionPixelSize(r27, r9.L);
        goto L232
    L132:
        r28 = r26;
        r9.r = g(r2, r27, r9.r);
        goto L232
    L133:
        r28 = r26;
        r9.q = g(r2, r27, r9.q);
        goto L232
    L134:
        r28 = r26;
        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(r27) + "   " + r15.get(r27));
        goto L232
    L135:
        r28 = r26;
        int r29 = r2.peekValue(r27).type;
        if (r29 != 1) goto L139;
        r8.i = r2.getResourceId(r27, -1);
        goto L232
    L139:
        if (r29 != 3) goto L143;
        String r30 = r2.getString(r27);
        r8.h = r30;
        if (r30.indexOf("/") <= 0) goto L232;
        r8.i = r2.getResourceId(r27, -1);
        goto L232
    L143:
        r2.getInteger(r27, r8.i);
        goto L232
    L144:
        r28 = r26;
        r8.f = r2.getFloat(r27, r8.f);
        goto L232
    L145:
        r28 = r26;
        r8.g = r2.getInteger(r27, r8.g);
        goto L232
    L146:
        r28 = r26;
        r7.h = g(r2, r27, r7.h);
        goto L232
    L147:
        r28 = r26;
        r8.b = r2.getInteger(r27, r8.b);
        goto L232
    L148:
        r28 = r26;
        r9.m0 = r2.getBoolean(r27, r9.m0);
        goto L232
    L149:
        r28 = r26;
        r9.l0 = r2.getBoolean(r27, r9.l0);
        goto L232
    L150:
        r28 = r26;
        r8.d = r2.getFloat(r27, r8.d);
        goto L232
    L151:
        r28 = r26;
        r6.b = r2.getInt(r27, r6.b);
        goto L232
    L152:
        r28 = r26;
        r9.k0 = r2.getString(r27);
        goto L232
    L153:
        r28 = r26;
        r8.c = r2.getInt(r27, r8.c);
        goto L232
    L154:
        r28 = r26;
        r9.n0 = r2.getBoolean(r27, r9.n0);
        goto L232
    L155:
        r28 = r26;
        r9.j0 = r2.getString(r27);
        goto L232
    L156:
        r28 = r26;
        r9.g0 = r2.getDimensionPixelSize(r27, r9.g0);
        goto L232
    L157:
        r28 = r26;
        r9.f0 = r2.getInt(r27, r9.f0);
        goto L232
    L158:
        r28 = r26;
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        goto L232
    L159:
        r28 = r26;
        r9.e0 = r2.getFloat(r27, 1.0f);
        goto L232
    L160:
        r28 = r26;
        r9.d0 = r2.getFloat(r27, 1.0f);
        goto L232
    L161:
        r28 = r26;
        r6.d = r2.getFloat(r27, r6.d);
        goto L232
    L162:
        r28 = r26;
        r8.e = r2.getFloat(r27, r8.e);
        goto L232
    L163:
        r28 = r26;
        r2.getInt(r27, 0);
        r8.getClass();
        goto L232
    L164:
        r28 = r26;
        if (r2.peekValue(r27).type != 3) goto L167;
        r2.getString(r27);
        r8.getClass();
        goto L232
    L167:
        String r31 = r3[r2.getInteger(r27, 0)];
        r8.getClass();
        goto L232
    L168:
        r28 = r26;
        r8.a = g(r2, r27, r8.a);
        goto L232
    L169:
        r28 = r26;
        r9.B = r2.getFloat(r27, r9.B);
        goto L232
    L170:
        r28 = r26;
        r9.A = r2.getDimensionPixelSize(r27, r9.A);
        goto L232
    L171:
        r28 = r26;
        r9.z = g(r2, r27, r9.z);
        goto L232
    L172:
        r28 = r26;
        r7.a = r2.getFloat(r27, r7.a);
        goto L232
    L173:
        r28 = r26;
        r9.c0 = r2.getDimensionPixelSize(r27, r9.c0);
        goto L232
    L174:
        r28 = r26;
        r9.b0 = r2.getDimensionPixelSize(r27, r9.b0);
        goto L232
    L175:
        r28 = r26;
        r9.a0 = r2.getDimensionPixelSize(r27, r9.a0);
        goto L232
    L176:
        r28 = r26;
        r9.Z = r2.getDimensionPixelSize(r27, r9.Z);
        goto L232
    L177:
        r28 = r26;
        r9.Y = r2.getInt(r27, r9.Y);
        goto L232
    L178:
        r28 = r26;
        r9.X = r2.getInt(r27, r9.X);
        goto L232
    L179:
        r28 = r26;
        r7.k = r2.getDimension(r27, r7.k);
        goto L232
    L180:
        r28 = r26;
        r7.j = r2.getDimension(r27, r7.j);
        goto L232
    L181:
        r28 = r26;
        r7.i = r2.getDimension(r27, r7.i);
        goto L232
    L182:
        r28 = r26;
        r7.g = r2.getDimension(r27, r7.g);
        goto L232
    L183:
        r28 = r26;
        r7.f = r2.getDimension(r27, r7.f);
        goto L232
    L184:
        r28 = r26;
        r7.e = r2.getFloat(r27, r7.e);
        goto L232
    L185:
        r28 = r26;
        r7.d = r2.getFloat(r27, r7.d);
        goto L232
    L186:
        r28 = r26;
        r7.c = r2.getFloat(r27, r7.c);
        goto L232
    L187:
        r28 = r26;
        r7.b = r2.getFloat(r27, r7.b);
        goto L232
    L188:
        r28 = r26;
        r7.l = true;
        r7.m = r2.getDimension(r27, r7.m);
        goto L232
    L189:
        r28 = r26;
        r6.c = r2.getFloat(r27, r6.c);
        goto L232
    L190:
        r28 = r26;
        r9.W = r2.getInt(r27, r9.W);
        goto L232
    L191:
        r28 = r26;
        r9.V = r2.getInt(r27, r9.V);
        goto L232
    L192:
        r28 = r26;
        r9.T = r2.getFloat(r27, r9.T);
        goto L232
    L193:
        r28 = r26;
        r9.U = r2.getFloat(r27, r9.U);
        goto L232
    L194:
        r28 = r26;
        r0.a = r2.getResourceId(r27, r0.a);
        goto L232
    L195:
        r28 = r26;
        r9.x = r2.getFloat(r27, r9.x);
        goto L232
    L196:
        r28 = r26;
        r9.l = g(r2, r27, r9.l);
        goto L232
    L197:
        r28 = r26;
        r9.m = g(r2, r27, r9.m);
        goto L232
    L198:
        r28 = r26;
        r9.H = r2.getDimensionPixelSize(r27, r9.H);
        goto L232
    L199:
        r28 = r26;
        r9.t = g(r2, r27, r9.t);
        goto L232
    L200:
        r28 = r26;
        r9.s = g(r2, r27, r9.s);
        goto L232
    L201:
        r28 = r26;
        r9.K = r2.getDimensionPixelSize(r27, r9.K);
        goto L232
    L202:
        r28 = r26;
        r9.k = g(r2, r27, r9.k);
        goto L232
    L203:
        r28 = r26;
        r9.j = g(r2, r27, r9.j);
        goto L232
    L204:
        r28 = r26;
        r9.G = r2.getDimensionPixelSize(r27, r9.G);
        goto L232
    L205:
        r28 = r26;
        r9.E = r2.getInt(r27, r9.E);
        goto L232
    L206:
        r28 = r26;
        r9.i = g(r2, r27, r9.i);
        goto L232
    L207:
        r28 = r26;
        r9.h = g(r2, r27, r9.h);
        goto L232
    L208:
        r28 = r26;
        r9.F = r2.getDimensionPixelSize(r27, r9.F);
        goto L232
    L209:
        r28 = r26;
        r9.b = r2.getLayoutDimension(r27, r9.b);
        goto L232
    L210:
        r28 = r26;
        int r32 = r2.getInt(r27, r6.a);
        r6.a = r32;
        r6.a = r10[r32];
        goto L232
    L211:
        r28 = r26;
        r9.c = r2.getLayoutDimension(r27, r9.c);
        goto L232
    L212:
        r28 = r26;
        r9.w = r2.getFloat(r27, r9.w);
        goto L232
    L213:
        r28 = r26;
        r9.f = r2.getFloat(r27, r9.f);
        goto L232
    L214:
        r28 = r26;
        r9.e = r2.getDimensionPixelOffset(r27, r9.e);
        goto L232
    L215:
        r28 = r26;
        r9.d = r2.getDimensionPixelOffset(r27, r9.d);
        goto L232
    L216:
        r28 = r26;
        r9.N = r2.getDimensionPixelSize(r27, r9.N);
        goto L232
    L217:
        r28 = r26;
        r9.R = r2.getDimensionPixelSize(r27, r9.R);
        goto L232
    L218:
        r28 = r26;
        r9.O = r2.getDimensionPixelSize(r27, r9.O);
        goto L232
    L219:
        r28 = r26;
        r9.M = r2.getDimensionPixelSize(r27, r9.M);
        goto L232
    L220:
        r28 = r26;
        r9.Q = r2.getDimensionPixelSize(r27, r9.Q);
        goto L232
    L221:
        r28 = r26;
        r9.P = r2.getDimensionPixelSize(r27, r9.P);
        goto L232
    L222:
        r28 = r26;
        r9.u = g(r2, r27, r9.u);
        goto L232
    L223:
        r28 = r26;
        r9.v = g(r2, r27, r9.v);
        goto L232
    L224:
        r28 = r26;
        r9.J = r2.getDimensionPixelSize(r27, r9.J);
        goto L232
    L225:
        r28 = r26;
        r9.D = r2.getDimensionPixelOffset(r27, r9.D);
        goto L232
    L226:
        r28 = r26;
        r9.C = r2.getDimensionPixelOffset(r27, r9.C);
        goto L232
    L227:
        r28 = r26;
        r9.y = r2.getString(r27);
        goto L232
    L228:
        r28 = r26;
        r9.n = g(r2, r27, r9.n);
        goto L232
    L229:
        r28 = r26;
        r9.o = g(r2, r27, r9.o);
        goto L232
    L230:
        r28 = r26;
        r9.I = r2.getDimensionPixelSize(r27, r9.I);
        goto L232
    L231:
        r28 = r26;
        r9.p = g(r2, r27, r9.p);
        goto L232
    L234:
        if (r9.j0 == null) goto L236;
        r9.i0 = null;
        goto L236
    L6:
        r1 = kt3.a;
        goto L7
    }

    public static int g(TypedArray r1, int r2, int r3) {
        int r4 = r1.getResourceId(r2, r3);
        if (r4 == (-1)) goto L5;
        return r4;
    L5:
        return r1.getInt(r2, -1);
    }

    public static void h(Object r7, TypedArray r8, int r9, int r10) {
        if (r7 == null) goto L131;
        int r0 = r8.peekValue(r9).type;
        boolean r4 = true;
        int r6 = 0;
        if (r0 == 3) goto L42;
        if (r0 == 5) goto L17;
        int r11 = r8.getInt(r9, 0);
        if (r11 != (-4)) goto L10;
        r6 = -2;
    L19:
        if ((r7 instanceof mb0) == false) goto L27;
        mb0 r12 = (mb0) r7;
        if (r10 != 0) goto L24;
        ((ViewGroup.MarginLayoutParams) r12).width = r6;
        r12.W = r4;
        return;
    L24:
        ((ViewGroup.MarginLayoutParams) r12).height = r6;
        r12.X = r4;
        return;
    L27:
        if ((r7 instanceof sb0) == false) goto L35;
        sb0 r13 = (sb0) r7;
        if (r10 != 0) goto L32;
        r13.b = r6;
        r13.l0 = r4;
        return;
    L32:
        r13.c = r6;
        r13.m0 = r4;
        return;
    L35:
        if ((r7 instanceof qb0) == false) goto L123;
        qb0 r14 = (qb0) r7;
        if (r10 != 0) goto L40;
        r14.b(23, r6);
        r14.d(80, r4);
        return;
    L40:
        r14.b(21, r6);
        r14.d(81, r4);
        return;
    L123:
        return;
    L10:
        if (r11 == (-3)) goto L14;
        if (r11 != (-2)) goto L13;
    L15:
        r4 = false;
        r6 = r11;
        goto L19
    L13:
        if (r11 == (-1)) goto L15;
    L14:
        r4 = false;
        goto L19
    L17:
        r11 = r8.getDimensionPixelSize(r9, 0);
        goto L15
    L42:
        String r15 = r8.getString(r9);
        if (r15 == null) goto L132;
        int r16 = r15.indexOf(61);
        int r1 = r15.length();
        if (r16 > 0) goto L48;
        return;
    L48:
        if (r16 >= (r1 - 1)) goto L125;
        String r2 = r15.substring(0, r16);
        String r17 = r15.substring(r16 + 1);
        if (r17.length() <= 0) goto L126;
        String r18 = r2.trim();
        String r19 = r17.trim();
        if ("ratio".equalsIgnoreCase(r18) == false) goto L122;
        if ((r7 instanceof mb0) == false) goto L62;
        mb0 r20 = (mb0) r7;
        if (r10 != 0) goto L58;
        ((ViewGroup.MarginLayoutParams) r20).width = 0;
    L59:
        i(r20, r19);
        return;
    L58:
        ((ViewGroup.MarginLayoutParams) r20).height = 0;
        goto L59
    L62:
        if ((r7 instanceof sb0) == false) goto L66;
        ((sb0) r7).y = r19;
        return;
    L66:
        if ((r7 instanceof qb0) == false) goto L127;
        ((qb0) r7).c(5, r19);
        return;
    L127:
        return;
    L122:
        if ("weight".equalsIgnoreCase(r18) == false) goto L96;
        float r21 = Float.parseFloat(r19);     // Catch: NumberFormatException -> L121
        if ((r7 instanceof mb0) == false) goto L80;
        mb0 r22 = (mb0) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L77;
        ((ViewGroup.MarginLayoutParams) r22).width = 0;     // Catch: NumberFormatException -> L121
        r22.H = r21;     // Catch: NumberFormatException -> L121
        return;
    L77:
        ((ViewGroup.MarginLayoutParams) r22).height = 0;     // Catch: NumberFormatException -> L121
        r22.I = r21;     // Catch: NumberFormatException -> L121
        return;
    L80:
        if ((r7 instanceof sb0) == false) goto L88;
        sb0 r23 = (sb0) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L85;
        r23.b = 0;     // Catch: NumberFormatException -> L121
        r23.U = r21;     // Catch: NumberFormatException -> L121
        return;
    L85:
        r23.c = 0;     // Catch: NumberFormatException -> L121
        r23.T = r21;     // Catch: NumberFormatException -> L121
        return;
    L88:
        if ((r7 instanceof qb0) == false) goto L128;
        qb0 r24 = (qb0) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L93;
        r24.b(23, 0);     // Catch: NumberFormatException -> L121
        r24.a(39, r21);     // Catch: NumberFormatException -> L121
        return;
    L93:
        r24.b(21, 0);     // Catch: NumberFormatException -> L121
        r24.a(40, r21);     // Catch: NumberFormatException -> L121
        return;
    L128:
        return;
    L96:
        if ("parent".equalsIgnoreCase(r18) == false) goto L129;
        float r25 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(r19)));     // Catch: NumberFormatException -> L121
        if ((r7 instanceof mb0) == false) goto L106;
        mb0 r26 = (mb0) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L103;
        ((ViewGroup.MarginLayoutParams) r26).width = 0;     // Catch: NumberFormatException -> L121
        r26.R = r25;     // Catch: NumberFormatException -> L121
        r26.L = 2;     // Catch: NumberFormatException -> L121
        return;
    L103:
        ((ViewGroup.MarginLayoutParams) r26).height = 0;     // Catch: NumberFormatException -> L121
        r26.S = r25;     // Catch: NumberFormatException -> L121
        r26.M = 2;     // Catch: NumberFormatException -> L121
        return;
    L106:
        if ((r7 instanceof sb0) == false) goto L114;
        sb0 r27 = (sb0) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L111;
        r27.b = 0;     // Catch: NumberFormatException -> L121
        r27.d0 = r25;     // Catch: NumberFormatException -> L121
        r27.X = 2;     // Catch: NumberFormatException -> L121
        return;
    L111:
        r27.c = 0;     // Catch: NumberFormatException -> L121
        r27.e0 = r25;     // Catch: NumberFormatException -> L121
        r27.Y = 2;     // Catch: NumberFormatException -> L121
        return;
    L114:
        if ((r7 instanceof qb0) == false) goto L130;
        qb0 r28 = (qb0) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L119;
        r28.b(23, 0);     // Catch: NumberFormatException -> L121
        r28.b(54, 2);     // Catch: NumberFormatException -> L121
        return;
    L119:
        r28.b(21, 0);     // Catch: NumberFormatException -> L121
        r28.b(55, 2);     // Catch: NumberFormatException -> L121
        return;
    L130:
        return;
    L129:
        return;
    L133:
        return;
    L126:
        return;
    L125:
        return;
    L132:
        return;
    }

    public static void i(mb0 r7, String r8) {
        if (r8 == null) goto L34;
        int r0 = r8.length();
        int r1 = r8.indexOf(44);
        int r2 = 0;
        int r4 = -1;
        if (r1 > 0) goto L6;
    L15:
        int r3 = r8.indexOf(58);
        if (r3 >= 0) goto L18;
    L31:
        String r5 = r8.substring(r2);
        if (r5.length() <= 0) goto L34;
        Float.parseFloat(r5);     // Catch: NumberFormatException -> L36
    L37:
        goto L34
    L18:
        if (r3 >= (r0 - 1)) goto L31;
        String r6 = r8.substring(r2, r3);
        String r9 = r8.substring(r3 + 1);
        if (r6.length() <= 0) goto L34;
        if (r9.length() <= 0) goto L34;
        float r10 = Float.parseFloat(r6);     // Catch: NumberFormatException -> L36
        float r11 = Float.parseFloat(r9);     // Catch: NumberFormatException -> L36
        if (r10 <= 0.0f) goto L37;
        if (r11 <= 0.0f) goto L37;
        if (r4 != 1) goto L29;
        Math.abs(r11 / r10);     // Catch: NumberFormatException -> L36
        goto L37
    L29:
        Math.abs(r10 / r11);     // Catch: NumberFormatException -> L36
        goto L37
    L6:
        if (r1 >= (r0 - 1)) goto L15;
        String r12 = r8.substring(0, r1);
        if (r12.equalsIgnoreCase("W") == false) goto L11;
    L14:
        r4 = r2;
        r2 = r1 + 1;
        goto L15
    L11:
        if (r12.equalsIgnoreCase("H") == false) goto L13;
        r2 = 1;
        goto L14
    L13:
        r2 = -1;
    L34:
        r7.G = r8;
    }

    public static String j(int r0) {
        switch(r0) {
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            case 7: goto L5;
            default: goto L3;
        };
    L3:
        return "undefined";
    L5:
        return "end";
    L7:
        return PlayEvent.START;
    L9:
        return "baseline";
    L11:
        return "bottom";
    L13:
        return "top";
    L15:
        return "right";
    L17:
        return "left";
    }

    public final void a(ConstraintLayout r23) {
        wb0 r1 = this;
        int r3 = r23.getChildCount();
        HashMap r5 = r1.c;
        HashSet r4 = new HashSet(r5.keySet());
        int r7 = 0;
    L4:
        if (r7 >= r3) goto L96;
        View r8 = r23.getChildAt(r7);
        int r9 = r8.getId();
        if (r5.containsKey(Integer.valueOf(r9)) == true) goto L14;
        StringBuilder r0 = new StringBuilder("id unknown ");
        String r10 = r8.getContext().getResources().getResourceEntryName(r8.getId());     // Catch: Exception -> L10
    L11:
        r0.append(r10);
        Log.w("ConstraintSet", r0.toString());
    L12:
        HashSet r17 = r4;
        int r18 = r7;
    L95:
        r7 = r18 + 1;
        r1 = this;
        r4 = r17;
    L10:
        r10 = "UNKNOWN";
        goto L11
    L14:
        if (r1.b == false) goto L19;
        if (r9 != (-1)) goto L19;
        tb4.e("All children of ConstraintLayout must have ids to use ConstraintSet");
        return;
    L19:
        if (r9 == (-1)) goto L12;
        if (r5.containsKey(Integer.valueOf(r9)) == false) goto L94;
        r4.remove(Integer.valueOf(r9));
        rb0 r11 = (rb0) r5.get(Integer.valueOf(r9));
        if (r11 == null) goto L12;
        ub0 r12 = r11.b;
        sb0 r13 = r11.d;
        vb0 r14 = r11.e;
        if ((r8 instanceof dp) == false) goto L34;
        r13.h0 = 1;
        dp r2 = (dp) r8;
        r2.setId(r9);
        r2.setType(r13.f0);
        r2.setMargin(r13.g0);
        r2.setAllowsGoneWidget(r13.n0);
        int[] r15 = r13.i0;
        if (r15 == null) goto L31;
        r2.setReferencedIds(r15);
        goto L34
    L31:
        String r16 = r13.j0;
        if (r16 == null) goto L34;
        int[] r19 = d(r2, r16);
        r13.i0 = r19;
        r2.setReferencedIds(r19);
    L34:
        mb0 r20 = (mb0) r8.getLayoutParams();
        r20.a();
        r11.a(r20);
        HashMap r110 = r11.f;
        Class<?> r111 = r8.getClass();
        Iterator r112 = r110.keySet().iterator();
    L36:
        if (r112.hasNext() == false) goto L73;
        String r6 = (String) r112.next();
        ib0 r21 = (ib0) r110.get(r6);
        HashSet r113 = r4;
        if (r21.a == true) goto L41;
        String r22 = xa3.g("set", r6);
    L40:
        int r114 = r7;
        int r24 = xa3.w(r21.b);     // Catch: InvocationTargetException -> L47 IllegalAccessException -> L49 NoSuchMethodException -> L51
        Class r115 = Float.TYPE;
        Class r25 = Integer.TYPE;
        switch(r24) {
            case 0: goto L67;
            case 1: goto L66;
            case 2: goto L65;
            case 3: goto L56;
            case 4: goto L55;
            case 5: goto L54;
            case 6: goto L53;
            case 7: goto L46;
            default: goto L45;
        };
    L45:
        HashMap r26 = r110;
    L72:
        r4 = r113;
        r7 = r114;
        r110 = r26;
        goto L36
    L46:
        r111.getMethod(r22, new Class[]{r25}).invoke(r8, new Object[]{Integer.valueOf(r21.c)});     // Catch: InvocationTargetException -> L47 IllegalAccessException -> L49 NoSuchMethodException -> L51
        goto L45
    L53:
        r111.getMethod(r22, new Class[]{r115}).invoke(r8, new Object[]{Float.valueOf(r21.d)});     // Catch: InvocationTargetException -> L47 IllegalAccessException -> L49 NoSuchMethodException -> L51
        goto L45
    L54:
        r111.getMethod(r22, new Class[]{Boolean.TYPE}).invoke(r8, new Object[]{Boolean.valueOf(r21.f)});     // Catch: InvocationTargetException -> L47 IllegalAccessException -> L49 NoSuchMethodException -> L51
        goto L45
    L55:
        r111.getMethod(r22, new Class[]{CharSequence.class}).invoke(r8, new Object[]{r21.e});     // Catch: InvocationTargetException -> L47 IllegalAccessException -> L49 NoSuchMethodException -> L51
        goto L45
    L56:
        Method r27 = r111.getMethod(r22, new Class[]{Drawable.class});     // Catch: InvocationTargetException -> L47 IllegalAccessException -> L49 NoSuchMethodException -> L51
        r26 = r110;
        ColorDrawable r116 = new ColorDrawable();     // Catch: InvocationTargetException -> L59 IllegalAccessException -> L61 NoSuchMethodException -> L63
        r116.setColor(r21.g);     // Catch: InvocationTargetException -> L59 IllegalAccessException -> L61 NoSuchMethodException -> L63
        r27.invoke(r8, new Object[]{r116});     // Catch: InvocationTargetException -> L59 IllegalAccessException -> L61 NoSuchMethodException -> L63
    L61:
        e = e;
    L70:
        StringBuilder r28 = xa3.j(" Custom Attribute \"", r6, "\" not found on ");
        r28.append(r111.getName());
        Log.e("TransitionLayout", r28.toString(), e);
    L63:
        e = e;
    L71:
        Log.e("TransitionLayout", r111.getName() + " must have a method " + r22, e);
    L59:
        e = e;
    L69:
        StringBuilder r29 = xa3.j(" Custom Attribute \"", r6, "\" not found on ");
        r29.append(r111.getName());
        Log.e("TransitionLayout", r29.toString(), e);
        goto L72
    L65:
        r26 = r110;
        r111.getMethod(r22, new Class[]{r25}).invoke(r8, new Object[]{Integer.valueOf(r21.g)});     // Catch: InvocationTargetException -> L59 IllegalAccessException -> L61 NoSuchMethodException -> L63
        goto L72
    L66:
        r26 = r110;
        r111.getMethod(r22, new Class[]{r115}).invoke(r8, new Object[]{Float.valueOf(r21.d)});     // Catch: InvocationTargetException -> L59 IllegalAccessException -> L61 NoSuchMethodException -> L63
        goto L72
    L67:
        r26 = r110;
        r111.getMethod(r22, new Class[]{r25}).invoke(r8, new Object[]{Integer.valueOf(r21.c)});     // Catch: InvocationTargetException -> L59 IllegalAccessException -> L61 NoSuchMethodException -> L63
        goto L72
    L49:
        e = e;
        r26 = r110;
    L51:
        e = e;
        r26 = r110;
    L47:
        e = e;
        r26 = r110;
        goto L69
    L41:
        r22 = r6;
        goto L40
    L73:
        r17 = r4;
        r18 = r7;
        r8.setLayoutParams(r20);
        if (r12.b != 0) goto L76;
        r8.setVisibility(r12.a);
    L76:
        r8.setAlpha(r12.c);
        r8.setRotation(r14.a);
        r8.setRotationX(r14.b);
        r8.setRotationY(r14.c);
        r8.setScaleX(r14.d);
        r8.setScaleY(r14.e);
        if (r14.h == (-1)) goto L86;
        View r30 = ((View) r8.getParent()).findViewById(r14.h);
        if (r30 == null) goto L91;
        float r31 = (r30.getBottom() + r30.getTop()) / 2.0f;
        float r32 = (r30.getRight() + r30.getLeft()) / 2.0f;
        if ((r8.getRight() - r8.getLeft()) <= 0) goto L91;
        if ((r8.getBottom() - r8.getTop()) <= 0) goto L91;
        float r33 = r32 - r8.getLeft();
        float r34 = r31 - r8.getTop();
        r8.setPivotX(r33);
        r8.setPivotY(r34);
    L91:
        r8.setTranslationX(r14.i);
        r8.setTranslationY(r14.j);
        r8.setTranslationZ(r14.k);
        if (r14.l == false) goto L95;
        r8.setElevation(r14.m);
        goto L95
    L86:
        if (Float.isNaN(r14.f) == true) goto L89;
        r8.setPivotX(r14.f);
    L89:
        if (Float.isNaN(r14.g) == true) goto L91;
        r8.setPivotY(r14.g);
        goto L91
    L94:
        r17 = r4;
        r18 = r7;
        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + r9);
        goto L95
    L96:
        Iterator r35 = r4.iterator();
    L98:
        if (r35.hasNext() == false) goto L115;
        Integer r36 = (Integer) r35.next();
        rb0 r37 = (rb0) r5.get(r36);
        if (r37 == null) goto L98;
        sb0 r38 = r37.d;
        if (r38.h0 != 1) goto L113;
        Context r117 = r23.getContext();
        dp r39 = new dp(r117);
        r39.n = new int[32];
        r39.t = new HashMap();
        r39.p = r117;
        ep r118 = new ep();
        r118.p0 = new jc0[4];
        r118.q0 = 0;
        r118.r0 = 0;
        r118.s0 = true;
        r118.t0 = 0;
        r118.u0 = false;
        r39.w = r118;
        r39.q = r118;
        r39.e();
        r39.setVisibility(8);
        r39.setId(r36.intValue());
        int[] r119 = r38.i0;
        if (r119 == null) goto L107;
        r39.setReferencedIds(r119);
    L110:
        r39.setType(r38.f0);
        r39.setMargin(r38.g0);
        fd4 r120 = ConstraintLayout.C;
        mb0 r121 = new mb0(-2, -2);
        r39.e();
        r37.a(r121);
        r23.addView(r39, r121);
        goto L113
    L107:
        String r122 = r38.j0;
        if (r122 == null) goto L110;
        int[] r123 = d(r39, r122);
        r38.i0 = r123;
        r39.setReferencedIds(r123);
    L113:
        if (r38.a == false) goto L98;
        View r40 = new Guideline(r23.getContext());
        r40.setId(r36.intValue());
        fd4 r41 = ConstraintLayout.C;
        mb0 r42 = new mb0(-2, -2);
        r37.a(r42);
        r23.addView(r40, r42);
        goto L98
    L115:
        int r43 = 0;
    L116:
        if (r43 >= r3) goto L118;
        r23.getChildAt(r43);
        r43 = r43 + 1;
        goto L116
    }

    public final void b(ConstraintLayout r22) {
        wb0 r1 = this;
        int r2 = r22.getChildCount();
        HashMap r3 = r1.c;
        r3.clear();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L48;
        View r6 = r22.getChildAt(r4);
        mb0 r7 = (mb0) r6.getLayoutParams();
        int r8 = r6.getId();
        if (r1.b == false) goto L12;
        if (r8 != (-1)) goto L12;
        tb4.e("All children of ConstraintLayout must have ids to use ConstraintSet");
        return;
    L12:
        if (r3.containsKey(Integer.valueOf(r8)) == true) goto L14;
        r3.put(Integer.valueOf(r8), new rb0());
    L14:
        rb0 r9 = (rb0) r3.get(Integer.valueOf(r8));
        if (r9 != null) goto L17;
        int r16 = r2;
        HashMap r17 = r3;
        int r18 = r4;
    L47:
        r4 = r18 + 1;
        r1 = this;
        r2 = r16;
        r3 = r17;
        goto L3
    L17:
        ub0 r10 = r9.b;
        sb0 r11 = r9.d;
        vb0 r12 = r9.e;
        r16 = r2;
        HashMap r5 = new HashMap();
        r17 = r3;
        Class<?> r13 = r6.getClass();
        r18 = r4;
        HashMap r14 = r1.a;
        Iterator r19 = r14.keySet().iterator();
    L19:
        if (r19.hasNext() == false) goto L36;
        String r15 = (String) r19.next();
        ib0 r0 = (ib0) r14.get(r15);
        HashMap r20 = r14;
        if (r15.equals("BackgroundColor") == false) goto L30;
        r5.put(r15, new ib0(r0, Integer.valueOf(((ColorDrawable) r6.getBackground()).getColor())));     // Catch: InvocationTargetException -> L24 IllegalAccessException -> L26 NoSuchMethodException -> L28
    L35:
        r14 = r20;
        goto L19
    L30:
        r5.put(r15, new ib0(r0, r13.getMethod("getMap" + r15, null).invoke(r6, null)));     // Catch: InvocationTargetException -> L24 IllegalAccessException -> L26 NoSuchMethodException -> L28
        goto L35
    L26:
        e = move-exception;
        StringBuilder r21 = xa3.j(" Custom Attribute \"", r15, "\" not found on ");
        r21.append(r13.getName());
        Log.e("TransitionLayout", r21.toString(), e);
    L28:
        e = move-exception;
        Log.e("TransitionLayout", r13.getName() + " must have a method " + r15, e);
    L24:
        e = move-exception;
        StringBuilder r23 = xa3.j(" Custom Attribute \"", r15, "\" not found on ");
        r23.append(r13.getName());
        Log.e("TransitionLayout", r23.toString(), e);
        goto L35
    L36:
        r9.f = r5;
        r9.a = r8;
        r11.h = r7.e;
        r11.i = r7.f;
        r11.j = r7.g;
        r11.k = r7.h;
        r11.l = r7.i;
        r11.m = r7.j;
        r11.n = r7.k;
        r11.o = r7.l;
        r11.p = r7.m;
        r11.q = r7.n;
        r11.r = r7.o;
        r11.s = r7.s;
        r11.t = r7.t;
        r11.u = r7.u;
        r11.v = r7.v;
        r11.w = r7.E;
        r11.x = r7.F;
        r11.y = r7.G;
        r11.z = r7.p;
        r11.A = r7.q;
        r11.B = r7.r;
        r11.C = r7.T;
        r11.D = r7.U;
        r11.E = r7.V;
        r11.f = r7.c;
        r11.d = r7.a;
        r11.e = r7.b;
        r11.b = ((ViewGroup.MarginLayoutParams) r7).width;
        r11.c = ((ViewGroup.MarginLayoutParams) r7).height;
        r11.F = ((ViewGroup.MarginLayoutParams) r7).leftMargin;
        r11.G = ((ViewGroup.MarginLayoutParams) r7).rightMargin;
        r11.H = ((ViewGroup.MarginLayoutParams) r7).topMargin;
        r11.I = ((ViewGroup.MarginLayoutParams) r7).bottomMargin;
        r11.L = r7.D;
        r11.T = r7.I;
        r11.U = r7.H;
        r11.W = r7.K;
        r11.V = r7.J;
        r11.l0 = r7.W;
        r11.m0 = r7.X;
        r11.X = r7.L;
        r11.Y = r7.M;
        r11.Z = r7.P;
        r11.a0 = r7.Q;
        r11.b0 = r7.N;
        r11.c0 = r7.O;
        r11.d0 = r7.R;
        r11.e0 = r7.S;
        r11.k0 = r7.Y;
        r11.N = r7.x;
        r11.P = r7.z;
        r11.M = r7.w;
        r11.O = r7.y;
        r11.R = r7.A;
        r11.Q = r7.B;
        r11.S = r7.C;
        r11.o0 = r7.Z;
        r11.J = r7.getMarginEnd();
        r11.K = r7.getMarginStart();
        r10.a = r6.getVisibility();
        r10.c = r6.getAlpha();
        r12.a = r6.getRotation();
        r12.b = r6.getRotationX();
        r12.c = r6.getRotationY();
        r12.d = r6.getScaleX();
        r12.e = r6.getScaleY();
        float r24 = r6.getPivotX();
        float r25 = r6.getPivotY();
        if (r24 == 0.0d) goto L39;
    L40:
        r12.f = r24;
        r12.g = r25;
    L41:
        r12.i = r6.getTranslationX();
        r12.j = r6.getTranslationY();
        r12.k = r6.getTranslationZ();
        if (r12.l == false) goto L45;
        r12.m = r6.getElevation();
    L45:
        if ((r6 instanceof dp) == false) goto L47;
        dp r26 = (dp) r6;
        r11.n0 = r26.getAllowsGoneWidget();
        r11.i0 = r26.getReferencedIds();
        r11.f0 = r26.getType();
        r11.g0 = r26.getMargin();
        goto L47
    L39:
        if (r25 == 0.0d) goto L41;
    }

    public final void c(int r10, int r11, int r12, int r13) {
        Integer r0 = Integer.valueOf(r10);
        HashMap r9 = this.c;
        if (r9.containsKey(r0) == true) goto L5;
        r9.put(Integer.valueOf(r10), new rb0());
    L5:
        rb0 r14 = (rb0) r9.get(Integer.valueOf(r10));
        if (r14 != null) goto L8;
        return;
    L8:
        sb0 r15 = r14.d;
        switch(r11) {
            case 1: goto L64;
            case 2: goto L56;
            case 3: goto L48;
            case 4: goto L40;
            case 5: goto L29;
            case 6: goto L20;
            case 7: goto L12;
            default: goto L11;
        };
    L12:
        if (r12 != 7) goto L14;
        r15.v = 0;
        r15.u = -1;
    L16:
        r15.J = r13;
        return;
    L14:
        if (r12 != 6) goto L18;
        r15.u = 0;
        r15.v = -1;
        goto L16
    L18:
        nz2.t(j(r12), " undefined", "right to ");
        return;
    L20:
        if (r12 != 6) goto L22;
        r15.t = 0;
        r15.s = -1;
    L24:
        r15.K = r13;
        return;
    L22:
        if (r12 != 7) goto L26;
        r15.s = 0;
        r15.t = -1;
        goto L24
    L26:
        nz2.t(j(r12), " undefined", "right to ");
        return;
    L40:
        if (r12 != 4) goto L42;
        r15.o = 0;
        r15.n = -1;
        r15.p = -1;
        r15.q = -1;
        r15.r = -1;
    L44:
        r15.I = r13;
        return;
    L42:
        if (r12 != 3) goto L46;
        r15.n = 0;
        r15.o = -1;
        r15.p = -1;
        r15.q = -1;
        r15.r = -1;
        goto L44
    L46:
        nz2.t(j(r12), " undefined", "right to ");
        return;
    L48:
        if (r12 != 3) goto L50;
        r15.l = 0;
        r15.m = -1;
        r15.p = -1;
        r15.q = -1;
        r15.r = -1;
    L52:
        r15.H = r13;
        return;
    L50:
        if (r12 != 4) goto L54;
        r15.m = 0;
        r15.l = -1;
        r15.p = -1;
        r15.q = -1;
        r15.r = -1;
        goto L52
    L54:
        nz2.t(j(r12), " undefined", "right to ");
        return;
    L56:
        if (r12 != 1) goto L58;
        r15.j = 0;
        r15.k = -1;
    L60:
        r15.G = r13;
        return;
    L58:
        if (r12 != 2) goto L62;
        r15.k = 0;
        r15.j = -1;
        goto L60
    L62:
        nz2.t(j(r12), " undefined", "right to ");
        return;
    L64:
        if (r12 != 1) goto L66;
        r15.h = 0;
        r15.i = -1;
    L68:
        r15.F = r13;
        return;
    L66:
        if (r12 != 2) goto L70;
        r15.i = 0;
        r15.h = -1;
        goto L68
    L70:
        nz2.t(j(r12), " undefined", "Left to ");
        return;
    L11:
        throw new IllegalArgumentException(j(r11) + " to " + j(r12) + " unknown");
    L29:
        if (r12 != 5) goto L32;
        r15.p = 0;
        r15.o = -1;
        r15.n = -1;
        r15.l = -1;
        r15.m = -1;
        return;
    L32:
        if (r12 != 3) goto L35;
        r15.q = 0;
        r15.o = -1;
        r15.n = -1;
        r15.l = -1;
        r15.m = -1;
        return;
    L35:
        if (r12 != 4) goto L38;
        r15.r = 0;
        r15.o = -1;
        r15.n = -1;
        r15.l = -1;
        r15.m = -1;
        return;
    L38:
        nz2.t(j(r12), " undefined", "right to ");
    }

    public final void f(Context r8, int r9) {
        XmlResourceParser r2 = r8.getResources().getXml(r9);
        int r3 = r2.getEventType();     // Catch: IOException -> L12 XmlPullParserException -> L14
    L5:
        if (r3 == 1) goto L29;
        if (r3 != 2) goto L17;
        String r4 = r2.getName();     // Catch: IOException -> L12 XmlPullParserException -> L14
        rb0 r5 = e(r8, Xml.asAttributeSet(r2), false);     // Catch: IOException -> L12 XmlPullParserException -> L14
        if (r4.equalsIgnoreCase("Guideline") == false) goto L16;
        r5.d.a = true;     // Catch: IOException -> L12 XmlPullParserException -> L14
    L16:
        this.c.put(Integer.valueOf(r5.a), r5);     // Catch: IOException -> L12 XmlPullParserException -> L14
    L17:
        r3 = r2.next();     // Catch: IOException -> L12 XmlPullParserException -> L14
    L29:
        return;
    L12:
        e = move-exception;
        Log.e("ConstraintSet", "Error parsing resource: " + r9, e);
        return;
    L14:
        e = move-exception;
        Log.e("ConstraintSet", "Error parsing resource: " + r9, e);
    }
}
