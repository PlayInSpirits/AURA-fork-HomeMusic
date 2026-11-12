package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.eddyizm.tempus.homemusic.WaveRetry;
import defpackage.ba5;
import defpackage.dp;
import defpackage.eb2;
import defpackage.ep;
import defpackage.fd4;
import defpackage.j83;
import defpackage.jc0;
import defpackage.kb0;
import defpackage.kc0;
import defpackage.kt3;
import defpackage.lb0;
import defpackage.mb0;
import defpackage.nb0;
import defpackage.nr3;
import defpackage.oc0;
import defpackage.pk1;
import defpackage.q00;
import defpackage.qk1;
import defpackage.qp4;
import defpackage.rm3;
import defpackage.uo;
import defpackage.up1;
import defpackage.w45;
import defpackage.wb0;
import defpackage.xo0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static fd4 C;
    public final SparseArray A;
    public final nr3 B;
    public final SparseArray n;
    public final ArrayList o;
    public final kc0 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public wb0 w;
    public rm3 x;
    public int y;
    public HashMap z;

    public ConstraintLayout(Context context) {
        super(context);
        this.n = new SparseArray();
        this.o = new ArrayList(4);
        this.p = new kc0();
        this.q = 0;
        this.r = 0;
        this.s = Integer.MAX_VALUE;
        this.t = Integer.MAX_VALUE;
        this.u = true;
        this.v = 257;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = new HashMap();
        this.A = new SparseArray();
        this.B = new nr3(this, this);
        h(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static fd4 getSharedValues() {
        if (C == null) {
            fd4 fd4Var = new fd4();
            new SparseIntArray();
            new HashMap();
            C = fd4Var;
        }
        return C;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mb0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.o;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((kb0) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.u = true;
        super.forceLayout();
    }

    public final jc0 g(View view) {
        if (view == this) {
            return this.p;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof mb0) {
            return ((mb0) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof mb0) {
            return ((mb0) view.getLayoutParams()).p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new mb0(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        mb0 mb0Var = new mb0(context, attributeSet);
        mb0Var.a = -1;
        mb0Var.b = -1;
        mb0Var.c = -1.0f;
        mb0Var.d = true;
        mb0Var.e = -1;
        mb0Var.f = -1;
        mb0Var.g = -1;
        mb0Var.h = -1;
        mb0Var.i = -1;
        mb0Var.j = -1;
        mb0Var.k = -1;
        mb0Var.l = -1;
        mb0Var.m = -1;
        mb0Var.n = -1;
        mb0Var.o = -1;
        mb0Var.p = -1;
        mb0Var.q = 0;
        mb0Var.r = 0.0f;
        mb0Var.s = -1;
        mb0Var.t = -1;
        mb0Var.u = -1;
        mb0Var.v = -1;
        mb0Var.w = Integer.MIN_VALUE;
        mb0Var.x = Integer.MIN_VALUE;
        mb0Var.y = Integer.MIN_VALUE;
        mb0Var.z = Integer.MIN_VALUE;
        mb0Var.A = Integer.MIN_VALUE;
        mb0Var.B = Integer.MIN_VALUE;
        mb0Var.C = Integer.MIN_VALUE;
        mb0Var.D = 0;
        mb0Var.E = 0.5f;
        mb0Var.F = 0.5f;
        mb0Var.G = null;
        mb0Var.H = -1.0f;
        mb0Var.I = -1.0f;
        mb0Var.J = 0;
        mb0Var.K = 0;
        mb0Var.L = 0;
        mb0Var.M = 0;
        mb0Var.N = 0;
        mb0Var.O = 0;
        mb0Var.P = 0;
        mb0Var.Q = 0;
        mb0Var.R = 1.0f;
        mb0Var.S = 1.0f;
        mb0Var.T = -1;
        mb0Var.U = -1;
        mb0Var.V = -1;
        mb0Var.W = false;
        mb0Var.X = false;
        mb0Var.Y = null;
        mb0Var.Z = 0;
        mb0Var.a0 = true;
        mb0Var.b0 = true;
        mb0Var.c0 = false;
        mb0Var.d0 = false;
        mb0Var.e0 = false;
        mb0Var.f0 = -1;
        mb0Var.g0 = -1;
        mb0Var.h0 = -1;
        mb0Var.i0 = -1;
        mb0Var.j0 = Integer.MIN_VALUE;
        mb0Var.k0 = Integer.MIN_VALUE;
        mb0Var.l0 = 0.5f;
        mb0Var.p0 = new jc0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kt3.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = lb0.a.get(index);
            switch (i2) {
                case 1:
                    mb0Var.V = typedArrayObtainStyledAttributes.getInt(index, mb0Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.p);
                    mb0Var.p = resourceId;
                    if (resourceId == -1) {
                        mb0Var.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    mb0Var.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, mb0Var.r) % 360.0f;
                    mb0Var.r = f;
                    if (f < 0.0f) {
                        mb0Var.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    mb0Var.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mb0Var.a);
                    break;
                case 6:
                    mb0Var.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mb0Var.b);
                    break;
                case 7:
                    mb0Var.c = typedArrayObtainStyledAttributes.getFloat(index, mb0Var.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.e);
                    mb0Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        mb0Var.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.f);
                    mb0Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        mb0Var.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.g);
                    mb0Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        mb0Var.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.h);
                    mb0Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        mb0Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.i);
                    mb0Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        mb0Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.j);
                    mb0Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        mb0Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.k);
                    mb0Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        mb0Var.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.l);
                    mb0Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        mb0Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case WaveRetry.MAX_FAILURES /* 16 */:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.m);
                    mb0Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        mb0Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.s);
                    mb0Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        mb0Var.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.t);
                    mb0Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        mb0Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.u);
                    mb0Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        mb0Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.v);
                    mb0Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        mb0Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    mb0Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.w);
                    break;
                case 22:
                    mb0Var.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.x);
                    break;
                case 23:
                    mb0Var.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.y);
                    break;
                case 24:
                    mb0Var.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.z);
                    break;
                case 25:
                    mb0Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.A);
                    break;
                case 26:
                    mb0Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.B);
                    break;
                case 27:
                    mb0Var.W = typedArrayObtainStyledAttributes.getBoolean(index, mb0Var.W);
                    break;
                case 28:
                    mb0Var.X = typedArrayObtainStyledAttributes.getBoolean(index, mb0Var.X);
                    break;
                case 29:
                    mb0Var.E = typedArrayObtainStyledAttributes.getFloat(index, mb0Var.E);
                    break;
                case 30:
                    mb0Var.F = typedArrayObtainStyledAttributes.getFloat(index, mb0Var.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    mb0Var.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    mb0Var.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        mb0Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, mb0Var.N) == -2) {
                            mb0Var.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        mb0Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, mb0Var.P) == -2) {
                            mb0Var.P = -2;
                        }
                    }
                    break;
                case 35:
                    mb0Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, mb0Var.R));
                    mb0Var.L = 2;
                    break;
                case 36:
                    try {
                        mb0Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, mb0Var.O) == -2) {
                            mb0Var.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        mb0Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, mb0Var.Q) == -2) {
                            mb0Var.Q = -2;
                        }
                    }
                    break;
                case 38:
                    mb0Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, mb0Var.S));
                    mb0Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            wb0.i(mb0Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            mb0Var.H = typedArrayObtainStyledAttributes.getFloat(index, mb0Var.H);
                            break;
                        case 46:
                            mb0Var.I = typedArrayObtainStyledAttributes.getFloat(index, mb0Var.I);
                            break;
                        case 47:
                            mb0Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            mb0Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            mb0Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mb0Var.T);
                            break;
                        case 50:
                            mb0Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mb0Var.U);
                            break;
                        case 51:
                            mb0Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.n);
                            mb0Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                mb0Var.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, mb0Var.o);
                            mb0Var.o = resourceId16;
                            if (resourceId16 == -1) {
                                mb0Var.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            mb0Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.D);
                            break;
                        case 55:
                            mb0Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mb0Var.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    wb0.h(mb0Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    wb0.h(mb0Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    mb0Var.Z = typedArrayObtainStyledAttributes.getInt(index, mb0Var.Z);
                                    break;
                                case 67:
                                    mb0Var.d = typedArrayObtainStyledAttributes.getBoolean(index, mb0Var.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        mb0Var.a();
        return mb0Var;
    }

    public int getMaxHeight() {
        return this.t;
    }

    public int getMaxWidth() {
        return this.s;
    }

    public int getMinHeight() {
        return this.r;
    }

    public int getMinWidth() {
        return this.q;
    }

    public int getOptimizationLevel() {
        return this.p.C0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        kc0 kc0Var = this.p;
        if (kc0Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                kc0Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                kc0Var.j = "parent";
            }
        }
        if (kc0Var.g0 == null) {
            kc0Var.g0 = kc0Var.j;
            Log.v("ConstraintLayout", " setDebugName " + kc0Var.g0);
        }
        ArrayList arrayList = kc0Var.p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jc0 jc0Var = (jc0) obj;
            View view = jc0Var.e0;
            if (view != null) {
                if (jc0Var.j == null && (id = view.getId()) != -1) {
                    jc0Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (jc0Var.g0 == null) {
                    jc0Var.g0 = jc0Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + jc0Var.g0);
                }
            }
        }
        kc0Var.l(sb);
        return sb.toString();
    }

    public final void h(AttributeSet attributeSet, int i, int i2) {
        kc0 kc0Var = this.p;
        kc0Var.e0 = this;
        nr3 nr3Var = this.B;
        kc0Var.t0 = nr3Var;
        kc0Var.r0.h = nr3Var;
        this.n.put(getId(), this);
        this.w = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, kt3.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == 17) {
                    this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r);
                } else if (index == 14) {
                    this.s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.s);
                } else if (index == 15) {
                    this.t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.t);
                } else if (index == 113) {
                    this.v = typedArrayObtainStyledAttributes.getInt(index, this.v);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.x = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        wb0 wb0Var = new wb0();
                        this.w = wb0Var;
                        wb0Var.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.w = null;
                    }
                    this.y = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        kc0Var.C0 = this.v;
        eb2.q = kc0Var.S(512);
    }

    public final void i(int i) {
        String str;
        Context context = getContext();
        rm3 rm3Var = new rm3();
        rm3Var.n = new SparseArray();
        rm3Var.o = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            j83 j83Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                rm3Var.J(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                j83 j83Var2 = new j83(context, xml);
                                ((SparseArray) rm3Var.n).put(j83Var2.n, j83Var2);
                                j83Var = j83Var2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                nb0 nb0Var = new nb0(context, xml);
                                if (j83Var != null) {
                                    ((ArrayList) j83Var.p).add(nb0Var);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.x = rm3Var;
    }

    public final void j(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        nr3 nr3Var = this.B;
        int i5 = nr3Var.d;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + nr3Var.c, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.s, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.t, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    public final void k(jc0 jc0Var, mb0 mb0Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.n.get(i);
        jc0 jc0Var2 = (jc0) sparseArray.get(i);
        if (jc0Var2 == null || view == null || !(view.getLayoutParams() instanceof mb0)) {
            return;
        }
        mb0Var.c0 = true;
        if (i2 == 6) {
            mb0 mb0Var2 = (mb0) view.getLayoutParams();
            mb0Var2.c0 = true;
            mb0Var2.p0.E = true;
        }
        jc0Var.g(6).a(jc0Var2.g(i2), mb0Var.D, mb0Var.C);
        jc0Var.E = true;
        jc0Var.g(3).g();
        jc0Var.g(5).g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            mb0 mb0Var = (mb0) childAt.getLayoutParams();
            jc0 jc0Var = mb0Var.p0;
            if (childAt.getVisibility() != 8 || mb0Var.d0 || mb0Var.e0 || zIsInEditMode) {
                int iP = jc0Var.p();
                int iQ = jc0Var.q();
                childAt.layout(iP, iQ, jc0Var.o() + iP, jc0Var.i() + iQ);
            }
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((kb0) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:176:0x0348  */
    /* JADX WARN: Code duplicated, block: B:178:0x0352  */
    /* JADX WARN: Code duplicated, block: B:179:0x0360  */
    /* JADX WARN: Code duplicated, block: B:181:0x0364  */
    /* JADX WARN: Code duplicated, block: B:188:0x0382  */
    /* JADX WARN: Code duplicated, block: B:190:0x038c  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:194:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:202:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:214:0x040b  */
    /* JADX WARN: Code duplicated, block: B:216:0x041b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0426  */
    /* JADX WARN: Code duplicated, block: B:219:0x0432  */
    /* JADX WARN: Code duplicated, block: B:221:0x043b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0444  */
    /* JADX WARN: Code duplicated, block: B:227:0x044c  */
    /* JADX WARN: Code duplicated, block: B:299:0x056b  */
    /* JADX WARN: Code duplicated, block: B:361:0x06cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:362:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:364:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:365:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:366:0x06e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:367:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:369:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:370:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:372:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:373:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:376:0x0708  */
    /* JADX WARN: Code duplicated, block: B:378:0x070e  */
    /* JADX WARN: Code duplicated, block: B:384:0x0743  */
    /* JADX WARN: Code duplicated, block: B:385:0x0746  */
    /* JADX WARN: Code duplicated, block: B:388:0x074e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0751  */
    /* JADX WARN: Code duplicated, block: B:392:0x0779  */
    /* JADX WARN: Code duplicated, block: B:396:0x0782  */
    /* JADX WARN: Code duplicated, block: B:398:0x0785  */
    /* JADX WARN: Code duplicated, block: B:400:0x0788  */
    /* JADX WARN: Code duplicated, block: B:402:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:404:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:407:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:408:0x07af  */
    /* JADX WARN: Code duplicated, block: B:410:0x07b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:414:0x07be  */
    /* JADX WARN: Code duplicated, block: B:417:0x07c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:419:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:429:0x07e9 A[PHI: r1 r5
  0x07e9: PHI (r1v12 boolean) = (r1v11 boolean), (r1v71 boolean) binds: [B:397:0x0783, B:727:0x07e9] A[DONT_GENERATE, DONT_INLINE]
  0x07e9: PHI (r5v3 int[]) = (r5v2 int[]), (r5v37 int[]) binds: [B:397:0x0783, B:727:0x07e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:431:0x07f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:432:0x07f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:439:0x0811  */
    /* JADX WARN: Code duplicated, block: B:441:0x0817  */
    /* JADX WARN: Code duplicated, block: B:443:0x0820  */
    /* JADX WARN: Code duplicated, block: B:444:0x0822  */
    /* JADX WARN: Code duplicated, block: B:446:0x0825  */
    /* JADX WARN: Code duplicated, block: B:448:0x082b  */
    /* JADX WARN: Code duplicated, block: B:451:0x0834 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:493:0x0936  */
    /* JADX WARN: Code duplicated, block: B:495:0x0952  */
    /* JADX WARN: Code duplicated, block: B:497:0x0955  */
    /* JADX WARN: Code duplicated, block: B:501:0x0976  */
    /* JADX WARN: Code duplicated, block: B:509:0x0992  */
    /* JADX WARN: Code duplicated, block: B:531:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:533:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:535:0x09e9 A[LOOP:21: B:534:0x09e7->B:535:0x09e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:537:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a64 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:546:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a6d  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:554:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:562:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:563:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:568:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:579:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:585:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:587:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:611:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:614:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:618:0x0b33 A[LOOP:14: B:617:0x0b31->B:618:0x0b33, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:621:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:623:0x0b42 A[LOOP:15: B:622:0x0b40->B:623:0x0b42, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:626:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:628:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:630:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:632:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:635:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:636:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:639:0x0b88 A[LOOP:16: B:638:0x0b86->B:639:0x0b88, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:643:0x0b9b  */
    /* JADX WARN: Code duplicated, block: B:645:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:647:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:648:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:654:0x0bbe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:659:0x0bd0 A[PHI: r17
  0x0bd0: PHI (r17v5 int) = (r17v3 int), (r17v3 int), (r17v6 int) binds: [B:652:0x0bbb, B:658:0x0bce, B:647:0x0bad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:662:0x0bec  */
    /* JADX WARN: Code duplicated, block: B:665:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:667:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:670:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:672:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:674:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:676:0x0c31  */
    /* JADX WARN: Code duplicated, block: B:679:0x0c50  */
    /* JADX WARN: Code duplicated, block: B:681:0x0c53  */
    /* JADX WARN: Code duplicated, block: B:684:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:690:0x0c79 A[LOOP:17: B:641:0x0b98->B:690:0x0c79, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:727:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x09c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0b22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x0c8a A[EDGE_INSN: B:759:0x0c8a->B:691:0x0c8a BREAK  A[LOOP:17: B:641:0x0b98->B:690:0x0c79], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x0c5d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int iMax2;
        int i6;
        int iO;
        int[] iArr;
        char c;
        int i7;
        int i8;
        kc0 kc0Var;
        ArrayList arrayList;
        nr3 nr3Var;
        int size;
        int iO2;
        int i9;
        boolean zQ;
        boolean z;
        boolean z2;
        int[] iArr2;
        int i10;
        boolean z3;
        ArrayList arrayList2;
        nr3 nr3Var2;
        boolean zP;
        int i11;
        int size2;
        int i12;
        int[] iArr3;
        boolean z4;
        boolean z5;
        int i13;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        int iMax3;
        int iMax4;
        int i17;
        int i18;
        int i19;
        boolean z6;
        int i20;
        boolean z7;
        jc0 jc0Var;
        int i21;
        int iO3;
        int i22;
        boolean z8;
        boolean z9;
        int i23;
        int i24;
        int iO4;
        int i25;
        int size3;
        boolean zS;
        nr3 nr3Var3;
        int i26;
        ConstraintLayout constraintLayout;
        int childCount;
        ArrayList arrayList4;
        int i27;
        int size4;
        int i28;
        jc0 jc0Var2;
        int iH;
        boolean z10;
        up1 up1Var;
        w45 w45Var;
        int iMin;
        int iMin2;
        int i29;
        boolean z11;
        kc0 kc0Var2;
        int i30;
        int i31;
        ArrayList arrayList5;
        int size5;
        int i32;
        boolean z12;
        boolean z13;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z14;
        int size6;
        int i38;
        int size7;
        int i39;
        boolean z15;
        ba5 ba5Var;
        ba5 ba5Var2;
        int i40;
        boolean z16;
        jc0 jc0Var3;
        int i41;
        int[] iArr4;
        boolean z17;
        boolean z18;
        boolean z19;
        Object[] objArr;
        int i42;
        int i43;
        jc0 jc0Var4;
        int i44;
        int i45;
        jc0 jc0Var5;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        jc0 jc0Var6;
        int i51;
        int i52;
        int i53;
        jc0 jc0Var7;
        jc0 jc0Var8;
        mb0 mb0Var;
        int i54;
        float f;
        jc0 jc0Var9;
        int i55;
        int i56;
        float f2;
        int i57;
        int i58;
        jc0 jc0Var10;
        int i59;
        float f3;
        jc0 jc0Var11;
        jc0 jc0Var12;
        int i60;
        jc0 jc0Var13;
        int i61;
        int i62;
        float fAbs;
        int i63;
        ArrayList arrayList6;
        int i64;
        String str;
        int iD;
        jc0 jc0Var14;
        ConstraintLayout constraintLayout2 = this;
        boolean z20 = constraintLayout2.u;
        constraintLayout2.u = z20;
        int i65 = 1;
        int i66 = 0;
        if (!z20) {
            int childCount2 = constraintLayout2.getChildCount();
            for (int i67 = 0; i67 < childCount2; i67++) {
                if (constraintLayout2.getChildAt(i67).isLayoutRequested()) {
                    constraintLayout2.u = true;
                    break;
                }
            }
        }
        int i68 = 4194304;
        boolean z21 = (constraintLayout2.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout2.getLayoutDirection();
        kc0 kc0Var3 = constraintLayout2.p;
        kc0Var3.u0 = z21;
        qp4 qp4Var = kc0Var3.q0;
        xo0 xo0Var = kc0Var3.r0;
        if (constraintLayout2.u) {
            constraintLayout2.u = false;
            int childCount3 = constraintLayout2.getChildCount();
            int i69 = 0;
            while (true) {
                if (i69 >= childCount3) {
                    objArr = false;
                    break;
                } else {
                    if (constraintLayout2.getChildAt(i69).isLayoutRequested()) {
                        objArr = true;
                        break;
                    }
                    i69++;
                }
            }
            if (objArr != false) {
                boolean zIsInEditMode = constraintLayout2.isInEditMode();
                int childCount4 = constraintLayout2.getChildCount();
                for (int i70 = 0; i70 < childCount4; i70++) {
                    jc0 jc0VarG = constraintLayout2.g(constraintLayout2.getChildAt(i70));
                    if (jc0VarG != null) {
                        jc0VarG.A();
                    }
                }
                SparseArray sparseArray = constraintLayout2.n;
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i71 = 0; i71 < childCount4; i71++) {
                        View childAt = constraintLayout2.getChildAt(i71);
                        try {
                            String resourceName = constraintLayout2.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                try {
                                    if (constraintLayout2.z == null) {
                                        constraintLayout2.z = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout2.z.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout2.findViewById(id)) != null && viewFindViewById != constraintLayout2 && viewFindViewById.getParent() == constraintLayout2) {
                                    constraintLayout2.onViewAdded(viewFindViewById);
                                }
                                jc0Var14 = viewFindViewById == constraintLayout2 ? kc0Var3 : viewFindViewById == null ? null : ((mb0) viewFindViewById.getLayoutParams()).p0;
                            }
                            jc0Var14.g0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                        }
                    }
                }
                if (constraintLayout2.y != -1) {
                    for (int i72 = 0; i72 < childCount4; i72++) {
                        constraintLayout2.getChildAt(i72).getId();
                    }
                }
                wb0 wb0Var = constraintLayout2.w;
                if (wb0Var != null) {
                    wb0Var.a(constraintLayout2);
                }
                kc0Var3.p0.clear();
                ArrayList arrayList7 = constraintLayout2.o;
                int size8 = arrayList7.size();
                if (size8 > 0) {
                    int i73 = 0;
                    while (i73 < size8) {
                        kb0 kb0Var = (kb0) arrayList7.get(i73);
                        HashMap map = kb0Var.t;
                        if (kb0Var.isInEditMode()) {
                            kb0Var.setIds(kb0Var.r);
                        }
                        ep epVar = kb0Var.q;
                        if (epVar == null) {
                            arrayList6 = arrayList7;
                            i64 = i65;
                        } else {
                            epVar.q0 = i66;
                            Arrays.fill(epVar.p0, obj);
                            int i74 = i66;
                            while (i74 < kb0Var.o) {
                                int i75 = kb0Var.n[i74];
                                View view = (View) sparseArray.get(i75);
                                if (view == null && (iD = kb0Var.d(constraintLayout2, (str = (String) map.get(Integer.valueOf(i75))))) != 0) {
                                    kb0Var.n[i74] = iD;
                                    map.put(Integer.valueOf(iD), str);
                                    view = (View) sparseArray.get(iD);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    ep epVar2 = kb0Var.q;
                                    jc0 jc0VarG2 = constraintLayout2.g(view2);
                                    epVar2.getClass();
                                    if (jc0VarG2 != epVar2 && jc0VarG2 != null) {
                                        int i76 = epVar2.q0 + 1;
                                        jc0[] jc0VarArr = epVar2.p0;
                                        if (i76 > jc0VarArr.length) {
                                            epVar2.p0 = (jc0[]) Arrays.copyOf(jc0VarArr, jc0VarArr.length * 2);
                                        }
                                        jc0[] jc0VarArr2 = epVar2.p0;
                                        int i77 = epVar2.q0;
                                        jc0VarArr2[i77] = jc0VarG2;
                                        epVar2.q0 = i77 + 1;
                                    }
                                }
                                i74++;
                                arrayList7 = arrayList7;
                                i65 = i65;
                            }
                            arrayList6 = arrayList7;
                            i64 = i65;
                            kb0Var.q.getClass();
                        }
                        i73++;
                        arrayList7 = arrayList6;
                        i65 = i64;
                        i66 = 0;
                        obj = null;
                    }
                }
                int i78 = i65;
                for (int i79 = 0; i79 < childCount4; i79++) {
                    constraintLayout2.getChildAt(i79);
                }
                SparseArray sparseArray2 = constraintLayout2.A;
                sparseArray2.clear();
                sparseArray2.put(0, kc0Var3);
                sparseArray2.put(constraintLayout2.getId(), kc0Var3);
                for (int i80 = 0; i80 < childCount4; i80++) {
                    View childAt2 = constraintLayout2.getChildAt(i80);
                    sparseArray2.put(childAt2.getId(), constraintLayout2.g(childAt2));
                }
                int i81 = 0;
                while (i81 < childCount4) {
                    View childAt3 = constraintLayout2.getChildAt(i81);
                    jc0 jc0VarG3 = constraintLayout2.g(childAt3);
                    if (jc0VarG3 == null) {
                        i42 = childCount4;
                    } else {
                        mb0 mb0Var2 = (mb0) childAt3.getLayoutParams();
                        kc0Var3.p0.add(jc0VarG3);
                        jc0 jc0Var15 = jc0VarG3.S;
                        if (jc0Var15 != null) {
                            ((kc0) jc0Var15).p0.remove(jc0VarG3);
                            jc0VarG3.A();
                        }
                        jc0VarG3.S = kc0Var3;
                        mb0Var2.a();
                        jc0VarG3.f0 = childAt3.getVisibility();
                        jc0VarG3.e0 = childAt3;
                        if (childAt3 instanceof kb0) {
                            boolean z22 = kc0Var3.u0;
                            dp dpVar = (dp) ((kb0) childAt3);
                            int i82 = dpVar.u;
                            dpVar.v = i82;
                            if (!z22) {
                                int i83 = i78;
                                if (i82 == 5) {
                                    dpVar.v = 0;
                                } else if (i82 == 6) {
                                    dpVar.v = i83;
                                }
                            } else if (i82 == 5) {
                                dpVar.v = i78;
                            } else if (i82 == 6) {
                                dpVar.v = 0;
                            }
                            if (jc0VarG3 instanceof ep) {
                                ((ep) jc0VarG3).r0 = dpVar.v;
                            }
                        }
                        if (mb0Var2.d0) {
                            pk1 pk1Var = (pk1) jc0VarG3;
                            int i84 = mb0Var2.m0;
                            int i85 = mb0Var2.n0;
                            float f4 = mb0Var2.o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    pk1Var.p0 = f4;
                                    pk1Var.q0 = -1;
                                    pk1Var.r0 = -1;
                                }
                            } else if (i84 != -1) {
                                if (i84 > -1) {
                                    pk1Var.p0 = -1.0f;
                                    pk1Var.q0 = i84;
                                    pk1Var.r0 = -1;
                                }
                            } else if (i85 != -1 && i85 > -1) {
                                pk1Var.p0 = -1.0f;
                                pk1Var.q0 = -1;
                                pk1Var.r0 = i85;
                            }
                            i42 = childCount4;
                        } else {
                            int i86 = mb0Var2.f0;
                            int i87 = mb0Var2.g0;
                            int i88 = mb0Var2.h0;
                            int i89 = mb0Var2.i0;
                            int i90 = mb0Var2.j0;
                            int i91 = mb0Var2.k0;
                            float f5 = mb0Var2.l0;
                            int i92 = mb0Var2.p;
                            i42 = childCount4;
                            if (i92 != -1) {
                                jc0 jc0Var16 = (jc0) sparseArray2.get(i92);
                                if (jc0Var16 != null) {
                                    float f6 = mb0Var2.r;
                                    jc0VarG3.t(7, 7, mb0Var2.q, 0, jc0Var16);
                                    jc0VarG3.D = f6;
                                }
                                mb0Var = mb0Var2;
                                jc0Var10 = jc0VarG3;
                                i45 = 2;
                                i59 = 3;
                                i46 = 4;
                                i55 = 3;
                                i56 = 4;
                                f2 = 0.0f;
                                constraintLayout2 = this;
                            } else {
                                if (i86 != -1) {
                                    jc0 jc0Var17 = (jc0) sparseArray2.get(i86);
                                    if (jc0Var17 != null) {
                                        i43 = 2;
                                        jc0VarG3.t(2, 2, ((ViewGroup.MarginLayoutParams) mb0Var2).leftMargin, i90, jc0Var17);
                                    } else {
                                        i43 = 2;
                                    }
                                } else {
                                    i43 = 2;
                                    if (i87 != -1 && (jc0Var4 = (jc0) sparseArray2.get(i87)) != null) {
                                        jc0VarG3.t(2, 4, ((ViewGroup.MarginLayoutParams) mb0Var2).leftMargin, i90, jc0Var4);
                                        i44 = 4;
                                    }
                                    if (i88 != -1) {
                                        jc0Var13 = (jc0) sparseArray2.get(i88);
                                        if (jc0Var13 != null) {
                                            int i93 = i43;
                                            jc0VarG3.t(i44, i93, ((ViewGroup.MarginLayoutParams) mb0Var2).rightMargin, i91, jc0Var13);
                                            i45 = i93;
                                        } else {
                                            i45 = i43;
                                        }
                                    } else {
                                        i45 = i43;
                                        if (i89 != -1 && (jc0Var5 = (jc0) sparseArray2.get(i89)) != null) {
                                            jc0VarG3.t(i44, i44, ((ViewGroup.MarginLayoutParams) mb0Var2).rightMargin, i91, jc0Var5);
                                        }
                                    }
                                    i46 = i44;
                                    i47 = mb0Var2.i;
                                    if (i47 != -1) {
                                        jc0Var12 = (jc0) sparseArray2.get(i47);
                                        if (jc0Var12 != null) {
                                            jc0VarG3.t(3, 3, ((ViewGroup.MarginLayoutParams) mb0Var2).topMargin, mb0Var2.x, jc0Var12);
                                            i60 = 3;
                                        } else {
                                            i60 = 3;
                                        }
                                        i50 = i60;
                                        i49 = -1;
                                    } else {
                                        i48 = mb0Var2.j;
                                        i49 = -1;
                                        if (i48 != -1 || (jc0Var6 = (jc0) sparseArray2.get(i48)) == null) {
                                            i50 = 3;
                                        } else {
                                            jc0VarG3.t(3, 5, ((ViewGroup.MarginLayoutParams) mb0Var2).topMargin, mb0Var2.x, jc0Var6);
                                            i50 = 3;
                                            i51 = 5;
                                            jc0VarG3 = jc0VarG3;
                                        }
                                        i52 = mb0Var2.k;
                                        if (i52 != i49) {
                                            jc0Var11 = (jc0) sparseArray2.get(i52);
                                            if (jc0Var11 != null) {
                                                jc0Var8 = jc0VarG3;
                                                jc0Var8.t(i51, i50, ((ViewGroup.MarginLayoutParams) mb0Var2).bottomMargin, mb0Var2.z, jc0Var11);
                                                jc0VarG3 = jc0Var8;
                                            }
                                        } else {
                                            i53 = mb0Var2.l;
                                            if (i53 == i49 && (jc0Var7 = (jc0) sparseArray2.get(i53)) != null) {
                                                jc0Var8 = jc0VarG3;
                                                jc0Var8.t(i51, i51, ((ViewGroup.MarginLayoutParams) mb0Var2).bottomMargin, mb0Var2.z, jc0Var7);
                                                jc0VarG3 = jc0Var8;
                                            }
                                        }
                                        mb0Var = mb0Var2;
                                        i54 = mb0Var.m;
                                        if (i54 != -1) {
                                            f = f5;
                                            jc0Var10 = jc0VarG3;
                                            i55 = 3;
                                            i56 = 4;
                                            f2 = 0.0f;
                                            constraintLayout2 = this;
                                            constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i54, 6);
                                        } else {
                                            f = f5;
                                            jc0Var9 = jc0VarG3;
                                            i55 = 3;
                                            i56 = 4;
                                            f2 = 0.0f;
                                            i57 = mb0Var.n;
                                            if (i57 != -1) {
                                                constraintLayout2 = this;
                                                jc0Var10 = jc0Var9;
                                                int i94 = i50;
                                                constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i57, i94);
                                                i59 = i94;
                                            } else {
                                                i58 = mb0Var.o;
                                                constraintLayout2 = this;
                                                jc0Var10 = jc0Var9;
                                                if (i58 != -1) {
                                                    i59 = i50;
                                                    constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i58, 5);
                                                }
                                            }
                                            if (f >= f2) {
                                                jc0Var10.c0 = f;
                                            }
                                            f3 = mb0Var.F;
                                            if (f3 >= f2) {
                                                jc0Var10.d0 = f3;
                                            }
                                        }
                                        i59 = i50;
                                        if (f >= f2) {
                                            jc0Var10.c0 = f;
                                        }
                                        f3 = mb0Var.F;
                                        if (f3 >= f2) {
                                            jc0Var10.d0 = f3;
                                        }
                                    }
                                    i51 = 5;
                                    i52 = mb0Var2.k;
                                    if (i52 != i49) {
                                        jc0Var11 = (jc0) sparseArray2.get(i52);
                                        if (jc0Var11 != null) {
                                            jc0Var8 = jc0VarG3;
                                            jc0Var8.t(i51, i50, ((ViewGroup.MarginLayoutParams) mb0Var2).bottomMargin, mb0Var2.z, jc0Var11);
                                            jc0VarG3 = jc0Var8;
                                        }
                                    } else {
                                        i53 = mb0Var2.l;
                                        if (i53 == i49) {
                                        }
                                    }
                                    mb0Var = mb0Var2;
                                    i54 = mb0Var.m;
                                    if (i54 != -1) {
                                        f = f5;
                                        jc0Var10 = jc0VarG3;
                                        i55 = 3;
                                        i56 = 4;
                                        f2 = 0.0f;
                                        constraintLayout2 = this;
                                        constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i54, 6);
                                    } else {
                                        f = f5;
                                        jc0Var9 = jc0VarG3;
                                        i55 = 3;
                                        i56 = 4;
                                        f2 = 0.0f;
                                        i57 = mb0Var.n;
                                        if (i57 != -1) {
                                            constraintLayout2 = this;
                                            jc0Var10 = jc0Var9;
                                            int i95 = i50;
                                            constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i57, i95);
                                            i59 = i95;
                                        } else {
                                            i58 = mb0Var.o;
                                            constraintLayout2 = this;
                                            jc0Var10 = jc0Var9;
                                            if (i58 != -1) {
                                                i59 = i50;
                                                constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i58, 5);
                                            }
                                        }
                                        if (f >= f2) {
                                            jc0Var10.c0 = f;
                                        }
                                        f3 = mb0Var.F;
                                        if (f3 >= f2) {
                                            jc0Var10.d0 = f3;
                                        }
                                    }
                                    i59 = i50;
                                    if (f >= f2) {
                                        jc0Var10.c0 = f;
                                    }
                                    f3 = mb0Var.F;
                                    if (f3 >= f2) {
                                        jc0Var10.d0 = f3;
                                    }
                                }
                                i44 = 4;
                                if (i88 != -1) {
                                    jc0Var13 = (jc0) sparseArray2.get(i88);
                                    if (jc0Var13 != null) {
                                        int i96 = i43;
                                        jc0VarG3.t(i44, i96, ((ViewGroup.MarginLayoutParams) mb0Var2).rightMargin, i91, jc0Var13);
                                        i45 = i96;
                                    } else {
                                        i45 = i43;
                                    }
                                } else {
                                    i45 = i43;
                                    if (i89 != -1) {
                                        jc0VarG3.t(i44, i44, ((ViewGroup.MarginLayoutParams) mb0Var2).rightMargin, i91, jc0Var5);
                                    }
                                }
                                i46 = i44;
                                i47 = mb0Var2.i;
                                if (i47 != -1) {
                                    jc0Var12 = (jc0) sparseArray2.get(i47);
                                    if (jc0Var12 != null) {
                                        jc0VarG3.t(3, 3, ((ViewGroup.MarginLayoutParams) mb0Var2).topMargin, mb0Var2.x, jc0Var12);
                                        i60 = 3;
                                    } else {
                                        i60 = 3;
                                    }
                                    i50 = i60;
                                    i49 = -1;
                                } else {
                                    i48 = mb0Var2.j;
                                    i49 = -1;
                                    if (i48 != -1) {
                                    }
                                    i50 = 3;
                                }
                                i51 = 5;
                                i52 = mb0Var2.k;
                                if (i52 != i49) {
                                    jc0Var11 = (jc0) sparseArray2.get(i52);
                                    if (jc0Var11 != null) {
                                        jc0Var8 = jc0VarG3;
                                        jc0Var8.t(i51, i50, ((ViewGroup.MarginLayoutParams) mb0Var2).bottomMargin, mb0Var2.z, jc0Var11);
                                        jc0VarG3 = jc0Var8;
                                    }
                                } else {
                                    i53 = mb0Var2.l;
                                    if (i53 == i49) {
                                    }
                                }
                                mb0Var = mb0Var2;
                                i54 = mb0Var.m;
                                if (i54 != -1) {
                                    f = f5;
                                    jc0Var10 = jc0VarG3;
                                    i55 = 3;
                                    i56 = 4;
                                    f2 = 0.0f;
                                    constraintLayout2 = this;
                                    constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i54, 6);
                                } else {
                                    f = f5;
                                    jc0Var9 = jc0VarG3;
                                    i55 = 3;
                                    i56 = 4;
                                    f2 = 0.0f;
                                    i57 = mb0Var.n;
                                    if (i57 != -1) {
                                        constraintLayout2 = this;
                                        jc0Var10 = jc0Var9;
                                        int i97 = i50;
                                        constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i57, i97);
                                        i59 = i97;
                                    } else {
                                        i58 = mb0Var.o;
                                        constraintLayout2 = this;
                                        jc0Var10 = jc0Var9;
                                        if (i58 != -1) {
                                            i59 = i50;
                                            constraintLayout2.k(jc0Var10, mb0Var, sparseArray2, i58, 5);
                                        }
                                    }
                                    if (f >= f2) {
                                        jc0Var10.c0 = f;
                                    }
                                    f3 = mb0Var.F;
                                    if (f3 >= f2) {
                                        jc0Var10.d0 = f3;
                                    }
                                }
                                i59 = i50;
                                if (f >= f2) {
                                    jc0Var10.c0 = f;
                                }
                                f3 = mb0Var.F;
                                if (f3 >= f2) {
                                    jc0Var10.d0 = f3;
                                }
                            }
                            if (zIsInEditMode && ((i63 = mb0Var.T) != -1 || mb0Var.U != -1)) {
                                int i98 = mb0Var.U;
                                jc0Var10.X = i63;
                                jc0Var10.Y = i98;
                            }
                            if (mb0Var.a0) {
                                jc0Var10.I(1);
                                jc0Var10.K(((ViewGroup.MarginLayoutParams) mb0Var).width);
                                if (((ViewGroup.MarginLayoutParams) mb0Var).width == -2) {
                                    jc0Var10.I(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) mb0Var).width == -1) {
                                if (mb0Var.W) {
                                    jc0Var10.I(i55);
                                } else {
                                    jc0Var10.I(i56);
                                }
                                jc0Var10.g(i45).g = ((ViewGroup.MarginLayoutParams) mb0Var).leftMargin;
                                jc0Var10.g(i46).g = ((ViewGroup.MarginLayoutParams) mb0Var).rightMargin;
                            } else {
                                jc0Var10.I(i55);
                                jc0Var10.K(0);
                            }
                            if (mb0Var.b0) {
                                jc0Var10.J(1);
                                jc0Var10.H(((ViewGroup.MarginLayoutParams) mb0Var).height);
                                if (((ViewGroup.MarginLayoutParams) mb0Var).height == -2) {
                                    jc0Var10.J(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) mb0Var).height == -1) {
                                if (mb0Var.X) {
                                    jc0Var10.J(i55);
                                } else {
                                    jc0Var10.J(i56);
                                }
                                jc0Var10.g(i59).g = ((ViewGroup.MarginLayoutParams) mb0Var).topMargin;
                                jc0Var10.g(5).g = ((ViewGroup.MarginLayoutParams) mb0Var).bottomMargin;
                            } else {
                                jc0Var10.J(i55);
                                jc0Var10.H(0);
                            }
                            String str2 = mb0Var.G;
                            if (str2 == null || str2.length() == 0) {
                                jc0Var10.V = f2;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i61 = 0;
                                    i62 = -1;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i62 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i61 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i61);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = f2;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i61, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = f2;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= f2 || f8 <= f2) {
                                                fAbs = f2;
                                            } else {
                                                fAbs = i62 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > f2) {
                                    jc0Var10.V = fAbs;
                                    jc0Var10.W = i62;
                                }
                            }
                            float f9 = mb0Var.H;
                            float[] fArr = jc0Var10.j0;
                            fArr[0] = f9;
                            fArr[1] = mb0Var.I;
                            jc0Var10.h0 = mb0Var.J;
                            jc0Var10.i0 = mb0Var.K;
                            int i99 = mb0Var.Z;
                            if (i99 >= 0 && i99 <= i55) {
                                jc0Var10.q = i99;
                            }
                            int i100 = mb0Var.L;
                            int i101 = mb0Var.N;
                            int i102 = mb0Var.P;
                            float f10 = mb0Var.R;
                            jc0Var10.r = i100;
                            jc0Var10.u = i101;
                            if (i102 == Integer.MAX_VALUE) {
                                i102 = 0;
                            }
                            jc0Var10.v = i102;
                            jc0Var10.w = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i100 == 0) {
                                jc0Var10.r = 2;
                            }
                            int i103 = mb0Var.M;
                            int i104 = mb0Var.O;
                            int i105 = mb0Var.Q;
                            float f11 = mb0Var.S;
                            jc0Var10.s = i103;
                            jc0Var10.x = i104;
                            if (i105 == Integer.MAX_VALUE) {
                                i105 = 0;
                            }
                            jc0Var10.y = i105;
                            jc0Var10.z = f11;
                            if (f11 > 0.0f && f11 < 1.0f && i103 == 0) {
                                jc0Var10.s = 2;
                            }
                        }
                    }
                    i81++;
                    childCount4 = i42;
                    i78 = 1;
                }
            }
            if (objArr != false) {
                qp4Var.q(kc0Var3);
            }
        } else {
            i68 = 4194304;
        }
        kc0Var3.v0.getClass();
        int i106 = constraintLayout2.v;
        int mode = View.MeasureSpec.getMode(i);
        int size9 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size10 = View.MeasureSpec.getSize(i2);
        int iMax5 = Math.max(0, constraintLayout2.getPaddingTop());
        int iMax6 = Math.max(0, constraintLayout2.getPaddingBottom());
        int i107 = iMax5 + iMax6;
        int paddingWidth = constraintLayout2.getPaddingWidth();
        nr3 nr3Var4 = constraintLayout2.B;
        nr3Var4.a = iMax5;
        nr3Var4.b = iMax6;
        nr3Var4.c = paddingWidth;
        nr3Var4.d = i107;
        nr3Var4.e = i;
        nr3Var4.f = i2;
        int iMax7 = Math.max(0, constraintLayout2.getPaddingStart());
        int iMax8 = Math.max(0, constraintLayout2.getPaddingEnd());
        int iMax9 = (iMax7 > 0 || iMax8 > 0) ? ((constraintLayout2.getContext().getApplicationInfo().flags & i68) == 0 || 1 != constraintLayout2.getLayoutDirection()) ? iMax7 : iMax8 : Math.max(0, constraintLayout2.getPaddingLeft());
        int i108 = size9 - paddingWidth;
        int i109 = size10 - i107;
        int i110 = nr3Var4.d;
        int i111 = nr3Var4.c;
        int childCount5 = constraintLayout2.getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount5 == 0) {
                    i3 = i110;
                    iMax = Math.max(0, constraintLayout2.q);
                } else {
                    i3 = i110;
                    iMax = 0;
                }
                i4 = 2;
                i5 = Integer.MIN_VALUE;
            } else if (mode != 1073741824) {
                i3 = i110;
                i111 = i111;
                i4 = 1;
                iMax = 0;
                i5 = Integer.MIN_VALUE;
            } else {
                int iMin3 = Math.min(constraintLayout2.s - i111, i108);
                i3 = i110;
                i111 = i111;
                i5 = Integer.MIN_VALUE;
                iMax = iMin3;
                i4 = 1;
            }
            if (mode2 != i5) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        i6 = 1;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(constraintLayout2.t - i3, i109);
                        i6 = 1;
                    }
                } else if (childCount5 == 0) {
                    iMax2 = Math.max(0, constraintLayout2.r);
                } else {
                    iMax2 = 0;
                }
                iO = kc0Var3.o();
                iArr = kc0Var3.C;
                if (iMax == iO || iMax2 != kc0Var3.i()) {
                    xo0Var.c = true;
                    c = 1;
                } else {
                    c = 1;
                }
                kc0Var3.X = 0;
                kc0Var3.Y = 0;
                iArr[0] = constraintLayout2.s - i111;
                iArr[c] = constraintLayout2.t - i3;
                kc0Var3.a0 = 0;
                kc0Var3.b0 = 0;
                kc0Var3.I(i4);
                kc0Var3.K(iMax);
                kc0Var3.J(i6);
                kc0Var3.H(iMax2);
                i7 = constraintLayout2.q - i111;
                if (i7 < 0) {
                    kc0Var3.a0 = 0;
                } else {
                    kc0Var3.a0 = i7;
                }
                i8 = constraintLayout2.r - i3;
                if (i8 < 0) {
                    kc0Var3.b0 = 0;
                } else {
                    kc0Var3.b0 = i8;
                }
                kc0Var3.w0 = iMax9;
                kc0Var3.x0 = iMax5;
                kc0Var = (kc0) qp4Var.c;
                arrayList = (ArrayList) qp4Var.a;
                nr3Var = kc0Var3.t0;
                size = kc0Var3.p0.size();
                iO2 = kc0Var3.o();
                i9 = kc0Var3.i();
                zQ = uo.q(i106, 128);
                if (!zQ || uo.q(i106, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i40 = 0;
                    while (true) {
                        if (i40 < size) {
                            z16 = z;
                            jc0Var3 = (jc0) kc0Var3.p0.get(i40);
                            i41 = i40;
                            iArr4 = jc0Var3.o0;
                            iArr2 = iArr;
                            if (iArr4[0] == 3) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (iArr4[1] == 3) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z17 || !z18 || jc0Var3.V <= 0.0f) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            if ((jc0Var3.v() || !z19) && !((jc0Var3.w() && z19) || jc0Var3.v() || jc0Var3.w())) {
                                i40 = i41 + 1;
                                z = z16;
                                iArr = iArr2;
                            } else {
                                i10 = 1073741824;
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                            iArr2 = iArr;
                            i10 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    iArr2 = iArr;
                    i10 = 1073741824;
                }
                z3 = z2 & ((mode != i10 && mode2 == i10) || zQ);
                if (z3) {
                    iMin = Math.min(iArr2[0], i108);
                    iMin2 = Math.min(iArr2[1], i109);
                    i29 = 1073741824;
                    if (mode == 1073741824) {
                        if (kc0Var3.o() != iMin) {
                            kc0Var3.K(iMin);
                            z11 = true;
                            xo0Var.b = true;
                        } else {
                            z11 = true;
                        }
                        i29 = 1073741824;
                    } else {
                        z11 = true;
                    }
                    if (mode2 == i29) {
                        if (kc0Var3.i() != iMin2) {
                            kc0Var3.H(iMin2);
                            xo0Var.b = z11;
                        }
                        i29 = 1073741824;
                    }
                    if (mode == i29 || mode2 != i29) {
                        z3 = z3;
                        arrayList2 = arrayList;
                        nr3Var2 = nr3Var;
                        size = size;
                        kc0Var2 = (kc0) xo0Var.d;
                        if (xo0Var.b) {
                            arrayList5 = kc0Var2.p0;
                            size5 = arrayList5.size();
                            i32 = 0;
                            while (i32 < size5) {
                                Object obj2 = arrayList5.get(i32);
                                i32++;
                                jc0 jc0Var18 = (jc0) obj2;
                                jc0Var18.f();
                                jc0Var18.a = false;
                                up1 up1Var2 = jc0Var18.d;
                                ArrayList arrayList8 = arrayList5;
                                up1Var2.e.j = false;
                                up1Var2.g = false;
                                up1Var2.n();
                                w45 w45Var2 = jc0Var18.e;
                                w45Var2.e.j = false;
                                w45Var2.g = false;
                                w45Var2.m();
                                arrayList5 = arrayList8;
                            }
                            i30 = 0;
                            kc0Var2.f();
                            kc0Var2.a = false;
                            up1 up1Var3 = kc0Var2.d;
                            up1Var3.e.j = false;
                            up1Var3.g = false;
                            up1Var3.n();
                            w45 w45Var3 = kc0Var2.e;
                            w45Var3.e.j = false;
                            w45Var3.g = false;
                            w45Var3.m();
                            xo0Var.c();
                        } else {
                            i30 = 0;
                        }
                        xo0Var.b((kc0) xo0Var.e);
                        kc0Var2.X = i30;
                        kc0Var2.Y = i30;
                        kc0Var2.d.h.d(i30);
                        kc0Var2.e.h.d(i30);
                        i31 = 1073741824;
                        if (mode == 1073741824) {
                            zP = kc0Var3.P(i30, zQ);
                            i11 = 1;
                        } else {
                            zP = true;
                            i11 = 0;
                        }
                        if (mode2 == 1073741824) {
                            zP &= kc0Var3.P(1, zQ);
                            i11++;
                        }
                    } else {
                        ArrayList arrayList9 = (ArrayList) xo0Var.f;
                        kc0 kc0Var4 = (kc0) xo0Var.d;
                        if (xo0Var.b || xo0Var.c) {
                            ArrayList arrayList10 = kc0Var4.p0;
                            int size11 = arrayList10.size();
                            int i112 = 0;
                            while (i112 < size11) {
                                Object obj3 = arrayList10.get(i112);
                                i112++;
                                int i113 = size11;
                                jc0 jc0Var19 = (jc0) obj3;
                                jc0Var19.f();
                                jc0Var19.a = false;
                                jc0Var19.d.n();
                                jc0Var19.e.m();
                                arrayList10 = arrayList10;
                                size11 = i113;
                            }
                            kc0Var4.f();
                            i33 = 0;
                            kc0Var4.a = false;
                            kc0Var4.d.n();
                            kc0Var4.e.m();
                            xo0Var.c = false;
                        } else {
                            i33 = 0;
                        }
                        xo0Var.b((kc0) xo0Var.e);
                        kc0Var4.X = i33;
                        int[] iArr5 = kc0Var4.o0;
                        kc0Var4.Y = i33;
                        int iH2 = kc0Var4.h(i33);
                        int iH3 = kc0Var4.h(1);
                        if (xo0Var.b) {
                            xo0Var.c();
                        }
                        int iP = kc0Var4.p();
                        nr3Var2 = nr3Var;
                        int iQ = kc0Var4.q();
                        arrayList2 = arrayList;
                        kc0Var4.d.h.d(iP);
                        kc0Var4.e.h.d(iQ);
                        xo0Var.g();
                        if (iH2 == 2 || iH3 == 2) {
                            if (zQ) {
                                int size12 = arrayList9.size();
                                i34 = iQ;
                                int i114 = 0;
                                while (i114 < size12) {
                                    Object obj4 = arrayList9.get(i114);
                                    i114++;
                                    if (!((ba5) obj4).k()) {
                                        zQ = false;
                                        break;
                                    }
                                }
                            } else {
                                i34 = iQ;
                            }
                            if (zQ && iH2 == 2) {
                                kc0Var4.I(1);
                                kc0Var4.K(xo0Var.d(kc0Var4, 0));
                                kc0Var4.d.e.d(kc0Var4.o());
                            }
                            if (zQ && iH3 == 2) {
                                i35 = 1;
                                kc0Var4.J(1);
                                kc0Var4.H(xo0Var.d(kc0Var4, 1));
                                kc0Var4.e.e.d(kc0Var4.i());
                            }
                            i36 = iArr5[0];
                            if (i36 != i35 || i36 == 4) {
                                int iO5 = kc0Var4.o() + iP;
                                kc0Var4.d.i.d(iO5);
                                kc0Var4.d.e.d(iO5 - iP);
                                xo0Var.g();
                                i37 = iArr5[1];
                                if (i37 != 1 || i37 == 4) {
                                    int i115 = kc0Var4.i() + i34;
                                    kc0Var4.e.i.d(i115);
                                    kc0Var4.e.e.d(i115 - i34);
                                }
                                xo0Var.g();
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            size6 = arrayList9.size();
                            i38 = 0;
                            while (i38 < size6) {
                                Object obj5 = arrayList9.get(i38);
                                i38++;
                                ba5Var2 = (ba5) obj5;
                                if (ba5Var2.b == kc0Var4 || ba5Var2.g) {
                                    ba5Var2.e();
                                }
                            }
                            size7 = arrayList9.size();
                            i39 = 0;
                            while (true) {
                                if (i39 < size7) {
                                    z15 = true;
                                    break;
                                }
                                Object obj6 = arrayList9.get(i39);
                                i39++;
                                ba5Var = (ba5) obj6;
                                if (!z14 || ba5Var.b != kc0Var4) {
                                    if (ba5Var.h.j || ((!ba5Var.i.j && !(ba5Var instanceof qk1)) || (!ba5Var.e.j && !(ba5Var instanceof q00) && !(ba5Var instanceof qk1)))) {
                                        z15 = false;
                                        break;
                                    }
                                }
                            }
                            kc0Var4.I(iH2);
                            kc0Var4.J(iH3);
                            zP = z15;
                            i11 = 2;
                            i31 = 1073741824;
                        } else {
                            i34 = iQ;
                        }
                        i35 = 1;
                        i36 = iArr5[0];
                        if (i36 != i35) {
                            int iO6 = kc0Var4.o() + iP;
                            kc0Var4.d.i.d(iO6);
                            kc0Var4.d.e.d(iO6 - iP);
                            xo0Var.g();
                            i37 = iArr5[1];
                            if (i37 != 1) {
                                int i116 = kc0Var4.i() + i34;
                                kc0Var4.e.i.d(i116);
                                kc0Var4.e.e.d(i116 - i34);
                            } else {
                                int i117 = kc0Var4.i() + i34;
                                kc0Var4.e.i.d(i117);
                                kc0Var4.e.e.d(i117 - i34);
                            }
                            xo0Var.g();
                            z14 = true;
                        } else {
                            int iO7 = kc0Var4.o() + iP;
                            kc0Var4.d.i.d(iO7);
                            kc0Var4.d.e.d(iO7 - iP);
                            xo0Var.g();
                            i37 = iArr5[1];
                            if (i37 != 1) {
                                int i118 = kc0Var4.i() + i34;
                                kc0Var4.e.i.d(i118);
                                kc0Var4.e.e.d(i118 - i34);
                            } else {
                                int i119 = kc0Var4.i() + i34;
                                kc0Var4.e.i.d(i119);
                                kc0Var4.e.e.d(i119 - i34);
                            }
                            xo0Var.g();
                            z14 = true;
                        }
                        size6 = arrayList9.size();
                        i38 = 0;
                        while (i38 < size6) {
                            Object obj7 = arrayList9.get(i38);
                            i38++;
                            ba5Var2 = (ba5) obj7;
                            if (ba5Var2.b == kc0Var4) {
                            }
                            ba5Var2.e();
                        }
                        size7 = arrayList9.size();
                        i39 = 0;
                        while (true) {
                            if (i39 < size7) {
                                z15 = true;
                                break;
                            }
                            Object obj8 = arrayList9.get(i39);
                            i39++;
                            ba5Var = (ba5) obj8;
                            if (!z14) {
                            }
                            if (ba5Var.h.j) {
                            }
                            z15 = false;
                            break;
                        }
                        kc0Var4.I(iH2);
                        kc0Var4.J(iH3);
                        zP = z15;
                        i11 = 2;
                        i31 = 1073741824;
                    }
                    if (zP) {
                        if (mode == i31) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (mode2 == i31) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        kc0Var3.L(z12, z13);
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    nr3Var2 = nr3Var;
                    size = size;
                    zP = false;
                    i11 = 0;
                }
                if (zP || i11 != 2) {
                    int i120 = kc0Var3.C0;
                    if (size > 0) {
                        size3 = kc0Var3.p0.size();
                        zS = kc0Var3.S(64);
                        nr3Var3 = kc0Var3.t0;
                        for (i26 = 0; i26 < size3; i26++) {
                            jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                            if ((jc0Var2 instanceof pk1) && !(jc0Var2 instanceof ep)) {
                                jc0Var2.getClass();
                                if (zS || (up1Var = jc0Var2.d) == null || (w45Var = jc0Var2.e) == null || !up1Var.e.j || !w45Var.e.j) {
                                    iH = jc0Var2.h(0);
                                    int iH4 = jc0Var2.h(1);
                                    if (iH == 3 || jc0Var2.r == 1 || iH4 != 3 || jc0Var2.s == 1) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10 && kc0Var3.S(1)) {
                                        if (iH == 3 && jc0Var2.r == 0 && iH4 != 3 && !jc0Var2.v()) {
                                            z10 = true;
                                        }
                                        if (iH4 == 3 && jc0Var2.s == 0 && iH != 3 && !jc0Var2.v()) {
                                            z10 = true;
                                        }
                                        if (iH == 3 || iH4 == 3) {
                                            if (jc0Var2.V > 0.0f) {
                                                z10 = true;
                                            }
                                        }
                                        if (z10) {
                                            qp4Var.k(0, jc0Var2, nr3Var3);
                                        }
                                    }
                                    if (z10) {
                                        qp4Var.k(0, jc0Var2, nr3Var3);
                                    }
                                }
                            }
                        }
                        constraintLayout = (ConstraintLayout) nr3Var3.g;
                        childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.o;
                        for (i27 = 0; i27 < childCount; i27++) {
                            constraintLayout.getChildAt(i27);
                        }
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            for (i28 = 0; i28 < size4; i28++) {
                                ((kb0) arrayList4.get(i28)).getClass();
                            }
                        }
                    }
                    qp4Var.q(kc0Var3);
                    size2 = arrayList2.size();
                    i12 = 0;
                    if (size > 0) {
                        qp4Var.p(kc0Var3, 0, iO2, i9);
                    }
                    if (size2 > 0) {
                        iArr3 = kc0Var3.o0;
                        if (iArr3[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr3[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iMax10 = Math.max(kc0Var3.o(), kc0Var.a0);
                        int iMax11 = Math.max(kc0Var3.i(), kc0Var.b0);
                        for (i13 = 0; i13 < size2; i13++) {
                        }
                        arrayList3 = arrayList2;
                        i14 = iMax10;
                        i15 = iMax11;
                        i16 = 0;
                        while (i16 < 2) {
                            iMax3 = i15;
                            iMax4 = i14;
                            i17 = i12;
                            i18 = i17;
                            while (i17 < size2) {
                                jc0Var = (jc0) arrayList3.get(i17);
                                if ((jc0Var instanceof ep) && !(jc0Var instanceof pk1)) {
                                    i21 = size2;
                                    if (jc0Var.f0 == 8 && (!z3 || !jc0Var.d.e.j || !jc0Var.e.e.j)) {
                                        iO3 = jc0Var.o();
                                        i22 = jc0Var.i();
                                        z8 = z5;
                                        int i121 = jc0Var.Z;
                                        z9 = z4;
                                        int i122 = i16 == 1 ? 2 : 1;
                                        i23 = i16;
                                        nr3 nr3Var5 = nr3Var2;
                                        i24 = (qp4Var.k(i122, jc0Var, nr3Var5) ? 1 : 0) | i18;
                                        iO4 = jc0Var.o();
                                        nr3Var2 = nr3Var5;
                                        i25 = jc0Var.i();
                                        if (iO4 != iO3) {
                                            jc0Var.K(iO4);
                                            if (!z9 && jc0Var.p() + jc0Var.T > iMax4) {
                                                iMax4 = Math.max(iMax4, jc0Var.g(4).d() + jc0Var.p() + jc0Var.T);
                                            }
                                            i24 = 1;
                                        }
                                        if (i25 != i22) {
                                            jc0Var.H(i25);
                                            if (!z8 && jc0Var.q() + jc0Var.U > iMax3) {
                                                iMax3 = Math.max(iMax3, jc0Var.g(5).d() + jc0Var.q() + jc0Var.U);
                                            }
                                            i24 = 1;
                                        }
                                        if (!jc0Var.E && i121 != jc0Var.Z) {
                                            i24 = 1;
                                        }
                                    }
                                    i17++;
                                    i18 = i24;
                                    size2 = i21;
                                    z5 = z8;
                                    z4 = z9;
                                    i16 = i23;
                                } else {
                                    i21 = size2;
                                }
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                                i17++;
                                i18 = i24;
                                size2 = i21;
                                z5 = z8;
                                z4 = z9;
                                i16 = i23;
                            }
                            i19 = size2;
                            z6 = z5;
                            i20 = i16;
                            z7 = z4;
                            if (i18 == 0) {
                                break;
                            }
                            int i123 = i20 + 1;
                            qp4Var.p(kc0Var3, i123, iO2, i9);
                            i16 = i123;
                            i15 = iMax3;
                            i14 = iMax4;
                            size2 = i19;
                            z5 = z6;
                            z4 = z7;
                            i12 = 0;
                        }
                    }
                    kc0Var3.C0 = i120;
                    eb2.q = kc0Var3.S(512);
                }
                j(i, i2, kc0Var3.o(), kc0Var3.i(), kc0Var3.D0, kc0Var3.E0);
            }
            if (childCount5 == 0) {
                iMax2 = Math.max(0, constraintLayout2.r);
            } else {
                iMax2 = i109;
            }
            i6 = 2;
            iO = kc0Var3.o();
            iArr = kc0Var3.C;
            if (iMax == iO) {
                xo0Var.c = true;
                c = 1;
            } else {
                xo0Var.c = true;
                c = 1;
            }
            kc0Var3.X = 0;
            kc0Var3.Y = 0;
            iArr[0] = constraintLayout2.s - i111;
            iArr[c] = constraintLayout2.t - i3;
            kc0Var3.a0 = 0;
            kc0Var3.b0 = 0;
            kc0Var3.I(i4);
            kc0Var3.K(iMax);
            kc0Var3.J(i6);
            kc0Var3.H(iMax2);
            i7 = constraintLayout2.q - i111;
            if (i7 < 0) {
                kc0Var3.a0 = 0;
            } else {
                kc0Var3.a0 = i7;
            }
            i8 = constraintLayout2.r - i3;
            if (i8 < 0) {
                kc0Var3.b0 = 0;
            } else {
                kc0Var3.b0 = i8;
            }
            kc0Var3.w0 = iMax9;
            kc0Var3.x0 = iMax5;
            kc0Var = (kc0) qp4Var.c;
            arrayList = (ArrayList) qp4Var.a;
            nr3Var = kc0Var3.t0;
            size = kc0Var3.p0.size();
            iO2 = kc0Var3.o();
            i9 = kc0Var3.i();
            zQ = uo.q(i106, 128);
            if (zQ) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i40 = 0;
                while (true) {
                    if (i40 < size) {
                        z16 = z;
                        jc0Var3 = (jc0) kc0Var3.p0.get(i40);
                        i41 = i40;
                        iArr4 = jc0Var3.o0;
                        iArr2 = iArr;
                        if (iArr4[0] == 3) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (iArr4[1] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z17) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (jc0Var3.v()) {
                            i40 = i41 + 1;
                            z = z16;
                            iArr = iArr2;
                        } else {
                            i40 = i41 + 1;
                            z = z16;
                            iArr = iArr2;
                        }
                        i10 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        iArr2 = iArr;
                        i10 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                iArr2 = iArr;
                i10 = 1073741824;
            }
            z3 = z2 & ((mode != i10 && mode2 == i10) || zQ);
            if (z3) {
                iMin = Math.min(iArr2[0], i108);
                iMin2 = Math.min(iArr2[1], i109);
                i29 = 1073741824;
                if (mode == 1073741824) {
                    if (kc0Var3.o() != iMin) {
                        kc0Var3.K(iMin);
                        z11 = true;
                        xo0Var.b = true;
                    } else {
                        z11 = true;
                    }
                    i29 = 1073741824;
                } else {
                    z11 = true;
                }
                if (mode2 == i29) {
                    if (kc0Var3.i() != iMin2) {
                        kc0Var3.H(iMin2);
                        xo0Var.b = z11;
                    }
                    i29 = 1073741824;
                }
                if (mode == i29) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    nr3Var2 = nr3Var;
                    size = size;
                    kc0Var2 = (kc0) xo0Var.d;
                    if (xo0Var.b) {
                        arrayList5 = kc0Var2.p0;
                        size5 = arrayList5.size();
                        i32 = 0;
                        while (i32 < size5) {
                            Object obj9 = arrayList5.get(i32);
                            i32++;
                            jc0 jc0Var110 = (jc0) obj9;
                            jc0Var110.f();
                            jc0Var110.a = false;
                            up1 up1Var4 = jc0Var110.d;
                            ArrayList arrayList11 = arrayList5;
                            up1Var4.e.j = false;
                            up1Var4.g = false;
                            up1Var4.n();
                            w45 w45Var4 = jc0Var110.e;
                            w45Var4.e.j = false;
                            w45Var4.g = false;
                            w45Var4.m();
                            arrayList5 = arrayList11;
                        }
                        i30 = 0;
                        kc0Var2.f();
                        kc0Var2.a = false;
                        up1 up1Var5 = kc0Var2.d;
                        up1Var5.e.j = false;
                        up1Var5.g = false;
                        up1Var5.n();
                        w45 w45Var5 = kc0Var2.e;
                        w45Var5.e.j = false;
                        w45Var5.g = false;
                        w45Var5.m();
                        xo0Var.c();
                    } else {
                        i30 = 0;
                    }
                    xo0Var.b((kc0) xo0Var.e);
                    kc0Var2.X = i30;
                    kc0Var2.Y = i30;
                    kc0Var2.d.h.d(i30);
                    kc0Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = kc0Var3.P(i30, zQ);
                        i11 = 1;
                    } else {
                        zP = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= kc0Var3.P(1, zQ);
                        i11++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    nr3Var2 = nr3Var;
                    size = size;
                    kc0Var2 = (kc0) xo0Var.d;
                    if (xo0Var.b) {
                        arrayList5 = kc0Var2.p0;
                        size5 = arrayList5.size();
                        i32 = 0;
                        while (i32 < size5) {
                            Object obj10 = arrayList5.get(i32);
                            i32++;
                            jc0 jc0Var111 = (jc0) obj10;
                            jc0Var111.f();
                            jc0Var111.a = false;
                            up1 up1Var6 = jc0Var111.d;
                            ArrayList arrayList12 = arrayList5;
                            up1Var6.e.j = false;
                            up1Var6.g = false;
                            up1Var6.n();
                            w45 w45Var6 = jc0Var111.e;
                            w45Var6.e.j = false;
                            w45Var6.g = false;
                            w45Var6.m();
                            arrayList5 = arrayList12;
                        }
                        i30 = 0;
                        kc0Var2.f();
                        kc0Var2.a = false;
                        up1 up1Var7 = kc0Var2.d;
                        up1Var7.e.j = false;
                        up1Var7.g = false;
                        up1Var7.n();
                        w45 w45Var7 = kc0Var2.e;
                        w45Var7.e.j = false;
                        w45Var7.g = false;
                        w45Var7.m();
                        xo0Var.c();
                    } else {
                        i30 = 0;
                    }
                    xo0Var.b((kc0) xo0Var.e);
                    kc0Var2.X = i30;
                    kc0Var2.Y = i30;
                    kc0Var2.d.h.d(i30);
                    kc0Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = kc0Var3.P(i30, zQ);
                        i11 = 1;
                    } else {
                        zP = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= kc0Var3.P(1, zQ);
                        i11++;
                    }
                }
                if (zP) {
                    if (mode == i31) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (mode2 == i31) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kc0Var3.L(z12, z13);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                nr3Var2 = nr3Var;
                size = size;
                zP = false;
                i11 = 0;
            }
            if (zP) {
                int i124 = kc0Var3.C0;
                if (size > 0) {
                    size3 = kc0Var3.p0.size();
                    zS = kc0Var3.S(64);
                    nr3Var3 = kc0Var3.t0;
                    while (i26 < size3) {
                        jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                        if (jc0Var2 instanceof pk1) {
                            jc0Var2.getClass();
                            if (zS) {
                            }
                            iH = jc0Var2.h(0);
                            int iH5 = jc0Var2.h(1);
                            if (iH == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                            }
                            if (z10) {
                                qp4Var.k(0, jc0Var2, nr3Var3);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) nr3Var3.g;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.o;
                    while (i27 < childCount) {
                        constraintLayout.getChildAt(i27);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            ((kb0) arrayList4.get(i28)).getClass();
                        }
                    }
                }
                qp4Var.q(kc0Var3);
                size2 = arrayList2.size();
                i12 = 0;
                if (size > 0) {
                    qp4Var.p(kc0Var3, 0, iO2, i9);
                }
                if (size2 > 0) {
                    iArr3 = kc0Var3.o0;
                    if (iArr3[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr3[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iMax12 = Math.max(kc0Var3.o(), kc0Var.a0);
                    int iMax13 = Math.max(kc0Var3.i(), kc0Var.b0);
                    while (i13 < size2) {
                    }
                    arrayList3 = arrayList2;
                    i14 = iMax12;
                    i15 = iMax13;
                    i16 = 0;
                    while (i16 < 2) {
                        iMax3 = i15;
                        iMax4 = i14;
                        i17 = i12;
                        i18 = i17;
                        while (i17 < size2) {
                            jc0Var = (jc0) arrayList3.get(i17);
                            if (jc0Var instanceof ep) {
                                i21 = size2;
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                            } else {
                                i21 = size2;
                                if (jc0Var.f0 == 8) {
                                    z8 = z5;
                                    i23 = i16;
                                    z9 = z4;
                                    i24 = i18;
                                } else {
                                    iO3 = jc0Var.o();
                                    i22 = jc0Var.i();
                                    z8 = z5;
                                    int i125 = jc0Var.Z;
                                    z9 = z4;
                                    if (i16 == 1) {
                                    }
                                    i23 = i16;
                                    nr3 nr3Var6 = nr3Var2;
                                    i24 = (qp4Var.k(i122, jc0Var, nr3Var6) ? 1 : 0) | i18;
                                    iO4 = jc0Var.o();
                                    nr3Var2 = nr3Var6;
                                    i25 = jc0Var.i();
                                    if (iO4 != iO3) {
                                        jc0Var.K(iO4);
                                        if (!z9) {
                                        }
                                        i24 = 1;
                                    }
                                    if (i25 != i22) {
                                        jc0Var.H(i25);
                                        if (!z8) {
                                        }
                                        i24 = 1;
                                    }
                                    if (!jc0Var.E) {
                                    }
                                }
                            }
                            i17++;
                            i18 = i24;
                            size2 = i21;
                            z5 = z8;
                            z4 = z9;
                            i16 = i23;
                        }
                        i19 = size2;
                        z6 = z5;
                        i20 = i16;
                        z7 = z4;
                        if (i18 == 0) {
                            break;
                            break;
                        }
                        int i126 = i20 + 1;
                        qp4Var.p(kc0Var3, i126, iO2, i9);
                        i16 = i126;
                        i15 = iMax3;
                        i14 = iMax4;
                        size2 = i19;
                        z5 = z6;
                        z4 = z7;
                        i12 = 0;
                    }
                }
                kc0Var3.C0 = i124;
                eb2.q = kc0Var3.S(512);
            } else {
                int i127 = kc0Var3.C0;
                if (size > 0) {
                    size3 = kc0Var3.p0.size();
                    zS = kc0Var3.S(64);
                    nr3Var3 = kc0Var3.t0;
                    while (i26 < size3) {
                        jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                        if (jc0Var2 instanceof pk1) {
                            jc0Var2.getClass();
                            if (zS) {
                            }
                            iH = jc0Var2.h(0);
                            int iH6 = jc0Var2.h(1);
                            if (iH == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                            }
                            if (z10) {
                                qp4Var.k(0, jc0Var2, nr3Var3);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) nr3Var3.g;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.o;
                    while (i27 < childCount) {
                        constraintLayout.getChildAt(i27);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            ((kb0) arrayList4.get(i28)).getClass();
                        }
                    }
                }
                qp4Var.q(kc0Var3);
                size2 = arrayList2.size();
                i12 = 0;
                if (size > 0) {
                    qp4Var.p(kc0Var3, 0, iO2, i9);
                }
                if (size2 > 0) {
                    iArr3 = kc0Var3.o0;
                    if (iArr3[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr3[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iMax14 = Math.max(kc0Var3.o(), kc0Var.a0);
                    int iMax15 = Math.max(kc0Var3.i(), kc0Var.b0);
                    while (i13 < size2) {
                    }
                    arrayList3 = arrayList2;
                    i14 = iMax14;
                    i15 = iMax15;
                    i16 = 0;
                    while (i16 < 2) {
                        iMax3 = i15;
                        iMax4 = i14;
                        i17 = i12;
                        i18 = i17;
                        while (i17 < size2) {
                            jc0Var = (jc0) arrayList3.get(i17);
                            if (jc0Var instanceof ep) {
                                i21 = size2;
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                            } else {
                                i21 = size2;
                                if (jc0Var.f0 == 8) {
                                    z8 = z5;
                                    i23 = i16;
                                    z9 = z4;
                                    i24 = i18;
                                } else {
                                    iO3 = jc0Var.o();
                                    i22 = jc0Var.i();
                                    z8 = z5;
                                    int i128 = jc0Var.Z;
                                    z9 = z4;
                                    if (i16 == 1) {
                                    }
                                    i23 = i16;
                                    nr3 nr3Var7 = nr3Var2;
                                    i24 = (qp4Var.k(i122, jc0Var, nr3Var7) ? 1 : 0) | i18;
                                    iO4 = jc0Var.o();
                                    nr3Var2 = nr3Var7;
                                    i25 = jc0Var.i();
                                    if (iO4 != iO3) {
                                        jc0Var.K(iO4);
                                        if (!z9) {
                                        }
                                        i24 = 1;
                                    }
                                    if (i25 != i22) {
                                        jc0Var.H(i25);
                                        if (!z8) {
                                        }
                                        i24 = 1;
                                    }
                                    if (!jc0Var.E) {
                                    }
                                }
                            }
                            i17++;
                            i18 = i24;
                            size2 = i21;
                            z5 = z8;
                            z4 = z9;
                            i16 = i23;
                        }
                        i19 = size2;
                        z6 = z5;
                        i20 = i16;
                        z7 = z4;
                        if (i18 == 0) {
                            break;
                            break;
                        }
                        int i129 = i20 + 1;
                        qp4Var.p(kc0Var3, i129, iO2, i9);
                        i16 = i129;
                        i15 = iMax3;
                        i14 = iMax4;
                        size2 = i19;
                        z5 = z6;
                        z4 = z7;
                        i12 = 0;
                    }
                }
                kc0Var3.C0 = i127;
                eb2.q = kc0Var3.S(512);
            }
            j(i, i2, kc0Var3.o(), kc0Var3.i(), kc0Var3.D0, kc0Var3.E0);
        }
        i3 = i110;
        iMax = childCount5 == 0 ? Math.max(0, constraintLayout2.q) : i108;
        i4 = 2;
        i5 = Integer.MIN_VALUE;
        if (mode2 != i5) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i6 = 1;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(constraintLayout2.t - i3, i109);
                    i6 = 1;
                }
            } else if (childCount5 == 0) {
                iMax2 = Math.max(0, constraintLayout2.r);
            } else {
                iMax2 = 0;
            }
            iO = kc0Var3.o();
            iArr = kc0Var3.C;
            if (iMax == iO) {
                xo0Var.c = true;
                c = 1;
            } else {
                xo0Var.c = true;
                c = 1;
            }
            kc0Var3.X = 0;
            kc0Var3.Y = 0;
            iArr[0] = constraintLayout2.s - i111;
            iArr[c] = constraintLayout2.t - i3;
            kc0Var3.a0 = 0;
            kc0Var3.b0 = 0;
            kc0Var3.I(i4);
            kc0Var3.K(iMax);
            kc0Var3.J(i6);
            kc0Var3.H(iMax2);
            i7 = constraintLayout2.q - i111;
            if (i7 < 0) {
                kc0Var3.a0 = 0;
            } else {
                kc0Var3.a0 = i7;
            }
            i8 = constraintLayout2.r - i3;
            if (i8 < 0) {
                kc0Var3.b0 = 0;
            } else {
                kc0Var3.b0 = i8;
            }
            kc0Var3.w0 = iMax9;
            kc0Var3.x0 = iMax5;
            kc0Var = (kc0) qp4Var.c;
            arrayList = (ArrayList) qp4Var.a;
            nr3Var = kc0Var3.t0;
            size = kc0Var3.p0.size();
            iO2 = kc0Var3.o();
            i9 = kc0Var3.i();
            zQ = uo.q(i106, 128);
            if (zQ) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i40 = 0;
                while (true) {
                    if (i40 < size) {
                        z16 = z;
                        jc0Var3 = (jc0) kc0Var3.p0.get(i40);
                        i41 = i40;
                        iArr4 = jc0Var3.o0;
                        iArr2 = iArr;
                        if (iArr4[0] == 3) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (iArr4[1] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z17) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (jc0Var3.v()) {
                            i40 = i41 + 1;
                            z = z16;
                            iArr = iArr2;
                        } else {
                            i40 = i41 + 1;
                            z = z16;
                            iArr = iArr2;
                        }
                        i10 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        iArr2 = iArr;
                        i10 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                iArr2 = iArr;
                i10 = 1073741824;
            }
            z3 = z2 & ((mode != i10 && mode2 == i10) || zQ);
            if (z3) {
                iMin = Math.min(iArr2[0], i108);
                iMin2 = Math.min(iArr2[1], i109);
                i29 = 1073741824;
                if (mode == 1073741824) {
                    if (kc0Var3.o() != iMin) {
                        kc0Var3.K(iMin);
                        z11 = true;
                        xo0Var.b = true;
                    } else {
                        z11 = true;
                    }
                    i29 = 1073741824;
                } else {
                    z11 = true;
                }
                if (mode2 == i29) {
                    if (kc0Var3.i() != iMin2) {
                        kc0Var3.H(iMin2);
                        xo0Var.b = z11;
                    }
                    i29 = 1073741824;
                }
                if (mode == i29) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    nr3Var2 = nr3Var;
                    size = size;
                    kc0Var2 = (kc0) xo0Var.d;
                    if (xo0Var.b) {
                        arrayList5 = kc0Var2.p0;
                        size5 = arrayList5.size();
                        i32 = 0;
                        while (i32 < size5) {
                            Object obj11 = arrayList5.get(i32);
                            i32++;
                            jc0 jc0Var112 = (jc0) obj11;
                            jc0Var112.f();
                            jc0Var112.a = false;
                            up1 up1Var8 = jc0Var112.d;
                            ArrayList arrayList13 = arrayList5;
                            up1Var8.e.j = false;
                            up1Var8.g = false;
                            up1Var8.n();
                            w45 w45Var8 = jc0Var112.e;
                            w45Var8.e.j = false;
                            w45Var8.g = false;
                            w45Var8.m();
                            arrayList5 = arrayList13;
                        }
                        i30 = 0;
                        kc0Var2.f();
                        kc0Var2.a = false;
                        up1 up1Var9 = kc0Var2.d;
                        up1Var9.e.j = false;
                        up1Var9.g = false;
                        up1Var9.n();
                        w45 w45Var9 = kc0Var2.e;
                        w45Var9.e.j = false;
                        w45Var9.g = false;
                        w45Var9.m();
                        xo0Var.c();
                    } else {
                        i30 = 0;
                    }
                    xo0Var.b((kc0) xo0Var.e);
                    kc0Var2.X = i30;
                    kc0Var2.Y = i30;
                    kc0Var2.d.h.d(i30);
                    kc0Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = kc0Var3.P(i30, zQ);
                        i11 = 1;
                    } else {
                        zP = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= kc0Var3.P(1, zQ);
                        i11++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    nr3Var2 = nr3Var;
                    size = size;
                    kc0Var2 = (kc0) xo0Var.d;
                    if (xo0Var.b) {
                        arrayList5 = kc0Var2.p0;
                        size5 = arrayList5.size();
                        i32 = 0;
                        while (i32 < size5) {
                            Object obj12 = arrayList5.get(i32);
                            i32++;
                            jc0 jc0Var113 = (jc0) obj12;
                            jc0Var113.f();
                            jc0Var113.a = false;
                            up1 up1Var10 = jc0Var113.d;
                            ArrayList arrayList14 = arrayList5;
                            up1Var10.e.j = false;
                            up1Var10.g = false;
                            up1Var10.n();
                            w45 w45Var10 = jc0Var113.e;
                            w45Var10.e.j = false;
                            w45Var10.g = false;
                            w45Var10.m();
                            arrayList5 = arrayList14;
                        }
                        i30 = 0;
                        kc0Var2.f();
                        kc0Var2.a = false;
                        up1 up1Var11 = kc0Var2.d;
                        up1Var11.e.j = false;
                        up1Var11.g = false;
                        up1Var11.n();
                        w45 w45Var11 = kc0Var2.e;
                        w45Var11.e.j = false;
                        w45Var11.g = false;
                        w45Var11.m();
                        xo0Var.c();
                    } else {
                        i30 = 0;
                    }
                    xo0Var.b((kc0) xo0Var.e);
                    kc0Var2.X = i30;
                    kc0Var2.Y = i30;
                    kc0Var2.d.h.d(i30);
                    kc0Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = kc0Var3.P(i30, zQ);
                        i11 = 1;
                    } else {
                        zP = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= kc0Var3.P(1, zQ);
                        i11++;
                    }
                }
                if (zP) {
                    if (mode == i31) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (mode2 == i31) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kc0Var3.L(z12, z13);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                nr3Var2 = nr3Var;
                size = size;
                zP = false;
                i11 = 0;
            }
            if (zP) {
                int i1210 = kc0Var3.C0;
                if (size > 0) {
                    size3 = kc0Var3.p0.size();
                    zS = kc0Var3.S(64);
                    nr3Var3 = kc0Var3.t0;
                    while (i26 < size3) {
                        jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                        if (jc0Var2 instanceof pk1) {
                            jc0Var2.getClass();
                            if (zS) {
                            }
                            iH = jc0Var2.h(0);
                            int iH7 = jc0Var2.h(1);
                            if (iH == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                            }
                            if (z10) {
                                qp4Var.k(0, jc0Var2, nr3Var3);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) nr3Var3.g;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.o;
                    while (i27 < childCount) {
                        constraintLayout.getChildAt(i27);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            ((kb0) arrayList4.get(i28)).getClass();
                        }
                    }
                }
                qp4Var.q(kc0Var3);
                size2 = arrayList2.size();
                i12 = 0;
                if (size > 0) {
                    qp4Var.p(kc0Var3, 0, iO2, i9);
                }
                if (size2 > 0) {
                    iArr3 = kc0Var3.o0;
                    if (iArr3[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr3[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iMax16 = Math.max(kc0Var3.o(), kc0Var.a0);
                    int iMax17 = Math.max(kc0Var3.i(), kc0Var.b0);
                    while (i13 < size2) {
                    }
                    arrayList3 = arrayList2;
                    i14 = iMax16;
                    i15 = iMax17;
                    i16 = 0;
                    while (i16 < 2) {
                        iMax3 = i15;
                        iMax4 = i14;
                        i17 = i12;
                        i18 = i17;
                        while (i17 < size2) {
                            jc0Var = (jc0) arrayList3.get(i17);
                            if (jc0Var instanceof ep) {
                                i21 = size2;
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                            } else {
                                i21 = size2;
                                if (jc0Var.f0 == 8) {
                                    z8 = z5;
                                    i23 = i16;
                                    z9 = z4;
                                    i24 = i18;
                                } else {
                                    iO3 = jc0Var.o();
                                    i22 = jc0Var.i();
                                    z8 = z5;
                                    int i1211 = jc0Var.Z;
                                    z9 = z4;
                                    if (i16 == 1) {
                                    }
                                    i23 = i16;
                                    nr3 nr3Var8 = nr3Var2;
                                    i24 = (qp4Var.k(i122, jc0Var, nr3Var8) ? 1 : 0) | i18;
                                    iO4 = jc0Var.o();
                                    nr3Var2 = nr3Var8;
                                    i25 = jc0Var.i();
                                    if (iO4 != iO3) {
                                        jc0Var.K(iO4);
                                        if (!z9) {
                                        }
                                        i24 = 1;
                                    }
                                    if (i25 != i22) {
                                        jc0Var.H(i25);
                                        if (!z8) {
                                        }
                                        i24 = 1;
                                    }
                                    if (!jc0Var.E) {
                                    }
                                }
                            }
                            i17++;
                            i18 = i24;
                            size2 = i21;
                            z5 = z8;
                            z4 = z9;
                            i16 = i23;
                        }
                        i19 = size2;
                        z6 = z5;
                        i20 = i16;
                        z7 = z4;
                        if (i18 == 0) {
                            break;
                            break;
                        }
                        int i1212 = i20 + 1;
                        qp4Var.p(kc0Var3, i1212, iO2, i9);
                        i16 = i1212;
                        i15 = iMax3;
                        i14 = iMax4;
                        size2 = i19;
                        z5 = z6;
                        z4 = z7;
                        i12 = 0;
                    }
                }
                kc0Var3.C0 = i1210;
                eb2.q = kc0Var3.S(512);
            } else {
                int i1213 = kc0Var3.C0;
                if (size > 0) {
                    size3 = kc0Var3.p0.size();
                    zS = kc0Var3.S(64);
                    nr3Var3 = kc0Var3.t0;
                    while (i26 < size3) {
                        jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                        if (jc0Var2 instanceof pk1) {
                            jc0Var2.getClass();
                            if (zS) {
                            }
                            iH = jc0Var2.h(0);
                            int iH8 = jc0Var2.h(1);
                            if (iH == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                            }
                            if (z10) {
                                qp4Var.k(0, jc0Var2, nr3Var3);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) nr3Var3.g;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.o;
                    while (i27 < childCount) {
                        constraintLayout.getChildAt(i27);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            ((kb0) arrayList4.get(i28)).getClass();
                        }
                    }
                }
                qp4Var.q(kc0Var3);
                size2 = arrayList2.size();
                i12 = 0;
                if (size > 0) {
                    qp4Var.p(kc0Var3, 0, iO2, i9);
                }
                if (size2 > 0) {
                    iArr3 = kc0Var3.o0;
                    if (iArr3[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr3[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iMax18 = Math.max(kc0Var3.o(), kc0Var.a0);
                    int iMax19 = Math.max(kc0Var3.i(), kc0Var.b0);
                    while (i13 < size2) {
                    }
                    arrayList3 = arrayList2;
                    i14 = iMax18;
                    i15 = iMax19;
                    i16 = 0;
                    while (i16 < 2) {
                        iMax3 = i15;
                        iMax4 = i14;
                        i17 = i12;
                        i18 = i17;
                        while (i17 < size2) {
                            jc0Var = (jc0) arrayList3.get(i17);
                            if (jc0Var instanceof ep) {
                                i21 = size2;
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                            } else {
                                i21 = size2;
                                if (jc0Var.f0 == 8) {
                                    z8 = z5;
                                    i23 = i16;
                                    z9 = z4;
                                    i24 = i18;
                                } else {
                                    iO3 = jc0Var.o();
                                    i22 = jc0Var.i();
                                    z8 = z5;
                                    int i1214 = jc0Var.Z;
                                    z9 = z4;
                                    if (i16 == 1) {
                                    }
                                    i23 = i16;
                                    nr3 nr3Var9 = nr3Var2;
                                    i24 = (qp4Var.k(i122, jc0Var, nr3Var9) ? 1 : 0) | i18;
                                    iO4 = jc0Var.o();
                                    nr3Var2 = nr3Var9;
                                    i25 = jc0Var.i();
                                    if (iO4 != iO3) {
                                        jc0Var.K(iO4);
                                        if (!z9) {
                                        }
                                        i24 = 1;
                                    }
                                    if (i25 != i22) {
                                        jc0Var.H(i25);
                                        if (!z8) {
                                        }
                                        i24 = 1;
                                    }
                                    if (!jc0Var.E) {
                                    }
                                }
                            }
                            i17++;
                            i18 = i24;
                            size2 = i21;
                            z5 = z8;
                            z4 = z9;
                            i16 = i23;
                        }
                        i19 = size2;
                        z6 = z5;
                        i20 = i16;
                        z7 = z4;
                        if (i18 == 0) {
                            break;
                            break;
                        }
                        int i1215 = i20 + 1;
                        qp4Var.p(kc0Var3, i1215, iO2, i9);
                        i16 = i1215;
                        i15 = iMax3;
                        i14 = iMax4;
                        size2 = i19;
                        z5 = z6;
                        z4 = z7;
                        i12 = 0;
                    }
                }
                kc0Var3.C0 = i1213;
                eb2.q = kc0Var3.S(512);
            }
            j(i, i2, kc0Var3.o(), kc0Var3.i(), kc0Var3.D0, kc0Var3.E0);
        }
        if (childCount5 == 0) {
            iMax2 = Math.max(0, constraintLayout2.r);
        } else {
            iMax2 = i109;
        }
        i6 = 2;
        iO = kc0Var3.o();
        iArr = kc0Var3.C;
        if (iMax == iO) {
            xo0Var.c = true;
            c = 1;
        } else {
            xo0Var.c = true;
            c = 1;
        }
        kc0Var3.X = 0;
        kc0Var3.Y = 0;
        iArr[0] = constraintLayout2.s - i111;
        iArr[c] = constraintLayout2.t - i3;
        kc0Var3.a0 = 0;
        kc0Var3.b0 = 0;
        kc0Var3.I(i4);
        kc0Var3.K(iMax);
        kc0Var3.J(i6);
        kc0Var3.H(iMax2);
        i7 = constraintLayout2.q - i111;
        if (i7 < 0) {
            kc0Var3.a0 = 0;
        } else {
            kc0Var3.a0 = i7;
        }
        i8 = constraintLayout2.r - i3;
        if (i8 < 0) {
            kc0Var3.b0 = 0;
        } else {
            kc0Var3.b0 = i8;
        }
        kc0Var3.w0 = iMax9;
        kc0Var3.x0 = iMax5;
        kc0Var = (kc0) qp4Var.c;
        arrayList = (ArrayList) qp4Var.a;
        nr3Var = kc0Var3.t0;
        size = kc0Var3.p0.size();
        iO2 = kc0Var3.o();
        i9 = kc0Var3.i();
        zQ = uo.q(i106, 128);
        if (zQ) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i40 = 0;
            while (true) {
                if (i40 < size) {
                    z16 = z;
                    jc0Var3 = (jc0) kc0Var3.p0.get(i40);
                    i41 = i40;
                    iArr4 = jc0Var3.o0;
                    iArr2 = iArr;
                    if (iArr4[0] == 3) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (iArr4[1] == 3) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z17) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (jc0Var3.v()) {
                        i40 = i41 + 1;
                        z = z16;
                        iArr = iArr2;
                    } else {
                        i40 = i41 + 1;
                        z = z16;
                        iArr = iArr2;
                    }
                    i10 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    iArr2 = iArr;
                    i10 = 1073741824;
                }
            }
        } else {
            z2 = z;
            iArr2 = iArr;
            i10 = 1073741824;
        }
        z3 = z2 & ((mode != i10 && mode2 == i10) || zQ);
        if (z3) {
            iMin = Math.min(iArr2[0], i108);
            iMin2 = Math.min(iArr2[1], i109);
            i29 = 1073741824;
            if (mode == 1073741824) {
                if (kc0Var3.o() != iMin) {
                    kc0Var3.K(iMin);
                    z11 = true;
                    xo0Var.b = true;
                } else {
                    z11 = true;
                }
                i29 = 1073741824;
            } else {
                z11 = true;
            }
            if (mode2 == i29) {
                if (kc0Var3.i() != iMin2) {
                    kc0Var3.H(iMin2);
                    xo0Var.b = z11;
                }
                i29 = 1073741824;
            }
            if (mode == i29) {
                z3 = z3;
                arrayList2 = arrayList;
                nr3Var2 = nr3Var;
                size = size;
                kc0Var2 = (kc0) xo0Var.d;
                if (xo0Var.b) {
                    arrayList5 = kc0Var2.p0;
                    size5 = arrayList5.size();
                    i32 = 0;
                    while (i32 < size5) {
                        Object obj13 = arrayList5.get(i32);
                        i32++;
                        jc0 jc0Var114 = (jc0) obj13;
                        jc0Var114.f();
                        jc0Var114.a = false;
                        up1 up1Var12 = jc0Var114.d;
                        ArrayList arrayList15 = arrayList5;
                        up1Var12.e.j = false;
                        up1Var12.g = false;
                        up1Var12.n();
                        w45 w45Var12 = jc0Var114.e;
                        w45Var12.e.j = false;
                        w45Var12.g = false;
                        w45Var12.m();
                        arrayList5 = arrayList15;
                    }
                    i30 = 0;
                    kc0Var2.f();
                    kc0Var2.a = false;
                    up1 up1Var13 = kc0Var2.d;
                    up1Var13.e.j = false;
                    up1Var13.g = false;
                    up1Var13.n();
                    w45 w45Var13 = kc0Var2.e;
                    w45Var13.e.j = false;
                    w45Var13.g = false;
                    w45Var13.m();
                    xo0Var.c();
                } else {
                    i30 = 0;
                }
                xo0Var.b((kc0) xo0Var.e);
                kc0Var2.X = i30;
                kc0Var2.Y = i30;
                kc0Var2.d.h.d(i30);
                kc0Var2.e.h.d(i30);
                i31 = 1073741824;
                if (mode == 1073741824) {
                    zP = kc0Var3.P(i30, zQ);
                    i11 = 1;
                } else {
                    zP = true;
                    i11 = 0;
                }
                if (mode2 == 1073741824) {
                    zP &= kc0Var3.P(1, zQ);
                    i11++;
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                nr3Var2 = nr3Var;
                size = size;
                kc0Var2 = (kc0) xo0Var.d;
                if (xo0Var.b) {
                    arrayList5 = kc0Var2.p0;
                    size5 = arrayList5.size();
                    i32 = 0;
                    while (i32 < size5) {
                        Object obj14 = arrayList5.get(i32);
                        i32++;
                        jc0 jc0Var115 = (jc0) obj14;
                        jc0Var115.f();
                        jc0Var115.a = false;
                        up1 up1Var14 = jc0Var115.d;
                        ArrayList arrayList16 = arrayList5;
                        up1Var14.e.j = false;
                        up1Var14.g = false;
                        up1Var14.n();
                        w45 w45Var14 = jc0Var115.e;
                        w45Var14.e.j = false;
                        w45Var14.g = false;
                        w45Var14.m();
                        arrayList5 = arrayList16;
                    }
                    i30 = 0;
                    kc0Var2.f();
                    kc0Var2.a = false;
                    up1 up1Var15 = kc0Var2.d;
                    up1Var15.e.j = false;
                    up1Var15.g = false;
                    up1Var15.n();
                    w45 w45Var15 = kc0Var2.e;
                    w45Var15.e.j = false;
                    w45Var15.g = false;
                    w45Var15.m();
                    xo0Var.c();
                } else {
                    i30 = 0;
                }
                xo0Var.b((kc0) xo0Var.e);
                kc0Var2.X = i30;
                kc0Var2.Y = i30;
                kc0Var2.d.h.d(i30);
                kc0Var2.e.h.d(i30);
                i31 = 1073741824;
                if (mode == 1073741824) {
                    zP = kc0Var3.P(i30, zQ);
                    i11 = 1;
                } else {
                    zP = true;
                    i11 = 0;
                }
                if (mode2 == 1073741824) {
                    zP &= kc0Var3.P(1, zQ);
                    i11++;
                }
            }
            if (zP) {
                if (mode == i31) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (mode2 == i31) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kc0Var3.L(z12, z13);
            }
        } else {
            z3 = z3;
            arrayList2 = arrayList;
            nr3Var2 = nr3Var;
            size = size;
            zP = false;
            i11 = 0;
        }
        if (zP) {
            int i1216 = kc0Var3.C0;
            if (size > 0) {
                size3 = kc0Var3.p0.size();
                zS = kc0Var3.S(64);
                nr3Var3 = kc0Var3.t0;
                while (i26 < size3) {
                    jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                    if (jc0Var2 instanceof pk1) {
                        jc0Var2.getClass();
                        if (zS) {
                        }
                        iH = jc0Var2.h(0);
                        int iH9 = jc0Var2.h(1);
                        if (iH == 3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                        }
                        if (z10) {
                            qp4Var.k(0, jc0Var2, nr3Var3);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) nr3Var3.g;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.o;
                while (i27 < childCount) {
                    constraintLayout.getChildAt(i27);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i28 < size4) {
                        ((kb0) arrayList4.get(i28)).getClass();
                    }
                }
            }
            qp4Var.q(kc0Var3);
            size2 = arrayList2.size();
            i12 = 0;
            if (size > 0) {
                qp4Var.p(kc0Var3, 0, iO2, i9);
            }
            if (size2 > 0) {
                iArr3 = kc0Var3.o0;
                if (iArr3[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr3[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iMax110 = Math.max(kc0Var3.o(), kc0Var.a0);
                int iMax111 = Math.max(kc0Var3.i(), kc0Var.b0);
                while (i13 < size2) {
                }
                arrayList3 = arrayList2;
                i14 = iMax110;
                i15 = iMax111;
                i16 = 0;
                while (i16 < 2) {
                    iMax3 = i15;
                    iMax4 = i14;
                    i17 = i12;
                    i18 = i17;
                    while (i17 < size2) {
                        jc0Var = (jc0) arrayList3.get(i17);
                        if (jc0Var instanceof ep) {
                            i21 = size2;
                            z8 = z5;
                            i23 = i16;
                            z9 = z4;
                            i24 = i18;
                        } else {
                            i21 = size2;
                            if (jc0Var.f0 == 8) {
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                            } else {
                                iO3 = jc0Var.o();
                                i22 = jc0Var.i();
                                z8 = z5;
                                int i1217 = jc0Var.Z;
                                z9 = z4;
                                if (i16 == 1) {
                                }
                                i23 = i16;
                                nr3 nr3Var10 = nr3Var2;
                                i24 = (qp4Var.k(i122, jc0Var, nr3Var10) ? 1 : 0) | i18;
                                iO4 = jc0Var.o();
                                nr3Var2 = nr3Var10;
                                i25 = jc0Var.i();
                                if (iO4 != iO3) {
                                    jc0Var.K(iO4);
                                    if (!z9) {
                                    }
                                    i24 = 1;
                                }
                                if (i25 != i22) {
                                    jc0Var.H(i25);
                                    if (!z8) {
                                    }
                                    i24 = 1;
                                }
                                if (!jc0Var.E) {
                                }
                            }
                        }
                        i17++;
                        i18 = i24;
                        size2 = i21;
                        z5 = z8;
                        z4 = z9;
                        i16 = i23;
                    }
                    i19 = size2;
                    z6 = z5;
                    i20 = i16;
                    z7 = z4;
                    if (i18 == 0) {
                        break;
                        break;
                    }
                    int i1218 = i20 + 1;
                    qp4Var.p(kc0Var3, i1218, iO2, i9);
                    i16 = i1218;
                    i15 = iMax3;
                    i14 = iMax4;
                    size2 = i19;
                    z5 = z6;
                    z4 = z7;
                    i12 = 0;
                }
            }
            kc0Var3.C0 = i1216;
            eb2.q = kc0Var3.S(512);
        } else {
            int i1219 = kc0Var3.C0;
            if (size > 0) {
                size3 = kc0Var3.p0.size();
                zS = kc0Var3.S(64);
                nr3Var3 = kc0Var3.t0;
                while (i26 < size3) {
                    jc0Var2 = (jc0) kc0Var3.p0.get(i26);
                    if (jc0Var2 instanceof pk1) {
                        jc0Var2.getClass();
                        if (zS) {
                        }
                        iH = jc0Var2.h(0);
                        int iH10 = jc0Var2.h(1);
                        if (iH == 3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                        }
                        if (z10) {
                            qp4Var.k(0, jc0Var2, nr3Var3);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) nr3Var3.g;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.o;
                while (i27 < childCount) {
                    constraintLayout.getChildAt(i27);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i28 < size4) {
                        ((kb0) arrayList4.get(i28)).getClass();
                    }
                }
            }
            qp4Var.q(kc0Var3);
            size2 = arrayList2.size();
            i12 = 0;
            if (size > 0) {
                qp4Var.p(kc0Var3, 0, iO2, i9);
            }
            if (size2 > 0) {
                iArr3 = kc0Var3.o0;
                if (iArr3[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr3[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iMax112 = Math.max(kc0Var3.o(), kc0Var.a0);
                int iMax113 = Math.max(kc0Var3.i(), kc0Var.b0);
                while (i13 < size2) {
                }
                arrayList3 = arrayList2;
                i14 = iMax112;
                i15 = iMax113;
                i16 = 0;
                while (i16 < 2) {
                    iMax3 = i15;
                    iMax4 = i14;
                    i17 = i12;
                    i18 = i17;
                    while (i17 < size2) {
                        jc0Var = (jc0) arrayList3.get(i17);
                        if (jc0Var instanceof ep) {
                            i21 = size2;
                            z8 = z5;
                            i23 = i16;
                            z9 = z4;
                            i24 = i18;
                        } else {
                            i21 = size2;
                            if (jc0Var.f0 == 8) {
                                z8 = z5;
                                i23 = i16;
                                z9 = z4;
                                i24 = i18;
                            } else {
                                iO3 = jc0Var.o();
                                i22 = jc0Var.i();
                                z8 = z5;
                                int i12110 = jc0Var.Z;
                                z9 = z4;
                                if (i16 == 1) {
                                }
                                i23 = i16;
                                nr3 nr3Var11 = nr3Var2;
                                i24 = (qp4Var.k(i122, jc0Var, nr3Var11) ? 1 : 0) | i18;
                                iO4 = jc0Var.o();
                                nr3Var2 = nr3Var11;
                                i25 = jc0Var.i();
                                if (iO4 != iO3) {
                                    jc0Var.K(iO4);
                                    if (!z9) {
                                    }
                                    i24 = 1;
                                }
                                if (i25 != i22) {
                                    jc0Var.H(i25);
                                    if (!z8) {
                                    }
                                    i24 = 1;
                                }
                                if (!jc0Var.E) {
                                }
                            }
                        }
                        i17++;
                        i18 = i24;
                        size2 = i21;
                        z5 = z8;
                        z4 = z9;
                        i16 = i23;
                    }
                    i19 = size2;
                    z6 = z5;
                    i20 = i16;
                    z7 = z4;
                    if (i18 == 0) {
                        break;
                        break;
                    }
                    int i12111 = i20 + 1;
                    qp4Var.p(kc0Var3, i12111, iO2, i9);
                    i16 = i12111;
                    i15 = iMax3;
                    i14 = iMax4;
                    size2 = i19;
                    z5 = z6;
                    z4 = z7;
                    i12 = 0;
                }
            }
            kc0Var3.C0 = i1219;
            eb2.q = kc0Var3.S(512);
        }
        j(i, i2, kc0Var3.o(), kc0Var3.i(), kc0Var3.D0, kc0Var3.E0);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        jc0 jc0VarG = g(view);
        if ((view instanceof Guideline) && !(jc0VarG instanceof pk1)) {
            mb0 mb0Var = (mb0) view.getLayoutParams();
            pk1 pk1Var = new pk1();
            mb0Var.p0 = pk1Var;
            mb0Var.d0 = true;
            pk1Var.O(mb0Var.V);
        }
        if (view instanceof kb0) {
            kb0 kb0Var = (kb0) view;
            kb0Var.e();
            ((mb0) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.o;
            if (!arrayList.contains(kb0Var)) {
                arrayList.add(kb0Var);
            }
        }
        this.n.put(view.getId(), view);
        this.u = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.n.remove(view.getId());
        jc0 jc0VarG = g(view);
        this.p.p0.remove(jc0VarG);
        jc0VarG.A();
        this.o.remove(view);
        this.u = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.u = true;
        super.requestLayout();
    }

    public void setConstraintSet(wb0 wb0Var) {
        this.w = wb0Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.n;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.t) {
            return;
        }
        this.t = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.s) {
            return;
        }
        this.s = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(oc0 oc0Var) {
        rm3 rm3Var = this.x;
        if (rm3Var != null) {
            rm3Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.v = i;
        kc0 kc0Var = this.p;
        kc0Var.C0 = i;
        eb2.q = kc0Var.S(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new SparseArray();
        this.o = new ArrayList(4);
        this.p = new kc0();
        this.q = 0;
        this.r = 0;
        this.s = Integer.MAX_VALUE;
        this.t = Integer.MAX_VALUE;
        this.u = true;
        this.v = 257;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = new HashMap();
        this.A = new SparseArray();
        this.B = new nr3(this, this);
        h(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new SparseArray();
        this.o = new ArrayList(4);
        this.p = new kc0();
        this.q = 0;
        this.r = 0;
        this.s = Integer.MAX_VALUE;
        this.t = Integer.MAX_VALUE;
        this.u = true;
        this.v = 257;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = new HashMap();
        this.A = new SparseArray();
        this.B = new nr3(this, this);
        h(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = new SparseArray();
        this.o = new ArrayList(4);
        this.p = new kc0();
        this.q = 0;
        this.r = 0;
        this.s = Integer.MAX_VALUE;
        this.t = Integer.MAX_VALUE;
        this.u = true;
        this.v = 257;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = new HashMap();
        this.A = new SparseArray();
        this.B = new nr3(this, this);
        h(attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        mb0 mb0Var = new mb0(layoutParams);
        mb0Var.a = -1;
        mb0Var.b = -1;
        mb0Var.c = -1.0f;
        mb0Var.d = true;
        mb0Var.e = -1;
        mb0Var.f = -1;
        mb0Var.g = -1;
        mb0Var.h = -1;
        mb0Var.i = -1;
        mb0Var.j = -1;
        mb0Var.k = -1;
        mb0Var.l = -1;
        mb0Var.m = -1;
        mb0Var.n = -1;
        mb0Var.o = -1;
        mb0Var.p = -1;
        mb0Var.q = 0;
        mb0Var.r = 0.0f;
        mb0Var.s = -1;
        mb0Var.t = -1;
        mb0Var.u = -1;
        mb0Var.v = -1;
        mb0Var.w = Integer.MIN_VALUE;
        mb0Var.x = Integer.MIN_VALUE;
        mb0Var.y = Integer.MIN_VALUE;
        mb0Var.z = Integer.MIN_VALUE;
        mb0Var.A = Integer.MIN_VALUE;
        mb0Var.B = Integer.MIN_VALUE;
        mb0Var.C = Integer.MIN_VALUE;
        mb0Var.D = 0;
        mb0Var.E = 0.5f;
        mb0Var.F = 0.5f;
        mb0Var.G = null;
        mb0Var.H = -1.0f;
        mb0Var.I = -1.0f;
        mb0Var.J = 0;
        mb0Var.K = 0;
        mb0Var.L = 0;
        mb0Var.M = 0;
        mb0Var.N = 0;
        mb0Var.O = 0;
        mb0Var.P = 0;
        mb0Var.Q = 0;
        mb0Var.R = 1.0f;
        mb0Var.S = 1.0f;
        mb0Var.T = -1;
        mb0Var.U = -1;
        mb0Var.V = -1;
        mb0Var.W = false;
        mb0Var.X = false;
        mb0Var.Y = null;
        mb0Var.Z = 0;
        mb0Var.a0 = true;
        mb0Var.b0 = true;
        mb0Var.c0 = false;
        mb0Var.d0 = false;
        mb0Var.e0 = false;
        mb0Var.f0 = -1;
        mb0Var.g0 = -1;
        mb0Var.h0 = -1;
        mb0Var.i0 = -1;
        mb0Var.j0 = Integer.MIN_VALUE;
        mb0Var.k0 = Integer.MIN_VALUE;
        mb0Var.l0 = 0.5f;
        mb0Var.p0 = new jc0();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) mb0Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) mb0Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) mb0Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) mb0Var).bottomMargin = marginLayoutParams.bottomMargin;
            mb0Var.setMarginStart(marginLayoutParams.getMarginStart());
            mb0Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof mb0)) {
            return mb0Var;
        }
        mb0 mb0Var2 = (mb0) layoutParams;
        mb0Var.a = mb0Var2.a;
        mb0Var.b = mb0Var2.b;
        mb0Var.c = mb0Var2.c;
        mb0Var.d = mb0Var2.d;
        mb0Var.e = mb0Var2.e;
        mb0Var.f = mb0Var2.f;
        mb0Var.g = mb0Var2.g;
        mb0Var.h = mb0Var2.h;
        mb0Var.i = mb0Var2.i;
        mb0Var.j = mb0Var2.j;
        mb0Var.k = mb0Var2.k;
        mb0Var.l = mb0Var2.l;
        mb0Var.m = mb0Var2.m;
        mb0Var.n = mb0Var2.n;
        mb0Var.o = mb0Var2.o;
        mb0Var.p = mb0Var2.p;
        mb0Var.q = mb0Var2.q;
        mb0Var.r = mb0Var2.r;
        mb0Var.s = mb0Var2.s;
        mb0Var.t = mb0Var2.t;
        mb0Var.u = mb0Var2.u;
        mb0Var.v = mb0Var2.v;
        mb0Var.w = mb0Var2.w;
        mb0Var.x = mb0Var2.x;
        mb0Var.y = mb0Var2.y;
        mb0Var.z = mb0Var2.z;
        mb0Var.A = mb0Var2.A;
        mb0Var.B = mb0Var2.B;
        mb0Var.C = mb0Var2.C;
        mb0Var.D = mb0Var2.D;
        mb0Var.E = mb0Var2.E;
        mb0Var.F = mb0Var2.F;
        mb0Var.G = mb0Var2.G;
        mb0Var.H = mb0Var2.H;
        mb0Var.I = mb0Var2.I;
        mb0Var.J = mb0Var2.J;
        mb0Var.K = mb0Var2.K;
        mb0Var.W = mb0Var2.W;
        mb0Var.X = mb0Var2.X;
        mb0Var.L = mb0Var2.L;
        mb0Var.M = mb0Var2.M;
        mb0Var.N = mb0Var2.N;
        mb0Var.P = mb0Var2.P;
        mb0Var.O = mb0Var2.O;
        mb0Var.Q = mb0Var2.Q;
        mb0Var.R = mb0Var2.R;
        mb0Var.S = mb0Var2.S;
        mb0Var.T = mb0Var2.T;
        mb0Var.U = mb0Var2.U;
        mb0Var.V = mb0Var2.V;
        mb0Var.a0 = mb0Var2.a0;
        mb0Var.b0 = mb0Var2.b0;
        mb0Var.c0 = mb0Var2.c0;
        mb0Var.d0 = mb0Var2.d0;
        mb0Var.f0 = mb0Var2.f0;
        mb0Var.g0 = mb0Var2.g0;
        mb0Var.h0 = mb0Var2.h0;
        mb0Var.i0 = mb0Var2.i0;
        mb0Var.j0 = mb0Var2.j0;
        mb0Var.k0 = mb0Var2.k0;
        mb0Var.l0 = mb0Var2.l0;
        mb0Var.Y = mb0Var2.Y;
        mb0Var.Z = mb0Var2.Z;
        mb0Var.p0 = mb0Var2.p0;
        return mb0Var;
    }
}
