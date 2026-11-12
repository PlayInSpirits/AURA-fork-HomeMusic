.class public final Lxh2;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lpp0;"
    }
.end annotation


# instance fields
.field public final B0:Ljava/util/LinkedHashSet;

.field public final C0:Ljava/util/LinkedHashSet;

.field public final D0:Ljava/util/LinkedHashSet;

.field public final E0:Ljava/util/LinkedHashSet;

.field public F0:I

.field public G0:Lze4;

.field public H0:Lcg3;

.field public I0:Ldy;

.field public J0:Lnh2;

.field public K0:I

.field public L0:Ljava/lang/CharSequence;

.field public M0:Z

.field public N0:I

.field public O0:I

.field public P0:Ljava/lang/CharSequence;

.field public Q0:I

.field public R0:Ljava/lang/CharSequence;

.field public S0:Landroid/widget/TextView;

.field public T0:Landroid/widget/TextView;

.field public U0:Lcom/google/android/material/internal/CheckableImageButton;

.field public V0:Lfi2;

.field public W0:Landroid/widget/Button;

.field public X0:Z

.field public Y0:Ljava/lang/CharSequence;

.field public Z0:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxh2;->B0:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxh2;->C0:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lxh2;->D0:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lxh2;->E0:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    return-void
.end method

