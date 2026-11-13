package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey implements u91 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public Object h;

    public ey(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(zz1.F(R.attr.materialCalendarStyle, context, nh2.class.getCanonicalName()).data, ht3.x);
        this.a = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListS = h12.s(context, typedArrayObtainStyledAttributes, 7);
        this.d = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = c6.f(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListS.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean a(boolean z) {
        w12 w12Var;
        if (f() != null) {
            ba1 ba1VarF = f();
            h(null);
            if (ba1VarF != null) {
                z91 z91Var = z91.n;
                z91 z91Var2 = z91.p;
                ba1VarF.r0(z91Var, z91Var2);
                if (!ba1VarF.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2 cx2Var = ba1VarF.n.r;
                c72 c72VarO = j51.O(ba1VarF);
                while (c72VarO != null) {
                    if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                        while (cx2Var != null) {
                            if ((cx2Var.p & 1024) != 0) {
                                cx2 cx2VarC = cx2Var;
                                f13 f13Var = null;
                                while (cx2VarC != null) {
                                    if (cx2VarC instanceof ba1) {
                                        ((ba1) cx2VarC).r0(z91.o, z91Var2);
                                    } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                        int i = 0;
                                        for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                            if ((cx2Var2.p & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    cx2VarC = cx2Var2;
                                                } else {
                                                    if (f13Var == null) {
                                                        f13Var = new f13(new cx2[16]);
                                                    }
                                                    if (cx2VarC != null) {
                                                        f13Var.b(cx2VarC);
                                                        cx2VarC = null;
                                                    }
                                                    f13Var.b(cx2Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    cx2VarC = j51.c(f13Var);
                                }
                            }
                            cx2Var = cx2Var.r;
                        }
                    }
                    c72VarO = c72VarO.t();
                    cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
                }
            }
        }
        return true;
    }

    public boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = uc5.M((ba1) this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                er1.n();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public void c() {
        ra raVar = (ra) this.a;
        if (raVar.isFocused() || raVar.hasFocus()) {
            raVar.clearFocus();
        } else if (raVar.hasFocus()) {
            View viewFindFocus = raVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            raVar.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x015b A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x016b A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:308:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005f A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x0164 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x014d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007c A[ADDED_TO_REGION, LOOP:12: B:39:0x007c->B:67:0x00c8, LOOP_START, PHI: r6
  0x007c: PHI (r6v29 cx2) = (r6v23 cx2), (r6v30 cx2) binds: [B:38:0x007a, B:67:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008d A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[ADDED_TO_REGION, LOOP:16: B:85:0x0106->B:113:0x0152, LOOP_START, PHI: r12
  0x0106: PHI (r12v14 cx2) = (r12v8 cx2), (r12v15 cx2) binds: [B:84:0x0104, B:113:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0117 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x011d A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0033, B:17:0x0039, B:18:0x003e, B:20:0x0046, B:22:0x004b, B:24:0x0051, B:28:0x0057, B:126:0x0173, B:128:0x0179, B:129:0x017c, B:131:0x0187, B:134:0x0195, B:138:0x019f, B:141:0x01a5, B:142:0x01aa, B:145:0x01b2, B:147:0x01b8, B:149:0x01bc, B:151:0x01c4, B:153:0x01ca, B:157:0x01d2, B:159:0x01db, B:160:0x01df, B:161:0x01e2, B:164:0x01e8, B:165:0x01ed, B:166:0x01f0, B:168:0x01f6, B:170:0x01fa, B:173:0x0203, B:175:0x020b, B:179:0x021b, B:181:0x0220, B:183:0x0224, B:203:0x025d, B:184:0x0227, B:186:0x022d, B:188:0x0231, B:190:0x0239, B:192:0x023f, B:196:0x0247, B:198:0x0250, B:199:0x0254, B:200:0x0257, B:204:0x0262, B:208:0x0272, B:210:0x0277, B:212:0x027b, B:235:0x02bd, B:216:0x0287, B:218:0x028d, B:220:0x0291, B:222:0x0299, B:224:0x029f, B:228:0x02a7, B:230:0x02b0, B:231:0x02b4, B:232:0x02b7, B:237:0x02c4, B:239:0x02cb, B:32:0x005f, B:34:0x0065, B:35:0x0068, B:37:0x0070, B:40:0x007e, B:44:0x0088, B:75:0x00dd, B:77:0x00e1, B:47:0x008d, B:49:0x0093, B:51:0x0097, B:53:0x009f, B:55:0x00a5, B:59:0x00ad, B:61:0x00b6, B:62:0x00ba, B:63:0x00bd, B:66:0x00c3, B:67:0x00c8, B:68:0x00cb, B:70:0x00d1, B:72:0x00d5, B:78:0x00e7, B:80:0x00ed, B:81:0x00f0, B:83:0x00fa, B:86:0x0108, B:90:0x0112, B:121:0x0167, B:123:0x016b, B:93:0x0117, B:95:0x011d, B:97:0x0121, B:99:0x0129, B:101:0x012f, B:105:0x0137, B:107:0x0140, B:108:0x0144, B:109:0x0147, B:112:0x014d, B:113:0x0152, B:114:0x0155, B:116:0x015b, B:118:0x015f), top: B:249:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v24, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v25, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v29, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v30, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v34, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [f13] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    public boolean d(KeyEvent keyEvent, gf1 gf1Var) {
        cx2 cx2Var;
        c72 c72VarO;
        eo0 eo0Var;
        eo0 eo0Var2;
        cx2 cx2Var2;
        w12 w12Var;
        cx2 cx2VarC;
        f13 f13Var;
        cx2 cx2Var3;
        c72 c72VarO2;
        eo0 eo0Var3;
        eo0 eo0Var4;
        w12 w12Var2;
        f13 f13Var2;
        cx2 cx2VarC2;
        int size;
        w12 w12Var3;
        boolean z;
        ba1 ba1Var = (ba1) this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (((s91) this.d).e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!i(keyEvent)) {
                Trace.endSection();
                return false;
            }
            ba1 ba1VarP = te5.p(ba1Var);
            if (ba1VarP != null) {
                if (!ba1VarP.n.A) {
                    cz1.b("visitLocalDescendants called on an unattached node");
                }
                cx2 cx2Var4 = ba1VarP.n;
                if ((cx2Var4.q & 9216) != 0) {
                    cx2Var2 = null;
                    for (cx2 cx2Var5 = cx2Var4.s; cx2Var5 != null; cx2Var5 = cx2Var5.s) {
                        int i = cx2Var5.p;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            cx2Var2 = cx2Var5;
                        }
                    }
                } else {
                    cx2Var2 = null;
                }
                if (cx2Var2 == null) {
                    if (ba1VarP == null) {
                        if (!ba1Var.n.A) {
                            cz1.b("visitAncestors called on an unattached node");
                        }
                        cx2Var = ba1Var.n.r;
                        c72VarO = j51.O(ba1Var);
                        loop15: while (true) {
                            if (c72VarO != null) {
                                eo0Var = null;
                                break;
                            }
                            if ((((cx2) c72VarO.Q.g).q & 8192) != 0) {
                                while (cx2Var != null) {
                                    if ((cx2Var.p & 8192) != 0) {
                                        cx2VarC = cx2Var;
                                        f13Var = null;
                                        while (cx2VarC != null) {
                                            if (cx2VarC instanceof j42) {
                                                eo0Var = cx2VarC;
                                                break loop15;
                                            }
                                            if ((cx2VarC.p & 8192) == 0) {
                                            }
                                            cx2VarC = j51.c(f13Var);
                                        }
                                    }
                                    cx2Var = cx2Var.r;
                                }
                            }
                            c72VarO = c72VarO.t();
                            if (c72VarO != null) {
                            }
                        }
                        eo0Var2 = (j42) eo0Var;
                        if (eo0Var2 != null) {
                            cx2Var2 = ((cx2) eo0Var2).n;
                        } else {
                            cx2Var2 = null;
                        }
                    } else {
                        if (!ba1VarP.n.A) {
                            cz1.b("visitAncestors called on an unattached node");
                        }
                        cx2Var3 = ba1VarP.n;
                        c72VarO2 = j51.O(ba1VarP);
                        loop11: while (true) {
                            if (c72VarO2 != null) {
                                eo0Var3 = null;
                                break;
                            }
                            if ((((cx2) c72VarO2.Q.g).q & 8192) != 0) {
                                while (cx2Var3 != null) {
                                    if ((cx2Var3.p & 8192) != 0) {
                                        f13Var2 = null;
                                        cx2VarC2 = cx2Var3;
                                        while (cx2VarC2 != null) {
                                            if (cx2VarC2 instanceof j42) {
                                                eo0Var3 = cx2VarC2;
                                                break loop11;
                                            }
                                            if ((cx2VarC2.p & 8192) == 0) {
                                            }
                                            cx2VarC2 = j51.c(f13Var2);
                                        }
                                    }
                                    cx2Var3 = cx2Var3.r;
                                }
                            }
                            c72VarO2 = c72VarO2.t();
                            if (c72VarO2 != null) {
                            }
                        }
                        eo0Var4 = (j42) eo0Var3;
                        if (eo0Var4 != null) {
                            cx2Var2 = ((cx2) eo0Var4).n;
                        } else {
                            if (!ba1Var.n.A) {
                                cz1.b("visitAncestors called on an unattached node");
                            }
                            cx2Var = ba1Var.n.r;
                            c72VarO = j51.O(ba1Var);
                            loop15: while (true) {
                                if (c72VarO != null) {
                                    eo0Var = null;
                                    break;
                                }
                                if ((((cx2) c72VarO.Q.g).q & 8192) != 0) {
                                    while (cx2Var != null) {
                                        if ((cx2Var.p & 8192) != 0) {
                                            cx2VarC = cx2Var;
                                            f13Var = null;
                                            while (cx2VarC != null) {
                                                if (cx2VarC instanceof j42) {
                                                    eo0Var = cx2VarC;
                                                    break loop15;
                                                }
                                                if ((cx2VarC.p & 8192) == 0) {
                                                }
                                                cx2VarC = j51.c(f13Var);
                                            }
                                        }
                                        cx2Var = cx2Var.r;
                                    }
                                }
                                c72VarO = c72VarO.t();
                                if (c72VarO != null) {
                                }
                            }
                            eo0Var2 = (j42) eo0Var;
                            if (eo0Var2 != null) {
                                cx2Var2 = ((cx2) eo0Var2).n;
                            } else {
                                cx2Var2 = null;
                            }
                        }
                    }
                }
            } else if (ba1VarP == null) {
                if (!ba1Var.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2Var = ba1Var.n.r;
                c72VarO = j51.O(ba1Var);
                loop15: while (true) {
                    if (c72VarO != null) {
                        eo0Var = null;
                        break;
                    }
                    if ((((cx2) c72VarO.Q.g).q & 8192) != 0) {
                        while (cx2Var != null) {
                            if ((cx2Var.p & 8192) != 0) {
                                cx2VarC = cx2Var;
                                f13Var = null;
                                while (cx2VarC != null) {
                                    if (cx2VarC instanceof j42) {
                                        eo0Var = cx2VarC;
                                        break loop15;
                                    }
                                    if ((cx2VarC.p & 8192) == 0 && (cx2VarC instanceof fo0)) {
                                        cx2 cx2Var6 = ((fo0) cx2VarC).C;
                                        int i2 = 0;
                                        while (cx2Var6 != null) {
                                            if ((cx2Var6.p & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cx2VarC = cx2VarC;
                                                    f13Var = f13Var;
                                                    f13Var = f13Var;
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
                                            } else {
                                                cx2VarC = cx2VarC;
                                                f13Var = f13Var;
                                            }
                                            cx2Var6 = cx2Var6.s;
                                            cx2VarC = cx2VarC;
                                            f13Var = f13Var;
                                        }
                                        if (i2 == 1) {
                                            cx2VarC = cx2VarC;
                                            f13Var = f13Var;
                                        } else {
                                            cx2VarC = cx2VarC;
                                            f13Var = f13Var;
                                        }
                                    }
                                    cx2VarC = j51.c(f13Var);
                                }
                            }
                            cx2Var = cx2Var.r;
                        }
                    }
                    c72VarO = c72VarO.t();
                    cx2Var = (c72VarO != null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
                }
                eo0Var2 = (j42) eo0Var;
                if (eo0Var2 != null) {
                    cx2Var2 = ((cx2) eo0Var2).n;
                } else {
                    cx2Var2 = null;
                }
            } else {
                if (!ba1VarP.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2Var3 = ba1VarP.n;
                c72VarO2 = j51.O(ba1VarP);
                loop11: while (true) {
                    if (c72VarO2 != null) {
                        eo0Var3 = null;
                        break;
                    }
                    if ((((cx2) c72VarO2.Q.g).q & 8192) != 0) {
                        while (cx2Var3 != null) {
                            if ((cx2Var3.p & 8192) != 0) {
                                f13Var2 = null;
                                cx2VarC2 = cx2Var3;
                                while (cx2VarC2 != null) {
                                    if (cx2VarC2 instanceof j42) {
                                        eo0Var3 = cx2VarC2;
                                        break loop11;
                                    }
                                    if ((cx2VarC2.p & 8192) == 0 && (cx2VarC2 instanceof fo0)) {
                                        cx2 cx2Var7 = ((fo0) cx2VarC2).C;
                                        int i3 = 0;
                                        while (cx2Var7 != null) {
                                            if ((cx2Var7.p & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cx2VarC2 = cx2VarC2;
                                                    f13Var2 = f13Var2;
                                                    f13Var2 = f13Var2;
                                                    cx2VarC2 = cx2Var7;
                                                } else {
                                                    if (f13Var2 == null) {
                                                        f13Var2 = new f13(new cx2[16]);
                                                    }
                                                    if (cx2VarC2 != null) {
                                                        f13Var2.b(cx2VarC2);
                                                        cx2VarC2 = null;
                                                    }
                                                    f13Var2.b(cx2Var7);
                                                }
                                            } else {
                                                cx2VarC2 = cx2VarC2;
                                                f13Var2 = f13Var2;
                                            }
                                            cx2Var7 = cx2Var7.s;
                                            cx2VarC2 = cx2VarC2;
                                            f13Var2 = f13Var2;
                                        }
                                        if (i3 == 1) {
                                            cx2VarC2 = cx2VarC2;
                                            f13Var2 = f13Var2;
                                        } else {
                                            cx2VarC2 = cx2VarC2;
                                            f13Var2 = f13Var2;
                                        }
                                    }
                                    cx2VarC2 = j51.c(f13Var2);
                                }
                            }
                            cx2Var3 = cx2Var3.r;
                        }
                    }
                    c72VarO2 = c72VarO2.t();
                    cx2Var3 = (c72VarO2 != null || (w12Var2 = c72VarO2.Q) == null) ? null : (sq4) w12Var2.f;
                }
                eo0Var4 = (j42) eo0Var3;
                if (eo0Var4 != null) {
                    cx2Var2 = ((cx2) eo0Var4).n;
                } else {
                    if (!ba1Var.n.A) {
                        cz1.b("visitAncestors called on an unattached node");
                    }
                    cx2Var = ba1Var.n.r;
                    c72VarO = j51.O(ba1Var);
                    loop15: while (true) {
                        if (c72VarO != null) {
                            eo0Var = null;
                            break;
                        }
                        if ((((cx2) c72VarO.Q.g).q & 8192) != 0) {
                            while (cx2Var != null) {
                                if ((cx2Var.p & 8192) != 0) {
                                    cx2VarC = cx2Var;
                                    f13Var = null;
                                    while (cx2VarC != null) {
                                        if (cx2VarC instanceof j42) {
                                            eo0Var = cx2VarC;
                                            break loop15;
                                        }
                                        if ((cx2VarC.p & 8192) == 0) {
                                        }
                                        cx2VarC = j51.c(f13Var);
                                    }
                                }
                                cx2Var = cx2Var.r;
                            }
                        }
                        c72VarO = c72VarO.t();
                        if (c72VarO != null) {
                        }
                    }
                    eo0Var2 = (j42) eo0Var;
                    if (eo0Var2 != null) {
                        cx2Var2 = ((cx2) eo0Var2).n;
                    } else {
                        cx2Var2 = null;
                    }
                }
            }
            if (cx2Var2 != null) {
                if (!cx2Var2.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2 cx2Var8 = cx2Var2.n.r;
                c72 c72VarO3 = j51.O(cx2Var2);
                ArrayList arrayList = null;
                while (c72VarO3 != null) {
                    if ((((cx2) c72VarO3.Q.g).q & 8192) != 0) {
                        while (cx2Var8 != null) {
                            if ((cx2Var8.p & 8192) != 0) {
                                cx2 cx2VarC3 = cx2Var8;
                                f13 f13Var3 = null;
                                while (cx2VarC3 != null) {
                                    if (cx2VarC3 instanceof j42) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cx2VarC3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cx2VarC3.p & 8192) != 0 && (cx2VarC3 instanceof fo0)) {
                                        int i4 = 0;
                                        for (cx2 cx2Var9 = ((fo0) cx2VarC3).C; cx2Var9 != null; cx2Var9 = cx2Var9.s) {
                                            if ((cx2Var9.p & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    cx2VarC3 = cx2Var9;
                                                } else {
                                                    if (f13Var3 == null) {
                                                        f13Var3 = new f13(new cx2[16]);
                                                    }
                                                    if (cx2VarC3 != null) {
                                                        f13Var3.b(cx2VarC3);
                                                        cx2VarC3 = null;
                                                    }
                                                    f13Var3.b(cx2Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    cx2VarC3 = j51.c(f13Var3);
                                }
                            }
                            cx2Var8 = cx2Var8.r;
                        }
                    }
                    c72VarO3 = c72VarO3.t();
                    cx2Var8 = (c72VarO3 == null || (w12Var3 = c72VarO3.Q) == null) ? null : (sq4) w12Var3.f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        ((j42) arrayList.get(size)).getClass();
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? C = cx2Var2.n;
                ?? f13Var4 = 0;
                while (C != 0) {
                    if (C instanceof j42) {
                    } else if ((C.p & 8192) != 0 && (C instanceof fo0)) {
                        cx2 cx2Var10 = ((fo0) C).C;
                        int i6 = 0;
                        while (cx2Var10 != null) {
                            if ((cx2Var10.p & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    f13Var4 = f13Var4;
                                    C = C;
                                    f13Var4 = f13Var4;
                                    C = cx2Var10;
                                } else {
                                    if (f13Var4 == 0) {
                                        f13Var4 = new f13(new cx2[16]);
                                    }
                                    if (C != 0) {
                                        f13Var4.b(C);
                                        C = 0;
                                    }
                                    f13Var4.b(cx2Var10);
                                }
                            } else {
                                f13Var4 = f13Var4;
                                C = C;
                            }
                            cx2Var10 = cx2Var10.s;
                            f13Var4 = f13Var4;
                            C = C;
                        }
                        if (i6 == 1) {
                            f13Var4 = f13Var4;
                            C = C;
                        } else {
                            f13Var4 = f13Var4;
                            C = C;
                        }
                    }
                    C = j51.c(f13Var4);
                }
                if (((Boolean) gf1Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? C2 = cx2Var2.n;
                ?? f13Var5 = 0;
                while (C2 != 0) {
                    if (C2 instanceof j42) {
                        if (((j42) C2).q(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((C2.p & 8192) != 0 && (C2 instanceof fo0)) {
                        cx2 cx2Var11 = ((fo0) C2).C;
                        int i7 = 0;
                        while (cx2Var11 != null) {
                            if ((cx2Var11.p & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    C2 = C2;
                                    f13Var5 = f13Var5;
                                    f13Var5 = f13Var5;
                                    C2 = cx2Var11;
                                } else {
                                    if (f13Var5 == 0) {
                                        f13Var5 = new f13(new cx2[16]);
                                    }
                                    if (C2 != 0) {
                                        f13Var5.b(C2);
                                        C2 = 0;
                                    }
                                    f13Var5.b(cx2Var11);
                                }
                            } else {
                                C2 = C2;
                                f13Var5 = f13Var5;
                            }
                            cx2Var11 = cx2Var11.s;
                            C2 = C2;
                            f13Var5 = f13Var5;
                        }
                        if (i7 == 1) {
                            C2 = C2;
                            f13Var5 = f13Var5;
                        } else {
                            C2 = C2;
                            f13Var5 = f13Var5;
                        }
                    }
                    C2 = j51.c(f13Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((j42) arrayList.get(i8)).q(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public Boolean e(int i, wv3 wv3Var, if1 if1Var) {
        boolean zF;
        ba1 ba1Var;
        w12 w12Var;
        ra raVar = (ra) this.b;
        ba1 ba1Var2 = (ba1) this.c;
        ba1 ba1VarP = te5.p(ba1Var2);
        int i2 = 4;
        int i3 = 2;
        boolean zBooleanValue = false;
        if (ba1VarP != null) {
            r62 layoutDirection = raVar.getLayoutDirection();
            x91 x91VarS0 = ba1VarP.s0();
            y91 y91Var = x91VarS0.h;
            y91 y91Var2 = x91VarS0.i;
            if (i == 1) {
                y91Var = x91VarS0.b;
            } else if (i == 2) {
                y91Var = x91VarS0.c;
            } else if (i == 5) {
                y91Var = x91VarS0.d;
            } else if (i == 6) {
                y91Var = x91VarS0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        er1.n();
                        return null;
                    }
                    y91Var = y91Var2;
                }
                if (y91Var == y91.b) {
                    y91Var = null;
                }
                if (y91Var == null) {
                    y91Var = x91VarS0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    y91Var = y91Var2;
                } else if (iOrdinal2 != 1) {
                    er1.n();
                    return null;
                }
                if (y91Var == y91.b) {
                    y91Var = null;
                }
                if (y91Var == null) {
                    y91Var = x91VarS0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    kf2.o("invalid FocusDirection");
                    return null;
                }
                ey eyVar = (ey) ((ra) j51.P(ba1VarP)).getFocusOwner();
                ba1 ba1VarF = eyVar.f();
                if (i == 7) {
                    x91VarS0.j.getClass();
                } else {
                    x91VarS0.k.getClass();
                }
                y91Var = ba1VarF != eyVar.f() ? y91.d : y91.b;
            }
            y91 y91Var3 = y91.c;
            if (!h12.c(y91Var, y91Var3)) {
                if (h12.c(y91Var, y91.d)) {
                    ba1 ba1VarP2 = te5.p(ba1Var2);
                    if (ba1VarP2 != null) {
                        return (Boolean) if1Var.invoke(ba1VarP2);
                    }
                } else {
                    y91 y91Var4 = y91.b;
                    if (!h12.c(y91Var, y91Var4)) {
                        if (y91Var == y91Var4) {
                            kf2.o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (y91Var == y91Var3) {
                            kf2.o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        f13 f13Var = y91Var.a;
                        int i4 = f13Var.p;
                        if (i4 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = f13Var.n;
                            boolean z = false;
                            for (int i5 = 0; i5 < i4; i5++) {
                                xo xoVar = (xo) objArr[i5];
                                if (!xoVar.n.A) {
                                    cz1.b("visitChildren called on an unattached node");
                                }
                                f13 f13Var2 = new f13(new cx2[16]);
                                cx2 cx2Var = xoVar.n;
                                cx2 cx2Var2 = cx2Var.s;
                                if (cx2Var2 == null) {
                                    j51.b(f13Var2, cx2Var);
                                } else {
                                    f13Var2.b(cx2Var2);
                                }
                                while (true) {
                                    int i6 = f13Var2.p;
                                    if (i6 == 0) {
                                        break;
                                    }
                                    cx2 cx2VarC = (cx2) f13Var2.k(i6 - 1);
                                    if ((cx2VarC.q & 1024) == 0) {
                                        j51.b(f13Var2, cx2VarC);
                                    } else {
                                        while (cx2VarC != null) {
                                            if ((cx2VarC.p & 1024) != 0) {
                                                f13 f13Var3 = null;
                                                while (cx2VarC != null) {
                                                    if (cx2VarC instanceof ba1) {
                                                        if (((Boolean) if1Var.invoke((ba1) cx2VarC)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                                        int i7 = 0;
                                                        for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                                            if ((cx2Var3.p & 1024) != 0) {
                                                                i7++;
                                                                if (i7 == 1) {
                                                                    cx2VarC = cx2Var3;
                                                                } else {
                                                                    if (f13Var3 == null) {
                                                                        f13Var3 = new f13(new cx2[16]);
                                                                    }
                                                                    if (cx2VarC != null) {
                                                                        f13Var3.b(cx2VarC);
                                                                        cx2VarC = null;
                                                                    }
                                                                    f13Var3.b(cx2Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i7 == 1) {
                                                        }
                                                    }
                                                    cx2VarC = j51.c(f13Var3);
                                                }
                                                break;
                                            }
                                            cx2VarC = cx2VarC.s;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        ba1VarP = null;
        r62 layoutDirection2 = raVar.getLayoutDirection();
        dd0 dd0Var = new dd0(ba1VarP, this, if1Var, i3);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zF = zz1.o(ba1Var2, dd0Var);
            } else {
                if (i != 2) {
                    kf2.o("This function should only be used for 1-D focus search");
                    return null;
                }
                zF = zz1.f(ba1Var2, dd0Var);
            }
            return Boolean.valueOf(zF);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return kb4.b0(i, dd0Var, ba1Var2, wv3Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    er1.n();
                    return null;
                }
                i2 = 3;
            }
            ba1 ba1VarP3 = te5.p(ba1Var2);
            if (ba1VarP3 != null) {
                return kb4.b0(i2, dd0Var, ba1VarP3, wv3Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(o91.a(i)).toString());
        }
        ba1 ba1VarP4 = te5.p(ba1Var2);
        if (ba1VarP4 == null) {
            ba1Var = null;
            break;
        }
        if (!ba1VarP4.n.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var4 = ba1VarP4.n.r;
        c72 c72VarO = j51.O(ba1VarP4);
        loop5: while (true) {
            if (c72VarO == null) {
                ba1Var = null;
                break;
            }
            if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                while (cx2Var4 != null) {
                    if ((cx2Var4.p & 1024) != 0) {
                        cx2 cx2VarC2 = cx2Var4;
                        f13 f13Var4 = null;
                        while (cx2VarC2 != null) {
                            if (cx2VarC2 instanceof ba1) {
                                ba1 ba1Var3 = (ba1) cx2VarC2;
                                if (ba1Var3.s0().a) {
                                    ba1Var = ba1Var3;
                                    break loop5;
                                }
                            } else if ((cx2VarC2.p & 1024) != 0 && (cx2VarC2 instanceof fo0)) {
                                int i8 = 0;
                                for (cx2 cx2Var5 = ((fo0) cx2VarC2).C; cx2Var5 != null; cx2Var5 = cx2Var5.s) {
                                    if ((cx2Var5.p & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            cx2VarC2 = cx2Var5;
                                        } else {
                                            if (f13Var4 == null) {
                                                f13Var4 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC2 != null) {
                                                f13Var4.b(cx2VarC2);
                                                cx2VarC2 = null;
                                            }
                                            f13Var4.b(cx2Var5);
                                        }
                                    }
                                }
                                if (i8 != 1) {
                                    cx2VarC2 = j51.c(f13Var4);
                                }
                            }
                            cx2VarC2 = j51.c(f13Var4);
                        }
                    }
                    cx2Var4 = cx2Var4.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var4 = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
        if (ba1Var != null && ba1Var != ba1Var2) {
            zBooleanValue = ((Boolean) dd0Var.invoke(ba1Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public ba1 f() {
        ba1 ba1Var = (ba1) this.h;
        if (ba1Var == null || !ba1Var.A) {
            return null;
        }
        return ba1Var;
    }

    public boolean g(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new ha(i, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public void h(ba1 ba1Var) {
        ba1 ba1Var2 = (ba1) this.h;
        this.h = ba1Var;
        q03 q03Var = (q03) this.g;
        Object[] objArr = q03Var.a;
        int i = q03Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((t91) objArr[i2]).a(ba1Var2, ba1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean i(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int i;
        long j;
        int iNumberOfTrailingZeros2;
        int i2;
        long[] jArr;
        int i3;
        boolean z;
        long jA = fh0.a(keyEvent.getKeyCode());
        int iN = hw.n(keyEvent);
        int i4 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i5 = 0;
        int i6 = 1;
        if (iN != 2) {
            if (iN != 1) {
                return true;
            }
            n03 n03Var = (n03) this.f;
            if (n03Var == null || !n03Var.a(jA)) {
                return false;
            }
            n03 n03Var2 = (n03) this.f;
            if (n03Var2 != null) {
                int iHashCode = Long.hashCode(jA) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int i8 = i7 & 127;
                int i9 = n03Var2.c;
                int i10 = i7 >>> 7;
                loop5: while (true) {
                    int i11 = i10 & i9;
                    long[] jArr2 = n03Var2.a;
                    int i12 = i11 >> 3;
                    int i13 = (i11 & 7) << 3;
                    long j3 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
                    long j4 = (((long) i8) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i11) & i9;
                        if (n03Var2.b[iNumberOfTrailingZeros] == jA) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i5 += 8;
                    i10 = i11 + i5;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    n03Var2.d--;
                    long[] jArr3 = n03Var2.a;
                    int i14 = n03Var2.c;
                    int i15 = iNumberOfTrailingZeros >> 3;
                    int i16 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i15] & (~(255 << i16))) | (254 << i16);
                    jArr3[i15] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i14) + (i14 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        n03 n03Var3 = (n03) this.f;
        if (n03Var3 == null) {
            n03Var3 = new n03(3);
            this.f = n03Var3;
        }
        n03 n03Var4 = n03Var3;
        int iHashCode2 = Long.hashCode(jA) * (-862048943);
        int i17 = iHashCode2 ^ (iHashCode2 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = n03Var4.c;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr4 = n03Var4.a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j7 = (jArr4[i23] >>> i24) | ((jArr4[i23 + 1] << (64 - i24)) & ((-i24) >> 63));
            int i25 = i4;
            long j8 = i19;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i21 + (Long.numberOfTrailingZeros(j10) >> 3)) & i20;
                long j11 = j2;
                if (n03Var4.b[iNumberOfTrailingZeros2] == jA) {
                    z = 1;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = n03Var4.b(i18);
                if (n03Var4.e != 0 || ((n03Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    i = 1;
                    j = 128;
                } else {
                    int i26 = n03Var4.c;
                    if (i26 <= 8 || Long.compare((((long) n03Var4.d) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) > 0) {
                        i2 = 1;
                        j = 128;
                        int iB2 = v54.b(n03Var4.c);
                        long[] jArr5 = n03Var4.a;
                        long[] jArr6 = n03Var4.b;
                        int i27 = n03Var4.c;
                        n03Var4.c(iB2);
                        long[] jArr7 = n03Var4.a;
                        long[] jArr8 = n03Var4.b;
                        int i28 = n03Var4.c;
                        int i29 = 0;
                        while (i29 < i27) {
                            if (((jArr5[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i29];
                                int iHashCode3 = Long.hashCode(j13) * i25;
                                int i30 = iHashCode3 ^ (iHashCode3 << 16);
                                int iB3 = n03Var4.b(i30 >>> 7);
                                jArr = jArr7;
                                int i31 = iB3 >> 3;
                                int i32 = (iB3 & 7) << 3;
                                long j14 = (jArr[i31] & (~(255 << i32))) | (((long) (i30 & 127)) << i32);
                                jArr[i31] = j14;
                                jArr[(((iB3 - 7) & i28) + (i28 & 7)) >> 3] = j14;
                                jArr8[iB3] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i29++;
                            jArr5 = jArr5;
                            jArr7 = jArr;
                            jArr6 = jArr6;
                            i2 = i2;
                        }
                    } else {
                        long[] jArr9 = n03Var4.a;
                        int i33 = n03Var4.c;
                        long[] jArr10 = n03Var4.b;
                        int i34 = (i33 + 7) >> 3;
                        int i35 = 0;
                        while (i35 < i34) {
                            long j15 = jArr9[i35] & (-9187201950435737472L);
                            jArr9[i35] = ((~j15) + (j15 >>> 7)) & (-72340172838076674L);
                            i35++;
                            c = c;
                            i33 = i33;
                        }
                        char c2 = c;
                        int i36 = i33;
                        j = 128;
                        int iJ0 = ti.j0(jArr9);
                        int i37 = iJ0 - 1;
                        long j16 = 72057594037927935L;
                        jArr9[i37] = (jArr9[i37] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iJ0] = jArr9[0];
                        int i38 = i36;
                        int i39 = 0;
                        while (i39 != i38) {
                            int i40 = i39 >> 3;
                            int i41 = (i39 & 7) << 3;
                            long j17 = (jArr9[i40] >> i41) & 255;
                            if (j17 != 128 && j17 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i39]) * i25;
                                int i42 = iHashCode4 ^ (iHashCode4 << 16);
                                long j18 = j16;
                                int i43 = i42 >>> 7;
                                int iB4 = n03Var4.b(i43);
                                int i44 = i43 & i38;
                                char c3 = c2;
                                if (((iB4 - i44) & i38) / 8 == ((i39 - i44) & i38) / 8) {
                                    int i45 = i6;
                                    jArr9[i40] = (jArr9[i40] & (~(255 << i41))) | (((long) (i42 & 127)) << i41);
                                    jArr9[jArr9.length - i45] = (jArr9[0] & j18) | Long.MIN_VALUE;
                                    i39++;
                                    i6 = i45;
                                    j16 = j18;
                                    c2 = c3;
                                } else {
                                    int i46 = i6;
                                    int i47 = iB4 >> 3;
                                    long j19 = jArr9[i47];
                                    int i48 = (iB4 & 7) << 3;
                                    if (((j19 >> i48) & 255) == 128) {
                                        int i49 = i39;
                                        jArr9[i47] = (j19 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                        jArr9[i40] = (jArr9[i40] & (~(255 << i41))) | (128 << i41);
                                        jArr10[iB4] = jArr10[i49];
                                        jArr10[i49] = j12;
                                        i3 = i49;
                                    } else {
                                        int i50 = i39;
                                        jArr9[i47] = (j19 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                        long j20 = jArr10[iB4];
                                        jArr10[iB4] = jArr10[i50];
                                        jArr10[i50] = j20;
                                        i3 = i50 - 1;
                                    }
                                    jArr9[jArr9.length - i46] = (jArr9[0] & j18) | Long.MIN_VALUE;
                                    i39 = i3 + i46;
                                    i6 = i46;
                                    j16 = j18;
                                    c2 = c3;
                                    i38 = i38;
                                }
                            } else {
                                i39++;
                            }
                        }
                        i2 = i6;
                        n03Var4.e = v54.a(n03Var4.c) - n03Var4.d;
                    }
                    i = i2;
                    iB = n03Var4.b(i18);
                }
                iNumberOfTrailingZeros2 = iB;
                n03Var4.d++;
                int i51 = n03Var4.e;
                long[] jArr11 = n03Var4.a;
                int i52 = iNumberOfTrailingZeros2 >> 3;
                long j21 = jArr11[i52];
                int i53 = (iNumberOfTrailingZeros2 & 7) << 3;
                n03Var4.e = i51 - (((j21 >> i53) & 255) == j ? i == true ? 1 : 0 : 0);
                int i54 = n03Var4.c;
                long j22 = (j21 & (~(255 << i53))) | (j8 << i53);
                jArr11[i52] = j22;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i54) + (i54 & 7)) >> 3] = j22;
                z = i;
                break;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i4 = i25;
            j2 = j12;
        }
        n03Var4.b[iNumberOfTrailingZeros2] = jA;
        return z;
    }

    public ey(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, CheckBox checkBox, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6) {
        this.a = constraintLayout;
        this.b = textInputEditText;
        this.c = textInputEditText2;
        this.d = checkBox;
        this.e = textInputEditText3;
        this.f = textInputEditText4;
        this.g = textInputEditText5;
        this.h = textInputEditText6;
    }

    public ey(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, ComposeView composeView, ConstraintLayout constraintLayout2, Button button6) {
        this.a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = button3;
        this.e = button4;
        this.f = button5;
        this.g = constraintLayout2;
        this.h = button6;
    }

    public ey(ra raVar, ra raVar2) {
        this.a = raVar;
        this.b = raVar2;
        this.c = new ba1(2, null, 14);
        this.d = new s91(this, raVar2);
        this.e = new w91(this);
        this.g = new q03(1);
    }

    public /* synthetic */ ey(LinearLayout linearLayout, View view, View view2, TextView textView, TextView textView2, View view3, View view4, TextView textView3, View view5) {
        this.a = view;
        this.b = view2;
        this.c = textView;
        this.d = textView2;
        this.e = view3;
        this.f = view4;
        this.g = textView3;
        this.h = view5;
    }
}
