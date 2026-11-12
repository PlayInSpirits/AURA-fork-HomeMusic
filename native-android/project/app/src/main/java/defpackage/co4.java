package defpackage;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import app.homemusic.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co4 extends pg0 implements View.OnClickListener {
    public static final /* synthetic */ int K = 0;
    public final WeakHashMap A;
    public final int B;
    public int C;
    public ColorStateList D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int u;
    public final int v;
    public final LayoutInflater w;
    public final SearchView x;
    public final SearchableInfo y;
    public final Context z;

    public co4(Context r6, SearchView r7, SearchableInfo r8, WeakHashMap r9) {
        int r0 = r7.getSuggestionRowLayout();
        this.o = true;
        this.p = null;
        this.n = false;
        this.q = -1;
        this.r = new ng0(this);
        this.s = new og0(0, this);
        this.v = r0;
        this.u = r0;
        this.w = (LayoutInflater) r6.getSystemService("layout_inflater");
        this.C = 1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.x = r7;
        this.y = r8;
        this.B = r7.getSuggestionCommitIconResId();
        this.z = r6;
        this.A = r9;
    }

    public static String g(Cursor r2, int r3) {
        if (r3 != (-1)) goto L10;
        return null;
    L10:
        return r2.getString(r3);
    L7:
        e = move-exception;
        Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
        return null;
    }

    @Override // defpackage.pg0
    public final void a(View r21, Cursor r22) {
        bo4 r3 = (bo4) r21.getTag();
        int r0 = this.J;
        if (r0 == (-1)) goto L5;
        int r6 = r22.getInt(r0);
    L6:
        TextView r7 = r3.a;
        TextView r1 = r3.b;
        ImageView r8 = r3.e;
        if (r7 == null) goto L12;
        String r10 = g(r22, this.E);
        r7.setText(r10);
        if (TextUtils.isEmpty(r10) == false) goto L11;
        r7.setVisibility(8);
        goto L12
    L11:
        r7.setVisibility(0);
    L12:
        Context r11 = this.z;
        if (r1 == null) goto L31;
        String r13 = g(r22, this.G);
        if (r13 != null) goto L17;
        CharSequence r5 = g(r22, this.F);
    L22:
        if (TextUtils.isEmpty(r5) == false) goto L25;
        if (r7 == null) goto L27;
        r7.setSingleLine(false);
        r7.setMaxLines(2);
    L27:
        r1.setText(r5);
        if (TextUtils.isEmpty(r5) == false) goto L30;
        r1.setVisibility(8);
        goto L31
    L30:
        r1.setVisibility(0);
        goto L31
    L25:
        if (r7 == null) goto L27;
        r7.setSingleLine(true);
        r7.setMaxLines(1);
        goto L27
    L17:
        if (this.D != null) goto L19;
        TypedValue r14 = new TypedValue();
        r11.getTheme().resolveAttribute(R.attr.textColorSearchUrl, r14, true);
        this.D = r11.getResources().getColorStateList(r14.resourceId);
    L19:
        SpannableString r9 = new SpannableString(r13);
        r9.setSpan(new TextAppearanceSpan(null, 0, 0, this.D, null), 0, r13.length(), 33);
        r5 = r9;
    L31:
        ImageView r12 = r3.c;
        if (r12 == null) goto L67;
        int r2 = this.H;
        if (r2 != (-1)) goto L36;
        Drawable r4 = null;
    L63:
        r12.setImageDrawable(r4);
        if (r4 != null) goto L66;
        r12.setVisibility(4);
        goto L67
    L66:
        r12.setVisibility(0);
        r4.setVisible(false, false);
        r4.setVisible(true, false);
        goto L67
    L36:
        r4 = e(r22.getString(r2));
        if (r4 != null) goto L63;
        ComponentName r15 = this.y.getSearchActivity();
        String r16 = r15.flattenToShortString();
        WeakHashMap r17 = this.A;
        if (r17.containsKey(r16) == false) goto L45;
        Drawable.ConstantState r18 = (Drawable.ConstantState) r17.get(r16);
        if (r18 != null) goto L44;
        r4 = null;
    L60:
        if (r4 != null) goto L63;
        r4 = r11.getPackageManager().getDefaultActivityIcon();
        goto L63
    L44:
        r4 = r18.newDrawable(r11.getResources());
        goto L60
    L45:
        PackageManager r19 = r11.getPackageManager();
        ActivityInfo r20 = r19.getActivityInfo(r15, 128);     // Catch: PackageManager.NameNotFoundException -> L54
        int r110 = r20.getIconResource();
        if (r110 != 0) goto L50;
    L49:
        r4 = null;
    L56:
        if (r4 != null) goto L58;
        Drawable.ConstantState r23 = null;
    L59:
        r17.put(r16, r23);
        goto L60
    L58:
        r23 = r4.getConstantState();
        goto L59
    L50:
        Drawable r24 = r19.getDrawable(r15.getPackageName(), r110, r20.applicationInfo);
        if (r24 != null) goto L53;
        StringBuilder r25 = f34.j(r110, "Invalid icon resource ", " for ");
        r25.append(r15.flattenToShortString());
        Log.w("SuggestionsAdapter", r25.toString());
        goto L49
    L53:
        r4 = r24;
    L54:
        e = move-exception;
        Log.w("SuggestionsAdapter", e.toString());
    L67:
        ImageView r26 = r3.d;
        if (r26 == null) goto L77;
        int r27 = this.I;
        if (r27 != (-1)) goto L72;
        Drawable r111 = null;
    L73:
        r26.setImageDrawable(r111);
        if (r111 != null) goto L76;
        r26.setVisibility(8);
        goto L77
    L76:
        r26.setVisibility(0);
        r111.setVisible(false, false);
        int r28 = 1;
        r111.setVisible(true, false);
    L78:
        int r29 = this.C;
        if (r29 == 2) goto L85;
        if (r29 == r28) goto L82;
    L84:
        r8.setVisibility(8);
        return;
    L82:
        if ((r6 & 1) == 0) goto L84;
    L85:
        r8.setVisibility(0);
        r8.setTag(r7.getText());
        r8.setOnClickListener(this);
        return;
    L72:
        r111 = e(r22.getString(r27));
    L77:
        r28 = 1;
        goto L78
    L5:
        r6 = 0;
        goto L6
    }

    @Override // defpackage.pg0
    public final void b(Cursor r2) {
        super.b(r2);     // Catch: Exception -> L6
        if (r2 == null) goto L11;
        this.E = r2.getColumnIndex("suggest_text_1");     // Catch: Exception -> L6
        this.F = r2.getColumnIndex("suggest_text_2");     // Catch: Exception -> L6
        this.G = r2.getColumnIndex("suggest_text_2_url");     // Catch: Exception -> L6
        this.H = r2.getColumnIndex("suggest_icon_1");     // Catch: Exception -> L6
        this.I = r2.getColumnIndex("suggest_icon_2");     // Catch: Exception -> L6
        this.J = r2.getColumnIndex("suggest_flags");     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
    }

    @Override // defpackage.pg0
    public final String c(Cursor r2) {
        if (r2 == null) goto L20;
        String r0 = g(r2, r2.getColumnIndex("suggest_intent_query"));
        if (r0 == null) goto L7;
        return r0;
    L7:
        SearchableInfo r1 = this.y;
        if (r1.shouldRewriteQueryFromData() == false) goto L13;
        String r3 = g(r2, r2.getColumnIndex("suggest_intent_data"));
        if (r3 == null) goto L13;
        return r3;
    L13:
        if (r1.shouldRewriteQueryFromText() == false) goto L17;
        String r4 = g(r2, r2.getColumnIndex("suggest_text_1"));
        if (r4 == null) goto L19;
        return r4;
    L19:
        return null;
    L17:
        return null;
    L20:
        return null;
    }

    public final Drawable d(Uri r8) {
        String r0 = r8.getAuthority();
        if (TextUtils.isEmpty(r0) == false) goto L31;
        mj0.k(r8, "No authority: ");
        return null;
    L31:
        Resources r7 = this.z.getPackageManager().getResourcesForApplication(r0);     // Catch: PackageManager.NameNotFoundException -> L25
        List<String> r1 = r8.getPathSegments();
        if (r1 == null) goto L23;
        int r3 = r1.size();
        if (r3 != 1) goto L14;
        int r2 = Integer.parseInt(r1.get(0));     // Catch: NumberFormatException -> L11
    L16:
        if (r2 != 0) goto L18;
        mj0.k(r8, "No resource found for: ");
        return null;
    L18:
        return r7.getDrawable(r2);
    L11:
        mj0.k(r8, "Single path segment is not a resource ID: ");
        return null;
    L14:
        if (r3 != 2) goto L21;
        r2 = r7.getIdentifier(r1.get(1), r1.get(0), r0);
        goto L16
    L21:
        mj0.k(r8, "More than two path segments: ");
        return null;
    L23:
        mj0.k(r8, "No path: ");
        return null;
    L25:
        mj0.k(r8, "No package found for authority: ");
        return null;
    }

    public final Drawable e(String r11) {
        WeakHashMap r0 = this.A;
        Context r2 = this.z;
        Drawable r4 = null;
        if (r11 != null) goto L5;
    L55:
        return r4;
    L5:
        if (r11.isEmpty() == true) goto L55;
        if ("0".equals(r11) == true) goto L55;
        int r5 = Integer.parseInt(r11);     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        String r3 = "android.resource://" + r2.getPackageName() + "/" + r5;     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        Drawable.ConstantState r6 = (Drawable.ConstantState) r0.get(r3);     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        if (r6 != null) goto L12;
        Drawable r7 = null;
    L13:
        if (r7 == null) goto L15;
        return r7;
    L15:
        Drawable r8 = r2.getDrawable(r5);     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        if (r8 == null) goto L18;
        r0.put(r3, r8.getConstantState());     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
    L18:
        return r8;
    L12:
        r7 = r6.newDrawable();     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
    L19:
        Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(r11));
        return null;
    L21:
        Drawable.ConstantState r9 = (Drawable.ConstantState) r0.get(r11);
        if (r9 != null) goto L24;
        Drawable r10 = null;
    L25:
        if (r10 == null) goto L27;
        return r10;
    L27:
        Uri r12 = Uri.parse(r11);
    L32:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Icon not found: " + r12 + ", " + e.getMessage());
    L53:
        if (r4 == null) goto L55;
        r0.put(r11, r4.getConstantState());
        goto L55
    L29:
        if ("android.resource".equals(r12.getScheme()) == true) goto L62;
        InputStream r13 = r2.getContentResolver().openInputStream(r12);     // Catch: FileNotFoundException -> L32
        if (r13 == null) goto L51;
        Drawable r14 = Drawable.createFromStream(r13, null);     // Catch: Throwable -> L44
    L60:
        r13.close();     // Catch: IOException -> L41
    L40:
        r4 = r14;
        goto L53
    L41:
        e = move-exception;
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + r12, e);     // Catch: FileNotFoundException -> L32
    L44:
        th = move-exception;
        r13.close();     // Catch: IOException -> L47
    L49:
        throw th;     // Catch: FileNotFoundException -> L32
    L47:
        e = move-exception;
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + r12, e);     // Catch: FileNotFoundException -> L32
        goto L49
    L51:
        throw new FileNotFoundException("Failed to open " + r12);     // Catch: FileNotFoundException -> L32
    L62:
        r4 = d(r12);     // Catch: FileNotFoundException -> L32 Resources.NotFoundException -> L34
    L35:
        throw new FileNotFoundException("Resource does not exist: " + r12);     // Catch: FileNotFoundException -> L32
    L24:
        r10 = r9.newDrawable();
        goto L25
    }

    public final Cursor f(SearchableInfo r10, String r11) {
        String[] r0 = null;
        if (r10 == null) goto L7;
        String r1 = r10.getSuggestAuthority();
        if (r1 == null) goto L7;
        Uri.Builder r2 = new Uri.Builder().scheme("content").authority(r1).query("").fragment("");
        String r3 = r10.getSuggestPath();
        if (r3 == null) goto L11;
        r2.appendEncodedPath(r3);
    L11:
        r2.appendPath("search_suggest_query");
        String r6 = r10.getSuggestSelection();
        if (r6 == null) goto L15;
        r0 = new String[]{r11};
    L14:
        String[] r7 = r0;
        r2.appendQueryParameter("limit", String.valueOf(50));
        return this.z.getContentResolver().query(r2.build(), null, r6, r7, null);
    L15:
        r2.appendPath(r11);
    L7:
        return null;
    }

    @Override // defpackage.pg0, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int r2, View r3, ViewGroup r4) {
        return super.getDropDownView(r2, r3, r4);
    L4:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
        int r5 = this.v;
        View r1 = this.w.inflate(r5, r4, false);
        if (r1 == null) goto L8;
        ((bo4) r1.getTag()).a.setText(e.toString());
    L8:
        return r1;
    }

    @Override // defpackage.pg0, android.widget.Adapter
    public final View getView(int r3, View r4, ViewGroup r5) {
        return super.getView(r3, r4, r5);
    L4:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
        int r6 = this.u;
        View r7 = this.w.inflate(r6, r5, false);
        r7.setTag(new bo4(r7));
        ((ImageView) r7.findViewById(R.id.edit_query)).setImageResource(this.B);
        ((bo4) r7.getTag()).a.setText(e.toString());
        return r7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor r1 = this.p;
        if (r1 == null) goto L5;
        Bundle r2 = r1.getExtras();
    L6:
        if (r2 == null) goto L9;
        r2.getBoolean("in_progress");
        return;
    L9:
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor r1 = this.p;
        if (r1 == null) goto L5;
        Bundle r2 = r1.getExtras();
    L6:
        if (r2 == null) goto L9;
        r2.getBoolean("in_progress");
        return;
    L9:
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        Object r3 = r2.getTag();
        if ((r3 instanceof CharSequence) == false) goto L6;
        this.x.p((CharSequence) r3);
        return;
    }
}
