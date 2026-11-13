package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Paint
 *  android.view.KeyEvent
 *  android.view.View
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;

public final class ey
implements u91 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public Object h;

    public ey(Context context) {
        TypedArray typedArray = context.obtainStyledAttributes(zz1.F((int)2130969410, (Context)context, (String)nh2.class.getCanonicalName()).data, ht3.x);
        this.a = c6.f(context, typedArray.getResourceId(4, 0));
        this.g = c6.f(context, typedArray.getResourceId(2, 0));
        this.b = c6.f(context, typedArray.getResourceId(3, 0));
        this.c = c6.f(context, typedArray.getResourceId(5, 0));
        ColorStateList colorStateList = h12.s(context, typedArray, 7);
        this.d = c6.f(context, typedArray.getResourceId(9, 0));
        this.e = c6.f(context, typedArray.getResourceId(8, 0));
        this.f = c6.f(context, typedArray.getResourceId(10, 0));
        context = new Paint();
        this.h = context;
        context.setColor(colorStateList.getDefaultColor());
        typedArray.recycle();
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

    public ey(ra ra6, ra ra7) {
        this.a = ra6;
        this.b = ra7;
        this.c = new ba1(2, null, 14);
        this.d = new s91(this, ra7);
        this.e = new w91(this);
        this.g = new q03(1);
    }

    public boolean a(boolean bl5) {
        if (this.f() != null) {
            Object object = this.f();
            this.h(null);
            if (object != null) {
                Object object2 = z91.n;
                z91 z912 = z91.p;
                object.r0((z91)((Object)object2), z912);
                if (!object.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                object2 = object.n.r;
                c72 c722 = j51.O(object);
                while (c722 != null) {
                    if ((((cx2)c722.Q.g).q & 0x400) != 0) {
                        object = object2;
                        while (object != null) {
                            if ((object.p & 0x400) != 0) {
                                Object object3 = object;
                                object2 = null;
                                while (object3 != null) {
                                    Object object4;
                                    if (object3 instanceof ba1) {
                                        ((ba1)object3).r0(z91.o, z912);
                                        object4 = object2;
                                    } else {
                                        object4 = object2;
                                        if ((((cx2)object3).p & 0x400) != 0) {
                                            object4 = object2;
                                            if (object3 instanceof fo0) {
                                                object4 = ((fo0)object3).C;
                                                int n16 = 0;
                                                while (object4 != null) {
                                                    Object object5 = object3;
                                                    Object object6 = object2;
                                                    int n17 = n16;
                                                    if ((((cx2)object4).p & 0x400) != 0) {
                                                        n17 = n16 + 1;
                                                        if (n17 == 1) {
                                                            object5 = object4;
                                                            object6 = object2;
                                                        } else {
                                                            object5 = object2;
                                                            if (object2 == null) {
                                                                object5 = new f13(new cx2[16]);
                                                            }
                                                            object2 = object3;
                                                            if (object3 != null) {
                                                                ((f13)object5).b(object3);
                                                                object2 = null;
                                                            }
                                                            ((f13)object5).b(object4);
                                                            object6 = object5;
                                                            object5 = object2;
                                                        }
                                                    }
                                                    object4 = ((cx2)object4).s;
                                                    object3 = object5;
                                                    object2 = object6;
                                                    n16 = n17;
                                                }
                                                object4 = object2;
                                                if (n16 == 1) continue;
                                            }
                                        }
                                    }
                                    object3 = j51.c((f13)object4);
                                    object2 = object4;
                                }
                            }
                            object = object.r;
                        }
                    }
                    if ((c722 = c722.t()) != null && (object2 = c722.Q) != null) {
                        object2 = (sq4)((w12)object2).f;
                        continue;
                    }
                    object2 = null;
                }
            }
        }
        return true;
    }

    public boolean b(int n16, boolean bl5, boolean bl6) {
        boolean bl7 = true;
        if (!bl5) {
            n16 = uc5.M((ba1)this.c).ordinal();
            if (n16 != 0) {
                if (n16 != 1 && n16 != 2 && n16 != 3) {
                    er1.n();
                    return false;
                }
                bl5 = false;
            } else {
                this.a(bl5);
                bl5 = bl7;
            }
        } else {
            this.a(bl5);
            bl5 = bl7;
        }
        if (bl5 && bl6) {
            this.c();
        }
        return bl5;
    }

    public void c() {
        ra ra6 = (ra)this.a;
        if (!ra6.isFocused() && !ra6.hasFocus()) {
            if (ra6.hasFocus()) {
                View view = ra6.findFocus();
                if (view != null) {
                    view.clearFocus();
                }
                ra6.clearFocus();
            }
            return;
        }
        ra6.clearFocus();
    }

    /*
     * Exception decompiling
     */
    public boolean d(KeyEvent var1_1, gf1 var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [83[WHILELOOP]], but top level block is 18[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Boolean e(int var1_1, wv3 var2_2, if1 var3_3) {
        block83: {
            block64: {
                block84: {
                    block82: {
                        block75: {
                            block78: {
                                block81: {
                                    block80: {
                                        block79: {
                                            block77: {
                                                block66: {
                                                    block74: {
                                                        block76: {
                                                            block68: {
                                                                block73: {
                                                                    block72: {
                                                                        block71: {
                                                                            block70: {
                                                                                block69: {
                                                                                    block67: {
                                                                                        var12_4 = (ra)this.b;
                                                                                        var13_5 = (ba1)this.c;
                                                                                        var11_6 = te5.p((ba1)var13_5);
                                                                                        var4_7 = 4;
                                                                                        var8_8 = false;
                                                                                        var7_9 = false;
                                                                                        if (var11_6 == null) break block66;
                                                                                        var15_10 = var12_4.getLayoutDirection();
                                                                                        var14_11 = var11_6.s0();
                                                                                        var9_12 = var14_11.h;
                                                                                        var10_13 /* !! */  = var14_11.i;
                                                                                        if (var1_1 != 1) break block67;
                                                                                        var9_12 = var14_11.b;
                                                                                        break block68;
                                                                                    }
                                                                                    if (var1_1 != 2) break block69;
                                                                                    var9_12 = var14_11.c;
                                                                                    break block68;
                                                                                }
                                                                                if (var1_1 != 5) break block70;
                                                                                var9_12 = var14_11.d;
                                                                                break block68;
                                                                            }
                                                                            if (var1_1 != 6) break block71;
                                                                            var9_12 = var14_11.e;
                                                                            break block68;
                                                                        }
                                                                        if (var1_1 != 3) break block72;
                                                                        var5_14 = var15_10.ordinal();
                                                                        if (var5_14 != 0) {
                                                                            if (var5_14 == 1) {
                                                                                var9_12 = var10_13 /* !! */ ;
                                                                            } else {
                                                                                er1.n();
                                                                                return null;
                                                                            }
                                                                        }
                                                                        var10_13 /* !! */  = var9_12;
                                                                        if (var9_12 == y91.b) {
                                                                            var10_13 /* !! */  = null;
                                                                        }
                                                                        var9_12 = var10_13 /* !! */ ;
                                                                        if (var10_13 /* !! */  == null) {
                                                                            var9_12 = var14_11.f;
                                                                        }
                                                                        break block68;
                                                                    }
                                                                    if (var1_1 != 4) break block73;
                                                                    var5_14 = var15_10.ordinal();
                                                                    if (var5_14 != 0) {
                                                                        if (var5_14 != 1) {
                                                                            er1.n();
                                                                            return null;
                                                                        }
                                                                    } else {
                                                                        var9_12 = var10_13 /* !! */ ;
                                                                    }
                                                                    var10_13 /* !! */  = var9_12;
                                                                    if (var9_12 == y91.b) {
                                                                        var10_13 /* !! */  = null;
                                                                    }
                                                                    var9_12 = var10_13 /* !! */ ;
                                                                    if (var10_13 /* !! */  == null) {
                                                                        var9_12 = var14_11.g;
                                                                    }
                                                                    break block68;
                                                                }
                                                                if (var1_1 != 7 && var1_1 != 8) break block74;
                                                                var9_12 = (ey)((ra)j51.P((eo0)var11_6)).getFocusOwner();
                                                                var10_13 /* !! */  = var9_12.f();
                                                                if (var1_1 == 7) {
                                                                    var14_11.j.getClass();
                                                                } else {
                                                                    var14_11.k.getClass();
                                                                }
                                                                var9_12 = var10_13 /* !! */  != var9_12.f() ? y91.d : y91.b;
                                                            }
                                                            var15_10 = y91.c;
                                                            if (h12.c(var9_12, var15_10)) break block75;
                                                            if (!h12.c(var9_12, y91.d)) break block76;
                                                            var2_2 = te5.p((ba1)var13_5);
                                                            if (var2_2 != null) {
                                                                return (Boolean)var3_3.invoke(var2_2);
                                                            }
                                                            break block75;
                                                        }
                                                        var14_11 = y91.b;
                                                        var10_13 /* !! */  = var11_6;
                                                        if (!h12.c(var9_12, var14_11)) {
                                                            if (var9_12 != var14_11) {
                                                                if (var9_12 != var15_10) {
                                                                    var2_2 = var9_12.a;
                                                                    var6_15 = var2_2.p;
                                                                    if (var6_15 == 0) {
                                                                        System.out.println((Object)"FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                                                                    } else {
                                                                        var14_11 = var2_2.n;
                                                                        var7_9 = false;
                                                                        for (var1_1 = 0; var1_1 < var6_15; ++var1_1) {
                                                                            var2_2 = (xo)var14_11[var1_1];
                                                                            if (!var2_2.n.A) {
                                                                                cz1.b("visitChildren called on an unattached node");
                                                                            }
                                                                            var13_5 = new f13(new cx2[16]);
                                                                            var9_12 = var2_2.n;
                                                                            var2_2 = var9_12.s;
                                                                            if (var2_2 == null) {
                                                                                j51.b((f13)var13_5, (cx2)var9_12);
                                                                            } else {
                                                                                var13_5.b(var2_2);
                                                                            }
                                                                            block1: while (true) {
                                                                                var4_7 = var13_5.p;
                                                                                var8_8 = var7_9;
                                                                                if (var4_7 == 0) break;
                                                                                var10_13 /* !! */  = var2_2 = (cx2)var13_5.k(var4_7 - 1);
                                                                                if ((var2_2.q & 1024) == 0) {
                                                                                    j51.b((f13)var13_5, (cx2)var2_2);
                                                                                    continue;
                                                                                }
                                                                                while (true) {
                                                                                    if (var10_13 /* !! */  == null) continue block1;
                                                                                    if ((var10_13 /* !! */ .p & 1024) != 0) {
                                                                                        var2_2 = null;
                                                                                        while (true) {
                                                                                            if (var10_13 /* !! */  != null) ** break;
                                                                                            continue block1;
                                                                                            if (var10_13 /* !! */  instanceof ba1) {
                                                                                                var9_12 = var2_2;
                                                                                                if (((Boolean)var3_3.invoke((ba1)var10_13 /* !! */ )).booleanValue()) {
                                                                                                    var8_8 = true;
                                                                                                    break block1;
                                                                                                }
                                                                                            } else {
                                                                                                var9_12 = var2_2;
                                                                                                if ((var10_13 /* !! */ .p & 1024) != 0) {
                                                                                                    var9_12 = var2_2;
                                                                                                    if (var10_13 /* !! */  instanceof fo0) {
                                                                                                        var9_12 = ((fo0)var10_13 /* !! */ ).C;
                                                                                                        var4_7 = 0;
                                                                                                        while (var9_12 != null) {
                                                                                                            var11_6 = var10_13 /* !! */ ;
                                                                                                            var12_4 = var2_2;
                                                                                                            var5_14 = var4_7;
                                                                                                            if ((var9_12.p & 1024) != 0) {
                                                                                                                var5_14 = var4_7 + 1;
                                                                                                                if (var5_14 == 1) {
                                                                                                                    var11_6 = var9_12;
                                                                                                                    var12_4 = var2_2;
                                                                                                                } else {
                                                                                                                    var11_6 = var2_2;
                                                                                                                    if (var2_2 == null) {
                                                                                                                        var11_6 = new f13(new cx2[16]);
                                                                                                                    }
                                                                                                                    var2_2 = var10_13 /* !! */ ;
                                                                                                                    if (var10_13 /* !! */  != null) {
                                                                                                                        var11_6.b(var10_13 /* !! */ );
                                                                                                                        var2_2 = null;
                                                                                                                    }
                                                                                                                    var11_6.b(var9_12);
                                                                                                                    var12_4 = var11_6;
                                                                                                                    var11_6 = var2_2;
                                                                                                                }
                                                                                                            }
                                                                                                            var9_12 = var9_12.s;
                                                                                                            var10_13 /* !! */  = var11_6;
                                                                                                            var2_2 = var12_4;
                                                                                                            var4_7 = var5_14;
                                                                                                        }
                                                                                                        var9_12 = var2_2;
                                                                                                        if (var4_7 == 1) continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var10_13 /* !! */  = j51.c((f13)var9_12);
                                                                                            var2_2 = var9_12;
                                                                                        }
                                                                                    }
                                                                                    var10_13 /* !! */  = var10_13 /* !! */ .s;
                                                                                }
                                                                                break;
                                                                            }
                                                                            var7_9 = var8_8;
                                                                        }
                                                                    }
                                                                    return var7_9;
                                                                }
                                                                kf2.o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                                                                return null;
                                                            }
                                                            kf2.o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                                                            return null;
                                                        }
                                                        break block77;
                                                    }
                                                    kf2.o("invalid FocusDirection");
                                                    return null;
                                                }
                                                var10_13 /* !! */  = null;
                                            }
                                            var9_12 = var12_4.getLayoutDirection();
                                            var14_11 = new dd0(var10_13 /* !! */ , this, var3_3, 2);
                                            if (var1_1 != 1 && var1_1 != 2) break block78;
                                            if (var1_1 != 1) break block79;
                                            var7_9 = zz1.o((ba1)var13_5, (dd0)var14_11);
                                            break block80;
                                        }
                                        if (var1_1 != 2) break block81;
                                        var7_9 = zz1.f((ba1)var13_5, (dd0)var14_11);
                                    }
                                    return var7_9;
                                }
                                kf2.o("This function should only be used for 1-D focus search");
                                return null;
                            }
                            if (var1_1 == 3 || var1_1 == 4 || var1_1 == 5 || var1_1 == 6) {
                                return kb4.b0(var1_1, (dd0)var14_11, (ba1)var13_5, (wv3)var2_2);
                            }
                            if (var1_1 == 7) {
                                var5_14 = var9_12.ordinal();
                                var1_1 = var4_7;
                                if (var5_14 != 0) {
                                    if (var5_14 == 1) {
                                        var1_1 = 3;
                                    } else {
                                        er1.n();
                                        return null;
                                    }
                                }
                                if ((var3_3 = te5.p((ba1)var13_5)) != null) {
                                    return kb4.b0(var1_1, (dd0)var14_11, (ba1)var3_3, (wv3)var2_2);
                                } else {
                                    ** GOTO lbl204
                                }
                            }
                            break block82;
                        }
                        return null;
                    }
                    if (var1_1 != 8) break block83;
                    var3_3 = te5.p((ba1)var13_5);
                    if (var3_3 == null) break block84;
                    if (!var3_3.n.A) {
                        cz1.b("visitAncestors called on an unattached node");
                    }
                    var2_2 = var3_3.n.r;
                    var12_4 = j51.O((eo0)var3_3);
                    while (var12_4 != null) {
                        block85: {
                            if ((((cx2)var12_4.Q.g).q & 1024) == 0) break block85;
                            var9_12 = var2_2;
                            while (var9_12 != null) {
                                block86: {
                                    if ((var9_12.p & 1024) == 0) break block86;
                                    var2_2 = var9_12;
                                    var3_3 = null;
                                    while (var2_2 != null) {
                                        block65: {
                                            if (var2_2 instanceof ba1) {
                                                var2_2 = (ba1)var2_2;
                                                if (var2_2.s0().a) break block64;
                                                while (true) {
                                                    var10_13 /* !! */  = var3_3;
                                                    break block65;
                                                    break;
                                                }
                                            }
                                            if ((var2_2.p & 1024) == 0 || !(var2_2 instanceof fo0)) ** continue;
                                            var10_13 /* !! */  = ((fo0)var2_2).C;
                                            var4_7 = 0;
                                            while (var10_13 /* !! */  != null) {
                                                var11_6 = var2_2;
                                                var1_1 = var4_7;
                                                if ((var10_13 /* !! */ .p & 1024) == 0) ** GOTO lbl238
                                                var1_1 = var4_7 + 1;
                                                if (var1_1 == 1) {
                                                    var11_6 = var10_13 /* !! */ ;
lbl238:
                                                    // 2 sources

                                                    var2_2 = var11_6;
                                                } else {
                                                    if (var3_3 == null) {
                                                        var3_3 = new f13(new cx2[16]);
                                                    }
                                                    var11_6 = var2_2;
                                                    if (var2_2 != null) {
                                                        var3_3.b(var2_2);
                                                        var11_6 = null;
                                                    }
                                                    var3_3.b(var10_13 /* !! */ );
                                                    var2_2 = var11_6;
                                                }
                                                var10_13 /* !! */  = var10_13 /* !! */ .s;
                                                var4_7 = var1_1;
                                            }
                                            var10_13 /* !! */  = var3_3;
                                            if (var4_7 == 1) continue;
                                        }
                                        var2_2 = j51.c((f13)var10_13 /* !! */ );
                                        var3_3 = var10_13 /* !! */ ;
                                    }
                                }
                                var9_12 = var9_12.r;
                            }
                        }
                        if ((var12_4 = var12_4.t()) != null && (var2_2 = var12_4.Q) != null) {
                            var2_2 = (sq4)var2_2.f;
                            continue;
                        }
                        var2_2 = null;
                    }
                }
                var2_2 = null;
            }
            var7_9 = var8_8;
            if (var2_2 != null) {
                var7_9 = var8_8;
                if (var2_2 != var13_5) {
                    var7_9 = (Boolean)var14_11.invoke(var2_2);
                }
            }
            return var7_9;
        }
        throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(o91.a(var1_1)).toString());
    }

    public ba1 f() {
        ba1 ba12 = (ba1)this.h;
        if (ba12 != null && ba12.A) {
            return ba12;
        }
        return null;
    }

    public boolean g(int n16) {
        boolean bl5 = false;
        if (!this.b(n16, false, false)) {
            return false;
        }
        Boolean bl6 = this.e(n16, null, new ha(n16, 2));
        if (bl6 != null) {
            bl5 = bl6;
        }
        if (!bl5) {
            this.c();
        }
        return bl5;
    }

    public void h(ba1 ba12) {
        ba1 ba13 = (ba1)this.h;
        this.h = ba12;
        q03 q032 = (q03)this.g;
        Object[] objectArray = q032.a;
        int n16 = q032.b;
        for (int i16 = 0; i16 < n16; ++i16) {
            ((t91)objectArray[i16]).a(ba13, ba12);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean i(KeyEvent object) {
        long l16 = fh0.a(object.getKeyCode());
        int n16 = hw.n((KeyEvent)object);
        int n17 = -862048943;
        Object object2 = 0L;
        int n18 = 8;
        int n19 = 0;
        int n26 = 0;
        int n27 = 1;
        if (n16 == 2) {
            block21: {
                long l17;
                int n28;
                Object object3;
                block22: {
                    int n29;
                    block23: {
                        long[] lArray;
                        Object object4;
                        Object object5;
                        int n36;
                        object = object3 = (n03)this.f;
                        if (object3 == null) {
                            this.f = object = new n03(3);
                        }
                        n19 = Long.hashCode(l16) * -862048943;
                        int n37 = n19 ^ n19 << 16;
                        n29 = n37 >>> 7;
                        int n38 = ((n03)object).c;
                        n16 = n29 & n38;
                        n19 = 0;
                        while (true) {
                            object3 = ((n03)object).a;
                            n36 = n16 >> 3;
                            n28 = (n16 & 7) << 3;
                            object5 = object3[n36] >>> n28 | object3[n36 + 1] << 64 - n28 & -((long)n28) >> 63;
                            l17 = n37 & 0x7F;
                            object4 = object5 ^ l17 * 0x101010101010101L;
                            for (object4 = object4 - 0x101010101010101L & (object4 ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; object4 != object2; object4 &= object4 - 1L) {
                                n28 = n16 + (Long.numberOfTrailingZeros((long)object4) >> 3) & n38;
                                if (((n03)object).b[n28] != l16) continue;
                                n19 = 1;
                                n16 = n28;
                                break block21;
                            }
                            if ((object5 & (object5 ^ 0xFFFFFFFFFFFFFFFFL) << 6 & 0x8080808080808080L) != object2) {
                                n16 = ((n03)object).b(n29);
                                if (((n03)object).e != 0 || (((n03)object).a[n16 >> 3] >> ((n16 & 7) << 3) & 0xFFL) == 254L) {
                                    n19 = 1;
                                    break block22;
                                }
                                n19 = ((n03)object).c;
                                if (n19 > 8 && Long.compare((long)((n03)object).d * 32L ^ Long.MIN_VALUE, (long)n19 * 25L ^ Long.MIN_VALUE) <= 0) {
                                    lArray = ((n03)object).a;
                                    n37 = ((n03)object).c;
                                    object3 = ((n03)object).b;
                                    n19 = n37;
                                    n16 = n18;
                                    for (n28 = 0; n28 < n37 + 7 >> 3; ++n28) {
                                        object4 = lArray[n28] & 0x8080808080808080L;
                                        lArray[n28] = (long)((object4 ^ 0xFFFFFFFFFFFFFFFFL) + (object4 >>> 7) & 0xFEFEFEFEFEFEFEFEL);
                                    }
                                    n28 = ti.j0(lArray);
                                    n18 = n28 - 1;
                                    object5 = lArray[n18];
                                    object4 = 0xFFFFFFFFFFFFFFL;
                                    lArray[n18] = (long)(object5 & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L);
                                    lArray[n28] = lArray[0];
                                    n18 = n19;
                                    n19 = 0;
                                    n28 = n16;
                                    n16 = n27;
                                    break;
                                }
                                n19 = 1;
                                n16 = v54.b(((n03)object).c);
                                long[] lArray2 = ((n03)object).a;
                                object3 = ((n03)object).b;
                                n18 = ((n03)object).c;
                                ((n03)object).c(n16);
                                long[] lArray3 = ((n03)object).a;
                                long[] lArray4 = ((n03)object).b;
                                n27 = ((n03)object).c;
                                n28 = 0;
                                while (true) {
                                    n16 = n19;
                                    if (n28 < n18) {
                                        if ((lArray2[n28 >> 3] >> ((n28 & 7) << 3) & 0xFFL) < 128L) {
                                            object2 = object3[n28];
                                            n16 = Long.hashCode(object2) * n17;
                                            n37 = n16 ^ n16 << 16;
                                            n16 = ((n03)object).b(n37 >>> 7);
                                            object4 = (long)(n37 & 0x7F);
                                            n37 = n16 >> 3;
                                            n38 = (n16 & 7) << 3;
                                            object4 = lArray3[n37] & (255L << n38 ^ 0xFFFFFFFFFFFFFFFFL) | object4 << n38;
                                            lArray3[n37] = (long)object4;
                                            lArray3[(n16 - 7 & n27) + (n27 & 7) >> 3] = (long)object4;
                                            lArray4[n16] = object2;
                                        }
                                        ++n28;
                                        continue;
                                    }
                                    break block23;
                                    break;
                                }
                            }
                            n16 = n16 + (n19 += 8) & n38;
                        }
                        while (n19 != n18) {
                            n37 = n19 >> 3;
                            object5 = lArray[n37];
                            n27 = (n19 & 7) << 3;
                            if ((object5 = object5 >> n27 & 0xFFL) == 128L || object5 != 254L) {
                                ++n19;
                                continue;
                            }
                            n38 = Long.hashCode((long)object3[n19]) * n17;
                            n38 ^= n38 << 16;
                            int n39 = n38 >>> 7;
                            n36 = ((n03)object).b(n39);
                            if ((n36 - (n39 &= n18) & n18) / 8 == (n19 - n39 & n18) / 8) {
                                object5 = (long)(n38 & 0x7F);
                                lArray[n37] = lArray[n37] & (255L << n27 ^ 0xFFFFFFFFFFFFFFFFL) | object5 << n27;
                                lArray[lArray.length - n16] = lArray[0] & object4 | Long.MIN_VALUE;
                                ++n19;
                                continue;
                            }
                            int n46 = n36 >> 3;
                            object5 = lArray[n46];
                            n39 = (n36 & 7) << 3;
                            if ((object5 >> n39 & 0xFFL) == 128L) {
                                lArray[n46] = (long)(object5 & (255L << n39 ^ 0xFFFFFFFFFFFFFFFFL) | (long)(n38 & 0x7F) << n39);
                                lArray[n37] = lArray[n37] & (255L << n27 ^ 0xFFFFFFFFFFFFFFFFL) | 128L << n27;
                                object3[n36] = object3[n19];
                                object3[n19] = object2;
                            } else {
                                lArray[n46] = (long)(object5 & (255L << n39 ^ 0xFFFFFFFFFFFFFFFFL) | (long)(n38 & 0x7F) << n39);
                                object5 = object3[n36];
                                object3[n36] = object3[n19];
                                object3[n19] = object5;
                                --n19;
                            }
                            lArray[lArray.length - n16] = lArray[0] & object4 | Long.MIN_VALUE;
                            n19 += n16;
                        }
                        ((n03)object).e = v54.a(((n03)object).c) - ((n03)object).d;
                    }
                    n19 = n16;
                    n16 = ((n03)object).b(n29);
                }
                ++((n03)object).d;
                n27 = ((n03)object).e;
                object3 = ((n03)object).a;
                n17 = n16 >> 3;
                object2 = object3[n17];
                n18 = (n16 & 7) << 3;
                n28 = n26;
                if ((object2 >> n18 & 0xFFL) == 128L) {
                    n28 = n19;
                }
                ((n03)object).e = n27 - n28;
                n28 = ((n03)object).c;
                object2 = object2 & (255L << n18 ^ 0xFFFFFFFFFFFFFFFFL) | l17 << n18;
                object3[n17] = object2;
                object3[(n16 - 7 & n28) + (n28 & 7) >> 3] = object2;
            }
            ((n03)object).b[n16] = l16;
            return n19 != 0;
        }
        if (n16 != 1) return true;
        object = (n03)this.f;
        if (object == null) return false;
        if (!((n03)object).a(l16)) return false;
        object = (n03)this.f;
        if (object == null) return true;
        n16 = Long.hashCode(l16) * -862048943;
        int n47 = n16 ^ n16 << 16;
        n17 = ((n03)object).c;
        n16 = n47 >>> 7;
        while (true) {
            block25: {
                long[] lArray;
                block24: {
                    n18 = n16 & n17;
                    lArray = ((n03)object).a;
                    n26 = n18 >> 3;
                    n16 = (n18 & 7) << 3;
                    object2 = lArray[n26];
                    long l18 = lArray[n26 + 1] << 64 - n16 & -((long)n16) >> 63 | object2 >>> n16;
                    object2 = (long)(n47 & 0x7F) * 0x101010101010101L ^ l18;
                    for (object2 = (object2 ^ 0xFFFFFFFFFFFFFFFFL) & object2 - 0x101010101010101L & 0x8080808080808080L; object2 != 0L; object2 &= object2 - 1L) {
                        n16 = (Long.numberOfTrailingZeros(object2) >> 3) + n18 & n17;
                        if (((n03)object).b[n16] != l16) {
                            continue;
                        }
                        break block24;
                    }
                    if ((l18 & (l18 ^ 0xFFFFFFFFFFFFFFFFL) << 6 & 0x8080808080808080L) != 0L) {
                        return true;
                    }
                    break block25;
                }
                n19 = n16;
                if (n19 < 0) return true;
                --((n03)object).d;
                lArray = ((n03)object).a;
                n17 = ((n03)object).c;
                n47 = n19 >> 3;
                n16 = (n19 & 7) << 3;
                lArray[n47] = object2 = lArray[n47] & (255L << n16 ^ 0xFFFFFFFFFFFFFFFFL) | 254L << n16;
                lArray[(n19 - 7 & n17) + (n17 & 7) >> 3] = object2;
                return true;
            }
            n16 = n18 + (n19 += 8);
        }
    }
}

