.class public abstract Lkp3;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final l0:Ljp3;

.field public m0:Lpp3;

.field public n0:Landroidx/recyclerview/widget/RecyclerView;

.field public o0:Z

.field public p0:Z

.field public q0:I

.field public final r0:Lzk;

.field public final s0:Lg5;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljp3;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljp3;-><init>(Lkp3;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lkp3;->l0:Ljp3;

    .line 10
    .line 11
    const v0, 0x7f0d0120

    .line 12
    .line 13
    .line 14
    iput v0, p0, Lkp3;->q0:I

    .line 15
    .line 16
    new-instance v0, Lzk;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/16 v2, 0xb

    .line 23
    .line 24
    invoke-direct {v0, p0, v1, v2}, Lzk;-><init>(Ljava/lang/Object;Landroid/os/Looper;I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lkp3;->r0:Lzk;

    .line 28
    .line 29
    new-instance v0, Lg5;

    .line 30
    .line 31
    const/16 v1, 0x17

    .line 32
    .line 33
    invoke-direct {v0, v1, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lkp3;->s0:Lg5;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/util/TypedValue;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f04040e

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const p1, 0x7f1401a3

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lpp3;

    .line 44
    .line 45
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p1, v0}, Lpp3;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lkp3;->m0:Lpp3;

    .line 53
    .line 54
    iput-object p0, p1, Lpp3;->j:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const-string v0, "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 p1, 0x0

    .line 68
    :goto_0
    invoke-virtual {p0, p1}, Lkp3;->i0(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/4 v0, 0x0

    .line 6
    sget-object v1, Lbt3;->h:[I

    .line 7
    .line 8
    const v2, 0x7f040407

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iget v1, p0, Lkp3;->q0:I

    .line 17
    .line 18
    invoke-virtual {p3, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Lkp3;->q0:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {p3, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v4, 0x2

    .line 30
    const/4 v5, -0x1

    .line 31
    invoke-virtual {p3, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v6, 0x3

    .line 36
    invoke-virtual {p3, v6, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget p3, p0, Lkp3;->q0:I

    .line 52
    .line 53
    invoke-virtual {p1, p3, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const p3, 0x102003f

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    instance-of v7, p3, Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-eqz v7, :cond_8

    .line 67
    .line 68
    check-cast p3, Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v7, "android.hardware.type.automotive"

    .line 79
    .line 80
    invoke-virtual {v0, v7}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    const v0, 0x7f0a0517

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 94
    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const v0, 0x7f0d0122

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    move-object v0, p1

    .line 106
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 109
    .line 110
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 117
    .line 118
    .line 119
    new-instance p1, Lqp3;

    .line 120
    .line 121
    invoke-direct {p1, v0}, Lqp3;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lex3;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    iput-object v0, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 128
    .line 129
    iget-object p1, p0, Lkp3;->l0:Ljp3;

    .line 130
    .line 131
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 132
    .line 133
    .line 134
    if-eqz v2, :cond_1

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    iput v0, p1, Ljp3;->b:I

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_1
    iput v3, p1, Ljp3;->b:I

    .line 147
    .line 148
    :goto_1
    iput-object v2, p1, Ljp3;->a:Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    iget-object v0, p1, Ljp3;->d:Lkp3;

    .line 151
    .line 152
    iget-object v1, v0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 153
    .line 154
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    const-string v3, "Cannot invalidate item decorations during a scroll or layout"

    .line 161
    .line 162
    if-nez v2, :cond_2

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_2
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->A:Lmw3;

    .line 166
    .line 167
    if-eqz v2, :cond_3

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Lmw3;->c(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->T()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 176
    .line 177
    .line 178
    :goto_2
    if-eq v4, v5, :cond_6

    .line 179
    .line 180
    iput v4, p1, Ljp3;->b:I

    .line 181
    .line 182
    iget-object v0, v0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_4

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_4
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Lmw3;

    .line 194
    .line 195
    if-eqz v1, :cond_5

    .line 196
    .line 197
    invoke-virtual {v1, v3}, Lmw3;->c(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->T()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 204
    .line 205
    .line 206
    :cond_6
    :goto_3
    iput-boolean v6, p1, Ljp3;->c:Z

    .line 207
    .line 208
    iget-object p1, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-nez p1, :cond_7

    .line 215
    .line 216
    iget-object p1, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 217
    .line 218
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 219
    .line 220
    .line 221
    :cond_7
    iget-object p1, p0, Lkp3;->r0:Lzk;

    .line 222
    .line 223
    iget-object p0, p0, Lkp3;->s0:Lg5;

    .line 224
    .line 225
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 226
    .line 227
    .line 228
    return-object p2

    .line 229
    :cond_8
    const-string p0, "Content has view with id attribute \'android.R.id.list_container\' that is not a ViewGroup class"

    .line 230
    .line 231
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object v0
.end method

.method public J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkp3;->s0:Lg5;

    .line 2
    .line 3
    iget-object v1, p0, Lkp3;->r0:Lzk;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p0, Lkp3;->o0:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lkp3;->m0:Lpp3;

    .line 23
    .line 24
    iget-object v1, v1, Lpp3;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroidx/preference/PreferenceScreen;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/preference/PreferenceGroup;->n()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iput-object v2, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 36
    .line 37
    return-void
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lkp3;->m0:Lpp3;

    .line 2
    .line 3
    iget-object p0, p0, Lpp3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroidx/preference/PreferenceScreen;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/preference/PreferenceGroup;->c(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    const-string p0, "android:preferences"

    .line 18
    .line 19
    invoke-virtual {p1, p0, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public R()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lkp3;->m0:Lpp3;

    .line 5
    .line 6
    iput-object p0, v0, Lpp3;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p0, v0, Lpp3;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public S()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object p0, p0, Lkp3;->m0:Lpp3;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lpp3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lpp3;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string p1, "android:preferences"

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lkp3;->m0:Lpp3;

    .line 12
    .line 13
    iget-object p2, p2, Lpp3;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Landroidx/preference/PreferenceScreen;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroidx/preference/PreferenceGroup;->b(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-boolean p1, p0, Lkp3;->o0:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lkp3;->m0:Lpp3;

    .line 27
    .line 28
    iget-object p1, p1, Lpp3;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Landroidx/preference/PreferenceScreen;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p2, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    new-instance v0, Lnp3;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Lnp3;-><init>(Landroidx/preference/PreferenceGroup;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/preference/PreferenceGroup;->j()V

    .line 45
    .line 46
    .line 47
    :cond_1
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, p0, Lkp3;->p0:Z

    .line 49
    .line 50
    return-void
.end method

.method public final h0(Ljava/lang/String;)Landroidx/preference/Preference;
    .locals 1

    .line 1
    iget-object p0, p0, Lkp3;->m0:Lpp3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object p0, p0, Lpp3;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroidx/preference/PreferenceScreen;

    .line 10
    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/preference/PreferenceGroup;->F(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public abstract i0(Ljava/lang/String;)V
.end method

.method public final j0(ILjava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lkp3;->m0:Lpp3;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    iput-boolean v2, v0, Lpp3;->a:Z

    .line 11
    .line 12
    new-instance v3, Lop3;

    .line 13
    .line 14
    invoke-direct {v3, v1, v0}, Lop3;-><init>(Landroid/content/Context;Lpp3;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-virtual {v3, p1}, Lop3;->c(Landroid/content/res/XmlResourceParser;)Landroidx/preference/PreferenceGroup;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 30
    .line 31
    .line 32
    check-cast v1, Landroidx/preference/PreferenceScreen;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroidx/preference/Preference;->k(Lpp3;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, Lpp3;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 44
    .line 45
    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    iput-boolean p1, v0, Lpp3;->a:Z

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1, p2}, Landroidx/preference/PreferenceGroup;->F(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of p1, v1, Landroidx/preference/PreferenceScreen;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string p0, "Preference object with key "

    .line 61
    .line 62
    const-string p1, " is not a PreferenceScreen"

    .line 63
    .line 64
    invoke-static {p0, p2, p1}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    :goto_0
    check-cast v1, Landroidx/preference/PreferenceScreen;

    .line 73
    .line 74
    iget-object p1, p0, Lkp3;->m0:Lpp3;

    .line 75
    .line 76
    iget-object p2, p1, Lpp3;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p2, Landroidx/preference/PreferenceScreen;

    .line 79
    .line 80
    if-eq v1, p2, :cond_5

    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p2}, Landroidx/preference/PreferenceGroup;->n()V

    .line 85
    .line 86
    .line 87
    :cond_3
    iput-object v1, p1, Lpp3;->g:Ljava/lang/Object;

    .line 88
    .line 89
    iput-boolean v2, p0, Lkp3;->o0:Z

    .line 90
    .line 91
    iget-boolean p1, p0, Lkp3;->p0:Z

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    iget-object p0, p0, Lkp3;->r0:Lzk;

    .line 96
    .line 97
    invoke-virtual {p0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-virtual {p0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_1
    return-void

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :cond_6
    const-string p0, "This should be called after super.onCreate."

    .line 118
    .line 119
    invoke-static {p0}, Ltb4;->e(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method