.method public static p0(Landroid/content/Context;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f070548

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {}, La35;->d()Ljava/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x5

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x7

    .line 33
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->getMaximum(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 41
    .line 42
    .line 43
    const v1, 0x7f07054e

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const v2, 0x7f07055c

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    mul-int/2addr v0, v4

    .line 58
    mul-int/2addr v1, v5

    .line 59
    add-int/2addr v1, v0

    .line 60
    sub-int/2addr v5, v3

    .line 61
    mul-int/2addr v5, p0

    .line 62
    add-int/2addr v5, v1

    .line 63
    return v5
.end method

.method public static q0(Landroid/content/Context;I)Z
    .locals 2

    .line 1
    const-class v0, Lnh2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f040342

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p0, v0}, Lzz1;->F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    filled-new-array {p1}, [I

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    return p1
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lpp0;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lxh2;->F0:I

    .line 15
    .line 16
    const-string v0, "DATE_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lze4;

    .line 23
    .line 24
    iput-object v0, p0, Lxh2;->G0:Lze4;

    .line 25
    .line 26
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ldy;

    .line 33
    .line 34
    iput-object v0, p0, Lxh2;->I0:Ldy;

    .line 35
    .line 36
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lxh2;->K0:I

    .line 51
    .line 52
    const-string v0, "TITLE_TEXT_KEY"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lxh2;->L0:Ljava/lang/CharSequence;

    .line 59
    .line 60
    const-string v0, "INPUT_MODE_KEY"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v0, p0, Lxh2;->N0:I

    .line 67
    .line 68
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Lxh2;->O0:I

    .line 75
    .line 76
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lxh2;->P0:Ljava/lang/CharSequence;

    .line 83
    .line 84
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iput v0, p0, Lxh2;->Q0:I

    .line 91
    .line 92
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lxh2;->R0:Ljava/lang/CharSequence;

    .line 99
    .line 100
    iget-object p1, p0, Lxh2;->L0:Ljava/lang/CharSequence;

    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget v0, p0, Lxh2;->K0:I

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :goto_0
    iput-object p1, p0, Lxh2;->Y0:Ljava/lang/CharSequence;

    .line 120
    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "\n"

    .line 128
    .line 129
    invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    array-length v1, v0

    .line 134
    const/4 v2, 0x1

    .line 135
    if-le v1, v2, :cond_3

    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    aget-object p1, v0, p1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 p1, 0x0

    .line 142
    :cond_3
    :goto_1
    iput-object p1, p0, Lxh2;->Z0:Ljava/lang/CharSequence;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    invoke-static {}, Lkf2;->k()V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 1
    iget-boolean p3, p0, Lxh2;->M0:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const p3, 0x7f0d00fb

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const p3, 0x7f0d00fa

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, p3, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-boolean p3, p0, Lxh2;->M0:Z

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    const p3, 0x7f0a03ea

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    .line 33
    invoke-static {p2}, Lxh2;->p0(Landroid/content/Context;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, -0x2

    .line 38
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const p3, 0x7f0a03eb

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    invoke-static {p2}, Lxh2;->p0(Landroid/content/Context;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, -0x1

    .line 59
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    const p3, 0x7f0a03f6

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    check-cast p3, Landroid/widget/TextView;

    .line 73
    .line 74
    iput-object p3, p0, Lxh2;->T0:Landroid/widget/TextView;

    .line 75
    .line 76
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    invoke-virtual {p3, v0}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 80
    .line 81
    .line 82
    const p3, 0x7f0a03f8

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    check-cast p3, Lcom/google/android/material/internal/CheckableImageButton;

    .line 90
    .line 91
    iput-object p3, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 92
    .line 93
    const p3, 0x7f0a03fc

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    check-cast p3, Landroid/widget/TextView;

    .line 101
    .line 102
    iput-object p3, p0, Lxh2;->S0:Landroid/widget/TextView;

    .line 103
    .line 104
    iget-object p3, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 105
    .line 106
    const-string v1, "TOGGLE_BUTTON_TAG"

    .line 107
    .line 108
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object p3, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 112
    .line 113
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    .line 114
    .line 115
    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 116
    .line 117
    .line 118
    const v2, 0x10100a0

    .line 119
    .line 120
    .line 121
    filled-new-array {v2}, [I

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const v3, 0x7f080242

    .line 126
    .line 127
    .line 128
    invoke-static {p2, v3}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 133
    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    new-array v3, v2, [I

    .line 137
    .line 138
    const v4, 0x7f080244

    .line 139
    .line 140
    .line 141
    invoke-static {p2, v4}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {v1, v3, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p3, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 152
    .line 153
    iget p3, p0, Lxh2;->N0:I

    .line 154
    .line 155
    if-eqz p3, :cond_2

    .line 156
    .line 157
    move p3, v0

    .line 158
    goto :goto_2

    .line 159
    :cond_2
    move p3, v2

    .line 160
    :goto_2
    invoke-virtual {p2, p3}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 164
    .line 165
    const/4 p3, 0x0

    .line 166
    invoke-static {p2, p3}, Lj65;->o(Landroid/view/View;Lz2;)V

    .line 167
    .line 168
    .line 169
    iget-object p2, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 170
    .line 171
    iget p3, p0, Lxh2;->N0:I

    .line 172
    .line 173
    if-ne p3, v0, :cond_3

    .line 174
    .line 175
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    const p3, 0x7f1303a4

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    goto :goto_3

    .line 187
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    const p3, 0x7f1303a6

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    :goto_3
    iget-object p3, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 199
    .line 200
    invoke-virtual {p3, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    iget-object p2, p0, Lxh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 204
    .line 205
    new-instance p3, Lp6;

    .line 206
    .line 207
    const/16 v1, 0x1a

    .line 208
    .line 209
    invoke-direct {p3, v1, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    .line 214
    .line 215
    const p2, 0x7f0a0164

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    check-cast p2, Landroid/widget/Button;

    .line 223
    .line 224
    iput-object p2, p0, Lxh2;->W0:Landroid/widget/Button;

    .line 225
    .line 226
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    iget-object p2, p2, Lze4;->n:Ljava/lang/Long;

    .line 231
    .line 232
    if-eqz p2, :cond_4

    .line 233
    .line 234
    move p2, v0

    .line 235
    goto :goto_4

    .line 236
    :cond_4
    move p2, v2

    .line 237
    :goto_4
    iget-object p3, p0, Lxh2;->W0:Landroid/widget/Button;

    .line 238
    .line 239
    if-eqz p2, :cond_5

    .line 240
    .line 241
    invoke-virtual {p3, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_5
    invoke-virtual {p3, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 246
    .line 247
    .line 248
    :goto_5
    iget-object p2, p0, Lxh2;->W0:Landroid/widget/Button;

    .line 249
    .line 250
    const-string p3, "CONFIRM_BUTTON_TAG"

    .line 251
    .line 252
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object p2, p0, Lxh2;->P0:Ljava/lang/CharSequence;

    .line 256
    .line 257
    if-eqz p2, :cond_6

    .line 258
    .line 259
    iget-object p3, p0, Lxh2;->W0:Landroid/widget/Button;

    .line 260
    .line 261
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_6
    iget p2, p0, Lxh2;->O0:I

    .line 266
    .line 267
    if-eqz p2, :cond_7

    .line 268
    .line 269
    iget-object p3, p0, Lxh2;->W0:Landroid/widget/Button;

    .line 270
    .line 271
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(I)V

    .line 272
    .line 273
    .line 274
    :cond_7
    :goto_6
    iget-object p2, p0, Lxh2;->W0:Landroid/widget/Button;

    .line 275
    .line 276
    new-instance p3, Lvh2;

    .line 277
    .line 278
    invoke-direct {p3, p0, v2}, Lvh2;-><init>(Lxh2;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    const p2, 0x7f0a013d

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, Landroid/widget/Button;

    .line 292
    .line 293
    const-string p3, "CANCEL_BUTTON_TAG"

    .line 294
    .line 295
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object p3, p0, Lxh2;->R0:Ljava/lang/CharSequence;

    .line 299
    .line 300
    if-eqz p3, :cond_8

    .line 301
    .line 302
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_8
    iget p3, p0, Lxh2;->Q0:I

    .line 307
    .line 308
    if-eqz p3, :cond_9

    .line 309
    .line 310
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 311
    .line 312
    .line 313
    :cond_9
    :goto_7
    new-instance p3, Lvh2;

    .line 314
    .line 315
    invoke-direct {p3, p0, v0}, Lvh2;-><init>(Lxh2;I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 319
    .line 320
    .line 321
    return-object p1
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lpp0;->Q(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 5
    .line 6
    iget v1, p0, Lxh2;->F0:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DATE_SELECTOR_KEY"

    .line 12
    .line 13
    iget-object v1, p0, Lxh2;->G0:Lze4;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcy;

    .line 19
    .line 20
    iget-object v1, p0, Lxh2;->I0:Ldy;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-wide v2, Lcy;->f:J

    .line 26
    .line 27
    iput-wide v2, v0, Lcy;->a:J

    .line 28
    .line 29
    sget-wide v2, Lcy;->g:J

    .line 30
    .line 31
    iput-wide v2, v0, Lcy;->b:J

    .line 32
    .line 33
    new-instance v2, Lpi0;

    .line 34
    .line 35
    const-wide/high16 v3, -0x8000000000000000L

    .line 36
    .line 37
    invoke-direct {v2, v3, v4}, Lpi0;-><init>(J)V

    .line 38
    .line 39
    .line 40
    iput-object v2, v0, Lcy;->e:Lpi0;

    .line 41
    .line 42
    iget-object v2, v1, Ldy;->n:Lix2;

    .line 43
    .line 44
    iget-wide v2, v2, Lix2;->s:J

    .line 45
    .line 46
    iput-wide v2, v0, Lcy;->a:J

    .line 47
    .line 48
    iget-object v2, v1, Ldy;->o:Lix2;

    .line 49
    .line 50
    iget-wide v2, v2, Lix2;->s:J

    .line 51
    .line 52
    iput-wide v2, v0, Lcy;->b:J

    .line 53
    .line 54
    iget-object v2, v1, Ldy;->q:Lix2;

    .line 55
    .line 56
    iget-wide v2, v2, Lix2;->s:J

    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iput-object v2, v0, Lcy;->c:Ljava/lang/Long;

    .line 63
    .line 64
    iget v2, v1, Ldy;->r:I

    .line 65
    .line 66
    iput v2, v0, Lcy;->d:I

    .line 67
    .line 68
    iget-object v1, v1, Ldy;->p:Lpi0;

    .line 69
    .line 70
    iput-object v1, v0, Lcy;->e:Lpi0;

    .line 71
    .line 72
    iget-object v1, p0, Lxh2;->J0:Lnh2;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    if-nez v1, :cond_0

    .line 76
    .line 77
    move-object v1, v2

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-object v1, v1, Lnh2;->p0:Lix2;

    .line 80
    .line 81
    :goto_0
    if-eqz v1, :cond_1

    .line 82
    .line 83
    iget-wide v3, v1, Lix2;->s:J

    .line 84
    .line 85
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, v0, Lcy;->c:Ljava/lang/Long;

    .line 90
    .line 91
    :cond_1
    const-string v1, "CALENDAR_CONSTRAINTS_KEY"

    .line 92
    .line 93
    invoke-virtual {v0}, Lcy;->a()Ldy;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 98
    .line 99
    .line 100
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 101
    .line 102
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 106
    .line 107
    iget v1, p0, Lxh2;->K0:I

    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    const-string v0, "TITLE_TEXT_KEY"

    .line 113
    .line 114
    iget-object v1, p0, Lxh2;->L0:Ljava/lang/CharSequence;

    .line 115
    .line 116
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    const-string v0, "INPUT_MODE_KEY"

    .line 120
    .line 121
    iget v1, p0, Lxh2;->N0:I

    .line 122
    .line 123
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 127
    .line 128
    iget v1, p0, Lxh2;->O0:I

    .line 129
    .line 130
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 134
    .line 135
    iget-object v1, p0, Lxh2;->P0:Ljava/lang/CharSequence;

    .line 136
    .line 137
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 141
    .line 142
    iget v1, p0, Lxh2;->Q0:I

    .line 143
    .line 144
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 148
    .line 149
    iget-object p0, p0, Lxh2;->R0:Ljava/lang/CharSequence;

    .line 150
    .line 151
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final R()V
    .locals 12

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lpp0;->k0()Landroid/app/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-boolean v1, p0, Lxh2;->M0:Z

    .line 13
    .line 14
    if-eqz v1, :cond_10

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lxh2;->V0:Lfi2;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Lxh2;->X0:Z

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const v2, 0x7f0a0266

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    instance-of v2, v2, Landroid/graphics/drawable/ColorDrawable;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Landroid/graphics/drawable/ColorDrawable;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v2, 0x0

    .line 66
    :goto_0
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x1

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v5, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move v5, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    :goto_1
    move v5, v4

    .line 80
    :goto_2
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    const v7, 0x1010031

    .line 85
    .line 86
    .line 87
    const/high16 v8, -0x1000000

    .line 88
    .line 89
    invoke-static {v6, v7, v8}, Lg12;->s(Landroid/content/Context;II)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_4
    invoke-static {v0, v3}, Ll93;->d0(Landroid/view/Window;Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    const/16 v9, 0x1b

    .line 112
    .line 113
    if-ge v7, v9, :cond_5

    .line 114
    .line 115
    const v9, 0x1010452

    .line 116
    .line 117
    .line 118
    invoke-static {v5, v9, v8}, Lg12;->s(Landroid/content/Context;II)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/16 v8, 0x80

    .line 123
    .line 124
    invoke-static {v5, v8}, Lv50;->i(II)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move v5, v3

    .line 130
    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v5}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v2}, Lg12;->B(I)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-static {v3}, Lg12;->B(I)Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-nez v8, :cond_7

    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    move v2, v3

    .line 154
    goto :goto_5

    .line 155
    :cond_7
    :goto_4
    move v2, v4

    .line 156
    :goto_5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    new-instance v9, Lom1;

    .line 161
    .line 162
    invoke-direct {v9, v8}, Lom1;-><init>(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    const/16 v8, 0x1a

    .line 166
    .line 167
    const/16 v10, 0x1e

    .line 168
    .line 169
    const/16 v11, 0x23

    .line 170
    .line 171
    if-lt v7, v11, :cond_8

    .line 172
    .line 173
    new-instance v7, Ltb5;

    .line 174
    .line 175
    invoke-direct {v7, v0, v9}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    if-lt v7, v10, :cond_9

    .line 180
    .line 181
    new-instance v7, Lsb5;

    .line 182
    .line 183
    invoke-direct {v7, v0, v9}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_9
    if-lt v7, v8, :cond_a

    .line 188
    .line 189
    new-instance v7, Lrb5;

    .line 190
    .line 191
    invoke-direct {v7, v0, v9}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_a
    new-instance v7, Lqb5;

    .line 196
    .line 197
    invoke-direct {v7, v0, v9}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 198
    .line 199
    .line 200
    :goto_6
    invoke-virtual {v7, v2}, Lsu3;->D(Z)V

    .line 201
    .line 202
    .line 203
    invoke-static {v6}, Lg12;->B(I)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    invoke-static {v5}, Lg12;->B(I)Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-nez v6, :cond_b

    .line 212
    .line 213
    if-nez v5, :cond_c

    .line 214
    .line 215
    if-eqz v2, :cond_c

    .line 216
    .line 217
    :cond_b
    move v3, v4

    .line 218
    :cond_c
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-instance v5, Lom1;

    .line 223
    .line 224
    invoke-direct {v5, v2}, Lom1;-><init>(Landroid/view/View;)V

    .line 225
    .line 226
    .line 227
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 228
    .line 229
    if-lt v2, v11, :cond_d

    .line 230
    .line 231
    new-instance v2, Ltb5;

    .line 232
    .line 233
    invoke-direct {v2, v0, v5}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_d
    if-lt v2, v10, :cond_e

    .line 238
    .line 239
    new-instance v2, Lsb5;

    .line 240
    .line 241
    invoke-direct {v2, v0, v5}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_e
    if-lt v2, v8, :cond_f

    .line 246
    .line 247
    new-instance v2, Lrb5;

    .line 248
    .line 249
    invoke-direct {v2, v0, v5}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 250
    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_f
    new-instance v2, Lqb5;

    .line 254
    .line 255
    invoke-direct {v2, v0, v5}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 256
    .line 257
    .line 258
    :goto_7
    invoke-virtual {v2, v3}, Lsu3;->C(Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 270
    .line 271
    new-instance v3, Lj83;

    .line 272
    .line 273
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 274
    .line 275
    .line 276
    iput v2, v3, Lj83;->n:I

    .line 277
    .line 278
    iput-object v1, v3, Lj83;->p:Ljava/lang/Object;

    .line 279
    .line 280
    iput v0, v3, Lj83;->o:I

    .line 281
    .line 282
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 283
    .line 284
    invoke-static {v1, v3}, La65;->c(Landroid/view/View;Lr83;)V

    .line 285
    .line 286
    .line 287
    iput-boolean v4, p0, Lxh2;->X0:Z

    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_10
    const/4 v1, -0x2

    .line 291
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    const v2, 0x7f070550

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    new-instance v1, Landroid/graphics/Rect;

    .line 306
    .line 307
    invoke-direct {v1, v5, v5, v5, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 308
    .line 309
    .line 310
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 311
    .line 312
    iget-object v4, p0, Lxh2;->V0:Lfi2;

    .line 313
    .line 314
    move v6, v5

    .line 315
    move v7, v5

    .line 316
    move v8, v5

    .line 317
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    new-instance v2, Luz1;

    .line 328
    .line 329
    invoke-virtual {p0}, Lpp0;->k0()Landroid/app/Dialog;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-direct {v2, v3, v1}, Luz1;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 337
    .line 338
    .line 339
    :goto_8
    invoke-virtual {p0}, Lxh2;->r0()V

    .line 340
    .line 341
    .line 342
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxh2;->H0:Lcg3;

    .line 2
    .line 3
    iget-object v0, v0, Lcg3;->l0:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lpp0;->S()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 1
    new-instance p1, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v2, p0, Lxh2;->F0:I

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-class v2, Lxh2;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, 0x7f040343

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v1, v2}, Lzz1;->F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget v2, v1, Landroid/util/TypedValue;->data:I

    .line 37
    .line 38
    :goto_0
    invoke-direct {p1, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const v1, 0x101020d

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lxh2;->q0(Landroid/content/Context;I)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iput-boolean v1, p0, Lxh2;->M0:Z

    .line 53
    .line 54
    new-instance v1, Lfi2;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const v3, 0x7f040342

    .line 58
    .line 59
    .line 60
    const v4, 0x7f14049b

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v0, v2, v3, v4}, Lfi2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lxh2;->V0:Lfi2;

    .line 67
    .line 68
    sget-object v1, Lht3;->x:[I

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v2, 0x1

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lxh2;->V0:Lfi2;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Lfi2;->j(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lxh2;->V0:Lfi2;

    .line 89
    .line 90
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, Lxh2;->V0:Lfi2;

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p0, v0}, Lfi2;->l(F)V

    .line 114
    .line 115
    .line 116
    return-object p1
.end method

.method public final n0()Lze4;
    .locals 2

    .line 1
    iget-object v0, p0, Lxh2;->G0:Lze4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v1, "DATE_SELECTOR_KEY"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lze4;

    .line 14
    .line 15
    iput-object v0, p0, Lxh2;->G0:Lze4;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lxh2;->G0:Lze4;

    .line 18
    .line 19
    return-object p0
.end method

.method public final o0()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, v0, Lze4;->n:Ljava/lang/Long;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const v0, 0x7f13038c

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1}, Lhw;->q(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const v1, 0x7f13038a

    .line 37
    .line 38
    .line 39
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v1, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxh2;->D0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/content/DialogInterface$OnCancelListener;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxh2;->E0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lkc1;->T:Landroid/view/View;

    .line 24
    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-super {p0, p1}, Lpp0;->onDismiss(Landroid/content/DialogInterface;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final r0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lxh2;->F0:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-class v1, Lxh2;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v2, 0x7f040343

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Lzz1;->F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, v0, Landroid/util/TypedValue;->data:I

    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p0, Lxh2;->I0:Ldy;

    .line 37
    .line 38
    new-instance v3, Lnh2;

    .line 39
    .line 40
    invoke-direct {v3}, Lnh2;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v4, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v5, "THEME_RES_ID_KEY"

    .line 49
    .line 50
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    const-string v6, "GRID_SELECTOR_KEY"

    .line 54
    .line 55
    invoke-virtual {v4, v6, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 59
    .line 60
    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 61
    .line 62
    .line 63
    const-string v6, "DAY_VIEW_DECORATOR_KEY"

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-virtual {v4, v6, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 67
    .line 68
    .line 69
    const-string v6, "CURRENT_MONTH_KEY"

    .line 70
    .line 71
    iget-object v2, v2, Ldy;->q:Lix2;

    .line 72
    .line 73
    invoke-virtual {v4, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v4}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 77
    .line 78
    .line 79
    iput-object v3, p0, Lxh2;->J0:Lnh2;

    .line 80
    .line 81
    iget v2, p0, Lxh2;->N0:I

    .line 82
    .line 83
    const/4 v4, 0x1

    .line 84
    if-ne v2, v4, :cond_1

    .line 85
    .line 86
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v3, p0, Lxh2;->I0:Ldy;

    .line 91
    .line 92
    new-instance v6, Lii2;

    .line 93
    .line 94
    invoke-direct {v6}, Lii2;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v8, Landroid/os/Bundle;

    .line 98
    .line 99
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    const-string v1, "DATE_SELECTOR_KEY"

    .line 106
    .line 107
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v8}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 114
    .line 115
    .line 116
    move-object v3, v6

    .line 117
    :cond_1
    iput-object v3, p0, Lxh2;->H0:Lcg3;

    .line 118
    .line 119
    iget-object v0, p0, Lxh2;->S0:Landroid/widget/TextView;

    .line 120
    .line 121
    iget v1, p0, Lxh2;->N0:I

    .line 122
    .line 123
    if-ne v1, v4, :cond_2

    .line 124
    .line 125
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 134
    .line 135
    const/4 v2, 0x2

    .line 136
    if-ne v1, v2, :cond_2

    .line 137
    .line 138
    iget-object v1, p0, Lxh2;->Z0:Ljava/lang/CharSequence;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    iget-object v1, p0, Lxh2;->Y0:Ljava/lang/CharSequence;

    .line 142
    .line 143
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lxh2;->o0()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p0, v0}, Lxh2;->s0(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lkc1;->m()Lld1;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v1, Lpo;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Lpo;-><init>(Lld1;)V

    .line 163
    .line 164
    .line 165
    const v0, 0x7f0a03ea

    .line 166
    .line 167
    .line 168
    iget-object v2, p0, Lxh2;->H0:Lcg3;

    .line 169
    .line 170
    invoke-virtual {v1, v0, v2, v7}, Lpo;->j(ILkc1;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Lpo;->f()V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lxh2;->H0:Lcg3;

    .line 177
    .line 178
    new-instance v1, Lwh2;

    .line 179
    .line 180
    const/4 v2, 0x0

    .line 181
    invoke-direct {v1, v2, p0}, Lwh2;-><init>(ILkc1;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lcg3;->h0(Lwh2;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final s0(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxh2;->T0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxh2;->n0()Lze4;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v1, v1, Lze4;->n:Ljava/lang/Long;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const v1, 0x7f130387

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Lhw;->q(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    const v3, 0x7f130386

    .line 39
    .line 40
    .line 41
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v2, v3, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lxh2;->T0:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
