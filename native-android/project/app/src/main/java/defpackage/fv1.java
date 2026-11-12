package defpackage;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fv1 {
    public static final TimeZone a = null;

    static {
        a = TimeZone.getTimeZone("UTC");
    }

    public static boolean a(String r1, int r2, char r3) {
        if (r2 < r1.length()) goto L5;
        return false;
    L5:
        if (r1.charAt(r2) != r3) goto L10;
        return true;
    L10:
        return false;
    }

    public static Date b(String r17, ParsePosition r18) {
        int r0 = r18.getIndex();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r3 = r0 + 4;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r4 = c(r17, r0, r3);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (a(r17, r3, '-') == false) goto L6;
        r3 = r0 + 5;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L6:
        int r1 = r3 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r6 = c(r17, r3, r1);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (a(r17, r1, '-') == false) goto L9;
        r1 = r3 + 3;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L9:
        int r5 = r1 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r8 = c(r17, r1, r5);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        boolean r9 = a(r17, r5, 'T');     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r9 == true) goto L16;
        if (r17.length() > r5) goto L16;
        GregorianCalendar r2 = new GregorianCalendar(r4, r6 - 1, r8);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r2.setLenient(false);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r18.setIndex(r5);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        return r2.getTime();
    L16:
        if (r9 == false) goto L63;
        int r10 = r1 + 5;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r7 = c(r17, r1 + 3, r10);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (a(r17, r10, ':') == false) goto L20;
        r10 = r1 + 6;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L20:
        int r11 = r10 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r16 = c(r17, r10, r11);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (a(r17, r11, ':') == false) goto L24;
        r11 = r10 + 3;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L24:
        if (r17.length() <= r11) goto L61;
        char r12 = r17.charAt(r11);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r12 == 'Z') goto L61;
        if (r12 == '+') goto L61;
        if (r12 == '-') goto L61;
        int r13 = r11 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r15 = c(r17, r11, r13);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r15 <= 59) goto L35;
        if (r15 >= 63) goto L35;
        r15 = 59;
    L35:
        if (a(r17, r13, '.') == false) goto L60;
        int r14 = r11 + 3;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r19 = r11 + 4;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L38:
        if (r19 >= r17.length()) goto L52;
        char r20 = r17.charAt(r19);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r20 < '0') goto L45;
        if (r20 > '9') goto L45;
        r19 = r19 + 1;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L45:
        int r21 = r19;
    L53:
        int r22 = Math.min(r21, r11 + 6);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r23 = c(r17, r14, r22);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r24 = r22 - r14;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r24 == 1) goto L58;
        if (r24 != 2) goto L59;
        r23 = r23 * 10;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L59:
        int r25 = r7;
        r5 = r21;
        int r26 = r16;
    L65:
        if (r17.length() <= r5) goto L95;
        char r27 = r17.charAt(r5);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        TimeZone r110 = a;
        if (r27 != 'Z') goto L70;
        int r28 = r5 + 1;
    L92:
        GregorianCalendar r29 = new GregorianCalendar(r110);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.setLenient(false);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(1, r4);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(2, r6 - 1);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(5, r8);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(11, r25);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(12, r26);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(13, r15);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r29.set(14, r23);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r18.setIndex(r28);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        return r29.getTime();
    L70:
        if (r27 != '+') goto L72;
    L76:
        String r30 = r17.substring(r5);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r30.length() >= 5) goto L80;
        r30 = r30 + "00";     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L80:
        r28 = r5 + r30.length();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if ("+0000".equals(r30) == true) goto L92;
        if ("+00:00".equals(r30) == true) goto L92;
        String r31 = "GMT" + r30;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r110 = TimeZone.getTimeZone(r31);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        String r111 = r110.getID();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r111.equals(r31) == true) goto L92;
        if (r111.replace(":", "").equals(r31) == true) goto L92;
        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + r31 + " given, resolves to " + r110.getID());     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L72:
        if (r27 == '-') goto L76;
        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + r27 + "'");     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L95:
        throw new IllegalArgumentException("No time zone indicator");     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L58:
        r23 = r23 * 100;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        goto L59
    L52:
        r21 = r17.length();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        goto L53
    L60:
        r25 = r7;
        r5 = r13;
        r26 = r16;
        r23 = 0;
    L61:
        r5 = r11;
        r25 = r7;
        r26 = r16;
    L62:
        r23 = 0;
        r15 = 0;
        goto L65
    L63:
        r25 = 0;
        r26 = 0;
    L50:
        e = e;
    L96:
        if (r17 != null) goto L98;
        String r32 = null;
    L99:
        String r33 = e.getMessage();
        if (r33 != null) goto L102;
    L103:
        r33 = "(" + e.getClass().getName() + ")";
    L104:
        ParseException r34 = new ParseException("Failed to parse date [" + r32 + "]: " + r33, r18.getIndex());
        r34.initCause(e);
        throw r34;
    L102:
        if (r33.isEmpty() == false) goto L104;
    L98:
        r32 = "\"" + r17 + '\"';
    L48:
        e = e;
    L46:
        e = e;
        goto L96
    }

    public static int c(String r5, int r6, int r7) {
        if (r6 < 0) goto L23;
        if (r7 > r5.length()) goto L23;
        if (r6 > r7) goto L23;
        if (r6 >= r7) goto L13;
        int r2 = r6 + 1;
        int r3 = Character.digit(r5.charAt(r6), 10);
        if (r3 < 0) goto L12;
        int r4 = -r3;
    L14:
        if (r2 >= r7) goto L21;
        int r8 = r2 + 1;
        int r9 = Character.digit(r5.charAt(r2), 10);
        if (r9 < 0) goto L19;
        r4 = (r4 * 10) - r9;
        r2 = r8;
        goto L14
    L19:
        throw new NumberFormatException("Invalid number: ".concat(r5.substring(r6, r7)));
    L21:
        return -r4;
    L12:
        throw new NumberFormatException("Invalid number: ".concat(r5.substring(r6, r7)));
    L13:
        r4 = 0;
        r2 = r6;
    L23:
        throw new NumberFormatException(r5);
    }
}
