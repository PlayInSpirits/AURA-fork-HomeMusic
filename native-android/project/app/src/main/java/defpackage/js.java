package defpackage;

import android.text.SpannableStringBuilder;
import com.eddyizm.tempus.homemusic.WaveRetry;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class js {
    public static final String b;
    public static final String c;
    public static final js d;
    public static final js e;
    public final boolean a;

    static {
        xk0 xk0Var = vr4.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new js(false);
        e = new js(true);
    }

    public js(boolean z) {
        xk0 xk0Var = vr4.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        is isVar = new is(charSequence);
        isVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = isVar.c;
            if (i4 < isVar.b && i == 0) {
                CharSequence charSequence2 = isVar.a;
                char cCharAt = charSequence2.charAt(i4);
                isVar.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = isVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    isVar.c = Character.charCount(iCodePointAt) + isVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    isVar.c = i5 + 1;
                    char c2 = isVar.d;
                    directionality = c2 < 1792 ? is.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (isVar.c > 0) {
                    switch (isVar.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        is isVar = new is(charSequence);
        isVar.c = isVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (isVar.c > 0) {
                byte bA = isVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        xk0 xk0Var = vr4.c;
        if (charSequence == null) {
            return null;
        }
        boolean zJ = xk0Var.j(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zJ2 = (zJ ? vr4.b : vr4.a).j(charSequence, charSequence.length());
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zJ2 || a(charSequence) == 1)) {
            str = (!z || (zJ2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zJ != z) {
            spannableStringBuilder.append(zJ ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zJ3 = (zJ ? vr4.b : vr4.a).j(charSequence, charSequence.length());
        if (!z && (zJ3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zJ3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
