package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public d00(int r4, int r5) {
        ArrayList r0 = new ArrayList();
        this.a = r0;
        ArrayList r1 = new ArrayList();
        this.b = r1;
        StringBuilder r2 = new StringBuilder();
        this.c = r2;
        this.g = r4;
        r0.clear();
        r1.clear();
        r2.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = r5;
    }

    public final void a(char r3) {
        StringBuilder r2 = this.c;
        if (r2.length() >= 32) goto L6;
        r2.append(r3);
        return;
    }

    public final void b() {
        StringBuilder r0 = this.c;
        int r1 = r0.length();
        if (r1 <= 0) goto L9;
        r0.delete(r1 - 1, r1);
        ArrayList r4 = this.a;
        int r2 = r4.size() - 1;
    L5:
        if (r2 < 0) goto L12;
        c00 r3 = (c00) r4.get(r2);
        int r5 = r3.c;
        if (r5 != r1) goto L13;
        r3.c = r5 - 1;
        r2 = r2 - 1;
        goto L5
    L13:
        return;
    L12:
        return;
    }

    public final ig0 c(int r20) {
        SpannableStringBuilder r1 = new SpannableStringBuilder();
        int r3 = 0;
    L3:
        ArrayList r4 = this.b;
        if (r3 >= r4.size()) goto L6;
        r1.append((CharSequence) r4.get(r3));
        r1.append('\n');
        r3 = r3 + 1;
        goto L3
    L6:
        r1.append(d());
        if (r1.length() != 0) goto L10;
        return null;
    L10:
        int r5 = this.e + this.f;
        int r6 = (32 - r5) - r1.length();
        int r7 = r5 - r6;
        int r9 = r20;
        if (r9 == Integer.MIN_VALUE) goto L14;
    L24:
        if (r9 != 1) goto L26;
        float r8 = 0.5f;
    L30:
        int r2 = this.d;
        if (r2 <= 7) goto L34;
        r2 = r2 - 17;
    L37:
        return new ig0(r1, Layout.Alignment.ALIGN_NORMAL, null, null, r2, 1, Integer.MIN_VALUE, r8, r9, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    L34:
        if (this.g != 1) goto L37;
        r2 = r2 - (this.h - 1);
        goto L37
    L26:
        if (r9 == 2) goto L28;
    L27:
        r8 = ((r5 / 32.0f) * 0.8f) + 0.1f;
        goto L30
    L28:
        r5 = 32 - r6;
        goto L27
    L14:
        if (this.g != 2) goto L20;
        if (Math.abs(r7) < 3) goto L18;
        if (r6 >= 0) goto L20;
    L18:
        r9 = 1;
    L20:
        if (this.g != 2) goto L23;
        if (r7 <= 0) goto L23;
        r9 = 2;
    L23:
        r9 = 0;
        goto L24
    }

    public final SpannableString d() {
        SpannableStringBuilder r1 = new SpannableStringBuilder(this.c);
        int r2 = r1.length();
        int r6 = -1;
        int r7 = -1;
        int r9 = -1;
        int r10 = -1;
        int r5 = 0;
        int r8 = 0;
        boolean r11 = false;
    L3:
        ArrayList r12 = this.a;
        if (r5 >= r12.size()) goto L39;
        c00 r13 = (c00) r12.get(r5);
        boolean r4 = r13.b;
        int r14 = r13.a;
        if (r14 != 8) goto L8;
    L15:
        int r15 = r13.c;
        r5 = r5 + 1;
        if (r5 >= r12.size()) goto L18;
        int r16 = ((c00) r12.get(r5)).c;
    L19:
        if (r15 == r16) goto L3;
        if (r6 == (-1)) goto L24;
        if (r4 == true) goto L24;
        r1.setSpan(new UnderlineSpan(), r6, r15, 33);
        r6 = -1;
    L27:
        if (r7 == (-1)) goto L30;
        if (r11 == true) goto L30;
        r1.setSpan(new StyleSpan(2), r7, r15, 33);
        r7 = -1;
    L33:
        if (r10 == r9) goto L3;
        if (r9 == (-1)) goto L37;
        r1.setSpan(new ForegroundColorSpan(r9), r8, r15, 33);
    L37:
        r9 = r10;
        r8 = r15;
    L30:
        if (r7 != (-1)) goto L33;
        if (r11 == false) goto L33;
        r7 = r15;
    L24:
        if (r6 != (-1)) goto L27;
        if (r4 == false) goto L27;
        r6 = r15;
        goto L27
    L18:
        r16 = r2;
        goto L19
    L8:
        if (r14 != 7) goto L10;
        boolean r17 = true;
    L11:
        if (r14 == 7) goto L14;
        r10 = e00.B[r14];
    L14:
        r11 = r17;
        goto L15
    L10:
        r17 = false;
        goto L11
    L39:
        if (r6 == (-1)) goto L42;
        if (r6 == r2) goto L42;
        r1.setSpan(new UnderlineSpan(), r6, r2, 33);
    L42:
        if (r7 == (-1)) goto L45;
        if (r7 == r2) goto L45;
        r1.setSpan(new StyleSpan(2), r7, r2, 33);
    L45:
        if (r8 == r2) goto L50;
        if (r9 == (-1)) goto L50;
        r1.setSpan(new ForegroundColorSpan(r9), r8, r2, 33);
    L50:
        return new SpannableString(r1);
    }

    public final boolean e() {
        if (this.a.isEmpty() == true) goto L5;
        return false;
    L5:
        if (this.b.isEmpty() == true) goto L7;
        return false;
    L7:
        if (this.c.length() != 0) goto L13;
        return true;
    L13:
        return false;
    }
}
