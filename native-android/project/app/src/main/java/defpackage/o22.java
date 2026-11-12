package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o22 {
    public static final int a = 0;

    static {
        String r0 = System.getProperty("java.version");
        int r1 = 0;
        String[] r3 = r0.split("[._]");     // Catch: NumberFormatException -> L9
        int r4 = Integer.parseInt(r3[0]);     // Catch: NumberFormatException -> L9
        if (r4 == 1) goto L6;
    L10:
        if (r4 == (-1)) goto L26;
    L20:
        if (r4 != (-1)) goto L22;
        r4 = 6;
    L22:
        a = r4;
        return;
    L26:
        StringBuilder r5 = new StringBuilder();     // Catch: NumberFormatException -> L19
    L13:
        if (r1 >= r0.length()) goto L17;
        char r6 = r0.charAt(r1);     // Catch: NumberFormatException -> L19
        if (Character.isDigit(r6) == false) goto L17;
        r5.append(r6);     // Catch: NumberFormatException -> L19
        r1 = r1 + 1;     // Catch: NumberFormatException -> L19
    L17:
        r4 = Integer.parseInt(r5.toString());     // Catch: NumberFormatException -> L19
    L19:
        r4 = -1;
        goto L20
    L6:
        if (r3.length <= 1) goto L10;
        r4 = Integer.parseInt(r3[1]);     // Catch: NumberFormatException -> L9
    L9:
        r4 = -1;
        goto L10
    }
}
