package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends zh0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ z2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua(z2 z2Var, int i) {
        super(2);
        this.r = i;
        this.s = z2Var;
    }

    @Override // defpackage.zh0
    public final v3 C(int i) {
        int i2 = this.r;
        z2 z2Var = this.s;
        switch (i2) {
            case 0:
                ya yaVar = (ya) z2Var;
                if (i != 1) {
                    if (i == 2) {
                        return z(yaVar.x);
                    }
                    kf2.n(f34.f(i, "Unknown focus type: "));
                    return null;
                }
                int i3 = yaVar.y;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return z(i3);
            default:
                z41 z41Var = (z41) z2Var;
                int i4 = i == 2 ? z41Var.x : z41Var.y;
                if (i4 == Integer.MIN_VALUE) {
                    return null;
                }
                return z(i4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x01af  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:285:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:286:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:290:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:294:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:298:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:302:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:305:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:306:0x04db  */
    /* JADX WARN: Code duplicated, block: B:313:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:320:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:323:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:325:0x0500  */
    /* JADX WARN: Code duplicated, block: B:328:0x050b  */
    /* JADX WARN: Code duplicated, block: B:331:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x0531  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:340:0x054c  */
    /* JADX WARN: Code duplicated, block: B:343:0x0551  */
    /* JADX WARN: Code duplicated, block: B:348:0x056b  */
    /* JADX WARN: Code duplicated, block: B:351:0x0574  */
    /* JADX WARN: Code duplicated, block: B:355:0x057b  */
    /* JADX WARN: Code duplicated, block: B:357:0x0585  */
    /* JADX WARN: Code duplicated, block: B:360:0x058a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x060c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0618  */
    /* JADX WARN: Code duplicated, block: B:404:0x061d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x0621  */
    /* JADX WARN: Code duplicated, block: B:407:0x0626  */
    /* JADX WARN: Code duplicated, block: B:409:0x062f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:410:0x0631  */
    /* JADX WARN: Code duplicated, block: B:413:0x0638  */
    /* JADX WARN: Code duplicated, block: B:415:0x0640  */
    /* JADX WARN: Code duplicated, block: B:421:0x065d  */
    /* JADX WARN: Code duplicated, block: B:423:0x0661  */
    /* JADX WARN: Code duplicated, block: B:425:0x0669  */
    /* JADX WARN: Code duplicated, block: B:426:0x066b  */
    /* JADX WARN: Code duplicated, block: B:428:0x066f  */
    /* JADX WARN: Code duplicated, block: B:430:0x0675  */
    /* JADX WARN: Code duplicated, block: B:431:0x0677  */
    /* JADX WARN: Code duplicated, block: B:434:0x067c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:496:0x076d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:497:0x076f  */
    /* JADX WARN: Code duplicated, block: B:499:0x077d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:500:0x077f  */
    /* JADX WARN: Code duplicated, block: B:503:0x0784  */
    /* JADX WARN: Code duplicated, block: B:504:0x0786  */
    /* JADX WARN: Code duplicated, block: B:510:0x079b  */
    /* JADX WARN: Code duplicated, block: B:515:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:527:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:532:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:539:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:541:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:543:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:545:0x0802  */
    /* JADX WARN: Code duplicated, block: B:557:0x086f  */
    /* JADX WARN: Code duplicated, block: B:559:0x0876 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:560:0x0878  */
    /* JADX WARN: Code duplicated, block: B:561:0x087a  */
    /* JADX WARN: Code duplicated, block: B:563:0x0880  */
    /* JADX WARN: Code duplicated, block: B:564:0x0885  */
    /* JADX WARN: Code duplicated, block: B:567:0x088d  */
    /* JADX WARN: Code duplicated, block: B:569:0x0897  */
    /* JADX WARN: Code duplicated, block: B:581:0x08bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:582:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:583:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:586:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:587:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:590:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:592:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:594:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:603:0x091a  */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0225, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Switch 'out' block B:33:0x0093 for B:65:0x00eb already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:33:0x0093 for B:66:0x00ee already processed. Defaulting to fallback option. */
    @Override // defpackage.zh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(int i, int i2, Bundle bundle) {
        boolean z;
        i94 i94Var;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        Integer num;
        String strT;
        String strT2;
        b3 b3Var;
        int iQ;
        int[] iArrM;
        int i5;
        int i6;
        int iR;
        int i7;
        int i8;
        ms4 ms4VarP;
        gf1 gf1Var;
        int i9;
        int i10;
        gf1 gf1Var2;
        gf1 gf1Var3;
        gf1 gf1Var4;
        gf1 gf1Var5;
        gf1 gf1Var6;
        gf1 gf1Var7;
        gf1 gf1Var8;
        gf1 gf1Var9;
        if1 if1Var;
        w2 w2Var;
        long jK0;
        long jFloatToRawIntBits;
        if1 if1Var2;
        gf1 gf1Var10;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objG;
        xq3 xq3Var;
        Object objG2;
        long jB;
        Object objG3;
        w2 w2Var2;
        Float f;
        Object objG4;
        w2 w2Var3;
        Object objG5;
        h64 h64Var;
        Object objG6;
        h64 h64Var2;
        float fIntBitsToFloat;
        p94 p94Var;
        Object objG7;
        Object obj;
        w2 w2Var4;
        gf1 gf1Var11;
        Object objG8;
        Object obj2;
        w2 w2Var5;
        gf1 gf1Var12;
        if1 if1Var3;
        gf1 gf1Var13;
        gf1 gf1Var14;
        gf1 gf1Var15;
        gf1 gf1Var16;
        int i11;
        int i12 = this.r;
        z2 z2Var = this.s;
        switch (i12) {
            case 0:
                ya yaVar = (ya) z2Var;
                AccessibilityManager accessibilityManager = yaVar.t;
                Float fValueOf = Float.valueOf(0.0f);
                ra raVar = yaVar.q;
                k94 k94Var = (k94) yaVar.s().b(i);
                if (k94Var == null || (i94Var = k94Var.a) == null) {
                    z = false;
                } else {
                    c72 c72Var = i94Var.c;
                    int i13 = i94Var.f;
                    e94 e94Var = i94Var.d;
                    w03 w03Var = e94Var.n;
                    Object objG9 = w03Var.g(n94.n);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    Boolean bool = Boolean.TRUE;
                    if (h12.c(objG9, bool)) {
                        if (!(Build.VERSION.SDK_INT >= 34 ? a3.l(accessibilityManager) : true)) {
                            z = false;
                        } else {
                            if (i2 != 64) {
                                if (i2 != 128) {
                                    if (i2 != 256) {
                                        if (bundle != null) {
                                            i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                            z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                            if (i2 == 256) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            num = yaVar.H;
                                            if (num != null) {
                                                yaVar.G = -1;
                                                yaVar.H = Integer.valueOf(i13);
                                            } else {
                                                yaVar.G = -1;
                                                yaVar.H = Integer.valueOf(i13);
                                            }
                                            strT = ya.t(i94Var);
                                            if (strT != null) {
                                                strT2 = ya.t(i94Var);
                                                if (strT2 != null) {
                                                    b3Var = null;
                                                } else {
                                                    b3Var = null;
                                                }
                                                if (b3Var != null) {
                                                    iQ = yaVar.q(i94Var);
                                                    if (iQ == -1) {
                                                        if (z4) {
                                                            iQ = 0;
                                                        } else {
                                                            iQ = strT.length();
                                                        }
                                                    }
                                                    if (z4) {
                                                        iArrM = b3Var.f(iQ);
                                                    } else {
                                                        iArrM = b3Var.m(iQ);
                                                    }
                                                    if (iArrM != null) {
                                                        i5 = iArrM[0];
                                                        i6 = iArrM[1];
                                                        if (z3) {
                                                            if (z4) {
                                                                iR = i6;
                                                            } else {
                                                                iR = i5;
                                                            }
                                                            i7 = iR;
                                                        } else {
                                                            if (z4) {
                                                                iR = i6;
                                                            } else {
                                                                iR = i5;
                                                            }
                                                            i7 = iR;
                                                        }
                                                        if (z4) {
                                                            i8 = 256;
                                                        } else {
                                                            i8 = 512;
                                                        }
                                                        yaVar.L = new va(i94Var, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                                        z2 = true;
                                                        yaVar.K(i94Var, iR, i7, true);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (bundle != null) {
                                        i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                        z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                        if (i2 == 256) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        num = yaVar.H;
                                        if (num != null) {
                                            yaVar.G = -1;
                                            yaVar.H = Integer.valueOf(i13);
                                        } else {
                                            yaVar.G = -1;
                                            yaVar.H = Integer.valueOf(i13);
                                        }
                                        strT = ya.t(i94Var);
                                        if (strT != null) {
                                            strT2 = ya.t(i94Var);
                                            if (strT2 != null) {
                                                b3Var = null;
                                            } else {
                                                b3Var = null;
                                            }
                                            if (b3Var != null) {
                                                iQ = yaVar.q(i94Var);
                                                if (iQ == -1) {
                                                    if (z4) {
                                                        iQ = 0;
                                                    } else {
                                                        iQ = strT.length();
                                                    }
                                                }
                                                if (z4) {
                                                    iArrM = b3Var.f(iQ);
                                                } else {
                                                    iArrM = b3Var.m(iQ);
                                                }
                                                if (iArrM != null) {
                                                    i5 = iArrM[0];
                                                    i6 = iArrM[1];
                                                    if (z3) {
                                                        if (z4) {
                                                            iR = i6;
                                                        } else {
                                                            iR = i5;
                                                        }
                                                        i7 = iR;
                                                    } else {
                                                        if (z4) {
                                                            iR = i6;
                                                        } else {
                                                            iR = i5;
                                                        }
                                                        i7 = iR;
                                                    }
                                                    if (z4) {
                                                        i8 = 256;
                                                    } else {
                                                        i8 = 512;
                                                    }
                                                    yaVar.L = new va(i94Var, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                                    z2 = true;
                                                    yaVar.K(i94Var, iR, i7, true);
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    z2 = true;
                                    z = false;
                                    if (yaVar.x == i) {
                                        yaVar.x = Integer.MIN_VALUE;
                                        yaVar.z = null;
                                        raVar.invalidate();
                                        ya.E(yaVar, i, 65536, null, 12);
                                    }
                                }
                                return z2;
                            }
                            z2 = true;
                            z = false;
                            if (accessibilityManager.isEnabled()) {
                                if (i3 != Integer.MIN_VALUE) {
                                    ya.E(yaVar, i3, 65536, null, 12);
                                }
                                yaVar.x = i;
                                raVar.invalidate();
                                ya.E(yaVar, i, 32768, null, 12);
                                return z2;
                            }
                        }
                    } else {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                if (i2 != 256 || i2 == 512) {
                                    if (bundle != null) {
                                        i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                        z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                        if (i2 == 256) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        num = yaVar.H;
                                        if (num != null || i13 != num.intValue()) {
                                            yaVar.G = -1;
                                            yaVar.H = Integer.valueOf(i13);
                                        }
                                        strT = ya.t(i94Var);
                                        if (strT != null && strT.length() != 0) {
                                            strT2 = ya.t(i94Var);
                                            if (strT2 != null || strT2.length() == 0) {
                                                b3Var = null;
                                            } else if (i4 == 1) {
                                                Locale locale = raVar.getContext().getResources().getConfiguration().locale;
                                                if (c3.e == null) {
                                                    c3 c3Var = new c3(0);
                                                    c3Var.d = BreakIterator.getCharacterInstance(locale);
                                                    c3.e = c3Var;
                                                }
                                                c3 c3Var2 = c3.e;
                                                c3Var2.getClass();
                                                c3Var2.p(strT2);
                                                b3Var = c3Var2;
                                            } else if (i4 == 2) {
                                                Locale locale2 = raVar.getContext().getResources().getConfiguration().locale;
                                                if (c3.f == null) {
                                                    c3 c3Var3 = new c3(1);
                                                    c3Var3.d = BreakIterator.getWordInstance(locale2);
                                                    c3.f = c3Var3;
                                                }
                                                c3 c3Var4 = c3.f;
                                                c3Var4.getClass();
                                                c3Var4.p(strT2);
                                                b3Var = c3Var4;
                                            } else if (i4 == 4) {
                                                if (w03Var.c(d94.a) || (ms4VarP = gh0.p(e94Var)) == null) {
                                                    b3Var = null;
                                                } else if (i4 == 4) {
                                                    if (c3.g == null) {
                                                        c3.g = new c3(2);
                                                    }
                                                    c3 c3Var5 = c3.g;
                                                    c3Var5.getClass();
                                                    c3Var5.a = strT2;
                                                    c3Var5.d = ms4VarP;
                                                    b3Var = c3Var5;
                                                } else {
                                                    if (d3.e == null) {
                                                        d3 d3Var = new d3();
                                                        new Rect();
                                                        d3.e = d3Var;
                                                    }
                                                    d3 d3Var2 = d3.e;
                                                    d3Var2.getClass();
                                                    d3Var2.a = strT2;
                                                    d3Var2.c = ms4VarP;
                                                    d3Var2.d = i94Var;
                                                    b3Var = d3Var2;
                                                }
                                            } else if (i4 == 8) {
                                                if (e3.c == null) {
                                                    e3.c = new e3();
                                                }
                                                e3 e3Var = e3.c;
                                                e3Var.getClass();
                                                e3Var.a = strT2;
                                                b3Var = e3Var;
                                            } else if (i4 != 16) {
                                                b3Var = null;
                                            } else if (w03Var.c(d94.a)) {
                                                b3Var = null;
                                            } else if (i4 == 4) {
                                                if (c3.g == null) {
                                                    c3.g = new c3(2);
                                                }
                                                c3 c3Var6 = c3.g;
                                                c3Var6.getClass();
                                                c3Var6.a = strT2;
                                                c3Var6.d = ms4VarP;
                                                b3Var = c3Var6;
                                            } else {
                                                if (d3.e == null) {
                                                    d3 d3Var3 = new d3();
                                                    new Rect();
                                                    d3.e = d3Var3;
                                                }
                                                d3 d3Var4 = d3.e;
                                                d3Var4.getClass();
                                                d3Var4.a = strT2;
                                                d3Var4.c = ms4VarP;
                                                d3Var4.d = i94Var;
                                                b3Var = d3Var4;
                                            }
                                            if (b3Var != null) {
                                                iQ = yaVar.q(i94Var);
                                                if (iQ == -1) {
                                                    if (z4) {
                                                        iQ = 0;
                                                    } else {
                                                        iQ = strT.length();
                                                    }
                                                }
                                                if (z4) {
                                                    iArrM = b3Var.f(iQ);
                                                } else {
                                                    iArrM = b3Var.m(iQ);
                                                }
                                                if (iArrM != null) {
                                                    i5 = iArrM[0];
                                                    i6 = iArrM[1];
                                                    if (z3 || w03Var.c(n94.a) || !w03Var.c(n94.D)) {
                                                        if (z4) {
                                                            iR = i6;
                                                        } else {
                                                            iR = i5;
                                                        }
                                                        i7 = iR;
                                                    } else {
                                                        iR = yaVar.r(i94Var);
                                                        if (iR == -1) {
                                                            iR = z4 ? i5 : i6;
                                                        }
                                                        i7 = z4 ? i6 : i5;
                                                    }
                                                    if (z4) {
                                                        i8 = 256;
                                                    } else {
                                                        i8 = 512;
                                                    }
                                                    yaVar.L = new va(i94Var, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                                    z2 = true;
                                                    yaVar.K(i94Var, iR, i7, true);
                                                }
                                            }
                                        }
                                    }
                                } else if (i2 == 16384) {
                                    Object objG10 = w03Var.g(d94.p);
                                    w2 w2Var6 = (w2) (objG10 == null ? null : objG10);
                                    if (w2Var6 != null && (gf1Var = (gf1) w2Var6.b) != null) {
                                        return ((Boolean) gf1Var.invoke()).booleanValue();
                                    }
                                } else {
                                    if (i2 == 131072) {
                                        if (bundle != null) {
                                            i9 = -1;
                                            i10 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                        } else {
                                            i9 = -1;
                                            i10 = -1;
                                        }
                                        boolean zK = yaVar.K(i94Var, i10, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i9) : -1, false);
                                        if (!zK) {
                                            return zK;
                                        }
                                        ya.E(yaVar, yaVar.A(i13), 0, null, 12);
                                        return zK;
                                    }
                                    if (xl.b(i94Var)) {
                                        if (i2 == 1) {
                                            if (raVar.isInTouchMode()) {
                                                raVar.requestFocusFromTouch();
                                            }
                                            Object objG11 = w03Var.g(d94.v);
                                            w2 w2Var7 = (w2) (objG11 == null ? null : objG11);
                                            if (w2Var7 != null && (gf1Var2 = (gf1) w2Var7.b) != null) {
                                                return ((Boolean) gf1Var2.invoke()).booleanValue();
                                            }
                                        } else if (i2 != 2) {
                                            r62 r62Var = r62.o;
                                            switch (i2) {
                                                case WaveRetry.MAX_FAILURES /* 16 */:
                                                    Object objG12 = w03Var.g(d94.b);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    w2 w2Var8 = (w2) objG12;
                                                    Boolean bool2 = (w2Var8 == null || (gf1Var3 = (gf1) w2Var8.b) == null) ? null : (Boolean) gf1Var3.invoke();
                                                    ya.E(yaVar, i, 1, null, 12);
                                                    if (bool2 != null) {
                                                        return bool2.booleanValue();
                                                    }
                                                    break;
                                                case 32:
                                                    Object objG13 = w03Var.g(d94.c);
                                                    w2 w2Var9 = (w2) (objG13 == null ? null : objG13);
                                                    if (w2Var9 != null && (gf1Var4 = (gf1) w2Var9.b) != null) {
                                                        return ((Boolean) gf1Var4.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 4096:
                                                case 8192:
                                                    if (i2 == 4096) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (i2 == 8192) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (i2 == 16908345) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (i2 == 16908347) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (i2 == 16908344) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (i2 == 16908346) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (!z7 || z8 || z5 || z6) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (!z9 || z10 || z5 || z6) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (!z5 || z6) {
                                                        objG = w03Var.g(n94.c);
                                                        if (objG == null) {
                                                            objG = null;
                                                        }
                                                        xq3Var = (xq3) objG;
                                                        objG2 = w03Var.g(d94.i);
                                                        if (objG2 == null) {
                                                            objG2 = null;
                                                        }
                                                        w2 w2Var10 = (w2) objG2;
                                                        if (xq3Var != null || w2Var10 == null) {
                                                            jB = wr1.c((iz1) c72Var.Q.d).b();
                                                            ArrayList arrayList = new ArrayList();
                                                            objG3 = w03Var.g(d94.B);
                                                            if (objG3 == null) {
                                                                objG3 = null;
                                                            }
                                                            w2Var2 = (w2) objG3;
                                                            if (w2Var2 == null && (if1Var3 = (if1) w2Var2.b) != null && ((Boolean) if1Var3.invoke(arrayList)).booleanValue()) {
                                                                f = (Float) arrayList.get(0);
                                                            } else {
                                                                f = null;
                                                            }
                                                            objG4 = w03Var.g(d94.d);
                                                            if (objG4 == null) {
                                                                objG4 = null;
                                                            }
                                                            w2Var3 = (w2) objG4;
                                                            if (w2Var3 != null) {
                                                                sf1 sf1Var = w2Var3.b;
                                                                objG5 = w03Var.g(n94.u);
                                                                if (objG5 == null) {
                                                                    objG5 = null;
                                                                }
                                                                h64Var = (h64) objG5;
                                                                if (h64Var == null && z11) {
                                                                    float fFloatValue = f != null ? f.floatValue() : Float.intBitsToFloat((int) (jB >> 32));
                                                                    if (z7 || z6) {
                                                                        fFloatValue = -fFloatValue;
                                                                    }
                                                                    if (c72Var.K == r62Var && (z7 || z8)) {
                                                                        fFloatValue = -fFloatValue;
                                                                    }
                                                                    if (ya.x(h64Var, fFloatValue)) {
                                                                        p94 p94Var2 = d94.y;
                                                                        if (w03Var.c(p94Var2) || w03Var.c(d94.A)) {
                                                                            if (fFloatValue > 0.0f) {
                                                                                Object objG14 = w03Var.g(d94.A);
                                                                                w2Var5 = (w2) (objG14 == null ? null : objG14);
                                                                            } else {
                                                                                Object objG15 = w03Var.g(p94Var2);
                                                                                w2Var5 = (w2) (objG15 == null ? null : objG15);
                                                                            }
                                                                            if (w2Var5 != null && (gf1Var12 = (gf1) w2Var5.b) != null) {
                                                                                return ((Boolean) gf1Var12.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            wf1 wf1Var = (wf1) sf1Var;
                                                                            if (wf1Var != null) {
                                                                                return ((Boolean) wf1Var.invoke(Float.valueOf(fFloatValue), fValueOf)).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    f = f;
                                                                    z6 = z6;
                                                                }
                                                                objG6 = w03Var.g(n94.v);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                h64Var2 = (h64) objG6;
                                                                if (h64Var2 != null && z12) {
                                                                    if (f != null) {
                                                                        fIntBitsToFloat = f.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                    }
                                                                    if (z9 || z6) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                        p94Var = d94.x;
                                                                        if (!w03Var.c(p94Var) || w03Var.c(d94.z)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = w03Var.g(d94.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                w2Var4 = (w2) obj2;
                                                                            } else {
                                                                                objG7 = w03Var.g(p94Var);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                w2Var4 = (w2) obj;
                                                                            }
                                                                            if (w2Var4 != null && (gf1Var11 = (gf1) w2Var4.b) != null) {
                                                                                return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            wf1 wf1Var2 = (wf1) sf1Var;
                                                                            if (wf1Var2 != null) {
                                                                                return ((Boolean) wf1Var2.invoke(fValueOf, Float.valueOf(fIntBitsToFloat))).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            float f2 = z6 ? -0.0f : 0.0f;
                                                            if1 if1Var4 = (if1) w2Var10.b;
                                                            if (if1Var4 != null) {
                                                                return ((Boolean) if1Var4.invoke(Float.valueOf(0.0f + f2))).booleanValue();
                                                            }
                                                        }
                                                    } else {
                                                        jB = wr1.c((iz1) c72Var.Q.d).b();
                                                        ArrayList arrayList2 = new ArrayList();
                                                        objG3 = w03Var.g(d94.B);
                                                        if (objG3 == null) {
                                                            objG3 = null;
                                                        }
                                                        w2Var2 = (w2) objG3;
                                                        if (w2Var2 == null) {
                                                            f = null;
                                                        } else {
                                                            f = null;
                                                        }
                                                        objG4 = w03Var.g(d94.d);
                                                        if (objG4 == null) {
                                                            objG4 = null;
                                                        }
                                                        w2Var3 = (w2) objG4;
                                                        if (w2Var3 != null) {
                                                            sf1 sf1Var2 = w2Var3.b;
                                                            objG5 = w03Var.g(n94.u);
                                                            if (objG5 == null) {
                                                                objG5 = null;
                                                            }
                                                            h64Var = (h64) objG5;
                                                            if (h64Var == null) {
                                                                f = f;
                                                                z6 = z6;
                                                                objG6 = w03Var.g(n94.v);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                h64Var2 = (h64) objG6;
                                                                if (h64Var2 != null) {
                                                                    if (f != null) {
                                                                        fIntBitsToFloat = f.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                    }
                                                                    if (z9) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                        p94Var = d94.x;
                                                                        if (w03Var.c(p94Var)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = w03Var.g(d94.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                w2Var4 = (w2) obj2;
                                                                            } else {
                                                                                objG7 = w03Var.g(p94Var);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                w2Var4 = (w2) obj;
                                                                            }
                                                                            if (w2Var4 != null) {
                                                                                return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = w03Var.g(d94.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                w2Var4 = (w2) obj2;
                                                                            } else {
                                                                                objG7 = w03Var.g(p94Var);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                w2Var4 = (w2) obj;
                                                                            }
                                                                            if (w2Var4 != null) {
                                                                                return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                f = f;
                                                                z6 = z6;
                                                                objG6 = w03Var.g(n94.v);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                h64Var2 = (h64) objG6;
                                                                if (h64Var2 != null) {
                                                                    if (f != null) {
                                                                        fIntBitsToFloat = f.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                    }
                                                                    if (z9) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                        p94Var = d94.x;
                                                                        if (w03Var.c(p94Var)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = w03Var.g(d94.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                w2Var4 = (w2) obj2;
                                                                            } else {
                                                                                objG7 = w03Var.g(p94Var);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                w2Var4 = (w2) obj;
                                                                            }
                                                                            if (w2Var4 != null) {
                                                                                return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = w03Var.g(d94.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                w2Var4 = (w2) obj2;
                                                                            } else {
                                                                                objG7 = w03Var.g(p94Var);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                w2Var4 = (w2) obj;
                                                                            }
                                                                            if (w2Var4 != null) {
                                                                                return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 32768:
                                                    Object objG16 = w03Var.g(d94.r);
                                                    w2 w2Var11 = (w2) (objG16 == null ? null : objG16);
                                                    if (w2Var11 != null && (gf1Var5 = (gf1) w2Var11.b) != null) {
                                                        return ((Boolean) gf1Var5.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 65536:
                                                    Object objG17 = w03Var.g(d94.q);
                                                    w2 w2Var12 = (w2) (objG17 == null ? null : objG17);
                                                    if (w2Var12 != null && (gf1Var6 = (gf1) w2Var12.b) != null) {
                                                        return ((Boolean) gf1Var6.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 262144:
                                                    Object objG18 = w03Var.g(d94.s);
                                                    w2 w2Var13 = (w2) (objG18 == null ? null : objG18);
                                                    if (w2Var13 != null && (gf1Var7 = (gf1) w2Var13.b) != null) {
                                                        return ((Boolean) gf1Var7.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 524288:
                                                    Object objG19 = w03Var.g(d94.t);
                                                    w2 w2Var14 = (w2) (objG19 == null ? null : objG19);
                                                    if (w2Var14 != null && (gf1Var8 = (gf1) w2Var14.b) != null) {
                                                        return ((Boolean) gf1Var8.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 1048576:
                                                    Object objG20 = w03Var.g(d94.u);
                                                    w2 w2Var15 = (w2) (objG20 == null ? null : objG20);
                                                    if (w2Var15 != null && (gf1Var9 = (gf1) w2Var15.b) != null) {
                                                        return ((Boolean) gf1Var9.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 2097152:
                                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                                    Object objG21 = w03Var.g(d94.k);
                                                    w2 w2Var16 = (w2) (objG21 == null ? null : objG21);
                                                    if (w2Var16 != null && (if1Var = (if1) w2Var16.b) != null) {
                                                        if (string == null) {
                                                            string = "";
                                                        }
                                                        return ((Boolean) if1Var.invoke(new he(string))).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionShowOnScreen:
                                                    i94 i94VarL = i94Var.l();
                                                    if (i94VarL != null) {
                                                        Object objG22 = i94VarL.d.n.g(d94.d);
                                                        if (objG22 == null) {
                                                            objG22 = null;
                                                        }
                                                        w2Var = (w2) objG22;
                                                        while (w2Var == null && i94VarL != null) {
                                                            i94VarL = i94VarL.l();
                                                            if (i94VarL != null) {
                                                                Object objG23 = i94VarL.d.n.g(d94.d);
                                                                if (objG23 == null) {
                                                                    objG23 = null;
                                                                }
                                                                w2Var = (w2) objG23;
                                                            } else {
                                                                w2Var = null;
                                                            }
                                                        }
                                                        if (i94VarL == null) {
                                                            wv3 wv3VarG = i94Var.g();
                                                            return raVar.requestRectangleOnScreen(new Rect((int) Math.floor(wv3VarG.a), (int) Math.floor(wv3VarG.b), ji2.L((float) Math.ceil(wv3VarG.c)), ji2.L((float) Math.ceil(wv3VarG.d))));
                                                        }
                                                        long j = 0;
                                                        long jD = 0;
                                                        boolean z13 = false;
                                                        while (i94VarL != null) {
                                                            c72 c72Var2 = i94VarL.c;
                                                            w03 w03Var2 = i94VarL.d.n;
                                                            Object objG24 = w03Var2.g(d94.d);
                                                            if (objG24 == null) {
                                                                objG24 = null;
                                                            }
                                                            w2 w2Var17 = (w2) objG24;
                                                            if (w2Var17 != null) {
                                                                wv3 wv3VarC = wr1.c((iz1) c72Var2.Q.d);
                                                                q62 q62VarU = ((iz1) c72Var2.Q.d).u();
                                                                wv3 wv3VarF = wv3VarC.f(q62VarU != null ? ((f63) q62VarU).K0(j) : j);
                                                                f63 f63VarD = i94Var.d();
                                                                if (f63VarD == null) {
                                                                    jK0 = j;
                                                                } else {
                                                                    if (!f63VarD.A0().A) {
                                                                        f63VarD = null;
                                                                    }
                                                                    if (f63VarD != null) {
                                                                        jK0 = f63VarD.K0(j);
                                                                    } else {
                                                                        jK0 = j;
                                                                    }
                                                                }
                                                                long jE = g83.e(jK0, jD);
                                                                f63 f63VarD2 = i94Var.d();
                                                                wv3 wv3VarD = bu.d(jE, l93.o0(f63VarD2 != null ? f63VarD2.p : 0L));
                                                                float f3 = wv3VarD.a - wv3VarF.a;
                                                                float f4 = wv3VarD.c - wv3VarF.c;
                                                                if (Math.signum(f3) != Math.signum(f4)) {
                                                                    f3 = 0.0f;
                                                                } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                                    f3 = f4;
                                                                }
                                                                float f5 = wv3VarD.b - wv3VarF.b;
                                                                float f6 = wv3VarD.d - wv3VarF.d;
                                                                if (Math.signum(f5) != Math.signum(f6)) {
                                                                    f5 = 0.0f;
                                                                } else if (Math.abs(f5) >= Math.abs(f6)) {
                                                                    f5 = f6;
                                                                }
                                                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                                                if (g83.b(jFloatToRawIntBits2, 0L)) {
                                                                    jFloatToRawIntBits = jFloatToRawIntBits2;
                                                                } else {
                                                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                                                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                                                                    Object objG25 = w03Var2.g(n94.u);
                                                                    if (objG25 == null) {
                                                                        objG25 = null;
                                                                    }
                                                                    if (c72Var.K == r62Var) {
                                                                        fIntBitsToFloat2 = -fIntBitsToFloat2;
                                                                    }
                                                                    Object objG26 = w03Var2.g(n94.v);
                                                                    if (objG26 == null) {
                                                                        objG26 = null;
                                                                    }
                                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                                                }
                                                                wf1 wf1Var3 = (wf1) w2Var17.b;
                                                                z13 = (wf1Var3 != null && ((Boolean) wf1Var3.invoke(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))))).booleanValue()) || z13;
                                                                jD = g83.d(jD, jFloatToRawIntBits2);
                                                            }
                                                            i94VarL = i94VarL.l();
                                                            j = 0;
                                                        }
                                                        return z13;
                                                    }
                                                    w2Var = null;
                                                    break;
                                                case R.id.accessibilityActionSetProgress:
                                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                        Object objG27 = w03Var.g(d94.i);
                                                        w2 w2Var18 = (w2) (objG27 == null ? null : objG27);
                                                        if (w2Var18 != null && (if1Var2 = (if1) w2Var18.b) != null) {
                                                            return ((Boolean) if1Var2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                                        }
                                                    }
                                                    break;
                                                case R.id.accessibilityActionImeEnter:
                                                    Object objG28 = w03Var.g(d94.o);
                                                    w2 w2Var19 = (w2) (objG28 == null ? null : objG28);
                                                    if (w2Var19 != null && (gf1Var10 = (gf1) w2Var19.b) != null) {
                                                        return ((Boolean) gf1Var10.invoke()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case R.id.accessibilityActionScrollUp:
                                                        case R.id.accessibilityActionScrollLeft:
                                                        case R.id.accessibilityActionScrollDown:
                                                        case R.id.accessibilityActionScrollRight:
                                                            if (i2 == 4096) {
                                                                z5 = true;
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            if (i2 == 8192) {
                                                                z6 = true;
                                                            } else {
                                                                z6 = false;
                                                            }
                                                            if (i2 == 16908345) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (i2 == 16908347) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (i2 == 16908344) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            if (i2 == 16908346) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            if (z7) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = true;
                                                            }
                                                            if (z9) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = true;
                                                            }
                                                            if (z5) {
                                                                objG = w03Var.g(n94.c);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                xq3Var = (xq3) objG;
                                                                objG2 = w03Var.g(d94.i);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                w2 w2Var110 = (w2) objG2;
                                                                if (xq3Var != null) {
                                                                    jB = wr1.c((iz1) c72Var.Q.d).b();
                                                                    ArrayList arrayList3 = new ArrayList();
                                                                    objG3 = w03Var.g(d94.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    w2Var2 = (w2) objG3;
                                                                    if (w2Var2 == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = w03Var.g(d94.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    w2Var3 = (w2) objG4;
                                                                    if (w2Var3 != null) {
                                                                        sf1 sf1Var3 = w2Var3.b;
                                                                        objG5 = w03Var.g(n94.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        h64Var = (h64) objG5;
                                                                        if (h64Var == null) {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    jB = wr1.c((iz1) c72Var.Q.d).b();
                                                                    ArrayList arrayList4 = new ArrayList();
                                                                    objG3 = w03Var.g(d94.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    w2Var2 = (w2) objG3;
                                                                    if (w2Var2 == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = w03Var.g(d94.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    w2Var3 = (w2) objG4;
                                                                    if (w2Var3 != null) {
                                                                        sf1 sf1Var4 = w2Var3.b;
                                                                        objG5 = w03Var.g(n94.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        h64Var = (h64) objG5;
                                                                        if (h64Var == null) {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                objG = w03Var.g(n94.c);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                xq3Var = (xq3) objG;
                                                                objG2 = w03Var.g(d94.i);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                w2 w2Var111 = (w2) objG2;
                                                                if (xq3Var != null) {
                                                                    jB = wr1.c((iz1) c72Var.Q.d).b();
                                                                    ArrayList arrayList5 = new ArrayList();
                                                                    objG3 = w03Var.g(d94.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    w2Var2 = (w2) objG3;
                                                                    if (w2Var2 == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = w03Var.g(d94.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    w2Var3 = (w2) objG4;
                                                                    if (w2Var3 != null) {
                                                                        sf1 sf1Var5 = w2Var3.b;
                                                                        objG5 = w03Var.g(n94.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        h64Var = (h64) objG5;
                                                                        if (h64Var == null) {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    jB = wr1.c((iz1) c72Var.Q.d).b();
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    objG3 = w03Var.g(d94.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    w2Var2 = (w2) objG3;
                                                                    if (w2Var2 == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = w03Var.g(d94.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    w2Var3 = (w2) objG4;
                                                                    if (w2Var3 != null) {
                                                                        sf1 sf1Var6 = w2Var3.b;
                                                                        objG5 = w03Var.g(n94.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        h64Var = (h64) objG5;
                                                                        if (h64Var == null) {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            z6 = z6;
                                                                            objG6 = w03Var.g(n94.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            h64Var2 = (h64) objG6;
                                                                            if (h64Var2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                                                                                }
                                                                                if (z9) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (ya.x(h64Var2, fIntBitsToFloat)) {
                                                                                    p94Var = d94.x;
                                                                                    if (w03Var.c(p94Var)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = w03Var.g(d94.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            w2Var4 = (w2) obj2;
                                                                                        } else {
                                                                                            objG7 = w03Var.g(p94Var);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            w2Var4 = (w2) obj;
                                                                                        }
                                                                                        if (w2Var4 != null) {
                                                                                            return ((Boolean) gf1Var11.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case R.id.accessibilityActionPageUp:
                                                                    Object objG29 = w03Var.g(d94.x);
                                                                    w2 w2Var20 = (w2) (objG29 == null ? null : objG29);
                                                                    if (w2Var20 != null && (gf1Var13 = (gf1) w2Var20.b) != null) {
                                                                        return ((Boolean) gf1Var13.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                case R.id.accessibilityActionPageDown:
                                                                    Object objG30 = w03Var.g(d94.z);
                                                                    w2 w2Var21 = (w2) (objG30 == null ? null : objG30);
                                                                    if (w2Var21 != null && (gf1Var14 = (gf1) w2Var21.b) != null) {
                                                                        return ((Boolean) gf1Var14.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                case R.id.accessibilityActionPageLeft:
                                                                    Object objG31 = w03Var.g(d94.y);
                                                                    w2 w2Var22 = (w2) (objG31 == null ? null : objG31);
                                                                    if (w2Var22 != null && (gf1Var15 = (gf1) w2Var22.b) != null) {
                                                                        return ((Boolean) gf1Var15.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                case R.id.accessibilityActionPageRight:
                                                                    Object objG32 = w03Var.g(d94.A);
                                                                    w2 w2Var23 = (w2) (objG32 == null ? null : objG32);
                                                                    if (w2Var23 != null && (gf1Var16 = (gf1) w2Var23.b) != null) {
                                                                        return ((Boolean) gf1Var16.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mj4 mj4Var = (mj4) yaVar.E.b(i);
                                                                    if (mj4Var != null && ((CharSequence) mj4Var.b(i2)) != null) {
                                                                        Object objG33 = w03Var.g(d94.w);
                                                                        List list = (List) (objG33 == null ? null : objG33);
                                                                        if (list != null && list.size() > 0) {
                                                                            list.get(0).getClass();
                                                                            kf2.k();
                                                                            return false;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            Object objG34 = w03Var.g(n94.l);
                                            if (objG34 == null) {
                                                objG34 = null;
                                            }
                                            if (h12.c(objG34, bool)) {
                                                ((ey) raVar.getFocusOwner()).b(8, false, true);
                                                return true;
                                            }
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                z2 = true;
                                z = false;
                                if (yaVar.x == i) {
                                    yaVar.x = Integer.MIN_VALUE;
                                    yaVar.z = null;
                                    raVar.invalidate();
                                    ya.E(yaVar, i, 65536, null, 12);
                                }
                            }
                            return z2;
                        }
                        z2 = true;
                        z = false;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = yaVar.x) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                ya.E(yaVar, i3, 65536, null, 12);
                            }
                            yaVar.x = i;
                            raVar.invalidate();
                            ya.E(yaVar, i, 32768, null, 12);
                            return z2;
                        }
                    }
                }
                return z;
            default:
                z41 z41Var = (z41) z2Var;
                View view = z41Var.v;
                if (i == -1) {
                    WeakHashMap weakHashMap = j65.a;
                    return view.performAccessibilityAction(i2, bundle);
                }
                if (i2 == 1) {
                    return z41Var.w(i);
                }
                if (i2 == 2) {
                    return z41Var.j(i);
                }
                if (i2 == 64) {
                    AccessibilityManager accessibilityManager2 = z41Var.u;
                    if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i11 = z41Var.x) != i) {
                        if (i11 != Integer.MIN_VALUE) {
                            z41Var.x = Integer.MIN_VALUE;
                            view.invalidate();
                            z41Var.x(i11, 65536);
                        }
                        z41Var.x = i;
                        view.invalidate();
                        z41Var.x(i, 32768);
                        return true;
                    }
                } else {
                    if (i2 != 128) {
                        return z41Var.s(i, i2, bundle);
                    }
                    if (z41Var.x == i) {
                        z41Var.x = Integer.MIN_VALUE;
                        view.invalidate();
                        z41Var.x(i, 65536);
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.zh0
    public void y(int i, v3 v3Var, String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                ((ya) this.s).j(i, v3Var, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:102:0x0208  */
    /* JADX WARN: Code duplicated, block: B:105:0x0217  */
    /* JADX WARN: Code duplicated, block: B:107:0x0233  */
    /* JADX WARN: Code duplicated, block: B:109:0x023c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0288  */
    /* JADX WARN: Code duplicated, block: B:112:0x028b  */
    /* JADX WARN: Code duplicated, block: B:114:0x028f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0295  */
    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:150:0x0305  */
    /* JADX WARN: Code duplicated, block: B:152:0x030f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0320  */
    /* JADX WARN: Code duplicated, block: B:158:0x0351  */
    /* JADX WARN: Code duplicated, block: B:161:0x035c  */
    /* JADX WARN: Code duplicated, block: B:163:0x036c  */
    /* JADX WARN: Code duplicated, block: B:169:0x038a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0392  */
    /* JADX WARN: Code duplicated, block: B:174:0x03a4 A[LOOP:3: B:171:0x0390->B:174:0x03a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:191:0x0410  */
    /* JADX WARN: Code duplicated, block: B:195:0x042a  */
    /* JADX WARN: Code duplicated, block: B:197:0x043a  */
    /* JADX WARN: Code duplicated, block: B:205:0x045f  */
    /* JADX WARN: Code duplicated, block: B:207:0x046d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0474  */
    /* JADX WARN: Code duplicated, block: B:211:0x0488  */
    /* JADX WARN: Code duplicated, block: B:213:0x049a  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:220:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:225:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:228:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:231:0x0506  */
    /* JADX WARN: Code duplicated, block: B:232:0x050a  */
    /* JADX WARN: Code duplicated, block: B:235:0x0522  */
    /* JADX WARN: Code duplicated, block: B:238:0x0528  */
    /* JADX WARN: Code duplicated, block: B:240:0x052c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0531  */
    /* JADX WARN: Code duplicated, block: B:243:0x0535  */
    /* JADX WARN: Code duplicated, block: B:246:0x0541  */
    /* JADX WARN: Code duplicated, block: B:249:0x0547  */
    /* JADX WARN: Code duplicated, block: B:254:0x055d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0565  */
    /* JADX WARN: Code duplicated, block: B:259:0x056b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0572  */
    /* JADX WARN: Code duplicated, block: B:264:0x057f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0585  */
    /* JADX WARN: Code duplicated, block: B:269:0x0588  */
    /* JADX WARN: Code duplicated, block: B:272:0x059f A[LOOP:8: B:268:0x0586->B:272:0x059f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:278:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:283:0x05be  */
    /* JADX WARN: Code duplicated, block: B:284:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:287:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:289:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:290:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:293:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:295:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:296:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:299:0x061e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:300:0x0623  */
    /* JADX WARN: Code duplicated, block: B:303:0x063d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0650  */
    /* JADX WARN: Code duplicated, block: B:307:0x065a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0661  */
    /* JADX WARN: Code duplicated, block: B:311:0x0672  */
    /* JADX WARN: Code duplicated, block: B:312:0x067a  */
    /* JADX WARN: Code duplicated, block: B:315:0x0685  */
    /* JADX WARN: Code duplicated, block: B:316:0x068a  */
    /* JADX WARN: Code duplicated, block: B:319:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:321:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:326:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:328:0x06de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:331:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:334:0x0706  */
    /* JADX WARN: Code duplicated, block: B:336:0x0710  */
    /* JADX WARN: Code duplicated, block: B:339:0x0726  */
    /* JADX WARN: Code duplicated, block: B:342:0x073d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0753  */
    /* JADX WARN: Code duplicated, block: B:349:0x0765  */
    /* JADX WARN: Code duplicated, block: B:352:0x077d  */
    /* JADX WARN: Code duplicated, block: B:353:0x0784  */
    /* JADX WARN: Code duplicated, block: B:355:0x0787  */
    /* JADX WARN: Code duplicated, block: B:358:0x079a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:363:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:364:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:367:0x07df  */
    /* JADX WARN: Code duplicated, block: B:369:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:378:0x0806  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:380:0x080c  */
    /* JADX WARN: Code duplicated, block: B:388:0x0825  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:390:0x082b  */
    /* JADX WARN: Code duplicated, block: B:392:0x0835  */
    /* JADX WARN: Code duplicated, block: B:394:0x083e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0842  */
    /* JADX WARN: Code duplicated, block: B:400:0x0851  */
    /* JADX WARN: Code duplicated, block: B:402:0x0861  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:410:0x087d  */
    /* JADX WARN: Code duplicated, block: B:413:0x088a  */
    /* JADX WARN: Code duplicated, block: B:416:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:419:0x08af  */
    /* JADX WARN: Code duplicated, block: B:421:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:422:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:425:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:426:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:429:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:436:0x0906  */
    /* JADX WARN: Code duplicated, block: B:438:0x090a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:441:0x0912  */
    /* JADX WARN: Code duplicated, block: B:443:0x0920  */
    /* JADX WARN: Code duplicated, block: B:445:0x0924  */
    /* JADX WARN: Code duplicated, block: B:447:0x0932  */
    /* JADX WARN: Code duplicated, block: B:450:0x0938  */
    /* JADX WARN: Code duplicated, block: B:455:0x0942  */
    /* JADX WARN: Code duplicated, block: B:458:0x0952  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:460:0x0964  */
    /* JADX WARN: Code duplicated, block: B:462:0x0978  */
    /* JADX WARN: Code duplicated, block: B:464:0x0989  */
    /* JADX WARN: Code duplicated, block: B:468:0x0994  */
    /* JADX WARN: Code duplicated, block: B:470:0x099a  */
    /* JADX WARN: Code duplicated, block: B:471:0x099d  */
    /* JADX WARN: Code duplicated, block: B:473:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:474:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:477:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:479:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:482:0x09e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:485:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:487:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:503:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:505:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a72 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:518:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:528:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:531:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:533:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:536:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:539:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:542:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:543:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:551:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b60  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:565:0x0b93  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:569:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:571:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:572:0x0bc5  */
    /* JADX WARN: Code duplicated, block: B:576:0x0bde  */
    /* JADX WARN: Code duplicated, block: B:579:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:581:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:582:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:584:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:586:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:589:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:591:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:594:0x0c37  */
    /* JADX WARN: Code duplicated, block: B:595:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:598:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:599:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:602:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:605:0x0c7b  */
    /* JADX WARN: Code duplicated, block: B:615:0x0c90  */
    /* JADX WARN: Code duplicated, block: B:617:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0594 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0821 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x081c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x098b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x098b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01de  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:615:0x0c90, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r14v0, types: [v3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v20, types: [u01] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r2v5, types: [v3] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r5v127 */
    /* JADX WARN: Type inference failed for: r5v128 */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v89, types: [c72] */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91, types: [c72] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v66, types: [v3] */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v70, types: [v3] */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r9v13, types: [ya] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v62, types: [ya] */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v67 */
    @Override // defpackage.zh0
    public final v3 z(int i) throws Throwable {
        ?? Obtain;
        ?? v3Var;
        int i2;
        Throwable th;
        i94 i94VarL;
        ?? r2;
        int iIntValue;
        Integer numValueOf;
        g03 g03Var;
        mj4 mj4Var;
        Resources resources;
        e94 e94Var;
        w03 w03Var;
        Object objG;
        boolean zL;
        List listI;
        int size;
        boolean z;
        int i3;
        int i4;
        AccessibilityNodeInfo accessibilityNodeInfo;
        he heVarT;
        ya yaVar;
        g03 g03Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        i94 i94Var;
        w03 w03Var2;
        Resources resources2;
        ?? r0;
        p94 p94Var;
        w03 w03Var3;
        ?? r3;
        i94 i94Var2;
        String strS;
        Object objG2;
        qu4 qu4Var;
        Object objG3;
        Boolean bool;
        Object objG4;
        List list;
        ?? r4;
        Object objG5;
        String str;
        Object objG6;
        int i5;
        Boolean bool2;
        Integer num;
        int iIntValue2;
        p94 p94Var2;
        ya yaVar2;
        boolean z2;
        ?? r9;
        i94 i94VarL2;
        boolean z3;
        w2 w2Var;
        w2 w2Var2;
        w2 w2Var3;
        String strT;
        xq3 xq3Var;
        Object objG7;
        h64 h64Var;
        h64 h64Var2;
        int i6;
        CharSequence charSequence;
        boolean z4;
        int iD;
        ra raVar;
        int iD2;
        String str2;
        ?? r8;
        w2 w2Var4;
        w2 w2Var5;
        w2 w2Var6;
        e94 e94VarN;
        p94 p94Var3;
        List list2;
        int size2;
        h03 h03Var;
        int i7;
        boolean z5;
        p03 p03Var;
        int[] iArr;
        int i8;
        int[] iArrCopyOf;
        int i9;
        int i10;
        p03 p03Var2;
        ArrayList arrayList;
        int i11;
        Object objG8;
        Object objG9;
        Object objG10;
        boolean z6;
        r62 r62Var;
        c72 c72Var;
        o3 o3Var;
        o3 o3Var2;
        Object objG11;
        i94 i94VarL3;
        Object objG12;
        Object objG13;
        o40 o40Var;
        ArrayList arrayList2;
        List listI2;
        int size3;
        int i12;
        int i13;
        boolean zE;
        int i14;
        int i15;
        Object objG14;
        i94 i94Var3;
        p94 p94Var4;
        float f;
        ArrayList arrayList3;
        CharSequence charSequenceG;
        w2 w2Var7;
        ?? r5;
        List list3;
        ?? T;
        e94 e94VarV;
        boolean zC;
        Object objG15;
        e94 e94VarV2;
        w2 w2Var8;
        w2 w2Var9;
        w2 w2Var10;
        w2 w2Var11;
        hd5 hd5Var;
        ClipboardManager clipboardManager;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        int iD3;
        i94 i94VarL4;
        boolean zBooleanValue;
        e94 e94Var2;
        p94 p94Var5;
        Object objG16;
        oo0 density;
        yc5 yc5Var;
        SpannableString spannableString;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString2;
        ?? arrayList5;
        ?? arrayList6;
        int size4;
        int i16;
        ?? arrayList7;
        int size5;
        int i17;
        int size6;
        int i18;
        ge geVar;
        int i19;
        Object obj;
        int i20;
        ib2 ib2Var;
        WeakHashMap weakHashMap;
        Object s70Var;
        ge geVar2;
        hb2 hb2Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size7;
        int i21;
        ge geVar3;
        v25 v25Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size8;
        int i22;
        ge geVar4;
        p45 p45Var;
        int i23;
        int i24;
        int size9;
        int i25;
        ge geVar5;
        int size10;
        int i26;
        int i27;
        int i28;
        long jC;
        gb1 gb1Var;
        eb1 eb1Var;
        bs4 bs4Var;
        long j;
        sr4 sr4Var;
        as4 as4Var;
        as4 u50Var;
        SpannableString spannableString3;
        gb1 gb1Var2;
        int i29;
        boolean z7;
        boolean z8;
        int i30;
        int i31;
        int i32;
        i94 i94Var4;
        e02 e02VarS;
        int i33;
        k94 k94Var;
        boolean zC2;
        i94 i94Var5;
        Object parentForAccessibility;
        ?? r10;
        ?? r11;
        v3 v3Var2;
        int i34 = this.r;
        z2 z2Var = this.s;
        switch (i34) {
            case 0:
                Float fValueOf = Float.valueOf(0.0f);
                ya yaVar3 = (ya) z2Var;
                AccessibilityManager accessibilityManager = yaVar3.t;
                ra raVar2 = yaVar3.q;
                if (raVar2.getComposeViewContext().d().h().h == r92.n) {
                    if (accessibilityManager.isEnabled()) {
                        v3Var2 = null;
                    } else {
                        v3Var2 = new v3(AccessibilityNodeInfo.obtain());
                    }
                    r11 = yaVar3;
                    i5 = i;
                    r8 = v3Var2;
                } else {
                    k94 k94Var2 = (k94) yaVar3.s().b(i);
                    if (k94Var2 == null) {
                        if (accessibilityManager.isEnabled()) {
                            v3Var2 = null;
                        } else {
                            v3Var2 = new v3(AccessibilityNodeInfo.obtain());
                        }
                        r11 = yaVar3;
                        i5 = i;
                        r8 = v3Var2;
                    } else {
                        i94 i94Var6 = k94Var2.a;
                        e94 e94VarK = i94Var6.k();
                        c72 c72Var2 = i94Var6.c;
                        Object objG17 = e94VarK.n.g(n94.n);
                        if (objG17 == null) {
                            objG17 = null;
                        }
                        boolean zC3 = h12.c(objG17, Boolean.TRUE);
                        if (!zC3) {
                            Obtain = AccessibilityNodeInfo.obtain();
                            v3Var = new v3(Obtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                a3.n(Obtain, zC3);
                                th = null;
                            } else {
                                th = null;
                                v3Var.h(64, zC3);
                            }
                            if (i == -1) {
                                parentForAccessibility = raVar2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    r10 = (View) parentForAccessibility;
                                } else {
                                    r10 = th;
                                }
                                v3Var.b = -1;
                                Obtain.setParent(r10);
                            } else {
                                i94VarL = i94Var6.l();
                                if (i94VarL != null) {
                                    numValueOf = Integer.valueOf(i94VarL.f);
                                } else {
                                    r2 = th;
                                }
                                if (r2 != 0) {
                                    r2 = numValueOf;
                                    ?? r6 = th;
                                    cz1.c("semanticsNode " + i + " has null parent");
                                    er1.a();
                                    return r6;
                                }
                                iIntValue = r2.intValue();
                                if (iIntValue == raVar2.getSemanticsOwner().a().f) {
                                    r2 = numValueOf;
                                    iIntValue = -1;
                                }
                                r2 = numValueOf;
                                v3Var.b = iIntValue;
                                Obtain.setParent(raVar2, iIntValue);
                            }
                            v3Var.c = i;
                            Obtain.setSource(raVar2, i);
                            Obtain.setBoundsInScreen(yaVar3.k(k94Var2));
                            g03Var = yaVar3.W;
                            mj4Var = yaVar3.F;
                            resources = raVar2.getContext().getResources();
                            v3Var.i("android.view.View");
                            e94Var = i94Var6.d;
                            w03Var = e94Var.n;
                            if (w03Var.c(n94.D)) {
                                v3Var.i("android.widget.EditText");
                            }
                            if (w03Var.c(n94.z)) {
                                v3Var.i("android.widget.TextView");
                            }
                            objG = w03Var.g(n94.w);
                            if (objG == null) {
                                objG = th;
                            }
                            if (((m24) objG) != null && ((i94Var6.o() || i94Var6.i((4 & 1) != 0 ? !i94Var6.b : false, (4 & 2) == 0).isEmpty()) && (xl.B(i94Var6) || e94Var.p))) {
                                v3Var.i("android.widget.ImageView");
                            }
                            Obtain.setPackageName(raVar2.getContext().getPackageName());
                            Obtain.setImportantForAccessibility(wr1.I(i94Var6));
                            if (i2 >= 34) {
                                zL = a3.l(accessibilityManager);
                            } else {
                                zL = true;
                            }
                            listI = i94Var6.i((4 & 1) != 0 ? !i94Var6.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zL;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = v3Var.a;
                                if (i3 < size) {
                                    int i35 = i3;
                                    i94Var4 = (i94) listI.get(i3);
                                    List list5 = listI;
                                    e02VarS = yaVar3.s();
                                    int i36 = size;
                                    i33 = i94Var4.f;
                                    if (!e02VarS.a(i33)) {
                                        if (raVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(i94Var4.c) == null) {
                                            kf2.k();
                                        } else if (i33 != -1) {
                                            k94Var = (k94) yaVar3.s().b(i33);
                                            if (k94Var != null || (i94Var5 = k94Var.a) == null) {
                                                zC2 = false;
                                            } else {
                                                Object objG18 = i94Var5.k().n.g(n94.n);
                                                if (objG18 == null) {
                                                    objG18 = th;
                                                }
                                                zC2 = h12.c(objG18, Boolean.TRUE);
                                            }
                                            if (z || !zC2) {
                                                accessibilityNodeInfo.addChild(raVar2, i33);
                                            }
                                            g03Var.f(i33, i4);
                                            i4++;
                                        }
                                    }
                                    i3 = i35 + 1;
                                    listI = list5;
                                    size = i36;
                                } else {
                                    if (i == yaVar3.x) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        v3Var.b(o3.i);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        v3Var.b(o3.h);
                                    }
                                    heVarT = xl.t(i94Var6);
                                    if (heVarT != null) {
                                        raVar2.getFontFamilyResolver();
                                        density = raVar2.getDensity();
                                        yc5Var = yaVar3.S;
                                        String str3 = heVarT.o;
                                        list4 = heVarT.n;
                                        spannableString = new SpannableString(str3);
                                        arrayList4 = heVarT.p;
                                        if (arrayList4 != null) {
                                            size10 = arrayList4.size();
                                            i26 = 0;
                                            while (i26 < size10) {
                                                ArrayList arrayList8 = arrayList4;
                                                ge geVar6 = (ge) arrayList4.get(i26);
                                                int i37 = i26;
                                                ij4 ij4Var = (ij4) geVar6.a;
                                                int i38 = size10;
                                                i27 = geVar6.b;
                                                i28 = geVar6.c;
                                                ya yaVar4 = yaVar3;
                                                jC = ij4Var.a.c();
                                                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                                                i94 i94Var7 = i94Var6;
                                                long j2 = ij4Var.b;
                                                gb1Var = ij4Var.c;
                                                eb1Var = ij4Var.d;
                                                bs4Var = ij4Var.j;
                                                g03 g03Var3 = g03Var;
                                                vd2 vd2Var = ij4Var.k;
                                                w03 w03Var4 = w03Var;
                                                Resources resources3 = resources;
                                                j = ij4Var.l;
                                                sr4Var = ij4Var.m;
                                                as4Var = ij4Var.a;
                                                if (x40.c(jC, as4Var.c())) {
                                                    u50Var = as4Var;
                                                } else if (jC != 16) {
                                                    u50Var = new u50(jC);
                                                } else {
                                                    u50Var = rv2.F;
                                                }
                                                uo.P(spannableString, u50Var.c(), i27, i28);
                                                spannableString3 = spannableString;
                                                uo.Q(spannableString3, j2, density, i27, i28);
                                                if (gb1Var == null || eb1Var != null) {
                                                    if (gb1Var == null) {
                                                        gb1Var2 = gb1.p;
                                                    } else {
                                                        gb1Var2 = gb1Var;
                                                    }
                                                    if (eb1Var != null) {
                                                        i29 = eb1Var.a;
                                                    } else {
                                                        i29 = 0;
                                                    }
                                                    if (h12.j(gb1Var2.n, gb1.o.n) >= 0) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (i29 == 1) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (!z8 && z7) {
                                                        i30 = 3;
                                                    } else if (z7) {
                                                        i30 = 1;
                                                    } else if (z8) {
                                                        i30 = 2;
                                                    } else {
                                                        i30 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(i30);
                                                    i31 = 33;
                                                    spannableString3.setSpan(styleSpan, i27, i28, 33);
                                                } else {
                                                    i31 = 33;
                                                }
                                                if (sr4Var != null) {
                                                    i32 = sr4Var.a;
                                                    if ((i32 | 1) == i32) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i27, i28, i31);
                                                    }
                                                    if ((i32 | 2) == i32) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i27, i28, i31);
                                                    }
                                                }
                                                if (bs4Var != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(bs4Var.a), i27, i28, i31);
                                                }
                                                uo.R(spannableString3, vd2Var, i27, i28);
                                                if (j != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(e35.U(j)), i27, i28, i31);
                                                }
                                                i26 = i37 + 1;
                                                spannableString = spannableString3;
                                                arrayList4 = arrayList8;
                                                size10 = i38;
                                                yaVar3 = yaVar4;
                                                i94Var6 = i94Var7;
                                                accessibilityNodeInfo = accessibilityNodeInfo3;
                                                g03Var = g03Var3;
                                                resources = resources3;
                                                w03Var = w03Var4;
                                            }
                                        }
                                        yaVar = yaVar3;
                                        g03Var2 = g03Var;
                                        spannableString2 = spannableString;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i94Var = i94Var6;
                                        w03Var2 = w03Var;
                                        resources2 = resources;
                                        int length = str3.length();
                                        arrayList5 = u01.n;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            for (i25 = 0; i25 < size9; i25++) {
                                                Object obj2 = list4.get(i25);
                                                geVar5 = (ge) obj2;
                                                if (!(geVar5.a instanceof p45) && ie.a(0, length, geVar5.b, geVar5.c)) {
                                                    arrayList6.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size4 = arrayList6.size();
                                        for (i16 = 0; i16 < size4; i16++) {
                                            ge geVar7 = (ge) arrayList6.get(i16);
                                            p45Var = (p45) geVar7.a;
                                            i23 = geVar7.b;
                                            i24 = geVar7.c;
                                            if (p45Var instanceof p45) {
                                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(p45Var.a).build(), i23, i24, 33);
                                            } else {
                                                er1.n();
                                            }
                                        }
                                        int length2 = str3.length();
                                        if (list4 != null) {
                                            arrayList7 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            for (i22 = 0; i22 < size8; i22++) {
                                                Object obj3 = list4.get(i22);
                                                geVar4 = (ge) obj3;
                                                if (!(geVar4.a instanceof v25) && ie.a(0, length2, geVar4.b, geVar4.c)) {
                                                    arrayList7.add(obj3);
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList5;
                                        }
                                        size5 = arrayList7.size();
                                        for (i17 = 0; i17 < size5; i17++) {
                                            ge geVar8 = (ge) arrayList7.get(i17);
                                            v25Var = (v25) geVar8.a;
                                            int i39 = geVar8.b;
                                            int i40 = geVar8.c;
                                            weakHashMap3 = (WeakHashMap) yc5Var.n;
                                            uRLSpan2 = weakHashMap3.get(v25Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(v25Var.a);
                                                weakHashMap3.put(v25Var, uRLSpan2);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan2, i39, i40, 33);
                                        }
                                        int length3 = str3.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            for (i21 = 0; i21 < size7; i21++) {
                                                Object obj4 = list4.get(i21);
                                                geVar3 = (ge) obj4;
                                                if (!(geVar3.a instanceof ib2) && ie.a(0, length3, geVar3.b, geVar3.c)) {
                                                    arrayList5.add(obj4);
                                                }
                                            }
                                        }
                                        size6 = arrayList5.size();
                                        for (i18 = 0; i18 < size6; i18++) {
                                            geVar = (ge) arrayList5.get(i18);
                                            i19 = geVar.b;
                                            obj = geVar.a;
                                            i20 = geVar.c;
                                            if (i19 != i20) {
                                                ib2Var = (ib2) obj;
                                                if (ib2Var instanceof hb2) {
                                                    obj.getClass();
                                                    hb2Var = (hb2) obj;
                                                    geVar2 = new ge(i19, i20, hb2Var);
                                                    weakHashMap2 = (WeakHashMap) yc5Var.o;
                                                    uRLSpan = weakHashMap2.get(geVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(hb2Var.a);
                                                        weakHashMap2.put(geVar2, uRLSpan);
                                                    }
                                                    spannableString2.setSpan((URLSpan) uRLSpan, i19, i20, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) yc5Var.p;
                                                    s70Var = weakHashMap.get(geVar);
                                                    if (s70Var == null) {
                                                        s70Var = new s70(ib2Var);
                                                        weakHashMap.put(geVar, s70Var);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) s70Var, i19, i20, 33);
                                                }
                                            }
                                        }
                                        r0 = (SpannableString) ya.P(spannableString2);
                                    } else {
                                        yaVar = yaVar3;
                                        g03Var2 = g03Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i94Var = i94Var6;
                                        w03Var2 = w03Var;
                                        resources2 = resources;
                                        c72Var2 = c72Var2;
                                        r0 = th;
                                    }
                                    v3Var.n(r0);
                                    p94Var = n94.K;
                                    w03Var3 = w03Var2;
                                    if (w03Var3.c(p94Var)) {
                                        Obtain.setContentInvalid(true);
                                        objG16 = w03Var3.g(p94Var);
                                        if (objG16 == null) {
                                            objG16 = th;
                                        }
                                        AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG16);
                                        r3 = accessibilityNodeInfo4;
                                    } else {
                                        r3 = accessibilityNodeInfo2;
                                    }
                                    i94Var2 = i94Var;
                                    Resources resources4 = resources2;
                                    strS = xl.s(i94Var2, resources4);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        p3.i(r3, strS);
                                    } else {
                                        r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strS);
                                    }
                                    r3.setCheckable(xl.r(i94Var2));
                                    objG2 = w03Var3.g(n94.H);
                                    if (objG2 == null) {
                                        objG2 = th;
                                    }
                                    qu4Var = (qu4) objG2;
                                    if (qu4Var != null) {
                                        if (qu4Var == qu4.n) {
                                            r3.setChecked(true);
                                        } else if (qu4Var == qu4.o) {
                                            r3.setChecked(false);
                                        }
                                    }
                                    objG3 = w03Var3.g(n94.G);
                                    if (objG3 == null) {
                                        objG3 = th;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        r3.setChecked(bool.booleanValue());
                                    }
                                    if (e94Var.p || i94Var2.i((4 & 1) != 0 ? !i94Var2.b : false, (4 & 2) == 0).isEmpty()) {
                                        objG4 = w03Var3.g(n94.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) q40.x0(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r3.setContentDescription(r4);
                                    }
                                    objG5 = w03Var3.g(n94.x);
                                    if (objG5 == null) {
                                        objG5 = th;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        i94VarL4 = i94Var2;
                                        while (true) {
                                            if (i94VarL4 != null) {
                                                e94Var2 = i94VarL4.d;
                                                p94Var5 = zz1.k;
                                                if (e94Var2.n.c(p94Var5)) {
                                                    zBooleanValue = ((Boolean) e94Var2.d(p94Var5)).booleanValue();
                                                } else {
                                                    i94VarL4 = i94VarL4.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            Obtain.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = w03Var3.g(n94.h);
                                    if (objG6 == null) {
                                        objG6 = th;
                                    }
                                    if (((j15) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            r3.setHeading(true);
                                        } else {
                                            v3Var.h(2, true);
                                        }
                                    }
                                    if (((j15) bu.o(e94Var, n94.i)) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            Obtain.setTextEntryKey(true);
                                        } else {
                                            v3Var.h(8, true);
                                        }
                                    }
                                    i5 = i;
                                    if (i5 != -1) {
                                        iD3 = g03Var2.d(i94Var2.f);
                                        if (iD3 != -1) {
                                            Obtain.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    Obtain.setPassword(w03Var3.c(n94.J));
                                    Object objO = bu.o(e94Var, n94.M);
                                    bool2 = Boolean.TRUE;
                                    Obtain.setEditable(h12.c(objO, bool2));
                                    num = (Integer) bu.o(e94Var, n94.N);
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r3.setMaxTextLength(iIntValue2);
                                    r3.setEnabled(xl.b(i94Var2));
                                    p94Var2 = n94.l;
                                    r3.setFocusable(w03Var3.c(p94Var2));
                                    if (Obtain.isFocusable()) {
                                        r3.setFocused(((Boolean) e94Var.d(p94Var2)).booleanValue());
                                        if (Obtain.isFocused()) {
                                            v3Var.a(2);
                                            ya yaVar5 = yaVar;
                                            yaVar5.y = i5;
                                            yaVar2 = yaVar5;
                                        } else {
                                            r9 = yaVar;
                                            z2 = true;
                                            v3Var.a(1);
                                        }
                                        r3.setVisibleToUser(wr1.H(i94Var2) ^ z2);
                                        if (i94Var2.o()) {
                                            i94VarL2 = i94Var2.l();
                                            i94VarL2.getClass();
                                        } else {
                                            i94VarL2 = i94Var2;
                                        }
                                        if (i94VarL2.m().d()) {
                                            z3 = false;
                                            r3.setVisibleToUser(false);
                                        } else {
                                            z3 = false;
                                        }
                                        xa3.r(bu.o(e94Var, n94.k));
                                        r3.setClickable(z3);
                                        w2Var = (w2) bu.o(e94Var, d94.b);
                                        if (w2Var != null) {
                                            h12.c(bu.o(e94Var, n94.G), bool2);
                                            r3.setClickable(true);
                                            if (xl.b(i94Var2) && Obtain.isClickable()) {
                                                v3Var.b(new o3(16, w2Var.a));
                                            }
                                        }
                                        r3.setLongClickable(false);
                                        w2Var2 = (w2) bu.o(e94Var, d94.c);
                                        if (w2Var2 != null) {
                                            r3.setLongClickable(true);
                                            if (xl.b(i94Var2)) {
                                                v3Var.b(new o3(32, w2Var2.a));
                                            }
                                        }
                                        w2Var3 = (w2) bu.o(e94Var, d94.p);
                                        if (w2Var3 != null) {
                                            v3Var.b(new o3(16384, w2Var3.a));
                                        }
                                        if (xl.b(i94Var2)) {
                                            w2Var8 = (w2) bu.o(e94Var, d94.k);
                                            if (w2Var8 != null) {
                                                v3Var.b(new o3(2097152, w2Var8.a));
                                            }
                                            w2Var9 = (w2) bu.o(e94Var, d94.o);
                                            if (w2Var9 != null) {
                                                v3Var.b(new o3(R.id.accessibilityActionImeEnter, w2Var9.a));
                                            }
                                            w2Var10 = (w2) bu.o(e94Var, d94.q);
                                            if (w2Var10 != null) {
                                                v3Var.b(new o3(65536, w2Var10.a));
                                            }
                                            w2Var11 = (w2) bu.o(e94Var, d94.r);
                                            if (w2Var11 != null && Obtain.isFocused()) {
                                                hd5Var = (hd5) raVar2.getClipboardManager();
                                                clipboardManager = (ClipboardManager) hd5Var.p;
                                                if (clipboardManager == null) {
                                                    Object systemService = ((Context) hd5Var.o).getSystemService("clipboard");
                                                    systemService.getClass();
                                                    clipboardManager = (ClipboardManager) systemService;
                                                    hd5Var.p = clipboardManager;
                                                }
                                                primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    v3Var.b(new o3(32768, w2Var11.a));
                                                }
                                            }
                                        }
                                        strT = ya.t(i94Var2);
                                        if (strT != null && strT.length() != 0) {
                                            Obtain.setTextSelection(r9.r(i94Var2), r9.q(i94Var2));
                                            w2Var7 = (w2) bu.o(e94Var, d94.j);
                                            if (w2Var7 != null) {
                                                r5 = w2Var7.a;
                                            } else {
                                                r5 = th;
                                            }
                                            v3Var.b(new o3(131072, (String) r5));
                                            v3Var.a(256);
                                            v3Var.a(512);
                                            r3.setMovementGranularities(11);
                                            list3 = (List) bu.o(e94Var, n94.a);
                                            if ((list3 != null || list3.isEmpty()) && w03Var3.c(d94.a) && (!w03Var3.c(n94.D) || h12.c(bu.o(e94Var, p94Var2), bool2))) {
                                                T = c72Var2.t();
                                                while (true) {
                                                    if (T == 0) {
                                                        T = th;
                                                    } else {
                                                        e94VarV2 = T.v();
                                                        if (e94VarV2 == null && e94VarV2.p) {
                                                            if (e94VarV2.n.c(n94.D)) {
                                                            }
                                                        }
                                                        T = T.t();
                                                    }
                                                }
                                                if (T == 0) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                } else {
                                                    e94VarV = T.v();
                                                    if (e94VarV != null) {
                                                        objG15 = e94VarV.n.g(n94.l);
                                                        if (objG15 == null) {
                                                            objG15 = th;
                                                        }
                                                        zC = h12.c(objG15, Boolean.TRUE);
                                                    } else {
                                                        zC = false;
                                                    }
                                                    if (zC) {
                                                        r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = v3Var.g();
                                            if (charSequenceG != null && charSequenceG.length() != 0 && w03Var3.c(d94.a)) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (w03Var3.c(n94.x)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (w03Var3.c(n94.O)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                Obtain.setAvailableExtraData(arrayList3);
                                            }
                                        }
                                        xq3Var = (xq3) bu.o(e94Var, n94.c);
                                        if (xq3Var != null) {
                                            p94Var4 = d94.i;
                                            if (w03Var3.c(p94Var4)) {
                                                v3Var.i("android.widget.SeekBar");
                                            } else {
                                                v3Var.i("android.widget.ProgressBar");
                                            }
                                            if (xq3Var != xq3.b) {
                                                f = 0.0f;
                                                r3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                            } else {
                                                f = 0.0f;
                                            }
                                            if (w03Var3.c(p94Var4) && xl.b(i94Var2) && f > gb.j(fValueOf.floatValue(), fValueOf.floatValue())) {
                                                v3Var.b(o3.k);
                                            }
                                        }
                                        gb.c(v3Var, i94Var2);
                                        te5.L(v3Var, i94Var2);
                                        objG7 = i94Var2.k().n.g(n94.g);
                                        if (objG7 == null) {
                                            objG7 = th;
                                        }
                                        if (objG7 == null) {
                                            i94VarL3 = i94Var2.l();
                                            if (i94VarL3 != null) {
                                                objG12 = i94VarL3.k().n.g(n94.e);
                                                if (objG12 == null) {
                                                    objG12 = th;
                                                }
                                                if (objG12 != null) {
                                                    objG13 = i94VarL3.k().n.g(n94.f);
                                                    if (objG13 == null) {
                                                        objG13 = th;
                                                    }
                                                    o40Var = (o40) objG13;
                                                    if (o40Var != null || (o40Var.a >= 0 && o40Var.b >= 0)) {
                                                        if (i94Var2.k().n.c(n94.G)) {
                                                            arrayList2 = new ArrayList();
                                                            listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                            size3 = listI2.size();
                                                            i13 = 0;
                                                            for (i12 = 0; i12 < size3; i12++) {
                                                                i94Var3 = (i94) listI2.get(i12);
                                                                if (i94Var3.k().n.c(n94.G)) {
                                                                    arrayList2.add(i94Var3);
                                                                    if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                        i13++;
                                                                    }
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                zE = te5.e(arrayList2);
                                                                if (zE) {
                                                                    i14 = 0;
                                                                } else {
                                                                    i14 = i13;
                                                                }
                                                                if (zE) {
                                                                    i15 = i13;
                                                                } else {
                                                                    i15 = 0;
                                                                }
                                                                objG14 = i94Var2.k().n.g(n94.G);
                                                                if (objG14 == null) {
                                                                    objG14 = Boolean.FALSE;
                                                                }
                                                                v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            kf2.k();
                                        }
                                        h64Var = (h64) bu.o(i94Var2.n(), n94.u);
                                        w2 w2Var12 = (w2) bu.o(i94Var2.n(), d94.d);
                                        if (h64Var != null && w2Var12 != null) {
                                            objG10 = i94Var2.k().n.g(n94.f);
                                            if (objG10 == null) {
                                                objG10 = th;
                                            }
                                            if (objG10 == null) {
                                                objG11 = i94Var2.k().n.g(n94.e);
                                                if (objG11 == null) {
                                                    objG11 = th;
                                                }
                                                if (objG11 == null) {
                                                    v3Var.i("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) h64Var.b.invoke()).floatValue() > 0.0f) {
                                                v3Var.m(true);
                                            }
                                            if (xl.b(i94Var2)) {
                                                z6 = ya.z(h64Var);
                                                r62Var = r62.o;
                                                if (z6) {
                                                    v3Var.b(o3.j);
                                                    c72Var = c72Var2;
                                                    if (c72Var.K == r62Var) {
                                                        o3Var2 = o3.q;
                                                    } else {
                                                        o3Var2 = o3.s;
                                                    }
                                                    v3Var.b(o3Var2);
                                                } else {
                                                    c72Var = c72Var2;
                                                }
                                                if (ya.y(h64Var)) {
                                                    v3Var.b(o3.k);
                                                    if (c72Var.K == r62Var) {
                                                        o3Var = o3.s;
                                                    } else {
                                                        o3Var = o3.q;
                                                    }
                                                    v3Var.b(o3Var);
                                                }
                                            }
                                        }
                                        h64Var2 = (h64) bu.o(i94Var2.n(), n94.v);
                                        if (h64Var2 != null && w2Var12 != null) {
                                            objG8 = i94Var2.k().n.g(n94.f);
                                            if (objG8 == null) {
                                                objG8 = th;
                                            }
                                            if (objG8 == null) {
                                                objG9 = i94Var2.k().n.g(n94.e);
                                                if (objG9 == null) {
                                                    objG9 = th;
                                                }
                                                if (objG9 == null) {
                                                    v3Var.i("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) h64Var2.b.invoke()).floatValue() > 0.0f) {
                                                v3Var.m(true);
                                            }
                                            if (xl.b(i94Var2)) {
                                                if (ya.z(h64Var2)) {
                                                    v3Var.b(o3.j);
                                                    v3Var.b(o3.r);
                                                }
                                                if (ya.y(h64Var2)) {
                                                    v3Var.b(o3.k);
                                                    v3Var.b(o3.p);
                                                }
                                            }
                                        }
                                        i6 = Build.VERSION.SDK_INT;
                                        if (i6 >= 29) {
                                            e35.k(v3Var, i94Var2);
                                        }
                                        charSequence = (CharSequence) bu.o(i94Var2.n(), n94.d);
                                        if (i6 >= 28) {
                                            r3.setPaneTitle(charSequence);
                                        } else {
                                            r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (xl.b(i94Var2)) {
                                            w2Var4 = (w2) bu.o(i94Var2.n(), d94.s);
                                            if (w2Var4 != null) {
                                                v3Var.b(new o3(262144, w2Var4.a));
                                            }
                                            w2Var5 = (w2) bu.o(i94Var2.n(), d94.t);
                                            if (w2Var5 != null) {
                                                v3Var.b(new o3(524288, w2Var5.a));
                                            }
                                            w2Var6 = (w2) bu.o(i94Var2.n(), d94.u);
                                            if (w2Var6 != null) {
                                                v3Var.b(new o3(1048576, w2Var6.a));
                                            }
                                            e94VarN = i94Var2.n();
                                            p94Var3 = d94.w;
                                            if (e94VarN.n.c(p94Var3)) {
                                                list2 = (List) i94Var2.n().d(p94Var3);
                                                size2 = list2.size();
                                                h03Var = ya.a0;
                                                i7 = h03Var.b;
                                                if (size2 < i7) {
                                                    mj4 mj4Var2 = new mj4(0);
                                                    p03 p03VarA = r73.a();
                                                    if (mj4Var.n) {
                                                        su3.f(mj4Var);
                                                    }
                                                    if (su3.h(mj4Var.q, i5, mj4Var.o) >= 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (z5) {
                                                        p03Var = (p03) mj4Var.b(i5);
                                                        iArr = h03Var.a;
                                                        i8 = h03Var.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i41 = iArr[i9];
                                                            int i42 = i8;
                                                            i11 = i10 + 1;
                                                            p03 p03Var3 = p03Var;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i41;
                                                            i9++;
                                                            i10 = i11;
                                                            i8 = i42;
                                                            p03Var = p03Var3;
                                                        }
                                                        p03Var2 = p03Var;
                                                        arrayList = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            xa3.r(list2.get(0));
                                                            p03Var2.getClass();
                                                            throw th;
                                                        }
                                                        if (arrayList.size() > 0) {
                                                            xa3.r(arrayList.get(0));
                                                            if (i10 <= 0) {
                                                                int i43 = iArrCopyOf[0];
                                                                throw th;
                                                            }
                                                            kf2.h("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        xa3.r(list2.get(0));
                                                        h03Var.b(0);
                                                        throw th;
                                                    }
                                                    r9.E.d(i5, mj4Var2);
                                                    mj4Var.d(i5, p03VarA);
                                                } else {
                                                    kf2.o(b11.j(i7, "Can't have more than ", " custom actions for one widget"));
                                                }
                                            }
                                        }
                                        z4 = xl.z(i94Var2, resources4);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            r3.setScreenReaderFocusable(z4);
                                        } else {
                                            v3Var.h(1, z4);
                                        }
                                        iD = r9.O.d(i5);
                                        if (iD != -1) {
                                            gh0.B(raVar2.getAndroidViewsHandler$ui(), iD);
                                            raVar = raVar2;
                                            r3.setTraversalBefore(raVar, iD);
                                            r9.j(i5, v3Var, r9.Q, th);
                                        } else {
                                            raVar = raVar2;
                                        }
                                        iD2 = r9.P.d(i5);
                                        if (iD2 != -1) {
                                            gh0.B(raVar.getAndroidViewsHandler$ui(), iD2);
                                        }
                                        str2 = (String) bu.o(i94Var2.n(), zz1.l);
                                        if (str2 != null) {
                                            v3Var.i(str2);
                                        }
                                        r8 = v3Var;
                                        r11 = r9;
                                    } else {
                                        yaVar2 = yaVar;
                                    }
                                    z2 = true;
                                    r9 = yaVar2;
                                    r3.setVisibleToUser(wr1.H(i94Var2) ^ z2);
                                    if (i94Var2.o()) {
                                        i94VarL2 = i94Var2.l();
                                        i94VarL2.getClass();
                                    } else {
                                        i94VarL2 = i94Var2;
                                    }
                                    if (i94VarL2.m().d()) {
                                        z3 = false;
                                        r3.setVisibleToUser(false);
                                    } else {
                                        z3 = false;
                                    }
                                    xa3.r(bu.o(e94Var, n94.k));
                                    r3.setClickable(z3);
                                    w2Var = (w2) bu.o(e94Var, d94.b);
                                    if (w2Var != null) {
                                        h12.c(bu.o(e94Var, n94.G), bool2);
                                        r3.setClickable(true);
                                        if (xl.b(i94Var2)) {
                                            v3Var.b(new o3(16, w2Var.a));
                                        }
                                    }
                                    r3.setLongClickable(false);
                                    w2Var2 = (w2) bu.o(e94Var, d94.c);
                                    if (w2Var2 != null) {
                                        r3.setLongClickable(true);
                                        if (xl.b(i94Var2)) {
                                            v3Var.b(new o3(32, w2Var2.a));
                                        }
                                    }
                                    w2Var3 = (w2) bu.o(e94Var, d94.p);
                                    if (w2Var3 != null) {
                                        v3Var.b(new o3(16384, w2Var3.a));
                                    }
                                    if (xl.b(i94Var2)) {
                                        w2Var8 = (w2) bu.o(e94Var, d94.k);
                                        if (w2Var8 != null) {
                                            v3Var.b(new o3(2097152, w2Var8.a));
                                        }
                                        w2Var9 = (w2) bu.o(e94Var, d94.o);
                                        if (w2Var9 != null) {
                                            v3Var.b(new o3(R.id.accessibilityActionImeEnter, w2Var9.a));
                                        }
                                        w2Var10 = (w2) bu.o(e94Var, d94.q);
                                        if (w2Var10 != null) {
                                            v3Var.b(new o3(65536, w2Var10.a));
                                        }
                                        w2Var11 = (w2) bu.o(e94Var, d94.r);
                                        if (w2Var11 != null) {
                                            hd5Var = (hd5) raVar2.getClipboardManager();
                                            clipboardManager = (ClipboardManager) hd5Var.p;
                                            if (clipboardManager == null) {
                                                Object systemService2 = ((Context) hd5Var.o).getSystemService("clipboard");
                                                systemService2.getClass();
                                                clipboardManager = (ClipboardManager) systemService2;
                                                hd5Var.p = clipboardManager;
                                            }
                                            primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                v3Var.b(new o3(32768, w2Var11.a));
                                            }
                                        }
                                    }
                                    strT = ya.t(i94Var2);
                                    if (strT != null) {
                                        Obtain.setTextSelection(r9.r(i94Var2), r9.q(i94Var2));
                                        w2Var7 = (w2) bu.o(e94Var, d94.j);
                                        if (w2Var7 != null) {
                                            r5 = w2Var7.a;
                                        } else {
                                            r5 = th;
                                        }
                                        v3Var.b(new o3(131072, (String) r5));
                                        v3Var.a(256);
                                        v3Var.a(512);
                                        r3.setMovementGranularities(11);
                                        list3 = (List) bu.o(e94Var, n94.a);
                                        if (list3 != null) {
                                            T = c72Var2.t();
                                            while (true) {
                                                if (T == 0) {
                                                    T = th;
                                                } else {
                                                    e94VarV2 = T.v();
                                                    if (e94VarV2 == null) {
                                                    }
                                                    T = T.t();
                                                }
                                            }
                                            if (T == 0) {
                                                r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                            } else {
                                                e94VarV = T.v();
                                                if (e94VarV != null) {
                                                    objG15 = e94VarV.n.g(n94.l);
                                                    if (objG15 == null) {
                                                        objG15 = th;
                                                    }
                                                    zC = h12.c(objG15, Boolean.TRUE);
                                                } else {
                                                    zC = false;
                                                }
                                                if (zC) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            T = c72Var2.t();
                                            while (true) {
                                                if (T == 0) {
                                                    T = th;
                                                } else {
                                                    e94VarV2 = T.v();
                                                    if (e94VarV2 == null) {
                                                    }
                                                    T = T.t();
                                                }
                                            }
                                            if (T == 0) {
                                                r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                            } else {
                                                e94VarV = T.v();
                                                if (e94VarV != null) {
                                                    objG15 = e94VarV.n.g(n94.l);
                                                    if (objG15 == null) {
                                                        objG15 = th;
                                                    }
                                                    zC = h12.c(objG15, Boolean.TRUE);
                                                } else {
                                                    zC = false;
                                                }
                                                if (zC) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = v3Var.g();
                                        if (charSequenceG != null) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (w03Var3.c(n94.x)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (w03Var3.c(n94.O)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            Obtain.setAvailableExtraData(arrayList3);
                                        }
                                    }
                                    xq3Var = (xq3) bu.o(e94Var, n94.c);
                                    if (xq3Var != null) {
                                        p94Var4 = d94.i;
                                        if (w03Var3.c(p94Var4)) {
                                            v3Var.i("android.widget.SeekBar");
                                        } else {
                                            v3Var.i("android.widget.ProgressBar");
                                        }
                                        if (xq3Var != xq3.b) {
                                            f = 0.0f;
                                            r3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                        } else {
                                            f = 0.0f;
                                        }
                                        if (w03Var3.c(p94Var4)) {
                                            v3Var.b(o3.k);
                                        }
                                    }
                                    gb.c(v3Var, i94Var2);
                                    te5.L(v3Var, i94Var2);
                                    objG7 = i94Var2.k().n.g(n94.g);
                                    if (objG7 == null) {
                                        objG7 = th;
                                    }
                                    if (objG7 == null) {
                                        i94VarL3 = i94Var2.l();
                                        if (i94VarL3 != null) {
                                            objG12 = i94VarL3.k().n.g(n94.e);
                                            if (objG12 == null) {
                                                objG12 = th;
                                            }
                                            if (objG12 != null) {
                                                objG13 = i94VarL3.k().n.g(n94.f);
                                                if (objG13 == null) {
                                                    objG13 = th;
                                                }
                                                o40Var = (o40) objG13;
                                                if (o40Var != null) {
                                                    if (i94Var2.k().n.c(n94.G)) {
                                                        arrayList2 = new ArrayList();
                                                        listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        while (i12 < size3) {
                                                            i94Var3 = (i94) listI2.get(i12);
                                                            if (i94Var3.k().n.c(n94.G)) {
                                                                arrayList2.add(i94Var3);
                                                                if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            zE = te5.e(arrayList2);
                                                            if (zE) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                            if (zE) {
                                                                i15 = i13;
                                                            } else {
                                                                i15 = 0;
                                                            }
                                                            objG14 = i94Var2.k().n.g(n94.G);
                                                            if (objG14 == null) {
                                                                objG14 = Boolean.FALSE;
                                                            }
                                                            v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                        }
                                                    }
                                                } else if (i94Var2.k().n.c(n94.G)) {
                                                    arrayList2 = new ArrayList();
                                                    listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                    size3 = listI2.size();
                                                    i13 = 0;
                                                    while (i12 < size3) {
                                                        i94Var3 = (i94) listI2.get(i12);
                                                        if (i94Var3.k().n.c(n94.G)) {
                                                            arrayList2.add(i94Var3);
                                                            if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                    if (!arrayList2.isEmpty()) {
                                                        zE = te5.e(arrayList2);
                                                        if (zE) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = i13;
                                                        }
                                                        if (zE) {
                                                            i15 = i13;
                                                        } else {
                                                            i15 = 0;
                                                        }
                                                        objG14 = i94Var2.k().n.g(n94.G);
                                                        if (objG14 == null) {
                                                            objG14 = Boolean.FALSE;
                                                        }
                                                        v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        kf2.k();
                                    }
                                    h64Var = (h64) bu.o(i94Var2.n(), n94.u);
                                    w2 w2Var13 = (w2) bu.o(i94Var2.n(), d94.d);
                                    if (h64Var != null) {
                                        objG10 = i94Var2.k().n.g(n94.f);
                                        if (objG10 == null) {
                                            objG10 = th;
                                        }
                                        if (objG10 == null) {
                                            objG11 = i94Var2.k().n.g(n94.e);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            if (objG11 == null) {
                                                v3Var.i("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) h64Var.b.invoke()).floatValue() > 0.0f) {
                                            v3Var.m(true);
                                        }
                                        if (xl.b(i94Var2)) {
                                            z6 = ya.z(h64Var);
                                            r62Var = r62.o;
                                            if (z6) {
                                                v3Var.b(o3.j);
                                                c72Var = c72Var2;
                                                if (c72Var.K == r62Var) {
                                                    o3Var2 = o3.q;
                                                } else {
                                                    o3Var2 = o3.s;
                                                }
                                                v3Var.b(o3Var2);
                                            } else {
                                                c72Var = c72Var2;
                                            }
                                            if (ya.y(h64Var)) {
                                                v3Var.b(o3.k);
                                                if (c72Var.K == r62Var) {
                                                    o3Var = o3.s;
                                                } else {
                                                    o3Var = o3.q;
                                                }
                                                v3Var.b(o3Var);
                                            }
                                        }
                                    }
                                    h64Var2 = (h64) bu.o(i94Var2.n(), n94.v);
                                    if (h64Var2 != null) {
                                        objG8 = i94Var2.k().n.g(n94.f);
                                        if (objG8 == null) {
                                            objG8 = th;
                                        }
                                        if (objG8 == null) {
                                            objG9 = i94Var2.k().n.g(n94.e);
                                            if (objG9 == null) {
                                                objG9 = th;
                                            }
                                            if (objG9 == null) {
                                                v3Var.i("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) h64Var2.b.invoke()).floatValue() > 0.0f) {
                                            v3Var.m(true);
                                        }
                                        if (xl.b(i94Var2)) {
                                            if (ya.z(h64Var2)) {
                                                v3Var.b(o3.j);
                                                v3Var.b(o3.r);
                                            }
                                            if (ya.y(h64Var2)) {
                                                v3Var.b(o3.k);
                                                v3Var.b(o3.p);
                                            }
                                        }
                                    }
                                    i6 = Build.VERSION.SDK_INT;
                                    if (i6 >= 29) {
                                        e35.k(v3Var, i94Var2);
                                    }
                                    charSequence = (CharSequence) bu.o(i94Var2.n(), n94.d);
                                    if (i6 >= 28) {
                                        r3.setPaneTitle(charSequence);
                                    } else {
                                        r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (xl.b(i94Var2)) {
                                        w2Var4 = (w2) bu.o(i94Var2.n(), d94.s);
                                        if (w2Var4 != null) {
                                            v3Var.b(new o3(262144, w2Var4.a));
                                        }
                                        w2Var5 = (w2) bu.o(i94Var2.n(), d94.t);
                                        if (w2Var5 != null) {
                                            v3Var.b(new o3(524288, w2Var5.a));
                                        }
                                        w2Var6 = (w2) bu.o(i94Var2.n(), d94.u);
                                        if (w2Var6 != null) {
                                            v3Var.b(new o3(1048576, w2Var6.a));
                                        }
                                        e94VarN = i94Var2.n();
                                        p94Var3 = d94.w;
                                        if (e94VarN.n.c(p94Var3)) {
                                            list2 = (List) i94Var2.n().d(p94Var3);
                                            size2 = list2.size();
                                            h03Var = ya.a0;
                                            i7 = h03Var.b;
                                            if (size2 < i7) {
                                                mj4 mj4Var3 = new mj4(0);
                                                p03 p03VarA2 = r73.a();
                                                if (mj4Var.n) {
                                                    su3.f(mj4Var);
                                                }
                                                if (su3.h(mj4Var.q, i5, mj4Var.o) >= 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    p03Var = (p03) mj4Var.b(i5);
                                                    iArr = h03Var.a;
                                                    i8 = h03Var.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i44 = iArr[i9];
                                                        int i45 = i8;
                                                        i11 = i10 + 1;
                                                        p03 p03Var4 = p03Var;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i10] = i44;
                                                        i9++;
                                                        i10 = i11;
                                                        i8 = i45;
                                                        p03Var = p03Var4;
                                                    }
                                                    p03Var2 = p03Var;
                                                    arrayList = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        xa3.r(list2.get(0));
                                                        p03Var2.getClass();
                                                        throw th;
                                                    }
                                                    if (arrayList.size() > 0) {
                                                        xa3.r(arrayList.get(0));
                                                        if (i10 <= 0) {
                                                            int i46 = iArrCopyOf[0];
                                                            throw th;
                                                        }
                                                        kf2.h("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    xa3.r(list2.get(0));
                                                    h03Var.b(0);
                                                    throw th;
                                                }
                                                r9.E.d(i5, mj4Var3);
                                                mj4Var.d(i5, p03VarA2);
                                            } else {
                                                kf2.o(b11.j(i7, "Can't have more than ", " custom actions for one widget"));
                                            }
                                        }
                                    }
                                    z4 = xl.z(i94Var2, resources4);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        r3.setScreenReaderFocusable(z4);
                                    } else {
                                        v3Var.h(1, z4);
                                    }
                                    iD = r9.O.d(i5);
                                    if (iD != -1) {
                                        gh0.B(raVar2.getAndroidViewsHandler$ui(), iD);
                                        raVar = raVar2;
                                        r3.setTraversalBefore(raVar, iD);
                                        r9.j(i5, v3Var, r9.Q, th);
                                    } else {
                                        raVar = raVar2;
                                    }
                                    iD2 = r9.P.d(i5);
                                    if (iD2 != -1) {
                                        gh0.B(raVar.getAndroidViewsHandler$ui(), iD2);
                                    }
                                    str2 = (String) bu.o(i94Var2.n(), zz1.l);
                                    if (str2 != null) {
                                        v3Var.i(str2);
                                    }
                                    r8 = v3Var;
                                    r11 = r9;
                                }
                                return th;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 34 ? a3.l(accessibilityManager) : true) {
                            Obtain = AccessibilityNodeInfo.obtain();
                            v3Var = new v3(Obtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                a3.n(Obtain, zC3);
                                th = null;
                            } else {
                                th = null;
                                v3Var.h(64, zC3);
                            }
                            if (i == -1) {
                                parentForAccessibility = raVar2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    r10 = (View) parentForAccessibility;
                                } else {
                                    r10 = th;
                                }
                                v3Var.b = -1;
                                Obtain.setParent(r10);
                            } else {
                                i94VarL = i94Var6.l();
                                if (i94VarL != null) {
                                    numValueOf = Integer.valueOf(i94VarL.f);
                                } else {
                                    r2 = th;
                                }
                                if (r2 != 0) {
                                    r2 = numValueOf;
                                    ?? r7 = th;
                                    cz1.c("semanticsNode " + i + " has null parent");
                                    er1.a();
                                    return r7;
                                }
                                iIntValue = r2.intValue();
                                if (iIntValue == raVar2.getSemanticsOwner().a().f) {
                                    r2 = numValueOf;
                                    iIntValue = -1;
                                }
                                r2 = numValueOf;
                                v3Var.b = iIntValue;
                                Obtain.setParent(raVar2, iIntValue);
                            }
                            v3Var.c = i;
                            Obtain.setSource(raVar2, i);
                            Obtain.setBoundsInScreen(yaVar3.k(k94Var2));
                            g03Var = yaVar3.W;
                            mj4Var = yaVar3.F;
                            resources = raVar2.getContext().getResources();
                            v3Var.i("android.view.View");
                            e94Var = i94Var6.d;
                            w03Var = e94Var.n;
                            if (w03Var.c(n94.D)) {
                                v3Var.i("android.widget.EditText");
                            }
                            if (w03Var.c(n94.z)) {
                                v3Var.i("android.widget.TextView");
                            }
                            objG = w03Var.g(n94.w);
                            if (objG == null) {
                                objG = th;
                            }
                            if (((m24) objG) != null) {
                                v3Var.i("android.widget.ImageView");
                            }
                            Obtain.setPackageName(raVar2.getContext().getPackageName());
                            Obtain.setImportantForAccessibility(wr1.I(i94Var6));
                            if (i2 >= 34) {
                                zL = a3.l(accessibilityManager);
                            } else {
                                zL = true;
                            }
                            listI = i94Var6.i((4 & 1) != 0 ? !i94Var6.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zL;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = v3Var.a;
                                if (i3 < size) {
                                    int i310 = i3;
                                    i94Var4 = (i94) listI.get(i3);
                                    List list6 = listI;
                                    e02VarS = yaVar3.s();
                                    int i311 = size;
                                    i33 = i94Var4.f;
                                    if (!e02VarS.a(i33)) {
                                        if (raVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(i94Var4.c) == null) {
                                            kf2.k();
                                        } else if (i33 != -1) {
                                            k94Var = (k94) yaVar3.s().b(i33);
                                            if (k94Var != null) {
                                                zC2 = false;
                                            } else {
                                                zC2 = false;
                                            }
                                            if (z) {
                                                accessibilityNodeInfo.addChild(raVar2, i33);
                                            } else {
                                                accessibilityNodeInfo.addChild(raVar2, i33);
                                            }
                                            g03Var.f(i33, i4);
                                            i4++;
                                        }
                                    }
                                    i3 = i310 + 1;
                                    listI = list6;
                                    size = i311;
                                } else {
                                    if (i == yaVar3.x) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        v3Var.b(o3.i);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        v3Var.b(o3.h);
                                    }
                                    heVarT = xl.t(i94Var6);
                                    if (heVarT != null) {
                                        raVar2.getFontFamilyResolver();
                                        density = raVar2.getDensity();
                                        yc5Var = yaVar3.S;
                                        String str4 = heVarT.o;
                                        list4 = heVarT.n;
                                        spannableString = new SpannableString(str4);
                                        arrayList4 = heVarT.p;
                                        if (arrayList4 != null) {
                                            size10 = arrayList4.size();
                                            i26 = 0;
                                            while (i26 < size10) {
                                                ArrayList arrayList9 = arrayList4;
                                                ge geVar9 = (ge) arrayList4.get(i26);
                                                int i312 = i26;
                                                ij4 ij4Var2 = (ij4) geVar9.a;
                                                int i313 = size10;
                                                i27 = geVar9.b;
                                                i28 = geVar9.c;
                                                ya yaVar6 = yaVar3;
                                                jC = ij4Var2.a.c();
                                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                                                i94 i94Var8 = i94Var6;
                                                long j3 = ij4Var2.b;
                                                gb1Var = ij4Var2.c;
                                                eb1Var = ij4Var2.d;
                                                bs4Var = ij4Var2.j;
                                                g03 g03Var4 = g03Var;
                                                vd2 vd2Var2 = ij4Var2.k;
                                                w03 w03Var5 = w03Var;
                                                Resources resources5 = resources;
                                                j = ij4Var2.l;
                                                sr4Var = ij4Var2.m;
                                                as4Var = ij4Var2.a;
                                                if (x40.c(jC, as4Var.c())) {
                                                    u50Var = as4Var;
                                                } else if (jC != 16) {
                                                    u50Var = new u50(jC);
                                                } else {
                                                    u50Var = rv2.F;
                                                }
                                                uo.P(spannableString, u50Var.c(), i27, i28);
                                                spannableString3 = spannableString;
                                                uo.Q(spannableString3, j3, density, i27, i28);
                                                if (gb1Var == null) {
                                                    if (gb1Var == null) {
                                                        gb1Var2 = gb1.p;
                                                    } else {
                                                        gb1Var2 = gb1Var;
                                                    }
                                                    if (eb1Var != null) {
                                                        i29 = eb1Var.a;
                                                    } else {
                                                        i29 = 0;
                                                    }
                                                    if (h12.j(gb1Var2.n, gb1.o.n) >= 0) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (i29 == 1) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (!z8) {
                                                        if (z7) {
                                                            i30 = 1;
                                                        } else if (z8) {
                                                            i30 = 2;
                                                        } else {
                                                            i30 = 0;
                                                        }
                                                    } else if (z7) {
                                                        i30 = 1;
                                                    } else if (z8) {
                                                        i30 = 2;
                                                    } else {
                                                        i30 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(i30);
                                                    i31 = 33;
                                                    spannableString3.setSpan(styleSpan2, i27, i28, 33);
                                                } else {
                                                    if (gb1Var == null) {
                                                        gb1Var2 = gb1.p;
                                                    } else {
                                                        gb1Var2 = gb1Var;
                                                    }
                                                    if (eb1Var != null) {
                                                        i29 = eb1Var.a;
                                                    } else {
                                                        i29 = 0;
                                                    }
                                                    if (h12.j(gb1Var2.n, gb1.o.n) >= 0) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (i29 == 1) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (!z8) {
                                                        if (z7) {
                                                            i30 = 1;
                                                        } else if (z8) {
                                                            i30 = 2;
                                                        } else {
                                                            i30 = 0;
                                                        }
                                                    } else if (z7) {
                                                        i30 = 1;
                                                    } else if (z8) {
                                                        i30 = 2;
                                                    } else {
                                                        i30 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(i30);
                                                    i31 = 33;
                                                    spannableString3.setSpan(styleSpan3, i27, i28, 33);
                                                }
                                                if (sr4Var != null) {
                                                    i32 = sr4Var.a;
                                                    if ((i32 | 1) == i32) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i27, i28, i31);
                                                    }
                                                    if ((i32 | 2) == i32) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i27, i28, i31);
                                                    }
                                                }
                                                if (bs4Var != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(bs4Var.a), i27, i28, i31);
                                                }
                                                uo.R(spannableString3, vd2Var2, i27, i28);
                                                if (j != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(e35.U(j)), i27, i28, i31);
                                                }
                                                i26 = i312 + 1;
                                                spannableString = spannableString3;
                                                arrayList4 = arrayList9;
                                                size10 = i313;
                                                yaVar3 = yaVar6;
                                                i94Var6 = i94Var8;
                                                accessibilityNodeInfo = accessibilityNodeInfo5;
                                                g03Var = g03Var4;
                                                resources = resources5;
                                                w03Var = w03Var5;
                                            }
                                        }
                                        yaVar = yaVar3;
                                        g03Var2 = g03Var;
                                        spannableString2 = spannableString;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i94Var = i94Var6;
                                        w03Var2 = w03Var;
                                        resources2 = resources;
                                        int length4 = str4.length();
                                        arrayList5 = u01.n;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            while (i25 < size9) {
                                                Object obj5 = list4.get(i25);
                                                geVar5 = (ge) obj5;
                                                if (!(geVar5.a instanceof p45)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size4 = arrayList6.size();
                                        while (i16 < size4) {
                                            ge geVar10 = (ge) arrayList6.get(i16);
                                            p45Var = (p45) geVar10.a;
                                            i23 = geVar10.b;
                                            i24 = geVar10.c;
                                            if (p45Var instanceof p45) {
                                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(p45Var.a).build(), i23, i24, 33);
                                            } else {
                                                er1.n();
                                            }
                                        }
                                        int length5 = str4.length();
                                        if (list4 != null) {
                                            arrayList7 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            while (i22 < size8) {
                                                Object obj6 = list4.get(i22);
                                                geVar4 = (ge) obj6;
                                                if (!(geVar4.a instanceof v25)) {
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList5;
                                        }
                                        size5 = arrayList7.size();
                                        while (i17 < size5) {
                                            ge geVar11 = (ge) arrayList7.get(i17);
                                            v25Var = (v25) geVar11.a;
                                            int i314 = geVar11.b;
                                            int i47 = geVar11.c;
                                            weakHashMap3 = (WeakHashMap) yc5Var.n;
                                            uRLSpan2 = weakHashMap3.get(v25Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(v25Var.a);
                                                weakHashMap3.put(v25Var, uRLSpan2);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan2, i314, i47, 33);
                                        }
                                        int length6 = str4.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            while (i21 < size7) {
                                                Object obj7 = list4.get(i21);
                                                geVar3 = (ge) obj7;
                                                if (!(geVar3.a instanceof ib2)) {
                                                }
                                            }
                                        }
                                        size6 = arrayList5.size();
                                        while (i18 < size6) {
                                            geVar = (ge) arrayList5.get(i18);
                                            i19 = geVar.b;
                                            obj = geVar.a;
                                            i20 = geVar.c;
                                            if (i19 != i20) {
                                                ib2Var = (ib2) obj;
                                                if (ib2Var instanceof hb2) {
                                                    obj.getClass();
                                                    hb2Var = (hb2) obj;
                                                    geVar2 = new ge(i19, i20, hb2Var);
                                                    weakHashMap2 = (WeakHashMap) yc5Var.o;
                                                    uRLSpan = weakHashMap2.get(geVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(hb2Var.a);
                                                        weakHashMap2.put(geVar2, uRLSpan);
                                                    }
                                                    spannableString2.setSpan((URLSpan) uRLSpan, i19, i20, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) yc5Var.p;
                                                    s70Var = weakHashMap.get(geVar);
                                                    if (s70Var == null) {
                                                        s70Var = new s70(ib2Var);
                                                        weakHashMap.put(geVar, s70Var);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) s70Var, i19, i20, 33);
                                                }
                                            }
                                        }
                                        r0 = (SpannableString) ya.P(spannableString2);
                                    } else {
                                        yaVar = yaVar3;
                                        g03Var2 = g03Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i94Var = i94Var6;
                                        w03Var2 = w03Var;
                                        resources2 = resources;
                                        c72Var2 = c72Var2;
                                        r0 = th;
                                    }
                                    v3Var.n(r0);
                                    p94Var = n94.K;
                                    w03Var3 = w03Var2;
                                    if (w03Var3.c(p94Var)) {
                                        Obtain.setContentInvalid(true);
                                        objG16 = w03Var3.g(p94Var);
                                        if (objG16 == null) {
                                            objG16 = th;
                                        }
                                        AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo6.setError((CharSequence) objG16);
                                        r3 = accessibilityNodeInfo6;
                                    } else {
                                        r3 = accessibilityNodeInfo2;
                                    }
                                    i94Var2 = i94Var;
                                    Resources resources6 = resources2;
                                    strS = xl.s(i94Var2, resources6);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        p3.i(r3, strS);
                                    } else {
                                        r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strS);
                                    }
                                    r3.setCheckable(xl.r(i94Var2));
                                    objG2 = w03Var3.g(n94.H);
                                    if (objG2 == null) {
                                        objG2 = th;
                                    }
                                    qu4Var = (qu4) objG2;
                                    if (qu4Var != null) {
                                        if (qu4Var == qu4.n) {
                                            r3.setChecked(true);
                                        } else if (qu4Var == qu4.o) {
                                            r3.setChecked(false);
                                        }
                                    }
                                    objG3 = w03Var3.g(n94.G);
                                    if (objG3 == null) {
                                        objG3 = th;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        r3.setChecked(bool.booleanValue());
                                    }
                                    if (e94Var.p) {
                                        objG4 = w03Var3.g(n94.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) q40.x0(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r3.setContentDescription(r4);
                                    } else {
                                        objG4 = w03Var3.g(n94.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) q40.x0(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r3.setContentDescription(r4);
                                    }
                                    objG5 = w03Var3.g(n94.x);
                                    if (objG5 == null) {
                                        objG5 = th;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        i94VarL4 = i94Var2;
                                        while (true) {
                                            if (i94VarL4 != null) {
                                                e94Var2 = i94VarL4.d;
                                                p94Var5 = zz1.k;
                                                if (e94Var2.n.c(p94Var5)) {
                                                    zBooleanValue = ((Boolean) e94Var2.d(p94Var5)).booleanValue();
                                                } else {
                                                    i94VarL4 = i94VarL4.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            Obtain.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = w03Var3.g(n94.h);
                                    if (objG6 == null) {
                                        objG6 = th;
                                    }
                                    if (((j15) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            r3.setHeading(true);
                                        } else {
                                            v3Var.h(2, true);
                                        }
                                    }
                                    if (((j15) bu.o(e94Var, n94.i)) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            Obtain.setTextEntryKey(true);
                                        } else {
                                            v3Var.h(8, true);
                                        }
                                    }
                                    i5 = i;
                                    if (i5 != -1) {
                                        iD3 = g03Var2.d(i94Var2.f);
                                        if (iD3 != -1) {
                                            Obtain.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    Obtain.setPassword(w03Var3.c(n94.J));
                                    Object objO2 = bu.o(e94Var, n94.M);
                                    bool2 = Boolean.TRUE;
                                    Obtain.setEditable(h12.c(objO2, bool2));
                                    num = (Integer) bu.o(e94Var, n94.N);
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r3.setMaxTextLength(iIntValue2);
                                    r3.setEnabled(xl.b(i94Var2));
                                    p94Var2 = n94.l;
                                    r3.setFocusable(w03Var3.c(p94Var2));
                                    if (Obtain.isFocusable()) {
                                        r3.setFocused(((Boolean) e94Var.d(p94Var2)).booleanValue());
                                        if (Obtain.isFocused()) {
                                            v3Var.a(2);
                                            ya yaVar7 = yaVar;
                                            yaVar7.y = i5;
                                            yaVar2 = yaVar7;
                                        } else {
                                            r9 = yaVar;
                                            z2 = true;
                                            v3Var.a(1);
                                        }
                                        r3.setVisibleToUser(wr1.H(i94Var2) ^ z2);
                                        if (i94Var2.o()) {
                                            i94VarL2 = i94Var2.l();
                                            i94VarL2.getClass();
                                        } else {
                                            i94VarL2 = i94Var2;
                                        }
                                        if (i94VarL2.m().d()) {
                                            z3 = false;
                                            r3.setVisibleToUser(false);
                                        } else {
                                            z3 = false;
                                        }
                                        xa3.r(bu.o(e94Var, n94.k));
                                        r3.setClickable(z3);
                                        w2Var = (w2) bu.o(e94Var, d94.b);
                                        if (w2Var != null) {
                                            h12.c(bu.o(e94Var, n94.G), bool2);
                                            r3.setClickable(true);
                                            if (xl.b(i94Var2)) {
                                                v3Var.b(new o3(16, w2Var.a));
                                            }
                                        }
                                        r3.setLongClickable(false);
                                        w2Var2 = (w2) bu.o(e94Var, d94.c);
                                        if (w2Var2 != null) {
                                            r3.setLongClickable(true);
                                            if (xl.b(i94Var2)) {
                                                v3Var.b(new o3(32, w2Var2.a));
                                            }
                                        }
                                        w2Var3 = (w2) bu.o(e94Var, d94.p);
                                        if (w2Var3 != null) {
                                            v3Var.b(new o3(16384, w2Var3.a));
                                        }
                                        if (xl.b(i94Var2)) {
                                            w2Var8 = (w2) bu.o(e94Var, d94.k);
                                            if (w2Var8 != null) {
                                                v3Var.b(new o3(2097152, w2Var8.a));
                                            }
                                            w2Var9 = (w2) bu.o(e94Var, d94.o);
                                            if (w2Var9 != null) {
                                                v3Var.b(new o3(R.id.accessibilityActionImeEnter, w2Var9.a));
                                            }
                                            w2Var10 = (w2) bu.o(e94Var, d94.q);
                                            if (w2Var10 != null) {
                                                v3Var.b(new o3(65536, w2Var10.a));
                                            }
                                            w2Var11 = (w2) bu.o(e94Var, d94.r);
                                            if (w2Var11 != null) {
                                                hd5Var = (hd5) raVar2.getClipboardManager();
                                                clipboardManager = (ClipboardManager) hd5Var.p;
                                                if (clipboardManager == null) {
                                                    Object systemService3 = ((Context) hd5Var.o).getSystemService("clipboard");
                                                    systemService3.getClass();
                                                    clipboardManager = (ClipboardManager) systemService3;
                                                    hd5Var.p = clipboardManager;
                                                }
                                                primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    v3Var.b(new o3(32768, w2Var11.a));
                                                }
                                            }
                                        }
                                        strT = ya.t(i94Var2);
                                        if (strT != null) {
                                            Obtain.setTextSelection(r9.r(i94Var2), r9.q(i94Var2));
                                            w2Var7 = (w2) bu.o(e94Var, d94.j);
                                            if (w2Var7 != null) {
                                                r5 = w2Var7.a;
                                            } else {
                                                r5 = th;
                                            }
                                            v3Var.b(new o3(131072, (String) r5));
                                            v3Var.a(256);
                                            v3Var.a(512);
                                            r3.setMovementGranularities(11);
                                            list3 = (List) bu.o(e94Var, n94.a);
                                            if (list3 != null) {
                                                T = c72Var2.t();
                                                while (true) {
                                                    if (T == 0) {
                                                        T = th;
                                                    } else {
                                                        e94VarV2 = T.v();
                                                        if (e94VarV2 == null) {
                                                        }
                                                        T = T.t();
                                                    }
                                                }
                                                if (T == 0) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                } else {
                                                    e94VarV = T.v();
                                                    if (e94VarV != null) {
                                                        objG15 = e94VarV.n.g(n94.l);
                                                        if (objG15 == null) {
                                                            objG15 = th;
                                                        }
                                                        zC = h12.c(objG15, Boolean.TRUE);
                                                    } else {
                                                        zC = false;
                                                    }
                                                    if (zC) {
                                                        r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                            } else {
                                                T = c72Var2.t();
                                                while (true) {
                                                    if (T == 0) {
                                                        T = th;
                                                    } else {
                                                        e94VarV2 = T.v();
                                                        if (e94VarV2 == null) {
                                                        }
                                                        T = T.t();
                                                    }
                                                }
                                                if (T == 0) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                } else {
                                                    e94VarV = T.v();
                                                    if (e94VarV != null) {
                                                        objG15 = e94VarV.n.g(n94.l);
                                                        if (objG15 == null) {
                                                            objG15 = th;
                                                        }
                                                        zC = h12.c(objG15, Boolean.TRUE);
                                                    } else {
                                                        zC = false;
                                                    }
                                                    if (zC) {
                                                        r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = v3Var.g();
                                            if (charSequenceG != null) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (w03Var3.c(n94.x)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (w03Var3.c(n94.O)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                Obtain.setAvailableExtraData(arrayList3);
                                            }
                                        }
                                        xq3Var = (xq3) bu.o(e94Var, n94.c);
                                        if (xq3Var != null) {
                                            p94Var4 = d94.i;
                                            if (w03Var3.c(p94Var4)) {
                                                v3Var.i("android.widget.SeekBar");
                                            } else {
                                                v3Var.i("android.widget.ProgressBar");
                                            }
                                            if (xq3Var != xq3.b) {
                                                f = 0.0f;
                                                r3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                            } else {
                                                f = 0.0f;
                                            }
                                            if (w03Var3.c(p94Var4)) {
                                                v3Var.b(o3.k);
                                            }
                                        }
                                        gb.c(v3Var, i94Var2);
                                        te5.L(v3Var, i94Var2);
                                        objG7 = i94Var2.k().n.g(n94.g);
                                        if (objG7 == null) {
                                            objG7 = th;
                                        }
                                        if (objG7 == null) {
                                            i94VarL3 = i94Var2.l();
                                            if (i94VarL3 != null) {
                                                objG12 = i94VarL3.k().n.g(n94.e);
                                                if (objG12 == null) {
                                                    objG12 = th;
                                                }
                                                if (objG12 != null) {
                                                    objG13 = i94VarL3.k().n.g(n94.f);
                                                    if (objG13 == null) {
                                                        objG13 = th;
                                                    }
                                                    o40Var = (o40) objG13;
                                                    if (o40Var != null) {
                                                        if (i94Var2.k().n.c(n94.G)) {
                                                            arrayList2 = new ArrayList();
                                                            listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                            size3 = listI2.size();
                                                            i13 = 0;
                                                            while (i12 < size3) {
                                                                i94Var3 = (i94) listI2.get(i12);
                                                                if (i94Var3.k().n.c(n94.G)) {
                                                                    arrayList2.add(i94Var3);
                                                                    if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                        i13++;
                                                                    }
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                zE = te5.e(arrayList2);
                                                                if (zE) {
                                                                    i14 = 0;
                                                                } else {
                                                                    i14 = i13;
                                                                }
                                                                if (zE) {
                                                                    i15 = i13;
                                                                } else {
                                                                    i15 = 0;
                                                                }
                                                                objG14 = i94Var2.k().n.g(n94.G);
                                                                if (objG14 == null) {
                                                                    objG14 = Boolean.FALSE;
                                                                }
                                                                v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                            }
                                                        }
                                                    } else if (i94Var2.k().n.c(n94.G)) {
                                                        arrayList2 = new ArrayList();
                                                        listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        while (i12 < size3) {
                                                            i94Var3 = (i94) listI2.get(i12);
                                                            if (i94Var3.k().n.c(n94.G)) {
                                                                arrayList2.add(i94Var3);
                                                                if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            zE = te5.e(arrayList2);
                                                            if (zE) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                            if (zE) {
                                                                i15 = i13;
                                                            } else {
                                                                i15 = 0;
                                                            }
                                                            objG14 = i94Var2.k().n.g(n94.G);
                                                            if (objG14 == null) {
                                                                objG14 = Boolean.FALSE;
                                                            }
                                                            v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            kf2.k();
                                        }
                                        h64Var = (h64) bu.o(i94Var2.n(), n94.u);
                                        w2 w2Var14 = (w2) bu.o(i94Var2.n(), d94.d);
                                        if (h64Var != null) {
                                            objG10 = i94Var2.k().n.g(n94.f);
                                            if (objG10 == null) {
                                                objG10 = th;
                                            }
                                            if (objG10 == null) {
                                                objG11 = i94Var2.k().n.g(n94.e);
                                                if (objG11 == null) {
                                                    objG11 = th;
                                                }
                                                if (objG11 == null) {
                                                    v3Var.i("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) h64Var.b.invoke()).floatValue() > 0.0f) {
                                                v3Var.m(true);
                                            }
                                            if (xl.b(i94Var2)) {
                                                z6 = ya.z(h64Var);
                                                r62Var = r62.o;
                                                if (z6) {
                                                    v3Var.b(o3.j);
                                                    c72Var = c72Var2;
                                                    if (c72Var.K == r62Var) {
                                                        o3Var2 = o3.q;
                                                    } else {
                                                        o3Var2 = o3.s;
                                                    }
                                                    v3Var.b(o3Var2);
                                                } else {
                                                    c72Var = c72Var2;
                                                }
                                                if (ya.y(h64Var)) {
                                                    v3Var.b(o3.k);
                                                    if (c72Var.K == r62Var) {
                                                        o3Var = o3.s;
                                                    } else {
                                                        o3Var = o3.q;
                                                    }
                                                    v3Var.b(o3Var);
                                                }
                                            }
                                        }
                                        h64Var2 = (h64) bu.o(i94Var2.n(), n94.v);
                                        if (h64Var2 != null) {
                                            objG8 = i94Var2.k().n.g(n94.f);
                                            if (objG8 == null) {
                                                objG8 = th;
                                            }
                                            if (objG8 == null) {
                                                objG9 = i94Var2.k().n.g(n94.e);
                                                if (objG9 == null) {
                                                    objG9 = th;
                                                }
                                                if (objG9 == null) {
                                                    v3Var.i("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) h64Var2.b.invoke()).floatValue() > 0.0f) {
                                                v3Var.m(true);
                                            }
                                            if (xl.b(i94Var2)) {
                                                if (ya.z(h64Var2)) {
                                                    v3Var.b(o3.j);
                                                    v3Var.b(o3.r);
                                                }
                                                if (ya.y(h64Var2)) {
                                                    v3Var.b(o3.k);
                                                    v3Var.b(o3.p);
                                                }
                                            }
                                        }
                                        i6 = Build.VERSION.SDK_INT;
                                        if (i6 >= 29) {
                                            e35.k(v3Var, i94Var2);
                                        }
                                        charSequence = (CharSequence) bu.o(i94Var2.n(), n94.d);
                                        if (i6 >= 28) {
                                            r3.setPaneTitle(charSequence);
                                        } else {
                                            r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (xl.b(i94Var2)) {
                                            w2Var4 = (w2) bu.o(i94Var2.n(), d94.s);
                                            if (w2Var4 != null) {
                                                v3Var.b(new o3(262144, w2Var4.a));
                                            }
                                            w2Var5 = (w2) bu.o(i94Var2.n(), d94.t);
                                            if (w2Var5 != null) {
                                                v3Var.b(new o3(524288, w2Var5.a));
                                            }
                                            w2Var6 = (w2) bu.o(i94Var2.n(), d94.u);
                                            if (w2Var6 != null) {
                                                v3Var.b(new o3(1048576, w2Var6.a));
                                            }
                                            e94VarN = i94Var2.n();
                                            p94Var3 = d94.w;
                                            if (e94VarN.n.c(p94Var3)) {
                                                list2 = (List) i94Var2.n().d(p94Var3);
                                                size2 = list2.size();
                                                h03Var = ya.a0;
                                                i7 = h03Var.b;
                                                if (size2 < i7) {
                                                    mj4 mj4Var4 = new mj4(0);
                                                    p03 p03VarA3 = r73.a();
                                                    if (mj4Var.n) {
                                                        su3.f(mj4Var);
                                                    }
                                                    if (su3.h(mj4Var.q, i5, mj4Var.o) >= 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (z5) {
                                                        p03Var = (p03) mj4Var.b(i5);
                                                        iArr = h03Var.a;
                                                        i8 = h03Var.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i48 = iArr[i9];
                                                            int i49 = i8;
                                                            i11 = i10 + 1;
                                                            p03 p03Var5 = p03Var;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i48;
                                                            i9++;
                                                            i10 = i11;
                                                            i8 = i49;
                                                            p03Var = p03Var5;
                                                        }
                                                        p03Var2 = p03Var;
                                                        arrayList = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            xa3.r(list2.get(0));
                                                            p03Var2.getClass();
                                                            throw th;
                                                        }
                                                        if (arrayList.size() > 0) {
                                                            xa3.r(arrayList.get(0));
                                                            if (i10 <= 0) {
                                                                int i410 = iArrCopyOf[0];
                                                                throw th;
                                                            }
                                                            kf2.h("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        xa3.r(list2.get(0));
                                                        h03Var.b(0);
                                                        throw th;
                                                    }
                                                    r9.E.d(i5, mj4Var4);
                                                    mj4Var.d(i5, p03VarA3);
                                                } else {
                                                    kf2.o(b11.j(i7, "Can't have more than ", " custom actions for one widget"));
                                                }
                                            }
                                        }
                                        z4 = xl.z(i94Var2, resources6);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            r3.setScreenReaderFocusable(z4);
                                        } else {
                                            v3Var.h(1, z4);
                                        }
                                        iD = r9.O.d(i5);
                                        if (iD != -1) {
                                            gh0.B(raVar2.getAndroidViewsHandler$ui(), iD);
                                            raVar = raVar2;
                                            r3.setTraversalBefore(raVar, iD);
                                            r9.j(i5, v3Var, r9.Q, th);
                                        } else {
                                            raVar = raVar2;
                                        }
                                        iD2 = r9.P.d(i5);
                                        if (iD2 != -1) {
                                            gh0.B(raVar.getAndroidViewsHandler$ui(), iD2);
                                        }
                                        str2 = (String) bu.o(i94Var2.n(), zz1.l);
                                        if (str2 != null) {
                                            v3Var.i(str2);
                                        }
                                        r8 = v3Var;
                                        r11 = r9;
                                    } else {
                                        yaVar2 = yaVar;
                                    }
                                    z2 = true;
                                    r9 = yaVar2;
                                    r3.setVisibleToUser(wr1.H(i94Var2) ^ z2);
                                    if (i94Var2.o()) {
                                        i94VarL2 = i94Var2.l();
                                        i94VarL2.getClass();
                                    } else {
                                        i94VarL2 = i94Var2;
                                    }
                                    if (i94VarL2.m().d()) {
                                        z3 = false;
                                        r3.setVisibleToUser(false);
                                    } else {
                                        z3 = false;
                                    }
                                    xa3.r(bu.o(e94Var, n94.k));
                                    r3.setClickable(z3);
                                    w2Var = (w2) bu.o(e94Var, d94.b);
                                    if (w2Var != null) {
                                        h12.c(bu.o(e94Var, n94.G), bool2);
                                        r3.setClickable(true);
                                        if (xl.b(i94Var2)) {
                                            v3Var.b(new o3(16, w2Var.a));
                                        }
                                    }
                                    r3.setLongClickable(false);
                                    w2Var2 = (w2) bu.o(e94Var, d94.c);
                                    if (w2Var2 != null) {
                                        r3.setLongClickable(true);
                                        if (xl.b(i94Var2)) {
                                            v3Var.b(new o3(32, w2Var2.a));
                                        }
                                    }
                                    w2Var3 = (w2) bu.o(e94Var, d94.p);
                                    if (w2Var3 != null) {
                                        v3Var.b(new o3(16384, w2Var3.a));
                                    }
                                    if (xl.b(i94Var2)) {
                                        w2Var8 = (w2) bu.o(e94Var, d94.k);
                                        if (w2Var8 != null) {
                                            v3Var.b(new o3(2097152, w2Var8.a));
                                        }
                                        w2Var9 = (w2) bu.o(e94Var, d94.o);
                                        if (w2Var9 != null) {
                                            v3Var.b(new o3(R.id.accessibilityActionImeEnter, w2Var9.a));
                                        }
                                        w2Var10 = (w2) bu.o(e94Var, d94.q);
                                        if (w2Var10 != null) {
                                            v3Var.b(new o3(65536, w2Var10.a));
                                        }
                                        w2Var11 = (w2) bu.o(e94Var, d94.r);
                                        if (w2Var11 != null) {
                                            hd5Var = (hd5) raVar2.getClipboardManager();
                                            clipboardManager = (ClipboardManager) hd5Var.p;
                                            if (clipboardManager == null) {
                                                Object systemService4 = ((Context) hd5Var.o).getSystemService("clipboard");
                                                systemService4.getClass();
                                                clipboardManager = (ClipboardManager) systemService4;
                                                hd5Var.p = clipboardManager;
                                            }
                                            primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                v3Var.b(new o3(32768, w2Var11.a));
                                            }
                                        }
                                    }
                                    strT = ya.t(i94Var2);
                                    if (strT != null) {
                                        Obtain.setTextSelection(r9.r(i94Var2), r9.q(i94Var2));
                                        w2Var7 = (w2) bu.o(e94Var, d94.j);
                                        if (w2Var7 != null) {
                                            r5 = w2Var7.a;
                                        } else {
                                            r5 = th;
                                        }
                                        v3Var.b(new o3(131072, (String) r5));
                                        v3Var.a(256);
                                        v3Var.a(512);
                                        r3.setMovementGranularities(11);
                                        list3 = (List) bu.o(e94Var, n94.a);
                                        if (list3 != null) {
                                            T = c72Var2.t();
                                            while (true) {
                                                if (T == 0) {
                                                    T = th;
                                                } else {
                                                    e94VarV2 = T.v();
                                                    if (e94VarV2 == null) {
                                                    }
                                                    T = T.t();
                                                }
                                            }
                                            if (T == 0) {
                                                r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                            } else {
                                                e94VarV = T.v();
                                                if (e94VarV != null) {
                                                    objG15 = e94VarV.n.g(n94.l);
                                                    if (objG15 == null) {
                                                        objG15 = th;
                                                    }
                                                    zC = h12.c(objG15, Boolean.TRUE);
                                                } else {
                                                    zC = false;
                                                }
                                                if (zC) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            T = c72Var2.t();
                                            while (true) {
                                                if (T == 0) {
                                                    T = th;
                                                } else {
                                                    e94VarV2 = T.v();
                                                    if (e94VarV2 == null) {
                                                    }
                                                    T = T.t();
                                                }
                                            }
                                            if (T == 0) {
                                                r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                            } else {
                                                e94VarV = T.v();
                                                if (e94VarV != null) {
                                                    objG15 = e94VarV.n.g(n94.l);
                                                    if (objG15 == null) {
                                                        objG15 = th;
                                                    }
                                                    zC = h12.c(objG15, Boolean.TRUE);
                                                } else {
                                                    zC = false;
                                                }
                                                if (zC) {
                                                    r3.setMovementGranularities(Obtain.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = v3Var.g();
                                        if (charSequenceG != null) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (w03Var3.c(n94.x)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (w03Var3.c(n94.O)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            Obtain.setAvailableExtraData(arrayList3);
                                        }
                                    }
                                    xq3Var = (xq3) bu.o(e94Var, n94.c);
                                    if (xq3Var != null) {
                                        p94Var4 = d94.i;
                                        if (w03Var3.c(p94Var4)) {
                                            v3Var.i("android.widget.SeekBar");
                                        } else {
                                            v3Var.i("android.widget.ProgressBar");
                                        }
                                        if (xq3Var != xq3.b) {
                                            f = 0.0f;
                                            r3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                        } else {
                                            f = 0.0f;
                                        }
                                        if (w03Var3.c(p94Var4)) {
                                            v3Var.b(o3.k);
                                        }
                                    }
                                    gb.c(v3Var, i94Var2);
                                    te5.L(v3Var, i94Var2);
                                    objG7 = i94Var2.k().n.g(n94.g);
                                    if (objG7 == null) {
                                        objG7 = th;
                                    }
                                    if (objG7 == null) {
                                        i94VarL3 = i94Var2.l();
                                        if (i94VarL3 != null) {
                                            objG12 = i94VarL3.k().n.g(n94.e);
                                            if (objG12 == null) {
                                                objG12 = th;
                                            }
                                            if (objG12 != null) {
                                                objG13 = i94VarL3.k().n.g(n94.f);
                                                if (objG13 == null) {
                                                    objG13 = th;
                                                }
                                                o40Var = (o40) objG13;
                                                if (o40Var != null) {
                                                    if (i94Var2.k().n.c(n94.G)) {
                                                        arrayList2 = new ArrayList();
                                                        listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        while (i12 < size3) {
                                                            i94Var3 = (i94) listI2.get(i12);
                                                            if (i94Var3.k().n.c(n94.G)) {
                                                                arrayList2.add(i94Var3);
                                                                if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            zE = te5.e(arrayList2);
                                                            if (zE) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                            if (zE) {
                                                                i15 = i13;
                                                            } else {
                                                                i15 = 0;
                                                            }
                                                            objG14 = i94Var2.k().n.g(n94.G);
                                                            if (objG14 == null) {
                                                                objG14 = Boolean.FALSE;
                                                            }
                                                            v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                        }
                                                    }
                                                } else if (i94Var2.k().n.c(n94.G)) {
                                                    arrayList2 = new ArrayList();
                                                    listI2 = i94VarL3.i((4 & 1) != 0 ? !i94VarL3.b : false, (4 & 2) == 0);
                                                    size3 = listI2.size();
                                                    i13 = 0;
                                                    while (i12 < size3) {
                                                        i94Var3 = (i94) listI2.get(i12);
                                                        if (i94Var3.k().n.c(n94.G)) {
                                                            arrayList2.add(i94Var3);
                                                            if (i94Var3.c.u() < i94Var2.c.u()) {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                    if (!arrayList2.isEmpty()) {
                                                        zE = te5.e(arrayList2);
                                                        if (zE) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = i13;
                                                        }
                                                        if (zE) {
                                                            i15 = i13;
                                                        } else {
                                                            i15 = 0;
                                                        }
                                                        objG14 = i94Var2.k().n.g(n94.G);
                                                        if (objG14 == null) {
                                                            objG14 = Boolean.FALSE;
                                                        }
                                                        v3Var.k(u3.a(i14, 1, i15, 1, false, ((Boolean) objG14).booleanValue()));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        kf2.k();
                                    }
                                    h64Var = (h64) bu.o(i94Var2.n(), n94.u);
                                    w2 w2Var15 = (w2) bu.o(i94Var2.n(), d94.d);
                                    if (h64Var != null) {
                                        objG10 = i94Var2.k().n.g(n94.f);
                                        if (objG10 == null) {
                                            objG10 = th;
                                        }
                                        if (objG10 == null) {
                                            objG11 = i94Var2.k().n.g(n94.e);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            if (objG11 == null) {
                                                v3Var.i("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) h64Var.b.invoke()).floatValue() > 0.0f) {
                                            v3Var.m(true);
                                        }
                                        if (xl.b(i94Var2)) {
                                            z6 = ya.z(h64Var);
                                            r62Var = r62.o;
                                            if (z6) {
                                                v3Var.b(o3.j);
                                                c72Var = c72Var2;
                                                if (c72Var.K == r62Var) {
                                                    o3Var2 = o3.q;
                                                } else {
                                                    o3Var2 = o3.s;
                                                }
                                                v3Var.b(o3Var2);
                                            } else {
                                                c72Var = c72Var2;
                                            }
                                            if (ya.y(h64Var)) {
                                                v3Var.b(o3.k);
                                                if (c72Var.K == r62Var) {
                                                    o3Var = o3.s;
                                                } else {
                                                    o3Var = o3.q;
                                                }
                                                v3Var.b(o3Var);
                                            }
                                        }
                                    }
                                    h64Var2 = (h64) bu.o(i94Var2.n(), n94.v);
                                    if (h64Var2 != null) {
                                        objG8 = i94Var2.k().n.g(n94.f);
                                        if (objG8 == null) {
                                            objG8 = th;
                                        }
                                        if (objG8 == null) {
                                            objG9 = i94Var2.k().n.g(n94.e);
                                            if (objG9 == null) {
                                                objG9 = th;
                                            }
                                            if (objG9 == null) {
                                                v3Var.i("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) h64Var2.b.invoke()).floatValue() > 0.0f) {
                                            v3Var.m(true);
                                        }
                                        if (xl.b(i94Var2)) {
                                            if (ya.z(h64Var2)) {
                                                v3Var.b(o3.j);
                                                v3Var.b(o3.r);
                                            }
                                            if (ya.y(h64Var2)) {
                                                v3Var.b(o3.k);
                                                v3Var.b(o3.p);
                                            }
                                        }
                                    }
                                    i6 = Build.VERSION.SDK_INT;
                                    if (i6 >= 29) {
                                        e35.k(v3Var, i94Var2);
                                    }
                                    charSequence = (CharSequence) bu.o(i94Var2.n(), n94.d);
                                    if (i6 >= 28) {
                                        r3.setPaneTitle(charSequence);
                                    } else {
                                        r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (xl.b(i94Var2)) {
                                        w2Var4 = (w2) bu.o(i94Var2.n(), d94.s);
                                        if (w2Var4 != null) {
                                            v3Var.b(new o3(262144, w2Var4.a));
                                        }
                                        w2Var5 = (w2) bu.o(i94Var2.n(), d94.t);
                                        if (w2Var5 != null) {
                                            v3Var.b(new o3(524288, w2Var5.a));
                                        }
                                        w2Var6 = (w2) bu.o(i94Var2.n(), d94.u);
                                        if (w2Var6 != null) {
                                            v3Var.b(new o3(1048576, w2Var6.a));
                                        }
                                        e94VarN = i94Var2.n();
                                        p94Var3 = d94.w;
                                        if (e94VarN.n.c(p94Var3)) {
                                            list2 = (List) i94Var2.n().d(p94Var3);
                                            size2 = list2.size();
                                            h03Var = ya.a0;
                                            i7 = h03Var.b;
                                            if (size2 < i7) {
                                                mj4 mj4Var5 = new mj4(0);
                                                p03 p03VarA4 = r73.a();
                                                if (mj4Var.n) {
                                                    su3.f(mj4Var);
                                                }
                                                if (su3.h(mj4Var.q, i5, mj4Var.o) >= 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    p03Var = (p03) mj4Var.b(i5);
                                                    iArr = h03Var.a;
                                                    i8 = h03Var.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i411 = iArr[i9];
                                                        int i412 = i8;
                                                        i11 = i10 + 1;
                                                        p03 p03Var6 = p03Var;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i10] = i411;
                                                        i9++;
                                                        i10 = i11;
                                                        i8 = i412;
                                                        p03Var = p03Var6;
                                                    }
                                                    p03Var2 = p03Var;
                                                    arrayList = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        xa3.r(list2.get(0));
                                                        p03Var2.getClass();
                                                        throw th;
                                                    }
                                                    if (arrayList.size() > 0) {
                                                        xa3.r(arrayList.get(0));
                                                        if (i10 <= 0) {
                                                            int i413 = iArrCopyOf[0];
                                                            throw th;
                                                        }
                                                        kf2.h("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    xa3.r(list2.get(0));
                                                    h03Var.b(0);
                                                    throw th;
                                                }
                                                r9.E.d(i5, mj4Var5);
                                                mj4Var.d(i5, p03VarA4);
                                            } else {
                                                kf2.o(b11.j(i7, "Can't have more than ", " custom actions for one widget"));
                                            }
                                        }
                                    }
                                    z4 = xl.z(i94Var2, resources6);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        r3.setScreenReaderFocusable(z4);
                                    } else {
                                        v3Var.h(1, z4);
                                    }
                                    iD = r9.O.d(i5);
                                    if (iD != -1) {
                                        gh0.B(raVar2.getAndroidViewsHandler$ui(), iD);
                                        raVar = raVar2;
                                        r3.setTraversalBefore(raVar, iD);
                                        r9.j(i5, v3Var, r9.Q, th);
                                    } else {
                                        raVar = raVar2;
                                    }
                                    iD2 = r9.P.d(i5);
                                    if (iD2 != -1) {
                                        gh0.B(raVar.getAndroidViewsHandler$ui(), iD2);
                                    }
                                    str2 = (String) bu.o(i94Var2.n(), zz1.l);
                                    if (str2 != null) {
                                        v3Var.i(str2);
                                    }
                                    r8 = v3Var;
                                    r11 = r9;
                                }
                                return th;
                            }
                        }
                        r11 = yaVar3;
                        i5 = i;
                        r8 = 0;
                    }
                }
                if (!r11.B) {
                    return r8;
                }
                if (i5 == r11.x) {
                    r11.z = r8;
                }
                if (i5 != r11.y) {
                    return r8;
                }
                r11.A = r8;
                return r8;
            default:
                return new v3(AccessibilityNodeInfo.obtain(((z41) z2Var).r(i).a));
        }
    }
}
