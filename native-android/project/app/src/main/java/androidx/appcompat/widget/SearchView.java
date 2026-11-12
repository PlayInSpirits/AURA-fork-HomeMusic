package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import app.homemusic.R;
import defpackage.co4;
import defpackage.dx0;
import defpackage.e35;
import defpackage.ef;
import defpackage.j40;
import defpackage.j65;
import defpackage.jv3;
import defpackage.ns3;
import defpackage.ot;
import defpackage.pg0;
import defpackage.pn1;
import defpackage.q74;
import defpackage.r74;
import defpackage.s74;
import defpackage.st3;
import defpackage.t74;
import defpackage.u74;
import defpackage.v74;
import defpackage.wg;
import defpackage.x74;
import defpackage.z74;
import defpackage.za2;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends za2 implements j40 {
    public static final ns3 v0;
    public final SearchAutoComplete C;
    public final View D;
    public final View E;
    public final View F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final View K;
    public z74 L;
    public final Rect M;
    public final Rect N;
    public final int[] O;
    public final int[] P;
    public final ImageView Q;
    public final Drawable R;
    public final int S;
    public final int T;
    public final Intent U;
    public final Intent V;
    public final CharSequence W;
    public u74 a0;
    public View.OnFocusChangeListener b0;
    public View.OnClickListener c0;
    public boolean d0;
    public boolean e0;
    public pg0 f0;
    public boolean g0;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public String m0;
    public CharSequence n0;
    public boolean o0;
    public int p0;
    public SearchableInfo q0;
    public Bundle r0;
    public final q74 s0;
    public final q74 t0;
    public final WeakHashMap u0;

    static {
        ns3 ns3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ns3 ns3Var2 = new ns3(7);
            ns3Var2.o = null;
            ns3Var2.p = null;
            ns3Var2.q = null;
            ns3.d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                ns3Var2.o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                ns3Var2.p = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                ns3Var2.q = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            ns3Var = ns3Var2;
        }
        v0 = ns3Var;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.M = new Rect();
        this.N = new Rect();
        int i2 = 2;
        this.O = new int[2];
        this.P = new int[2];
        this.s0 = new q74(this, 0);
        this.t0 = new q74(this, 1);
        this.u0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        s74 s74Var = new s74(this);
        wg wgVar = new wg(i2, this);
        dx0 dx0Var = new dx0(i2, this);
        pn1 pn1Var = new pn1(3, this);
        int[] iArr = st3.v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        jv3 jv3Var = new jv3(context, typedArrayObtainStyledAttributes);
        j65.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.C = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.D = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.E = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.F = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.Q = imageView5;
        viewFindViewById.setBackground(jv3Var.c(20));
        viewFindViewById2.setBackground(jv3Var.c(25));
        imageView.setImageDrawable(jv3Var.c(23));
        imageView2.setImageDrawable(jv3Var.c(15));
        imageView3.setImageDrawable(jv3Var.c(12));
        imageView4.setImageDrawable(jv3Var.c(28));
        imageView5.setImageDrawable(jv3Var.c(23));
        this.R = jv3Var.c(22);
        e35.S(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.S = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.T = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(pn1Var);
        searchAutoComplete.setOnEditorActionListener(s74Var);
        searchAutoComplete.setOnItemClickListener(wgVar);
        searchAutoComplete.setOnItemSelectedListener(dx0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new r74(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.W = typedArrayObtainStyledAttributes.getText(14);
        this.h0 = typedArrayObtainStyledAttributes.getText(21);
        int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        jv3Var.g();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.U = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.V = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ot(2, this));
        }
        w(this.d0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.j0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.j0 = false;
    }

    public int getImeOptions() {
        return this.C.getImeOptions();
    }

    public int getInputType() {
        return this.C.getInputType();
    }

    public int getMaxWidth() {
        return this.k0;
    }

    public CharSequence getQuery() {
        return this.C.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.q0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.W : getContext().getText(this.q0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.T;
    }

    public int getSuggestionRowLayout() {
        return this.S;
    }

    public pg0 getSuggestionsAdapter() {
        return this.f0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.n0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.r0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.q0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.r0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.C;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        ns3 ns3Var = v0;
        ns3Var.getClass();
        ns3.d();
        Method method = (Method) ns3Var.o;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        ns3Var.getClass();
        ns3.d();
        Method method2 = (Method) ns3Var.p;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.C;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.d0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        int position;
        String strG;
        Cursor cursor = this.f0.p;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                int i2 = co4.K;
                String strG2 = co4.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strG2 == null) {
                    strG2 = this.q0.getSuggestIntentAction();
                }
                if (strG2 == null) {
                    strG2 = "android.intent.action.SEARCH";
                }
                String strG3 = co4.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strG3 == null) {
                    strG3 = this.q0.getSuggestIntentData();
                }
                if (strG3 != null && (strG = co4.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strG3 = strG3 + "/" + Uri.encode(strG);
                }
                intentJ = j(strG2, strG3 == null ? null : Uri.parse(strG3), co4.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), co4.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.C.getText();
        Cursor cursor = this.f0.p;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.f0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // defpackage.j40
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.n0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.p0);
        this.o0 = false;
    }

    @Override // defpackage.j40
    public final void onActionViewExpanded() {
        if (this.o0) {
            return;
        }
        this.o0 = true;
        SearchAutoComplete searchAutoComplete = this.C;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.p0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.s0);
        post(this.t0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.za2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.C;
            int[] iArr = this.O;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.P;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.M;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.N;
            rect2.set(i7, 0, i8, i9);
            z74 z74Var = this.L;
            if (z74Var == null) {
                z74 z74Var2 = new z74(searchAutoComplete, rect2, rect);
                this.L = z74Var2;
                setTouchDelegate(z74Var2);
            } else {
                z74Var.b.set(rect2);
                Rect rect3 = z74Var.d;
                rect3.set(rect2);
                int i10 = -z74Var.e;
                rect3.inset(i10, i10);
                z74Var.c.set(rect);
            }
        }
    }

    @Override // defpackage.za2, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.e0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.k0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.k0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.k0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x74)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x74 x74Var = (x74) parcelable;
        super.onRestoreInstanceState(x74Var.n);
        w(x74Var.p);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x74 x74Var = new x74(super.onSaveInstanceState());
        x74Var.p = this.e0;
        return x74Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.s0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.C;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        u74 u74Var = this.a0;
        if (u74Var == null || !u74Var.onQueryTextSubmit(text.toString())) {
            if (this.q0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.C.getText());
        int i = (!zIsEmpty || (this.d0 && !this.o0)) ? 0 : 8;
        ImageView imageView = this.I;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.j0 || !isFocusable()) {
            return false;
        }
        if (this.e0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.C.requestFocus(i, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.C.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.r0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.C.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.C.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.k0 = i;
        requestLayout();
    }

    public void setOnCloseListener(t74 t74Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(u74 u74Var) {
        this.a0 = u74Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.c0 = onClickListener;
    }

    public void setOnSuggestionListener(v74 v74Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.h0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.i0 = z;
        pg0 pg0Var = this.f0;
        if (pg0Var instanceof co4) {
            ((co4) pg0Var).C = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.q0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.C;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.q0.getImeOptions());
            int inputType = this.q0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.q0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            pg0 pg0Var = this.f0;
            if (pg0Var != null) {
                pg0Var.b(null);
            }
            if (this.q0.getSuggestAuthority() != null) {
                co4 co4Var = new co4(getContext(), this, this.q0, this.u0);
                this.f0 = co4Var;
                searchAutoComplete.setAdapter(co4Var);
                ((co4) this.f0).C = this.i0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.q0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.q0.getVoiceSearchLaunchWebSearch()) {
                intent = this.U;
            } else if (this.q0.getVoiceSearchLaunchRecognizer()) {
                intent = this.V;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.l0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.e0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.g0 = z;
        w(this.e0);
    }

    public void setSuggestionsAdapter(pg0 pg0Var) {
        this.f0 = pg0Var;
        this.C.setAdapter(pg0Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.d0;
        SearchAutoComplete searchAutoComplete = this.C;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.R) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.F.setVisibility(((this.g0 || this.l0) && !this.e0 && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z) {
        boolean z2 = this.g0;
        this.H.setVisibility((!z2 || !(z2 || this.l0) || this.e0 || !hasFocus() || (!z && this.l0)) ? 8 : 0);
    }

    public final void w(boolean z) {
        this.e0 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i2);
        v(!zIsEmpty);
        this.D.setVisibility(z ? 8 : 0);
        ImageView imageView = this.Q;
        imageView.setVisibility((imageView.getDrawable() == null || this.d0) ? 8 : 0);
        r();
        if (this.l0 && !this.e0 && zIsEmpty) {
            this.H.setVisibility(8);
            i = 0;
        }
        this.J.setVisibility(i);
        u();
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class SearchAutoComplete extends ef {
        public int r;
        public SearchView s;
        public boolean t;
        public final d u;

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.u = new d(this);
            this.r = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            ns3 ns3Var = SearchView.v0;
            ns3Var.getClass();
            ns3.d();
            Method method = (Method) ns3Var.q;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.r <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.ef, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.t) {
                d dVar = this.u;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.s;
            searchView.w(searchView.e0);
            searchView.post(searchView.s0);
            if (searchView.C.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.s.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.s.hasFocus() && getVisibility() == 0) {
                this.t = true;
                Context context = getContext();
                ns3 ns3Var = SearchView.v0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.u;
            if (!z) {
                this.t = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.t = true;
                    return;
                }
                this.t = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.s = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.r = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
