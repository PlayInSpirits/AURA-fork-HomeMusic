package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import app.homemusic.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap {
    public final zo a;
    public final zo b = new zo();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public ap(Context context, zo zoVar) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        zoVar = zoVar == null ? new zo() : zoVar;
        int i = zoVar.n;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = uc5.D(context, attributeSetAsAttributeSet, ht3.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(14, -1);
        this.e = typedArrayD.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayD.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(24, 1);
        zo zoVar2 = this.b;
        int i2 = zoVar.v;
        zoVar2.v = i2 == -2 ? 255 : i2;
        int i3 = zoVar.x;
        if (i3 != -2) {
            zoVar2.x = i3;
        } else {
            boolean zHasValue = typedArrayD.hasValue(23);
            zo zoVar3 = this.b;
            if (zHasValue) {
                zoVar3.x = typedArrayD.getInt(23, 0);
            } else {
                zoVar3.x = -1;
            }
        }
        String str = zoVar.w;
        if (str != null) {
            this.b.w = str;
        } else if (typedArrayD.hasValue(7)) {
            this.b.w = typedArrayD.getString(7);
        }
        zo zoVar4 = this.b;
        zoVar4.B = zoVar.B;
        CharSequence charSequence = zoVar.C;
        zoVar4.C = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        zo zoVar5 = this.b;
        int i4 = zoVar.D;
        zoVar5.D = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = zoVar.E;
        zoVar5.E = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = zoVar.G;
        zoVar5.G = Boolean.valueOf(bool == null || bool.booleanValue());
        zo zoVar6 = this.b;
        int i6 = zoVar.y;
        zoVar6.y = i6 == -2 ? typedArrayD.getInt(21, -2) : i6;
        zo zoVar7 = this.b;
        int i7 = zoVar.z;
        zoVar7.z = i7 == -2 ? typedArrayD.getInt(22, -2) : i7;
        zo zoVar8 = this.b;
        Integer num = zoVar.r;
        zoVar8.r = Integer.valueOf(num == null ? typedArrayD.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        zo zoVar9 = this.b;
        Integer num2 = zoVar.s;
        zoVar9.s = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(6, 0) : num2.intValue());
        zo zoVar10 = this.b;
        Integer num3 = zoVar.t;
        zoVar10.t = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        zo zoVar11 = this.b;
        Integer num4 = zoVar.u;
        zoVar11.u = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(16, 0) : num4.intValue());
        zo zoVar12 = this.b;
        Integer num5 = zoVar.o;
        zoVar12.o = Integer.valueOf(num5 == null ? h12.s(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        zo zoVar13 = this.b;
        Integer num6 = zoVar.q;
        zoVar13.q = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = zoVar.p;
        if (num7 != null) {
            this.b.p = num7;
        } else {
            boolean zHasValue2 = typedArrayD.hasValue(9);
            zo zoVar14 = this.b;
            if (zHasValue2) {
                zoVar14.p = Integer.valueOf(h12.s(context, typedArrayD, 9).getDefaultColor());
            } else {
                this.b.p = Integer.valueOf(new rr4(context, zoVar14.q.intValue()).j.getDefaultColor());
            }
        }
        zo zoVar15 = this.b;
        Integer num8 = zoVar.F;
        zoVar15.F = Integer.valueOf(num8 == null ? typedArrayD.getInt(2, 8388661) : num8.intValue());
        zo zoVar16 = this.b;
        Integer num9 = zoVar.H;
        zoVar16.H = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        zo zoVar17 = this.b;
        Integer num10 = zoVar.I;
        zoVar17.I = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        zo zoVar18 = this.b;
        Integer num11 = zoVar.J;
        zoVar18.J = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(18, 0) : num11.intValue());
        zo zoVar19 = this.b;
        Integer num12 = zoVar.K;
        zoVar19.K = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(25, 0) : num12.intValue());
        zo zoVar20 = this.b;
        Integer num13 = zoVar.L;
        zoVar20.L = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(19, zoVar20.J.intValue()) : num13.intValue());
        zo zoVar21 = this.b;
        Integer num14 = zoVar.M;
        zoVar21.M = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(26, zoVar21.K.intValue()) : num14.intValue());
        zo zoVar22 = this.b;
        Integer num15 = zoVar.P;
        zoVar22.P = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(20, 0) : num15.intValue());
        zo zoVar23 = this.b;
        Integer num16 = zoVar.N;
        zoVar23.N = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        zo zoVar24 = this.b;
        Integer num17 = zoVar.O;
        zoVar24.O = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        zo zoVar25 = this.b;
        Boolean bool2 = zoVar.Q;
        zoVar25.Q = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = zoVar.A;
        zo zoVar26 = this.b;
        if (locale == null) {
            zoVar26.A = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            zoVar26.A = locale;
        }
        this.a = zoVar;
    }
}
