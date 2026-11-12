.class public Le9;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:La9;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    invoke-static {p1, v0}, Lf9;->j(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Le9;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La9;

    .line 5
    .line 6
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 7
    .line 8
    invoke-static {p1, p2}, Lf9;->j(Landroid/content/Context;I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, La9;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Le9;->a:La9;

    .line 19
    .line 20
    iput p2, p0, Le9;->b:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()Le9;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Le9;->a:La9;

    .line 3
    .line 4
    iput-boolean v0, v1, La9;->m:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public b(Landroid/graphics/drawable/Drawable;)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, v0, La9;->c:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object p0
.end method

.method public c(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, p0, La9;->f:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-void
.end method

.method public create()Lf9;
    .locals 11

    .line 1
    new-instance v0, Lf9;

    .line 2
    .line 3
    iget-object v2, p0, Le9;->a:La9;

    .line 4
    .line 5
    iget-object v1, v2, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 6
    .line 7
    iget-object v3, v2, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget p0, p0, Le9;->b:I

    .line 10
    .line 11
    invoke-direct {v0, v1, p0}, Lf9;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v2, La9;->e:Landroid/view/View;

    .line 15
    .line 16
    iget-object v7, v0, Lf9;->t:Ld9;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iput-object p0, v7, Ld9;->w:Landroid/view/View;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, v2, La9;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    iput-object p0, v7, Ld9;->d:Ljava/lang/CharSequence;

    .line 29
    .line 30
    iget-object v1, v7, Ld9;->u:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p0, v2, La9;->c:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    iput-object p0, v7, Ld9;->s:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iget-object v1, v7, Ld9;->t:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v7, Ld9;->t:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object p0, v2, La9;->f:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    iput-object p0, v7, Ld9;->e:Ljava/lang/CharSequence;

    .line 60
    .line 61
    iget-object v1, v7, Ld9;->v:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object p0, v2, La9;->g:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 v1, -0x1

    .line 74
    iget-object v4, v2, La9;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 75
    .line 76
    invoke-virtual {v7, v1, p0, v4}, Ld9;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object p0, v2, La9;->i:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-nez p0, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    const/4 v1, -0x2

    .line 85
    iget-object v4, v2, La9;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 86
    .line 87
    invoke-virtual {v7, v1, p0, v4}, Ld9;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    iget-object p0, v2, La9;->k:Ljava/lang/CharSequence;

    .line 91
    .line 92
    if-nez p0, :cond_6

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    const/4 v1, -0x3

    .line 96
    iget-object v4, v2, La9;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 97
    .line 98
    invoke-virtual {v7, v1, p0, v4}, Ld9;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object p0, v2, La9;->p:[Ljava/lang/CharSequence;

    .line 102
    .line 103
    const/4 v9, 0x1

    .line 104
    const/4 v10, 0x0

    .line 105
    if-nez p0, :cond_7

    .line 106
    .line 107
    iget-object p0, v2, La9;->q:Landroid/widget/ListAdapter;

    .line 108
    .line 109
    if-eqz p0, :cond_f

    .line 110
    .line 111
    :cond_7
    iget-object p0, v2, La9;->b:Landroid/view/LayoutInflater;

    .line 112
    .line 113
    iget v1, v7, Ld9;->A:I

    .line 114
    .line 115
    invoke-virtual {p0, v1, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    move-object v6, p0

    .line 120
    check-cast v6, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 121
    .line 122
    iget-boolean p0, v2, La9;->u:Z

    .line 123
    .line 124
    if-eqz p0, :cond_8

    .line 125
    .line 126
    new-instance v1, Lx8;

    .line 127
    .line 128
    iget v4, v7, Ld9;->B:I

    .line 129
    .line 130
    iget-object v5, v2, La9;->p:[Ljava/lang/CharSequence;

    .line 131
    .line 132
    invoke-direct/range {v1 .. v6}, Lx8;-><init>(La9;Landroid/view/ContextThemeWrapper;I[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_8
    iget-boolean p0, v2, La9;->v:Z

    .line 137
    .line 138
    if-eqz p0, :cond_9

    .line 139
    .line 140
    iget p0, v7, Ld9;->C:I

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_9
    iget p0, v7, Ld9;->D:I

    .line 144
    .line 145
    :goto_4
    iget-object v1, v2, La9;->q:Landroid/widget/ListAdapter;

    .line 146
    .line 147
    if-eqz v1, :cond_a

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_a
    new-instance v1, Lc9;

    .line 151
    .line 152
    const v4, 0x1020014

    .line 153
    .line 154
    .line 155
    iget-object v5, v2, La9;->p:[Ljava/lang/CharSequence;

    .line 156
    .line 157
    invoke-direct {v1, v3, p0, v4, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :goto_5
    iput-object v1, v7, Ld9;->x:Landroid/widget/ListAdapter;

    .line 161
    .line 162
    iget p0, v2, La9;->w:I

    .line 163
    .line 164
    iput p0, v7, Ld9;->y:I

    .line 165
    .line 166
    iget-object p0, v2, La9;->r:Landroid/content/DialogInterface$OnClickListener;

    .line 167
    .line 168
    if-eqz p0, :cond_b

    .line 169
    .line 170
    new-instance p0, Ly8;

    .line 171
    .line 172
    invoke-direct {p0, v8, v2, v7}, Ly8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_b
    iget-object p0, v2, La9;->x:Lfz2;

    .line 180
    .line 181
    if-eqz p0, :cond_c

    .line 182
    .line 183
    new-instance p0, Lz8;

    .line 184
    .line 185
    invoke-direct {p0, v2, v6, v7}, Lz8;-><init>(La9;Landroidx/appcompat/app/AlertController$RecycleListView;Ld9;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 189
    .line 190
    .line 191
    :cond_c
    :goto_6
    iget-boolean p0, v2, La9;->v:Z

    .line 192
    .line 193
    if-eqz p0, :cond_d

    .line 194
    .line 195
    invoke-virtual {v6, v9}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_d
    iget-boolean p0, v2, La9;->u:Z

    .line 200
    .line 201
    if-eqz p0, :cond_e

    .line 202
    .line 203
    const/4 p0, 0x2

    .line 204
    invoke-virtual {v6, p0}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 205
    .line 206
    .line 207
    :cond_e
    :goto_7
    iput-object v6, v7, Ld9;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 208
    .line 209
    :cond_f
    iget-object p0, v2, La9;->s:Landroid/view/View;

    .line 210
    .line 211
    if-eqz p0, :cond_10

    .line 212
    .line 213
    iput-object p0, v7, Ld9;->g:Landroid/view/View;

    .line 214
    .line 215
    iput-boolean v8, v7, Ld9;->h:Z

    .line 216
    .line 217
    :cond_10
    iget-boolean p0, v2, La9;->m:Z

    .line 218
    .line 219
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 220
    .line 221
    .line 222
    iget-boolean p0, v2, La9;->m:Z

    .line 223
    .line 224
    if-eqz p0, :cond_11

    .line 225
    .line 226
    invoke-virtual {v0, v9}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 227
    .line 228
    .line 229
    :cond_11
    invoke-virtual {v0, v10}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 230
    .line 231
    .line 232
    iget-object p0, v2, La9;->n:Lst1;

    .line 233
    .line 234
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 235
    .line 236
    .line 237
    iget-object p0, v2, La9;->o:Lru2;

    .line 238
    .line 239
    if-eqz p0, :cond_12

    .line 240
    .line 241
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 242
    .line 243
    .line 244
    :cond_12
    return-object v0
.end method

.method public d(Ljava/lang/CharSequence;Lip3;)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, v0, La9;->i:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iput-object p2, v0, La9;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 6
    .line 7
    return-object p0
.end method

.method public e(ILandroid/content/DialogInterface$OnClickListener;)Le9;
    .locals 2

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iget-object v1, v0, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La9;->k:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, La9;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public f(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, v0, La9;->g:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iput-object p2, v0, La9;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 6
    .line 7
    return-object p0
.end method

.method public g([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, p0, La9;->p:[Ljava/lang/CharSequence;

    .line 4
    .line 5
    iput-object p3, p0, La9;->r:Landroid/content/DialogInterface$OnClickListener;

    .line 6
    .line 7
    iput p2, p0, La9;->w:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, La9;->v:Z

    .line 11
    .line 12
    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iget-object p0, p0, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h()Lf9;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le9;->create()Lf9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Le9;
    .locals 2

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iget-object v1, v0, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La9;->i:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, La9;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Le9;
    .locals 2

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iget-object v1, v0, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La9;->g:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, La9;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, v0, La9;->d:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public setView(Landroid/view/View;)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Le9;->a:La9;

    .line 2
    .line 3
    iput-object p1, v0, La9;->s:Landroid/view/View;

    .line 4
    .line 5
    return-object p0
.end method
