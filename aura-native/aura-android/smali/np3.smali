.class public final Lnp3;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Landroidx/preference/PreferenceGroup;

.field public r:Ljava/util/ArrayList;

.field public s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;

.field public final u:Landroid/os/Handler;

.field public final v:Lg5;


# direct methods
.method public constructor <init>(Landroidx/preference/PreferenceGroup;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg5;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lnp3;->v:Lg5;

    .line 12
    .line 13
    iput-object p1, p0, Lnp3;->q:Landroidx/preference/PreferenceGroup;

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lnp3;->u:Landroid/os/Handler;

    .line 25
    .line 26
    iput-object p0, p1, Landroidx/preference/Preference;->U:Lnp3;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lnp3;->r:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lnp3;->s:Ljava/util/ArrayList;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lnp3;->t:Ljava/util/ArrayList;

    .line 48
    .line 49
    instance-of v0, p1, Landroidx/preference/PreferenceScreen;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    check-cast p1, Landroidx/preference/PreferenceScreen;

    .line 54
    .line 55
    iget-boolean p1, p1, Landroidx/preference/PreferenceScreen;->j0:Z

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ldw3;->o(Z)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 p1, 0x1

    .line 62
    invoke-virtual {p0, p1}, Ldw3;->o(Z)V

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-virtual {p0}, Lnp3;->s()V

    .line 66
    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnp3;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(I)J
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldw3;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p0, -0x1

    .line 6
    .line 7
    return-wide p0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lnp3;->r(I)Landroidx/preference/Preference;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroidx/preference/Preference;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    return-wide p0
.end method

.method public final c(I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lnp3;->r(I)Landroidx/preference/Preference;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lmp3;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lmp3;-><init>(Landroidx/preference/Preference;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnp3;->t:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v1, -0x1

    .line 17
    if-eq p1, v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return p1
.end method

.method public final g(Lcx3;I)V
    .locals 3

    .line 1
    check-cast p1, Lrp3;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lnp3;->r(I)Landroidx/preference/Preference;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p2, p1, Lrp3;->v:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v0, p1, Lcx3;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p1, Lrp3;->u:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const v0, 0x1020016

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lrp3;->s(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/TextView;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->l(Lrp3;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 4

    .line 1
    iget-object p0, p0, Lnp3;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmp3;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    sget-object v2, Lbt3;->a:[I

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const v3, 0x1080062

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lmp3;->a:I

    .line 50
    .line 51
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    const v0, 0x1020018

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Landroid/view/ViewGroup;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget p0, p0, Lmp3;->b:I

    .line 78
    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const/16 p0, 0x8

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    new-instance p0, Lrp3;

    .line 91
    .line 92
    invoke-direct {p0, p1}, Lrp3;-><init>(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    return-object p0
.end method

.method public final p(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    move v5, v4

    .line 20
    :goto_0
    const/4 v6, 0x0

    .line 21
    const v7, 0x7fffffff

    .line 22
    .line 23
    .line 24
    if-ge v4, v2, :cond_a

    .line 25
    .line 26
    invoke-virtual {p1, v4}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    iget-boolean v9, v8, Landroidx/preference/Preference;->K:Z

    .line 31
    .line 32
    if-nez v9, :cond_0

    .line 33
    .line 34
    goto :goto_7

    .line 35
    :cond_0
    iget v9, p1, Landroidx/preference/PreferenceGroup;->h0:I

    .line 36
    .line 37
    if-eq v9, v7, :cond_2

    .line 38
    .line 39
    if-ge v5, v9, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :goto_2
    instance-of v9, v8, Landroidx/preference/PreferenceGroup;

    .line 50
    .line 51
    if-nez v9, :cond_3

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_7

    .line 56
    :cond_3
    check-cast v8, Landroidx/preference/PreferenceGroup;

    .line 57
    .line 58
    instance-of v9, v8, Landroidx/preference/PreferenceScreen;

    .line 59
    .line 60
    if-eqz v9, :cond_4

    .line 61
    .line 62
    goto :goto_7

    .line 63
    :cond_4
    iget v9, p1, Landroidx/preference/PreferenceGroup;->h0:I

    .line 64
    .line 65
    if-eq v9, v7, :cond_6

    .line 66
    .line 67
    iget v9, v8, Landroidx/preference/PreferenceGroup;->h0:I

    .line 68
    .line 69
    if-ne v9, v7, :cond_5

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_5
    const-string p0, "Nesting an expandable group inside of another expandable group is not supported!"

    .line 73
    .line 74
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v6

    .line 78
    :cond_6
    :goto_3
    invoke-virtual {p0, v8}, Lnp3;->p(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    move v9, v3

    .line 87
    :goto_4
    if-ge v9, v8, :cond_9

    .line 88
    .line 89
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    add-int/lit8 v9, v9, 0x1

    .line 94
    .line 95
    check-cast v10, Landroidx/preference/Preference;

    .line 96
    .line 97
    iget v11, p1, Landroidx/preference/PreferenceGroup;->h0:I

    .line 98
    .line 99
    if-eq v11, v7, :cond_8

    .line 100
    .line 101
    if-ge v5, v11, :cond_7

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_8
    :goto_5
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_9
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_a
    iget v2, p1, Landroidx/preference/PreferenceGroup;->h0:I

    .line 118
    .line 119
    if-eq v2, v7, :cond_11

    .line 120
    .line 121
    if-le v5, v2, :cond_11

    .line 122
    .line 123
    new-instance v2, Lu41;

    .line 124
    .line 125
    iget-object v4, p1, Landroidx/preference/Preference;->n:Landroid/content/Context;

    .line 126
    .line 127
    iget-wide v7, p1, Landroidx/preference/Preference;->p:J

    .line 128
    .line 129
    invoke-direct {v2, v4, v6}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 130
    .line 131
    .line 132
    const v4, 0x7f0d005f

    .line 133
    .line 134
    .line 135
    iput v4, v2, Landroidx/preference/Preference;->S:I

    .line 136
    .line 137
    const v4, 0x7f08010b

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/preference/Preference;->v(I)V

    .line 141
    .line 142
    .line 143
    const v4, 0x7f13014a

    .line 144
    .line 145
    .line 146
    iget-object v5, v2, Landroidx/preference/Preference;->n:Landroid/content/Context;

    .line 147
    .line 148
    invoke-virtual {v5, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v2, v4}, Landroidx/preference/Preference;->z(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget v4, v2, Landroidx/preference/Preference;->t:I

    .line 156
    .line 157
    const/16 v9, 0x3e7

    .line 158
    .line 159
    if-eq v9, v4, :cond_b

    .line 160
    .line 161
    iput v9, v2, Landroidx/preference/Preference;->t:I

    .line 162
    .line 163
    iget-object v4, v2, Landroidx/preference/Preference;->U:Lnp3;

    .line 164
    .line 165
    if-eqz v4, :cond_b

    .line 166
    .line 167
    iget-object v9, v4, Lnp3;->u:Landroid/os/Handler;

    .line 168
    .line 169
    iget-object v4, v4, Lnp3;->v:Lg5;

    .line 170
    .line 171
    invoke-virtual {v9, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 175
    .line 176
    .line 177
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    :cond_c
    :goto_8
    if-ge v3, v9, :cond_10

    .line 187
    .line 188
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    add-int/lit8 v3, v3, 0x1

    .line 193
    .line 194
    check-cast v10, Landroidx/preference/Preference;

    .line 195
    .line 196
    iget-object v11, v10, Landroidx/preference/Preference;->u:Ljava/lang/CharSequence;

    .line 197
    .line 198
    instance-of v12, v10, Landroidx/preference/PreferenceGroup;

    .line 199
    .line 200
    if-eqz v12, :cond_d

    .line 201
    .line 202
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    if-nez v13, :cond_d

    .line 207
    .line 208
    move-object v13, v10

    .line 209
    check-cast v13, Landroidx/preference/PreferenceGroup;

    .line 210
    .line 211
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    :cond_d
    iget-object v13, v10, Landroidx/preference/Preference;->W:Landroidx/preference/PreferenceGroup;

    .line 215
    .line 216
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    if-eqz v13, :cond_e

    .line 221
    .line 222
    if-eqz v12, :cond_c

    .line 223
    .line 224
    check-cast v10, Landroidx/preference/PreferenceGroup;

    .line 225
    .line 226
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_e
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-nez v10, :cond_c

    .line 235
    .line 236
    if-nez v6, :cond_f

    .line 237
    .line 238
    move-object v6, v11

    .line 239
    goto :goto_8

    .line 240
    :cond_f
    const v10, 0x7f130560

    .line 241
    .line 242
    .line 243
    filled-new-array {v6, v11}, [Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-virtual {v5, v10, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    goto :goto_8

    .line 252
    :cond_10
    invoke-virtual {v2, v6}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    const-wide/32 v3, 0xf4240

    .line 256
    .line 257
    .line 258
    add-long/2addr v7, v3

    .line 259
    iput-wide v7, v2, Lu41;->b0:J

    .line 260
    .line 261
    new-instance v1, Lqr2;

    .line 262
    .line 263
    const/16 v3, 0x10

    .line 264
    .line 265
    invoke-direct {v1, v3, p0, p1}, Lqr2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    iput-object v1, v2, Landroidx/preference/Preference;->s:Lcp3;

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    :cond_11
    return-object v0
.end method

.method public final q(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V
    .locals 5

    .line 1
    monitor-enter p2

    .line 2
    :try_start_0
    iget-object v0, p2, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 5
    .line 6
    .line 7
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object v0, p2, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v3, Lmp3;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lmp3;-><init>(Landroidx/preference/Preference;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, Lnp3;->t:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    iget-object v4, p0, Lnp3;->t:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    instance-of v3, v2, Landroidx/preference/PreferenceGroup;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    move-object v3, v2

    .line 47
    check-cast v3, Landroidx/preference/PreferenceGroup;

    .line 48
    .line 49
    instance-of v4, v3, Landroidx/preference/PreferenceScreen;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0, p1, v3}, Lnp3;->q(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iput-object p0, v2, Landroidx/preference/Preference;->U:Lnp3;

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p0
.end method

.method public final r(I)Landroidx/preference/Preference;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lnp3;->s:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lnp3;->s:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroidx/preference/Preference;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final s()V
    .locals 6

    .line 1
    iget-object v0, p0, Lnp3;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    check-cast v4, Landroidx/preference/Preference;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    iput-object v5, v4, Landroidx/preference/Preference;->U:Lnp3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lnp3;->r:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lnp3;->r:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v0, p0, Lnp3;->q:Landroidx/preference/PreferenceGroup;

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0}, Lnp3;->q(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lnp3;->p(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lnp3;->s:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p0}, Ldw3;->d()V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lnp3;->r:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_1
    if-ge v2, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    check-cast v1, Landroidx/preference/Preference;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    return-void
.end method
